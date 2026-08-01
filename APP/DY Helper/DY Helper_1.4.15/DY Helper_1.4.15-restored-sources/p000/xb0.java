package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12114;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f12115;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12116;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f12117;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f12118;

    public /* synthetic */ xb0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f12114 = r5
            r0.f12116 = r1
            r0.f12115 = r2
            r0.f12117 = r3
            r0.f12118 = r4
            r0.<init>()
            return
    }

    public /* synthetic */ xb0(java.util.concurrent.atomic.AtomicBoolean r2, android.view.View r3, p000.um1 r4, android.app.Dialog r5) {
            r1 = this;
            r0 = 1
            r1.f12114 = r0
            r1.<init>()
            r1.f12116 = r2
            r1.f12117 = r3
            r1.f12115 = r4
            r1.f12118 = r5
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r15 = this;
            int r0 = r15.f12114
            r1 = 0
            r2 = 0
            s62 r3 = p000.s62.f9751
            r4 = 1
            java.lang.Object r5 = r15.f12118
            java.lang.Object r6 = r15.f12117
            java.lang.Object r7 = r15.f12115
            java.lang.Object r15 = r15.f12116
            switch(r0) {
                case 0: goto Lf0;
                case 1: goto La6;
                case 2: goto L80;
                default: goto L12;
            }
        L12:
            java.lang.ClassLoader r15 = (java.lang.ClassLoader) r15
            vc1 r7 = (p000.vc1) r7
            lc1 r6 = (p000.lc1) r6
            id1 r5 = (p000.id1) r5
            java.lang.String r0 = r6.f6544
            int r1 = r5.f5015
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.getClass()
            boolean r3 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L6a
            if (r1 <= 0) goto L62
            java.lang.String r3 = "POST"
            java.lang.String r4 = "https://vassets-backend.douyin.com/gameplay/farm/plant_crops"
            java.lang.String r5 = "shop_type"
            l91 r6 = new l91     // Catch: java.lang.Throwable -> L72
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "plant_type"
            l91 r8 = new l91     // Catch: java.lang.Throwable -> L72
            r8.<init>(r5, r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "seed_id"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L72
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L72
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = "decorate_uuid"
            l91 r2 = new l91     // Catch: java.lang.Throwable -> L72
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L72
            l91[] r0 = new p000.l91[]{r6, r8, r5, r2}     // Catch: java.lang.Throwable -> L72
            java.util.LinkedHashMap r0 = p000.ex0.m1969(r0)     // Catch: java.lang.Throwable -> L72
            za1 r15 = p000.i81.m2675(r15, r7, r3, r4, r0)     // Catch: java.lang.Throwable -> L72
            kc1 r15 = p000.i81.m2671(r15)     // Catch: java.lang.Throwable -> L72
            goto L7a
        L62:
            java.lang.String r15 = "seedId 必须大于 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L72
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L72
            throw r0     // Catch: java.lang.Throwable -> L72
        L6a:
            java.lang.String r15 = "decorateUuid 不能为空"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L72
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L72
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        L7a:
            fo1 r0 = new fo1
            r0.<init>(r15)
            return r0
        L80:
            android.app.Activity r15 = (android.app.Activity) r15
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            j71 r6 = (p000.j71) r6
            p70 r5 = (p000.p70) r5
            android.widget.PopupMenu r0 = new android.widget.PopupMenu
            r0.<init>(r15, r7)
            android.view.Menu r1 = r0.getMenu()
            java.lang.String r2 = r6.f5353
            if (r2 != 0) goto L97
            java.lang.String r2 = "更多选项"
        L97:
            r1.add(r2)
            u61 r1 = new u61
            r1.<init>(r5, r6, r15)
            r0.setOnMenuItemClickListener(r1)
            r0.show()
            return r3
        La6:
            java.util.concurrent.atomic.AtomicBoolean r15 = (java.util.concurrent.atomic.AtomicBoolean) r15
            android.view.View r6 = (android.view.View) r6
            um1 r7 = (p000.um1) r7
            android.app.Dialog r5 = (android.app.Dialog) r5
            android.os.Handler r0 = p000.in0.f5135
            boolean r15 = r15.compareAndSet(r2, r4)
            if (r15 != 0) goto Lb7
            goto Leb
        Lb7:
            android.view.ViewTreeObserver r15 = r6.getViewTreeObserver()
            boolean r0 = r15.isAlive()
            if (r0 == 0) goto Ld1
            java.lang.Object r0 = r7.f10912
            if (r0 == 0) goto Lcb
            android.view.ViewTreeObserver$OnPreDrawListener r0 = (android.view.ViewTreeObserver.OnPreDrawListener) r0
            r15.removeOnPreDrawListener(r0)
            goto Ld1
        Lcb:
            java.lang.String r15 = "firstFrameListener"
            p000.ln0.m3650(r15)
            throw r1
        Ld1:
            boolean r15 = r5.isShowing()
            if (r15 == 0) goto Lde
            boolean r15 = p000.in0.m2775(r5)
            if (r15 == 0) goto Lde
            goto Ldf
        Lde:
            r4 = r2
        Ldf:
            boolean r15 = r5.isShowing()
            if (r15 == 0) goto Lea
            if (r4 != 0) goto Lea
            p000.in0.m2771(r5, r2)
        Lea:
            r2 = r4
        Leb:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r2)
            return r15
        Lf0:
            dc0 r15 = (p000.dc0) r15
            um1 r7 = (p000.um1) r7
            um1 r6 = (p000.um1) r6
            java.util.Map r5 = (java.util.Map) r5
            r15.f3072 = r2
            java.lang.Object r0 = r7.f10912
            if (r0 == 0) goto L19f
            sb0 r0 = (p000.sb0) r0
            java.lang.Object r4 = r6.f10912
            java.lang.String r7 = "approval"
            if (r4 == 0) goto L19b
            eb0 r4 = (p000.eb0) r4
            java.lang.String r4 = r4.f3470
            java.lang.String r8 = r0.f9813
            java.lang.String[] r4 = new java.lang.String[]{r4, r8}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L11d:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L134
            java.lang.Object r9 = r4.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = p000.q02.m4671(r10)
            if (r10 != 0) goto L11d
            r8.add(r9)
            goto L11d
        L134:
            r13 = 0
            r14 = 62
            java.lang.String r9 = "；"
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r4 = p000.AbstractC0984xh.m6644(r8, r9, r10, r11, r12, r13, r14)
            java.util.List r8 = r0.f9810
            java.util.List r0 = r0.f9811
            r15.f3069 = r0
            int r0 = r8.size()
            r15.f3070 = r0
            r15.f3074 = r4
            java.util.LinkedHashMap r0 = r15.f3067
            java.util.Set r4 = r0.keySet()
            java.util.List r8 = r15.f3069
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L15f:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L175
            java.lang.Object r10 = r8.next()
            ic0 r10 = (p000.ic0) r10
            long r10 = r10.f4994
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.add(r10)
            goto L15f
        L175:
            r4.retainAll(r9)
            r0.putAll(r5)
            r15.m1695()
            android.app.Activity r15 = r15.f3052
            java.lang.Object r0 = r6.f10912
            if (r0 == 0) goto L197
            eb0 r0 = (p000.eb0) r0
            boolean r0 = r0.f3469
            if (r0 == 0) goto L18d
            java.lang.String r0 = "审批完成，列表已刷新"
            goto L18f
        L18d:
            java.lang.String r0 = "部分审批失败，列表已刷新"
        L18f:
            android.widget.Toast r15 = android.widget.Toast.makeText(r15, r0, r2)
            r15.show()
            return r3
        L197:
            p000.ln0.m3650(r7)
            throw r1
        L19b:
            p000.ln0.m3650(r7)
            throw r1
        L19f:
            java.lang.String r15 = "refreshed"
            p000.ln0.m3650(r15)
            throw r1
    }
}
