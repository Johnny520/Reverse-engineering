package net.bytebuddy.dynamic.loading;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;
import p352.C9620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface PackageDefinitionStrategy {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Definition {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static class Simple implements Definition {

            @MaybeNull
            private final String implementationTitle;

            @MaybeNull
            private final String implementationVendor;

            @MaybeNull
            private final String implementationVersion;

            @MaybeNull
            protected final URL sealBase;

            @MaybeNull
            private final String specificationTitle;

            @MaybeNull
            private final String specificationVendor;

            @MaybeNull
            private final String specificationVersion;

            public Simple(@MaybeNull String str, @MaybeNull String str2, @MaybeNull String str3, @MaybeNull String str4, @MaybeNull String str5, @MaybeNull String str6, @MaybeNull URL url) {
                this.specificationTitle = str;
                this.specificationVersion = str2;
                this.specificationVendor = str3;
                this.implementationTitle = str4;
                this.implementationVersion = str5;
                this.implementationVendor = str6;
                this.sealBase = url;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    Simple simple = (Simple) obj;
                    String str = this.specificationTitle;
                    String str2 = simple.specificationTitle;
                    if (str == null ? str2 == null : str.equals(str2)) {
                        String str3 = this.specificationVersion;
                        String str4 = simple.specificationVersion;
                        if (str3 == null ? str4 == null : str3.equals(str4)) {
                            String str5 = this.specificationVendor;
                            String str6 = simple.specificationVendor;
                            if (str5 == null ? str6 == null : str5.equals(str6)) {
                                String str7 = this.implementationTitle;
                                String str8 = simple.implementationTitle;
                                if (str7 == null ? str8 == null : str7.equals(str8)) {
                                    String str9 = this.implementationVersion;
                                    String str10 = simple.implementationVersion;
                                    if (str9 == null ? str10 == null : str9.equals(str10)) {
                                        String str11 = this.implementationVendor;
                                        String str12 = simple.implementationVendor;
                                        if (str11 == null ? str12 == null : str11.equals(str12)) {
                                            URL url = this.sealBase;
                                            URL url2 = simple.sealBase;
                                            if (url == null ? url2 == null : url.equals(url2)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getImplementationTitle() {
                return this.implementationTitle;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getImplementationVendor() {
                return this.implementationVendor;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getImplementationVersion() {
                return this.implementationVersion;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public URL getSealBase() {
                return this.sealBase;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getSpecificationTitle() {
                return this.specificationTitle;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getSpecificationVendor() {
                return this.specificationVendor;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getSpecificationVersion() {
                return this.specificationVersion;
            }

            public int hashCode() {
                String str = this.specificationTitle;
                int iHashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.specificationVersion;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.specificationVendor;
                int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.implementationTitle;
                int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String str5 = this.implementationVersion;
                int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
                String str6 = this.implementationVendor;
                int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
                URL url = this.sealBase;
                return iHashCode6 + (url != null ? url.hashCode() : 0);
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(Package r1) {
                URL url = this.sealBase;
                return url == null ? !r1.isSealed() : r1.isSealed(url);
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Trivial implements Definition {
            INSTANCE;


            @AlwaysNull
            private static final String NO_VALUE = null;

            @AlwaysNull
            private static final URL NOT_SEALED = null;

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getImplementationTitle() {
                return NO_VALUE;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVendor() {
                return NO_VALUE;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getImplementationVersion() {
                return NO_VALUE;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public URL getSealBase() {
                return NOT_SEALED;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getSpecificationTitle() {
                return NO_VALUE;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getSpecificationVendor() {
                return NO_VALUE;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @MaybeNull
            public String getSpecificationVersion() {
                return NO_VALUE;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(Package r1) {
                return true;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Undefined implements Definition {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationTitle() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVendor() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVersion() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public URL getSealBase() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationTitle() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVendor() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVersion() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(Package r1) {
                throw new IllegalStateException("Cannot check compatibility to undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                return false;
            }
        }

        @MaybeNull
        String getImplementationTitle();

        @MaybeNull
        String getImplementationVendor();

        @MaybeNull
        String getImplementationVersion();

        @MaybeNull
        URL getSealBase();

        @MaybeNull
        String getSpecificationTitle();

        @MaybeNull
        String getSpecificationVendor();

        @MaybeNull
        String getSpecificationVersion();

        boolean isCompatibleTo(Package r1);

        boolean isDefined();
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum NoOp implements PackageDefinitionStrategy {
        INSTANCE;

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public Definition define(ClassLoader classLoader, String str, String str2) {
            return Definition.Undefined.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Trivial implements PackageDefinitionStrategy {
        INSTANCE;

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public Definition define(ClassLoader classLoader, String str, String str2) {
            return Definition.Trivial.INSTANCE;
        }
    }

    Definition define(ClassLoader classLoader, String str, String str2);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class ManifestReading implements PackageDefinitionStrategy {
        private static final Attributes.Name[] ATTRIBUTE_NAMES = {Attributes.Name.SPECIFICATION_TITLE, Attributes.Name.SPECIFICATION_VERSION, Attributes.Name.SPECIFICATION_VENDOR, Attributes.Name.IMPLEMENTATION_TITLE, Attributes.Name.IMPLEMENTATION_VERSION, Attributes.Name.IMPLEMENTATION_VENDOR, Attributes.Name.SEALED};

        @AlwaysNull
        private static final URL NOT_SEALED = null;
        private final SealBaseLocator sealBaseLocator;

        public ManifestReading() {
            this(new SealBaseLocator.ForTypeResourceUrl());
        }

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public Definition define(ClassLoader classLoader, String str, String str2) {
            InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/MANIFEST.MF");
            try {
                if (resourceAsStream == null) {
                    return Definition.Trivial.INSTANCE;
                }
                try {
                    Manifest manifest = new Manifest(resourceAsStream);
                    HashMap map = new HashMap();
                    Attributes mainAttributes = manifest.getMainAttributes();
                    if (mainAttributes != null) {
                        for (Attributes.Name name : ATTRIBUTE_NAMES) {
                            map.put(name, mainAttributes.getValue(name));
                        }
                    }
                    Attributes attributes = manifest.getAttributes(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/').concat("/"));
                    if (attributes != null) {
                        for (Attributes.Name name2 : ATTRIBUTE_NAMES) {
                            String value = attributes.getValue(name2);
                            if (value != null) {
                                map.put(name2, value);
                            }
                        }
                    }
                    Definition.Simple simple = new Definition.Simple((String) map.get(Attributes.Name.SPECIFICATION_TITLE), (String) map.get(Attributes.Name.SPECIFICATION_VERSION), (String) map.get(Attributes.Name.SPECIFICATION_VENDOR), (String) map.get(Attributes.Name.IMPLEMENTATION_TITLE), (String) map.get(Attributes.Name.IMPLEMENTATION_VERSION), (String) map.get(Attributes.Name.IMPLEMENTATION_VENDOR), Boolean.parseBoolean((String) map.get(Attributes.Name.SEALED)) ? this.sealBaseLocator.findSealBase(classLoader, str2) : NOT_SEALED);
                    resourceAsStream.close();
                    return simple;
                } catch (Throwable th) {
                    resourceAsStream.close();
                    throw th;
                }
            } catch (IOException e) {
                C9620.m15032("Error while reading manifest file", e);
                return null;
            }
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.sealBaseLocator.equals(((ManifestReading) obj).sealBaseLocator);
        }

        public int hashCode() {
            return this.sealBaseLocator.hashCode() + (getClass().hashCode() * 31);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface SealBaseLocator {

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class ForFixedValue implements SealBaseLocator {

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final URL sealBase;

                public ForFixedValue(@MaybeNull URL url) {
                    this.sealBase = url;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    URL url = this.sealBase;
                    URL url2 = ((ForFixedValue) obj).sealBase;
                    return url == null ? url2 == null : url.equals(url2);
                }

                @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                @MaybeNull
                public URL findSealBase(ClassLoader classLoader, String str) {
                    return this.sealBase;
                }

                public int hashCode() {
                    URL url = this.sealBase;
                    if (url == null) {
                        return 17;
                    }
                    return url.hashCode();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum NonSealing implements SealBaseLocator {
                INSTANCE;

                @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                @MaybeNull
                public URL findSealBase(ClassLoader classLoader, String str) {
                    return ManifestReading.NOT_SEALED;
                }
            }

            @MaybeNull
            URL findSealBase(ClassLoader classLoader, String str);

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class ForTypeResourceUrl implements SealBaseLocator {
                private static final String CLASS_FILE_EXTENSION = ".class";
                private static final int EXCLUDE_INITIAL_SLASH = 1;
                private static final String FILE_SYSTEM = "file";
                private static final String JAR_FILE = "jar";
                private static final String RUNTIME_IMAGE = "jrt";
                private final SealBaseLocator fallback;

                public ForTypeResourceUrl() {
                    this(NonSealing.INSTANCE);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fallback.equals(((ForTypeResourceUrl) obj).fallback);
                }

                @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                @MaybeNull
                public URL findSealBase(ClassLoader classLoader, String str) {
                    URL resource = classLoader.getResource(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ".class");
                    if (resource != null) {
                        try {
                            if (resource.getProtocol().equals(JAR_FILE)) {
                                return URI.create(resource.getPath().substring(0, resource.getPath().indexOf(33))).toURL();
                            }
                            if (!resource.getProtocol().equals(FILE_SYSTEM)) {
                                if (resource.getProtocol().equals(RUNTIME_IMAGE)) {
                                    String path = resource.getPath();
                                    int iIndexOf = path.indexOf(47, 1);
                                    if (iIndexOf != -1) {
                                        return URI.create("jrt:".concat(path.substring(0, iIndexOf))).toURL();
                                    }
                                }
                            }
                            return resource;
                        } catch (MalformedURLException e) {
                            C6385.m11434("Unexpected URL: ", resource, e);
                            return null;
                        }
                    }
                    return this.fallback.findSealBase(classLoader, str);
                }

                public int hashCode() {
                    return this.fallback.hashCode() + (getClass().hashCode() * 31);
                }

                public ForTypeResourceUrl(SealBaseLocator sealBaseLocator) {
                    this.fallback = sealBaseLocator;
                }
            }
        }

        public ManifestReading(SealBaseLocator sealBaseLocator) {
            this.sealBaseLocator = sealBaseLocator;
        }
    }
}
