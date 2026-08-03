package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: oA */
/* JADX INFO: loaded from: classes.dex */
public final class C2310oA extends AbstractC0585Nj {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC0295Gu f8152j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2404qA f8153k;

    public C2310oA(C2404qA r1, AbstractC0295Gu r2) {
        this.f8153k = r1;
        this.f8152j = r2;
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: I */
    public final void mo1159I(int r3) {
        this.f8153k.f8435n = true;
        this.f8152j.mo632y(r3);
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: J */
    public final void mo1160J(Typeface r3) {
        C2404qA r0 = this.f8153k;
        r0.f8437p = Typeface.create(r3, r0.f8425d);
        r0.f8435n = true;
        Typeface r32 = r0.f8437p;
        this.f8152j.mo633z(r32, false);
    }
}
