package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f4971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f4972d;

    public q0(f.p r2, p4.t r3) {
            r1 = this;
            r0 = 3
            r1.f4969a = r0
            r1.<init>()
            r1.f4971c = r2
            r1.f4972d = r3
            return
    }

    public q0(h0.d1 r2) {
            r1 = this;
            r0 = 1
            r1.f4969a = r0
            r1.<init>()
            r1.f4972d = r2
            r2 = 1
            r1.f4970b = r2
            return
    }

    public q0(java.util.HashMap r2, boolean r3, java.util.ArrayList r4) {
            r1 = this;
            r0 = 2
            r1.f4969a = r0
            r1.<init>()
            r1.f4971c = r2
            r1.f4970b = r3
            r1.f4972d = r4
            return
    }

    public q0(boolean r2, h0.v r3, h0.s r4) {
            r1 = this;
            r0 = 0
            r1.f4969a = r0
            r1.<init>()
            r1.f4970b = r2
            r1.f4971c = r3
            r1.f4972d = r4
            return
    }

    public static java.lang.String b(java.lang.Class r2) {
            int r0 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 == 0) goto L15
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "
            java.lang.String r2 = r0.concat(r2)
            return r2
        L15:
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "\nSee "
            r0.append(r2)
            java.lang.String r2 = "r8-abstract-class"
            java.lang.String r1 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r1.concat(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L3e:
            r2 = 0
            return r2
    }

    public boolean a(long r8) {
            r7 = this;
            java.lang.Object r0 = r7.f4972d
            p4.t r0 = (p4.t) r0
            java.lang.Object r0 = r0.f10224h
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L23
            java.lang.Object r4 = r0.get(r3)
            r5 = r4
            s1.v r5 = (s1.v) r5
            long r5 = r5.f12311a
            boolean r5 = s1.s.e(r5, r8)
            if (r5 == 0) goto L20
            goto L24
        L20:
            int r3 = r3 + 1
            goto Le
        L23:
            r4 = 0
        L24:
            s1.v r4 = (s1.v) r4
            if (r4 == 0) goto L2b
            boolean r8 = r4.f12318h
            return r8
        L2b:
            return r2
    }

    public j6.o c(n6.a r10, boolean r11) {
            r9 = this;
            java.lang.reflect.Type r0 = r10.f9029b
            java.lang.Class r10 = r10.f9028a
            java.lang.Object r1 = r9.f4971c
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r2 = r1.get(r0)
            r3 = 0
            if (r2 != 0) goto L1a3
            java.lang.Object r1 = r1.get(r10)
            if (r1 != 0) goto L19f
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r10)
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L25
            j6.a r1 = new j6.a
            r1.<init>(r0, r4)
            goto L30
        L25:
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r10 != r1) goto L2f
            j6.a r1 = new j6.a
            r1.<init>(r0, r2)
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 == 0) goto L33
            return r1
        L33:
            java.lang.Object r1 = r9.f4972d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            j6.h.d(r1)
            int r1 = r10.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            r5 = 17
            if (r1 == 0) goto L48
        L46:
            r1 = r3
            goto L87
        L48:
            java.lang.reflect.Constructor r1 = r10.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L46
            f8.i r6 = l6.c.f7868a
            r1.setAccessible(r4)     // Catch: java.lang.Exception -> L53
            r6 = r3
            goto L79
        L53:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed making constructor '"
            r7.<init>(r8)
            java.lang.String r8 = l6.c.b(r1)
            r7.append(r8)
            java.lang.String r8 = "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            r7.append(r8)
            java.lang.String r6 = l6.c.e(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L79:
            if (r6 == 0) goto L81
            j6.b r1 = new j6.b
            r1.<init>(r6, r2)
            goto L87
        L81:
            ke.h r6 = new ke.h
            r6.<init>(r1, r5)
            r1 = r6
        L87:
            if (r1 == 0) goto L8a
            return r1
        L8a:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r10)
            r6 = 18
            if (r1 == 0) goto Ld8
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto La5
            i8.f r3 = new i8.f
            r0 = 22
            r3.<init>(r0)
            goto L144
        La5:
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto Lb6
            i8.f r3 = new i8.f
            r0 = 23
            r3.<init>(r0)
            goto L144
        Lb6:
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto Lc7
            i8.f r3 = new i8.f
            r0 = 24
            r3.<init>(r0)
            goto L144
        Lc7:
            java.lang.Class<java.util.ArrayDeque> r0 = java.util.ArrayDeque.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L144
            i8.f r3 = new i8.f
            r0 = 25
            r3.<init>(r0)
            goto L144
        Ld8:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r10)
            if (r1 == 0) goto L144
            java.lang.Class<j6.n> r1 = j6.n.class
            boolean r1 = r10.isAssignableFrom(r1)
            if (r1 == 0) goto L107
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto Led
            goto L101
        Led:
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r1 = r0.length
            if (r1 != 0) goto Lf7
            goto L107
        Lf7:
            r0 = r0[r2]
            java.lang.Class r0 = j6.h.f(r0)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L107
        L101:
            i8.f r3 = new i8.f
            r3.<init>(r5)
            goto L144
        L107:
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L115
            i8.f r3 = new i8.f
            r3.<init>(r6)
            goto L144
        L115:
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L125
            i8.f r3 = new i8.f
            r0 = 19
            r3.<init>(r0)
            goto L144
        L125:
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r0 = java.util.concurrent.ConcurrentHashMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L135
            i8.f r3 = new i8.f
            r0 = 20
            r3.<init>(r0)
            goto L144
        L135:
            java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r0 = java.util.concurrent.ConcurrentSkipListMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L144
            i8.f r3 = new i8.f
            r0 = 21
            r3.<init>(r0)
        L144:
            if (r3 == 0) goto L147
            return r3
        L147:
            java.lang.String r0 = b(r10)
            if (r0 == 0) goto L153
            j6.b r10 = new j6.b
            r10.<init>(r0, r4)
            return r10
        L153:
            java.lang.String r0 = "Unable to create instance of "
            if (r11 != 0) goto L16f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = "; Register an InstanceCreator or a TypeAdapter for this type."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            j6.b r11 = new j6.b
            r0 = 2
            r11.<init>(r10, r0)
            return r11
        L16f:
            boolean r11 = r9.f4970b
            if (r11 == 0) goto L179
            ke.h r11 = new ke.h
            r11.<init>(r10, r6)
            goto L19e
        L179:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r0 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.reflect.Constructor[] r10 = r10.getDeclaredConstructors()
            int r10 = r10.length
            if (r10 != 0) goto L197
            java.lang.String r10 = " Or adjust your R8 configuration to keep the no-args constructor of the class."
            java.lang.String r11 = r11.concat(r10)
        L197:
            j6.b r10 = new j6.b
            r0 = 3
            r10.<init>(r11, r0)
            r11 = r10
        L19e:
            return r11
        L19f:
            ah.a.d()
            return r3
        L1a3:
            ah.a.d()
            return r3
    }

    public h0.h d() {
            r2 = this;
            java.lang.Object r0 = r2.f4972d
            h0.s r0 = (h0.s) r0
            int r1 = r0.f4979b
            int r0 = r0.f4980c
            if (r1 >= r0) goto Ld
            h0.h r0 = h0.h.f4899h
            return r0
        Ld:
            if (r1 <= r0) goto L12
            h0.h r0 = h0.h.f4898g
            return r0
        L12:
            h0.h r0 = h0.h.f4900i
            return r0
    }

    public void e() {
            r2 = this;
            boolean r0 = r2.f4970b
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r2.f4972d
            h0.d1 r0 = (h0.d1) r0
            java.lang.Object r1 = r2.f4971c
            i2.m0 r1 = (i2.m0) r1
            h0.d1.b(r0, r1)
        Lf:
            return
    }

    public long f(n2.s r11, long r12, boolean r14, g1.d r15) {
            r10 = this;
            java.lang.Object r0 = r10.f4972d
            r1 = r0
            h0.d1 r1 = (h0.d1) r1
            r8 = 0
            r9 = 0
            r6 = 0
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r15
            long r11 = h0.d1.c(r1, r2, r3, r5, r6, r7, r8, r9)
            java.lang.Object r13 = r10.f4971c
            i2.m0 r13 = (i2.m0) r13
            boolean r13 = i2.m0.a(r13, r11)
            if (r13 != 0) goto L1d
            r13 = 0
            r10.f4970b = r13
        L1d:
            boolean r13 = i2.m0.c(r11)
            if (r13 == 0) goto L26
            w.h0 r13 = w.h0.f14486i
            goto L28
        L26:
            w.h0 r13 = w.h0.f14485h
        L28:
            r1.q(r13)
            return r11
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f4969a
            switch(r0) {
                case 0: goto L13;
                case 1: goto L5;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r2.f4971c
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r0 = r0.toString()
            return r0
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SingleSelectionLayout(isStartHandle="
            r0.<init>(r1)
            boolean r1 = r2.f4970b
            r0.append(r1)
            java.lang.String r1 = ", crossed="
            r0.append(r1)
            h0.h r1 = r2.d()
            r0.append(r1)
            java.lang.String r1 = ", info=\n\t"
            r0.append(r1)
            java.lang.Object r1 = r2.f4972d
            h0.s r1 = (h0.s) r1
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
