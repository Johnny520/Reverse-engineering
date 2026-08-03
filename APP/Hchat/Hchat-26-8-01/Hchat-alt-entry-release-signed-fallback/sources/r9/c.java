package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r9.d0 f11643h;

    public /* synthetic */ c(r9.d0 r1, int r2) {
            r0 = this;
            r0.f11642g = r2
            r0.f11643h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f11642g
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r12 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r12
            switch(r0) {
                case 0: goto L1fb;
                case 1: goto L184;
                case 2: goto L16c;
                case 3: goto L154;
                case 4: goto L106;
                case 5: goto L94;
                default: goto L7;
            }
        L7:
            r12.getClass()
            r9.d0 r0 = r11.f11643h
            android.content.SharedPreferences r0 = r0.f11655c
            java.lang.String r1 = "red_packet_details_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L19
            goto L91
        L19:
            java.lang.Object[] r12 = r12.args
            r0 = 0
            if (r12 == 0) goto L24
            r1 = 2
            java.lang.Object r12 = tf.l.C0(r1, r12)
            goto L25
        L24:
            r12 = r0
        L25:
            boolean r1 = r12 instanceof org.json.JSONObject
            if (r1 == 0) goto L2c
            r0 = r12
            org.json.JSONObject r0 = (org.json.JSONObject) r0
        L2c:
            if (r0 == 0) goto L91
            java.lang.String r12 = "totalAmount"
            int r12 = r0.optInt(r12, r2)
            java.lang.String r1 = "totalNum"
            int r1 = r0.optInt(r1, r2)
            java.lang.String r3 = "recNum"
            int r3 = r0.optInt(r3, r2)
            java.lang.String r4 = "recAmount"
            int r2 = r0.optInt(r4, r2)
            if (r12 > 0) goto L4b
            if (r1 > 0) goto L4b
            goto L91
        L4b:
            int r4 = r12 - r2
            double r4 = (double) r4
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "金额:"
            r8.<init>(r9)
            double r9 = (double) r2
            double r9 = r9 / r6
            r8.append(r9)
            r2 = 47
            r8.append(r2)
            double r9 = (double) r12
            double r9 = r9 / r6
            r8.append(r9)
            java.lang.String r12 = "元\n数量:"
            r8.append(r12)
            r8.append(r3)
            r8.append(r2)
            r8.append(r1)
            r1 = 0
            int r12 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r12 <= 0) goto L88
            java.lang.String r12 = "\n剩余:"
            r8.append(r12)
            r8.append(r4)
            java.lang.String r12 = "元"
            r8.append(r12)
        L88:
            java.lang.String r12 = r8.toString()
            java.lang.String r1 = "headTitle"
            r0.put(r1, r12)
        L91:
            sf.n r12 = sf.n.f12433a
            return r12
        L94:
            r12.getClass()
            r9.d0 r1 = r11.f11643h
            android.content.SharedPreferences r0 = r1.f11655c
            java.lang.String r2 = "red_packet_details_enable"
            r3 = 0
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 != 0) goto La5
            goto L103
        La5:
            java.lang.Object[] r0 = r12.args
            r2 = 0
            if (r0 == 0) goto Laf
            java.lang.Object r0 = tf.l.C0(r3, r0)
            goto Lb0
        Laf:
            r0 = r2
        Lb0:
            java.lang.Object[] r12 = r12.args
            r4 = 1
            if (r12 == 0) goto Lba
            java.lang.Object r12 = tf.l.C0(r4, r12)
            goto Lbb
        Lba:
            r12 = r2
        Lbb:
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap
            r5.<init>()
            java.util.Set r5 = java.util.Collections.newSetFromMap(r5)
            r5.getClass()
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Long r12 = r9.d0.w(r3, r12, r5)
            if (r12 == 0) goto L103
            long r5 = r12.longValue()
            java.lang.String r3 = r9.d0.x(r5)
            boolean r12 = r1.E0(r0, r3)
            android.widget.TextView r7 = r1.y(r0, r5)
            if (r7 == 0) goto Led
            r7.setText(r3)
            r8.b r12 = new r8.b
            r12.<init>(r1, r7, r3)
            r7.post(r12)
            goto Lee
        Led:
            r4 = r12
        Lee:
            if (r4 != 0) goto L103
            if (r0 == 0) goto Lf6
            android.view.View r2 = r1.u(r0)
        Lf6:
            r12 = r2
            if (r12 == 0) goto L103
            r2 = r0
            bb.h r0 = new bb.h
            r4 = r5
            r0.<init>(r1, r2, r3, r4)
            r12.post(r0)
        L103:
            sf.n r12 = sf.n.f12433a
            return r12
        L106:
            r12.getClass()
            r0 = 0
            r9.d0 r1 = r11.f11643h
            android.content.SharedPreferences r1 = r1.f11655c
            java.lang.String r2 = "red_packet_details_enable"
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 != 0) goto L117
            goto L151
        L117:
            java.lang.Object[] r0 = r12.args
            r1 = 0
            if (r0 == 0) goto L122
            r2 = 1
            java.lang.Object r0 = tf.l.C0(r2, r0)
            goto L123
        L122:
            r0 = r1
        L123:
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L12a
            java.lang.Number r0 = (java.lang.Number) r0
            goto L12b
        L12a:
            r0 = r1
        L12b:
            if (r0 == 0) goto L151
            long r2 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            lg.f r4 = r9.d0.K
            long r5 = r4.f8054g
            long r7 = r4.f8055h
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L144
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto L144
            r1 = r0
        L144:
            if (r1 == 0) goto L151
            long r0 = r1.longValue()
            java.lang.String r0 = r9.d0.x(r0)
            r12.setResult(r0)
        L151:
            sf.n r12 = sf.n.f12433a
            return r12
        L154:
            r12.getClass()
            r0 = 0
            r9.d0 r1 = r11.f11643h
            android.content.SharedPreferences r1 = r1.f11655c
            java.lang.String r2 = "skip_web_risk_enable"
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L169
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12.setResult(r0)
        L169:
            sf.n r12 = sf.n.f12433a
            return r12
        L16c:
            r12.getClass()
            r0 = 0
            r9.d0 r1 = r11.f11643h
            android.content.SharedPreferences r1 = r1.f11655c
            java.lang.String r2 = "skip_web_risk_enable"
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L181
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r12.setResult(r0)
        L181:
            sf.n r12 = sf.n.f12433a
            return r12
        L184:
            r12.getClass()
            java.lang.Object r0 = r12.thisObject
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L191
            android.app.Activity r0 = (android.app.Activity) r0
            goto L192
        L191:
            r0 = r2
        L192:
            if (r0 == 0) goto L1f8
            java.lang.String r1 = "group_member_history_enable"
            r9.d0 r3 = r11.f11643h
            android.content.SharedPreferences r4 = r3.f11655c
            r5 = 0
            boolean r1 = r4.getBoolean(r1, r5)
            if (r1 != 0) goto L1a2
            goto L1f8
        L1a2:
            java.lang.Object[] r1 = r12.args
            java.lang.String r4 = "历史发言记录"
            java.lang.String r6 = "hchat_group_member_history"
            if (r1 == 0) goto L1c6
            r7 = 1
            java.lang.Object r7 = tf.l.C0(r7, r1)
            if (r7 == 0) goto L1c6
            java.lang.String r8 = r9.d0.j0(r7)
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L1c7
            java.lang.String r8 = r9.d0.k0(r7)
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L1c6
            goto L1c7
        L1c6:
            r7 = r2
        L1c7:
            if (r7 == 0) goto L1cb
            r2 = r7
            goto L1ee
        L1cb:
            if (r1 == 0) goto L1ee
            int r7 = r1.length
        L1ce:
            if (r5 >= r7) goto L1ee
            r8 = r1[r5]
            if (r8 != 0) goto L1d5
            goto L1ea
        L1d5:
            java.lang.String r9 = r9.d0.j0(r8)
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L1ed
            java.lang.String r9 = r9.d0.k0(r8)
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L1ea
            goto L1ed
        L1ea:
            int r5 = r5 + 1
            goto L1ce
        L1ed:
            r2 = r8
        L1ee:
            if (r2 == 0) goto L1f8
            r3.e0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12.setResult(r0)
        L1f8:
            sf.n r12 = sf.n.f12433a
            return r12
        L1fb:
            r12.getClass()
            java.lang.Object r12 = r12.thisObject
            boolean r0 = r12 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L208
            android.app.Activity r12 = (android.app.Activity) r12
            goto L209
        L208:
            r12 = r1
        L209:
            if (r12 == 0) goto L245
            r0 = 0
            r9.d0 r2 = r11.f11643h
            android.content.SharedPreferences r3 = r2.f11655c
            java.lang.String r4 = "group_member_history_enable"
            boolean r0 = r3.getBoolean(r4, r0)
            if (r0 != 0) goto L219
            goto L245
        L219:
            android.view.Window r0 = r12.getWindow()
            if (r0 == 0) goto L224
            android.view.View r0 = r0.getDecorView()
            goto L225
        L224:
            r0 = r1
        L225:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L22c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L22d
        L22c:
            r0 = r1
        L22d:
            android.widget.ListView r0 = r9.d0.r(r0)
            if (r0 == 0) goto L238
            android.widget.ListAdapter r0 = r0.getAdapter()
            goto L239
        L238:
            r0 = r1
        L239:
            if (r0 == 0) goto L242
            boolean r0 = r2.D(r12, r0)
            if (r0 == 0) goto L242
            goto L245
        L242:
            r2.D(r12, r1)
        L245:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
