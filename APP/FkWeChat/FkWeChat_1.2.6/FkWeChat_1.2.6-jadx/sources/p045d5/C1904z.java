package p045d5;

import bsh.C1193i2;
import p309v5.AbstractC8834p;
import p309v5.C8829k;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1904z extends AbstractC8834p {

    /* JADX INFO: renamed from: r */
    public final C8829k f5346r;

    /* JADX INFO: renamed from: s */
    public final C8829k f5347s;

    /* JADX INFO: renamed from: t */
    public int f5348t;

    public C1904z(int i10) {
        super(true);
        this.f5346r = new C8829k(i10);
        this.f5347s = new C8829k(i10 + 1);
        this.f5348t = i10;
    }

    /* JADX INFO: renamed from: A */
    public int m6941A(int i10) {
        return this.f5346r.m33920z(i10);
    }

    /* JADX INFO: renamed from: B */
    public C8829k m6942B() {
        return this.f5346r;
    }

    /* JADX INFO: renamed from: C */
    public void m6943C() {
        m33929u();
        int i10 = this.f5348t;
        if (i10 != this.f5347s.size() - 1) {
            C9987e.m38645a("incomplete instance");
            return;
        }
        int iM33920z = this.f5347s.m33920z(i10);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int iM33920z2 = this.f5347s.m33920z(i12);
            if (iM33920z2 != iM33920z) {
                if (i12 != i11) {
                    this.f5347s.m33913I(i11, iM33920z2);
                    C8829k c8829k = this.f5346r;
                    c8829k.m33913I(i11, c8829k.m33920z(i12));
                }
                i11++;
            }
        }
        if (i11 != i10) {
            this.f5346r.m33914J(i11);
            this.f5347s.m33913I(i11, iM33920z);
            this.f5347s.m33914J(i11 + 1);
            this.f5348t = i11;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m6944D(int i10) {
        m33929u();
        if (i10 < 0) {
            C9987e.m38645a("target < 0");
        } else if (this.f5347s.size() == this.f5348t) {
            this.f5347s.m33917w(i10);
        } else {
            C1193i2.m4438a("non-default elements not all set");
        }
    }

    public int size() {
        return this.f5348t;
    }

    @Override // p309v5.AbstractC8834p
    /* JADX INFO: renamed from: t */
    public void mo6829t() {
        this.f5346r.mo6829t();
        this.f5347s.mo6829t();
        super.mo6829t();
    }

    /* JADX INFO: renamed from: w */
    public void m6945w(int i10, int i11) {
        m33929u();
        if (i11 < 0) {
            C9987e.m38645a("target < 0");
        } else {
            this.f5346r.m33917w(i10);
            this.f5347s.m33917w(i11);
        }
    }

    /* JADX INFO: renamed from: x */
    public int m6946x() {
        return this.f5347s.m33920z(this.f5348t);
    }

    /* JADX INFO: renamed from: y */
    public int m6947y(int i10) {
        return this.f5347s.m33920z(i10);
    }

    /* JADX INFO: renamed from: z */
    public C8829k m6948z() {
        return this.f5347s;
    }
}
