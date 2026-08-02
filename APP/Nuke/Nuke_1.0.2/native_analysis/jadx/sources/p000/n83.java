package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n83 implements j71, Serializable {

    /* JADX INFO: renamed from: h */
    public xm0 f7054h;

    /* JADX INFO: renamed from: i */
    public Object f7055i;

    @Override // p000.j71
    public final Object getValue() {
        if (this.f7055i == C0700sn.f10218V) {
            xm0 xm0Var = this.f7054h;
            xm0Var.getClass();
            this.f7055i = xm0Var.mo6a();
            this.f7054h = null;
        }
        return this.f7055i;
    }

    public final String toString() {
        return this.f7055i != C0700sn.f10218V ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
