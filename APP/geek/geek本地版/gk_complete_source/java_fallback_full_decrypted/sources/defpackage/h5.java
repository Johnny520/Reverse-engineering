package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {
    public static android.text.StaticLayout a(java.lang.CharSequence r8, android.text.Layout.Alignment r9, int r10, android.widget.TextView r11, android.text.TextPaint r12) {
            float r5 = r11.getLineSpacingMultiplier()
            float r6 = r11.getLineSpacingExtra()
            boolean r7 = r11.getIncludeFontPadding()
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r1 = r8
            r4 = r9
            r3 = r10
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static int b(android.widget.TextView r0) {
            int r0 = r0.getMaxLines()
            return r0
    }
}
