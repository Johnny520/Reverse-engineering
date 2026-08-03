package p099h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsLivePhoto {
    public static final int $stable = 0;
    private final long coverTimeMillis;
    private final String imagePath;
    private final int videoDurationMillis;
    private final String videoPath;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatSnsLivePhoto(String str, String str2, int i9, long j3) {
        str.getClass();
        str2.getClass();
        this.imagePath = str;
        this.videoPath = str2;
        this.videoDurationMillis = i9;
        this.coverTimeMillis = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCoverTimeMillis() {
        return this.coverTimeMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getVideoDurationMillis() {
        return this.videoDurationMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getVideoPath() {
        return this.videoPath;
    }
}
