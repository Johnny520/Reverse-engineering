package a;

/* JADX INFO: loaded from: classes.dex */
public final class Va extends a.C0345r1 {
    public static int h(android.content.Context r7, android.content.res.TypedArray r8, int... r9) {
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r9.length
            if (r2 >= r4) goto L3a
            if (r3 >= 0) goto L3a
            r3 = r9[r2]
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            boolean r5 = r8.getValue(r3, r4)
            if (r5 == 0) goto L33
            int r5 = r4.type
            r6 = 2
            if (r5 == r6) goto L1c
            goto L33
        L1c:
            android.content.res.Resources$Theme r3 = r7.getTheme()
            int r4 = r4.data
            int[] r4 = new int[]{r4}
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            int r4 = r3.getDimensionPixelSize(r1, r0)
            r3.recycle()
            r3 = r4
            goto L37
        L33:
            int r3 = r8.getDimensionPixelSize(r3, r0)
        L37:
            int r2 = r2 + 1
            goto L4
        L3a:
            return r3
    }

    @Override // a.C0345r1, android.widget.TextView
    public final void setTextAppearance(android.content.Context r3, int r4) {
            r2 = this;
            super.setTextAppearance(r3, r4)
            int r0 = com.google.android.material.R.attr.textAppearanceLineHeightEnabled
            r1 = 1
            boolean r0 = a.C0498za.b(r3, r0, r1)
            if (r0 == 0) goto L2e
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int[] r0 = com.google.android.material.R.styleable.MaterialTextAppearance
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight
            int r1 = com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight
            int[] r0 = new int[]{r0, r1}
            int r4 = h(r4, r3, r0)
            r3.recycle()
            if (r4 < 0) goto L2e
            r2.setLineHeight(r4)
        L2e:
            return
    }
}
