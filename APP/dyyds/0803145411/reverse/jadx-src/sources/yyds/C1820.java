package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛷᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1820 implements InterfaceC2247 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1091 f9144;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f9145;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ThreadLocal f9146;

    public C1820(Object obj, ThreadLocal threadLocal) {
        this.f9145 = obj;
        this.f9146 = threadLocal;
        this.f9144 = new C1091(threadLocal);
    }

    @Override // yyds.InterfaceC2247
    public final InterfaceC2289 getKey() {
        return this.f9144;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f9145 + ", threadLocal = " + this.f9146 + ')';
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC2213 mo421(InterfaceC2289 interfaceC2289) {
        return this.f9144.equals(interfaceC2289) ? C2586.f12764 : this;
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛶᛷᲀ */
    public final InterfaceC2213 mo422(InterfaceC2213 interfaceC2213) {
        return AbstractC0879.m1960(this, interfaceC2213);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public final InterfaceC2247 mo423(InterfaceC2289 interfaceC2289) {
        if (this.f9144.equals(interfaceC2289)) {
            return this;
        }
        return null;
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Object mo424(Object obj, InterfaceC0477 interfaceC0477) {
        return interfaceC0477.mo511(obj, this);
    }
}
