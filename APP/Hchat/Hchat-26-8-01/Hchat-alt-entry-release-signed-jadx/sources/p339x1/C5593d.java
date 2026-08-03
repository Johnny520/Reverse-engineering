package p339x1;

import gg.AbstractC1417m;
import p069f.C0943k0;
import p069f.C0945l0;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p292u1.AbstractC4229a;
import p357y1.C5916o1;

/* JADX INFO: renamed from: x1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5593d extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C5593d f22730h;

    /* JADX INFO: renamed from: i */
    public static final C5593d f22731i;

    /* JADX INFO: renamed from: j */
    public static final C5593d f22732j;

    /* JADX INFO: renamed from: k */
    public static final C5593d f22733k;

    /* JADX INFO: renamed from: l */
    public static final C5593d f22734l;

    /* JADX INFO: renamed from: m */
    public static final C5593d f22735m;

    /* JADX INFO: renamed from: n */
    public static final C5593d f22736n;

    /* JADX INFO: renamed from: o */
    public static final C5593d f22737o;

    /* JADX INFO: renamed from: p */
    public static final C5593d f22738p;

    /* JADX INFO: renamed from: q */
    public static final C5593d f22739q;

    /* JADX INFO: renamed from: r */
    public static final C5593d f22740r;

    /* JADX INFO: renamed from: s */
    public static final C5593d f22741s;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22742g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f22730h = new C5593d(i9, 0);
        f22731i = new C5593d(i9, 1);
        f22732j = new C5593d(i9, 2);
        f22733k = new C5593d(i9, 3);
        f22734l = new C5593d(i9, 4);
        f22735m = new C5593d(i9, 5);
        f22736n = new C5593d(i9, 6);
        f22737o = new C5593d(i9, 7);
        f22738p = new C5593d(i9, 8);
        f22739q = new C5593d(i9, 9);
        f22740r = new C5593d(i9, 10);
        f22741s = new C5593d(i9, 11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5593d(int i9, int i10) {
        super(i9);
        this.f22742g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.f22742g) {
            case 0:
                InterfaceC5605g interfaceC5605g = (InterfaceC5605g) obj;
                C5602f0 c5602f0 = interfaceC5605g instanceof C5602f0 ? (C5602f0) interfaceC5605g : null;
                if (c5602f0 != null && c5602f0.f22789W) {
                    AbstractC4229a.m8494b("Apply is called on deactivated node " + interfaceC5605g);
                }
                return C3967n.f12976a;
            case 1:
                C5653v1 c5653v1 = (C5653v1) obj;
                if (c5653v1.mo9975L()) {
                    AbstractC5628n0 abstractC5628n0 = c5653v1.f23045h;
                    if (!abstractC5628n0.f22924q) {
                        InterfaceC1231l interfaceC1231lMo7612i = c5653v1.f23044g.mo7612i();
                        C0943k0 c0943k0 = abstractC5628n0.f22927t;
                        if (interfaceC1231lMo7612i != null) {
                            abstractC5628n0.m10175M0(c5653v1, 9223372034707292159L, 0L);
                            abstractC5628n0.f22920m = interfaceC1231lMo7612i;
                        } else if (c0943k0 != null) {
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
                                                abstractC5628n0.m10179e1((C0945l0) objArr[(i9 << 3) + i11]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i10 == 8) {
                                            if (i9 != length) {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                            }
                            c0943k0.m2314a();
                        }
                    }
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC5638q1 interfaceC5638q1 = ((AbstractC5614i1) obj).f22866R;
                if (interfaceC5638q1 != null) {
                    ((C5916o1) interfaceC5638q1).m10625c();
                }
                return C3967n.f12976a;
            case 3:
                AbstractC5614i1 abstractC5614i1 = (AbstractC5614i1) obj;
                C5602f0 c5602f02 = abstractC5614i1.f22868u;
                try {
                    if (abstractC5614i1.mo9975L()) {
                        abstractC5614i1.m10085R1(true);
                        break;
                    }
                    return C3967n.f12976a;
                } catch (Throwable th2) {
                    c5602f02.m10024Y(th2);
                    throw null;
                }
            case 4:
                C5629n1 c5629n1 = (C5629n1) obj;
                if (c5629n1.mo9975L()) {
                    c5629n1.f22928g.mo1327C0();
                }
                return C3967n.f12976a;
            case 5:
                C5602f0 c5602f03 = (C5602f0) obj;
                if (c5602f03.m10010G()) {
                    c5602f03.m10022U(false);
                }
                return C3967n.f12976a;
            case 6:
                C5602f0 c5602f04 = (C5602f0) obj;
                if (c5602f04.m10010G()) {
                    c5602f04.m10022U(false);
                }
                return C3967n.f12976a;
            case 7:
                C5602f0 c5602f05 = (C5602f0) obj;
                if (c5602f05.m10010G()) {
                    c5602f05.m10021S(false);
                }
                return C3967n.f12976a;
            case 8:
                C5602f0 c5602f06 = (C5602f0) obj;
                if (c5602f06.m10010G()) {
                    c5602f06.m10021S(false);
                }
                return C3967n.f12976a;
            case 9:
                C5602f0 c5602f07 = (C5602f0) obj;
                if (c5602f07.m10010G()) {
                    C5602f0.m10000T(c5602f07, false, 7);
                }
                return C3967n.f12976a;
            case 10:
                C5602f0 c5602f08 = (C5602f0) obj;
                if (c5602f08.m10010G()) {
                    C5602f0.m10001V(c5602f08, false, 7);
                }
                return C3967n.f12976a;
            default:
                C5602f0 c5602f09 = (C5602f0) obj;
                if (c5602f09.m10010G()) {
                    c5602f09.m10008E();
                }
                return C3967n.f12976a;
        }
    }
}
