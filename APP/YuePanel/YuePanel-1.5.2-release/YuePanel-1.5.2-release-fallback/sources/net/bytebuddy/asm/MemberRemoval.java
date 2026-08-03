package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class MemberRemoval extends net.bytebuddy.asm.AsmVisitorWrapper.AbstractBase {
    private final net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.field.FieldDescription.InDefinedShape> fieldMatcher;
    private final net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.method.MethodDescription> methodMatcher;

    public static class MemberRemovingClassVisitor extends net.bytebuddy.jar.asm.ClassVisitor {

        @javax.annotation.Nonnull(when = javax.annotation.meta.When.NEVER)
        private static final net.bytebuddy.jar.asm.FieldVisitor REMOVE_FIELD = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final net.bytebuddy.jar.asm.MethodVisitor REMOVE_METHOD = null;
        private final net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.field.FieldDescription.InDefinedShape> fieldMatcher;
        private final java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription.InDefinedShape> fields;
        private final net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.method.MethodDescription> methodMatcher;
        private final java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> methods;

        static {
                return
        }

        public MemberRemovingClassVisitor(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r3, net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.method.MethodDescription> r4, java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> r6) {
                r1 = this;
                int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                r1.<init>(r0, r2)
                r1.fieldMatcher = r3
                r1.methodMatcher = r4
                r1.fields = r5
                r1.methods = r6
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.FieldVisitor visitField(int r3, java.lang.String r4, java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                r2 = this;
                java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r2.fields
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
                if (r0 == 0) goto L24
                net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.fieldMatcher
                boolean r0 = r1.matches(r0)
                if (r0 == 0) goto L24
                net.bytebuddy.jar.asm.FieldVisitor r3 = net.bytebuddy.asm.MemberRemoval.MemberRemovingClassVisitor.REMOVE_FIELD
                goto L28
            L24:
                net.bytebuddy.jar.asm.FieldVisitor r3 = super.visitField(r3, r4, r5, r6, r7)
            L28:
                return r3
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r3, java.lang.String r4, java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r7) {
                r2 = this;
                java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> r0 = r2.methods
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.method.MethodDescription r0 = (net.bytebuddy.description.method.MethodDescription) r0
                if (r0 == 0) goto L24
                net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.method.MethodDescription> r1 = r2.methodMatcher
                boolean r0 = r1.matches(r0)
                if (r0 == 0) goto L24
                net.bytebuddy.jar.asm.MethodVisitor r3 = net.bytebuddy.asm.MemberRemoval.MemberRemovingClassVisitor.REMOVE_METHOD
                goto L28
            L24:
                net.bytebuddy.jar.asm.MethodVisitor r3 = super.visitMethod(r3, r4, r5, r6, r7)
            L28:
                return r3
        }
    }

    public MemberRemoval() {
            r2 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.none()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.none()
            r2.<init>(r0, r1)
            return
    }

    public MemberRemoval(net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r1, net.bytebuddy.matcher.ElementMatcher.Junction<net.bytebuddy.description.method.MethodDescription> r2) {
            r0 = this;
            r0.<init>()
            r0.fieldMatcher = r1
            r0.methodMatcher = r2
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
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.fieldMatcher
            net.bytebuddy.asm.MemberRemoval r5 = (net.bytebuddy.asm.MemberRemoval) r5
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.fieldMatcher
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.method.MethodDescription> r2 = r4.methodMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.method.MethodDescription> r5 = r5.methodMatcher
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
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.fieldMatcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.method.MethodDescription> r1 = r2.methodMatcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public net.bytebuddy.asm.MemberRemoval stripConstructors(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
            net.bytebuddy.asm.MemberRemoval r2 = r1.stripInvokables(r2)
            return r2
    }

    public net.bytebuddy.asm.MemberRemoval stripFields(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r3) {
            r2 = this;
            net.bytebuddy.asm.MemberRemoval r0 = new net.bytebuddy.asm.MemberRemoval
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.fieldMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r1.or(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.method.MethodDescription> r1 = r2.methodMatcher
            r0.<init>(r3, r1)
            return r0
    }

    public net.bytebuddy.asm.MemberRemoval stripInvokables(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
            r3 = this;
            net.bytebuddy.asm.MemberRemoval r0 = new net.bytebuddy.asm.MemberRemoval
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r3.fieldMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.method.MethodDescription> r2 = r3.methodMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = r2.or(r4)
            r0.<init>(r1, r4)
            return r0
    }

    public net.bytebuddy.asm.MemberRemoval stripMethods(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isMethod()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
            net.bytebuddy.asm.MemberRemoval r2 = r1.stripInvokables(r2)
            return r2
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, net.bytebuddy.description.method.MethodList<?> r6, int r7, int r8) {
            r0 = this;
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r3 = r5.iterator()
        L9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r4 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = r4.getInternalName()
            r5.append(r8)
            java.lang.String r8 = r4.getDescriptor()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r7.put(r5, r4)
            goto L9
        L30:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r3 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
            r3.<init>(r1)
            java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r6, r3)
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r1.next()
            net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.getInternalName()
            r4.append(r5)
            java.lang.String r5 = r3.getDescriptor()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r8.put(r4, r3)
            goto L42
        L69:
            net.bytebuddy.asm.MemberRemoval$MemberRemovingClassVisitor r1 = new net.bytebuddy.asm.MemberRemoval$MemberRemovingClassVisitor
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r0.fieldMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction<net.bytebuddy.description.method.MethodDescription> r6 = r0.methodMatcher
            r3 = r1
            r4 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
    }
}
