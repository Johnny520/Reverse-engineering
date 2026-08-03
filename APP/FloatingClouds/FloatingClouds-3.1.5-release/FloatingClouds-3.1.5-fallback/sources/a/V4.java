package a;

/* JADX INFO: loaded from: classes.dex */
public class V4 implements a.T4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.ih f300a;
    public boolean b;
    public boolean c;
    public final a.ih d;
    public a.V4.a e;
    public int f;
    public int g;
    public int h;
    public a.C0242l5 i;
    public boolean j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;

    public enum a extends java.lang.Enum<a.V4.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.V4.a f301a = null;
        public static final a.V4.a b = null;
        public static final a.V4.a c = null;
        public static final a.V4.a d = null;
        public static final a.V4.a e = null;
        public static final a.V4.a f = null;
        public static final a.V4.a g = null;
        public static final a.V4.a h = null;
        public static final /* synthetic */ a.V4.a[] i = null;

        static {
                a.V4$a r0 = new a.V4$a
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                a.V4.a.f301a = r0
                a.V4$a r1 = new a.V4$a
                java.lang.String r2 = "HORIZONTAL_DIMENSION"
                r3 = 1
                r1.<init>(r2, r3)
                a.V4.a.b = r1
                a.V4$a r2 = new a.V4$a
                java.lang.String r3 = "VERTICAL_DIMENSION"
                r4 = 2
                r2.<init>(r3, r4)
                a.V4.a.c = r2
                a.V4$a r3 = new a.V4$a
                java.lang.String r4 = "LEFT"
                r5 = 3
                r3.<init>(r4, r5)
                a.V4.a.d = r3
                a.V4$a r4 = new a.V4$a
                java.lang.String r5 = "RIGHT"
                r6 = 4
                r4.<init>(r5, r6)
                a.V4.a.e = r4
                a.V4$a r5 = new a.V4$a
                java.lang.String r6 = "TOP"
                r7 = 5
                r5.<init>(r6, r7)
                a.V4.a.f = r5
                a.V4$a r6 = new a.V4$a
                java.lang.String r7 = "BOTTOM"
                r8 = 6
                r6.<init>(r7, r8)
                a.V4.a.g = r6
                a.V4$a r7 = new a.V4$a
                java.lang.String r8 = "BASELINE"
                r9 = 7
                r7.<init>(r8, r9)
                a.V4.a.h = r7
                a.V4$a[] r0 = new a.V4.a[]{r0, r1, r2, r3, r4, r5, r6, r7}
                a.V4.a.i = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.V4.a valueOf(java.lang.String r1) {
                java.lang.Class<a.V4$a> r0 = a.V4.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.V4$a r1 = (a.V4.a) r1
                return r1
        }

        public static a.V4.a[] values() {
                a.V4$a[] r0 = a.V4.a.i
                java.lang.Object r0 = r0.clone()
                a.V4$a[] r0 = (a.V4.a[]) r0
                return r0
        }
    }

    public V4(a.ih r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f300a = r0
            r1 = 0
            r3.b = r1
            r3.c = r1
            a.V4$a r2 = a.V4.a.f301a
            r3.e = r2
            r2 = 1
            r3.h = r2
            r3.i = r0
            r3.j = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l = r0
            r3.d = r4
            return
    }

    @Override // a.T4
    public final void a(a.T4 r6) {
            r5 = this;
            java.util.ArrayList r6 = r5.l
            java.util.Iterator r0 = r6.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            a.V4 r1 = (a.V4) r1
            boolean r1 = r1.j
            if (r1 != 0) goto L6
            goto L6c
        L17:
            r0 = 1
            r5.c = r0
            a.ih r1 = r5.f300a
            if (r1 == 0) goto L21
            r1.a(r5)
        L21:
            boolean r1 = r5.b
            if (r1 == 0) goto L2b
            a.ih r6 = r5.d
            r6.a(r5)
            return
        L2b:
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = 0
        L31:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r6.next()
            a.V4 r3 = (a.V4) r3
            boolean r4 = r3 instanceof a.C0242l5
            if (r4 == 0) goto L42
            goto L31
        L42:
            int r2 = r2 + 1
            r1 = r3
            goto L31
        L46:
            if (r1 == 0) goto L65
            if (r2 != r0) goto L65
            boolean r6 = r1.j
            if (r6 == 0) goto L65
            a.l5 r6 = r5.i
            if (r6 == 0) goto L5d
            boolean r0 = r6.j
            if (r0 == 0) goto L6c
            int r0 = r5.h
            int r6 = r6.g
            int r0 = r0 * r6
            r5.f = r0
        L5d:
            int r6 = r1.g
            int r0 = r5.f
            int r6 = r6 + r0
            r5.d(r6)
        L65:
            a.ih r6 = r5.f300a
            if (r6 == 0) goto L6c
            r6.a(r5)
        L6c:
            return
    }

    public final void b(a.ih r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.k
            r0.add(r2)
            boolean r0 = r1.j
            if (r0 == 0) goto Lc
            r2.a(r2)
        Lc:
            return
    }

    public final void c() {
            r1 = this;
            java.util.ArrayList r0 = r1.l
            r0.clear()
            java.util.ArrayList r0 = r1.k
            r0.clear()
            r0 = 0
            r1.j = r0
            r1.g = r0
            r1.c = r0
            r1.b = r0
            return
    }

    public void d(int r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == 0) goto L5
            goto L20
        L5:
            r0 = 1
            r1.j = r0
            r1.g = r2
            java.util.ArrayList r2 = r1.k
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            a.T4 r0 = (a.T4) r0
            r0.a(r0)
            goto L10
        L20:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            a.ih r1 = r2.d
            a.N3 r1 = r1.b
            java.lang.String r1 = r1.Y
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            a.V4$a r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            boolean r1 = r2.j
            if (r1 == 0) goto L28
            int r1 = r2.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L2a
        L28:
            java.lang.String r1 = "unresolved"
        L2a:
            r0.append(r1)
            java.lang.String r1 = ") <t="
            r0.append(r1)
            java.util.ArrayList r1 = r2.l
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ":d="
            r0.append(r1)
            java.util.ArrayList r1 = r2.k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
