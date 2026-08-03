package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.widget.TextView f1091a;
    public android.widget.Button b;
    public int c;

    public SnackbarContentLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int r3 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            a.l6 r0 = a.C0434w0.b
            a.C0445wb.d(r2, r3, r0)
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
            android.widget.TextView r0 = r3.f1091a
            int r0 = r0.getPaddingTop()
            if (r0 != r5) goto L1f
            android.widget.TextView r0 = r3.f1091a
            int r0 = r0.getPaddingBottom()
            if (r0 == r6) goto L1e
            goto L1f
        L1e:
            return r4
        L1f:
            android.widget.TextView r4 = r3.f1091a
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r4.isPaddingRelative()
            if (r0 == 0) goto L35
            int r0 = r4.getPaddingStart()
            int r2 = r4.getPaddingEnd()
            r4.setPaddingRelative(r0, r5, r2, r6)
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
            android.widget.TextView r0 = r1.f1091a
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = com.google.android.material.R.id.snackbar_text
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1091a = r0
            int r0 = com.google.android.material.R.id.snackbar_action
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
            goto L57
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.google.android.material.R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.R.dimen.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f1091a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L30
            r3 = r1
            goto L31
        L30:
            r3 = r4
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.c
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.c
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L54
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L57
        L54:
            super.onMeasure(r8, r9)
        L57:
            return
    }

    public void setMaxInlineActionWidth(int r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
