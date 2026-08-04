package yyds;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: yyds.ᛴᲈᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0992 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC0499 f4507;

    static {
        C1477 c1477 = C1477.f7009;
        InterfaceC0499 interfaceC0499 = c1477.f7010;
        if (interfaceC0499 == null) {
            C0644 c0644 = new C0644(22);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1477.f7008;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(c1477, null, c0644)) {
                    interfaceC0499 = c0644;
                    break;
                } else if (atomicReferenceFieldUpdater.get(c1477) != null) {
                    interfaceC0499 = C1477.f7009.f7010;
                    break;
                }
            }
        }
        f4507 = interfaceC0499;
    }
}
