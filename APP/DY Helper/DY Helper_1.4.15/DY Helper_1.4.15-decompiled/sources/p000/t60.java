package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class t60 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f10209;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.b70 f10210;

    public /* synthetic */ t60(p000.b70 r1, int r2) {
            r0 = this;
            r0.f10209 = r2
            r0.f10210 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m5608(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f10209
            switch(r0) {
                case 0: goto L95;
                case 1: goto L4d;
                default: goto L5;
            }
        L5:
            k r5 = (p000.C0451k) r5
            b70 r0 = r4.f10210
            java.util.ArrayDeque r1 = r0.f1507
            java.lang.Object r1 = r1.pollFirst()
            y60 r1 = (p000.y60) r1
            java.lang.String r2 = "FragmentManager"
            if (r1 != 0) goto L27
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No IntentSenders were started for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r2, r4)
            goto L4c
        L27:
            java.lang.String r4 = r1.f12469
            int r1 = r1.f12470
            i0 r0 = r0.f1520
            n60 r0 = r0.m2567(r4)
            if (r0 != 0) goto L45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r2, r4)
            goto L4c
        L45:
            int r4 = r5.f5679
            android.content.Intent r5 = r5.f5680
            r0.m4004(r1, r4, r5)
        L4c:
            return
        L4d:
            k r5 = (p000.C0451k) r5
            b70 r0 = r4.f10210
            java.util.ArrayDeque r1 = r0.f1507
            java.lang.Object r1 = r1.pollLast()
            y60 r1 = (p000.y60) r1
            java.lang.String r2 = "FragmentManager"
            if (r1 != 0) goto L6f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No Activities were started for result for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r2, r4)
            goto L94
        L6f:
            java.lang.String r4 = r1.f12469
            int r1 = r1.f12470
            i0 r0 = r0.f1520
            n60 r0 = r0.m2567(r4)
            if (r0 != 0) goto L8d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r2, r4)
            goto L94
        L8d:
            int r4 = r5.f5679
            android.content.Intent r5 = r5.f5680
            r0.m4004(r1, r4, r5)
        L94:
            return
        L95:
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
        Lb4:
            int r3 = r0.size()
            if (r2 >= r3) goto Lce
            java.lang.Object r3 = r0.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lc8
            r3 = r1
            goto Lc9
        Lc8:
            r3 = -1
        Lc9:
            r5[r2] = r3
            int r2 = r2 + 1
            goto Lb4
        Lce:
            b70 r5 = r4.f10210
            java.util.ArrayDeque r0 = r5.f1507
            java.lang.Object r0 = r0.pollFirst()
            y60 r0 = (p000.y60) r0
            java.lang.String r1 = "FragmentManager"
            if (r0 != 0) goto Lee
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No permissions were requested for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r1, r4)
            goto L109
        Lee:
            java.lang.String r4 = r0.f12469
            i0 r5 = r5.f1520
            n60 r5 = r5.m2567(r4)
            if (r5 != 0) goto L109
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Permission request result delivered for unknown Fragment "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r1, r4)
        L109:
            return
    }
}
