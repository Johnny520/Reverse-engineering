package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface RecordComponentRegistry {

    public interface Compiled extends net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool {

        public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp> implements net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled$NoOp r0 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled$NoOp[] r0 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp[]{r0}
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled$NoOp> r0 = net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled$NoOp r1 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp[] values() {
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled$NoOp[] r0 = net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled$NoOp[] r0 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool
            public net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record target(net.bytebuddy.description.type.RecordComponentDescription r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForImplicitRecordComponent r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForImplicitRecordComponent
                    r0.<init>(r2)
                    return r0
            }
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Default implements net.bytebuddy.dynamic.scaffold.RecordComponentRegistry {
        private final java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Entry> entries;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Compiled implements net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled {
            private final java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Compiled.Entry> entries;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Entry implements net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.type.RecordComponentDescription> {
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> matcher;
                private final net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender recordComponentAttributeAppender;
                private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> transformer;

                public Entry(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r1, net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r3) {
                        r0 = this;
                        r0.<init>()
                        r0.matcher = r1
                        r0.recordComponentAttributeAppender = r2
                        r0.transformer = r3
                        return
                }

                public net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record bind(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.type.RecordComponentDescription r5) {
                        r3 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForExplicitRecordComponent r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForExplicitRecordComponent
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r1 = r3.recordComponentAttributeAppender
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r2 = r3.transformer
                        java.lang.Object r4 = r2.transform(r4, r5)
                        net.bytebuddy.description.type.RecordComponentDescription r4 = (net.bytebuddy.description.type.RecordComponentDescription) r4
                        r0.<init>(r1, r4)
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2 = r4.matcher
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry r5 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Compiled.Entry) r5
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r3 = r5.matcher
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r2 = r4.recordComponentAttributeAppender
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r3 = r5.recordComponentAttributeAppender
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r2 = r4.transformer
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r5 = r5.transformer
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r1 = r2.matcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r1 = r2.recordComponentAttributeAppender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r1 = r2.transformer
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.matcher.ElementMatcher
                public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.RecordComponentDescription r1) {
                        r0 = this;
                        net.bytebuddy.description.type.RecordComponentDescription r1 = (net.bytebuddy.description.type.RecordComponentDescription) r1
                        boolean r1 = r0.matches2(r1)
                        return r1
                }

                /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
                public boolean matches2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.RecordComponentDescription r2) {
                        r1 = this;
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r0 = r1.matcher
                        boolean r2 = r0.matches(r2)
                        return r2
                }
            }

            public Compiled(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Compiled.Entry> r2) {
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
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled r5 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Compiled) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry> r2 = r4.entries
                    java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry> r5 = r5.entries
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
                    java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry> r1 = r2.entries
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool
            public net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.Record target(net.bytebuddy.description.type.RecordComponentDescription r4) {
                    r3 = this;
                    java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry> r0 = r3.entries
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1f
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry r1 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Compiled.Entry) r1
                    boolean r2 = r1.matches2(r4)
                    if (r2 == 0) goto L6
                    net.bytebuddy.description.type.TypeDescription r0 = r3.instrumentedType
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record r4 = r1.bind(r0, r4)
                    return r4
                L1f:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForImplicitRecordComponent r0 = new net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$Record$ForImplicitRecordComponent
                    r0.<init>(r4)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Entry implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.type.RecordComponentDescription> {
            private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> matcher;
            private final net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory recordComponentAttributeAppender;
            private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> transformer;

            public Entry(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r1, net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.matcher = r1
                    r0.recordComponentAttributeAppender = r2
                    r0.transformer = r3
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
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2 = r4.matcher
                    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry r5 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Entry) r5
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r3 = r5.matcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r2 = r4.recordComponentAttributeAppender
                    net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r3 = r5.recordComponentAttributeAppender
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r2 = r4.transformer
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r5 = r5.transformer
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L36
                    return r1
                L36:
                    return r0
            }

            public net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory getRecordComponentAttributeAppender() {
                    r1 = this;
                    net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r0 = r1.recordComponentAttributeAppender
                    return r0
            }

            public net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> getTransformer() {
                    r1 = this;
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r0 = r1.transformer
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r1 = r2.recordComponentAttributeAppender
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r1 = r2.transformer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.matcher.LatentMatcher
            public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> resolve(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r0 = r1.matcher
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

        private Default(java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Entry> r1) {
                r0 = this;
                r0.<init>()
                r0.entries = r1
                return
        }

        @Override // net.bytebuddy.dynamic.scaffold.RecordComponentRegistry
        public net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled compile(net.bytebuddy.description.type.TypeDescription r8) {
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry> r1 = r7.entries
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry> r2 = r7.entries
                java.util.Iterator r2 = r2.iterator()
            L16:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4e
                java.lang.Object r3 = r2.next()
                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry r3 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default.Entry) r3
                net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r4 = r3.getRecordComponentAttributeAppender()
                java.lang.Object r4 = r1.get(r4)
                net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r4 = (net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender) r4
                if (r4 != 0) goto L3d
                net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r4 = r3.getRecordComponentAttributeAppender()
                net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender r4 = r4.make(r8)
                net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r5 = r3.getRecordComponentAttributeAppender()
                r1.put(r5, r4)
            L3d:
                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry r5 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled$Entry
                net.bytebuddy.matcher.ElementMatcher r6 = r3.resolve(r8)
                net.bytebuddy.dynamic.Transformer r3 = r3.getTransformer()
                r5.<init>(r6, r4, r3)
                r0.add(r5)
                goto L16
            L4e:
                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled r1 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Compiled
                r1.<init>(r8, r0)
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
                java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry> r2 = r4.entries
                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default r5 = (net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Default) r5
                java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry> r5 = r5.entries
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
                java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry> r1 = r2.entries
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.RecordComponentRegistry
        public net.bytebuddy.dynamic.scaffold.RecordComponentRegistry prepend(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r3, net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r4, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r5) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry> r1 = r2.entries
                int r1 = r1.size()
                int r1 = r1 + 1
                r0.<init>(r1)
                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry r1 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry
                r1.<init>(r3, r4, r5)
                r0.add(r1)
                java.util.List<net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default$Entry> r3 = r2.entries
                r0.addAll(r3)
                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default r3 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default
                r3.<init>(r0)
                return r3
        }
    }

    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry.Compiled compile(net.bytebuddy.description.type.TypeDescription r1);

    net.bytebuddy.dynamic.scaffold.RecordComponentRegistry prepend(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r1, net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r3);
}
