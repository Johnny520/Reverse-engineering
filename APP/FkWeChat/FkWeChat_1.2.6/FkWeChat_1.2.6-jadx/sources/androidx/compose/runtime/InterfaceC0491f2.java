package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0491f2 extends InterfaceC0504h1, InterfaceC0512i2 {
    @Override // androidx.compose.runtime.InterfaceC0504h1
    /* JADX INFO: renamed from: b */
    float mo1663b();

    @Override // androidx.compose.runtime.InterfaceC0564p5
    default Float getValue() {
        return Float.valueOf(mo1663b());
    }

    /* JADX INFO: renamed from: h */
    void mo1664h(float f10);

    /* JADX INFO: renamed from: r */
    default void m1665r(float f10) {
        mo1664h(f10);
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m1665r(((Number) obj).floatValue());
    }
}
