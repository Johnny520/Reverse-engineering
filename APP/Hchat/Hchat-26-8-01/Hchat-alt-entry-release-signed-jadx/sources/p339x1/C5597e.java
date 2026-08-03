package p339x1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1858m2;
import p117i0.InterfaceC1880t;
import p131j0.C2046b;
import p266s0.C3878h;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.InterfaceC4412n0;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.InterfaceC5905l2;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5597e extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public static final C5597e f22751h;

    /* JADX INFO: renamed from: i */
    public static final C5597e f22752i;

    /* JADX INFO: renamed from: j */
    public static final C5597e f22753j;

    /* JADX INFO: renamed from: k */
    public static final C5597e f22754k;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22755g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 2;
        f22751h = new C5597e(i9, 0);
        f22752i = new C5597e(i9, 1);
        f22753j = new C5597e(i9, 2);
        f22754k = new C5597e(i9, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5597e(int i9, int i10) {
        super(i9);
        this.f22755g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x00ae */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x00bd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x00b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22755g) {
            case 0:
                ((Number) obj2).intValue();
                ((C5602f0) ((InterfaceC5605g) obj)).getClass();
                break;
            case 1:
                ((C5602f0) ((InterfaceC5605g) obj)).m10029c0((InterfaceC4412n0) obj2);
                break;
            case 2:
                ((C5602f0) ((InterfaceC5605g) obj)).m10031d0((InterfaceC5853o) obj2);
                break;
            default:
                InterfaceC1880t interfaceC1880t = (InterfaceC1880t) obj2;
                C5602f0 c5602f0 = (C5602f0) ((InterfaceC5605g) obj);
                c5602f0.f22774H = interfaceC1880t;
                C5587b1 c5587b1 = c5602f0.f22778L;
                C1858m2 c1858m2 = AbstractC5888h1.f23926h;
                C3878h c3878h = (C3878h) interfaceC1880t;
                c3878h.getClass();
                c5602f0.m10025Z((InterfaceC4233c) AbstractC1874r.m4640v(c3878h, c1858m2));
                EnumC4243m enumC4243m = (EnumC4243m) AbstractC1874r.m4640v(c3878h, AbstractC5888h1.f23932n);
                if (c5602f0.f22772F != enumC4243m) {
                    c5602f0.f22772F = enumC4243m;
                    c5602f0.m10007D();
                    C5602f0 c5602f0M10049u = c5602f0.m10049u();
                    if (c5602f0M10049u != null) {
                        c5602f0M10049u.m10005B();
                    } else {
                        InterfaceC5641r1 interfaceC5641r1 = c5602f0.f22803t;
                        if (interfaceC5641r1 != null) {
                            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).invalidate();
                        }
                    }
                    c5602f0.m10006C();
                    for (AbstractC5852n abstractC5852n = c5587b1.f22719f; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
                        abstractC5852n.mo1330k0();
                    }
                }
                c5602f0.m10033e0((InterfaceC5905l2) AbstractC1874r.m4640v(c3878h, AbstractC5888h1.f23938t));
                AbstractC5852n abstractC5852n2 = c5587b1.f22719f;
                if ((abstractC5852n2.f23791j & 32768) != 0) {
                    while (abstractC5852n2 != null) {
                        if ((abstractC5852n2.f23790i & 32768) != 0) {
                            ?? M10149e = abstractC5852n2;
                            ?? c2046b = 0;
                            while (M10149e != 0) {
                                if (M10149e instanceof InterfaceC5609h) {
                                    AbstractC5852n abstractC5852n3 = ((AbstractC5852n) ((InterfaceC5609h) M10149e)).f23788g;
                                    if (abstractC5852n3.f23801t) {
                                        AbstractC5617j1.m10137c(abstractC5852n3);
                                    } else {
                                        abstractC5852n3.f23797p = true;
                                    }
                                } else if ((M10149e.f23790i & 32768) != 0 && (M10149e instanceof AbstractC5615j)) {
                                    AbstractC5852n abstractC5852n4 = ((AbstractC5615j) M10149e).f22875v;
                                    int i9 = 0;
                                    M10149e = M10149e;
                                    c2046b = c2046b;
                                    while (abstractC5852n4 != null) {
                                        if ((abstractC5852n4.f23790i & 32768) != 0) {
                                            i9++;
                                            c2046b = c2046b;
                                            if (i9 == 1) {
                                                M10149e = abstractC5852n4;
                                            } else {
                                                if (c2046b == 0) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (M10149e != 0) {
                                                    c2046b.m5056b(M10149e);
                                                    M10149e = 0;
                                                }
                                                c2046b.m5056b(abstractC5852n4);
                                            }
                                        }
                                        abstractC5852n4 = abstractC5852n4.f23793l;
                                        M10149e = M10149e;
                                        c2046b = c2046b;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                M10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                        if ((abstractC5852n2.f23791j & 32768) != 0) {
                            abstractC5852n2 = abstractC5852n2.f23793l;
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }
}
