package net.bytebuddy.matcher;

import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class MethodOverrideMatcher<T extends net.bytebuddy.description.method.MethodDescription> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> matcher;

    public MethodOverrideMatcher(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            r0 = this;
            r0.<init>()
            r0.matcher = r1
            return
    }

    private boolean matches(net.bytebuddy.description.method.MethodDescription r3, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r4, java.util.Set<net.bytebuddy.description.type.TypeDescription> r5) {
            r2 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r4.next()
            net.bytebuddy.description.type.TypeDefinition r0 = (net.bytebuddy.description.type.TypeDefinition) r0
            net.bytebuddy.description.type.TypeDescription r1 = r0.asErasure()
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto L4
            boolean r1 = r2.matches(r3, r0)
            if (r1 != 0) goto L2a
            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getInterfaces()
            boolean r0 = r2.matches(r3, r0, r5)
            if (r0 == 0) goto L4
        L2a:
            r3 = 1
            return r3
        L2c:
            r3 = 0
            return r3
    }

    private boolean matches(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.description.type.TypeDefinition r5) {
            r3 = this;
            net.bytebuddy.description.method.MethodList r0 = r5.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r1.asSignatureToken()
            net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r4.asSignatureToken()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r4 = r3.matcher
            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.asGenericType()
            boolean r4 = r4.matches(r5)
            if (r4 == 0) goto L3a
            r4 = 1
            return r4
        L3a:
            r4 = 0
            return r4
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    public boolean doMatch(T r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            net.bytebuddy.description.type.TypeDefinition r1 = r5.getDeclaringType()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            net.bytebuddy.description.type.TypeDefinition r2 = (net.bytebuddy.description.type.TypeDefinition) r2
            boolean r3 = r4.matches(r5, r2)
            if (r3 != 0) goto L29
            net.bytebuddy.description.type.TypeList$Generic r2 = r2.getInterfaces()
            boolean r2 = r4.matches(r5, r2, r0)
            if (r2 == 0) goto Ld
        L29:
            r5 = 1
            return r5
        L2b:
            r5 = 0
            return r5
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
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r2 = r4.matcher
            net.bytebuddy.matcher.MethodOverrideMatcher r5 = (net.bytebuddy.matcher.MethodOverrideMatcher) r5
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r5 = r5.matcher
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.matcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isOverriddenFrom("
            r0.append(r1)
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.matcher
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
