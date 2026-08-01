package p029F0;

import p041H0.InterfaceC0625w;
import p112W2.InterfaceC1601c;
import p153e1.C2016l;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: F0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0385X extends AbstractC2206o implements InterfaceC0625w {

    /* JADX INFO: renamed from: r */
    public InterfaceC1601c f1199r;

    /* JADX INFO: renamed from: s */
    public long f1200s;

    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: x */
    public final void mo655x(long j5) {
        if (C2016l.m3704a(this.f1200s, j5)) {
            return;
        }
        this.f1199r.mo1h(new C2016l(j5));
        this.f1200s = j5;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return true;
    }
}
