package com.mangooi.soundsystem;

public interface CompactDisc {
	void play();
	default void playTrack(int trackNumber) {
		
	}
}
