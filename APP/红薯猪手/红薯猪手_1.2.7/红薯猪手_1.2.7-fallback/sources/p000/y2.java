package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y2 extends p000.za {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f1188 = false;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean f1189 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f1190 = false;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static java.lang.String f1191 = "";

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static java.lang.String f1192 = "";

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static java.lang.String f1193;

    public static final class a {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m467(org.json.JSONArray r16) {
                r0 = r16
                r1 = 1
                if (r0 == 0) goto Lf
                int r3 = p000.o.f829
                boolean r3 = p000.o.m311(r16)
                if (r3 != r1) goto Lf
                r3 = r1
                goto L10
            Lf:
                r3 = 0
            L10:
                if (r3 != 0) goto L13
                return
            L13:
                int r3 = r16.length()
                int r4 = p000.o.f829
                boolean r4 = p000.o.m311(r16)
                if (r4 != r1) goto L21
                r4 = r1
                goto L22
            L21:
                r4 = 0
            L22:
                r5 = 6
                if (r4 == 0) goto L200
                int r4 = p000.o.m314(r16)
            L29:
                r6 = -1
                if (r6 >= r4) goto L200
                org.json.JSONObject r6 = r0.optJSONObject(r4)
                if (r6 == 0) goto L1fa
                boolean r7 = p000.y2.f1188
                r8 = 7
                java.lang.String r9 = ""
                r10 = 8
                if (r7 == 0) goto Lec
                boolean r7 = m470()
                if (r7 == 0) goto Lec
                java.lang.String r7 = p000.y2.f1192
                int r7 = r7.length()
                if (r7 <= 0) goto L4b
                r7 = r1
                goto L4c
            L4b:
                r7 = 0
            L4c:
                java.lang.String r11 = "compile(...)"
                java.lang.String r12 = "pattern"
                r13 = 66
                if (r7 == 0) goto La5
                r7 = 4
                byte[] r7 = new byte[r7]
                r7 = {x0206: FILL_ARRAY_DATA , data: [102, -48, 45, -58} // fill-array
                byte[] r14 = new byte[r5]
                r14 = {x020c: FILL_ARRAY_DATA , data: [19, -93, 72, -76, 109, -77} // fill-array
                java.lang.String r7 = p000.oa.m332(r7, r14)
                org.json.JSONObject r7 = r6.optJSONObject(r7)
                if (r7 == 0) goto L7c
                byte[] r14 = new byte[r10]
                r14 = {x0214: FILL_ARRAY_DATA , data: [-2, 64, -83, -68, 11, 7, -3, 76} // fill-array
                byte[] r15 = new byte[r5]
                r15 = {x021c: FILL_ARRAY_DATA , data: [-112, 41, -50, -41, 101, 102} // fill-array
                java.lang.String r14 = p000.oa.m332(r14, r15)
                java.lang.String r7 = r7.optString(r14)
                goto L7d
            L7c:
                r7 = 0
            L7d:
                if (r7 != 0) goto L80
                r7 = r9
            L80:
                int r14 = r7.length()
                if (r14 <= 0) goto L88
                r14 = r1
                goto L89
            L88:
                r14 = 0
            L89:
                if (r14 == 0) goto La5
                java.lang.String r14 = p000.y2.f1192
                ۟.u8[] r15 = p000.u8.f1081
                p000.h4.m189(r12, r14)
                java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14, r13)
                p000.h4.m188(r11, r14)
                java.util.regex.Matcher r7 = r14.matcher(r7)
                boolean r7 = r7.find()
                if (r7 == 0) goto La5
                goto L1ca
            La5:
                java.lang.String r7 = p000.y2.f1191
                int r7 = r7.length()
                if (r7 <= 0) goto Laf
                r7 = r1
                goto Lb0
            Laf:
                r7 = 0
            Lb0:
                if (r7 == 0) goto Lec
                byte[] r7 = new byte[r8]
                r7 = {x0224: FILL_ARRAY_DATA , data: [87, -125, 25, -115, 36, -40, 64} // fill-array
                byte[] r14 = new byte[r5]
                r14 = {x022c: FILL_ARRAY_DATA , data: [52, -20, 119, -7, 65, -74} // fill-array
                java.lang.String r7 = p000.oa.m332(r7, r14)
                java.lang.String r7 = r6.optString(r7)
                if (r7 != 0) goto Lc7
                r7 = r9
            Lc7:
                int r14 = r7.length()
                if (r14 <= 0) goto Lcf
                r14 = r1
                goto Ld0
            Lcf:
                r14 = 0
            Ld0:
                if (r14 == 0) goto Lec
                java.lang.String r14 = p000.y2.f1191
                ۟.u8[] r15 = p000.u8.f1081
                p000.h4.m189(r12, r14)
                java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r14, r13)
                p000.h4.m188(r11, r12)
                java.util.regex.Matcher r7 = r12.matcher(r7)
                boolean r7 = r7.find()
                if (r7 == 0) goto Lec
                goto L1ca
            Lec:
                boolean r7 = p000.y2.f1190
                if (r7 == 0) goto L1cf
                byte[] r7 = new byte[r8]
                r7 = {x0234: FILL_ARRAY_DATA , data: [120, -70, 28, -61, -82, 88, 111} // fill-array
                byte[] r8 = new byte[r5]
                r8 = {x023c: FILL_ARRAY_DATA , data: [27, -43, 114, -73, -53, 54} // fill-array
                java.lang.String r7 = p000.oa.m332(r7, r8)
                java.lang.String r7 = r6.optString(r7)
                if (r7 != 0) goto L105
                r7 = r9
            L105:
                byte[] r8 = new byte[r10]
                r8 = {x0244: FILL_ARRAY_DATA , data: [-124, 68, -34, -84, 53, -89, -105, 67} // fill-array
                byte[] r11 = new byte[r5]
                r11 = {x024c: FILL_ARRAY_DATA , data: [-27, 48, -127, -39, 70, -62} // fill-array
                java.lang.String r8 = p000.oa.m332(r8, r11)
                org.json.JSONArray r8 = r6.optJSONArray(r8)
                int r11 = r7.length()
                if (r11 <= 0) goto L11f
                r11 = r1
                goto L120
            L11f:
                r11 = 0
            L120:
                if (r11 == 0) goto L1cf
                if (r8 == 0) goto L12e
                int r11 = p000.o.f829
                boolean r11 = p000.o.m311(r8)
                if (r11 != r1) goto L12e
                r11 = r1
                goto L12f
            L12e:
                r11 = 0
            L12f:
                if (r11 == 0) goto L1cf
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                int r12 = p000.o.f829
                if (r8 == 0) goto L187
                int r12 = r8.length()
                if (r12 <= 0) goto L187
                int r12 = r8.length()
                r13 = 0
            L145:
                if (r13 >= r12) goto L187
                org.json.JSONObject r14 = r8.optJSONObject(r13)
                if (r14 == 0) goto L181
                byte[] r15 = new byte[r5]
                r15 = {x0254: FILL_ARRAY_DATA , data: [66, -81, -38, 35, -49, 14} // fill-array
                byte[] r2 = new byte[r5]
                r2 = {x025c: FILL_ARRAY_DATA , data: [55, -36, -65, 81, -90, 106} // fill-array
                java.lang.String r2 = p000.oa.m332(r15, r2)
                java.lang.String r2 = r14.optString(r2)
                java.lang.String r15 = p000.y2.f1193
                boolean r15 = p000.h4.m185(r15, r2)
                if (r15 != 0) goto L181
                ۟.q7 r15 = new ۟.q7
                byte[] r1 = new byte[r10]
                r1 = {x0264: FILL_ARRAY_DATA , data: [16, -45, -82, 109, 23, -90, 19, -33} // fill-array
                byte[] r10 = new byte[r5]
                r10 = {x026c: FILL_ARRAY_DATA , data: [126, -70, -51, 6, 121, -57} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r10)
                java.lang.String r1 = r14.optString(r1)
                r15.<init>(r2, r1)
                r11.add(r15)
            L181:
                int r13 = r13 + 1
                r1 = 1
                r10 = 8
                goto L145
            L187:
                int r1 = p000.o.f829
                boolean r1 = p000.o.m311(r8)
                if (r1 == 0) goto L1cf
                java.util.Iterator r1 = r11.iterator()
            L193:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1b7
                java.lang.Object r2 = r1.next()
                ۟.q7 r2 = (p000.q7) r2
                B r2 = r2.f919
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "@"
                r8.append(r10)
                r8.append(r2)
                java.lang.String r2 = r8.toString()
                java.lang.String r7 = p000.ta.m422(r7, r2, r9)
                goto L193
            L1b7:
                java.lang.CharSequence r1 = p000.va.m445(r7)
                java.lang.String r1 = r1.toString()
                int r1 = r1.length()
                if (r1 != 0) goto L1c7
                r1 = 1
                goto L1c8
            L1c7:
                r1 = 0
            L1c8:
                if (r1 == 0) goto L1cf
            L1ca:
                r0.remove(r4)
                r6 = 1
                goto L1fb
            L1cf:
                r1 = 12
                byte[] r1 = new byte[r1]
                r1 = {x0274: FILL_ARRAY_DATA , data: [-91, -61, -22, -51, 57, 43, -69, -37, -19, -4, 46, 55} // fill-array
                byte[] r2 = new byte[r5]
                r2 = {x027e: FILL_ARRAY_DATA , data: [-42, -74, -120, -110, 90, 68} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r2)
                org.json.JSONArray r1 = r6.optJSONArray(r1)
                if (r1 == 0) goto L1f0
                int r2 = p000.o.f829
                boolean r2 = p000.o.m311(r1)
                r6 = 1
                if (r2 != r6) goto L1f1
                r2 = r6
                goto L1f2
            L1f0:
                r6 = 1
            L1f1:
                r2 = 0
            L1f2:
                if (r2 == 0) goto L1fb
                boolean r2 = p000.y2.f1188
                m467(r1)
                goto L1fb
            L1fa:
                r6 = r1
            L1fb:
                int r4 = r4 + (-1)
                r1 = r6
                goto L29
            L200:
                if (r3 <= r5) goto L205
                r16.length()
            L205:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m468() {
                boolean r0 = p000.y2.f1188
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m469() {
                boolean r0 = p000.y2.f1190
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public static boolean m470() {
                boolean r0 = p000.y2.f1188
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                boolean r0 = p000.y2.f1189
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public static void m471(java.lang.String r2) {
                r0 = 5
                byte[] r0 = new byte[r0]
                r0 = {x0028: FILL_ARRAY_DATA , data: [74, 19, -113, -10, -39} // fill-array
                r1 = 6
                byte[] r1 = new byte[r1]
                r1 = {x0030: FILL_ARRAY_DATA , data: [60, 114, -29, -125, -68, -93} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m189(r0, r2)
                int r0 = r2.length()
                if (r0 <= 0) goto L1b
                r0 = 1
                goto L1c
            L1b:
                r0 = 0
            L1c:
                if (r0 == 0) goto L24
                int r0 = p000.o.f829
                java.lang.String r2 = p000.o.m310(r2)
            L24:
                p000.y2.f1191 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
        public static void m472(java.lang.String r2) {
                r0 = 5
                byte[] r0 = new byte[r0]
                r0 = {x0028: FILL_ARRAY_DATA , data: [-79, 27, 126, -1, -115} // fill-array
                r1 = 6
                byte[] r1 = new byte[r1]
                r1 = {x0030: FILL_ARRAY_DATA , data: [-57, 122, 18, -118, -24, -53} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m189(r0, r2)
                int r0 = r2.length()
                if (r0 <= 0) goto L1b
                r0 = 1
                goto L1c
            L1b:
                r0 = 0
            L1c:
                if (r0 == 0) goto L24
                int r0 = p000.o.f829
                java.lang.String r2 = p000.o.m310(r2)
            L24:
                p000.y2.f1192 = r2
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
        public static void m473() {
                r0 = 1
                p000.y2.f1188 = r0
                return
        }
    }

    public static final class b extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.y2 f1194;

        public b(p000.y2 r1) {
                r0 = this;
                r0.f1194 = r1
                r0.<init>()
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p000.g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final java.lang.Object mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
                r5 = this;
                de.robv.android.xposed.XC_MethodHook$MethodHookParam r6 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r6
                r0 = 2
                byte[] r0 = new byte[r0]
                r0 = {x00b8: FILL_ARRAY_DATA , data: [-79, -40} // fill-array
                r1 = 6
                byte[] r2 = new byte[r1]
                r2 = {x00be: FILL_ARRAY_DATA , data: [-40, -84, 126, -16, -120, 18} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r2)
                p000.h4.m189(r0, r6)
                boolean r0 = p000.y2.f1188
                boolean r0 = ۟.y2.a.m468()
                if (r0 != 0) goto L1f
                goto Lb2
            L1f:
                java.lang.Object[] r0 = r6.args
                r2 = 0
                r0 = r0[r2]
                r3 = 15
                byte[] r3 = new byte[r3]
                r3 = {x00c6: FILL_ARRAY_DATA , data: [-120, -46, -24, 5, 109, 98, -103, -46, -25, 4, 119, 102, -103, -33, -3} // fill-array
                byte[] r4 = new byte[r1]
                r4 = {x00d2: FILL_ARRAY_DATA , data: [-36, -117, -72, 64, 50, 42} // fill-array
                java.lang.String r3 = p000.oa.m332(r3, r4)
                boolean r0 = p000.h4.m185(r0, r3)
                if (r0 == 0) goto Lb2
                java.lang.Object r6 = r6.thisObject
                r0 = 10
                byte[] r0 = new byte[r0]
                r0 = {x00da: FILL_ARRAY_DATA , data: [-51, 24, -33, -111, 8, -101, -45, 21, -43, -106} // fill-array
                byte[] r3 = new byte[r1]
                r3 = {x00e4: FILL_ARRAY_DATA , data: [-71, 112, -74, -30, 71, -7} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r3)
                p000.h4.m188(r0, r6)
                ۟.k r0 = p000.k8.f660
                ۟.k r0 = ۟.k8.a.m235()
                java.lang.String r0 = r0.f569
                java.lang.Object r6 = p000.r3.m364(r6, r0)
                java.lang.String r0 = ""
                if (r6 == 0) goto L78
                r3 = 8
                byte[] r3 = new byte[r3]
                r3 = {x00ec: FILL_ARRAY_DATA , data: [28, 19, 82, -5, 116, 110, 31, 31} // fill-array
                byte[] r4 = new byte[r1]
                r4 = {x00f4: FILL_ARRAY_DATA , data: [114, 122, 49, -112, 26, 15} // fill-array
                java.lang.String r3 = p000.oa.m332(r3, r4)
                java.lang.Object r6 = p000.r3.m365(r6, r3)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L78
                goto L79
            L78:
                r6 = r0
            L79:
                int r3 = r6.length()
                r4 = 1
                if (r3 <= 0) goto L81
                r2 = r4
            L81:
                if (r2 == 0) goto L9a
                ۟.y2 r1 = r5.f1194
                java.lang.String r6 = p000.y2.m466(r1, r6)
                if (r6 != 0) goto L8c
                goto L8d
            L8c:
                r0 = r6
            L8d:
                ۟.y2.a.m473()
                int r6 = p000.o.f829
                java.lang.String r6 = p000.o.m310(r0)
                ۟.y2.a.m472(r6)
                goto Laf
            L9a:
                int r6 = p000.o.f829
                r6 = 42
                byte[] r6 = new byte[r6]
                r6 = {x00fc: FILL_ARRAY_DATA , data: [-81, 44, 105, -10, 106, -16, -94, 49, 112, -11, 91, -12, -81, 42, 70, -5, 84, -11, -91, 50, 123, -5, 110, -25, -81, 1, 97, -12, 116, -8, -84, 6, 64, -10, 112, -35, -82, 54, 77, -12, 73, -22} // fill-array
                byte[] r0 = new byte[r1]
                r0 = {x0116: FILL_ARRAY_DATA , data: [74, -114, -9, 19, -32, 80} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r0)
                p000.o.m319(r6)
            Laf:
                ۟.vb r6 = p000.vb.f1114
                goto Lb6
            Lb2:
                java.lang.Object r6 = p000.r3.m375(r6)
            Lb6:
                return r6
        }
    }

    public static final class c extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final ۟.y2.c f1195 = null;

        static {
                ۟.y2$c r0 = new ۟.y2$c
                r0.<init>()
                ۟.y2.c.f1195 = r0
                return
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r9) {
                r8 = this;
                de.robv.android.xposed.XC_MethodHook$MethodHookParam r9 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r9
                r0 = 2
                byte[] r1 = new byte[r0]
                r1 = {x0098: FILL_ARRAY_DATA , data: [-88, -65} // fill-array
                r2 = 6
                byte[] r3 = new byte[r2]
                r3 = {x009e: FILL_ARRAY_DATA , data: [-63, -53, -24, 19, 60, -97} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r3)
                p000.h4.m189(r1, r9)
                boolean r1 = p000.y2.f1188
                boolean r1 = ۟.y2.a.m468()
                if (r1 != 0) goto L1e
                goto L94
            L1e:
                ۟.k r1 = p000.k8.f660
                ۟.k r1 = ۟.k8.a.m235()
                java.lang.String r1 = r1.f572
                r3 = 18
                byte[] r3 = new byte[r3]
                r3 = {x00a6: FILL_ARRAY_DATA , data: [77, -113, 97, 69, 103, -6, 106, -126, 109, 127, 103, -33, 110, -126, 114, 116, 110, -64} // fill-array
                byte[] r4 = new byte[r2]
                r4 = {x00b4: FILL_ARRAY_DATA , data: [30, -25, 0, 55, 2, -77} // fill-array
                java.lang.String r3 = p000.oa.m332(r3, r4)
                p000.h4.m188(r3, r1)
                ۟.k r3 = ۟.k8.a.m235()
                java.lang.String r3 = r3.f573
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r6 = 15
                byte[] r6 = new byte[r6]
                r6 = {x00bc: FILL_ARRAY_DATA , data: [-19, 2, 8, 26, -114, -44, -4, 2, 7, 27, -108, -48, -4, 15, 29} // fill-array
                byte[] r7 = new byte[r2]
                r7 = {x00c8: FILL_ARRAY_DATA , data: [-71, 91, 88, 95, -47, -100} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                r4[r5] = r6
                r5 = 1
                r6 = 12
                byte[] r6 = new byte[r6]
                r6 = {x00d0: FILL_ARRAY_DATA , data: [57, 28, 2, 117, -99, -56, 59, 33, 39, 123, -128, -2} // fill-array
                byte[] r7 = new byte[r2]
                r7 = {x00da: FILL_ARRAY_DATA , data: [-34, -112, -88, -109, 20, 67} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                r4[r5] = r6
                java.lang.String r5 = ""
                r4[r0] = r5
                r0 = 3
                r4[r0] = r5
                java.lang.Object r0 = p000.r3.m358(r1, r3, r4)
                if (r0 != 0) goto L76
                goto L94
            L76:
                java.lang.Object r9 = r9.getResult()
                r1 = 79
                byte[] r1 = new byte[r1]
                r1 = {x00e2: FILL_ARRAY_DATA , data: [-13, -16, 108, 25, -90, -85, -4, -21, 110, 26, -14, -24, -1, -32, 32, 22, -25, -69, -23, -91, 116, 26, -90, -90, -14, -21, 45, 27, -13, -92, -15, -91, 116, 12, -10, -83, -67, -18, 111, 1, -22, -95, -13, -85, 99, 26, -22, -92, -8, -26, 116, 28, -23, -90, -18, -85, 77, 0, -14, -87, -1, -23, 101, 57, -17, -69, -23, -71, 107, 26, -14, -92, -12, -21, 46, 52, -24, -79, -93} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x010e: FILL_ARRAY_DATA , data: [-99, -123, 0, 117, -122, -56} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r2)
                p000.h4.m187(r1, r9)
                java.util.List r9 = p000.sb.m408(r9)
                r9.add(r0)
            L94:
                ۟.vb r9 = p000.vb.f1114
                return r9
        }
    }

    static {
            java.lang.String r0 = ""
            int r1 = r0.length()
            if (r1 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L31
            ۟.n8 r1 = p000.n8.f823
            r1.getClass()
            org.json.JSONObject r1 = p000.n8.m296()
            if (r1 == 0) goto L2c
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0034: FILL_ARRAY_DATA , data: [40, 58, 42, 46, 94, -51} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x003c: FILL_ARRAY_DATA , data: [93, 73, 79, 92, 55, -87} // fill-array
            java.lang.String r2 = p000.oa.m332(r3, r2)
            java.lang.String r1 = r1.optString(r2)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 != 0) goto L30
            goto L31
        L30:
            r0 = r1
        L31:
            p000.y2.f1193 = r0
            return
    }

    public y2() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String m466(p000.y2 r8, java.lang.String r9) {
            r8.getClass()
            int r8 = r9.length()
            r0 = 0
            r1 = 1
            if (r8 != 0) goto Ld
            r8 = r1
            goto Le
        Ld:
            r8 = r0
        Le:
            r2 = 24
            r3 = 6
            if (r8 == 0) goto L3a
            int r8 = p000.g5.f396
            byte[] r8 = new byte[r2]
            r8 = {x010e: FILL_ARRAY_DATA , data: [15, 103, 13, -3, -124, 84, 0, 125, 18, -2, -125, 117, 2, 121, 55, -3, -81, 115, 15, 93, 31, -9, -73, 88} // fill-array
            byte[] r9 = new byte[r3]
            r9 = {x011e: FILL_ARRAY_DATA , data: [-25, -23, -70, 24, 11, -62} // fill-array
            p000.oa.m332(r8, r9)
            int r8 = p000.o.f829
            r8 = 21
            byte[] r8 = new byte[r8]
            r8 = {x0126: FILL_ARRAY_DATA , data: [24, 4, 21, 26, -50, -118, 23, 30, 10, 25, -55, -85, 21, 26, 47, 26, -27, -83, 24, 62, 7} // fill-array
            byte[] r9 = new byte[r3]
            r9 = {x0136: FILL_ARRAY_DATA , data: [-16, -118, -94, -1, 65, 28} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r9)
            p000.o.m318(r0, r8)
            r8 = 0
            goto L10c
        L3a:
            ۟.c1 r8 = p000.c1.f226
            java.lang.String r4 = p000.e1.m133(r8)
            int r5 = r4.length()
            if (r5 <= 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r0
        L49:
            r6 = 13
            if (r5 == 0) goto L98
            int r5 = p000.o.f829
            java.lang.String r5 = p000.o.m310(r4)
            ۟.u8[] r7 = p000.u8.f1081
            r7 = 66
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5, r7)
            java.lang.String r7 = "compile(...)"
            p000.h4.m188(r7, r5)
            java.util.regex.Matcher r5 = r5.matcher(r9)
            boolean r5 = r5.find()
            if (r5 == 0) goto L98
            r8 = 33
            byte[] r8 = new byte[r8]
            r8 = {x013e: FILL_ARRAY_DATA , data: [52, -49, 30, 38, -118, 108, 58, -24, 12, 36, -87, 118, 57, -4, 19, 41, -95, 67, 58, -37, 31, 36, -106, 83, 52, -63, 19, 37, -90, 105, 51, -36, 33} // fill-array
            byte[] r0 = new byte[r3]
            r0 = {x0154: FILL_ARRAY_DATA , data: [-36, 96, -69, -63, 30, -60} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r0)
            java.lang.StringBuilder r8 = p000.r2.m354(r8, r9)
            java.lang.String r8 = r8.toString()
            byte[] r9 = new byte[r6]
            r9 = {x015c: FILL_ARRAY_DATA , data: [-121, -127, 85, -92, 108, 82, -99, -119, 46, -2, 48, 21, -38} // fill-array
            byte[] r0 = new byte[r3]
            r0 = {x0168: FILL_ARRAY_DATA , data: [-13, -18, 6, -48, 30, 59} // fill-array
            java.lang.String r9 = p000.oa.m332(r9, r0)
            p000.h4.m188(r9, r8)
            p000.o.m318(r1, r8)
            r8 = r4
            goto L10c
        L98:
            int r5 = r4.length()
            if (r5 <= 0) goto L9f
            r0 = r1
        L9f:
            if (r0 == 0) goto Lb2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "|"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        Lb2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            int r4 = p000.o.f829
            r4 = 14
            byte[] r4 = new byte[r4]
            r4 = {x0170: FILL_ARRAY_DATA , data: [-111, -54, 12, -121, 91, -10, -100, -41, 21, -124, 106, -14, 78, 72} // fill-array
            byte[] r5 = new byte[r3]
            r5 = {x017c: FILL_ARRAY_DATA , data: [116, 104, -110, 98, -47, 86} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            java.lang.StringBuilder r9 = p000.r2.m354(r4, r9)
            byte[] r2 = new byte[r2]
            r2 = {x0184: FILL_ARRAY_DATA , data: [42, 47, -2, -45, -110, -37, 44, 20, -1, -45, -121, -7, 32, 30, -63, -45, -97, -19, 34, 7, -19, -48, -126, -34} // fill-array
            byte[] r4 = new byte[r3]
            r4 = {x0194: FILL_ARRAY_DATA , data: [-59, -109, 114, 54, 23, 86} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r4)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            byte[] r2 = new byte[r6]
            r2 = {x019c: FILL_ARRAY_DATA , data: [-69, -78, 97, 8, -87, 71, -95, -70, 26, 82, -11, 0, -26} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x01a8: FILL_ARRAY_DATA , data: [-49, -35, 50, 124, -37, 46} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            p000.h4.m188(r2, r9)
            p000.o.m318(r1, r9)
            ۟.kb r9 = p000.d1.f287
            ۟.x3 r9 = ۟.d1.b.m121()
            java.lang.String r8 = r8.f236
            r9.mo141(r8, r0)
            r8 = r0
        L10c:
            return r8
    }

    @Override // p000.a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo28(java.lang.String r7) {
            r6 = this;
            r0 = 11
            byte[] r0 = new byte[r0]
            r0 = {x00d2: FILL_ARRAY_DATA , data: [-118, 27, -50, -81, 5, 91, -119, 39, -64, -95, 5} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00dc: FILL_ARRAY_DATA , data: [-6, 105, -95, -52, 96, 40} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r7)
            ۟.c1 r7 = p000.c1.f222
            boolean r7 = p000.e1.m132(r7)
            p000.y2.f1188 = r7
            ۟.c1 r7 = p000.c1.f223
            boolean r7 = p000.e1.m132(r7)
            p000.y2.f1189 = r7
            ۟.c1 r7 = p000.c1.f221
            boolean r7 = p000.e1.m132(r7)
            p000.y2.f1190 = r7
            ۟.c1 r7 = p000.c1.f227
            java.lang.String r7 = p000.e1.m133(r7)
            ۟.y2.a.m471(r7)
            ۟.c1 r7 = p000.c1.f226
            java.lang.String r7 = p000.e1.m133(r7)
            ۟.y2.a.m472(r7)
            ۟.k r7 = p000.k8.f660
            java.lang.String r7 = r7.f567
            r0 = 19
            byte[] r0 = new byte[r0]
            r0 = {x00e4: FILL_ARRAY_DATA , data: [-72, 33, 71, 73, -56, -60, -116, 32, 71, 116, -21, -55, -97, 51, 86, 94, -40, -64, -98} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x00f2: FILL_ARRAY_DATA , data: [-19, 82, 34, 59, -101, -84} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m188(r0, r7)
            ۟.k r0 = p000.k8.f660
            java.lang.String r0 = r0.f568
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3
            ۟.y2$b r3 = new ۟.y2$b
            r3.<init>(r6)
            p000.s3.m395(r7, r0, r2, r3)
            ۟.k r7 = p000.k8.f660
            java.lang.String r7 = r7.f570
            r0 = 12
            byte[] r0 = new byte[r0]
            r0 = {x00fa: FILL_ARRAY_DATA , data: [-65, -80, -72, -25, -109, 95, -117, -79, -72, -42, -84, 68} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x0104: FILL_ARRAY_DATA , data: [-22, -61, -35, -107, -64, 55} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m188(r0, r7)
            ۟.k r0 = p000.k8.f660
            java.lang.String r0 = r0.f571
            java.lang.ClassLoader r2 = p000.l3.f737
            r3 = 2
            if (r2 == 0) goto Lbf
            byte[] r4 = new byte[r1]
            r4 = {x010c: FILL_ARRAY_DATA , data: [-54, -64, -126, 17, -120, -108} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x0114: FILL_ARRAY_DATA , data: [-10, -76, -22, 120, -5, -86} // fill-array
            p000.oa.m332(r4, r5)
            byte[] r4 = new byte[r3]
            r4 = {x011c: FILL_ARRAY_DATA , data: [-57, -13} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x0122: FILL_ARRAY_DATA , data: [-92, -97, -85, 6, -59, -40} // fill-array
            p000.oa.m332(r4, r5)
            byte[] r4 = new byte[r1]
            r4 = {x012a: FILL_ARRAY_DATA , data: [3, 112, 121, -48, -20, 74} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0132: FILL_ARRAY_DATA , data: [107, 31, 22, -69, -119, 56} // fill-array
            p000.oa.m332(r4, r1)
            java.lang.Class r7 = p000.r3.m360(r7, r2, r3)
            if (r7 == 0) goto Lbe
            ۟.o3 r1 = new ۟.o3
            r1.<init>()
            p000.r3.m371(r7, r0, r1)
        Lbe:
            return
        Lbf:
            byte[] r7 = new byte[r3]
            r7 = {x013a: FILL_ARRAY_DATA , data: [-78, 10} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x0140: FILL_ARRAY_DATA , data: [-47, 102, 55, 90, 4, -54} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r0)
            p000.h4.m191(r7)
            r7 = 0
            throw r7
    }
}
