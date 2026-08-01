package p172l8;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: l8.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4702j0 implements InterfaceC4705l, Serializable {

    /* JADX INFO: renamed from: q */
    public InterfaceC0173a f13917q;

    /* JADX INFO: renamed from: r */
    public Object f13918r;

    public C4702j0(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        this.f13917q = interfaceC0173a;
        this.f13918r = C4692e0.f13903a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C4697h(getValue());
    }

    @Override // p172l8.InterfaceC4705l
    /* JADX INFO: renamed from: a */
    public boolean mo18779a() {
        return this.f13918r != C4692e0.f13903a;
    }

    @Override // p172l8.InterfaceC4705l
    public Object getValue() {
        if (this.f13918r == C4692e0.f13903a) {
            InterfaceC0173a interfaceC0173a = this.f13917q;
            interfaceC0173a.getClass();
            this.f13918r = interfaceC0173a.invoke();
            this.f13917q = null;
        }
        return this.f13918r;
    }

    public String toString() {
        return mo18779a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
