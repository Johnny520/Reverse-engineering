package p077f6;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2300b implements InterfaceC2332r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f6299a;

    public C2300b(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        this.f6299a = interfaceC0184l;
    }

    @Override // p077f6.InterfaceC2332r
    /* JADX INFO: renamed from: a */
    public InterfaceC0184l mo8422a() {
        return this.f6299a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2300b.class != obj.getClass()) {
            return false;
        }
        return AbstractC1061t.m3842c(mo8422a(), ((C2300b) obj).mo8422a());
    }

    public int hashCode() {
        return mo8422a().hashCode();
    }
}
