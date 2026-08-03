package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1595 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ <T> T m7799(android.content.Context r2) {
            r0 = 4
            java.lang.String r1 = "T"
            Yue.C3329.m13915(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r2 = Yue.C1584.m7773(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m7800(@Yue.InterfaceC4418 android.content.Context r0, @Yue.InterfaceC6018 int r1, @Yue.InterfaceC4418 int[] r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.content.res.TypedArray, Yue.C6593> r3) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2)
            r3.invoke(r0)
            r0.recycle()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m7801(@Yue.InterfaceC4418 android.content.Context r0, @Yue.InterfaceC4543 android.util.AttributeSet r1, @Yue.InterfaceC4418 int[] r2, @Yue.InterfaceC0642 int r3, @Yue.InterfaceC6018 int r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.content.res.TypedArray, Yue.C6593> r5) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r5.invoke(r0)
            r0.recycle()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m7802(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5, Yue.InterfaceC2825 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto Lb
            r4 = r0
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            r5 = r0
        L10:
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6.invoke(r1)
            r1.recycle()
            return
    }
}
