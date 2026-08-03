package bsh.security;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface SecurityGuard {
    default boolean canConstruct(java.lang.Class<?> r1, java.lang.Object[] r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canExtends(java.lang.Class<?> r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canGetField(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canGetStaticField(java.lang.Class<?> r1, java.lang.String r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canImplements(java.lang.Class<?> r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canInvokeLocalMethod(java.lang.String r1, java.lang.Object[] r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canInvokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canInvokeStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object[] r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canSetField(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    default boolean canSetStaticField(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r1 = 1
            return r1
    }
}
