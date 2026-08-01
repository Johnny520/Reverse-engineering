package p274t;

import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: t.n1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7871n1 implements InterfaceC7887q2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7888q3 f26232a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3175e f26233b;

    public C7871n1(InterfaceC7888q3 interfaceC7888q3, InterfaceC3175e interfaceC3175e) {
        this.f26232a = interfaceC7888q3;
        this.f26233b = interfaceC3175e;
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: a */
    public float mo27239a() {
        InterfaceC3175e interfaceC3175e = this.f26233b;
        return interfaceC3175e.mo1225O0(this.f26232a.mo30231d(interfaceC3175e));
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: b */
    public float mo27240b(EnumC3191u enumC3191u) {
        InterfaceC3175e interfaceC3175e = this.f26233b;
        return interfaceC3175e.mo1225O0(this.f26232a.mo30230c(interfaceC3175e, enumC3191u));
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: c */
    public float mo27241c() {
        InterfaceC3175e interfaceC3175e = this.f26233b;
        return interfaceC3175e.mo1225O0(this.f26232a.mo30229b(interfaceC3175e));
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: d */
    public float mo27242d(EnumC3191u enumC3191u) {
        InterfaceC3175e interfaceC3175e = this.f26233b;
        return interfaceC3175e.mo1225O0(this.f26232a.mo30228a(interfaceC3175e, enumC3191u));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7871n1)) {
            return false;
        }
        C7871n1 c7871n1 = (C7871n1) obj;
        return AbstractC1061t.m3842c(this.f26232a, c7871n1.f26232a) && AbstractC1061t.m3842c(this.f26233b, c7871n1.f26233b);
    }

    public int hashCode() {
        return (this.f26232a.hashCode() * 31) + this.f26233b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f26232a + ", density=" + this.f26233b + ')';
    }
}
