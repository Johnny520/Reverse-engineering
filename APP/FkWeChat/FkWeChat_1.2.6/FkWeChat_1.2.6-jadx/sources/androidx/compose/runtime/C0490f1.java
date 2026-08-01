package androidx.compose.runtime;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: androidx.compose.runtime.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0490f1 implements InterfaceC0610v5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0512i2 f1356a;

    public C0490f1(InterfaceC0512i2 interfaceC0512i2) {
        this.f1356a = interfaceC0512i2;
    }

    @Override // androidx.compose.runtime.InterfaceC0610v5
    /* JADX INFO: renamed from: a */
    public Object mo1661a(InterfaceC0457a3 interfaceC0457a3) {
        return this.f1356a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0512i2 m1662b() {
        return this.f1356a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0490f1) && AbstractC1061t.m3842c(this.f1356a, ((C0490f1) obj).f1356a);
    }

    public int hashCode() {
        return this.f1356a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f1356a + ')';
    }
}
