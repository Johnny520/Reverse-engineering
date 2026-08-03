package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ih implements a.T4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f516a;
    public a.N3 b;
    public a.Dd c;
    public a.N3.a d;
    public final a.C0242l5 e;
    public int f;
    public boolean g;
    public final a.V4 h;
    public final a.V4 i;
    public a.ih.a j;

    public enum a extends java.lang.Enum<a.ih.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.ih.a f517a = null;
        public static final a.ih.a b = null;
        public static final /* synthetic */ a.ih.a[] c = null;

        static {
                a.ih$a r0 = new a.ih$a
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                a.ih.a.f517a = r0
                a.ih$a r1 = new a.ih$a
                java.lang.String r2 = "START"
                r3 = 1
                r1.<init>(r2, r3)
                a.ih$a r2 = new a.ih$a
                java.lang.String r3 = "END"
                r4 = 2
                r2.<init>(r3, r4)
                a.ih$a r3 = new a.ih$a
                java.lang.String r4 = "CENTER"
                r5 = 3
                r3.<init>(r4, r5)
                a.ih.a.b = r3
                a.ih$a[] r0 = new a.ih.a[]{r0, r1, r2, r3}
                a.ih.a.c = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.ih.a valueOf(java.lang.String r1) {
                java.lang.Class<a.ih$a> r0 = a.ih.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.ih$a r1 = (a.ih.a) r1
                return r1
        }

        public static a.ih.a[] values() {
                a.ih$a[] r0 = a.ih.a.c
                java.lang.Object r0 = r0.clone()
                a.ih$a[] r0 = (a.ih.a[]) r0
                return r0
        }
    }

    public ih(a.N3 r2) {
            r1 = this;
            r1.<init>()
            a.l5 r0 = new a.l5
            r0.<init>(r1)
            r1.e = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            a.V4 r0 = new a.V4
            r0.<init>(r1)
            r1.h = r0
            a.V4 r0 = new a.V4
            r0.<init>(r1)
            r1.i = r0
            a.ih$a r0 = a.ih.a.f517a
            r1.j = r0
            r1.b = r2
            return
    }

    public static void b(a.V4 r1, a.V4 r2, int r3) {
            java.util.ArrayList r0 = r1.l
            r0.add(r2)
            r1.f = r3
            java.util.ArrayList r2 = r2.k
            r2.add(r1)
            return
    }

    public static a.V4 h(a.M3 r2) {
            a.M3 r2 = r2.d
            if (r2 != 0) goto L5
            goto L1c
        L5:
            a.N3 r0 = r2.b
            a.M3$a r2 = r2.c
            int r2 = r2.ordinal()
            r1 = 1
            if (r2 == r1) goto L32
            r1 = 2
            if (r2 == r1) goto L2d
            r1 = 3
            if (r2 == r1) goto L28
            r1 = 4
            if (r2 == r1) goto L23
            r1 = 5
            if (r2 == r1) goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            a.og r2 = r0.e
            a.V4 r2 = r2.k
            return r2
        L23:
            a.og r2 = r0.e
            a.V4 r2 = r2.i
            return r2
        L28:
            a.K8 r2 = r0.d
            a.V4 r2 = r2.i
            return r2
        L2d:
            a.og r2 = r0.e
            a.V4 r2 = r2.h
            return r2
        L32:
            a.K8 r2 = r0.d
            a.V4 r2 = r2.h
            return r2
    }

    public static a.V4 i(a.M3 r1, int r2) {
            a.M3 r1 = r1.d
            if (r1 != 0) goto L5
            goto L20
        L5:
            a.N3 r0 = r1.b
            if (r2 != 0) goto Lc
            a.K8 r2 = r0.d
            goto Le
        Lc:
            a.og r2 = r0.e
        Le:
            a.M3$a r1 = r1.c
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L25
            r0 = 3
            if (r1 == r0) goto L22
            r0 = 4
            if (r1 == r0) goto L22
        L20:
            r1 = 0
            return r1
        L22:
            a.V4 r1 = r2.i
            return r1
        L25:
            a.V4 r1 = r2.h
            return r1
    }

    @Override // a.T4
    public void a(a.T4 r1) {
            r0 = this;
            return
    }

    public final void c(a.V4 r3, a.V4 r4, int r5, a.C0242l5 r6) {
            r2 = this;
            java.util.ArrayList r0 = r3.l
            r0.add(r4)
            java.util.ArrayList r0 = r3.l
            a.l5 r1 = r2.e
            r0.add(r1)
            r3.h = r5
            r3.i = r6
            java.util.ArrayList r4 = r4.k
            r4.add(r3)
            java.util.ArrayList r4 = r6.k
            r4.add(r3)
            return
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L15
            a.N3 r3 = r1.b
            int r0 = r3.n
            int r3 = r3.m
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L12
            int r3 = java.lang.Math.min(r0, r2)
        L12:
            if (r3 == r2) goto L28
            return r3
        L15:
            a.N3 r3 = r1.b
            int r0 = r3.q
            int r3 = r3.p
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L25
            int r3 = java.lang.Math.min(r0, r2)
        L25:
            if (r3 == r2) goto L28
            return r3
        L28:
            return r2
    }

    public long j() {
            r2 = this;
            a.l5 r0 = r2.e
            boolean r1 = r0.j
            if (r1 == 0) goto La
            int r0 = r0.g
            long r0 = (long) r0
            return r0
        La:
            r0 = 0
            return r0
    }

    public abstract boolean k();

    public final void l(a.M3 r13, a.M3 r14, int r15) {
            r12 = this;
            a.V4 r0 = h(r13)
            a.V4 r1 = h(r14)
            boolean r2 = r0.j
            if (r2 == 0) goto Le8
            boolean r2 = r1.j
            if (r2 != 0) goto L12
            goto Le8
        L12:
            int r2 = r0.g
            int r13 = r13.c()
            int r13 = r13 + r2
            int r2 = r1.g
            int r14 = r14.c()
            int r2 = r2 - r14
            int r14 = r2 - r13
            a.l5 r3 = r12.e
            boolean r4 = r3.j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto Lb1
            a.N3$a r4 = r12.d
            a.N3$a r6 = a.N3.a.c
            if (r4 != r6) goto Lb1
            int r4 = r12.f516a
            if (r4 == 0) goto Laa
            r7 = 1
            if (r4 == r7) goto L9c
            r8 = 2
            if (r4 == r8) goto L74
            r8 = 3
            if (r4 == r8) goto L3f
            goto Lb1
        L3f:
            a.N3 r4 = r12.b
            a.K8 r9 = r4.d
            a.N3$a r10 = r9.d
            a.og r11 = r4.e
            if (r10 != r6) goto L56
            int r10 = r9.f516a
            if (r10 != r8) goto L56
            a.N3$a r10 = r11.d
            if (r10 != r6) goto L56
            int r6 = r11.f516a
            if (r6 != r8) goto L56
            goto Lb1
        L56:
            if (r15 != 0) goto L59
            r9 = r11
        L59:
            a.l5 r6 = r9.e
            boolean r8 = r6.j
            if (r8 == 0) goto Lb1
            float r4 = r4.N
            if (r15 != r7) goto L6a
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L70
        L6a:
            int r6 = r6.g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L70:
            r3.d(r4)
            goto Lb1
        L74:
            a.N3 r4 = r12.b
            a.N3 r6 = r4.K
            if (r6 == 0) goto Lb1
            if (r15 != 0) goto L7f
            a.K8 r6 = r6.d
            goto L81
        L7f:
            a.og r6 = r6.e
        L81:
            a.l5 r6 = r6.e
            boolean r7 = r6.j
            if (r7 == 0) goto Lb1
            if (r15 != 0) goto L8c
            float r4 = r4.o
            goto L8e
        L8c:
            float r4 = r4.r
        L8e:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r12.g(r4, r15)
            r3.d(r4)
            goto Lb1
        L9c:
            int r4 = r3.m
            int r4 = r12.g(r4, r15)
            int r4 = java.lang.Math.min(r4, r14)
            r3.d(r4)
            goto Lb1
        Laa:
            int r4 = r12.g(r14, r15)
            r3.d(r4)
        Lb1:
            boolean r4 = r3.j
            if (r4 != 0) goto Lb6
            goto Le8
        Lb6:
            int r4 = r3.g
            a.V4 r6 = r12.i
            a.V4 r7 = r12.h
            if (r4 != r14) goto Lc5
            r7.d(r13)
            r6.d(r2)
            return
        Lc5:
            a.N3 r14 = r12.b
            if (r15 != 0) goto Lcc
            float r14 = r14.U
            goto Lce
        Lcc:
            float r14 = r14.V
        Lce:
            if (r0 != r1) goto Ld5
            int r13 = r0.g
            int r2 = r1.g
            r14 = r5
        Ld5:
            int r2 = r2 - r13
            int r2 = r2 - r4
            float r13 = (float) r13
            float r13 = r13 + r5
            float r15 = (float) r2
            float r15 = r15 * r14
            float r15 = r15 + r13
            int r13 = (int) r15
            r7.d(r13)
            int r13 = r7.g
            int r14 = r3.g
            int r13 = r13 + r14
            r6.d(r13)
        Le8:
            return
    }
}
