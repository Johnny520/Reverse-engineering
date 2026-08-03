package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7065g;

    public /* synthetic */ s1(int r1) {
            r0 = this;
            r0.f7065g = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f7065g
            r1 = 0
            r3 = 0
            java.lang.String r4 = ""
            r5 = 0
            switch(r0) {
                case 0: goto Lf5;
                case 1: goto Lb3;
                case 2: goto Lae;
                case 3: goto La6;
                case 4: goto La0;
                case 5: goto L9a;
                case 6: goto L97;
                case 7: goto L94;
                case 8: goto L91;
                case 9: goto L8e;
                case 10: goto L84;
                case 11: goto L7f;
                case 12: goto L79;
                case 13: goto L73;
                case 14: goto L68;
                case 15: goto L65;
                case 16: goto L5d;
                case 17: goto L50;
                case 18: goto L4d;
                case 19: goto L47;
                case 20: goto L41;
                case 21: goto L3c;
                case 22: goto L34;
                case 23: goto L2b;
                case 24: goto L26;
                case 25: goto L21;
                case 26: goto L1c;
                case 27: goto L17;
                case 28: goto L12;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = "latest"
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L12:
            i0.j1 r0 = i0.r.u(r4)
            return r0
        L17:
            i0.j1 r0 = i0.r.u(r4)
            return r0
        L1c:
            i0.j1 r0 = i0.r.u(r4)
            return r0
        L21:
            og.k r0 = wb.ho.f16633a
            sf.n r0 = sf.n.f12433a
            return r0
        L26:
            i0.j1 r0 = i0.r.u(r4)
            return r0
        L2b:
            i0.m2 r0 = wb.o3.f17995a
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L34:
            k.s1 r0 = new k.s1
            r1 = 23
            r0.<init>(r1)
            return r0
        L3c:
            i0.m2 r0 = wb.o3.f17995a
            sf.n r0 = sf.n.f12433a
            return r0
        L41:
            u2.j r0 = new u2.j
            r0.<init>(r1)
            return r0
        L47:
            u2.j r0 = new u2.j
            r0.<init>(r1)
            return r0
        L4d:
            i0.m2 r0 = w.n.f14572a
            return r5
        L50:
            f1.t0 r0 = new f1.t0
            r1 = 1308617531(0x4dffeb3b, float:5.3670077E8)
            long r1 = f1.c0.c(r1)
            r0.<init>(r1)
            return r0
        L5d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CompositionLocal LocalSavedStateRegistryOwner not present"
            r0.<init>(r1)
            throw r0
        L65:
            i0.m2 r0 = v0.h.f13882a
            return r5
        L68:
            v0.d r0 = new v0.d
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.<init>(r1)
            return r0
        L73:
            th.n r0 = new th.n
            r0.<init>()
            return r0
        L79:
            me.yun.silk.SilkCodec r0 = new me.yun.silk.SilkCodec
            r0.<init>()
            return r0
        L7f:
            i0.m2 r0 = t0.b.f12973a
            t0.a r0 = t0.a.f12972a
            return r0
        L84:
            sh.e2 r0 = new sh.e2
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = 0
            r0.<init>(r1, r2, r2)
            return r0
        L8e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L91:
            i0.u r0 = sh.h0.f12595a
            return r5
        L94:
            sf.n r0 = sf.n.f12433a
            return r0
        L97:
            i0.u r0 = s3.b.f12341a
            return r5
        L9a:
            r.z r0 = new r.z
            r0.<init>(r3, r3)
            return r0
        La0:
            me.yun.silk.SilkCodec r0 = new me.yun.silk.SilkCodec
            r0.<init>()
            return r0
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CompositionLocal LocalLifecycleOwner not present"
            r0.<init>(r1)
            throw r0
        Lae:
            float r0 = m.j0.f8216a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Lb3:
            k9.r r0 = k9.r.f7530a
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto Lc2
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto Lc2
            goto Lca
        Lc2:
            java.lang.ref.WeakReference r0 = k9.r.f7536g
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
        Lca:
            if (r0 == 0) goto Ld7
            boolean r1 = k9.r.f7533d
            if (r1 == 0) goto Ld7
            boolean r1 = k9.r.q(r0)
            if (r1 == 0) goto Ld7
            r3 = 1
        Ld7:
            java.lang.ref.WeakReference r1 = k9.r.f7536g
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto Le8
            if (r3 == 0) goto Le5
            if (r1 == r0) goto Le8
        Le5:
            a7.a.l(r1)
        Le8:
            k9.r.e(r5)
            if (r3 == 0) goto Lf2
            if (r0 == 0) goto Lf2
            k9.r.c(r0)
        Lf2:
            sf.n r0 = sf.n.f12433a
            return r0
        Lf5:
            k.w1 r0 = new k.w1
            r0.<init>(r3)
            return r0
    }
}
