package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 implements Runnable {
    public final /* synthetic */ int h;
    public final yq2 i;
    public final /* synthetic */ ff0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cf0(ff0 ff0Var, yq2 yq2Var, int i) {
        this.h = i;
        this.j = ff0Var;
        this.i = yq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ep epVar;
        switch (this.h) {
            case 0:
                yq2 yq2Var = this.i;
                yq2Var.b.a();
                synchronized (yq2Var.c) {
                    synchronized (this.j) {
                        try {
                            if (this.j.h.h.contains(new df0(this.i, up0.d))) {
                                ff0 ff0Var = this.j;
                                yq2 yq2Var2 = this.i;
                                ff0Var.getClass();
                                try {
                                    yq2Var2.f(ff0Var.x, 5);
                                } finally {
                                }
                            }
                            this.j.b();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                yq2 yq2Var3 = this.i;
                yq2Var3.b.a();
                synchronized (yq2Var3.c) {
                    synchronized (this.j) {
                        try {
                            if (this.j.h.h.contains(new df0(this.i, up0.d))) {
                                this.j.z.a();
                                ff0 ff0Var2 = this.j;
                                yq2 yq2Var4 = this.i;
                                ff0Var2.getClass();
                                try {
                                    yq2Var4.g(ff0Var2.z, ff0Var2.v);
                                    this.j.g(this.i);
                                } finally {
                                }
                            }
                            this.j.b();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
