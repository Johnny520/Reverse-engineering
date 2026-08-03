package a;

/* JADX INFO: renamed from: a.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0430ve extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f740a;
    public int b;
    public final boolean c;

    public C0430ve() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.b = r0
            return
    }

    public C0430ve(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "value"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "matchType"
            a.C0487z.j(r0, r3)
            r1.<init>()
            r1.f740a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r8) {
            r7 = this;
            java.lang.String r0 = r7.f740a
            if (r0 == 0) goto L74
            int r1 = r0.length()
            if (r1 != 0) goto L11
            int r1 = r7.b
            r2 = 5
            if (r1 == r2) goto L11
            r7.b = r2
        L11:
            int r0 = r8.c(r0)
            int r1 = r7.b
            r2 = 1
            if (r1 == r2) goto L2a
            r3 = 2
            if (r1 == r3) goto L2b
            r2 = 3
            if (r1 == r2) goto L26
            r3 = 4
            if (r1 == r3) goto L2b
            r2 = 5
            if (r1 != r2) goto L28
        L26:
            r2 = r3
            goto L2b
        L28:
            r8 = 0
            throw r8
        L2a:
            r2 = 0
        L2b:
            r1 = 3
            r8.i(r1)
            r1 = 0
            r8.a(r1, r0)
            r0 = 2
            boolean r3 = r7.c
            if (r3 == 0) goto L51
            r4 = 0
            r5 = 1
            r8.h(r5, r4)
            java.nio.ByteBuffer r4 = r8.f26a
            int r6 = r8.b
            int r6 = r6 - r5
            r8.b = r6
            byte r3 = (byte) r3
            r4.put(r6, r3)
            int[] r3 = r8.d
            int r4 = r8.g()
            r3[r0] = r4
            goto L54
        L51:
            r8.getClass()
        L54:
            if (r2 == 0) goto L6c
            r0 = 1
            r8.h(r0, r1)
            java.nio.ByteBuffer r1 = r8.f26a
            int r3 = r8.b
            int r3 = r3 - r0
            r8.b = r3
            r1.put(r3, r2)
            int[] r1 = r8.d
            int r2 = r8.g()
            r1[r0] = r2
        L6c:
            int r0 = r8.e()
            r8.f(r0)
            return r0
        L74:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "value must be specified"
            r8.<init>(r0)
            throw r8
    }
}
