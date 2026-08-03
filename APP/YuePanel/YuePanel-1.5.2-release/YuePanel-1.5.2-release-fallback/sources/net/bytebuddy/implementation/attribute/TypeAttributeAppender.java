package net.bytebuddy.implementation.attribute;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeAttributeAppender {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.implementation.attribute.TypeAttributeAppender {
        private final java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> typeAttributeAppenders;

        public Compound(java.util.List<? extends net.bytebuddy.implementation.attribute.TypeAttributeAppender> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.typeAttributeAppenders = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.implementation.attribute.TypeAttributeAppender r0 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.TypeAttributeAppender.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> r1 = r2.typeAttributeAppenders
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$Compound r0 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.Compound) r0
                java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> r0 = r0.typeAttributeAppenders
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> r1 = r2.typeAttributeAppenders
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.implementation.attribute.TypeAttributeAppender... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(net.bytebuddy.jar.asm.ClassVisitor r3, net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                r2 = this;
                java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> r0 = r2.typeAttributeAppenders
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.attribute.TypeAttributeAppender r1 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender) r1
                r1.apply(r3, r4, r5)
                goto L6
            L16:
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
                java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> r2 = r4.typeAttributeAppenders
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$Compound r5 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.Compound) r5
                java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> r5 = r5.typeAttributeAppenders
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
                java.util.List<net.bytebuddy.implementation.attribute.TypeAttributeAppender> r1 = r2.typeAttributeAppenders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements net.bytebuddy.implementation.attribute.TypeAttributeAppender {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;

        public Explicit(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1) {
                r0 = this;
                r0.<init>()
                r0.annotations = r1
                return
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter r4) {
                r1 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r3 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType
                r0.<init>(r2)
                r3.<init>(r0)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r1.annotations
                java.util.Iterator r2 = r2.iterator()
            L10:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L21
                java.lang.Object r0 = r2.next()
                net.bytebuddy.description.annotation.AnnotationDescription r0 = (net.bytebuddy.description.annotation.AnnotationDescription) r0
                net.bytebuddy.implementation.attribute.AnnotationAppender r3 = r3.append(r0, r4)
                goto L10
            L21:
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
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r4.annotations
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$Explicit r5 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.Explicit) r5
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r5.annotations
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
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public enum ForInstrumentedType extends java.lang.Enum<net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType> implements net.bytebuddy.implementation.attribute.TypeAttributeAppender {
        private static final /* synthetic */ net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType[] $VALUES = null;
        public static final net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType INSTANCE = null;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Differentiating implements net.bytebuddy.implementation.attribute.TypeAttributeAppender {
            private final int annotationIndex;
            private final int interfaceTypeIndex;
            private final int typeVariableIndex;

            public Differentiating(int r1, int r2, int r3) {
                    r0 = this;
                    r0.<init>()
                    r0.annotationIndex = r1
                    r0.typeVariableIndex = r2
                    r0.interfaceTypeIndex = r3
                    return
            }

            public Differentiating(net.bytebuddy.description.type.TypeDescription r3) {
                    r2 = this;
                    net.bytebuddy.description.annotation.AnnotationList r0 = r3.getDeclaredAnnotations()
                    int r0 = r0.size()
                    net.bytebuddy.description.type.TypeList$Generic r1 = r3.getTypeVariables()
                    int r1 = r1.size()
                    net.bytebuddy.description.type.TypeList$Generic r3 = r3.getInterfaces()
                    int r3 = r3.size()
                    r2.<init>(r0, r1, r3)
                    return
            }

            @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
            public void apply(net.bytebuddy.jar.asm.ClassVisitor r5, net.bytebuddy.description.type.TypeDescription r6, net.bytebuddy.implementation.attribute.AnnotationValueFilter r7) {
                    r4 = this;
                    net.bytebuddy.implementation.attribute.AnnotationAppender$Default r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                    net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType
                    r1.<init>(r5)
                    r0.<init>(r1)
                    int r5 = r4.typeVariableIndex
                    net.bytebuddy.description.type.TypeList$Generic r1 = r6.getTypeVariables()
                    r2 = 1
                    net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofTypeVariable(r0, r7, r2, r5, r1)
                    net.bytebuddy.description.type.TypeList$Generic r5 = r6.getInterfaces()
                    int r1 = r4.interfaceTypeIndex
                    int r2 = r5.size()
                    net.bytebuddy.matcher.FilterableList r5 = r5.subList(r1, r2)
                    net.bytebuddy.description.type.TypeList$Generic r5 = (net.bytebuddy.description.type.TypeList.Generic) r5
                    java.util.Iterator r5 = r5.iterator()
                L28:
                    boolean r2 = r5.hasNext()
                    if (r2 == 0) goto L42
                    java.lang.Object r2 = r5.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    int r3 = r1 + 1
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofInterfaceType(r0, r7, r1)
                    java.lang.Object r0 = r2.accept(r0)
                    net.bytebuddy.implementation.attribute.AnnotationAppender r0 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r0
                    r1 = r3
                    goto L28
                L42:
                    net.bytebuddy.description.annotation.AnnotationList r5 = r6.getDeclaredAnnotations()
                    int r6 = r4.annotationIndex
                    int r1 = r5.size()
                    net.bytebuddy.matcher.FilterableList r5 = r5.subList(r6, r1)
                    net.bytebuddy.description.annotation.AnnotationList r5 = (net.bytebuddy.description.annotation.AnnotationList) r5
                    java.util.Iterator r5 = r5.iterator()
                L56:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L67
                    java.lang.Object r6 = r5.next()
                    net.bytebuddy.description.annotation.AnnotationDescription r6 = (net.bytebuddy.description.annotation.AnnotationDescription) r6
                    net.bytebuddy.implementation.attribute.AnnotationAppender r0 = r0.append(r6, r7)
                    goto L56
                L67:
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
                    int r2 = r4.annotationIndex
                    net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType$Differentiating r5 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.Differentiating) r5
                    int r3 = r5.annotationIndex
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    int r2 = r4.typeVariableIndex
                    int r3 = r5.typeVariableIndex
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    int r2 = r4.interfaceTypeIndex
                    int r5 = r5.interfaceTypeIndex
                    if (r2 == r5) goto L2a
                    return r1
                L2a:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    int r1 = r2.annotationIndex
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    int r1 = r2.typeVariableIndex
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    int r1 = r2.interfaceTypeIndex
                    int r0 = r0 + r1
                    return r0
            }
        }

        static {
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.INSTANCE = r0
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType[] r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType[]{r0}
                net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.$VALUES = r0
                return
        }

        ForInstrumentedType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType> r0 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType r1 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType) r1
                return r1
        }

        public static net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType[] values() {
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType[] r0 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType[] r0 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(net.bytebuddy.jar.asm.ClassVisitor r5, net.bytebuddy.description.type.TypeDescription r6, net.bytebuddy.implementation.attribute.AnnotationValueFilter r7) {
                r4 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType
                r1.<init>(r5)
                r0.<init>(r1)
                net.bytebuddy.description.type.TypeList$Generic r5 = r6.getTypeVariables()
                r1 = 1
                net.bytebuddy.implementation.attribute.AnnotationAppender r5 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofTypeVariable(r0, r7, r1, r5)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r6.getSuperClass()
                if (r0 == 0) goto L23
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r5 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofSuperClass(r5, r7)
                java.lang.Object r5 = r0.accept(r5)
                net.bytebuddy.implementation.attribute.AnnotationAppender r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r5
            L23:
                net.bytebuddy.description.type.TypeList$Generic r0 = r6.getInterfaces()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L2c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L46
                java.lang.Object r2 = r0.next()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                int r3 = r1 + 1
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r5 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofInterfaceType(r5, r7, r1)
                java.lang.Object r5 = r2.accept(r5)
                net.bytebuddy.implementation.attribute.AnnotationAppender r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r5
                r1 = r3
                goto L2c
            L46:
                net.bytebuddy.description.annotation.AnnotationList r6 = r6.getDeclaredAnnotations()
                java.util.Iterator r6 = r6.iterator()
            L4e:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L5f
                java.lang.Object r0 = r6.next()
                net.bytebuddy.description.annotation.AnnotationDescription r0 = (net.bytebuddy.description.annotation.AnnotationDescription) r0
                net.bytebuddy.implementation.attribute.AnnotationAppender r5 = r5.append(r0, r7)
                goto L4e
            L5f:
                return
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp> implements net.bytebuddy.implementation.attribute.TypeAttributeAppender {
        private static final /* synthetic */ net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp[] $VALUES = null;
        public static final net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp INSTANCE = null;

        static {
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp.INSTANCE = r0
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp[] r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp[]{r0}
                net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp> r0 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp r1 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp) r1
                return r1
        }

        public static net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp[] values() {
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp[] r0 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp[] r0 = (net.bytebuddy.implementation.attribute.TypeAttributeAppender.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                r0 = this;
                return
        }
    }

    void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3);
}
