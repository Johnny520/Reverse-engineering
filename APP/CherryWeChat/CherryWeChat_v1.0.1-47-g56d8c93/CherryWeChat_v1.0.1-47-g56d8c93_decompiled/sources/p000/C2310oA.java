package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: oA */
/* JADX INFO: loaded from: classes.dex */
public final class C2310oA extends AbstractC0585Nj {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC0295Gu f8152j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2404qA f8153k;

    public C2310oA(C2404qA c2404qA, AbstractC0295Gu abstractC0295Gu) {
        this.f8153k = c2404qA;
        this.f8152j = abstractC0295Gu;
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: I */
    public final void mo1159I(int i) {
        this.f8153k.f8435n = true;
        this.f8152j.mo632y(i);
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: J */
    public final void mo1160J(Typeface typeface) {
        C2404qA c2404qA = this.f8153k;
        c2404qA.f8437p = Typeface.create(typeface, c2404qA.f8425d);
        c2404qA.f8435n = true;
        this.f8152j.mo633z(c2404qA.f8437p, false);
    }
}
