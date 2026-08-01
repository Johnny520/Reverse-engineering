package p102z0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1118a {

    /* JADX INFO: renamed from: a */
    public final String f3760a;

    /* JADX INFO: renamed from: b */
    public final String f3761b;

    /* JADX INFO: renamed from: c */
    public final String f3762c;

    /* JADX INFO: renamed from: d */
    public final boolean f3763d;

    /* JADX INFO: renamed from: e */
    public final boolean f3764e;

    /* JADX INFO: renamed from: f */
    public final boolean f3765f;

    /* JADX INFO: renamed from: g */
    public final String f3766g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1118a(String str, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4) {
        AbstractC0223g.m418e(str4, "error");
        this.f3760a = str;
        this.f3761b = str2;
        this.f3762c = str3;
        this.f3763d = z2;
        this.f3764e = z3;
        this.f3765f = z4;
        this.f3766g = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1118a)) {
            return false;
        }
        C1118a c1118a = (C1118a) obj;
        c1118a.getClass();
        return this.f3760a.equals(c1118a.f3760a) && this.f3761b.equals(c1118a.f3761b) && this.f3762c.equals(c1118a.f3762c) && this.f3763d == c1118a.f3763d && this.f3764e == c1118a.f3764e && this.f3765f == c1118a.f3765f && AbstractC0223g.m414a(this.f3766g, c1118a.f3766g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3766g.hashCode() + ((Boolean.hashCode(this.f3765f) + ((Boolean.hashCode(this.f3764e) + ((Boolean.hashCode(this.f3763d) + AbstractC0174d.m347c(this.f3762c, AbstractC0174d.m347c(this.f3761b, AbstractC0174d.m347c(this.f3760a, -615328328, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrityInfo(expectedPackageName=com.lu.wxmask272, installedPackageName=");
        sb.append(this.f3760a);
        sb.append(", runtimePackageName=");
        sb.append(this.f3761b);
        sb.append(", signatureSha256=");
        sb.append(this.f3762c);
        sb.append(", packageMatched=");
        sb.append(this.f3763d);
        sb.append(", signatureMatched=");
        sb.append(this.f3764e);
        sb.append(", moduleApkKnown=");
        sb.append(this.f3765f);
        sb.append(", error=");
        return AbstractC0174d.m356l(sb, this.f3766g, ")");
    }
}
