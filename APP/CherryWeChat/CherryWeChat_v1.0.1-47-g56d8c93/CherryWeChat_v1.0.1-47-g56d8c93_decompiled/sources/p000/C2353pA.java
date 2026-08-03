package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: pA */
/* JADX INFO: loaded from: classes.dex */
public final class C2353pA extends AbstractC0295Gu {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Context f8233n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ TextPaint f8234o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractC0295Gu f8235p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2404qA f8236q;

    public C2353pA(C2404qA c2404qA, Context context, TextPaint textPaint, AbstractC0295Gu abstractC0295Gu) {
        this.f8236q = c2404qA;
        this.f8233n = context;
        this.f8234o = textPaint;
        this.f8235p = abstractC0295Gu;
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: y */
    public final void mo632y(int i) {
        this.f8235p.mo632y(i);
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: z */
    public final void mo633z(Typeface typeface, boolean z) {
        this.f8236q.m4842f(this.f8233n, this.f8234o, typeface);
        this.f8235p.mo633z(typeface, z);
    }
}
