package p228p8;

import java.io.Serializable;
import p010a9.InterfaceC0188p;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: p8.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5981k implements InterfaceC5980j, Serializable {

    /* JADX INFO: renamed from: q */
    public static final C5981k f18917q = new C5981k();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return f18917q;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        cVar.getClass();
        return this;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        interfaceC5980j.getClass();
        return interfaceC5980j;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        cVar.getClass();
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        return obj;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
