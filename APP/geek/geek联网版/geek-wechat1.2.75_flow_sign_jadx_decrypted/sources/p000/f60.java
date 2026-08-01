package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class f60 extends AbstractC0387ju {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f1746c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextPaint f1747d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0387ju f1748e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ g60 f1749f;

    public f60(g60 g60Var, Context context, TextPaint textPaint, AbstractC0387ju abstractC0387ju) {
        this.f1749f = g60Var;
        this.f1746c = context;
        this.f1747d = textPaint;
        this.f1748e = abstractC0387ju;
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: r */
    public final void mo1073r(int i) {
        this.f1748e.mo1073r(i);
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: s */
    public final void mo1074s(Typeface typeface, boolean z) {
        this.f1749f.m1169g(this.f1746c, this.f1747d, typeface);
        this.f1748e.mo1074s(typeface, z);
    }
}
