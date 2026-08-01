package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class z50 extends AbstractC0273gt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f5456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextPaint f5457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0273gt f5458c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ a60 f5459d;

    public z50(a60 a60Var, Context context, TextPaint textPaint, AbstractC0273gt abstractC0273gt) {
        this.f5459d = a60Var;
        this.f5456a = context;
        this.f5457b = textPaint;
        this.f5458c = abstractC0273gt;
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: p */
    public final void mo1266p(int i) {
        this.f5458c.mo1266p(i);
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: q */
    public final void mo1267q(Typeface typeface, boolean z) {
        this.f5459d.m24g(this.f5456a, this.f5457b, typeface);
        this.f5458c.mo1267q(typeface, z);
    }
}
