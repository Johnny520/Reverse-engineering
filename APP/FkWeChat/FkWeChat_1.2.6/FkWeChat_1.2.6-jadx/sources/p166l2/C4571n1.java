package p166l2;

import java.util.Comparator;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p349y0.C9508c;

/* JADX INFO: renamed from: l2.n1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4571n1 {

    /* JADX INFO: renamed from: c */
    public static final a f13430c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f13431d = 8;

    /* JADX INFO: renamed from: a */
    public final C9508c f13432a = new C9508c(new C4554j0[16], 0);

    /* JADX INFO: renamed from: b */
    public C4554j0[] f13433b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18069a() {
        /*
            r5 = this;
            y0.c r0 = r5.f13432a
            l2.n1$a$a r1 = p166l2.C4571n1.a.C10143a.f13434a
            r0.m37051x(r1)
            y0.c r0 = r5.f13432a
            int r0 = r0.m37039l()
            l2.j0[] r1 = r5.f13433b
            if (r1 == 0) goto L14
            int r2 = r1.length
            if (r2 >= r0) goto L22
        L14:
            y0.c r1 = r5.f13432a
            int r1 = r1.m37039l()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            l2.j0[] r1 = new p166l2.C4554j0[r1]
        L22:
            r2 = 0
            r5.f13433b = r2
            r3 = 0
        L26:
            y0.c r4 = r5.f13432a
            if (r3 >= r0) goto L33
            java.lang.Object[] r4 = r4.f32299q
            r4 = r4[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L26
        L33:
            r4.m37035h()
            int r0 = r0 + (-1)
        L38:
            r3 = -1
            if (r3 >= r0) goto L4e
            r3 = r1[r0]
            r3.getClass()
            boolean r4 = r3.m17963u0()
            if (r4 == 0) goto L49
            r5.m18070b(r3)
        L49:
            r1[r0] = r2
            int r0 = r0 + (-1)
            goto L38
        L4e:
            r5.f13433b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p166l2.C4571n1.m18069a():void");
    }

    /* JADX INFO: renamed from: b */
    public final void m18070b(C4554j0 c4554j0) {
        if (c4554j0.m17895U() > 0) {
            c4554j0.m17859G();
            c4554j0.m17909Y1(false);
            C9508c c9508cM17866J0 = c4554j0.m17866J0();
            Object[] objArr = c9508cM17866J0.f32299q;
            int iM37039l = c9508cM17866J0.m37039l();
            for (int i10 = 0; i10 < iM37039l; i10++) {
                m18070b((C4554j0) objArr[i10]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18071c() {
        return this.f13432a.m37039l() != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m18072d(C4554j0 c4554j0) {
        if (c4554j0.m17895U() > 0) {
            this.f13432a.m37029b(c4554j0);
            c4554j0.m17909Y1(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18073e(C4554j0 c4554j0) {
        if (c4554j0.m17895U() > 0) {
            this.f13432a.m37035h();
            this.f13432a.m37029b(c4554j0);
            c4554j0.m17909Y1(true);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18074f(C4554j0 c4554j0) {
        this.f13432a.m37043p(c4554j0);
    }

    /* JADX INFO: renamed from: l2.n1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: l2.n1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10143a implements Comparator {

            /* JADX INFO: renamed from: a */
            public static final C10143a f13434a = new C10143a();

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(C4554j0 c4554j0, C4554j0 c4554j02) {
                int iM3843d = AbstractC1061t.m3843d(c4554j02.m17889S(), c4554j0.m17889S());
                return iM3843d != 0 ? iM3843d : AbstractC1061t.m3843d(c4554j0.hashCode(), c4554j02.hashCode());
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
