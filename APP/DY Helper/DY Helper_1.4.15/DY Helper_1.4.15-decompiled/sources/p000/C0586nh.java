package p000;

/* JADX INFO: renamed from: nh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0586nh extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f7617;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f7618;

    public /* synthetic */ C0586nh(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7617 = r1
            r0.f7618 = r2
            r0.<init>()
            return
    }

    public C0586nh(java.lang.Class r2) {
            r1 = this;
            r0 = 3
            r1.f7617 = r0
            java.util.Set r0 = p000.C0118cm.f2205
            r1.f7618 = r2
            r1.<init>()
            return
    }

    public C0586nh(p000.mi1 r1, p000.ji1 r2) {
            r0 = this;
            r1 = 6
            r0.f7617 = r1
            r0.f7618 = r2
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r8) {
            r7 = this;
            int r0 = r7.f7617
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L2d5;
                case 1: goto L2b1;
                case 2: goto L1e3;
                case 3: goto L9;
                case 4: goto L198;
                case 5: goto L14c;
                case 6: goto Lac;
                case 7: goto L7d;
                case 8: goto Ld;
                default: goto L9;
            }
        L9:
            super.afterHookedMethod(r8)
            return
        Ld:
            r8.getClass()
            java.lang.Throwable r0 = r8.f5695
            if (r0 == 0) goto L16
            goto L7c
        L16:
            java.lang.String r0 = "quick_share_filter_application"
            java.util.concurrent.ConcurrentHashMap r1 = r8.f5693
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof p000.gk1
            if (r1 == 0) goto L25
            gk1 r0 = (p000.gk1) r0
            goto L26
        L25:
            r0 = r4
        L26:
            if (r0 != 0) goto L29
            goto L7c
        L29:
            int r1 = r0.f4400
            if (r1 <= 0) goto L7c
            int r0 = r0.f4401
            if (r0 != 0) goto L7c
            java.lang.Object r7 = r7.f7618
            ce0 r7 = (p000.ce0) r7
            java.lang.Object[] r8 = r8.f5692     // Catch: java.lang.Throwable -> L64
            r8.getClass()     // Catch: java.lang.Throwable -> L64
            int r0 = r7.f2080     // Catch: java.lang.Throwable -> L64
            java.lang.Object r8 = p000.AbstractC0312g7.m2253(r0, r8)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L43
            goto L7c
        L43:
            lv1 r0 = p000.lv1.f6813     // Catch: java.lang.Throwable -> L64
            java.lang.reflect.Method r0 = r7.f2082     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.invoke(r8, r4)     // Catch: java.lang.Throwable -> L64
            boolean r1 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L52
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L64
            goto L53
        L52:
            r0 = r4
        L53:
            if (r0 != 0) goto L56
            goto L61
        L56:
            p000.h62.m2391(r0)     // Catch: java.lang.Throwable -> L64
            r0.clear()     // Catch: java.lang.Throwable -> L64
            java.lang.reflect.Method r7 = r7.f2083     // Catch: java.lang.Throwable -> L64
            r7.invoke(r8, r4)     // Catch: java.lang.Throwable -> L64
        L61:
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L64
            goto L6b
        L64:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L6b:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L7c
            java.lang.String r8 = "rac25e39d95f0abcc"
            java.lang.String r7 = r7.getMessage()
            java.lang.String r0 = "quick empty submit callback failed: "
            p000.AbstractC0602nx.m4143(r0, r7, r8)
        L7c:
            return
        L7d:
            r8.getClass()
            java.lang.Object r7 = r7.f7618
            ee0 r7 = (p000.ee0) r7
            java.lang.Class r7 = r7.f3519
            java.lang.Object r8 = r8.f5691
            boolean r7 = r7.isInstance(r8)
            if (r7 != 0) goto L8f
            goto Lab
        L8f:
            java.lang.ThreadLocal r7 = p000.cn1.f2218
            java.lang.Object r8 = r7.get()
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L9e
            int r8 = r8.intValue()
            goto L9f
        L9e:
            r8 = r3
        L9f:
            int r8 = r8 - r2
            if (r8 >= 0) goto La3
            goto La4
        La3:
            r3 = r8
        La4:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7.set(r8)
        Lab:
            return
        Lac:
            r8.getClass()
            java.lang.Object r0 = r8.f5691
            java.lang.Object r7 = r7.f7618
            ji1 r7 = (p000.ji1) r7
            java.lang.reflect.Field r7 = r7.f5479
            java.lang.Object[] r1 = r8.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2250(r1)
            java.lang.Throwable r8 = r8.f5695
            if (r8 == 0) goto Lc6
            r8 = r2
            goto Lc7
        Lc6:
            r8 = r3
        Lc7:
            java.lang.String r5 = "precise_time_enabled"
            boolean r5 = p000.ui1.m5887(r5, r3)
            if (r5 == 0) goto L14b
            if (r8 != 0) goto L14b
            if (r0 == 0) goto L14b
            if (r1 != 0) goto Ld7
            goto L14b
        Ld7:
            java.lang.Class r8 = r1.getClass()
            java.util.ArrayList r8 = p000.mi1.m3830(r8)
            f7 r5 = new f7
            r5.<init>(r2, r8)
            li1 r8 = new li1
            r8.<init>(r3)
            y30 r3 = new y30
            r3.<init>(r5, r2, r8)
            ef r8 = new ef
            r2 = 15
            r8.<init>(r2, r1)
            y30 r8 = p000.us1.m5943(r3, r8)
            java.lang.Object r8 = p000.us1.m5953(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            r1 = 0
            if (r8 == 0) goto L108
            long r5 = r8.longValue()
            goto L109
        L108:
            r5 = r1
        L109:
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 > 0) goto L10e
            goto L14b
        L10e:
            java.lang.String r8 = p000.mi1.m3832(r5)
            boolean r1 = p000.q02.m4671(r8)
            if (r1 == 0) goto L119
            goto L14b
        L119:
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Throwable -> L124
            boolean r0 = r7 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L124
            if (r0 == 0) goto L126
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch: java.lang.Throwable -> L124
            goto L12e
        L124:
            r7 = move-exception
            goto L128
        L126:
            r7 = r4
            goto L12e
        L128:
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        L12e:
            boolean r0 = r7 instanceof p000.eo1
            if (r0 == 0) goto L133
            r7 = r4
        L133:
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 != 0) goto L138
            goto L14b
        L138:
            java.lang.CharSequence r0 = r7.getText()
            if (r0 == 0) goto L142
            java.lang.String r4 = r0.toString()
        L142:
            boolean r0 = p000.ln0.m3626(r4, r8)
            if (r0 != 0) goto L14b
            r7.setText(r8)
        L14b:
            return
        L14c:
            r8.getClass()
            com.example.dyhelper.hook.γ r0 = com.example.dyhelper.hook.C0157.f2411
            boolean r0 = com.example.dyhelper.hook.C0157.m1476()
            if (r0 != 0) goto L158
            goto L194
        L158:
            java.lang.Object r8 = r8.f5691
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L161
            r4 = r8
            android.view.View r4 = (android.view.View) r4
        L161:
            if (r4 != 0) goto L164
            goto L194
        L164:
            java.lang.Object r7 = r7.f7618
            k20 r7 = (p000.k20) r7
            java.lang.Object r8 = com.example.dyhelper.hook.C0157.f2417
            monitor-enter(r8)
            java.util.WeakHashMap r0 = com.example.dyhelper.hook.C0157.f2426     // Catch: java.lang.Throwable -> L195
            boolean r5 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L195
            if (r5 == 0) goto L174
            goto L178
        L174:
            r0.put(r4, r7)     // Catch: java.lang.Throwable -> L195
            r2 = r3
        L178:
            monitor-exit(r8)
            if (r2 == 0) goto L17c
            goto L194
        L17c:
            y10 r8 = new y10
            r8.<init>(r7)
            r4.addOnLayoutChangeListener(r8)
            k2 r8 = new k2
            r8.<init>(r1, r7)
            r4.addOnAttachStateChangeListener(r8)
            z10 r8 = new z10
            r8.<init>(r4, r7, r3)
            r4.post(r8)
        L194:
            return
        L195:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L198:
            r8.getClass()
            java.lang.Object r0 = r8.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1a4
            android.view.View r0 = (android.view.View) r0
            goto L1a5
        L1a4:
            r0 = r4
        L1a5:
            if (r0 != 0) goto L1a8
            goto L1e2
        L1a8:
            java.lang.Object[] r8 = r8.f5692
            r8.getClass()
            java.lang.Object r8 = p000.AbstractC0312g7.m2253(r3, r8)
            boolean r1 = r8 instanceof android.view.View.OnClickListener
            if (r1 == 0) goto L1b8
            r4 = r8
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
        L1b8:
            if (r4 != 0) goto L1bb
            goto L1e2
        L1bb:
            java.lang.Object r7 = r7.f7618
            q10 r7 = (p000.q10) r7
            z7 r8 = new z7
            r1 = 5
            r8.<init>(r7, r0, r4, r1)
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r7 = p000.ln0.m3626(r7, r0)
            if (r7 == 0) goto L1d7
            r8.invoke()
            goto L1e2
        L1d7:
            android.os.Handler r7 = p000.q10.f8788
            r0 r0 = new r0
            r1 = 4
            r0.<init>(r1, r8)
            r7.post(r0)
        L1e2:
            return
        L1e3:
            r8.getClass()
            android.util.LruCache r0 = p000.C0839tl.f10408
            boolean r0 = p000.C0839tl.m5717()
            if (r0 != 0) goto L1f0
            goto L2b0
        L1f0:
            java.lang.Object r0 = r8.f5694
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L1f9
            java.util.List r0 = (java.util.List) r0
            goto L1fa
        L1f9:
            r0 = r4
        L1fa:
            if (r0 != 0) goto L1fe
            goto L2b0
        L1fe:
            java.lang.Object r2 = r8.f5691
            if (r2 != 0) goto L204
            goto L2b0
        L204:
            java.lang.Object r7 = r7.f7618
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Object r7 = p000.C0839tl.m5715(r2, r7)
            boolean r2 = r7 instanceof java.util.List
            if (r2 == 0) goto L213
            java.util.List r7 = (java.util.List) r7
            goto L214
        L213:
            r7 = r4
        L214:
            if (r7 != 0) goto L218
            goto L2b0
        L218:
            if (r0 == r7) goto L21c
            goto L2b0
        L21c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L225:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L23d
            java.lang.Object r3 = r7.next()
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L236
            java.lang.String r3 = (java.lang.String) r3
            goto L237
        L236:
            r3 = r4
        L237:
            if (r3 == 0) goto L225
            r2.add(r3)
            goto L225
        L23d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r2, r3)
            r7.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L24c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L262
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.util.LruCache r4 = p000.C0839tl.f10408
            java.lang.String r3 = p000.C0839tl.m5718(r3)
            r7.add(r3)
            goto L24c
        L262:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L26b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L282
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto L26b
            r2.add(r3)
            goto L26b
        L282:
            java.util.Set r7 = p000.AbstractC0984xh.m6670(r2)
            java.util.List r7 = p000.AbstractC0984xh.m6666(r7)
            tf r2 = new tf
            r3 = 21
            r2.<init>(r3)
            ye r3 = new ye
            r3.<init>(r1, r2)
            java.util.List r7 = p000.AbstractC0984xh.m6658(r7, r3)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L2b0
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L2b0
            r8.m3107(r7)
            java.lang.String r7 = "DYHelper_ImageWatermark"
            java.lang.String r8 = "替换评论动图保存源: url_list 已清洗排序"
            p000.C0888ux.m5975(r7, r8)
        L2b0:
            return
        L2b1:
            r8.getClass()
            java.lang.Object r7 = r7.f7618     // Catch: java.lang.Throwable -> L2bc
            gh r7 = (p000.C0322gh) r7     // Catch: java.lang.Throwable -> L2bc
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L2bc
            goto L2d4
        L2bc:
            r7 = move-exception
            h22 r8 = p000.AbstractC0551mj.f7171
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "hook ctor failed: "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            p000.AbstractC0551mj.m3859(r7)
        L2d4:
            return
        L2d5:
            r8.getClass()
            java.lang.Object r8 = r8.f5691
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L2e1
            r4 = r8
            android.view.View r4 = (android.view.View) r4
        L2e1:
            if (r4 != 0) goto L2e4
            goto L2eb
        L2e4:
            java.lang.Object r7 = r7.f7618
            oh r7 = (p000.C0623oh) r7
            r7.m4246(r4)
        L2eb:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r10) {
            r9 = this;
            int r0 = r9.f7617
            r1 = 0
            s62 r2 = p000.s62.f9751
            java.lang.Object r3 = r9.f7618
            switch(r0) {
                case 3: goto L149;
                case 7: goto L85;
                case 8: goto Le;
                default: goto La;
            }
        La:
            super.beforeHookedMethod(r10)
            return
        Le:
            java.lang.String r9 = "rac25e39d95f0abcc"
            java.lang.String r0 = "quick submit filtered source="
            java.lang.String r1 = "quick:"
            r10.getClass()
            java.lang.Object[] r4 = r10.f5692
            be0 r5 = p000.be0.f1670
            boolean r5 = r5.m939()
            if (r5 != 0) goto L22
            goto L84
        L22:
            ce0 r3 = (p000.ce0) r3
            int r5 = r3.f2081
            r4.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = p000.AbstractC0312g7.m2253(r5, r4)     // Catch: java.lang.Throwable -> L6f
            gk1 r6 = p000.i81.m2664(r3, r6)     // Catch: java.lang.Throwable -> L6f
            if (r6 != 0) goto L34
            goto L84
        L34:
            java.lang.Object r7 = r6.f4399     // Catch: java.lang.Throwable -> L6f
            r4[r5] = r7     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "quick_share_filter_application"
            java.util.concurrent.ConcurrentHashMap r10 = r10.f5693     // Catch: java.lang.Throwable -> L6f
            r10.put(r4, r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r10 = r3.f2078     // Catch: java.lang.Throwable -> L6f
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r10 = r1.concat(r10)     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.lv1.f6815     // Catch: java.lang.Throwable -> L6f
            boolean r10 = r1.add(r10)     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L75
            int r10 = r6.f4400     // Catch: java.lang.Throwable -> L6f
            int r1 = r6.f4401     // Catch: java.lang.Throwable -> L6f
            int r1 = r10 - r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            r3.append(r10)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r10 = " removed="
            r3.append(r10)     // Catch: java.lang.Throwable -> L6f
            r3.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            p000.C0888ux.m5975(r9, r10)     // Catch: java.lang.Throwable -> L6f
            goto L75
        L6f:
            r10 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r10)
        L75:
            java.lang.Throwable r10 = p000.fo1.m2190(r2)
            if (r10 == 0) goto L84
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "quick submit callback failed: "
            p000.AbstractC0602nx.m4143(r0, r10, r9)
        L84:
            return
        L85:
            r10.getClass()
            java.lang.Object[] r9 = r10.f5692
            ee0 r3 = (p000.ee0) r3
            int r0 = r3.f3520
            java.lang.Class r4 = r3.f3519
            java.lang.Object r10 = r10.f5691
            boolean r4 = r4.isInstance(r10)
            if (r4 != 0) goto L9a
            goto L148
        L9a:
            java.lang.ThreadLocal r4 = p000.cn1.f2218
            java.lang.Object r5 = r4.get()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto La9
            int r5 = r5.intValue()
            goto Laa
        La9:
            r5 = 0
        Laa:
            int r6 = r5 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.set(r6)
            r9.getClass()     // Catch: java.lang.Throwable -> L131
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r0, r9)     // Catch: java.lang.Throwable -> L131
            boolean r6 = r4 instanceof java.util.List     // Catch: java.lang.Throwable -> L131
            if (r6 == 0) goto Lc1
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L131
        Lc1:
            if (r1 != 0) goto Lc5
            goto L148
        Lc5:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L131
            int r6 = r1.size()     // Catch: java.lang.Throwable -> L131
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L131
            r4.addAll(r1)     // Catch: java.lang.Throwable -> L131
            java.util.concurrent.ConcurrentHashMap r6 = p000.vd0.f11239     // Catch: java.lang.Throwable -> L131
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L131
            r6.<init>()     // Catch: java.lang.Throwable -> L131
            java.util.Iterator r7 = r1.iterator()     // Catch: java.lang.Throwable -> L131
        Ldc:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L131
            if (r8 == 0) goto Lf0
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L131
            xd0 r8 = p000.vd0.m6192(r8)     // Catch: java.lang.Throwable -> L131
            if (r8 == 0) goto Ldc
            r6.add(r8)     // Catch: java.lang.Throwable -> L131
            goto Ldc
        Lf0:
            xc0 r7 = p000.xc0.f12128     // Catch: java.lang.Throwable -> L131
            r7.m6610(r6)     // Catch: java.lang.Throwable -> L131
            if (r5 != 0) goto L108
            boolean r5 = r3.f3521     // Catch: java.lang.Throwable -> L131
            if (r5 == 0) goto L108
            java.util.Map r5 = p000.cn1.f2215     // Catch: java.lang.Throwable -> L131
            r5.getClass()     // Catch: java.lang.Throwable -> L131
            bn1 r7 = new bn1     // Catch: java.lang.Throwable -> L131
            r7.<init>(r3, r4)     // Catch: java.lang.Throwable -> L131
            r5.put(r10, r7)     // Catch: java.lang.Throwable -> L131
        L108:
            be0 r4 = p000.be0.f1670     // Catch: java.lang.Throwable -> L131
            boolean r4 = r4.m939()     // Catch: java.lang.Throwable -> L131
            if (r4 == 0) goto L137
            java.util.ArrayList r4 = p000.vd0.m6180(r1)     // Catch: java.lang.Throwable -> L131
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L131
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L131
            r9[r0] = r5     // Catch: java.lang.Throwable -> L131
            cn1 r9 = p000.cn1.f2212     // Catch: java.lang.Throwable -> L131
            r10.getClass()     // Catch: java.lang.Throwable -> L131
            int r9 = r6.size()     // Catch: java.lang.Throwable -> L131
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L131
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L131
            int r0 = r0 - r4
            p000.cn1.m1275(r3, r10, r1, r9, r0)     // Catch: java.lang.Throwable -> L131
            goto L137
        L131:
            r9 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r9)
        L137:
            java.lang.Throwable r9 = p000.fo1.m2190(r2)
            if (r9 == 0) goto L148
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "relation submit callback failed: "
            java.lang.String r0 = "reae2c2e0c445b34d"
            p000.AbstractC0602nx.m4143(r10, r9, r0)
        L148:
            return
        L149:
            r10.getClass()
            java.lang.Object r9 = r10.f5691
            if (r9 != 0) goto L151
            goto L181
        L151:
            java.util.Map r0 = p000.C0118cm.f2207
            java.lang.Object r0 = r0.get(r9)
            nv0 r0 = (p000.nv0) r0
            if (r0 != 0) goto L15c
            goto L181
        L15c:
            java.util.Map r2 = p000.C0118cm.f2208
            java.lang.Object r9 = r2.get(r9)
            if (r9 != 0) goto L165
            goto L181
        L165:
            java.util.Set r2 = p000.C0118cm.f2205
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.ClassLoader r2 = r3.getClassLoader()
            if (r2 != 0) goto L176
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()
            r2.getClass()
        L176:
            java.lang.String r3 = "item"
            boolean r9 = p000.C0118cm.m1262(r0, r9, r2, r3)
            if (r9 == 0) goto L181
            r10.m3107(r1)
        L181:
            return
    }
}
