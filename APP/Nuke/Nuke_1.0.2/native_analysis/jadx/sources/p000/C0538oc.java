package p000;

/* JADX INFO: renamed from: oc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0538oc implements vd3 {

    /* JADX INFO: renamed from: a */
    public final int f7620a;

    /* JADX INFO: renamed from: b */
    public final String f7621b;

    /* JADX INFO: renamed from: c */
    public final nx1 f7622c = op0.m3598u(zz0.f14156e);

    /* JADX INFO: renamed from: d */
    public final nx1 f7623d = op0.m3598u(Boolean.TRUE);

    public C0538oc(String str, int i) {
        this.f7620a = i;
        this.f7621b = str;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: a */
    public final int mo2197a(pf1 pf1Var, d61 d61Var) {
        return m3553e().f14157a;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: b */
    public final int mo2198b(pf1 pf1Var) {
        return m3553e().f14158b;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: c */
    public final int mo2199c(pf1 pf1Var, d61 d61Var) {
        return m3553e().f14159c;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: d */
    public final int mo2200d(pf1 pf1Var) {
        return m3553e().f14160d;
    }

    /* JADX INFO: renamed from: e */
    public final zz0 m3553e() {
        return (zz0) this.f7622c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0538oc) {
            return this.f7620a == ((C0538oc) obj).f7620a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m3554f(boolean z) {
        this.f7623d.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final void m3555g(cf3 cf3Var, int i) {
        int i2 = this.f7620a;
        if (i == 0 || (i & i2) != 0) {
            this.f7622c.setValue(cf3Var.f1518a.mo4165i(i2));
            m3554f(cf3Var.f1518a.mo4172u(i2));
        }
    }

    public final int hashCode() {
        return this.f7620a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7621b);
        sb.append('(');
        sb.append(m3553e().f14157a);
        sb.append(", ");
        sb.append(m3553e().f14158b);
        sb.append(", ");
        sb.append(m3553e().f14159c);
        sb.append(", ");
        return vi0.m5694m(sb, m3553e().f14160d, ')');
    }
}
