package net.bytebuddy.matcher;

import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class HasSuperTypeMatcher<T extends net.bytebuddy.description.type.TypeDescription> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> matcher;

    public HasSuperTypeMatcher(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            r0 = this;
            r0.<init>()
            r0.matcher = r1
            return
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    public boolean doMatch(T r7) {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            r2 = 0
            if (r1 == 0) goto L62
            java.lang.Object r1 = r7.next()
            net.bytebuddy.description.type.TypeDefinition r1 = (net.bytebuddy.description.type.TypeDefinition) r1
            net.bytebuddy.description.type.TypeDescription r3 = r1.asErasure()
            boolean r3 = r0.add(r3)
            if (r3 != 0) goto L21
            return r2
        L21:
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r2 = r6.matcher
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r1.asGenericType()
            boolean r2 = r2.matches(r3)
            r3 = 1
            if (r2 == 0) goto L2f
            return r3
        L2f:
            net.bytebuddy.description.type.TypeList$Generic r1 = r1.getInterfaces()
            java.util.Queue r1 = net.bytebuddy.utility.QueueFactory.make(r1)
        L37:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L9
            java.lang.Object r2 = r1.remove()
            net.bytebuddy.description.type.TypeDefinition r2 = (net.bytebuddy.description.type.TypeDefinition) r2
            net.bytebuddy.description.type.TypeDescription r4 = r2.asErasure()
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L37
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r4 = r6.matcher
            net.bytebuddy.description.type.TypeDescription$Generic r5 = r2.asGenericType()
            boolean r4 = r4.matches(r5)
            if (r4 == 0) goto L5a
            return r3
        L5a:
            net.bytebuddy.description.type.TypeList$Generic r2 = r2.getInterfaces()
            r1.addAll(r2)
            goto L37
        L62:
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
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r2 = r4.matcher
            net.bytebuddy.matcher.HasSuperTypeMatcher r5 = (net.bytebuddy.matcher.HasSuperTypeMatcher) r5
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
            java.lang.String r1 = "hasSuperType("
            r0.append(r1)
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.matcher
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
