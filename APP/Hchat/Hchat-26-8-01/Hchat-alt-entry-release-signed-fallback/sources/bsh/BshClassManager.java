package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshClassManager {
    static final bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager.MemberCache> memberCache = null;
    protected final transient java.util.Map<java.lang.String, java.lang.Class<?>> absoluteClassCache;
    protected final transient java.util.Set<java.lang.String> absoluteNonClasses;
    protected final transient java.util.Map<java.lang.String, java.lang.Class<?>> associatedClasses;
    private bsh.Interpreter declaringInterpreter;
    protected java.lang.ClassLoader externalClassLoader;
    protected bsh.loader.BshLoaderManager loaderManager;
    protected bsh.loader.BshPluginLoader pluginLoader;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Listener {
        void classLoaderChanged();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class MemberCache {
        private final java.util.Map<java.lang.String, java.util.List<bsh.Invocable>> cache;
        private final java.util.Map<java.lang.String, bsh.Invocable> fields;

        public MemberCache(java.lang.Class<?> r9) {
                r8 = this;
                r8.<init>()
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r8.cache = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r8.fields = r0
                r0 = r9
            L12:
                if (r0 == 0) goto Lc3
                boolean r1 = bsh.Reflect.isPackageAccessible(r0)
                if (r1 == 0) goto Lb6
                boolean r1 = bsh.Reflect.isPackageScope(r0)
                if (r1 == 0) goto L26
                boolean r1 = bsh.Reflect.isPrivate(r0)
                if (r1 == 0) goto L32
            L26:
                boolean r1 = bsh.Reflect.isPublic(r0)
                if (r1 != 0) goto L32
                boolean r1 = bsh.Capabilities.haveAccessibility()
                if (r1 == 0) goto Lb6
            L32:
                if (r9 != r0) goto L36
                r1 = 0
                goto L3e
            L36:
                bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r1 = bsh.BshClassManager.memberCache
                java.lang.Object r1 = r1.get(r0)
                bsh.BshClassManager$MemberCache r1 = (bsh.BshClassManager.MemberCache) r1
            L3e:
                java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
                int r3 = r2.length
                r4 = 0
                r5 = r4
            L45:
                if (r5 >= r3) goto L5f
                r6 = r2[r5]
                boolean r7 = bsh.Reflect.isPublic(r6)
                if (r7 != 0) goto L55
                boolean r7 = bsh.Capabilities.haveAccessibility()
                if (r7 == 0) goto L5c
            L55:
                bsh.FieldAccess r6 = bsh.Invocable.get(r6)
                r8.cacheMember(r6)
            L5c:
                int r5 = r5 + 1
                goto L45
            L5f:
                java.lang.reflect.Method[] r2 = r0.getDeclaredMethods()
                int r3 = r2.length
                r5 = r4
            L65:
                if (r5 >= r3) goto L91
                r6 = r2[r5]
                boolean r7 = bsh.Reflect.isPublic(r6)
                if (r7 != 0) goto L75
                boolean r7 = bsh.Capabilities.haveAccessibility()
                if (r7 == 0) goto L8e
            L75:
                if (r9 != r0) goto L7f
                bsh.Invocable r6 = bsh.Invocable.get(r6)
                r8.cacheMember(r6)
                goto L8e
            L7f:
                java.lang.String r7 = r6.getName()
                java.lang.Class[] r6 = r6.getParameterTypes()
                bsh.Invocable r6 = r1.findMethod(r7, r6)
                r8.cacheMember(r6)
            L8e:
                int r5 = r5 + 1
                goto L65
            L91:
                java.lang.reflect.Constructor[] r2 = r0.getDeclaredConstructors()
                int r3 = r2.length
            L96:
                if (r4 >= r3) goto Lb6
                r5 = r2[r4]
                if (r9 != r0) goto La4
                bsh.Invocable r5 = bsh.Invocable.get(r5)
                r8.cacheMember(r5)
                goto Lb3
            La4:
                java.lang.String r6 = r5.getName()
                java.lang.Class[] r5 = r5.getParameterTypes()
                bsh.Invocable r5 = r1.findMethod(r6, r5)
                r8.cacheMember(r5)
            Lb3:
                int r4 = r4 + 1
                goto L96
            Lb6:
                java.lang.Class[] r1 = r0.getInterfaces()
                r8.processInterfaces(r1)
                java.lang.Class r0 = r0.getSuperclass()
                goto L12
            Lc3:
                return
        }

        private boolean cacheMember(bsh.FieldAccess r4) {
                r3 = this;
                java.lang.String r0 = r4.getName()
                boolean r0 = r3.hasField(r0)
                r1 = 0
                if (r0 != 0) goto L19
                java.util.Map<java.lang.String, bsh.Invocable> r0 = r3.fields
                java.lang.String r2 = r4.getName()
                java.lang.Object r4 = r0.put(r2, r4)
                if (r4 != 0) goto L19
                r4 = 1
                return r4
            L19:
                return r1
        }

        private boolean cacheMember(bsh.Invocable r6) {
                r5 = this;
                r0 = 0
                if (r6 != 0) goto L4
                return r0
            L4:
                boolean r1 = r6.isGetter()
                if (r1 != 0) goto L19
                boolean r1 = r6.isSetter()
                if (r1 != 0) goto L19
                java.lang.String r0 = r6.getName()
                boolean r6 = r5.cacheMember(r0, r6)
                return r6
            L19:
                java.lang.String r1 = r6.getName()
                java.lang.String r2 = "[gs]et|is"
                java.lang.String r3 = ""
                java.lang.String r2 = r1.replaceFirst(r2, r3)
                int r3 = r2.length()
                r4 = 1
                if (r3 == r4) goto L36
                char r3 = r1.charAt(r4)
                boolean r3 = java.lang.Character.isLowerCase(r3)
                if (r3 == 0) goto L48
            L36:
                char[] r2 = r2.toCharArray()
                char r3 = r2[r0]
                char r3 = java.lang.Character.toLowerCase(r3)
                r2[r0] = r3
                java.lang.String r3 = new java.lang.String
                r3.<init>(r2)
                r2 = r3
            L48:
                boolean r1 = r5.cacheMember(r1, r6)
                if (r1 == 0) goto L55
                boolean r6 = r5.cacheMember(r2, r6)
                if (r6 == 0) goto L55
                return r4
            L55:
                return r0
        }

        private boolean cacheMember(java.lang.String r4, bsh.Invocable r5) {
                r3 = this;
                boolean r0 = r3.hasMember(r4)
                r1 = 1
                if (r0 != 0) goto L16
                java.util.Map<java.lang.String, java.util.List<bsh.Invocable>> r0 = r3.cache
                java.util.List r5 = java.util.Collections.singletonList(r5)
                java.lang.Object r4 = r0.put(r4, r5)
                if (r4 != 0) goto L14
                return r1
            L14:
                r4 = 0
                return r4
            L16:
                int r0 = r3.memberCount(r4)
                if (r0 != r1) goto L2a
                java.util.Map<java.lang.String, java.util.List<bsh.Invocable>> r0 = r3.cache
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List r2 = r3.members(r4)
                r1.<init>(r2)
                r0.put(r4, r1)
            L2a:
                java.util.List r4 = r3.members(r4)
                boolean r4 = r4.add(r5)
                return r4
        }

        private bsh.Invocable findBest(java.util.List<bsh.Invocable> r3, java.lang.Class<?>[] r4) {
                r2 = this;
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L8
                r3 = 0
                return r3
            L8:
                int r0 = r3.size()
                r1 = 1
                if (r0 != r1) goto L17
                r4 = 0
                java.lang.Object r3 = r3.get(r4)
                bsh.Invocable r3 = (bsh.Invocable) r3
                return r3
            L17:
                bsh.Invocable r3 = bsh.Reflect.findMostSpecificInvocable(r4, r3)
                return r3
        }

        private void processInterfaces(java.lang.Class<?>[] r11) {
                r10 = this;
                int r0 = r11.length
                r1 = 0
                r2 = r1
            L3:
                if (r2 >= r0) goto L5b
                r3 = r11[r2]
                boolean r4 = bsh.Reflect.isPackageAccessible(r3)
                if (r4 == 0) goto L51
                bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r4 = bsh.BshClassManager.memberCache
                java.lang.Object r4 = r4.get(r3)
                bsh.BshClassManager$MemberCache r4 = (bsh.BshClassManager.MemberCache) r4
                java.lang.reflect.Field[] r5 = r3.getDeclaredFields()
                int r6 = r5.length
                r7 = r1
            L1b:
                if (r7 >= r6) goto L29
                r8 = r5[r7]
                bsh.FieldAccess r8 = bsh.Invocable.get(r8)
                r10.cacheMember(r8)
                int r7 = r7 + 1
                goto L1b
            L29:
                java.lang.reflect.Method[] r5 = r3.getDeclaredMethods()
                int r6 = r5.length
                r7 = r1
            L2f:
                if (r7 >= r6) goto L51
                r8 = r5[r7]
                boolean r9 = bsh.Reflect.isPublic(r8)
                if (r9 != 0) goto L3f
                boolean r9 = bsh.Capabilities.haveAccessibility()
                if (r9 == 0) goto L4e
            L3f:
                java.lang.String r9 = r8.getName()
                java.lang.Class[] r8 = r8.getParameterTypes()
                bsh.Invocable r8 = r4.findMethod(r9, r8)
                r10.cacheMember(r8)
            L4e:
                int r7 = r7 + 1
                goto L2f
            L51:
                java.lang.Class[] r3 = r3.getInterfaces()
                r10.processInterfaces(r3)
                int r2 = r2 + 1
                goto L3
            L5b:
                return
        }

        public bsh.Invocable findField(java.lang.String r2) {
                r1 = this;
                boolean r0 = r1.hasField(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                java.util.Map<java.lang.String, bsh.Invocable> r0 = r1.fields
                java.lang.Object r2 = r0.get(r2)
                bsh.Invocable r2 = (bsh.Invocable) r2
                return r2
        }

        public bsh.Invocable findGetter(java.lang.String r3) {
                r2 = this;
                boolean r0 = r2.hasMember(r3)
                if (r0 == 0) goto L21
                java.util.List r3 = r2.members(r3)
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L21
                java.lang.Object r0 = r3.next()
                bsh.Invocable r0 = (bsh.Invocable) r0
                boolean r1 = r0.isGetter()
                if (r1 == 0) goto Le
                return r0
            L21:
                r3 = 0
                return r3
        }

        public int findMemberIndex(java.lang.String r1, java.lang.Class<?>[] r2) {
                r0 = this;
                java.util.List r1 = r0.members(r1)
                int r1 = bsh.Reflect.findMostSpecificInvocableIndex(r2, r1)
                return r1
        }

        public bsh.Invocable findMethod(java.lang.String r2, java.lang.Class<?>... r3) {
                r1 = this;
                boolean r0 = r1.hasMember(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                java.util.List r2 = r1.members(r2)
                bsh.Invocable r2 = r1.findBest(r2, r3)
                return r2
        }

        public bsh.Invocable findMethod(java.lang.String r1, java.lang.Object... r2) {
                r0 = this;
                java.lang.Class[] r2 = bsh.Types.getTypes(r2)
                bsh.Invocable r1 = r0.findMethod(r1, r2)
                return r1
        }

        public bsh.Invocable findSetter(java.lang.String r3) {
                r2 = this;
                boolean r0 = r2.hasMember(r3)
                if (r0 == 0) goto L21
                java.util.List r3 = r2.members(r3)
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L21
                java.lang.Object r0 = r3.next()
                bsh.Invocable r0 = (bsh.Invocable) r0
                boolean r1 = r0.isSetter()
                if (r1 == 0) goto Le
                return r0
            L21:
                r3 = 0
                return r3
        }

        public bsh.Invocable findStaticMethod(java.lang.String r3) {
                r2 = this;
                boolean r0 = r2.hasMember(r3)
                if (r0 != 0) goto L8
                r3 = 0
                return r3
            L8:
                java.util.List r3 = r2.members(r3)
                java.util.stream.Stream r3 = r3.stream()
                bsh.a r0 = new bsh.a
                r1 = 1
                r0.<init>(r1)
                java.util.stream.Stream r3 = r3.filter(r0)
                java.util.Optional r3 = r3.findFirst()
                java.lang.Object r3 = r3.get()
                bsh.Invocable r3 = (bsh.Invocable) r3
                return r3
        }

        public boolean hasField(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, bsh.Invocable> r0 = r1.fields
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        public boolean hasMember(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<bsh.Invocable>> r0 = r1.cache
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        public int memberCount(java.lang.String r1) {
                r0 = this;
                java.util.List r1 = r0.members(r1)
                int r1 = r1.size()
                return r1
        }

        public java.util.List<bsh.Invocable> members(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<bsh.Invocable>> r0 = r1.cache
                java.lang.Object r2 = r0.get(r2)
                java.util.List r2 = (java.util.List) r2
                return r2
        }
    }

    static {
            bsh.util.ValueReferenceMap r0 = new bsh.util.ValueReferenceMap
            bsh.b r1 = new bsh.b
            r2 = 2
            r1.<init>(r2)
            bsh.util.ValueReferenceMap$Type r2 = bsh.util.ValueReferenceMap.Type.Soft
            r0.<init>(r1, r2)
            bsh.BshClassManager.memberCache = r0
            return
    }

    public BshClassManager() {
            r1 = this;
            r1.<init>()
            bsh.loader.BshLoaderManager r0 = new bsh.loader.BshLoaderManager
            r0.<init>()
            r1.loaderManager = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.absoluteClassCache = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.absoluteNonClasses = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.associatedClasses = r0
            return
    }

    public static /* synthetic */ bsh.BshClassManager.MemberCache a(java.lang.Class r0) {
            bsh.BshClassManager$MemberCache r0 = lambda$static$0(r0)
            return r0
    }

    public static bsh.UtilEvalError cmUnavailable() {
            bsh.Capabilities$Unavailable r0 = new bsh.Capabilities$Unavailable
            java.lang.String r1 = "ClassLoading features unavailable."
            r0.<init>(r1)
            return r0
    }

    public static bsh.BshClassManager createClassManager(bsh.Interpreter r1) {
            bsh.classpath.ClassManagerImpl r0 = new bsh.classpath.ClassManagerImpl
            r0.<init>()
            r0.declaringInterpreter = r1
            return r0
    }

    private static /* synthetic */ bsh.BshClassManager.MemberCache lambda$static$0(java.lang.Class r1) {
            bsh.BshClassManager$MemberCache r0 = new bsh.BshClassManager$MemberCache
            r0.<init>(r1)
            return r0
    }

    public void addClassLoader(java.lang.ClassLoader r2) {
            r1 = this;
            bsh.loader.BshLoaderManager r0 = r1.loaderManager
            r0.addClassLoader(r2)
            r1.classLoaderChanged()
            return
    }

    public void addClassPath(java.net.URL r1) {
            r0 = this;
            return
    }

    public void addListener(bsh.BshClassManager.Listener r1) {
            r0 = this;
            return
    }

    public void associateClass(java.lang.Class<?> r3) {
            r2 = this;
            boolean r0 = bsh.Reflect.isGeneratedClass(r3)
            if (r0 == 0) goto Lf
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r2.associatedClasses
            java.lang.String r1 = r3.getName()
            r0.put(r1, r3)
        Lf:
            return
    }

    public void cacheClassInfo(java.lang.String r2, java.lang.Class<?> r3) {
            r1 = this;
            if (r3 == 0) goto Ld
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r1.absoluteClassCache
            r0.put(r2, r3)
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r2 = bsh.BshClassManager.memberCache
            r2.get(r3)
            return
        Ld:
            java.util.Set<java.lang.String> r3 = r1.absoluteNonClasses
            r3.add(r2)
            return
    }

    public boolean classExists(java.lang.String r1) {
            r0 = this;
            java.lang.Class r1 = r0.classForName(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public java.lang.Class<?> classForName(java.lang.String r3) {
            r2 = this;
            java.lang.Class r0 = r2.plainClassForName(r3)     // Catch: java.lang.ClassNotFoundException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 != 0) goto L14
            bsh.Interpreter r1 = r2.declaringInterpreter
            boolean r1 = r1.getCompatibility()
            if (r1 == 0) goto L14
            java.lang.Class r0 = r2.loadSourceClass(r3)
        L14:
            return r0
    }

    public void classLoaderChanged() {
            r0 = this;
            return
    }

    public void clearCaches() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.absoluteNonClasses
            r0.clear()
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r1.absoluteClassCache
            r0.clear()
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r0 = bsh.BshClassManager.memberCache
            r0.clear()
            return
    }

    public java.lang.Class<?> defineClass(java.lang.String r3, byte[] r4) {
            r2 = this;
            bsh.InterpreterError r4 = new bsh.InterpreterError
            java.lang.String r0 = "Can't create class ("
            java.lang.String r1 = ") without class manager package."
            java.lang.String r3 = eh.a.n(r0, r3, r1)
            r4.<init>(r3)
            throw r4
    }

    public void doSuperImport() {
            r1 = this;
            bsh.UtilEvalError r0 = cmUnavailable()
            throw r0
    }

    public void dump(java.io.PrintWriter r2) {
            r1 = this;
            java.lang.String r0 = "BshClassManager: no class manager."
            r2.println(r0)
            return
    }

    public java.lang.Class<?> getAssociatedClass(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r1.associatedClasses
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
    }

    public java.lang.String getClassNameByUnqName(java.lang.String r1) {
            r0 = this;
            bsh.UtilEvalError r1 = cmUnavailable()
            throw r1
    }

    public java.net.URL getResource(java.lang.String r3) {
            r2 = this;
            java.lang.ClassLoader r0 = r2.externalClassLoader
            if (r0 == 0) goto Le
            r1 = 1
            java.lang.String r1 = r3.substring(r1)
            java.net.URL r0 = r0.getResource(r1)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L18
            java.lang.Class<bsh.Interpreter> r0 = bsh.Interpreter.class
            java.net.URL r3 = r0.getResource(r3)
            return r3
        L18:
            return r0
    }

    public java.io.InputStream getResourceAsStream(java.lang.String r3) {
            r2 = this;
            java.lang.ClassLoader r0 = r2.externalClassLoader
            if (r0 == 0) goto Le
            r1 = 1
            java.lang.String r1 = r3.substring(r1)
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L18
            java.lang.Class<bsh.Interpreter> r0 = bsh.Interpreter.class
            java.io.InputStream r3 = r0.getResourceAsStream(r3)
            return r3
        L18:
            return r0
    }

    public boolean getStrictJava() {
            r1 = this;
            bsh.Interpreter r0 = r1.declaringInterpreter
            if (r0 == 0) goto Lc
            boolean r0 = r0.getStrictJava()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean hasSuperImport() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.Class<?> loadGeneratedClass(java.lang.String r3, byte[] r4) {
            r2 = this;
            bsh.InterpreterError r4 = new bsh.InterpreterError
            java.lang.String r0 = "Can't load generated class ("
            java.lang.String r1 = ") without class manager package."
            java.lang.String r3 = eh.a.n(r0, r3, r1)
            r4.<init>(r3)
            throw r4
    }

    public java.lang.Class<?> loadSourceClass(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "Loading class from source file: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "/"
            r1.<init>(r2)
            r2 = 46
            r3 = 47
            java.lang.String r2 = r6.replace(r2, r3)
            r1.append(r2)
            java.lang.String r2 = ".java"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.net.URL r2 = r5.getResource(r1)
            r3 = 0
            if (r2 != 0) goto L25
            return r3
        L25:
            bsh.FileReader r4 = new bsh.FileReader     // Catch: bsh.EvalError -> L44 java.io.IOException -> L46
            java.lang.Object r2 = r2.getContent()     // Catch: bsh.EvalError -> L44 java.io.IOException -> L46
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch: bsh.EvalError -> L44 java.io.IOException -> L46
            r4.<init>(r2)     // Catch: bsh.EvalError -> L44 java.io.IOException -> L46
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L48
            bsh.Interpreter.debug(r0)     // Catch: java.lang.Throwable -> L48
            bsh.Interpreter r0 = r5.declaringInterpreter     // Catch: java.lang.Throwable -> L48
            r0.eval(r4)     // Catch: java.lang.Throwable -> L48
            r4.close()     // Catch: bsh.EvalError -> L44 java.io.IOException -> L46
            goto L63
        L44:
            r0 = move-exception
            goto L52
        L46:
            r0 = move-exception
            goto L52
        L48:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: bsh.EvalError -> L44 java.io.IOException -> L46
        L51:
            throw r0     // Catch: bsh.EvalError -> L44 java.io.IOException -> L46
        L52:
            java.lang.ThreadLocal<java.lang.Boolean> r1 = bsh.Interpreter.DEBUG
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L63
            r0.printStackTrace()
        L63:
            java.lang.Class r6 = r5.plainClassForName(r6)     // Catch: java.lang.ClassNotFoundException -> L68
            return r6
        L68:
            java.lang.String r0 = "Class not found in source file: "
            java.lang.String r6 = r0.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            bsh.Interpreter.debug(r6)
            return r3
    }

    public java.lang.Class<?> plainClassForName(java.lang.String r2) {
            r1 = this;
            java.lang.ClassLoader r0 = r1.externalClassLoader
            if (r0 == 0) goto L9
            java.lang.Class r0 = r0.loadClass(r2)
            goto Ld
        L9:
            java.lang.Class r0 = java.lang.Class.forName(r2)
        Ld:
            r1.cacheClassInfo(r2, r0)
            return r0
    }

    public void reloadAllClasses() {
            r1 = this;
            bsh.UtilEvalError r0 = cmUnavailable()
            throw r0
    }

    public void reloadClasses(java.lang.String[] r1) {
            r0 = this;
            bsh.UtilEvalError r1 = cmUnavailable()
            throw r1
    }

    public void reloadPackage(java.lang.String r1) {
            r0 = this;
            bsh.UtilEvalError r1 = cmUnavailable()
            throw r1
    }

    public void removeListener(bsh.BshClassManager.Listener r1) {
            r0 = this;
            return
    }

    public void reset() {
            r0 = this;
            r0.clearCaches()
            return
    }

    public void setClassLoader(java.lang.ClassLoader r1) {
            r0 = this;
            r0.externalClassLoader = r1
            r0.classLoaderChanged()
            return
    }

    public void setClassPath(java.net.URL[] r1) {
            r0 = this;
            bsh.UtilEvalError r1 = cmUnavailable()
            throw r1
    }
}
