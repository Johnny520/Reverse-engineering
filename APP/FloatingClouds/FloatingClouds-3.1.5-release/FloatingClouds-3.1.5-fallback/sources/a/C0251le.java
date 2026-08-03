package a;

/* JADX INFO: renamed from: a.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f563a;
    public int b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public final float[] g;
    public final float[] h;
    public a.C0251le.a i;
    public a.K1[] j;
    public int k;
    public int l;

    /* JADX INFO: renamed from: a.le$a */
    public enum a extends java.lang.Enum<a.C0251le.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.C0251le.a f564a = null;
        public static final a.C0251le.a b = null;
        public static final a.C0251le.a c = null;
        public static final a.C0251le.a d = null;
        public static final /* synthetic */ a.C0251le.a[] e = null;

        static {
                a.le$a r0 = new a.le$a
                java.lang.String r1 = "UNRESTRICTED"
                r2 = 0
                r0.<init>(r1, r2)
                a.C0251le.a.f564a = r0
                a.le$a r1 = new a.le$a
                java.lang.String r2 = "CONSTANT"
                r3 = 1
                r1.<init>(r2, r3)
                a.le$a r2 = new a.le$a
                java.lang.String r3 = "SLACK"
                r4 = 2
                r2.<init>(r3, r4)
                a.C0251le.a.b = r2
                a.le$a r3 = new a.le$a
                java.lang.String r4 = "ERROR"
                r5 = 3
                r3.<init>(r4, r5)
                a.C0251le.a.c = r3
                a.le$a r4 = new a.le$a
                java.lang.String r5 = "UNKNOWN"
                r6 = 4
                r4.<init>(r5, r6)
                a.C0251le.a.d = r4
                a.le$a[] r0 = new a.C0251le.a[]{r0, r1, r2, r3, r4}
                a.C0251le.a.e = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.C0251le.a valueOf(java.lang.String r1) {
                java.lang.Class<a.le$a> r0 = a.C0251le.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.le$a r1 = (a.C0251le.a) r1
                return r1
        }

        public static a.C0251le.a[] values() {
                a.le$a[] r0 = a.C0251le.a.e
                java.lang.Object r0 = r0.clone()
                a.le$a[] r0 = (a.C0251le.a[]) r0
                return r0
        }
    }

    public C0251le(a.C0251le.a r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.b = r0
            r3.c = r0
            r0 = 0
            r3.d = r0
            r3.f = r0
            r1 = 9
            float[] r2 = new float[r1]
            r3.g = r2
            float[] r1 = new float[r1]
            r3.h = r1
            r1 = 16
            a.K1[] r1 = new a.K1[r1]
            r3.j = r1
            r3.k = r0
            r3.l = r0
            r3.i = r4
            return
    }

    public final void a(a.K1 r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.k
            if (r0 >= r1) goto Lf
            a.K1[] r1 = r3.j
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            a.K1[] r0 = r3.j
            int r2 = r0.length
            if (r1 < r2) goto L1f
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.K1[] r0 = (a.K1[]) r0
            r3.j = r0
        L1f:
            a.K1[] r0 = r3.j
            int r1 = r3.k
            r0[r1] = r4
            int r1 = r1 + 1
            r3.k = r1
            return
    }

    public final void b(a.K1 r5) {
            r4 = this;
            int r0 = r4.k
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            a.K1[] r2 = r4.j
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            a.K1[] r5 = r4.j
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.k
            int r5 = r5 + (-1)
            r4.k = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
    }

    public final void c() {
            r6 = this;
            a.le$a r0 = a.C0251le.a.d
            r6.i = r0
            r0 = 0
            r6.d = r0
            r1 = -1
            r6.b = r1
            r6.c = r1
            r1 = 0
            r6.e = r1
            r6.f = r0
            int r2 = r6.k
            r3 = r0
        L14:
            if (r3 >= r2) goto L1e
            a.K1[] r4 = r6.j
            r5 = 0
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L1e:
            r6.k = r0
            r6.l = r0
            r6.f563a = r0
            float[] r0 = r6.h
            java.util.Arrays.fill(r0, r1)
            return
    }

    public final void d(a.K1 r5) {
            r4 = this;
            int r0 = r4.k
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L10
            a.K1[] r3 = r4.j
            r3 = r3[r2]
            r3.h(r5, r1)
            int r2 = r2 + 1
            goto L4
        L10:
            r4.k = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
