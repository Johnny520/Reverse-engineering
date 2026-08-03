package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ra.h f11845h;

    public d(ra.h r1, android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.f11845h = r1
            r0.f11844g = r2
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r5 = this;
            ra.h r0 = r5.f11845h
            android.view.View r1 = r5.f11844g
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L36
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L36
            r1.performClick()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "红包按钮已点击"
            r0.o(r2)     // Catch: java.lang.Throwable -> L19
            goto L2f
        L19:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "红包按钮点击失败: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.o(r2)
        L2f:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r5)
        L36:
            return
    }
}
