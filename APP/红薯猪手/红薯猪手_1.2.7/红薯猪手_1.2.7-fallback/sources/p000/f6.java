package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f6 extends p000.za {

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static java.util.ArrayList<p000.i3> f344;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static java.lang.String f345;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static java.lang.String f346;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f347;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f348;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f349;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public boolean f350;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f351;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public boolean f352;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f353;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public boolean f354;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public boolean f355;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public boolean f356;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public boolean f357;

    public static final class a {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m157(java.lang.String r2) {
                r0 = 7
                byte[] r0 = new byte[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [-43, -18, 38, -79, -54, 16, -41} // fill-array
                r1 = 6
                byte[] r1 = new byte[r1]
                r1 = {x001a: FILL_ARRAY_DATA , data: [-23, -99, 67, -59, -25, 47} // fill-array
                p000.oa.m332(r0, r1)
                p000.f6.f345 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m158(java.lang.String r2) {
                r0 = 7
                byte[] r0 = new byte[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [-18, -62, 110, -27, 92, -80, -20} // fill-array
                r1 = 6
                byte[] r1 = new byte[r1]
                r1 = {x001a: FILL_ARRAY_DATA , data: [-46, -79, 11, -111, 113, -113} // fill-array
                p000.oa.m332(r0, r1)
                p000.f6.f346 = r2
                return
        }
    }

    public static final class b extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.f6 f358;

        public b(p000.f6 r1) {
                r0 = this;
                r0.f358 = r1
                r0.<init>()
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r12) {
                r11 = this;
                de.robv.android.xposed.XC_MethodHook$MethodHookParam r12 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r12
                r0 = 2
                byte[] r0 = new byte[r0]
                r0 = {x00ce: FILL_ARRAY_DATA , data: [-21, -47} // fill-array
                r1 = 6
                byte[] r2 = new byte[r1]
                r2 = {x00d4: FILL_ARRAY_DATA , data: [-126, -91, -119, 73, -21, 27} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r2)
                p000.h4.m189(r0, r12)
                java.lang.Object[] r12 = r12.args
                r0 = 0
                r12 = r12[r0]
                boolean r2 = r12 instanceof java.util.ArrayList
                r3 = 0
                if (r2 == 0) goto L22
                java.util.ArrayList r12 = (java.util.ArrayList) r12
                goto L23
            L22:
                r12 = r3
            L23:
                if (r12 == 0) goto Lca
                int r2 = p000.o.f829
                ۟.f6 r2 = r11.f358
                boolean r4 = r12.isEmpty()
                r5 = 1
                r4 = r4 ^ r5
                if (r4 != r5) goto L33
                r4 = r5
                goto L34
            L33:
                r4 = r0
            L34:
                if (r4 == 0) goto Lca
                int r4 = r12.size()
                int r4 = r4 - r5
            L3b:
                r6 = -1
                if (r6 >= r4) goto Lca
                java.lang.Object r6 = r12.get(r4)
                r7 = 4
                if (r6 == 0) goto L5e
                byte[] r8 = new byte[r7]
                r8 = {x00dc: FILL_ARRAY_DATA , data: [-46, -65, -13, -64} // fill-array
                byte[] r9 = new byte[r1]
                r9 = {x00e2: FILL_ARRAY_DATA , data: [-69, -52, -78, -92, 19, -84} // fill-array
                java.lang.String r8 = p000.oa.m332(r8, r9)
                java.lang.Boolean r8 = p000.r3.m362(r6, r8)
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                boolean r8 = p000.h4.m185(r8, r9)
                goto L5f
            L5e:
                r8 = r0
            L5f:
                if (r8 == 0) goto L62
                goto Lc3
            L62:
                if (r6 == 0) goto L6d
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getSimpleName()
                goto L6e
            L6d:
                r8 = r3
            L6e:
                r9 = 7
                byte[] r9 = new byte[r9]
                r9 = {x00ea: FILL_ARRAY_DATA , data: [-59, -54, -101, -113, 16, -34, -21} // fill-array
                byte[] r10 = new byte[r1]
                r10 = {x00f2: FILL_ARRAY_DATA , data: [-124, -82, -24, -58, 126, -72} // fill-array
                java.lang.String r9 = p000.oa.m332(r9, r10)
                boolean r8 = p000.h4.m185(r8, r9)
                if (r8 == 0) goto L84
                goto Lc3
            L84:
                boolean r8 = p000.f6.m150(r2)
                if (r8 == 0) goto Lc6
                if (r6 == 0) goto La7
                r8 = 9
                byte[] r8 = new byte[r8]
                r8 = {x00fa: FILL_ARRAY_DATA , data: [-45, 95, -30, -12, -46, 101, -57, 64, -29} // fill-array
                byte[] r9 = new byte[r1]
                r9 = {x0104: FILL_ARRAY_DATA , data: [-66, 48, -122, -111, -66, 49} // fill-array
                java.lang.String r8 = p000.oa.m332(r8, r9)
                java.lang.Object r6 = p000.r3.m364(r6, r8)
                if (r6 == 0) goto La7
                java.lang.String r6 = r6.toString()
                goto La8
            La7:
                r6 = r3
            La8:
                if (r6 == 0) goto Lc0
                byte[] r7 = new byte[r7]
                r7 = {x010c: FILL_ARRAY_DATA , data: [-11, 78, -22, -13} // fill-array
                byte[] r8 = new byte[r1]
                r8 = {x0112: FILL_ARRAY_DATA , data: [-103, 39, -100, -106, -110, -56} // fill-array
                java.lang.String r7 = p000.oa.m332(r7, r8)
                boolean r6 = p000.ta.m423(r6, r7)
                if (r6 != r5) goto Lc0
                r6 = r5
                goto Lc1
            Lc0:
                r6 = r0
            Lc1:
                if (r6 == 0) goto Lc6
            Lc3:
                r12.remove(r4)
            Lc6:
                int r4 = r4 + (-1)
                goto L3b
            Lca:
                ۟.vb r12 = p000.vb.f1114
                return r12
        }
    }

    public static final class c extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.f6 f359;

        public c(p000.f6 r1) {
                r0 = this;
                r0.f359 = r1
                r0.<init>()
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) {
                r9 = this;
                de.robv.android.xposed.XC_MethodHook$MethodHookParam r10 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r10
                r0 = 5
                byte[] r0 = new byte[r0]
                r0 = {x02aa: FILL_ARRAY_DATA , data: [-36, 69, 39, -27, -45} // fill-array
                r1 = 6
                byte[] r2 = new byte[r1]
                r2 = {x02b2: FILL_ARRAY_DATA , data: [-84, 36, 85, -124, -66, 8} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r2)
                p000.h4.m189(r0, r10)
                java.lang.Object r0 = r10.getResult()
                boolean r2 = r0 instanceof okhttp3.Response
                r3 = 0
                if (r2 == 0) goto L21
                okhttp3.Response r0 = (okhttp3.Response) r0
                goto L22
            L21:
                r0 = r3
            L22:
                java.lang.Object[] r2 = r10.args
                r4 = 0
                r2 = r2[r4]
                boolean r4 = r2 instanceof okhttp3.Interceptor.Chain
                if (r4 == 0) goto L2e
                okhttp3.Interceptor$Chain r2 = (okhttp3.Interceptor.Chain) r2
                goto L2f
            L2e:
                r2 = r3
            L2f:
                if (r2 == 0) goto L36
                okhttp3.Request r2 = r2.request()
                goto L37
            L36:
                r2 = r3
            L37:
                if (r2 == 0) goto L3e
                okhttp3.HttpUrl r4 = r2.url()
                goto L3f
            L3e:
                r4 = r3
            L3f:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r5 = 13
                r6 = 2
                if (r0 != 0) goto L96
                int r0 = p000.g5.f396
                r0 = 29
                byte[] r0 = new byte[r0]
                r0 = {x02ba: FILL_ARRAY_DATA , data: [110, 39, -117, -57, 64, -122, 110, 37, -66, -60, 69, -100, 111, 21, -117, -60, 83, -86, 108, 22, -94, -59, 100, -116, -92, -37, 106, 78, -9} // fill-array
                byte[] r2 = new byte[r1]
                r2 = {x02ce: FILL_ARRAY_DATA , data: [-120, -82, 24, 34, -51, 54} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r2)
                java.lang.StringBuilder r0 = p000.r2.m354(r0, r4)
                byte[] r2 = new byte[r6]
                r2 = {x02d6: FILL_ARRAY_DATA , data: [-56, -21} // fill-array
                byte[] r4 = new byte[r1]
                r4 = {x02dc: FILL_ARRAY_DATA , data: [-28, -53, 85, 79, -14, 54} // fill-array
                java.lang.String r2 = p000.oa.m332(r2, r4)
                r0.append(r2)
                java.lang.Object r10 = r10.getResult()
                if (r10 == 0) goto L79
                java.lang.Class r3 = r10.getClass()
            L79:
                r0.append(r3)
                java.lang.String r10 = r0.toString()
                byte[] r0 = new byte[r5]
                r0 = {x02e4: FILL_ARRAY_DATA , data: [125, 53, -106, 108, -92, 69, 103, 61, -19, 54, -8, 2, 32} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x02f0: FILL_ARRAY_DATA , data: [9, 90, -59, 24, -42, 44} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m188(r0, r10)
                p000.g5.m166(r10)
                goto L2a7
            L96:
                if (r2 == 0) goto L9d
                java.lang.String r2 = r2.method()
                goto L9e
            L9d:
                r2 = r3
            L9e:
                if (r2 != 0) goto La2
                java.lang.String r2 = ""
            La2:
                r6 = 3
                byte[] r6 = new byte[r6]
                r6 = {x02f8: FILL_ARRAY_DATA , data: [45, 124, 62} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x02fe: FILL_ARRAY_DATA , data: [106, 57, 106, -24, -98, -44} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r2 = p000.h4.m185(r2, r6)
                if (r2 == 0) goto L2a7
                r2 = 9
                byte[] r2 = new byte[r2]
                r2 = {x0306: FILL_ARRAY_DATA , data: [-58, -105, -15, 0, -4, -1, -53, -100, -93} // fill-array
                byte[] r6 = new byte[r1]
                r6 = {x0310: FILL_ARRAY_DATA , data: [-82, -8, -100, 101, -102, -102} // fill-array
                java.lang.String r2 = p000.oa.m332(r2, r6)
                boolean r2 = p000.va.m438(r4, r2)
                if (r2 == 0) goto Le6
                ۟.f6 r2 = r9.f359
                boolean r2 = p000.f6.m149(r2)
                if (r2 != 0) goto Ldd
                boolean r2 = p000.y2.f1188
                boolean r2 = ۟.y2.a.m468()
                if (r2 == 0) goto Le6
            Ldd:
                ۟.f6 r1 = r9.f359
                ۟.k6 r2 = new ۟.k6
                r2.<init>(r1, r4)
                goto L29e
            Le6:
                r2 = 10
                byte[] r6 = new byte[r2]
                r6 = {x0318: FILL_ARRAY_DATA , data: [-70, 70, 114, 61, 29, 23, -77, 76, 117, 99} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x0322: FILL_ARRAY_DATA , data: [-42, 41, 17, 92, 113, 113} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r6 = p000.va.m438(r4, r6)
                if (r6 == 0) goto L115
                ۟.f6 r6 = r9.f359
                boolean r6 = p000.f6.m149(r6)
                if (r6 != 0) goto L10c
                boolean r6 = p000.y2.f1188
                boolean r6 = ۟.y2.a.m468()
                if (r6 == 0) goto L115
            L10c:
                ۟.f6 r1 = r9.f359
                ۟.l6 r2 = new ۟.l6
                r2.<init>(r1, r4)
                goto L29e
            L115:
                r6 = 15
                byte[] r7 = new byte[r6]
                r7 = {x032a: FILL_ARRAY_DATA , data: [-61, 99, -127, 74, 63, -4, -64, 109, -110, 74, 118, -16, -56, 104, -54} // fill-array
                byte[] r8 = new byte[r1]
                r8 = {x0336: FILL_ARRAY_DATA , data: [-83, 12, -11, 47, 16, -107} // fill-array
                java.lang.String r7 = p000.oa.m332(r7, r8)
                boolean r7 = p000.va.m438(r4, r7)
                if (r7 == 0) goto L134
                ۟.f6 r1 = r9.f359
                ۟.m6 r2 = new ۟.m6
                r2.<init>(r1)
                goto L29e
            L134:
                byte[] r6 = new byte[r6]
                r6 = {x033e: FILL_ARRAY_DATA , data: [-116, -102, -120, -75, 68, 2, -117, -111, -103, -65, 13, 17, -121, -111, -61} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x034a: FILL_ARRAY_DATA , data: [-30, -11, -4, -48, 107, 116} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r6 = p000.va.m438(r4, r6)
                if (r6 == 0) goto L151
                ۟.f6 r1 = r9.f359
                ۟.n6 r2 = new ۟.n6
                r2.<init>(r1)
                goto L29e
            L151:
                r6 = 17
                byte[] r6 = new byte[r6]
                r6 = {x0352: FILL_ARRAY_DATA , data: [-75, 72, -73, 59, -100, -63, -89, 78, -69, 45, -90, -116, -77, 83, -80, 58, -117} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x0360: FILL_ARRAY_DATA , data: [-46, 61, -34, 95, -7, -18} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r6 = p000.va.m438(r4, r6)
                if (r6 == 0) goto L178
                ۟.f6 r6 = r9.f359
                boolean r6 = p000.f6.m151(r6)
                if (r6 == 0) goto L178
                ۟.f6 r1 = r9.f359
                ۟.o6 r2 = new ۟.o6
                r2.<init>(r1)
                goto L29e
            L178:
                byte[] r6 = new byte[r5]
                r6 = {x0368: FILL_ARRAY_DATA , data: [-84, 94, -90, -84, 37, -18, -16, 85, -88, -86, 35, -11, -32} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x0374: FILL_ARRAY_DATA , data: [-33, 59, -57, -34, 70, -122} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r6 = p000.va.m438(r4, r6)
                if (r6 == 0) goto L19d
                ۟.f6 r6 = r9.f359
                boolean r6 = p000.f6.m152(r6)
                if (r6 == 0) goto L19d
                ۟.f6 r1 = r9.f359
                ۟.p6 r2 = new ۟.p6
                r2.<init>(r1)
                goto L29e
            L19d:
                r6 = 21
                byte[] r6 = new byte[r6]
                r6 = {x037c: FILL_ARRAY_DATA , data: [-11, 90, -96, -110, 59, 71, -10, 93, -32, -112, 44, 7, -30, 91, -84, -108, 45, 71, -16, 29, -16} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x038c: FILL_ARRAY_DATA , data: [-122, 46, -49, -32, 94, 104} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r6 = p000.va.m438(r4, r6)
                if (r6 == 0) goto L1bc
                ۟.f6 r1 = r9.f359
                ۟.q6 r2 = new ۟.q6
                r2.<init>(r1)
                goto L29e
            L1bc:
                r6 = 16
                byte[] r6 = new byte[r6]
                r6 = {x0394: FILL_ARRAY_DATA , data: [-43, -89, -10, -97, 124, 114, -46, -84, -25, -107, 124, 119, -38, -66, -25, -59} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x03a0: FILL_ARRAY_DATA , data: [-69, -56, -126, -6, 83, 4} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r6 = p000.va.m438(r4, r6)
                if (r6 == 0) goto L1db
                ۟.f6 r1 = r9.f359
                ۟.r6 r2 = new ۟.r6
                r2.<init>(r1)
                goto L29e
            L1db:
                r6 = 11
                byte[] r6 = new byte[r6]
                r6 = {x03a8: FILL_ARRAY_DATA , data: [100, -70, -22, 107, 88, -3, 123, -81, -24, 125, 72} // fill-array
                byte[] r7 = new byte[r1]
                r7 = {x03b2: FILL_ARRAY_DATA , data: [20, -37, -115, 14, 119, -109} // fill-array
                java.lang.String r6 = p000.oa.m332(r6, r7)
                boolean r6 = p000.va.m438(r4, r6)
                if (r6 == 0) goto L1ff
                boolean r6 = p000.y2.f1188
                boolean r6 = ۟.y2.a.m468()
                if (r6 == 0) goto L1ff
                ۟.f6 r1 = r9.f359
                ۟.s6 r2 = p000.s6.f974
                goto L29e
            L1ff:
                byte[] r5 = new byte[r5]
                r5 = {x03ba: FILL_ARRAY_DATA , data: [-86, 121, -53, -18, -83, 61, -16, 106, -57, -22, -70, 51, -32} // fill-array
                byte[] r6 = new byte[r1]
                r6 = {x03c6: FILL_ARRAY_DATA , data: [-33, 9, -81, -113, -39, 88} // fill-array
                java.lang.String r5 = p000.oa.m332(r5, r6)
                boolean r5 = p000.va.m438(r4, r5)
                if (r5 == 0) goto L221
                ۟.f6 r5 = r9.f359
                boolean r5 = p000.f6.m154(r5)
                if (r5 == 0) goto L221
                ۟.f6 r1 = r9.f359
                ۟.g6 r2 = p000.g6.f397
                goto L29e
            L221:
                r5 = 28
                byte[] r5 = new byte[r5]
                r5 = {x03ce: FILL_ARRAY_DATA , data: [87, 12, 40, 89, -18, 62, 123, 6, 62, 95, -3, 58, 71, 16, 116, 94, -5, 63, 69, 6, 51, 114, -24, 60, 74, 19, 50, 74} // fill-array
                byte[] r6 = new byte[r1]
                r6 = {x03e0: FILL_ARRAY_DATA , data: [36, 117, 91, 45, -117, 83} // fill-array
                java.lang.String r5 = p000.oa.m332(r5, r6)
                boolean r5 = p000.va.m438(r4, r5)
                if (r5 == 0) goto L244
                ۟.f6 r5 = r9.f359
                boolean r5 = p000.f6.m153(r5)
                if (r5 == 0) goto L244
                ۟.f6 r1 = r9.f359
                ۟.h6 r2 = p000.h6.f443
                goto L29e
            L244:
                byte[] r2 = new byte[r2]
                r2 = {x03e8: FILL_ARRAY_DATA , data: [114, 9, 8, 7, 57, -64, 105, 28, 2, 74} // fill-array
                byte[] r5 = new byte[r1]
                r5 = {x03f2: FILL_ARRAY_DATA , data: [7, 122, 109, 117, 22, -87} // fill-array
                java.lang.String r2 = p000.oa.m332(r2, r5)
                boolean r2 = p000.va.m438(r4, r2)
                if (r2 == 0) goto L260
                ۟.f6 r1 = r9.f359
                ۟.i6 r2 = new ۟.i6
                r2.<init>(r1)
                goto L29e
            L260:
                r2 = 18
                byte[] r2 = new byte[r2]
                r2 = {x03fa: FILL_ARRAY_DATA , data: [-85, 78, -103, -28, 19, 115, -86, 76, -128, -28, 82, 100, -22, 77, -124, -14, 72, 47} // fill-array
                byte[] r5 = new byte[r1]
                r5 = {x0408: FILL_ARRAY_DATA , data: [-59, 33, -19, -127, 60, 16} // fill-array
                java.lang.String r2 = p000.oa.m332(r2, r5)
                boolean r2 = p000.va.m438(r4, r2)
                if (r2 != 0) goto L28c
                r2 = 26
                byte[] r2 = new byte[r2]
                r2 = {x0410: FILL_ARRAY_DATA , data: [108, 111, 66, 13, 106, -25, 109, 109, 91, 13, 43, -16, 45, 115, 67, 10, 26, -25, 109, 109, 91, 13, 43, -16, 113, 63} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x0422: FILL_ARRAY_DATA , data: [2, 0, 54, 104, 69, -124} // fill-array
                java.lang.String r1 = p000.oa.m332(r2, r1)
                boolean r1 = p000.va.m438(r4, r1)
                if (r1 == 0) goto L2a2
            L28c:
                boolean r1 = p000.y2.f1188
                boolean r1 = ۟.y2.a.m470()
                if (r1 != 0) goto L29a
                boolean r1 = ۟.y2.a.m469()
                if (r1 == 0) goto L2a2
            L29a:
                ۟.f6 r1 = r9.f359
                ۟.j6 r2 = p000.j6.f520
            L29e:
                okhttp3.Response r3 = p000.f6.m155(r1, r0, r2)
            L2a2:
                if (r3 == 0) goto L2a7
                r10.setResult(r3)
            L2a7:
                ۟.vb r10 = p000.vb.f1114
                return r10
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000.f6.f344 = r0
            java.lang.String r0 = ""
            p000.f6.f345 = r0
            p000.f6.f346 = r0
            return
    }

    public f6() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f347 = r0
            r1.f348 = r0
            r1.f349 = r0
            r1.f351 = r0
            r1.f352 = r0
            r1.f353 = r0
            r1.f355 = r0
            r1.f356 = r0
            r1.f357 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m149(p000.f6 r0) {
            boolean r0 = r0.f348
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m150(p000.f6 r0) {
            boolean r0 = r0.f349
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m151(p000.f6 r0) {
            boolean r0 = r0.f351
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m152(p000.f6 r0) {
            boolean r0 = r0.f352
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m153(p000.f6 r0) {
            boolean r0 = r0.f347
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m154(p000.f6 r0) {
            boolean r0 = r0.f355
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final okhttp3.Response m155(p000.f6 r4, okhttp3.Response r5, p000.g3 r6) {
            r4.getClass()
            okhttp3.ResponseBody r4 = r5.body()
            if (r4 != 0) goto La
            goto L5e
        La:
            java.lang.String r0 = r4.string()
            p000.h4.m186(r0)
            r1 = 1
            byte[] r1 = new byte[r1]
            r2 = -106(0xffffffffffffff96, float:NaN)
            r3 = 0
            r1[r3] = r2
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0060: FILL_ARRAY_DATA , data: [-19, -104, 110, 45, 88, -111} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            r3 = 2
            boolean r1 = p000.ta.m423(r0, r1)
            if (r1 == 0) goto L5e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.Object r6 = r6.mo12(r1)
            if (r6 == 0) goto L3b
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto L49
        L3b:
            byte[] r6 = new byte[r3]
            r6 = {x0068: FILL_ARRAY_DATA , data: [5, -64} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x006e: FILL_ARRAY_DATA , data: [126, -67, 115, -24, 24, -87} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r0)
        L49:
            okhttp3.MediaType r4 = r4.contentType()
            okhttp3.ResponseBody r4 = okhttp3.ResponseBody.create(r4, r6)
            okhttp3.Response$Builder r5 = r5.newBuilder()
            okhttp3.Response$Builder r4 = r5.body(r4)
            okhttp3.Response r4 = r4.build()
            goto L5f
        L5e:
            r4 = 0
        L5f:
            return r4
    }

    @Override // p000.a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo28(java.lang.String r7) {
            r6 = this;
            r0 = 11
            byte[] r0 = new byte[r0]
            r0 = {x00da: FILL_ARRAY_DATA , data: [-30, -13, 5, 2, 113, 0, -31, -49, 11, 12, 113} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00e4: FILL_ARRAY_DATA , data: [-110, -127, 106, 97, 20, 115} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r7)
            ۟.c1 r7 = p000.c1.f200
            boolean r7 = p000.e1.m132(r7)
            r6.f347 = r7
            ۟.c1 r7 = p000.c1.f201
            boolean r7 = p000.e1.m132(r7)
            r6.f348 = r7
            ۟.c1 r7 = p000.c1.f202
            boolean r7 = p000.e1.m132(r7)
            r6.f349 = r7
            ۟.c1 r7 = p000.c1.f203
            boolean r7 = p000.e1.m132(r7)
            r6.f350 = r7
            ۟.c1 r7 = p000.c1.f204
            boolean r7 = p000.e1.m132(r7)
            r6.f352 = r7
            ۟.c1 r7 = p000.c1.f205
            boolean r7 = p000.e1.m132(r7)
            r6.f353 = r7
            ۟.c1 r7 = p000.c1.f206
            boolean r7 = p000.e1.m132(r7)
            r6.f354 = r7
            ۟.c1 r7 = p000.c1.f217
            boolean r7 = p000.e1.m132(r7)
            r6.f355 = r7
            ۟.c1 r7 = p000.c1.f214
            boolean r7 = p000.e1.m132(r7)
            r6.f356 = r7
            ۟.c1 r7 = p000.c1.f224
            boolean r7 = p000.e1.m132(r7)
            r6.f357 = r7
            ۟.c1 r7 = p000.c1.f220
            boolean r7 = p000.e1.m132(r7)
            r6.f351 = r7
            r7 = 61
            byte[] r7 = new byte[r7]
            r7 = {x00ec: FILL_ARRAY_DATA , data: [82, -110, -49, -67, 106, 94, 95, -102, -53, -3, 60, 79, 89, -114, -116, -5, 125, 90, 84, -115, -61, -12, 119, 25, 84, -123, -46, -1, 125, 69, 84, -101, -57, -10, 118, 25, 92, -100, -53, -3, 116, 82, 84, -103, -116, -27, 123, 82, 70, -45, -25, -21, 98, 91, 94, -113, -57, -59, 123, 82, 70} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x0110: FILL_ARRAY_DATA , data: [49, -3, -94, -109, 18, 55} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r0)
            ۟.k r0 = p000.k8.f660
            java.lang.String r0 = r0.f562
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            r5 = 0
            r3[r5] = r4
            ۟.f6$b r4 = new ۟.f6$b
            r4.<init>(r6)
            p000.r3.m372(r7, r0, r3, r4)
            ۟.k r7 = p000.k8.f660
            java.lang.String r7 = r7.f561
            r0 = 21
            byte[] r0 = new byte[r0]
            r0 = {x0118: FILL_ARRAY_DATA , data: [30, 93, -58, 71, 101, -65, 54, 124, -37, 123, 116, -71, 37, 80, -59, 123, 126, -71, 5, 89, -58} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x0128: FILL_ARRAY_DATA , data: [70, 53, -75, 15, 17, -53} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r3)
            p000.h4.m188(r0, r7)
            r0 = 9
            byte[] r0 = new byte[r0]
            r0 = {x0130: FILL_ARRAY_DATA , data: [104, 44, 102, 44, 78, -123, 100, 50, 102} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x013a: FILL_ARRAY_DATA , data: [1, 66, 18, 73, 60, -26} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 25
            byte[] r3 = new byte[r3]
            r3 = {x0142: FILL_ARRAY_DATA , data: [-35, -62, -124, 68, -63, 106, -127, -121, -91, 94, -63, 127, -64, -54, -119, 64, -63, 117, -64, -115, -81, 88, -44, 115, -36} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0154: FILL_ARRAY_DATA , data: [-78, -87, -20, 48, -75, 26} // fill-array
            java.lang.String r1 = p000.oa.m332(r3, r1)
            r3 = 0
            r4 = 3
            java.lang.Class r1 = p000.r3.m360(r1, r3, r4)
            r2[r5] = r1
            ۟.f6$c r1 = new ۟.f6$c
            r1.<init>(r6)
            p000.r3.m370(r7, r0, r2, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final void m156(java.lang.String r17, org.json.JSONObject r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x023a: FILL_ARRAY_DATA , data: [56, 48, -60, 33, -54, 5} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x0242: FILL_ARRAY_DATA , data: [74, 85, -75, 116, -72, 105} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            r4 = r17
            p000.h4.m189(r3, r4)
            r3 = 4
            byte[] r4 = new byte[r3]
            r4 = {x024a: FILL_ARRAY_DATA , data: [59, -54, 77, 40} // fill-array
            byte[] r5 = new byte[r2]
            r5 = {x0250: FILL_ARRAY_DATA , data: [81, -71, 34, 70, -109, -102} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            p000.h4.m189(r4, r1)
            byte[] r4 = new byte[r3]
            r4 = {x0258: FILL_ARRAY_DATA , data: [81, -13, -21, 4} // fill-array
            byte[] r5 = new byte[r2]
            r5 = {x025e: FILL_ARRAY_DATA , data: [53, -110, -97, 101, 55, 22} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            org.json.JSONArray r1 = r1.optJSONArray(r4)
            if (r1 == 0) goto L239
            int r4 = p000.o.f829
            boolean r4 = p000.o.m311(r1)
            r5 = 1
            if (r4 != r5) goto L49
            r4 = r5
            goto L4a
        L49:
            r4 = 0
        L4a:
            if (r4 == 0) goto L239
            int r4 = p000.o.m314(r1)
        L50:
            r6 = -1
            if (r6 >= r4) goto L239
            org.json.JSONObject r6 = r1.optJSONObject(r4)
            if (r6 == 0) goto L235
            r7 = 8
            byte[] r8 = new byte[r7]
            r8 = {x0266: FILL_ARRAY_DATA , data: [17, -32, -26, 127, 54, 54, 22, -21} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x026e: FILL_ARRAY_DATA , data: [112, -124, -107, 32, 95, 88} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r9)
            org.json.JSONObject r8 = r6.optJSONObject(r8)
            if (r8 == 0) goto L71
            goto L19a
        L71:
            boolean r8 = r0.f349
            if (r8 == 0) goto L9d
            byte[] r8 = new byte[r3]
            r8 = {x0276: FILL_ARRAY_DATA , data: [79, -59, -14, -26} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x027c: FILL_ARRAY_DATA , data: [59, -68, -126, -125, 12, 92} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r9)
            java.lang.String r8 = r6.optString(r8)
            byte[] r9 = new byte[r3]
            r9 = {x0284: FILL_ARRAY_DATA , data: [26, 127, -73, -92} // fill-array
            byte[] r10 = new byte[r2]
            r10 = {x028a: FILL_ARRAY_DATA , data: [118, 22, -63, -63, -113, -62} // fill-array
            java.lang.String r9 = p000.oa.m332(r9, r10)
            boolean r8 = p000.h4.m185(r8, r9)
            if (r8 == 0) goto L9d
            goto L19a
        L9d:
            boolean r8 = r0.f350
            r9 = 5
            java.lang.String r10 = ""
            if (r8 == 0) goto Lef
            r8 = 15
            byte[] r8 = new byte[r8]
            r8 = {x0292: FILL_ARRAY_DATA , data: [20, -53, -80, 112, 25, 22, 14, -48, -74, 124, 36, 2, 14, -63, -73} // fill-array
            byte[] r11 = new byte[r2]
            r11 = {x029e: FILL_ARRAY_DATA , data: [122, -92, -60, 21, 70, 119} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r11)
            org.json.JSONArray r8 = r6.optJSONArray(r8)
            if (r8 == 0) goto Lef
            int r11 = p000.o.f829
            int r11 = r8.length()
            if (r11 <= 0) goto Lef
            int r11 = r8.length()
            r12 = 0
        Lc7:
            if (r12 >= r11) goto Lef
            java.lang.Object r13 = r8.opt(r12)
            if (r13 == 0) goto Ld5
            java.lang.String r13 = r13.toString()
            if (r13 != 0) goto Ld6
        Ld5:
            r13 = r10
        Ld6:
            byte[] r14 = new byte[r9]
            r14 = {x02a6: FILL_ARRAY_DATA , data: [-52, -124, -12, -83, -70} // fill-array
            byte[] r15 = new byte[r2]
            r15 = {x02ae: FILL_ARRAY_DATA , data: [-85, -21, -101, -55, -55, 118} // fill-array
            java.lang.String r14 = p000.oa.m332(r14, r15)
            boolean r13 = p000.h4.m185(r13, r14)
            if (r13 == 0) goto Lec
            goto L19a
        Lec:
            int r12 = r12 + 1
            goto Lc7
        Lef:
            boolean r8 = p000.y2.f1188
            r11 = 0
            if (r8 == 0) goto L19f
            java.lang.String r8 = p000.y2.f1192
            int r8 = r8.length()
            if (r8 <= 0) goto Lfe
            r8 = r5
            goto Lff
        Lfe:
            r8 = 0
        Lff:
            java.lang.String r12 = "compile(...)"
            java.lang.String r13 = "pattern"
            r14 = 66
            if (r8 == 0) goto L154
            byte[] r8 = new byte[r3]
            r8 = {x02b6: FILL_ARRAY_DATA , data: [82, 42, 102, 42} // fill-array
            byte[] r15 = new byte[r2]
            r15 = {x02bc: FILL_ARRAY_DATA , data: [39, 89, 3, 88, 116, -105} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r15)
            org.json.JSONObject r8 = r6.optJSONObject(r8)
            if (r8 == 0) goto L12d
            byte[] r7 = new byte[r7]
            r7 = {x02c4: FILL_ARRAY_DATA , data: [67, 71, 3, -6, 5, -23, 64, 75} // fill-array
            byte[] r11 = new byte[r2]
            r11 = {x02cc: FILL_ARRAY_DATA , data: [45, 46, 96, -111, 107, -120} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r11)
            java.lang.String r11 = r8.optString(r7)
        L12d:
            if (r11 != 0) goto L130
            r11 = r10
        L130:
            int r7 = r11.length()
            if (r7 <= 0) goto L138
            r7 = r5
            goto L139
        L138:
            r7 = 0
        L139:
            if (r7 == 0) goto L154
            java.lang.String r7 = p000.y2.f1192
            ۟.u8[] r8 = p000.u8.f1081
            p000.h4.m189(r13, r7)
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7, r14)
            p000.h4.m188(r12, r7)
            java.util.regex.Matcher r7 = r7.matcher(r11)
            boolean r7 = r7.find()
            if (r7 == 0) goto L154
            goto L19a
        L154:
            java.lang.String r7 = p000.y2.f1191
            int r7 = r7.length()
            if (r7 <= 0) goto L15e
            r7 = r5
            goto L15f
        L15e:
            r7 = 0
        L15f:
            if (r7 == 0) goto L19f
            byte[] r7 = new byte[r9]
            r7 = {x02d4: FILL_ARRAY_DATA , data: [-63, 45, 90, 122, 100} // fill-array
            byte[] r8 = new byte[r2]
            r8 = {x02dc: FILL_ARRAY_DATA , data: [-75, 68, 46, 22, 1, 21} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r8)
            java.lang.String r7 = r6.optString(r7)
            if (r7 != 0) goto L176
            goto L177
        L176:
            r10 = r7
        L177:
            int r7 = r10.length()
            if (r7 <= 0) goto L17f
            r7 = r5
            goto L180
        L17f:
            r7 = 0
        L180:
            if (r7 == 0) goto L19f
            java.lang.String r7 = p000.y2.f1191
            ۟.u8[] r8 = p000.u8.f1081
            p000.h4.m189(r13, r7)
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7, r14)
            p000.h4.m188(r12, r7)
            java.util.regex.Matcher r7 = r7.matcher(r10)
            boolean r7 = r7.find()
            if (r7 == 0) goto L19f
        L19a:
            r1.remove(r4)
            goto L235
        L19f:
            boolean r7 = p000.na.f828
            if (r7 == 0) goto L235
            if (r19 == 0) goto L235
            byte[] r7 = new byte[r3]
            r7 = {x02e4: FILL_ARRAY_DATA , data: [91, -44, 43, 68} // fill-array
            byte[] r8 = new byte[r2]
            r8 = {x02ea: FILL_ARRAY_DATA , data: [46, -89, 78, 54, 62, -117} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r8)
            org.json.JSONObject r6 = r6.optJSONObject(r7)
            if (r6 == 0) goto L235
            byte[] r7 = new byte[r2]
            r7 = {x02f2: FILL_ARRAY_DATA , data: [1, 87, -10, 48, 122, -82} // fill-array
            byte[] r8 = new byte[r2]
            r8 = {x02fa: FILL_ARRAY_DATA , data: [104, 58, -105, 87, 31, -35} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r8)
            java.lang.String r7 = r6.optString(r7)
            p000.h4.m186(r7)
            int r8 = r7.length()
            if (r8 <= 0) goto L1d6
            r8 = r5
            goto L1d7
        L1d6:
            r8 = 0
        L1d7:
            if (r8 == 0) goto L235
            byte[] r8 = new byte[r2]
            r8 = {x0302: FILL_ARRAY_DATA , data: [-57, -10, -23, 16, 11, 73} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x030a: FILL_ARRAY_DATA , data: [-78, -123, -116, 98, 98, 45} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r9)
            java.lang.String r8 = r6.optString(r8)
            byte[] r9 = new byte[r5]
            r10 = 62
            r11 = 0
            r9[r11] = r10
            byte[] r10 = new byte[r2]
            r10 = {x0312: FILL_ARRAY_DATA , data: [1, -72, -9, 116, 59, 125} // fill-array
            java.lang.String r9 = p000.oa.m332(r9, r10)
            boolean r9 = p000.va.m438(r7, r9)
            if (r9 == 0) goto L20a
            java.lang.String r9 = p000.na.f827
            java.lang.StringBuilder r7 = p000.c4.m108(r7)
            java.lang.String r10 = "&"
            goto L212
        L20a:
            java.lang.String r9 = p000.na.f827
            java.lang.StringBuilder r7 = p000.c4.m108(r7)
            java.lang.String r10 = "?"
        L212:
            r7.append(r10)
            r7.append(r9)
            java.lang.String r9 = "="
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            byte[] r8 = new byte[r2]
            r8 = {x031a: FILL_ARRAY_DATA , data: [-1, 62, -95, 123, -72, -108} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x0322: FILL_ARRAY_DATA , data: [-106, 83, -64, 28, -35, -25} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r9)
            r6.put(r8, r7)
        L235:
            int r4 = r4 + (-1)
            goto L50
        L239:
            return
    }
}
