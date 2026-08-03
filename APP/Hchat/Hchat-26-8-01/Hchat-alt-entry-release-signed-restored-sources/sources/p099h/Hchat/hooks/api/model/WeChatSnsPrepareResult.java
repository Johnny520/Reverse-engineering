package p099h.Hchat.hooks.api.model;

import gg.AbstractC1416l;
import java.util.List;
import p167l8.C2533h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatSnsPrepareResult {
    public static final int $stable = 0;
    public static final C2533h Companion = new C2533h();
    private final String content;
    private final List<String> imagePathList;
    private final List<WeChatSnsLivePhoto> livePhotoList;
    private final String message;
    private final String snsId;
    private final boolean success;
    private final String type;
    private final String videoPath;
    private final String videoThumbPath;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatSnsPrepareResult(boolean z9, String str, String str2, String str3, String str4, List<String> list, String str5, String str6, List<WeChatSnsLivePhoto> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        str5.getClass();
        str6.getClass();
        list2.getClass();
        this.success = z9;
        this.message = str;
        this.snsId = str2;
        this.content = str3;
        this.type = str4;
        this.imagePathList = list;
        this.videoPath = str5;
        this.videoThumbPath = str6;
        this.livePhotoList = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WeChatSnsPrepareResult failure$app(String str, String str2) {
        Companion.getClass();
        return C2533h.m5951a(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getImagePathList() {
        return this.imagePathList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<WeChatSnsLivePhoto> getLivePhotoList() {
        return this.livePhotoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSnsId() {
        return this.snsId;
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
    public final String getVideoPath() {
        return this.videoPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getVideoThumbPath() {
        return this.videoThumbPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isImage() {
        return AbstractC1416l.m3825a(this.type, WeChatSnsPost.TYPE_IMAGE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLivePhoto() {
        return AbstractC1416l.m3825a(this.type, WeChatSnsPost.TYPE_LIVE_PHOTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isText() {
        return AbstractC1416l.m3825a(this.type, WeChatSnsPost.TYPE_TEXT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVideo() {
        return AbstractC1416l.m3825a(this.type, WeChatSnsPost.TYPE_VIDEO);
    }
}
