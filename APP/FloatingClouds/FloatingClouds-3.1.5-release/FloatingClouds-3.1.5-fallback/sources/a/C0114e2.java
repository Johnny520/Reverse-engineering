package a;

/* JADX INFO: renamed from: a.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0114e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList<a.N3> f447a;
    public final a.C0114e2.a b;
    public final a.O3 c;

    /* JADX INFO: renamed from: a.e2$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.N3.a f448a;
        public a.N3.a b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* JADX INFO: renamed from: a.e2$b */
    public interface b {
    }

    public C0114e2(a.O3 r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f447a = r0
            a.e2$a r0 = new a.e2$a
            r0.<init>()
            r1.b = r0
            r1.c = r2
            return
    }

    public final boolean a(a.C0114e2.b r8, a.N3 r9, boolean r10) {
            r7 = this;
            a.N3$a[] r0 = r9.J
            r1 = 0
            r2 = r0[r1]
            a.e2$a r3 = r7.b
            r3.f448a = r2
            r2 = 1
            r0 = r0[r2]
            r3.b = r0
            int r0 = r9.l()
            r3.c = r0
            int r0 = r9.i()
            r3.d = r0
            r3.i = r1
            r3.j = r10
            a.N3$a r10 = r3.f448a
            a.N3$a r0 = a.N3.a.c
            if (r10 != r0) goto L26
            r10 = r2
            goto L27
        L26:
            r10 = r1
        L27:
            a.N3$a r4 = r3.b
            if (r4 != r0) goto L2d
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r4 = 0
            if (r10 == 0) goto L39
            float r10 = r9.N
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 <= 0) goto L39
            r10 = r2
            goto L3a
        L39:
            r10 = r1
        L3a:
            if (r0 == 0) goto L44
            float r0 = r9.N
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r1
        L45:
            a.N3$a r4 = a.N3.a.f181a
            int[] r5 = r9.l
            r6 = 4
            if (r10 == 0) goto L52
            r10 = r5[r1]
            if (r10 != r6) goto L52
            r3.f448a = r4
        L52:
            if (r0 == 0) goto L5a
            r10 = r5[r2]
            if (r10 != r6) goto L5a
            r3.b = r4
        L5a:
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8
            r8.a(r9, r3)
            int r8 = r3.e
            r9.y(r8)
            int r8 = r3.f
            r9.v(r8)
            boolean r8 = r3.h
            r9.w = r8
            int r8 = r3.g
            r9.R = r8
            if (r8 <= 0) goto L74
            goto L75
        L74:
            r2 = r1
        L75:
            r9.w = r2
            r3.j = r1
            boolean r8 = r3.i
            return r8
    }

    public final void b(a.O3 r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.S
            int r1 = r4.T
            r2 = 0
            r4.S = r2
            r4.T = r2
            r4.y(r5)
            r4.v(r6)
            if (r0 >= 0) goto L14
            r4.S = r2
            goto L16
        L14:
            r4.S = r0
        L16:
            if (r1 >= 0) goto L1b
            r4.T = r2
            goto L1d
        L1b:
            r4.T = r1
        L1d:
            a.O3 r4 = r3.c
            r4.B()
            return
    }
}
