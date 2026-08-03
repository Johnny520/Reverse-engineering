package q1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a(int r6) {
            long r0 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            r6 = 0
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            int r6 = q1.a.O
            return r0
    }

    public static final long b(android.view.KeyEvent r2) {
            int r2 = r2.getKeyCode()
            long r0 = a(r2)
            return r0
    }

    public static final int c(android.view.KeyEvent r1) {
            int r1 = r1.getAction()
            if (r1 == 0) goto Lc
            r0 = 1
            if (r1 == r0) goto Lb
            r1 = 0
            return r1
        Lb:
            return r0
        Lc:
            r1 = 2
            return r1
    }

    public static final y0.o d(fg.l r2) {
            q1.c r0 = new q1.c
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static final y0.o e(y0.o r2, fg.l r3) {
            q1.c r0 = new q1.c
            r1 = 0
            r0.<init>(r1, r3)
            y0.o r2 = r2.d(r0)
            return r2
    }
}
