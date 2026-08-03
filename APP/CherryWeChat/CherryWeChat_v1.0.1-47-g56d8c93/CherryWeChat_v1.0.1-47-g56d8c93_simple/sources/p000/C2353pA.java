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

    public C2353pA(C2404qA r1, Context r2, TextPaint r3, AbstractC0295Gu r4) {
        this.f8236q = r1;
        this.f8233n = r2;
        this.f8234o = r3;
        this.f8235p = r4;
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: y */
    public final void mo632y(int r2) {
        this.f8235p.mo632y(r2);
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: z */
    public final void mo633z(Typeface r4, boolean r5) {
        Context r0 = this.f8233n;
        TextPaint r1 = this.f8234o;
        this.f8236q.m4842f(r0, r1, r4);
        this.f8235p.mo633z(r4, r5);
    }
}
