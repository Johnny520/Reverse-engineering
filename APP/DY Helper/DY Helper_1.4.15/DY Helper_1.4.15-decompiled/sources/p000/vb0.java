package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11218;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f11219;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11220;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f11221;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f11222;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f11223;

    public /* synthetic */ vb0(p000.dc0 r2, p000.um1 r3, java.util.ArrayList r4, p000.um1 r5, p000.um1 r6) {
            r1 = this;
            r0 = 0
            r1.f11218 = r0
            r1.<init>()
            r1.f11219 = r2
            r1.f11220 = r3
            r1.f11223 = r4
            r1.f11221 = r5
            r1.f11222 = r6
            return
    }

    public /* synthetic */ vb0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f11218 = r6
            r0.f11219 = r1
            r0.f11220 = r2
            r0.f11221 = r3
            r0.f11222 = r4
            r0.f11223 = r5
            r0.<init>()
            return
    }

    public /* synthetic */ vb0(java.util.LinkedHashSet r2, android.app.Activity r3, p000.um1 r4, p000.C0276f8 r5, java.util.ArrayList r6) {
            r1 = this;
            r0 = 2
            r1.f11218 = r0
            r1.<init>()
            r1.f11219 = r2
            r1.f11221 = r3
            r1.f11220 = r4
            r1.f11222 = r5
            r1.f11223 = r6
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f11218
            switch(r0) {
                case 0: goto L18f;
                case 1: goto L11e;
                case 2: goto L3a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f11219
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r9.f11220
            zc0 r1 = (p000.zc0) r1
            java.lang.Object r2 = r9.f11221
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r3 = r9.f11222
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r9 = r9.f11223
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.util.Iterator r4 = r0.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L31
            java.lang.Object r5 = r4.next()
            ku1 r5 = (p000.ku1) r5
            java.lang.String r5 = r5.f6118
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.put(r5, r6)
            goto L1d
        L31:
            r1.notifyDataSetChanged()
            p000.bv1.m1047(r3, r0, r9, r2)
            s62 r9 = p000.s62.f9751
            return r9
        L3a:
            java.lang.Object r0 = r9.f11219
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.lang.Object r1 = r9.f11221
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r9.f11220
            um1 r2 = (p000.um1) r2
            java.lang.Object r3 = r9.f11222
            f8 r3 = (p000.C0276f8) r3
            java.lang.Object r9 = r9.f11223
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.List r0 = p000.AbstractC0984xh.m6657(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r5 = p000.AbstractC0984xh.m6641(r5, r9)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L5b
            r4.add(r5)
            goto L5b
        L77:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r4.iterator()
        L80:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r0.next()
            r5 = r4
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            boolean r5 = r5.isRecycled()
            if (r5 != 0) goto L80
            r9.add(r4)
            goto L80
        L97:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto La8
            java.lang.String r9 = "请选择图片"
            r0 = 0
            android.widget.Toast r9 = android.widget.Toast.makeText(r1, r9, r0)
            r9.show()
            goto L114
        La8:
            java.lang.Object r0 = r2.f10912
            if (r0 == 0) goto L117
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            r0.dismiss()
            qy0 r0 = p000.qy0.f9157
            r1.getClass()
            r3.getClass()
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto Lc5
            java.lang.String r9 = "没有可保存的图片"
            p000.qy0.m4991(r1, r9)
            goto L114
        Lc5:
            iu r2 = p000.AbstractC1021yh.m6915(r1)
            java.lang.String r4 = r2.f5186
            if (r4 == 0) goto Le1
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto Ld4
            goto Le1
        Ld4:
            boolean r2 = r2.m2799()
            if (r2 != 0) goto Le1
            java.lang.String r2 = "DYHelper"
            java.lang.String r4 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r2, r4)
        Le1:
            java.lang.String r2 = "jpg"
            java.lang.String r2 = p000.qy0.m4966(r1, r3, r2)
            java.lang.String r2 = p000.q02.m4692(r2)
            jy0 r4 = p000.jy0.f5661
            fv r0 = p000.qy0.m5014(r0, r1, r3, r4, r2)
            int r2 = r9.size()
            r3 = 1
            if (r2 > r3) goto Lfb
            java.lang.String r2 = "将保存 1 张图片。"
            goto L107
        Lfb:
            int r2 = r9.size()
            java.lang.String r3 = "将保存 "
            java.lang.String r4 = " 张图片，文件名会自动追加 _img1、_img2。"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r3, r2, r4)
        L107:
            java.lang.String r3 = r0.f4140
            m3 r4 = new m3
            r5 = 5
            r4.<init>(r1, r9, r0, r5)
            java.lang.String r9 = "确认图片文件名"
            p000.qy0.m4980(r1, r9, r2, r3, r4)
        L114:
            s62 r9 = p000.s62.f9751
            return r9
        L117:
            java.lang.String r9 = "dialog"
            p000.ln0.m3650(r9)
            r9 = 0
            throw r9
        L11e:
            java.lang.Object r0 = r9.f11219
            r5 = r0
            n r5 = (p000.C0568n) r5
            java.lang.Object r0 = r9.f11220
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r9.f11221
            r4 = r1
            ih0 r4 = (p000.ih0) r4
            java.lang.Object r1 = r9.f11222
            gc r1 = (p000.C0317gc) r1
            java.lang.Object r9 = r9.f11223
            ic r9 = (p000.C0391ic) r9
            r2 = r1
            nh0 r1 = p000.nh0.f7619
            r5.m3924()     // Catch: java.lang.Throwable -> L15d
            android.content.Context r0 = p000.nh0.m4067(r0)     // Catch: java.lang.Throwable -> L15d
            if (r0 == 0) goto L167
            java.lang.Object r3 = p000.nh0.m4054()     // Catch: java.lang.Throwable -> L15d
            if (r3 == 0) goto L15f
            θ r6 = new θ     // Catch: java.lang.Throwable -> L15d
            r7 = 17
            r6.<init>(r7, r2)     // Catch: java.lang.Throwable -> L15d
            r2 = r0
            lh0 r0 = r1.m4068(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L15d
            p3 r1 = new p3     // Catch: java.lang.Throwable -> L15d
            r2 = 20
            r1.<init>(r9, r2, r0)     // Catch: java.lang.Throwable -> L15d
            p000.nh0.m4063(r1)     // Catch: java.lang.Throwable -> L15d
            goto L18c
        L15d:
            r0 = move-exception
            goto L16f
        L15f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15d
            java.lang.String r1 = "未找到当前聊天会话，请保持聊天页面打开"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15d
            throw r0     // Catch: java.lang.Throwable -> L15d
        L167:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15d
            java.lang.String r1 = "无法获取宿主上下文，请重新打开抖音后再试"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15d
            throw r0     // Catch: java.lang.Throwable -> L15d
        L16f:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            java.lang.String r2 = "rfae3094b732ade5a"
            if (r1 == 0) goto L17d
            java.lang.String r1 = "exportActiveConversationAsync cancelled"
            r3 = 4
            r4 = 0
            p000.C0888ux.m5988(r2, r1, r4, r3, r4)
            goto L182
        L17d:
            java.lang.String r1 = "exportActiveConversationAsync failed"
            p000.C0888ux.m5977(r2, r1, r0)
        L182:
            p3 r1 = new p3
            r2 = 21
            r1.<init>(r9, r2, r0)
            p000.nh0.m4063(r1)
        L18c:
            s62 r9 = p000.s62.f9751
            return r9
        L18f:
            java.lang.Object r0 = r9.f11219
            dc0 r0 = (p000.dc0) r0
            java.lang.ClassLoader r1 = r0.f3053
            java.lang.Object r2 = r9.f11220
            um1 r2 = (p000.um1) r2
            java.lang.Object r3 = r9.f11223
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r9.f11221
            um1 r4 = (p000.um1) r4
            java.lang.Object r9 = r9.f11222
            um1 r9 = (p000.um1) r9
            s62 r5 = p000.s62.f9751
            wb0 r6 = new wb0     // Catch: java.lang.Throwable -> L1d6
            r7 = 2
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L1d6
            yb0 r7 = new yb0     // Catch: java.lang.Throwable -> L1d6
            r8 = 1
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L1d6
            eb0 r3 = p000.C0966x.m6439(r1, r3, r6, r7)     // Catch: java.lang.Throwable -> L1d6
            r2.f10912 = r3     // Catch: java.lang.Throwable -> L1d6
            wb0 r2 = new wb0     // Catch: java.lang.Throwable -> L1d6
            r3 = 3
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d6
            r0.m1690(r2)     // Catch: java.lang.Throwable -> L1d6
            wb0 r2 = new wb0     // Catch: java.lang.Throwable -> L1d6
            r3 = 4
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d6
            zb0 r0 = new zb0     // Catch: java.lang.Throwable -> L1d6
            r3 = 4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1d6
            sb0 r0 = p000.C0966x.m6413(r1, r2, r0)     // Catch: java.lang.Throwable -> L1d6
            r4.f10912 = r0     // Catch: java.lang.Throwable -> L1d6
            r1 = r5
            goto L1dc
        L1d6:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
        L1dc:
            java.lang.Throwable r0 = p000.fo1.m2190(r1)
            if (r0 == 0) goto L1e4
            r9.f10912 = r0
        L1e4:
            return r5
    }
}
