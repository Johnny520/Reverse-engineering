package p056f0;

import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0797H {

    /* JADX INFO: renamed from: a */
    public final String f2892a;

    /* JADX INFO: renamed from: b */
    public final String f2893b;

    /* JADX INFO: renamed from: c */
    public final String f2894c;

    /* JADX INFO: renamed from: d */
    public final boolean f2895d;

    /* JADX INFO: renamed from: e */
    public final boolean f2896e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0290p f2897f;

    public C0797H(String str, String str2, String str3, boolean z2, boolean z3, InterfaceC0290p interfaceC0290p) {
        this.f2892a = str;
        this.f2893b = str2;
        this.f2894c = str3;
        this.f2895d = z2;
        this.f2896e = z3;
        this.f2897f = interfaceC0290p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0797H)) {
            return false;
        }
        C0797H c0797h = (C0797H) obj;
        return AbstractC0307g.m699a(this.f2892a, c0797h.f2892a) && AbstractC0307g.m699a(this.f2893b, c0797h.f2893b) && AbstractC0307g.m699a(this.f2894c, c0797h.f2894c) && this.f2895d == c0797h.f2895d && this.f2896e == c0797h.f2896e && AbstractC0307g.m699a(this.f2897f, c0797h.f2897f);
    }

    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f2896e) + ((Boolean.hashCode(this.f2895d) + ((this.f2894c.hashCode() + ((this.f2893b.hashCode() + (this.f2892a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        InterfaceC0290p interfaceC0290p = this.f2897f;
        return iHashCode + (interfaceC0290p == null ? 0 : interfaceC0290p.hashCode());
    }

    public final String toString() {
        return "FeatureItem(title=" + this.f2892a + ", summary=" + this.f2893b + ", key=" + this.f2894c + ", defaultOn=" + this.f2895d + ", hasConfig=" + this.f2896e + ", onConfigClick=" + this.f2897f + ")";
    }
}
