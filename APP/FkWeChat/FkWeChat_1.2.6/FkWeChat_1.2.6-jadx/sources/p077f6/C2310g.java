package p077f6;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f6.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2310g implements InterfaceC2301b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p f6318a;

    public C2310g(InterfaceC0188p interfaceC0188p) {
        this.f6318a = interfaceC0188p;
    }

    @Override // p077f6.InterfaceC2301b0
    /* JADX INFO: renamed from: a */
    public InterfaceC0188p mo8423a() {
        return this.f6318a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2310g.class != obj.getClass()) {
            return false;
        }
        return AbstractC1061t.m3842c(mo8423a(), ((C2310g) obj).mo8423a());
    }

    public int hashCode() {
        InterfaceC0188p interfaceC0188pMo8423a = mo8423a();
        if (interfaceC0188pMo8423a != null) {
            return interfaceC0188pMo8423a.hashCode();
        }
        return 0;
    }
}
