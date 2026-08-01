package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0006F {

    /* JADX INFO: renamed from: a */
    public final String f49a;

    /* JADX INFO: renamed from: b */
    public final String f50b;

    /* JADX INFO: renamed from: c */
    public final String f51c;

    /* JADX INFO: renamed from: d */
    public final Object f52d;

    /* JADX INFO: renamed from: e */
    public final String f53e;

    /* JADX INFO: renamed from: f */
    public final String f54f;

    /* JADX INFO: renamed from: g */
    public final String f55g;

    /* JADX INFO: renamed from: h */
    public final String f56h;

    /* JADX INFO: renamed from: i */
    public final String f57i;

    /* JADX INFO: renamed from: j */
    public final String f58j;

    /* JADX INFO: renamed from: k */
    public final int f59k;

    /* JADX INFO: renamed from: l */
    public final String f60l;

    /* JADX INFO: renamed from: m */
    public final long f61m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0006F(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, int i2, String str10, long j2) {
        this.f49a = str;
        this.f50b = str2;
        this.f51c = str3;
        this.f52d = list;
        this.f53e = str4;
        this.f54f = str5;
        this.f55g = str6;
        this.f56h = str7;
        this.f57i = str8;
        this.f58j = str9;
        this.f59k = i2;
        this.f60l = str10;
        this.f61m = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0006F)) {
            return false;
        }
        C0006F c0006f = (C0006F) obj;
        return this.f49a.equals(c0006f.f49a) && this.f50b.equals(c0006f.f50b) && this.f51c.equals(c0006f.f51c) && this.f52d.equals(c0006f.f52d) && this.f53e.equals(c0006f.f53e) && this.f54f.equals(c0006f.f54f) && this.f55g.equals(c0006f.f55g) && this.f56h.equals(c0006f.f56h) && this.f57i.equals(c0006f.f57i) && this.f58j.equals(c0006f.f58j) && this.f59k == c0006f.f59k && this.f60l.equals(c0006f.f60l) && this.f61m == c0006f.f61m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f61m) + AbstractC0174d.m347c(this.f60l, AbstractC0174d.m345a(this.f59k, AbstractC0174d.m347c(this.f58j, AbstractC0174d.m347c(this.f57i, AbstractC0174d.m347c(this.f56h, AbstractC0174d.m347c(this.f55g, AbstractC0174d.m347c(this.f54f, AbstractC0174d.m347c(this.f53e, AbstractC0174d.m346b(this.f52d, AbstractC0174d.m347c(this.f51c, AbstractC0174d.m347c(this.f50b, this.f49a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedReadTraceHookPoint(sendClickClassName=" + this.f49a + ", sendClickMethodName=" + this.f50b + ", sendClickMethodSign=" + this.f51c + ", sendClickMethods=" + this.f52d + ", appMsgContentClassName=" + this.f53e + ", parseXmlMethodName=" + this.f54f + ", parseXmlMethodSign=" + this.f55g + ", appMsgLogicClassName=" + this.f56h + ", sendAppMsgMethodName=" + this.f57i + ", sendAppMsgMethodSign=" + this.f58j + ", versionCode=" + this.f59k + ", versionName=" + this.f60l + ", updatedAt=" + this.f61m + ")";
    }
}
