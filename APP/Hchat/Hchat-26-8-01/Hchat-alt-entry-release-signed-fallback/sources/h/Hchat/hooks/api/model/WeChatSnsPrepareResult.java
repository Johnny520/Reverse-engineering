package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsPrepareResult {
    public static final int $stable = 0;
    public static final l8.h Companion = null;
    private final java.lang.String content;
    private final java.util.List<java.lang.String> imagePathList;
    private final java.util.List<h.Hchat.hooks.api.model.WeChatSnsLivePhoto> livePhotoList;
    private final java.lang.String message;
    private final java.lang.String snsId;
    private final boolean success;
    private final java.lang.String type;
    private final java.lang.String videoPath;
    private final java.lang.String videoThumbPath;

    static {
            l8.h r0 = new l8.h
            r0.<init>()
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion = r0
            return
    }

    public WeChatSnsPrepareResult(boolean r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.List<java.lang.String> r6, java.lang.String r7, java.lang.String r8, java.util.List<h.Hchat.hooks.api.model.WeChatSnsLivePhoto> r9) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r0.<init>()
            r0.success = r1
            r0.message = r2
            r0.snsId = r3
            r0.content = r4
            r0.type = r5
            r0.imagePathList = r6
            r0.videoPath = r7
            r0.videoThumbPath = r8
            r0.livePhotoList = r9
            return
    }

    public static final h.Hchat.hooks.api.model.WeChatSnsPrepareResult failure$app(java.lang.String r1, java.lang.String r2) {
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            r0.getClass()
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r1 = l8.h.a(r1, r2)
            return r1
    }

    public final java.lang.String getContent() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public final java.util.List<java.lang.String> getImagePathList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.imagePathList
            return r0
    }

    public final java.util.List<h.Hchat.hooks.api.model.WeChatSnsLivePhoto> getLivePhotoList() {
            r1 = this;
            java.util.List<h.Hchat.hooks.api.model.WeChatSnsLivePhoto> r0 = r1.livePhotoList
            return r0
    }

    public final java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public final java.lang.String getSnsId() {
            r1 = this;
            java.lang.String r0 = r1.snsId
            return r0
    }

    public final java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.lang.String getVideoPath() {
            r1 = this;
            java.lang.String r0 = r1.videoPath
            return r0
    }

    public final java.lang.String getVideoThumbPath() {
            r1 = this;
            java.lang.String r0 = r1.videoThumbPath
            return r0
    }

    public final boolean isImage() {
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = "image"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isLivePhoto() {
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = "live_photo"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isSuccess() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }

    public final boolean isText() {
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = "text"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isVideo() {
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = "video"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }
}
