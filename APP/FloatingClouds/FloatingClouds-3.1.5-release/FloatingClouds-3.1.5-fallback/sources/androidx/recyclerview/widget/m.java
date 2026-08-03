package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class m implements java.lang.Runnable {
    public static final java.lang.ThreadLocal<androidx.recyclerview.widget.m> e = null;
    public static final androidx.recyclerview.widget.m.a f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> f1009a;
    public long b;
    public long c;
    public final java.util.ArrayList<androidx.recyclerview.widget.m.c> d;

    public class a implements java.util.Comparator<androidx.recyclerview.widget.m.c> {
        @Override // java.util.Comparator
        public final int compare(androidx.recyclerview.widget.m.c r6, androidx.recyclerview.widget.m.c r7) {
                r5 = this;
                androidx.recyclerview.widget.m$c r6 = (androidx.recyclerview.widget.m.c) r6
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.RecyclerView r0 = r6.d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r7.d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                if (r3 == r4) goto L19
                if (r0 != 0) goto L21
                goto L23
            L19:
                boolean r0 = r6.f1011a
                boolean r3 = r7.f1011a
                if (r0 == r3) goto L24
                if (r0 == 0) goto L23
            L21:
                r6 = -1
                return r6
            L23:
                return r2
            L24:
                int r0 = r7.b
                int r2 = r6.b
                int r0 = r0 - r2
                if (r0 == 0) goto L2c
                return r0
            L2c:
                int r6 = r6.c
                int r7 = r7.c
                int r6 = r6 - r7
                if (r6 == 0) goto L34
                return r6
            L34:
                return r1
        }
    }

    @android.annotation.SuppressLint({"VisibleForTests"})
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1010a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int r6, int r7) {
                r5 = this;
                if (r6 < 0) goto L3a
                if (r7 < 0) goto L32
                int r0 = r5.d
                int r1 = r0 * 2
                int[] r2 = r5.c
                r3 = 4
                if (r2 != 0) goto L16
                int[] r0 = new int[r3]
                r5.c = r0
                r2 = -1
                java.util.Arrays.fill(r0, r2)
                goto L23
            L16:
                int r4 = r2.length
                if (r1 < r4) goto L23
                int r0 = r0 * r3
                int[] r0 = new int[r0]
                r5.c = r0
                int r3 = r2.length
                r4 = 0
                java.lang.System.arraycopy(r2, r4, r0, r4, r3)
            L23:
                int[] r0 = r5.c
                r0[r1] = r6
                int r1 = r1 + 1
                r0[r1] = r7
                int r6 = r5.d
                int r6 = r6 + 1
                r5.d = r6
                return
            L32:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Pixel distance must be non-negative"
                r6.<init>(r7)
                throw r6
            L3a:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Layout positions must be non-negative"
                r6.<init>(r7)
                throw r6
        }

        public final void b(androidx.recyclerview.widget.RecyclerView r5, boolean r6) {
                r4 = this;
                r0 = 0
                r4.d = r0
                int[] r0 = r4.c
                if (r0 == 0) goto Lb
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            Lb:
                androidx.recyclerview.widget.RecyclerView$l r0 = r5.m
                androidx.recyclerview.widget.RecyclerView$d r1 = r5.l
                if (r1 == 0) goto L49
                if (r0 == 0) goto L49
                boolean r1 = r0.i
                if (r1 == 0) goto L49
                if (r6 == 0) goto L2b
                androidx.recyclerview.widget.a r1 = r5.e
                boolean r1 = r1.f()
                if (r1 != 0) goto L3a
                androidx.recyclerview.widget.RecyclerView$d r1 = r5.l
                int r1 = r1.a()
                r0.i(r1, r4)
                goto L3a
            L2b:
                boolean r1 = r5.N()
                if (r1 != 0) goto L3a
                int r1 = r4.f1010a
                int r2 = r4.b
                androidx.recyclerview.widget.RecyclerView$w r3 = r5.f0
                r0.h(r1, r2, r3, r4)
            L3a:
                int r1 = r4.d
                int r2 = r0.j
                if (r1 <= r2) goto L49
                r0.j = r1
                r0.k = r6
                androidx.recyclerview.widget.RecyclerView$r r5 = r5.c
                r5.m()
            L49:
                return
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1011a;
        public int b;
        public int c;
        public androidx.recyclerview.widget.RecyclerView d;
        public int e;

        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.recyclerview.widget.m.e = r0
            androidx.recyclerview.widget.m$a r0 = new androidx.recyclerview.widget.m$a
            r0.<init>()
            androidx.recyclerview.widget.m.f = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1009a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            return
    }

    public static androidx.recyclerview.widget.RecyclerView.A c(androidx.recyclerview.widget.RecyclerView r5, int r6, long r7) {
            androidx.recyclerview.widget.b r0 = r5.f
            int r0 = r0.h()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            androidx.recyclerview.widget.b r3 = r5.f
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.RecyclerView$A r3 = androidx.recyclerview.widget.RecyclerView.L(r3)
            int r4 = r3.c
            if (r4 != r6) goto L20
            boolean r3 = r3.f()
            if (r3 != 0) goto L20
            r5 = 0
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            androidx.recyclerview.widget.RecyclerView$r r0 = r5.c
            r5.S()     // Catch: java.lang.Throwable -> L40
            androidx.recyclerview.widget.RecyclerView$A r6 = r0.k(r7, r6)     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L45
            boolean r7 = r6.e()     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L42
            boolean r7 = r6.f()     // Catch: java.lang.Throwable -> L40
            if (r7 != 0) goto L42
            android.view.View r7 = r6.f963a     // Catch: java.lang.Throwable -> L40
            r0.h(r7)     // Catch: java.lang.Throwable -> L40
            goto L45
        L40:
            r6 = move-exception
            goto L49
        L42:
            r0.a(r6, r1)     // Catch: java.lang.Throwable -> L40
        L45:
            r5.T(r1)
            return r6
        L49:
            r5.T(r1)
            throw r6
    }

    public final void a(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r5.s
            if (r0 == 0) goto L2a
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y0
            if (r0 == 0) goto L19
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r4.f1009a
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "attempting to post unregistered view!"
            r5.<init>(r6)
            throw r5
        L19:
            long r0 = r4.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.getNanoTime()
            r4.b = r0
            r5.post(r4)
        L2a:
            androidx.recyclerview.widget.m$b r5 = r5.e0
            r5.f1010a = r6
            r5.b = r7
            return
    }

    public final void b(long r17) {
            r16 = this;
            r1 = r16
            r0 = 1
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r1.f1009a
            int r3 = r2.size()
            r4 = 0
            r5 = r4
            r6 = r5
        Lc:
            if (r5 >= r3) goto L24
            java.lang.Object r7 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            if (r8 != 0) goto L22
            androidx.recyclerview.widget.m$b r8 = r7.e0
            r8.b(r7, r4)
            int r7 = r8.d
            int r6 = r6 + r7
        L22:
            int r5 = r5 + r0
            goto Lc
        L24:
            java.util.ArrayList<androidx.recyclerview.widget.m$c> r5 = r1.d
            r5.ensureCapacity(r6)
            r6 = r4
            r7 = r6
        L2b:
            if (r6 >= r3) goto L82
            java.lang.Object r8 = r2.get(r6)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            if (r9 == 0) goto L3a
            goto L80
        L3a:
            androidx.recyclerview.widget.m$b r9 = r8.e0
            int r10 = r9.f1010a
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.b
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r10
            r10 = r4
        L4a:
            int r12 = r9.d
            int r12 = r12 * 2
            if (r10 >= r12) goto L80
            int r12 = r5.size()
            if (r7 < r12) goto L5f
            androidx.recyclerview.widget.m$c r12 = new androidx.recyclerview.widget.m$c
            r12.<init>()
            r5.add(r12)
            goto L65
        L5f:
            java.lang.Object r12 = r5.get(r7)
            androidx.recyclerview.widget.m$c r12 = (androidx.recyclerview.widget.m.c) r12
        L65:
            int[] r13 = r9.c
            int r14 = r10 + 1
            r14 = r13[r14]
            if (r14 > r11) goto L6f
            r15 = r0
            goto L70
        L6f:
            r15 = r4
        L70:
            r12.f1011a = r15
            r12.b = r11
            r12.c = r14
            r12.d = r8
            r13 = r13[r10]
            r12.e = r13
            int r7 = r7 + r0
            int r10 = r10 + 2
            goto L4a
        L80:
            int r6 = r6 + r0
            goto L2b
        L82:
            androidx.recyclerview.widget.m$a r2 = androidx.recyclerview.widget.m.f
            java.util.Collections.sort(r5, r2)
            r2 = r4
        L88:
            int r3 = r5.size()
            if (r2 >= r3) goto L145
            java.lang.Object r3 = r5.get(r2)
            androidx.recyclerview.widget.m$c r3 = (androidx.recyclerview.widget.m.c) r3
            androidx.recyclerview.widget.RecyclerView r6 = r3.d
            if (r6 != 0) goto L9a
            goto L145
        L9a:
            boolean r7 = r3.f1011a
            if (r7 == 0) goto La4
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto La6
        La4:
            r7 = r17
        La6:
            int r9 = r3.e
            androidx.recyclerview.widget.RecyclerView$A r6 = c(r6, r9, r7)
            if (r6 == 0) goto Lc8
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r7 = r6.b
            if (r7 == 0) goto Lc8
            boolean r7 = r6.e()
            if (r7 == 0) goto Lc8
            boolean r7 = r6.f()
            if (r7 != 0) goto Lc8
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r6 = r6.b
            java.lang.Object r6 = r6.get()
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 != 0) goto Lcb
        Lc8:
            r10 = r17
            goto L137
        Lcb:
            boolean r7 = r6.B
            if (r7 == 0) goto Lf4
            androidx.recyclerview.widget.b r7 = r6.f
            int r7 = r7.h()
            if (r7 == 0) goto Lf4
            androidx.recyclerview.widget.RecyclerView$i r7 = r6.K
            if (r7 == 0) goto Lde
            r7.e()
        Lde:
            androidx.recyclerview.widget.RecyclerView$l r7 = r6.m
            androidx.recyclerview.widget.RecyclerView$r r8 = r6.c
            if (r7 == 0) goto Lec
            r7.i0(r8)
            androidx.recyclerview.widget.RecyclerView$l r7 = r6.m
            r7.j0(r8)
        Lec:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r7 = r8.f978a
            r7.clear()
            r8.f()
        Lf4:
            androidx.recyclerview.widget.m$b r7 = r6.e0
            r7.b(r6, r0)
            int r8 = r7.d
            if (r8 == 0) goto Lc8
            java.lang.String r8 = "RV Nested Prefetch"
            int r9 = a.Af.f16a     // Catch: java.lang.Throwable -> L129
            android.os.Trace.beginSection(r8)     // Catch: java.lang.Throwable -> L129
            androidx.recyclerview.widget.RecyclerView$w r8 = r6.f0     // Catch: java.lang.Throwable -> L129
            androidx.recyclerview.widget.RecyclerView$d r9 = r6.l     // Catch: java.lang.Throwable -> L129
            r8.d = r0     // Catch: java.lang.Throwable -> L129
            int r9 = r9.a()     // Catch: java.lang.Throwable -> L129
            r8.e = r9     // Catch: java.lang.Throwable -> L129
            r8.g = r4     // Catch: java.lang.Throwable -> L129
            r8.h = r4     // Catch: java.lang.Throwable -> L129
            r8.i = r4     // Catch: java.lang.Throwable -> L129
            r8 = r4
        L117:
            int r9 = r7.d     // Catch: java.lang.Throwable -> L129
            int r9 = r9 * 2
            if (r8 >= r9) goto L12b
            int[] r9 = r7.c     // Catch: java.lang.Throwable -> L129
            r9 = r9[r8]     // Catch: java.lang.Throwable -> L129
            r10 = r17
            c(r6, r9, r10)     // Catch: java.lang.Throwable -> L129
            int r8 = r8 + 2
            goto L117
        L129:
            r0 = move-exception
            goto L131
        L12b:
            r10 = r17
            android.os.Trace.endSection()
            goto L137
        L131:
            int r2 = a.Af.f16a
            android.os.Trace.endSection()
            throw r0
        L137:
            r3.f1011a = r4
            r3.b = r4
            r3.c = r4
            r6 = 0
            r3.d = r6
            r3.e = r4
            int r2 = r2 + r0
            goto L88
        L145:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            r0 = 0
            java.lang.String r2 = "RV Prefetch"
            int r3 = a.Af.f16a     // Catch: java.lang.Throwable -> L34
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r9.f1009a
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L17
            r9.b = r0
            android.os.Trace.endSection()
            return
        L17:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L34
            r4 = 0
            r5 = r0
        L1d:
            if (r4 >= r3) goto L39
            java.lang.Object r7 = r2.get(r4)     // Catch: java.lang.Throwable -> L34
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7     // Catch: java.lang.Throwable -> L34
            int r8 = r7.getWindowVisibility()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L36
            long r7 = r7.getDrawingTime()     // Catch: java.lang.Throwable -> L34
            long r5 = java.lang.Math.max(r7, r5)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r2 = move-exception
            goto L55
        L36:
            int r4 = r4 + 1
            goto L1d
        L39:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L43
            r9.b = r0
            android.os.Trace.endSection()
            return
        L43:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L34
            long r2 = r2.toNanos(r5)     // Catch: java.lang.Throwable -> L34
            long r4 = r9.c     // Catch: java.lang.Throwable -> L34
            long r2 = r2 + r4
            r9.b(r2)     // Catch: java.lang.Throwable -> L34
            r9.b = r0
            android.os.Trace.endSection()
            return
        L55:
            r9.b = r0
            int r0 = a.Af.f16a
            android.os.Trace.endSection()
            throw r2
    }
}
