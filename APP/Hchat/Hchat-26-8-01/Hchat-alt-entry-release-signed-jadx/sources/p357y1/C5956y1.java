package p357y1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p064ea.C0851c;
import p069f.AbstractC0944l;
import p069f.C0933f0;
import p069f.C0965w;
import p117i0.InterfaceC1827f;
import p162l3.C2469w;
import p222p.AbstractC3199a;
import p278t0.C4079c;

/* JADX INFO: renamed from: y1.y1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5956y1 {

    /* JADX INFO: renamed from: a */
    public final C0851c f24192a = new C0851c();

    /* JADX INFO: renamed from: b */
    public final C0965w f24193b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5956y1() {
        C0965w c0965w = AbstractC0944l.f2974a;
        this.f24193b = new C0965w();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10674a() {
        C0851c c0851c = this.f24192a;
        if (c0851c != null && !c0851c.f2604c) {
            c0851c.f2604c = true;
            synchronized (((C2469w) c0851c.f2602a)) {
                try {
                    for (AutoCloseable autoCloseable : ((LinkedHashMap) c0851c.f2605d).values()) {
                        if (autoCloseable != null) {
                            try {
                                AbstractC3199a.m6847t(autoCloseable);
                            } catch (Exception e6) {
                                throw new RuntimeException(e6);
                            }
                        }
                    }
                    for (AutoCloseable autoCloseable2 : (LinkedHashSet) c0851c.f2603b) {
                        if (autoCloseable2 != null) {
                            try {
                                AbstractC3199a.m6847t(autoCloseable2);
                            } catch (Exception e7) {
                                throw new RuntimeException(e7);
                            }
                        }
                    }
                    ((LinkedHashSet) c0851c.f2603b).clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C0965w c0965w = this.f24193b;
        int[] iArr = c0965w.f2964b;
        Object[] objArr = c0965w.f2965c;
        long[] jArr = c0965w.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j3) < 128) {
                        int i13 = (i9 << 3) + i12;
                        int i14 = iArr[i13];
                        C0933f0 c0933f0 = (C0933f0) objArr[i13];
                        Object[] objArr2 = c0933f0.f2923a;
                        int i15 = c0933f0.f2924b;
                        int i16 = 0;
                        while (i16 < i15) {
                            int i17 = i10;
                            C5952x1 c5952x1 = (C5952x1) objArr2[i16];
                            InterfaceC1827f interfaceC1827f = c5952x1.f24184d;
                            if (interfaceC1827f != null) {
                                interfaceC1827f.cancel();
                            }
                            c5952x1.f24184d = null;
                            C4079c c4079c = (C4079c) c5952x1.f24181a.f23527b;
                            c4079c.f13518b = true;
                            c4079c.f13517a = false;
                            c4079c.m8263a();
                            i16++;
                            i10 = i17;
                        }
                    }
                    int i18 = i10;
                    j3 >>= i18;
                    i12++;
                    i10 = i18;
                }
                if (i11 != i10) {
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
}
