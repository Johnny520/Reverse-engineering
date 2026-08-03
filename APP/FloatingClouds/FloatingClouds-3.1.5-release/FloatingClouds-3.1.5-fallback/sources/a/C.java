package a;

/* JADX INFO: loaded from: classes.dex */
public class C {
    public static final android.view.View.AccessibilityDelegate c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View.AccessibilityDelegate f36a;
    public final a.C.a b;

    public static final class a extends android.view.View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.C f37a;

        public a(a.C r1) {
                r0 = this;
                r0.<init>()
                r0.f37a = r1
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.C r0 = r1.f37a
                boolean r2 = r0.a(r2, r3)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r2) {
                r1 = this;
                a.C r0 = r1.f37a
                a.J r2 = r0.b(r2)
                if (r2 == 0) goto Lb
                android.view.accessibility.AccessibilityNodeProvider r2 = r2.f129a
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.C r0 = r1.f37a
                r0.c(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(android.view.View r6, android.view.accessibility.AccessibilityNodeInfo r7) {
                r5 = this;
                a.I r0 = new a.I
                r0.<init>(r7)
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                boolean r1 = a.C0414ug.g.d(r6)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                boolean r1 = r1.booleanValue()
                r2 = 0
                r7.setScreenReaderFocusable(r1)
                boolean r1 = a.C0414ug.g.c(r6)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                boolean r1 = r1.booleanValue()
                r7.setHeading(r1)
                java.lang.CharSequence r1 = a.C0414ug.g.b(r6)
                r7.setPaneTitle(r1)
                int r1 = androidx.core.R.id.tag_state_description
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 30
                if (r3 < r4) goto L3a
                java.lang.CharSequence r1 = a.C0414ug.i.b(r6)
                goto L48
            L3a:
                java.lang.Object r1 = r6.getTag(r1)
                java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
                boolean r3 = r3.isInstance(r1)
                if (r3 == 0) goto L47
                goto L48
            L47:
                r1 = 0
            L48:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r4) goto L52
                a.I.b.c(r7, r1)
                goto L5b
            L52:
                android.os.Bundle r3 = r7.getExtras()
                java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
                r3.putCharSequence(r4, r1)
            L5b:
                a.C r1 = r5.f37a
                r1.d(r6, r0)
                r7.getText()
                int r7 = androidx.core.R.id.tag_accessibility_actions
                java.lang.Object r6 = r6.getTag(r7)
                java.util.List r6 = (java.util.List) r6
                if (r6 != 0) goto L6f
                java.util.List r6 = java.util.Collections.EMPTY_LIST
            L6f:
                int r7 = r6.size()
                if (r2 >= r7) goto L81
                java.lang.Object r7 = r6.get(r2)
                a.I$a r7 = (a.I.a) r7
                r0.b(r7)
                int r2 = r2 + 1
                goto L6f
            L81:
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.C r0 = r1.f37a
                r0.e(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                a.C r0 = r1.f37a
                boolean r2 = r0.f(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                a.C r0 = r1.f37a
                boolean r2 = r0.g(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(android.view.View r2, int r3) {
                r1 = this;
                a.C r0 = r1.f37a
                r0.h(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.C r0 = r1.f37a
                r0.i(r2, r3)
                return
        }
    }

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            a.C.c = r0
            return
    }

    public C() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = a.C.c
            r1.<init>(r0)
            return
    }

    public C(android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.f36a = r1
            a.C$a r1 = new a.C$a
            r1.<init>(r0)
            r0.b = r1
            return
    }

    public boolean a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    public a.J b(android.view.View r2) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            android.view.accessibility.AccessibilityNodeProvider r2 = r0.getAccessibilityNodeProvider(r2)
            if (r2 == 0) goto Le
            a.J r0 = new a.J
            r0.<init>(r2)
            return r0
        Le:
            r2 = 0
            return r2
    }

    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    public void d(android.view.View r2, a.I r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f118a
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            return
    }

    public void e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    public boolean f(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
            r6 = this;
            int r0 = androidx.core.R.id.tag_accessibility_actions
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lc
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        Lc:
            r1 = 0
            r2 = r1
        Le:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L4f
            java.lang.Object r3 = r0.get(r2)
            a.I$a r3 = (a.I.a) r3
            int r5 = r3.a()
            if (r5 != r8) goto L4c
            a.K r0 = r3.d
            if (r0 == 0) goto L4f
            java.lang.Class<? extends a.K$a> r2 = r3.c
            if (r2 == 0) goto L47
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L37
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> L37
            a.K$a r3 = (a.K.a) r3     // Catch: java.lang.Exception -> L37
            r3.getClass()     // Catch: java.lang.Exception -> L37
            goto L47
        L37:
            r3 = move-exception
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r2, r3)
        L47:
            boolean r0 = r0.a(r7)
            goto L50
        L4c:
            int r2 = r2 + 1
            goto Le
        L4f:
            r0 = r1
        L50:
            if (r0 != 0) goto L58
            android.view.View$AccessibilityDelegate r0 = r6.f36a
            boolean r0 = r0.performAccessibilityAction(r7, r8, r9)
        L58:
            if (r0 != 0) goto Lb4
            int r2 = androidx.core.R.id.accessibility_action_clickable_span
            if (r8 != r2) goto Lb4
            if (r9 == 0) goto Lb4
            java.lang.String r8 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r8 = r9.getInt(r8, r0)
            int r9 = androidx.core.R.id.tag_accessibility_clickable_spans
            java.lang.Object r9 = r7.getTag(r9)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            if (r9 == 0) goto Lb3
            java.lang.Object r8 = r9.get(r8)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            if (r8 == 0) goto Lb3
            java.lang.Object r8 = r8.get()
            android.text.style.ClickableSpan r8 = (android.text.style.ClickableSpan) r8
            if (r8 == 0) goto Lb3
            android.view.accessibility.AccessibilityNodeInfo r9 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r9 = r9.getText()
            boolean r0 = r9 instanceof android.text.Spanned
            if (r0 == 0) goto L9d
            r0 = r9
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r9 = r9.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r9 = r0.getSpans(r1, r9, r2)
            r4 = r9
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        L9d:
            r9 = r1
        L9e:
            if (r4 == 0) goto Lb3
            int r0 = r4.length
            if (r9 >= r0) goto Lb3
            r0 = r4[r9]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb0
            r8.onClick(r7)
            r1 = 1
            goto Lb3
        Lb0:
            int r9 = r9 + 1
            goto L9e
        Lb3:
            r0 = r1
        Lb4:
            return r0
    }

    public void h(android.view.View r2, int r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    public void i(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f36a
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }
}
