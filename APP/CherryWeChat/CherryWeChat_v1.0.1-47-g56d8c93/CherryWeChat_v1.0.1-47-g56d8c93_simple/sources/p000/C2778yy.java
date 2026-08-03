package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: yy */
/* JADX INFO: loaded from: classes.dex */
public final class C2778yy implements InterfaceC0938Vt {

    /* JADX INFO: renamed from: a */
    public final C2769yp f9434a;

    /* JADX INFO: renamed from: b */
    public int f9435b;

    /* JADX INFO: renamed from: c */
    public Bitmap.Config f9436c;

    public C2778yy(C2769yp r1) {
        this.f9434a = r1;
    }

    @Override // p000.InterfaceC0938Vt
    /* JADX INFO: renamed from: a */
    public final void mo1797a() {
        this.f9434a.m5128d(this);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C2778yy) == false) goto L10;
        C2778yy r42 = (C2778yy) r4;
        if (this.f9435b != r42.f9435b) goto L10;
        if (AbstractC2622vD.m5131b(this.f9436c, r42.f9436c) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f9435b * 31;
        Bitmap.Config r1 = this.f9436c;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r0 + r12;
    L5:
        r12 = 0;
        goto L7
    }

    public final String toString() {
        return C2821zy.m5455c(this.f9435b, this.f9436c);
    }
}
