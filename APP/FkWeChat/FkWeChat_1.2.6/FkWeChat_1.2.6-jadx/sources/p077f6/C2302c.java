package p077f6;

import p010a9.InterfaceC0189q;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2302c implements InterfaceC2335u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0189q f6300a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2336v f6301b;

    public C2302c(InterfaceC0189q interfaceC0189q, InterfaceC2336v interfaceC2336v) {
        interfaceC2336v.getClass();
        this.f6300a = interfaceC0189q;
        this.f6301b = interfaceC2336v;
    }

    @Override // p077f6.InterfaceC2335u
    /* JADX INFO: renamed from: a */
    public InterfaceC2336v mo8424a() {
        return this.f6301b;
    }

    @Override // p077f6.InterfaceC2335u
    /* JADX INFO: renamed from: b */
    public InterfaceC0189q mo8425b() {
        return this.f6300a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2302c.class != obj.getClass()) {
            return false;
        }
        C2302c c2302c = (C2302c) obj;
        return AbstractC1061t.m3842c(mo8425b(), c2302c.mo8425b()) && AbstractC1061t.m3842c(mo8424a(), c2302c.mo8424a());
    }

    public int hashCode() {
        InterfaceC0189q interfaceC0189qMo8425b = mo8425b();
        return ((interfaceC0189qMo8425b != null ? interfaceC0189qMo8425b.hashCode() : 0) * 31) + mo8424a().hashCode();
    }
}
