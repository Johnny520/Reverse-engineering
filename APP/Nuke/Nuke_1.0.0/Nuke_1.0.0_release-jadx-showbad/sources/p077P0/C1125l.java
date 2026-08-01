package p077P0;

import java.util.Iterator;
import p011B4.AbstractC0231b;
import p047I0.AbstractC0681L;
import p056K2.InterfaceC0877c;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p186k.AbstractC2415L;
import p186k.C2408E;
import p186k.C2425g;
import p186k.C2436r;

/* JADX INFO: renamed from: P0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1125l implements InterfaceC1136w, Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C2408E f3702d;

    /* JADX INFO: renamed from: e */
    public C2436r f3703e;

    /* JADX INFO: renamed from: f */
    public boolean f3704f;

    /* JADX INFO: renamed from: g */
    public boolean f3705g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1125l() {
        long[] jArr = AbstractC2415L.f7816a;
        this.f3702d = new C2408E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077P0.InterfaceC1136w
    /* JADX INFO: renamed from: a */
    public final void mo1128a(C1135v c1135v, Object obj) {
        boolean z5 = obj instanceof C1114a;
        C2408E c2408e = this.f3702d;
        if (z5 && c2408e.m4268c(c1135v)) {
            Object objM4272g = c2408e.m4272g(c1135v);
            AbstractC1665j.m2983c(objM4272g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            C1114a c1114a = (C1114a) objM4272g;
            C1114a c1114a2 = (C1114a) obj;
            String str = c1114a2.f3633a;
            if (str == null) {
                str = c1114a.f3633a;
            }
            InterfaceC0877c interfaceC0877c = c1114a2.f3634b;
            if (interfaceC0877c == null) {
                interfaceC0877c = c1114a.f3634b;
            }
            c2408e.m4278m(c1135v, new C1114a(str, interfaceC0877c));
        } else {
            c2408e.m4278m(c1135v, obj);
        }
        c1135v.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1125l m2159b() {
        C1125l c1125l = new C1125l();
        c1125l.f3704f = this.f3704f;
        c1125l.f3705g = this.f3705g;
        C2408E c2408e = c1125l.f3702d;
        c2408e.getClass();
        C2408E c2408e2 = this.f3702d;
        AbstractC1665j.m2985e(c2408e2, "from");
        Object[] objArr = c2408e2.f7788b;
        Object[] objArr2 = c2408e2.f7789c;
        long[] jArr = c2408e2.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            c2408e.m4278m(objArr[i8], objArr2[i8]);
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return c1125l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m2160c(C1135v c1135v) {
        Object objM4272g = this.f3702d.m4272g(c1135v);
        if (objM4272g != null) {
            return objM4272g;
        }
        throw new IllegalStateException("Key not present: " + c1135v + " - consider getOrElse or getOrNull");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2161d(C1125l c1125l) {
        C2408E c2408e = c1125l.f3702d;
        Object[] objArr = c2408e.f7788b;
        Object[] objArr2 = c2408e.f7789c;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i5 << 3) + i7;
                        Object obj = objArr[i8];
                        Object obj2 = objArr2[i8];
                        C1135v c1135v = (C1135v) obj;
                        C2408E c2408e2 = this.f3702d;
                        Object objM4272g = c2408e2.m4272g(c1135v);
                        AbstractC1665j.m2983c(c1135v, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objMo0g = c1135v.f3768b.mo0g(objM4272g, obj2);
                        if (objMo0g != null) {
                            c2408e2.m4278m(c1135v, objMo0g);
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1125l)) {
            return false;
        }
        C1125l c1125l = (C1125l) obj;
        return AbstractC1665j.m2981a(this.f3702d, c1125l.f3702d) && this.f3704f == c1125l.f3704f && this.f3705g == c1125l.f3705g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3705g) + AbstractC0231b.m395f(this.f3702d.hashCode() * 31, 31, this.f3704f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2436r c2436r = this.f3703e;
        if (c2436r == null) {
            C2408E c2408e = this.f3702d;
            c2408e.getClass();
            C2436r c2436r2 = new C2436r(c2408e);
            this.f3703e = c2436r2;
            c2436r = c2436r2;
        }
        return ((C2425g) c2436r.entrySet()).iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f3704f) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f3705g) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        C2408E c2408e = this.f3702d;
        Object[] objArr = c2408e.f7788b;
        Object[] objArr2 = c2408e.f7789c;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            Object obj = objArr[i8];
                            Object obj2 = objArr2[i8];
                            sb.append(str);
                            sb.append(((C1135v) obj).f3767a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return AbstractC0681L.m1195q(this) + "{ " + ((Object) sb) + " }";
    }
}
