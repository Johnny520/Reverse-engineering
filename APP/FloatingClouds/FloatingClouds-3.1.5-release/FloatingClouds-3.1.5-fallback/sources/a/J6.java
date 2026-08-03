package a;

/* JADX INFO: loaded from: classes.dex */
public final class J6 {

    public static class a<T> implements java.util.Comparator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Rect f135a;
        public final android.graphics.Rect b;
        public final boolean c;
        public final a.AbstractC0172h6.a d;

        public a(boolean r2, a.AbstractC0172h6.a r3) {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f135a = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.b = r0
                r1.c = r2
                r1.d = r3
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r4, T r5) {
                r3 = this;
                a.h6$a r0 = r3.d
                r0.getClass()
                a.I r4 = (a.I) r4
                android.graphics.Rect r1 = r3.f135a
                r4.f(r1)
                r0.getClass()
                a.I r5 = (a.I) r5
                android.graphics.Rect r4 = r3.b
                r5.f(r4)
                int r5 = r1.top
                int r0 = r4.top
                if (r5 >= r0) goto L1d
                goto L47
            L1d:
                if (r5 <= r0) goto L20
                goto L49
            L20:
                int r5 = r1.left
                int r0 = r4.left
                boolean r2 = r3.c
                if (r5 >= r0) goto L2b
                if (r2 == 0) goto L47
                goto L49
            L2b:
                if (r5 <= r0) goto L30
                if (r2 == 0) goto L49
                goto L47
            L30:
                int r5 = r1.bottom
                int r0 = r4.bottom
                if (r5 >= r0) goto L37
                goto L47
            L37:
                if (r5 <= r0) goto L3a
                goto L49
            L3a:
                int r5 = r1.right
                int r4 = r4.right
                if (r5 >= r4) goto L43
                if (r2 == 0) goto L47
                goto L49
            L43:
                if (r5 <= r4) goto L4b
                if (r2 == 0) goto L49
            L47:
                r4 = -1
                return r4
            L49:
                r4 = 1
                return r4
            L4b:
                r4 = 0
                return r4
        }
    }

    public static boolean a(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
            boolean r0 = b(r8, r9, r10)
            boolean r1 = b(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = d(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
    }

    public static boolean b(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L26
            r0 = 33
            if (r1 == r0) goto L19
            r0 = 66
            if (r1 == r0) goto L26
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L19:
            int r1 = r3.right
            int r0 = r2.left
            if (r1 < r0) goto L34
            int r1 = r3.left
            int r2 = r2.right
            if (r1 > r2) goto L34
            goto L32
        L26:
            int r1 = r3.bottom
            int r0 = r2.top
            if (r1 < r0) goto L34
            int r1 = r3.top
            int r2 = r2.bottom
            if (r1 > r2) goto L34
        L32:
            r1 = 1
            return r1
        L34:
            r1 = 0
            return r1
    }

    public static boolean c(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L4b
            r0 = 33
            if (r1 == r0) goto L3a
            r0 = 66
            if (r1 == r0) goto L29
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L21
            int r1 = r2.top
            int r0 = r3.top
            if (r1 < r0) goto L1a
            int r1 = r2.bottom
            if (r1 > r0) goto L5d
        L1a:
            int r1 = r2.bottom
            int r2 = r3.bottom
            if (r1 >= r2) goto L5d
            goto L5b
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L29:
            int r1 = r2.left
            int r0 = r3.left
            if (r1 < r0) goto L33
            int r1 = r2.right
            if (r1 > r0) goto L5d
        L33:
            int r1 = r2.right
            int r2 = r3.right
            if (r1 >= r2) goto L5d
            goto L5b
        L3a:
            int r1 = r2.bottom
            int r0 = r3.bottom
            if (r1 > r0) goto L44
            int r1 = r2.top
            if (r1 < r0) goto L5d
        L44:
            int r1 = r2.top
            int r2 = r3.top
            if (r1 <= r2) goto L5d
            goto L5b
        L4b:
            int r1 = r2.right
            int r0 = r3.right
            if (r1 > r0) goto L55
            int r1 = r2.left
            if (r1 < r0) goto L5d
        L55:
            int r1 = r2.left
            int r2 = r3.left
            if (r1 <= r2) goto L5d
        L5b:
            r1 = 1
            return r1
        L5d:
            r1 = 0
            return r1
    }

    public static int d(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L28
            r0 = 33
            if (r1 == r0) goto L23
            r0 = 66
            if (r1 == r0) goto L1e
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L16
            int r1 = r3.top
            int r2 = r2.bottom
        L14:
            int r1 = r1 - r2
            goto L2d
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L1e:
            int r1 = r3.left
            int r2 = r2.right
            goto L14
        L23:
            int r1 = r2.top
            int r2 = r3.bottom
            goto L14
        L28:
            int r1 = r2.left
            int r2 = r3.right
            goto L14
        L2d:
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            return r1
    }

    public static int e(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L31
            r0 = 33
            if (r1 == r0) goto L19
            r0 = 66
            if (r1 == r0) goto L31
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L19:
            int r1 = r2.left
            int r2 = r2.width()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.left
            int r3 = r3.width()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
        L31:
            int r1 = r2.top
            int r2 = r2.height()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.top
            int r3 = r3.height()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
    }
}
