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

    public C0666j0(long j2, String str, String str2, WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3) {
        this.f2067a = j2;
        this.f2068b = str;
        this.f2069c = str2;
        this.f2070d = weakReference;
        this.f2071e = weakReference2;
        this.f2072f = weakReference3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0666j0)) {
            return false;
        }
        C0666j0 c0666j0 = (C0666j0) obj;
        return this.f2067a == c0666j0.f2067a && AbstractC0307g.m699a(this.f2068b, c0666j0.f2068b) && AbstractC0307g.m699a(this.f2069c, c0666j0.f2069c) && AbstractC0307g.m699a(this.f2070d, c0666j0.f2070d) && AbstractC0307g.m699a(this.f2071e, c0666j0.f2071e) && AbstractC0307g.m699a(this.f2072f, c0666j0.f2072f);
    }

    public final int hashCode() {
        return this.f2072f.hashCode() + ((this.f2071e.hashCode() + ((this.f2070d.hashCode() + ((this.f2069c.hashCode() + ((this.f2068b.hashCode() + (Long.hashCode(this.f2067a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MessageRef(msgId=" + this.f2067a + ", content=" + this.f2068b + ", rawContent=" + this.f2069c + ", message=" + this.f2070d + ", view=" + this.f2071e + ", target=" + this.f2072f + ")";
    }
}
