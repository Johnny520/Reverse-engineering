package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fu1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final fu1 f3143c = new fu1(0, 2, 1);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        int i = ((e11) bo0Var.m579d(0)).f2293a;
        List list = (List) bo0Var.m579d(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            interfaceC0654rf.mo2456a(i3, obj);
            interfaceC0654rf.mo2460g(i3, obj);
        }
    }
}
