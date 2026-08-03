package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldRegistry {

    public interface Compiled extends net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool {

        public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp> implements net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled$NoOp r0 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled$NoOp[] r0 = new net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp[]{r0}
                    net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled$NoOp> r0 = net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled$NoOp r1 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp[] values() {
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled$NoOp[] r0 = net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled$NoOp[] r0 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record target(net.bytebuddy.description.field.FieldDescription r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForImplicitField r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForImplicitField
                    r0.<init>(r2)
                    return r0
            }
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Default implements net.bytebuddy.dynamic.scaffold.FieldRegistry {
        private final java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Entry> entries;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Compiled implements net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled {
            private final java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Compiled.Entry> entries;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Entry implements net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.field.FieldDescription> {

                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final java.lang.Object defaultValue;
                private final net.bytebuddy.implementation.attribute.FieldAttributeAppender fieldAttributeAppender;
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> matcher;
                private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> transformer;

                public Entry(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1, net.bytebuddy.implementation.attribute.FieldAttributeAppender r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r4) {
                        r0 = this;
                        r0.<init>()
                        r0.matcher = r1
                        r0.fieldAttributeAppender = r2
                        r0.defaultValue = r3
                        r0.transformer = r4
                        return
                }

                public net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record bind(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.field.FieldDescription r6) {
                        r4 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForExplicitField r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForExplicitField
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r1 = r4.fieldAttributeAppender
                        java.lang.Object r2 = r4.defaultValue
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r3 = r4.transformer
                        java.lang.Object r5 = r3.transform(r5, r6)
                        net.bytebuddy.description.field.FieldDescription r5 = (net.bytebuddy.description.field.FieldDescription) r5
                        r0.<init>(r1, r2, r5)
                        return r0
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                        net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry r5 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Compiled.Entry) r5
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r3 = r5.matcher
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r2 = r4.fieldAttributeAppender
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r3 = r5.fieldAttributeAppender
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.lang.Object r2 = r4.defaultValue
                        java.lang.Object r3 = r5.defaultValue
                        if (r3 == 0) goto L3a
                        if (r2 == 0) goto L3c
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L3d
                        return r1
                    L3a:
                        if (r2 == 0) goto L3d
                    L3c:
                        return r1
                    L3d:
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r2 = r4.transformer
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r5 = r5.transformer
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L48
                        return r1
                    L48:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.matcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r1 = r2.fieldAttributeAppender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.Object r1 = r2.defaultValue
                        if (r1 == 0) goto L25
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                    L25:
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r1 = r2.transformer
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.matcher.ElementMatcher
                public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.field.FieldDescription r1) {
                        r0 = this;
                        net.bytebuddy.description.field.FieldDescription r1 = (net.bytebuddy.description.field.FieldDescription) r1
                        boolean r1 = r0.matches2(r1)
                        return r1
                }

                /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
                public boolean matches2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.field.FieldDescription r2) {
                        r1 = this;
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r0 = r1.matcher
                        boolean r2 = r0.matches(r2)
                        return r2
                }
            }

            public Compiled(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Compiled.Entry> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.entries = r2
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled r5 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Compiled) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry> r2 = r4.entries
                    java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry> r5 = r5.entries
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry> r1 = r2.entries
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record target(net.bytebuddy.description.field.FieldDescription r4) {
                    r3 = this;
                    java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry> r0 = r3.entries
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1f
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry r1 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Compiled.Entry) r1
                    boolean r2 = r1.matches2(r4)
                    if (r2 == 0) goto L6
                    net.bytebuddy.description.type.TypeDescription r0 = r3.instrumentedType
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record r4 = r1.bind(r0, r4)
                    return r4
                L1f:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForImplicitField r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Record$ForImplicitField
                    r0.<init>(r4)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Entry implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.field.FieldDescription> {

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final java.lang.Object defaultValue;
            private final net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory fieldAttributeAppenderFactory;
            private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> matcher;
            private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> transformer;

            public Entry(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r1, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r4) {
                    r0 = this;
                    r0.<init>()
                    r0.matcher = r1
                    r0.fieldAttributeAppenderFactory = r2
                    r0.defaultValue = r3
                    r0.transformer = r4
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
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                    net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry r5 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Entry) r5
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r3 = r5.matcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r2 = r4.fieldAttributeAppenderFactory
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r3 = r5.fieldAttributeAppenderFactory
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.lang.Object r2 = r4.defaultValue
                    java.lang.Object r3 = r5.defaultValue
                    if (r3 == 0) goto L3a
                    if (r2 == 0) goto L3c
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    return r1
                L3a:
                    if (r2 == 0) goto L3d
                L3c:
                    return r1
                L3d:
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r2 = r4.transformer
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r5 = r5.transformer
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L48
                    return r1
                L48:
                    return r0
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.Object getDefaultValue() {
                    r1 = this;
                    java.lang.Object r0 = r1.defaultValue
                    return r0
            }

            public net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory getFieldAttributeAppenderFactory() {
                    r1 = this;
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r0 = r1.fieldAttributeAppenderFactory
                    return r0
            }

            public net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> getTransformer() {
                    r1 = this;
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r0 = r1.transformer
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r1 = r2.fieldAttributeAppenderFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.Object r1 = r2.defaultValue
                    if (r1 == 0) goto L25
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                L25:
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r1 = r2.transformer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.matcher.LatentMatcher
            public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> resolve(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r0 = r1.matcher
                    net.bytebuddy.matcher.ElementMatcher r2 = r0.resolve(r2)
                    return r2
            }
        }

        public Default() {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r0)
                return
        }

        private Default(java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Entry> r1) {
                r0 = this;
                r0.<init>()
                r0.entries = r1
                return
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldRegistry
        public net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled compile(net.bytebuddy.description.type.TypeDescription r9) {
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry> r1 = r8.entries
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry> r2 = r8.entries
                java.util.Iterator r2 = r2.iterator()
            L16:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L52
                java.lang.Object r3 = r2.next()
                net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry r3 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Default.Entry) r3
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r4 = r3.getFieldAttributeAppenderFactory()
                java.lang.Object r4 = r1.get(r4)
                net.bytebuddy.implementation.attribute.FieldAttributeAppender r4 = (net.bytebuddy.implementation.attribute.FieldAttributeAppender) r4
                if (r4 != 0) goto L3d
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r4 = r3.getFieldAttributeAppenderFactory()
                net.bytebuddy.implementation.attribute.FieldAttributeAppender r4 = r4.make(r9)
                net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r5 = r3.getFieldAttributeAppenderFactory()
                r1.put(r5, r4)
            L3d:
                net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry r5 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled$Entry
                net.bytebuddy.matcher.ElementMatcher r6 = r3.resolve(r9)
                java.lang.Object r7 = r3.getDefaultValue()
                net.bytebuddy.dynamic.Transformer r3 = r3.getTransformer()
                r5.<init>(r6, r4, r7, r3)
                r0.add(r5)
                goto L16
            L52:
                net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled r1 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled
                r1.<init>(r9, r0)
                return r1
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
                java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry> r2 = r4.entries
                net.bytebuddy.dynamic.scaffold.FieldRegistry$Default r5 = (net.bytebuddy.dynamic.scaffold.FieldRegistry.Default) r5
                java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry> r5 = r5.entries
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
                java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry> r1 = r2.entries
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldRegistry
        public net.bytebuddy.dynamic.scaffold.FieldRegistry prepend(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r3, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r6) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry> r1 = r2.entries
                int r1 = r1.size()
                int r1 = r1 + 1
                r0.<init>(r1)
                net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry r1 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry
                r1.<init>(r3, r4, r5, r6)
                r0.add(r1)
                java.util.List<net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry> r3 = r2.entries
                r0.addAll(r3)
                net.bytebuddy.dynamic.scaffold.FieldRegistry$Default r3 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Default
                r3.<init>(r0)
                return r3
        }
    }

    net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled compile(net.bytebuddy.description.type.TypeDescription r1);

    net.bytebuddy.dynamic.scaffold.FieldRegistry prepend(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r1, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r4);
}
