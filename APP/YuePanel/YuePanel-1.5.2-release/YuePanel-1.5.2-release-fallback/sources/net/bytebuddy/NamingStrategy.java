package net.bytebuddy;

/* JADX INFO: loaded from: classes2.dex */
public interface NamingStrategy {
    public static final java.lang.String BYTE_BUDDY_RENAME_PACKAGE = "net.bytebuddy.renamed";
    public static final java.lang.String NO_PREFIX = "";

    public static abstract class AbstractBase implements net.bytebuddy.NamingStrategy {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.lang.String name(net.bytebuddy.description.type.TypeDescription r1);

        @Override // net.bytebuddy.NamingStrategy
        public java.lang.String rebase(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                java.lang.String r1 = r1.getName()
                return r1
        }

        @Override // net.bytebuddy.NamingStrategy
        public java.lang.String redefine(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                java.lang.String r1 = r1.getName()
                return r1
        }

        @Override // net.bytebuddy.NamingStrategy
        public java.lang.String subclass(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r0.name(r1)
                return r1
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class PrefixingRandom extends net.bytebuddy.NamingStrategy.AbstractBase {
        private final java.lang.String prefix;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
        private final net.bytebuddy.utility.RandomString randomString;

        public PrefixingRandom(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.prefix = r1
                net.bytebuddy.utility.RandomString r1 = new net.bytebuddy.utility.RandomString
                r1.<init>()
                r0.randomString = r1
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
                java.lang.String r2 = r4.prefix
                net.bytebuddy.NamingStrategy$PrefixingRandom r5 = (net.bytebuddy.NamingStrategy.PrefixingRandom) r5
                java.lang.String r5 = r5.prefix
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
                java.lang.String r1 = r2.prefix
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.NamingStrategy.AbstractBase
        public java.lang.String name(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.prefix
                r0.append(r1)
                java.lang.String r1 = "."
                r0.append(r1)
                java.lang.String r3 = r3.getName()
                r0.append(r3)
                java.lang.String r3 = "$"
                r0.append(r3)
                net.bytebuddy.utility.RandomString r3 = r2.randomString
                java.lang.String r3 = r3.nextString()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Suffixing extends net.bytebuddy.NamingStrategy.AbstractBase {
        private static final java.lang.String JAVA_PACKAGE = "java.";
        private final net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver baseNameResolver;
        private final java.lang.String javaLangPackagePrefix;
        private final java.lang.String suffix;

        public interface BaseNameResolver {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForFixedValue implements net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver {
                private final java.lang.String name;

                public ForFixedValue(java.lang.String r1) {
                        r0 = this;
                        r0.<init>()
                        r0.name = r1
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
                        java.lang.String r2 = r4.name
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForFixedValue r5 = (net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForFixedValue) r5
                        java.lang.String r5 = r5.name
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
                        java.lang.String r1 = r2.name
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        java.lang.String r1 = r0.name
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForGivenType implements net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForGivenType(net.bytebuddy.description.type.TypeDescription r1) {
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
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForGivenType r5 = (net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType) r5
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

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.typeDescription
                        java.lang.String r1 = r1.getName()
                        return r1
                }
            }

            public enum ForUnnamedType extends java.lang.Enum<net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType> implements net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver {
                private static final /* synthetic */ net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType[] $VALUES = null;
                public static final net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType INSTANCE = null;

                static {
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r0 = new net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE = r0
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType[] r0 = new net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType[]{r0}
                        net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.$VALUES = r0
                        return
                }

                ForUnnamedType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType> r0 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r1 = (net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType) r1
                        return r1
                }

                public static net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType[] values() {
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType[] r0 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType[] r0 = (net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        java.lang.String r1 = r1.getName()
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class WithCallerSuffix implements net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver {
                private final net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver delegate;

                public WithCallerSuffix(net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver r1) {
                        r0 = this;
                        r0.<init>()
                        r0.delegate = r1
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
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r2 = r4.delegate
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix r5 = (net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.WithCallerSuffix) r5
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r5 = r5.delegate
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
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r1 = r2.delegate
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r9) {
                        r8 = this;
                        java.lang.Throwable r0 = new java.lang.Throwable
                        r0.<init>()
                        java.lang.StackTraceElement[] r0 = r0.getStackTrace()
                        int r1 = r0.length
                        r2 = 0
                        r3 = r2
                    Lc:
                        java.lang.Class<net.bytebuddy.ByteBuddy> r4 = net.bytebuddy.ByteBuddy.class
                        if (r2 >= r1) goto L44
                        r5 = r0[r2]
                        java.lang.String r6 = r5.getClassName()
                        java.lang.String r7 = r4.getName()
                        boolean r6 = r6.equals(r7)
                        if (r6 == 0) goto L22
                        r3 = 1
                        goto L41
                    L22:
                        if (r3 == 0) goto L41
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = r5.getClassName()
                        r0.append(r1)
                        java.lang.String r1 = "."
                        r0.append(r1)
                        java.lang.String r1 = r5.getMethodName()
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        goto L45
                    L41:
                        int r2 = r2 + 1
                        goto Lc
                    L44:
                        r0 = 0
                    L45:
                        if (r0 == 0) goto L6a
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r2 = r8.delegate
                        java.lang.String r9 = r2.resolve(r9)
                        r1.append(r9)
                        java.lang.String r9 = "$"
                        r1.append(r9)
                        r9 = 46
                        r2 = 36
                        java.lang.String r9 = r0.replace(r9, r2)
                        r1.append(r9)
                        java.lang.String r9 = r1.toString()
                        return r9
                    L6a:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Base name resolver not invoked via "
                        r0.append(r1)
                        r0.append(r4)
                        java.lang.String r0 = r0.toString()
                        r9.<init>(r0)
                        throw r9
                }
            }

            java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r1);
        }

        public Suffixing(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r0 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
                r1.<init>(r2, r0)
                return
        }

        public Suffixing(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r0 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
                r1.<init>(r2, r0, r3)
                return
        }

        public Suffixing(java.lang.String r2, net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver r3) {
                r1 = this;
                java.lang.String r0 = "net.bytebuddy.renamed"
                r1.<init>(r2, r3, r0)
                return
        }

        public Suffixing(java.lang.String r1, net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.suffix = r1
                r0.baseNameResolver = r2
                r0.javaLangPackagePrefix = r3
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
                java.lang.String r2 = r4.suffix
                net.bytebuddy.NamingStrategy$Suffixing r5 = (net.bytebuddy.NamingStrategy.Suffixing) r5
                java.lang.String r3 = r5.suffix
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.String r2 = r4.javaLangPackagePrefix
                java.lang.String r3 = r5.javaLangPackagePrefix
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r2 = r4.baseNameResolver
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r5 = r5.baseNameResolver
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
                java.lang.String r1 = r2.suffix
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.javaLangPackagePrefix
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r1 = r2.baseNameResolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.NamingStrategy.AbstractBase
        public java.lang.String name(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver r0 = r2.baseNameResolver
                java.lang.String r3 = r0.resolve(r3)
                java.lang.String r0 = "java."
                boolean r0 = r3.startsWith(r0)
                if (r0 == 0) goto L2e
                java.lang.String r0 = r2.javaLangPackagePrefix
                java.lang.String r1 = ""
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.javaLangPackagePrefix
                r0.append(r1)
                java.lang.String r1 = "."
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
            L2e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "$"
                r0.append(r3)
                java.lang.String r3 = r2.suffix
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class SuffixingRandom extends net.bytebuddy.NamingStrategy.Suffixing {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
        private final net.bytebuddy.utility.RandomString randomString;

        @java.lang.Deprecated
        public interface BaseNameResolver extends net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            @java.lang.Deprecated
            public static class ForFixedValue extends net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForFixedValue implements net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver {
                public ForFixedValue(java.lang.String r1) {
                        r0 = this;
                        r0.<init>(r1)
                        return
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForFixedValue
                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                        r3 = this;
                        boolean r0 = super.equals(r4)
                        r1 = 0
                        if (r0 != 0) goto L8
                        return r1
                    L8:
                        r0 = 1
                        if (r3 != r4) goto Lc
                        return r0
                    Lc:
                        if (r4 != 0) goto Lf
                        return r1
                    Lf:
                        java.lang.Class r2 = r3.getClass()
                        java.lang.Class r4 = r4.getClass()
                        if (r2 == r4) goto L1a
                        return r1
                    L1a:
                        return r0
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForFixedValue
                public int hashCode() {
                        r1 = this;
                        int r0 = super.hashCode()
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            @java.lang.Deprecated
            public static class ForGivenType extends net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType implements net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver {
                public ForGivenType(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>(r1)
                        return
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType
                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                        r3 = this;
                        boolean r0 = super.equals(r4)
                        r1 = 0
                        if (r0 != 0) goto L8
                        return r1
                    L8:
                        r0 = 1
                        if (r3 != r4) goto Lc
                        return r0
                    Lc:
                        if (r4 != 0) goto Lf
                        return r1
                    Lf:
                        java.lang.Class r2 = r3.getClass()
                        java.lang.Class r4 = r4.getClass()
                        if (r2 == r4) goto L1a
                        return r1
                    L1a:
                        return r0
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType
                public int hashCode() {
                        r1 = this;
                        int r0 = super.hashCode()
                        return r0
                }
            }

            @java.lang.Deprecated
            public enum ForUnnamedType extends java.lang.Enum<net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType> implements net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver {
                private static final /* synthetic */ net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType[] $VALUES = null;
                public static final net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType INSTANCE = null;

                static {
                        net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForUnnamedType r0 = new net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForUnnamedType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType.INSTANCE = r0
                        net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForUnnamedType[] r0 = new net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType[]{r0}
                        net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType.$VALUES = r0
                        return
                }

                ForUnnamedType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForUnnamedType> r0 = net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForUnnamedType r1 = (net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType) r1
                        return r1
                }

                public static net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType[] values() {
                        net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForUnnamedType[] r0 = net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForUnnamedType[] r0 = (net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForUnnamedType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        java.lang.String r1 = r1.getName()
                        return r1
                }
            }
        }

        public SuffixingRandom(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r0 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
                r1.<init>(r2, r0)
                return
        }

        public SuffixingRandom(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r0 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
                r1.<init>(r2, r0, r3)
                return
        }

        public SuffixingRandom(java.lang.String r2, net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver r3) {
                r1 = this;
                java.lang.String r0 = "net.bytebuddy.renamed"
                r1.<init>(r2, r3, r0)
                return
        }

        public SuffixingRandom(java.lang.String r2, net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver r3, java.lang.String r4) {
                r1 = this;
                net.bytebuddy.utility.RandomString r0 = new net.bytebuddy.utility.RandomString
                r0.<init>()
                r1.<init>(r2, r3, r4, r0)
                return
        }

        public SuffixingRandom(java.lang.String r1, net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver r2, java.lang.String r3, net.bytebuddy.utility.RandomString r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.randomString = r4
                return
        }

        @java.lang.Deprecated
        public SuffixingRandom(java.lang.String r1, net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @java.lang.Deprecated
        public SuffixingRandom(java.lang.String r1, net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        public SuffixingRandom(java.lang.String r1, net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver r2, java.lang.String r3, net.bytebuddy.utility.RandomString r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // net.bytebuddy.NamingStrategy.Suffixing
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = super.equals(r4)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r3 != r4) goto Lc
                return r0
            Lc:
                if (r4 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L1a
                return r1
            L1a:
                return r0
        }

        @Override // net.bytebuddy.NamingStrategy.Suffixing
        public int hashCode() {
                r1 = this;
                int r0 = super.hashCode()
                return r0
        }

        @Override // net.bytebuddy.NamingStrategy.Suffixing, net.bytebuddy.NamingStrategy.AbstractBase
        public java.lang.String name(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = super.name(r2)
                r0.append(r2)
                java.lang.String r2 = "$"
                r0.append(r2)
                net.bytebuddy.utility.RandomString r2 = r1.randomString
                java.lang.String r2 = r2.nextString()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    java.lang.String rebase(net.bytebuddy.description.type.TypeDescription r1);

    java.lang.String redefine(net.bytebuddy.description.type.TypeDescription r1);

    java.lang.String subclass(net.bytebuddy.description.type.TypeDescription.Generic r1);
}
