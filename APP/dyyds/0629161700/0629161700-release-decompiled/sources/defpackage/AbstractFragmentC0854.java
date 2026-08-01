package defpackage;

/* JADX INFO: renamed from: ᛵᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFragmentC0854 extends android.app.Fragment implements defpackage.InterfaceC0691 {
    @Override // android.app.Fragment
    public final void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super.onActivityResult(r1, r2, r3)
            ᲁᛷᛴᲇ r0 = r0.mo1652()
            r0.mo3293(r1)
            return
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            ᲁᛷᛴᲇ r2 = r2.mo1652()
            java.lang.Object r0 = r2.f8176
            android.os.Handler r1 = defpackage.AbstractC1710.f7613
            r1.removeCallbacksAndMessages(r0)
            ᲁᛷᛵ r0 = r2.f8178
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.f8180
            ᛷᲈᲀ r0 = (defpackage.C1403) r0
            r0.getClass()
            r0 = 0
            r2.f8178 = r0
        L1c:
            boolean r0 = r2.f8174
            if (r0 == 0) goto L21
            goto L31
        L21:
            ᛵᛳᲀ r2 = r2.f8173
            android.app.Activity r2 = r2.getActivity()
            boolean r0 = defpackage.AbstractC1592.m2874(r2)
            if (r0 == 0) goto L2e
            goto L31
        L2e:
            defpackage.AbstractC2002.m3395(r2)
        L31:
            return
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            super.onRequestPermissionsResult(r1, r2, r3)
            ᲁᛷᛴᲇ r0 = r0.mo1652()
            r0.mo955(r1)
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r5 = this;
            super.onResume()
            ᲁᛷᛴᲇ r5 = r5.mo1652()
            ᛵᛳᲀ r0 = r5.f8173
            boolean r1 = r5.f8177
            if (r1 != 0) goto L11
            r0.m1802()
            goto L66
        L11:
            boolean r1 = r5.f8175
            if (r1 == 0) goto L16
            goto L66
        L16:
            r1 = 1
            r5.f8175 = r1
            android.app.Activity r1 = r0.getActivity()
            boolean r2 = defpackage.AbstractC1592.m2874(r1)
            if (r2 == 0) goto L24
            goto L66
        L24:
            android.os.Bundle r2 = r0.getArguments()
            if (r2 != 0) goto L2c
            r2 = 0
            goto L32
        L2c:
            java.lang.String r3 = "request_code"
            int r2 = r2.getInt(r3)
        L32:
            if (r2 > 0) goto L35
            goto L66
        L35:
            android.os.Bundle r0 = r0.getArguments()
            if (r0 != 0) goto L3d
            r0 = 0
            goto L4e
        L3d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L48
            java.util.ArrayList r0 = defpackage.AbstractC1306.m2431(r0)
            goto L4e
        L48:
            java.lang.String r3 = "request_permissions"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r3)
        L4e:
            if (r0 == 0) goto L66
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L57
            goto L66
        L57:
            r5.mo954(r1, r0, r2)
            ᲁᛷᛵ r5 = r5.f8178
            if (r5 != 0) goto L5f
            goto L66
        L5f:
            java.lang.Object r5 = r5.f8180
            ᛷᲈᲀ r5 = (defpackage.C1403) r5
            r5.getClass()
        L66:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1802() {
            r1 = this;
            android.app.FragmentManager r0 = r1.getFragmentManager()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r1 = r0.remove(r1)
            r1.commitAllowingStateLoss()
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public abstract defpackage.AbstractC1883 mo1652();
}
