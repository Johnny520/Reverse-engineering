package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12192;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a80 f12193;

    public /* synthetic */ xj0(p000.a80 r1, int r2) {
            r0 = this;
            r0.f12192 = r2
            r0.f12193 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f12192
            r1 = 15
            r2 = 100
            a80 r4 = r4.f12193
            switch(r0) {
                case 0: goto L13e;
                case 1: goto L12c;
                case 2: goto L128;
                case 3: goto L10d;
                case 4: goto Led;
                case 5: goto Ld2;
                case 6: goto Lb2;
                case 7: goto L9b;
                case 8: goto L40;
                case 9: goto L24;
                case 10: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.Long r5 = (java.lang.Long) r5
            r5.getClass()
            java.lang.Object r4 = r4.invoke(r5)
            return r4
        L15:
            java.lang.Class r5 = (java.lang.Class) r5
            r5.getClass()
            java.lang.Object r4 = r4.invoke(r5)
            l91 r0 = new l91
            r0.<init>(r5, r4)
            return r0
        L24:
            yw1 r5 = (p000.yw1) r5
            java.lang.Object r4 = r4.invoke(r5)
            tw1 r4 = (p000.tw1) r4
            java.lang.Object r5 = p000.ax1.f1362
            monitor-enter(r5)
            yw1 r0 = p000.ax1.f1363     // Catch: java.lang.Throwable -> L3d
            long r1 = r4.mo5759()     // Catch: java.lang.Throwable -> L3d
            yw1 r0 = r0.m7048(r1)     // Catch: java.lang.Throwable -> L3d
            p000.ax1.f1363 = r0     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return r4
        L3d:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L40:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            r5.getClass()
            java.lang.CharSequence r0 = p000.q02.m4660(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "__smart__"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L61
            goto L7f
        L61:
            r0 = 10
            java.lang.Integer r5 = p000.x02.m6487(r5, r0)
            r0 = 0
            if (r5 == 0) goto L7a
            int r1 = r5.intValue()
            if (r1 <= 0) goto L71
            goto L72
        L71:
            r5 = r0
        L72:
            if (r5 == 0) goto L7a
            java.lang.String r5 = r5.toString()
            r1 = r5
            goto L7b
        L7a:
            r1 = r0
        L7b:
            if (r1 != 0) goto L7f
            java.lang.String r1 = ""
        L7f:
            boolean r5 = p000.q02.m4671(r1)
            if (r5 == 0) goto L87
            java.lang.String r1 = "204"
        L87:
            bv1 r5 = p000.bv1.f1853
            java.lang.String r5 = "pet_elf_auto_feed_default_food_id"
            p000.ui1.m5875(r5, r1)
            p000.xa1.m6548()
            java.lang.String r5 = p000.gf1.m2301(r1)
            r4.invoke(r5)
            s62 r4 = p000.s62.f9751
            return r4
        L9b:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "im_auto_read_filter_mode"
            p000.ui1.m5873(r0, r5)
            java.lang.String[] r0 = p000.kn0.f6041
            r5 = r0[r5]
            r4.invoke(r5)
            s62 r4 = p000.s62.f9751
            return r4
        Lb2:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r0 = p000.q02.m4671(r5)
            if (r0 != 0) goto Lcf
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "duration_alert_message"
            java.lang.String r2 = p000.q02.m4693(r5, r2)
            p000.ui1.m5875(r0, r2)
            java.lang.String r5 = p000.bv1.m1042(r5, r1)
            r4.invoke(r5)
        Lcf:
            s62 r4 = p000.s62.f9751
            return r4
        Ld2:
            yu r5 = (p000.C1034yu) r5
            r5.getClass()
            java.lang.String r5 = "download_path_template"
            java.lang.String r0 = ""
            java.lang.String r5 = p000.ui1.m5893(r5, r0)
            boolean r0 = p000.q02.m4671(r5)
            if (r0 == 0) goto Le7
            java.lang.String r5 = "系统默认目录"
        Le7:
            r4.invoke(r5)
            s62 r4 = p000.s62.f9751
            return r4
        Led:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r0 = p000.q02.m4671(r5)
            if (r0 != 0) goto L10a
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "video_length_alert_toast_msg"
            java.lang.String r2 = p000.q02.m4693(r5, r2)
            p000.ui1.m5875(r0, r2)
            java.lang.String r5 = p000.bv1.m1042(r5, r1)
            r4.invoke(r5)
        L10a:
            s62 r4 = p000.s62.f9751
            return r4
        L10d:
            java.lang.String r5 = (java.lang.String) r5
            bv1 r0 = p000.bv1.f1853
            int r0 = p000.bv1.m1032()
            if (r0 <= 0) goto L11e
            java.lang.String r5 = " 个音频"
            java.lang.String r5 = p000.lz1.m3686(r5, r0)
            goto L122
        L11e:
            if (r5 != 0) goto L122
            java.lang.String r5 = "未选择"
        L122:
            r4.invoke(r5)
            s62 r4 = p000.s62.f9751
            return r4
        L128:
            r4.invoke(r5)
            return r5
        L12c:
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            l41 r0 = p000.l41.f6416
            java.lang.Object r4 = r4.invoke(r5)
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r4 = p000.l41.m3484(r4)
            return r4
        L13e:
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            java.lang.Object r4 = r4.invoke(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L157:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L174
            java.lang.Object r1 = r4.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            zj0 r3 = p000.zj0.f13118
            java.lang.String r2 = p000.zj0.m7135(r2)
            boolean r2 = r5.add(r2)
            if (r2 == 0) goto L157
            r0.add(r1)
            goto L157
        L174:
            return r0
    }
}
