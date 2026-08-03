package p081s0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: s0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1073g {

    /* JADX INFO: renamed from: a */
    public CharSequence f4160a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f4161b;

    /* JADX INFO: renamed from: c */
    public final int f4162c;

    /* JADX INFO: renamed from: d */
    public int f4163d;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f4164e;

    /* JADX INFO: renamed from: f */
    public int f4165f;

    /* JADX INFO: renamed from: g */
    public float f4166g;

    /* JADX INFO: renamed from: h */
    public float f4167h;

    /* JADX INFO: renamed from: i */
    public int f4168i;

    /* JADX INFO: renamed from: j */
    public boolean f4169j;

    /* JADX INFO: renamed from: k */
    public boolean f4170k;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f4171l;

    public C1073g(CharSequence r1, TextPaint r2, int r3) {
        this.f4160a = r1;
        this.f4161b = r2;
        this.f4162c = r3;
        this.f4163d = r1.length();
        this.f4164e = Layout.Alignment.ALIGN_NORMAL;
        this.f4165f = Integer.MAX_VALUE;
        this.f4166g = 0.0f;
        this.f4167h = 1.0f;
        this.f4168i = 1;
        this.f4169j = true;
        this.f4171l = null;
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m2551a() {
        if (this.f4160a != null) goto L5;
        this.f4160a = "";
    L5:
        int r02 = Math.max(0, this.f4162c);
        CharSequence r2 = this.f4160a;
        int r3 = this.f4165f;
        TextPaint r4 = this.f4161b;
        if (r3 != 1) goto L8;
        r2 = TextUtils.ellipsize(r2, r4, r02, this.f4171l);
    L8:
        int r32 = Math.min(r2.length(), this.f4163d);
        this.f4163d = r32;
        if (this.f4170k == true) goto L11;
    L13:
        StaticLayout.Builder r03 = StaticLayout.Builder.obtain(r2, 0, r32, r4, r02);
        r03.setAlignment(this.f4164e);
        r03.setIncludePad(this.f4169j);
        if (this.f4170k == false) goto L16;
        TextDirectionHeuristic r1 = TextDirectionHeuristics.RTL;
    L17:
        r03.setTextDirection(r1);
        TextUtils.TruncateAt r12 = this.f4171l;
        if (r12 == null) goto L20;
        r03.setEllipsize(r12);
    L20:
        r03.setMaxLines(this.f4165f);
        float r13 = this.f4166g;
        if (r13 == 0.0f) goto L23;
    L24:
        r03.setLineSpacing(r13, this.f4167h);
    L26:
        if (this.f4165f <= 1) goto L29;
        r03.setHyphenationFrequency(this.f4168i);
    L29:
        return r03.build();
    L23:
        if (this.f4167h == 1.0f) goto L26;
    L16:
        r1 = TextDirectionHeuristics.LTR;
        goto L17
    L11:
        if (this.f4165f != 1) goto L13;
        this.f4164e = Layout.Alignment.ALIGN_OPPOSITE;
        goto L13
    }
}
