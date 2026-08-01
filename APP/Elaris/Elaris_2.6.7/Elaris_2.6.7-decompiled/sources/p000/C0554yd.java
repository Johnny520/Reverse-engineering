package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: yd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0554yd implements InterfaceC0200e9, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0279j5 f1113a;

    /* JADX INFO: renamed from: b */
    public Object f1114b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0200e9
    public final Object getValue() {
        if (this.f1114b == C0022b5.f59c) {
            InterfaceC0279j5 interfaceC0279j5 = this.f1113a;
            interfaceC0279j5.getClass();
            this.f1114b = interfaceC0279j5.invoke();
            this.f1113a = null;
        }
        return this.f1114b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f1114b != C0022b5.f59c ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
