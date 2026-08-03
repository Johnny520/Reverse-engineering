package p357y1;

import android.content.Context;
import gg.AbstractC1417m;
import p072f2.AbstractC1058u;
import p072f2.C1050m;
import p072f2.C1054q;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1883u;
import p266s0.C3878h;

/* JADX INFO: renamed from: y1.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5914o extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C5914o f23998h;

    /* JADX INFO: renamed from: i */
    public static final C5914o f23999i;

    /* JADX INFO: renamed from: j */
    public static final C5914o f24000j;

    /* JADX INFO: renamed from: k */
    public static final C5914o f24001k;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24002g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f23998h = new C5914o(i9, 0);
        f23999i = new C5914o(i9, 1);
        f24000j = new C5914o(i9, 2);
        f24001k = new C5914o(i9, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5914o(int i9, int i10) {
        super(i9);
        this.f24002g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f24002g) {
            case 0:
                return Boolean.TRUE;
            case 1:
                C1050m c1050mM2659k = ((C1054q) obj).m2659k();
                return Boolean.valueOf(c1050mM2659k.f3341g.m2316c(AbstractC1058u.f3360A));
            case 2:
                C3878h c3878h = (C3878h) obj;
                C1883u c1883u = AbstractC5891i0.f23945a;
                c3878h.getClass();
                AbstractC1874r.m4640v(c3878h, c1883u);
                return ((Context) AbstractC1874r.m4640v(c3878h, AbstractC5891i0.f23946b)).getResources();
            default:
                return Boolean.valueOf(AbstractC5883g0.m10590f(obj));
        }
    }
}
