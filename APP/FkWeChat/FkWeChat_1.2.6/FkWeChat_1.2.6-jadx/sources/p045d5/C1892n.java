package p045d5;

import bsh.C1259t2;
import p309v5.AbstractC8824f;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1892n extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public static final C1892n f5268s = new C1892n(0);

    /* JADX INFO: renamed from: d5.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f5269a;

        /* JADX INFO: renamed from: b */
        public final int f5270b;

        public a(int i10, int i11) {
            if (i10 < 0) {
                C9987e.m38645a("startPc < 0");
                throw null;
            }
            if (i11 < 0) {
                C9987e.m38645a("lineNumber < 0");
                throw null;
            }
            this.f5269a = i10;
            this.f5270b = i11;
        }

        /* JADX INFO: renamed from: a */
        public int m6797a() {
            return this.f5270b;
        }

        /* JADX INFO: renamed from: b */
        public int m6798b() {
            return this.f5269a;
        }
    }

    public C1892n(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public static C1892n m6792E(C1892n c1892n, C1892n c1892n2) {
        if (c1892n == f5268s) {
            return c1892n2;
        }
        int size = c1892n.size();
        int size2 = c1892n2.size();
        C1892n c1892n3 = new C1892n(size + size2);
        for (int i10 = 0; i10 < size; i10++) {
            c1892n3.m6796I(i10, c1892n.m6793F(i10));
        }
        for (int i11 = 0; i11 < size2; i11++) {
            c1892n3.m6796I(size + i11, c1892n2.m6793F(i11));
        }
        return c1892n3;
    }

    /* JADX INFO: renamed from: F */
    public a m6793F(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: G */
    public int m6794G(int i10) {
        int size = size();
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            a aVarM6793F = m6793F(i13);
            int iM6798b = aVarM6793F.m6798b();
            if (iM6798b <= i10 && iM6798b > i11) {
                int iM6797a = aVarM6793F.m6797a();
                if (iM6798b == i10) {
                    return iM6797a;
                }
                i12 = iM6797a;
                i11 = iM6798b;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: H */
    public void m6795H(int i10, int i11, int i12) {
        m33889y(i10, new a(i11, i12));
    }

    /* JADX INFO: renamed from: I */
    public void m6796I(int i10, a aVar) {
        if (aVar != null) {
            m33889y(i10, aVar);
        } else {
            C1259t2.m5095a("item == null");
        }
    }
}
