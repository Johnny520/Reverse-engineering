package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class t40 {
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout.Alignment e;
    public int f;
    public float g;
    public int h;
    public boolean i;
    public boolean j;
    public TextUtils.TruncateAt k;

    public t40(CharSequence r1, TextPaint r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r1.length();
        this.e = Layout.Alignment.ALIGN_NORMAL;
        this.f = Integer.MAX_VALUE;
        this.g = 1.0f;
        this.h = 1;
        this.i = true;
        this.k = null;
    }

    public final StaticLayout a() {
        if (this.a != null) goto L5;
        this.a = "";
    L5:
        int r0 = Math.max(0, this.c);
        CharSequence r2 = this.a;
        int r3 = this.f;
        TextPaint r4 = this.b;
        if (r3 != 1) goto L8;
        r2 = TextUtils.ellipsize(r2, r4, r0, this.k);
    L8:
        int r32 = Math.min(r2.length(), this.d);
        this.d = r32;
        if (this.j == true) goto L11;
    L13:
        StaticLayout.Builder r02 = StaticLayout.Builder.obtain(r2, 0, r32, r4, r0);
        r02.setAlignment(this.e);
        r02.setIncludePad(this.i);
        if (this.j == false) goto L16;
        TextDirectionHeuristic r1 = TextDirectionHeuristics.RTL;
    L17:
        r02.setTextDirection(r1);
        TextUtils.TruncateAt r12 = this.k;
        if (r12 == null) goto L20;
        r02.setEllipsize(r12);
    L20:
        r02.setMaxLines(this.f);
        float r13 = this.g;
        if (r13 == 1.0f) goto L24;
        r02.setLineSpacing(0.0f, r13);
    L24:
        if (this.f <= 1) goto L27;
        r02.setHyphenationFrequency(this.h);
    L27:
        return r02.build();
    L16:
        r1 = TextDirectionHeuristics.LTR;
        goto L17
    L11:
        if (this.f != 1) goto L13;
        this.e = Layout.Alignment.ALIGN_OPPOSITE;
        goto L13
    }
}
