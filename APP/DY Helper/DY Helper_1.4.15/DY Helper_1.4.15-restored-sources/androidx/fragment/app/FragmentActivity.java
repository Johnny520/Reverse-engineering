package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity {

    /* JADX INFO: renamed from: Δ */
    public static final /* synthetic */ int f1092 = 0;

    /* JADX INFO: renamed from: Α */
    public boolean f1093;

    /* JADX INFO: renamed from: Β */
    public boolean f1094;

    /* JADX INFO: renamed from: Γ */
    public boolean f1095;

    /* JADX INFO: renamed from: ψ */
    public final p000.C0568n f1096;

    /* JADX INFO: renamed from: ω */
    public final p000.jr0 f1097;

    public FragmentActivity() {
            r3 = this;
            r3.<init>()
            p60 r0 = new p60
            r0.<init>(r3)
            n r1 = new n
            r2 = 19
            r1.<init>(r2, r0)
            r3.f1096 = r1
            jr0 r0 = new jr0
            r0.<init>(r3)
            r3.f1097 = r0
            r0 = 1
            r3.f1095 = r0
            n5 r0 = r3.f343
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            qm r1 = new qm
            r2 = 2
            r1.<init>(r2, r3)
            java.lang.String r2 = "android:support:lifecycle"
            r0.m3974(r2, r1)
            o60 r0 = new o60
            r1 = 0
            r0.<init>(r3, r1)
            r3.m193(r0)
            o60 r0 = new o60
            r1 = 1
            r0.<init>(r3, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = r3.f351
            r1.add(r0)
            rm r0 = new rm
            r1 = 1
            r0.<init>(r3, r1)
            r3.m194(r0)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m463(p000.b70 r4) {
            i0 r4 = r4.f1520
            java.util.List r4 = r4.m2573()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r4.next()
            n60 r1 = (p000.n60) r1
            if (r1 != 0) goto L1a
            goto Lb
        L1a:
            p60 r2 = r1.f7440
            if (r2 != 0) goto L20
            r2 = 0
            goto L22
        L20:
            androidx.fragment.app.FragmentActivity r2 = r2.f8429
        L22:
            if (r2 == 0) goto L2d
            b70 r2 = r1.m3997()
            boolean r2 = m463(r2)
            r0 = r0 | r2
        L2d:
            jr0 r2 = r1.f7417
            cr0 r2 = r2.f5558
            cr0 r3 = p000.cr0.f2727
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto Lb
            jr0 r0 = r1.f7417
            java.lang.String r1 = "setCurrentState"
            r0.m2982(r1)
            cr0 r1 = p000.cr0.f2726
            r0.m2984(r1)
            r0 = 1
            goto Lb
        L47:
            return r0
    }

    @Override // android.app.Activity
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            r6 = this;
            super.dump(r7, r8, r9, r10)
            r0 = 0
            if (r10 == 0) goto L4f
            int r1 = r10.length
            if (r1 != 0) goto La
            goto L4f
        La:
            r1 = r10[r0]
            int r2 = r1.hashCode()
            switch(r2) {
                case -645125871: goto L3f;
                case 100470631: goto L2f;
                case 472614934: goto L26;
                case 1159329357: goto L1d;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L4f
        L14:
            java.lang.String r2 = "--autofill"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4e
            goto L4f
        L1d:
            java.lang.String r2 = "--contentcapture"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4e
            goto L4f
        L26:
            java.lang.String r2 = "--list-dumpables"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L38
            goto L4f
        L2f:
            java.lang.String r2 = "--dump-dumpable"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L38
            goto L4f
        L38:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L4f
            goto L4e
        L3f:
            java.lang.String r2 = "--translation"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L48
            goto L4f
        L48:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L4f
        L4e:
            return
        L4f:
            r9.print(r7)
            java.lang.String r1 = "Local FragmentActivity "
            r9.print(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r9.print(r1)
            java.lang.String r1 = " State:"
            r9.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "  "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.print(r1)
            java.lang.String r2 = "mCreated="
            r9.print(r2)
            boolean r2 = r6.f1093
            r9.print(r2)
            java.lang.String r2 = " mResumed="
            r9.print(r2)
            boolean r2 = r6.f1094
            r9.print(r2)
            java.lang.String r2 = " mStopped="
            r9.print(r2)
            boolean r2 = r6.f1095
            r9.print(r2)
            android.app.Application r2 = r6.getApplication()
            if (r2 == 0) goto L103
            q92 r2 = r6.mo191()
            r2.getClass()
            gq r3 = p000.C0331gq.f4429
            r3.getClass()
            i0 r4 = new i0
            d70 r5 = p000.vu0.f11406
            r4.<init>(r2, r5, r3)
            java.lang.Class<vu0> r2 = p000.vu0.class
            wf r2 = p000.vm1.m6272(r2)
            java.lang.String r3 = r2.m6377()
            if (r3 == 0) goto Lfd
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = r5.concat(r3)
            m92 r2 = r4.m2574(r2, r3)
            vu0 r2 = (p000.vu0) r2
            kz1 r2 = r2.f11407
            int r3 = r2.f6335
            if (r3 <= 0) goto L103
            r9.print(r1)
            java.lang.String r3 = "Loaders:"
            r9.println(r3)
            int r3 = r2.f6335
            if (r3 > 0) goto Ldd
            goto L103
        Ldd:
            java.lang.Object r6 = r2.m3430(r0)
            if (r6 == 0) goto Le7
            p000.C1080.m7264()
            return
        Le7:
            r9.print(r1)
            java.lang.String r6 = "  #"
            r9.print(r6)
            int[] r6 = r2.f6333
            r6 = r6[r0]
            r9.print(r6)
            java.lang.String r6 = ": "
            r9.print(r6)
            r6 = 0
            throw r6
        Lfd:
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            p000.C1080.m7275(r6)
            return
        L103:
            n r6 = r6.f1096
            java.lang.Object r6 = r6.f7336
            p60 r6 = (p000.p60) r6
            b70 r6 = r6.f8433
            r6.m796(r7, r8, r9, r10)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            n r0 = r1.f1096
            r0.m3930()
            super.onActivityResult(r2, r3, r4)
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            jr0 r2 = r1.f1097
            br0 r0 = p000.br0.ON_CREATE
            r2.m2983(r0)
            n r1 = r1.f1096
            java.lang.Object r1 = r1.f7336
            p60 r1 = (p000.p60) r1
            b70 r1 = r1.f8433
            r2 = 0
            r1.f1509 = r2
            r1.f1510 = r2
            e70 r0 = r1.f1516
            r0.f3434 = r2
            r2 = 1
            r1.m795(r2)
            return
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            n r0 = r1.f1096
            java.lang.Object r0 = r0.f7336
            p60 r0 = (p000.p60) r0
            b70 r0 = r0.f8433
            r60 r0 = r0.f1523
            android.view.View r0 = r0.onCreateView(r2, r3, r4, r5)
            androidx.fragment.app.FragmentContainerView r0 = (androidx.fragment.app.FragmentContainerView) r0
            if (r0 != 0) goto L17
            android.view.View r1 = super.onCreateView(r2, r3, r4, r5)
            return r1
        L17:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r2 = this;
            n r0 = r2.f1096
            java.lang.Object r0 = r0.f7336
            p60 r0 = (p000.p60) r0
            b70 r0 = r0.f8433
            r60 r0 = r0.f1523
            r1 = 0
            android.view.View r0 = r0.onCreateView(r1, r3, r4, r5)
            androidx.fragment.app.FragmentContainerView r0 = (androidx.fragment.app.FragmentContainerView) r0
            if (r0 != 0) goto L18
            android.view.View r2 = super.onCreateView(r3, r4, r5)
            return r2
        L18:
            return r0
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            n r0 = r1.f1096
            java.lang.Object r0 = r0.f7336
            p60 r0 = (p000.p60) r0
            b70 r0 = r0.f8433
            r0.m786()
            jr0 r1 = r1.f1097
            br0 r0 = p000.br0.ON_DESTROY
            r1.m2983(r0)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            boolean r2 = super.onMenuItemSelected(r1, r2)
            if (r2 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r2 = 6
            if (r1 != r2) goto L18
            n r0 = r0.f1096
            java.lang.Object r0 = r0.f7336
            p60 r0 = (p000.p60) r0
            b70 r0 = r0.f8433
            boolean r0 = r0.m784()
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public final void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.f1094 = r0
            n r0 = r2.f1096
            java.lang.Object r0 = r0.f7336
            p60 r0 = (p000.p60) r0
            b70 r0 = r0.f8433
            r1 = 5
            r0.m795(r1)
            jr0 r2 = r2.f1097
            br0 r0 = p000.br0.ON_PAUSE
            r2.m2983(r0)
            return
    }

    @Override // android.app.Activity
    public void onPostResume() {
            r2 = this;
            super.onPostResume()
            jr0 r0 = r2.f1097
            br0 r1 = p000.br0.ON_RESUME
            r0.m2983(r1)
            n r2 = r2.f1096
            java.lang.Object r2 = r2.f7336
            p60 r2 = (p000.p60) r2
            b70 r2 = r2.f8433
            r0 = 0
            r2.f1509 = r0
            r2.f1510 = r0
            e70 r1 = r2.f1516
            r1.f3434 = r0
            r0 = 7
            r2.m795(r0)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            n r0 = r1.f1096
            r0.m3930()
            super.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public final void onResume() {
            r2 = this;
            n r0 = r2.f1096
            r0.m3930()
            super.onResume()
            r1 = 1
            r2.f1094 = r1
            java.lang.Object r2 = r0.f7336
            p60 r2 = (p000.p60) r2
            b70 r2 = r2.f8433
            r2.m799(r1)
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r5 = this;
            n r0 = r5.f1096
            r0.m3930()
            java.lang.Object r0 = r0.f7336
            p60 r0 = (p000.p60) r0
            super.onStart()
            r1 = 0
            r5.f1095 = r1
            boolean r2 = r5.f1093
            r3 = 1
            if (r2 != 0) goto L24
            r5.f1093 = r3
            b70 r2 = r0.f8433
            r2.f1509 = r1
            r2.f1510 = r1
            e70 r4 = r2.f1516
            r4.f3434 = r1
            r4 = 4
            r2.m795(r4)
        L24:
            b70 r2 = r0.f8433
            r2.m799(r3)
            jr0 r5 = r5.f1097
            br0 r2 = p000.br0.ON_START
            r5.m2983(r2)
            b70 r5 = r0.f8433
            r5.f1509 = r1
            r5.f1510 = r1
            e70 r0 = r5.f1516
            r0.f3434 = r1
            r0 = 5
            r5.m795(r0)
            return
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
            r0 = this;
            n r0 = r0.f1096
            r0.m3930()
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r3 = this;
            super.onStop()
            r0 = 1
            r3.f1095 = r0
        L6:
            n r1 = r3.f1096
            java.lang.Object r2 = r1.f7336
            p60 r2 = (p000.p60) r2
            b70 r2 = r2.f8433
            boolean r2 = m463(r2)
            if (r2 != 0) goto L6
            java.lang.Object r1 = r1.f7336
            p60 r1 = (p000.p60) r1
            b70 r1 = r1.f8433
            r1.f1510 = r0
            e70 r2 = r1.f1516
            r2.f3434 = r0
            r0 = 4
            r1.m795(r0)
            jr0 r3 = r3.f1097
            br0 r0 = p000.br0.ON_STOP
            r3.m2983(r0)
            return
    }
}
