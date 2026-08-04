package yyds;

/* JADX INFO: renamed from: yyds.ᛸᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1882 extends AbstractC0931 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f9487 = AbstractC2112.f10448.objectFieldOffset(C1882.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2635 f9488;

    public native C1882(C2635 c2635);

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo925(Throwable th) {
        if (AbstractC2112.f10448.compareAndSwapInt(this, f9487, 0, 1)) {
            this.f9488.mo371(th);
        }
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final boolean mo926() {
        return true;
    }
}
