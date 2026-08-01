package p018b3;

import p024b9.AbstractC1061t;
import p319w2.C9058e;

/* JADX INFO: renamed from: b3.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0942c1 {

    /* JADX INFO: renamed from: a */
    public final C9058e f2908a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0956i0 f2909b;

    public C0942c1(C9058e c9058e, InterfaceC0956i0 interfaceC0956i0) {
        this.f2908a = c9058e;
        this.f2909b = interfaceC0956i0;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0956i0 m3465a() {
        return this.f2909b;
    }

    /* JADX INFO: renamed from: b */
    public final C9058e m3466b() {
        return this.f2908a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0942c1)) {
            return false;
        }
        C0942c1 c0942c1 = (C0942c1) obj;
        return AbstractC1061t.m3842c(this.f2908a, c0942c1.f2908a) && AbstractC1061t.m3842c(this.f2909b, c0942c1.f2909b);
    }

    public int hashCode() {
        return (this.f2908a.hashCode() * 31) + this.f2909b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f2908a) + ", offsetMapping=" + this.f2909b + ')';
    }
}
