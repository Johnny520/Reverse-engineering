package p065eb;

import gg.AbstractC1416l;
import java.io.File;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: eb.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860c1 {

    /* JADX INFO: renamed from: a */
    public final String f2635a;

    /* JADX INFO: renamed from: b */
    public final String f2636b;

    /* JADX INFO: renamed from: c */
    public final String f2637c;

    /* JADX INFO: renamed from: d */
    public final long f2638d;

    /* JADX INFO: renamed from: e */
    public final File f2639e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0860c1(String str, String str2, String str3, long j3, File file) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f2635a = str;
        this.f2636b = str2;
        this.f2637c = str3;
        this.f2638d = j3;
        this.f2639e = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0860c1)) {
            return false;
        }
        C0860c1 c0860c1 = (C0860c1) obj;
        return AbstractC1416l.m3825a(this.f2635a, c0860c1.f2635a) && AbstractC1416l.m3825a(this.f2636b, c0860c1.f2636b) && AbstractC1416l.m3825a(this.f2637c, c0860c1.f2637c) && this.f2638d == c0860c1.f2638d && AbstractC1416l.m3825a(this.f2639e, c0860c1.f2639e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2243f = AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f2635a.hashCode() * 31, 31, this.f2636b), 31, this.f2637c), 31, this.f2638d);
        File file = this.f2639e;
        return iM2243f + (file == null ? 0 : file.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("VideoDownloadRequest(md5=", this.f2635a, ", url=", this.f2636b, ", aesKey=");
        sbM1027p.append(this.f2637c);
        sbM1027p.append(", expectedLength=");
        sbM1027p.append(this.f2638d);
        sbM1027p.append(", localFile=");
        sbM1027p.append(this.f2639e);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
