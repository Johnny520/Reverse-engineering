package net.bytebuddy.matcher;

import java.lang.ClassLoader;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ClassLoaderParentMatcher<T extends java.lang.ClassLoader> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<T> {

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final java.lang.ClassLoader classLoader;

    public ClassLoaderParentMatcher(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
            r0 = this;
            r0.<init>()
            r0.classLoader = r1
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
            java.lang.ClassLoader r2 = r4.classLoader
            net.bytebuddy.matcher.ClassLoaderParentMatcher r5 = (net.bytebuddy.matcher.ClassLoaderParentMatcher) r5
            java.lang.ClassLoader r5 = r5.classLoader
            if (r5 == 0) goto L24
            if (r2 == 0) goto L26
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L24:
            if (r2 == 0) goto L27
        L26:
            return r1
        L27:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.ClassLoader r1 = r2.classLoader
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L13:
            return r0
    }

    public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull T r3) {
            r2 = this;
            java.lang.ClassLoader r0 = r2.classLoader
        L2:
            r1 = 1
            if (r0 == 0) goto Ld
            if (r0 != r3) goto L8
            return r1
        L8:
            java.lang.ClassLoader r0 = r0.getParent()
            goto L2
        Ld:
            if (r3 != 0) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r1) {
            r0 = this;
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            boolean r1 = r0.matches(r1)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isParentOf("
            r0.append(r1)
            java.lang.ClassLoader r1 = r2.classLoader
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
