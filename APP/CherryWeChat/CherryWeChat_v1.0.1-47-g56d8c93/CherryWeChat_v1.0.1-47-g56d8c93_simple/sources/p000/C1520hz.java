package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: hz */
/* JADX INFO: loaded from: classes.dex */
public final class C1520hz {

    /* JADX INFO: renamed from: a */
    public CharSequence f5377a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f5378b;

    /* JADX INFO: renamed from: c */
    public final int f5379c;

    /* JADX INFO: renamed from: d */
    public int f5380d;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f5381e;

    /* JADX INFO: renamed from: f */
    public int f5382f;

    /* JADX INFO: renamed from: g */
    public float f5383g;

    /* JADX INFO: renamed from: h */
    public float f5384h;

    /* JADX INFO: renamed from: i */
    public int f5385i;

    /* JADX INFO: renamed from: j */
    public boolean f5386j;

    /* JADX INFO: renamed from: k */
    public boolean f5387k;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f5388l;

    /* JADX INFO: renamed from: m */
    public C2464rl f5389m;

    public C1520hz(CharSequence r1, TextPaint r2, int r3) {
        this.f5377a = r1;
        this.f5378b = r2;
        this.f5379c = r3;
        this.f5380d = r1.length();
        this.f5381e = Layout.Alignment.ALIGN_NORMAL;
        this.f5382f = Integer.MAX_VALUE;
        this.f5383g = 0.0f;
        this.f5384h = 1.0f;
        this.f5385i = 1;
        this.f5386j = true;
        this.f5388l = null;
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m2900a() {
        if (this.f5377a != null) goto L5;
        this.f5377a = "";
    L5:
        int r0 = Math.max(0, this.f5379c);
        CharSequence r2 = this.f5377a;
        int r3 = this.f5382f;
        TextPaint r4 = this.f5378b;
        if (r3 != 1) goto L8;
        r2 = TextUtils.ellipsize(r2, r4, r0, this.f5388l);
    L8:
        int r32 = Math.min(r2.length(), this.f5380d);
        this.f5380d = r32;
        if (this.f5387k == true) goto L11;
    L13:
        StaticLayout.Builder r02 = StaticLayout.Builder.obtain(r2, 0, r32, r4, r0);
        r02.setAlignment(this.f5381e);
        r02.setIncludePad(this.f5386j);
        if (this.f5387k == false) goto L16;
        TextDirectionHeuristic r1 = TextDirectionHeuristics.RTL;
    L17:
        r02.setTextDirection(r1);
        TextUtils.TruncateAt r12 = this.f5388l;
        if (r12 == null) goto L20;
        r02.setEllipsize(r12);
    L20:
        r02.setMaxLines(this.f5382f);
        float r13 = this.f5383g;
        if (r13 == 0.0f) goto L23;
    L24:
        r02.setLineSpacing(r13, this.f5384h);
    L26:
        if (this.f5382f <= 1) goto L28;
        r02.setHyphenationFrequency(this.f5385i);
    L28:
        C2464rl r14 = this.f5389m;
        if (r14 == null) goto L32;
        r02.setBreakStrategy(((TextInputLayout) r14.f8687b).f4657u.getBreakStrategy());
    L32:
        return r02.build();
    L23:
        if (this.f5384h == 1.0f) goto L26;
    L16:
        r1 = TextDirectionHeuristics.LTR;
        goto L17
    L11:
        if (this.f5382f != 1) goto L13;
        this.f5381e = Layout.Alignment.ALIGN_OPPOSITE;
        goto L13
    }
}
