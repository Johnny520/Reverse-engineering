package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldLocator {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class AbstractBase implements net.bytebuddy.dynamic.scaffold.FieldLocator {
        protected final net.bytebuddy.description.type.TypeDescription accessingType;

        public AbstractBase(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>()
                r0.accessingType = r1
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.accessingType
                net.bytebuddy.dynamic.scaffold.FieldLocator$AbstractBase r5 = (net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase) r5
                net.bytebuddy.description.type.TypeDescription r5 = r5.accessingType
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
                net.bytebuddy.description.type.TypeDescription r1 = r2.accessingType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public abstract net.bytebuddy.description.field.FieldList<?> locate(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1);

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution locate(java.lang.String r3) {
                r2 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.named(r3)
                net.bytebuddy.description.type.TypeDescription r0 = r2.accessingType
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = r3.and(r0)
                net.bytebuddy.description.field.FieldList r3 = r2.locate(r3)
                int r0 = r3.size()
                r1 = 1
                if (r0 != r1) goto L25
                net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Simple r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Simple
                java.lang.Object r3 = r3.getOnly()
                net.bytebuddy.description.field.FieldDescription r3 = (net.bytebuddy.description.field.FieldDescription) r3
                r0.<init>(r3)
                goto L27
            L25:
                net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.INSTANCE
            L27:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution locate(java.lang.String r2, net.bytebuddy.description.type.TypeDescription r3) {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r2)
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.fieldType(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
                net.bytebuddy.description.type.TypeDescription r3 = r1.accessingType
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
                net.bytebuddy.description.field.FieldList r2 = r1.locate(r2)
                int r3 = r2.size()
                r0 = 1
                if (r3 != r0) goto L2d
                net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Simple r3 = new net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Simple
                java.lang.Object r2 = r2.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                r3.<init>(r2)
                goto L2f
            L2d:
                net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r3 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.INSTANCE
            L2f:
                return r3
        }
    }

    public interface Factory {
        net.bytebuddy.dynamic.scaffold.FieldLocator make(net.bytebuddy.description.type.TypeDescription r1);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForClassHierarchy extends net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase {
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public enum Factory extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory> implements net.bytebuddy.dynamic.scaffold.FieldLocator.Factory {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory[] r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory[]{r0}
                    net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.$VALUES = r0
                    return
            }

            Factory(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory> r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r1 = (net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory[] values() {
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory[] r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory[] r0 = (net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public net.bytebuddy.dynamic.scaffold.FieldLocator make(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy
                    r0.<init>(r2)
                    return r0
            }
        }

        public ForClassHierarchy(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>(r1, r1)
                return
        }

        public ForClassHierarchy(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                r0.<init>(r2)
                r0.typeDescription = r1
                return
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy r5 = (net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy) r5
                net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public net.bytebuddy.description.field.FieldList<?> locate(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L23
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.type.TypeDefinition r1 = (net.bytebuddy.description.type.TypeDefinition) r1
                net.bytebuddy.description.field.FieldList r1 = r1.getDeclaredFields()
                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r4)
                net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L6
                return r1
            L23:
                net.bytebuddy.description.field.FieldList$Empty r4 = new net.bytebuddy.description.field.FieldList$Empty
                r4.<init>()
                return r4
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForExactType extends net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase {
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Factory implements net.bytebuddy.dynamic.scaffold.FieldLocator.Factory {
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            public Factory(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType$Factory r5 = (net.bytebuddy.dynamic.scaffold.FieldLocator.ForExactType.Factory) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public net.bytebuddy.dynamic.scaffold.FieldLocator make(net.bytebuddy.description.type.TypeDescription r3) {
                    r2 = this;
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType
                    net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                    r0.<init>(r1, r3)
                    return r0
            }
        }

        public ForExactType(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>(r1, r1)
                return
        }

        public ForExactType(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                r0.<init>(r2)
                r0.typeDescription = r1
                return
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType r5 = (net.bytebuddy.dynamic.scaffold.FieldLocator.ForExactType) r5
                net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public net.bytebuddy.description.field.FieldList<?> locate(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                net.bytebuddy.matcher.FilterableList r2 = r0.filter(r2)
                net.bytebuddy.description.field.FieldList r2 = (net.bytebuddy.description.field.FieldList) r2
                return r2
        }
    }

    public static class ForTopLevelType extends net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase {

        public enum Factory extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory> implements net.bytebuddy.dynamic.scaffold.FieldLocator.Factory {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType$Factory r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType$Factory
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType$Factory[] r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory[]{r0}
                    net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory.$VALUES = r0
                    return
            }

            Factory(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType$Factory> r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType$Factory r1 = (net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory[] values() {
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType$Factory[] r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType$Factory[] r0 = (net.bytebuddy.dynamic.scaffold.FieldLocator.ForTopLevelType.Factory[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public net.bytebuddy.dynamic.scaffold.FieldLocator make(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForTopLevelType
                    r0.<init>(r2)
                    return r0
            }
        }

        public ForTopLevelType(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public net.bytebuddy.description.field.FieldList<?> locate(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.accessingType
                net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                net.bytebuddy.matcher.FilterableList r2 = r0.filter(r2)
                net.bytebuddy.description.field.FieldList r2 = (net.bytebuddy.description.field.FieldList) r2
                return r2
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp> implements net.bytebuddy.dynamic.scaffold.FieldLocator, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp INSTANCE = null;

        static {
                net.bytebuddy.dynamic.scaffold.FieldLocator$NoOp r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp.INSTANCE = r0
                net.bytebuddy.dynamic.scaffold.FieldLocator$NoOp[] r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp[]{r0}
                net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.FieldLocator$NoOp> r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.FieldLocator$NoOp r1 = (net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp[] values() {
                net.bytebuddy.dynamic.scaffold.FieldLocator$NoOp[] r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.FieldLocator$NoOp[] r0 = (net.bytebuddy.dynamic.scaffold.FieldLocator.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution locate(java.lang.String r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r1 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.INSTANCE
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution locate(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r1 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.INSTANCE
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
        public net.bytebuddy.dynamic.scaffold.FieldLocator make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    public interface Resolution {

        public enum Illegal extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal> implements net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal[] r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal[]{r0}
                    net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.$VALUES = r0
                    return
            }

            Illegal(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal> r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r1 = (net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal[] values() {
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal[] r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal[] r0 = (net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public net.bytebuddy.description.field.FieldDescription getField() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Could not locate field"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public boolean isResolved() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution {
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;

            public Simple(net.bytebuddy.description.field.FieldDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution ofBeanAccessor(net.bytebuddy.dynamic.scaffold.FieldLocator r4, net.bytebuddy.description.method.MethodDescription r5) {
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isSetter()
                    boolean r0 = r0.matches(r5)
                    r1 = 3
                    if (r0 == 0) goto L14
                    java.lang.String r5 = r5.getInternalName()
                    java.lang.String r5 = r5.substring(r1)
                    goto L33
                L14:
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isGetter()
                    boolean r0 = r0.matches(r5)
                    if (r0 == 0) goto L7b
                    java.lang.String r0 = r5.getInternalName()
                    java.lang.String r5 = r5.getInternalName()
                    java.lang.String r2 = "is"
                    boolean r5 = r5.startsWith(r2)
                    if (r5 == 0) goto L2f
                    r1 = 2
                L2f:
                    java.lang.String r5 = r0.substring(r1)
                L33:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r1 = 0
                    char r2 = r5.charAt(r1)
                    char r2 = java.lang.Character.toLowerCase(r2)
                    r0.append(r2)
                    r2 = 1
                    java.lang.String r3 = r5.substring(r2)
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r4.locate(r0)
                    boolean r3 = r0.isResolved()
                    if (r3 == 0) goto L5b
                    goto L7a
                L5b:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    char r1 = r5.charAt(r1)
                    char r1 = java.lang.Character.toUpperCase(r1)
                    r0.append(r1)
                    java.lang.String r5 = r5.substring(r2)
                    r0.append(r5)
                    java.lang.String r5 = r0.toString()
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r4.locate(r5)
                L7a:
                    return r0
                L7b:
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Illegal r4 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Illegal.INSTANCE
                    return r4
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
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution$Simple r5 = (net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Simple) r5
                    net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public net.bytebuddy.description.field.FieldDescription getField() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public boolean isResolved() {
                    r1 = this;
                    r0 = 1
                    return r0
            }
        }

        net.bytebuddy.description.field.FieldDescription getField();

        boolean isResolved();
    }

    net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution locate(java.lang.String r1);

    net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution locate(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2);
}
