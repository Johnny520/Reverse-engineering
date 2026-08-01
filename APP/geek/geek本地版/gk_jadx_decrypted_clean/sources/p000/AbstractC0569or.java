package p000;

import androidx.lifecycle.C0037b;

/* JADX INFO: renamed from: or */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0569or {

    /* JADX INFO: renamed from: a */
    public final C0431l0 f3573a;

    /* JADX INFO: renamed from: b */
    public boolean f3574b;

    /* JADX INFO: renamed from: c */
    public int f3575c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0037b f3576d;

    public AbstractC0569or(C0037b c0037b, C0431l0 c0431l0) {
        this.f3576d = c0037b;
        this.f3573a = c0431l0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2021c(boolean z) {
        if (z == this.f3574b) {
            return;
        }
        this.f3574b = z;
        int i = z ? 1 : -1;
        C0037b c0037b = this.f3576d;
        int i2 = c0037b.f527c;
        c0037b.f527c = i + i2;
        if (!c0037b.f528d) {
            c0037b.f528d = true;
            while (true) {
                try {
                    int i3 = c0037b.f527c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    c0037b.f528d = false;
                }
            }
        }
        if (this.f3574b) {
            c0037b.m284c(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo273e();

    /* JADX INFO: renamed from: d */
    public void mo272d() {
    }
}
