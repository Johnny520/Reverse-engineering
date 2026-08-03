package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: nk */
/* JADX INFO: loaded from: classes.dex */
public final class C2283nk extends AbstractC1217bc implements InterfaceC2413qd {

    /* JADX INFO: renamed from: b */
    public final Handler f8017b;

    /* JADX INFO: renamed from: c */
    public final boolean f8018c;

    /* JADX INFO: renamed from: d */
    public final C2283nk f8019d;

    public C2283nk(Handler r2, boolean r3) {
        this.f8017b = r2;
        this.f8018c = r3;
        if (r3 == false) goto L5;
        C2283nk r32 = this;
    L6:
        this.f8019d = r32;
        return;
    L5:
        r32 = new C2283nk(r2, true);
        goto L6
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C2283nk) == false) goto L10;
        C2283nk r32 = (C2283nk) r3;
        if (r32.f8017b == this.f8017b) goto L7;
        return false;
    L7:
        if (r32.f8018c != this.f8018c) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // p000.InterfaceC2413qd
    /* JADX INFO: renamed from: f */
    public final void mo2668f(long r5, C0523M6 r7) {
        RunnableC2260n3 r0 = new RunnableC2260n3(8, r7, this);
        if (r5 <= 4611686018427387903L) goto L6;
        r5 = 4611686018427387903L;
    L6:
        if (this.f8017b.postDelayed(r0, r5) == false) goto L9;
        AbstractC0828TB.m1649r(r7, new C0394J6(0, new C2240mk(0, this, r0)));
        return;
    L9:
        m4610w(r7.f1711e, r0);
    }

    public final int hashCode() {
        int r0 = System.identityHashCode(this.f8017b);
        if (this.f8018c == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 ^ r1;
    L5:
        r1 = 1237;
        goto L7
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac r2, Runnable r3) {
        if (this.f8017b.post(r3) == true) goto L6;
        m4610w(r2, r3);
        return;
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        C1498hd r0 = AbstractC1499he.f5282a;
        C2283nk r02 = AbstractC1106Zp.f3500a;
        if (this != r02) goto L17;
        String r03 = "Dispatchers.Main";
    L12:
        if (r03 != null) goto L19;
        String r04 = this.f8017b.toString();
        if (this.f8018c == true) goto L16;
        return r04;
    L16:
        return AbstractC0213Ey.m407e(r04, ".immediate");
    L19:
        return r03;
    L17:
        C2283nk r05 = r02.f8019d;     // Catch: UnsupportedOperationException -> L8
    L9:
        if (this != r05) goto L11;
        r03 = "Dispatchers.Main.immediate";
        goto L12
    L11:
        r03 = null;
    L8:
        r05 = null;
        goto L9
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: u */
    public final boolean mo2333u(InterfaceC1137ac r2) {
        if (this.f8018c == true) goto L5;
        return true;
    L5:
        if (AbstractC0585Nj.m1134a(Looper.myLooper(), this.f8017b.getLooper()) == false) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m4610w(InterfaceC1137ac r4, Runnable r5) {
        CancellationException r0 = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC1332dm r1 = (InterfaceC1332dm) r4.mo24m(C1456gf.f5162f);
        if (r1 == null) goto L5;
        r1.mo1749r(r0);
    L5:
        C1498hd r02 = AbstractC1499he.f5282a;
        ExecutorC0921Vc.f2876b.mo1781t(r4, r5);
    }
}
