package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public final android.app.Activity f8476;

    /* JADX INFO: renamed from: ζ */
    public java.util.List f8477;

    /* JADX INFO: renamed from: η */
    public final p000.va2 f8478;

    /* JADX INFO: renamed from: θ */
    public final p000.il1 f8479;

    /* JADX INFO: renamed from: ι */
    public p000.la2 f8480;

    public pa2(android.app.Activity r1, java.util.List r2, p000.va2 r3, p000.il1 r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f8476 = r1
            r0.f8477 = r2
            r0.f8478 = r3
            r0.f8479 = r4
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            java.util.List r0 = r0.f8477
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            java.util.List r0 = r0.f8477
            java.lang.Object r0 = r0.get(r1)
            qa2 r0 = (p000.qa2) r0
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            java.util.List r0 = r0.f8477
            java.lang.Object r0 = r0.get(r1)
            qa2 r0 = (p000.qa2) r0
            java.lang.String r0 = r0.f8945
            int r0 = r0.hashCode()
            long r0 = (long) r0
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
            r18 = this;
            r0 = r18
            r21.getClass()
            r1 = 0
            android.app.Activity r2 = r0.f8476
            if (r20 != 0) goto L1a
            x01 r3 = p000.x01.f11964
            android.view.LayoutInflater r3 = r3.m6477(r2)
            r4 = 2131492960(0x7f0c0060, float:1.8609387E38)
            r5 = r21
            android.view.View r3 = r3.inflate(r4, r5, r1)
            goto L1c
        L1a:
            r3 = r20
        L1c:
            java.util.List r4 = r0.f8477
            r5 = r19
            java.lang.Object r4 = r4.get(r5)
            qa2 r4 = (p000.qa2) r4
            xx r5 = p000.jx0.m3049(r2)
            java.lang.String r6 = r5.f12366
            r7 = 2131297053(0x7f09031d, float:1.821204E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131297052(0x7f09031c, float:1.8212038E38)
            android.view.View r8 = r3.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131296340(0x7f090054, float:1.8210594E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r10 = 2131296339(0x7f090053, float:1.8210592E38)
            android.view.View r10 = r3.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            java.lang.String r11 = r4.f8944
            long r12 = r4.f8946
            r7.setText(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r14 = 1000(0x3e8, double:4.94E-321)
            long r14 = r12 / r14
            r16 = 0
            int r16 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r16 <= 0) goto L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r14 = "s · "
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r11.append(r1)
        L7a:
            r14 = 29000(0x7148, double:1.4328E-319)
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 <= 0) goto L83
            java.lang.String r12 = "超过 30 秒会裁切"
            goto L85
        L83:
            java.lang.String r12 = "点击条目使用此音频"
        L85:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r8.setText(r11)
            java.lang.String r11 = r5.f12355
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setTextColor(r11)
            if (r1 <= 0) goto L9c
            r1 = r6
            goto L9e
        L9c:
            java.lang.String r1 = r5.f12356
        L9e:
            int r1 = android.graphics.Color.parseColor(r1)
            r8.setTextColor(r1)
            java.lang.String r1 = r5.f12348
            java.lang.String r7 = r5.f12352
            r8 = 0
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r8, r2, r1, r7)
            r3.setBackground(r1)
            oa2 r1 = new oa2
            r1.<init>(r0, r4, r8)
            r9.setOnClickListener(r1)
            oa2 r1 = new oa2
            r2 = 1
            r1.<init>(r0, r4, r2)
            r10.setOnClickListener(r1)
            oa2 r1 = new oa2
            r2 = 2
            r1.<init>(r0, r4, r2)
            r3.setOnClickListener(r1)
            java.lang.String r1 = r5.f12360
            r0.m4455(r9, r1)
            r0.m4455(r10, r6)
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final void m4455(android.widget.Button r3, java.lang.String r4) {
            r2 = this;
            android.app.Activity r2 = r2.f8476
            xx r0 = p000.jx0.m3049(r2)
            r1 = 0
            r3.setAllCaps(r1)
            r3.setIncludeFontPadding(r1)
            r3.setMinWidth(r1)
            r3.setMinHeight(r1)
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r4)
            java.lang.String r4 = r0.f12348
            java.lang.String r0 = r0.f12371
            r1 = 8
            android.graphics.drawable.RippleDrawable r2 = p000.jx0.m3059(r1, r2, r4, r0)
            r3.setBackground(r2)
            return
    }
}
