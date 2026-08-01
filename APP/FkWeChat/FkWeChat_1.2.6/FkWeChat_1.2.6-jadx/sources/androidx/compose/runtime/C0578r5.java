package androidx.compose.runtime;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: androidx.compose.runtime.r5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0578r5 implements InterfaceC0610v5 {

    /* JADX INFO: renamed from: a */
    public final Object f1583a;

    public C0578r5(Object obj) {
        this.f1583a = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC0610v5
    /* JADX INFO: renamed from: a */
    public Object mo1661a(InterfaceC0457a3 interfaceC0457a3) {
        return this.f1583a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m2195b() {
        return this.f1583a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0578r5) && AbstractC1061t.m3842c(this.f1583a, ((C0578r5) obj).f1583a);
    }

    public int hashCode() {
        Object obj = this.f1583a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f1583a + ')';
    }
}
