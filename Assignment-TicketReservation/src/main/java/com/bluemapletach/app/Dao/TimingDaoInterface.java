package com.bluemapletach.app.Dao;

import java.util.List;

import com.bluemapletach.app.model.MovieHasTimingDetail;
import com.bluemapletach.app.model.TimeDetails;

public interface TimingDaoInterface {
	public TimeDetails movieTime(TimeDetails timeDetails);

	public String getTiming(TimeDetails detail);

}
