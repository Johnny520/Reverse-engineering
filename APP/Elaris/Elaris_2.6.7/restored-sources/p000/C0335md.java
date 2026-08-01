package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: md */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0335md implements InterfaceC0200e9, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0279j5 f577a;

    /* JADX INFO: renamed from: b */
    public volatile Object f578b;

    /* JADX INFO: renamed from: c */
    public final Object f579c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0335md(InterfaceC0279j5 interfaceC0279j5) {
        interfaceC0279j5.getClass();
        this.f577a = interfaceC0279j5;
        this.f578b = C0022b5.f59c;
        this.f579c = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0200e9
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f578b;
        C0022b5 c0022b5 = C0022b5.f59c;
        if (obj != c0022b5) {
            return obj;
        }
        synchronized (this.f579c) {
            objInvoke = this.f578b;
            if (objInvoke == c0022b5) {
                InterfaceC0279j5 interfaceC0279j5 = this.f577a;
                interfaceC0279j5.getClass();
                objInvoke = interfaceC0279j5.invoke();
                this.f578b = objInvoke;
                this.f577a = null;
            }
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f578b != C0022b5.f59c ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
