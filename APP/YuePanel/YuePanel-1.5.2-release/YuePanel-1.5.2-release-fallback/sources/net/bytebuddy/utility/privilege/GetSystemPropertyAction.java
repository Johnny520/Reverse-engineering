package net.bytebuddy.utility.privilege;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class GetSystemPropertyAction implements java.security.PrivilegedAction<java.lang.String> {
    private final java.lang.String key;

    public GetSystemPropertyAction(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.key = r1
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
            java.lang.String r2 = r4.key
            net.bytebuddy.utility.privilege.GetSystemPropertyAction r5 = (net.bytebuddy.utility.privilege.GetSystemPropertyAction) r5
            java.lang.String r5 = r5.key
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L20
            return r1
        L20:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.key
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // java.security.PrivilegedAction
    public /* bridge */ /* synthetic */ java.lang.String run() {
            r1 = this;
            java.lang.String r0 = r1.run2()
            return r0
    }

    @Override // java.security.PrivilegedAction
    /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
    public java.lang.String run2() {
            r1 = this;
            java.lang.String r0 = r1.key
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }
}
