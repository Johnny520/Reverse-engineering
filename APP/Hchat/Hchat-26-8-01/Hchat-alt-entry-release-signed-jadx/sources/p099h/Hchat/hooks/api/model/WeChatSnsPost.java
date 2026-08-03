package p099h.Hchat.hooks.api.model;

import gg.AbstractC1416l;
import java.util.List;
import p136j8.AbstractC2091b;
import p167l8.C2532g;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsPost {
    public static final int $stable = 8;
    public static final C2532g Companion = new C2532g();
    public static final String TYPE_CARD = "card";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_LIVE_PHOTO = "live_photo";
    public static final String TYPE_TEXT = "text";
    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_VIDEO = "video";
    private final String content;
    private final int contentType;
    private final long createTimeSeconds;
    private final String displayName;
    private final long localId;
    private final List<WeChatSnsMedia> mediaList;
    private final boolean self;
    private final String snsId;
    private final int storageType;
    private final String type;
    private final String userName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatSnsPost(String str, long j3, String str2, String str3, long j4, int i9, int i10, String str4, String str5, List<WeChatSnsMedia> list, boolean z9) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        list.getClass();
        this.snsId = str;
        this.localId = j3;
        this.userName = str2;
        this.displayName = str3;
        this.createTimeSeconds = j4;
        this.storageType = i9;
        this.contentType = i10;
        this.type = str4;
        this.content = str5;
        this.mediaList = list;
        this.self = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCreateTimeMillis() {
        return this.createTimeSeconds * 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCreateTimeSeconds() {
        return this.createTimeSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLocalId() {
        return this.localId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<WeChatSnsMedia> getMediaList() {
        return this.mediaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSnsId() {
        return this.snsId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getStorageType() {
        return this.storageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getText() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isCard() {
        return AbstractC1416l.m3825a(this.type, TYPE_CARD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isImage() {
        return AbstractC1416l.m3825a(this.type, TYPE_IMAGE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLivePhoto() {
        return AbstractC1416l.m3825a(this.type, TYPE_LIVE_PHOTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSelf() {
        return this.self;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isText() {
        return AbstractC1416l.m3825a(this.type, TYPE_TEXT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVideo() {
        return AbstractC1416l.m3825a(this.type, TYPE_VIDEO);
    }
}
