package p000;

/* JADX INFO: renamed from: vg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0908vg implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11262;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f11263;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0908vg(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f11262 = r1
            r0.f11263 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r4) {
            r3 = this;
            int r4 = r3.f11262
            java.lang.Object r3 = r3.f11263
            switch(r4) {
                case 0: goto L9a;
                case 1: goto L7a;
                case 2: goto L67;
                case 3: goto L4f;
                case 4: goto L1d;
                case 5: goto L16;
                case 6: goto Ld;
                default: goto L7;
            }
        L7:
            va2 r3 = (p000.va2) r3
            r3.m6142()
            return
        Ld:
            vv1 r3 = (p000.vv1) r3
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f11432
            r4 = 1
            r3.set(r4)
            return
        L16:
            android.app.Activity r3 = (android.app.Activity) r3
            r4 = 0
            p000.dd1.m1715(r3, r4)
            return
        L1d:
            li0 r3 = (p000.li0) r3
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f6679
            r0 = 1
            r4.set(r0)
            ii0 r4 = r3.f6655
            if (r4 == 0) goto L2e
            android.os.Handler r1 = p000.mi0.f7160
            r1.removeCallbacks(r4)
        L2e:
            nt r4 = r3.f6657
            if (r4 == 0) goto L35
            r4.invoke()
        L35:
            r4 = 0
            r3.f6657 = r4
            n5 r3 = r3.f6656
            if (r3 == 0) goto L4e
            java.lang.Object r4 = r3.f7388
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            r1 = 0
            boolean r4 = r4.compareAndSet(r1, r0)
            if (r4 == 0) goto L4e
            java.lang.Object r3 = r3.f7387
            p3 r3 = (p000.C0673p3) r3
            r3.invoke()
        L4e:
            return
        L4f:
            nd0 r3 = (p000.nd0) r3
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f7537
            r0 = 1
            r4.set(r0)
            nt r4 = r3.f7533
            if (r4 == 0) goto L5e
            r4.invoke()
        L5e:
            r4 = 0
            r3.f7533 = r4
            android.os.Handler r3 = r3.f7536
            r3.removeCallbacksAndMessages(r4)
            return
        L67:
            dc0 r3 = (p000.dc0) r3
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f3066
            r0 = 1
            r4.set(r0)
            nt r4 = r3.f3075
            if (r4 == 0) goto L76
            r4.invoke()
        L76:
            r4 = 0
            r3.f3075 = r4
            return
        L7a:
            um1 r3 = (p000.um1) r3
            java.lang.Object r4 = r3.f10912
            t90 r4 = (p000.t90) r4
            r0 = 0
            if (r4 == 0) goto L91
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f10254
            r2 = 1
            boolean r1 = r1.compareAndSet(r0, r2)
            if (r1 == 0) goto L91
            p3 r4 = r4.f10253
            r4.invoke()
        L91:
            r4 = 0
            r3.f10912 = r4
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.u90.f10653
            r3.set(r0)
            return
        L9a:
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            java.lang.ref.WeakReference r4 = p000.pd2.f8529
            r0 = 0
            if (r4 == 0) goto La8
            java.lang.Object r4 = r4.get()
            android.app.AlertDialog r4 = (android.app.AlertDialog) r4
            goto La9
        La8:
            r4 = r0
        La9:
            if (r4 != r3) goto Lad
            p000.pd2.f8529 = r0
        Lad:
            return
    }
}
