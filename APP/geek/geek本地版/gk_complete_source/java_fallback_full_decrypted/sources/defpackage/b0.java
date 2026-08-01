package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public final defpackage.a0 a;

    public b0(defpackage.a0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof defpackage.b0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            b0 r2 = (defpackage.b0) r2
            a0 r0 = r1.a
            a0 r2 = r2.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            a0 r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r3) {
            r2 = this;
            a0 r0 = r2.a
            oh r0 = (defpackage.oh) r0
            java.lang.Object r0 = r0.a
            ph r0 = (defpackage.ph) r0
            android.widget.AutoCompleteTextView r1 = r0.h
            if (r1 == 0) goto L1f
            int r1 = r1.getInputType()
            if (r1 == 0) goto L13
            return
        L13:
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            if (r3 == 0) goto L19
            r3 = 2
            goto L1a
        L19:
            r3 = 1
        L1a:
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.s(r0, r3)
        L1f:
            return
    }
}
