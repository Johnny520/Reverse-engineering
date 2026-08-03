package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.B.b f953a;
    public final androidx.recyclerview.widget.B.a b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f954a;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean a() {
                r6 = this;
                int r0 = r6.f954a
                r1 = r0 & 7
                r2 = 2
                r3 = 4
                r4 = 1
                if (r1 == 0) goto L1a
                int r1 = r6.d
                int r5 = r6.b
                if (r1 <= r5) goto L11
                r1 = r4
                goto L16
            L11:
                if (r1 != r5) goto L15
                r1 = r2
                goto L16
            L15:
                r1 = r3
            L16:
                r1 = r1 & r0
                if (r1 != 0) goto L1a
                goto L5c
            L1a:
                r1 = r0 & 112(0x70, float:1.57E-43)
                if (r1 == 0) goto L30
                int r1 = r6.d
                int r5 = r6.c
                if (r1 <= r5) goto L26
                r1 = r4
                goto L2b
            L26:
                if (r1 != r5) goto L2a
                r1 = r2
                goto L2b
            L2a:
                r1 = r3
            L2b:
                int r1 = r1 << r3
                r1 = r1 & r0
                if (r1 != 0) goto L30
                goto L5c
            L30:
                r1 = r0 & 1792(0x700, float:2.511E-42)
                if (r1 == 0) goto L47
                int r1 = r6.e
                int r5 = r6.b
                if (r1 <= r5) goto L3c
                r1 = r4
                goto L41
            L3c:
                if (r1 != r5) goto L40
                r1 = r2
                goto L41
            L40:
                r1 = r3
            L41:
                int r1 = r1 << 8
                r1 = r1 & r0
                if (r1 != 0) goto L47
                goto L5c
            L47:
                r1 = r0 & 28672(0x7000, float:4.0178E-41)
                if (r1 == 0) goto L5e
                int r1 = r6.e
                int r5 = r6.c
                if (r1 <= r5) goto L53
                r2 = r4
                goto L57
            L53:
                if (r1 != r5) goto L56
                goto L57
            L56:
                r2 = r3
            L57:
                int r1 = r2 << 12
                r0 = r0 & r1
                if (r0 != 0) goto L5e
            L5c:
                r0 = 0
                return r0
            L5e:
                return r4
        }
    }

    public interface b {
        android.view.View a(int r1);

        int b();

        int c();

        int d(android.view.View r1);

        int e(android.view.View r1);
    }

    public B(androidx.recyclerview.widget.B.b r2) {
            r1 = this;
            r1.<init>()
            r1.f953a = r2
            androidx.recyclerview.widget.B$a r2 = new androidx.recyclerview.widget.B$a
            r2.<init>()
            r0 = 0
            r2.f954a = r0
            r1.b = r2
            return
    }

    public final android.view.View a(int r10, int r11, int r12, int r13) {
            r9 = this;
            androidx.recyclerview.widget.B$b r0 = r9.f953a
            int r1 = r0.c()
            int r2 = r0.b()
            if (r11 <= r10) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = -1
        Lf:
            r4 = 0
        L10:
            if (r10 == r11) goto L40
            android.view.View r5 = r0.a(r10)
            int r6 = r0.e(r5)
            int r7 = r0.d(r5)
            androidx.recyclerview.widget.B$a r8 = r9.b
            r8.b = r1
            r8.c = r2
            r8.d = r6
            r8.e = r7
            if (r12 == 0) goto L33
            r8.f954a = r12
            boolean r6 = r8.a()
            if (r6 == 0) goto L33
            return r5
        L33:
            if (r13 == 0) goto L3e
            r8.f954a = r13
            boolean r6 = r8.a()
            if (r6 == 0) goto L3e
            r4 = r5
        L3e:
            int r10 = r10 + r3
            goto L10
        L40:
            return r4
    }

    public final boolean b(android.view.View r5) {
            r4 = this;
            androidx.recyclerview.widget.B$b r0 = r4.f953a
            int r1 = r0.c()
            int r2 = r0.b()
            int r3 = r0.e(r5)
            int r5 = r0.d(r5)
            androidx.recyclerview.widget.B$a r0 = r4.b
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r5
            r5 = 24579(0x6003, float:3.4443E-41)
            r0.f954a = r5
            boolean r5 = r0.a()
            return r5
    }
}
