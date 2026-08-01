package androidx.compose.runtime;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: androidx.compose.runtime.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0605v0 implements InterfaceC0610v5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f1621a;

    public C0605v0(InterfaceC0184l interfaceC0184l) {
        this.f1621a = interfaceC0184l;
    }

    @Override // androidx.compose.runtime.InterfaceC0610v5
    /* JADX INFO: renamed from: a */
    public Object mo1661a(InterfaceC0457a3 interfaceC0457a3) {
        return this.f1621a.mo27m(interfaceC0457a3);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l m2235b() {
        return this.f1621a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0605v0) && AbstractC1061t.m3842c(this.f1621a, ((C0605v0) obj).f1621a);
    }

    public int hashCode() {
        return this.f1621a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f1621a + ')';
    }
}
