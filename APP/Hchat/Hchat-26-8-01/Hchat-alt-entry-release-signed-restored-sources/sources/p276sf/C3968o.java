package p276sf;

import java.io.Serializable;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: sf.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3968o implements InterfaceC3956c, Serializable {

    /* JADX INFO: renamed from: g */
    public InterfaceC1220a f12977g;

    /* JADX INFO: renamed from: h */
    public Object f12978h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p276sf.InterfaceC3956c
    /* JADX INFO: renamed from: a */
    public final boolean mo8178a() {
        return this.f12978h != C3966m.f12975a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p276sf.InterfaceC3956c
    public final Object getValue() {
        if (this.f12978h == C3966m.f12975a) {
            InterfaceC1220a interfaceC1220a = this.f12977g;
            interfaceC1220a.getClass();
            this.f12978h = interfaceC1220a.invoke();
            this.f12977g = null;
        }
        return this.f12978h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return mo8178a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
