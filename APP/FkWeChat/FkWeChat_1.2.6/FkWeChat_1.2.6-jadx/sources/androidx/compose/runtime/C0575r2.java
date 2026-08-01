package androidx.compose.runtime;

import p010a9.InterfaceC0173a;
import p057e1.AbstractC1972b;
import p057e1.C1974c;

/* JADX INFO: renamed from: androidx.compose.runtime.r2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0575r2 implements InterfaceC0502h {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a f1580b;

    /* JADX INFO: renamed from: c */
    public final C1974c f1581c = AbstractC1972b.m7131b(false);

    public C0575r2(InterfaceC0173a interfaceC0173a) {
        this.f1580b = interfaceC0173a;
    }

    @Override // androidx.compose.runtime.InterfaceC0502h
    public void cancel() {
        if (AbstractC1972b.m7133d(this.f1581c, true)) {
            return;
        }
        this.f1580b.invoke();
    }
}
