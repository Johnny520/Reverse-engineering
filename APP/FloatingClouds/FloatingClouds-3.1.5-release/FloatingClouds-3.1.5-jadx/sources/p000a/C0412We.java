package p000a;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: a.We */
/* JADX INFO: loaded from: classes.dex */
public final class C0412We extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f1573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextPaint f1574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0472a2 f1575c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0394Ve f1576d;

    public C0412We(C0394Ve c0394Ve, Context context, TextPaint textPaint, AbstractC0472a2 abstractC0472a2) {
        this.f1576d = c0394Ve;
        this.f1573a = context;
        this.f1574b = textPaint;
        this.f1575c = abstractC0472a2;
    }

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: d */
    public final void mo456d(int i) {
        this.f1575c.mo456d(i);
    }

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: e */
    public final void mo457e(Typeface typeface, boolean z) {
        this.f1576d.m1035g(this.f1573a, this.f1574b, typeface);
        this.f1575c.mo457e(typeface, z);
    }
}
