package a;

/* JADX INFO: loaded from: classes.dex */
public class Cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48a;
    public final java.lang.Object[] b;
    public int c;

    public Cc() {
            r1 = this;
            r0 = 1
            r1.f48a = r0
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.b = r0
            return
    }

    public Cc(int r2) {
            r1 = this;
            r0 = 0
            r1.f48a = r0
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

    public Cc(int r2, a.T6[] r3) {
            r1 = this;
            r0 = 2
            r1.f48a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            return
    }

    public java.lang.Object a() {
            r5 = this;
            int r0 = r5.f48a
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
            if (r0 <= 0) goto L31
            int r0 = r0 + (-1)
            java.lang.Object[] r2 = r5.b
            r3 = r2[r0]
            java.lang.String r4 = "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"
            a.C0193i9.c(r3, r4)
            r2[r0] = r1
            int r0 = r5.c
            int r0 = r0 + (-1)
            r5.c = r0
            r1 = r3
        L31:
            return r1
    }

    public void b(a.K1 r4) {
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

    public boolean c(java.lang.Object r7) {
            r6 = this;
            java.lang.String r0 = "instance"
            a.C0193i9.e(r7, r0)
            int r0 = r6.c
            r1 = 0
            r2 = r1
        L9:
            java.lang.Object[] r3 = r6.b
            r4 = 1
            if (r2 >= r0) goto L17
            r5 = r3[r2]
            if (r5 != r7) goto L14
            r0 = r4
            goto L18
        L14:
            int r2 = r2 + 1
            goto L9
        L17:
            r0 = r1
        L18:
            if (r0 != 0) goto L26
            int r0 = r6.c
            int r2 = r3.length
            if (r0 >= r2) goto L25
            r3[r0] = r7
            int r0 = r0 + r4
            r6.c = r0
            return r4
        L25:
            return r1
        L26:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r7.<init>(r0)
            throw r7
    }
}
