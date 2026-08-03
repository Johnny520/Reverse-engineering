package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f91a;

    @android.annotation.SuppressLint({"UnknownNullness"})
    public final android.view.View b;
    public final java.util.ArrayList<androidx.transition.e> c;

    @java.lang.Deprecated
    public Ff() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f91a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            return
    }

    public Ff(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f91a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r1.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof a.Ff
            if (r0 == 0) goto L18
            a.Ff r3 = (a.Ff) r3
            android.view.View r0 = r3.b
            android.view.View r1 = r2.b
            if (r1 != r0) goto L18
            java.util.HashMap r0 = r2.f91a
            java.util.HashMap r3 = r3.f91a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            android.view.View r0 = r2.b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap r1 = r2.f91a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransitionValues@"
            r0.<init>(r1)
            int r1 = r6.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ":\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "    view = "
            r1.append(r0)
            android.view.View r0 = r6.b
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "    values:"
            java.lang.String r1 = a.C0487z.f(r1, r2)
            java.util.HashMap r2 = r6.f91a
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L46:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "    "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = ": "
            r5.append(r1)
            java.lang.Object r1 = r2.get(r4)
            r5.append(r1)
            r5.append(r0)
            java.lang.String r1 = r5.toString()
            goto L46
        L76:
            return r1
    }
}
