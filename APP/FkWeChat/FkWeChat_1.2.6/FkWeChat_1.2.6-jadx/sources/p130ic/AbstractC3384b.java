package p130ic;

import java.util.Arrays;
import p113hc.InterfaceC2979f0;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ic.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3384b {

    /* JADX INFO: renamed from: q */
    public AbstractC3386d[] f9336q;

    /* JADX INFO: renamed from: r */
    public int f9337r;

    /* JADX INFO: renamed from: s */
    public int f9338s;

    /* JADX INFO: renamed from: t */
    public C3406x f9339t;

    /* JADX INFO: renamed from: i */
    public final AbstractC3386d m12719i() {
        AbstractC3386d abstractC3386dMo11007k;
        C3406x c3406x;
        synchronized (this) {
            try {
                AbstractC3386d[] abstractC3386dArrMo11008l = this.f9336q;
                if (abstractC3386dArrMo11008l == null) {
                    abstractC3386dArrMo11008l = mo11008l(2);
                    this.f9336q = abstractC3386dArrMo11008l;
                } else if (this.f9337r >= abstractC3386dArrMo11008l.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC3386dArrMo11008l, abstractC3386dArrMo11008l.length * 2);
                    this.f9336q = (AbstractC3386d[]) objArrCopyOf;
                    abstractC3386dArrMo11008l = (AbstractC3386d[]) objArrCopyOf;
                }
                int i10 = this.f9338s;
                do {
                    abstractC3386dMo11007k = abstractC3386dArrMo11008l[i10];
                    if (abstractC3386dMo11007k == null) {
                        abstractC3386dMo11007k = mo11007k();
                        abstractC3386dArrMo11008l[i10] = abstractC3386dMo11007k;
                    }
                    i10++;
                    if (i10 >= abstractC3386dArrMo11008l.length) {
                        i10 = 0;
                    }
                    abstractC3386dMo11007k.getClass();
                } while (!abstractC3386dMo11007k.mo11022a(this));
                this.f9338s = i10;
                this.f9337r++;
                c3406x = this.f9339t;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3406x != null) {
            c3406x.m12755b0(1);
        }
        return abstractC3386dMo11007k;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC2979f0 m12720j() {
        C3406x c3406x;
        synchronized (this) {
            c3406x = this.f9339t;
            if (c3406x == null) {
                c3406x = new C3406x(this.f9337r);
                this.f9339t = c3406x;
            }
        }
        return c3406x;
    }

    /* JADX INFO: renamed from: k */
    public abstract AbstractC3386d mo11007k();

    /* JADX INFO: renamed from: l */
    public abstract AbstractC3386d[] mo11008l(int i10);

    /* JADX INFO: renamed from: m */
    public final void m12721m(AbstractC3386d abstractC3386d) {
        C3406x c3406x;
        int i10;
        InterfaceC5976f[] interfaceC5976fArrMo11023b;
        synchronized (this) {
            try {
                int i11 = this.f9337r - 1;
                this.f9337r = i11;
                c3406x = this.f9339t;
                if (i11 == 0) {
                    this.f9338s = 0;
                }
                abstractC3386d.getClass();
                interfaceC5976fArrMo11023b = abstractC3386d.mo11023b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5976f interfaceC5976f : interfaceC5976fArrMo11023b) {
            if (interfaceC5976f != null) {
                C4712s.a aVar = C4712s.f13928r;
                interfaceC5976f.resumeWith(C4712s.m18798b(C4700i0.f13910a));
            }
        }
        if (c3406x != null) {
            c3406x.m12755b0(-1);
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m12722n() {
        return this.f9337r;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC3386d[] m12723o() {
        return this.f9336q;
    }
}
