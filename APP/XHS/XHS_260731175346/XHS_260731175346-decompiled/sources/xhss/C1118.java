package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛱᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1118 implements xhss.InterfaceC1172 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public android.widget.TextView f3604;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f3605;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f3606;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public android.view.View f3607;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3608;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0137 f3609;

    public C1118(android.app.Activity r3) {
            r2 = this;
            r0 = 0
            r2.f3606 = r0
            r2.<init>()
            xhss.ᛲᛲᲀᛷ r1 = new xhss.ᛲᛲᲀᛷ
            r1.<init>(r3, r2)
            r1.f599 = r0
            xhss.ᛳᛲᛳᛵ r0 = new xhss.ᛳᛲᛳᛵ
            r0.<init>()
            r0.f906 = r3
            r1.f597 = r0
            r2.f3609 = r1
            return
    }

    public C1118(android.app.Application r3) {
            r2 = this;
            r0 = 1
            r2.f3606 = r0
            r2.<init>()
            xhss.ᛲᛲᲀᛷ r1 = new xhss.ᛲᛲᲀᛷ
            r1.<init>(r3, r2)
            r1.f599 = r0
            xhss.ᛳᛲᛳᛵ r0 = new xhss.ᛳᛲᛳᛵ
            r0.<init>()
            r0.f904 = r3
            r1.f597 = r0
            r2.f3609 = r1
            return
    }

    @Override // xhss.InterfaceC1172
    public final void cancel() {
            r1 = this;
            int r0 = r1.f3606
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            xhss.ᛲᛲᲀᛷ r1 = r1.f3609
            r1.m367()
            return
        Lb:
            xhss.ᛲᛲᲀᛷ r1 = r1.f3609
            r1.m367()
            return
    }

    @Override // xhss.InterfaceC1172
    public final void setDuration(int r1) {
            r0 = this;
            r0.f3608 = r1
            return
    }

    @Override // xhss.InterfaceC1172
    public final void setGravity(int r1, int r2, int r3) {
            r0 = this;
            r1 = 17
            r0.f3605 = r1
            return
    }

    @Override // xhss.InterfaceC1172
    public final void setMargin(float r1, float r2) {
            r0 = this;
            return
    }

    @Override // xhss.InterfaceC1172
    public final void setText(java.lang.CharSequence r1) {
            r0 = this;
            android.widget.TextView r0 = r0.f3604
            if (r0 != 0) goto L5
            return
        L5:
            r0.setText(r1)
            return
    }

    @Override // xhss.InterfaceC1172
    public final void setView(android.view.View r1) {
            r0 = this;
            r0.f3607 = r1
            if (r1 != 0) goto L8
            r1 = 0
            r0.f3604 = r1
            return
        L8:
            android.widget.TextView r1 = xhss.InterfaceC1172.m1863(r1)
            r0.f3604 = r1
            return
    }

    @Override // xhss.InterfaceC1172
    public final void show() {
            r2 = this;
            int r0 = r2.f3606
            xhss.ᛲᛲᲀᛷ r2 = r2.f3609
            switch(r0) {
                case 0: goto L25;
                default: goto L7;
            }
        L7:
            xhss.ᛸᛶᲀᲁ r0 = r2.f603
            boolean r2 = r2.f602
            if (r2 == 0) goto Le
            goto L24
        Le:
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r2 != r1) goto L1c
            r0.run()
            goto L24
        L1c:
            android.os.Handler r2 = xhss.C0137.f596
            r2.removeCallbacks(r0)
            r2.post(r0)
        L24:
            return
        L25:
            xhss.ᛸᛶᲀᲁ r0 = r2.f603
            boolean r2 = r2.f602
            if (r2 == 0) goto L2c
            goto L42
        L2c:
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r2 != r1) goto L3a
            r0.run()
            goto L42
        L3a:
            android.os.Handler r2 = xhss.C0137.f596
            r2.removeCallbacks(r0)
            r2.post(r0)
        L42:
            return
    }
}
