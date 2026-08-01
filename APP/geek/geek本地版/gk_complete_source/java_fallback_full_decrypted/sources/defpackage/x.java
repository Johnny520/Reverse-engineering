package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class x {
    public static final android.view.View.AccessibilityDelegate c = null;
    public final android.view.View.AccessibilityDelegate a;
    public final defpackage.v b;

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            defpackage.x.c = r0
            return
    }

    public x() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = defpackage.x.c
            r1.<init>(r0)
            return
    }

    public x(android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            v r1 = new v
            r1.<init>(r0)
            r0.b = r1
            return
    }

    public boolean a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    public defpackage.l0 b(android.view.View r3) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.a
            android.view.accessibility.AccessibilityNodeProvider r3 = defpackage.w.a(r0, r3)
            if (r3 == 0) goto Lf
            l0 r0 = new l0
            r1 = 0
            r0.<init>(r1, r3)
            return r0
        Lf:
            r3 = 0
            return r3
    }

    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.a
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    public void d(android.view.View r2, defpackage.j0 r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.a
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.a
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            return
    }

    public void e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.a
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    public boolean f(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.a
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
            r6 = this;
            r0 = 2131296641(0x7f090181, float:1.8211204E38)
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Ld
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        Ld:
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L55
            java.lang.Object r3 = r0.get(r2)
            h0 r3 = (defpackage.h0) r3
            int r5 = r3.a()
            if (r5 != r8) goto L52
            java.lang.Class r0 = r3.c
            v0 r2 = r3.d
            if (r2 == 0) goto L55
            if (r0 != 0) goto L2b
            goto L4d
        L2b:
            java.lang.reflect.Constructor r3 = r0.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L36
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> L36
            if (r3 != 0) goto L38
            throw r4     // Catch: java.lang.Exception -> L36
        L36:
            r3 = move-exception
            goto L3e
        L38:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L36
            r3.<init>()     // Catch: java.lang.Exception -> L36
            throw r3     // Catch: java.lang.Exception -> L36
        L3e:
            java.lang.String r0 = r0.getName()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r0 = r5.concat(r0)
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r0, r3)
        L4d:
            boolean r0 = r2.c(r7)
            goto L56
        L52:
            int r2 = r2 + 1
            goto Lf
        L55:
            r0 = r1
        L56:
            if (r0 != 0) goto L5e
            android.view.View$AccessibilityDelegate r0 = r6.a
            boolean r0 = defpackage.w.b(r0, r7, r8, r9)
        L5e:
            if (r0 != 0) goto Lbc
            r2 = 2131296271(0x7f09000f, float:1.8210454E38)
            if (r8 != r2) goto Lbc
            if (r9 == 0) goto Lbc
            java.lang.String r8 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r8 = r9.getInt(r8, r0)
            r9 = 2131296642(0x7f090182, float:1.8211206E38)
            java.lang.Object r9 = r7.getTag(r9)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            if (r9 == 0) goto Lbb
            java.lang.Object r8 = r9.get(r8)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            if (r8 == 0) goto Lbb
            java.lang.Object r8 = r8.get()
            android.text.style.ClickableSpan r8 = (android.text.style.ClickableSpan) r8
            if (r8 == 0) goto Lbb
            android.view.accessibility.AccessibilityNodeInfo r9 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r9 = r9.getText()
            boolean r0 = r9 instanceof android.text.Spanned
            if (r0 == 0) goto La5
            r0 = r9
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r9 = r9.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r9 = r0.getSpans(r1, r9, r2)
            r4 = r9
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        La5:
            r9 = r1
        La6:
            if (r4 == 0) goto Lbb
            int r0 = r4.length
            if (r9 >= r0) goto Lbb
            r0 = r4[r9]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb8
            r8.onClick(r7)
            r1 = 1
            goto Lbb
        Lb8:
            int r9 = r9 + 1
            goto La6
        Lbb:
            r0 = r1
        Lbc:
            return r0
    }

    public void h(android.view.View r2, int r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.a
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    public void i(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.a
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }
}
