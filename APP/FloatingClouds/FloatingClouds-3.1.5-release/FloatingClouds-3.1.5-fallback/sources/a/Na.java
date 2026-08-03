package a;

/* JADX INFO: loaded from: classes.dex */
public final class Na {
    public static int a(android.content.Context r1, int r2, int r3) {
            android.util.TypedValue r2 = a.C0498za.a(r1, r2)
            if (r2 == 0) goto L16
            int r0 = r2.resourceId
            if (r0 == 0) goto Lf
            int r1 = a.Y3.b.a(r1, r0)
            goto L11
        Lf:
            int r1 = r2.data
        L11:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1e
            int r1 = r1.intValue()
            return r1
        L1e:
            return r3
    }

    public static int b(android.view.View r2, int r3) {
            android.content.Context r0 = r2.getContext()
            android.content.Context r1 = r2.getContext()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            android.util.TypedValue r2 = a.C0498za.c(r1, r3, r2)
            int r3 = r2.resourceId
            if (r3 == 0) goto L1d
            int r2 = a.Y3.b.a(r0, r3)
            return r2
        L1d:
            int r2 = r2.data
            return r2
    }

    public static boolean c(int r21) {
            if (r21 == 0) goto Lcb
            java.lang.ThreadLocal<double[]> r1 = a.C0419v3.f730a
            java.lang.Object r2 = r1.get()
            double[] r2 = (double[]) r2
            r3 = 3
            if (r2 != 0) goto L12
            double[] r2 = new double[r3]
            r1.set(r2)
        L12:
            int r1 = android.graphics.Color.red(r21)
            int r4 = android.graphics.Color.green(r21)
            int r5 = android.graphics.Color.blue(r21)
            int r6 = r2.length
            if (r6 != r3) goto Lc3
            double r6 = (double) r1
            r8 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r6 = r6 / r8
            r10 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r12 = 4612586738352862003(0x4003333333333333, double:2.4)
            r14 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r16 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r18 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            if (r1 >= 0) goto L48
            double r6 = r6 / r18
            goto L4f
        L48:
            double r6 = r6 + r16
            double r6 = r6 / r14
            double r6 = java.lang.Math.pow(r6, r12)
        L4f:
            double r3 = (double) r4
            double r3 = r3 / r8
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto L5a
            double r3 = r3 / r18
        L57:
            r20 = 0
            goto L62
        L5a:
            double r3 = r3 + r16
            double r3 = r3 / r14
            double r3 = java.lang.Math.pow(r3, r12)
            goto L57
        L62:
            double r0 = (double) r5
            double r0 = r0 / r8
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 >= 0) goto L6b
            double r0 = r0 / r18
            goto L72
        L6b:
            double r0 = r0 + r16
            double r0 = r0 / r14
            double r0 = java.lang.Math.pow(r0, r12)
        L72:
            r8 = 4601100757863216290(0x3fda64c2f837b4a2, double:0.4124)
            double r8 = r8 * r6
            r10 = 4600113568824896677(0x3fd6e2eb1c432ca5, double:0.3576)
            double r10 = r10 * r3
            double r10 = r10 + r8
            r8 = 4595671218152458420(0x3fc71a9fbe76c8b4, double:0.1805)
            double r8 = r8 * r0
            double r8 = r8 + r10
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 * r10
            r2[r20] = r8
            r8 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r8 = r8 * r6
            r12 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r12 = r12 * r3
            double r12 = r12 + r8
            r8 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r8 = r8 * r0
            double r8 = r8 + r12
            double r8 = r8 * r10
            r5 = 1
            r2[r5] = r8
            r12 = 4581220067668151973(0x3f93c36113404ea5, double:0.0193)
            double r6 = r6 * r12
            r12 = 4593253685872485938(0x3fbe83e425aee632, double:0.1192)
            double r3 = r3 * r12
            double r3 = r3 + r6
            r6 = 4606736562436907729(0x3fee6a7ef9db22d1, double:0.9505)
            double r0 = r0 * r6
            double r0 = r0 + r3
            double r0 = r0 * r10
            r3 = 2
            r2[r3] = r0
            double r8 = r8 / r10
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lcd
            return r5
        Lc3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "outXyz must have a length of 3."
            r0.<init>(r1)
            throw r0
        Lcb:
            r20 = 0
        Lcd:
            return r20
    }

    public static int d(int r1, int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)
            int r2 = a.C0419v3.d(r2, r3)
            int r1 = a.C0419v3.b(r2, r1)
            return r1
    }
}
