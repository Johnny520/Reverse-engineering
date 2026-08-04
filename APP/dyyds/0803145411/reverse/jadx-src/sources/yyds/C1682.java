package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᛷᲈᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1682 implements InterfaceC0826, Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public InterfaceC2266 f8572;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f8573;

    @Override // yyds.InterfaceC0826
    public final Object getValue() {
        Object obj = this.f8573;
        if (obj != C1586.f8039) {
            return obj;
        }
        Object objMo731 = this.f8572.mo731();
        this.f8573 = objMo731;
        this.f8572 = null;
        return objMo731;
    }

    public final String toString() {
        return this.f8573 != C1586.f8039 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
