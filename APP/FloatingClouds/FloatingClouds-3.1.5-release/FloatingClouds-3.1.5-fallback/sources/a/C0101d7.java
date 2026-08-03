package a;

/* JADX INFO: renamed from: a.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0101d7 implements a.X<java.util.Map<java.lang.String, java.lang.Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.AbstractC0119e7 f433a;

    public C0101d7(a.AbstractC0119e7 r1) {
            r0 = this;
            r0.<init>()
            r0.f433a = r1
            return
    }

    @Override // a.X
    public final void a(java.util.Map<java.lang.String, java.lang.Boolean> r5) {
            r4 = this;
            java.util.Map r5 = (java.util.Map) r5
            java.util.Set r0 = r5.keySet()
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r5 = r5.values()
            r0.<init>(r5)
            int r5 = r0.size()
            int[] r5 = new int[r5]
            r2 = r1
        L1f:
            int r3 = r0.size()
            if (r2 >= r3) goto L39
            java.lang.Object r3 = r0.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L33
            r3 = r1
            goto L34
        L33:
            r3 = -1
        L34:
            r5[r2] = r3
            int r2 = r2 + 1
            goto L1f
        L39:
            a.e7 r5 = r4.f433a
            java.util.ArrayDeque<a.e7$g> r0 = r5.E
            java.lang.Object r0 = r0.pollFirst()
            a.e7$g r0 = (a.AbstractC0119e7.g) r0
            java.lang.String r1 = "FragmentManager"
            if (r0 != 0) goto L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No permissions were requested for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r1, r5)
            return
        L59:
            a.A2 r5 = r5.c
            java.lang.String r0 = r0.f455a
            androidx.fragment.app.b r5 = r5.d(r0)
            if (r5 != 0) goto L74
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "Permission request result delivered for unknown Fragment "
            r5.<init>(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r1, r5)
        L74:
            return
    }
}
