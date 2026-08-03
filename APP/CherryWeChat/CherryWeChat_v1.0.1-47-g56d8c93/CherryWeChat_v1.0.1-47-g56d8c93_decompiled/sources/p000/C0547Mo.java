package p000;

/* JADX INFO: renamed from: Mo */
/* JADX INFO: loaded from: classes.dex */
public final class C0547Mo {

    /* JADX INFO: renamed from: a */
    public final C0132D2 f1767a;

    /* JADX INFO: renamed from: b */
    public boolean f1768b;

    /* JADX INFO: renamed from: c */
    public int f1769c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2600us f1770d;

    public C0547Mo(C2600us c2600us, C0132D2 c0132d2) {
        this.f1770d = c2600us;
        this.f1767a = c0132d2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1039a(boolean z) {
        if (z == this.f1768b) {
            return;
        }
        this.f1768b = z;
        int i = z ? 1 : -1;
        C2600us c2600us = this.f1770d;
        int i2 = c2600us.f8979c;
        c2600us.f8979c = i + i2;
        if (!c2600us.f8980d) {
            c2600us.f8980d = true;
            while (true) {
                try {
                    int i3 = c2600us.f8979c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    c2600us.f8980d = false;
                }
            }
        }
        if (this.f1768b) {
            c2600us.m5114c(this);
        }
    }
}
