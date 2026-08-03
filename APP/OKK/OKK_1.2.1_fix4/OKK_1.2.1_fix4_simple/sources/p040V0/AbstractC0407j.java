package p040V0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001A0.AbstractC0040p;
import p009E0.C0180k;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: V0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0407j extends AbstractC0408k {
    /* JADX INFO: renamed from: A0 */
    public static List m993A0(InterfaceC0405h r2) {
        AbstractC0307g.m703e(r2, "<this>");
        Iterator r22 = r2.iterator();
        if (r22.hasNext() == false) goto L5;
        Object r02 = r22.next();
        if (r22.hasNext() == false) goto L9;
        ArrayList r1 = new ArrayList();
        r1.add(r02);
    L12:
        if (r22.hasNext() == false) goto L14;
        r1.add(r22.next());
        goto L12
    L14:
        return r1;
    L9:
        return AbstractC0040p.m82F(r02);
    L5:
        return C0190u.f401a;
    }

    /* JADX INFO: renamed from: y0 */
    public static C0403f m994y0(C0180k r2, InterfaceC0286l r3) {
        C0411n r1 = C0411n.f911i;
        return new C0403f(r2, r3);
    }

    /* JADX INFO: renamed from: z0 */
    public static C0402e m995z0(C0402e r2, InterfaceC0286l r3) {
        return new C0402e(new C0403f(r2, r3), false, C0410m.f910a);
    }
}
