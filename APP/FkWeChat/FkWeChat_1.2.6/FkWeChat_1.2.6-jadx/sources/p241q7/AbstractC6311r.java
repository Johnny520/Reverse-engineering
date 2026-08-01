package p241q7;

import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p215oc.C5729x;
import p281t6.C8171x;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: q7.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6311r {

    /* JADX INFO: renamed from: q7.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19808a;

        static {
            int[] iArr = new int[EnumC6282c0.values().length];
            try {
                iArr[EnumC6282c0.f19689r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6282c0.f19688q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19808a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m24956a(InterfaceC0188p interfaceC0188p, InterfaceC6297k interfaceC6297k) {
        interfaceC6297k.getClass();
        interfaceC6297k.mo24908b(interfaceC0188p);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m24957b(InterfaceC0188p interfaceC0188p, InterfaceC6297k interfaceC6297k) {
        interfaceC6297k.getClass();
        interfaceC6297k.mo24908b(interfaceC0188p);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC6297k m24958c(InterfaceC6297k interfaceC6297k, String str) {
        AbstractC6299l abstractC6299lM24890b;
        interfaceC6297k.getClass();
        str.getClass();
        List listM24867c = C6278a0.f19679b.m24871d(str).m24867c();
        int size = listM24867c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6280b0 c6280b0 = (C6280b0) listM24867c.get(i10);
            String strM24872a = c6280b0.m24872a();
            int i11 = a.f19808a[c6280b0.m24873b().ordinal()];
            if (i11 == 1) {
                abstractC6299lM24890b = C6289g.f19710a.m24890b(strM24872a);
            } else {
                if (i11 != 2) {
                    C5729x.m23182a();
                    return null;
                }
                abstractC6299lM24890b = C6289g.f19710a.m24889a(strM24872a);
            }
            interfaceC6297k = interfaceC6297k.mo24909c(abstractC6299lM24890b);
        }
        return AbstractC8611a0.m33060E(str, "/", false, 2, null) ? interfaceC6297k.mo24909c(C6316t0.f19815a) : interfaceC6297k;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6297k m24959d(InterfaceC6297k interfaceC6297k, final InterfaceC0188p interfaceC0188p) {
        interfaceC6297k.getClass();
        interfaceC0188p.getClass();
        return m24960e(interfaceC6297k, C8171x.f27399b.m31700b(), new InterfaceC0184l() { // from class: q7.q
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC6311r.m24957b(interfaceC0188p, (InterfaceC6297k) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC6297k m24960e(InterfaceC6297k interfaceC6297k, C8171x c8171x, InterfaceC0184l interfaceC0184l) {
        interfaceC6297k.getClass();
        c8171x.getClass();
        interfaceC0184l.getClass();
        InterfaceC6297k interfaceC6297kMo24909c = interfaceC6297k.mo24909c(new C6277a(c8171x));
        interfaceC0184l.mo27m(interfaceC6297kMo24909c);
        return interfaceC6297kMo24909c;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC6297k m24961f(InterfaceC6297k interfaceC6297k, final InterfaceC0188p interfaceC0188p) {
        interfaceC6297k.getClass();
        interfaceC0188p.getClass();
        return m24960e(interfaceC6297k, C8171x.f27399b.m31705g(), new InterfaceC0184l() { // from class: q7.p
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC6311r.m24956a(interfaceC0188p, (InterfaceC6297k) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC6297k m24962g(InterfaceC6297k interfaceC6297k, String str, InterfaceC0184l interfaceC0184l) {
        interfaceC6297k.getClass();
        str.getClass();
        interfaceC0184l.getClass();
        InterfaceC6297k interfaceC6297kM24958c = m24958c(interfaceC6297k, str);
        interfaceC0184l.mo27m(interfaceC6297kM24958c);
        return interfaceC6297kM24958c;
    }
}
