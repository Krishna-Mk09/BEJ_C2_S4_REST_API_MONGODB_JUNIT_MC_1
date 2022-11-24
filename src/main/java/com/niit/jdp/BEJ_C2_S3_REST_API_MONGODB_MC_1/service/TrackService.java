package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.service;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Track;

import java.util.List;
import java.util.Optional;

public interface TrackService {
    Track saveTrack(Track track);

    List<Track> getAllTracks();

    Optional<Track> getTrackById(int trackId);

    boolean deleteTrackById(int trackId);

    List<Track> findTrackTrackName(String trackName);


}
