package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.h2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0505h2 extends InterfaceC0619x1, InterfaceC0512i2 {
    @Override // androidx.compose.runtime.InterfaceC0619x1
    /* JADX INFO: renamed from: a */
    long mo1692a();

    @Override // androidx.compose.runtime.InterfaceC0564p5
    default Long getValue() {
        return Long.valueOf(mo1692a());
    }

    /* JADX INFO: renamed from: n */
    void mo1693n(long j10);

    /* JADX INFO: renamed from: p */
    default void m1694p(long j10) {
        mo1693n(j10);
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m1694p(((Number) obj).longValue());
    }
}
