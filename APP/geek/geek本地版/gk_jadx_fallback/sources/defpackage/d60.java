package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d60 {
    public final android.text.TextPaint a;
    public final defpackage.ha b;
    public float c;
    public boolean d;
    public final java.lang.ref.WeakReference e;
    public defpackage.a60 f;

    public d60(defpackage.ka r4) {
            r3 = this;
            r3.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 1
            r0.<init>(r1)
            r3.a = r0
            ha r0 = new ha
            r2 = 1
            r0.<init>(r2, r3)
            r3.b = r0
            r3.d = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r3.e = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.e = r0
            return
    }

    public final float a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.d
            if (r0 != 0) goto L7
            float r4 = r3.c
            return r4
        L7:
            r0 = 0
            android.text.TextPaint r1 = r3.a
            if (r4 != 0) goto Le
            r2 = 0
            goto L16
        Le:
            int r2 = r4.length()
            float r2 = r1.measureText(r4, r0, r2)
        L16:
            r3.c = r2
            if (r4 != 0) goto L1b
            goto L24
        L1b:
            android.graphics.Paint$FontMetrics r4 = r1.getFontMetrics()
            float r4 = r4.ascent
            java.lang.Math.abs(r4)
        L24:
            r3.d = r0
            float r4 = r3.c
            return r4
    }
}
