package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class RenamingPlugin extends net.bytebuddy.asm.AsmVisitorWrapper.AbstractBase implements net.bytebuddy.build.Plugin {
    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> matcher;
    private final net.bytebuddy.build.RenamingPlugin.Renaming renaming;

    public interface Renaming {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements net.bytebuddy.build.RenamingPlugin.Renaming {
            private final java.util.List<net.bytebuddy.build.RenamingPlugin.Renaming> renamings;

            public Compound(java.util.List<? extends net.bytebuddy.build.RenamingPlugin.Renaming> r3) {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    r2.renamings = r0
                    java.util.Iterator r3 = r3.iterator()
                L12:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L36
                    java.lang.Object r0 = r3.next()
                    net.bytebuddy.build.RenamingPlugin$Renaming r0 = (net.bytebuddy.build.RenamingPlugin.Renaming) r0
                    boolean r1 = r0 instanceof net.bytebuddy.build.RenamingPlugin.Renaming.Compound
                    if (r1 == 0) goto L2c
                    java.util.List<net.bytebuddy.build.RenamingPlugin$Renaming> r1 = r2.renamings
                    net.bytebuddy.build.RenamingPlugin$Renaming$Compound r0 = (net.bytebuddy.build.RenamingPlugin.Renaming.Compound) r0
                    java.util.List<net.bytebuddy.build.RenamingPlugin$Renaming> r0 = r0.renamings
                    r1.addAll(r0)
                    goto L12
                L2c:
                    boolean r1 = r0 instanceof net.bytebuddy.build.RenamingPlugin.Renaming.NoOp
                    if (r1 != 0) goto L12
                    java.util.List<net.bytebuddy.build.RenamingPlugin$Renaming> r1 = r2.renamings
                    r1.add(r0)
                    goto L12
                L36:
                    return
            }

            public Compound(net.bytebuddy.build.RenamingPlugin.Renaming... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
                    return
            }

            @Override // net.bytebuddy.build.RenamingPlugin.Renaming
            public java.lang.String apply(java.lang.String r3) {
                    r2 = this;
                    java.util.List<net.bytebuddy.build.RenamingPlugin$Renaming> r0 = r2.renamings
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L17
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.build.RenamingPlugin$Renaming r1 = (net.bytebuddy.build.RenamingPlugin.Renaming) r1
                    java.lang.String r3 = r1.apply(r3)
                    goto L6
                L17:
                    return r3
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
                    java.util.List<net.bytebuddy.build.RenamingPlugin$Renaming> r2 = r4.renamings
                    net.bytebuddy.build.RenamingPlugin$Renaming$Compound r5 = (net.bytebuddy.build.RenamingPlugin.Renaming.Compound) r5
                    java.util.List<net.bytebuddy.build.RenamingPlugin$Renaming> r5 = r5.renamings
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
                    java.util.List<net.bytebuddy.build.RenamingPlugin$Renaming> r1 = r2.renamings
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForPattern implements net.bytebuddy.build.RenamingPlugin.Renaming {
            private final java.util.regex.Pattern pattern;
            private final java.lang.String replacement;

            public ForPattern(java.util.regex.Pattern r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.pattern = r1
                    r0.replacement = r2
                    return
            }

            @Override // net.bytebuddy.build.RenamingPlugin.Renaming
            public java.lang.String apply(java.lang.String r3) {
                    r2 = this;
                    java.util.regex.Pattern r0 = r2.pattern
                    java.util.regex.Matcher r0 = r0.matcher(r3)
                    boolean r1 = r0.find()
                    if (r1 == 0) goto L24
                    java.lang.StringBuffer r1 = new java.lang.StringBuffer
                    r1.<init>()
                L11:
                    java.lang.String r3 = r2.replacement
                    r0.appendReplacement(r1, r3)
                    boolean r3 = r0.find()
                    if (r3 != 0) goto L11
                    java.lang.StringBuffer r3 = r0.appendTail(r1)
                    java.lang.String r3 = r3.toString()
                L24:
                    return r3
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
                    java.lang.String r2 = r4.replacement
                    net.bytebuddy.build.RenamingPlugin$Renaming$ForPattern r5 = (net.bytebuddy.build.RenamingPlugin.Renaming.ForPattern) r5
                    java.lang.String r3 = r5.replacement
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.regex.Pattern r2 = r4.pattern
                    java.util.regex.Pattern r5 = r5.pattern
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
                    java.util.regex.Pattern r1 = r2.pattern
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.replacement
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public enum NoOp extends java.lang.Enum<net.bytebuddy.build.RenamingPlugin.Renaming.NoOp> implements net.bytebuddy.build.RenamingPlugin.Renaming {
            private static final /* synthetic */ net.bytebuddy.build.RenamingPlugin.Renaming.NoOp[] $VALUES = null;
            public static final net.bytebuddy.build.RenamingPlugin.Renaming.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.build.RenamingPlugin$Renaming$NoOp r0 = new net.bytebuddy.build.RenamingPlugin$Renaming$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.build.RenamingPlugin.Renaming.NoOp.INSTANCE = r0
                    net.bytebuddy.build.RenamingPlugin$Renaming$NoOp[] r0 = new net.bytebuddy.build.RenamingPlugin.Renaming.NoOp[]{r0}
                    net.bytebuddy.build.RenamingPlugin.Renaming.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.build.RenamingPlugin.Renaming.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.build.RenamingPlugin$Renaming$NoOp> r0 = net.bytebuddy.build.RenamingPlugin.Renaming.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.build.RenamingPlugin$Renaming$NoOp r1 = (net.bytebuddy.build.RenamingPlugin.Renaming.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.build.RenamingPlugin.Renaming.NoOp[] values() {
                    net.bytebuddy.build.RenamingPlugin$Renaming$NoOp[] r0 = net.bytebuddy.build.RenamingPlugin.Renaming.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.build.RenamingPlugin$Renaming$NoOp[] r0 = (net.bytebuddy.build.RenamingPlugin.Renaming.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.build.RenamingPlugin.Renaming
            public java.lang.String apply(java.lang.String r1) {
                    r0 = this;
                    return r1
            }
        }

        java.lang.String apply(java.lang.String r1);
    }

    public static class RenamingRemapper extends net.bytebuddy.jar.asm.commons.Remapper {
        private final java.util.Map<java.lang.String, java.lang.String> cache;
        private final net.bytebuddy.build.RenamingPlugin.Renaming renaming;

        public RenamingRemapper(net.bytebuddy.build.RenamingPlugin.Renaming r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.cache = r0
                r1.renaming = r2
                return
        }

        @Override // net.bytebuddy.jar.asm.commons.Remapper
        public java.lang.String map(java.lang.String r5) {
                r4 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r4.cache
                java.lang.Object r0 = r0.get(r5)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                net.bytebuddy.build.RenamingPlugin$Renaming r0 = r4.renaming
                r1 = 47
                r2 = 46
                java.lang.String r3 = r5.replace(r1, r2)
                java.lang.String r0 = r0.apply(r3)
                java.lang.String r0 = r0.replace(r2, r1)
                java.util.Map<java.lang.String, java.lang.String> r1 = r4.cache
                r1.put(r5, r0)
                return r0
        }
    }

    public RenamingPlugin(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            net.bytebuddy.build.RenamingPlugin$Renaming$ForPattern r0 = new net.bytebuddy.build.RenamingPlugin$Renaming$ForPattern
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r0.<init>(r2, r3)
            r1.<init>(r0)
            return
    }

    public RenamingPlugin(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.build.RenamingPlugin$Renaming$ForPattern r0 = new net.bytebuddy.build.RenamingPlugin$Renaming$ForPattern
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r0.<init>(r2, r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.nameStartsWith(r4)
            r1.<init>(r0, r2)
            return
    }

    public RenamingPlugin(net.bytebuddy.build.RenamingPlugin.Renaming r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
            r1.<init>(r2, r0)
            return
    }

    public RenamingPlugin(net.bytebuddy.build.RenamingPlugin.Renaming r1, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2) {
            r0 = this;
            r0.<init>()
            r0.renaming = r1
            r0.matcher = r2
            return
    }

    @Override // net.bytebuddy.build.Plugin
    public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.ClassFileLocator r3) {
            r0 = this;
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r1.visit(r0)
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
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
            net.bytebuddy.build.RenamingPlugin$Renaming r2 = r4.renaming
            net.bytebuddy.build.RenamingPlugin r5 = (net.bytebuddy.build.RenamingPlugin) r5
            net.bytebuddy.build.RenamingPlugin$Renaming r3 = r5.renaming
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2 = r4.matcher
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r5 = r5.matcher
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
            net.bytebuddy.build.RenamingPlugin$Renaming r1 = r2.renaming
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1 = r2.matcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public /* bridge */ /* synthetic */ boolean matches(net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            boolean r1 = r0.matches2(r1)
            return r1
    }

    /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
    public boolean matches2(net.bytebuddy.description.type.TypeDescription r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0 = r1.matcher
            boolean r2 = r0.matches(r2)
            return r2
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, net.bytebuddy.description.method.MethodList<?> r6, int r7, int r8) {
            r0 = this;
            net.bytebuddy.jar.asm.commons.ClassRemapper r1 = new net.bytebuddy.jar.asm.commons.ClassRemapper
            net.bytebuddy.build.RenamingPlugin$RenamingRemapper r3 = new net.bytebuddy.build.RenamingPlugin$RenamingRemapper
            net.bytebuddy.build.RenamingPlugin$Renaming r4 = r0.renaming
            r3.<init>(r4)
            r1.<init>(r2, r3)
            return r1
    }
}
