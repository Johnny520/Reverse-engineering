package p000;

/* JADX INFO: renamed from: qm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0729qm implements p000.hq1 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9047;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f9048;

    public /* synthetic */ C0729qm(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f9047 = r1
            r0.f9048 = r2
            r0.<init>()
            return
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: α */
    public final android.os.Bundle mo1949() {
            r15 = this;
            int r0 = r15.f9047
            java.lang.Object r15 = r15.f9048
            switch(r0) {
                case 0: goto Lca;
                case 1: goto L2e;
                case 2: goto Le;
                default: goto L7;
            }
        L7:
            b70 r15 = (p000.b70) r15
            android.os.Bundle r15 = r15.m771()
            return r15
        Le:
            r0 = r15
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            int r15 = androidx.fragment.app.FragmentActivity.f1092
        L13:
            n r15 = r0.f1096
            java.lang.Object r15 = r15.f7336
            p60 r15 = (p000.p60) r15
            b70 r15 = r15.f8433
            boolean r15 = androidx.fragment.app.FragmentActivity.m463(r15)
            if (r15 != 0) goto L13
            jr0 r15 = r0.f1097
            br0 r0 = p000.br0.ON_STOP
            r15.m2983(r0)
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            return r15
        L2e:
            y21 r15 = (p000.y21) r15
            java.lang.Object r15 = r15.f12428
            b21 r15 = (p000.b21) r15
            if (r15 != 0) goto L39
            kz r15 = p000.C0493kz.f6332
            goto L93
        L39:
            r0 = 0
            if (r15 == 0) goto L3f
            int r1 = r15.f1431
            goto L40
        L3f:
            r1 = r0
        L40:
            int r1 = r1 + r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            if (r15 == 0) goto L92
            java.lang.Object[] r1 = r15.f1428
            java.lang.Object[] r3 = r15.f1429
            long[] r15 = r15.f1427
            int r4 = r15.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L92
            r5 = r0
        L54:
            r6 = r15[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8d
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r0
        L6e:
            if (r10 >= r8) goto L8b
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L87
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r3[r11]
            java.util.List r11 = (java.util.List) r11
            java.lang.String r12 = (java.lang.String) r12
            r2.put(r12, r11)
        L87:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L6e
        L8b:
            if (r8 != r9) goto L92
        L8d:
            if (r5 == r4) goto L92
            int r5 = r5 + 1
            goto L54
        L92:
            r15 = r2
        L93:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        La0:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r1 instanceof java.util.ArrayList
            if (r3 == 0) goto Lbf
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            goto Lc5
        Lbf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r1 = r3
        Lc5:
            r0.putParcelableArrayList(r2, r1)
            goto La0
        Lc9:
            return r0
        Lca:
            androidx.activity.ComponentActivity r15 = (androidx.activity.ComponentActivity) r15
            int r0 = androidx.activity.ComponentActivity.f339
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            sm r15 = r15.f348
            r15.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap r2 = r15.f9956
            java.util.Collection r3 = r2.values()
            r1.<init>(r3)
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r0.putIntegerArrayList(r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r0.putStringArrayList(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList r2 = r15.f9958
            r1.<init>(r2)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r0.putStringArrayList(r2, r1)
            android.os.Bundle r15 = r15.f9961
            java.lang.Object r15 = r15.clone()
            android.os.Bundle r15 = (android.os.Bundle) r15
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r0.putBundle(r1, r15)
            return r0
    }
}
