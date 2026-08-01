package p280t5;

import java.util.HashSet;
import java.util.List;
import p239q5.AbstractC6253d;
import p239q5.C6260k;
import p239q5.C6267r;
import p254r5.C6510o;
import p280t5.AbstractC8131v;

/* JADX INFO: renamed from: t5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8120k {

    /* JADX INFO: renamed from: a */
    public final C8132w f27124a;

    public C8120k(C8132w c8132w) {
        this.f27124a = c8132w;
    }

    /* JADX INFO: renamed from: d */
    public static void m31404d(C8132w c8132w) {
        new C8120k(c8132w).m31406e();
    }

    /* JADX INFO: renamed from: c */
    public final int m31405c(C8121l c8121l) {
        return ((C6510o) ((AbstractC6253d) c8121l.mo31417k()).m24688v()).m25782u();
    }

    /* JADX INFO: renamed from: e */
    public final void m31406e() {
        C6267r[] c6267rArr = new C6267r[this.f27124a.m31555t()];
        HashSet hashSet = new HashSet();
        this.f27124a.m31548l(new a(c6267rArr, hashSet));
        this.f27124a.m31545i(hashSet);
    }

    /* JADX INFO: renamed from: t5.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements AbstractC8131v.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6267r[] f27125a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HashSet f27126b;

        /* JADX INFO: renamed from: t5.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class C10238a extends AbstractC8125p {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C6267r f27128a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C6267r f27129b;

            public C10238a(C6267r c6267r, C6267r c6267r2) {
                this.f27128a = c6267r;
                this.f27129b = c6267r2;
            }

            @Override // p280t5.AbstractC8125p
            /* JADX INFO: renamed from: a */
            public int mo31330a() {
                return C8120k.this.f27124a.m31556u();
            }

            @Override // p280t5.AbstractC8125p
            /* JADX INFO: renamed from: b */
            public C6267r mo31331b(C6267r c6267r) {
                return c6267r.m24754t() == this.f27128a.m24754t() ? this.f27129b : c6267r;
            }
        }

        public a(C6267r[] c6267rArr, HashSet hashSet) {
            this.f27125a = c6267rArr;
            this.f27126b = hashSet;
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: b */
        public void mo31347b(C8121l c8121l) {
            if (c8121l.mo31416j().m24798d() != 3) {
                return;
            }
            int iM31405c = C8120k.this.m31405c(c8121l);
            C6267r[] c6267rArr = this.f27125a;
            C6267r c6267r = c6267rArr[iM31405c];
            if (c6267r == null) {
                c6267rArr[iM31405c] = c8121l.m31516n();
                return;
            }
            C6267r c6267rM31516n = c8121l.m31516n();
            C6260k c6260kM24752p = c6267r.m24752p();
            C6260k c6260kM24752p2 = c6267rM31516n.m24752p();
            if (c6260kM24752p == null) {
                c6260kM24752p = c6260kM24752p2;
            } else if (c6260kM24752p2 != null && !c6260kM24752p.equals(c6260kM24752p2)) {
                return;
            }
            C8120k.this.f27124a.m31550n(c6267r.m24754t()).m31520z(c6260kM24752p);
            C10238a c10238a = new C10238a(c6267rM31516n, c6267r);
            List listM31558w = C8120k.this.f27124a.m31558w(c6267rM31516n.m24754t());
            for (int size = listM31558w.size() - 1; size >= 0; size--) {
                ((AbstractC8131v) listM31558w.get(size)).mo31423x(c10238a);
            }
            this.f27126b.add(c8121l);
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: a */
        public void mo31346a(C8123n c8123n) {
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: c */
        public void mo31348c(C8121l c8121l) {
        }
    }
}
