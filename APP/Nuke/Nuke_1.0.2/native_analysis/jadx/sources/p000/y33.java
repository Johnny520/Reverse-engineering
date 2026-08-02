package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y33 {

    /* JADX INFO: renamed from: a */
    public final yk1 f13289a;

    /* JADX INFO: renamed from: b */
    public final y33 f13290b;

    /* JADX INFO: renamed from: c */
    public final String f13291c;

    /* JADX INFO: renamed from: d */
    public final nx1 f13292d = op0.m3598u(m6213c());

    /* JADX INFO: renamed from: e */
    public final nx1 f13293e = op0.m3598u(new v33(m6213c(), m6213c()));

    /* JADX INFO: renamed from: f */
    public final lx1 f13294f = new lx1(0);

    /* JADX INFO: renamed from: g */
    public final lx1 f13295g = new lx1(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public final nx1 f13296h;

    /* JADX INFO: renamed from: i */
    public final ps2 f13297i;

    /* JADX INFO: renamed from: j */
    public final ps2 f13298j;

    /* JADX INFO: renamed from: k */
    public final nx1 f13299k;

    public y33(yk1 yk1Var, y33 y33Var, String str) {
        this.f13289a = yk1Var;
        this.f13290b = y33Var;
        this.f13291c = str;
        Boolean bool = Boolean.FALSE;
        this.f13296h = op0.m3598u(bool);
        this.f13297i = new ps2();
        this.f13298j = new ps2();
        this.f13299k = op0.m3598u(bool);
        op0.m3590m(new s33(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public final void m6211a(Object obj, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1493585151);
        int i2 = 4;
        int i3 = (go0Var.m1980f(obj) ? 4 : 2) | i | (go0Var.m1980f(this) ? 32 : 16);
        int i4 = 0;
        if (!go0Var.m1958O(i3 & 1, (i3 & 19) != 18)) {
            go0Var.m1961R();
        } else if (m6217g()) {
            go0Var.m1966W(467722849);
            go0Var.m1994p(false);
        } else {
            go0Var.m1966W(466062241);
            m6221k(obj);
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z || objM1956L == c0160eb) {
                objM1956L = op0.m3590m(new s33(this, i4));
                go0Var.m1981f0(objM1956L);
            }
            if (((Boolean) ((gu2) objM1956L).getValue()).booleanValue()) {
                go0Var.m1966W(466470356);
                Object objM1956L2 = go0Var.m1956L();
                if (objM1956L2 == c0160eb) {
                    objM1956L2 = AbstractC0179eu.m1422C(go0Var);
                    go0Var.m1981f0(objM1956L2);
                }
                j20 j20Var = (j20) objM1956L2;
                boolean zM1984h = go0Var.m1984h(j20Var) | (i5 == 32);
                Object objM1956L3 = go0Var.m1956L();
                if (zM1984h || objM1956L3 == c0160eb) {
                    objM1956L3 = new d62(i2, j20Var, this);
                    go0Var.m1981f0(objM1956L3);
                }
                AbstractC0179eu.m1452d(j20Var, this, (in0) objM1956L3, go0Var);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(467712929);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(false);
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0016af(i, 22, this, obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m6212b() {
        ps2 ps2Var = this.f13297i;
        int size = ps2Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((w33) ps2Var.get(i)).f12309q.m2984g());
        }
        ps2 ps2Var2 = this.f13298j;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((y33) ps2Var2.get(i2)).m6212b());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: c */
    public final Object m6213c() {
        return this.f13289a.f13500b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6214d() {
        ps2 ps2Var = this.f13297i;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            ((w33) ps2Var.get(i)).getClass();
        }
        ps2 ps2Var2 = this.f13298j;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((y33) ps2Var2.get(i2)).m6214d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final long m6215e() {
        y33 y33Var = this.f13290b;
        return y33Var != null ? y33Var.m6215e() : this.f13294f.m2984g();
    }

    /* JADX INFO: renamed from: f */
    public final v33 m6216f() {
        return (v33) this.f13293e.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6217g() {
        return ((Boolean) this.f13299k.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m6218h(long j, boolean z) {
        yk1 yk1Var = this.f13289a;
        nx1 nx1Var = yk1Var.f13499a;
        lx1 lx1Var = this.f13295g;
        if (lx1Var.m2984g() == Long.MIN_VALUE) {
            lx1Var.m2985h(j);
            yk1Var.f13499a.setValue(Boolean.TRUE);
        } else if (!((Boolean) nx1Var.getValue()).booleanValue()) {
            nx1Var.setValue(Boolean.TRUE);
        }
        this.f13296h.setValue(Boolean.FALSE);
        ps2 ps2Var = this.f13297i;
        int size = ps2Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            w33 w33Var = (w33) ps2Var.get(i);
            nx1 nx1Var2 = w33Var.f12304l;
            nx1 nx1Var3 = w33Var.f12304l;
            if (!((Boolean) nx1Var2.getValue()).booleanValue()) {
                long jMo916c = z ? w33Var.m5832a().mo916c() : j;
                w33Var.f12307o.setValue(w33Var.m5832a().mo915b(jMo916c));
                w33Var.f12308p = w33Var.m5832a().mo919f(jMo916c);
                if (w33Var.m5832a().m1335g(jMo916c)) {
                    nx1Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) nx1Var3.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        ps2 ps2Var2 = this.f13298j;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            y33 y33Var = (y33) ps2Var2.get(i2);
            if (!t11.m5086l(y33Var.f13292d.getValue(), y33Var.m6213c())) {
                y33Var.m6218h(j, z);
            }
            if (!t11.m5086l(y33Var.f13292d.getValue(), y33Var.m6213c())) {
                z2 = false;
            }
        }
        if (z2) {
            m6219i();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6219i() {
        this.f13295g.m2985h(Long.MIN_VALUE);
        Object value = this.f13292d.getValue();
        yk1 yk1Var = this.f13289a;
        yk1Var.f13500b.setValue(value);
        if (this.f13290b == null) {
            this.f13294f.m2985h(0L);
        }
        yk1Var.f13499a.setValue(Boolean.FALSE);
        ps2 ps2Var = this.f13298j;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            ((y33) ps2Var.get(i)).m6219i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6220j(Object obj, Object obj2) {
        this.f13295g.m2985h(Long.MIN_VALUE);
        yk1 yk1Var = this.f13289a;
        yk1Var.f13499a.setValue(Boolean.FALSE);
        boolean zM6217g = m6217g();
        nx1 nx1Var = this.f13292d;
        if (!zM6217g || !t11.m5086l(m6213c(), obj) || !t11.m5086l(nx1Var.getValue(), obj2)) {
            if (!t11.m5086l(m6213c(), obj)) {
                yk1Var.f13500b.setValue(obj);
            }
            nx1Var.setValue(obj2);
            this.f13299k.setValue(Boolean.TRUE);
            this.f13293e.setValue(new v33(obj, obj2));
        }
        ps2 ps2Var = this.f13298j;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            y33 y33Var = (y33) ps2Var.get(i);
            y33Var.getClass();
            if (y33Var.m6217g()) {
                y33Var.m6220j(y33Var.m6213c(), y33Var.f13292d.getValue());
            }
        }
        ps2 ps2Var2 = this.f13297i;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((w33) ps2Var2.get(i2)).m5834c();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6221k(Object obj) {
        nx1 nx1Var = this.f13292d;
        if (t11.m5086l(nx1Var.getValue(), obj)) {
            return;
        }
        this.f13293e.setValue(new v33(nx1Var.getValue(), obj));
        if (!t11.m5086l(m6213c(), nx1Var.getValue())) {
            this.f13289a.f13500b.setValue(nx1Var.getValue());
        }
        nx1Var.setValue(obj);
        if (this.f13295g.m2984g() == Long.MIN_VALUE) {
            this.f13296h.setValue(Boolean.TRUE);
        }
        ps2 ps2Var = this.f13297i;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            ((w33) ps2Var.get(i)).f12305m.m2592h(-2.0f);
        }
    }

    public final String toString() {
        ps2 ps2Var = this.f13297i;
        int size = ps2Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((w33) ps2Var.get(i)) + ", ";
        }
        return str;
    }
}
