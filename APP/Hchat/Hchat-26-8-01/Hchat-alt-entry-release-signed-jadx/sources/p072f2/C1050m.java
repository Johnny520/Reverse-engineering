package p072f2;

import gg.AbstractC1416l;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p069f.AbstractC0957r0;
import p069f.C0936h;
import p069f.C0943k0;
import p069f.C0960t;
import p114hg.InterfaceC1711a;
import p276sf.InterfaceC3955b;
import p357y1.AbstractC5883g0;

/* JADX INFO: renamed from: f2.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1050m implements InterfaceC1062y, Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C0943k0 f3341g;

    /* JADX INFO: renamed from: h */
    public C0960t f3342h;

    /* JADX INFO: renamed from: i */
    public boolean f3343i;

    /* JADX INFO: renamed from: j */
    public boolean f3344j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1050m() {
        long[] jArr = AbstractC0957r0.f3015a;
        this.f3341g = new C0943k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p072f2.InterfaceC1062y
    /* JADX INFO: renamed from: a */
    public final void mo2644a(C1061x c1061x, Object obj) {
        boolean z9 = obj instanceof C1038a;
        C0943k0 c0943k0 = this.f3341g;
        if (z9 && c0943k0.m2316c(c1061x)) {
            Object objM2320g = c0943k0.m2320g(c1061x);
            objM2320g.getClass();
            C1038a c1038a = (C1038a) objM2320g;
            C1038a c1038a2 = (C1038a) obj;
            String str = c1038a2.f3269a;
            if (str == null) {
                str = c1038a.f3269a;
            }
            InterfaceC3955b interfaceC3955b = c1038a2.f3270b;
            if (interfaceC3955b == null) {
                interfaceC3955b = c1038a.f3270b;
            }
            c0943k0.m2326m(c1061x, new C1038a(str, interfaceC3955b));
        } else {
            c0943k0.m2326m(c1061x, obj);
        }
        c1061x.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1050m m2645c() {
        C1050m c1050m = new C1050m();
        c1050m.f3343i = this.f3343i;
        c1050m.f3344j = this.f3344j;
        C0943k0 c0943k0 = c1050m.f3341g;
        c0943k0.getClass();
        C0943k0 c0943k02 = this.f3341g;
        c0943k02.getClass();
        Object[] objArr = c0943k02.f2969b;
        Object[] objArr2 = c0943k02.f2970c;
        long[] jArr = c0943k02.f2968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            int i12 = (i9 << 3) + i11;
                            c0943k0.m2326m(objArr[i12], objArr2[i12]);
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return c1050m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m2646d(C1061x c1061x) {
        Object objM2320g = this.f3341g.m2320g(c1061x);
        if (objM2320g != null) {
            return objM2320g;
        }
        throw new IllegalStateException("Key not present: " + c1061x + " - consider getOrElse or getOrNull");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2647e(C1050m c1050m) {
        C0943k0 c0943k0 = c1050m.f3341g;
        Object[] objArr = c0943k0.f2969b;
        Object[] objArr2 = c0943k0.f2970c;
        long[] jArr = c0943k0.f2968a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        int i12 = (i9 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        C1061x c1061x = (C1061x) obj;
                        C0943k0 c0943k02 = this.f3341g;
                        Object objM2320g = c0943k02.m2320g(c1061x);
                        c1061x.getClass();
                        Object objInvoke = c1061x.f3406b.invoke(objM2320g, obj2);
                        if (objInvoke != null) {
                            c0943k02.m2326m(c1061x, objInvoke);
                        }
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1050m)) {
            return false;
        }
        C1050m c1050m = (C1050m) obj;
        return AbstractC1416l.m3825a(this.f3341g, c1050m.f3341g) && this.f3343i == c1050m.f3343i && this.f3344j == c1050m.f3344j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3344j) + AbstractC0921a.m2245h(this.f3341g.hashCode() * 31, 31, this.f3343i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0960t c0960t = this.f3342h;
        if (c0960t == null) {
            C0943k0 c0943k0 = this.f3341g;
            c0943k0.getClass();
            C0960t c0960t2 = new C0960t(c0943k0);
            this.f3342h = c0960t2;
            c0960t = c0960t2;
        }
        return ((C0936h) c0960t.entrySet()).iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f3343i) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (this.f3344j) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        C0943k0 c0943k0 = this.f3341g;
        Object[] objArr = c0943k0.f2969b;
        Object[] objArr2 = c0943k0.f2970c;
        long[] jArr = c0943k0.f2968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            int i12 = (i9 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            sb2.append(str);
                            sb2.append(((C1061x) obj).f3405a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return AbstractC5883g0.m10605u(this) + "{ " + ((Object) sb2) + " }";
    }
}
