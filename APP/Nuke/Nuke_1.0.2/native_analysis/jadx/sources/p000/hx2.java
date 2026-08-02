package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hx2 implements j71, Serializable {

    /* JADX INFO: renamed from: h */
    public xm0 f4168h;

    /* JADX INFO: renamed from: i */
    public volatile Object f4169i;

    /* JADX INFO: renamed from: j */
    public final Object f4170j;

    public hx2(xm0 xm0Var) {
        xm0Var.getClass();
        this.f4168h = xm0Var;
        this.f4169i = C0700sn.f10218V;
        this.f4170j = this;
    }

    @Override // p000.j71
    public final Object getValue() {
        Object objMo6a;
        Object obj = this.f4169i;
        C0700sn c0700sn = C0700sn.f10218V;
        if (obj != c0700sn) {
            return obj;
        }
        synchronized (this.f4170j) {
            objMo6a = this.f4169i;
            if (objMo6a == c0700sn) {
                xm0 xm0Var = this.f4168h;
                xm0Var.getClass();
                objMo6a = xm0Var.mo6a();
                this.f4169i = objMo6a;
                this.f4168h = null;
            }
        }
        return objMo6a;
    }

    public final String toString() {
        return this.f4169i != C0700sn.f10218V ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
