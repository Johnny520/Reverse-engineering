package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsLivePhoto {
    public static final int $stable = 0;
    private final long coverTimeMillis;
    private final java.lang.String imagePath;
    private final int videoDurationMillis;
    private final java.lang.String videoPath;

    public WeChatSnsLivePhoto(java.lang.String r1, java.lang.String r2, int r3, long r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.imagePath = r1
            r0.videoPath = r2
            r0.videoDurationMillis = r3
            r0.coverTimeMillis = r4
            return
    }

    public final long getCoverTimeMillis() {
            r2 = this;
            long r0 = r2.coverTimeMillis
            return r0
    }

    public final java.lang.String getImagePath() {
            r1 = this;
            java.lang.String r0 = r1.imagePath
            return r0
    }

    public final int getVideoDurationMillis() {
            r1 = this;
            int r0 = r1.videoDurationMillis
            return r0
    }

    public final java.lang.String getVideoPath() {
            r1 = this;
            java.lang.String r0 = r1.videoPath
            return r0
    }
}
