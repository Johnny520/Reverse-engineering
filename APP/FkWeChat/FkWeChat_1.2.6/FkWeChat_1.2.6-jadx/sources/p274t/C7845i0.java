package p274t;

import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: t.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7845i0 implements InterfaceC7888q3 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7888q3 f26164b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7888q3 f26165c;

    public C7845i0(InterfaceC7888q3 interfaceC7888q3, InterfaceC7888q3 interfaceC7888q32) {
        this.f26164b = interfaceC7888q3;
        this.f26165c = interfaceC7888q32;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: a */
    public int mo30228a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return AbstractC2368o.m8578e(this.f26164b.mo30228a(interfaceC3175e, enumC3191u) - this.f26165c.mo30228a(interfaceC3175e, enumC3191u), 0);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: b */
    public int mo30229b(InterfaceC3175e interfaceC3175e) {
        return AbstractC2368o.m8578e(this.f26164b.mo30229b(interfaceC3175e) - this.f26165c.mo30229b(interfaceC3175e), 0);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: c */
    public int mo30230c(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return AbstractC2368o.m8578e(this.f26164b.mo30230c(interfaceC3175e, enumC3191u) - this.f26165c.mo30230c(interfaceC3175e, enumC3191u), 0);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: d */
    public int mo30231d(InterfaceC3175e interfaceC3175e) {
        return AbstractC2368o.m8578e(this.f26164b.mo30231d(interfaceC3175e) - this.f26165c.mo30231d(interfaceC3175e), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7845i0)) {
            return false;
        }
        C7845i0 c7845i0 = (C7845i0) obj;
        return AbstractC1061t.m3842c(c7845i0.f26164b, this.f26164b) && AbstractC1061t.m3842c(c7845i0.f26165c, this.f26165c);
    }

    public int hashCode() {
        return (this.f26164b.hashCode() * 31) + this.f26165c.hashCode();
    }

    public String toString() {
        return "(" + this.f26164b + " - " + this.f26165c + ')';
    }
}
