package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodNameTransformer {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Prefixing implements net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer {
        private static final java.lang.String DEFAULT_PREFIX = "original";
        private final java.lang.String prefix;

        public Prefixing() {
                r1 = this;
                java.lang.String r0 = "original"
                r1.<init>(r0)
                return
        }

        public Prefixing(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.prefix = r1
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
                net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer$Prefixing r5 = (net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer.Prefixing) r5
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

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer
        public java.lang.String transform(net.bytebuddy.description.method.MethodDescription r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.prefix
                r0.append(r1)
                java.lang.String r3 = r3.getInternalName()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Suffixing implements net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer {
        private static final java.lang.String DEFAULT_SUFFIX = "original$";
        private final java.lang.String suffix;

        public Suffixing(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.suffix = r1
                return
        }

        public static net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer withRandomSuffix() {
                net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer$Suffixing r0 = new net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer$Suffixing
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "original$"
                r1.append(r2)
                java.lang.String r2 = net.bytebuddy.utility.RandomString.make()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
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
                java.lang.String r2 = r4.suffix
                net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer$Suffixing r5 = (net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer.Suffixing) r5
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

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer
        public java.lang.String transform(net.bytebuddy.description.method.MethodDescription r2) {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = r2.getInternalName()
                r0.append(r2)
                java.lang.String r2 = "$"
                r0.append(r2)
                java.lang.String r2 = r1.suffix
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    java.lang.String transform(net.bytebuddy.description.method.MethodDescription r1);
}
