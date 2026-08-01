package p275t0;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p274t.InterfaceC7888q3;

/* JADX INFO: renamed from: t0.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7952e1 implements InterfaceC7888q3 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0512i2 f26507b;

    public C7952e1(InterfaceC7888q3 interfaceC7888q3) {
        this.f26507b = AbstractC0522j5.m1773e(interfaceC7888q3, null, 2, null);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: a */
    public int mo30228a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return m30704e().mo30228a(interfaceC3175e, enumC3191u);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: b */
    public int mo30229b(InterfaceC3175e interfaceC3175e) {
        return m30704e().mo30229b(interfaceC3175e);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: c */
    public int mo30230c(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return m30704e().mo30230c(interfaceC3175e, enumC3191u);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: d */
    public int mo30231d(InterfaceC3175e interfaceC3175e) {
        return m30704e().mo30231d(interfaceC3175e);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC7888q3 m30704e() {
        return (InterfaceC7888q3) this.f26507b.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m30705f(InterfaceC7888q3 interfaceC7888q3) {
        this.f26507b.setValue(interfaceC7888q3);
    }
}
