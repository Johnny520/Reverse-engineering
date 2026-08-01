package p000;

import java.util.Map;

/* JADX INFO: renamed from: f7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0199f7 {

    /* JADX INFO: renamed from: a */
    public static final o31 f1613a = s91.m4028O(0.0f, 0.0f, null, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Map map = xc1.f7330a;
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final w31 m1042a(float f, o31 o31Var, InterfaceC0356ji interfaceC0356ji) {
        o31 o31Var2;
        Float fValueOf = Float.valueOf(0.01f);
        if (o31Var == f1613a) {
            C0616pi c0616pi = (C0616pi) interfaceC0356ji;
            c0616pi.m3090W(1144089983);
            boolean zM3098c = c0616pi.m3098c(0.01f);
            Object objM3080L = c0616pi.m3080L();
            if (zM3098c || objM3080L == C0320ii.f2572a) {
                objM3080L = s91.m4028O(0.0f, 0.0f, fValueOf, 3);
                c0616pi.m3107g0(objM3080L);
            }
            c0616pi.m3119p(false);
            o31Var2 = (o31) objM3080L;
        } else {
            C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
            c0616pi2.m3090W(1144199909);
            c0616pi2.m3119p(false);
            o31Var2 = o31Var;
        }
        return m1043b(Float.valueOf(f), AbstractC0398kl.f3213x, o31Var2, fValueOf, "FloatAnimation", interfaceC0356ji, 0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final w31 m1043b(Object obj, q91 q91Var, InterfaceC0830v7 interfaceC0830v7, Float f, String str, InterfaceC0356ji interfaceC0356ji, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        Object objM3080L = c0616pi.m3080L();
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (objM3080L == c0675r3) {
            objM3080L = r60.m3419u(null);
            c0616pi.m3107g0(objM3080L);
        }
        oh0 oh0Var = (oh0) objM3080L;
        Object objM3080L2 = c0616pi.m3080L();
        if (objM3080L2 == c0675r3) {
            objM3080L2 = new C0045b7(obj, q91Var, f);
            c0616pi.m3107g0(objM3080L2);
        }
        C0045b7 c0045b7 = (C0045b7) objM3080L2;
        oh0 oh0VarM3424z = r60.m3424z(null, c0616pi);
        if (f != null && (interfaceC0830v7 instanceof o31)) {
            o31 o31Var = (o31) interfaceC0830v7;
            if (!p30.m3002l(o31Var.f4459c, f)) {
                interfaceC0830v7 = new o31(o31Var.f4457a, o31Var.f4458b, f);
            }
        }
        oh0 oh0VarM3424z2 = r60.m3424z(interfaceC0830v7, c0616pi);
        Object objM3080L3 = c0616pi.m3080L();
        if (objM3080L3 == c0675r3) {
            objM3080L3 = o30.m2765e(-1, 6, null);
            c0616pi.m3107g0(objM3080L3);
        }
        InterfaceC0470md interfaceC0470md = (InterfaceC0470md) objM3080L3;
        boolean zM3108h = c0616pi.m3108h(interfaceC0470md) | c0616pi.m3108h(obj);
        Object objM3080L4 = c0616pi.m3080L();
        if (zM3108h || objM3080L4 == c0675r3) {
            objM3080L4 = new C0081c7(0, interfaceC0470md, obj);
            c0616pi.m3107g0(objM3080L4);
        }
        s91.m4040e((InterfaceC0298hw) objM3080L4, c0616pi);
        boolean zM3108h2 = c0616pi.m3108h(interfaceC0470md) | c0616pi.m3108h(c0045b7) | c0616pi.m3104f(oh0VarM3424z2) | c0616pi.m3104f(oh0VarM3424z);
        Object objM3080L5 = c0616pi.m3080L();
        if (zM3108h2 || objM3080L5 == c0675r3) {
            C0162e7 c0162e7 = new C0162e7(interfaceC0470md, c0045b7, oh0VarM3424z2, oh0VarM3424z, null);
            c0616pi.m3107g0(c0162e7);
            objM3080L5 = c0162e7;
        }
        s91.m4039d(c0616pi, (InterfaceC0904ww) objM3080L5, interfaceC0470md);
        w31 w31Var = (w31) oh0Var.getValue();
        return w31Var == null ? c0045b7.f432c : w31Var;
    }
}
