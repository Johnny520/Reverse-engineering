package p041H0;

import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0377O;
import p047I0.AbstractC0757q0;
import p047I0.InterfaceC0697T0;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.InterfaceC1303B;
import p105V.C1483e;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p136b0.C1847i;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: H0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0589e extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public static final C0589e f1886f;

    /* JADX INFO: renamed from: g */
    public static final C0589e f1887g;

    /* JADX INFO: renamed from: h */
    public static final C0589e f1888h;

    /* JADX INFO: renamed from: i */
    public static final C0589e f1889i;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1890e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 2;
        f1886f = new C0589e(i5, 0);
        f1887g = new C0589e(i5, 1);
        f1888h = new C0589e(i5, 2);
        f1889i = new C0589e(i5, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0589e(int i5, int i6) {
        super(i5);
        this.f1890e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x00a4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x00b3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0065 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0065 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x00ad */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1890e) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0593g) obj).getClass();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C0564I) ((InterfaceC0593g) obj)).m819c0((InterfaceC0377O) obj2);
                break;
            case 2:
                ((C0564I) ((InterfaceC0593g) obj)).m821d0((InterfaceC2207p) obj2);
                break;
            default:
                InterfaceC1303B interfaceC1303B = (InterfaceC1303B) obj2;
                C0564I c0564i = (C0564I) ((InterfaceC0593g) obj);
                c0564i.f1695F = interfaceC1303B;
                C0590e0 c0590e0 = c0564i.f1699J;
                C1341U0 c1341u0 = AbstractC0757q0.f2358h;
                C1847i c1847i = (C1847i) interfaceC1303B;
                c1847i.getClass();
                c0564i.m815Z((InterfaceC2007c) AbstractC1385s.m2630t(c1847i, c1341u0));
                EnumC2017m enumC2017m = (EnumC2017m) AbstractC1385s.m2630t(c1847i, AbstractC0757q0.f2364n);
                if (c0564i.f1693D != enumC2017m) {
                    c0564i.f1693D = enumC2017m;
                    c0564i.m796D();
                    C0564I c0564iM839u = c0564i.m839u();
                    if (c0564iM839u != null) {
                        c0564iM839u.m794B();
                    }
                    c0564i.m795C();
                    for (AbstractC2206o abstractC2206o = c0590e0.f1896f; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
                        abstractC2206o.mo1007s0();
                    }
                }
                c0564i.m823e0((InterfaceC0697T0) AbstractC1385s.m2630t(c1847i, AbstractC0757q0.f2369s));
                AbstractC2206o abstractC2206o2 = c0590e0.f1896f;
                if ((abstractC2206o2.f7189g & 32768) != 0) {
                    while (abstractC2206o2 != null) {
                        if ((abstractC2206o2.f7188f & 32768) != 0) {
                            ?? M1029e = abstractC2206o2;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0595h) {
                                    AbstractC2206o abstractC2206o3 = ((AbstractC2206o) ((InterfaceC0595h) M1029e)).f7186d;
                                    if (abstractC2206o3.f7199q) {
                                        AbstractC0598i0.m1010c(abstractC2206o3);
                                    } else {
                                        abstractC2206o3.f7195m = true;
                                    }
                                } else if ((M1029e.f7188f & 32768) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o4 = ((AbstractC0599j) M1029e).f1943s;
                                    int i5 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o4 != null) {
                                        if ((abstractC2206o4.f7188f & 32768) != 0) {
                                            i5++;
                                            c1483e = c1483e;
                                            if (i5 == 1) {
                                                M1029e = abstractC2206o4;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o4);
                                            }
                                        }
                                        abstractC2206o4 = abstractC2206o4.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        if ((abstractC2206o2.f7189g & 32768) != 0) {
                            abstractC2206o2 = abstractC2206o2.f7191i;
                        }
                    }
                }
                break;
        }
        return C0891q.f2780a;
    }
}
