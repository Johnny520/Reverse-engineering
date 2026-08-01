package p126i8;

import p024b9.AbstractC1061t;
import p034c7.InterfaceC1355b;
import p256r7.InterfaceC6530f;

/* JADX INFO: renamed from: i8.q2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3326q2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6530f f9046a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1355b f9047b;

    public C3326q2(InterfaceC6530f interfaceC6530f, InterfaceC1355b interfaceC1355b) {
        interfaceC1355b.getClass();
        this.f9046a = interfaceC6530f;
        this.f9047b = interfaceC1355b;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1355b m12468a() {
        return this.f9047b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC6530f m12469b() {
        return this.f9046a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3326q2)) {
            return false;
        }
        C3326q2 c3326q2 = (C3326q2) obj;
        return AbstractC1061t.m3842c(this.f9046a, c3326q2.f9046a) && AbstractC1061t.m3842c(this.f9047b, c3326q2.f9047b);
    }

    public int hashCode() {
        InterfaceC6530f interfaceC6530f = this.f9046a;
        return ((interfaceC6530f == null ? 0 : interfaceC6530f.hashCode()) * 31) + this.f9047b.hashCode();
    }

    public String toString() {
        return "SessionContext(session=" + this.f9046a + ", call=" + this.f9047b + ")";
    }
}
