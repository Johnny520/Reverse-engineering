package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ModifierAdjustment extends net.bytebuddy.asm.AsmVisitorWrapper.AbstractBase {
    private final java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.field.FieldDescription.InDefinedShape>> fieldAdjustments;
    private final java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.method.MethodDescription>> methodAdjustments;
    private final java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.type.TypeDescription>> typeAdjustments;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Adjustment<T> implements net.bytebuddy.matcher.ElementMatcher<T> {
        private final net.bytebuddy.matcher.ElementMatcher<? super T> matcher;
        private final net.bytebuddy.description.modifier.ModifierContributor.Resolver<?> resolver;

        public Adjustment(net.bytebuddy.matcher.ElementMatcher<? super T> r1, net.bytebuddy.description.modifier.ModifierContributor.Resolver<?> r2) {
                r0 = this;
                r0.<init>()
                r0.matcher = r1
                r0.resolver = r2
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
                net.bytebuddy.matcher.ElementMatcher<? super T> r2 = r4.matcher
                net.bytebuddy.asm.ModifierAdjustment$Adjustment r5 = (net.bytebuddy.asm.ModifierAdjustment.Adjustment) r5
                net.bytebuddy.matcher.ElementMatcher<? super T> r3 = r5.matcher
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.description.modifier.ModifierContributor$Resolver<?> r2 = r4.resolver
                net.bytebuddy.description.modifier.ModifierContributor$Resolver<?> r5 = r5.resolver
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
                net.bytebuddy.matcher.ElementMatcher<? super T> r1 = r2.matcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.modifier.ModifierContributor$Resolver<?> r1 = r2.resolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.ElementMatcher
        public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull T r2) {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher<? super T> r0 = r1.matcher
                boolean r2 = r0.matches(r2)
                return r2
        }

        public int resolve(int r2) {
                r1 = this;
                net.bytebuddy.description.modifier.ModifierContributor$Resolver<?> r0 = r1.resolver
                int r2 = r0.resolve(r2)
                return r2
        }
    }

    public static class ModifierAdjustingClassVisitor extends net.bytebuddy.jar.asm.ClassVisitor {
        private final java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.field.FieldDescription.InDefinedShape>> fieldAdjustments;
        private final java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription.InDefinedShape> fields;
        private final net.bytebuddy.description.type.TypeDescription instrumentedType;
        private final java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.method.MethodDescription>> methodAdjustments;
        private final java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> methods;
        private final java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.type.TypeDescription>> typeAdjustments;

        public ModifierAdjustingClassVisitor(net.bytebuddy.jar.asm.ClassVisitor r2, java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.type.TypeDescription>> r3, java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.field.FieldDescription.InDefinedShape>> r4, java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.method.MethodDescription>> r5, net.bytebuddy.description.type.TypeDescription r6, java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription.InDefinedShape> r7, java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> r8) {
                r1 = this;
                int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                r1.<init>(r0, r2)
                r1.typeAdjustments = r3
                r1.fieldAdjustments = r4
                r1.methodAdjustments = r5
                r1.instrumentedType = r6
                r1.fields = r7
                r1.methods = r8
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visit(int r8, int r9, java.lang.String r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r11, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r12, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r13) {
                r7 = this;
                java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r0 = r7.typeAdjustments
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                net.bytebuddy.asm.ModifierAdjustment$Adjustment r1 = (net.bytebuddy.asm.ModifierAdjustment.Adjustment) r1
                net.bytebuddy.description.type.TypeDescription r2 = r7.instrumentedType
                boolean r2 = r1.matches(r2)
                if (r2 == 0) goto L6
                int r9 = r1.resolve(r9)
            L1e:
                r2 = r9
                r0 = r7
                r1 = r8
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                super.visit(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.FieldVisitor visitField(int r7, java.lang.String r8, java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r11) {
                r6 = this;
                java.util.Map<java.lang.String, net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r6.fields
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
                if (r0 == 0) goto L35
                java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r1 = r6.fieldAdjustments
                java.util.Iterator r1 = r1.iterator()
            L1f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.next()
                net.bytebuddy.asm.ModifierAdjustment$Adjustment r2 = (net.bytebuddy.asm.ModifierAdjustment.Adjustment) r2
                boolean r3 = r2.matches(r0)
                if (r3 == 0) goto L1f
                int r7 = r2.resolve(r7)
            L35:
                r1 = r7
                r0 = r6
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                net.bytebuddy.jar.asm.FieldVisitor r7 = super.visitField(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visitInnerClass(java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, int r7) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.instrumentedType
                java.lang.String r0 = r0.getInternalName()
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L2a
                java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r0 = r3.typeAdjustments
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.asm.ModifierAdjustment$Adjustment r1 = (net.bytebuddy.asm.ModifierAdjustment.Adjustment) r1
                net.bytebuddy.description.type.TypeDescription r2 = r3.instrumentedType
                boolean r2 = r1.matches(r2)
                if (r2 == 0) goto L12
                int r7 = r1.resolve(r7)
            L2a:
                super.visitInnerClass(r4, r5, r6, r7)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r7, java.lang.String r8, java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r11) {
                r6 = this;
                java.util.Map<java.lang.String, net.bytebuddy.description.method.MethodDescription> r0 = r6.methods
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.method.MethodDescription r0 = (net.bytebuddy.description.method.MethodDescription) r0
                if (r0 == 0) goto L35
                java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r1 = r6.methodAdjustments
                java.util.Iterator r1 = r1.iterator()
            L1f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.next()
                net.bytebuddy.asm.ModifierAdjustment$Adjustment r2 = (net.bytebuddy.asm.ModifierAdjustment.Adjustment) r2
                boolean r3 = r2.matches(r0)
                if (r3 == 0) goto L1f
                int r7 = r2.resolve(r7)
            L35:
                r1 = r7
                r0 = r6
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                net.bytebuddy.jar.asm.MethodVisitor r7 = super.visitMethod(r1, r2, r3, r4, r5)
                return r7
        }
    }

    public ModifierAdjustment() {
            r3 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r2 = java.util.Collections.emptyList()
            r3.<init>(r0, r1, r2)
            return
    }

    public ModifierAdjustment(java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.type.TypeDescription>> r1, java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.field.FieldDescription.InDefinedShape>> r2, java.util.List<net.bytebuddy.asm.ModifierAdjustment.Adjustment<net.bytebuddy.description.method.MethodDescription>> r3) {
            r0 = this;
            r0.<init>()
            r0.typeAdjustments = r1
            r0.fieldAdjustments = r2
            r0.methodAdjustments = r3
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
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r2 = r4.typeAdjustments
            net.bytebuddy.asm.ModifierAdjustment r5 = (net.bytebuddy.asm.ModifierAdjustment) r5
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r3 = r5.typeAdjustments
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r2 = r4.fieldAdjustments
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r3 = r5.fieldAdjustments
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r2 = r4.methodAdjustments
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r5 = r5.methodAdjustments
            boolean r5 = r2.equals(r5)
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
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r1 = r2.typeAdjustments
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r1 = r2.fieldAdjustments
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r1 = r2.methodAdjustments
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public net.bytebuddy.asm.ModifierAdjustment withConstructorModifiers(java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
            net.bytebuddy.asm.ModifierAdjustment r2 = r1.withConstructorModifiers(r0, r2)
            return r2
    }

    public net.bytebuddy.asm.ModifierAdjustment withConstructorModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r3) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
            net.bytebuddy.asm.ModifierAdjustment r2 = r1.withInvokableModifiers(r2, r3)
            return r2
    }

    public net.bytebuddy.asm.ModifierAdjustment withConstructorModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withConstructorModifiers(r1, r2)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withConstructorModifiers(net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withConstructorModifiers(r1)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withFieldModifiers(java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForField> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
            net.bytebuddy.asm.ModifierAdjustment r2 = r1.withFieldModifiers(r0, r2)
            return r2
    }

    public net.bytebuddy.asm.ModifierAdjustment withFieldModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4, java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForField> r5) {
            r3 = this;
            net.bytebuddy.asm.ModifierAdjustment r0 = new net.bytebuddy.asm.ModifierAdjustment
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r1 = r3.typeAdjustments
            net.bytebuddy.asm.ModifierAdjustment$Adjustment r2 = new net.bytebuddy.asm.ModifierAdjustment$Adjustment
            net.bytebuddy.description.modifier.ModifierContributor$Resolver r5 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r5)
            r2.<init>(r4, r5)
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r4 = r3.fieldAdjustments
            java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r2, r4)
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r5 = r3.methodAdjustments
            r0.<init>(r1, r4, r5)
            return r0
    }

    public net.bytebuddy.asm.ModifierAdjustment withFieldModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r1, net.bytebuddy.description.modifier.ModifierContributor.ForField... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withFieldModifiers(r1, r2)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withFieldModifiers(net.bytebuddy.description.modifier.ModifierContributor.ForField... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withFieldModifiers(r1)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withInvokableModifiers(java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
            net.bytebuddy.asm.ModifierAdjustment r2 = r1.withInvokableModifiers(r0, r2)
            return r2
    }

    public net.bytebuddy.asm.ModifierAdjustment withInvokableModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5, java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r6) {
            r4 = this;
            net.bytebuddy.asm.ModifierAdjustment r0 = new net.bytebuddy.asm.ModifierAdjustment
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r1 = r4.typeAdjustments
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r2 = r4.fieldAdjustments
            net.bytebuddy.asm.ModifierAdjustment$Adjustment r3 = new net.bytebuddy.asm.ModifierAdjustment$Adjustment
            net.bytebuddy.description.modifier.ModifierContributor$Resolver r6 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r6)
            r3.<init>(r5, r6)
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r5 = r4.methodAdjustments
            java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r3, r5)
            r0.<init>(r1, r2, r5)
            return r0
    }

    public net.bytebuddy.asm.ModifierAdjustment withInvokableModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withInvokableModifiers(r1, r2)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withInvokableModifiers(net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withInvokableModifiers(r1)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withMethodModifiers(java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
            net.bytebuddy.asm.ModifierAdjustment r2 = r1.withMethodModifiers(r0, r2)
            return r2
    }

    public net.bytebuddy.asm.ModifierAdjustment withMethodModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r3) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isMethod()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
            net.bytebuddy.asm.ModifierAdjustment r2 = r1.withInvokableModifiers(r2, r3)
            return r2
    }

    public net.bytebuddy.asm.ModifierAdjustment withMethodModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withMethodModifiers(r1, r2)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withMethodModifiers(net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withMethodModifiers(r1)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withTypeModifiers(java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
            net.bytebuddy.asm.ModifierAdjustment r2 = r1.withTypeModifiers(r0, r2)
            return r2
    }

    public net.bytebuddy.asm.ModifierAdjustment withTypeModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r3, java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r4) {
            r2 = this;
            net.bytebuddy.asm.ModifierAdjustment r0 = new net.bytebuddy.asm.ModifierAdjustment
            net.bytebuddy.asm.ModifierAdjustment$Adjustment r1 = new net.bytebuddy.asm.ModifierAdjustment$Adjustment
            net.bytebuddy.description.modifier.ModifierContributor$Resolver r4 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r4)
            r1.<init>(r3, r4)
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r3 = r2.typeAdjustments
            java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r1, r3)
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r4 = r2.fieldAdjustments
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r1 = r2.methodAdjustments
            r0.<init>(r3, r4, r1)
            return r0
    }

    public net.bytebuddy.asm.ModifierAdjustment withTypeModifiers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1, net.bytebuddy.description.modifier.ModifierContributor.ForType... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withTypeModifiers(r1, r2)
            return r1
    }

    public net.bytebuddy.asm.ModifierAdjustment withTypeModifiers(net.bytebuddy.description.modifier.ModifierContributor.ForType... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.asm.ModifierAdjustment r1 = r0.withTypeModifiers(r1)
            return r1
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public net.bytebuddy.asm.ModifierAdjustment.ModifierAdjustingClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.jar.asm.ClassVisitor r12, net.bytebuddy.implementation.Implementation.Context r13, net.bytebuddy.pool.TypePool r14, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r15, net.bytebuddy.description.method.MethodList<?> r16, int r17, int r18) {
            r10 = this;
            r0 = r10
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r1 = r15.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.getInternalName()
            r3.append(r4)
            java.lang.String r4 = r2.getDescriptor()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r7.put(r3, r2)
            goto La
        L31:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r1 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
            r6 = r11
            r1.<init>(r11)
            r2 = r16
            java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.getInternalName()
            r3.append(r4)
            java.lang.String r4 = r2.getDescriptor()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.put(r3, r2)
            goto L46
        L6d:
            net.bytebuddy.asm.ModifierAdjustment$ModifierAdjustingClassVisitor r9 = new net.bytebuddy.asm.ModifierAdjustment$ModifierAdjustingClassVisitor
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.type.TypeDescription>> r3 = r0.typeAdjustments
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r4 = r0.fieldAdjustments
            java.util.List<net.bytebuddy.asm.ModifierAdjustment$Adjustment<net.bytebuddy.description.method.MethodDescription>> r5 = r0.methodAdjustments
            r1 = r9
            r2 = r12
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public /* bridge */ /* synthetic */ net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList r5, net.bytebuddy.description.method.MethodList r6, int r7, int r8) {
            r0 = this;
            net.bytebuddy.asm.ModifierAdjustment$ModifierAdjustingClassVisitor r1 = r0.wrap(r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }
}
