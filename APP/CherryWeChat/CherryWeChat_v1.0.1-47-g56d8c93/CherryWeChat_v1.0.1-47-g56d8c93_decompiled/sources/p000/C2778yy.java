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

    public C2778yy(C2769yp c2769yp) {
        this.f9434a = c2769yp;
    }

    @Override // p000.InterfaceC0938Vt
    /* JADX INFO: renamed from: a */
    public final void mo1797a() {
        this.f9434a.m5128d(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2778yy) {
            C2778yy c2778yy = (C2778yy) obj;
            if (this.f9435b == c2778yy.f9435b && AbstractC2622vD.m5131b(this.f9436c, c2778yy.f9436c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9435b * 31;
        Bitmap.Config config = this.f9436c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2821zy.m5455c(this.f9435b, this.f9436c);
    }
}
