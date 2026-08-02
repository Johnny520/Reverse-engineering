package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yf3 {
    /* JADX INFO: renamed from: a */
    public static boolean m6266a(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6267b(InterfaceC0596px interfaceC0596px, in0 in0Var) {
        ((go0) interfaceC0596px).m1972b(new C0831w1(in0Var), a83.f116a);
    }

    /* JADX INFO: renamed from: c */
    public static final void m6268c(InterfaceC0596px interfaceC0596px, mn0 mn0Var, Object obj) {
        if (((go0) interfaceC0596px).f3613S || !t11.m5086l(((go0) interfaceC0596px).m1956L(), obj)) {
            go0 go0Var = (go0) interfaceC0596px;
            go0Var.m1981f0(obj);
            go0Var.m1972b(mn0Var, obj);
        }
    }
}
