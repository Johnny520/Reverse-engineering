package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1200 implements defpackage.InterfaceC1550 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f5408;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f5409;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f5410;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.view.View f5411;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public android.widget.TextView f5412;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1377 f5413;

    public C1200(android.app.Activity r3) {
            r2 = this;
            r0 = 0
            r2.f5408 = r0
            r2.<init>()
            ᛷᲁᲈᲇ r1 = new ᛷᲁᲈᲇ
            r1.<init>(r3, r2)
            r1.f6010 = r0
            ᛸᲈᛲᲀ r0 = new ᛸᲈᛲᲀ
            r0.<init>()
            r0.f7051 = r3
            r1.f6014 = r0
            r2.f5413 = r1
            return
    }

    public C1200(android.app.Application r3) {
            r2 = this;
            r0 = 1
            r2.f5408 = r0
            r2.<init>()
            ᛷᲁᲈᲇ r1 = new ᛷᲁᲈᲇ
            r1.<init>(r3, r2)
            r1.f6010 = r0
            ᛸᲈᛲᲀ r0 = new ᛸᲈᛲᲀ
            r0.<init>()
            r0.f7052 = r3
            r1.f6014 = r0
            r2.f5413 = r1
            return
    }

    @Override // defpackage.InterfaceC1550
    public final void cancel() {
            r1 = this;
            int r0 = r1.f5408
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            ᛷᲁᲈᲇ r1 = r1.f5413
            r1.m2545()
            return
        Lb:
            ᛷᲁᲈᲇ r1 = r1.f5413
            r1.m2545()
            return
    }

    @Override // defpackage.InterfaceC1550
    public final void setDuration(int r1) {
            r0 = this;
            r0.f5409 = r1
            return
    }

    @Override // defpackage.InterfaceC1550
    public final void setGravity(int r1, int r2, int r3) {
            r0 = this;
            r1 = 17
            r0.f5410 = r1
            return
    }

    @Override // defpackage.InterfaceC1550
    public final void setMargin(float r1, float r2) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC1550
    public final void setText(java.lang.CharSequence r1) {
            r0 = this;
            android.widget.TextView r0 = r0.f5412
            if (r0 != 0) goto L5
            return
        L5:
            r0.setText(r1)
            return
    }

    @Override // defpackage.InterfaceC1550
    public final void setView(android.view.View r1) {
            r0 = this;
            r0.f5411 = r1
            if (r1 != 0) goto L8
            r1 = 0
            r0.f5412 = r1
            return
        L8:
            android.widget.TextView r1 = defpackage.InterfaceC1550.m2826(r1)
            r0.f5412 = r1
            return
    }

    @Override // defpackage.InterfaceC1550
    public final void show() {
            r2 = this;
            int r0 = r2.f5408
            ᛷᲁᲈᲇ r2 = r2.f5413
            switch(r0) {
                case 0: goto L25;
                default: goto L7;
            }
        L7:
            ᲇᲈᛷᛳ r0 = r2.f6015
            boolean r2 = r2.f6011
            if (r2 == 0) goto Le
            goto L24
        Le:
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r2 != r1) goto L1c
            r0.run()
            goto L24
        L1c:
            android.os.Handler r2 = defpackage.C1377.f6009
            r2.removeCallbacks(r0)
            r2.post(r0)
        L24:
            return
        L25:
            ᲇᲈᛷᛳ r0 = r2.f6015
            boolean r2 = r2.f6011
            if (r2 == 0) goto L2c
            goto L42
        L2c:
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r2 != r1) goto L3a
            r0.run()
            goto L42
        L3a:
            android.os.Handler r2 = defpackage.C1377.f6009
            r2.removeCallbacks(r0)
            r2.post(r0)
        L42:
            return
    }
}
