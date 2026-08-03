package net.bytebuddy.utility.privilege;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class SetAccessibleAction<T extends java.lang.reflect.AccessibleObject> implements java.security.PrivilegedAction<T> {
    private final T accessibleObject;

    public SetAccessibleAction(T r1) {
            r0 = this;
            r0.<init>()
            r0.accessibleObject = r1
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
            T extends java.lang.reflect.AccessibleObject r2 = r4.accessibleObject
            net.bytebuddy.utility.privilege.SetAccessibleAction r5 = (net.bytebuddy.utility.privilege.SetAccessibleAction) r5
            T extends java.lang.reflect.AccessibleObject r5 = r5.accessibleObject
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
            T extends java.lang.reflect.AccessibleObject r1 = r2.accessibleObject
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // java.security.PrivilegedAction
    public /* bridge */ /* synthetic */ java.lang.Object run() {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.run()
            return r0
    }

    @Override // java.security.PrivilegedAction
    public T run() {
            r2 = this;
            T extends java.lang.reflect.AccessibleObject r0 = r2.accessibleObject
            r1 = 1
            r0.setAccessible(r1)
            T extends java.lang.reflect.AccessibleObject r0 = r2.accessibleObject
            return r0
    }
}
