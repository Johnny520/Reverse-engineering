package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4692;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.nd0 f4693;

    public /* synthetic */ hd0(p000.nd0 r1, int r2) {
            r0 = this;
            r0.f4692 = r2
            r0.f4693 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f4692
            switch(r0) {
                case 0: goto L34;
                default: goto L5;
            }
        L5:
            nd0 r8 = r8.f4693
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f7537
            android.widget.EditText r1 = r8.f7548
            boolean r0 = r0.get()
            if (r0 != 0) goto L33
            android.app.AlertDialog r0 = r8.f7525
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L1a
            goto L33
        L1a:
            r1.requestFocus()
            android.app.Activity r8 = r8.f7534
            java.lang.String r0 = "input_method"
            java.lang.Object r8 = r8.getSystemService(r0)
            boolean r0 = r8 instanceof android.view.inputmethod.InputMethodManager
            if (r0 == 0) goto L2c
            android.view.inputmethod.InputMethodManager r8 = (android.view.inputmethod.InputMethodManager) r8
            goto L2d
        L2c:
            r8 = 0
        L2d:
            if (r8 == 0) goto L33
            r0 = 1
            r8.showSoftInput(r1, r0)
        L33:
            return
        L34:
            nd0 r8 = r8.f4693
            java.lang.ClassLoader r1 = r8.f7538
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            lj0 r2 = new lj0     // Catch: java.lang.Throwable -> L4d
            vh0 r0 = p000.vh0.f11270     // Catch: java.lang.Throwable -> L4d
            java.util.List r3 = r0.m6243(r1)     // Catch: java.lang.Throwable -> L4d
            nz r4 = p000.C0604nz.f7825     // Catch: java.lang.Throwable -> L4d
            java.lang.String r7 = ""
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4d
            goto L53
        L4d:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
        L53:
            boolean r0 = r2 instanceof p000.eo1
            r3 = 0
            if (r0 == 0) goto L5a
            r0 = r3
            goto L5b
        L5a:
            r0 = r2
        L5b:
            lj0 r0 = (p000.lj0) r0
            if (r0 == 0) goto L62
            java.util.List r0 = r0.f6686
            goto L63
        L62:
            r0 = r3
        L63:
            jz r4 = p000.C0450jz.f5672
            if (r0 != 0) goto L68
            r0 = r4
        L68:
            p000.nd0.m4024(r0)
            p3 r0 = new p3
            r5 = 15
            r0.<init>(r8, r5, r2)
            r8.m4029(r0)
            η r0 = new η     // Catch: java.lang.Throwable -> L81
            r5 = 10
            r0.<init>(r5, r8)     // Catch: java.lang.Throwable -> L81
            lj0 r0 = p000.AbstractC0782s1.m5340(r1, r0)     // Catch: java.lang.Throwable -> L81
            goto L88
        L81:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L88:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L8e
            r1 = r3
            goto L8f
        L8e:
            r1 = r0
        L8f:
            lj0 r1 = (p000.lj0) r1
            if (r1 == 0) goto L95
            java.util.List r3 = r1.f6686
        L95:
            if (r3 != 0) goto L98
            goto L99
        L98:
            r4 = r3
        L99:
            p000.nd0.m4024(r4)
            z7 r1 = new z7
            r3 = 8
            r1.<init>(r8, r0, r2, r3)
            r8.m4029(r1)
            return
    }
}
