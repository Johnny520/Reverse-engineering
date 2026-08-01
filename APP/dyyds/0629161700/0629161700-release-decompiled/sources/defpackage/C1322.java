package defpackage;

/* JADX INFO: renamed from: ᛷᛷᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1322 extends defpackage.AbstractC1191 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap f5842;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0554 f5843;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f5844;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2044 f5845;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2044 f5846;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f5847;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5848;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f5849;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.io.File f5850;

    public C1322(java.util.ArrayList r3, java.lang.String r4, defpackage.C2044 r5, defpackage.C2044 r6) {
            r2 = this;
            r0 = -139243124334126(0xffff815bef0961d2, double:NaN)
            r0 = -139268894137902(0xffff8155ef0961d2, double:NaN)
            r0 = -139341908581934(0xffff8144ef0961d2, double:NaN)
            r0 = -139393448189486(0xffff8138ef0961d2, double:NaN)
            r2.<init>()
            r2.f5847 = r3
            r2.f5848 = r4
            r2.f5846 = r5
            r2.f5845 = r6
            r3 = -1
            r2.f5844 = r3
            r2.f5849 = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r2.f5842 = r3
            ᛶᛸᛳ r3 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r3 = defpackage.AbstractC1497.f6594
            ᛵᲁᛴᛵ r4 = defpackage.AbstractC0762.m1684()
            r3.getClass()
            ᛳᛵᲈᛵ r3 = defpackage.AbstractC0397.m1146(r3, r4)
            ᛳᲁᛳᛴ r3 = defpackage.AbstractC1628.m2962(r3)
            r2.f5843 = r3
            return
    }

    @Override // defpackage.AbstractC1191
    public final int getItemCount() {
            r0 = this;
            java.util.ArrayList r0 = r0.f5847
            int r0 = r0.size()
            return r0
    }

    @Override // defpackage.AbstractC1191
    public final void onBindViewHolder(defpackage.AbstractC2316 r18, int r19) {
            r17 = this;
            r1 = r17
            r4 = r19
            r3 = r18
            ᛸᛴᛵᛶ r3 = (defpackage.C1474) r3
            r5 = -139548067012142(0xffff8114ef0961d2, double:NaN)
            android.widget.ImageView r6 = r3.f6519
            android.widget.TextView r0 = r3.f6518
            android.widget.TextView r2 = r3.f6520
            android.widget.TextView r5 = r3.f6517
            android.widget.FrameLayout r7 = r3.f6515
            java.util.ArrayList r8 = r1.f5847
            java.lang.Object r8 = r8.get(r4)
            ᛵᛳᲈᲁ r8 = (defpackage.C0860) r8
            java.io.File r9 = r8.f3915
            boolean r8 = r8.f3916
            r10 = 0
            r11 = 4
            r12 = 0
            if (r8 == 0) goto L91
            java.io.File r4 = new java.io.File
            java.lang.String r8 = r1.f5848
            r4.<init>(r8)
            java.lang.String r8 = r9.getAbsolutePath()
            java.io.File r4 = r4.getParentFile()
            if (r4 == 0) goto L40
            java.lang.String r10 = r4.getAbsolutePath()
        L40:
            boolean r4 = defpackage.AbstractC0498.m1280(r8, r10)
            if (r4 == 0) goto L53
            r8 = -139578131783214(0xffff810def0961d2, double:NaN)
            java.lang.String r4 = "⬆️ 返回上一级"
            r5.setText(r4)
            goto L6f
        L53:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r13 = -139616786488878(0xffff8104ef0961d2, double:NaN)
            java.lang.String r8 = "📁 "
            r4.<init>(r8)
            java.lang.String r8 = r9.getName()
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r5.setText(r4)
        L6f:
            r4 = -139633966358062(0xffff8100ef0961d2, double:NaN)
            java.lang.String r4 = "文件夹"
            r2.setText(r4)
            r4 = -139651146227246(0xffff80fcef0961d2, double:NaN)
            java.lang.String r2 = ""
            r0.setText(r2)
            r0 = 8
            r7.setVisibility(r0)
            r6.setVisibility(r11)
            goto L171
        L91:
            java.lang.String r8 = r9.getName()
            r5.setText(r8)
            long r13 = r9.length()
            java.text.DecimalFormat r5 = new java.text.DecimalFormat
            r15 = -139681210998318(0xffff80f5ef0961d2, double:NaN)
            java.lang.String r8 = "#.##"
            r5.<init>(r8)
            r15 = 1024(0x400, double:5.06E-321)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 >= 0) goto Lc9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            r13 = -139702685834798(0xffff80f0ef0961d2, double:NaN)
            java.lang.String r8 = " B"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            goto L11b
        Lc9:
            r15 = 1048576(0x100000, double:5.180654E-318)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 >= 0) goto Le7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            double r13 = (double) r13
            r15 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r13 = r13 / r15
            java.lang.String r5 = r5.format(r13)
            r13 = -139715570736686(0xffff80edef0961d2, double:NaN)
            r8.append(r5); r8.append(" KB");             java.lang.String r5 = r8.toString()
            goto L11b
        Le7:
            r15 = 1073741824(0x40000000, double:5.304989477E-315)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 >= 0) goto L105
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            double r13 = (double) r13
            r15 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r13 = r13 / r15
            java.lang.String r5 = r5.format(r13)
            r13 = -139732750605870(0xffff80e9ef0961d2, double:NaN)
            r8.append(r5); r8.append(" MB");             java.lang.String r5 = r8.toString()
            goto L11b
        L105:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            double r13 = (double) r13
            r15 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r13 = r13 / r15
            java.lang.String r5 = r5.format(r13)
            r13 = -139749930475054(0xffff80e5ef0961d2, double:NaN)
            r8.append(r5); r8.append(" GB");             java.lang.String r5 = r8.toString()
        L11b:
            r2.setText(r5)
            java.util.concurrent.ConcurrentHashMap r2 = r1.f5842
            java.lang.String r5 = r9.getAbsolutePath()
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L130
            r0.setText(r2)
            goto L149
        L130:
            r13 = -139655441194542(0xffff80fbef0961d2, double:NaN)
            java.lang.String r2 = "--:--"
            r0.setText(r2)
            ᛸᛷᛱᛵ r0 = new ᛸᛷᛱᛵ
            r5 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = 3
            ᛳᲁᛳᛴ r5 = r1.f5843
            defpackage.AbstractC0397.m1149(r5, r10, r0, r2)
        L149:
            int r0 = r1.f5844
            if (r4 != r0) goto L14f
            r0 = 1
            goto L150
        L14f:
            r0 = r12
        L150:
            android.widget.ImageView r2 = r3.f6516
            if (r0 == 0) goto L158
            r0 = 1711800652(0x6608014c, float:1.6056644E23)
            goto L15b
        L158:
            r0 = 1711800653(0x6608014d, float:1.6056646E23)
        L15b:
            r2.setImageResource(r0)
            int r0 = r1.f5849
            if (r4 != r0) goto L163
            r11 = r12
        L163:
            r6.setVisibility(r11)
            r7.setVisibility(r12)
            ᛳᛸᛸᲁ r0 = new ᛳᛸᛸᲁ
            r0.<init>(r4, r3, r1)
            r7.setOnClickListener(r0)
        L171:
            android.view.View r0 = r3.f9791
            ᛳᛲᛶᛶ r2 = new ᛳᛲᛶᛶ
            r2.<init>(r3, r12, r1)
            r0.setOnClickListener(r2)
            return
    }

    @Override // defpackage.AbstractC1191
    public final defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r3, int r4) {
            r2 = this;
            r0 = -139518002241070(0xffff811bef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            android.content.Context r4 = r3.getContext()
            r2.getClass()
            defpackage.C0346.m1051(r4)
            android.content.Context r2 = r3.getContext()
            android.view.LayoutInflater r2 = defpackage.AbstractC1668.m3063(r2)
            r4 = 1712062571(0x660c006b, float:1.6528475E23)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            ᛸᛴᛵᛶ r3 = new ᛸᛴᛵᛶ
            r3.<init>(r2)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2450(int r4) {
            r3 = this;
            int r0 = r3.f5844
            r3.f5844 = r4
            java.util.ArrayList r1 = r3.f5847
            if (r0 < 0) goto L11
            int r2 = r1.size()
            if (r0 >= r2) goto L11
            r3.notifyItemChanged(r0)
        L11:
            if (r4 < 0) goto L1c
            int r0 = r1.size()
            if (r4 >= r0) goto L1c
            r3.notifyItemChanged(r4)
        L1c:
            return
    }
}
