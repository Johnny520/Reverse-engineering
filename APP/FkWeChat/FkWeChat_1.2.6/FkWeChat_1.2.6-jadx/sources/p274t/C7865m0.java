package p274t;

import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: t.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7865m0 implements InterfaceC7888q3 {

    /* JADX INFO: renamed from: b */
    public final int f26205b;

    /* JADX INFO: renamed from: c */
    public final int f26206c;

    /* JADX INFO: renamed from: d */
    public final int f26207d;

    /* JADX INFO: renamed from: e */
    public final int f26208e;

    public C7865m0(int i10, int i11, int i12, int i13) {
        this.f26205b = i10;
        this.f26206c = i11;
        this.f26207d = i12;
        this.f26208e = i13;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: a */
    public int mo30228a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return this.f26207d;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: b */
    public int mo30229b(InterfaceC3175e interfaceC3175e) {
        return this.f26206c;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: c */
    public int mo30230c(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return this.f26205b;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: d */
    public int mo30231d(InterfaceC3175e interfaceC3175e) {
        return this.f26208e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7865m0)) {
            return false;
        }
        C7865m0 c7865m0 = (C7865m0) obj;
        return this.f26205b == c7865m0.f26205b && this.f26206c == c7865m0.f26206c && this.f26207d == c7865m0.f26207d && this.f26208e == c7865m0.f26208e;
    }

    public int hashCode() {
        return (((((this.f26205b * 31) + this.f26206c) * 31) + this.f26207d) * 31) + this.f26208e;
    }

    public String toString() {
        return "Insets(left=" + this.f26205b + ", top=" + this.f26206c + ", right=" + this.f26207d + ", bottom=" + this.f26208e + ')';
    }
}
