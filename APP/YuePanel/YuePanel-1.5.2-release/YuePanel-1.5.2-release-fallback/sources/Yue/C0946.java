package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0946 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m5369(@Yue.InterfaceC4418 android.graphics.Canvas r1, float r2, float r3, float r4, float r5, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r6) {
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m5370(@Yue.InterfaceC4418 android.graphics.Canvas r1, int r2, int r3, int r4, int r5, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r6) {
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m5371(@Yue.InterfaceC4418 android.graphics.Canvas r1, @Yue.InterfaceC4418 android.graphics.Path r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r3) {
            int r0 = r1.save()
            r1.clipPath(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m5372(@Yue.InterfaceC4418 android.graphics.Canvas r1, @Yue.InterfaceC4418 android.graphics.Rect r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r3) {
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m5373(@Yue.InterfaceC4418 android.graphics.Canvas r1, @Yue.InterfaceC4418 android.graphics.RectF r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r3) {
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m5374(@Yue.InterfaceC4418 android.graphics.Canvas r1, @Yue.InterfaceC4418 android.graphics.Matrix r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r3) {
            int r0 = r1.save()
            r1.concat(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m5375(android.graphics.Canvas r0, android.graphics.Matrix r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L9
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
        L9:
            int r3 = r0.save()
            r0.concat(r1)
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L1d
            Yue.C3249.m13687(r4)
            r0.restoreToCount(r3)
            Yue.C3249.m13686(r4)
            return
        L1d:
            r1 = move-exception
            Yue.C3249.m13687(r4)
            r0.restoreToCount(r3)
            Yue.C3249.m13686(r4)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m5376(@Yue.InterfaceC4418 android.graphics.Canvas r1, float r2, float r3, float r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r5) {
            int r0 = r1.save()
            r1.rotate(r2, r3, r4)
            r2 = 1
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m5377(android.graphics.Canvas r1, float r2, float r3, float r4, Yue.InterfaceC2825 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L6
            r2 = r0
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r3 = r0
        Lb:
            r6 = r6 & 4
            if (r6 == 0) goto L10
            r4 = r0
        L10:
            int r6 = r1.save()
            r1.rotate(r2, r3, r4)
            r2 = 1
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L25
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r6)
            Yue.C3249.m13686(r2)
            return
        L25:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r6)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m5378(@Yue.InterfaceC4418 android.graphics.Canvas r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r3) {
            int r0 = r2.save()
            r1 = 1
            r3.invoke(r2)     // Catch: java.lang.Throwable -> L12
            Yue.C3249.m13687(r1)
            r2.restoreToCount(r0)
            Yue.C3249.m13686(r1)
            return
        L12:
            r3 = move-exception
            Yue.C3249.m13687(r1)
            r2.restoreToCount(r0)
            Yue.C3249.m13686(r1)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m5379(@Yue.InterfaceC4418 android.graphics.Canvas r1, float r2, float r3, float r4, float r5, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r6) {
            int r0 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m5380(android.graphics.Canvas r1, float r2, float r3, float r4, float r5, Yue.InterfaceC2825 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L7
            r2 = r0
        L7:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r7 = r7 & 8
            if (r7 == 0) goto L17
            r5 = r0
        L17:
            int r7 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L2c
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r7)
            Yue.C3249.m13686(r2)
            return
        L2c:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r7)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m5381(@Yue.InterfaceC4418 android.graphics.Canvas r1, float r2, float r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r4) {
            int r0 = r1.save()
            r1.skew(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m5382(android.graphics.Canvas r1, float r2, float r3, Yue.InterfaceC2825 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r3 = r0
        Lb:
            int r5 = r1.save()
            r1.skew(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L20
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r5)
            Yue.C3249.m13686(r2)
            return
        L20:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r5)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m5383(@Yue.InterfaceC4418 android.graphics.Canvas r1, float r2, float r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r4) {
            int r0 = r1.save()
            r1.translate(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            return
        L15:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r0)
            Yue.C3249.m13686(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m5384(android.graphics.Canvas r1, float r2, float r3, Yue.InterfaceC2825 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r3 = r0
        Lb:
            int r5 = r1.save()
            r1.translate(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L20
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r5)
            Yue.C3249.m13686(r2)
            return
        L20:
            r3 = move-exception
            Yue.C3249.m13687(r2)
            r1.restoreToCount(r5)
            Yue.C3249.m13686(r2)
            throw r3
    }
}
