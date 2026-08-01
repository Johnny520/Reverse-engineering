package defpackage;

/* JADX INFO: renamed from: ᛳᲇᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0568 implements defpackage.InterfaceC1901, defpackage.InterfaceC0655 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2818;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable f2819;

    public C0568(android.graphics.drawable.Drawable r1, int r2) {
            r0 = this;
            r0.f2818 = r2
            r0.<init>()
            java.lang.String r2 = "Argument must not be null"
            defpackage.C0292.m944(r1, r2)
            r0.f2819 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m1366() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC1901
    public final java.lang.Object get() {
            r1 = this;
            android.graphics.drawable.Drawable r1 = r1.f2819
            android.graphics.drawable.Drawable$ConstantState r0 = r1.getConstantState()
            if (r0 != 0) goto L9
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = r0.newDrawable()
            return r1
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo692() {
            r6 = this;
            int r0 = r6.f2818
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            android.graphics.drawable.Drawable r6 = r6.f2819
            ᛶᛴᲁᛱ r6 = (defpackage.C1064) r6
            r6.stop()
            r0 = 1
            r6.f4722 = r0
            ᛲᛱᲀᲈ r6 = r6.f4720
            ᛲᲀᲁᛲ r6 = r6.f1435
            ᲈᛲᛵᲀ r1 = r6.f1824
            java.util.ArrayList r2 = r6.f1825
            r2.clear()
            android.graphics.Bitmap r2 = r6.f1819
            r3 = 0
            if (r2 == 0) goto L27
            ᛸᲈᲇᲁ r4 = r6.f1822
            r4.mo1257(r2)
            r6.f1819 = r3
        L27:
            r2 = 0
            r6.f1830 = r2
            ᛱᲁᲇᛵ r2 = r6.f1820
            if (r2 == 0) goto L33
            r1.m3583(r2)
            r6.f1820 = r3
        L33:
            ᛱᲁᲇᛵ r2 = r6.f1818
            if (r2 == 0) goto L3c
            r1.m3583(r2)
            r6.f1818 = r3
        L3c:
            ᛱᲁᲇᛵ r2 = r6.f1823
            if (r2 == 0) goto L45
            r1.m3583(r2)
            r6.f1823 = r3
        L45:
            ᛱᛷᛴᛷ r1 = r6.f1826
            ᛴᛵᲇᲇ r2 = r1.f1048
            r1.f1040 = r3
            byte[] r4 = r1.f1041
            if (r4 == 0) goto L59
            java.lang.Object r5 = r2.f3285
            ᲇᛶᛳᛱ r5 = (defpackage.C2063) r5
            if (r5 != 0) goto L56
            goto L59
        L56:
            r5.m3468(r4)
        L59:
            int[] r4 = r1.f1050
            if (r4 == 0) goto L67
            java.lang.Object r5 = r2.f3285
            ᲇᛶᛳᛱ r5 = (defpackage.C2063) r5
            if (r5 != 0) goto L64
            goto L67
        L64:
            r5.m3468(r4)
        L67:
            android.graphics.Bitmap r4 = r1.f1046
            if (r4 == 0) goto L72
            java.lang.Object r5 = r2.f3286
            ᛸᲈᲇᲁ r5 = (defpackage.InterfaceC1612) r5
            r5.mo1257(r4)
        L72:
            r1.f1046 = r3
            r1.f1047 = r3
            r1.f1044 = r3
            byte[] r1 = r1.f1045
            if (r1 == 0) goto L86
            java.lang.Object r2 = r2.f3285
            ᲇᛶᛳᛱ r2 = (defpackage.C2063) r2
            if (r2 != 0) goto L83
            goto L86
        L83:
            r2.m3468(r1)
        L86:
            r6.f1827 = r0
            return
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.lang.Class mo693() {
            r1 = this;
            int r0 = r1.f2818
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            android.graphics.drawable.Drawable r1 = r1.f2819
            java.lang.Class r1 = r1.getClass()
            return r1
        Lc:
            java.lang.Class<ᛶᛴᲁᛱ> r1 = defpackage.C1064.class
            return r1
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final int mo694() {
            r3 = this;
            int r0 = r3.f2818
            android.graphics.drawable.Drawable r3 = r3.f2819
            switch(r0) {
                case 0: goto L18;
                default: goto L7;
            }
        L7:
            int r0 = r3.getIntrinsicWidth()
            int r3 = r3.getIntrinsicHeight()
            int r3 = r3 * r0
            int r3 = r3 * 4
            r0 = 1
            int r3 = java.lang.Math.max(r0, r3)
            return r3
        L18:
            ᛶᛴᲁᛱ r3 = (defpackage.C1064) r3
            ᛲᛱᲀᲈ r3 = r3.f4720
            ᛲᲀᲁᛲ r3 = r3.f1435
            ᛱᛷᛴᛷ r0 = r3.f1826
            java.nio.ByteBuffer r1 = r0.f1047
            int r1 = r1.limit()
            byte[] r2 = r0.f1041
            int r2 = r2.length
            int r1 = r1 + r2
            int[] r0 = r0.f1050
            int r0 = r0.length
            int r0 = r0 * 4
            int r0 = r0 + r1
            int r3 = r3.f1828
            int r0 = r0 + r3
            return r0
    }

    @Override // defpackage.InterfaceC0655
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public void mo695() {
            r1 = this;
            int r0 = r1.f2818
            android.graphics.drawable.Drawable r1 = r1.f2819
            switch(r0) {
                case 0: goto L25;
                default: goto L7;
            }
        L7:
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L15
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            r1.prepareToDraw()
            goto L24
        L15:
            boolean r0 = r1 instanceof defpackage.C1064
            if (r0 == 0) goto L24
            ᛶᛴᲁᛱ r1 = (defpackage.C1064) r1
            ᛲᛱᲀᲈ r1 = r1.f4720
            ᛲᲀᲁᛲ r1 = r1.f1435
            android.graphics.Bitmap r1 = r1.f1819
            r1.prepareToDraw()
        L24:
            return
        L25:
            ᛶᛴᲁᛱ r1 = (defpackage.C1064) r1
            ᛲᛱᲀᲈ r1 = r1.f4720
            ᛲᲀᲁᛲ r1 = r1.f1435
            android.graphics.Bitmap r1 = r1.f1819
            r1.prepareToDraw()
            return
    }
}
