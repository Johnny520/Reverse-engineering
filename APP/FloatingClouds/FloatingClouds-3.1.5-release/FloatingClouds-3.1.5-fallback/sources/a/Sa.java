package a;

/* JADX INFO: loaded from: classes.dex */
public final class Sa {
    public static android.content.res.ColorStateList a(android.content.Context r2, a.C0306of r3, int r4) {
            android.content.res.TypedArray r0 = r3.b
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L16
            r1 = 0
            int r0 = r0.getResourceId(r4, r1)
            if (r0 == 0) goto L16
            android.content.res.ColorStateList r2 = a.Y3.a(r2, r0)
            if (r2 == 0) goto L16
            return r2
        L16:
            android.content.res.ColorStateList r2 = r3.a(r4)
            return r2
    }

    public static android.content.res.ColorStateList b(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = a.Y3.a(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
    }

    public static android.graphics.drawable.Drawable c(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r1 = a.C0435w1.A(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
    }

    public static boolean d(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0 = 1067869798(0x3fa66666, float:1.3)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }
}
