package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class w30 extends AbstractC0652qz {

    /* JADX INFO: renamed from: a */
    public boolean f4919a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0314hx f4920b;

    public w30(C0314hx c0314hx) {
        this.f4920b = c0314hx;
    }

    @Override // p000.AbstractC0652qz
    /* JADX INFO: renamed from: a */
    public final void mo2184a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f4919a) {
            this.f4919a = false;
            this.f4920b.m1381f();
        }
    }

    @Override // p000.AbstractC0652qz
    /* JADX INFO: renamed from: b */
    public final void mo2185b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f4919a = true;
    }
}
