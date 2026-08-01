package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rl {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.yl b;

    public /* synthetic */ rl(defpackage.yl r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public final void a(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto Lc2;
                case 1: goto L4d;
                default: goto L5;
            }
        L5:
            u1 r5 = (defpackage.u1) r5
            yl r0 = r4.b
            java.util.ArrayDeque r1 = r0.w
            java.lang.Object r1 = r1.pollFirst()
            vl r1 = (defpackage.vl) r1
            java.lang.String r2 = "FragmentManager"
            if (r1 != 0) goto L27
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No Activities were started for result for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r2, r5)
            goto L4c
        L27:
            java.lang.String r3 = r1.a
            int r1 = r1.b
            r5 r0 = r0.c
            ml r0 = r0.h(r3)
            if (r0 != 0) goto L45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r2, r5)
            goto L4c
        L45:
            int r2 = r5.a
            android.content.Intent r5 = r5.b
            r0.k(r1, r2, r5)
        L4c:
            return
        L4d:
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
        L6c:
            int r3 = r0.size()
            if (r2 >= r3) goto L86
            java.lang.Object r3 = r0.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L80
            r3 = r1
            goto L81
        L80:
            r3 = -1
        L81:
            r5[r2] = r3
            int r2 = r2 + 1
            goto L6c
        L86:
            yl r5 = r4.b
            java.util.ArrayDeque r0 = r5.w
            java.lang.Object r0 = r0.pollFirst()
            vl r0 = (defpackage.vl) r0
            java.lang.String r1 = "FragmentManager"
            if (r0 != 0) goto La6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No permissions were requested for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r1, r5)
            goto Lc1
        La6:
            java.lang.String r0 = r0.a
            r5 r5 = r5.c
            ml r5 = r5.h(r0)
            if (r5 != 0) goto Lc1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "Permission request result delivered for unknown Fragment "
            r5.<init>(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r1, r5)
        Lc1:
            return
        Lc2:
            u1 r5 = (defpackage.u1) r5
            yl r0 = r4.b
            java.util.ArrayDeque r1 = r0.w
            java.lang.Object r1 = r1.pollFirst()
            vl r1 = (defpackage.vl) r1
            java.lang.String r2 = "FragmentManager"
            if (r1 != 0) goto Le4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No IntentSenders were started for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r2, r5)
            goto L109
        Le4:
            java.lang.String r3 = r1.a
            int r1 = r1.b
            r5 r0 = r0.c
            ml r0 = r0.h(r3)
            if (r0 != 0) goto L102
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r2, r5)
            goto L109
        L102:
            int r2 = r5.a
            android.content.Intent r5 = r5.b
            r0.k(r1, r2, r5)
        L109:
            return
    }
}
