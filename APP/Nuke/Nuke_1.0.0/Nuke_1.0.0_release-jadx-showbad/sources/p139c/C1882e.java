package p139c;

import p112W2.InterfaceC1599a;
import p135b.C1810B;
import p135b.C1833u;
import p145d.C1948a;

/* JADX INFO: renamed from: c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1882e {

    /* JADX INFO: renamed from: a */
    public final C1810B f6402a = new C1810B(this);

    /* JADX INFO: renamed from: b */
    public final C1948a f6403b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1599a f6404c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1882e(C1878a c1878a) {
        this.f6403b = new C1948a(this, c1878a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3372a(boolean z5) {
        C1810B c1810b = this.f6402a;
        c1810b.f6194b = z5;
        for (C1833u c1833u : c1810b.f6193a) {
            c1833u.m708f(c1833u.f6230e && z5);
        }
        this.f6403b.m708f(z5);
    }
}
