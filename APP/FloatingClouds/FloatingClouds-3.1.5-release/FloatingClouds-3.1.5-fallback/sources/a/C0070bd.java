package a;

/* JADX INFO: renamed from: a.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0070bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap<java.lang.String, java.lang.Integer> f412a = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            a.C0070bd.f412a = r0
            return
    }

    public static int a(java.lang.String r5) {
            android.content.Context r0 = a.C0435w1.p
            a.C0193i9.b(r0)
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r2 = "@id/"
            java.lang.String r2 = r2.concat(r5)
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = a.C0070bd.f412a
            java.lang.Object r4 = r3.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L2a
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r4 = "id"
            int r5 = r0.getIdentifier(r5, r4, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.put(r2, r4)
        L2a:
            int r5 = r4.intValue()
            return r5
    }
}
