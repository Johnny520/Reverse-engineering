package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsPost {
    public static final int $stable = 8;
    public static final l8.g Companion = null;
    public static final java.lang.String TYPE_CARD = "card";
    public static final java.lang.String TYPE_IMAGE = "image";
    public static final java.lang.String TYPE_LIVE_PHOTO = "live_photo";
    public static final java.lang.String TYPE_TEXT = "text";
    public static final java.lang.String TYPE_UNKNOWN = "unknown";
    public static final java.lang.String TYPE_VIDEO = "video";
    private final java.lang.String content;
    private final int contentType;
    private final long createTimeSeconds;
    private final java.lang.String displayName;
    private final long localId;
    private final java.util.List<h.Hchat.hooks.api.model.WeChatSnsMedia> mediaList;
    private final boolean self;
    private final java.lang.String snsId;
    private final int storageType;
    private final java.lang.String type;
    private final java.lang.String userName;

    static {
            l8.g r0 = new l8.g
            r0.<init>()
            h.Hchat.hooks.api.model.WeChatSnsPost.Companion = r0
            return
    }

    public WeChatSnsPost(java.lang.String r1, long r2, java.lang.String r4, java.lang.String r5, long r6, int r8, int r9, java.lang.String r10, java.lang.String r11, java.util.List<h.Hchat.hooks.api.model.WeChatSnsMedia> r12, boolean r13) {
            r0 = this;
            j8.b.q(r1, r4, r5, r10, r11)
            r12.getClass()
            r0.<init>()
            r0.snsId = r1
            r0.localId = r2
            r0.userName = r4
            r0.displayName = r5
            r0.createTimeSeconds = r6
            r0.storageType = r8
            r0.contentType = r9
            r0.type = r10
            r0.content = r11
            r0.mediaList = r12
            r0.self = r13
            return
    }

    public final java.lang.String getContent() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public final int getContentType() {
            r1 = this;
            int r0 = r1.contentType
            return r0
    }

    public final long getCreateTimeMillis() {
            r4 = this;
            long r0 = r4.createTimeSeconds
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
    }

    public final long getCreateTimeSeconds() {
            r2 = this;
            long r0 = r2.createTimeSeconds
            return r0
    }

    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public final long getLocalId() {
            r2 = this;
            long r0 = r2.localId
            return r0
    }

    public final java.util.List<h.Hchat.hooks.api.model.WeChatSnsMedia> getMediaList() {
            r1 = this;
            java.util.List<h.Hchat.hooks.api.model.WeChatSnsMedia> r0 = r1.mediaList
            return r0
    }

    public final java.lang.String getSnsId() {
            r1 = this;
            java.lang.String r0 = r1.snsId
            return r0
    }

    public final int getStorageType() {
            r1 = this;
            int r0 = r1.storageType
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

    public final java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.userName
            return r0
    }

    public final boolean isCard() {
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = "card"
            boolean r0 = gg.l.a(r0, r1)
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

    public final boolean isSelf() {
            r1 = this;
            boolean r0 = r1.self
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
