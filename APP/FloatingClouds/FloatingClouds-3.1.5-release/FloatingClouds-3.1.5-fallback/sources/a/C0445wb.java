package a;

/* JADX INFO: renamed from: a.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445wb {
    public static float a(java.lang.String[] r2, int r3) {
            r2 = r2[r3]
            float r2 = java.lang.Float.parseFloat(r2)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L12
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Motion easing control point value must be between 0 and 1; instead got: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static boolean b(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "("
            java.lang.String r2 = r2.concat(r0)
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L16
            java.lang.String r2 = ")"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static int c(android.content.Context r1, int r2, int r3) {
            android.util.TypedValue r1 = a.C0498za.a(r1, r2)
            if (r1 == 0) goto Lf
            int r2 = r1.type
            r0 = 16
            if (r2 != r0) goto Lf
            int r1 = r1.data
            return r1
        Lf:
            return r3
    }

    public static android.animation.TimeInterpolator d(android.content.Context r5, int r6, android.view.animation.Interpolator r7) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r2 = 1
            boolean r6 = r1.resolveAttribute(r6, r0, r2)
            if (r6 != 0) goto L11
            return r7
        L11:
            int r6 = r0.type
            r7 = 3
            if (r6 != r7) goto Lb5
            java.lang.CharSequence r6 = r0.string
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "cubic-bezier"
            boolean r3 = b(r6, r1)
            java.lang.String r4 = "path"
            if (r3 != 0) goto L34
            boolean r3 = b(r6, r4)
            if (r3 == 0) goto L2d
            goto L34
        L2d:
            int r6 = r0.resourceId
            android.view.animation.Interpolator r5 = android.view.animation.AnimationUtils.loadInterpolator(r5, r6)
            return r5
        L34:
            boolean r5 = b(r6, r1)
            if (r5 == 0) goto L7b
            int r5 = r6.length()
            int r5 = r5 - r2
            r0 = 13
            java.lang.String r5 = r6.substring(r0, r5)
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r0 = 4
            if (r6 != r0) goto L66
            r6 = 0
            float r6 = a(r5, r6)
            float r0 = a(r5, r2)
            r1 = 2
            float r1 = a(r5, r1)
            float r5 = a(r5, r7)
            android.view.animation.Interpolator r5 = a.C0356rc.b(r6, r0, r1, r5)
            return r5
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "
            r7.<init>(r0)
            int r5 = r5.length
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L7b:
            boolean r5 = b(r6, r4)
            if (r5 == 0) goto La9
            int r5 = r6.length()
            int r5 = r5 - r2
            r7 = 5
            java.lang.String r5 = r6.substring(r7, r5)
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            a.sc$a[] r7 = a.C0374sc.b(r5)
            a.C0374sc.a.b(r7, r6)     // Catch: java.lang.RuntimeException -> L9c
            android.view.animation.Interpolator r5 = a.C0356rc.c(r6)
            return r5
        L9c:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Error in parsing "
            java.lang.String r5 = r0.concat(r5)
            r7.<init>(r5, r6)
            throw r7
        La9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Invalid motion easing type: "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        Lb5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes."
            r5.<init>(r6)
            throw r5
    }
}
