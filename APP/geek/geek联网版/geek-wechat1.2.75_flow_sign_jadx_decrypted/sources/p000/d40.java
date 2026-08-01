package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class d40 extends AbstractC0911xz {

    /* JADX INFO: renamed from: a */
    public boolean f1299a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0612px f1300b;

    public d40(C0612px c0612px) {
        this.f1300b = c0612px;
    }

    @Override // p000.AbstractC0911xz
    /* JADX INFO: renamed from: a */
    public final void mo865a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f1299a) {
            this.f1299a = false;
            this.f1300b.m2102f();
        }
    }

    @Override // p000.AbstractC0911xz
    /* JADX INFO: renamed from: b */
    public final void mo866b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f1299a = true;
    }
}
