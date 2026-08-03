package a;

/* JADX INFO: loaded from: classes.dex */
public class Rf {

    public class a implements a.Rf.b<a.T6> {
        @Override // a.Rf.b
        public final int a(a.T6 r1) {
                r0 = this;
                a.T6 r1 = (a.T6) r1
                int r1 = r1.c
                return r1
        }

        @Override // a.Rf.b
        public final boolean b(a.T6 r1) {
                r0 = this;
                a.T6 r1 = (a.T6) r1
                boolean r1 = r1.d
                return r1
        }
    }

    public interface b<T> {
        int a(T r1);

        boolean b(T r1);
    }

    public Rf() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public android.graphics.Typeface a(android.content.Context r1, a.S6.c r2, android.content.res.Resources r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public android.graphics.Typeface b(android.content.Context r1, a.T6[] r2, int r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public android.graphics.Typeface c(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            java.io.File r1 = a.Sf.d(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = a.Sf.b(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
    }

    public a.T6 d(int r12, a.T6[] r13) {
            r11 = this;
            a.Rf$a r0 = new a.Rf$a
            r0.<init>()
            r1 = r12 & 1
            if (r1 != 0) goto Lc
            r1 = 400(0x190, float:5.6E-43)
            goto Le
        Lc:
            r1 = 700(0x2bc, float:9.81E-43)
        Le:
            r12 = r12 & 2
            r2 = 1
            r3 = 0
            if (r12 == 0) goto L16
            r12 = r2
            goto L17
        L16:
            r12 = r3
        L17:
            int r4 = r13.length
            r5 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = r3
        L1d:
            if (r7 >= r4) goto L3f
            r8 = r13[r7]
            int r9 = r0.a(r8)
            int r9 = r9 - r1
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * 2
            boolean r10 = r0.b(r8)
            if (r10 != r12) goto L34
            r10 = r3
            goto L35
        L34:
            r10 = r2
        L35:
            int r9 = r9 + r10
            if (r5 == 0) goto L3a
            if (r6 <= r9) goto L3c
        L3a:
            r5 = r8
            r6 = r9
        L3c:
            int r7 = r7 + 1
            goto L1d
        L3f:
            return r5
    }
}
