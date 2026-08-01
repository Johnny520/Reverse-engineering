package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b91 {

    /* JADX INFO: renamed from: a */
    public final C0111d f459a;

    /* JADX INFO: renamed from: b */
    public final b91 f460b;

    /* JADX INFO: renamed from: c */
    public final String f461c;

    /* JADX INFO: renamed from: d */
    public final gp0 f462d = r60.m3419u(m328c());

    /* JADX INFO: renamed from: e */
    public final gp0 f463e = r60.m3419u(new x81(m328c(), m328c()));

    /* JADX INFO: renamed from: f */
    public final ep0 f464f = new ep0(0);

    /* JADX INFO: renamed from: g */
    public final ep0 f465g = new ep0(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public final gp0 f466h;

    /* JADX INFO: renamed from: i */
    public final c31 f467i;

    /* JADX INFO: renamed from: j */
    public final c31 f468j;

    /* JADX INFO: renamed from: k */
    public final gp0 f469k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b91(C0111d c0111d, b91 b91Var, String str) {
        this.f459a = c0111d;
        this.f460b = b91Var;
        this.f461c = str;
        Boolean bool = Boolean.FALSE;
        this.f466h = r60.m3419u(bool);
        this.f467i = new c31();
        this.f468j = new c31();
        this.f469k = r60.m3419u(bool);
        r60.m3411m(new u81(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m326a(Boolean bool, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c0616pi.m3104f(bool) : c0616pi.m3108h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3104f(this) ? 32 : 16;
        }
        int i3 = 0;
        if (c0616pi.m3082O(i2 & 1, (i2 & 19) != 18)) {
            if (m332g()) {
                c0616pi.m3090W(416369985);
            } else {
                c0616pi.m3090W(466062241);
                m336k(bool);
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object objM3080L = c0616pi.m3080L();
                C0675r3 c0675r3 = C0320ii.f2572a;
                if (z || objM3080L == c0675r3) {
                    objM3080L = r60.m3411m(new u81(this, i3));
                    c0616pi.m3107g0(objM3080L);
                }
                if (((Boolean) ((w31) objM3080L).getValue()).booleanValue()) {
                    c0616pi.m3090W(466470356);
                    Object objM3080L2 = c0616pi.m3080L();
                    if (objM3080L2 == c0675r3) {
                        objM3080L2 = s91.m4054s(c0616pi);
                        c0616pi.m3107g0(objM3080L2);
                    }
                    InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) objM3080L2;
                    boolean zM3108h = c0616pi.m3108h(interfaceC0966yk) | (i4 == 32);
                    Object objM3080L3 = c0616pi.m3080L();
                    if (zM3108h || objM3080L3 == c0675r3) {
                        objM3080L3 = new C0073c(20, interfaceC0966yk, this);
                        c0616pi.m3107g0(objM3080L3);
                    }
                    InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) objM3080L3;
                    boolean zM3104f = c0616pi.m3104f(interfaceC0966yk) | c0616pi.m3104f(this);
                    Object objM3080L4 = c0616pi.m3080L();
                    if (zM3104f || objM3080L4 == c0675r3) {
                        objM3080L4 = new C0481mo(interfaceC0742sw);
                        c0616pi.m3107g0(objM3080L4);
                    }
                } else {
                    c0616pi.m3090W(416369985);
                }
                c0616pi.m3119p(false);
            }
            c0616pi.m3119p(false);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0355jh(i, 7, this, bool);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m327b() {
        c31 c31Var = this.f467i;
        int size = c31Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((y81) c31Var.get(i)).f7578m.m951g());
        }
        c31 c31Var2 = this.f468j;
        int size2 = c31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((b91) c31Var2.get(i2)).m327b());
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m328c() {
        return ((gp0) this.f459a.f920f).getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m329d() {
        c31 c31Var = this.f467i;
        int size = c31Var.size();
        for (int i = 0; i < size; i++) {
            ((y81) c31Var.get(i)).getClass();
        }
        c31 c31Var2 = this.f468j;
        int size2 = c31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((b91) c31Var2.get(i2)).m329d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m330e() {
        b91 b91Var = this.f460b;
        return b91Var != null ? b91Var.m330e() : this.f464f.m951g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final x81 m331f() {
        return (x81) this.f463e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m332g() {
        return ((Boolean) this.f469k.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m333h(long j, boolean z) {
        C0111d c0111d = this.f459a;
        gp0 gp0Var = (gp0) c0111d.f919e;
        ep0 ep0Var = this.f465g;
        if (ep0Var.m951g() == Long.MIN_VALUE) {
            ep0Var.m952h(j);
            ((gp0) c0111d.f919e).setValue(Boolean.TRUE);
        } else if (!((Boolean) gp0Var.getValue()).booleanValue()) {
            gp0Var.setValue(Boolean.TRUE);
        }
        this.f466h.setValue(Boolean.FALSE);
        c31 c31Var = this.f467i;
        int size = c31Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            y81 y81Var = (y81) c31Var.get(i);
            gp0 gp0Var2 = y81Var.f7573h;
            gp0 gp0Var3 = y81Var.f7573h;
            if (!((Boolean) gp0Var2.getValue()).booleanValue()) {
                long jMo2025c = z ? y81Var.m5217a().mo2025c() : j;
                y81Var.f7576k.setValue(y81Var.m5217a().mo2024b(jMo2025c));
                y81Var.f7577l = y81Var.m5217a().mo2028f(jMo2025c);
                if (y81Var.m5217a().m3207g(jMo2025c)) {
                    gp0Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) gp0Var3.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        c31 c31Var2 = this.f468j;
        int size2 = c31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b91 b91Var = (b91) c31Var2.get(i2);
            if (!p30.m3002l(b91Var.f462d.getValue(), b91Var.m328c())) {
                b91Var.m333h(j, z);
            }
            if (!p30.m3002l(b91Var.f462d.getValue(), b91Var.m328c())) {
                z2 = false;
            }
        }
        if (z2) {
            m334i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m334i() {
        this.f465g.m952h(Long.MIN_VALUE);
        Object value = this.f462d.getValue();
        C0111d c0111d = this.f459a;
        ((gp0) c0111d.f920f).setValue(value);
        if (this.f460b == null) {
            this.f464f.m952h(0L);
        }
        ((gp0) c0111d.f919e).setValue(Boolean.FALSE);
        c31 c31Var = this.f468j;
        int size = c31Var.size();
        for (int i = 0; i < size; i++) {
            ((b91) c31Var.get(i)).m334i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m335j(Object obj, Object obj2) {
        this.f465g.m952h(Long.MIN_VALUE);
        C0111d c0111d = this.f459a;
        ((gp0) c0111d.f919e).setValue(Boolean.FALSE);
        boolean zM332g = m332g();
        gp0 gp0Var = this.f462d;
        if (!zM332g || !p30.m3002l(m328c(), obj) || !p30.m3002l(gp0Var.getValue(), obj2)) {
            if (!p30.m3002l(m328c(), obj)) {
                ((gp0) c0111d.f920f).setValue(obj);
            }
            gp0Var.setValue(obj2);
            this.f469k.setValue(Boolean.TRUE);
            this.f463e.setValue(new x81(obj, obj2));
        }
        c31 c31Var = this.f468j;
        int size = c31Var.size();
        for (int i = 0; i < size; i++) {
            b91 b91Var = (b91) c31Var.get(i);
            b91Var.getClass();
            if (b91Var.m332g()) {
                b91Var.m335j(b91Var.m328c(), b91Var.f462d.getValue());
            }
        }
        c31 c31Var2 = this.f467i;
        int size2 = c31Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((y81) c31Var2.get(i2)).m5219c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m336k(Object obj) {
        gp0 gp0Var = this.f462d;
        if (p30.m3002l(gp0Var.getValue(), obj)) {
            return;
        }
        this.f463e.setValue(new x81(gp0Var.getValue(), obj));
        if (!p30.m3002l(m328c(), gp0Var.getValue())) {
            ((gp0) this.f459a.f920f).setValue(gp0Var.getValue());
        }
        gp0Var.setValue(obj);
        if (this.f465g.m951g() == Long.MIN_VALUE) {
            this.f466h.setValue(Boolean.TRUE);
        }
        c31 c31Var = this.f467i;
        int size = c31Var.size();
        for (int i = 0; i < size; i++) {
            ((y81) c31Var.get(i)).f7574i.m597h(-2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        c31 c31Var = this.f467i;
        int size = c31Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((y81) c31Var.get(i)) + ", ";
        }
        return str;
    }
}
