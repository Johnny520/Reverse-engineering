package p154k5;

import bsh.C1259t2;
import p239q5.C6274y;
import p309v5.AbstractC8824f;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3990x extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public static final C3990x f11750s = new C3990x(0);

    /* JADX INFO: renamed from: k5.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f11751a;

        /* JADX INFO: renamed from: b */
        public final C6274y f11752b;

        public a(int i10, C6274y c6274y) {
            if (i10 < 0) {
                C9987e.m38645a("address < 0");
                throw null;
            }
            if (c6274y == null) {
                C1259t2.m5095a("position == null");
                throw null;
            }
            this.f11751a = i10;
            this.f11752b = c6274y;
        }

        /* JADX INFO: renamed from: a */
        public int m15912a() {
            return this.f11751a;
        }

        /* JADX INFO: renamed from: b */
        public C6274y m15913b() {
            return this.f11752b;
        }
    }

    public C3990x(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: F */
    public static C3990x m15909F(C3977k c3977k, int i10) {
        if (i10 == 1) {
            return f11750s;
        }
        if (i10 != 2 && i10 != 3) {
            C9987e.m38645a("bogus howMuch");
            return null;
        }
        C6274y c6274y = C6274y.f19672d;
        int size = c3977k.size();
        a[] aVarArr = new a[size];
        C6274y c6274y2 = c6274y;
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC3976j abstractC3976jM15787F = c3977k.m15787F(i12);
            if (abstractC3976jM15787F instanceof C3970f) {
                z10 = true;
            } else {
                C6274y c6274yM15777m = abstractC3976jM15787F.m15777m();
                if (!c6274yM15777m.equals(c6274y) && !c6274yM15777m.m24859b(c6274y2) && (i10 != 3 || z10)) {
                    aVarArr[i11] = new a(abstractC3976jM15787F.m15772h(), c6274yM15777m);
                    i11++;
                    z10 = false;
                    c6274y2 = c6274yM15777m;
                }
            }
        }
        C3990x c3990x = new C3990x(i11);
        for (int i13 = 0; i13 < i11; i13++) {
            c3990x.m15911G(i13, aVarArr[i13]);
        }
        c3990x.mo6829t();
        return c3990x;
    }

    /* JADX INFO: renamed from: E */
    public a m15910E(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: G */
    public void m15911G(int i10, a aVar) {
        m33889y(i10, aVar);
    }
}
