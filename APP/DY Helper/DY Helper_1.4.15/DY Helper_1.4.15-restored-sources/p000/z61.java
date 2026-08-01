package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z61 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12989;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f12990;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12991;

    public /* synthetic */ z61(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f12989 = r2
            r0.f12990 = r1
            r0.f12991 = r3
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r15 = this;
            int r0 = r15.f12989
            r1 = 2
            r2 = 0
            r3 = 8
            r4 = 10
            r5 = 0
            r6 = 1
            s62 r7 = p000.s62.f9751
            java.lang.Object r8 = r15.f12991
            java.lang.Object r15 = r15.f12990
            switch(r0) {
                case 0: goto L262;
                case 1: goto L254;
                case 2: goto L246;
                case 3: goto L202;
                case 4: goto L1ea;
                case 5: goto L186;
                case 6: goto L154;
                case 7: goto L14a;
                case 8: goto L7f;
                case 9: goto L32;
                case 10: goto L1e;
                default: goto L13;
            }
        L13:
            va2 r15 = (p000.va2) r15
            android.app.Dialog r8 = (android.app.Dialog) r8
            r15.m6142()
            r8.dismiss()
            return r7
        L1e:
            android.content.ContentResolver r15 = (android.content.ContentResolver) r15
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r0 = "wt"
            java.io.OutputStream r15 = r15.openOutputStream(r8, r0)
            if (r15 == 0) goto L2c
            r2 = r15
            goto L31
        L2c:
            java.lang.String r15 = "无法打开下载输出流"
            p000.C1080.m7279(r15)
        L31:
            return r2
        L32:
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            cu1 r8 = (p000.cu1) r8
            java.util.LinkedHashSet r0 = p000.jz1.f5676
            r0.clear()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r15 = r15.iterator()
        L44:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r15.next()
            r3 = r2
            gz1 r3 = (p000.gz1) r3
            boolean r3 = r3.f4513
            if (r3 != 0) goto L44
            r1.add(r2)
            goto L44
        L59:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r2 = p000.AbstractC1021yh.m6889(r1, r4)
            r15.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            gz1 r2 = (p000.gz1) r2
            java.lang.String r2 = r2.f4508
            r15.add(r2)
            goto L66
        L78:
            r0.addAll(r15)
            r8.invoke()
            return r7
        L7f:
            android.app.Activity r15 = (android.app.Activity) r15
            cu1 r8 = (p000.cu1) r8
            java.util.LinkedHashSet r0 = p000.jz1.f5676
            ty1 r0 = new ty1
            r0.<init>(r8, r6)
            xx r1 = p000.jx0.m3049(r15)
            android.widget.EditText r8 = new android.widget.EditText
            r8.<init>(r15)
            java.lang.String r9 = "分组名称"
            r8.setHint(r9)
            r8.setMaxLines(r6)
            java.lang.String r9 = r1.f12355
            int r10 = android.graphics.Color.parseColor(r9)
            r8.setTextColor(r10)
            java.lang.String r10 = r1.f12357
            int r10 = android.graphics.Color.parseColor(r10)
            r8.setHintTextColor(r10)
            java.lang.String r10 = r1.f12352
            android.graphics.drawable.GradientDrawable r10 = p000.jx0.m3062(r4, r15, r10)
            r8.setBackground(r10)
            r10 = 12
            int r11 = p000.jz1.m3086(r15, r10)
            int r12 = p000.jz1.m3086(r15, r3)
            int r10 = p000.jz1.m3086(r15, r10)
            int r3 = p000.jz1.m3086(r15, r3)
            r8.setPadding(r11, r12, r10, r3)
            android.widget.LinearLayout r3 = p000.AbstractC0602nx.m4123(r15, r6)
            r10 = 14
            int r11 = p000.jz1.m3086(r15, r10)
            int r12 = p000.jz1.m3086(r15, r10)
            int r10 = p000.jz1.m3086(r15, r10)
            r13 = 4
            int r13 = p000.jz1.m3086(r15, r13)
            r3.setPadding(r11, r12, r10, r13)
            java.lang.String r1 = r1.f12351
            r10 = 16
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r10, r15, r1)
            r3.setBackground(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r15)
            java.lang.String r10 = "新增规则分组"
            r1.setText(r10)
            r10 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r10)
            r1.setTypeface(r2, r6)
            int r6 = android.graphics.Color.parseColor(r9)
            r1.setTextColor(r6)
            r1.setIncludeFontPadding(r5)
            int r4 = p000.jz1.m3086(r15, r4)
            r1.setPadding(r5, r5, r5, r4)
            r3.addView(r1)
            r3.addView(r8)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r15)
            android.app.AlertDialog$Builder r1 = r1.setView(r3)
            dd0 r3 = new dd0
            r4 = 5
            r3.<init>(r8, r15, r0, r4)
            java.lang.String r15 = "保存"
            android.app.AlertDialog$Builder r15 = r1.setPositiveButton(r15, r3)
            java.lang.String r0 = "取消"
            android.app.AlertDialog$Builder r15 = r15.setNegativeButton(r0, r2)
            android.app.AlertDialog r15 = r15.create()
            r15.show()
            android.view.Window r15 = r15.getWindow()
            if (r15 == 0) goto L149
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r5)
            r15.setBackgroundDrawable(r0)
        L149:
            return r7
        L14a:
            a80 r15 = (p000.a80) r15
            n71 r8 = (p000.n71) r8
            java.lang.String r0 = r8.f7446
            r15.invoke(r0)
            return r7
        L154:
            java.lang.Integer r15 = (java.lang.Integer) r15
            a80 r8 = (p000.a80) r8
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "pet_elf_auto_feed_max_price"
            int r1 = r15.intValue()
            p000.ui1.m5873(r0, r1)
            p000.xa1.m6548()
            int r0 = r15.intValue()
            if (r0 != 0) goto L16f
            java.lang.String r15 = "仅免费"
            goto L182
        L16f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "最多 "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = " 火星"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
        L182:
            r8.invoke(r15)
            return r7
        L186:
            android.content.Context r15 = (android.content.Context) r15
            a80 r8 = (p000.a80) r8
            long[] r0 = p000.u90.f10651
            r15.getClass()
            java.io.File r0 = r15.getFilesDir()
            java.io.File r1 = p000.u90.m5830(r15)
            r1.delete()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "geonames_regions.sqlite.tmp"
            r1.<init>(r0, r2)
            r1.delete()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "geonames_regions.zip"
            r1.<init>(r0, r2)
            r1.delete()
            xm0 r1 = new xm0
            r1.<init>(r6, r3, r6)
            java.util.Iterator r1 = r1.iterator()
        L1b7:
            r2 = r1
            wm0 r2 = (p000.wm0) r2
            boolean r3 = r2.f11765
            if (r3 == 0) goto L1d1
            int r2 = r2.nextInt()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "geonames_regions.zip."
            java.lang.String r2 = p000.a12.m17(r4, r2)
            r3.<init>(r0, r2)
            r3.delete()
            goto L1b7
        L1d1:
            java.util.concurrent.ConcurrentHashMap r0 = p000.u90.f10655
            r0.clear()
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = p000.u90.f10656
            r0.clear()
            java.lang.String r0 = "未下载"
            r8.invoke(r0)
            java.lang.String r0 = "国外数据库已删除"
            android.widget.Toast r15 = android.widget.Toast.makeText(r15, r0, r5)
            r15.show()
            return r7
        L1ea:
            ym1 r15 = (p000.ym1) r15
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r15.getClass()
            r8.getClass()
            java.util.regex.Pattern r15 = r15.f12688
            java.util.regex.Matcher r15 = r15.matcher(r8)
            r15.getClass()
            ix0 r15 = p000.v71.m6032(r15, r5, r8)
            return r15
        L202:
            c21 r15 = (p000.c21) r15
            zn r8 = (p000.C1064zn) r8
            java.lang.Object[] r0 = r15.f1942
            long[] r15 = r15.f1941
            int r2 = r15.length
            int r2 = r2 - r1
            if (r2 < 0) goto L245
            r1 = r5
        L20f:
            r9 = r15[r1]
            long r11 = ~r9
            r4 = 7
            long r11 = r11 << r4
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L240
            int r4 = r1 - r2
            int r4 = ~r4
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r6 = r5
        L227:
            if (r6 >= r4) goto L23e
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r9
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L23a
            int r11 = r1 << 3
            int r11 = r11 + r6
            r11 = r0[r11]
            r8.m7180(r11)
        L23a:
            long r9 = r9 >> r3
            int r6 = r6 + 1
            goto L227
        L23e:
            if (r4 != r3) goto L245
        L240:
            if (r1 == r2) goto L245
            int r1 = r1 + 1
            goto L20f
        L245:
            return r7
        L246:
            org.luckypray.dexkit.DexKitBridge r15 = (org.luckypray.dexkit.DexKitBridge) r15
            java.util.List r8 = (java.util.List) r8
            m81 r0 = new m81
            r0.<init>(r1, r8)
            org.luckypray.dexkit.result.MethodDataList r15 = r15.findMethod(r0)
            return r15
        L254:
            org.luckypray.dexkit.DexKitBridge r15 = (org.luckypray.dexkit.DexKitBridge) r15
            java.lang.String r8 = (java.lang.String) r8
            yh0 r0 = new yh0
            r0.<init>(r8, r4)
            org.luckypray.dexkit.result.MethodDataList r15 = r15.findMethod(r0)
            return r15
        L262:
            android.app.Activity r15 = (android.app.Activity) r15
            o71 r8 = (p000.o71) r8
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = r8.f7975
            java.lang.String r1 = "已复制"
            p000.q71.m4792(r15, r0, r1)
            return r7
    }
}
