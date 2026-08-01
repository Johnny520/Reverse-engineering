package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ti0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10386;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f10387;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f10388;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f10389;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f10390;

    public /* synthetic */ ti0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f10386 = r5
            r0.f10387 = r1
            r0.f10388 = r2
            r0.f10389 = r3
            r0.f10390 = r4
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f10386
            switch(r0) {
                case 0: goto La4;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f10387
            r6 = r0
            f8 r6 = (p000.C0276f8) r6
            java.lang.Object r0 = r10.f10388
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r0 = r10.f10389
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r10 = r10.f10390
            r5 = r10
            fv r5 = (p000.C0299fv) r5
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            qy0 r10 = p000.qy0.f9157
            java.lang.String r11 = "images"
            java.lang.String r9 = p000.qy0.m5000(r11, r6, r2)
            boolean r11 = p000.qy0.m4965(r9)
            if (r11 != 0) goto L54
            java.lang.String r10 = r6.f3800
            int r11 = r2.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[IMG-DL-SKIP-DUP] awemeId="
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = ", count="
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            java.lang.String r11 = "DYHelper"
            p000.C0888ux.m5975(r11, r10)
            java.lang.String r10 = "图片下载已在进行中，请勿重复点击"
            p000.qy0.m4991(r3, r10)
            goto La1
        L54:
            p000.qy0.m4960(r3)
            int r7 = r10.m5031()
            boolean r8 = p000.qy0.m4988(r3)
            int r10 = r2.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "共 "
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = " 张，准备中..."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "下载图片"
            p000.qy0.m4996(r3, r11, r10)
            int r10 = r2.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "⬇ 开始下载 "
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = " 张图片..."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            p000.qy0.m4991(r3, r10)
            vx0 r1 = new vx0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10 = 23
            java.lang.String r11 = "dl-images"
            p000.p91.m4411(r10, r1, r11)
        La1:
            s62 r10 = p000.s62.f9751
            return r10
        La4:
            java.lang.Object r0 = r10.f10387
            wi0 r0 = (p000.wi0) r0
            java.lang.Object r1 = r10.f10388
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            java.lang.Object r2 = r10.f10389
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r10 = r10.f10390
            java.util.List r10 = (java.util.List) r10
            org.luckypray.dexkit.DexKitBridge r11 = (org.luckypray.dexkit.DexKitBridge) r11
            r11.getClass()
            t00 r3 = new t00
            r4 = 4
            r3.<init>(r2, r4)
            org.luckypray.dexkit.result.MethodDataList r11 = r11.findMethod(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
        Lcc:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Le2
            java.lang.Object r4 = r11.next()
            org.luckypray.dexkit.result.MethodData r4 = (org.luckypray.dexkit.result.MethodData) r4
            java.lang.reflect.Method r4 = r4.getMethodInstance(r1)
            if (r4 == 0) goto Lcc
            r3.add(r4)
            goto Lcc
        Le2:
            wi0 r11 = p000.wi0.f11726
            java.util.List r11 = r11.m6394(r3, r2)
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto Lef
            goto Lf0
        Lef:
            r10 = r11
        Lf0:
            java.util.List r10 = r0.m6394(r10, r2)
            return r10
    }
}
