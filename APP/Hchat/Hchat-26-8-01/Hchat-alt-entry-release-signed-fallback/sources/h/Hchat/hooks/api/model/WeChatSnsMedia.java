package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsMedia {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final java.lang.String f4604id;
    private final h.Hchat.hooks.api.model.WeChatSnsMedia liveVideo;
    private final java.lang.String thumbUrl;
    private final int type;
    private final java.lang.String url;

    public WeChatSnsMedia(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, h.Hchat.hooks.api.model.WeChatSnsMedia r5) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f4604id = r1
            r0.type = r2
            r0.url = r3
            r0.thumbUrl = r4
            r0.liveVideo = r5
            return
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.f4604id
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatSnsMedia getLiveVideo() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatSnsMedia r0 = r1.liveVideo
            return r0
    }

    public final java.lang.String getThumbUrl() {
            r1 = this;
            java.lang.String r0 = r1.thumbUrl
            return r0
    }

    public final int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public final boolean isLivePhoto() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatSnsMedia r0 = r1.liveVideo
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
