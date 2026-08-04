package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲁᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0463 implements InterfaceC2247, InterfaceC2289 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2315;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0463 f2314 = new C0463(0);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0463 f2313 = new C0463(1);

    public /* synthetic */ C0463(int i) {
        this.f2315 = i;
    }

    @Override // yyds.InterfaceC2247
    public final InterfaceC2289 getKey() {
        switch (this.f2315) {
            case 0:
                return f2314;
            default:
                return this;
        }
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC2213 mo421(InterfaceC2289 interfaceC2289) {
        switch (this.f2315) {
        }
        return AbstractC1579.m3232(this, interfaceC2289);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛶᛷᲀ */
    public final InterfaceC2213 mo422(InterfaceC2213 interfaceC2213) {
        switch (this.f2315) {
        }
        return AbstractC0879.m1960(this, interfaceC2213);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public final InterfaceC2247 mo423(InterfaceC2289 interfaceC2289) {
        switch (this.f2315) {
        }
        return AbstractC1579.m3240(this, interfaceC2289);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Object mo424(Object obj, InterfaceC0477 interfaceC0477) {
        switch (this.f2315) {
        }
        return interfaceC0477.mo511(obj, this);
    }
}
