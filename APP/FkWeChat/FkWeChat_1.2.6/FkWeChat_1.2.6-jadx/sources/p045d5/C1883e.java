package p045d5;

import bsh.C1259t2;
import p254r5.C6496e0;
import p254r5.C6519x;
import p309v5.AbstractC8824f;

/* JADX INFO: renamed from: d5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1883e extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public static final C1883e f5233s = new C1883e(0);

    /* JADX INFO: renamed from: d5.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C1882d f5234a;

        /* JADX INFO: renamed from: b */
        public final C6519x f5235b;

        /* JADX INFO: renamed from: c */
        public final C6496e0 f5236c;

        public a(C6496e0 c6496e0, C6519x c6519x, C1882d c1882d) {
            if (c6496e0 == null) {
                C1259t2.m5095a("declaringClass == null");
                throw null;
            }
            if (c6519x == null) {
                C1259t2.m5095a("bootstrapMethodHandle == null");
                throw null;
            }
            if (c1882d == null) {
                C1259t2.m5095a("bootstrapMethodArguments == null");
                throw null;
            }
            this.f5235b = c6519x;
            this.f5234a = c1882d;
            this.f5236c = c6496e0;
        }

        /* JADX INFO: renamed from: a */
        public C1882d m6713a() {
            return this.f5234a;
        }

        /* JADX INFO: renamed from: b */
        public C6519x m6714b() {
            return this.f5235b;
        }
    }

    public C1883e(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public a m6710E(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: F */
    public void m6711F(int i10, a aVar) {
        if (aVar != null) {
            m33889y(i10, aVar);
        } else {
            C1259t2.m5095a("item == null");
        }
    }

    /* JADX INFO: renamed from: G */
    public void m6712G(int i10, C6496e0 c6496e0, C6519x c6519x, C1882d c1882d) {
        m6711F(i10, new a(c6496e0, c6519x, c1882d));
    }
}
