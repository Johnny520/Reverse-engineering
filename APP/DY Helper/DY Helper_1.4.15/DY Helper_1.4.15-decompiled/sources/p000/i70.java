package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i70 {

    /* JADX INFO: renamed from: α */
    public final p000.C0574n5 f4940;

    /* JADX INFO: renamed from: β */
    public final p000.C0379i0 f4941;

    /* JADX INFO: renamed from: γ */
    public final p000.n60 f4942;

    /* JADX INFO: renamed from: δ */
    public boolean f4943;

    /* JADX INFO: renamed from: ε */
    public int f4944;

    public i70(p000.C0574n5 r2, p000.C0379i0 r3, java.lang.ClassLoader r4, p000.w60 r5, android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f4943 = r0
            r0 = -1
            r1.f4944 = r0
            r1.f4940 = r2
            r1.f4941 = r3
            java.lang.String r2 = "state"
            android.os.Parcelable r2 = r6.getParcelable(r2)
            h70 r2 = (p000.h70) r2
            java.lang.String r3 = r2.f4595
            n60 r3 = r5.m6324(r3)
            java.lang.String r5 = r2.f4596
            r3.f7426 = r5
            boolean r5 = r2.f4597
            r3.f7434 = r5
            r5 = 1
            r3.f7436 = r5
            int r5 = r2.f4598
            r3.f7401 = r5
            int r5 = r2.f4599
            r3.f7402 = r5
            java.lang.String r5 = r2.f4600
            r3.f7403 = r5
            boolean r5 = r2.f4601
            r3.f7406 = r5
            boolean r5 = r2.f4602
            r3.f7433 = r5
            boolean r5 = r2.f4603
            r3.f7405 = r5
            boolean r5 = r2.f4604
            r3.f7404 = r5
            cr0[] r5 = p000.cr0.values()
            int r0 = r2.f4605
            r5 = r5[r0]
            r3.f7416 = r5
            java.lang.String r5 = r2.f4606
            r3.f7429 = r5
            int r5 = r2.f4607
            r3.f7430 = r5
            boolean r2 = r2.f4608
            r3.f7411 = r2
            r1.f4942 = r3
            r3.f7423 = r6
            java.lang.String r1 = "arguments"
            android.os.Bundle r1 = r6.getBundle(r1)
            if (r1 == 0) goto L67
            r1.setClassLoader(r4)
        L67:
            b70 r2 = r3.f7439
            if (r2 == 0) goto L7b
            boolean r4 = r2.f1509
            if (r4 != 0) goto L74
            boolean r2 = r2.f1510
            if (r2 != 0) goto L74
            goto L7b
        L74:
            java.lang.String r1 = "Fragment already added and state has been saved"
            p000.C1080.m7279(r1)
            r1 = 0
            throw r1
        L7b:
            r3.f7427 = r1
            r1 = 2
            boolean r1 = p000.b70.m751(r1)
            if (r1 == 0) goto L97
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Instantiated fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L97:
            return
    }

    public i70(p000.C0574n5 r2, p000.C0379i0 r3, p000.n60 r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f4943 = r0
            r0 = -1
            r1.f4944 = r0
            r1.f4940 = r2
            r1.f4941 = r3
            r1.f4942 = r4
            return
    }

    public i70(p000.C0574n5 r3, p000.C0379i0 r4, p000.n60 r5, android.os.Bundle r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f4943 = r0
            r1 = -1
            r2.f4944 = r1
            r2.f4940 = r3
            r2.f4941 = r4
            r2.f4942 = r5
            r2 = 0
            r5.f7424 = r2
            r5.f7425 = r2
            r5.f7438 = r0
            r5.f7435 = r0
            r5.f7432 = r0
            n60 r3 = r5.f7428
            if (r3 == 0) goto L21
            java.lang.String r3 = r3.f7426
            goto L22
        L21:
            r3 = r2
        L22:
            r5.f7429 = r3
            r5.f7428 = r2
            r5.f7423 = r6
            java.lang.String r2 = "arguments"
            android.os.Bundle r2 = r6.getBundle(r2)
            r5.f7427 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2632() {
            r6 = this;
            r0 = 3
            boolean r1 = p000.b70.m751(r0)
            java.lang.String r2 = "FragmentManager"
            n60 r3 = r6.f4942
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "moveto ACTIVITY_CREATED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            android.os.Bundle r1 = r3.f7423
            if (r1 == 0) goto L25
            java.lang.String r4 = "savedInstanceState"
            r1.getBundle(r4)
        L25:
            b70 r1 = r3.f7441
            r1.m764()
            r3.f7422 = r0
            r1 = 0
            r3.f7408 = r1
            r4 = r3
            ws r4 = (p000.DialogInterfaceOnCancelListenerC0958ws) r4
            r5 = 1
            r4.f7408 = r5
            boolean r4 = r3.f7408
            if (r4 == 0) goto L67
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "moveto RESTORE_VIEW_STATE: "
            r0.<init>(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L50:
            r0 = 0
            r3.f7423 = r0
            b70 r0 = r3.f7441
            r0.f1509 = r1
            r0.f1510 = r1
            e70 r2 = r0.f1516
            r2.f3434 = r1
            r2 = 4
            r0.m795(r2)
            n5 r6 = r6.f4940
            r6.m3987(r1)
            return
        L67:
            java.lang.String r6 = " did not call through to super.onActivityCreated()"
            p000.C1080.m7267(r3, r6)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m2633() {
            r9 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            n60 r1 = r9.f4942
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ATTACHED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            n60 r0 = r1.f7428
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            i0 r4 = r9.f4941
            r5 = 0
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.f7426
            java.lang.Object r4 = r4.f4858
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            i70 r0 = (p000.i70) r0
            if (r0 == 0) goto L40
            n60 r2 = r1.f7428
            java.lang.String r2 = r2.f7426
            r1.f7429 = r2
            r1.f7428 = r5
            goto L84
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r1)
            n60 r1 = r1.f7428
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L5d:
            java.lang.String r0 = r1.f7429
            if (r0 == 0) goto L83
            java.lang.Object r4 = r4.f4858
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            i70 r0 = (p000.i70) r0
            if (r0 == 0) goto L6e
            goto L84
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r1)
            r9.append(r3)
            java.lang.String r0 = r1.f7429
            java.lang.String r9 = p000.lz1.m3691(r9, r0, r2)
            p000.C1080.m7279(r9)
            return
        L83:
            r0 = r5
        L84:
            if (r0 == 0) goto L89
            r0.m2641()
        L89:
            b70 r0 = r1.f7439
            p60 r2 = r0.f1537
            r1.f7440 = r2
            n60 r0 = r0.f1539
            r1.f7400 = r0
            n5 r9 = r9.f4940
            r0 = 0
            r9.m3993(r0)
            java.util.ArrayList r2 = r1.f7420
            java.util.Iterator r3 = r2.iterator()
        L9f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lcb
            java.lang.Object r4 = r3.next()
            k60 r4 = (p000.k60) r4
            ws r4 = r4.f5773
            n5 r6 = r4.f7419
            java.lang.Object r6 = r6.f7387
            jq1 r6 = (p000.jq1) r6
            r6.m2979()
            p000.ln0.m3639(r4)
            android.os.Bundle r6 = r4.f7423
            if (r6 == 0) goto Lc4
            java.lang.String r7 = "registryState"
            android.os.Bundle r6 = r6.getBundle(r7)
            goto Lc5
        Lc4:
            r6 = r5
        Lc5:
            n5 r4 = r4.f7419
            r4.m3972(r6)
            goto L9f
        Lcb:
            r2.clear()
            b70 r2 = r1.f7441
            p60 r3 = r1.f7440
            r4 = r1
            ws r4 = (p000.DialogInterfaceOnCancelListenerC0958ws) r4
            l60 r6 = new l60
            r6.<init>(r4)
            vs r7 = new vs
            r7.<init>(r4, r6)
            r2.m777(r3, r7, r1)
            r1.f7422 = r0
            r1.f7408 = r0
            p60 r2 = r1.f7440
            androidx.fragment.app.FragmentActivity r2 = r2.f8431
            r2 = 1
            r4.f7408 = r2
            p60 r3 = r4.f7440
            if (r3 != 0) goto Lf3
            r3 = r5
            goto Lf5
        Lf3:
            androidx.fragment.app.FragmentActivity r3 = r3.f8430
        Lf5:
            if (r3 == 0) goto Lf9
            r4.f7408 = r2
        Lf9:
            p11 r3 = r4.f7418
            n r6 = r4.f11844
            r3.getClass()
            java.lang.String r7 = "observeForever"
            p000.p11.m4377(r7)
            ju0 r7 = new ju0
            r7.<init>(r3, r6)
            up1 r3 = r3.f8385
            rp1 r8 = r3.mo3105(r6)
            if (r8 == 0) goto L115
            java.lang.Object r5 = r8.f9433
            goto L12e
        L115:
            rp1 r8 = new rp1
            r8.<init>(r6, r7)
            int r6 = r3.f10928
            int r6 = r6 + r2
            r3.f10928 = r6
            rp1 r6 = r3.f10926
            if (r6 != 0) goto L128
            r3.f10925 = r8
            r3.f10926 = r8
            goto L12e
        L128:
            r6.f9434 = r8
            r8.f9435 = r6
            r3.f10926 = r8
        L12e:
            ju0 r5 = (p000.ju0) r5
            if (r5 == 0) goto L133
            goto L136
        L133:
            r7.m2988(r2)
        L136:
            r4.f11847 = r0
            boolean r2 = r1.f7408
            if (r2 == 0) goto L165
            b70 r2 = r1.f7439
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f1530
            java.util.Iterator r2 = r2.iterator()
        L144:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L154
            java.lang.Object r3 = r2.next()
            f70 r3 = (p000.f70) r3
            r3.mo2040()
            goto L144
        L154:
            b70 r1 = r1.f7441
            r1.f1509 = r0
            r1.f1510 = r0
            e70 r2 = r1.f1516
            r2.f3434 = r0
            r1.m795(r0)
            r9.m3988(r0)
            return
        L165:
            java.lang.String r9 = " did not call through to super.onAttach()"
            p000.C1080.m7267(r1, r9)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final int m2634() {
            r11 = this;
            n60 r0 = r11.f4942
            b70 r1 = r0.f7439
            if (r1 != 0) goto L9
            int r11 = r0.f7422
            return r11
        L9:
            int r1 = r11.f4944
            cr0 r2 = r0.f7416
            int r2 = r2.ordinal()
            r3 = 5
            r4 = -1
            r5 = 4
            r6 = 2
            r7 = 1
            if (r2 == r7) goto L2e
            if (r2 == r6) goto L29
            r8 = 3
            if (r2 == r8) goto L24
            if (r2 == r5) goto L33
            int r1 = java.lang.Math.min(r1, r4)
            goto L33
        L24:
            int r1 = java.lang.Math.min(r1, r3)
            goto L33
        L29:
            int r1 = java.lang.Math.min(r1, r7)
            goto L33
        L2e:
            r2 = 0
            int r1 = java.lang.Math.min(r1, r2)
        L33:
            boolean r2 = r0.f7434
            if (r2 == 0) goto L4f
            boolean r2 = r0.f7435
            int r11 = r11.f4944
            if (r2 == 0) goto L42
            int r1 = java.lang.Math.max(r11, r6)
            goto L4f
        L42:
            if (r11 >= r5) goto L4b
            int r11 = r0.f7422
            int r1 = java.lang.Math.min(r1, r11)
            goto L4f
        L4b:
            int r1 = java.lang.Math.min(r1, r7)
        L4f:
            boolean r11 = r0.f7432
            if (r11 != 0) goto L57
            int r1 = java.lang.Math.min(r1, r7)
        L57:
            android.view.ViewGroup r11 = r0.f7409
            if (r11 == 0) goto Lbc
            b70 r2 = r0.m3999()
            i2 r2 = r2.m760()
            r2.getClass()
            r2 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.Object r8 = r11.getTag(r2)
            boolean r9 = r8 instanceof p000.C0697pr
            if (r9 == 0) goto L74
            pr r8 = (p000.C0697pr) r8
            goto L7c
        L74:
            pr r8 = new pr
            r8.<init>(r11)
            r11.setTag(r2, r8)
        L7c:
            java.util.ArrayList r11 = r8.f8664
            java.util.Iterator r11 = r11.iterator()
        L82:
            boolean r2 = r11.hasNext()
            r9 = 0
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r11.next()
            r10 = r2
            mz1 r10 = (p000.mz1) r10
            r10.getClass()
            boolean r10 = p000.ln0.m3626(r9, r0)
            if (r10 == 0) goto L82
            goto L9b
        L9a:
            r2 = r9
        L9b:
            mz1 r2 = (p000.mz1) r2
            java.util.ArrayList r11 = r8.f8665
            java.util.Iterator r11 = r11.iterator()
        La3:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r11.next()
            r8 = r2
            mz1 r8 = (p000.mz1) r8
            r8.getClass()
            boolean r8 = p000.ln0.m3626(r9, r0)
            if (r8 == 0) goto La3
            r9 = r2
        Lba:
            mz1 r9 = (p000.mz1) r9
        Lbc:
            boolean r11 = r0.f7433
            if (r11 == 0) goto Lcf
            boolean r11 = r0.m4003()
            if (r11 == 0) goto Lcb
            int r1 = java.lang.Math.min(r1, r7)
            goto Lcf
        Lcb:
            int r1 = java.lang.Math.min(r1, r4)
        Lcf:
            boolean r11 = r0.f7410
            if (r11 == 0) goto Ldb
            int r11 = r0.f7422
            if (r11 >= r3) goto Ldb
            int r1 = java.lang.Math.min(r1, r5)
        Ldb:
            boolean r11 = p000.b70.m751(r6)
            if (r11 == 0) goto Lfc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "computeExpectedState() of "
            r11.<init>(r2)
            r11.append(r1)
            java.lang.String r2 = " for "
            r11.append(r2)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r11)
        Lfc:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m2635() {
            r8 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            n60 r1 = r8.f4942
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            android.os.Bundle r0 = r1.f7423
            if (r0 == 0) goto L27
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L28
        L27:
            r0 = 0
        L28:
            boolean r2 = r1.f7414
            java.lang.String r3 = "childFragmentManager"
            r4 = 1
            r5 = 0
            if (r2 != 0) goto Lce
            n5 r8 = r8.f4940
            r8.m3994(r5)
            b70 r2 = r1.f7441
            r2.m764()
            r1.f7422 = r4
            r1.f7408 = r5
            jr0 r2 = r1.f7417
            ll1 r6 = new ll1
            r7 = 2
            r6.<init>(r7, r1)
            r2.m2980(r6)
            r2 = r1
            ws r2 = (p000.DialogInterfaceOnCancelListenerC0958ws) r2
            r2.f7408 = r4
            android.os.Bundle r6 = r2.f7423
            if (r6 == 0) goto L6a
            android.os.Bundle r3 = r6.getBundle(r3)
            if (r3 == 0) goto L6a
            b70 r6 = r2.f7441
            r6.m770(r3)
            b70 r3 = r2.f7441
            r3.f1509 = r5
            r3.f1510 = r5
            e70 r6 = r3.f1516
            r6.f3434 = r5
            r3.m795(r4)
        L6a:
            b70 r3 = r2.f7441
            int r6 = r3.f1536
            if (r6 < r4) goto L71
            goto L7c
        L71:
            r3.f1509 = r5
            r3.f1510 = r5
            e70 r6 = r3.f1516
            r6.f3434 = r5
            r3.m795(r4)
        L7c:
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            int r3 = r2.f7402
            if (r3 != 0) goto L87
            r3 = r4
            goto L88
        L87:
            r3 = r5
        L88:
            r2.f11841 = r3
            if (r0 == 0) goto Lb7
            java.lang.String r3 = "android:style"
            int r3 = r0.getInt(r3, r5)
            r2.f11838 = r3
            java.lang.String r3 = "android:theme"
            int r3 = r0.getInt(r3, r5)
            r2.f11839 = r3
            java.lang.String r3 = "android:cancelable"
            boolean r3 = r0.getBoolean(r3, r4)
            r2.f11840 = r3
            java.lang.String r3 = "android:showsDialog"
            boolean r6 = r2.f11841
            boolean r3 = r0.getBoolean(r3, r6)
            r2.f11841 = r3
            java.lang.String r3 = "android:backStackId"
            r6 = -1
            int r0 = r0.getInt(r3, r6)
            r2.f11842 = r0
        Lb7:
            r1.f7414 = r4
            boolean r0 = r1.f7408
            if (r0 == 0) goto Lc8
            jr0 r0 = r1.f7417
            br0 r1 = p000.br0.ON_CREATE
            r0.m2983(r1)
            r8.m3989(r5)
            return
        Lc8:
            java.lang.String r8 = " did not call through to super.onCreate()"
            p000.C1080.m7267(r1, r8)
            return
        Lce:
            r1.f7422 = r4
            android.os.Bundle r8 = r1.f7423
            if (r8 == 0) goto Lec
            android.os.Bundle r8 = r8.getBundle(r3)
            if (r8 == 0) goto Lec
            b70 r0 = r1.f7441
            r0.m770(r8)
            b70 r8 = r1.f7441
            r8.f1509 = r5
            r8.f1510 = r5
            e70 r0 = r8.f1516
            r0.f3434 = r5
            r8.m795(r4)
        Lec:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m2636() {
            r5 = this;
            n60 r5 = r5.f4942
            boolean r0 = r5.f7434
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            android.os.Bundle r0 = r5.f7423
            r1 = 0
            if (r0 == 0) goto L2d
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r5.m4006()
            android.view.ViewGroup r2 = r5.f7409
            if (r2 == 0) goto L38
            r1 = r2
            goto Lc4
        L38:
            int r2 = r5.f7402
            if (r2 == 0) goto Lc4
            r1 = -1
            if (r2 == r1) goto Lbc
            b70 r1 = r5.f7439
            xb r1 = r1.f1538
            android.view.View r1 = r1.mo3521(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L8b
            boolean r2 = r5.f7436
            if (r2 == 0) goto L50
            goto Lc4
        L50:
            android.content.Context r0 = r5.m4007()     // Catch: android.content.res.Resources.NotFoundException -> L5f
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L5f
            int r1 = r5.f7402     // Catch: android.content.res.Resources.NotFoundException -> L5f
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L5f
            goto L61
        L5f:
            java.lang.String r0 = "unknown"
        L61:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r5.f7402
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " ("
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ") for fragment "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5)
            throw r1
        L8b:
            boolean r2 = r1 instanceof androidx.fragment.app.FragmentContainerView
            if (r2 != 0) goto Lc4
            j70 r2 = p000.k70.f5785
            g70 r2 = new g70
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Attempting to add fragment "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " to container "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " which is not a FragmentContainerView"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r5, r3)
            p000.k70.m3176(r2)
            j70 r2 = p000.k70.m3175(r5)
            r2.getClass()
            goto Lc4
        Lbc:
            java.lang.String r0 = "Cannot create fragment "
            java.lang.String r1 = " for a container view with no id"
            p000.ql1.m4938(r0, r5, r1)
            return
        Lc4:
            r5.f7409 = r1
            r5.mo4005(r0)
            r0 = 2
            r5.f7422 = r0
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m2637() {
            r9 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            n60 r1 = r9.f4942
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            boolean r0 = r1.f7433
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2a
            boolean r0 = r1.m4003()
            if (r0 != 0) goto L2a
            r0 = r3
            goto L2b
        L2a:
            r0 = r2
        L2b:
            r4 = 0
            i0 r5 = r9.f4941
            if (r0 == 0) goto L35
            java.lang.String r6 = r1.f7426
            r5.m2555(r4, r6)
        L35:
            if (r0 != 0) goto L64
            java.lang.Object r6 = r5.f4860
            e70 r6 = (p000.e70) r6
            java.util.HashMap r7 = r6.f3429
            java.lang.String r8 = r1.f7426
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L46
            goto L4d
        L46:
            boolean r7 = r6.f3432
            if (r7 == 0) goto L4d
            boolean r6 = r6.f3433
            goto L4e
        L4d:
            r6 = r3
        L4e:
            if (r6 == 0) goto L51
            goto L64
        L51:
            java.lang.String r9 = r1.f7429
            if (r9 == 0) goto L61
            n60 r9 = r5.m2566(r9)
            if (r9 == 0) goto L61
            boolean r0 = r9.f7406
            if (r0 == 0) goto L61
            r1.f7428 = r9
        L61:
            r1.f7422 = r2
            return
        L64:
            p60 r6 = r1.f7440
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r5.f4860
            e70 r6 = (p000.e70) r6
            boolean r6 = r6.f3433
            goto L7a
        L6f:
            androidx.fragment.app.FragmentActivity r6 = r6.f8431
            if (r6 == 0) goto L79
            boolean r6 = r6.isChangingConfigurations()
            r6 = r6 ^ r3
            goto L7a
        L79:
            r6 = r3
        L7a:
            if (r0 == 0) goto L7d
            goto L7f
        L7d:
            if (r6 == 0) goto L86
        L7f:
            java.lang.Object r0 = r5.f4860
            e70 r0 = (p000.e70) r0
            r0.m1854(r1)
        L86:
            b70 r0 = r1.f7441
            r0.m786()
            jr0 r0 = r1.f7417
            br0 r6 = p000.br0.ON_DESTROY
            r0.m2983(r6)
            r1.f7422 = r2
            r1.f7414 = r2
            r1.f7408 = r3
            n5 r0 = r9.f4940
            r0.m3990(r2)
            java.util.ArrayList r0 = r5.m2571()
            java.util.Iterator r0 = r0.iterator()
        La5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r0.next()
            i70 r2 = (p000.i70) r2
            if (r2 == 0) goto La5
            n60 r2 = r2.f4942
            java.lang.String r3 = r1.f7426
            java.lang.String r6 = r2.f7429
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto La5
            r2.f7428 = r1
            r2.f7429 = r4
            goto La5
        Lc4:
            java.lang.String r0 = r1.f7429
            if (r0 == 0) goto Lce
            n60 r0 = r5.m2566(r0)
            r1.f7428 = r0
        Lce:
            r5.m2552(r9)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m2638() {
            r8 = this;
            n60 r0 = r8.f4942
            r1 = 3
            boolean r1 = p000.b70.m751(r1)
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATE_VIEW: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L1c:
            android.view.ViewGroup r1 = r0.f7409
            b70 r1 = r0.f7441
            r2 = 1
            r1.m795(r2)
            r0.f7422 = r2
            r1 = 0
            r0.f7408 = r1
            r3 = r0
            ws r3 = (p000.DialogInterfaceOnCancelListenerC0958ws) r3
            r3.f7408 = r2
            xm r4 = r3.f11845
            r5 = 0
            if (r4 == 0) goto L4a
            r3.f11846 = r2
            r4.setOnDismissListener(r5)
            xm r4 = r3.f11845
            r4.dismiss()
            boolean r4 = r3.f11847
            if (r4 != 0) goto L46
            xm r4 = r3.f11845
            r3.onDismiss(r4)
        L46:
            r3.f11845 = r5
            r3.f11848 = r1
        L4a:
            boolean r3 = r0.f7408
            if (r3 == 0) goto Lb0
            q92 r3 = r0.mo191()
            d70 r4 = p000.vu0.f11406
            r3.getClass()
            gq r6 = p000.C0331gq.f4429
            r6.getClass()
            i0 r7 = new i0
            r7.<init>(r3, r4, r6)
            java.lang.Class<vu0> r3 = p000.vu0.class
            wf r3 = p000.vm1.m6272(r3)
            java.lang.String r4 = r3.m6377()
            if (r4 == 0) goto Laa
            java.lang.String r6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r4 = r6.concat(r4)
            m92 r3 = r7.m2574(r3, r4)
            vu0 r3 = (p000.vu0) r3
            kz1 r3 = r3.f11407
            int r4 = r3.f6335
            if (r4 > 0) goto L9f
            r0.f7437 = r1
            n5 r8 = r8.f4940
            r8.m3962(r1)
            r0.f7409 = r5
            p11 r8 = r0.f7418
            r8.getClass()
            java.lang.String r3 = "setValue"
            p000.p11.m4377(r3)
            int r3 = r8.f8390
            int r3 = r3 + r2
            r8.f8390 = r3
            r8.f8388 = r5
            r8.m4379(r5)
            r0.f7435 = r1
            return
        L9f:
            java.lang.Object r8 = r3.m3430(r1)
            r8.getClass()
            p000.C1080.m7264()
            return
        Laa:
            java.lang.String r8 = "Local and anonymous classes can not be ViewModels"
            p000.C1080.m7275(r8)
            return
        Lb0:
            java.lang.String r8 = " did not call through to super.onDestroyView()"
            p000.C1080.m7267(r0, r8)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m2639() {
            r9 = this;
            r0 = 3
            boolean r1 = p000.b70.m751(r0)
            java.lang.String r2 = "FragmentManager"
            n60 r3 = r9.f4942
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom ATTACHED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            r1 = -1
            r3.f7422 = r1
            r4 = 0
            r3.f7408 = r4
            r5 = r3
            ws r5 = (p000.DialogInterfaceOnCancelListenerC0958ws) r5
            r6 = 1
            r5.f7408 = r6
            boolean r7 = r5.f11847
            if (r7 != 0) goto L2e
            r5.f11847 = r6
        L2e:
            p11 r7 = r5.f7418
            n r5 = r5.f11844
            r7.getClass()
            java.lang.String r8 = "removeObserver"
            p000.p11.m4377(r8)
            up1 r7 = r7.f8385
            java.lang.Object r5 = r7.mo3106(r5)
            ju0 r5 = (p000.ju0) r5
            if (r5 != 0) goto L45
            goto L48
        L45:
            r5.m2988(r4)
        L48:
            boolean r5 = r3.f7408
            if (r5 == 0) goto La9
            b70 r5 = r3.f7441
            boolean r7 = r5.f1511
            if (r7 != 0) goto L5c
            r5.m786()
            b70 r5 = new b70
            r5.<init>()
            r3.f7441 = r5
        L5c:
            n5 r5 = r9.f4940
            r5.m3991(r4)
            r3.f7422 = r1
            r1 = 0
            r3.f7440 = r1
            r3.f7400 = r1
            r3.f7439 = r1
            boolean r1 = r3.f7433
            if (r1 == 0) goto L75
            boolean r1 = r3.m4003()
            if (r1 != 0) goto L75
            goto L8e
        L75:
            i0 r9 = r9.f4941
            java.lang.Object r9 = r9.f4860
            e70 r9 = (p000.e70) r9
            java.util.HashMap r1 = r9.f3429
            java.lang.String r4 = r3.f7426
            boolean r1 = r1.containsKey(r4)
            if (r1 != 0) goto L86
            goto L8c
        L86:
            boolean r1 = r9.f3432
            if (r1 == 0) goto L8c
            boolean r6 = r9.f3433
        L8c:
            if (r6 == 0) goto La8
        L8e:
            boolean r9 = p000.b70.m751(r0)
            if (r9 == 0) goto La5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "initState called for fragment: "
            r9.<init>(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r2, r9)
        La5:
            r3.m4001()
        La8:
            return
        La9:
            java.lang.String r9 = " did not call through to super.onDetach()"
            p000.C1080.m7267(r3, r9)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m2640() {
            r2 = this;
            n60 r2 = r2.f4942
            boolean r0 = r2.f7434
            if (r0 == 0) goto L3a
            boolean r0 = r2.f7435
            if (r0 == 0) goto L3a
            boolean r0 = r2.f7437
            if (r0 != 0) goto L3a
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L28:
            android.os.Bundle r0 = r2.f7423
            if (r0 == 0) goto L33
            java.lang.String r1 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r1)
            goto L34
        L33:
            r0 = 0
        L34:
            r2.m4006()
            r2.mo4005(r0)
        L3a:
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m2641() {
            r10 = this;
            i0 r0 = r10.f4941
            boolean r1 = r10.f4943
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            n60 r4 = r10.f4942
            if (r1 == 0) goto L23
            boolean r10 = p000.b70.m751(r2)
            if (r10 == 0) goto L22
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            r10.<init>(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r3, r10)
        L22:
            return
        L23:
            r1 = 0
            r5 = 1
            r10.f4943 = r5     // Catch: java.lang.Throwable -> L3f
            r6 = r1
        L28:
            int r7 = r10.m2634()     // Catch: java.lang.Throwable -> L3f
            int r8 = r4.f7422     // Catch: java.lang.Throwable -> L3f
            r9 = 3
            if (r7 == r8) goto La4
            if (r7 <= r8) goto L61
            int r8 = r8 + 1
            switch(r8) {
                case 0: goto L5d;
                case 1: goto L59;
                case 2: goto L52;
                case 3: goto L4e;
                case 4: goto L4a;
                case 5: goto L46;
                case 6: goto L42;
                case 7: goto L3a;
                default: goto L38;
            }     // Catch: java.lang.Throwable -> L3f
        L38:
            goto La2
        L3a:
            r10.m2644()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L3f:
            r0 = move-exception
            goto L112
        L42:
            r6 = 6
            r4.f7422 = r6     // Catch: java.lang.Throwable -> L3f
            goto La2
        L46:
            r10.m2645()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L4a:
            r6 = 4
            r4.f7422 = r6     // Catch: java.lang.Throwable -> L3f
            goto La2
        L4e:
            r10.m2632()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L52:
            r10.m2640()     // Catch: java.lang.Throwable -> L3f
            r10.m2636()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L59:
            r10.m2635()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L5d:
            r10.m2633()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L61:
            int r8 = r8 + (-1)
            switch(r8) {
                case -1: goto L9f;
                case 0: goto L9b;
                case 1: goto L95;
                case 2: goto L90;
                case 3: goto L73;
                case 4: goto L6f;
                case 5: goto L6b;
                case 6: goto L67;
                default: goto L66;
            }     // Catch: java.lang.Throwable -> L3f
        L66:
            goto La2
        L67:
            r10.m2642()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L6b:
            r6 = 5
            r4.f7422 = r6     // Catch: java.lang.Throwable -> L3f
            goto La2
        L6f:
            r10.m2646()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L73:
            boolean r6 = p000.b70.m751(r9)     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L8d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L3f
            r6.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.d(r3, r6)     // Catch: java.lang.Throwable -> L3f
        L8d:
            r4.f7422 = r9     // Catch: java.lang.Throwable -> L3f
            goto La2
        L90:
            r4.f7435 = r1     // Catch: java.lang.Throwable -> L3f
            r4.f7422 = r2     // Catch: java.lang.Throwable -> L3f
            goto La2
        L95:
            r10.m2638()     // Catch: java.lang.Throwable -> L3f
            r4.f7422 = r5     // Catch: java.lang.Throwable -> L3f
            goto La2
        L9b:
            r10.m2637()     // Catch: java.lang.Throwable -> L3f
            goto La2
        L9f:
            r10.m2639()     // Catch: java.lang.Throwable -> L3f
        La2:
            r6 = r5
            goto L28
        La4:
            if (r6 != 0) goto Lf4
            r2 = -1
            if (r8 != r2) goto Lf4
            boolean r2 = r4.f7433     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto Lf4
            boolean r2 = r4.m4003()     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto Lf4
            boolean r2 = p000.b70.m751(r9)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto Lcd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "Cleaning up state of never attached fragment: "
            r2.append(r6)     // Catch: java.lang.Throwable -> L3f
            r2.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.d(r3, r2)     // Catch: java.lang.Throwable -> L3f
        Lcd:
            java.lang.Object r2 = r0.f4860     // Catch: java.lang.Throwable -> L3f
            e70 r2 = (p000.e70) r2     // Catch: java.lang.Throwable -> L3f
            r2.m1854(r4)     // Catch: java.lang.Throwable -> L3f
            r0.m2552(r10)     // Catch: java.lang.Throwable -> L3f
            boolean r0 = p000.b70.m751(r9)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto Lf1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "initState called for fragment: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L3f
            r0.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L3f
        Lf1:
            r4.m4001()     // Catch: java.lang.Throwable -> L3f
        Lf4:
            boolean r0 = r4.f7413     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L10f
            b70 r0 = r4.f7439     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L108
            boolean r2 = r4.f7432     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L108
            boolean r2 = p000.b70.m752(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L108
            r0.f1508 = r5     // Catch: java.lang.Throwable -> L3f
        L108:
            r4.f7413 = r1     // Catch: java.lang.Throwable -> L3f
            b70 r0 = r4.f7441     // Catch: java.lang.Throwable -> L3f
            r0.m789()     // Catch: java.lang.Throwable -> L3f
        L10f:
            r10.f4943 = r1
            return
        L112:
            r10.f4943 = r1
            throw r0
    }

    /* JADX INFO: renamed from: λ */
    public final void m2642() {
            r3 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            n60 r1 = r3.f4942
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom RESUMED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            b70 r0 = r1.f7441
            r2 = 5
            r0.m795(r2)
            jr0 r0 = r1.f7417
            br0 r2 = p000.br0.ON_PAUSE
            r0.m2983(r2)
            r0 = 6
            r1.f7422 = r0
            r0 = 1
            r1.f7408 = r0
            n5 r3 = r3.f4940
            r0 = 0
            r3.m3992(r0)
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m2643(java.lang.ClassLoader r3) {
            r2 = this;
            n60 r2 = r2.f4942
            android.os.Bundle r0 = r2.f7423
            if (r0 != 0) goto L7
            goto L51
        L7:
            r0.setClassLoader(r3)
            android.os.Bundle r3 = r2.f7423
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r3 = r3.getBundle(r0)
            if (r3 != 0) goto L1e
            android.os.Bundle r3 = r2.f7423
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r3.putBundle(r0, r1)
        L1e:
            android.os.Bundle r3 = r2.f7423
            java.lang.String r0 = "viewState"
            android.util.SparseArray r3 = r3.getSparseParcelableArray(r0)
            r2.f7424 = r3
            android.os.Bundle r3 = r2.f7423
            java.lang.String r0 = "viewRegistryState"
            android.os.Bundle r3 = r3.getBundle(r0)
            r2.f7425 = r3
            android.os.Bundle r3 = r2.f7423
            java.lang.String r0 = "state"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            h70 r3 = (p000.h70) r3
            if (r3 == 0) goto L4a
            java.lang.String r0 = r3.f4606
            r2.f7429 = r0
            int r0 = r3.f4607
            r2.f7430 = r0
            boolean r3 = r3.f4608
            r2.f7411 = r3
        L4a:
            boolean r3 = r2.f7411
            if (r3 != 0) goto L51
            r3 = 1
            r2.f7410 = r3
        L51:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m2644() {
            r6 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            n60 r1 = r6.f4942
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto RESUMED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            m60 r0 = r1.f7412
            r2 = 0
            if (r0 != 0) goto L23
            r0 = r2
            goto L25
        L23:
            android.view.View r0 = r0.f6979
        L25:
            if (r0 == 0) goto L32
            android.view.ViewParent r0 = r0.getParent()
        L2b:
            if (r0 == 0) goto L32
            android.view.ViewParent r0 = r0.getParent()
            goto L2b
        L32:
            m60 r0 = r1.m3996()
            r0.f6979 = r2
            b70 r0 = r1.f7441
            r0.m764()
            b70 r0 = r1.f7441
            r3 = 1
            r0.m799(r3)
            r0 = 7
            r1.f7422 = r0
            r1.f7408 = r3
            jr0 r3 = r1.f7417
            br0 r4 = p000.br0.ON_RESUME
            r3.m2983(r4)
            b70 r3 = r1.f7441
            r4 = 0
            r3.f1509 = r4
            r3.f1510 = r4
            e70 r5 = r3.f1516
            r5.f3434 = r4
            r3.m795(r0)
            n5 r0 = r6.f4940
            r0.m3958(r4)
            i0 r6 = r6.f4941
            java.lang.String r0 = r1.f7426
            r6.m2555(r2, r0)
            r1.f7423 = r2
            r1.f7424 = r2
            r1.f7425 = r2
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m2645() {
            r6 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            n60 r1 = r6.f4942
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto STARTED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            b70 r0 = r1.f7441
            r0.m764()
            b70 r0 = r1.f7441
            r2 = 1
            r0.m799(r2)
            r0 = 5
            r1.f7422 = r0
            r3 = 0
            r1.f7408 = r3
            r4 = r1
            ws r4 = (p000.DialogInterfaceOnCancelListenerC0958ws) r4
            r4.f7408 = r2
            xm r2 = r4.f11845
            if (r2 == 0) goto L5a
            r4.f11846 = r3
            r2.show()
            xm r2 = r4.f11845
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r2.getClass()
            r5 = 2131297158(0x7f090386, float:1.8212253E38)
            r2.setTag(r5, r4)
            r5 = 2131297161(0x7f090389, float:1.821226E38)
            r2.setTag(r5, r4)
            r5 = 2131297160(0x7f090388, float:1.8212257E38)
            r2.setTag(r5, r4)
        L5a:
            boolean r2 = r1.f7408
            if (r2 == 0) goto L78
            jr0 r2 = r1.f7417
            br0 r4 = p000.br0.ON_START
            r2.m2983(r4)
            b70 r1 = r1.f7441
            r1.f1509 = r3
            r1.f1510 = r3
            e70 r2 = r1.f1516
            r2.f3434 = r3
            r1.m795(r0)
            n5 r6 = r6.f4940
            r6.m3960(r3)
            return
        L78:
            java.lang.String r6 = " did not call through to super.onStart()"
            p000.C1080.m7267(r1, r6)
            return
    }

    /* JADX INFO: renamed from: ο */
    public final void m2646() {
            r5 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            n60 r1 = r5.f4942
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom STARTED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            b70 r0 = r1.f7441
            r2 = 1
            r0.f1510 = r2
            e70 r3 = r0.f1516
            r3.f3434 = r2
            r3 = 4
            r0.m795(r3)
            jr0 r0 = r1.f7417
            br0 r4 = p000.br0.ON_STOP
            r0.m2983(r4)
            r1.f7422 = r3
            r0 = 0
            r1.f7408 = r0
            r3 = r1
            ws r3 = (p000.DialogInterfaceOnCancelListenerC0958ws) r3
            r3.f7408 = r2
            xm r2 = r3.f11845
            if (r2 == 0) goto L41
            r2.hide()
        L41:
            boolean r2 = r1.f7408
            if (r2 == 0) goto L4b
            n5 r5 = r5.f4940
            r5.m3961(r0)
            return
        L4b:
            java.lang.String r5 = " did not call through to super.onStop()"
            p000.C1080.m7267(r1, r5)
            return
    }
}
