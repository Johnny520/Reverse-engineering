package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᛱᛲᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0078 implements InterfaceC0826, Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public InterfaceC2266 f650;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile Object f651 = C1586.f8039;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f649 = this;

    public C0078(InterfaceC2266 interfaceC2266) {
        this.f650 = interfaceC2266;
    }

    @Override // yyds.InterfaceC0826
    public final Object getValue() {
        Object objMo731;
        Object obj = this.f651;
        C1586 c1586 = C1586.f8039;
        if (obj != c1586) {
            return obj;
        }
        synchronized (this.f649) {
            objMo731 = this.f651;
            if (objMo731 == c1586) {
                objMo731 = this.f650.mo731();
                this.f651 = objMo731;
                this.f650 = null;
            }
        }
        return objMo731;
    }

    public final String toString() {
        return this.f651 != C1586.f8039 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
