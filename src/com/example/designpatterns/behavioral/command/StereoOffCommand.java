package com.example.designpatterns.behavioral.command;

public class StereoOffCommand implements Command {

	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.off();
	}
}
