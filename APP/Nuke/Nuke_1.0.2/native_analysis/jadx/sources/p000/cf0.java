package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1498h;

    /* JADX INFO: renamed from: i */
    public final yq2 f1499i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ff0 f1500j;

    public /* synthetic */ cf0(ff0 ff0Var, yq2 yq2Var, int i) {
        this.f1498h = i;
        this.f1500j = ff0Var;
        this.f1499i = yq2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0174ep c0174ep;
        switch (this.f1498h) {
            case 0:
                yq2 yq2Var = this.f1499i;
                yq2Var.f13570b.m5003a();
                synchronized (yq2Var.f13571c) {
                    synchronized (this.f1500j) {
                        try {
                            if (this.f1500j.f2931h.f2422h.contains(new df0(this.f1499i, up0.f11396d))) {
                                ff0 ff0Var = this.f1500j;
                                yq2 yq2Var2 = this.f1499i;
                                ff0Var.getClass();
                                try {
                                    yq2Var2.m6308f(ff0Var.f2947x, 5);
                                } finally {
                                }
                            }
                            this.f1500j.m1601b();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                yq2 yq2Var3 = this.f1499i;
                yq2Var3.f13570b.m5003a();
                synchronized (yq2Var3.f13571c) {
                    synchronized (this.f1500j) {
                        try {
                            if (this.f1500j.f2931h.f2422h.contains(new df0(this.f1499i, up0.f11396d))) {
                                this.f1500j.f2949z.m2153a();
                                ff0 ff0Var2 = this.f1500j;
                                yq2 yq2Var4 = this.f1499i;
                                ff0Var2.getClass();
                                try {
                                    yq2Var4.m6309g(ff0Var2.f2949z, ff0Var2.f2945v);
                                    this.f1500j.m1606g(this.f1499i);
                                } finally {
                                }
                            }
                            this.f1500j.m1601b();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
