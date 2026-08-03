package p099h.Hchat.hooks.api.model;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatFileMsg {
    public static final int $stable = 0;
    public final String attachId;
    public final String ext;
    public final String fileName;
    public final String key;
    public final String md5;
    public final long size;
    public final String title;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatFileMsg(String str, long j3, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.title = str;
        this.size = j3;
        this.ext = str2;
        this.md5 = str3;
        this.url = str4;
        this.key = str5;
        this.attachId = str6;
        this.fileName = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WeChatFileMsg copy$default(WeChatFileMsg weChatFileMsg, String str, long j3, String str2, String str3, String str4, String str5, String str6, String str7, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = weChatFileMsg.title;
        }
        if ((i9 & 2) != 0) {
            j3 = weChatFileMsg.size;
        }
        if ((i9 & 4) != 0) {
            str2 = weChatFileMsg.ext;
        }
        if ((i9 & 8) != 0) {
            str3 = weChatFileMsg.md5;
        }
        if ((i9 & 16) != 0) {
            str4 = weChatFileMsg.url;
        }
        if ((i9 & 32) != 0) {
            str5 = weChatFileMsg.key;
        }
        if ((i9 & 64) != 0) {
            str6 = weChatFileMsg.attachId;
        }
        if ((i9 & 128) != 0) {
            str7 = weChatFileMsg.fileName;
        }
        String str8 = str6;
        String str9 = str7;
        return weChatFileMsg.copy(str, j3, str2, str3, str4, str5, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component2() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component3() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component4() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component5() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component6() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component7() {
        return this.attachId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component8() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatFileMsg copy(String str, long j3, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        return new WeChatFileMsg(str, j3, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChatFileMsg)) {
            return false;
        }
        WeChatFileMsg weChatFileMsg = (WeChatFileMsg) obj;
        return AbstractC1416l.m3825a(this.title, weChatFileMsg.title) && this.size == weChatFileMsg.size && AbstractC1416l.m3825a(this.ext, weChatFileMsg.ext) && AbstractC1416l.m3825a(this.md5, weChatFileMsg.md5) && AbstractC1416l.m3825a(this.url, weChatFileMsg.url) && AbstractC1416l.m3825a(this.key, weChatFileMsg.key) && AbstractC1416l.m3825a(this.attachId, weChatFileMsg.attachId) && AbstractC1416l.m3825a(this.fileName, weChatFileMsg.fileName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getAttachId() {
        return this.attachId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getExt() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.fileName.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2243f(this.title.hashCode() * 31, 31, this.size), 31, this.ext), 31, this.md5), 31, this.url), 31, this.key), 31, this.attachId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.title;
        long j3 = this.size;
        String str2 = this.ext;
        String str3 = this.md5;
        String str4 = this.url;
        String str5 = this.key;
        String str6 = this.attachId;
        String str7 = this.fileName;
        StringBuilder sbM2259v = AbstractC0921a.m2259v("WeChatFileMsg(title=", str, ", size=", j3);
        AbstractC2091b.m5173t(sbM2259v, ", ext=", str2, ", md5=", str3);
        AbstractC2091b.m5173t(sbM2259v, ", url=", str4, ", key=", str5);
        AbstractC2091b.m5173t(sbM2259v, ", attachId=", str6, ", fileName=", str7);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
