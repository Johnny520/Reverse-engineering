package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends android.view.View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.b f4179a;

    public a(g3.b r1) {
            r0 = this;
            r0.<init>()
            r0.f4179a = r1
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            g3.b r0 = r1.f4179a
            android.view.View$AccessibilityDelegate r0 = r0.f4185g
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r2) {
            r1 = this;
            g3.b r0 = r1.f4179a
            androidx.lifecycle.x r2 = r0.a(r2)
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r2.f310h
            android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            g3.b r0 = r1.f4179a
            android.view.View$AccessibilityDelegate r0 = r0.f4185g
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r9, android.view.accessibility.AccessibilityNodeInfo r10) {
            r8 = this;
            h3.g r0 = new h3.g
            r0.<init>(r10)
            int r1 = g3.q.f4227a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r4 = 28
            if (r1 < r4) goto L19
            boolean r5 = g3.o.c(r9)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L28
        L19:
            r5 = 2131099752(0x7f060068, float:1.7811866E38)
            java.lang.Object r5 = r9.getTag(r5)
            boolean r6 = r3.isInstance(r5)
            if (r6 == 0) goto L27
            goto L28
        L27:
            r5 = r2
        L28:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L36
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L36
            r5 = r6
            goto L37
        L36:
            r5 = r7
        L37:
            if (r1 < r4) goto L3d
            b0.b0.u(r10, r5)
            goto L40
        L3d:
            r0.f(r6, r5)
        L40:
            if (r1 < r4) goto L4b
            boolean r3 = g3.o.b(r9)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L5b
        L4b:
            r5 = 2131099746(0x7f060062, float:1.7811854E38)
            java.lang.Object r5 = r9.getTag(r5)
            boolean r3 = r3.isInstance(r5)
            if (r3 == 0) goto L5a
            r3 = r5
            goto L5b
        L5a:
            r3 = r2
        L5b:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L66
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L66
            goto L67
        L66:
            r6 = r7
        L67:
            if (r1 < r4) goto L6d
            h3.c.k(r10, r6)
            goto L71
        L6d:
            r3 = 2
            r0.f(r3, r6)
        L71:
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            if (r1 < r4) goto L7a
            java.lang.CharSequence r5 = g3.o.a(r9)
            goto L89
        L7a:
            r5 = 2131099747(0x7f060063, float:1.7811856E38)
            java.lang.Object r5 = r9.getTag(r5)
            boolean r6 = r3.isInstance(r5)
            if (r6 == 0) goto L88
            goto L89
        L88:
            r5 = r2
        L89:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r1 < r4) goto L91
            h3.c.j(r10, r5)
            goto L9a
        L91:
            android.os.Bundle r4 = r10.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r4.putCharSequence(r6, r5)
        L9a:
            r4 = 30
            if (r1 < r4) goto La3
            java.lang.CharSequence r2 = g3.p.a(r9)
            goto Lb1
        La3:
            r5 = 2131099753(0x7f060069, float:1.7811868E38)
            java.lang.Object r5 = r9.getTag(r5)
            boolean r3 = r3.isInstance(r5)
            if (r3 == 0) goto Lb1
            r2 = r5
        Lb1:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r1 < r4) goto Lb9
            b2.b.g(r10, r2)
            goto Lc2
        Lb9:
            android.os.Bundle r1 = r10.getExtras()
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r1.putCharSequence(r3, r2)
        Lc2:
            g3.b r1 = r8.f4179a
            r1.b(r9, r0)
            r10.getText()
            r10 = 2131099744(0x7f060060, float:1.781185E38)
            java.lang.Object r9 = r9.getTag(r10)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto Ld7
            java.util.List r9 = java.util.Collections.EMPTY_LIST
        Ld7:
            int r10 = r9.size()
            if (r7 >= r10) goto Le9
            java.lang.Object r10 = r9.get(r7)
            h3.e r10 = (h3.e) r10
            r0.a(r10)
            int r7 = r7 + 1
            goto Ld7
        Le9:
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            g3.b r0 = r1.f4179a
            android.view.View$AccessibilityDelegate r0 = r0.f4185g
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            g3.b r0 = r1.f4179a
            android.view.View$AccessibilityDelegate r0 = r0.f4185g
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View r6, int r7, android.os.Bundle r8) {
            r5 = this;
            g3.b r0 = r5.f4179a
            r0.getClass()
            r1 = 2131099744(0x7f060060, float:1.781185E38)
            java.lang.Object r1 = r6.getTag(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L12
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L12:
            r2 = 0
            r3 = r2
        L14:
            int r4 = r1.size()
            if (r3 >= r4) goto L2e
            java.lang.Object r4 = r1.get(r3)
            h3.e r4 = (h3.e) r4
            java.lang.Object r4 = r4.f5063a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            int r4 = r4.getId()
            if (r4 != r7) goto L2b
            goto L2e
        L2b:
            int r3 = r3 + 1
            goto L14
        L2e:
            android.view.View$AccessibilityDelegate r0 = r0.f4185g
            boolean r0 = r0.performAccessibilityAction(r6, r7, r8)
            if (r0 != 0) goto L92
            r1 = 2131099648(0x7f060000, float:1.7811655E38)
            if (r7 != r1) goto L92
            if (r8 == 0) goto L92
            java.lang.String r7 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r7 = r8.getInt(r7, r0)
            r8 = 2131099745(0x7f060061, float:1.7811852E38)
            java.lang.Object r8 = r6.getTag(r8)
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            if (r8 == 0) goto L91
            java.lang.Object r7 = r8.get(r7)
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            if (r7 == 0) goto L91
            java.lang.Object r7 = r7.get()
            android.text.style.ClickableSpan r7 = (android.text.style.ClickableSpan) r7
            if (r7 == 0) goto L91
            android.view.accessibility.AccessibilityNodeInfo r8 = r6.createAccessibilityNodeInfo()
            java.lang.CharSequence r8 = r8.getText()
            boolean r0 = r8 instanceof android.text.Spanned
            if (r0 == 0) goto L7a
            r0 = r8
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r8 = r8.length()
            java.lang.Class<android.text.style.ClickableSpan> r1 = android.text.style.ClickableSpan.class
            java.lang.Object[] r8 = r0.getSpans(r2, r8, r1)
            android.text.style.ClickableSpan[] r8 = (android.text.style.ClickableSpan[]) r8
            goto L7b
        L7a:
            r8 = 0
        L7b:
            r0 = r2
        L7c:
            if (r8 == 0) goto L91
            int r1 = r8.length
            if (r0 >= r1) goto L91
            r1 = r8[r0]
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L8e
            r7.onClick(r6)
            r6 = 1
            return r6
        L8e:
            int r0 = r0 + 1
            goto L7c
        L91:
            return r2
        L92:
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View r2, int r3) {
            r1 = this;
            g3.b r0 = r1.f4179a
            android.view.View$AccessibilityDelegate r0 = r0.f4185g
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            g3.b r0 = r1.f4179a
            android.view.View$AccessibilityDelegate r0 = r0.f4185g
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }
}
