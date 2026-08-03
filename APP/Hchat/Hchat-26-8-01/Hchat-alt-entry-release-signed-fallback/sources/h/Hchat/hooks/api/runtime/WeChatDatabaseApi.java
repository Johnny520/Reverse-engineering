package h.Hchat.hooks.api.runtime;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatDatabaseApi {
    private volatile java.lang.Object coreStorage;
    private volatile java.lang.Object dbWrapper;
    private volatile java.lang.reflect.Method deleteMethod;
    private final h.Hchat.dexkit.DexFinder dexFinder;
    private volatile java.util.List<java.lang.reflect.Method> insertMethods;
    private final o8.b logger;
    private volatile java.lang.Object messageStorage;
    private final java.util.Map<java.lang.String, java.lang.String> messageTableCache;
    private volatile java.lang.reflect.Method messageTableMethod;
    private volatile java.util.List<java.lang.String> messageTables;
    private volatile java.lang.reflect.Method nativeMessageByIdMethod;
    private volatile java.lang.reflect.Method nativeMessageUpdateMethod;
    private volatile java.lang.Object nativeMessageUpdateStorage;
    private volatile java.lang.reflect.Method queryMethod;
    private final java.util.Map<java.lang.String, java.lang.Object> storageObjectCache;
    private volatile java.lang.reflect.Method updateMethod;

    public WeChatDatabaseApi(h.Hchat.dexkit.DexFinder r2, o8.b r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.messageTableCache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.storageObjectCache = r0
            r1.dexFinder = r2
            r1.logger = r3
            return
    }

    private java.lang.Object cursorValue(android.database.Cursor r4, int r5) {
            r3 = this;
            java.lang.String r0 = ""
            int r1 = r4.getType(r5)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L30
            r2 = 1
            if (r1 == r2) goto L27
            r2 = 2
            if (r1 == r2) goto L1e
            r2 = 4
            if (r1 == r2) goto L19
            java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L18
            return r4
        L18:
            return r0
        L19:
            byte[] r4 = r4.getBlob(r5)     // Catch: java.lang.Throwable -> L30
            return r4
        L1e:
            double r4 = r4.getDouble(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L30
            return r4
        L27:
            long r4 = r4.getLong(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L30
            return r4
        L30:
            return r0
    }

    private void enqueueNestedObjects(java.lang.Object r6, java.util.ArrayDeque<java.lang.Object> r7, java.util.Set<java.lang.Object> r8) {
            r5 = this;
            java.lang.Class r0 = r6.getClass()
        L4:
            if (r0 == 0) goto L4b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L4b
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L25
            goto L12
        L25:
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L12
            boolean r4 = r3.isPrimitive()     // Catch: java.lang.Throwable -> L12
            if (r4 != 0) goto L12
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L36
            goto L12
        L36:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r6)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L12
            boolean r3 = r8.contains(r2)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L12
            r7.addLast(r2)     // Catch: java.lang.Throwable -> L12
            goto L12
        L46:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L4b:
            return
    }

    private synchronized java.lang.reflect.Method ensureNativeMessageUpdateMethod(java.lang.Object r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.reflect.Method r0 = r4.nativeMessageUpdateMethod     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r4.nativeMessageUpdateStorage     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            if (r1 == 0) goto L1d
            java.lang.Class r2 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r2.isInstance(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            boolean r1 = r4.isNativeMessageUpdateMethod(r0, r5)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            monitor-exit(r4)
            return r0
        L1b:
            r5 = move-exception
            goto L68
        L1d:
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r4.messageStorage     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L34
            java.lang.Object r2 = r4.messageStorage     // Catch: java.lang.Throwable -> L1b
            r1.add(r2)     // Catch: java.lang.Throwable -> L1b
        L34:
            java.lang.Object r2 = r4.getCoreStorage()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L41
            java.util.List r2 = r4.storageFieldObjects(r2)     // Catch: java.lang.Throwable -> L1b
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L1b
        L41:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L45:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L65
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L45
            boolean r3 = r0.add(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L58
            goto L45
        L58:
            java.lang.reflect.Method r3 = r4.findNativeMessageUpdateMethod(r2, r5)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L5f
            goto L45
        L5f:
            r4.nativeMessageUpdateStorage = r2     // Catch: java.lang.Throwable -> L1b
            r4.nativeMessageUpdateMethod = r3     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r4)
            return r3
        L65:
            monitor-exit(r4)
            r5 = 0
            return r5
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r5
    }

    private synchronized boolean ensureReady() {
            r6 = this;
            java.lang.String r0 = "数据库API已就绪: wrapper="
            java.lang.String r1 = "未找到 SqliteDB 查询方法: "
            monitor-enter(r6)
            java.lang.Object r2 = r6.dbWrapper     // Catch: java.lang.Throwable -> L10
            r3 = 1
            if (r2 == 0) goto L12
            java.lang.reflect.Method r2 = r6.queryMethod     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L12
            monitor-exit(r6)
            return r3
        L10:
            r0 = move-exception
            goto L74
        L12:
            boolean r2 = r6.isAvailable()     // Catch: java.lang.Throwable -> L10
            r4 = 0
            if (r2 != 0) goto L1b
            monitor-exit(r6)
            return r4
        L1b:
            java.lang.Object r2 = r6.getCoreStorage()     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L23
            monitor-exit(r6)
            return r4
        L23:
            java.lang.Object r2 = r6.findDbWrapper(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L30
            java.lang.String r0 = "未找到 SqliteDB wrapper"
            r6.log(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r6)
            return r4
        L30:
            java.lang.Class r5 = r2.getClass()     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Method r5 = r6.findQueryMethod(r5)     // Catch: java.lang.Throwable -> L10
            if (r5 != 0) goto L4b
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L10
            r6.log(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r6)
            return r4
        L4b:
            r6.dbWrapper = r2     // Catch: java.lang.Throwable -> L10
            r6.queryMethod = r5     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L10
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = " query="
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L10
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L10
            r6.log(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r6)
            return r3
        L74:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    private java.lang.Object findDbWrapper(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L4b
            h.Hchat.dexkit.DexFinder r1 = r4.dexFinder
            java.lang.Class<?> r1 = r1.sqliteDbWrapperClass
            if (r1 != 0) goto La
            goto L4b
        La:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r2.add(r5)
        L1b:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L4b
            java.lang.Object r5 = r2.removeFirst()
            if (r5 == 0) goto L1b
            boolean r3 = r1.contains(r5)
            if (r3 == 0) goto L2e
            goto L1b
        L2e:
            r1.add(r5)
            h.Hchat.dexkit.DexFinder r3 = r4.dexFinder
            java.lang.Class<?> r3 = r3.sqliteDbWrapperClass
            boolean r3 = r3.isInstance(r5)
            if (r3 == 0) goto L3c
            goto L46
        L3c:
            java.lang.Class r3 = r5.getClass()
            java.lang.reflect.Method r3 = r4.findQueryMethod(r3)
            if (r3 == 0) goto L47
        L46:
            return r5
        L47:
            r4.enqueueNestedObjects(r5, r2, r1)
            goto L1b
        L4b:
            return r0
    }

    private java.lang.reflect.Method findDeleteMethod(java.lang.Class<?> r4) {
            r3 = this;
        L0:
            if (r4 == 0) goto L27
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 == r0) goto L27
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isDeleteMethod(r1)
            if (r2 != 0) goto L21
            goto Le
        L21:
            return r1
        L22:
            java.lang.Class r4 = r4.getSuperclass()
            goto L0
        L27:
            r4 = 0
            return r4
    }

    private java.util.List<java.lang.reflect.Method> findInsertMethods(java.lang.Class<?> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r5 == 0) goto L2f
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r5 == r1) goto L2f
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = r4.isInsertMethod(r2)
            if (r3 != 0) goto L26
            goto L13
        L26:
            r0.add(r2)
            goto L13
        L2a:
            java.lang.Class r5 = r5.getSuperclass()
            goto L5
        L2f:
            return r0
    }

    private java.lang.String findMessageTableMethod(java.lang.String r8) {
            r7 = this;
            java.lang.Object r0 = r7.getCoreStorage()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r0 = r7.storageFieldObjects(r0)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L16
            boolean r4 = r2.contains(r3)
            if (r4 == 0) goto L29
            goto L16
        L29:
            r2.add(r3)
            java.lang.reflect.Method r4 = r7.findMessageTableMethod(r3, r8)
            if (r4 != 0) goto L33
            goto L16
        L33:
            java.lang.Object[] r5 = new java.lang.Object[]{r8}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r4, r3, r5)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L16
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r7.isUsableMessageTable(r5)
            if (r6 == 0) goto L16
            r7.messageStorage = r3
            r7.messageTableMethod = r4
            return r5
        L4c:
            return r1
    }

    private java.lang.reflect.Method findMessageTableMethod(java.lang.Object r6, java.lang.String r7) {
            r5 = this;
            java.lang.Class r0 = r6.getClass()
        L4:
            if (r0 == 0) goto L3f
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L3f
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = r5.isMessageTableNameMethod(r2)
            if (r3 != 0) goto L25
            goto L12
        L25:
            java.lang.Object[] r3 = new java.lang.Object[]{r7}
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r2, r6, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L12
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.isUsableMessageTable(r3)
            if (r3 == 0) goto L12
            return r2
        L3a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L3f:
            r6 = 0
            return r6
    }

    private java.lang.reflect.Method findNativeMessageByIdMethod(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3b
            h.Hchat.dexkit.DexFinder r1 = r4.dexFinder
            if (r1 == 0) goto L3b
            java.lang.Class<?> r1 = r1.localMessageClass
            if (r1 != 0) goto Lc
            goto L3b
        Lc:
            java.lang.Class r5 = r5.getClass()
        L10:
            if (r5 == 0) goto L3b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r5 == r1) goto L3b
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = r4.isNativeMessageByIdMethod(r2)
            if (r3 != 0) goto L31
            goto L1e
        L31:
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.accessible(r2)
            return r5
        L36:
            java.lang.Class r5 = r5.getSuperclass()
            goto L10
        L3b:
            return r0
    }

    private java.lang.reflect.Method findNativeMessageUpdateMethod(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Class r4 = r4.getClass()
        L4:
            if (r4 == 0) goto L2e
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 == r0) goto L2e
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isNativeMessageUpdateMethod(r1, r5)
            if (r2 == 0) goto L12
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r4
        L29:
            java.lang.Class r4 = r4.getSuperclass()
            goto L4
        L2e:
            r4 = 0
            return r4
    }

    private java.lang.reflect.Method findQueryMethod(java.lang.Class<?> r6) {
            r5 = this;
            r0 = 0
        L1:
            if (r6 == 0) goto L35
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r6 == r1) goto L35
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = r5.isQueryMethod(r2)
            if (r3 != 0) goto L22
            goto Lf
        L22:
            if (r0 == 0) goto L2e
            int r3 = r5.queryPriority(r2)
            int r4 = r5.queryPriority(r0)
            if (r3 <= r4) goto Lf
        L2e:
            r0 = r2
            goto Lf
        L30:
            java.lang.Class r6 = r6.getSuperclass()
            goto L1
        L35:
            return r0
    }

    private java.lang.reflect.Method findUpdateMethod(java.lang.Class<?> r4) {
            r3 = this;
        L0:
            if (r4 == 0) goto L27
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 == r0) goto L27
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isUpdateMethod(r1)
            if (r2 != 0) goto L21
            goto Le
        L21:
            return r1
        L22:
            java.lang.Class r4 = r4.getSuperclass()
            goto L0
        L27:
            r4 = 0
            return r4
    }

    private java.lang.String invokeMessageTableMethod(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.messageStorage
            java.lang.reflect.Method r1 = r3.messageTableMethod
            java.lang.String r2 = ""
            if (r0 == 0) goto L1a
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r1, r0, r4)     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1a
            return r4
        L1a:
            return r2
    }

    private java.lang.Object invokeNativeMessageById(java.lang.Object r2, java.lang.reflect.Method r3, long r4) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L1d
            if (r3 != 0) goto L6
            goto L1d
        L6:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r3, r2, r4)     // Catch: java.lang.Throwable -> L1d
            h.Hchat.dexkit.DexFinder r3 = r1.dexFinder     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<?> r3 = r3.localMessageClass     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.isInstance(r2)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1d
            return r2
        L1d:
            return r0
    }

    private boolean isDeleteMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L11
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 == r2) goto L11
            return r0
        L11:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 3
            if (r1 != r2) goto L2c
            r1 = r5[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L2c
            r1 = 1
            r3 = r5[r1]
            if (r3 != r2) goto L2c
            r2 = 2
            r5 = r5[r2]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            if (r5 != r2) goto L2c
            return r1
        L2c:
            return r0
    }

    private boolean isInsertMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 == r2) goto L11
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r1 == r2) goto L11
            return r0
        L11:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 3
            if (r1 != r2) goto L2c
            r1 = r5[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L2c
            r1 = 1
            r3 = r5[r1]
            if (r3 != r2) goto L2c
            r2 = 2
            r5 = r5[r2]
            java.lang.Class<android.content.ContentValues> r2 = android.content.ContentValues.class
            if (r5 != r2) goto L2c
            return r1
        L2c:
            return r0
    }

    private boolean isLikelyMessageTable(java.lang.String r10) {
            r9 = this;
            boolean r0 = r9.isSafeTableName(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "PRAGMA table_info("
            r0.<init>(r2)
            java.lang.String r10 = r9.quoteTable(r10)
            r0.append(r10)
            java.lang.String r10 = ")"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r0 = 0
            android.database.Cursor r10 = r9.rawQueryInternal(r10, r0, r1)
            if (r10 != 0) goto L27
            return r1
        L27:
            java.lang.String r0 = "name"
            int r0 = r10.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L74
            if (r0 >= 0) goto L33
            r10.close()     // Catch: java.lang.Throwable -> L32
        L32:
            return r1
        L33:
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
        L37:
            boolean r6 = r10.moveToNext()     // Catch: java.lang.Throwable -> L74
            r7 = 1
            if (r6 == 0) goto L67
            java.lang.String r6 = r10.getString(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = "msgId"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L4b
            r2 = r7
        L4b:
            java.lang.String r8 = "msgSvrId"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L54
            r3 = r7
        L54:
            java.lang.String r8 = "createTime"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L5d
            r4 = r7
        L5d:
            java.lang.String r8 = "content"
            boolean r6 = r8.equals(r6)     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L37
            r5 = r7
            goto L37
        L67:
            if (r2 == 0) goto L70
            if (r3 == 0) goto L70
            if (r4 == 0) goto L70
            if (r5 == 0) goto L70
            r1 = r7
        L70:
            r10.close()     // Catch: java.lang.Throwable -> L73
        L73:
            return r1
        L74:
            r10.close()     // Catch: java.lang.Throwable -> L77
        L77:
            return r1
    }

    private boolean isMessageTableNameMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L20
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto La
            goto L20
        La:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r3 = 1
            if (r1 != r3) goto L20
            r5 = r5[r0]
            if (r5 != r2) goto L20
            return r3
        L20:
            return r0
    }

    private boolean isNativeMessageByIdMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L31
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 == 0) goto La
            goto L31
        La:
            h.Hchat.dexkit.DexFinder r1 = r3.dexFinder
            if (r1 == 0) goto L31
            java.lang.Class<?> r1 = r1.localMessageClass
            if (r1 != 0) goto L13
            goto L31
        L13:
            java.lang.Class r2 = r4.getReturnType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L1e
            return r0
        L1e:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L31
            r4 = r4[r0]
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r4 == r1) goto L30
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r4 != r1) goto L31
        L30:
            return r2
        L31:
            return r0
    }

    private boolean isNativeMessageUpdateMethod(java.lang.reflect.Method r4, java.lang.Object r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L39
            if (r5 == 0) goto L39
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 == 0) goto Lc
            goto L39
        Lc:
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L19
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 == r2) goto L19
            return r0
        L19:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 2
            if (r1 != r2) goto L39
            r1 = r4[r0]
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 == r2) goto L2b
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r1 != r2) goto L39
        L2b:
            r1 = 1
            r4 = r4[r1]
            java.lang.Class r5 = r5.getClass()
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L39
            return r1
        L39:
            return r0
    }

    private boolean isQueryMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L22
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class<android.database.Cursor> r2 = android.database.Cursor.class
            if (r1 == r2) goto Lc
            goto L22
        Lc:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 2
            if (r1 != r2) goto L22
            r1 = r4[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L22
            r1 = 1
            r4 = r4[r1]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            if (r4 != r2) goto L22
            return r1
        L22:
            return r0
    }

    private boolean isSafeTableName(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = r1
        L9:
            int r2 = r5.length()
            if (r0 >= r2) goto L33
            char r2 = r5.charAt(r0)
            r3 = 97
            if (r2 < r3) goto L1b
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 <= r3) goto L2f
        L1b:
            r3 = 65
            if (r2 < r3) goto L23
            r3 = 90
            if (r2 <= r3) goto L2f
        L23:
            r3 = 48
            if (r2 < r3) goto L2b
            r3 = 57
            if (r2 <= r3) goto L2f
        L2b:
            r3 = 95
            if (r2 != r3) goto L32
        L2f:
            int r0 = r0 + 1
            goto L9
        L32:
            return r1
        L33:
            r5 = 1
            return r5
    }

    private boolean isUpdateMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L11
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 == r2) goto L11
            return r0
        L11:
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r6.length
            r2 = 4
            if (r1 != r2) goto L33
            r1 = r6[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L33
            r1 = 1
            r3 = r6[r1]
            java.lang.Class<android.content.ContentValues> r4 = android.content.ContentValues.class
            if (r3 != r4) goto L33
            r3 = 2
            r3 = r6[r3]
            if (r3 != r2) goto L33
            r2 = 3
            r6 = r6[r2]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            if (r6 != r2) goto L33
            return r1
        L33:
            return r0
    }

    private boolean isUsableMessageTable(java.lang.String r5) {
            r4 = this;
            boolean r0 = r4.isSafeTableName(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String[] r0 = new java.lang.String[]{r5}
            java.lang.String r2 = "name"
            java.lang.String r3 = "SELECT name FROM sqlite_master WHERE type='table' AND name=? LIMIT 1"
            java.lang.String r0 = r4.queryFirstString(r3, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
            return r1
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "SELECT msgId,msgSvrId,type,status,isSend,createTime,talker,content FROM "
            r0.<init>(r2)
            java.lang.String r5 = r4.quoteTable(r5)
            r0.append(r5)
            java.lang.String r5 = " LIMIT 0"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = 0
            android.database.Cursor r5 = r4.rawQueryInternal(r5, r0, r1)
            if (r5 != 0) goto L3a
            return r1
        L3a:
            r0 = 1
            r5.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            return r0
    }

    private void log(java.lang.String r3) {
            r2 = this;
            o8.b r0 = r2.logger
            if (r0 == 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[WeChatDatabaseApi] "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            i8.i.f(r3)
        L15:
            return
    }

    private int queryPriority(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "rawQuery"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            r2 = 100
            return r2
        Lf:
            java.lang.String r0 = "f"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            r2 = 90
            return r2
        L1a:
            java.lang.String r0 = "j"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L25
            r2 = 80
            return r2
        L25:
            java.lang.String r0 = "a"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L30
            r2 = 70
            return r2
        L30:
            r2 = 10
            return r2
    }

    private android.database.Cursor rawQueryInternal(java.lang.String r4, java.lang.String[] r5, boolean r6) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.queryMethod     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r3.dbWrapper     // Catch: java.lang.Throwable -> L14
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L14
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r1, r2, r5)     // Catch: java.lang.Throwable -> L14
            boolean r1 = r5 instanceof android.database.Cursor     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            android.database.Cursor r5 = (android.database.Cursor) r5     // Catch: java.lang.Throwable -> L14
            return r5
        L14:
            r5 = move-exception
            goto L17
        L16:
            return r0
        L17:
            if (r6 == 0) goto L36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "SQL 查询异常: "
            r6.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = " sql="
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.log(r4)
        L36:
            return r0
    }

    private java.util.List<java.lang.Object> storageFieldObjects(java.lang.Object r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
        L9:
            if (r1 == 0) goto L4a
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto L4a
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r3)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2a
            goto L17
        L2a:
            java.lang.Class r4 = r3.getType()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L17
            boolean r5 = r4.isPrimitive()     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L17
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L3b
            goto L17
        L3b:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r7)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L17
            r0.add(r3)     // Catch: java.lang.Throwable -> L17
            goto L17
        L45:
            java.lang.Class r1 = r1.getSuperclass()
            goto L9
        L4a:
            return r0
    }

    private static java.lang.String stringValue(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1) {
            if (r0 == 0) goto L7
            java.lang.Object r0 = r0.get(r1)
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto Lf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public int delete(java.lang.String r4, java.lang.String r5, java.lang.String[] r6) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.ensureReady()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.reflect.Method r0 = r3.deleteMethod
            if (r0 != 0) goto L1f
            java.lang.Object r0 = r3.dbWrapper
            java.lang.Class r0 = r0.getClass()
            java.lang.reflect.Method r0 = r3.findDeleteMethod(r0)
            r3.deleteMethod = r0
        L1f:
            java.lang.Object r2 = r3.dbWrapper
            if (r0 != 0) goto L35
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "未找到 SqliteDB 删除方法: "
            java.lang.String r4 = r5.concat(r4)
            r3.log(r4)
            return r1
        L35:
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r5)     // Catch: java.lang.Throwable -> L48
            boolean r6 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L4a
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L48
            int r4 = r5.intValue()     // Catch: java.lang.Throwable -> L48
            return r4
        L48:
            r5 = move-exception
            goto L4b
        L4a:
            return r1
        L4b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "SQL 删除异常: "
            r6.<init>(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = " table="
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.log(r4)
            return r1
    }

    public java.lang.Object getCoreStorage() {
            r4 = this;
            java.lang.Object r0 = r4.coreStorage
            if (r0 == 0) goto L7
            java.lang.Object r0 = r4.coreStorage
            return r0
        L7:
            r0 = 0
            h.Hchat.dexkit.DexFinder r1 = r4.dexFinder     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.coreStorageGetter     // Catch: java.lang.Throwable -> L24
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r1)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L14
            r2 = r0
            goto L18
        L14:
            h.Hchat.dexkit.DexFinder r2 = r4.dexFinder     // Catch: java.lang.Throwable -> L24
            java.lang.Class<?> r2 = r2.mmKernelClass     // Catch: java.lang.Throwable -> L24
        L18:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r2, r3)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L3a
            r4.coreStorage = r1     // Catch: java.lang.Throwable -> L24
            return r1
        L24:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "获取 CoreStorage 失败: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.log(r1)
        L3a:
            return r0
    }

    public long insert(java.lang.String r8, java.lang.String r9, android.content.ContentValues r10) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = -1
            if (r0 != 0) goto L75
            if (r10 != 0) goto Lb
            goto L75
        Lb:
            boolean r0 = r7.ensureReady()
            if (r0 != 0) goto L12
            return r1
        L12:
            java.util.List<java.lang.reflect.Method> r0 = r7.insertMethods
            if (r0 != 0) goto L22
            java.lang.Object r0 = r7.dbWrapper
            java.lang.Class r0 = r0.getClass()
            java.util.List r0 = r7.findInsertMethods(r0)
            r7.insertMethods = r0
        L22:
            if (r0 == 0) goto L62
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2b
            goto L62
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Object r4 = r7.dbWrapper     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r5 = new java.lang.Object[]{r8, r9, r10}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r4, r5)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L50
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L2f
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L2f
            goto L51
        L50:
            r3 = r1
        L51:
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L2f
            return r3
        L58:
            java.lang.String r9 = "SQL 插入失败: table="
            java.lang.String r8 = wb.en.g(r9, r8)
            r7.log(r8)
            return r1
        L62:
            java.lang.Object r8 = r7.dbWrapper
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "未找到 SqliteDB 插入方法: "
            java.lang.String r8 = r9.concat(r8)
            r7.log(r8)
        L75:
            return r1
    }

    public boolean isAvailable() {
            r2 = this;
            h.Hchat.dexkit.DexFinder r0 = r2.dexFinder
            if (r0 == 0) goto Le
            java.lang.reflect.Method r1 = r0.coreStorageGetter
            if (r1 == 0) goto Le
            java.lang.Class<?> r0 = r0.sqliteDbWrapperClass
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public boolean isReady() {
            r1 = this;
            java.lang.Object r0 = r1.dbWrapper
            if (r0 == 0) goto La
            java.lang.reflect.Method r0 = r1.queryMethod
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public java.lang.String messageTableForTalker(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.messageTableCache
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L18
            return r0
        L18:
            boolean r0 = r3.ensureReady()
            if (r0 != 0) goto L1f
            return r1
        L1f:
            java.lang.String r0 = r3.invokeMessageTableMethod(r4)
            boolean r2 = r3.isUsableMessageTable(r0)
            if (r2 == 0) goto L2f
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.messageTableCache
            r1.put(r4, r0)
            return r0
        L2f:
            java.lang.String r0 = r3.findMessageTableMethod(r4)
            boolean r2 = r3.isUsableMessageTable(r0)
            if (r2 == 0) goto L3f
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.messageTableCache
            r1.put(r4, r0)
            return r0
        L3f:
            return r1
    }

    public java.util.List<java.lang.String> messageTables() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.messageTables
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r4.ensureReady()
            if (r0 != 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L11:
            monitor-enter(r4)
            java.util.List<java.lang.String> r0 = r4.messageTables     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            java.util.List<java.lang.String> r0 = r4.messageTables     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            return r0
        L1a:
            r0 = move-exception
            goto L4c
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite_%'"
            r2 = 0
            java.util.List r1 = r4.query(r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
        L2c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1a
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "name"
            java.lang.String r2 = stringValue(r2, r3)     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r4.isLikelyMessageTable(r2)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L2c
            r0.add(r2)     // Catch: java.lang.Throwable -> L1a
            goto L2c
        L48:
            r4.messageTables = r0     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            return r0
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public java.lang.Object nativeMessageById(long r7) {
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L5c
            h.Hchat.dexkit.DexFinder r0 = r6.dexFinder
            if (r0 == 0) goto L5c
            java.lang.Class<?> r0 = r0.localMessageClass
            if (r0 != 0) goto L10
            goto L5c
        L10:
            boolean r0 = r6.ensureReady()
            if (r0 != 0) goto L17
            return r1
        L17:
            java.lang.Object r0 = r6.messageStorage
            java.lang.reflect.Method r2 = r6.nativeMessageByIdMethod
            java.lang.Object r0 = r6.invokeNativeMessageById(r0, r2, r7)
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.Object r0 = r6.getCoreStorage()
            if (r0 != 0) goto L29
            return r1
        L29:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r0 = r6.storageFieldObjects(r0)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L36
            boolean r4 = r2.contains(r3)
            if (r4 == 0) goto L49
            goto L36
        L49:
            r2.add(r3)
            java.lang.reflect.Method r4 = r6.findNativeMessageByIdMethod(r3)
            java.lang.Object r5 = r6.invokeNativeMessageById(r3, r4, r7)
            if (r5 != 0) goto L57
            goto L36
        L57:
            r6.messageStorage = r3
            r6.nativeMessageByIdMethod = r4
            return r5
        L5c:
            return r1
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> query(java.lang.String r6, java.lang.String[] r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.Cursor r6 = r5.rawQuery(r6, r7)
            if (r6 != 0) goto Lc
            goto L5c
        Lc:
            java.lang.String[] r7 = r6.getColumnNames()     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L3d
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L19
            goto L3d
        L19:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        L1f:
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L30
            r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.cursorValue(r6, r2)     // Catch: java.lang.Throwable -> L2e
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            goto L1f
        L2e:
            r7 = move-exception
            goto L41
        L30:
            r0.add(r1)     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r6.moveToNext()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L19
            r6.close()     // Catch: java.lang.Throwable -> L5c
            return r0
        L3d:
            r6.close()     // Catch: java.lang.Throwable -> L40
        L40:
            return r0
        L41:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "SQL 结果读取异常: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L5d
            r1.append(r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L5d
            r5.log(r7)     // Catch: java.lang.Throwable -> L5d
            r6.close()     // Catch: java.lang.Throwable -> L5c
        L5c:
            return r0
        L5d:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L61
        L61:
            throw r7
    }

    public java.lang.String queryFirstString(java.lang.String r4, java.lang.String[] r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "SQL 单值读取异常: "
            android.database.Cursor r4 = r3.rawQuery(r4, r5)
            java.lang.String r5 = ""
            if (r4 != 0) goto Lb
            return r5
        Lb:
            boolean r1 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L15
            r4.close()     // Catch: java.lang.Throwable -> L14
        L14:
            return r5
        L15:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L21
            r2 = 0
            if (r1 != 0) goto L23
            int r6 = r4.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r6 = move-exception
            goto L33
        L23:
            r6 = r2
        L24:
            if (r6 >= 0) goto L27
            goto L28
        L27:
            r2 = r6
        L28:
            java.lang.String r6 = r4.getString(r2)     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L2f
            r5 = r6
        L2f:
            r4.close()     // Catch: java.lang.Throwable -> L32
        L32:
            return r5
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L4a
            r1.append(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L4a
            r3.log(r6)     // Catch: java.lang.Throwable -> L4a
            r4.close()     // Catch: java.lang.Throwable -> L49
        L49:
            return r5
        L4a:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L4e
        L4e:
            throw r5
    }

    public java.lang.String quoteTable(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isSafeTableName(r2)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "`"
            java.lang.String r2 = eh.a.n(r0, r2, r0)
            return r2
        Ld:
            java.lang.String r2 = ""
            return r2
    }

    public android.database.Cursor rawQuery(java.lang.String r3, java.lang.String[] r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2.ensureReady()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = 1
            android.database.Cursor r3 = r2.rawQueryInternal(r3, r4, r0)
            return r3
    }

    public java.lang.Object storageObjectForMethod(java.lang.reflect.Method r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Class r7 = r7.getDeclaringClass()
            if (r7 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = r7.getName()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.storageObjectCache
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L23
            boolean r3 = r7.isInstance(r2)
            if (r3 == 0) goto L1e
            return r2
        L1e:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.storageObjectCache
            r2.remove(r1)
        L23:
            java.lang.Object r2 = r6.getCoreStorage()
            if (r2 != 0) goto L2a
            return r0
        L2a:
            java.util.IdentityHashMap r3 = new java.util.IdentityHashMap
            r3.<init>()
            java.util.Set r3 = java.util.Collections.newSetFromMap(r3)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r4.add(r2)
        L3b:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L61
            java.lang.Object r2 = r4.removeFirst()
            if (r2 == 0) goto L3b
            boolean r5 = r3.contains(r2)
            if (r5 == 0) goto L4e
            goto L3b
        L4e:
            r3.add(r2)
            boolean r5 = r7.isInstance(r2)
            if (r5 == 0) goto L5d
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.storageObjectCache
            r7.put(r1, r2)
            return r2
        L5d:
            r6.enqueueNestedObjects(r2, r4, r3)
            goto L3b
        L61:
            return r0
    }

    public int update(java.lang.String r4, android.content.ContentValues r5, java.lang.String r6, java.lang.String[] r7) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = -1
            if (r0 != 0) goto L6a
            if (r5 != 0) goto La
            goto L6a
        La:
            boolean r0 = r3.ensureReady()
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.reflect.Method r0 = r3.updateMethod
            if (r0 != 0) goto L21
            java.lang.Object r0 = r3.dbWrapper
            java.lang.Class r0 = r0.getClass()
            java.lang.reflect.Method r0 = r3.findUpdateMethod(r0)
            r3.updateMethod = r0
        L21:
            java.lang.Object r2 = r3.dbWrapper
            if (r0 != 0) goto L37
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "未找到 SqliteDB 更新方法: "
            java.lang.String r4 = r5.concat(r4)
            r3.log(r4)
            return r1
        L37:
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r5)     // Catch: java.lang.Throwable -> L4a
            boolean r6 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L4c
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L4a
            int r4 = r5.intValue()     // Catch: java.lang.Throwable -> L4a
            return r4
        L4a:
            r5 = move-exception
            goto L4d
        L4c:
            return r1
        L4d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "SQL 更新异常: "
            r6.<init>(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = " table="
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.log(r4)
        L6a:
            return r1
    }

    public boolean updateNativeMessageContent(long r7, java.lang.String r9, java.lang.Object r10) {
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L98
            h.Hchat.dexkit.DexFinder r0 = r6.dexFinder
            if (r0 == 0) goto L98
            java.lang.Class<?> r0 = r0.localMessageClass
            if (r0 != 0) goto L11
            goto L98
        L11:
            boolean r0 = r0.isInstance(r10)
            if (r0 == 0) goto L18
            goto L1c
        L18:
            java.lang.Object r10 = r6.nativeMessageById(r7)
        L1c:
            if (r10 != 0) goto L1f
            return r1
        L1f:
            java.lang.reflect.Method r0 = r6.ensureNativeMessageUpdateMethod(r10)
            java.lang.Object r2 = r6.nativeMessageUpdateStorage
            if (r0 == 0) goto L98
            if (r2 != 0) goto L2a
            goto L98
        L2a:
            java.lang.Class r3 = r10.getClass()
            java.lang.String r4 = "field_content"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r4)
            if (r3 != 0) goto L40
            java.lang.Class r3 = r10.getClass()
            java.lang.String r4 = "content"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r4)
        L40:
            if (r3 == 0) goto L98
            java.lang.Class r4 = r3.getType()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 == r5) goto L4b
            goto L98
        L4b:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r3, r10)
            boolean r9 = h.Hchat.utils.KavaReflector.writeField(r3, r10, r9)
            if (r9 != 0) goto L56
            return r1
        L56:
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r2, r9)     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r9 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6f
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L6d
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L6d
            goto L70
        L6d:
            r9 = move-exception
            goto L78
        L6f:
            r9 = r1
        L70:
            if (r9 <= 0) goto L74
            r7 = 1
            return r7
        L74:
            h.Hchat.utils.KavaReflector.writeField(r3, r10, r4)     // Catch: java.lang.Throwable -> L6d
            return r1
        L78:
            h.Hchat.utils.KavaReflector.writeField(r3, r10, r4)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "原生消息更新异常: "
            r10.<init>(r0)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = " msgId="
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r6.log(r7)
        L98:
            return r1
    }
}
