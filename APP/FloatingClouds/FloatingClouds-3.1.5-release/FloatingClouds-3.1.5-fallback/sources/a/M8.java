package a;

/* JADX INFO: loaded from: classes.dex */
public final class M8 {
    public static void a(com.google.android.material.textfield.TextInputLayout r5, com.google.android.material.internal.CheckableImageButton r6, android.content.res.ColorStateList r7, android.graphics.PorterDuff.Mode r8) {
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r7 == 0) goto L37
            boolean r1 = r7.isStateful()
            if (r1 == 0) goto L37
            int[] r5 = r5.getDrawableState()
            int[] r1 = r6.getDrawableState()
            int r2 = r5.length
            int r3 = r5.length
            int r4 = r1.length
            int r3 = r3 + r4
            int[] r5 = java.util.Arrays.copyOf(r5, r3)
            r3 = 0
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r3, r5, r2, r4)
            int r1 = r7.getDefaultColor()
            int r5 = r7.getColorForState(r5, r1)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            a.C0439w5.a.h(r0, r5)
            goto L3a
        L37:
            a.C0439w5.a.h(r0, r7)
        L3a:
            if (r8 == 0) goto L3f
            a.C0439w5.a.i(r0, r8)
        L3f:
            android.graphics.drawable.Drawable r5 = r6.getDrawable()
            if (r5 == r0) goto L48
            r6.setImageDrawable(r0)
        L48:
            return
    }

    public static android.widget.ImageView.ScaleType b(int r1) {
            if (r1 == 0) goto L23
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 5
            if (r1 == r0) goto L17
            r0 = 6
            if (r1 == r0) goto L14
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            return r1
        L14:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            return r1
        L17:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            return r1
        L1a:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            return r1
        L1d:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            return r1
        L20:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START
            return r1
        L23:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            return r1
    }

    public static void c(com.google.android.material.textfield.TextInputLayout r5, com.google.android.material.internal.CheckableImageButton r6, android.content.res.ColorStateList r7) {
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            android.graphics.drawable.Drawable r1 = r6.getDrawable()
            if (r1 == 0) goto L3e
            if (r7 == 0) goto L3e
            boolean r1 = r7.isStateful()
            if (r1 != 0) goto L13
            goto L3e
        L13:
            int[] r5 = r5.getDrawableState()
            int[] r1 = r6.getDrawableState()
            int r2 = r5.length
            int r3 = r5.length
            int r4 = r1.length
            int r3 = r3 + r4
            int[] r5 = java.util.Arrays.copyOf(r5, r3)
            r3 = 0
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r3, r5, r2, r4)
            int r1 = r7.getDefaultColor()
            int r5 = r7.getColorForState(r5, r1)
            android.graphics.drawable.Drawable r7 = r0.mutate()
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            a.C0439w5.a.h(r7, r5)
            r6.setImageDrawable(r7)
        L3e:
            return
    }

    public static void d(com.google.android.material.internal.CheckableImageButton r3, android.view.View.OnLongClickListener r4) {
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r3.hasOnClickListeners()
            r1 = 0
            r2 = 1
            if (r4 == 0) goto Lc
            r4 = r2
            goto Ld
        Lc:
            r4 = r1
        Ld:
            if (r0 != 0) goto L11
            if (r4 == 0) goto L12
        L11:
            r1 = r2
        L12:
            r3.setFocusable(r1)
            r3.setClickable(r0)
            r3.setPressable(r0)
            r3.setLongClickable(r4)
            if (r1 == 0) goto L21
            goto L22
        L21:
            r2 = 2
        L22:
            r3.setImportantForAccessibility(r2)
            return
    }
}
