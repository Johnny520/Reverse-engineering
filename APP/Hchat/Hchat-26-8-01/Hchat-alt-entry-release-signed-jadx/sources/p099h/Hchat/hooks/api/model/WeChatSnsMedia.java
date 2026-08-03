package p099h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsMedia {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: id */
    private final String f4778id;
    private final WeChatSnsMedia liveVideo;
    private final String thumbUrl;
    private final int type;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatSnsMedia(String str, int i9, String str2, String str3, WeChatSnsMedia weChatSnsMedia) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f4778id = str;
        this.type = i9;
        this.url = str2;
        this.thumbUrl = str3;
        this.liveVideo = weChatSnsMedia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getId() {
        return this.f4778id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatSnsMedia getLiveVideo() {
        return this.liveVideo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLivePhoto() {
        return this.liveVideo != null;
    }
}
