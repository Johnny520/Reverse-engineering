package p050c0;

import java.lang.ref.WeakReference;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0666j0 {

    /* JADX INFO: renamed from: a */
    public final long f2067a;

    /* JADX INFO: renamed from: b */
    public final String f2068b;

    /* JADX INFO: renamed from: c */
    public final String f2069c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f2070d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f2071e;

    /* JADX INFO: renamed from: f */
    public final WeakReference f2072f;

    public C0666j0(long r1, String r3, String r4, WeakReference r5, WeakReference r6, WeakReference r7) {
        this.f2067a = r1;
        this.f2068b = r3;
        this.f2069c = r4;
        this.f2070d = r5;
        this.f2071e = r6;
        this.f2072f = r7;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0666j0) == true) goto L8;
        return false;
    L8:
        C0666j0 r82 = (C0666j0) r8;
        long r3 = r82.f2067a;
        if (this.f2067a == r3) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f2068b, r82.f2068b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f2069c, r82.f2069c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f2070d, r82.f2070d) == true) goto L21;
        return false;
    L21:
        if (AbstractC0307g.m699a(this.f2071e, r82.f2071e) == true) goto L24;
        return false;
    L24:
        if (AbstractC0307g.m699a(this.f2072f, r82.f2072f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r02 = Long.hashCode(this.f2067a) * 31;
        int r1 = (this.f2068b.hashCode() + r02) * 31;
        int r03 = (this.f2069c.hashCode() + r1) * 31;
        int r12 = (this.f2070d.hashCode() + r03) * 31;
        int r04 = (this.f2071e.hashCode() + r12) * 31;
        return this.f2072f.hashCode() + r04;
    }

    public final String toString() {
        return "MessageRef(msgId=" + this.f2067a + ", content=" + this.f2068b + ", rawContent=" + this.f2069c + ", message=" + this.f2070d + ", view=" + this.f2071e + ", target=" + this.f2072f + ")";
    }
}
