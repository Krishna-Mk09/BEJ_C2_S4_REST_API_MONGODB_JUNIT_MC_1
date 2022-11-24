/*
 * Author Name : M.Krishna.
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.controller;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Track;
import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TrackController {
    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("insertTrack")
    public ResponseEntity<?> saveFunction(@RequestBody Track track) {
        return new ResponseEntity<>(trackService.saveTrack(track), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAllTracks")
    public ResponseEntity<?> fetchAllTracksFunction() {
        return new ResponseEntity<>(trackService.getAllTracks(), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAllTracksById/{trackId}")
    public ResponseEntity<?> fetchAllTracksByIdFunction(@PathVariable int trackId) {
        return new ResponseEntity<>(trackService.getTrackById(trackId), HttpStatus.CREATED);
    }

    @GetMapping("/fetchTrackByArtistName/{trackName}")
    public ResponseEntity<?> fetchAllTracksByNameFunction(@PathVariable String trackName) {
        return new ResponseEntity<>(trackService.findTrackTrackName(trackName), HttpStatus.CREATED);

    }

    @DeleteMapping("/DeleteTracksById/{trackId}")
    public ResponseEntity<?> DeleteTracksByIdFunction(@PathVariable int trackId) {
        return new ResponseEntity<>(trackService.deleteTrackById(trackId), HttpStatus.OK);
    }


}
