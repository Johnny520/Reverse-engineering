package p000;

/* JADX INFO: renamed from: fg */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1413fg implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4993a;

    /* JADX INFO: renamed from: b */
    public final C2563ty f4994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1544ig f4995c;

    public /* synthetic */ RunnableC1413fg(C1544ig c1544ig, C2563ty c2563ty, int i) {
        this.f4993a = i;
        this.f4995c = c1544ig;
        this.f4994b = c2563ty;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0265G6 c0265g6;
        switch (this.f4993a) {
            case 0:
                C2563ty c2563ty = this.f4994b;
                c2563ty.f8884a.m2744a();
                synchronized (c2563ty.f8885b) {
                    synchronized (this.f4995c) {
                        try {
                            if (this.f4995c.f5444a.f5288a.contains(new C1457gg(this.f4994b, AbstractC0671Pj.f2140c))) {
                                C1544ig c1544ig = this.f4995c;
                                C2563ty c2563ty2 = this.f4994b;
                                c1544ig.getClass();
                                try {
                                    c2563ty2.m5047c(c1544ig.f5460q, 5);
                                } finally {
                                }
                            }
                            this.f4995c.m2959d();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                C2563ty c2563ty3 = this.f4994b;
                c2563ty3.f8884a.m2744a();
                synchronized (c2563ty3.f8885b) {
                    synchronized (this.f4995c) {
                        try {
                            if (this.f4995c.f5444a.f5288a.contains(new C1457gg(this.f4994b, AbstractC0671Pj.f2140c))) {
                                this.f4995c.f5462s.m4539a();
                                C1544ig c1544ig2 = this.f4995c;
                                C2563ty c2563ty4 = this.f4994b;
                                c1544ig2.getClass();
                                try {
                                    c2563ty4.m5048g(c1544ig2.f5462s, c1544ig2.f5458o, c1544ig2.f5465v);
                                    this.f4995c.m2963h(this.f4994b);
                                } finally {
                                }
                            }
                            this.f4995c.m2959d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
