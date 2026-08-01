package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class rg1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f9371 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.ym1 f9372 = null;

    static {
            java.lang.String r5 = "requiredmsgcount"
            java.lang.String r6 = "requiredmessagecount"
            java.lang.String r0 = "msgcount"
            java.lang.String r1 = "messagecount"
            java.lang.String r2 = "sendcount"
            java.lang.String r3 = "targetmsgcount"
            java.lang.String r4 = "targetmessagecount"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.rg1.f9371 = r0
            ym1 r0 = new ym1
            java.lang.String r1 = "(\\d{1,3})\\s*条(?:消息)?"
            r0.<init>(r1)
            p000.rg1.f9372 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Integer m5087(java.lang.Object r4) {
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        Lf:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L4e
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Integer r0 = p000.x02.m6486(r0)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "\\d{1,3}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            r1 = 0
            ix0 r4 = p000.v71.m6032(r0, r1, r4)
            if (r4 == 0) goto L74
            java.util.regex.Matcher r4 = r4.f5234
            java.lang.String r4 = r4.group()
            r4.getClass()
            r0 = 10
            java.lang.Integer r4 = p000.x02.m6487(r4, r0)
            return r4
        L4d:
            return r0
        L4e:
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto L74
            java.lang.String r0 = "count"
            java.lang.String r1 = "num"
            java.lang.String r2 = "value"
            java.lang.String r3 = "text"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            ef r1 = new ef
            r2 = 14
            r1.<init>(r2, r4)
            y30 r4 = p000.us1.m5943(r0, r1)
            java.lang.Object r4 = p000.us1.m5953(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            return r4
        L74:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static p000.qg1 m5088(p000.tf1 r15) {
            r15.getClass()
            fg1 r0 = r15.m5632()
            fg1 r1 = p000.fg1.f3929
            r2 = 0
            if (r0 == r1) goto Le
            goto L1b7
        Le:
            org.json.JSONObject r0 = r15.f10366
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            l91 r5 = new l91
            r5.<init>(r0, r4)
            r1.add(r5)
        L22:
            boolean r0 = r1.isEmpty()
            r4 = 51
            r5 = 1
            if (r0 != 0) goto Lef
            java.lang.Object r0 = r1.removeFirst()
            l91 r0 = (p000.l91) r0
            java.lang.Object r6 = r0.f6502
            java.lang.Object r0 = r0.f6503
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r7 = 6
            if (r0 > r7) goto L22
            boolean r7 = r6 instanceof org.json.JSONObject
            if (r7 == 0) goto Lc5
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.util.Iterator r7 = r6.keys()
        L48:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L22
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.opt(r8)
            r8.getClass()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r11 = r8.length()
            r12 = r3
        L65:
            if (r12 >= r11) goto L77
            char r13 = r8.charAt(r12)
            boolean r14 = java.lang.Character.isLetterOrDigit(r13)
            if (r14 == 0) goto L74
            r10.append(r13)
        L74:
            int r12 = r12 + 1
            goto L65
        L77:
            java.lang.String r10 = r10.toString()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            r10.getClass()
            java.util.Set r11 = p000.rg1.f9371
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto Lae
            java.lang.Integer r10 = m5087(r9)
            if (r10 == 0) goto Lae
            int r11 = r10.intValue()
            if (r5 > r11) goto L9b
            if (r11 >= r4) goto L9b
            goto L9c
        L9b:
            r10 = r2
        L9c:
            if (r10 == 0) goto Lae
            int r0 = r10.intValue()
            qg1 r1 = new qg1
            java.lang.String r6 = "structured:"
            java.lang.String r6 = r6.concat(r8)
            r1.<init>(r6, r0)
            goto Lf0
        Lae:
            boolean r8 = r9 instanceof org.json.JSONObject
            if (r8 != 0) goto Lb6
            boolean r8 = r9 instanceof org.json.JSONArray
            if (r8 == 0) goto L48
        Lb6:
            int r8 = r0 + 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            l91 r10 = new l91
            r10.<init>(r9, r8)
            r1.add(r10)
            goto L48
        Lc5:
            boolean r4 = r6 instanceof org.json.JSONArray
            if (r4 == 0) goto L22
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r4 = r6.length()
            r5 = r3
        Ld0:
            if (r5 >= r4) goto L22
            java.lang.Object r7 = r6.opt(r5)
            boolean r8 = r7 instanceof org.json.JSONObject
            if (r8 != 0) goto Lde
            boolean r8 = r7 instanceof org.json.JSONArray
            if (r8 == 0) goto Lec
        Lde:
            int r8 = r0 + 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            l91 r9 = new l91
            r9.<init>(r7, r8)
            r1.add(r9)
        Lec:
            int r5 = r5 + 1
            goto Ld0
        Lef:
            r1 = r2
        Lf0:
            if (r1 == 0) goto Lf3
            return r1
        Lf3:
            java.lang.String r0 = r15.f10362
            java.lang.String r1 = r15.f10363
            java.lang.String r6 = r15.f10358
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r6}
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            nq1 r1 = new nq1
            r6 = 26
            r1.<init>(r6)
            y30 r6 = new y30
            r6.<init>(r0, r3, r1)
            x30 r0 = new x30
            r0.<init>(r6)
        L112:
            boolean r1 = r0.hasNext()
            r6 = 10
            if (r1 == 0) goto L161
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            ym1 r7 = p000.rg1.f9372
            r7.getClass()
            r1.getClass()
            java.util.regex.Pattern r7 = r7.f12688
            java.util.regex.Matcher r7 = r7.matcher(r1)
            r7.getClass()
            ix0 r1 = p000.v71.m6032(r7, r3, r1)
            if (r1 == 0) goto L112
            java.util.List r1 = r1.m2824()
            java.lang.Object r1 = p000.AbstractC0984xh.m6641(r5, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L112
            java.lang.Integer r1 = p000.x02.m6487(r1, r6)
            if (r1 == 0) goto L112
            int r6 = r1.intValue()
            if (r5 > r6) goto L152
            if (r6 >= r4) goto L152
            goto L153
        L152:
            r1 = r2
        L153:
            if (r1 == 0) goto L112
            int r15 = r1.intValue()
            qg1 r0 = new qg1
            java.lang.String r1 = "task-text"
            r0.<init>(r1, r15)
            return r0
        L161:
            java.lang.String r15 = r15.f10353
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            int r1 = r15.hashCode()
            r3 = 1591813689(0x5ee12639, float:8.1118587E18)
            if (r1 == r3) goto L194
            switch(r1) {
                case 1591810740: goto L18b;
                case 1591810741: goto L17d;
                case 1591810742: goto L174;
                default: goto L173;
            }
        L173:
            goto L19c
        L174:
            java.lang.String r1 = "601052"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto L19d
            goto L19c
        L17d:
            java.lang.String r0 = "601051"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L186
            goto L19c
        L186:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L19d
        L18b:
            java.lang.String r1 = "601050"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto L19d
            goto L19c
        L194:
            java.lang.String r1 = "601374"
            boolean r15 = r15.equals(r1)
            if (r15 != 0) goto L19d
        L19c:
            r0 = r2
        L19d:
            if (r0 == 0) goto L1b7
            int r15 = r0.intValue()
            if (r5 > r15) goto L1a8
            if (r15 >= r4) goto L1a8
            goto L1a9
        L1a8:
            r0 = r2
        L1a9:
            if (r0 == 0) goto L1b7
            int r15 = r0.intValue()
            qg1 r0 = new qg1
            java.lang.String r1 = "task-id-fallback"
            r0.<init>(r1, r15)
            return r0
        L1b7:
            return r2
    }
}
