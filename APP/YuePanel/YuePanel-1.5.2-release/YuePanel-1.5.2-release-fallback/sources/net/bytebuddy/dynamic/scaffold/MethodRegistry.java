package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodRegistry {

    public interface Compiled extends net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool {
        net.bytebuddy.description.method.MethodList<?> getInstrumentedMethods();

        net.bytebuddy.description.type.TypeDescription getInstrumentedType();

        net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer();

        net.bytebuddy.description.method.MethodList<?> getMethods();

        net.bytebuddy.dynamic.scaffold.TypeInitializer getTypeInitializer();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Default implements net.bytebuddy.dynamic.scaffold.MethodRegistry {
        private final java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Entry> entries;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Compiled implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled {
            private final java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Compiled.Entry> implementations;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final net.bytebuddy.implementation.LoadedTypeInitializer loadedTypeInitializer;
            private final net.bytebuddy.description.method.MethodList<?> methods;
            private final boolean supportsBridges;
            private final net.bytebuddy.dynamic.scaffold.TypeInitializer typeInitializer;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Entry {
                private final net.bytebuddy.implementation.attribute.MethodAttributeAppender attributeAppender;
                private final boolean bridgeMethod;
                private final java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> bridgeTypes;
                private final net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled handler;
                private final net.bytebuddy.description.method.MethodDescription methodDescription;
                private final net.bytebuddy.description.modifier.Visibility visibility;

                public Entry(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender r2, net.bytebuddy.description.method.MethodDescription r3, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> r4, net.bytebuddy.description.modifier.Visibility r5, boolean r6) {
                        r0 = this;
                        r0.<init>()
                        r0.handler = r1
                        r0.attributeAppender = r2
                        r0.methodDescription = r3
                        r0.bridgeTypes = r4
                        r0.visibility = r5
                        r0.bridgeMethod = r6
                        return
                }

                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record bind(net.bytebuddy.description.type.TypeDescription r5, boolean r6) {
                        r4 = this;
                        boolean r0 = r4.bridgeMethod
                        if (r0 == 0) goto Le
                        if (r6 != 0) goto Le
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForNonImplementedMethod r5 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForNonImplementedMethod
                        net.bytebuddy.description.method.MethodDescription r6 = r4.methodDescription
                        r5.<init>(r6)
                        return r5
                    Le:
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$Compiled r0 = r4.handler
                        net.bytebuddy.description.method.MethodDescription r1 = r4.methodDescription
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.attributeAppender
                        net.bytebuddy.description.modifier.Visibility r3 = r4.visibility
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r0.assemble(r1, r2, r3)
                        if (r6 == 0) goto L26
                        net.bytebuddy.description.method.MethodDescription r6 = r4.methodDescription
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r1 = r4.bridgeTypes
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.attributeAppender
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.AccessBridgeWrapper.of(r0, r5, r6, r1, r2)
                    L26:
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
                        boolean r2 = r4.bridgeMethod
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Compiled.Entry) r5
                        boolean r3 = r5.bridgeMethod
                        if (r2 == r3) goto L1c
                        return r1
                    L1c:
                        net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                        net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$Compiled r2 = r4.handler
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$Compiled r3 = r5.handler
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L32
                        return r1
                    L32:
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r4.attributeAppender
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r3 = r5.attributeAppender
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L3d
                        return r1
                    L3d:
                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                        net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L48
                        return r1
                    L48:
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r2 = r4.bridgeTypes
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r5 = r5.bridgeTypes
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L53
                        return r1
                    L53:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$Compiled r1 = r2.handler
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender r1 = r2.attributeAppender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r1 = r2.bridgeTypes
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        boolean r1 = r2.bridgeMethod
                        int r0 = r0 + r1
                        return r0
                }
            }

            public Compiled(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.LoadedTypeInitializer r2, net.bytebuddy.dynamic.scaffold.TypeInitializer r3, net.bytebuddy.description.method.MethodList<?> r4, java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Compiled.Entry> r5, boolean r6) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.loadedTypeInitializer = r2
                    r0.typeInitializer = r3
                    r0.methods = r4
                    r0.implementations = r5
                    r0.supportsBridges = r6
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
                    boolean r2 = r4.supportsBridges
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Compiled) r5
                    boolean r3 = r5.supportsBridges
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    net.bytebuddy.implementation.LoadedTypeInitializer r2 = r4.loadedTypeInitializer
                    net.bytebuddy.implementation.LoadedTypeInitializer r3 = r5.loadedTypeInitializer
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L32
                    return r1
                L32:
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r2 = r4.typeInitializer
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r3 = r5.typeInitializer
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    return r1
                L3d:
                    net.bytebuddy.description.method.MethodList<?> r2 = r4.methods
                    net.bytebuddy.description.method.MethodList<?> r3 = r5.methods
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L48
                    return r1
                L48:
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry> r2 = r4.implementations
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry> r5 = r5.implementations
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L53
                    return r1
                L53:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public net.bytebuddy.description.method.MethodList<?> getInstrumentedMethods() {
                    r3 = this;
                    net.bytebuddy.description.method.MethodList$Explicit r0 = new net.bytebuddy.description.method.MethodList$Explicit
                    java.util.ArrayList r1 = new java.util.ArrayList
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry> r2 = r3.implementations
                    java.util.Set r2 = r2.keySet()
                    r1.<init>(r2)
                    r0.<init>(r1)
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isTypeInitializer()
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                    net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public net.bytebuddy.description.type.TypeDescription getInstrumentedType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer() {
                    r1 = this;
                    net.bytebuddy.implementation.LoadedTypeInitializer r0 = r1.loadedTypeInitializer
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public net.bytebuddy.description.method.MethodList<?> getMethods() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodList<?> r0 = r1.methods
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public net.bytebuddy.dynamic.scaffold.TypeInitializer getTypeInitializer() {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r0 = r1.typeInitializer
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
                    net.bytebuddy.implementation.LoadedTypeInitializer r1 = r2.loadedTypeInitializer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r1 = r2.typeInitializer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodList<?> r1 = r2.methods
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry> r1 = r2.implementations
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.supportsBridges
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool
            public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record target(net.bytebuddy.description.method.MethodDescription r3) {
                    r2 = this;
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry> r0 = r2.implementations
                    java.lang.Object r0 = r0.get(r3)
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry r0 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Compiled.Entry) r0
                    if (r0 != 0) goto L10
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForNonImplementedMethod r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForNonImplementedMethod
                    r0.<init>(r3)
                    goto L18
                L10:
                    net.bytebuddy.description.type.TypeDescription r3 = r2.instrumentedType
                    boolean r1 = r2.supportsBridges
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r0.bind(r3, r1)
                L18:
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Entry implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.method.MethodDescription> {
            private final net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory attributeAppenderFactory;
            private final net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler handler;
            private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
            private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> transformer;

            public Entry(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r4) {
                    r0 = this;
                    r0.<init>()
                    r0.matcher = r1
                    r0.handler = r2
                    r0.attributeAppenderFactory = r3
                    r0.transformer = r4
                    return
            }

            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry asPreparedEntry(net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.description.method.MethodDescription r10, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> r11, net.bytebuddy.description.modifier.Visibility r12) {
                    r8 = this;
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r1 = r8.handler
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = r8.attributeAppenderFactory
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r0 = r8.transformer
                    java.lang.Object r9 = r0.transform(r9, r10)
                    r3 = r9
                    net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                    r6 = 0
                    r0 = r7
                    r4 = r11
                    r5 = r12
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }

            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry asPreparedEntry(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.modifier.Visibility r4) {
                    r1 = this;
                    java.util.Set r0 = java.util.Collections.emptySet()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r2 = r1.asPreparedEntry(r2, r3, r0, r4)
                    return r2
            }

            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry asSupplementaryEntry(net.bytebuddy.description.method.MethodDescription r9) {
                    r8 = this;
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r1 = r8.handler
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.of(r9)
                    java.util.Set r4 = java.util.Collections.emptySet()
                    net.bytebuddy.description.modifier.Visibility r5 = r9.getVisibility()
                    r6 = 0
                    r0 = r7
                    r3 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
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
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Entry) r5
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.matcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r2 = r4.handler
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r3 = r5.handler
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = r4.attributeAppenderFactory
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r3 = r5.attributeAppenderFactory
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r2 = r4.transformer
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r5 = r5.transformer
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L41
                    return r1
                L41:
                    return r0
            }

            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler getHandler() {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r0 = r1.handler
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r1 = r2.handler
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r2.attributeAppenderFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r1 = r2.transformer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.matcher.LatentMatcher
            public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> resolve(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.matcher
                    net.bytebuddy.matcher.ElementMatcher r2 = r0.resolve(r2)
                    return r2
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Prepared implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared {
            private final java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry> implementations;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final net.bytebuddy.implementation.LoadedTypeInitializer loadedTypeInitializer;
            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Linked methodGraph;
            private final net.bytebuddy.description.method.MethodList<?> methods;
            private final net.bytebuddy.dynamic.scaffold.TypeInitializer typeInitializer;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Entry {
                private final net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory attributeAppenderFactory;
                private final boolean bridgeMethod;
                private final net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler handler;
                private final net.bytebuddy.description.method.MethodDescription methodDescription;
                private final java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> typeTokens;
                private final net.bytebuddy.description.modifier.Visibility visibility;

                public Entry(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2, net.bytebuddy.description.method.MethodDescription r3, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> r4, net.bytebuddy.description.modifier.Visibility r5, boolean r6) {
                        r0 = this;
                        r0.<init>()
                        r0.handler = r1
                        r0.attributeAppenderFactory = r2
                        r0.methodDescription = r3
                        r0.typeTokens = r4
                        r0.visibility = r5
                        r0.bridgeMethod = r6
                        return
                }

                public static net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry forVisibilityBridge(net.bytebuddy.description.method.MethodDescription r8, net.bytebuddy.description.modifier.Visibility r9) {
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge r1 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge.INSTANCE
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.of(r8)
                        java.util.Set r4 = java.util.Collections.emptySet()
                        r6 = 1
                        r0 = r7
                        r3 = r8
                        r5 = r9
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                        return r7
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
                        boolean r2 = r4.bridgeMethod
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r5
                        boolean r3 = r5.bridgeMethod
                        if (r2 == r3) goto L1c
                        return r1
                    L1c:
                        net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                        net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r2 = r4.handler
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r3 = r5.handler
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L32
                        return r1
                    L32:
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = r4.attributeAppenderFactory
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r3 = r5.attributeAppenderFactory
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L3d
                        return r1
                    L3d:
                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                        net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L48
                        return r1
                    L48:
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r2 = r4.typeTokens
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r5 = r5.typeTokens
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L53
                        return r1
                    L53:
                        return r0
                }

                public net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory getAppenderFactory() {
                        r1 = this;
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r0 = r1.attributeAppenderFactory
                        return r0
                }

                public net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler getHandler() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r0 = r1.handler
                        return r0
                }

                public net.bytebuddy.description.method.MethodDescription getMethodDescription() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        return r0
                }

                public net.bytebuddy.description.modifier.Visibility getVisibility() {
                        r1 = this;
                        net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r1 = r2.handler
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r2.attributeAppenderFactory
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r1 = r2.typeTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        boolean r1 = r2.bridgeMethod
                        int r0 = r0 + r1
                        return r0
                }

                public boolean isBridgeMethod() {
                        r1 = this;
                        boolean r0 = r1.bridgeMethod
                        return r0
                }

                public java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> resolveBridgeTypes() {
                        r2 = this;
                        java.util.HashSet r0 = new java.util.HashSet
                        java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r1 = r2.typeTokens
                        r0.<init>(r1)
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        net.bytebuddy.description.method.MethodDescription$TypeToken r1 = r1.asTypeToken()
                        r0.remove(r1)
                        return r0
                }
            }

            public Prepared(java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry> r1, net.bytebuddy.implementation.LoadedTypeInitializer r2, net.bytebuddy.dynamic.scaffold.TypeInitializer r3, net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r5, net.bytebuddy.description.method.MethodList<?> r6) {
                    r0 = this;
                    r0.<init>()
                    r0.implementations = r1
                    r0.loadedTypeInitializer = r2
                    r0.typeInitializer = r3
                    r0.instrumentedType = r4
                    r0.methodGraph = r5
                    r0.methods = r6
                    return
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled compile(net.bytebuddy.implementation.Implementation.Target.Factory r18, net.bytebuddy.ClassFileVersion r19) {
                    r17 = this;
                    r0 = r17
                    r1 = r19
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.util.HashMap r3 = new java.util.HashMap
                    r3.<init>()
                    java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
                    r9.<init>()
                    net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r5 = r0.methodGraph
                    r6 = r18
                    net.bytebuddy.implementation.Implementation$Target r4 = r6.make(r4, r5, r1)
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry> r5 = r0.implementations
                    java.util.Set r5 = r5.entrySet()
                    java.util.Iterator r5 = r5.iterator()
                L27:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto Lc8
                    java.lang.Object r6 = r5.next()
                    java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                    java.lang.Object r7 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r7
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r7 = r7.getHandler()
                    java.lang.Object r7 = r2.get(r7)
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$Compiled r7 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled) r7
                    if (r7 != 0) goto L60
                    java.lang.Object r7 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r7
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r7 = r7.getHandler()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$Compiled r7 = r7.compile(r4)
                    java.lang.Object r8 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r8 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r8
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r8 = r8.getHandler()
                    r2.put(r8, r7)
                L60:
                    r11 = r7
                    java.lang.Object r7 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r7
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r7 = r7.getAppenderFactory()
                    java.lang.Object r7 = r3.get(r7)
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender r7 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender) r7
                    if (r7 != 0) goto L90
                    java.lang.Object r7 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r7
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r7 = r7.getAppenderFactory()
                    net.bytebuddy.description.type.TypeDescription r8 = r0.instrumentedType
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender r7 = r7.make(r8)
                    java.lang.Object r8 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r8 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r8
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r8 = r8.getAppenderFactory()
                    r3.put(r8, r7)
                L90:
                    r12 = r7
                    java.lang.Object r7 = r6.getKey()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry r8 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry
                    java.lang.Object r10 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r10 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r10
                    net.bytebuddy.description.method.MethodDescription r13 = r10.getMethodDescription()
                    java.lang.Object r10 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r10 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r10
                    java.util.Set r14 = r10.resolveBridgeTypes()
                    java.lang.Object r10 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r10 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r10
                    net.bytebuddy.description.modifier.Visibility r15 = r10.getVisibility()
                    java.lang.Object r6 = r6.getValue()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r6 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry) r6
                    boolean r16 = r6.isBridgeMethod()
                    r10 = r8
                    r10.<init>(r11, r12, r13, r14, r15, r16)
                    r9.put(r7, r8)
                    goto L27
                Lc8:
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled r2 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled
                    net.bytebuddy.description.type.TypeDescription r5 = r0.instrumentedType
                    net.bytebuddy.implementation.LoadedTypeInitializer r6 = r0.loadedTypeInitializer
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r7 = r0.typeInitializer
                    net.bytebuddy.description.method.MethodList<?> r8 = r0.methods
                    net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V5
                    boolean r10 = r1.isAtLeast(r3)
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    return r2
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
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry> r2 = r4.implementations
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared) r5
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry> r3 = r5.implementations
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.LoadedTypeInitializer r2 = r4.loadedTypeInitializer
                    net.bytebuddy.implementation.LoadedTypeInitializer r3 = r5.loadedTypeInitializer
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r2 = r4.typeInitializer
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r3 = r5.typeInitializer
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L41
                    return r1
                L41:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r2 = r4.methodGraph
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r3 = r5.methodGraph
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L4c
                    return r1
                L4c:
                    net.bytebuddy.description.method.MethodList<?> r2 = r4.methods
                    net.bytebuddy.description.method.MethodList<?> r5 = r5.methods
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L57
                    return r1
                L57:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public net.bytebuddy.description.method.MethodList<?> getInstrumentedMethods() {
                    r3 = this;
                    net.bytebuddy.description.method.MethodList$Explicit r0 = new net.bytebuddy.description.method.MethodList$Explicit
                    java.util.ArrayList r1 = new java.util.ArrayList
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry> r2 = r3.implementations
                    java.util.Set r2 = r2.keySet()
                    r1.<init>(r2)
                    r0.<init>(r1)
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isTypeInitializer()
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                    net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public net.bytebuddy.description.type.TypeDescription getInstrumentedType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer() {
                    r1 = this;
                    net.bytebuddy.implementation.LoadedTypeInitializer r0 = r1.loadedTypeInitializer
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public net.bytebuddy.description.method.MethodList<?> getMethods() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodList<?> r0 = r1.methods
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public net.bytebuddy.dynamic.scaffold.TypeInitializer getTypeInitializer() {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r0 = r1.typeInitializer
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription, net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry> r1 = r2.implementations
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.LoadedTypeInitializer r1 = r2.loadedTypeInitializer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r1 = r2.typeInitializer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r2.methodGraph
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodList<?> r1 = r2.methods
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public Default() {
                r1 = this;
                r1.<init>()
                java.util.List r0 = java.util.Collections.emptyList()
                r1.entries = r0
                return
        }

        private Default(java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Entry> r1) {
                r0 = this;
                r0.<init>()
                r0.entries = r1
                return
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry
        public net.bytebuddy.dynamic.scaffold.MethodRegistry append(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r4, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r5, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r6, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r7) {
                r3 = this;
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r1 = r3.entries
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry r2 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry
                r2.<init>(r4, r5, r6, r7)
                java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                r0.<init>(r4)
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
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r2 = r4.entries
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default) r5
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r5 = r5.entries
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
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r1 = r2.entries
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry
        public net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r11, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r12, net.bytebuddy.dynamic.scaffold.TypeValidation r13, net.bytebuddy.dynamic.VisibilityBridgeStrategy r14, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r15) {
                r10 = this;
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.HashSet r2 = new java.util.HashSet
                net.bytebuddy.description.method.MethodList r3 = r11.getDeclaredMethods()
                r2.<init>(r3)
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r3 = r10.entries
                java.util.Iterator r3 = r3.iterator()
            L19:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L60
                java.lang.Object r4 = r3.next()
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry r4 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Entry) r4
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r5 = r4.getHandler()
                boolean r5 = r0.add(r5)
                if (r5 == 0) goto L19
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r5 = r4.getHandler()
                net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.prepare(r11)
                if (r11 == r5) goto L19
                net.bytebuddy.description.method.MethodList r11 = r5.getDeclaredMethods()
                java.util.Iterator r11 = r11.iterator()
            L41:
                boolean r6 = r11.hasNext()
                if (r6 == 0) goto L5e
                java.lang.Object r6 = r11.next()
                net.bytebuddy.description.method.MethodDescription r6 = (net.bytebuddy.description.method.MethodDescription) r6
                boolean r7 = r2.contains(r6)
                if (r7 != 0) goto L41
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r7 = r4.asSupplementaryEntry(r6)
                r1.put(r6, r7)
                r2.add(r6)
                goto L41
            L5e:
                r11 = r5
                goto L19
            L60:
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r5 = r12.compile(r11)
                java.util.Set r12 = r1.keySet()
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.anyOf(r12)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.not(r12)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r11)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.returns(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = r12.and(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r11)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.not(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.hasType(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.whereNone(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.hasParameters(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = r12.and(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.failSafe(r12)
                net.bytebuddy.matcher.ElementMatcher r15 = r15.resolve(r11)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = r12.and(r15)
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r0 = r5.listNodes()
                java.util.Iterator r0 = r0.iterator()
            Lad:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L13e
                java.lang.Object r2 = r0.next()
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node) r2
                net.bytebuddy.description.method.MethodDescription r3 = r2.getRepresentative()
                boolean r4 = r11.isPublic()
                r6 = 0
                if (r4 == 0) goto Lcc
                boolean r4 = r11.isInterface()
                if (r4 != 0) goto Lcc
                r4 = 1
                goto Lcd
            Lcc:
                r4 = r6
            Lcd:
                boolean r7 = r12.matches(r3)
                if (r7 == 0) goto Lff
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r7 = r10.entries
                java.util.Iterator r7 = r7.iterator()
            Ld9:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto Lff
                java.lang.Object r8 = r7.next()
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry r8 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Entry) r8
                net.bytebuddy.matcher.ElementMatcher r9 = r8.resolve(r11)
                boolean r9 = r9.matches(r3)
                if (r9 == 0) goto Ld9
                java.util.Set r4 = r2.getMethodTypes()
                net.bytebuddy.description.modifier.Visibility r7 = r2.getVisibility()
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r4 = r8.asPreparedEntry(r11, r3, r4, r7)
                r1.put(r3, r4)
                goto L100
            Lff:
                r6 = r4
            L100:
                if (r6 == 0) goto L139
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r4 = r2.getSort()
                boolean r4 = r4.isMadeVisible()
                if (r4 != 0) goto L139
                boolean r4 = r3.isPublic()
                if (r4 == 0) goto L139
                boolean r4 = r3.isAbstract()
                if (r4 != 0) goto L139
                boolean r4 = r3.isFinal()
                if (r4 != 0) goto L139
                net.bytebuddy.description.type.TypeDefinition r4 = r3.getDeclaringType()
                boolean r4 = r4.isPackagePrivate()
                if (r4 == 0) goto L139
                boolean r4 = r14.generateVisibilityBridge(r3)
                if (r4 == 0) goto L139
                net.bytebuddy.description.modifier.Visibility r2 = r2.getVisibility()
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r2 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Prepared.Entry.forVisibilityBridge(r3, r2)
                r1.put(r3, r2)
            L139:
                r15.add(r3)
                goto Lad
            L13e:
                net.bytebuddy.description.method.MethodList r14 = r11.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.not(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = r0.and(r12)
                net.bytebuddy.matcher.FilterableList r12 = r14.filter(r12)
                net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r14 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
                r14.<init>(r11)
                java.util.List r12 = net.bytebuddy.utility.CompoundList.of(r12, r14)
                java.util.Iterator r12 = r12.iterator()
            L15f:
                boolean r14 = r12.hasNext()
                if (r14 == 0) goto L196
                java.lang.Object r14 = r12.next()
                net.bytebuddy.description.method.MethodDescription r14 = (net.bytebuddy.description.method.MethodDescription) r14
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r0 = r10.entries
                java.util.Iterator r0 = r0.iterator()
            L171:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L192
                java.lang.Object r2 = r0.next()
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry r2 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Default.Entry) r2
                net.bytebuddy.matcher.ElementMatcher r3 = r2.resolve(r11)
                boolean r3 = r3.matches(r14)
                if (r3 == 0) goto L171
                net.bytebuddy.description.modifier.Visibility r0 = r14.getVisibility()
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared$Entry r0 = r2.asPreparedEntry(r11, r14, r0)
                r1.put(r14, r0)
            L192:
                r15.add(r14)
                goto L15f
            L196:
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared r12 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared
                net.bytebuddy.implementation.LoadedTypeInitializer r2 = r11.getLoadedTypeInitializer()
                net.bytebuddy.dynamic.scaffold.TypeInitializer r3 = r11.getTypeInitializer()
                boolean r13 = r13.isEnabled()
                if (r13 == 0) goto L1aa
                net.bytebuddy.description.type.TypeDescription r11 = r11.validated()
            L1aa:
                r4 = r11
                net.bytebuddy.description.method.MethodList$Explicit r6 = new net.bytebuddy.description.method.MethodList$Explicit
                r6.<init>(r15)
                r0 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r12
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry
        public net.bytebuddy.dynamic.scaffold.MethodRegistry prepend(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r4, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r5, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r6) {
                r2 = this;
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry r1 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry
                r1.<init>(r3, r4, r5, r6)
                java.util.List<net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry> r3 = r2.entries
                java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r1, r3)
                r0.<init>(r3)
                return r0
        }
    }

    public interface Handler extends net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable {

        public interface Compiled {
            net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record assemble(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender r2, net.bytebuddy.description.modifier.Visibility r3);
        }

        public enum ForAbstractMethod extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod> implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod[] r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod[]{r0}
                    net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod.$VALUES = r0
                    return
            }

            ForAbstractMethod(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod> r0 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod r1 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod[] values() {
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod[] r0 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod[] r0 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
            public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record assemble(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender r3, net.bytebuddy.description.modifier.Visibility r4) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithoutBody r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithoutBody
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled compile(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForAnnotationValue implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled {
            private final net.bytebuddy.description.annotation.AnnotationValue<?, ?> annotationValue;

            public ForAnnotationValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.annotationValue = r1
                    return
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
            public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record assemble(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender r3, net.bytebuddy.description.modifier.Visibility r4) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithAnnotationDefaultValue r4 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithAnnotationDefaultValue
                    net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = r1.annotationValue
                    r4.<init>(r2, r0, r3)
                    return r4
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled compile(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
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
                    net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r4.annotationValue
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAnnotationValue r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAnnotationValue) r5
                    net.bytebuddy.description.annotation.AnnotationValue<?, ?> r5 = r5.annotationValue
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
                    net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1 = r2.annotationValue
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForImplementation implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler {
            private final net.bytebuddy.implementation.Implementation implementation;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Compiled implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled {
                private final net.bytebuddy.implementation.bytecode.ByteCodeAppender byteCodeAppender;

                public Compiled(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1) {
                        r0 = this;
                        r0.<init>()
                        r0.byteCodeAppender = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record assemble(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.attribute.MethodAttributeAppender r4, net.bytebuddy.description.modifier.Visibility r5) {
                        r2 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$ForDefinedMethod$WithBody
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = r2.byteCodeAppender
                        r0.<init>(r3, r1, r4, r5)
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
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = r4.byteCodeAppender
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation$Compiled r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForImplementation.Compiled) r5
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender r5 = r5.byteCodeAppender
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
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = r2.byteCodeAppender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public ForImplementation(net.bytebuddy.implementation.Implementation r1) {
                    r0 = this;
                    r0.<init>()
                    r0.implementation = r1
                    return
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled compile(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation$Compiled r1 = r0.compile(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForImplementation.Compiled compile(net.bytebuddy.implementation.Implementation.Target r3) {
                    r2 = this;
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation$Compiled r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation$Compiled
                    net.bytebuddy.implementation.Implementation r1 = r2.implementation
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender r3 = r1.appender(r3)
                    r0.<init>(r3)
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
                    net.bytebuddy.implementation.Implementation r2 = r4.implementation
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForImplementation) r5
                    net.bytebuddy.implementation.Implementation r5 = r5.implementation
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
                    net.bytebuddy.implementation.Implementation r1 = r2.implementation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
                    r1 = this;
                    net.bytebuddy.implementation.Implementation r0 = r1.implementation
                    net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
                    return r2
            }
        }

        public enum ForVisibilityBridge extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge> implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge INSTANCE = null;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Compiled implements net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled {
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                public Compiled(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.instrumentedType = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record assemble(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender r2, net.bytebuddy.description.modifier.Visibility r3) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.OfVisibilityBridge.of(r3, r1, r2)
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                        net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge$Compiled r5 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge.Compiled) r5
                        net.bytebuddy.description.type.TypeDescription r5 = r5.instrumentedType
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            static {
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge[] r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge[]{r0}
                    net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge.$VALUES = r0
                    return
            }

            ForVisibilityBridge(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge> r0 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge r1 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge[] values() {
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge[] r0 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge[] r0 = (net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled compile(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge$Compiled r1 = r0.compile(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForVisibilityBridge.Compiled compile(net.bytebuddy.implementation.Implementation.Target r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge$Compiled r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForVisibilityBridge$Compiled
                    net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                    r0.<init>(r2)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
                    r1 = this;
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "A visibility bridge handler must not apply any preparations"
                    r2.<init>(r0)
                    throw r2
            }
        }

        net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled compile(net.bytebuddy.implementation.Implementation.Target r1);
    }

    public interface Prepared {
        net.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled compile(net.bytebuddy.implementation.Implementation.Target.Factory r1, net.bytebuddy.ClassFileVersion r2);

        net.bytebuddy.description.method.MethodList<?> getInstrumentedMethods();

        net.bytebuddy.description.type.TypeDescription getInstrumentedType();

        net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer();

        net.bytebuddy.description.method.MethodList<?> getMethods();

        net.bytebuddy.dynamic.scaffold.TypeInitializer getTypeInitializer();
    }

    net.bytebuddy.dynamic.scaffold.MethodRegistry append(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r4);

    net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2, net.bytebuddy.dynamic.scaffold.TypeValidation r3, net.bytebuddy.dynamic.VisibilityBridgeStrategy r4, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r5);

    net.bytebuddy.dynamic.scaffold.MethodRegistry prepend(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r4);
}
