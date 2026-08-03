package net.bytebuddy.description.type;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageDescription extends net.bytebuddy.description.NamedElement.WithRuntimeName, net.bytebuddy.description.annotation.AnnotationSource {
    public static final net.bytebuddy.description.type.PackageDescription DEFAULT = null;
    public static final java.lang.String PACKAGE_CLASS_NAME = "package-info";
    public static final int PACKAGE_MODIFIERS = 5632;

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.description.type.PackageDescription UNDEFINED = null;

    public static abstract class AbstractBase implements net.bytebuddy.description.type.PackageDescription {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.type.PackageDescription
        public boolean contains(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.description.type.PackageDescription r1 = r1.getPackage()
                boolean r1 = r0.equals(r1)
                return r1
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto L19
                boolean r0 = r2 instanceof net.bytebuddy.description.type.PackageDescription
                if (r0 == 0) goto L17
                java.lang.String r0 = r1.getName()
                net.bytebuddy.description.type.PackageDescription r2 = (net.bytebuddy.description.type.PackageDescription) r2
                java.lang.String r2 = r2.getName()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L17
                goto L19
            L17:
                r2 = 0
                goto L1a
            L19:
                r2 = 1
            L1a:
                return r2
        }

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r1 = this;
                java.lang.String r0 = r1.getName()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r3 = this;
                java.lang.String r0 = r3.getName()
                r1 = 46
                r2 = 47
                java.lang.String r0 = r0.replace(r1, r2)
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.getName()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.description.type.PackageDescription
        public boolean isDefault() {
                r2 = this;
                java.lang.String r0 = r2.getName()
                java.lang.String r1 = ""
                boolean r0 = r0.equals(r1)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "package "
                r0.append(r1)
                java.lang.String r1 = r2.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForLoadedPackage extends net.bytebuddy.description.type.PackageDescription.AbstractBase {
        private final java.lang.Package aPackage;

        public ForLoadedPackage(java.lang.Package r1) {
                r0 = this;
                r0.<init>()
                r0.aPackage = r1
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                java.lang.Package r1 = r2.aPackage
                java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                java.lang.Package r0 = r1.aPackage
                java.lang.String r0 = r0.getName()
                return r0
        }
    }

    public static class Simple extends net.bytebuddy.description.type.PackageDescription.AbstractBase {
        private final java.lang.String name;

        public Simple(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    static {
            net.bytebuddy.description.type.PackageDescription$Simple r0 = new net.bytebuddy.description.type.PackageDescription$Simple
            java.lang.String r1 = ""
            r0.<init>(r1)
            net.bytebuddy.description.type.PackageDescription.DEFAULT = r0
            r0 = 0
            net.bytebuddy.description.type.PackageDescription.UNDEFINED = r0
            return
    }

    boolean contains(net.bytebuddy.description.type.TypeDescription r1);

    boolean isDefault();
}
