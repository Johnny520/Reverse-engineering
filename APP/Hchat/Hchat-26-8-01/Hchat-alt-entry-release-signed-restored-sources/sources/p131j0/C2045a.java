package p131j0;

import p069f.AbstractC0953p0;
import p069f.C0933f0;
import p069f.C0943k0;
import p136j8.C2104o;

/* JADX INFO: renamed from: j0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2045a {

    /* JADX INFO: renamed from: a */
    public final C0943k0 f6890a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [sh.k.invoke():java.lang.Object] */
    public /* synthetic */ C2045a(C0943k0 c0943k0) {
        this.f6890a = c0943k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m5053a(C0943k0 c0943k0) {
        Object objM2320g = c0943k0.m2320g(null);
        if (objM2320g == null) {
            return null;
        }
        if (!(objM2320g instanceof C0933f0)) {
            c0943k0.m2324k(null);
            return objM2320g;
        }
        C0933f0 c0933f0 = (C0933f0) objM2320g;
        if (c0933f0.m2293h()) {
            C2104o.m5287l("List is empty.");
            return null;
        }
        int i9 = c0933f0.f2924b - 1;
        Object objM2291f = c0933f0.m2291f(i9);
        c0933f0.m2296k(i9);
        objM2291f.getClass();
        if (c0933f0.m2293h()) {
            c0943k0.m2324k(null);
        }
        if (c0933f0.f2924b == 1) {
            c0943k0.m2326m(null, c0933f0.m2290e());
        }
        return objM2291f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0933f0 m5054b(C0943k0 c0943k0) {
        if (c0943k0.m2322i()) {
            C0933f0 c0933f0 = AbstractC0953p0.f3003b;
            c0933f0.getClass();
            return c0933f0;
        }
        C0933f0 c0933f02 = new C0933f0();
        Object[] objArr = c0943k0.f2970c;
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
                            Object obj = objArr[(i9 << 3) + i11];
                            if (obj instanceof C0933f0) {
                                c0933f02.m2287b((C0933f0) obj);
                            } else {
                                obj.getClass();
                                c0933f02.m2286a(obj);
                            }
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
        return c0933f02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2045a) {
            return this.f6890a.equals(((C2045a) obj).f6890a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6890a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultiValueMap(map=" + this.f6890a + ')';
    }
}
