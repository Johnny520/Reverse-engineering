package p000;

/* JADX INFO: renamed from: ws */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0958ws extends p000.n60 implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: Ω */
    public final p000.DialogInterfaceOnCancelListenerC0846ts f11836;

    /* JADX INFO: renamed from: а */
    public final p000.DialogInterfaceOnDismissListenerC0883us f11837;

    /* JADX INFO: renamed from: б */
    public int f11838;

    /* JADX INFO: renamed from: в */
    public int f11839;

    /* JADX INFO: renamed from: г */
    public boolean f11840;

    /* JADX INFO: renamed from: д */
    public boolean f11841;

    /* JADX INFO: renamed from: е */
    public int f11842;

    /* JADX INFO: renamed from: ж */
    public boolean f11843;

    /* JADX INFO: renamed from: з */
    public final p000.C0568n f11844;

    /* JADX INFO: renamed from: и */
    public p000.DialogC0989xm f11845;

    /* JADX INFO: renamed from: й */
    public boolean f11846;

    /* JADX INFO: renamed from: к */
    public boolean f11847;

    /* JADX INFO: renamed from: л */
    public boolean f11848;

    public DialogInterfaceOnCancelListenerC0958ws() {
            r3 = this;
            r3.<init>()
            ss r0 = new ss
            r1 = 0
            r0.<init>(r3, r1)
            ts r0 = new ts
            r0.<init>()
            r3.f11836 = r0
            us r0 = new us
            r0.<init>(r3)
            r3.f11837 = r0
            r0 = 0
            r3.f11838 = r0
            r3.f11839 = r0
            r1 = 1
            r3.f11840 = r1
            r3.f11841 = r1
            r1 = -1
            r3.f11842 = r1
            n r1 = new n
            r2 = 12
            r1.<init>(r2, r3)
            r3.f11844 = r1
            r3.f11848 = r0
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r5) {
            r4 = this;
            boolean r5 = r4.f11846
            if (r5 != 0) goto Ldf
            r5 = 3
            boolean r0 = p000.b70.m751(r5)
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onDismiss called for DialogFragment "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1e:
            boolean r0 = r4.f11847
            if (r0 == 0) goto L24
            goto Ldf
        L24:
            r0 = 1
            r4.f11847 = r0
            xm r1 = r4.f11845
            if (r1 == 0) goto L34
            r2 = 0
            r1.setOnDismissListener(r2)
            xm r1 = r4.f11845
            r1.dismiss()
        L34:
            r4.f11846 = r0
            int r1 = r4.f11842
            if (r1 < 0) goto L58
            b70 r5 = r4.m3999()
            int r1 = r4.f11842
            if (r1 < 0) goto L4e
            a70 r2 = new a70
            r2.<init>(r5, r1)
            r5.m797(r2, r0)
            r5 = -1
            r4.f11842 = r5
            return
        L4e:
            java.lang.String r4 = "Bad id: "
            java.lang.String r4 = p000.a12.m17(r4, r1)
            p000.C1080.m7275(r4)
            return
        L58:
            b70 r1 = r4.m3999()
            k8 r2 = new k8
            r2.<init>(r1)
            r2.f5804 = r0
            b70 r1 = r4.f7439
            if (r1 == 0) goto L89
            b70 r3 = r2.f5805
            if (r1 != r3) goto L6c
            goto L89
        L6c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = " is already attached to a FragmentManager."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L89:
            m70 r1 = new m70
            r1.<init>(r5, r4)
            r2.m3178(r1)
            boolean r4 = r2.f5806
            if (r4 != 0) goto Lda
            r4 = 2
            boolean r4 = p000.b70.m751(r4)
            r5 = 1
            if (r4 == 0) goto Lc2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Commit: "
            r4.<init>(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r4)
            jv0 r4 = new jv0
            r4.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r4)
            java.lang.String r4 = "  "
            r2.m3180(r4, r1, r5)
            r1.close()
        Lc2:
            r2.f5806 = r5
            boolean r4 = r2.f5796
            b70 r5 = r2.f5805
            if (r4 == 0) goto Ld3
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f1526
            int r4 = r4.getAndIncrement()
            r2.f5807 = r4
            goto Ld6
        Ld3:
            r4 = -1
            r2.f5807 = r4
        Ld6:
            r5.m797(r2, r0)
            goto Ldf
        Lda:
            java.lang.String r4 = "commit already called"
            p000.C1080.m7279(r4)
        Ldf:
            return
    }

    @Override // p000.n60
    /* JADX INFO: renamed from: ξ */
    public final void mo4005(android.os.Bundle r2) {
            r1 = this;
            b70 r0 = r1.f7441
            r0.m764()
            r0 = 1
            r1.f7437 = r0
            r1.mo191()
            xm r0 = r1.f11845
            if (r0 == 0) goto L1e
            if (r2 == 0) goto L1e
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L1e
            xm r1 = r1.f11845
            r1.onRestoreInstanceState(r2)
        L1e:
            return
    }
}
