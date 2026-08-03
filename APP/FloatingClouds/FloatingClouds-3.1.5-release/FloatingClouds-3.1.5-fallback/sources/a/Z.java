package a;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends a.Y<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {
    @Override // a.Y
    public final android.content.Intent a(android.content.Context r2, android.os.Parcelable r3) {
            r1 = this;
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.String r2 = "input"
            a.C0193i9.e(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r0 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            r2.<init>(r0)
            java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r2 = r2.putExtra(r0, r3)
            java.lang.String r3 = "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)"
            a.C0193i9.d(r2, r3)
            return r2
    }

    @Override // a.Y
    public final a.Y.a b(android.content.Context r7, android.os.Parcelable r8) {
            r6 = this;
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.String r0 = "input"
            a.C0193i9.e(r8, r0)
            int r0 = r8.length
            if (r0 != 0) goto L12
            a.Y$a r7 = new a.Y$a
            a.Z5 r8 = a.Z5.f369a
            r7.<init>(r8)
            return r7
        L12:
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L15:
            if (r2 >= r0) goto L55
            r3 = r8[r2]
            if (r3 == 0) goto L4d
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 >= r5) goto L3a
            java.lang.String r4 = "android.permission.POST_NOTIFICATIONS"
            boolean r4 = android.text.TextUtils.equals(r4, r3)
            if (r4 == 0) goto L3a
            a.Pb r3 = new a.Pb
            r3.<init>(r7)
            android.app.NotificationManager r3 = r3.f210a
            boolean r3 = a.Pb.a.a(r3)
            if (r3 == 0) goto L38
            r3 = r1
            goto L46
        L38:
            r3 = -1
            goto L46
        L3a:
            int r4 = android.os.Process.myPid()
            int r5 = android.os.Process.myUid()
            int r3 = r7.checkPermission(r3, r4, r5)
        L46:
            if (r3 != 0) goto L4b
            int r2 = r2 + 1
            goto L15
        L4b:
            r7 = 0
            return r7
        L4d:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "permission must be non-null"
            r7.<init>(r8)
            throw r7
        L55:
            int r7 = r8.length
            int r7 = a.C0048aa.C(r7)
            r0 = 16
            if (r7 >= r0) goto L5f
            r7 = r0
        L5f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r7)
            int r7 = r8.length
        L65:
            if (r1 >= r7) goto L71
            r2 = r8[r1]
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L65
        L71:
            a.Y$a r7 = new a.Y$a
            r7.<init>(r0)
            return r7
    }

    @Override // a.Y
    public final java.lang.Object c(android.content.Intent r6, int r7) {
            r5 = this;
            a.Z5 r0 = a.Z5.f369a
            r1 = -1
            if (r7 == r1) goto L7
            goto L79
        L7:
            if (r6 != 0) goto Lb
            goto L79
        Lb:
            java.lang.String r7 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r7 = r6.getStringArrayExtra(r7)
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r6 = r6.getIntArrayExtra(r1)
            if (r6 == 0) goto L79
            if (r7 != 0) goto L1c
            goto L79
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r1) goto L38
            r4 = r6[r3]
            if (r4 != 0) goto L2d
            r4 = 1
            goto L2e
        L2d:
            r4 = r2
        L2e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L25
        L38:
            java.util.ArrayList r6 = a.N1.c0(r7)
            java.util.Iterator r7 = r6.iterator()
            java.util.Iterator r1 = r0.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r6 = a.C0312p3.g0(r6, r3)
            int r0 = a.C0312p3.g0(r0, r3)
            int r6 = java.lang.Math.min(r6, r0)
            r2.<init>(r6)
        L57:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L74
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r7.next()
            java.lang.Object r0 = r1.next()
            a.mc r3 = new a.mc
            r3.<init>(r6, r0)
            r2.add(r3)
            goto L57
        L74:
            java.util.Map r6 = a.C0067ba.G(r2)
            return r6
        L79:
            return r0
    }
}
