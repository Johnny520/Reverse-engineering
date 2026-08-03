package a;

/* JADX INFO: renamed from: a.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0385t5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f694a;
    public final /* synthetic */ android.view.View b;

    public /* synthetic */ RunnableC0385t5(android.view.View r1, int r2) {
            r0 = this;
            r0.f694a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f694a
            switch(r0) {
                case 0: goto L4e;
                case 1: goto L36;
                case 2: goto L18;
                default: goto L5;
            }
        L5:
            android.view.View r0 = r3.b
            android.content.Context r1 = r0.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r2 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r1 = a.Y3.b.b(r1, r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = 1
            r1.showSoftInput(r0, r2)
            return
        L18:
            android.view.View r0 = r3.b
            boolean r1 = r0.isFocused()
            if (r1 == 0) goto L35
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            a.C0193i9.c(r1, r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = 2
            r1.showSoftInput(r0, r2)
        L35:
            return
        L36:
            android.view.View r0 = r3.b
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            a.C0193i9.c(r1, r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = 2
            r1.showSoftInput(r0, r2)
            return
        L4e:
            r0 = 0
            android.view.View r1 = r3.b
            r1.setVisibility(r0)
            return
    }
}
