package p000;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0361j4 extends AbstractViewOnTouchListenerC0378jl {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0695s4 f2545j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0806v4 f2546k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0361j4(C0806v4 c0806v4, C0806v4 c0806v42, C0695s4 c0695s4) {
        super(c0806v42);
        this.f2546k = c0806v4;
        this.f2545j = c0695s4;
    }

    @Override // p000.AbstractViewOnTouchListenerC0378jl
    /* JADX INFO: renamed from: b */
    public final r30 mo863b() {
        return this.f2545j;
    }

    @Override // p000.AbstractViewOnTouchListenerC0378jl
    /* JADX INFO: renamed from: c */
    public final boolean mo864c() {
        C0806v4 c0806v4 = this.f2546k;
        if (c0806v4.getInternalPopup().mo1989b()) {
            return true;
        }
        c0806v4.f4804f.mo1992e(AbstractC0472m4.m1781b(c0806v4), AbstractC0472m4.m1780a(c0806v4));
        return true;
    }
}
