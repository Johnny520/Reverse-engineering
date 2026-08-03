package a;

/* JADX INFO: renamed from: a.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0412ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f714a;
    public final android.text.TextPaint b;
    public final int c;
    public int d;
    public android.text.Layout.Alignment e;
    public int f;
    public float g;
    public int h;
    public boolean i;
    public boolean j;
    public android.text.TextUtils.TruncateAt k;

    /* JADX INFO: renamed from: a.ue$a */
    public static class a extends java.lang.Exception {
    }

    public C0412ue(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f714a = r1
            r0.b = r2
            r0.c = r3
            int r1 = r1.length()
            r0.d = r1
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r0.e = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.g = r1
            r1 = 1
            r0.h = r1
            r0.i = r1
            r1 = 0
            r0.k = r1
            return
    }

    public final android.text.StaticLayout a() {
            r7 = this;
            java.lang.CharSequence r0 = r7.f714a
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
            r7.f714a = r0
        L8:
            r0 = 0
            int r1 = r7.c
            int r1 = java.lang.Math.max(r0, r1)
            java.lang.CharSequence r2 = r7.f714a
            int r3 = r7.f
            android.text.TextPaint r4 = r7.b
            r5 = 1
            if (r3 != r5) goto L1f
            float r3 = (float) r1
            android.text.TextUtils$TruncateAt r6 = r7.k
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r4, r3, r6)
        L1f:
            int r3 = r2.length()
            int r6 = r7.d
            int r3 = java.lang.Math.min(r3, r6)
            r7.d = r3
            boolean r6 = r7.j
            if (r6 == 0) goto L37
            int r6 = r7.f
            if (r6 != r5) goto L37
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r7.e = r6
        L37:
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r2, r0, r3, r4, r1)
            android.text.Layout$Alignment r1 = r7.e
            r0.setAlignment(r1)
            boolean r1 = r7.i
            r0.setIncludePad(r1)
            boolean r1 = r7.j
            if (r1 == 0) goto L4c
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.RTL
            goto L4e
        L4c:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LTR
        L4e:
            r0.setTextDirection(r1)
            android.text.TextUtils$TruncateAt r1 = r7.k
            if (r1 == 0) goto L58
            r0.setEllipsize(r1)
        L58:
            int r1 = r7.f
            r0.setMaxLines(r1)
            float r1 = r7.g
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L69
            r2 = 0
            r0.setLineSpacing(r2, r1)
        L69:
            int r1 = r7.f
            if (r1 <= r5) goto L72
            int r1 = r7.h
            r0.setHyphenationFrequency(r1)
        L72:
            android.text.StaticLayout r0 = r0.build()
            return r0
    }
}
