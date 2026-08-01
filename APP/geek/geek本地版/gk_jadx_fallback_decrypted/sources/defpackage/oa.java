package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oa {
    public final int a;
    public final java.lang.reflect.Method b;

    public oa(int r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 1
            r2.setAccessible(r1)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.oa
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oa r5 = (defpackage.oa) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 != r3) goto L25
            java.lang.reflect.Method r1 = r4.b
            java.lang.String r1 = r1.getName()
            java.lang.reflect.Method r5 = r5.b
            java.lang.String r5 = r5.getName()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.b
            java.lang.String r1 = r1.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
