package p154k5;

import p309v5.AbstractC8824f;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3968e extends AbstractC8824f implements Comparable {

    /* JADX INFO: renamed from: s */
    public static final C3968e f11465s = new C3968e(0);

    /* JADX INFO: renamed from: k5.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements Comparable {

        /* JADX INFO: renamed from: q */
        public final int f11466q;

        /* JADX INFO: renamed from: r */
        public final int f11467r;

        /* JADX INFO: renamed from: s */
        public final C3966d f11468s;

        public a(int i10, int i11, C3966d c3966d) {
            if (i10 < 0) {
                C9987e.m38645a("start < 0");
                throw null;
            }
            if (i11 <= i10) {
                C9987e.m38645a("end <= start");
                throw null;
            }
            if (c3966d.m33927c()) {
                C9987e.m38645a("handlers.isMutable()");
                throw null;
            }
            this.f11466q = i10;
            this.f11467r = i11;
            this.f11468s = c3966d;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i10 = this.f11466q;
            int i11 = aVar.f11466q;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = this.f11467r;
            int i13 = aVar.f11467r;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
            return this.f11468s.compareTo(aVar.f11468s);
        }

        /* JADX INFO: renamed from: c */
        public int m15739c() {
            return this.f11467r;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && compareTo((a) obj) == 0;
        }

        /* JADX INFO: renamed from: g */
        public C3966d m15740g() {
            return this.f11468s;
        }

        /* JADX INFO: renamed from: h */
        public int m15741h() {
            return this.f11466q;
        }

        public int hashCode() {
            return (((this.f11466q * 31) + this.f11467r) * 31) + this.f11468s.hashCode();
        }
    }

    public C3968e(int i10) {
        super(i10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3968e c3968e) {
        if (this == c3968e) {
            return 0;
        }
        int size = size();
        int size2 = c3968e.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompareTo = m15736F(i10).compareTo(c3968e.m15736F(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: F */
    public a m15736F(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: G */
    public void m15737G(int i10, a aVar) {
        m33889y(i10, aVar);
    }
}
