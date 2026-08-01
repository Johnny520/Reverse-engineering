package p088R1;

import p171h2.C2239f;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: R1.p */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1215p implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4041d;

    /* JADX INFO: renamed from: e */
    public final C2239f f4042e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1218s f4043f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1215p(C1218s c1218s, C2239f c2239f, int i5) {
        this.f4041d = i5;
        this.f4043f = c1218s;
        this.f4042e = c2239f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C1202c c1202c;
        switch (this.f4041d) {
            case 0:
                C2239f c2239f = this.f4042e;
                c2239f.f7319b.m4548a();
                synchronized (c2239f.f7320c) {
                    synchronized (this.f4043f) {
                        try {
                            if (this.f4043f.f4048d.f4046d.contains(new C1216q(this.f4042e, AbstractC2503g.f8016b))) {
                                C1218s c1218s = this.f4043f;
                                C2239f c2239f2 = this.f4042e;
                                c1218s.getClass();
                                try {
                                    c2239f2.m4064g(c1218s.f4064t, 5);
                                } finally {
                                }
                            }
                            this.f4043f.m2298d();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                C2239f c2239f3 = this.f4042e;
                c2239f3.f7319b.m4548a();
                synchronized (c2239f3.f7320c) {
                    synchronized (this.f4043f) {
                        try {
                            if (this.f4043f.f4048d.f4046d.contains(new C1216q(this.f4042e, AbstractC2503g.f8016b))) {
                                this.f4043f.f4066v.m2303a();
                                C1218s c1218s2 = this.f4043f;
                                C2239f c2239f4 = this.f4042e;
                                c1218s2.getClass();
                                try {
                                    c2239f4.m4065j(c1218s2.f4066v, c1218s2.f4062r, c1218s2.f4069y);
                                    this.f4043f.m2302h(this.f4042e);
                                } finally {
                                }
                            }
                            this.f4043f.m2298d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
