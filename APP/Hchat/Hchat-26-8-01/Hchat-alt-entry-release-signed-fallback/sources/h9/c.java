package h9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f5151h;

    public /* synthetic */ c(android.content.Context r1, int r2) {
            r0 = this;
            r0.f5150g = r2
            r0.f5151h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f5150g
            r1 = 0
            java.lang.String r2 = "Hchat_fake_location_config"
            r3 = 0
            sf.n r4 = sf.n.f12433a
            android.content.Context r5 = r8.f5151h
            switch(r0) {
                case 0: goto Lc9;
                case 1: goto L8e;
                case 2: goto L88;
                case 3: goto L82;
                case 4: goto L7c;
                case 5: goto L76;
                case 6: goto L70;
                case 7: goto L6a;
                case 8: goto L64;
                case 9: goto L5e;
                case 10: goto L58;
                case 11: goto L52;
                case 12: goto L2b;
                case 13: goto L1c;
                default: goto Ld;
            }
        Ld:
            java.util.concurrent.ExecutorService r0 = x8.q.f21329a
            x8.q.i()
            java.lang.String r0 = "小智上下文已清空"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
            return r4
        L1c:
            java.util.concurrent.ExecutorService r0 = x8.q.f21329a
            x8.q.i()
            java.lang.String r0 = "AI 上下文已清空"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
            return r4
        L2b:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"
            r0.<init>(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r5.startActivity(r0)     // Catch: java.lang.Throwable -> L3c
            r1 = r4
            goto L42
        L3c:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
        L42:
            java.lang.Throwable r0 = sf.g.b(r1)
            if (r0 == 0) goto L51
            java.lang.String r0 = "无法打开电池优化设置"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
        L51:
            return r4
        L52:
            java.lang.String r0 = "https://t.me/Hchat_Group"
            wb.ho.v6(r5, r0)
            return r4
        L58:
            java.lang.String r0 = "https://t.me/Hchat_ci"
            wb.ho.v6(r5, r0)
            return r4
        L5e:
            java.lang.String r0 = "https://github.com/YunJavaPro/Silk-Codec-Android"
            wb.ho.v6(r5, r0)
            return r4
        L64:
            java.lang.String r0 = "https://github.com/CopyLibs/BeanShell-Android"
            wb.ho.v6(r5, r0)
            return r4
        L6a:
            java.lang.String r0 = "https://github.com/compose-miuix-ui/miuix"
            wb.ho.v6(r5, r0)
            return r4
        L70:
            java.lang.String r0 = "https://github.com/LSPosed/LSPosed"
            wb.ho.v6(r5, r0)
            return r4
        L76:
            java.lang.String r0 = "https://github.com/Xposed-Modules-Repo/top.hookvip.wxtablet"
            wb.ho.v6(r5, r0)
            return r4
        L7c:
            java.lang.String r0 = "https://github.com/BillyWei01/FastKV"
            wb.ho.v6(r5, r0)
            return r4
        L82:
            java.lang.String r0 = "https://github.com/LuckyPray/DexKit"
            wb.ho.v6(r5, r0)
            return r4
        L88:
            java.lang.String r0 = "https://github.com/HighCapable/KavaRef"
            wb.ho.v6(r5, r0)
            return r4
        L8e:
            android.content.SharedPreferences r0 = ub.b.c(r5, r2)
            java.lang.String r2 = "fake_location_longitude"
            java.lang.String r3 = "121.469170"
            java.lang.String r0 = r0.getString(r2, r3)
            if (r0 == 0) goto Lc0
            java.lang.Double r0 = og.s.U(r0)
            if (r0 == 0) goto Lc0
            double r4 = r0.doubleValue()
            r6 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto Lb9
            r6 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto Lb9
            r1 = r0
        Lb9:
            if (r1 == 0) goto Lc0
            double r0 = r1.doubleValue()
            goto Lc4
        Lc0:
            double r0 = java.lang.Double.parseDouble(r3)
        Lc4:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        Lc9:
            android.content.SharedPreferences r0 = ub.b.c(r5, r2)
            java.lang.String r2 = "fake_location_latitude"
            java.lang.String r3 = "31.224361"
            java.lang.String r0 = r0.getString(r2, r3)
            if (r0 == 0) goto Lfb
            java.lang.Double r0 = og.s.U(r0)
            if (r0 == 0) goto Lfb
            double r4 = r0.doubleValue()
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto Lf4
            r6 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto Lf4
            r1 = r0
        Lf4:
            if (r1 == 0) goto Lfb
            double r0 = r1.doubleValue()
            goto Lff
        Lfb:
            double r0 = java.lang.Double.parseDouble(r3)
        Lff:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }
}
