package bi;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f891g;

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f891g = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r33 = this;
            r0 = r33
            int r1 = r0.f891g
            r2 = 1
            r3 = 30
            sf.n r5 = sf.n.f12433a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r7 = 0
            switch(r1) {
                case 0: goto L269;
                case 1: goto L266;
                case 2: goto L261;
                case 3: goto Lee;
                case 4: goto Leb;
                case 5: goto Lcd;
                case 6: goto Lca;
                case 7: goto Lc7;
                case 8: goto Lc1;
                case 9: goto Lbb;
                case 10: goto Lb8;
                case 11: goto Lb2;
                case 12: goto Laf;
                case 13: goto Lac;
                case 14: goto La7;
                case 15: goto La2;
                case 16: goto L9d;
                case 17: goto L98;
                case 18: goto L93;
                case 19: goto L8e;
                case 20: goto L74;
                case 21: goto L5a;
                case 22: goto L38;
                case 23: goto L33;
                case 24: goto L30;
                case 25: goto L2d;
                case 26: goto L22;
                case 27: goto L1a;
                case 28: goto L15;
                default: goto Lf;
            }
        Lf:
            k.i1 r1 = new k.i1
            r1.<init>()
            return r1
        L15:
            i0.u r1 = k.v0.f7087a
            k.e0 r1 = k.e0.f6946a
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "CompositionLocal LocalHostDefaultProvider not present"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.String r1 = "Unexpected call to default provider"
            i0.m.b(r1)
            af.d r1 = new af.d
            r1.<init>()
            throw r1
        L2d:
            h0.k1 r1 = h0.i.f4908a
            return r1
        L30:
            i0.u r1 = h0.n0.f4948a
            return r7
        L33:
            xg.e r1 = qg.c0.f11038a
            xg.d r1 = xg.d.f21615i
            return r1
        L38:
            okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder
            r1.<init>()
            r7 = 15
            okhttp3.OkHttpClient$Builder r1 = r1.connectTimeout(r7, r6)
            okhttp3.OkHttpClient$Builder r1 = r1.readTimeout(r3, r6)
            fb.w r3 = fb.h2.f3546d
            okhttp3.OkHttpClient$Builder r1 = r1.dns(r3)
            okhttp3.OkHttpClient$Builder r1 = r1.followRedirects(r2)
            okhttp3.OkHttpClient$Builder r1 = r1.followSslRedirects(r2)
            okhttp3.OkHttpClient r1 = r1.build()
            return r1
        L5a:
            okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder
            r1.<init>()
            r2 = 8
            okhttp3.OkHttpClient$Builder r1 = r1.connectTimeout(r2, r6)
            okhttp3.OkHttpClient$Builder r1 = r1.readTimeout(r2, r6)
            fb.w r2 = fb.h2.f3544b
            okhttp3.OkHttpClient$Builder r1 = r1.dns(r2)
            okhttp3.OkHttpClient r1 = r1.build()
            return r1
        L74:
            okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder
            r1.<init>()
            r7 = 20
            okhttp3.OkHttpClient$Builder r1 = r1.connectTimeout(r7, r6)
            r7 = 120(0x78, double:5.93E-322)
            okhttp3.OkHttpClient$Builder r1 = r1.readTimeout(r7, r6)
            okhttp3.OkHttpClient$Builder r1 = r1.writeTimeout(r3, r6)
            okhttp3.OkHttpClient r1 = r1.build()
            return r1
        L8e:
            me.yun.silk.SilkCodec r1 = h.Hchat.hooks.items.script.ScriptWaBridge.N()
            return r1
        L93:
            sf.n r1 = h.Hchat.hooks.items.script.ScriptPluginBridge.k()
            return r1
        L98:
            sf.n r1 = h.Hchat.hooks.items.script.ScriptPluginBridge.h()
            return r1
        L9d:
            sf.n r1 = h.Hchat.hooks.items.script.ScriptPluginBridge.g()
            return r1
        La2:
            sf.n r1 = h.Hchat.hooks.items.script.ScriptPluginBridge.u()
            return r1
        La7:
            sf.n r1 = h.Hchat.hooks.items.script.ScriptPluginBridge.s()
            return r1
        Lac:
            android.graphics.Paint r1 = d9.m.f2120j
            return r5
        Laf:
            i0.u r1 = d0.f.f1894a
            return r7
        Lb2:
            ci.z r1 = new ci.z
            r1.<init>()
            return r1
        Lb8:
            i0.m2 r1 = ci.y.f1809a
            return r7
        Lbb:
            w0.p r1 = new w0.p
            r1.<init>()
            return r1
        Lc1:
            w0.p r1 = new w0.p
            r1.<init>()
            return r1
        Lc7:
            java.util.Set r1 = ca.e0.f1478q
            return r5
        Lca:
            android.os.Handler r1 = c9.b0.f1104a
            return r5
        Lcd:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.GET_CONTENT"
            r1.<init>(r3)
            java.lang.String r3 = "android.intent.category.OPENABLE"
            r1.addCategory(r3)
            java.lang.String r3 = "*/*"
            r1.setType(r3)
            r1.addFlags(r2)
            java.lang.String r2 = "选择聊天分组文件"
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r2)
            r1.getClass()
            return r1
        Leb:
            i0.m2 r1 = bi.n.f921a
            return r7
        Lee:
            i2.n0 r8 = new i2.n0
            r1 = 17
            long r11 = x6.d.D(r1)
            r17 = 0
            r19 = 16777213(0xfffffd, float:2.3509883E-38)
            r9 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r8.<init>(r9, r11, r13, r14, r16, r17, r19)
            i2.n0 r9 = new i2.n0
            long r12 = x6.d.D(r1)
            r1 = 1067030938(0x3f99999a, float:1.2)
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            long r18 = x6.d.R(r2, r1)
            r20 = 16646141(0xfdfffd, float:2.3326212E-38)
            r10 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r9.<init>(r10, r12, r14, r15, r17, r18, r20)
            i2.n0 r10 = new i2.n0
            r1 = 16
            long r13 = x6.d.D(r1)
            r19 = 0
            r21 = 16777213(0xfffffd, float:2.3509883E-38)
            r11 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r10.<init>(r11, r13, r15, r16, r18, r19, r21)
            i2.n0 r11 = new i2.n0
            r1 = 14
            long r14 = x6.d.D(r1)
            r20 = 0
            r22 = 16777213(0xfffffd, float:2.3509883E-38)
            r12 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r11.<init>(r12, r14, r16, r17, r19, r20, r22)
            i2.n0 r12 = new i2.n0
            r1 = 17
            long r15 = x6.d.D(r1)
            r21 = 0
            r23 = 16777213(0xfffffd, float:2.3509883E-38)
            r13 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r12.<init>(r13, r15, r17, r18, r20, r21, r23)
            i2.n0 r13 = new i2.n0
            r1 = 13
            long r16 = x6.d.D(r1)
            r22 = 0
            r24 = 16777213(0xfffffd, float:2.3509883E-38)
            r14 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r13.<init>(r14, r16, r18, r19, r21, r22, r24)
            i2.n0 r15 = new i2.n0
            r1 = 11
            long r17 = x6.d.D(r1)
            r23 = 0
            r25 = 16777213(0xfffffd, float:2.3509883E-38)
            r14 = r15
            r15 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r14.<init>(r15, r17, r19, r20, r22, r23, r25)
            i2.n0 r15 = new i2.n0
            r1 = 17
            long r18 = x6.d.D(r1)
            r24 = 0
            r26 = 16777213(0xfffffd, float:2.3509883E-38)
            r16 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r15.<init>(r16, r18, r20, r21, r23, r24, r26)
            i2.n0 r16 = new i2.n0
            r1 = 16
            long r19 = x6.d.D(r1)
            r25 = 0
            r27 = 16777213(0xfffffd, float:2.3509883E-38)
            r17 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r16.<init>(r17, r19, r21, r22, r24, r25, r27)
            i2.n0 r17 = new i2.n0
            r1 = 14
            long r20 = x6.d.D(r1)
            m2.k r22 = m2.k.f8700l
            r26 = 0
            r28 = 16777209(0xfffff9, float:2.3509877E-38)
            r18 = 0
            r23 = 0
            r25 = 0
            r17.<init>(r18, r20, r22, r23, r25, r26, r28)
            i2.n0 r18 = new i2.n0
            r1 = 32
            long r21 = x6.d.D(r1)
            r27 = 0
            r29 = 16777213(0xfffffd, float:2.3509883E-38)
            r19 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r18.<init>(r19, r21, r23, r24, r26, r27, r29)
            i2.n0 r19 = new i2.n0
            r1 = 24
            long r22 = x6.d.D(r1)
            r28 = 0
            r30 = 16777213(0xfffffd, float:2.3509883E-38)
            r20 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r19.<init>(r20, r22, r24, r25, r27, r28, r30)
            i2.n0 r20 = new i2.n0
            r1 = 20
            long r23 = x6.d.D(r1)
            r29 = 0
            r31 = 16777213(0xfffffd, float:2.3509883E-38)
            r21 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r20.<init>(r21, r23, r25, r26, r28, r29, r31)
            i2.n0 r21 = new i2.n0
            r1 = 18
            long r24 = x6.d.D(r1)
            r30 = 0
            r32 = 16777213(0xfffffd, float:2.3509883E-38)
            r22 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r21.<init>(r22, r24, r26, r27, r29, r30, r32)
            r1 = r20
            r20 = r19
            r19 = r18
            r18 = r17
            r17 = r16
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            bi.l r8 = new bi.l
            r22 = r21
            r21 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r8
        L261:
            i0.m2 r1 = bi.k.f905a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L266:
            i0.m2 r1 = bi.g.f895a
            return r7
        L269:
            bi.b r1 = bi.d.b()
            return r1
    }
}
