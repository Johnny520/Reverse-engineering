package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class InliningImplementationMatcher implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.method.MethodDescription> {
    private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> ignoredMethods;
    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> predefinedMethodSignatures;

    public InliningImplementationMatcher(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
            r0 = this;
            r0.<init>()
            r0.ignoredMethods = r1
            r0.predefinedMethodSignatures = r2
            return
    }

    public static net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.method.MethodDescription> of(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r4, net.bytebuddy.description.type.TypeDescription r5) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.none()
            net.bytebuddy.description.method.MethodList r5 = r5.getDeclaredMethods()
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r5.next()
            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
            boolean r2 = r1.isConstructor()
            if (r2 == 0) goto L23
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
            goto L2b
        L23:
            java.lang.String r2 = r1.getName()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r2)
        L2b:
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r1.getReturnType()
            net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.returns(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
            net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
            net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
            net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r2.and(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.or(r1)
            goto Lc
        L54:
            net.bytebuddy.dynamic.scaffold.inline.InliningImplementationMatcher r5 = new net.bytebuddy.dynamic.scaffold.inline.InliningImplementationMatcher
            r5.<init>(r4, r0)
            return r5
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
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.ignoredMethods
            net.bytebuddy.dynamic.scaffold.inline.InliningImplementationMatcher r5 = (net.bytebuddy.dynamic.scaffold.inline.InliningImplementationMatcher) r5
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.ignoredMethods
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.predefinedMethodSignatures
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.predefinedMethodSignatures
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2b
            return r1
        L2b:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.ignoredMethods
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.predefinedMethodSignatures
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.matcher.LatentMatcher
    public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> resolve(net.bytebuddy.description.type.TypeDescription r4) {
            r3 = this;
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r3.ignoredMethods
            net.bytebuddy.matcher.ElementMatcher r0 = r0.resolve(r4)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.not(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isFinal()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.not(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r4)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.or(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r4)
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r3.predefinedMethodSignatures
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = r4.and(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = r0.or(r4)
            return r4
    }
}
