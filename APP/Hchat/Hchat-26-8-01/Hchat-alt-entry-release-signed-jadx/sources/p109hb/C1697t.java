package p109hb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p136j8.AbstractC2091b;
import p153k8.C2356t;
import p167l8.C2529d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;

/* JADX INFO: renamed from: hb.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1697t {

    /* JADX INFO: renamed from: a */
    public final long f5646a;

    /* JADX INFO: renamed from: b */
    public final int f5647b;

    /* JADX INFO: renamed from: c */
    public final String f5648c;

    /* JADX INFO: renamed from: d */
    public final String f5649d;

    /* JADX INFO: renamed from: e */
    public final String f5650e;

    /* JADX INFO: renamed from: f */
    public final long f5651f;

    /* JADX INFO: renamed from: g */
    public final C2356t f5652g;

    /* JADX INFO: renamed from: h */
    public final String f5653h;

    /* JADX INFO: renamed from: i */
    public final int f5654i;

    /* JADX INFO: renamed from: j */
    public final String f5655j;

    /* JADX INFO: renamed from: k */
    public final Object f5656k;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r17v0 long)
  (r19v0 int)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 long)
  (r25v0 k8.t)
  (r26v0 java.lang.String)
  (r27v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (wrap:??:SGET  A[WRAPPED] bsh.org.objectweb.asm.Opcodes.ACC_INTERFACE int) A[WRAPPED] (LINE:3)) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:9) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (1024 int) A[WRAPPED] (LINE:13)) != (0 int)) ? (null java.lang.Object) : (r29v0 java.lang.Object))
 A[MD:(long, int, java.lang.String, java.lang.String, java.lang.String, long, k8.t, java.lang.String, int, java.lang.String, java.lang.Object):void (m)] (LINE:43) call: hb.t.<init>(long, int, java.lang.String, java.lang.String, java.lang.String, long, k8.t, java.lang.String, int, java.lang.String, java.lang.Object):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1697t(long j3, int i9, String str, String str2, String str3, long j4, C2356t c2356t, String str4, int i10, String str5, Object obj, int i11) {
        this(j3, i9, str, str2, str3, j4, c2356t, str4, i10, (i11 & Opcodes.ACC_INTERFACE) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str5, (i11 & 1024) != 0 ? null : obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4333a() {
        if ((this.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE) != 49) {
            return false;
        }
        C2356t c2356t = this.f5652g;
        String str = c2356t != null ? c2356t.f7743c : null;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(str)) {
            str = this.f5649d;
        }
        WeChatMessage.Companion.getClass();
        Integer numM6742f0 = AbstractC3156t.m6742f0(C2529d.m5949o(str, "type"));
        return numM6742f0 != null && numM6742f0.intValue() == 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m4334b() {
        if ((this.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE) != 49) {
            return false;
        }
        C2356t c2356t = this.f5652g;
        String str = c2356t != null ? c2356t.f7743c : null;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(str)) {
            str = this.f5649d;
        }
        WeChatMessage.Companion.getClass();
        return C2529d.m5942h(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m4335c() {
        int i9 = this.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i9 == 1) {
            return "文本";
        }
        if (i9 == 3) {
            return "图片";
        }
        if (i9 == 34) {
            return "语音";
        }
        if (i9 == 62) {
            return "视频";
        }
        if (i9 == 42) {
            return "名片";
        }
        if (i9 == 43) {
            return "视频";
        }
        switch (i9) {
            case 47:
                return "表情";
            case 48:
                return "位置";
            case 49:
                return m4333a() ? "文件" : m4334b() ? "视频号" : "卡片";
            default:
                return "消息";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1697t)) {
            return false;
        }
        C1697t c1697t = (C1697t) obj;
        return this.f5646a == c1697t.f5646a && this.f5647b == c1697t.f5647b && AbstractC1416l.m3825a(this.f5648c, c1697t.f5648c) && AbstractC1416l.m3825a(this.f5649d, c1697t.f5649d) && AbstractC1416l.m3825a(this.f5650e, c1697t.f5650e) && this.f5651f == c1697t.f5651f && AbstractC1416l.m3825a(this.f5652g, c1697t.f5652g) && AbstractC1416l.m3825a(this.f5653h, c1697t.f5653h) && this.f5654i == c1697t.f5654i && AbstractC1416l.m3825a(this.f5655j, c1697t.f5655j) && AbstractC1416l.m3825a(this.f5656k, c1697t.f5656k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2243f = AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f5647b, Long.hashCode(this.f5646a) * 31, 31), 31, this.f5648c), 31, this.f5649d), 31, this.f5650e), 31, this.f5651f);
        C2356t c2356t = this.f5652g;
        int iM2244g = AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f5654i, AbstractC0921a.m2244g((iM2243f + (c2356t == null ? 0 : c2356t.hashCode())) * 31, 31, this.f5653h), 31), 31, this.f5655j);
        Object obj = this.f5656k;
        return iM2244g + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedMessageSnapshot(msgId=");
        sb2.append(this.f5646a);
        sb2.append(", type=");
        sb2.append(this.f5647b);
        AbstractC2091b.m5173t(sb2, ", sourceTalker=", this.f5648c, ", content=", this.f5649d);
        sb2.append(", imagePath=");
        sb2.append(this.f5650e);
        sb2.append(", createTime=");
        sb2.append(this.f5651f);
        sb2.append(", retransmit=");
        sb2.append(this.f5652g);
        sb2.append(", voicePath=");
        sb2.append(this.f5653h);
        sb2.append(", voiceDurationMillis=");
        sb2.append(this.f5654i);
        sb2.append(", voiceFileName=");
        sb2.append(this.f5655j);
        sb2.append(", nativeMessage=");
        sb2.append(this.f5656k);
        sb2.append(")");
        return sb2.toString();
    }

    public C1697t(long j3, int i9, String str, String str2, String str3, long j4, C2356t c2356t, String str4, int i10, String str5, Object obj) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        this.f5646a = j3;
        this.f5647b = i9;
        this.f5648c = str;
        this.f5649d = str2;
        this.f5650e = str3;
        this.f5651f = j4;
        this.f5652g = c2356t;
        this.f5653h = str4;
        this.f5654i = i10;
        this.f5655j = str5;
        this.f5656k = obj;
    }
}
