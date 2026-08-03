package h.Hchat.hooks.items.script;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptDexKitBridge {
    public static final int $stable = 8;
    private final java.lang.ClassLoader classLoader;
    private final h.Hchat.dexkit.DexBridgeHolder dexBridgeHolder;
    private final org.luckypray.dexkit.DexKitBridge dexKitBridge;

    public ScriptDexKitBridge(org.luckypray.dexkit.DexKitBridge r1, h.Hchat.dexkit.DexBridgeHolder r2, java.lang.ClassLoader r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.dexKitBridge = r1
            r0.dexBridgeHolder = r2
            r0.classLoader = r3
            return
    }

    private final void appendClassMatches(org.luckypray.dexkit.DexKitBridge r3, java.util.List<java.lang.String> r4, java.util.Set<java.lang.Class<?>> r5) {
            r2 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L55
        L7:
            fh.a r0 = new fh.a
            r0.<init>()
            fh.a.r0(r0, r4)
            ch.c r4 = new ch.c
            r4.<init>()
            r4.f1664h = r0
            hh.j r3 = r3.findClass(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r3.next()
            hh.i r0 = (hh.i) r0
            lh.a r0 = r0.p()
            java.lang.String r0 = r0.f8057g
            java.lang.ClassLoader r1 = r2.classLoader
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r1)
            if (r0 == 0) goto L23
            r4.add(r0)
            goto L23
        L41:
            java.util.Iterator r3 = r4.iterator()
        L45:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            r5.add(r4)
            goto L45
        L55:
            return
    }

    private final void appendClassMemberMatches(org.luckypray.dexkit.DexKitBridge r3, java.util.List<java.lang.String> r4, java.util.Set<java.lang.reflect.Member> r5) {
            r2 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8
            goto L82
        L8:
            fh.a r0 = new fh.a
            r0.<init>()
            fh.a.r0(r0, r4)
            ch.c r4 = new ch.c
            r4.<init>()
            r4.f1664h = r0
            hh.j r3 = r3.findClass(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.next()
            hh.i r0 = (hh.i) r0
            lh.a r0 = r0.p()
            java.lang.String r0 = r0.f8057g
            java.lang.ClassLoader r1 = r2.classLoader
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r1)
            if (r0 == 0) goto L24
            r4.add(r0)
            goto L24
        L42:
            java.util.Iterator r3 = r4.iterator()
        L46:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredConstructors(r4)
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            r5.add(r1)
            goto L5a
        L6a:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        L72:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r4.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r5.add(r0)
            goto L72
        L82:
            return
    }

    private final void appendMethodMatches(org.luckypray.dexkit.DexKitBridge r3, java.util.List<java.lang.String> r4, java.util.Set<java.lang.reflect.Member> r5) {
            r2 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L5f
        L7:
            fh.k r0 = new fh.k
            r0.<init>()
            fh.k.u0(r0, r4)
            ch.e r4 = new ch.e
            r4.<init>()
            r4.f1666h = r0
            hh.p r3 = r3.findMethod(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r3.next()
            hh.o r0 = (hh.o) r0
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r0 = r0.r(r1)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L3d:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L43
            r0 = 0
        L43:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L23
            r4.add(r0)
            goto L23
        L4b:
            java.util.Iterator r3 = r4.iterator()
        L4f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r5.add(r4)
            goto L4f
        L5f:
            return
    }

    private final void appendMethodOwnerMatches(org.luckypray.dexkit.DexKitBridge r3, java.util.List<java.lang.String> r4, java.util.Set<java.lang.Class<?>> r5) {
            r2 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L63
        L7:
            fh.k r0 = new fh.k
            r0.<init>()
            fh.k.u0(r0, r4)
            ch.e r4 = new ch.e
            r4.<init>()
            r4.f1666h = r0
            hh.p r3 = r3.findMethod(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r3.next()
            hh.o r0 = (hh.o) r0
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> L3a
            java.lang.reflect.Method r0 = r0.r(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L41:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L47
            r0 = 0
        L47:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L23
            r4.add(r0)
            goto L23
        L4f:
            java.util.Iterator r3 = r4.iterator()
        L53:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            r5.add(r4)
            goto L53
        L63:
            return
    }

    private final void appendStringValue(java.lang.Object r4, java.util.List<java.lang.String> r5) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L34
        L3:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lb
            r5.add(r4)
            return
        Lb:
            boolean r0 = r4 instanceof java.lang.Iterable
            if (r0 == 0) goto L23
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            r3.appendStringValue(r0, r5)
            goto L15
        L23:
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L3f
            int r0 = java.lang.reflect.Array.getLength(r4)
            r1 = 0
        L32:
            if (r1 < r0) goto L35
        L34:
            return
        L35:
            java.lang.Object r2 = java.lang.reflect.Array.get(r4, r1)
            r3.appendStringValue(r2, r5)
            int r1 = r1 + 1
            goto L32
        L3f:
            java.lang.String r4 = r4.toString()
            r5.add(r4)
            return
    }

    private final void collectClassMatches(org.luckypray.dexkit.DexKitBridge r1, java.util.List<java.lang.String> r2, java.util.Set<java.lang.Class<?>> r3) {
            r0 = this;
            r0.appendClassMatches(r1, r2, r3)
            r0.appendMethodOwnerMatches(r1, r2, r3)
            return
    }

    private final void collectMemberMatches(org.luckypray.dexkit.DexKitBridge r1, java.util.List<java.lang.String> r2, java.util.Set<java.lang.reflect.Member> r3) {
            r0 = this;
            r0.appendMethodMatches(r1, r2, r3)
            r0.appendClassMemberMatches(r1, r2, r3)
            return
    }

    private final java.util.List<java.lang.String> flattenArray(java.lang.Object r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = java.lang.reflect.Array.getLength(r5)
            r2 = 0
        La:
            if (r2 < r1) goto Ld
            return r0
        Ld:
            java.lang.Object r3 = java.lang.reflect.Array.get(r5, r2)
            r4.appendStringValue(r3, r0)
            int r2 = r2 + 1
            goto La
    }

    private final java.util.List<java.lang.String> flattenStrings(java.lang.Iterable<?> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r3.next()
            r2.appendStringValue(r1, r0)
            goto L9
        L17:
            return r0
    }

    private final java.util.List<java.lang.String> normalizeStrings(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L5
            tf.t r2 = tf.t.f13167g
            return r2
        L5:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Le
            java.util.List r2 = a.a.x0(r2)
            return r2
        Le:
            boolean r0 = r2 instanceof java.lang.Iterable
            if (r0 == 0) goto L19
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = r1.flattenStrings(r2)
            return r2
        L19:
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L28
            java.util.List r2 = r1.flattenArray(r2)
            return r2
        L28:
            java.lang.String r2 = r2.toString()
            java.util.List r2 = a.a.x0(r2)
            return r2
    }

    public final org.luckypray.dexkit.DexKitBridge bridge() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r1.dexKitBridge
            return r0
    }

    public final java.util.List<java.lang.Class<?>> findClassList(java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.normalizeStrings(r1)
            java.util.List r1 = r0.findClassList(r1)
            return r1
    }

    public final java.util.List<java.lang.Class<?>> findClassList(java.util.List<java.lang.String> r6) {
            r5 = this;
            if (r6 == 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r6.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto Lb
            r0.add(r1)
            goto Lb
        L22:
            r0 = 0
        L23:
            tf.t r6 = tf.t.f13167g
            if (r0 != 0) goto L28
            r0 = r6
        L28:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
            goto L68
        L2f:
            org.luckypray.dexkit.DexKitBridge r1 = r5.dexKitBridge     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L68
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            r5.collectClassMatches(r1, r0, r2)     // Catch: java.lang.Throwable -> L60
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L60
            r4 = 1
            if (r3 <= r4) goto L62
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L60
        L4c:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L60
            java.util.List r3 = a.a.x0(r3)     // Catch: java.lang.Throwable -> L60
            r5.collectClassMatches(r1, r3, r2)     // Catch: java.lang.Throwable -> L60
            goto L4c
        L60:
            r0 = move-exception
            goto L69
        L62:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L60
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L60
            goto L6f
        L68:
            return r6
        L69:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L6f:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L7e
            java.lang.String r2 = r1.getMessage()
            java.lang.String r3 = "[Hchat:Script] DexKit查找类失败: "
            eh.a.x(r3, r2, r1)
        L7e:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L83
            goto L84
        L83:
            r6 = r0
        L84:
            java.util.List r6 = (java.util.List) r6
            return r6
    }

    public final java.util.List<java.lang.Class<?>> findClassList(java.lang.String... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = tf.l.L0(r1)
            java.util.List r1 = r0.findClassList(r1)
            return r1
    }

    public final java.util.List<java.lang.reflect.Member> findMemberList(java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.normalizeStrings(r1)
            java.util.List r1 = r0.findMemberList(r1)
            return r1
    }

    public final java.util.List<java.lang.reflect.Member> findMemberList(java.util.List<java.lang.String> r6) {
            r5 = this;
            if (r6 == 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r6.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto Lb
            r0.add(r1)
            goto Lb
        L22:
            r0 = 0
        L23:
            tf.t r6 = tf.t.f13167g
            if (r0 != 0) goto L28
            r0 = r6
        L28:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
            goto L68
        L2f:
            org.luckypray.dexkit.DexKitBridge r1 = r5.dexKitBridge     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L68
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            r5.collectMemberMatches(r1, r0, r2)     // Catch: java.lang.Throwable -> L60
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L60
            r4 = 1
            if (r3 <= r4) goto L62
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L60
        L4c:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L60
            java.util.List r3 = a.a.x0(r3)     // Catch: java.lang.Throwable -> L60
            r5.collectMemberMatches(r1, r3, r2)     // Catch: java.lang.Throwable -> L60
            goto L4c
        L60:
            r0 = move-exception
            goto L69
        L62:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L60
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L60
            goto L6f
        L68:
            return r6
        L69:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L6f:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L7e
            java.lang.String r2 = r1.getMessage()
            java.lang.String r3 = "[Hchat:Script] DexKit查找成员失败: "
            eh.a.x(r3, r2, r1)
        L7e:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L83
            goto L84
        L83:
            r6 = r0
        L84:
            java.util.List r6 = (java.util.List) r6
            return r6
    }

    public final java.util.List<java.lang.reflect.Member> findMemberList(java.lang.String... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = tf.l.L0(r1)
            java.util.List r1 = r0.findMemberList(r1)
            return r1
    }

    public final h.Hchat.dexkit.DexBridgeHolder holder() {
            r1 = this;
            h.Hchat.dexkit.DexBridgeHolder r0 = r1.dexBridgeHolder
            return r0
    }
}
