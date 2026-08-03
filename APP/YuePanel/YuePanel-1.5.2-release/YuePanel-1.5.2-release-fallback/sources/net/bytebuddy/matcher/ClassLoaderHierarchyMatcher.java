package net.bytebuddy.matcher;

import java.lang.ClassLoader;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ClassLoaderHierarchyMatcher<T extends java.lang.ClassLoader> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<T> {
    private final net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> matcher;

    public ClassLoaderHierarchyMatcher(net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r1) {
            r0 = this;
            r0.<init>()
            r0.matcher = r1
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
            net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r2 = r4.matcher
            net.bytebuddy.matcher.ClassLoaderHierarchyMatcher r5 = (net.bytebuddy.matcher.ClassLoaderHierarchyMatcher) r5
            net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r5 = r5.matcher
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
            net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r1 = r2.matcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull T r2) {
            r1 = this;
        L0:
            if (r2 == 0) goto L11
            net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r0 = r1.matcher
            boolean r0 = r0.matches(r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            java.lang.ClassLoader r2 = r2.getParent()
            goto L0
        L11:
            net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r2 = r1.matcher
            r0 = 0
            boolean r2 = r2.matches(r0)
            return r2
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
            java.lang.String r1 = "hasChild("
            r0.append(r1)
            net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r1 = r2.matcher
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
