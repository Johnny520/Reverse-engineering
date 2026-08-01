package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 {

    /* JADX INFO: renamed from: α */
    public static final p000.lb1 f6537 = null;

    static {
            lb1 r0 = new lb1
            r0.<init>()
            p000.lb1.f6537 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static org.json.JSONObject m3541(int r3, java.lang.Object r4) {
            if (r4 == 0) goto L5b
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r4 == r0) goto L5b
            r0 = 6
            if (r3 <= r0) goto La
            goto L5b
        La:
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto L36
            r0 = r4
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "pet"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            if (r1 == 0) goto L1a
            return r0
        L1a:
            java.util.Iterator r0 = r0.keys()
            r0.getClass()
            ss1 r0 = p000.us1.m5951(r0)
            ya1 r1 = new ya1
            r2 = 4
            r1.<init>(r3, r2, r4)
            y30 r3 = p000.us1.m5943(r0, r1)
            java.lang.Object r3 = p000.us1.m5953(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            return r3
        L36:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L5b
            r0 = r4
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            int r0 = r0.length()
            r1 = 0
            xm0 r0 = p000.j81.m2893(r1, r0)
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            ya1 r1 = new ya1
            r2 = 5
            r1.<init>(r3, r2, r4)
            y30 r3 = p000.us1.m5943(r0, r1)
            java.lang.Object r3 = p000.us1.m5953(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            return r3
        L5b:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.Long m3542(java.lang.Object r6) {
            boolean r0 = r6 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.Number r6 = (java.lang.Number) r6
            long r2 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            goto L2d
        L10:
            if (r6 == 0) goto L2c
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1b
            goto L2c
        L1b:
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Long r6 = p000.x02.m6488(r6)
            goto L2d
        L2c:
            r6 = r1
        L2d:
            if (r6 == 0) goto L3a
            long r2 = r6.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3a
            return r6
        L3a:
            return r1
    }

    /* JADX INFO: renamed from: α */
    public final p000.kb1 m3543(org.json.JSONObject r27, long r28, long r30) {
            r26 = this;
            r27.getClass()
            r0 = 0
            int r2 = (r28 > r0 ? 1 : (r28 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1f6
            int r0 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1ef
            r0 = 0
            r1 = r27
            org.json.JSONObject r1 = m3541(r0, r1)
            if (r1 != 0) goto L27
            kb1 r2 = new kb1
            r10 = 0
            r11 = 0
            jz r3 = p000.C0450jz.f5672
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L27:
            java.lang.String r2 = "pet"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            if (r2 != 0) goto L34
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
        L34:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r5 = r2.length()
            r6 = r0
            r9 = r6
            r13 = r9
            r14 = r13
            r15 = r14
            r16 = r15
        L49:
            r7 = 0
            if (r6 >= r5) goto L163
            org.json.JSONObject r8 = r2.optJSONObject(r6)
            if (r8 != 0) goto L54
            goto L15e
        L54:
            java.lang.String r10 = "relation"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            if (r10 != 0) goto L5e
            goto L15e
        L5e:
            int r13 = r13 + 1
            java.lang.String r11 = "conversation_id"
            java.lang.Object r11 = r10.opt(r11)
            if (r11 == 0) goto La7
            java.lang.Object r12 = org.json.JSONObject.NULL
            if (r11 != r12) goto L6d
            r11 = r7
        L6d:
            if (r11 == 0) goto La7
            java.lang.String r11 = r11.toString()
            if (r11 == 0) goto La7
            java.lang.CharSequence r11 = p000.q02.m4660(r11)
            java.lang.String r11 = r11.toString()
            if (r11 == 0) goto La7
            int r12 = r11.length()
            r0 = 3
            if (r0 > r12) goto La7
            r0 = 257(0x101, float:3.6E-43)
            if (r12 >= r0) goto La7
            java.lang.String r0 = "0"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto La7
            r0 = 0
        L93:
            int r12 = r11.length()
            if (r0 >= r12) goto La8
            char r12 = r11.charAt(r0)
            boolean r12 = p000.jx0.m3020(r12)
            if (r12 == 0) goto La4
            goto La7
        La4:
            int r0 = r0 + 1
            goto L93
        La7:
            r11 = r7
        La8:
            if (r11 == 0) goto Lac
            int r14 = r14 + 1
        Lac:
            java.lang.String r0 = "conversation_short_id"
            java.lang.Object r12 = r8.opt(r0)
            java.lang.Object r0 = r10.opt(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            ny0 r18 = new ny0
            r24 = 0
            r25 = 11
            r19 = 1
            java.lang.Class<lb1> r21 = p000.lb1.class
            java.lang.String r22 = "toPositiveLong"
            java.lang.String r23 = "toPositiveLong(Ljava/lang/Object;)Ljava/lang/Long;"
            r20 = r26
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r12 = r18
            y30 r0 = p000.us1.m5943(r0, r12)
            java.lang.Object r0 = p000.us1.m5953(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.String r12 = "friend"
            org.json.JSONObject r12 = r10.optJSONObject(r12)
            if (r12 == 0) goto Leb
            java.lang.String r7 = "user_id"
            java.lang.Object r7 = r12.opt(r7)
        Leb:
            java.lang.Long r7 = m3542(r7)
            if (r7 == 0) goto Lf3
            int r15 = r15 + 1
        Lf3:
            if (r11 == 0) goto L107
            r12 = 10
            java.lang.Long r12 = p000.x02.m6489(r11, r12)
            if (r12 != 0) goto Lfe
            goto L107
        Lfe:
            long r18 = r12.longValue()
            int r12 = (r18 > r28 ? 1 : (r18 == r28 ? 0 : -1))
            if (r12 != 0) goto L107
            goto L11d
        L107:
            if (r0 == 0) goto L112
            long r18 = r0.longValue()
            int r0 = (r18 > r28 ? 1 : (r18 == r28 ? 0 : -1))
            if (r0 != 0) goto L15e
            goto L11d
        L112:
            if (r7 != 0) goto L115
            goto L15e
        L115:
            long r18 = r7.longValue()
            int r0 = (r18 > r30 ? 1 : (r18 == r30 ? 0 : -1))
            if (r0 != 0) goto L15e
        L11d:
            int r9 = r9 + 1
            java.lang.String r0 = "sec_pet_id"
            java.lang.Object r7 = r8.opt(r0)
            java.lang.Object r0 = r10.opt(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            f71 r7 = new f71
            r8 = 13
            r7.<init>(r8)
            y30 r0 = p000.us1.m5943(r0, r7)
            cu r0 = p000.us1.m5952(r0)
            java.util.Iterator r0 = r0.iterator()
        L144:
            r7 = r0
            σ r7 = (p000.AbstractC1095) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L159
            java.lang.Object r7 = r7.next()
            java.lang.String r7 = (java.lang.String) r7
            r3.add(r7)
            int r16 = r16 + 1
            goto L144
        L159:
            if (r11 == 0) goto L15e
            r4.add(r11)
        L15e:
            int r6 = r6 + 1
            r0 = 0
            goto L49
        L163:
            kb1 r0 = new kb1
            java.util.List r8 = p000.AbstractC0984xh.m6666(r3)
            java.lang.String r3 = "has_more"
            java.lang.Object r3 = r1.opt(r3)
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L17b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r10 = r3
            goto L1a5
        L17b:
            boolean r5 = r3 instanceof java.lang.Number
            r6 = 1
            if (r5 == 0) goto L18c
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == 0) goto L18a
        L188:
            r10 = r6
            goto L1a5
        L18a:
            r10 = 0
            goto L1a5
        L18c:
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r10 = "1"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L188
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "true"
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L18a
            goto L188
        L1a5:
            java.lang.String r3 = "offset"
            java.lang.Object r1 = r1.opt(r3)
            boolean r3 = r1 instanceof java.lang.Number
            if (r3 == 0) goto L1ba
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L1d7
        L1ba:
            if (r1 == 0) goto L1d6
            java.lang.Object r3 = org.json.JSONObject.NULL
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L1c5
            goto L1d6
        L1c5:
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Integer r1 = p000.x02.m6486(r1)
            goto L1d7
        L1d6:
            r1 = r7
        L1d7:
            if (r1 == 0) goto L1e1
            int r3 = r1.intValue()
            if (r3 < 0) goto L1e1
            r11 = r1
            goto L1e2
        L1e1:
            r11 = r7
        L1e2:
            int r12 = r2.length()
            java.util.List r17 = p000.AbstractC0984xh.m6666(r4)
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r7
        L1ef:
            java.lang.String r0 = "otherUid 必须大于 0"
            p000.C1080.m7275(r0)
        L1f4:
            r0 = 0
            return r0
        L1f6:
            java.lang.String r0 = "conversationShortId 必须大于 0"
            p000.C1080.m7275(r0)
            goto L1f4
    }
}
