package P02_FileStream;

public class Music implements Streamble {

    private String artist;
    private String album;
    private int length;
    private int bytesSent;

    public int getLength() {
        return length;
    }

    public int getBytesSent() {
        return bytesSent;
    }
}