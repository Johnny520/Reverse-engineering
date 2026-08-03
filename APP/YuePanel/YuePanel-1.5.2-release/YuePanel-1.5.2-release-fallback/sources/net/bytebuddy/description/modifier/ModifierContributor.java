package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public interface ModifierContributor {
    public static final int EMPTY_MASK = 0;

    public interface ForField extends net.bytebuddy.description.modifier.ModifierContributor {
        public static final int MASK = 151775;
    }

    public interface ForMethod extends net.bytebuddy.description.modifier.ModifierContributor {
        public static final int MASK = 7679;
    }

    public interface ForParameter extends net.bytebuddy.description.modifier.ModifierContributor {
        public static final int MASK = 36880;
    }

    public interface ForType extends net.bytebuddy.description.modifier.ModifierContributor {
        public static final int MASK = 161311;
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Resolver<T extends net.bytebuddy.description.modifier.ModifierContributor> {
        private final java.util.Collection<? extends T> modifierContributors;

        public Resolver(java.util.Collection<? extends T> r1) {
                r0 = this;
                r0.<init>()
                r0.modifierContributors = r1
                return
        }

        public static <S extends net.bytebuddy.description.modifier.ModifierContributor> net.bytebuddy.description.modifier.ModifierContributor.Resolver<S> of(java.util.Collection<? extends S> r1) {
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r0 = new net.bytebuddy.description.modifier.ModifierContributor$Resolver
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForField> of(net.bytebuddy.description.modifier.ModifierContributor.ForField... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForMethod> of(net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForParameter> of(net.bytebuddy.description.modifier.ModifierContributor.ForParameter... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForType> of(net.bytebuddy.description.modifier.ModifierContributor.ForType... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r0 = of(r0)
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
                java.util.Collection<? extends T extends net.bytebuddy.description.modifier.ModifierContributor> r2 = r4.modifierContributors
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r5 = (net.bytebuddy.description.modifier.ModifierContributor.Resolver) r5
                java.util.Collection<? extends T extends net.bytebuddy.description.modifier.ModifierContributor> r5 = r5.modifierContributors
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
                java.util.Collection<? extends T extends net.bytebuddy.description.modifier.ModifierContributor> r1 = r2.modifierContributors
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public int resolve() {
                r1 = this;
                r0 = 0
                int r0 = r1.resolve(r0)
                return r0
        }

        public int resolve(int r4) {
                r3 = this;
                java.util.Collection<? extends T extends net.bytebuddy.description.modifier.ModifierContributor> r0 = r3.modifierContributors
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.modifier.ModifierContributor r1 = (net.bytebuddy.description.modifier.ModifierContributor) r1
                int r2 = r1.getRange()
                int r2 = ~r2
                r4 = r4 & r2
                int r1 = r1.getMask()
                r4 = r4 | r1
                goto L6
            L1e:
                return r4
        }
    }

    int getMask();

    int getRange();

    boolean isDefault();
}
