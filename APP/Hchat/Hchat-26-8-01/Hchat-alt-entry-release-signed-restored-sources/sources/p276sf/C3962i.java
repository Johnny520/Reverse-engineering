package p276sf;

import java.io.Serializable;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: sf.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3962i implements InterfaceC3956c, Serializable {

    /* JADX INFO: renamed from: g */
    public InterfaceC1220a f12968g;

    /* JADX INFO: renamed from: h */
    public volatile Object f12969h;

    /* JADX INFO: renamed from: i */
    public final Object f12970i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3962i(InterfaceC1220a interfaceC1220a) {
        interfaceC1220a.getClass();
        this.f12968g = interfaceC1220a;
        this.f12969h = C3966m.f12975a;
        this.f12970i = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p276sf.InterfaceC3956c
    /* JADX INFO: renamed from: a */
    public final boolean mo8178a() {
        return this.f12969h != C3966m.f12975a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p276sf.InterfaceC3956c
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f12969h;
        C3966m c3966m = C3966m.f12975a;
        if (obj != c3966m) {
            return obj;
        }
        synchronized (this.f12970i) {
            objInvoke = this.f12969h;
            if (objInvoke == c3966m) {
                InterfaceC1220a interfaceC1220a = this.f12968g;
                interfaceC1220a.getClass();
                objInvoke = interfaceC1220a.invoke();
                this.f12969h = objInvoke;
                this.f12968g = null;
            }
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return mo8178a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
