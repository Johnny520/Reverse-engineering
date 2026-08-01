package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v extends android.view.View.AccessibilityDelegate {
    public final defpackage.x a;

    public v(defpackage.x r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            x r0 = r1.a
            boolean r2 = r0.a(r2, r3)
            return r2
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r2) {
            r1 = this;
            x r0 = r1.a
            l0 r2 = r0.b(r2)
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r2.b
            android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            x r0 = r1.a
            r0.c(r2, r3)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r12, android.view.accessibility.AccessibilityNodeInfo r13) {
            r11 = this;
            j0 r0 = new j0
            r0.<init>(r13)
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 28
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r1 < r3) goto L19
            boolean r1 = defpackage.ca0.d(r12)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L28
        L19:
            r1 = 2131296648(0x7f090188, float:1.8211219E38)
            java.lang.Object r1 = r12.getTag(r1)
            boolean r5 = r4.isInstance(r1)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r1 = r2
        L28:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L36
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L36
            r1 = r6
            goto L37
        L36:
            r1 = r5
        L37:
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            if (r7 < r3) goto L41
            defpackage.c0.p(r13, r1)
            goto L51
        L41:
            android.os.Bundle r9 = r13.getExtras()
            if (r9 == 0) goto L51
            int r10 = r9.getInt(r8, r5)
            r10 = r10 & (-2)
            r1 = r1 | r10
            r9.putInt(r8, r1)
        L51:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L5e
            boolean r1 = defpackage.ca0.c(r12)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L6d
        L5e:
            r1 = 2131296643(0x7f090183, float:1.8211208E38)
            java.lang.Object r1 = r12.getTag(r1)
            boolean r4 = r4.isInstance(r1)
            if (r4 == 0) goto L6c
            goto L6d
        L6c:
            r1 = r2
        L6d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L78
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L78
            goto L79
        L78:
            r6 = r5
        L79:
            if (r7 < r3) goto L7f
            defpackage.c0.y(r13, r6)
            goto L94
        L7f:
            android.os.Bundle r1 = r13.getExtras()
            if (r1 == 0) goto L94
            int r4 = r1.getInt(r8, r5)
            r4 = r4 & (-3)
            if (r6 == 0) goto L8f
            r6 = 2
            goto L90
        L8f:
            r6 = r5
        L90:
            r4 = r4 | r6
            r1.putInt(r8, r4)
        L94:
            java.lang.CharSequence r1 = defpackage.ja0.d(r12)
            if (r7 < r3) goto L9e
            defpackage.c0.o(r13, r1)
            goto La7
        L9e:
            android.os.Bundle r3 = r13.getExtras()
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r3.putCharSequence(r4, r1)
        La7:
            r1 = 30
            if (r7 < r1) goto Lb0
            java.lang.CharSequence r2 = defpackage.ea0.a(r12)
            goto Lc0
        Lb0:
            r3 = 2131296649(0x7f090189, float:1.821122E38)
            java.lang.Object r3 = r12.getTag(r3)
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            boolean r4 = r4.isInstance(r3)
            if (r4 == 0) goto Lc0
            r2 = r3
        Lc0:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r7 < r1) goto Lc8
            defpackage.d0.t(r13, r2)
            goto Ld1
        Lc8:
            android.os.Bundle r1 = r13.getExtras()
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r1.putCharSequence(r3, r2)
        Ld1:
            x r1 = r11.a
            r1.d(r12, r0)
            r13.getText()
            r13 = 2131296641(0x7f090181, float:1.8211204E38)
            java.lang.Object r12 = r12.getTag(r13)
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto Le6
            java.util.List r12 = java.util.Collections.EMPTY_LIST
        Le6:
            int r13 = r12.size()
            if (r5 >= r13) goto Lf8
            java.lang.Object r13 = r12.get(r5)
            h0 r13 = (defpackage.h0) r13
            r0.b(r13)
            int r5 = r5 + 1
            goto Le6
        Lf8:
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            x r0 = r1.a
            r0.e(r2, r3)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            x r0 = r1.a
            boolean r2 = r0.f(r2, r3, r4)
            return r2
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
            r1 = this;
            x r0 = r1.a
            boolean r2 = r0.g(r2, r3, r4)
            return r2
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View r2, int r3) {
            r1 = this;
            x r0 = r1.a
            r0.h(r2, r3)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            x r0 = r1.a
            r0.i(r2, r3)
            return
    }
}
