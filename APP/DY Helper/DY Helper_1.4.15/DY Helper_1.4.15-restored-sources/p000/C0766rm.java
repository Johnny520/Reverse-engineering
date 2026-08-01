package p000;

/* JADX INFO: renamed from: rm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0766rm implements p000.e51 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9401;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ androidx.activity.ComponentActivity f9402;

    public /* synthetic */ C0766rm(androidx.activity.ComponentActivity r1, int r2) {
            r0 = this;
            r0.f9401 = r2
            r0.f9402 = r1
            r0.<init>()
            return
    }

    @Override // p000.e51
    /* JADX INFO: renamed from: α */
    public final void mo1847() {
            r9 = this;
            int r0 = r9.f9401
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            androidx.activity.ComponentActivity r9 = r9.f9402
            androidx.fragment.app.FragmentActivity r9 = (androidx.fragment.app.FragmentActivity) r9
            n r9 = r9.f1096
            java.lang.Object r9 = r9.f7336
            p60 r9 = (p000.p60) r9
            b70 r0 = r9.f8433
            r1 = 0
            r0.m777(r9, r9, r1)
            return
        L16:
            androidx.activity.ComponentActivity r9 = r9.f9402
            n5 r0 = r9.f343
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            java.lang.String r1 = "android:support:activity-result"
            android.os.Bundle r0 = r0.m3985(r1)
            if (r0 == 0) goto L8c
            sm r9 = r9.f348
            java.util.HashMap r1 = r9.f9956
            java.util.HashMap r2 = r9.f9955
            android.os.Bundle r3 = r9.f9961
            java.lang.String r4 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r4 = r0.getIntegerArrayList(r4)
            java.lang.String r5 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r5 = r0.getStringArrayList(r5)
            if (r5 == 0) goto L8c
            if (r4 != 0) goto L3f
            goto L8c
        L3f:
            java.lang.String r6 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r6 = r0.getStringArrayList(r6)
            r9.f9958 = r6
            java.lang.String r6 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r0 = r0.getBundle(r6)
            r3.putAll(r0)
            r0 = 0
        L51:
            int r6 = r5.size()
            if (r0 >= r6) goto L8c
            java.lang.Object r6 = r5.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r1.containsKey(r6)
            if (r7 == 0) goto L72
            java.lang.Object r7 = r1.remove(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            boolean r6 = r3.containsKey(r6)
            if (r6 != 0) goto L72
            r2.remove(r7)
        L72:
            java.lang.Object r6 = r4.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            java.lang.Object r7 = r5.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            r2.put(r6, r7)
            java.util.HashMap r8 = r9.f9956
            r8.put(r7, r6)
            int r0 = r0 + 1
            goto L51
        L8c:
            return
    }
}
