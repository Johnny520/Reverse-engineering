package p027c0;

import p014b.C0126e;
import p015b0.C0136d0;
import p015b0.C0151q;
import p069f.C0929d0;
import p069f.C0933f0;
import p085fg.InterfaceC1231l;
import p100h0.C1551t0;
import p100h0.C1553u0;
import p100h0.C1555v0;
import p100h0.C1557w0;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5612i;
import p355y.C5838a;
import p356y0.InterfaceC5853o;
import p372z.AbstractC6054b;
import p372z.C6055c;
import p372z.C6058f;

/* JADX INFO: renamed from: c0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0366k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5853o m1319a(InterfaceC5853o interfaceC5853o, C0151q c0151q) {
        return interfaceC5853o.mo10549d(new C0357b(c0151q));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C6055c m1320b(InterfaceC5612i interfaceC5612i) {
        C6058f c6058f;
        C5838a c5838a = new C5838a();
        AbstractC5618k.m10170z(interfaceC5612i, C0359d.f1010a, new C0136d0(new C0136d0(c5838a, 2), 3, new C0361f(1, c5838a, C5838a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 1)));
        C0933f0 c0933f0 = new C0933f0();
        C0933f0 c0933f02 = c5838a.f23757a;
        Object[] objArr = c0933f02.f2923a;
        int i9 = c0933f02.f2924b;
        int i10 = 0;
        boolean z9 = true;
        AbstractC6054b abstractC6054b = null;
        while (true) {
            c6058f = C6058f.f24529b;
            if (i10 >= i9) {
                break;
            }
            AbstractC6054b abstractC6054b2 = (AbstractC6054b) objArr[i10];
            if (!z9 || abstractC6054b2 != c6058f) {
                if (abstractC6054b2 == c6058f && abstractC6054b == c6058f) {
                    z9 = false;
                    break;
                    break;
                }
                if (abstractC6054b2 != c6058f) {
                    C0933f0 c0933f03 = c5838a.f23758b;
                    Object[] objArr2 = c0933f03.f2923a;
                    int i11 = c0933f03.f2924b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (!((Boolean) ((InterfaceC1231l) objArr2[i12]).invoke(abstractC6054b2)).booleanValue()) {
                            z9 = false;
                            break;
                        }
                    }
                }
                c0933f0.m2286a(abstractC6054b2);
                z9 = false;
                abstractC6054b = abstractC6054b2;
            }
            i10++;
        }
        if (((AbstractC6054b) (c0933f0.m2293h() ? null : c0933f0.f2923a[c0933f0.f2924b - 1])) == c6058f) {
            c0933f0.m2296k(c0933f0.f2924b - 1);
        }
        C0929d0 c0929d0 = c0933f0.f2925c;
        if (c0929d0 == null) {
            c0929d0 = new C0929d0(c0933f0, 0);
            c0933f0.f2925c = c0929d0;
        }
        return new C6055c(c0929d0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final InterfaceC5853o m1321c(C1553u0 c1553u0) {
        return new C0360e(c1553u0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC5853o m1322d(InterfaceC5853o interfaceC5853o, C0126e c0126e, C1555v0 c1555v0, C1557w0 c1557w0, C1551t0 c1551t0) {
        return interfaceC5853o.mo10549d(new C0367l(c0126e, c1555v0, c1557w0, c1551t0));
    }
}
