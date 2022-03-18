package com.platzi.javatest.movies.model;

import java.util.Objects;

public class Movie {
	 private Integer id;
	    private String name;
	    private int minutes;
	    private Genre genre;

	    public Movie(String name, int minutes, Genre genre) {
	        this(null, name, minutes, genre);
	    }

	    public Movie(Integer id, String name, int minutes, Genre genre) {
	        this.id = id;
	        this.name = name;
	        this.minutes = minutes;
	        this.genre = genre;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getMinutes() {
	        return minutes;
	    }
		public Genre getGenre() {
	        return genre;
	    }
		

	    @Override
		public int hashCode() {
			return Objects.hash(genre, id, minutes, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Movie other = (Movie) obj;
			return genre == other.genre && Objects.equals(id, other.id) && minutes == other.minutes
					&& Objects.equals(name, other.name);
		}

	    
	    
}
