package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
public final class C5844 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m21728(@Yue.InterfaceC4418 android.text.Spannable r4) {
            int r0 = r4.length()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            java.lang.Object[] r0 = r4.getSpans(r2, r0, r1)
            int r1 = r0.length
        Lc:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            r4.removeSpan(r3)
            int r2 = r2 + 1
            goto Lc
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m21729(@Yue.InterfaceC4418 android.text.Spannable r1, int r2, int r3, @Yue.InterfaceC4418 java.lang.Object r4) {
            r0 = 17
            r1.setSpan(r4, r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m21730(@Yue.InterfaceC4418 android.text.Spannable r2, @Yue.InterfaceC4418 Yue.C3279 r3, @Yue.InterfaceC4418 java.lang.Object r4) {
            java.lang.Integer r0 = r3.m13748()
            int r0 = r0.intValue()
            java.lang.Integer r3 = r3.m13747()
            int r3 = r3.intValue()
            r1 = 17
            r2.setSpan(r4, r0, r3, r1)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.text.Spannable m21731(@Yue.InterfaceC4418 java.lang.CharSequence r0) {
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            return r0
    }
}
