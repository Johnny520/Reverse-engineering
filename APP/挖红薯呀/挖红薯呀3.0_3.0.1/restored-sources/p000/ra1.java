package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 implements u60, Serializable {

    /* JADX INFO: renamed from: d */
    public InterfaceC0298hw f5344d;

    /* JADX INFO: renamed from: e */
    public Object f5345e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.u60
    public final Object getValue() {
        if (this.f5345e == C0496n2.f4143W) {
            InterfaceC0298hw interfaceC0298hw = this.f5344d;
            interfaceC0298hw.getClass();
            this.f5345e = interfaceC0298hw.invoke();
            this.f5344d = null;
        }
        return this.f5345e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f5345e != C0496n2.f4143W ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
