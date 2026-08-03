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
    public final void mo1155e(AttributeSet attributeSet) {
        C0996a c0996a = new C0996a();
        c0996a.f3557f0 = 0;
        c0996a.f3558g0 = true;
        c0996a.f3559h0 = 0;
        this.f3863i = c0996a;
        this.f3873d = c0996a;
        m2517g();
    }

    @Override // p075p.AbstractC1037c
    /* JADX INFO: renamed from: f */
    public final void mo1156f(C0999d c0999d, boolean z2) {
        int i2 = this.f3861g;
        this.f3862h = i2;
        if (z2) {
            if (i2 == 5) {
                this.f3862h = 1;
            } else if (i2 == 6) {
                this.f3862h = 0;
            }
        } else if (i2 == 5) {
            this.f3862h = 0;
        } else if (i2 == 6) {
            this.f3862h = 1;
        }
        if (c0999d instanceof C0996a) {
            ((C0996a) c0999d).f3557f0 = this.f3862h;
        }
    }

    public int getMargin() {
        return this.f3863i.f3559h0;
    }

    public int getType() {
        return this.f3861g;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3863i.f3558g0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f3863i.f3559h0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f3863i.f3559h0 = i2;
    }

    public void setType(int i2) {
        this.f3861g = i2;
    }
}
