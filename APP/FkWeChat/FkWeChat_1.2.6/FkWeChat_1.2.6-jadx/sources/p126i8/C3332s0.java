package p126i8;

import p010a9.InterfaceC0189q;
import p024b9.AbstractC1061t;
import p157k8.C4174v5;

/* JADX INFO: renamed from: i8.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3332s0 implements InterfaceC3266d {

    /* JADX INFO: renamed from: a */
    public final C4174v5 f9050a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0189q f9051b;

    /* JADX INFO: renamed from: c */
    public final String f9052c;

    public C3332s0(C4174v5 c4174v5, InterfaceC0189q interfaceC0189q) {
        c4174v5.getClass();
        interfaceC0189q.getClass();
        this.f9050a = c4174v5;
        this.f9051b = interfaceC0189q;
        this.f9052c = c4174v5.getName();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0189q m12470a() {
        return this.f9051b;
    }

    /* JADX INFO: renamed from: b */
    public final C4174v5 m12471b() {
        return this.f9050a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3332s0)) {
            return false;
        }
        C3332s0 c3332s0 = (C3332s0) obj;
        return AbstractC1061t.m3842c(this.f9050a, c3332s0.f9050a) && AbstractC1061t.m3842c(this.f9051b, c3332s0.f9051b);
    }

    @Override // p126i8.InterfaceC3266d
    public String getKey() {
        return this.f9052c;
    }

    public int hashCode() {
        return (this.f9050a.hashCode() * 31) + this.f9051b.hashCode();
    }

    public String toString() {
        return "RegisteredTool(tool=" + this.f9050a + ", handler=" + this.f9051b + ")";
    }
}
