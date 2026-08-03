package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Capabilities implements java.util.function.Supplier<java.lang.Boolean>, java.util.function.Consumer<java.lang.Boolean> {
    private static final java.lang.ThreadLocal<java.lang.Boolean> ACCESSIBILITY = null;
    private static final java.util.Map<java.lang.String, java.lang.Class<?>> classes = null;
    static final bsh.Capabilities instance = null;
    private volatile boolean accessibility;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Unavailable extends bsh.UtilEvalError {
        public Unavailable(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public Unavailable(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    static {
            bsh.Capabilities r0 = new bsh.Capabilities
            r0.<init>()
            bsh.Capabilities.instance = r0
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            bsh.Capabilities.ACCESSIBILITY = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            bsh.Capabilities.classes = r0
            return
    }

    private Capabilities() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.accessibility = r0
            return
    }

    public static boolean classExists(java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = bsh.Capabilities.classes
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L16
            java.lang.Class r1 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L10
            r0.put(r2, r1)     // Catch: java.lang.ClassNotFoundException -> L10
            goto L16
        L10:
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = bsh.Capabilities.classes
            r1 = 0
            r0.put(r2, r1)
        L16:
            java.lang.Class r2 = getExisting(r2)
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }

    public static java.lang.Class<?> getExisting(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = bsh.Capabilities.classes
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static boolean haveAccessibility() {
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Capabilities.ACCESSIBILITY
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static boolean haveSwing() {
            java.lang.String r0 = "javax.swing.JButton"
            boolean r0 = classExists(r0)
            return r0
    }

    public static void setAccessibility(boolean r1) {
            if (r1 != 0) goto La
            java.lang.ThreadLocal<java.lang.Boolean> r1 = bsh.Capabilities.ACCESSIBILITY
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.set(r0)
            goto L24
        La:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r1.getDeclaredMethods()
            java.lang.String r0 = "value"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L1d
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1d
            r0 = 0
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1d
        L1d:
            java.lang.ThreadLocal<java.lang.Boolean> r1 = bsh.Capabilities.ACCESSIBILITY
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.set(r0)
        L24:
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r1 = bsh.BshClassManager.memberCache
            r1.clear()
            return
    }

    /* JADX INFO: renamed from: accept, reason: avoid collision after fix types in other method */
    public void accept2(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r0.accessibility = r1
            return
    }

    @Override // java.util.function.Consumer
    public /* bridge */ /* synthetic */ void accept(java.lang.Boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.accept2(r1)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Supplier
    public java.lang.Boolean get() {
            r1 = this;
            boolean r0 = r1.accessibility
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // java.util.function.Supplier
    public /* bridge */ /* synthetic */ java.lang.Boolean get() {
            r1 = this;
            java.lang.Boolean r0 = r1.get()
            return r0
    }
}
