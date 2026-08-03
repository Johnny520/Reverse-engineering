package p099h;

import gg.AbstractC1417m;
import p071f1.AbstractC0996c0;
import p071f1.C1032u0;
import p071f1.C1034w;
import p085fg.InterfaceC1231l;
import p089g1.C1276e;
import p116i.AbstractC1742d;
import p116i.C1772n;
import p116i.C1778p;

/* JADX INFO: renamed from: h.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1446c extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C1446c f4794h;

    /* JADX INFO: renamed from: i */
    public static final C1446c f4795i;

    /* JADX INFO: renamed from: j */
    public static final C1446c f4796j;

    /* JADX INFO: renamed from: k */
    public static final C1446c f4797k;

    /* JADX INFO: renamed from: l */
    public static final C1446c f4798l;

    /* JADX INFO: renamed from: m */
    public static final C1446c f4799m;

    /* JADX INFO: renamed from: n */
    public static final C1446c f4800n;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4801g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f4794h = new C1446c(i9, 0);
        f4795i = new C1446c(i9, 1);
        f4796j = new C1446c(i9, 2);
        f4797k = new C1446c(i9, 3);
        f4798l = new C1446c(i9, 4);
        f4799m = new C1446c(i9, 5);
        f4800n = new C1446c(i9, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1446c(int i9, int i10) {
        super(i9);
        this.f4801g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f4801g) {
            case 0:
                return obj;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                long jM2633a = C1034w.m2633a(((C1034w) obj).f3265a, C1276e.f4259x);
                return new C1778p(C1034w.m2636d(jM2633a), C1034w.m2640h(jM2633a), C1034w.m2639g(jM2633a), C1034w.m2637e(jM2633a));
            case 3:
                long j3 = ((C1032u0) obj).f3256a;
                return new C1772n(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            case 4:
                C1772n c1772n = (C1772n) obj;
                return new C1032u0(AbstractC0996c0.m2511g(c1772n.f5914a, c1772n.f5915b));
            case 5:
                return AbstractC1742d.m4379o(0.0f, 0.0f, null, 7);
            default:
                return AbstractC1473m0.f4893c;
        }
    }
}
