package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg3 implements ma1, vn0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0941yx f1532a;

    public cg3(AbstractC0941yx abstractC0941yx) {
        this.f1532a = abstractC0941yx;
    }

    @Override // p000.vn0
    /* JADX INFO: renamed from: a */
    public final yn0 mo775a() {
        return new yn0(1, this.f1532a, AbstractC0941yx.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ma1) && (obj instanceof vn0)) {
            return mo775a().equals(((vn0) obj).mo775a());
        }
        return false;
    }

    public final int hashCode() {
        return mo775a().hashCode();
    }
}
