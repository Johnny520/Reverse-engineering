package a;

/* JADX INFO: loaded from: classes.dex */
public final class Y2 extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.chip.Chip f349a;

    public Y2(com.google.android.material.chip.Chip r1) {
            r0 = this;
            r0.f349a = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    @android.annotation.TargetApi(21)
    public final void getOutline(android.view.View r1, android.graphics.Outline r2) {
            r0 = this;
            com.google.android.material.chip.Chip r1 = r0.f349a
            com.google.android.material.chip.a r1 = r1.e
            if (r1 == 0) goto La
            r1.getOutline(r2)
            return
        La:
            r1 = 0
            r2.setAlpha(r1)
            return
    }
}
