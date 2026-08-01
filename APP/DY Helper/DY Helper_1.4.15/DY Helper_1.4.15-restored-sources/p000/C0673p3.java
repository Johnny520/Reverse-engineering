package p000;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0673p3 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8400;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f8401;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f8402;

    public /* synthetic */ C0673p3(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f8400 = r2
            r0.f8401 = r1
            r0.f8402 = r3
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r22 = this;
            r0 = r22
            int r1 = r0.f8400
            r2 = 2
            r3 = -1
            r4 = 8
            r5 = 22
            r6 = 4
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r1) {
                case 0: goto L7a0;
                case 1: goto L784;
                case 2: goto L754;
                case 3: goto L6aa;
                case 4: goto L69d;
                case 5: goto L68e;
                case 6: goto L681;
                case 7: goto L625;
                case 8: goto L616;
                case 9: goto L609;
                case 10: goto L5f0;
                case 11: goto L5ca;
                case 12: goto L58f;
                case 13: goto L574;
                case 14: goto L538;
                case 15: goto L51a;
                case 16: goto L485;
                case 17: goto L451;
                case 18: goto L380;
                case 19: goto L36d;
                case 20: goto L360;
                case 21: goto L353;
                case 22: goto L346;
                case 23: goto L339;
                case 24: goto L1c5;
                case 25: goto L15c;
                case 26: goto L149;
                case 27: goto L13d;
                case 28: goto L124;
                default: goto L11;
            }
        L11:
            java.lang.Object r1 = r0.f8401
            r12 = r1
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.Object r0 = r0.f8402
            ih0 r0 = (p000.ih0) r0
            java.lang.String r1 = "theme"
            android.widget.LinearLayout r2 = p000.AbstractC0602nx.m4123(r12, r7)
            q71 r10 = p000.q71.f8896
            int r10 = p000.q71.m4796(r12, r5)
            r11 = 12
            int r13 = p000.q71.m4796(r12, r11)
            int r14 = p000.q71.m4796(r12, r5)
            int r15 = p000.q71.m4796(r12, r6)
            r2.setPadding(r10, r13, r14, r15)
            android.widget.TextView r14 = new android.widget.TextView
            r14.<init>(r12)
            boolean r10 = r0.f5084
            if (r10 == 0) goto L43
            java.lang.String r10 = "正在读取完整聊天记录…"
            goto L45
        L43:
            java.lang.String r10 = "正在整理聊天记录…"
        L45:
            r14.setText(r10)
            r10 = 1097859072(0x41700000, float:15.0)
            r14.setTextSize(r10)
            android.graphics.Typeface r10 = r14.getTypeface()
            r14.setTypeface(r10, r7)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r12)
            java.lang.String r10 = "正在计算消息数量和时间范围"
            r15.setText(r10)
            r10 = 1095761920(0x41500000, float:13.0)
            r15.setTextSize(r10)
            r10 = -7829368(0xffffffffff888888, float:NaN)
            r15.setTextColor(r10)
            int r10 = p000.q71.m4796(r12, r4)
            int r11 = p000.q71.m4796(r12, r11)
            r15.setPadding(r9, r10, r9, r11)
            android.widget.ProgressBar r10 = new android.widget.ProgressBar
            r11 = 16842872(0x1010078, float:2.3693894E-38)
            r10.<init>(r12, r8, r11)
            r10.setIndeterminate(r7)
            xx r7 = p000.q71.f8898
            if (r7 == 0) goto L120
            java.lang.String r7 = r7.f12360
            int r7 = android.graphics.Color.parseColor(r7)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r10.setProgressTintList(r7)
            xx r7 = p000.q71.f8898
            if (r7 == 0) goto L11c
            java.lang.String r1 = r7.f12360
            int r1 = android.graphics.Color.parseColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r10.setIndeterminateTintList(r1)
            r2.addView(r14)
            r2.addView(r15)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r4 = p000.q71.m4796(r12, r4)
            r1.<init>(r3, r4)
            r2.addView(r10, r1)
            n r11 = new n
            r11.<init>(r5)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r12)
            java.lang.String r3 = "正在导出聊天记录"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r3)
            android.app.AlertDialog$Builder r1 = r1.setView(r2)
            java.lang.String r2 = "取消导出"
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r8)
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r9)
            android.app.AlertDialog r18 = r1.create()
            v61 r16 = new v61
            r19 = r10
            r17 = r11
            r20 = r14
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            r1 = r16
            r13 = r18
            r16 = r19
            r13.setOnShowListener(r1)
            r13.show()
            nh0 r1 = p000.nh0.f7619
            android.content.Context r1 = r12.getApplicationContext()
            gc r10 = new gc
            r17 = 1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r17 = r11
            ic r2 = new ic
            r2.<init>(r12, r6, r13)
            java.lang.String r3 = "r677d3fc3d52048d1"
            vb0 r13 = new vb0
            r19 = 1
            r16 = r0
            r15 = r1
            r18 = r2
            r14 = r17
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0 = 21
            p000.p91.m4411(r0, r13, r3)
        L119:
            s62 r0 = p000.s62.f9751
            return r0
        L11c:
            p000.ln0.m3650(r1)
            throw r8
        L120:
            p000.ln0.m3650(r1)
            throw r8
        L124:
            java.lang.Object r1 = r0.f8401
            m6 r1 = (p000.C0538m6) r1
            java.lang.Object r0 = r0.f8402
            dl1 r0 = (p000.dl1) r0
            java.lang.Object r1 = r1.f6967
            j7 r1 = (p000.C0421j7) r1
            int r1 = r1.get()
            if (r1 == 0) goto L137
            goto L13a
        L137:
            r0.invoke()
        L13a:
            s62 r0 = p000.s62.f9751
            return r0
        L13d:
            java.lang.Object r1 = r0.f8401
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f8402
            fk0 r0 = (p000.fk0) r0
            p000.AbstractC0978xb.m6573(r1, r0)
            goto L119
        L149:
            java.lang.Object r1 = r0.f8401
            dj0 r1 = (p000.dj0) r1
            java.lang.Object r0 = r0.f8402
            cj0 r0 = (p000.cj0) r0
            java.util.concurrent.ScheduledExecutorService r2 = r1.f3187
            zi0 r3 = new zi0
            r3.<init>(r0, r1)
            r2.execute(r3)
            goto L119
        L15c:
            java.lang.Object r1 = r0.f8401
            li0 r1 = (p000.li0) r1
            java.lang.Object r0 = r0.f8402
            uj0 r0 = (p000.uj0) r0
            r1.f6649 = r9
            r1.m3573(r9)
            java.lang.String r2 = r0.f10858
            int r3 = r0.f10857
            boolean r4 = p000.q02.m4671(r2)
            if (r4 != 0) goto L175
            r0 = r2
            goto L199
        L175:
            int r4 = r0.f10855
            if (r4 != 0) goto L17c
            java.lang.String r0 = "服务器没有可清理的互动消息"
            goto L199
        L17c:
            int r0 = r0.f10856
            if (r3 != 0) goto L189
            java.lang.String r4 = "已由服务器确认删除 "
            java.lang.String r5 = " 条互动消息"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r4, r0, r5)
            goto L199
        L189:
            java.lang.String r5 = "服务器确认删除 "
            java.lang.String r6 = "/"
            java.lang.String r7 = " 条，失败 "
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r5, r0, r6, r4, r7)
            java.lang.String r4 = " 条可稍后重试"
            java.lang.String r0 = p000.AbstractC0602nx.m4131(r0, r3, r4)
        L199:
            android.widget.TextView r4 = r1.f6665
            r4.setText(r0)
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            android.app.Activity r1 = r1.f6659
            r4.<init>(r1)
            if (r3 != 0) goto L1b0
            boolean r1 = p000.q02.m4671(r2)
            if (r1 == 0) goto L1b0
            java.lang.String r1 = "互动消息清理完成"
            goto L1b2
        L1b0:
            java.lang.String r1 = "互动消息清理未完全成功"
        L1b2:
            android.app.AlertDialog$Builder r1 = r4.setTitle(r1)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            java.lang.String r1 = "确定"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r8)
            r0.show()
            goto L119
        L1c5:
            yi0 r1 = p000.yi0.f12637
            yi0 r2 = p000.yi0.f12636
            java.lang.Object r3 = r0.f8401
            li0 r3 = (p000.li0) r3
            java.lang.Object r0 = r0.f8402
            java.util.List r0 = (java.util.List) r0
            r3.f6648 = r9
            r3.f6656 = r8
            r3.m3572(r9)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L1e0
            r5 = r9
            goto L200
        L1e0:
            java.util.Iterator r4 = r0.iterator()
            r5 = r9
        L1e5:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L200
            java.lang.Object r6 = r4.next()
            hj0 r6 = (p000.hj0) r6
            yi0 r6 = r6.f4748
            yi0 r7 = p000.yi0.f12635
            if (r6 != r7) goto L1e5
            int r5 = r5 + 1
            if (r5 < 0) goto L1fc
            goto L1e5
        L1fc:
            p000.AbstractC1021yh.m6916()
            throw r8
        L200:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L208
            r6 = r9
            goto L226
        L208:
            java.util.Iterator r4 = r0.iterator()
            r6 = r9
        L20d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L226
            java.lang.Object r7 = r4.next()
            hj0 r7 = (p000.hj0) r7
            yi0 r7 = r7.f4748
            if (r7 != r2) goto L20d
            int r6 = r6 + 1
            if (r6 < 0) goto L222
            goto L20d
        L222:
            p000.AbstractC1021yh.m6916()
            throw r8
        L226:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L22e
            r7 = r9
            goto L24c
        L22e:
            java.util.Iterator r4 = r0.iterator()
            r7 = r9
        L233:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L24c
            java.lang.Object r10 = r4.next()
            hj0 r10 = (p000.hj0) r10
            yi0 r10 = r10.f4748
            if (r10 != r1) goto L233
            int r7 = r7 + 1
            if (r7 < 0) goto L248
            goto L233
        L248:
            p000.AbstractC1021yh.m6916()
            throw r8
        L24c:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L253
            goto L272
        L253:
            java.util.Iterator r4 = r0.iterator()
        L257:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L272
            java.lang.Object r10 = r4.next()
            hj0 r10 = (p000.hj0) r10
            yi0 r10 = r10.f4748
            yi0 r11 = p000.yi0.f12638
            if (r10 != r11) goto L257
            int r9 = r9 + 1
            if (r9 < 0) goto L26e
            goto L257
        L26e:
            p000.AbstractC1021yh.m6916()
            throw r8
        L272:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "成功 "
            r10.<init>(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r4.append(r5)
            if (r6 <= 0) goto L29b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = " · 失败 "
            r5.<init>(r10)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.append(r5)
        L29b:
            if (r7 <= 0) goto L2ae
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " · 超时 "
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.append(r5)
        L2ae:
            if (r9 <= 0) goto L2c1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " · 未执行 "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            r4.append(r5)
        L2c1:
            java.lang.String r4 = r4.toString()
            r3.f6651 = r4
            r3.m3575()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2d3:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L2ea
            java.lang.Object r5 = r0.next()
            r6 = r5
            hj0 r6 = (p000.hj0) r6
            yi0 r6 = r6.f4748
            if (r6 == r2) goto L2e6
            if (r6 != r1) goto L2d3
        L2e6:
            r4.add(r5)
            goto L2d3
        L2ea:
            r0 = 6
            java.util.List r9 = p000.AbstractC0984xh.m6662(r4, r0)
            java.lang.String r10 = "、"
            sh0 r14 = new sh0
            r0 = 18
            r14.<init>(r0)
            r15 = 30
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r9, r10, r11, r12, r13, r14, r15)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f6651
            r1.append(r2)
            boolean r2 = p000.q02.m4671(r0)
            if (r2 != 0) goto L319
            java.lang.String r2 = "\n\n保留待重试："
            r1.append(r2)
            r1.append(r0)
        L319:
            java.lang.String r0 = r1.toString()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.app.Activity r2 = r3.f6659
            r1.<init>(r2)
            java.lang.String r2 = "会话删除完成"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            java.lang.String r1 = "确定"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r8)
            r0.show()
            goto L119
        L339:
            java.lang.Object r1 = r0.f8401
            li0 r1 = (p000.li0) r1
            java.lang.Object r0 = r0.f8402
            pt r0 = (p000.C0699pt) r0
            r1.m3570(r0)
            goto L119
        L346:
            java.lang.Object r1 = r0.f8401
            gc r1 = (p000.C0317gc) r1
            java.lang.Object r0 = r0.f8402
            jh0 r0 = (p000.jh0) r0
            r1.invoke(r0)
            goto L119
        L353:
            java.lang.Object r1 = r0.f8401
            ic r1 = (p000.C0391ic) r1
            java.lang.Object r0 = r0.f8402
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.invoke(r8, r0)
            goto L119
        L360:
            java.lang.Object r1 = r0.f8401
            ic r1 = (p000.C0391ic) r1
            java.lang.Object r0 = r0.f8402
            lh0 r0 = (p000.lh0) r0
            r1.invoke(r0, r8)
            goto L119
        L36d:
            java.lang.Object r1 = r0.f8401
            dg0 r1 = (p000.dg0) r1
            java.lang.Object r0 = r0.f8402
            um1 r0 = (p000.um1) r0
            bg0 r2 = r1.f3132
            java.lang.Object r0 = r0.f10912
            xs1 r0 = (p000.xs1) r0
            r2.mo955(r1, r0)
            goto L119
        L380:
            java.lang.Object r1 = r0.f8401
            cg0 r1 = (p000.cg0) r1
            java.lang.Object r0 = r0.f8402
            xs1 r0 = (p000.xs1) r0
            um1 r2 = new um1
            r2.<init>()
            dg0 r1 = r1.f2106
            lg0 r3 = r1.f3129
            monitor-enter(r3)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L428
            xs1 r4 = r1.f3149     // Catch: java.lang.Throwable -> L3f3
            xs1 r5 = new xs1     // Catch: java.lang.Throwable -> L3f3
            r5.<init>()     // Catch: java.lang.Throwable -> L3f3
            r4.getClass()     // Catch: java.lang.Throwable -> L3f3
            r6 = r9
        L39e:
            r10 = 10
            if (r6 >= r10) goto L3b3
            int r10 = r7 << r6
            int r11 = r4.f12278     // Catch: java.lang.Throwable -> L3f3
            r10 = r10 & r11
            if (r10 == 0) goto L3b0
            int[] r10 = r4.f12279     // Catch: java.lang.Throwable -> L3f3
            r10 = r10[r6]     // Catch: java.lang.Throwable -> L3f3
            r5.m6783(r6, r10)     // Catch: java.lang.Throwable -> L3f3
        L3b0:
            int r6 = r6 + 1
            goto L39e
        L3b3:
            r6 = r9
        L3b4:
            if (r6 >= r10) goto L3c7
            int r11 = r7 << r6
            int r12 = r0.f12278     // Catch: java.lang.Throwable -> L3f3
            r11 = r11 & r12
            if (r11 == 0) goto L3c4
            int[] r11 = r0.f12279     // Catch: java.lang.Throwable -> L3f3
            r11 = r11[r6]     // Catch: java.lang.Throwable -> L3f3
            r5.m6783(r6, r11)     // Catch: java.lang.Throwable -> L3f3
        L3c4:
            int r6 = r6 + 1
            goto L3b4
        L3c7:
            r2.f10912 = r5     // Catch: java.lang.Throwable -> L3f3
            int r0 = r5.m6782()     // Catch: java.lang.Throwable -> L3f3
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L3f3
            int r0 = r4.m6782()     // Catch: java.lang.Throwable -> L3f3
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L3f3
            long r5 = r5 - r10
            r10 = 0
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 == 0) goto L3f5
            java.util.LinkedHashMap r0 = r1.f3133     // Catch: java.lang.Throwable -> L3f3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3f3
            if (r0 == 0) goto L3e3
            goto L3f5
        L3e3:
            java.util.LinkedHashMap r0 = r1.f3133     // Catch: java.lang.Throwable -> L3f3
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L3f3
            kg0[] r7 = new p000.kg0[r9]     // Catch: java.lang.Throwable -> L3f3
            java.lang.Object[] r0 = r0.toArray(r7)     // Catch: java.lang.Throwable -> L3f3
            r8 = r0
            kg0[] r8 = (p000.kg0[]) r8     // Catch: java.lang.Throwable -> L3f3
            goto L3f5
        L3f3:
            r0 = move-exception
            goto L44d
        L3f5:
            java.lang.Object r0 = r2.f10912     // Catch: java.lang.Throwable -> L3f3
            xs1 r0 = (p000.xs1) r0     // Catch: java.lang.Throwable -> L3f3
            r0.getClass()     // Catch: java.lang.Throwable -> L3f3
            r1.f3149 = r0     // Catch: java.lang.Throwable -> L3f3
            w22 r0 = r1.f3141     // Catch: java.lang.Throwable -> L3f3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f3
            r7.<init>()     // Catch: java.lang.Throwable -> L3f3
            java.lang.String r10 = r1.f3134     // Catch: java.lang.Throwable -> L3f3
            r7.append(r10)     // Catch: java.lang.Throwable -> L3f3
            java.lang.String r10 = " onSettings"
            r7.append(r10)     // Catch: java.lang.Throwable -> L3f3
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3f3
            p3 r10 = new p3     // Catch: java.lang.Throwable -> L3f3
            r11 = 19
            r10.<init>(r1, r11, r2)     // Catch: java.lang.Throwable -> L3f3
            p000.w22.m6309(r0, r7, r10)     // Catch: java.lang.Throwable -> L3f3
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L428
            lg0 r0 = r1.f3129     // Catch: java.lang.Throwable -> L428 java.io.IOException -> L42a
            java.lang.Object r2 = r2.f10912     // Catch: java.lang.Throwable -> L428 java.io.IOException -> L42a
            xs1 r2 = (p000.xs1) r2     // Catch: java.lang.Throwable -> L428 java.io.IOException -> L42a
            r0.m3557(r2)     // Catch: java.lang.Throwable -> L428 java.io.IOException -> L42a
            goto L430
        L428:
            r0 = move-exception
            goto L44f
        L42a:
            r0 = move-exception
            sz r2 = p000.EnumC0816sz.f10088     // Catch: java.lang.Throwable -> L428
            r1.m1738(r2, r2, r0)     // Catch: java.lang.Throwable -> L428
        L430:
            monitor-exit(r3)
            if (r8 == 0) goto L44a
            int r0 = r8.length
        L434:
            if (r9 >= r0) goto L44a
            r1 = r8[r9]
            monitor-enter(r1)
            long r2 = r1.f5903     // Catch: java.lang.Throwable -> L447
            long r2 = r2 + r5
            r1.f5903 = r2     // Catch: java.lang.Throwable -> L447
            if (r4 <= 0) goto L443
            r1.notifyAll()     // Catch: java.lang.Throwable -> L447
        L443:
            monitor-exit(r1)
            int r9 = r9 + 1
            goto L434
        L447:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L44a:
            s62 r0 = p000.s62.f9751
            return r0
        L44d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L428
            throw r0     // Catch: java.lang.Throwable -> L428
        L44f:
            monitor-exit(r3)
            throw r0
        L451:
            java.lang.Object r1 = r0.f8401
            dg0 r1 = (p000.dg0) r1
            java.lang.Object r0 = r0.f8402
            r2 = r0
            kg0 r2 = (p000.kg0) r2
            bg0 r0 = r1.f3132     // Catch: java.io.IOException -> L460
            r0.mo109(r2)     // Catch: java.io.IOException -> L460
            goto L482
        L460:
            r0 = move-exception
            f0 r3 = p000.gh1.f4375
            f0 r3 = p000.gh1.f4375
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Http2Connection.Listener failure for "
            r4.<init>(r5)
            java.lang.String r1 = r1.f3134
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.getClass()
            java.lang.String r3 = "OkHttp"
            android.util.Log.i(r3, r1, r0)
            sz r1 = p000.EnumC0816sz.f10088     // Catch: java.io.IOException -> L482
            r2.m3244(r1, r0)     // Catch: java.io.IOException -> L482
        L482:
            s62 r0 = p000.s62.f9751
            return r0
        L485:
            java.lang.Object r1 = r0.f8401
            z81 r1 = (p000.z81) r1
            java.lang.Object r0 = r0.f8402
            com.example.dyhelper.MainHook r0 = (com.example.dyhelper.MainHook) r0
            sb r2 = p000.C0792sb.f9786
            java.lang.ClassLoader r1 = r1.f13011
            r1.getClass()
            boolean r2 = p000.C0792sb.f9794
            if (r2 == 0) goto L49a
            goto L517
        L49a:
            p000.C0792sb.f9794 = r7
            p000.C0792sb.f9796 = r1
            p000.C0792sb.f9797 = r0
            java.lang.String r0 = "r61b37e0812ef27a1"
            p000.C0888ux.m5985(r0)
            n7 r0 = new n7     // Catch: java.lang.Throwable -> L4bb
            r1 = 7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4bb
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.ui1.f10853     // Catch: java.lang.Throwable -> L4bb
            r1.add(r0)     // Catch: java.lang.Throwable -> L4bb
            n7 r0 = new n7     // Catch: java.lang.Throwable -> L4bb
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L4bb
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.ui1.f10852     // Catch: java.lang.Throwable -> L4bb
            r1.add(r0)     // Catch: java.lang.Throwable -> L4bb
            goto L4c5
        L4bb:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "r2676af736b9af546"
            p000.AbstractC0602nx.m4142(r1, r0)
        L4c5:
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "onResume"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L508
            java.lang.reflect.Method r1 = p000.C0792sb.m5413(r0, r1, r2)     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedModule r2 = p000.C0792sb.m5395()     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedInterface$HookBuilder r1 = r2.hook(r1)     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedInterface$ExceptionMode r2 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedInterface$HookBuilder r1 = r1.setExceptionMode(r2)     // Catch: java.lang.Throwable -> L508
            ib r3 = new ib     // Catch: java.lang.Throwable -> L508
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L508
            r1.intercept(r3)     // Catch: java.lang.Throwable -> L508
            java.lang.String r1 = "onPause"
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L508
            java.lang.reflect.Method r0 = p000.C0792sb.m5413(r0, r1, r3)     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedModule r1 = p000.C0792sb.m5395()     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r1.hook(r0)     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r0.setExceptionMode(r2)     // Catch: java.lang.Throwable -> L508
            ib r1 = new ib     // Catch: java.lang.Throwable -> L508
            r2 = 23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L508
            io.github.libxposed.api.XposedInterface$HookHandle r0 = r0.intercept(r1)     // Catch: java.lang.Throwable -> L508
            r0.getClass()     // Catch: java.lang.Throwable -> L508
            goto L512
        L508:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "r1536811db8d50783"
            p000.AbstractC0602nx.m4142(r1, r0)
        L512:
            java.lang.String r0 = "rfbe702150c5f659f"
            p000.C0888ux.m5985(r0)
        L517:
            s62 r0 = p000.s62.f9751
            return r0
        L51a:
            java.lang.Object r1 = r0.f8401
            nd0 r1 = (p000.nd0) r1
            java.lang.Object r0 = r0.f8402
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L52a
            java.lang.String r8 = p000.nd0.m4025(r0)
        L52a:
            if (r8 != 0) goto L52e
            java.lang.String r8 = ""
        L52e:
            r1.f7531 = r8
            r1.m4030()
            r1.m4031()
            goto L119
        L538:
            java.lang.Object r1 = r0.f8401
            um1 r1 = (p000.um1) r1
            java.lang.Object r0 = r0.f8402
            dc0 r0 = (p000.dc0) r0
            java.lang.ClassLoader r2 = r0.f3053     // Catch: java.lang.Throwable -> L551
            wb0 r3 = new wb0     // Catch: java.lang.Throwable -> L551
            r3.<init>(r0, r7)     // Catch: java.lang.Throwable -> L551
            yb0 r4 = new yb0     // Catch: java.lang.Throwable -> L551
            r4.<init>(r0, r9)     // Catch: java.lang.Throwable -> L551
            sb0 r0 = p000.C0966x.m6413(r2, r3, r4)     // Catch: java.lang.Throwable -> L551
            goto L558
        L551:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L558:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 != 0) goto L55f
            goto L570
        L55f:
            sb0 r0 = new sb0
            jz r3 = p000.C0450jz.f5672
            java.lang.String r2 = p000.ec0.m1897(r2)
            java.lang.String r4 = "群申请加载失败："
            java.lang.String r2 = r4.concat(r2)
            r0.<init>(r3, r3, r9, r2)
        L570:
            r1.f10912 = r0
            goto L119
        L574:
            java.lang.Object r1 = r0.f8401
            dc0 r1 = (p000.dc0) r1
            java.lang.Object r0 = r0.f8402
            db0 r0 = (p000.db0) r0
            int r2 = r0.f3023
            int r0 = r0.f3024
            java.lang.String r3 = "正在提交审批 "
            java.lang.String r4 = "/"
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r2, r0, r3, r4)
            r1.f3073 = r0
            r1.m1695()
            goto L119
        L58f:
            java.lang.Object r1 = r0.f8401
            dc0 r1 = (p000.dc0) r1
            java.lang.Object r0 = r0.f8402
            rb0 r0 = (p000.rb0) r0
            int r2 = r0.f9322
            java.lang.String r3 = r0.f9323
            if (r2 != 0) goto L5a0
            java.lang.String r0 = "正在识别可管理群"
            goto L5c3
        L5a0:
            boolean r4 = p000.q02.m4671(r3)
            if (r4 == 0) goto L5af
            java.lang.String r0 = "发现 "
            java.lang.String r3 = " 个可管理群"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r0, r2, r3)
            goto L5c3
        L5af:
            int r0 = r0.f9321
            int r0 = r0 + r7
            java.lang.String r4 = "正在查询 "
            java.lang.String r5 = "/"
            java.lang.String r6 = "："
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r4, r0, r5, r2, r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L5c3:
            r1.f3073 = r0
            r1.m1695()
            goto L119
        L5ca:
            java.lang.Object r1 = r0.f8401
            dc0 r1 = (p000.dc0) r1
            java.lang.Object r0 = r0.f8402
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.f3072 = r9
            java.lang.String r0 = p000.ec0.m1897(r0)
            java.lang.String r2 = "群申请审批失败："
            java.lang.String r0 = r2.concat(r0)
            r1.f3074 = r0
            r1.m1695()
            android.app.Activity r0 = r1.f3052
            java.lang.String r1 = r1.f3074
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r9)
            r0.show()
            goto L119
        L5f0:
            java.lang.Object r1 = r0.f8401
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            java.lang.Object r0 = r0.f8402
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            r1.set(r7)
            java.lang.Object r0 = r0.getAndSet(r8)
            uk1 r0 = (p000.uk1) r0
            if (r0 == 0) goto L606
            r0.m5929()
        L606:
            s62 r0 = p000.s62.f9751
            return r0
        L609:
            java.lang.Object r1 = r0.f8401
            g30 r1 = (p000.g30) r1
            java.lang.Object r0 = r0.f8402
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            p000.h30.m2348(r1, r0, r7)
            goto L119
        L616:
            java.lang.Object r1 = r0.f8401
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            java.lang.Object r0 = r0.f8402
            android.view.View r0 = (android.view.View) r0
            com.example.dyhelper.hook.γ r2 = com.example.dyhelper.hook.C0157.f2411
            r2.m1525(r1, r0)
            goto L119
        L625:
            java.lang.Object r1 = r0.f8401
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f8402
            android.view.View r0 = (android.view.View) r0
            q10 r4 = p000.q10.f8786
            java.util.Map r4 = p000.q10.f8789
            r4.getClass()
            r4.put(r0, r1)
            java.lang.String r4 = "FeedGestureActionLauncher"
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L649
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L64a
        L649:
            r7 = r8
        L64a:
            if (r7 == 0) goto L650
            int r3 = r7.getChildCount()
        L650:
            java.lang.String r7 = "注册 Feed 原生动作根 control="
            java.lang.String r10 = " view="
            java.lang.String r11 = " childCount="
            java.lang.StringBuilder r5 = p000.lz1.m3695(r7, r1, r10, r5, r11)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            p000.C0888ux.m5988(r4, r3, r8, r6, r8)
            sm1 r3 = new sm1
            r3.<init>()
            p000.q10.m4698(r3, r1, r0, r0, r9)
            dg r3 = new dg
            r3.<init>(r2, r0, r1)
            r0.post(r3)
            dg r2 = new dg
            r3 = 3
            r2.<init>(r3, r0, r1)
            r3 = 160(0xa0, double:7.9E-322)
            r0.postDelayed(r2, r3)
            goto L119
        L681:
            java.lang.Object r1 = r0.f8401
            r00 r1 = (p000.r00) r1
            java.lang.Object r0 = r0.f8402
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            p000.s00.m5315(r1, r0, r7)
            goto L119
        L68e:
            java.lang.Object r1 = r0.f8401
            av r1 = (p000.C0054av) r1
            java.lang.Object r0 = r0.f8402
            l91 r0 = (p000.l91) r0
            java.lang.Object r0 = r0.f6502
            r1.invoke(r0)
            goto L119
        L69d:
            java.lang.Object r1 = r0.f8401
            a9 r1 = (p000.C0010a9) r1
            java.lang.Object r0 = r0.f8402
            java.lang.String r0 = (java.lang.String) r0
            r1.invoke(r0)
            goto L119
        L6aa:
            java.lang.Object r1 = r0.f8401
            xn r1 = (p000.C0990xn) r1
            java.lang.Object r0 = r0.f8402
            v80 r1 = r1.f12216
            ow1 r2 = r1.f11159
            nw1 r3 = r2.m4302()
            r4 = r9
        L6b9:
            int r5 = r2.f8287     // Catch: java.lang.Throwable -> L6e3
            if (r4 >= r5) goto L721
            boolean r5 = r3.m4107(r4)     // Catch: java.lang.Throwable -> L6e3
            if (r5 == 0) goto L6e6
            java.lang.Object r5 = r3.m4109(r4)     // Catch: java.lang.Throwable -> L6e3
            if (r5 == r0) goto L6d9
            boolean r7 = r5 instanceof p000.a90     // Catch: java.lang.Throwable -> L6e3
            if (r7 == 0) goto L6d0
            a90 r5 = (p000.a90) r5     // Catch: java.lang.Throwable -> L6e3
            goto L6d1
        L6d0:
            r5 = r8
        L6d1:
            if (r5 == 0) goto L6d6
            fn1 r5 = r5.f145     // Catch: java.lang.Throwable -> L6e3
            goto L6d7
        L6d6:
            r5 = r8
        L6d7:
            if (r5 != r0) goto L6e6
        L6d9:
            b41 r0 = new b41     // Catch: java.lang.Throwable -> L6e3
            r0.<init>(r4, r8)     // Catch: java.lang.Throwable -> L6e3
            r3.m4098()
            r8 = r0
            goto L727
        L6e3:
            r0 = move-exception
            goto L750
        L6e6:
            int[] r5 = r3.f7798     // Catch: java.lang.Throwable -> L6e3
            int r7 = p000.qw1.m4946(r4, r5)     // Catch: java.lang.Throwable -> L6e3
            int r10 = r4 + 1
            int r11 = r3.f7799     // Catch: java.lang.Throwable -> L6e3
            if (r10 >= r11) goto L6f8
            int r11 = r10 * 5
            int r11 = r11 + r6
            r5 = r5[r11]     // Catch: java.lang.Throwable -> L6e3
            goto L6fa
        L6f8:
            int r5 = r3.f7801     // Catch: java.lang.Throwable -> L6e3
        L6fa:
            int r5 = r5 - r7
            r7 = r9
        L6fc:
            if (r7 >= r5) goto L725
            java.lang.Object r11 = r3.m4103(r4, r7)     // Catch: java.lang.Throwable -> L6e3
            if (r11 == r0) goto L718
            boolean r12 = r11 instanceof p000.a90     // Catch: java.lang.Throwable -> L6e3
            if (r12 == 0) goto L70b
            a90 r11 = (p000.a90) r11     // Catch: java.lang.Throwable -> L6e3
            goto L70c
        L70b:
            r11 = r8
        L70c:
            if (r11 == 0) goto L711
            fn1 r11 = r11.f145     // Catch: java.lang.Throwable -> L6e3
            goto L712
        L711:
            r11 = r8
        L712:
            if (r11 != r0) goto L715
            goto L718
        L715:
            int r7 = r7 + 1
            goto L6fc
        L718:
            b41 r8 = new b41     // Catch: java.lang.Throwable -> L6e3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L6e3
            r8.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6e3
        L721:
            r3.m4098()
            goto L727
        L725:
            r4 = r10
            goto L6b9
        L727:
            if (r8 == 0) goto L746
            int r0 = r8.f1465
            java.lang.Integer r3 = r8.f1466
            nw1 r2 = r2.m4302()
            java.util.ArrayList r0 = p000.ln0.m3652(r2, r0, r3)     // Catch: java.lang.Throwable -> L741
            r2.m4098()
            java.util.List r2 = r1.m6066()
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r0, r2)
            goto L748
        L741:
            r0 = move-exception
            r2.m4098()
            throw r0
        L746:
            jz r0 = p000.C0450jz.f5672
        L748:
            hn r2 = new hn
            boolean r1 = r1.f11138
            r2.<init>(r0, r1)
            return r2
        L750:
            r3.m4098()
            throw r0
        L754:
            java.lang.Object r1 = r0.f8401
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Object r0 = r0.f8402
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Map r3 = p000.C0792sb.f9783
            r3.getClass()
            monitor-enter(r3)
            java.lang.Object r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L771
            if (r4 != 0) goto L773
            rb r4 = new rb     // Catch: java.lang.Throwable -> L771
            r4.<init>()     // Catch: java.lang.Throwable -> L771
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L771
            goto L773
        L771:
            r0 = move-exception
            goto L782
        L773:
            rb r4 = (p000.C0755rb) r4     // Catch: java.lang.Throwable -> L771
            monitor-exit(r3)
            sb r3 = p000.C0792sb.f9786
            z7 r3 = new z7
            r3.<init>(r4, r1, r0, r2)
            p000.C0792sb.m5402(r3)
            goto L119
        L782:
            monitor-exit(r3)
            throw r0
        L784:
            java.lang.Object r1 = r0.f8401
            o8 r1 = (p000.C0614o8) r1
            java.lang.Object r0 = r0.f8402
            aq0 r0 = (p000.aq0) r0
            iv1 r2 = r1.f7979
            fe r3 = r0.f1284
            long r3 = r3.mo585()
            np0 r5 = r0.getLayoutDirection()
            u81 r0 = r2.mo2812(r3, r5, r0)
            r1.f7977 = r0
            goto L119
        L7a0:
            java.lang.Object r1 = r0.f8401
            me r1 = (p000.InterfaceC0546me) r1
            java.lang.Object r0 = r0.f8402
            r1.mo3385(r0)
            goto L119
    }
}
