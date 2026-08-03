package a;

/* JADX INFO: renamed from: a.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0250ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0250ld f560a = null;
    public static final java.util.LinkedHashMap b = null;
    public static volatile boolean c;
    public static final java.util.concurrent.atomic.AtomicBoolean d = null;

    /* JADX INFO: renamed from: a.ld$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f561a;
        public final a.C0250ld.b b;
        public final java.lang.String c;
        public final int d;
        public final boolean e;
        public final a.D7<a.C0143fd, java.lang.Class<?>> f;
        public final a.D7<a.C0143fd, java.lang.Class<?>> g;
        public final a.D7<a.C0143fd, a.C0161gd> h;

        public a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public a(java.lang.String r3, a.C0250ld.b r4, java.lang.String r5, int r6, boolean r7, a.D7 r8, a.D7 r9, a.D7 r10, int r11) {
                r2 = this;
                r0 = r11 & 32
                r1 = 0
                if (r0 == 0) goto L6
                r8 = r1
            L6:
                r0 = r11 & 64
                if (r0 == 0) goto Lb
                r9 = r1
            Lb:
                r11 = r11 & 128(0x80, float:1.8E-43)
                if (r11 == 0) goto L10
                r10 = r1
            L10:
                r2.<init>()
                r2.f561a = r3
                r2.b = r4
                r2.c = r5
                r2.d = r6
                r2.e = r7
                r2.f = r8
                r2.g = r9
                r2.h = r10
                return
        }

        public final boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L3
                goto L57
            L3:
                boolean r0 = r3 instanceof a.C0250ld.a
                if (r0 != 0) goto L8
                goto L55
            L8:
                a.ld$a r3 = (a.C0250ld.a) r3
                java.lang.String r0 = r3.f561a
                java.lang.String r1 = r2.f561a
                boolean r0 = a.C0193i9.a(r1, r0)
                if (r0 != 0) goto L15
                goto L55
            L15:
                a.ld$b r0 = r2.b
                a.ld$b r1 = r3.b
                if (r0 == r1) goto L1c
                goto L55
            L1c:
                java.lang.String r0 = r2.c
                java.lang.String r1 = r3.c
                boolean r0 = a.C0193i9.a(r0, r1)
                if (r0 != 0) goto L27
                goto L55
            L27:
                int r0 = r2.d
                int r1 = r3.d
                if (r0 == r1) goto L2e
                goto L55
            L2e:
                boolean r0 = r2.e
                boolean r1 = r3.e
                if (r0 == r1) goto L35
                goto L55
            L35:
                a.D7<a.fd, java.lang.Class<?>> r0 = r2.f
                a.D7<a.fd, java.lang.Class<?>> r1 = r3.f
                boolean r0 = a.C0193i9.a(r0, r1)
                if (r0 != 0) goto L40
                goto L55
            L40:
                a.D7<a.fd, java.lang.Class<?>> r0 = r2.g
                a.D7<a.fd, java.lang.Class<?>> r1 = r3.g
                boolean r0 = a.C0193i9.a(r0, r1)
                if (r0 != 0) goto L4b
                goto L55
            L4b:
                a.D7<a.fd, a.gd> r0 = r2.h
                a.D7<a.fd, a.gd> r3 = r3.h
                boolean r3 = a.C0193i9.a(r0, r3)
                if (r3 != 0) goto L57
            L55:
                r3 = 0
                return r3
            L57:
                r3 = 1
                return r3
        }

        public final int hashCode() {
                r4 = this;
                java.lang.String r0 = r4.f561a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                a.ld$b r2 = r4.b
                int r2 = r2.hashCode()
                int r2 = r2 + r0
                int r2 = r2 * r1
                java.lang.String r0 = r4.c
                int r0 = a.C0487z.b(r0, r2, r1)
                int r2 = r4.d
                int r2 = java.lang.Integer.hashCode(r2)
                int r2 = r2 + r0
                int r2 = r2 * r1
                boolean r0 = r4.e
                int r0 = java.lang.Boolean.hashCode(r0)
                int r0 = r0 + r2
                int r0 = r0 * r1
                r2 = 0
                a.D7<a.fd, java.lang.Class<?>> r3 = r4.f
                if (r3 != 0) goto L2e
                r3 = r2
                goto L32
            L2e:
                int r3 = r3.hashCode()
            L32:
                int r0 = r0 + r3
                int r0 = r0 * r1
                a.D7<a.fd, java.lang.Class<?>> r3 = r4.g
                if (r3 != 0) goto L3a
                r3 = r2
                goto L3e
            L3a:
                int r3 = r3.hashCode()
            L3e:
                int r0 = r0 + r3
                int r0 = r0 * r1
                a.D7<a.fd, a.gd> r1 = r4.h
                if (r1 != 0) goto L45
                goto L49
            L45:
                int r2 = r1.hashCode()
            L49:
                int r0 = r0 + r2
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ResolverDefinition(featureId="
                r0.<init>(r1)
                java.lang.String r1 = r2.f561a
                r0.append(r1)
                java.lang.String r1 = ", targetType="
                r0.append(r1)
                a.ld$b r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", ruleId="
                r0.append(r1)
                java.lang.String r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", priority="
                r0.append(r1)
                int r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ", enabled="
                r0.append(r1)
                boolean r1 = r2.e
                r0.append(r1)
                java.lang.String r1 = ", oldResolver="
                r0.append(r1)
                a.D7<a.fd, java.lang.Class<?>> r1 = r2.f
                r0.append(r1)
                java.lang.String r1 = ", newResolver="
                r0.append(r1)
                a.D7<a.fd, java.lang.Class<?>> r1 = r2.g
                r0.append(r1)
                java.lang.String r1 = ", newResolverFull="
                r0.append(r1)
                a.D7<a.fd, a.gd> r1 = r2.h
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.ld$b */
    public enum b extends java.lang.Enum<a.C0250ld.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.C0250ld.b f562a = null;
        public static final a.C0250ld.b b = null;
        public static final a.C0250ld.b c = null;
        public static final /* synthetic */ a.C0250ld.b[] d = null;

        static {
                a.ld$b r0 = new a.ld$b
                java.lang.String r1 = "CLASS"
                r2 = 0
                r0.<init>(r1, r2)
                a.C0250ld.b.f562a = r0
                a.ld$b r1 = new a.ld$b
                java.lang.String r2 = "METHOD"
                r3 = 1
                r1.<init>(r2, r3)
                a.C0250ld.b.b = r1
                a.ld$b r2 = new a.ld$b
                java.lang.String r3 = "FIELD"
                r4 = 2
                r2.<init>(r3, r4)
                a.C0250ld.b.c = r2
                a.ld$b[] r0 = new a.C0250ld.b[]{r0, r1, r2}
                a.C0250ld.b.d = r0
                return
        }

        b() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.C0250ld.b valueOf(java.lang.String r1) {
                java.lang.Class<a.ld$b> r0 = a.C0250ld.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.ld$b r1 = (a.C0250ld.b) r1
                return r1
        }

        public static a.C0250ld.b[] values() {
                a.ld$b[] r0 = a.C0250ld.b.d
                java.lang.Object r0 = r0.clone()
                a.ld$b[] r0 = (a.C0250ld.b[]) r0
                return r0
        }
    }

    static {
            a.ld r0 = new a.ld
            r0.<init>()
            a.C0250ld.f560a = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            a.C0250ld.b = r1
            r0.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            a.C0250ld.d = r0
            return
    }

    public static boolean b(java.lang.ClassLoader r6, java.lang.String r7) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r6 = a.A1.b(r6, r7)     // Catch: java.lang.Throwable -> L56
        L6:
            r7 = 0
            if (r6 == 0) goto L51
            boolean r1 = r6.equals(r0)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L51
            boolean r1 = r6.equals(r0)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L51
            java.lang.Class[] r1 = r6.getInterfaces()     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "getInterfaces(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L56
            int r2 = r1.length     // Catch: java.lang.Throwable -> L56
        L1f:
            r3 = 1
            java.lang.String r4 = "androidx.recyclerview.widget.RecyclerView$Adapter"
            if (r7 >= r2) goto L35
            r5 = r1[r7]     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L56
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L32
        L30:
            r7 = r3
            goto L51
        L32:
            int r7 = r7 + 1
            goto L1f
        L35:
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L56
            boolean r7 = r7.equals(r4)     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L30
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L4c
            goto L30
        L4c:
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.Throwable -> L56
            goto L6
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L56
            goto L5b
        L56:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L5b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r0 = r6 instanceof a.C0447wd.a
            if (r0 == 0) goto L62
            r6 = r7
        L62:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
    }

    public final synchronized void a() {
            r4 = this;
            java.lang.String r0 = "init() called registered="
            monitor-enter(r4)
            java.lang.String r1 = "ResolverRegistry"
            boolean r2 = a.C0250ld.c     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L33
            r3.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Throwable -> L33
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L33
            boolean r0 = a.C0250ld.c     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L20
            monitor-exit(r4)
            return
        L20:
            r4.e()     // Catch: java.lang.Throwable -> L33
            r0 = 1
            a.C0250ld.c = r0     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "ResolverRegistry"
            java.lang.String r1 = "init() finished"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.lang.Throwable -> L33
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r4)
            return
        L33:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    public final synchronized a.C0250ld.a c(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = a.C0250ld.b     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            a.ld$a r2 = (a.C0250ld.a) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final synchronized void d(a.C0250ld.a r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = a.C0250ld.b     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = r3.f561a     // Catch: java.lang.Throwable -> La
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        La:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public final void e() {
            r44 = this;
            r0 = r44
            r4 = 26
            r5 = 9
            r6 = 24
            r7 = 7
            r8 = 12
            r9 = 25
            r10 = 23
            r15 = 4
            r16 = 5
            r11 = 8
            r17 = 3
            r12 = 6
            r18 = 2
            r13 = 0
            r19 = 1
            java.lang.String r14 = "ResolverRegistry"
            java.lang.String r1 = "registerBuiltins() start"
            java.lang.Object[] r1 = new java.lang.Object[]{r14, r1}
            a.C0453x1.b(r1)
            a.ld$a r21 = new a.ld$a
            a.ld$b r24 = a.C0250ld.b.f562a
            a.O8 r1 = new a.O8
            r1.<init>(r10)
            a.O8 r2 = new a.O8
            r2.<init>(r9)
            r26 = 1
            r28 = 0
            java.lang.String r22 = "F017_msg_storage"
            r23 = r24
            java.lang.String r24 = "msg_storage_v1"
            r25 = 0
            r30 = 64
            r27 = r1
            r29 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = r21
            r24 = r23
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r1.<init>(r12)
            a.id r2 = new a.id
            r3 = 14
            r2.<init>(r3)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F007_voip_mgr"
            java.lang.String r25 = ""
            r26 = 0
            r31 = 128(0x80, float:1.8E-43)
            r28 = r1
            r29 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r2 = "mm.storage.f9"
            java.lang.String r3 = "F017_msg_info_class"
            r1.<init>(r3, r2, r13, r8)
            a.ld$a r22 = new a.ld$a
            a.id r2 = new a.id
            r32 = r13
            r13 = 22
            r2.<init>(r13)
            a.jd r13 = new a.jd
            r13.<init>(r1, r7)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F017_msg_info"
            r26 = 0
            r31 = 128(0x80, float:1.8E-43)
            r28 = r2
            r25 = r3
            r29 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r2 = "SelectContactMvvmList"
            java.lang.String r3 = "F021_select_contact_mvvm_list_rule"
            r13 = 80
            r1.<init>(r3, r2, r13, r8)
            a.Cd r2 = a.Cd.f49a
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r7 = new a.id
            r7.<init>(r10)
            a.jd r10 = new a.jd
            r10.<init>(r1, r11)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F021_select_contact_mvvm_list"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r25 = r3
            r28 = r7
            r29 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r3 = "n3.t0"
            java.lang.String r7 = "F021_recent_forward_adapter"
            r1.<init>(r7, r3, r13, r8)
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r2 = new a.id
            r2.<init>(r6)
            a.jd r3 = new a.jd
            r3.<init>(r1, r5)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F021_recent_forward_adapter"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r28 = r2
            r29 = r3
            r25 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r1.<init>(r15)
            a.id r2 = new a.id
            r3 = 11
            r2.<init>(r3)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F013_timeline_adapter"
            java.lang.String r25 = ""
            r26 = 0
            r31 = 128(0x80, float:1.8E-43)
            r28 = r1
            r29 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r2 = "wx8076_locator_helper"
            java.lang.String r3 = "hm0.j1"
            r1.<init>(r2, r3, r13, r8)
            a.g3 r2 = new a.g3
            java.lang.String r3 = "wx8076_msg_foundation_h2"
            java.lang.String r7 = "e01.f"
            r2.<init>(r3, r7, r13, r8)
            a.g3 r3 = new a.g3
            java.lang.String r7 = "wx8076_conv_storage_iface"
            java.lang.String r10 = "com.tencent.mm.storage.k8"
            r3.<init>(r7, r10, r13, r8)
            a.g3 r7 = new a.g3
            java.lang.String r10 = "wx8076_conv_storage_class"
            r33 = r15
            java.lang.String r15 = "com.tencent.mm.storage.l4"
            r7.<init>(r10, r15, r13, r8)
            a.qb r25 = new a.qb
            java.lang.String r10 = "Ljava/lang/String;"
            java.util.List r28 = a.C0435w1.K(r10)
            r31 = 0
            java.lang.String r26 = "wx8076_conv_getter"
            java.lang.String r27 = "k4"
            java.lang.String r29 = ""
            java.lang.String r30 = "wx8076_conv_storage_class"
            r25.<init>(r26, r27, r28, r29, r30, r31)
            a.qb r34 = new a.qb
            java.lang.String r15 = "[Ljava/lang/String;"
            java.lang.String[] r10 = new java.lang.String[]{r15, r10}
            java.util.List r37 = a.C0294o3.d0(r10)
            r40 = 0
            java.lang.String r35 = "wx8076_native_hide"
            java.lang.String r36 = "void"
            java.lang.String r38 = ""
            java.lang.String r39 = "wx8076_conv_storage_class"
            r34.<init>(r35, r36, r37, r38, r39, r40)
            a.md[] r10 = new a.InterfaceC0268md[r12]
            r10[r32] = r1
            r10[r19] = r2
            r10[r18] = r3
            r10[r17] = r7
            r10[r33] = r25
            r10[r16] = r34
            java.util.List r1 = a.C0294o3.d0(r10)
            java.util.Iterator r1 = r1.iterator()
        L19c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1ae
            java.lang.Object r2 = r1.next()
            a.md r2 = (a.InterfaceC0268md) r2
            a.Cd r3 = a.Cd.f49a
            r3.i(r2)
            goto L19c
        L1ae:
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r2 = 19
            r1.<init>(r2)
            a.id r2 = new a.id
            r2.<init>(r9)
            r27 = 1
            r29 = 0
            java.lang.String r23 = "F010_conv_storage_pair"
            java.lang.String r25 = "wx8076_conv_storage_iface"
            r26 = 80
            r31 = 64
            r28 = r1
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r1.<init>(r4)
            a.id r2 = new a.id
            r3 = 27
            r2.<init>(r3)
            r27 = 1
            r29 = 0
            java.lang.String r23 = "F004_contact_add_mask"
            java.lang.String r25 = "contact_add_mask_v1"
            r26 = 0
            r31 = 64
            r28 = r1
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r34 = new a.ld$a
            a.ld$b r36 = a.C0250ld.b.c
            a.id r1 = new a.id
            r2 = 28
            r1.<init>(r2)
            r40 = 0
            r41 = 0
            java.lang.String r35 = "F004_contact_list_fields"
            java.lang.String r37 = "contact_list_fields_v1"
            r38 = 0
            r39 = 1
            r43 = 96
            r42 = r1
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1 = r34
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r2 = 29
            r1.<init>(r2)
            a.kd r2 = new a.kd
            r3 = r32
            r2.<init>(r3)
            r27 = 1
            r29 = 0
            java.lang.String r23 = "sns_info_model"
            java.lang.String r25 = "sns_info_model"
            r26 = 0
            r31 = 64
            r28 = r1
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.O8 r1 = new a.O8
            r1.<init>(r6)
            a.O8 r2 = new a.O8
            r2.<init>(r4)
            r27 = 1
            r29 = 0
            java.lang.String r23 = "notification_precheck"
            java.lang.String r25 = "notification_precheck"
            r26 = 0
            r31 = 64
            r28 = r1
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.O8 r1 = new a.O8
            r3 = 27
            r1.<init>(r3)
            a.O8 r2 = new a.O8
            r3 = 28
            r2.<init>(r3)
            r27 = 1
            r29 = 0
            java.lang.String r23 = "conv_list_classes"
            java.lang.String r25 = "conv_mvvm_list_v3"
            r26 = 0
            r31 = 64
            r28 = r1
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.O8 r1 = new a.O8
            r2 = 29
            r1.<init>(r2)
            a.id r2 = new a.id
            r3 = 0
            r2.<init>(r3)
            r27 = 1
            r29 = 0
            java.lang.String r23 = "sns_album_classes"
            java.lang.String r25 = "sns_album"
            r26 = 0
            r31 = 64
            r28 = r1
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r2 = r19
            r1.<init>(r2)
            a.id r2 = new a.id
            r3 = r18
            r2.<init>(r3)
            r27 = 1
            r29 = 0
            java.lang.String r23 = "forward_data_item"
            java.lang.String r25 = "forward_data_item"
            r26 = 0
            r31 = 64
            r28 = r1
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r2 = "m3.t0"
            java.lang.String r3 = "F004_contact_adapter_locator"
            r4 = 0
            r1.<init>(r3, r2, r4, r8)
            a.Cd r2 = a.Cd.f49a
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r6 = new a.id
            r7 = r17
            r6.<init>(r7)
            a.jd r7 = new a.jd
            r7.<init>(r1, r4)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F004_contact_adapter_locator"
            r26 = 0
            r31 = 128(0x80, float:1.8E-43)
            r25 = r3
            r28 = r6
            r29 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r3 = "mm.storage.g4"
            java.lang.String r4 = "F005_label_storage_g4"
            r1.<init>(r4, r3, r13, r8)
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r3 = new a.id
            r6 = r16
            r3.<init>(r6)
            a.jd r6 = new a.jd
            r7 = 1
            r6.<init>(r1, r7)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F005_hide_contact_label"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r28 = r3
            r25 = r4
            r29 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r3 = 7
            r1.<init>(r3)
            a.id r3 = new a.id
            r3.<init>(r11)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F006_hide_sns_entry"
            java.lang.String r25 = ""
            r26 = 0
            r31 = 128(0x80, float:1.8E-43)
            r28 = r1
            r29 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r3 = "FindMoreFriendsUI"
            java.lang.String r4 = "F006_find_more_friends_ui"
            r1.<init>(r4, r3, r13, r8)
            a.qb r25 = new a.qb
            a.Y5 r28 = a.Y5.f351a
            r31 = 0
            java.lang.String r37 = "F006_entry_control_method"
            java.lang.String r27 = "void"
            java.lang.String r29 = "C1"
            java.lang.String r30 = "F006_find_more_friends_ui"
            r26 = r37
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r3 = r25
            r2.i(r1)
            r2.i(r3)
            a.ld$a r22 = new a.ld$a
            a.id r6 = new a.id
            r6.<init>(r5)
            a.jd r5 = new a.jd
            r7 = 2
            r5.<init>(r1, r7)
            r27 = 1
            r30 = 0
            java.lang.String r23 = "F006_find_more_friends_ui"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r25 = r4
            r29 = r5
            r28 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r34 = new a.ld$a
            a.ld$b r36 = a.C0250ld.b.b
            a.id r1 = new a.id
            r4 = 10
            r1.<init>(r4)
            a.t r4 = new a.t
            r4.<init>(r11, r3)
            r39 = 1
            r42 = 0
            java.lang.String r35 = "F006_entry_control_method"
            r38 = 80
            r43 = 128(0x80, float:1.8E-43)
            r40 = r1
            r41 = r4
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1 = r34
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r3 = "plugin.fts.ui.f0"
            java.lang.String r4 = "F014_fts_adapter"
            r1.<init>(r4, r3, r13, r8)
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r3 = new a.id
            r3.<init>(r8)
            a.jd r5 = new a.jd
            r7 = 3
            r5.<init>(r1, r7)
            r27 = 1
            r30 = 0
            java.lang.String r23 = "F014_fts_adapter"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r28 = r3
            r25 = r4
            r29 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r3 = "CleanNewUI"
            java.lang.String r4 = "F019_clean_new_ui"
            r1.<init>(r4, r3, r13, r8)
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r3 = new a.id
            r5 = 13
            r3.<init>(r5)
            a.jd r5 = new a.jd
            r6 = r33
            r5.<init>(r1, r6)
            r27 = 1
            r30 = 0
            java.lang.String r23 = "F019_clean_new_ui"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r28 = r3
            r25 = r4
            r29 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.qb r17 = new a.qb
            java.lang.String r1 = "J"
            java.util.List r20 = a.C0435w1.K(r1)
            r23 = 0
            java.lang.String r18 = "F019_update_msg_root"
            java.lang.String r19 = "void"
            java.lang.String r21 = ""
            java.lang.String r22 = "F019_clean_new_ui"
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r3 = r17
            a.qb r17 = new a.qb
            java.lang.String[] r1 = new java.lang.String[]{r1, r1}
            java.util.List r20 = a.C0294o3.d0(r1)
            r23 = 0
            java.lang.String r18 = "F020_update_cache_root"
            java.lang.String r19 = "void"
            java.lang.String r21 = ""
            java.lang.String r22 = "F019_clean_new_ui"
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r1 = r17
            r2.i(r3)
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r3 = 15
            r1.<init>(r3)
            a.id r3 = new a.id
            r4 = 16
            r3.<init>(r4)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F008_hide_own_sns"
            java.lang.String r25 = ""
            r26 = 0
            r31 = 128(0x80, float:1.8E-43)
            r28 = r1
            r29 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r3 = "j4.m0"
            java.lang.String r4 = "F024_status_store"
            r1.<init>(r4, r3, r13, r8)
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r3 = new a.id
            r5 = 17
            r3.<init>(r5)
            a.jd r5 = new a.jd
            r6 = 5
            r5.<init>(r1, r6)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F024_status_store"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r28 = r3
            r25 = r4
            r29 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.g3 r1 = new a.g3
            java.lang.String r3 = "n3.o0"
            java.lang.String r4 = "F024_mvvm_submit_param"
            r1.<init>(r4, r3, r13, r8)
            r2.i(r1)
            a.ld$a r22 = new a.ld$a
            a.id r2 = new a.id
            r3 = 18
            r2.<init>(r3)
            a.jd r3 = new a.jd
            r3.<init>(r1, r12)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F024_mvvm_submit_param"
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r28 = r2
            r29 = r3
            r25 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            a.ld$a r22 = new a.ld$a
            a.id r1 = new a.id
            r2 = 20
            r1.<init>(r2)
            a.id r2 = new a.id
            r3 = 21
            r2.<init>(r3)
            r27 = 0
            r30 = 0
            java.lang.String r23 = "F025_msg_storage"
            java.lang.String r25 = ""
            r26 = 80
            r31 = 128(0x80, float:1.8E-43)
            r28 = r1
            r29 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r22
            r0.d(r1)
            java.lang.String r1 = "registerBuiltins() done"
            java.lang.Object[] r1 = new java.lang.Object[]{r14, r1}
            a.C0453x1.b(r1)
            return
    }
}
