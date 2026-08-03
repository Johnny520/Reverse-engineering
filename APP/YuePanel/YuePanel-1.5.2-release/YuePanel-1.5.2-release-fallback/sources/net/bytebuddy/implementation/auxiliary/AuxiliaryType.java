package net.bytebuddy.implementation.auxiliary;

/* JADX INFO: loaded from: classes2.dex */
public interface AuxiliaryType {

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"MS_MUTABLE_ARRAY", "MS_OOI_PKGPROTECT"})
    public static final net.bytebuddy.description.modifier.ModifierContributor.ForType[] DEFAULT_TYPE_MODIFIER = null;

    public interface NamingStrategy {

        public static class Enumerating implements net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy {
            private final java.lang.String suffix;

            public Enumerating(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.suffix = r1
                    return
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy
            public java.lang.String name(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.implementation.auxiliary.AuxiliaryType r4) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r3 = r3.getName()
                    r0.append(r3)
                    java.lang.String r3 = "$"
                    r0.append(r3)
                    java.lang.String r1 = r2.suffix
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = net.bytebuddy.utility.RandomString.hashOf(r4)
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    return r3
            }
        }

        public static class Suffixing implements net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy {
            private final java.lang.String suffix;

            public Suffixing(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.suffix = r1
                    return
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy
            public java.lang.String name(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.implementation.auxiliary.AuxiliaryType r4) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r3 = r3.getName()
                    r0.append(r3)
                    java.lang.String r3 = "$"
                    r0.append(r3)
                    java.lang.String r1 = r2.suffix
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = r4.getSuffix()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    return r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class SuffixingRandom implements net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
            private final net.bytebuddy.utility.RandomString randomString;
            private final java.lang.String suffix;

            public SuffixingRandom(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.suffix = r1
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
                    java.lang.String r2 = r4.suffix
                    net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$SuffixingRandom r5 = (net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy.SuffixingRandom) r5
                    java.lang.String r5 = r5.suffix
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
                    java.lang.String r1 = r2.suffix
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy
            public java.lang.String name(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.auxiliary.AuxiliaryType r3) {
                    r1 = this;
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r2 = r2.getName()
                    r3.append(r2)
                    java.lang.String r2 = "$"
                    r3.append(r2)
                    java.lang.String r0 = r1.suffix
                    r3.append(r0)
                    r3.append(r2)
                    net.bytebuddy.utility.RandomString r2 = r1.randomString
                    java.lang.String r2 = r2.nextString()
                    r3.append(r2)
                    java.lang.String r2 = r3.toString()
                    return r2
            }
        }

        java.lang.String name(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.auxiliary.AuxiliaryType r2);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface SignatureRelevant {
    }

    static {
            r0 = 1
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r0 = new net.bytebuddy.description.modifier.ModifierContributor.ForType[r0]
            net.bytebuddy.description.modifier.SyntheticState r1 = net.bytebuddy.description.modifier.SyntheticState.SYNTHETIC
            r2 = 0
            r0[r2] = r1
            net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER = r0
            return
    }

    java.lang.String getSuffix();

    net.bytebuddy.dynamic.DynamicType make(java.lang.String r1, net.bytebuddy.ClassFileVersion r2, net.bytebuddy.implementation.MethodAccessorFactory r3);
}
