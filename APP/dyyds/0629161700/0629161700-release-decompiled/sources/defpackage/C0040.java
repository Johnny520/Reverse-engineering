package defpackage;

/* JADX INFO: renamed from: ᛱᛲᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0040 f549 = null;

    static {
            r0 = -347278455250478(0xfffec426ef0961d2, double:NaN)
            r0 = -347334289825326(0xfffec419ef0961d2, double:NaN)
            r0 = -347415894203950(0xfffec406ef0961d2, double:NaN)
            ᛱᛲᛸᛲ r0 = new ᛱᛲᛸᛲ
            r0.<init>()
            defpackage.C0040.f549 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static defpackage.C1884 m369(android.content.Context r4) {
            r0 = 0
            ᛴᛱᲁᛸ r1 = defpackage.C0617.f3025     // Catch: java.lang.Exception -> L1f
            r1.getClass()     // Catch: java.lang.Exception -> L1f
            boolean r1 = defpackage.C0617.m1420(r4)     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto Ld
            return r0
        Ld:
            ᲁᛷᛵ r1 = new ᲁᛷᛵ     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = defpackage.C0617.m1417(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = defpackage.C0617.m1416(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = defpackage.C0617.m1418(r4)     // Catch: java.lang.Exception -> L1f
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Exception -> L1f
            return r1
        L1f:
            r4 = move-exception
            r1 = -344894748401198(0xfffec651ef0961d2, double:NaN)
            java.lang.String r1 = "创建WebDav实例失败"
            r2 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r2 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static org.json.JSONObject m370() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            java.util.LinkedHashMap r1 = defpackage.C1771.f7831
            java.util.Collection r1 = r1.values()
            r2 = -515516619202094(0xfffe2b23ef0961d2, double:NaN)
            java.util.List r1 = defpackage.AbstractC1107.m2113(r1)
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()
            ᛷᛵᲇᛴ r2 = (defpackage.C1283) r2
            java.lang.String r3 = r2.f5713
            ᲇᛱᲈᲀ r2 = r2.f5712
            java.lang.Object r2 = r2.mo1032()
            ᛱᛲᛸᛲ r4 = defpackage.C0040.f549
            r4.getClass()
            boolean r4 = r2 instanceof java.util.Set
            if (r4 == 0) goto L58
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r2.next()
            r4.put(r5)
            goto L48
        L56:
            r2 = r4
            goto L67
        L58:
            boolean r4 = r2 instanceof java.lang.Float
            if (r4 == 0) goto L67
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            double r4 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
        L67:
            r0.put(r3, r2)
            goto L20
        L6b:
            r1 = -345775216696878(0xfffec584ef0961d2, double:NaN)
            java.lang.String r1 = "backupTime"
            long r2 = java.lang.System.currentTimeMillis()
            r0.put(r1, r2)
            r1 = -345822461337134(0xfffec579ef0961d2, double:NaN)
            java.lang.String r1 = "backupVersion"
            r2 = -345882590879278(0xfffec56bef0961d2, double:NaN)
            java.lang.String r2 = "260629161700"
            r0.put(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static void m371(org.json.JSONObject r8) {
            r0 = -345938425454126(0xfffec55eef0961d2, double:NaN)
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            java.util.LinkedHashMap r0 = defpackage.C1771.f7831
            java.util.Collection r0 = r0.values()
            r1 = -515516619202094(0xfffe2b23ef0961d2, double:NaN)
            java.util.List r0 = defpackage.AbstractC1107.m2113(r0)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L154
            java.lang.Object r1 = r0.next()
            ᛷᛵᲇᛴ r1 = (defpackage.C1283) r1
            java.lang.String r2 = r1.f5713
            boolean r3 = r8.has(r2)
            if (r3 == 0) goto L23
            boolean r3 = r8.isNull(r2)
            if (r3 == 0) goto L3e
            goto L23
        L3e:
            ᛷᛷᲀᛳ r3 = r1.f5711
            java.lang.Object r1 = r1.f5714
            ᛱᛲᛸᛲ r4 = defpackage.C0040.f549
            r4.getClass()
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L53
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r8.optString(r2, r1)
            goto L14f
        L53:
            boolean r4 = r1 instanceof java.lang.Boolean
            if (r4 == 0) goto L67
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r1 = r8.optBoolean(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L14f
        L67:
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L7b
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r8.optInt(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L14f
        L7b:
            boolean r4 = r1 instanceof java.lang.Long
            if (r4 == 0) goto L8f
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            long r1 = r8.optLong(r2, r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L14f
        L8f:
            boolean r4 = r1 instanceof java.lang.Float
            if (r4 == 0) goto La5
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            double r4 = (double) r1
            double r1 = r8.optDouble(r2, r4)
            float r1 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L14f
        La5:
            boolean r4 = r1 instanceof java.util.Set
            if (r4 == 0) goto L14b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lb4:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lc6
            java.lang.Object r5 = r1.next()
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto Lb4
            r4.add(r5)
            goto Lb4
        Lc6:
            java.util.Set r1 = defpackage.AbstractC1107.m2121(r4)
            org.json.JSONArray r4 = r8.optJSONArray(r2)
            if (r4 == 0) goto Lfb
            ᛸᲇᲈᲀ r1 = new ᛸᲇᲈᲀ
            r1.<init>()
            int r2 = r4.length()
            r5 = 0
        Lda:
            if (r5 >= r2) goto Lf0
            java.lang.String r6 = r4.optString(r5)
            int r7 = r6.length()
            if (r7 <= 0) goto Le7
            goto Le8
        Le7:
            r6 = 0
        Le8:
            if (r6 == 0) goto Led
            r1.add(r6)
        Led:
            int r5 = r5 + 1
            goto Lda
        Lf0:
            ᛸᲇᲈᲀ r1 = defpackage.AbstractC0425.m1192(r1)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>(r1)
        Lf9:
            r1 = r2
            goto L14f
        Lfb:
            boolean r4 = r8.has(r2)
            if (r4 != 0) goto L107
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>(r1)
            goto Lf9
        L107:
            java.lang.String r1 = r8.optString(r2)
            r4 = -345959900290606(0xfffec559ef0961d2, double:NaN)
            r4 = -346024324800046(0xfffec54aef0961d2, double:NaN)
            java.lang.String r2 = ","
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r4 = 6
            java.util.List r1 = defpackage.AbstractC1347.m2519(r1, r2, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L12e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L145
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L12e
            r2.add(r4)
            goto L12e
        L145:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r2)
            goto L14f
        L14b:
            java.lang.Object r1 = r8.opt(r2)
        L14f:
            r3.mo617(r1)
            goto L23
        L154:
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.lang.Object m372(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C1581
            if (r0 == 0) goto L13
            r0 = r6
            ᛸᲇᛳᛴ r0 = (defpackage.C1581) r0
            int r1 = r0.f6997
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6997 = r1
            goto L18
        L13:
            ᛸᲇᛳᛴ r0 = new ᛸᲇᛳᛴ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f6998
            int r6 = r0.f6997
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L33
            if (r6 != r2) goto L26
            defpackage.AbstractC0762.m1680(r4)
            goto L4a
        L26:
            r4 = -346866138390062(0xfffec486ef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            return r1
        L33:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛳ r4 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r4 = defpackage.ExecutorC0679.f3269
            ᲁᲀᲇᛱ r6 = new ᲁᲀᲇᛱ
            r6.<init>(r5, r1)
            r0.f6997 = r2
            java.lang.Object r4 = defpackage.AbstractC0397.m1144(r4, r6, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L4a
            return r5
        L4a:
            ᲇᲈᛸᛶ r4 = (defpackage.C2165) r4
            java.lang.Object r4 = r4.f9224
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final java.lang.Object m373(java.lang.String r9, java.lang.String r10, java.lang.String r11, defpackage.AbstractC1016 r12) {
            r8 = this;
            boolean r0 = r12 instanceof defpackage.C0487
            if (r0 == 0) goto L13
            r0 = r12
            ᛳᛵᛸᛵ r0 = (defpackage.C0487) r0
            int r1 = r0.f2427
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2427 = r1
            goto L18
        L13:
            ᛳᛵᛸᛵ r0 = new ᛳᛵᛸᛵ
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r8 = r0.f2428
            int r12 = r0.f2427
            r1 = 1
            if (r12 == 0) goto L33
            if (r12 != r1) goto L25
            defpackage.AbstractC0762.m1680(r8)
            goto L4f
        L25:
            r8 = -344950582976046(0xfffec644ef0961d2, double:NaN)
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r8)
            r8 = 0
            return r8
        L33:
            defpackage.AbstractC0762.m1680(r8)
            ᛶᛸᛳ r8 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r8 = defpackage.ExecutorC0679.f3269
            ᛸᲈᲇᛴ r2 = new ᛸᲈᲇᛴ
            r7 = 1
            r6 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r0.f2427 = r1
            java.lang.Object r8 = defpackage.AbstractC0397.m1144(r8, r2, r0)
            ᛴᛵ r9 = defpackage.EnumC0670.f3246
            if (r8 != r9) goto L4f
            return r9
        L4f:
            ᲇᲈᛸᛶ r8 = (defpackage.C2165) r8
            java.lang.Object r8 = r8.f9224
            return r8
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.lang.Object m374(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C2159
            if (r0 == 0) goto L13
            r0 = r6
            ᲇᲈᛳᛳ r0 = (defpackage.C2159) r0
            int r1 = r0.f9178
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9178 = r1
            goto L18
        L13:
            ᲇᲈᛳᛳ r0 = new ᲇᲈᛳᛳ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f9179
            int r6 = r0.f9178
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L33
            if (r6 != r2) goto L26
            defpackage.AbstractC0762.m1680(r4)
            goto L4b
        L26:
            r4 = -345362899836462(0xfffec5e4ef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            return r1
        L33:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛳ r4 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r4 = defpackage.ExecutorC0679.f3269
            ᲇᛷᲇᛲ r6 = new ᲇᛷᲇᛲ
            r3 = 4
            r6.<init>(r5, r1, r3)
            r0.f9178 = r2
            java.lang.Object r4 = defpackage.AbstractC0397.m1144(r4, r6, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L4b
            return r5
        L4b:
            ᲇᲈᛸᛶ r4 = (defpackage.C2165) r4
            java.lang.Object r4 = r4.f9224
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object m375(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C0809
            if (r0 == 0) goto L13
            r0 = r6
            ᛵᛱᛳᲈ r0 = (defpackage.C0809) r0
            int r1 = r0.f3729
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3729 = r1
            goto L18
        L13:
            ᛵᛱᛳᲈ r0 = new ᛵᛱᛳᲈ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f3730
            int r6 = r0.f3729
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L33
            if (r6 != r2) goto L26
            defpackage.AbstractC0762.m1680(r4)
            goto L4a
        L26:
            r4 = -346659979959854(0xfffec4b6ef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            return r1
        L33:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛳ r4 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r4 = defpackage.ExecutorC0679.f3269
            ᲇᛷᲇᛲ r6 = new ᲇᛷᲇᛲ
            r6.<init>(r5, r1, r2)
            r0.f3729 = r2
            java.lang.Object r4 = defpackage.AbstractC0397.m1144(r4, r6, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L4a
            return r5
        L4a:
            ᲇᲈᛸᛶ r4 = (defpackage.C2165) r4
            java.lang.Object r4 = r4.f9224
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m376(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C1970
            if (r0 == 0) goto L13
            r0 = r6
            ᲁᲈᲀᛲ r0 = (defpackage.C1970) r0
            int r1 = r0.f8548
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8548 = r1
            goto L18
        L13:
            ᲁᲈᲀᛲ r0 = new ᲁᲈᲀᛲ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f8549
            int r6 = r0.f8548
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L33
            if (r6 != r2) goto L26
            defpackage.AbstractC0762.m1680(r4)
            goto L4b
        L26:
            r4 = -345156741406254(0xfffec614ef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            return r1
        L33:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛳ r4 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r4 = defpackage.ExecutorC0679.f3269
            ᲇᛷᲇᛲ r6 = new ᲇᛷᲇᛲ
            r3 = 0
            r6.<init>(r5, r1, r3)
            r0.f8548 = r2
            java.lang.Object r4 = defpackage.AbstractC0397.m1144(r4, r6, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L4b
            return r5
        L4b:
            ᲇᲈᛸᛶ r4 = (defpackage.C2165) r4
            java.lang.Object r4 = r4.f9224
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object m377(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C2352
            if (r0 == 0) goto L13
            r0 = r6
            ᲈᲇᛶᲁ r0 = (defpackage.C2352) r0
            int r1 = r0.f10148
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10148 = r1
            goto L18
        L13:
            ᲈᲇᛶᲁ r0 = new ᲈᲇᛶᲁ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f10149
            int r1 = r0.f10148
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L29
            defpackage.AbstractC0762.m1680(r6)
            ᲇᲈᛸᛶ r6 = (defpackage.C2165) r6
            java.lang.Object r4 = r6.f9224
            goto L50
        L29:
            r4 = -346140288917038(0xfffec52fef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            r4 = 0
            return r4
        L37:
            defpackage.AbstractC0762.m1680(r6)
            ᛴᛱᲁᛸ r6 = defpackage.C0617.f3025
            r6.getClass()
            boolean r6 = defpackage.C0617.m1415(r5)
            if (r6 == 0) goto Lca
            r0.f10148 = r2
            java.lang.Object r4 = r4.m376(r5, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L50
            return r5
        L50:
            boolean r5 = r4 instanceof defpackage.C0723
            if (r5 != 0) goto La5
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r0 = -346032914734638(0xfffec548ef0961d2, double:NaN)
            java.lang.String r0 = "自动备份配置: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r0 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r6 = r5.length()
            if (r6 != 0) goto L83
            goto La5
        L83:
            int r6 = r5.length()
            r0 = 0
        L88:
            if (r0 >= r6) goto La5
            int r1 = r0 + 2000
            if (r1 <= r6) goto L8f
            r1 = r6
        L8f:
            java.lang.String r0 = r5.substring(r0, r1)
            r2 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1040(r0)
            r0 = r1
            goto L88
        La5:
            java.lang.Throwable r4 = defpackage.C2165.m3569(r4)
            if (r4 == 0) goto Lca
            r5 = -346071569440302(0xfffec53fef0961d2, double:NaN)
            java.lang.String r5 = "自动备份配置失败: "
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto Lc3
            r0 = -346118814080558(0xfffec534ef0961d2, double:NaN)
            java.lang.String r4 = "恢复失败"
        Lc3:
            java.lang.String r4 = r5.concat(r4)
            defpackage.AbstractC0209.m764(r4)
        Lca:
            ᲁᲀᛱᲁ r4 = defpackage.C1907.f8270
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m378(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C1641
            if (r0 == 0) goto L13
            r0 = r6
            ᲀᛳᛱᲇ r0 = (defpackage.C1641) r0
            int r1 = r0.f7326
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7326 = r1
            goto L18
        L13:
            ᲀᛳᛱᲇ r0 = new ᲀᛳᛱᲇ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f7327
            int r1 = r0.f7326
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L29
            defpackage.AbstractC0762.m1680(r6)
            ᲇᲈᛸᛶ r6 = (defpackage.C2165) r6
            java.lang.Object r4 = r6.f9224
            goto L50
        L29:
            r4 = -346453821529646(0xfffec4e6ef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            r4 = 0
            return r4
        L37:
            defpackage.AbstractC0762.m1680(r6)
            ᛴᛱᲁᛸ r6 = defpackage.C0617.f3025
            r6.getClass()
            boolean r6 = defpackage.C0617.m1415(r5)
            if (r6 == 0) goto Lca
            r0.f7326 = r2
            java.lang.Object r4 = r4.m375(r5, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L50
            return r5
        L50:
            boolean r5 = r4 instanceof defpackage.C0723
            if (r5 != 0) goto La5
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r0 = -346346447347246(0xfffec4ffef0961d2, double:NaN)
            java.lang.String r0 = "自动备份插眼: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r0 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r6 = r5.length()
            if (r6 != 0) goto L83
            goto La5
        L83:
            int r6 = r5.length()
            r0 = 0
        L88:
            if (r0 >= r6) goto La5
            int r1 = r0 + 2000
            if (r1 <= r6) goto L8f
            r1 = r6
        L8f:
            java.lang.String r0 = r5.substring(r0, r1)
            r2 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1040(r0)
            r0 = r1
            goto L88
        La5:
            java.lang.Throwable r4 = defpackage.C2165.m3569(r4)
            if (r4 == 0) goto Lca
            r5 = -346385102052910(0xfffec4f6ef0961d2, double:NaN)
            java.lang.String r5 = "自动备份插眼失败: "
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto Lc3
            r0 = -346432346693166(0xfffec4ebef0961d2, double:NaN)
            java.lang.String r4 = "备份失败"
        Lc3:
            java.lang.String r4 = r5.concat(r4)
            defpackage.AbstractC0209.m764(r4)
        Lca:
            ᲁᲀᛱᲁ r4 = defpackage.C1907.f8270
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object m379(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C2062
            if (r0 == 0) goto L13
            r0 = r6
            ᲇᛶᛲᛷ r0 = (defpackage.C2062) r0
            int r1 = r0.f8862
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8862 = r1
            goto L18
        L13:
            ᲇᛶᛲᛷ r0 = new ᲇᛶᛲᛷ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f8863
            int r6 = r0.f8862
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L33
            if (r6 != r2) goto L26
            defpackage.AbstractC0762.m1680(r4)
            goto L4b
        L26:
            r4 = -345569058266670(0xfffec5b4ef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            return r1
        L33:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛳ r4 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r4 = defpackage.ExecutorC0679.f3269
            ᲇᛷᲇᛲ r6 = new ᲇᛷᲇᛲ
            r3 = 2
            r6.<init>(r5, r1, r3)
            r0.f8862 = r2
            java.lang.Object r4 = defpackage.AbstractC0397.m1144(r4, r6, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L4b
            return r5
        L4b:
            ᲇᲈᛸᛶ r4 = (defpackage.C2165) r4
            java.lang.Object r4 = r4.f9224
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Object m380(android.content.Context r5, defpackage.AbstractC1016 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C0808
            if (r0 == 0) goto L13
            r0 = r6
            ᛵᛱᛳᛸ r0 = (defpackage.C0808) r0
            int r1 = r0.f3726
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3726 = r1
            goto L18
        L13:
            ᛵᛱᛳᛸ r0 = new ᛵᛱᛳᛸ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f3727
            int r6 = r0.f3726
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L33
            if (r6 != r2) goto L26
            defpackage.AbstractC0762.m1680(r4)
            goto L4b
        L26:
            r4 = -347072296820270(0xfffec456ef0961d2, double:NaN)
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r4)
            return r1
        L33:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛳ r4 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r4 = defpackage.ExecutorC0679.f3269
            ᲇᛷᲇᛲ r6 = new ᲇᛷᲇᛲ
            r3 = 3
            r6.<init>(r5, r1, r3)
            r0.f3726 = r2
            java.lang.Object r4 = defpackage.AbstractC0397.m1144(r4, r6, r0)
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            if (r4 != r5) goto L4b
            return r5
        L4b:
            ᲇᲈᛸᛶ r4 = (defpackage.C2165) r4
            java.lang.Object r4 = r4.f9224
            return r4
    }
}
