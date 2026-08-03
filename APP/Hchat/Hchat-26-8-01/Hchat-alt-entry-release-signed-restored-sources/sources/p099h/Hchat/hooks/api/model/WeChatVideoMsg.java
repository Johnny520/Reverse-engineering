package p099h.Hchat.hooks.api.model;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatVideoMsg {
    public static final int $stable = 0;
    public final String aesKey;
    public final String cdnVideoUrl;
    public final long length;
    public final String md5;
    public final String newMd5;
    public final int playLength;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatVideoMsg(String str, String str2, String str3, String str4, long j3, int i9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.md5 = str;
        this.newMd5 = str2;
        this.cdnVideoUrl = str3;
        this.aesKey = str4;
        this.length = j3;
        this.playLength = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WeChatVideoMsg copy$default(WeChatVideoMsg weChatVideoMsg, String str, String str2, String str3, String str4, long j3, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = weChatVideoMsg.md5;
        }
        if ((i10 & 2) != 0) {
            str2 = weChatVideoMsg.newMd5;
        }
        if ((i10 & 4) != 0) {
            str3 = weChatVideoMsg.cdnVideoUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = weChatVideoMsg.aesKey;
        }
        if ((i10 & 16) != 0) {
            j3 = weChatVideoMsg.length;
        }
        if ((i10 & 32) != 0) {
            i9 = weChatVideoMsg.playLength;
        }
        int i11 = i9;
        long j4 = j3;
        return weChatVideoMsg.copy(str, str2, str3, str4, j4, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.newMd5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component3() {
        return this.cdnVideoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component4() {
        return this.aesKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component5() {
        return this.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component6() {
        return this.playLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatVideoMsg copy(String str, String str2, String str3, String str4, long j3, int i9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new WeChatVideoMsg(str, str2, str3, str4, j3, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChatVideoMsg)) {
            return false;
        }
        WeChatVideoMsg weChatVideoMsg = (WeChatVideoMsg) obj;
        return AbstractC1416l.m3825a(this.md5, weChatVideoMsg.md5) && AbstractC1416l.m3825a(this.newMd5, weChatVideoMsg.newMd5) && AbstractC1416l.m3825a(this.cdnVideoUrl, weChatVideoMsg.cdnVideoUrl) && AbstractC1416l.m3825a(this.aesKey, weChatVideoMsg.aesKey) && this.length == weChatVideoMsg.length && this.playLength == weChatVideoMsg.playLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getAesKey() {
        return this.aesKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getCdnVideoUrl() {
        return this.cdnVideoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLength() {
        return this.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getNewMd5() {
        return this.newMd5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getPlayLength() {
        return this.playLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Integer.hashCode(this.playLength) + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.md5.hashCode() * 31, 31, this.newMd5), 31, this.cdnVideoUrl), 31, this.aesKey), 31, this.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.md5;
        String str2 = this.newMd5;
        String str3 = this.cdnVideoUrl;
        String str4 = this.aesKey;
        long j3 = this.length;
        int i9 = this.playLength;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("WeChatVideoMsg(md5=", str, ", newMd5=", str2, ", cdnVideoUrl=");
        AbstractC2091b.m5173t(sbM1027p, str3, ", aesKey=", str4, ", length=");
        sbM1027p.append(j3);
        sbM1027p.append(", playLength=");
        sbM1027p.append(i9);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
