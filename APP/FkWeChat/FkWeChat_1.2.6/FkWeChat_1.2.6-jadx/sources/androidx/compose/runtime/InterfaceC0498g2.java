package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.g2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0498g2 extends InterfaceC0553o1, InterfaceC0512i2 {
    @Override // androidx.compose.runtime.InterfaceC0553o1
    /* JADX INFO: renamed from: f */
    int mo1686f();

    @Override // androidx.compose.runtime.InterfaceC0564p5
    default Integer getValue() {
        return Integer.valueOf(mo1686f());
    }

    /* JADX INFO: renamed from: j */
    void mo1687j(int i10);

    /* JADX INFO: renamed from: q */
    default void m1688q(int i10) {
        mo1687j(i10);
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m1688q(((Number) obj).intValue());
    }
}
