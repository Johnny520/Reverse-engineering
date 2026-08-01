package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class sx {
    public final /* synthetic */ int a;
    public final java.lang.Object[] b;
    public int c;

    public sx() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.b = r0
            return
    }

    public sx(int r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            if (r2 <= 0) goto Ld
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.b = r2
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The max pool size must be > 0"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.Object a() {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            int r0 = r5.c
            r1 = 0
            if (r0 <= 0) goto L17
            int r2 = r0 + (-1)
            java.lang.Object[] r3 = r5.b
            r4 = r3[r2]
            r3[r2] = r1
            int r0 = r0 + (-1)
            r5.c = r0
            r1 = r4
        L17:
            return r1
        L18:
            int r0 = r5.c
            r1 = 0
            if (r0 <= 0) goto L2a
            int r2 = r0 + (-1)
            java.lang.Object[] r3 = r5.b
            r4 = r3[r2]
            r3[r2] = r1
            int r0 = r0 + (-1)
            r5.c = r0
            r1 = r4
        L2a:
            return r1
    }

    public void b(defpackage.p6 r4) {
            r3 = this;
            int r0 = r3.c
            java.lang.Object[] r1 = r3.b
            int r2 = r1.length
            if (r0 >= r2) goto Ld
            r1[r0] = r4
            int r0 = r0 + 1
            r3.c = r0
        Ld:
            return
    }

    public boolean c(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.c
            java.lang.Object[] r3 = r4.b
            if (r1 >= r2) goto L17
            r2 = r3[r1]
            if (r2 == r5) goto Lf
            int r1 = r1 + 1
            goto L2
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r5.<init>(r0)
            throw r5
        L17:
            int r1 = r3.length
            if (r2 >= r1) goto L21
            r3[r2] = r5
            r5 = 1
            int r2 = r2 + r5
            r4.c = r2
            return r5
        L21:
            return r0
    }
}
