package net.bytebuddy.utility.privilege;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class GetMethodAction implements java.security.PrivilegedAction<java.lang.reflect.Method> {
    private final java.lang.String name;
    private final java.lang.Class<?>[] parameter;
    private final java.lang.String type;

    public GetMethodAction(java.lang.String r1, java.lang.String r2, java.lang.Class<?>... r3) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.name = r2
            r0.parameter = r3
            return
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            java.lang.String r2 = r4.type
            net.bytebuddy.utility.privilege.GetMethodAction r5 = (net.bytebuddy.utility.privilege.GetMethodAction) r5
            java.lang.String r3 = r5.type
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String r2 = r4.name
            java.lang.String r3 = r5.name
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            java.lang.Class<?>[] r2 = r4.parameter
            java.lang.Class<?>[] r5 = r5.parameter
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 != 0) goto L36
            return r1
        L36:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.type
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.name
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Class<?>[] r1 = r2.parameter
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // java.security.PrivilegedAction
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
    @net.bytebuddy.utility.nullability.MaybeNull
    public /* bridge */ /* synthetic */ java.lang.reflect.Method run() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.run2()
            return r0
    }

    @Override // java.security.PrivilegedAction
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
    @net.bytebuddy.utility.nullability.MaybeNull
    /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
    public java.lang.reflect.Method run2() {
            r3 = this;
            java.lang.String r0 = r3.type     // Catch: java.lang.Exception -> Lf
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r3.name     // Catch: java.lang.Exception -> Lf
            java.lang.Class<?>[] r2 = r3.parameter     // Catch: java.lang.Exception -> Lf
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }
}
