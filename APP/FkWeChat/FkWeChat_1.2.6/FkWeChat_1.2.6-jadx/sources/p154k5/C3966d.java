package p154k5;

import bsh.C1259t2;
import okhttp3.internal.url._UrlKt;
import p254r5.C6496e0;
import p309v5.AbstractC8824f;
import p309v5.AbstractC8826h;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3966d extends AbstractC8824f implements Comparable {

    /* JADX INFO: renamed from: s */
    public static final C3966d f11458s = new C3966d(0);

    /* JADX INFO: renamed from: k5.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements Comparable {

        /* JADX INFO: renamed from: q */
        public final C6496e0 f11459q;

        /* JADX INFO: renamed from: r */
        public final int f11460r;

        public a(C6496e0 c6496e0, int i10) {
            if (i10 < 0) {
                C9987e.m38645a("handler < 0");
                throw null;
            }
            if (c6496e0 == null) {
                C1259t2.m5095a("exceptionType == null");
                throw null;
            }
            this.f11460r = i10;
            this.f11459q = c6496e0;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i10 = this.f11460r;
            int i11 = aVar.f11460r;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            return this.f11459q.compareTo(aVar.f11459q);
        }

        /* JADX INFO: renamed from: c */
        public C6496e0 m15729c() {
            return this.f11459q;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && compareTo((a) obj) == 0;
        }

        /* JADX INFO: renamed from: g */
        public int m15730g() {
            return this.f11460r;
        }

        public int hashCode() {
            return (this.f11460r * 31) + this.f11459q.hashCode();
        }
    }

    public C3966d(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public boolean m15723E() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return m15725G(size - 1).m15729c().equals(C6496e0.f20397t);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3966d c3966d) {
        if (this == c3966d) {
            return 0;
        }
        int size = size();
        int size2 = c3966d.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompareTo = m15725G(i10).compareTo(c3966d.m15725G(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: G */
    public a m15725G(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: H */
    public void m15726H(int i10, C6496e0 c6496e0, int i11) {
        m33889y(i10, new a(c6496e0, i11));
    }

    /* JADX INFO: renamed from: I */
    public String m15727I(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(100);
        int size = size();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("catch ");
        for (int i10 = 0; i10 < size; i10++) {
            a aVarM15725G = m15725G(i10);
            if (i10 != 0) {
                sb2.append(",\n");
                sb2.append(str);
                sb2.append("  ");
            }
            if (i10 == size - 1 && m15723E()) {
                sb2.append("<any>");
            } else {
                sb2.append(aVarM15725G.m15729c().mo6828g());
            }
            sb2.append(" -> ");
            sb2.append(AbstractC8826h.m33899h(aVarM15725G.m15730g()));
        }
        return sb2.toString();
    }

    @Override // p309v5.AbstractC8824f, p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m15727I(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
    }
}
