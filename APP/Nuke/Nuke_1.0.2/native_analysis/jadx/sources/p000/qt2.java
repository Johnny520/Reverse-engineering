package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qt2 implements fj0 {

    /* JADX INFO: renamed from: a */
    public final float f9163a;

    /* JADX INFO: renamed from: b */
    public final float f9164b;

    /* JADX INFO: renamed from: c */
    public final Object f9165c;

    public qt2(float f, float f2, Object obj) {
        this.f9163a = f;
        this.f9164b = f2;
        this.f9165c = obj;
    }

    @Override // p000.InterfaceC0273hd
    /* JADX INFO: renamed from: a */
    public final x93 mo512a(n43 n43Var) {
        Object obj = this.f9165c;
        return new hh1(this.f9163a, this.f9164b, obj == null ? null : (AbstractC0494nd) n43Var.f7004a.mo5j(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qt2) {
            qt2 qt2Var = (qt2) obj;
            if (qt2Var.f9163a == this.f9163a && qt2Var.f9164b == this.f9164b && t11.m5086l(qt2Var.f9165c, this.f9165c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9165c;
        return Float.hashCode(this.f9164b) + vi0.m5684c(this.f9163a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ qt2(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
