package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fb2 implements eq2 {

    /* JADX INFO: renamed from: a */
    public final x10 f2894a;

    /* JADX INFO: renamed from: b */
    public final x10 f2895b;

    /* JADX INFO: renamed from: c */
    public final x10 f2896c;

    /* JADX INFO: renamed from: d */
    public final x10 f2897d;

    public fb2(x10 x10Var, x10 x10Var2, x10 x10Var3, x10 x10Var4) {
        this.f2894a = x10Var;
        this.f2895b = x10Var2;
        this.f2896c = x10Var3;
        this.f2897d = x10Var4;
    }

    @Override // p000.eq2
    /* JADX INFO: renamed from: a */
    public final AbstractC0731te mo248a(long j, d61 d61Var, e70 e70Var) {
        float fMo122a = this.f2894a.mo122a(j, e70Var);
        float fMo122a2 = this.f2895b.mo122a(j, e70Var);
        float fMo122a3 = this.f2896c.mo122a(j, e70Var);
        float fMo122a4 = this.f2897d.mo122a(j, e70Var);
        float fM2020b = gr2.m2020b(j);
        float f = fMo122a + fMo122a4;
        if (f > fM2020b) {
            float f2 = fM2020b / f;
            fMo122a *= f2;
            fMo122a4 *= f2;
        }
        float f3 = fMo122a2 + fMo122a3;
        if (f3 > fM2020b) {
            float f4 = fM2020b / f3;
            fMo122a2 *= f4;
            fMo122a3 *= f4;
        }
        if (fMo122a < 0.0f || fMo122a2 < 0.0f || fMo122a3 < 0.0f || fMo122a4 < 0.0f) {
            nz0.m3456a("Corner size in Px can't be negative(topStart = " + fMo122a + ", topEnd = " + fMo122a2 + ", bottomEnd = " + fMo122a3 + ", bottomStart = " + fMo122a4 + ")!");
        }
        if (fMo122a + fMo122a2 + fMo122a3 + fMo122a4 == 0.0f) {
            return new tv1(AbstractC0179eu.m1467q(0L, j));
        }
        o62 o62VarM1467q = AbstractC0179eu.m1467q(0L, j);
        d61 d61Var2 = d61.f1885h;
        float f5 = d61Var == d61Var2 ? fMo122a : fMo122a2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (d61Var == d61Var2) {
            fMo122a = fMo122a2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo122a)) << 32) | (((long) Float.floatToRawIntBits(fMo122a)) & 4294967295L);
        float f6 = d61Var == d61Var2 ? fMo122a3 : fMo122a4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (d61Var != d61Var2) {
            fMo122a4 = fMo122a3;
        }
        return new uv1(new db2(o62VarM1467q.f7536a, o62VarM1467q.f7537b, o62VarM1467q.f7538c, o62VarM1467q.f7539d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo122a4)) << 32) | (((long) Float.floatToRawIntBits(fMo122a4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb2)) {
            return false;
        }
        fb2 fb2Var = (fb2) obj;
        return this.f2894a.equals(fb2Var.f2894a) && this.f2895b.equals(fb2Var.f2895b) && this.f2896c.equals(fb2Var.f2896c) && this.f2897d.equals(fb2Var.f2897d);
    }

    public final int hashCode() {
        return this.f2897d.hashCode() + ((this.f2896c.hashCode() + ((this.f2895b.hashCode() + (this.f2894a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f2894a + ", topEnd = " + this.f2895b + ", bottomEnd = " + this.f2896c + ", bottomStart = " + this.f2897d + ')';
    }
}
