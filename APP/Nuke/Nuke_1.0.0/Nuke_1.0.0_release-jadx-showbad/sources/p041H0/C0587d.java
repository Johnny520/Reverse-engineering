package p041H0;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p186k.C2408E;
import p186k.C2409F;

/* JADX INFO: renamed from: H0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0587d extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C0587d f1873f;

    /* JADX INFO: renamed from: g */
    public static final C0587d f1874g;

    /* JADX INFO: renamed from: h */
    public static final C0587d f1875h;

    /* JADX INFO: renamed from: i */
    public static final C0587d f1876i;

    /* JADX INFO: renamed from: j */
    public static final C0587d f1877j;

    /* JADX INFO: renamed from: k */
    public static final C0587d f1878k;

    /* JADX INFO: renamed from: l */
    public static final C0587d f1879l;

    /* JADX INFO: renamed from: m */
    public static final C0587d f1880m;

    /* JADX INFO: renamed from: n */
    public static final C0587d f1881n;

    /* JADX INFO: renamed from: o */
    public static final C0587d f1882o;

    /* JADX INFO: renamed from: p */
    public static final C0587d f1883p;

    /* JADX INFO: renamed from: q */
    public static final C0587d f1884q;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1885e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 1;
        f1873f = new C0587d(i5, 0);
        f1874g = new C0587d(i5, 1);
        f1875h = new C0587d(i5, 2);
        f1876i = new C0587d(i5, 3);
        f1877j = new C0587d(i5, 4);
        f1878k = new C0587d(i5, 5);
        f1879l = new C0587d(i5, 6);
        f1880m = new C0587d(i5, 7);
        f1881n = new C0587d(i5, 8);
        f1882o = new C0587d(i5, 9);
        f1883p = new C0587d(i5, 10);
        f1884q = new C0587d(i5, 11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0587d(int i5, int i6) {
        super(i5);
        this.f1885e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) {
        switch (this.f1885e) {
            case 0:
                InterfaceC0593g interfaceC0593g = (InterfaceC0593g) obj;
                C0564I c0564i = interfaceC0593g instanceof C0564I ? (C0564I) interfaceC0593g : null;
                if (c0564i == null || !c0564i.f1710U) {
                    return C0891q.f2780a;
                }
                throw new IllegalStateException("Apply is called on deactivated node " + interfaceC0593g);
            case BuildConfig.VERSION_CODE /* 1 */:
                C0622u0 c0622u0 = (C0622u0) obj;
                if (c0622u0.mo800H()) {
                    AbstractC0572Q abstractC0572Q = c0622u0.f1988e;
                    if (!abstractC0572Q.f1781n) {
                        InterfaceC1601c interfaceC1601cMo610d = c0622u0.f1987d.mo610d();
                        C2408E c2408e = abstractC0572Q.f1784q;
                        if (interfaceC1601cMo610d != null) {
                            abstractC0572Q.m886p0(c0622u0, 9223372034707292159L, 0L);
                            abstractC0572Q.f1777j = interfaceC1601cMo610d;
                        } else if (c2408e != null) {
                            Object[] objArr = c2408e.f7789c;
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
                                                abstractC0572Q.m882E0((C2409F) objArr[(i5 << 3) + i7]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i6 == 8) {
                                            if (i5 != length) {
                                                i5++;
                                            }
                                        }
                                    }
                                }
                            }
                            c2408e.m4266a();
                        }
                    }
                }
                return C0891q.f2780a;
            case 2:
                InterfaceC0612p0 interfaceC0612p0 = ((AbstractC0596h0) obj).f1931O;
                if (interfaceC0612p0 != null) {
                    interfaceC0612p0.invalidate();
                }
                return C0891q.f2780a;
            case 3:
                AbstractC0596h0 abstractC0596h0 = (AbstractC0596h0) obj;
                C0564I c0564i2 = abstractC0596h0.f1932r;
                try {
                    if (abstractC0596h0.mo800H()) {
                        abstractC0596h0.m1005q1(true);
                        break;
                    }
                    return C0891q.f2780a;
                } catch (Throwable th) {
                    c0564i2.m814Y(th);
                    throw null;
                }
            case 4:
                C0606m0 c0606m0 = (C0606m0) obj;
                if (c0606m0.mo800H()) {
                    c0606m0.f1955d.mo1051O();
                }
                return C0891q.f2780a;
            case 5:
                C0564I c0564i3 = (C0564I) obj;
                if (c0564i3.m799G()) {
                    c0564i3.m812U(false);
                }
                return C0891q.f2780a;
            case 6:
                C0564I c0564i4 = (C0564I) obj;
                if (c0564i4.m799G()) {
                    c0564i4.m812U(false);
                }
                return C0891q.f2780a;
            case 7:
                C0564I c0564i5 = (C0564I) obj;
                if (c0564i5.m799G()) {
                    c0564i5.m811S(false);
                }
                return C0891q.f2780a;
            case 8:
                C0564I c0564i6 = (C0564I) obj;
                if (c0564i6.m799G()) {
                    c0564i6.m811S(false);
                }
                return C0891q.f2780a;
            case 9:
                C0564I c0564i7 = (C0564I) obj;
                if (c0564i7.m799G()) {
                    C0564I.m789T(c0564i7, false, 7);
                }
                return C0891q.f2780a;
            case 10:
                C0564I c0564i8 = (C0564I) obj;
                if (c0564i8.m799G()) {
                    C0564I.m790V(c0564i8, false, 7);
                }
                return C0891q.f2780a;
            default:
                C0564I c0564i9 = (C0564I) obj;
                if (c0564i9.m799G()) {
                    c0564i9.m797E();
                }
                return C0891q.f2780a;
        }
    }
}
