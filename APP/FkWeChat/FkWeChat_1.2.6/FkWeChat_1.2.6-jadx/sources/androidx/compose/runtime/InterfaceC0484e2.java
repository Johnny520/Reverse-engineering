package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0484e2 extends InterfaceC0564p5, InterfaceC0512i2 {
    @Override // androidx.compose.runtime.InterfaceC0564p5
    default Double getValue() {
        return Double.valueOf(mo1631i());
    }

    /* JADX INFO: renamed from: i */
    double mo1631i();

    /* JADX INFO: renamed from: s */
    default void m1632s(double d10) {
        mo1633t(d10);
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m1632s(((Number) obj).doubleValue());
    }

    /* JADX INFO: renamed from: t */
    void mo1633t(double d10);
}
