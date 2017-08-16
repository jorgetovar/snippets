package com.jetprogramming.services.lambda;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		for (int e : values) {
			System.out.println(e);
		}

		Consumer<? super Integer> action = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		values.forEach(action);

		values.forEach(v -> System.out.println(v));

		values.forEach(System.out::println);

		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Fred", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.MALE, "fred@example.com"));
		roster.add(new Person("Jane", IsoChronology.INSTANCE.date(1990, 7, 15), Person.Sex.FEMALE, "jane@example.com"));
		roster.add(
				new Person("George", IsoChronology.INSTANCE.date(1991, 8, 13), Person.Sex.MALE, "george@example.com"));
		roster.add(new Person("Bob", IsoChronology.INSTANCE.date(2000, 9, 12), Person.Sex.MALE, "bob@example.com"));
		Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

		Arrays.sort(rosterAsArray, Person::compareByAge);

		System.out.println(Arrays.toString(rosterAsArray));

		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);

		System.out.println(Arrays.toString(stringArray));

	}
}
