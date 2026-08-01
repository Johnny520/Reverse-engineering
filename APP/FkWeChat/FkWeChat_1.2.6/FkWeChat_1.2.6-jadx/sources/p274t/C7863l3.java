package p274t;

import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: t.l3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7863l3 implements InterfaceC7888q3 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7888q3 f26203b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7888q3 f26204c;

    public C7863l3(InterfaceC7888q3 interfaceC7888q3, InterfaceC7888q3 interfaceC7888q32) {
        this.f26203b = interfaceC7888q3;
        this.f26204c = interfaceC7888q32;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: a */
    public int mo30228a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return Math.max(this.f26203b.mo30228a(interfaceC3175e, enumC3191u), this.f26204c.mo30228a(interfaceC3175e, enumC3191u));
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: b */
    public int mo30229b(InterfaceC3175e interfaceC3175e) {
        return Math.max(this.f26203b.mo30229b(interfaceC3175e), this.f26204c.mo30229b(interfaceC3175e));
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: c */
    public int mo30230c(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return Math.max(this.f26203b.mo30230c(interfaceC3175e, enumC3191u), this.f26204c.mo30230c(interfaceC3175e, enumC3191u));
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: d */
    public int mo30231d(InterfaceC3175e interfaceC3175e) {
        return Math.max(this.f26203b.mo30231d(interfaceC3175e), this.f26204c.mo30231d(interfaceC3175e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7863l3)) {
            return false;
        }
        C7863l3 c7863l3 = (C7863l3) obj;
        return AbstractC1061t.m3842c(c7863l3.f26203b, this.f26203b) && AbstractC1061t.m3842c(c7863l3.f26204c, this.f26204c);
    }

    public int hashCode() {
        return this.f26203b.hashCode() + (this.f26204c.hashCode() * 31);
    }

    public String toString() {
        return "(" + this.f26203b + " ∪ " + this.f26204c + ')';
    }
}
