package net.bytebuddy.description.enumeration;

/* JADX INFO: loaded from: classes2.dex */
public interface EnumerationDescription extends net.bytebuddy.description.NamedElement {

    public static abstract class AbstractBase implements net.bytebuddy.description.enumeration.EnumerationDescription {
        private transient /* synthetic */ int hashCode;

        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.enumeration.EnumerationDescription
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.enumeration.EnumerationDescription r5 = (net.bytebuddy.description.enumeration.EnumerationDescription) r5
                net.bytebuddy.description.type.TypeDescription r1 = r4.getEnumerationType()
                net.bytebuddy.description.type.TypeDescription r3 = r5.getEnumerationType()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L29
                java.lang.String r1 = r4.getValue()
                java.lang.String r5 = r5.getValue()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L29
                goto L2a
            L29:
                r0 = r2
            L2a:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r1 = this;
                java.lang.String r0 = r1.getValue()
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L19
            L6:
                java.lang.String r0 = r2.getValue()
                int r0 = r0.hashCode()
                net.bytebuddy.description.type.TypeDescription r1 = r2.getEnumerationType()
                int r1 = r1.hashCode()
                int r1 = r1 * 31
                int r0 = r0 + r1
            L19:
                if (r0 != 0) goto L1e
                int r0 = r2.hashCode
                goto L20
            L1e:
                r2.hashCode = r0
            L20:
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.getValue()
                return r0
        }
    }

    public static class ForLoadedEnumeration extends net.bytebuddy.description.enumeration.EnumerationDescription.AbstractBase {
        private final java.lang.Enum<?> value;

        public ForLoadedEnumeration(java.lang.Enum<?> r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public static java.util.List<net.bytebuddy.description.enumeration.EnumerationDescription> asList(java.lang.Enum<?>[] r5) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r5.length
                r0.<init>(r1)
                int r1 = r5.length
                r2 = 0
            L8:
                if (r2 >= r1) goto L17
                r3 = r5[r2]
                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r4 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                r4.<init>(r3)
                r0.add(r4)
                int r2 = r2 + 1
                goto L8
            L17:
                return r0
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public net.bytebuddy.description.type.TypeDescription getEnumerationType() {
                r1 = this;
                java.lang.Enum<?> r0 = r1.value
                java.lang.Class r0 = r0.getDeclaringClass()
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public java.lang.String getValue() {
                r1 = this;
                java.lang.Enum<?> r0 = r1.value
                java.lang.String r0 = r0.name()
                return r0
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public <T extends java.lang.Enum<T>> T load(java.lang.Class<T> r2) {
                r1 = this;
                java.lang.Enum<?> r0 = r1.value
                java.lang.Class r0 = r0.getDeclaringClass()
                if (r0 != r2) goto Lb
                java.lang.Enum<?> r2 = r1.value
                goto L15
            Lb:
                java.lang.Enum<?> r0 = r1.value
                java.lang.String r0 = r0.name()
                java.lang.Enum r2 = java.lang.Enum.valueOf(r2, r0)
            L15:
                return r2
        }
    }

    public static class Latent extends net.bytebuddy.description.enumeration.EnumerationDescription.AbstractBase {
        private final net.bytebuddy.description.type.TypeDescription enumerationType;
        private final java.lang.String value;

        public Latent(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.enumerationType = r1
                r0.value = r2
                return
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public net.bytebuddy.description.type.TypeDescription getEnumerationType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.enumerationType
                return r0
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public <T extends java.lang.Enum<T>> T load(java.lang.Class<T> r3) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.enumerationType
                boolean r0 = r0.represents(r3)
                if (r0 == 0) goto Lf
                java.lang.String r0 = r2.value
                java.lang.Enum r3 = java.lang.Enum.valueOf(r3, r0)
                return r3
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not represent "
                r1.append(r3)
                net.bytebuddy.description.type.TypeDescription r3 = r2.enumerationType
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }
    }

    net.bytebuddy.description.type.TypeDescription getEnumerationType();

    java.lang.String getValue();

    <T extends java.lang.Enum<T>> T load(java.lang.Class<T> r1);
}
