package p009E0;

import java.io.Serializable;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: E0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0106f implements InterfaceC0101a, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0193a f397a;

    /* JADX INFO: renamed from: b */
    public volatile Object f398b = C0108h.f403a;

    /* JADX INFO: renamed from: c */
    public final Object f399c = this;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0106f(InterfaceC0193a interfaceC0193a) {
        this.f397a = interfaceC0193a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m247a() {
        Object objMo7b;
        Object obj = this.f398b;
        C0108h c0108h = C0108h.f403a;
        if (obj != c0108h) {
            return obj;
        }
        synchronized (this.f399c) {
            objMo7b = this.f398b;
            if (objMo7b == c0108h) {
                InterfaceC0193a interfaceC0193a = this.f397a;
                AbstractC0223g.m415b(interfaceC0193a);
                objMo7b = interfaceC0193a.mo7b();
                this.f398b = objMo7b;
                this.f397a = null;
            }
        }
        return objMo7b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f398b != C0108h.f403a ? String.valueOf(m247a()) : "Lazy value not initialized yet.";
    }
}
