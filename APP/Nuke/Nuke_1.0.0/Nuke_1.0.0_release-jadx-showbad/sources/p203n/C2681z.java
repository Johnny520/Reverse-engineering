package p203n;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2681z {

    /* JADX INFO: renamed from: a */
    public final Float f8550a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2675t f8551b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2681z(Float f2, InterfaceC2675t interfaceC2675t) {
        this.f8550a = f2;
        this.f8551b = interfaceC2675t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2681z)) {
            return false;
        }
        C2681z c2681z = (C2681z) obj;
        return c2681z.f8550a.equals(this.f8550a) && AbstractC1665j.m2981a(c2681z.f8551b, this.f8551b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8551b.hashCode() + AbstractC0231b.m391b(0, this.f8550a.hashCode() * 31, 31);
    }
}
