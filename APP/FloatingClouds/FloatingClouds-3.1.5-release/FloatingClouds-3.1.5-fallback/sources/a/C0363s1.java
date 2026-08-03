package a;

/* JADX INFO: renamed from: a.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0363s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f676a;
    public float b;
    public float c;
    public float d;
    public int[] e;
    public boolean f;
    public final android.widget.TextView g;
    public final android.content.Context h;

    /* JADX INFO: renamed from: a.s1$a */
    public static class a extends a.C0363s1.c {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: a.s1$b */
    public static class b extends a.C0363s1.a {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: a.s1$c */
    public static class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public C0363s1(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f676a = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.b = r1
            r2.c = r1
            r2.d = r1
            int[] r1 = new int[r0]
            r2.e = r1
            r2.f = r0
            r2.g = r3
            android.content.Context r3 = r3.getContext()
            r2.h = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L28
            a.s1$b r3 = new a.s1$b
            r3.<init>()
            return
        L28:
            a.s1$a r3 = new a.s1$a
            r3.<init>()
            return
    }

    public static int[] a(int[] r6) {
            int r0 = r6.length
            if (r0 != 0) goto L4
            goto L2e
        L4:
            java.util.Arrays.sort(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r0) goto L28
            r4 = r6[r3]
            if (r4 <= 0) goto L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            int r3 = r1.size()
            if (r0 != r3) goto L2f
        L2e:
            return r6
        L2f:
            int r6 = r1.size()
            int[] r0 = new int[r6]
        L35:
            if (r2 >= r6) goto L46
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L35
        L46:
            return r0
    }

    public final boolean b() {
            r1 = this;
            android.widget.TextView r0 = r1.g
            boolean r0 = r0 instanceof a.Z0
            r0 = r0 ^ 1
            return r0
    }
}
