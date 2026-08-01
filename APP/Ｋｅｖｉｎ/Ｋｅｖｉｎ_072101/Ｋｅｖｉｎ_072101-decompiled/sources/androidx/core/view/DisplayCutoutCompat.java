package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayCutoutCompat {
    private final android.view.DisplayCutout mDisplayCutout;

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Rect r1, java.util.List<android.graphics.Rect> r2) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r0.<init>(r1, r2)
                return r0
        }

        static java.util.List<android.graphics.Rect> getBoundingRects(android.view.DisplayCutout r1) {
                java.util.List r0 = r1.getBoundingRects()
                return r0
        }

        static int getSafeInsetBottom(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetBottom()
                return r0
        }

        static int getSafeInsetLeft(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetLeft()
                return r0
        }

        static int getSafeInsetRight(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetRight()
                return r0
        }

        static int getSafeInsetTop(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetTop()
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
                android.view.DisplayCutout r6 = new android.view.DisplayCutout
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12, android.graphics.Insets r13) {
                android.view.DisplayCutout r7 = new android.view.DisplayCutout
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        static android.graphics.Insets getWaterfallInsets(android.view.DisplayCutout r1) {
                android.graphics.Insets r0 = r1.getWaterfallInsets()
                return r0
        }
    }

    public DisplayCutoutCompat(android.graphics.Rect r3, java.util.List<android.graphics.Rect> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.DisplayCutout r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(r3, r4)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.<init>(r0)
            return
    }

    private DisplayCutoutCompat(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.mDisplayCutout = r1
            return
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets r2, android.graphics.Rect r3, android.graphics.Rect r4, android.graphics.Rect r5, android.graphics.Rect r6, androidx.core.graphics.Insets r7) {
            r1 = this;
            android.view.DisplayCutout r0 = constructDisplayCutout(r2, r3, r4, r5, r6, r7)
            r1.<init>(r0)
            return
    }

    private static android.view.DisplayCutout constructDisplayCutout(androidx.core.graphics.Insets r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12, androidx.core.graphics.Insets r13) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            android.graphics.Insets r2 = r8.toPlatformInsets()
            android.graphics.Insets r7 = r13.toPlatformInsets()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            android.view.DisplayCutout r0 = androidx.core.view.DisplayCutoutCompat.Api30Impl.createDisplayCutout(r2, r3, r4, r5, r6, r7)
            return r0
        L17:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L26
            android.graphics.Insets r0 = r8.toPlatformInsets()
            android.view.DisplayCutout r0 = androidx.core.view.DisplayCutoutCompat.Api29Impl.createDisplayCutout(r0, r9, r10, r11, r12)
            return r0
        L26:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L57
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r8.left
            int r2 = r8.top
            int r3 = r8.right
            int r4 = r8.bottom
            r0.<init>(r1, r2, r3, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r9 == 0) goto L43
            r1.add(r9)
        L43:
            if (r10 == 0) goto L48
            r1.add(r10)
        L48:
            if (r11 == 0) goto L4d
            r1.add(r11)
        L4d:
            if (r12 == 0) goto L52
            r1.add(r12)
        L52:
            android.view.DisplayCutout r2 = androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(r0, r1)
            return r2
        L57:
            r0 = 0
            return r0
    }

    static androidx.core.view.DisplayCutoutCompat wrap(android.view.DisplayCutout r1) {
            if (r1 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            androidx.core.view.DisplayCutoutCompat r0 = new androidx.core.view.DisplayCutoutCompat
            r0.<init>(r1)
        L9:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            if (r4 == 0) goto L1d
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r1 = r4.getClass()
            if (r0 == r1) goto L11
            goto L1d
        L11:
            r0 = r4
            androidx.core.view.DisplayCutoutCompat r0 = (androidx.core.view.DisplayCutoutCompat) r0
            android.view.DisplayCutout r1 = r3.mDisplayCutout
            android.view.DisplayCutout r2 = r0.mDisplayCutout
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r2)
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public java.util.List<android.graphics.Rect> getBoundingRects() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            java.util.List r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getBoundingRects(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public int getSafeInsetBottom() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetBottom(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetLeft() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetLeft(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetRight() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetRight(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetTop() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetTop(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public androidx.core.graphics.Insets getWaterfallInsets() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            android.graphics.Insets r0 = androidx.core.view.DisplayCutoutCompat.Api30Impl.getWaterfallInsets(r0)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
            return r0
        L11:
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisplayCutoutCompat{"
            java.lang.StringBuilder r0 = r0.append(r1)
            android.view.DisplayCutout r1 = r2.mDisplayCutout
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    android.view.DisplayCutout unwrap() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            return r0
    }
}
