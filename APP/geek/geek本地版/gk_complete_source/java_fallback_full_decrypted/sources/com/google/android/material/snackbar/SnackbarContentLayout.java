package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout {
    public android.widget.TextView a;
    public android.widget.Button b;
    public int c;

    public SnackbarContentLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 2130969351(0x7f040307, float:1.7547381E38)
            tj r0 = defpackage.q2.b
            defpackage.ct.w(r2, r3, r0)
            return
    }

    public final boolean a(int r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.getOrientation()
            r1 = 1
            if (r4 == r0) goto Lc
            r3.setOrientation(r4)
            r4 = r1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            android.widget.TextView r0 = r3.a
            int r0 = r0.getPaddingTop()
            if (r0 != r5) goto L1f
            android.widget.TextView r0 = r3.a
            int r0 = r0.getPaddingBottom()
            if (r0 == r6) goto L1e
            goto L1f
        L1e:
            return r4
        L1f:
            android.widget.TextView r4 = r3.a
            java.util.WeakHashMap r0 = defpackage.ja0.a
            boolean r0 = defpackage.t90.g(r4)
            if (r0 == 0) goto L35
            int r0 = defpackage.t90.f(r4)
            int r2 = defpackage.t90.e(r4)
            defpackage.t90.k(r4, r0, r5, r2, r6)
            return r1
        L35:
            int r0 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            r4.setPadding(r0, r5, r2, r6)
            return r1
    }

    public android.widget.Button getActionView() {
            r1 = this;
            android.widget.Button r0 = r1.b
            return r0
    }

    public android.widget.TextView getMessageView() {
            r1 = this;
            android.widget.TextView r0 = r1.a
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 2131296616(0x7f090168, float:1.8211154E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.a = r0
            r0 = 2131296615(0x7f090167, float:1.8211152E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.b = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            goto L59
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165319(0x7f070087, float:1.7944852E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165318(0x7f070086, float:1.794485E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.c
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.c
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L59
            goto L56
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L59
        L56:
            super.onMeasure(r8, r9)
        L59:
            return
    }

    public void setMaxInlineActionWidth(int r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
