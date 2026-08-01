package p032c5;

import bsh.C1259t2;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p309v5.AbstractC8824f;

/* JADX INFO: renamed from: c5.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1350x extends AbstractC8824f {

    /* JADX INFO: renamed from: c5.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C6496e0 f3991a;

        /* JADX INFO: renamed from: b */
        public final C6496e0 f3992b;

        /* JADX INFO: renamed from: c */
        public final C6492c0 f3993c;

        /* JADX INFO: renamed from: d */
        public final int f3994d;

        public a(C6496e0 c6496e0, C6496e0 c6496e02, C6492c0 c6492c0, int i10) {
            if (c6496e0 == null) {
                C1259t2.m5095a("innerClass == null");
                throw null;
            }
            this.f3991a = c6496e0;
            this.f3992b = c6496e02;
            this.f3993c = c6492c0;
            this.f3994d = i10;
        }

        /* JADX INFO: renamed from: a */
        public int m5358a() {
            return this.f3994d;
        }

        /* JADX INFO: renamed from: b */
        public C6496e0 m5359b() {
            return this.f3991a;
        }

        /* JADX INFO: renamed from: c */
        public C6492c0 m5360c() {
            return this.f3993c;
        }

        /* JADX INFO: renamed from: d */
        public C6496e0 m5361d() {
            return this.f3992b;
        }
    }

    public C1350x(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public a m5356E(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: F */
    public void m5357F(int i10, C6496e0 c6496e0, C6496e0 c6496e02, C6492c0 c6492c0, int i11) {
        m33889y(i10, new a(c6496e0, c6496e02, c6492c0, i11));
    }
}
