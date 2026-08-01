package p148k;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p163l.InterfaceC4303h0;

/* JADX INFO: renamed from: k.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3887l0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f11230a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4303h0 f11231b;

    public C3887l0(InterfaceC0184l interfaceC0184l, InterfaceC4303h0 interfaceC4303h0) {
        this.f11230a = interfaceC0184l;
        this.f11231b = interfaceC4303h0;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4303h0 m15431a() {
        return this.f11231b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l m15432b() {
        return this.f11230a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3887l0)) {
            return false;
        }
        C3887l0 c3887l0 = (C3887l0) obj;
        return AbstractC1061t.m3842c(this.f11230a, c3887l0.f11230a) && AbstractC1061t.m3842c(this.f11231b, c3887l0.f11231b);
    }

    public int hashCode() {
        return (this.f11230a.hashCode() * 31) + this.f11231b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f11230a + ", animationSpec=" + this.f11231b + ')';
    }
}
