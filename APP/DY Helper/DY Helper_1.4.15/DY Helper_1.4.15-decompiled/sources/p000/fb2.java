package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fb2 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3864;

    public /* synthetic */ fb2(int r1) {
            r0 = this;
            r0.f3864 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r9) {
            r8 = this;
            int r8 = r8.f3864
            r1 = 0
            r9.getClass()
            switch(r8) {
                case 0: goto L42;
                default: goto L9;
            }
        L9:
            yl r8 = p000.C1025yl.f12669
            boolean r8 = p000.C1025yl.m6927()
            if (r8 != 0) goto L15
            p000.C1025yl.m6935()
            goto L41
        L15:
            java.lang.Object[] r8 = r9.f5692
            r8.getClass()
            java.lang.Object r8 = p000.AbstractC0312g7.m2250(r8)
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L25
            r1 = r8
            android.view.View r1 = (android.view.View) r1
        L25:
            r6 = r1
            if (r6 != 0) goto L29
            goto L41
        L29:
            java.lang.String r8 = "panel.onViewCreated"
            p000.C1025yl.m6923(r6, r8)
            ul r5 = new ul
            r8 = 7
            r5.<init>(r8)
            sm1 r2 = new sm1
            r2.<init>()
            r7 = 0
            r3 = 256(0x100, float:3.59E-43)
            r4 = 12
            p000.C1025yl.m6936(r2, r3, r4, r5, r6, r7)
        L41:
            return
        L42:
            hb2 r8 = p000.hb2.f4680
            java.lang.Object r8 = r9.f5691
            if (r8 != 0) goto L4a
            goto Lb6
        L4a:
            java.lang.Class r9 = r8.getClass()
            java.util.ArrayList r9 = p000.hb2.m2482(r9)
            java.util.Iterator r9 = r9.iterator()
        L56:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r9.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r2 = r0.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L56
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L75
            goto L7c
        L75:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L7c:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L82
            r2 = r1
            goto L83
        L82:
            r2 = r0
        L83:
            if (r2 != 0) goto L86
            goto L56
        L86:
            hb2 r0 = p000.hb2.f4680
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L95
            int r0 = p000.hb2.m2484(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L95
            goto L9c
        L95:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L9c:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L56
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "39.6+ 私信 Helper 运行时解析失败 type="
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "re4b6c41332ef57c6"
            p000.C0888ux.m5977(r3, r2, r0)
            goto L56
        Lb6:
            return
    }
}
