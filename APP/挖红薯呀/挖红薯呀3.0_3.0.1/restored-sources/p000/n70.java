package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class n70 {

    /* JADX INFO: renamed from: a */
    public final ww0 f4201a;

    /* JADX INFO: renamed from: b */
    public final q70 f4202b;

    /* JADX INFO: renamed from: c */
    public final jh0 f4203c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n70(ww0 ww0Var, q70 q70Var) {
        this.f4201a = ww0Var;
        this.f4202b = q70Var;
        long[] jArr = dy0.f1212a;
        this.f4203c = new jh0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC0904ww m2634a(int i, Object obj, Object obj2) {
        jh0 jh0Var = this.f4203c;
        m70 m70Var = (m70) jh0Var.m1701g(obj);
        int i2 = 4;
        if (m70Var != null && m70Var.f3854c == i && p30.m3002l(m70Var.f3853b, obj2)) {
            C0474mh c0474mh = m70Var.f3855d;
            if (c0474mh != null) {
                return c0474mh;
            }
            C0474mh c0474mh2 = new C0474mh(818252804, true, new C0168ed(i2, m70Var.f3856e, m70Var));
            m70Var.f3855d = c0474mh2;
            return c0474mh2;
        }
        m70 m70Var2 = new m70(this, i, obj, obj2);
        jh0Var.m1707m(obj, m70Var2);
        C0474mh c0474mh3 = m70Var2.f3855d;
        if (c0474mh3 != null) {
            return c0474mh3;
        }
        C0474mh c0474mh4 = new C0474mh(818252804, true, new C0168ed(i2, this, m70Var2));
        m70Var2.f3855d = c0474mh4;
        return c0474mh4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m2635b(Object obj) {
        if (obj == null) {
            return null;
        }
        m70 m70Var = (m70) this.f4203c.m1701g(obj);
        if (m70Var != null) {
            return m70Var.f3853b;
        }
        o70 o70Var = (o70) this.f4202b.invoke();
        int iMo2795e = o70Var.mo2795e(obj);
        if (iMo2795e != -1) {
            return o70Var.mo2794d(iMo2795e);
        }
        return null;
    }
}
