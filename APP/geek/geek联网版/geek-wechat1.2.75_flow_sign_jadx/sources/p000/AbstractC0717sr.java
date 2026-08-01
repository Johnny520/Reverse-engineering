package p000;

import androidx.lifecycle.C0037b;

/* JADX INFO: renamed from: sr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0717sr {

    /* JADX INFO: renamed from: a */
    public final C0431l0 f4358a;

    /* JADX INFO: renamed from: b */
    public boolean f4359b;

    /* JADX INFO: renamed from: c */
    public int f4360c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0037b f4361d;

    public AbstractC0717sr(C0037b c0037b, C0431l0 c0431l0) {
        this.f4361d = c0037b;
        this.f4358a = c0431l0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2383c(boolean z) {
        if (z == this.f4359b) {
            return;
        }
        this.f4359b = z;
        int i = z ? 1 : -1;
        C0037b c0037b = this.f4361d;
        int i2 = c0037b.f490c;
        c0037b.f490c = i + i2;
        if (!c0037b.f491d) {
            c0037b.f491d = true;
            while (true) {
                try {
                    int i3 = c0037b.f490c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    c0037b.f491d = false;
                }
            }
        }
        if (this.f4359b) {
            c0037b.m269c(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo258e();

    /* JADX INFO: renamed from: d */
    public void mo257d() {
    }
}
