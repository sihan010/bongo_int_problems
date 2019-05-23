class Main {
  public static void main(String[] args) {
    MediaPlayer player = new MediaPlayer("C://sample.mp4");
    player.play();
    player.forward();
    player.rewind();
  }
}

interface Media {
  public void play();

  public void forward();

  public void rewind();
}

class MediaPlayer implements Media {
  public String mediaPath;
  public int mediaLength;
  public int currentTime;
  public boolean isPlaying;

  MediaPlayer(String path) {
    this.mediaPath = path;
    this.currentTime = 0;
    this.isPlaying = false;
    this.initiateMedia();
  }

  public void initiateMedia(){
    // open the media from the path 
    // get it's length in seconds
    // assign it to mediaLength
    // mediaLength = length;
  }  

  public void play() {
    if (!isPlaying) {
      isPlaying = true;
      // render frames available in currentTime seconds to the screen
      // if currentTime<=mediaLength increment currentTime by 1 each second
    } else {
      isPlaying = false;
      // stop rendering frames in screen
      // stop incremnting currentTime
    }
  }

  public void forward() {
    if (currentTime + 10 <= mediaLength)
      currentTime += 10;
  }

  public void rewind() {
    if (currentTime - 10 >= 0)
      currentTime -= 10;
  }
}