package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 implements u60, Serializable {

    /* JADX INFO: renamed from: d */
    public InterfaceC0298hw f7270d;

    /* JADX INFO: renamed from: e */
    public volatile Object f7271e;

    /* JADX INFO: renamed from: f */
    public final Object f7272f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x51(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.getClass();
        this.f7270d = interfaceC0298hw;
        this.f7271e = C0496n2.f4143W;
        this.f7272f = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.u60
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f7271e;
        C0496n2 c0496n2 = C0496n2.f4143W;
        if (obj != c0496n2) {
            return obj;
        }
        synchronized (this.f7272f) {
            objInvoke = this.f7271e;
            if (objInvoke == c0496n2) {
                InterfaceC0298hw interfaceC0298hw = this.f7270d;
                interfaceC0298hw.getClass();
                objInvoke = interfaceC0298hw.invoke();
                this.f7271e = objInvoke;
                this.f7270d = null;
            }
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f7271e != C0496n2.f4143W ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
