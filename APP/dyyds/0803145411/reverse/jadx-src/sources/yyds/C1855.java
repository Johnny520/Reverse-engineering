package yyds;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: yyds.ᛸᲀᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1855 implements InterfaceC0826, Serializable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f9331 = AtomicReferenceFieldUpdater.newUpdater(C1855.class, Object.class, "ᲇᲈᛵᛷ");

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile InterfaceC2266 f9332;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile Object f9333;

    @Override // yyds.InterfaceC0826
    public final Object getValue() {
        Object obj = this.f9333;
        C1586 c1586 = C1586.f8039;
        if (obj != c1586) {
            return obj;
        }
        InterfaceC2266 interfaceC2266 = this.f9332;
        if (interfaceC2266 != null) {
            Object objMo731 = interfaceC2266.mo731();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9331;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1586, objMo731)) {
                if (atomicReferenceFieldUpdater.get(this) != c1586) {
                }
            }
            this.f9332 = null;
            return objMo731;
        }
        return this.f9333;
    }

    public final String toString() {
        return this.f9333 != C1586.f8039 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
