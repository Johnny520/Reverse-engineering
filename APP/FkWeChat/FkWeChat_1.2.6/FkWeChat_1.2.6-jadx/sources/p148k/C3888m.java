package p148k;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p163l.InterfaceC4303h0;
import p165l1.InterfaceC4499e;

/* JADX INFO: renamed from: k.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3888m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e f11232a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f11233b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4303h0 f11234c;

    /* JADX INFO: renamed from: d */
    public final boolean f11235d;

    public C3888m(InterfaceC4499e interfaceC4499e, InterfaceC0184l interfaceC0184l, InterfaceC4303h0 interfaceC4303h0, boolean z10) {
        this.f11232a = interfaceC4499e;
        this.f11233b = interfaceC0184l;
        this.f11234c = interfaceC4303h0;
        this.f11235d = z10;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e m15433a() {
        return this.f11232a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4303h0 m15434b() {
        return this.f11234c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15435c() {
        return this.f11235d;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l m15436d() {
        return this.f11233b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3888m)) {
            return false;
        }
        C3888m c3888m = (C3888m) obj;
        return AbstractC1061t.m3842c(this.f11232a, c3888m.f11232a) && AbstractC1061t.m3842c(this.f11233b, c3888m.f11233b) && AbstractC1061t.m3842c(this.f11234c, c3888m.f11234c) && this.f11235d == c3888m.f11235d;
    }

    public int hashCode() {
        return (((((this.f11232a.hashCode() * 31) + this.f11233b.hashCode()) * 31) + this.f11234c.hashCode()) * 31) + Boolean.hashCode(this.f11235d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f11232a + ", size=" + this.f11233b + ", animationSpec=" + this.f11234c + ", clip=" + this.f11235d + ')';
    }
}
