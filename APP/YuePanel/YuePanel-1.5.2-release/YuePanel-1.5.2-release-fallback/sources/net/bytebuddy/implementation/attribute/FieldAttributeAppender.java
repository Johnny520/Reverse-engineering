package net.bytebuddy.implementation.attribute;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldAttributeAppender {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.implementation.attribute.FieldAttributeAppender {
        private final java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> fieldAttributeAppenders;

        public Compound(java.util.List<? extends net.bytebuddy.implementation.attribute.FieldAttributeAppender> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.fieldAttributeAppenders = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.implementation.attribute.FieldAttributeAppender r0 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.FieldAttributeAppender.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> r1 = r2.fieldAttributeAppenders
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Compound r0 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Compound) r0
                java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> r0 = r0.fieldAttributeAppenders
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> r1 = r2.fieldAttributeAppenders
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.implementation.attribute.FieldAttributeAppender... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(net.bytebuddy.jar.asm.FieldVisitor r3, net.bytebuddy.description.field.FieldDescription r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                r2 = this;
                java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> r0 = r2.fieldAttributeAppenders
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.attribute.FieldAttributeAppender r1 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender) r1
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
                java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> r2 = r4.fieldAttributeAppenders
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Compound r5 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Compound) r5
                java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> r5 = r5.fieldAttributeAppenders
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
                java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender> r1 = r2.fieldAttributeAppenders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements net.bytebuddy.implementation.attribute.FieldAttributeAppender, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;

        public Explicit(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1) {
                r0 = this;
                r0.<init>()
                r0.annotations = r1
                return
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(net.bytebuddy.jar.asm.FieldVisitor r2, net.bytebuddy.description.field.FieldDescription r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter r4) {
                r1 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r3 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnField r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnField
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
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Explicit r5 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Explicit) r5
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

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
        public net.bytebuddy.implementation.attribute.FieldAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    public interface Factory {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory {
            private final java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory> factories;

            public Compound(java.util.List<? extends net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory> r3) {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r2.factories = r0
                    java.util.Iterator r3 = r3.iterator()
                Le:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L32
                    java.lang.Object r0 = r3.next()
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r0 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory) r0
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory.Compound
                    if (r1 == 0) goto L28
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r1 = r2.factories
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory$Compound r0 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory.Compound) r0
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r0 = r0.factories
                    r1.addAll(r0)
                    goto Le
                L28:
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp
                    if (r1 != 0) goto Le
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r1 = r2.factories
                    r1.add(r0)
                    goto Le
                L32:
                    return
            }

            public Compound(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
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
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r2 = r4.factories
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory$Compound r5 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory.Compound) r5
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r5 = r5.factories
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
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r1 = r2.factories
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
            public net.bytebuddy.implementation.attribute.FieldAttributeAppender make(net.bytebuddy.description.type.TypeDescription r4) {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r1 = r3.factories
                    int r1 = r1.size()
                    r0.<init>(r1)
                    java.util.List<net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory> r1 = r3.factories
                    java.util.Iterator r1 = r1.iterator()
                L11:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L25
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r2 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory) r2
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender r2 = r2.make(r4)
                    r0.add(r2)
                    goto L11
                L25:
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Compound r4 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender$Compound
                    r4.<init>(r0)
                    return r4
            }
        }

        net.bytebuddy.implementation.attribute.FieldAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1);
    }

    public enum ForInstrumentedField extends java.lang.Enum<net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField> implements net.bytebuddy.implementation.attribute.FieldAttributeAppender, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory {
        private static final /* synthetic */ net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField[] $VALUES = null;
        public static final net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField INSTANCE = null;

        static {
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r0 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField.INSTANCE = r0
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField[] r0 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField[]{r0}
                net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField.$VALUES = r0
                return
        }

        ForInstrumentedField(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField> r0 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r1 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField) r1
                return r1
        }

        public static net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField[] values() {
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField[] r0 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField[] r0 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(net.bytebuddy.jar.asm.FieldVisitor r3, net.bytebuddy.description.field.FieldDescription r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                r2 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnField r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnField
                r1.<init>(r3)
                r0.<init>(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.getType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofFieldType(r0, r5)
                java.lang.Object r3 = r3.accept(r0)
                net.bytebuddy.implementation.attribute.AnnotationAppender r3 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r3
                net.bytebuddy.description.annotation.AnnotationList r4 = r4.getDeclaredAnnotations()
                java.util.Iterator r4 = r4.iterator()
            L20:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L31
                java.lang.Object r0 = r4.next()
                net.bytebuddy.description.annotation.AnnotationDescription r0 = (net.bytebuddy.description.annotation.AnnotationDescription) r0
                net.bytebuddy.implementation.attribute.AnnotationAppender r3 = r3.append(r0, r5)
                goto L20
            L31:
                return
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
        public net.bytebuddy.implementation.attribute.FieldAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp> implements net.bytebuddy.implementation.attribute.FieldAttributeAppender, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory {
        private static final /* synthetic */ net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp[] $VALUES = null;
        public static final net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp INSTANCE = null;

        static {
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp r0 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp.INSTANCE = r0
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp[] r0 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp[]{r0}
                net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp> r0 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp r1 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp) r1
                return r1
        }

        public static net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp[] values() {
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp[] r0 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp[] r0 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(net.bytebuddy.jar.asm.FieldVisitor r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
        public net.bytebuddy.implementation.attribute.FieldAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    void apply(net.bytebuddy.jar.asm.FieldVisitor r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3);
}
