package p075p;

import android.util.AttributeSet;
import p071n.C0996a;
import p071n.C0999d;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1035a extends AbstractC1037c {

    /* JADX INFO: renamed from: g */
    public int f3861g;

    /* JADX INFO: renamed from: h */
    public int f3862h;

    /* JADX INFO: renamed from: i */
    public C0996a f3863i;

    @Override // p075p.AbstractC1037c
    /* JADX INFO: renamed from: e */
    public final void mo1155e(AttributeSet r3) {
        C0996a r32 = new C0996a();
        r32.f3557f0 = 0;
        r32.f3558g0 = true;
        r32.f3559h0 = 0;
        this.f3863i = r32;
        this.f3873d = r32;
        m2517g();
    }

    @Override // p075p.AbstractC1037c
    /* JADX INFO: renamed from: f */
    public final void mo1156f(C0999d r6, boolean r7) {
        int r02 = this.f3861g;
        this.f3862h = r02;
        if (r7 == false) goto L8;
        if (r02 != 5) goto L6;
        this.f3862h = 1;
    L13:
        if ((r6 instanceof C0996a) == false) goto L16;
        int r72 = this.f3862h;
        ((C0996a) r6).f3557f0 = r72;
        return;
    L16:
        return;
    L6:
        if (r02 != 6) goto L13;
        this.f3862h = 0;
        goto L13
    L8:
        if (r02 != 5) goto L10;
        this.f3862h = 0;
        goto L13
    L10:
        if (r02 != 6) goto L13;
        this.f3862h = 1;
        goto L13
    }

    public int getMargin() {
        return this.f3863i.f3559h0;
    }

    public int getType() {
        return this.f3861g;
    }

    public void setAllowsGoneWidget(boolean r2) {
        this.f3863i.f3558g0 = r2;
    }

    public void setDpMargin(int r2) {
        this.f3863i.f3559h0 = (int) ((r2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int r2) {
        this.f3863i.f3559h0 = r2;
    }

    public void setType(int r1) {
        this.f3861g = r1;
    }
}
