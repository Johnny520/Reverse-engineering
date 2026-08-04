package yyds;

/* JADX INFO: renamed from: yyds.ᛳᲁᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Throwable f3291;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f3292;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0230 f3293;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0295 f3294;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f3295;

    public /* synthetic */ C0697(Object obj, InterfaceC0230 interfaceC0230, InterfaceC0295 interfaceC0295, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC0230, (i & 4) != 0 ? null : interfaceC0295, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0697 m1616(C0697 c0697, InterfaceC0230 interfaceC0230, Throwable th, int i) {
        Object obj = c0697.f3292;
        if ((i & 2) != 0) {
            interfaceC0230 = c0697.f3293;
        }
        InterfaceC0230 interfaceC02302 = interfaceC0230;
        InterfaceC0295 interfaceC0295 = c0697.f3294;
        Object obj2 = c0697.f3295;
        if ((i & 16) != 0) {
            th = c0697.f3291;
        }
        return new C0697(obj, interfaceC02302, interfaceC0295, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0697)) {
            return false;
        }
        C0697 c0697 = (C0697) obj;
        return AbstractC1544.m3188(this.f3292, c0697.f3292) && AbstractC1544.m3188(this.f3293, c0697.f3293) && AbstractC1544.m3188(this.f3294, c0697.f3294) && AbstractC1544.m3188(this.f3295, c0697.f3295) && AbstractC1544.m3188(this.f3291, c0697.f3291);
    }

    public final int hashCode() {
        Object obj = this.f3292;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0230 interfaceC0230 = this.f3293;
        int iHashCode2 = (iHashCode + (interfaceC0230 == null ? 0 : interfaceC0230.hashCode())) * 31;
        InterfaceC0295 interfaceC0295 = this.f3294;
        int iHashCode3 = (iHashCode2 + (interfaceC0295 == null ? 0 : interfaceC0295.hashCode())) * 31;
        Object obj2 = this.f3295;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3291;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3292 + ", cancelHandler=" + this.f3293 + ", onCancellation=" + this.f3294 + ", idempotentResume=" + this.f3295 + ", cancelCause=" + this.f3291 + ')';
    }

    public C0697(Object obj, InterfaceC0230 interfaceC0230, InterfaceC0295 interfaceC0295, Object obj2, Throwable th) {
        this.f3292 = obj;
        this.f3293 = interfaceC0230;
        this.f3294 = interfaceC0295;
        this.f3295 = obj2;
        this.f3291 = th;
    }
}
