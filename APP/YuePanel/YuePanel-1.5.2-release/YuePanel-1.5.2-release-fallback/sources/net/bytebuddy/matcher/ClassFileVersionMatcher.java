package net.bytebuddy.matcher;

import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ClassFileVersionMatcher<T extends net.bytebuddy.description.type.TypeDescription> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final boolean atMost;
    private final net.bytebuddy.ClassFileVersion classFileVersion;

    public ClassFileVersionMatcher(net.bytebuddy.ClassFileVersion r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.classFileVersion = r1
            r0.atMost = r2
            return
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    public boolean doMatch(T r2) {
            r1 = this;
            net.bytebuddy.ClassFileVersion r2 = r2.getClassFileVersion()
            if (r2 == 0) goto L1d
            boolean r0 = r1.atMost
            if (r0 == 0) goto L13
            net.bytebuddy.ClassFileVersion r0 = r1.classFileVersion
            boolean r2 = r2.isAtMost(r0)
            if (r2 == 0) goto L1d
            goto L1b
        L13:
            net.bytebuddy.ClassFileVersion r0 = r1.classFileVersion
            boolean r2 = r2.isAtLeast(r0)
            if (r2 == 0) goto L1d
        L1b:
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = super.equals(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 != r5) goto Lc
            return r0
        Lc:
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1a
            return r1
        L1a:
            boolean r2 = r4.atMost
            net.bytebuddy.matcher.ClassFileVersionMatcher r5 = (net.bytebuddy.matcher.ClassFileVersionMatcher) r5
            boolean r3 = r5.atMost
            if (r2 == r3) goto L23
            return r1
        L23:
            net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
            net.bytebuddy.ClassFileVersion r5 = r5.classFileVersion
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2e
            return r1
        L2e:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.atMost
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hasClassFileVersion(at "
            r0.append(r1)
            boolean r1 = r2.atMost
            if (r1 == 0) goto L11
            java.lang.String r1 = "most"
            goto L13
        L11:
            java.lang.String r1 = "least"
        L13:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
