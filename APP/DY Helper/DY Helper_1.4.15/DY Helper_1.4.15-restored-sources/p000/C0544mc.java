package p000;

/* JADX INFO: renamed from: mc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0544mc implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7061;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ long f7062;

    public /* synthetic */ C0544mc(int r1, long r2) {
            r0 = this;
            r0.f7061 = r1
            r0.f7062 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r27) {
            r26 = this;
            r0 = r26
            int r1 = r0.f7061
            switch(r1) {
                case 0: goto L2a2;
                case 1: goto L27f;
                case 2: goto L25e;
                case 3: goto L24a;
                case 4: goto L225;
                case 5: goto L34;
                case 6: goto L1d;
                default: goto L7;
            }
        L7:
            r1 = r27
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = r0.f7062
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1d:
            r1 = r27
            ed1 r1 = (p000.ed1) r1
            r1.getClass()
            long r1 = r1.f3499
            long r3 = r0.f7062
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L34:
            r1 = r27
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r1.getClass()
            java.lang.String r2 = "field"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            r3 = 0
            if (r2 != 0) goto L46
            goto L224
        L46:
            java.lang.String r4 = "coordinate"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            java.lang.String r5 = "decorate_uuid"
            java.lang.String r7 = p000.xn0.m6740(r5, r1)
            if (r7 != 0) goto L56
            goto L224
        L56:
            java.lang.String r5 = "status"
            java.lang.Integer r5 = p000.xn0.m6736(r5, r2)
            java.lang.String r6 = "seed_id"
            java.lang.Integer r6 = p000.xn0.m6736(r6, r2)
            if (r6 == 0) goto L6c
            int r8 = r6.intValue()
            if (r8 <= 0) goto L6c
            r10 = r6
            goto L6d
        L6c:
            r10 = r3
        L6d:
            java.lang.String r6 = "planting_time"
            java.lang.String r6 = p000.xn0.m6740(r6, r2)
            java.lang.Long r11 = p000.xn0.m6746(r6)
            java.lang.String r6 = "watering_saved_time"
            java.lang.Object r6 = r2.opt(r6)
            boolean r8 = r6 instanceof java.lang.Number
            if (r8 == 0) goto L8c
            java.lang.Number r6 = (java.lang.Number) r6
            long r8 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            goto La3
        L8c:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto La2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Double r6 = p000.w02.m6298(r6)
            if (r6 == 0) goto La2
            double r8 = r6.doubleValue()
            long r8 = (long) r8
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            goto La3
        La2:
            r6 = r3
        La3:
            r8 = 0
            if (r6 == 0) goto Lb2
            long r12 = r6.longValue()
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto Lb0
            r12 = r8
        Lb0:
            r13 = r12
            goto Lb3
        Lb2:
            r13 = r8
        Lb3:
            java.lang.String r6 = "growth_time"
            java.lang.String r12 = p000.xn0.m6740(r6, r2)
            if (r12 == 0) goto Lc4
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r12 = r12.toString()
            goto Lc5
        Lc4:
            r12 = r3
        Lc5:
            if (r12 != 0) goto Lc9
            java.lang.String r12 = ""
        Lc9:
            int r15 = r12.length()
            r16 = 0
            r18 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r15 != 0) goto Ld8
        Ld6:
            r12 = r3
            goto L12e
        Ld8:
            java.lang.Double r15 = p000.w02.m6298(r12)
            if (r15 == 0) goto L129
            double r20 = r15.doubleValue()
            double r20 = java.lang.Math.abs(r20)
            int r20 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r20 > 0) goto L129
            double r20 = r15.doubleValue()
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 < 0) goto L129
            r20 = r8
            double r8 = r15.doubleValue()
            long r8 = (long) r8
            r22 = 946684800(0x386d4380, double:4.67724437E-315)
            int r12 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            r22 = 1000(0x3e8, double:4.94E-321)
            if (r12 < 0) goto L113
            r20 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r12 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r12 >= 0) goto L10d
            long r8 = r8 * r22
        L10d:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
        L111:
            r12 = r8
            goto L12e
        L113:
            if (r11 == 0) goto Ld6
            long r24 = r11.longValue()
            long r8 = r8 - r13
            int r12 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r12 >= 0) goto L120
            r8 = r20
        L120:
            long r8 = r8 * r22
            long r8 = r8 + r24
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L111
        L129:
            java.lang.Long r8 = p000.xn0.m6746(r12)
            goto L111
        L12e:
            r8 = 1
            if (r5 != 0) goto L132
            goto L13c
        L132:
            int r9 = r5.intValue()
            if (r9 != 0) goto L13c
            mc1 r0 = p000.mc1.f7068
        L13a:
            r9 = r0
            goto L167
        L13c:
            if (r5 != 0) goto L13f
            goto L148
        L13f:
            int r9 = r5.intValue()
            if (r9 != r8) goto L148
            mc1 r0 = p000.mc1.f7069
            goto L13a
        L148:
            if (r5 != 0) goto L14b
            goto L164
        L14b:
            int r5 = r5.intValue()
            r9 = 2
            if (r5 != r9) goto L164
            if (r12 == 0) goto L161
            long r20 = r12.longValue()
            long r8 = r0.f7062
            int r0 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r0 > 0) goto L161
            mc1 r0 = p000.mc1.f7071
            goto L13a
        L161:
            mc1 r0 = p000.mc1.f7070
            goto L13a
        L164:
            mc1 r0 = p000.mc1.f7072
            goto L13a
        L167:
            lc1 r0 = new lc1
            java.lang.String r5 = "item_id"
            java.lang.Integer r8 = p000.xn0.m6736(r5, r1)
            java.lang.String r1 = "is_double_income"
            java.lang.Object r1 = r2.opt(r1)
            boolean r5 = r1 instanceof java.lang.Boolean
            if (r5 == 0) goto L181
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r15 = r1
            goto L1a7
        L181:
            boolean r5 = r1 instanceof java.lang.Number
            r15 = 0
            if (r5 == 0) goto L190
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L1a7
        L18e:
            r15 = 1
            goto L1a7
        L190:
            boolean r5 = r1 instanceof java.lang.String
            if (r5 == 0) goto L1a7
            java.lang.String r5 = "1"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L18e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = "true"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L1a7
            goto L18e
        L1a7:
            if (r4 == 0) goto L1b0
            java.lang.String r1 = "x"
            java.lang.Integer r1 = p000.xn0.m6736(r1, r4)
            goto L1b1
        L1b0:
            r1 = r3
        L1b1:
            if (r4 == 0) goto L1ba
            java.lang.String r5 = "y"
            java.lang.Integer r4 = p000.xn0.m6736(r5, r4)
            goto L1bb
        L1ba:
            r4 = r3
        L1bb:
            java.lang.String r5 = p000.xn0.m6740(r6, r2)
            if (r5 == 0) goto L1f7
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L1f7
            java.lang.Double r5 = p000.w02.m6298(r5)
            if (r5 == 0) goto L1f7
            double r20 = r5.doubleValue()
            double r22 = java.lang.Math.abs(r20)
            int r6 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r6 > 0) goto L1eb
            int r6 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r6 < 0) goto L1eb
            r16 = 4741224576053149696(0x41cc36a1c0000000, double:9.466848E8)
            int r6 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r6 >= 0) goto L1eb
            goto L1ec
        L1eb:
            r5 = r3
        L1ec:
            if (r5 == 0) goto L1f7
            double r5 = r5.doubleValue()
            long r5 = (long) r5
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
        L1f7:
            r18 = r3
            java.lang.String r3 = "watering_count"
            java.lang.Integer r3 = p000.xn0.m6736(r3, r2)
            if (r3 != 0) goto L207
            java.lang.String r3 = "water_times"
            java.lang.Integer r3 = p000.xn0.m6736(r3, r2)
        L207:
            r19 = r3
            java.lang.String r3 = "last_watering_time"
            java.lang.String r3 = p000.xn0.m6740(r3, r2)
            if (r3 != 0) goto L217
            java.lang.String r3 = "watering_time"
            java.lang.String r3 = p000.xn0.m6740(r3, r2)
        L217:
            java.lang.Long r20 = p000.xn0.m6746(r3)
            r6 = r0
            r16 = r1
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r3 = r6
        L224:
            return r3
        L225:
            r1 = r27
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.Object r1 = r1.getValue()
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            long r3 = r0.f7062
            long r3 = r3 - r1
            r0 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L244
            r0 = 1
            goto L245
        L244:
            r0 = 0
        L245:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L24a:
            r1 = r27
            cw r1 = (p000.InterfaceC0190cw) r1
            r1.getClass()
            r6 = 0
            r7 = 126(0x7e, float:1.77E-43)
            long r2 = r0.f7062
            r4 = 0
            p000.InterfaceC0190cw.m1617(r1, r2, r4, r6, r7)
            s62 r0 = p000.s62.f9751
            return r0
        L25e:
            r1 = r27
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.Object r1 = r1.getValue()
            cj r1 = (p000.C0115cj) r1
            long r1 = r1.f2159
            long r3 = r0.f7062
            long r3 = r3 - r1
            r0 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L279
            r0 = 1
            goto L27a
        L279:
            r0 = 0
        L27a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L27f:
            r1 = r27
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = r0.f7062
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L29c
            r3 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L29c
            r3 = 14400001(0xdbba01, double:7.114546E-317)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L29c
            r0 = 1
            goto L29d
        L29c:
            r0 = 0
        L29d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2a2:
            long r0 = r0.f7062
            r2 = r27
            nc r2 = (p000.C0581nc) r2
            a80 r3 = r2.f7512
            if (r3 != 0) goto L2ad
            goto L2c4
        L2ad:
            ae r2 = r2.f7511
            if (r2 == 0) goto L2c4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L2ba
            java.lang.Object r0 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L2ba
            goto L2c1
        L2ba:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L2c1:
            r2.mo75(r0)
        L2c4:
            s62 r0 = p000.s62.f9751
            return r0
    }
}
