package a;

/* JADX INFO: renamed from: a.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0179hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0179hd f499a = null;
    public static volatile boolean b;
    public static volatile java.lang.ClassLoader c;

    /* JADX INFO: renamed from: a.hd$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f500a;
        public final java.lang.String b;
        public final java.io.Serializable c;
        public final java.io.Serializable d;

        public a(java.lang.String r1, java.lang.String r2, java.io.Serializable r3, java.io.Serializable r4) {
                r0 = this;
                r0.<init>()
                r0.f500a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public final boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L3
                goto L37
            L3:
                boolean r0 = r3 instanceof a.C0179hd.a
                if (r0 != 0) goto L8
                goto L35
            L8:
                a.hd$a r3 = (a.C0179hd.a) r3
                java.lang.String r0 = r3.f500a
                java.lang.String r1 = r2.f500a
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L15
                goto L35
            L15:
                java.lang.String r0 = r2.b
                java.lang.String r1 = r3.b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L20
                goto L35
            L20:
                java.io.Serializable r0 = r2.c
                java.io.Serializable r1 = r3.c
                boolean r0 = a.C0193i9.a(r0, r1)
                if (r0 != 0) goto L2b
                goto L35
            L2b:
                java.io.Serializable r0 = r2.d
                java.io.Serializable r3 = r3.d
                boolean r3 = a.C0193i9.a(r0, r3)
                if (r3 != 0) goto L37
            L35:
                r3 = 0
                return r3
            L37:
                r3 = 1
                return r3
        }

        public final int hashCode() {
                r4 = this;
                java.lang.String r0 = r4.f500a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r4.b
                int r0 = a.C0487z.b(r2, r0, r1)
                r2 = 0
                java.io.Serializable r3 = r4.c
                if (r3 != 0) goto L16
                r3 = r2
                goto L1a
            L16:
                int r3 = r3.hashCode()
            L1a:
                int r0 = r0 + r3
                int r0 = r0 * r1
                java.io.Serializable r1 = r4.d
                if (r1 != 0) goto L21
                goto L25
            L21:
                int r2 = r1.hashCode()
            L25:
                int r0 = r0 + r2
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Case(id="
                r0.<init>(r1)
                java.lang.String r1 = r2.f500a
                r0.append(r1)
                java.lang.String r1 = ", kind="
                r0.append(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", engineVal="
                r0.append(r1)
                java.io.Serializable r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", legacyVal="
                r0.append(r1)
                java.io.Serializable r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            a.hd r0 = new a.hd
            r0.<init>()
            a.C0179hd.f499a = r0
            r0 = 1
            a.C0179hd.b = r0
            return
    }

    public static a.C0161gd a(java.lang.String r28, a.C0143fd r29) {
            r2 = r28
            r7 = r29
            boolean r0 = a.C0179hd.b
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L14
            a.rb r0 = a.C0355rb.f672a
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L14
            r8 = r3
            goto L15
        L14:
            r8 = r1
        L15:
            boolean r0 = a.C0179hd.b
            if (r0 == 0) goto L35
            a.rb r4 = a.C0355rb.f672a
            monitor-enter(r4)
            java.util.LinkedHashMap r0 = a.C0355rb.c     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto L33
        L2d:
            r0 = r1
        L2e:
            monitor-exit(r4)
            if (r0 == 0) goto L35
            r9 = r3
            goto L36
        L33:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r0
        L35:
            r9 = r1
        L36:
            a.ld r0 = a.C0250ld.f560a
            a.ld$a r10 = r0.c(r2)
            r11 = 0
            if (r10 == 0) goto L42
            a.D7<a.fd, java.lang.Class<?>> r4 = r10.g
            goto L43
        L42:
            r4 = r11
        L43:
            if (r4 == 0) goto L47
            r12 = r3
            goto L48
        L47:
            r12 = r1
        L48:
            a.f6 r4 = a.C0136f6.f470a
            r4.getClass()
            java.lang.ClassLoader r4 = r7.b
            a.ld$a r5 = r0.c(r2)
            if (r5 == 0) goto L58
            a.D7<a.fd, a.gd> r0 = r5.h
            goto L59
        L58:
            r0 = r11
        L59:
            java.lang.String r6 = "ExistingBackend"
            r13 = 28
            if (r0 == 0) goto L90
            a.D7<a.fd, a.gd> r0 = r5.h     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.f(r7)     // Catch: java.lang.Throwable -> L68
            a.gd r0 = (a.C0161gd) r0     // Catch: java.lang.Throwable -> L68
            goto L6d
        L68:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L6d:
            java.lang.Throwable r14 = a.C0447wd.a(r0)
            if (r14 == 0) goto L80
            java.lang.String r15 = "newResolverFull FAIL for "
            java.lang.String r15 = r15.concat(r2)
            java.lang.Object[] r14 = new java.lang.Object[]{r6, r15, r14}
            a.C0453x1.a(r14)
        L80:
            boolean r14 = r0 instanceof a.C0447wd.a
            if (r14 == 0) goto L85
            r0 = r11
        L85:
            a.gd r0 = (a.C0161gd) r0
            if (r0 == 0) goto L90
            boolean r14 = r0.f485a
            if (r14 == 0) goto L90
        L8d:
            r11 = r0
            goto L4b6
        L90:
            if (r5 == 0) goto L95
            a.D7<a.fd, java.lang.Class<?>> r0 = r5.g
            goto L96
        L95:
            r0 = r11
        L96:
            if (r0 == 0) goto Lc9
            a.D7<a.fd, java.lang.Class<?>> r0 = r5.g     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r0.f(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> La1
            goto La6
        La1:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        La6:
            java.lang.Throwable r5 = a.C0447wd.a(r0)
            if (r5 == 0) goto Lb9
            java.lang.String r14 = "newResolver FAIL for "
            java.lang.String r14 = r14.concat(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r14, r5}
            a.C0453x1.a(r5)
        Lb9:
            boolean r5 = r0 instanceof a.C0447wd.a
            if (r5 == 0) goto Lbe
            r0 = r11
        Lbe:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lc9
            a.cd r1 = a.EnumC0089cd.f426a
            a.gd r0 = a.C0161gd.a.a(r0, r1, r11, r11, r13)
            goto L8d
        Lc9:
            int r0 = r2.hashCode()
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.component.h2"
            java.lang.String r6 = "ObfResolv: DexKit 命中 "
            java.lang.String r14 = "cl"
            switch(r0) {
                case -2000268143: goto L473;
                case -1989457361: goto L465;
                case -1967051526: goto L455;
                case -1948673376: goto L447;
                case -1946352257: goto L437;
                case -1605164217: goto L424;
                case -1600152996: goto L416;
                case -1587176526: goto L33d;
                case -1314564120: goto L32b;
                case -1268391660: goto L31b;
                case -1151154972: goto L30b;
                case -1135824144: goto L2f2;
                case -1077842615: goto L2e2;
                case -897656803: goto L2d2;
                case -832254182: goto L264;
                case -830557628: goto L24f;
                case -710442962: goto L23f;
                case -429662084: goto L22f;
                case -421655294: goto L21f;
                case 28208165: goto L20f;
                case 219392170: goto L1fa;
                case 235568406: goto L1ea;
                case 528661224: goto L1da;
                case 665889664: goto L170;
                case 678425280: goto L160;
                case 920607376: goto L150;
                case 1135560438: goto L13b;
                case 1180487253: goto L12b;
                case 1354784558: goto L116;
                case 1569815995: goto L104;
                case 1594006072: goto Lf4;
                case 1843172051: goto Ld8;
                default: goto Ld6;
            }
        Ld6:
            goto L47b
        Ld8:
            java.lang.String r0 = "F010_conv_storage_pair"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Le2
            goto L47b
        Le2:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            a.Rb$a r0 = a.Rb.g(r4)
            if (r0 == 0) goto Lf1
            java.lang.Class<?> r0 = r0.f247a
            goto L483
        Lf1:
            r0 = r11
            goto L483
        Lf4:
            java.lang.String r0 = "F006:contactInfoUI"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lfe
            goto L47b
        Lfe:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.g
            goto L483
        L104:
            java.lang.String r0 = "F017_msg_info"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L10e
            goto L47b
        L10e:
            java.lang.String r0 = "com.tencent.mm.storage.f9"
            java.lang.Class r0 = a.A1.b(r4, r0)
            goto L483
        L116:
            java.lang.String r0 = "F017:voipMgr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L120
            goto L47b
        L120:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            java.lang.Class r0 = a.Rb.k(r4)
            goto L483
        L12b:
            java.lang.String r0 = "F006:snsSelfAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L135
            goto L47b
        L135:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.n
            goto L483
        L13b:
            java.lang.String r0 = "F010:convStorage"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L145
            goto L47b
        L145:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            java.lang.Class r0 = a.Rb.e(r4)
            goto L483
        L150:
            java.lang.String r0 = "F002:contactList"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L15a
            goto L47b
        L15a:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.j
            goto L483
        L160:
            java.lang.String r0 = "F006:snsTimelineAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L16a
            goto L47b
        L16a:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.m
            goto L483
        L170:
            java.lang.String r0 = "F004:muteX3"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L17a
            goto L47b
        L17a:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            a.C0193i9.e(r4, r14)
            java.util.List r0 = a.C0043a5.c()
            java.util.Iterator r0 = r0.iterator()
        L18a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ba
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r5 = a.A1.b(r4, r1)
            if (r5 != 0) goto L19d
            goto L18a
        L19d:
            a.Rb r14 = a.Rb.f246a
            r14.getClass()
            boolean r14 = a.Rb.b(r5)
            if (r14 == 0) goto L18a
            java.lang.String r0 = r6.concat(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
        L1b7:
            r0 = r5
            goto L483
        L1ba:
            java.lang.String r0 = "e3.x3"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L483
            java.lang.String r0 = "ge3.x3"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L483
            java.lang.String r0 = "sc3.x3"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L483
            java.lang.String r0 = "sc3.x"
            java.lang.Class r0 = a.A1.b(r4, r0)
            goto L483
        L1da:
            java.lang.String r0 = "F006:mvvmList"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1e4
            goto L47b
        L1e4:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.l
            goto L483
        L1ea:
            java.lang.String r0 = "F006:snsCommentDetailUI"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1f4
            goto L47b
        L1f4:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.b
            goto L483
        L1fa:
            java.lang.String r0 = "F017:incomingCallMgr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L204
            goto L47b
        L204:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            java.lang.Class r0 = a.Rb.h(r4)
            goto L483
        L20f:
            java.lang.String r0 = "F006:wxRecyclerAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L219
            goto L47b
        L219:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.k
            goto L483
        L21f:
            java.lang.String r0 = "F006:snsRecyclerAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L229
            goto L47b
        L229:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.h
            goto L483
        L22f:
            java.lang.String r0 = "F006:commentListAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L239
            goto L47b
        L239:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.c
            goto L483
        L23f:
            java.lang.String r0 = "F006:snsAlbumAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L249
            goto L47b
        L249:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.o
            goto L483
        L24f:
            java.lang.String r0 = "F010:convStorageHelper"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L259
            goto L47b
        L259:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            java.lang.Class r0 = a.Rb.f(r4)
            goto L483
        L264:
            java.lang.String r0 = "F004:muteYj0"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L26e
            goto L47b
        L26e:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            a.C0193i9.e(r4, r14)
            java.lang.String r0 = "conv_storage_helper_v1"
            org.json.JSONObject r0 = a.C0043a5.d(r0)
            if (r0 == 0) goto L285
            java.lang.String r1 = "classNames"
            java.util.List r0 = a.C0043a5.g(r1, r0)
            goto L287
        L285:
            a.Y5 r0 = a.Y5.f351a
        L287:
            java.util.Iterator r0 = r0.iterator()
        L28b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2ba
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r5 = a.A1.b(r4, r1)
            if (r5 != 0) goto L29e
            goto L28b
        L29e:
            a.Rb r14 = a.Rb.f246a
            r14.getClass()
            boolean r14 = a.Rb.b(r5)
            if (r14 == 0) goto L28b
            java.lang.String r0 = r6.concat(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
            goto L1b7
        L2ba:
            java.lang.String r0 = "yj0.j1"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L483
            java.lang.String r0 = "yj0.h1"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L483
            java.lang.String r0 = "yj0.i1"
            java.lang.Class r0 = a.A1.b(r4, r0)
            goto L483
        L2d2:
            java.lang.String r0 = "F006_hide_sns_entry"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2dc
            goto L47b
        L2dc:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.m
            goto L483
        L2e2:
            java.lang.String r0 = "F006:snsMsgRelevanceAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2ec
            goto L47b
        L2ec:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.e
            goto L483
        L2f2:
            java.lang.String r0 = "F010:convStoragePair"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2fc
            goto L47b
        L2fc:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            a.Rb$a r0 = a.Rb.g(r4)
            if (r0 == 0) goto Lf1
            java.lang.Class<?> r0 = r0.f247a
            goto L483
        L30b:
            java.lang.String r0 = "F013_timeline_adapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L315
            goto L47b
        L315:
            java.lang.Class r0 = a.A1.b(r4, r5)
            goto L483
        L31b:
            java.lang.String r0 = "F003:convItem"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L325
            goto L47b
        L325:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.i
            goto L483
        L32b:
            java.lang.String r0 = "F005_hide_contact_label"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L335
            goto L47b
        L335:
            java.lang.String r0 = "d53.b"
            java.lang.Class r0 = a.A1.b(r4, r0)
            goto L483
        L33d:
            java.lang.String r0 = "F017:flutterVoip"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L347
            goto L47b
        L347:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            a.C0193i9.e(r4, r14)
            java.lang.Object r0 = a.C0043a5.f384a
            if (r0 == 0) goto L364
            java.lang.String r5 = "flutter_voip_class_v1"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L35e
            goto L364
        L35e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L364
            r5.<init>(r0)     // Catch: java.lang.Exception -> L364
            goto L365
        L364:
            r5 = r11
        L365:
            a.Y5 r0 = a.Y5.f351a
            if (r5 == 0) goto L3a3
            java.lang.String r14 = "classNames"
            org.json.JSONArray r5 = r5.optJSONArray(r14)
            if (r5 != 0) goto L372
            goto L3a3
        L372:
            int r0 = r5.length()
            a.f9 r0 = a.Oc.D(r1, r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = a.C0312p3.g0(r0, r15)
            r14.<init>(r15)
            java.util.Iterator r0 = r0.iterator()
        L389:
            r15 = r0
            a.e9 r15 = (a.C0121e9) r15
            boolean r15 = r15.c
            if (r15 == 0) goto L3a2
            r15 = r0
            a.c9 r15 = (a.AbstractC0085c9) r15
            int r15 = r15.a()
            java.lang.String r1 = ""
            java.lang.String r1 = r5.optString(r15, r1)
            r14.add(r1)
            r1 = 0
            goto L389
        L3a2:
            r0 = r14
        L3a3:
            java.util.Iterator r0 = r0.iterator()
        L3a7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L406
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r5 = a.A1.b(r4, r1)
            if (r5 != 0) goto L3ba
            goto L3a7
        L3ba:
            java.lang.reflect.Method[] r14 = r5.getDeclaredMethods()
            java.lang.String r15 = "getDeclaredMethods(...)"
            a.C0193i9.d(r14, r15)
            int r15 = r14.length
            r11 = 0
        L3c5:
            if (r11 >= r15) goto L402
            r18 = r14[r11]
            java.lang.String r13 = r18.getName()
            java.lang.String r3 = "a"
            boolean r3 = a.C0193i9.a(r13, r3)
            if (r3 != 0) goto L3e4
            java.lang.String r3 = r18.getName()
            java.lang.String r13 = "b"
            boolean r3 = a.C0193i9.a(r3, r13)
            if (r3 == 0) goto L3e2
            goto L3e4
        L3e2:
            r13 = 1
            goto L3fd
        L3e4:
            java.lang.Class[] r3 = r18.getParameterTypes()
            int r3 = r3.length
            r13 = 1
            if (r3 < r13) goto L3fd
            java.lang.String r0 = r6.concat(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
            a.C0453x1.b(r0)
            goto L1b7
        L3fd:
            int r11 = r11 + r13
            r3 = r13
            r13 = 28
            goto L3c5
        L402:
            r11 = 0
            r13 = 28
            goto L3a7
        L406:
            java.lang.String r0 = "iq0.d"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L483
            java.lang.String r0 = "com.tencent.mm.plugin.voip_cs.flutter.d"
            java.lang.Class r0 = a.A1.b(r4, r0)
            goto L483
        L416:
            java.lang.String r0 = "F006:snsMsgAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L41f
            goto L47b
        L41f:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.d
            goto L483
        L424:
            java.lang.String r0 = "F007_voip_mgr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L42d
            goto L47b
        L42d:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            java.lang.Class r0 = a.Rb.k(r4)
            goto L483
        L437:
            java.lang.String r0 = "sns_info_model"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L440
            goto L47b
        L440:
            java.lang.String r0 = "ae4.p"
            java.lang.Class r0 = a.A1.b(r4, r0)
            goto L483
        L447:
            java.lang.String r0 = "F006:snsTimeLineAdapter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L450
            goto L47b
        L450:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.f
            goto L483
        L455:
            java.lang.String r0 = "F004_contact_add_mask"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L45e
            goto L47b
        L45e:
            java.lang.String r0 = "ym5.q"
            java.lang.Class r0 = a.A1.b(r4, r0)
            goto L483
        L465:
            java.lang.String r0 = "F008_hide_own_sns"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L46e
            goto L47b
        L46e:
            java.lang.Class r0 = a.A1.b(r4, r5)
            goto L483
        L473:
            java.lang.String r0 = "F021_select_contact_mvvm_list"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L47d
        L47b:
            r0 = 0
            goto L483
        L47d:
            java.lang.String r0 = "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList"
            java.lang.Class r0 = a.A1.b(r4, r0)
        L483:
            if (r0 == 0) goto L490
            a.cd r1 = a.EnumC0089cd.b
            r3 = 0
            r4 = 28
            a.gd r0 = a.C0161gd.a.a(r0, r1, r3, r3, r4)
            goto L8d
        L490:
            a.dd r25 = a.EnumC0107dd.c
            a.j6 r0 = new a.j6
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "NOT_FOUND"
            java.lang.String r3 = "existing backend: no resolver wired for this featureId"
            java.lang.String r4 = ""
            r0.<init>(r1, r2, r3, r4, r5)
            a.gd r20 = new a.gd
            a.cd r24 = a.EnumC0089cd.b
            r21 = 0
            r22 = 0
            r26 = 0
            r27 = 0
            r23 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r0 = r20
            goto L8d
        L4b6:
            if (r12 == 0) goto L4bd
            if (r8 != 0) goto L4bf
            if (r9 == 0) goto L4bd
            goto L4bf
        L4bd:
            r9 = 0
            goto L520
        L4bf:
            a.C0193i9.b(r10)     // Catch: java.lang.Throwable -> L4cf
            a.D7<a.fd, java.lang.Class<?>> r0 = r10.g     // Catch: java.lang.Throwable -> L4cf
            a.C0193i9.b(r0)     // Catch: java.lang.Throwable -> L4cf
            java.lang.Object r0 = r0.f(r7)     // Catch: java.lang.Throwable -> L4cf
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L4cf
        L4cd:
            r3 = r0
            goto L4d5
        L4cf:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
            goto L4cd
        L4d5:
            java.lang.Throwable r0 = a.C0447wd.a(r3)
            if (r0 == 0) goto L4ea
            java.lang.String r1 = "ResolverEngine"
            java.lang.String r4 = "newResolver invoke FAILED for "
            java.lang.String r4 = r4.concat(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r4, r0}
            a.C0453x1.a(r0)
        L4ea:
            boolean r0 = r3 instanceof a.C0447wd.a
            if (r0 == 0) goto L4ef
            r3 = 0
        L4ef:
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L4fe
            a.cd r0 = a.EnumC0089cd.f426a
            r4 = 28
            r9 = 0
            a.gd r0 = a.C0161gd.a.a(r3, r0, r9, r9, r4)
            r3 = r0
            goto L521
        L4fe:
            r9 = 0
            a.dd r17 = a.EnumC0107dd.c
            a.j6 r15 = new a.j6
            java.lang.String r1 = "NEW_PATH_NOT_FOUND"
            java.lang.String r3 = "registry newResolver returned null"
            java.lang.String r4 = ""
            long r5 = java.lang.System.currentTimeMillis()
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            a.gd r12 = new a.gd
            a.cd r16 = a.EnumC0089cd.b
            r13 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3 = r12
            goto L521
        L520:
            r3 = r9
        L521:
            if (r8 == 0) goto L52b
            if (r3 == 0) goto L52b
            boolean r0 = r3.f485a
            if (r0 == 0) goto L52b
            r0 = r3
            goto L52c
        L52b:
            r0 = r11
        L52c:
            a.O8 r1 = new a.O8
            r4 = 22
            r1.<init>(r4)
            if (r3 == 0) goto L55b
            boolean r4 = r11.f485a
            boolean r5 = r3.f485a
            if (r4 != r5) goto L558
            java.lang.Class<?> r4 = r11.b
            if (r4 == 0) goto L544
            java.lang.String r4 = r4.getName()
            goto L545
        L544:
            r4 = r9
        L545:
            java.lang.Class<?> r5 = r3.b
            if (r5 == 0) goto L54e
            java.lang.String r5 = r5.getName()
            goto L54f
        L54e:
            r5 = r9
        L54f:
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto L558
            java.lang.String r4 = "PASS"
            goto L55d
        L558:
            java.lang.String r4 = "FAIL"
            goto L55d
        L55b:
            java.lang.String r4 = "NA"
        L55d:
            int r5 = r7.f473a
            java.lang.Object r6 = r1.f(r11)
            java.lang.Object r1 = r1.f(r3)
            if (r8 == 0) goto L56c
            java.lang.String r3 = "NEW"
            goto L56e
        L56c:
            java.lang.String r3 = "LEGACY"
        L56e:
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "bypass7 featureId="
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r2 = " ver="
            r9.append(r2)
            r9.append(r5)
            java.lang.String r2 = " legacy="
            r9.append(r2)
            r9.append(r6)
            java.lang.String r2 = " new="
            r9.append(r2)
            r9.append(r1)
            java.lang.String r1 = " matched="
            r9.append(r1)
            r9.append(r4)
            java.lang.String r1 = " effective="
            r9.append(r1)
            r9.append(r3)
            java.lang.String r1 = " ts="
            r9.append(r1)
            r9.append(r7)
            java.lang.String r1 = r9.toString()
            java.lang.String r2 = "ResolverEngine"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            a.C0453x1.b(r1)
            return r0
    }

    public static void b() {
            java.lang.ClassLoader r2 = a.C0179hd.c
            java.lang.String r3 = "ResolverEngine"
            if (r2 != 0) goto L10
            java.lang.String r0 = "[ResolverBypass] skip: defaultClassLoader not injected"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            a.C0453x1.b(r0)
            return
        L10:
            int r0 = a.B1.a.b()
            a.fd r4 = new a.fd
            r4.<init>(r0, r2)
            a.hd$a r5 = new a.hd$a
            java.lang.String r6 = "F010_conv_storage_pair"
            a.gd r7 = a(r6, r4)
            java.lang.Class<?> r7 = r7.b
            a.Rb r8 = a.Rb.f246a
            r8.getClass()
            a.Rb$a r8 = a.Rb.g(r2)
            if (r8 == 0) goto L31
            java.lang.Class<?> r8 = r8.f247a
            goto L32
        L31:
            r8 = 0
        L32:
            java.lang.String r9 = "CLASS"
            r5.<init>(r6, r9, r7, r8)
            a.hd$a r6 = new a.hd$a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            int r8 = a.B1.a.b()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r10 = "D1:versionGate"
            java.lang.String r11 = "VERSION"
            r6.<init>(r10, r11, r7, r8)
            a.hd$a r7 = new a.hd$a
            java.lang.String r8 = "F007_voip_mgr"
            a.gd r10 = a(r8, r4)
            java.lang.Class<?> r10 = r10.b
            java.lang.Class r11 = a.Rb.k(r2)
            r7.<init>(r8, r9, r10, r11)
            a.hd$a r8 = new a.hd$a
            java.lang.String r10 = "F017_msg_info"
            a.gd r11 = a(r10, r4)
            java.lang.Class<?> r11 = r11.b
            java.lang.String r12 = "com.tencent.mm.storage.f9"
            java.lang.Class r14 = a.A1.b(r2, r12)
            r8.<init>(r10, r9, r11, r14)
            a.hd$a r10 = new a.hd$a
            java.lang.String r11 = "F021_select_contact_mvvm_list"
            a.gd r14 = a(r11, r4)
            java.lang.Class<?> r14 = r14.b
            java.lang.String r15 = "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList"
            java.lang.Class r15 = a.A1.b(r2, r15)
            r10.<init>(r11, r9, r14, r15)
            r11 = r10
            a.hd$a r10 = new a.hd$a
            java.lang.String r14 = "F013_timeline_adapter"
            a.gd r15 = a(r14, r4)
            java.lang.Class<?> r15 = r15.b
            r16 = 1
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.h2"
            java.lang.Class r1 = a.A1.b(r2, r1)
            r10.<init>(r14, r9, r15, r1)
            r1 = r11
            a.hd$a r11 = new a.hd$a
            java.lang.String r14 = "F004_contact_add_mask"
            a.gd r4 = a(r14, r4)
            java.lang.Class<?> r4 = r4.b
            java.lang.String r15 = "ym5.q"
            java.lang.Class r15 = a.A1.b(r2, r15)
            r11.<init>(r14, r9, r4, r15)
            a.Cd r14 = a.Cd.f49a     // Catch: java.lang.Throwable -> Ld0
            a.g3 r15 = new a.g3     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r13 = "F017_msg_info_class"
            java.lang.String r4 = "mm.storage.f9"
            r17 = r1
            r1 = 28
            r18 = r14
            r14 = 0
            r15.<init>(r13, r4, r14, r1)     // Catch: java.lang.Throwable -> Lce
            a.fd r1 = new a.fd     // Catch: java.lang.Throwable -> Lce
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lce
            r18.getClass()     // Catch: java.lang.Throwable -> Lce
            a.gd r0 = a.Cd.a(r15, r1)     // Catch: java.lang.Throwable -> Lce
            java.lang.Class<?> r0 = r0.b     // Catch: java.lang.Throwable -> Lce
            goto Ld8
        Lce:
            r0 = move-exception
            goto Ld4
        Ld0:
            r0 = move-exception
            r17 = r1
            r14 = 0
        Ld4:
            a.wd$a r0 = a.C0465xd.a(r0)
        Ld8:
            java.lang.Throwable r1 = a.C0447wd.a(r0)
            if (r1 == 0) goto Le9
            java.lang.String r4 = "F017 RuleSystem direct FAIL"
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r1}
            a.C0453x1.a(r1)
            a.Wf r1 = a.Wf.f330a
        Le9:
            boolean r1 = r0 instanceof a.C0447wd.a
            if (r1 == 0) goto Lee
            r0 = 0
        Lee:
            java.lang.Class r1 = a.A1.b(r2, r12)
            a.hd$a r12 = new a.hd$a
            java.lang.String r2 = "F017_rule_direct"
            r12.<init>(r2, r9, r0, r1)
            r9 = r17
            a.hd$a[] r0 = new a.C0179hd.a[]{r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.List r0 = a.C0294o3.d0(r0)
            boolean r1 = a.C0179hd.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[ResolverBypass] === START (newPathEnabled="
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = ") ==="
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            a.C0453x1.b(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r14
            r4 = r2
            r5 = r4
        L126:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L1c1
            java.lang.Object r6 = r0.next()
            a.hd$a r6 = (a.C0179hd.a) r6
            java.io.Serializable r7 = r6.c
            java.io.Serializable r8 = r6.d
            boolean r7 = a.C0193i9.a(r7, r8)
            if (r7 == 0) goto L13f
            int r2 = r2 + 1
            goto L141
        L13f:
            int r4 = r4 + 1
        L141:
            java.io.Serializable r8 = r6.c
            if (r8 != 0) goto L14c
            java.io.Serializable r9 = r6.d
            if (r9 != 0) goto L14c
            r9 = r16
            goto L14d
        L14c:
            r9 = r14
        L14d:
            if (r9 == 0) goto L151
            int r5 = r5 + 1
        L151:
            java.lang.String r10 = "null"
            if (r8 == 0) goto L16b
            boolean r11 = r8 instanceof java.lang.Class
            if (r11 == 0) goto L15d
            r11 = r8
            java.lang.Class r11 = (java.lang.Class) r11
            goto L15e
        L15d:
            r11 = 0
        L15e:
            if (r11 == 0) goto L165
            java.lang.String r8 = r11.getName()
            goto L169
        L165:
            java.lang.String r8 = r8.toString()
        L169:
            if (r8 != 0) goto L16c
        L16b:
            r8 = r10
        L16c:
            java.io.Serializable r11 = r6.d
            if (r11 == 0) goto L188
            boolean r12 = r11 instanceof java.lang.Class
            if (r12 == 0) goto L178
            r12 = r11
            java.lang.Class r12 = (java.lang.Class) r12
            goto L179
        L178:
            r12 = 0
        L179:
            if (r12 == 0) goto L180
            java.lang.String r11 = r12.getName()
            goto L184
        L180:
            java.lang.String r11 = r11.toString()
        L184:
            if (r11 != 0) goto L187
            goto L188
        L187:
            r10 = r11
        L188:
            if (r9 == 0) goto L18d
            java.lang.String r9 = "(both-null-consistent)"
            goto L18f
        L18d:
            java.lang.String r9 = ""
        L18f:
            java.lang.String r11 = r6.f500a
            java.lang.String r6 = r6.b
            if (r7 == 0) goto L198
            java.lang.String r7 = "PASS"
            goto L19a
        L198:
            java.lang.String r7 = "FAIL"
        L19a:
            java.lang.String r12 = "[ResolverBypass] case="
            java.lang.String r13 = " kind="
            java.lang.String r15 = " result="
            java.lang.StringBuilder r6 = a.C0487z.i(r12, r11, r13, r6, r15)
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = " engine="
            r6.append(r7)
            r6.append(r8)
            java.lang.String r7 = " legacy="
            java.lang.String r6 = a.C0487z.h(r6, r7, r10)
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r6}
            a.C0453x1.b(r6)
            goto L126
        L1c1:
            if (r4 != 0) goto L1c6
            java.lang.String r0 = "verified"
            goto L1c8
        L1c6:
            java.lang.String r0 = "MISMATCH-investigate"
        L1c8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[ResolverBypass] === SUMMARY pass="
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " fail="
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = " unresolved="
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = " (thin-wrapper "
            r6.append(r2)
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            a.C0453x1.b(r0)
            return
    }
}
