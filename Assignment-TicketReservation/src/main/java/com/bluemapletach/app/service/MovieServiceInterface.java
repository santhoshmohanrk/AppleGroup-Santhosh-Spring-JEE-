package com.bluemapletach.app.service;

import java.util.List;

import com.bluemapletach.app.model.MovieDetail;

public interface MovieServiceInterface {
	//public MovieDetail movieListInsert(MovieDetail movieDetail, String[] a);

	public MovieDetail detail(int movie_id);


	public void movieListInsert(MovieDetail movieDetail, String[] a);

}
