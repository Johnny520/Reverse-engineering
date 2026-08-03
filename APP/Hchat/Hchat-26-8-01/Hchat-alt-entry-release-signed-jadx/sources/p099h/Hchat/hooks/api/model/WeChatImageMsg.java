package p099h.Hchat.hooks.api.model;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatImageMsg {
    public static final int $stable = 0;
    public final String bigImgUrl;
    public final int bigLength;
    public final String key;
    public final String md5;
    public final String midImgUrl;
    public final int midLength;
    public final int thumbLength;
    public final String thumbUrl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (32 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r10v0 int) & (64 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r10v0 int) & (128 int) A[WRAPPED] (LINE:12)) != (0 int)) ? (0 int) : (r9v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int):void (m)] (LINE:28) call: h.Hchat.hooks.api.model.WeChatImageMsg.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ WeChatImageMsg(String str, String str2, String str3, String str4, String str5, int i9, int i10, int i11, int i12, AbstractC1411g abstractC1411g) {
        this(str, str2, str3, str4, str5, (i12 & 32) != 0 ? 0 : i9, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? 0 : i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WeChatImageMsg copy$default(WeChatImageMsg weChatImageMsg, String str, String str2, String str3, String str4, String str5, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = weChatImageMsg.md5;
        }
        if ((i12 & 2) != 0) {
            str2 = weChatImageMsg.bigImgUrl;
        }
        if ((i12 & 4) != 0) {
            str3 = weChatImageMsg.midImgUrl;
        }
        if ((i12 & 8) != 0) {
            str4 = weChatImageMsg.thumbUrl;
        }
        if ((i12 & 16) != 0) {
            str5 = weChatImageMsg.key;
        }
        if ((i12 & 32) != 0) {
            i9 = weChatImageMsg.bigLength;
        }
        if ((i12 & 64) != 0) {
            i10 = weChatImageMsg.midLength;
        }
        if ((i12 & 128) != 0) {
            i11 = weChatImageMsg.thumbLength;
        }
        int i13 = i10;
        int i14 = i11;
        String str6 = str5;
        int i15 = i9;
        return weChatImageMsg.copy(str, str2, str3, str4, str6, i15, i13, i14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.bigImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component3() {
        return this.midImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component4() {
        return this.thumbUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component5() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component6() {
        return this.bigLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component7() {
        return this.midLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component8() {
        return this.thumbLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatImageMsg copy(String str, String str2, String str3, String str4, String str5, int i9, int i10, int i11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new WeChatImageMsg(str, str2, str3, str4, str5, i9, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChatImageMsg)) {
            return false;
        }
        WeChatImageMsg weChatImageMsg = (WeChatImageMsg) obj;
        return AbstractC1416l.m3825a(this.md5, weChatImageMsg.md5) && AbstractC1416l.m3825a(this.bigImgUrl, weChatImageMsg.bigImgUrl) && AbstractC1416l.m3825a(this.midImgUrl, weChatImageMsg.midImgUrl) && AbstractC1416l.m3825a(this.thumbUrl, weChatImageMsg.thumbUrl) && AbstractC1416l.m3825a(this.key, weChatImageMsg.key) && this.bigLength == weChatImageMsg.bigLength && this.midLength == weChatImageMsg.midLength && this.thumbLength == weChatImageMsg.thumbLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getBigLength() {
        return this.bigLength;
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
    public final String getMidImgUrl() {
        return this.midImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMidLength() {
        return this.midLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getThumbLength() {
        return this.thumbLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Integer.hashCode(this.thumbLength) + AbstractC0921a.m2242e(this.midLength, AbstractC0921a.m2242e(this.bigLength, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.md5.hashCode() * 31, 31, this.bigImgUrl), 31, this.midImgUrl), 31, this.thumbUrl), 31, this.key), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.md5;
        String str2 = this.bigImgUrl;
        String str3 = this.midImgUrl;
        String str4 = this.thumbUrl;
        String str5 = this.key;
        int i9 = this.bigLength;
        int i10 = this.midLength;
        int i11 = this.thumbLength;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("WeChatImageMsg(md5=", str, ", bigImgUrl=", str2, ", midImgUrl=");
        AbstractC2091b.m5173t(sbM1027p, str3, ", thumbUrl=", str4, ", key=");
        sbM1027p.append(str5);
        sbM1027p.append(", bigLength=");
        sbM1027p.append(i9);
        sbM1027p.append(", midLength=");
        sbM1027p.append(i10);
        sbM1027p.append(", thumbLength=");
        sbM1027p.append(i11);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    public WeChatImageMsg(String str, String str2, String str3, String str4, String str5, int i9, int i10, int i11) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        this.md5 = str;
        this.bigImgUrl = str2;
        this.midImgUrl = str3;
        this.thumbUrl = str4;
        this.key = str5;
        this.bigLength = i9;
        this.midLength = i10;
        this.thumbLength = i11;
    }
}
