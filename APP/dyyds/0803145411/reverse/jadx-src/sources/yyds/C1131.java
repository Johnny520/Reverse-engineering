package yyds;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yyds.ᛵᛶᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1131 implements InterfaceC1240 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AtomicReference f5199;

    public C1131(C0558 c0558) {
        this.f5199 = new AtomicReference(c0558);
    }

    @Override // yyds.InterfaceC1240
    public final Iterator iterator() {
        InterfaceC1240 interfaceC1240 = (InterfaceC1240) this.f5199.getAndSet(null);
        if (interfaceC1240 != null) {
            return interfaceC1240.iterator();
        }
        C0188.m800("This sequence can be consumed only once.");
        return null;
    }
}
