package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ub0 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public final android.app.Activity f10675;

    /* JADX INFO: renamed from: ζ */
    public final p000.yb0 f10676;

    /* JADX INFO: renamed from: η */
    public final java.util.ArrayList f10677;

    /* JADX INFO: renamed from: θ */
    public final java.util.LinkedHashMap f10678;

    /* JADX INFO: renamed from: ι */
    public final java.text.SimpleDateFormat f10679;

    /* JADX INFO: renamed from: κ */
    public boolean f10680;

    public ub0(android.app.Activity r2, p000.yb0 r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f10675 = r2
            r1.f10676 = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10677 = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f10678 = r2
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "MM-dd HH:mm"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r2.<init>(r3, r0)
            r1.f10679 = r2
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            java.util.ArrayList r0 = r0.f10677
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.f10677
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r1, r0)
            ic0 r0 = (p000.ic0) r0
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.f10677
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r1, r0)
            ic0 r0 = (p000.ic0) r0
            if (r0 == 0) goto Ld
            long r0 = r0.f4993
            return r0
        Ld:
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r28, android.view.View r29, android.view.ViewGroup r30) {
            r27 = this;
            r0 = r27
            android.app.Activity r1 = r0.f10675
            if (r29 != 0) goto L58
            x01 r2 = p000.x01.f11964
            java.lang.String r3 = "item_group_apply"
            r4 = 2131492942(0x7f0c004e, float:1.860935E38)
            android.view.View r2 = r2.m6476(r4, r1, r3)
            tb0 r3 = new tb0
            r4 = 2131296609(0x7f090161, float:1.821114E38)
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.String r6 = "group_apply_item_root"
            android.view.View r4 = p000.x01.m6472(r2, r6, r4, r5)
            java.lang.String r5 = "group_apply_item_name"
            r6 = 2131296608(0x7f090160, float:1.8211137E38)
            java.lang.Class<android.widget.TextView> r7 = android.widget.TextView.class
            android.view.View r5 = p000.x01.m6472(r2, r5, r6, r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "group_apply_item_meta"
            r8 = 2131296607(0x7f09015f, float:1.8211135E38)
            android.view.View r6 = p000.x01.m6472(r2, r6, r8, r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r8 = "group_apply_item_detail"
            r9 = 2131296606(0x7f09015e, float:1.8211133E38)
            android.view.View r8 = p000.x01.m6472(r2, r8, r9, r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r9 = "group_apply_item_approve"
            r10 = 2131296605(0x7f09015d, float:1.8211131E38)
            android.view.View r7 = p000.x01.m6472(r2, r9, r10, r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r26 = r8
            r8 = r7
            r7 = r26
            r3.<init>(r4, r5, r6, r7, r8)
            r2.setTag(r3)
            goto L64
        L58:
            java.lang.Object r2 = r29.getTag()
            r2.getClass()
            r3 = r2
            tb0 r3 = (p000.tb0) r3
            r2 = r29
        L64:
            android.widget.TextView r4 = r3.f10273
            android.widget.TextView r5 = r3.f10272
            android.widget.TextView r6 = r3.f10271
            android.widget.TextView r7 = r3.f10274
            java.util.ArrayList r8 = r0.f10677
            r9 = r28
            java.lang.Object r8 = p000.AbstractC0984xh.m6641(r9, r8)
            ic0 r8 = (p000.ic0) r8
            if (r8 != 0) goto L79
            return r2
        L79:
            java.lang.String r9 = r8.f4998
            long r10 = r8.f4994
            xx r12 = p000.jx0.m3049(r1)
            java.lang.String r13 = r12.f12348
            java.lang.String r14 = r12.f12356
            java.util.LinkedHashMap r15 = r0.f10678
            r29 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.Object r2 = r15.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r15 = "UID "
            r16 = 0
            if (r2 != 0) goto Lba
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            r19 = 0
            if (r18 <= 0) goto La4
            goto La6
        La4:
            r2 = r19
        La6:
            r18 = r3
            if (r2 == 0) goto Lb3
            long r2 = r2.longValue()
            java.lang.String r2 = p000.AbstractC0602nx.m4126(r2, r15)
            goto Lb5
        Lb3:
            r2 = r19
        Lb5:
            if (r2 != 0) goto Lbc
            java.lang.String r2 = "未知申请人"
            goto Lbc
        Lba:
            r18 = r3
        Lbc:
            r6.setText(r2)
            java.lang.String r2 = r12.f12355
            int r2 = android.graphics.Color.parseColor(r2)
            r6.setTextColor(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            uw0 r3 = r8.f4996
            r6 = r13
            r28 = r14
            long r13 = r8.f4997
            java.lang.String r3 = r3.f10972
            r2.add(r3)
            int r3 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r3 <= 0) goto Lec
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
        Lec:
            int r3 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r3 <= 0) goto Lfe
            java.util.Date r3 = new java.util.Date
            r3.<init>(r13)
            java.text.SimpleDateFormat r10 = r0.f10679
            java.lang.String r3 = r10.format(r3)
            r2.add(r3)
        Lfe:
            r24 = 0
            r25 = 62
            java.lang.String r20 = " · "
            r21 = 0
            r22 = 0
            r23 = 0
            r19 = r2
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r19, r20, r21, r22, r23, r24, r25)
            r5.setText(r2)
            int r2 = android.graphics.Color.parseColor(r28)
            r5.setTextColor(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r8.f4999
            java.lang.String r5 = r8.f5000
            boolean r10 = p000.q02.m4671(r9)
            if (r10 != 0) goto L132
            java.lang.String r10 = "理由："
            java.lang.String r9 = r10.concat(r9)
            r2.add(r9)
        L132:
            boolean r9 = p000.q02.m4671(r5)
            if (r9 != 0) goto L141
            java.lang.String r9 = "问题："
            java.lang.String r5 = r9.concat(r5)
            r2.add(r5)
        L141:
            boolean r5 = p000.q02.m4671(r3)
            if (r5 != 0) goto L150
            java.lang.String r5 = "回答："
            java.lang.String r3 = r5.concat(r3)
            r2.add(r3)
        L150:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L15c
            java.lang.String r2 = "未填写申请说明"
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)
        L15c:
            r19 = r2
            r24 = 0
            r25 = 62
            java.lang.String r20 = "  "
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r19, r20, r21, r22, r23, r24, r25)
            r4.setText(r2)
            int r2 = android.graphics.Color.parseColor(r28)
            r4.setTextColor(r2)
            boolean r2 = r0.f10680
            r2 = r2 ^ 1
            r7.setEnabled(r2)
            boolean r2 = r0.f10680
            if (r2 == 0) goto L187
            r2 = 1055286886(0x3ee66666, float:0.45)
            goto L189
        L187:
            r2 = 1065353216(0x3f800000, float:1.0)
        L189:
            r7.setAlpha(r2)
            java.lang.String r2 = r12.f12358
            int r2 = android.graphics.Color.parseColor(r2)
            r7.setTextColor(r2)
            java.lang.String r2 = r12.f12359
            r3 = 6
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r3, r1, r6, r2)
            r7.setBackground(r1)
            l9 r1 = new l9
            r2 = 7
            r1.<init>(r0, r2, r8)
            r7.setOnClickListener(r1)
            r3 = r18
            android.view.View r0 = r3.f10270
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3034(r6)
            r0.setBackground(r1)
            return r29
    }
}
