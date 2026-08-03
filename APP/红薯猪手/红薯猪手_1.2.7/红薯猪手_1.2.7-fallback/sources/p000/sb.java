package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sb {
    public sb() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.List m408(java.lang.Object r1) {
            boolean r0 = r1 instanceof p000.n4
            if (r0 != 0) goto L12
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.ClassCastException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.Class<۟.sb> r0 = p000.sb.class
            java.lang.String r0 = r0.getName()
            p000.h4.m190(r0, r1)
            throw r1
        L12:
            java.lang.String r0 = "kotlin.collections.MutableList"
            m409(r0, r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m409(java.lang.String r1, java.lang.Object r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " cannot be cast to "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>(r1)
            java.lang.Class<۟.sb> r1 = p000.sb.class
            java.lang.String r1 = r1.getName()
            p000.h4.m190(r1, r2)
            throw r2
    }
}
