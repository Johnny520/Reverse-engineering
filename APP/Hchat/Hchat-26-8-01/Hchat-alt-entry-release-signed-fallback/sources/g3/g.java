package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4200h;

    public /* synthetic */ g(android.view.View r1, int r2) {
            r0 = this;
            r0.f4199g = r2
            r0.f4200h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f4199g
            switch(r0) {
                case 0: goto L32;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            r0 = 0
            android.view.View r1 = r3.f4200h
            r1.setTranslationX(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            return
        L11:
            android.view.View r0 = r3.f4200h
            android.view.ViewParent r1 = r0.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L24
            r1.removeView(r0)
        L24:
            java.lang.ref.WeakReference r1 = k9.r.f7538i
            java.lang.Object r1 = r1.get()
            if (r1 != r0) goto L31
            java.lang.ref.WeakReference r0 = k9.r.f7538i
            r0.clear()
        L31:
            return
        L32:
            android.view.View r0 = r3.f4200h
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = 0
            r1.showSoftInput(r0, r2)
            return
    }
}
