package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲇᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0524 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f1912;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f1913;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.lang.Object f1914;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f1915;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Object f1916;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.lang.Object f1917;

    public C0524(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1915 = r0
            r1.f1912 = r2
            android.graphics.PorterDuff$Mode r2 = xhss.C0150.f629
            java.lang.Class<xhss.ᛲᛳᲈᛲ> r2 = xhss.C0150.class
            monitor-enter(r2)
            xhss.ᛲᛳᲈᛲ r0 = xhss.C0150.f630     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            xhss.C0150.m393()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L1d
        L17:
            xhss.ᛲᛳᲈᛲ r0 = xhss.C0150.f630     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            r1.f1913 = r0
            return
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    public C0524(xhss.C0524 r8, xhss.C0985 r9, xhss.C0985 r10) {
            r7 = this;
            java.lang.Object r0 = r8.f1916
            r4 = r0
            xhss.ᲁᲁᛱᲀ r4 = (xhss.C0985) r4
            int r5 = r8.f1915
            java.lang.Object r0 = r8.f1914
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r1 = r7
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = r8.f1917
            xhss.ᛵᲇᲇᲇ r7 = (xhss.C0524) r7
            r1.f1917 = r7
            return
    }

    public C0524(xhss.C0985 r1, xhss.C0985 r2, xhss.C0985 r3, int r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f1912 = r1
            r0.f1913 = r2
            r0.f1916 = r3
            r0.f1915 = r4
            r0.f1914 = r5
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static xhss.C0524 m936(xhss.C0524 r7, xhss.C0985 r8, xhss.C0985 r9) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            java.lang.Object r0 = r7.f1912
            xhss.ᲁᲁᛱᲀ r0 = (xhss.C0985) r0
            java.lang.Object r1 = r7.f1917
            xhss.ᛵᲇᲇᲇ r1 = (xhss.C0524) r1
            xhss.ᛵᲇᲇᲇ r1 = m936(r1, r8, r9)
            r7.f1917 = r1
            int r2 = r0.f3205
            java.lang.Object r3 = r7.f1913
            xhss.ᲁᲁᛱᲀ r3 = (xhss.C0985) r3
            int r4 = r3.f3205
            int r5 = r8.f3205
            if (r9 != 0) goto L22
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L24
        L22:
            int r6 = r9.f3205
        L24:
            if (r5 >= r4) goto L49
            if (r6 > r2) goto L29
            goto L49
        L29:
            if (r5 > r2) goto L34
            if (r6 < r4) goto L2e
            return r1
        L2e:
            xhss.ᛵᲇᲇᲇ r8 = new xhss.ᛵᲇᲇᲇ
            r8.<init>(r7, r9, r3)
            return r8
        L34:
            if (r6 < r4) goto L3c
            xhss.ᛵᲇᲇᲇ r9 = new xhss.ᛵᲇᲇᲇ
            r9.<init>(r7, r0, r8)
            return r9
        L3c:
            xhss.ᛵᲇᲇᲇ r1 = new xhss.ᛵᲇᲇᲇ
            r1.<init>(r7, r9, r3)
            r7.f1917 = r1
            xhss.ᛵᲇᲇᲇ r9 = new xhss.ᛵᲇᲇᲇ
            r9.<init>(r7, r0, r8)
            return r9
        L49:
            return r7
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public void m937(android.util.AttributeSet r11, int r12) {
            r10 = this;
            java.lang.Object r0 = r10.f1912
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r1 = r0.getContext()
            int[] r4 = xhss.AbstractC0293.f1129
            r9 = 0
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r11, r4, r12, r9)
            java.lang.Object r2 = r10.f1912
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = r2.getContext()
            int r5 = xhss.AbstractC0624.f2154
            r8 = 0
            r5 = r11
            r7 = r12
            xhss.AbstractC0413.m802(r2, r3, r4, r5, r6, r7, r8)
            boolean r11 = r6.hasValue(r9)     // Catch: java.lang.Throwable -> L44
            r12 = -1
            if (r11 == 0) goto L4b
            int r11 = r6.getResourceId(r9, r12)     // Catch: java.lang.Throwable -> L44
            r10.f1915 = r11     // Catch: java.lang.Throwable -> L44
            java.lang.Object r11 = r10.f1913     // Catch: java.lang.Throwable -> L44
            xhss.ᛲᛳᲈᛲ r11 = (xhss.C0150) r11     // Catch: java.lang.Throwable -> L44
            android.content.Context r2 = r0.getContext()     // Catch: java.lang.Throwable -> L44
            int r3 = r10.f1915     // Catch: java.lang.Throwable -> L44
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L44
            xhss.ᛱᲈᲁᛴ r4 = r11.f631     // Catch: java.lang.Throwable -> L47
            android.content.res.ColorStateList r2 = r4.m317(r2, r3)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L4b
            r10.m939(r2)     // Catch: java.lang.Throwable -> L44
            goto L4b
        L44:
            r0 = move-exception
            r10 = r0
            goto L82
        L47:
            r0 = move-exception
            r10 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L47
            throw r10     // Catch: java.lang.Throwable -> L44
        L4b:
            r10 = 1
            boolean r11 = r6.hasValue(r10)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L6c
            boolean r11 = r6.hasValue(r10)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L65
            int r11 = r6.getResourceId(r10, r9)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L65
            android.content.res.ColorStateList r11 = xhss.C0614.m1064(r1, r11)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L65
            goto L69
        L65:
            android.content.res.ColorStateList r11 = r6.getColorStateList(r10)     // Catch: java.lang.Throwable -> L44
        L69:
            r0.setBackgroundTintList(r11)     // Catch: java.lang.Throwable -> L44
        L6c:
            r10 = 2
            boolean r11 = r6.hasValue(r10)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L7e
            int r10 = r6.getInt(r10, r12)     // Catch: java.lang.Throwable -> L44
            android.graphics.PorterDuff$Mode r10 = xhss.AbstractC0365.m718(r10)     // Catch: java.lang.Throwable -> L44
            r0.setBackgroundTintMode(r10)     // Catch: java.lang.Throwable -> L44
        L7e:
            r6.recycle()
            return
        L82:
            r6.recycle()
            throw r10
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public void m938() {
            r5 = this;
            java.lang.Object r0 = r5.f1912
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L6f
            java.lang.Object r2 = r5.f1916
            xhss.ᛵᛳᛱᲇ r2 = (xhss.C0451) r2
            if (r2 == 0) goto L50
            java.lang.Object r2 = r5.f1917
            xhss.ᛵᛳᛱᲇ r2 = (xhss.C0451) r2
            if (r2 != 0) goto L1d
            xhss.ᛵᛳᛱᲇ r2 = new xhss.ᛵᛳᛱᲇ
            r2.<init>()
            r5.f1917 = r2
        L1d:
            r3 = 0
            r2.f1631 = r3
            r4 = 0
            r2.f1630 = r4
            r2.f1633 = r3
            r2.f1632 = r4
            int r3 = xhss.AbstractC0624.f2154
            android.content.res.ColorStateList r3 = r0.getBackgroundTintList()
            r4 = 1
            if (r3 == 0) goto L34
            r2.f1630 = r4
            r2.f1631 = r3
        L34:
            android.graphics.PorterDuff$Mode r3 = r0.getBackgroundTintMode()
            if (r3 == 0) goto L3e
            r2.f1632 = r4
            r2.f1633 = r3
        L3e:
            boolean r3 = r2.f1630
            if (r3 != 0) goto L46
            boolean r3 = r2.f1632
            if (r3 == 0) goto L50
        L46:
            int[] r5 = r0.getDrawableState()
            android.graphics.PorterDuff$Mode r0 = xhss.C0150.f629
            xhss.C0117.m311(r1, r2, r5)
            return
        L50:
            java.lang.Object r2 = r5.f1914
            xhss.ᛵᛳᛱᲇ r2 = (xhss.C0451) r2
            if (r2 == 0) goto L60
            int[] r5 = r0.getDrawableState()
            android.graphics.PorterDuff$Mode r0 = xhss.C0150.f629
            xhss.C0117.m311(r1, r2, r5)
            return
        L60:
            java.lang.Object r5 = r5.f1916
            xhss.ᛵᛳᛱᲇ r5 = (xhss.C0451) r5
            if (r5 == 0) goto L6f
            int[] r0 = r0.getDrawableState()
            android.graphics.PorterDuff$Mode r2 = xhss.C0150.f629
            xhss.C0117.m311(r1, r5, r0)
        L6f:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public void m939(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            java.lang.Object r0 = r1.f1916
            xhss.ᛵᛳᛱᲇ r0 = (xhss.C0451) r0
            if (r0 != 0) goto Lf
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r1.f1916 = r0
        Lf:
            r0.f1631 = r2
            r2 = 1
            r0.f1630 = r2
            goto L18
        L15:
            r2 = 0
            r1.f1916 = r2
        L18:
            r1.m938()
            return
    }
}
