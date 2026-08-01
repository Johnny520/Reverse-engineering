package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ad1 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f191;

    public /* synthetic */ ad1(int r1) {
            r0 = this;
            r0.f191 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ad1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f191 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m63(p000.k01 r8) {
            r7 = this;
            r8.getClass()
            java.lang.Object[] r7 = r8.f5692     // Catch: java.lang.Throwable -> L47
            r7.getClass()     // Catch: java.lang.Throwable -> L47
            r8 = 0
            java.lang.Object r7 = p000.AbstractC0312g7.m2253(r8, r7)     // Catch: java.lang.Throwable -> L47
            if (r7 != 0) goto L10
            goto L46
        L10:
            ry1 r8 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L47
            java.lang.String r8 = "getConversationId"
            java.lang.Object r8 = p000.ry1.m5214(r7, r8)     // Catch: java.lang.Throwable -> L47
            boolean r0 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L1f
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L47
            goto L20
        L1f:
            r8 = 0
        L20:
            if (r8 != 0) goto L23
            goto L46
        L23:
            java.lang.String r0 = "getSender"
            r1 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r7 = p000.ry1.m5216(r0, r7, r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L47
            long r3 = r7.longValue()     // Catch: java.lang.Throwable -> L47
            java.util.concurrent.atomic.AtomicLong r7 = p000.ry1.f9619     // Catch: java.lang.Throwable -> L47
            long r5 = r7.get()     // Catch: java.lang.Throwable -> L47
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L46
            p000.ry1.m5238(r8)     // Catch: java.lang.Throwable -> L47
        L46:
            return
        L47:
            r7 = move-exception
            ry1 r8 = p000.ry1.f9602
            java.lang.String r8 = "自身消息追踪异常"
            p000.ry1.m5275(r8, r7)
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f191
            java.lang.String r3 = "precise_time_enabled"
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            switch(r2) {
                case 2: goto L98a;
                case 3: goto L95f;
                case 4: goto L933;
                case 5: goto L92a;
                case 6: goto L13;
                case 7: goto L835;
                case 8: goto L7d8;
                case 9: goto L44a;
                case 10: goto L3e9;
                case 11: goto L387;
                case 12: goto L372;
                case 13: goto L355;
                case 14: goto L338;
                case 15: goto L2e8;
                case 16: goto L2dc;
                case 17: goto L299;
                case 18: goto L147;
                case 19: goto L11c;
                case 20: goto Lfa;
                case 21: goto Le5;
                case 22: goto Ld0;
                case 23: goto L13;
                case 24: goto L85;
                case 25: goto L70;
                case 26: goto L13;
                case 27: goto L60;
                case 28: goto L1b;
                case 29: goto L17;
                default: goto L13;
            }
        L13:
            super.afterHookedMethod(r20)
            return
        L17:
            r19.m63(r20)
            return
        L1b:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            java.util.concurrent.atomic.AtomicReference r1 = p000.ry1.f9625
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L29
            goto L5f
        L29:
            ry1 r2 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L57
            r0.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "getContent"
            java.lang.Object r3 = p000.ry1.m5214(r0, r3)     // Catch: java.lang.Throwable -> L57
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L3b
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L57
        L3b:
            if (r12 == 0) goto L5f
            java.lang.String r3 = "\"text\""
            boolean r3 = p000.q02.m4654(r12, r3, r11)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L5f
            java.lang.Object r0 = p000.ry1.m5218(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L5f
            r1.set(r0)     // Catch: java.lang.Throwable -> L57
            r2.m5301()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "已从 Message#setConversationId 捕获消息模板"
            p000.ry1.m5274(r0)     // Catch: java.lang.Throwable -> L57
            goto L5f
        L57:
            r0 = move-exception
            ry1 r1 = p000.ry1.f9602
            java.lang.String r1 = "消息模板捕获异常"
            p000.ry1.m5275(r1, r0)
        L5f:
            return
        L60:
            r1.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9578
            java.lang.Object r1 = r1.f5691
            r0.set(r1)
            ry1 r0 = p000.ry1.f9602
            p000.ry1.m5217(r1)
            return
        L70:
            r1.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9578
            java.lang.Object r1 = r1.f5691
            r0.set(r1)
            ry1 r0 = p000.ry1.f9602
            p000.ry1.m5217(r1)
            java.lang.String r0 = "已从 IMSdkContext.init 捕获实例"
            p000.ry1.m5276(r0)
            return
        L85:
            r1.getClass()
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m939()
            if (r0 != 0) goto L91
            goto Lcf
        L91:
            java.lang.Object r0 = r1.f5694     // Catch: java.lang.Throwable -> Lb7
            boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto L9a
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lb7
            goto L9b
        L9a:
            r0 = r12
        L9b:
            if (r0 != 0) goto L9e
            goto Lcf
        L9e:
            td0 r0 = p000.vd0.m6178(r0)     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r2 = r0.f10321     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.f10322     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La9
            r12 = r2
        La9:
            if (r12 != 0) goto Lac
            goto Lcf
        Lac:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lb7
            r1.m3107(r0)     // Catch: java.lang.Throwable -> Lb7
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lb7
            goto Lbe
        Lb7:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lbe:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Lcf
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "share search callback failed: "
            java.lang.String r2 = "rac25e39d95f0abcc"
            p000.AbstractC0602nx.m4143(r1, r0, r2)
        Lcf:
            return
        Ld0:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Ldc
            r12 = r0
            android.view.View r12 = (android.view.View) r12
        Ldc:
            if (r12 != 0) goto Ldf
            goto Le4
        Ldf:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qr1.f9091
            p000.qr1.m4943(r12)
        Le4:
            return
        Le5:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lf1
            r12 = r0
            android.view.View r12 = (android.view.View) r12
        Lf1:
            if (r12 != 0) goto Lf4
            goto Lf9
        Lf4:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qr1.f9091
            p000.qr1.m4943(r12)
        Lf9:
            return
        Lfa:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L106
            r12 = r0
            android.view.View r12 = (android.view.View) r12
        L106:
            if (r12 != 0) goto L109
            goto L11b
        L109:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qr1.f9091
            java.util.Set r0 = p000.qr1.f9092
            r0.add(r12)
            p000.qr1.m4943(r12)
            jb r0 = new jb     // Catch: java.lang.Throwable -> L11b
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L11b
            r12.post(r0)     // Catch: java.lang.Throwable -> L11b
        L11b:
            return
        L11c:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L128
            android.view.View r0 = (android.view.View) r0
            goto L129
        L128:
            r0 = r12
        L129:
            if (r0 != 0) goto L12c
            goto L146
        L12c:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.pr1.f8671
            boolean r1 = r0 instanceof android.widget.ProgressBar     // Catch: java.lang.Throwable -> L146
            if (r1 == 0) goto L135
            r12 = r0
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12     // Catch: java.lang.Throwable -> L146
        L135:
            if (r12 != 0) goto L138
            goto L146
        L138:
            or1 r1 = p000.pr1.m4575(r0, r12)     // Catch: java.lang.Throwable -> L146
            if (r1 != 0) goto L13f
            goto L146
        L13f:
            java.util.Map r2 = p000.pr1.f8673     // Catch: java.lang.Throwable -> L146
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L146
            p000.pr1.f8675 = r1     // Catch: java.lang.Throwable -> L146
        L146:
            return
        L147:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L153
            android.view.View r0 = (android.view.View) r0
            goto L154
        L153:
            r0 = r12
        L154:
            if (r0 != 0) goto L158
            goto L298
        L158:
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r11, r1)
            boolean r2 = r1 instanceof android.graphics.Canvas
            if (r2 == 0) goto L168
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1
            goto L169
        L168:
            r1 = r12
        L169:
            if (r1 != 0) goto L16d
            goto L298
        L16d:
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.pr1.f8671
            boolean r2 = p000.ui1.m5867()
            if (r2 == 0) goto L298
            java.lang.String r2 = "seekbar_time_enabled"
            boolean r2 = p000.ui1.m5887(r2, r11)
            if (r2 == 0) goto L298
            boolean r2 = r0.isShown()     // Catch: java.lang.Throwable -> L298
            if (r2 != 0) goto L185
            goto L298
        L185:
            float r2 = r0.getAlpha()     // Catch: java.lang.Throwable -> L298
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L18f
            goto L298
        L18f:
            int r2 = r0.getWidth()     // Catch: java.lang.Throwable -> L298
            if (r2 <= 0) goto L298
            int r2 = r0.getHeight()     // Catch: java.lang.Throwable -> L298
            if (r2 > 0) goto L19d
            goto L298
        L19d:
            boolean r2 = r0 instanceof android.widget.ProgressBar     // Catch: java.lang.Throwable -> L298
            if (r2 == 0) goto L1a4
            r12 = r0
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12     // Catch: java.lang.Throwable -> L298
        L1a4:
            if (r12 != 0) goto L1a8
            goto L298
        L1a8:
            or1 r2 = p000.pr1.m4575(r0, r12)     // Catch: java.lang.Throwable -> L298
            if (r2 != 0) goto L1b0
            goto L298
        L1b0:
            java.util.Map r3 = p000.pr1.f8673     // Catch: java.lang.Throwable -> L298
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L298
            p000.pr1.f8675 = r2     // Catch: java.lang.Throwable -> L298
            nr1 r3 = p000.pr1.m4581(r0)     // Catch: java.lang.Throwable -> L298
            android.graphics.Paint r3 = r3.f7711     // Catch: java.lang.Throwable -> L298
            android.graphics.Paint$FontMetrics r4 = r3.getFontMetrics()     // Catch: java.lang.Throwable -> L298
            android.graphics.drawable.Drawable r5 = r12.getProgressDrawable()     // Catch: java.lang.Throwable -> L298
            android.graphics.Rect r5 = p000.pr1.m4585(r5)     // Catch: java.lang.Throwable -> L298
            if (r5 == 0) goto L1d6
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L298
            int r8 = r8.getPaddingLeft()     // Catch: java.lang.Throwable -> L298
            int r9 = r5.left     // Catch: java.lang.Throwable -> L298
            int r8 = r8 + r9
            goto L1dd
        L1d6:
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L298
            int r8 = r8.getPaddingLeft()     // Catch: java.lang.Throwable -> L298
        L1dd:
            if (r8 >= 0) goto L1e0
            goto L1e1
        L1e0:
            r11 = r8
        L1e1:
            if (r5 == 0) goto L1f0
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L298
            int r8 = r8.getPaddingTop()     // Catch: java.lang.Throwable -> L298
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L298
            int r5 = r5.bottom     // Catch: java.lang.Throwable -> L298
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L298
            float r8 = r8 + r5
            goto L1fb
        L1f0:
            r5 = r0
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5     // Catch: java.lang.Throwable -> L298
            int r5 = r5.getHeight()     // Catch: java.lang.Throwable -> L298
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L298
            r8 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r5
        L1fb:
            r5 = r0
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5     // Catch: java.lang.Throwable -> L298
            int r5 = r5.getHeight()     // Catch: java.lang.Throwable -> L298
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L298
            float r5 = p000.j81.m2905(r8, r7, r5)     // Catch: java.lang.Throwable -> L298
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L298
            android.content.Context r8 = r8.getContext()     // Catch: java.lang.Throwable -> L298
            r8.getClass()     // Catch: java.lang.Throwable -> L298
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L298
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch: java.lang.Throwable -> L298
            r9 = 1067030938(0x3f99999a, float:1.2)
            float r8 = android.util.TypedValue.applyDimension(r10, r9, r8)     // Catch: java.lang.Throwable -> L298
            float r5 = r5 + r8
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L298
            int r8 = r8.getHeight()     // Catch: java.lang.Throwable -> L298
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L298
            float r5 = p000.j81.m2905(r5, r7, r8)     // Catch: java.lang.Throwable -> L298
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L298
            int r8 = r8.getHeight()     // Catch: java.lang.Throwable -> L298
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L298
            r9 = r0
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9     // Catch: java.lang.Throwable -> L298
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Throwable -> L298
            r9.getClass()     // Catch: java.lang.Throwable -> L298
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> L298
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()     // Catch: java.lang.Throwable -> L298
            float r6 = android.util.TypedValue.applyDimension(r10, r6, r9)     // Catch: java.lang.Throwable -> L298
            float r8 = r8 - r6
            int r6 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r6 >= 0) goto L251
            r8 = r7
        L251:
            int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r6 > 0) goto L256
            goto L298
        L256:
            float r6 = r4.ascent     // Catch: java.lang.Throwable -> L298
            float r6 = r5 - r6
            float r4 = r4.descent     // Catch: java.lang.Throwable -> L298
            float r8 = r8 - r4
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 <= 0) goto L262
            r6 = r8
        L262:
            float r4 = r4 + r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L268
            goto L298
        L268:
            float r4 = (float) r11     // Catch: java.lang.Throwable -> L298
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L298
            int r8 = r8.getWidth()     // Catch: java.lang.Throwable -> L298
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L298
            float r4 = p000.j81.m2905(r4, r7, r8)     // Catch: java.lang.Throwable -> L298
            r1.save()     // Catch: java.lang.Throwable -> L298
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8     // Catch: java.lang.Throwable -> L293
            int r8 = r8.getWidth()     // Catch: java.lang.Throwable -> L293
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L293
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0     // Catch: java.lang.Throwable -> L293
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L293
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L293
            r1.clipRect(r7, r5, r8, r0)     // Catch: java.lang.Throwable -> L293
            java.lang.String r0 = r2.f8186     // Catch: java.lang.Throwable -> L293
            r1.drawText(r0, r4, r6, r3)     // Catch: java.lang.Throwable -> L293
            r1.restore()     // Catch: java.lang.Throwable -> L298
            goto L298
        L293:
            r0 = move-exception
            r1.restore()     // Catch: java.lang.Throwable -> L298
            throw r0     // Catch: java.lang.Throwable -> L298
        L298:
            return
        L299:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            if (r0 != 0) goto L2a1
            goto L2db
        L2a1:
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r11, r1)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L2b1
            java.lang.Number r1 = (java.lang.Number) r1
            goto L2b2
        L2b1:
            r1 = r12
        L2b2:
            if (r1 == 0) goto L2db
            float r1 = r1.floatValue()
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            float r1 = java.lang.Math.abs(r1)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L2c8
            r12 = r2
        L2c8:
            if (r12 == 0) goto L2db
            float r1 = r12.floatValue()
            float r1 = p000.j81.m2905(r1, r7, r6)
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.pr1.f8671
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            p000.pr1.m4574(r0, r1)
        L2db:
            return
        L2dc:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            if (r0 != 0) goto L2e4
            goto L2e7
        L2e4:
            p000.pr1.m4574(r0, r12)
        L2e7:
            return
        L2e8:
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r0 = p000.vd0.f11239     // Catch: java.lang.Throwable -> L31f
            java.lang.Object[] r0 = r1.f5692     // Catch: java.lang.Throwable -> L31f
            r0.getClass()     // Catch: java.lang.Throwable -> L31f
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r11, r0)     // Catch: java.lang.Throwable -> L31f
            xd0 r0 = p000.vd0.m6192(r0)     // Catch: java.lang.Throwable -> L31f
            if (r0 != 0) goto L2fd
            goto L337
        L2fd:
            xc0 r2 = p000.xc0.f12128     // Catch: java.lang.Throwable -> L31f
            java.util.List r3 = p000.AbstractC1021yh.m6896(r0)     // Catch: java.lang.Throwable -> L31f
            r2.m6610(r3)     // Catch: java.lang.Throwable -> L31f
            cn1 r2 = p000.cn1.f2212     // Catch: java.lang.Throwable -> L31f
            java.lang.Object r1 = r1.f5691     // Catch: java.lang.Throwable -> L31f
            r1.getClass()     // Catch: java.lang.Throwable -> L31f
            android.widget.ImageView r1 = p000.cn1.m1274(r1)     // Catch: java.lang.Throwable -> L31f
            if (r1 != 0) goto L314
            goto L337
        L314:
            ζ r2 = new ζ     // Catch: java.lang.Throwable -> L31f
            r2.<init>(r1, r9, r0)     // Catch: java.lang.Throwable -> L31f
            r1.setOnLongClickListener(r2)     // Catch: java.lang.Throwable -> L31f
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L31f
            goto L326
        L31f:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L326:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L337
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "more button bind callback failed: "
            java.lang.String r2 = "reae2c2e0c445b34d"
            p000.AbstractC0602nx.m4143(r1, r0, r2)
        L337:
            return
        L338:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L344
            r12 = r0
            android.view.View r12 = (android.view.View) r12
        L344:
            if (r12 != 0) goto L347
            goto L354
        L347:
            dk1 r0 = p000.dk1.f3201
            boolean r0 = p000.dk1.m1766(r12)
            if (r0 == 0) goto L354
            java.lang.String r0 = "onAttachedToWindow"
            p000.dk1.m1755(r12, r0)
        L354:
            return
        L355:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L361
            r12 = r0
            android.view.View r12 = (android.view.View) r12
        L361:
            if (r12 != 0) goto L364
            goto L371
        L364:
            dk1 r0 = p000.dk1.f3201
            boolean r0 = p000.dk1.m1766(r12)
            if (r0 == 0) goto L371
            java.lang.String r0 = "setOnClickListener"
            p000.dk1.m1755(r12, r0)
        L371:
            return
        L372:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L37e
            r12 = r0
            android.view.View r12 = (android.view.View) r12
        L37e:
            if (r12 != 0) goto L381
            goto L386
        L381:
            java.lang.String r0 = "constructor"
            p000.dk1.m1755(r12, r0)
        L386:
            return
        L387:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()     // Catch: java.lang.Throwable -> L3c2
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r11, r0)     // Catch: java.lang.Throwable -> L3c2
            boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L3c2
            if (r3 == 0) goto L39a
            r12 = r2
            android.view.View r12 = (android.view.View) r12     // Catch: java.lang.Throwable -> L3c2
        L39a:
            if (r12 != 0) goto L39d
            goto L3bf
        L39d:
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r10, r0)     // Catch: java.lang.Throwable -> L3c2
            java.util.concurrent.ConcurrentHashMap r2 = p000.uj1.f10859     // Catch: java.lang.Throwable -> L3c2
            java.lang.Object r1 = r1.f5691     // Catch: java.lang.Throwable -> L3c2
            r1.getClass()     // Catch: java.lang.Throwable -> L3c2
            android.view.View r1 = p000.uj1.m5912(r12, r1)     // Catch: java.lang.Throwable -> L3c2
            if (r1 != 0) goto L3b6
            java.lang.String r0 = "search_container"
            java.lang.String r1 = "搜索框容器未识别，保留宿主透明度"
            p000.qj1.m4888(r0, r1)     // Catch: java.lang.Throwable -> L3c2
            goto L3bf
        L3b6:
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.nj1.f7649     // Catch: java.lang.Throwable -> L3c2
            boolean r0 = p000.uj1.m5908(r0)     // Catch: java.lang.Throwable -> L3c2
            p000.nj1.m4070(r1, r0)     // Catch: java.lang.Throwable -> L3c2
        L3bf:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3c2
            goto L3c9
        L3c2:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L3c9:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L3e8
            qj1 r1 = p000.qj1.f9022
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "search_after 回调已降级: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "callback_search_after"
            p000.qj1.m4888(r1, r0)
        L3e8:
            return
        L3e9:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            java.lang.Object[] r1 = r1.f5692     // Catch: java.lang.Throwable -> L423
            r1.getClass()     // Catch: java.lang.Throwable -> L423
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r11, r1)     // Catch: java.lang.Throwable -> L423
            boolean r2 = r1 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L423
            if (r2 == 0) goto L3fe
            r12 = r1
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Throwable -> L423
        L3fe:
            if (r12 == 0) goto L420
            float r1 = r12.floatValue()     // Catch: java.lang.Throwable -> L423
            java.util.concurrent.ConcurrentHashMap r2 = p000.uj1.f10859     // Catch: java.lang.Throwable -> L423
            r0.getClass()     // Catch: java.lang.Throwable -> L423
            android.view.View r2 = p000.uj1.m5911(r0)     // Catch: java.lang.Throwable -> L423
            if (r2 != 0) goto L410
            goto L420
        L410:
            java.lang.Object r0 = p000.uj1.m5909(r0)     // Catch: java.lang.Throwable -> L423
            if (r0 != 0) goto L417
            goto L420
        L417:
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.nj1.f7649     // Catch: java.lang.Throwable -> L423
            boolean r0 = p000.uj1.m5908(r0)     // Catch: java.lang.Throwable -> L423
            p000.nj1.m4072(r2, r0, r1)     // Catch: java.lang.Throwable -> L423
        L420:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L423
            goto L42a
        L423:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L42a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L449
            qj1 r1 = p000.qj1.f9022
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "comment_alpha_after 回调已降级: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "callback_comment_alpha_after"
            p000.qj1.m4888(r1, r0)
        L449:
            return
        L44a:
            r1.getClass()
            mi1 r0 = p000.mi1.f7162
            java.lang.Object r0 = r1.f5691
            java.lang.Object r2 = r1.f5694
            boolean r3 = p000.ui1.m5887(r3, r11)
            if (r3 != 0) goto L45b
            goto L7d2
        L45b:
            if (r0 == 0) goto L7d2
            if (r2 != 0) goto L461
            goto L7d2
        L461:
            java.util.concurrent.ConcurrentHashMap r3 = p000.mi1.f7169
            java.lang.Class r6 = r0.getClass()
            java.lang.Object r7 = r3.get(r6)
            if (r7 != 0) goto L4f6
            java.lang.Class r7 = r0.getClass()
            java.util.ArrayList r7 = p000.mi1.m3830(r7)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r7 = r7.iterator()
        L47e:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L499
            java.lang.Object r14 = r7.next()
            r15 = r14
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            int r15 = r15.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 != 0) goto L47e
            r13.add(r14)
            goto L47e
        L499:
            java.util.Iterator r7 = r13.iterator()
        L49d:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L4d9
            java.lang.Object r13 = r7.next()
            r14 = r13
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.Class r15 = r14.getType()
            java.lang.String r15 = r15.getName()
            java.lang.String r16 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"
            r17 = 0
            java.lang.String r4 = p000.jf0.m2957(r16)
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L4dc
            java.lang.String r4 = r14.getName()
            java.lang.String r5 = "LJII"
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L4dc
            java.lang.String r4 = r14.getName()
            java.lang.String r5 = "comment"
            boolean r4 = p000.x02.m6480(r4, r5)
            if (r4 == 0) goto L49d
            goto L4dc
        L4d9:
            r17 = 0
            r13 = r12
        L4dc:
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            if (r13 == 0) goto L4eb
            r13.setAccessible(r10)
            java.lang.Object r4 = p000.C0666ox.f8297
            kx r4 = p000.EnumC0491kx.f6221
            p000.C0666ox.m4326(r4, r13)
            goto L4ec
        L4eb:
            r13 = r12
        L4ec:
            java.lang.Object r3 = r3.putIfAbsent(r6, r13)
            if (r3 != 0) goto L4f4
            r7 = r13
            goto L4f8
        L4f4:
            r7 = r3
            goto L4f8
        L4f6:
            r17 = 0
        L4f8:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r7 == 0) goto L508
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Throwable -> L501
            goto L509
        L501:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            goto L50a
        L508:
            r0 = r12
        L509:
            r3 = r0
        L50a:
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto L50f
            r3 = r12
        L50f:
            if (r3 != 0) goto L513
            goto L7d2
        L513:
            java.lang.Long r4 = java.lang.Long.valueOf(r17)
            java.util.concurrent.ConcurrentHashMap r0 = p000.mi1.f7170
            java.lang.Class r5 = r3.getClass()
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r7 = "getCreateTime"
            if (r6 != 0) goto L5e1
            java.lang.Class r6 = r3.getClass()
            java.util.ArrayList r6 = p000.mi1.m3831(r6)
            java.util.Iterator r6 = r6.iterator()
        L531:
            boolean r13 = r6.hasNext()
            java.lang.Class r14 = java.lang.Long.TYPE
            if (r13 == 0) goto L57f
            java.lang.Object r13 = r6.next()
            r15 = r13
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r16 = r15.getModifiers()
            boolean r16 = java.lang.reflect.Modifier.isStatic(r16)
            if (r16 != 0) goto L57a
            r16 = r9
            java.lang.Class[] r9 = r15.getParameterTypes()
            r9.getClass()
            int r9 = r9.length
            if (r9 != 0) goto L57c
            java.lang.Class r9 = r15.getReturnType()
            boolean r9 = p000.ln0.m3626(r9, r14)
            if (r9 == 0) goto L57c
            java.lang.String r9 = r15.getName()
            boolean r9 = p000.ln0.m3626(r9, r7)
            if (r9 != 0) goto L582
            java.lang.String r9 = r15.getName()
            r9.getClass()
            java.lang.String r15 = "CreateTime"
            boolean r9 = p000.q02.m4654(r9, r15, r11)
            if (r9 == 0) goto L57c
            goto L582
        L57a:
            r16 = r9
        L57c:
            r9 = r16
            goto L531
        L57f:
            r16 = r9
            r13 = r12
        L582:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L58a
            r13.setAccessible(r10)
            goto L5d7
        L58a:
            java.lang.Class r6 = r3.getClass()
            java.util.ArrayList r6 = p000.mi1.m3831(r6)
            java.util.Iterator r6 = r6.iterator()
        L596:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L5cc
            java.lang.Object r9 = r6.next()
            r13 = r9
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            int r15 = r13.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 != 0) goto L596
            java.lang.Class[] r15 = r13.getParameterTypes()
            r15.getClass()
            int r15 = r15.length
            if (r15 != 0) goto L596
            java.lang.Class r15 = r13.getReturnType()
            boolean r15 = p000.ln0.m3626(r15, r14)
            if (r15 == 0) goto L596
            java.lang.String r13 = r13.getName()
            boolean r13 = p000.ln0.m3626(r13, r7)
            if (r13 == 0) goto L596
            goto L5cd
        L5cc:
            r9 = r12
        L5cd:
            r13 = r9
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L5d6
            r13.setAccessible(r10)
            goto L5d7
        L5d6:
            r13 = r12
        L5d7:
            java.lang.Object r0 = r0.putIfAbsent(r5, r13)
            if (r0 != 0) goto L5df
            r6 = r13
            goto L5e3
        L5df:
            r6 = r0
            goto L5e3
        L5e1:
            r16 = r9
        L5e3:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L616
            java.lang.Object r0 = r6.invoke(r3, r12)     // Catch: java.lang.Throwable -> L5f2
            boolean r3 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L5f2
            if (r3 == 0) goto L5f4
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L5f2
            goto L5f5
        L5f2:
            r0 = move-exception
            goto L603
        L5f4:
            r0 = r12
        L5f5:
            if (r0 == 0) goto L5fc
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L5f2
            goto L5fe
        L5fc:
            r5 = r17
        L5fe:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5f2
            goto L609
        L603:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L609:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L60e
            goto L60f
        L60e:
            r4 = r0
        L60f:
            java.lang.Number r4 = (java.lang.Number) r4
            long r3 = r4.longValue()
            goto L646
        L616:
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L623
            java.lang.Object r0 = p000.qe0.m4869(r3, r7, r0)     // Catch: java.lang.Throwable -> L623
            boolean r3 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L623
            if (r3 == 0) goto L625
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L623
            goto L626
        L623:
            r0 = move-exception
            goto L634
        L625:
            r0 = r12
        L626:
            if (r0 == 0) goto L62d
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L623
            goto L62f
        L62d:
            r5 = r17
        L62f:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L623
            goto L63a
        L634:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L63a:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L63f
            goto L640
        L63f:
            r4 = r0
        L640:
            java.lang.Number r4 = (java.lang.Number) r4
            long r3 = r4.longValue()
        L646:
            long r3 = p000.mi1.m3835(r3)
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 > 0) goto L650
            goto L7d2
        L650:
            java.lang.String r3 = p000.mi1.m3832(r3)
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L65c
            goto L7d2
        L65c:
            java.lang.Class r0 = r2.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = p000.mi1.f7168
            java.lang.Object r5 = r4.get(r0)
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 != 0) goto L6a7
            java.util.ArrayList r5 = p000.mi1.m3830(r0)
            java.util.Iterator r5 = r5.iterator()
        L672:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L694
            java.lang.Object r7 = r5.next()
            r9 = r7
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            int r13 = r9.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 != 0) goto L672
            java.lang.Class r9 = r9.getType()
            boolean r9 = p000.ln0.m3626(r9, r6)
            if (r9 == 0) goto L672
            goto L695
        L694:
            r7 = r12
        L695:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r7 == 0) goto L69d
            r7.setAccessible(r10)
            goto L69e
        L69d:
            r7 = r12
        L69e:
            java.lang.Object r0 = r4.putIfAbsent(r0, r7)
            if (r0 != 0) goto L6a6
            r5 = r7
            goto L6a7
        L6a6:
            r5 = r0
        L6a7:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 != 0) goto L6ad
            goto L7d2
        L6ad:
            java.lang.Object r0 = r5.get(r2)     // Catch: java.lang.Throwable -> L6b8
            boolean r4 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6b8
            if (r4 == 0) goto L6ba
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L6b8
            goto L6c2
        L6b8:
            r0 = move-exception
            goto L6bc
        L6ba:
            r0 = r12
            goto L6c2
        L6bc:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L6c2:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L6c7
            r0 = r12
        L6c7:
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto L6d1
            goto L7d2
        L6d1:
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Constructor[] r4 = r0.getDeclaredConstructors()
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r4.length
            r9 = r11
        L6e3:
            if (r9 >= r7) goto L6f2
            r13 = r4[r9]
            if (r13 != 0) goto L6ea
            r13 = r12
        L6ea:
            if (r13 == 0) goto L6ef
            r5.add(r13)
        L6ef:
            int r9 = r9 + 1
            goto L6e3
        L6f2:
            java.util.Iterator r4 = r5.iterator()
        L6f6:
            boolean r5 = r4.hasNext()
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r5 == 0) goto L725
            java.lang.Object r5 = r4.next()
            r9 = r5
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            java.lang.Class[] r9 = r9.getParameterTypes()
            int r13 = r9.length
            if (r13 != r8) goto L6f6
            r13 = r9[r11]
            boolean r13 = p000.ln0.m3626(r13, r6)
            if (r13 == 0) goto L6f6
            r13 = r9[r10]
            boolean r13 = p000.ln0.m3626(r13, r7)
            if (r13 == 0) goto L6f6
            r9 = r9[r16]
            boolean r9 = p000.ln0.m3626(r9, r7)
            if (r9 == 0) goto L6f6
            goto L726
        L725:
            r5 = r12
        L726:
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            if (r5 != 0) goto L72c
            goto L7d2
        L72c:
            java.util.ArrayList r0 = p000.mi1.m3830(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L739:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L75e
            java.lang.Object r6 = r0.next()
            r8 = r6
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 != 0) goto L739
            java.lang.Class r8 = r8.getType()
            boolean r8 = p000.ln0.m3626(r8, r7)
            if (r8 == 0) goto L739
            r4.add(r6)
            goto L739
        L75e:
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r11, r4)     // Catch: java.lang.Throwable -> L76f
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L76f
            if (r0 == 0) goto L771
            int r0 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L76f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L76f
            goto L779
        L76f:
            r0 = move-exception
            goto L773
        L771:
            r0 = r12
            goto L779
        L773:
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L779:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L77e
            r0 = r12
        L77e:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L788
            int r0 = r0.intValue()
            r6 = r0
            goto L789
        L788:
            r6 = r11
        L789:
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r10, r4)     // Catch: java.lang.Throwable -> L79a
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L79a
            if (r0 == 0) goto L79c
            int r0 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L79a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L79a
            goto L7a4
        L79a:
            r0 = move-exception
            goto L79e
        L79c:
            r0 = r12
            goto L7a4
        L79e:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L7a4:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L7a9
            r0 = r12
        L7a9:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L7b1
            int r11 = r0.intValue()
        L7b1:
            r5.setAccessible(r10)     // Catch: java.lang.Throwable -> L7c5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L7c5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L7c5
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0, r2}     // Catch: java.lang.Throwable -> L7c5
            java.lang.Object r0 = r5.newInstance(r0)     // Catch: java.lang.Throwable -> L7c5
            goto L7cc
        L7c5:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L7cc:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L7d1
            goto L7d2
        L7d1:
            r12 = r0
        L7d2:
            if (r12 == 0) goto L7d7
            r1.m3107(r12)
        L7d7:
            return
        L7d8:
            r16 = r9
            r17 = 0
            r1.getClass()
            boolean r0 = p000.ui1.m5887(r3, r11)
            if (r0 == 0) goto L834
            java.lang.Throwable r0 = r1.f5695
            if (r0 == 0) goto L7eb
            r0 = r10
            goto L7ec
        L7eb:
            r0 = r11
        L7ec:
            java.lang.Object[] r2 = r1.f5692
            if (r0 == 0) goto L7f1
            goto L834
        L7f1:
            int r0 = r2.length
            if (r0 >= r8) goto L7f5
            goto L834
        L7f5:
            r0 = r2[r11]
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto L7fe
            r12 = r0
            java.lang.Number r12 = (java.lang.Number) r12
        L7fe:
            if (r12 == 0) goto L834
            long r3 = r12.longValue()
            long r3 = p000.mi1.m3835(r3)
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 > 0) goto L80d
            goto L834
        L80d:
            r0 = r2[r10]
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L834
            r0 = r2[r16]
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 != 0) goto L81a
            goto L834
        L81a:
            java.lang.String r0 = p000.mi1.m3832(r3)
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto L825
            goto L834
        L825:
            java.lang.Object r2 = r1.f5694
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L834
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L834
            r1.m3107(r0)
        L834:
            return
        L835:
            r16 = r9
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0 = r0[r11]
            boolean r1 = r0 instanceof android.content.Context
            if (r1 == 0) goto L845
            r12 = r0
            android.content.Context r12 = (android.content.Context) r12
        L845:
            if (r12 != 0) goto L849
            goto L929
        L849:
            p000.ui1.m5896(r12)     // Catch: java.lang.Throwable -> L84f
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L84f
            goto L856
        L84f:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L856:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L86f
            sh1 r1 = p000.sh1.f9903
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PrefsManager.init failed: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.sh1.m5510(r0)
        L86f:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.s00.f9638
            java.lang.ClassLoader r0 = r12.getClassLoader()
            r0.getClass()
            rz r1 = p000.r00.f9189
            r1.getClass()
            τ r2 = new τ
            r2.<init>(r1)
        L882:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L892
            java.lang.Object r1 = r2.next()
            r00 r1 = (p000.r00) r1
            p000.s00.m5315(r1, r0, r11)
            goto L882
        L892:
            x00 r0 = p000.x00.f11959
            java.lang.ClassLoader r1 = r12.getClassLoader()
            r1.getClass()
            r0.m6471(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0825t7.f10214
            ny0 r1 = new ny0
            sh1 r3 = p000.sh1.f9903
            r7 = 0
            r8 = 18
            r2 = 1
            java.lang.Class<sh1> r4 = p000.sh1.class
            java.lang.String r5 = "onNonVideoTimerElapsed"
            java.lang.String r6 = "onNonVideoTimerElapsed(Lcom/example/dyhelper/hook/feed/autoscroll/AutoScrollCoordinator$Trigger;)Lcom/example/dyhelper/hook/feed/autoscroll/AutoScrollCoordinator$TriggerResult;"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            p000.AbstractC0825t7.f10217 = r1
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0825t7.f10214
            boolean r0 = r0.compareAndSet(r11, r10)
            if (r0 != 0) goto L8bc
            goto L8d9
        L8bc:
            pq r0 = p000.C0696pq.f8651
            n7 r0 = p000.AbstractC0825t7.f10221
            r0.getClass()
            java.util.concurrent.CopyOnWriteArraySet r1 = p000.C0696pq.f8660
            r1.add(r0)
            java.lang.Object r0 = p000.ui1.f10844
            n7 r0 = p000.AbstractC0825t7.f10222
            p000.ui1.m5882(r0)
            o7 r0 = new o7
            r1 = r16
            r0.<init>(r1)
            p000.AbstractC0825t7.m5612(r0)
        L8d9:
            java.lang.ClassLoader r0 = r12.getClassLoader()
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.sh1.f9907
            boolean r1 = r1.compareAndSet(r11, r10)
            if (r1 != 0) goto L8e9
            goto L929
        L8e9:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.sh1.f9908
            boolean r1 = r1.compareAndSet(r11, r10)
            if (r1 != 0) goto L8f2
            goto L90c
        L8f2:
            java.util.List r1 = p000.uh1.m5864(r0)
            java.util.Iterator r1 = r1.iterator()
        L8fa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L90c
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            sh1 r3 = p000.sh1.f9903
            r3.m5519(r2)
            goto L8fa
        L90c:
            java.util.List r1 = p000.uh1.m5865(r0)
            p000.sh1.m5505(r0, r1)
            java.lang.Thread r1 = new java.lang.Thread
            oj r2 = new oj
            r3 = 7
            r2.<init>(r0, r3)
            r1.<init>(r2)
            java.lang.String r0 = "rff9863a9a12f7ffb"
            r1.setName(r0)
            r1.setDaemon(r10)
            r1.start()
        L929:
            return
        L92a:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            p000.sh1.m5502(r0)
            return
        L933:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0 = r0[r11]
            boolean r1 = r0 instanceof android.view.MotionEvent
            if (r1 == 0) goto L941
            r12 = r0
            android.view.MotionEvent r12 = (android.view.MotionEvent) r12
        L941:
            if (r12 != 0) goto L944
            goto L95e
        L944:
            boolean r0 = p000.sh1.f9913
            if (r0 == 0) goto L949
            goto L95e
        L949:
            int r0 = r12.getActionMasked()
            if (r0 == r10) goto L955
            int r0 = r12.getActionMasked()
            if (r0 != r8) goto L95e
        L955:
            o7 r0 = new o7
            r1 = 4
            r0.<init>(r1)
            p000.AbstractC0825t7.m5612(r0)
        L95e:
            return
        L95f:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L96b
            android.app.Activity r0 = (android.app.Activity) r0
            goto L96c
        L96b:
            r0 = r12
        L96c:
            if (r0 != 0) goto L96f
            goto L989
        L96f:
            java.lang.ref.WeakReference r1 = p000.sh1.f9912
            if (r1 == 0) goto L97a
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            goto L97b
        L97a:
            r1 = r12
        L97b:
            if (r1 != r0) goto L981
            sh1 r0 = p000.sh1.f9903
            p000.sh1.f9912 = r12
        L981:
            o7 r0 = new o7
            r0.<init>(r8)
            p000.AbstractC0825t7.m5612(r0)
        L989:
            return
        L98a:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L996
            r12 = r0
            android.app.Activity r12 = (android.app.Activity) r12
        L996:
            if (r12 != 0) goto L999
            goto L9af
        L999:
            sh1 r0 = p000.sh1.f9903
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r12)
            p000.sh1.f9912 = r0
            o7 r0 = new o7
            r0.<init>(r11)
            p000.AbstractC0825t7.m5612(r0)
            android.os.Handler r0 = p000.C0661os.f8210
            p000.C0661os.m4263(r12)
        L9af:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r4) {
            r3 = this;
            int r0 = r3.f191
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L191;
                case 1: goto L16c;
                case 4: goto L142;
                case 6: goto L12b;
                case 11: goto Lc5;
                case 21: goto L72;
                case 23: goto L5d;
                case 26: goto L47;
                case 29: goto Lb;
                default: goto L7;
            }
        L7:
            super.beforeHookedMethod(r4)
            return
        Lb:
            r4.getClass()
            java.util.concurrent.atomic.AtomicReference r3 = p000.ry1.f9624     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r3.get()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r4.f5691     // Catch: java.lang.Throwable -> L3e
            r3.set(r0)     // Catch: java.lang.Throwable -> L3e
        L1b:
            java.util.concurrent.atomic.AtomicReference r3 = p000.ry1.f9625     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r3.get()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L46
            java.lang.Object[] r4 = r4.f5692     // Catch: java.lang.Throwable -> L3e
            r4.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r1, r4)     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L2f
            goto L46
        L2f:
            ry1 r0 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = p000.ry1.m5218(r4)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L46
            r3.set(r4)     // Catch: java.lang.Throwable -> L3e
            r0.m5301()     // Catch: java.lang.Throwable -> L3e
            goto L46
        L3e:
            r3 = move-exception
            ry1 r4 = p000.ry1.f9602
            java.lang.String r4 = "发送入口 beforeHook 异常"
            p000.ry1.m5275(r4, r3)
        L46:
            return
        L47:
            r4.getClass()
            java.lang.Object r3 = r4.f5691
            java.util.concurrent.atomic.AtomicReference r4 = p000.ry1.f9578
            java.lang.Object r0 = r4.get()
            if (r0 != 0) goto L5c
            r4.set(r3)
            ry1 r4 = p000.ry1.f9602
            p000.ry1.m5217(r3)
        L5c:
            return
        L5d:
            r4.getClass()
            java.lang.Object r3 = r4.f5691
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L69
            r2 = r3
            android.view.View r2 = (android.view.View) r2
        L69:
            if (r2 != 0) goto L6c
            goto L71
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.qr1.f9091
            p000.qr1.m4943(r2)
        L71:
            return
        L72:
            r4.getClass()
            java.lang.Object[] r3 = r4.f5692
            java.lang.Object r4 = r4.f5691
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L80
            r2 = r4
            android.view.View r2 = (android.view.View) r2
        L80:
            if (r2 != 0) goto L83
            goto Lc4
        L83:
            java.util.Set r4 = p000.qr1.f9093
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L8c
            goto Lc4
        L8c:
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.qr1.f9091
            java.lang.String r4 = "default"
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L97
            goto La6
        L97:
            java.lang.String r0 = "seekbar_visibility_mode"
            java.lang.String r4 = p000.ui1.m5893(r0, r4)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
        La6:
            java.lang.String r0 = "show"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3[r1] = r4
            goto Lc4
        Lb5:
            java.lang.String r0 = "hide"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lc4
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
        Lc4:
            return
        Lc5:
            r4.getClass()
            java.lang.Object[] r3 = r4.f5692     // Catch: java.lang.Throwable -> L104
            r3.getClass()     // Catch: java.lang.Throwable -> L104
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r1, r3)     // Catch: java.lang.Throwable -> L104
            boolean r0 = r3 instanceof android.view.View     // Catch: java.lang.Throwable -> L104
            if (r0 == 0) goto Ld8
            r2 = r3
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L104
        Ld8:
            if (r2 != 0) goto Ldb
            goto Lfe
        Ldb:
            java.util.concurrent.ConcurrentHashMap r3 = p000.uj1.f10859     // Catch: java.lang.Throwable -> L104
            java.lang.Object r3 = r4.f5691     // Catch: java.lang.Throwable -> L104
            r3.getClass()     // Catch: java.lang.Throwable -> L104
            android.view.View r3 = p000.uj1.m5912(r2, r3)     // Catch: java.lang.Throwable -> L104
            if (r3 != 0) goto Le9
            goto Lfe
        Le9:
            java.lang.Object r4 = p000.nj1.f7650     // Catch: java.lang.Throwable -> L104
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L104
            java.util.WeakHashMap r0 = p000.nj1.f7651     // Catch: java.lang.Throwable -> L101
            java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L101
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L101
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L104
            if (r0 == 0) goto Lfe
            float r4 = r0.floatValue()     // Catch: java.lang.Throwable -> L104
            p000.nj1.m4077(r3, r4)     // Catch: java.lang.Throwable -> L104
        Lfe:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L104
            goto L10b
        L101:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L104
            throw r3     // Catch: java.lang.Throwable -> L104
        L104:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L10b:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L12a
            qj1 r4 = p000.qj1.f9022
            java.lang.String r4 = "callback_search_before"
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "search_before 回调已降级: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            p000.qj1.m4888(r4, r3)
        L12a:
            return
        L12b:
            r4.getClass()
            java.lang.Object r3 = r4.f5691
            if (r3 != 0) goto L133
            goto L141
        L133:
            java.lang.ref.WeakReference r4 = p000.sh1.f9917
            if (r4 == 0) goto L13b
            java.lang.Object r2 = r4.get()
        L13b:
            if (r2 != r3) goto L13e
            goto L141
        L13e:
            p000.sh1.m5502(r3)
        L141:
            return
        L142:
            r4.getClass()
            java.lang.Object[] r3 = r4.f5692
            r3 = r3[r1]
            boolean r4 = r3 instanceof android.view.MotionEvent
            if (r4 == 0) goto L150
            r2 = r3
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
        L150:
            if (r2 != 0) goto L153
            goto L16b
        L153:
            int r3 = r2.getActionMasked()
            if (r3 != 0) goto L16b
            boolean r3 = p000.sh1.f9913
            if (r3 != 0) goto L16b
            java.util.concurrent.atomic.AtomicInteger r3 = p000.sh1.f9909
            r3.incrementAndGet()
            o7 r3 = new o7
            r4 = 5
            r3.<init>(r4)
            p000.AbstractC0825t7.m5612(r3)
        L16b:
            return
        L16c:
            r4.getClass()
            java.util.Set r3 = p000.bd1.f1661     // Catch: java.lang.Throwable -> L17c
            java.lang.Object[] r3 = r4.f5692     // Catch: java.lang.Throwable -> L17c
            r3.getClass()     // Catch: java.lang.Throwable -> L17c
            p000.bd1.m912(r3)     // Catch: java.lang.Throwable -> L17c
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L17c
            goto L183
        L17c:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L183:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L190
            java.lang.String r4 = "rc2954fec18baf260"
            java.lang.String r0 = "观察世界会话上下文失败"
            p000.C0888ux.m5977(r4, r0, r3)
        L190:
            return
        L191:
            r4.getClass()
            java.util.Set r3 = p000.bd1.f1661     // Catch: java.lang.Throwable -> L1a5
            java.lang.Object r3 = r4.f5691     // Catch: java.lang.Throwable -> L1a5
            boolean r4 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L1a5
            if (r4 == 0) goto L19f
            r2 = r3
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L1a5
        L19f:
            p000.bd1.m913(r2)     // Catch: java.lang.Throwable -> L1a5
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1a5
            goto L1ac
        L1a5:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L1ac:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L1b9
            java.lang.String r4 = "rc2954fec18baf260"
            java.lang.String r0 = "观察世界启动上下文失败"
            p000.C0888ux.m5977(r4, r0, r3)
        L1b9:
            return
    }
}
