package ab;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.e f165a;

    public g(android.view.inputmethod.InputConnection r2, ab.e r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.f165a = r3
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L14
            if (r3 != 0) goto L14
            ab.e r0 = r1.f165a
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.deleteSurroundingText(r2, r3)
            return r2
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r2, int r3) {
            r1 = this;
            if (r2 <= 0) goto L14
            if (r3 != 0) goto L14
            ab.e r0 = r1.f165a
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.deleteSurroundingTextInCodePoints(r2, r3)
            return r2
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            r3.getClass()
            int r0 = r3.getAction()
            if (r0 != 0) goto L21
            int r0 = r3.getKeyCode()
            r1 = 67
            if (r0 != r1) goto L21
            ab.e r0 = r2.f165a
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            r3 = 1
            return r3
        L21:
            boolean r3 = super.sendKeyEvent(r3)
            return r3
    }
}
