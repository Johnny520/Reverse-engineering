package net.bytebuddy.description.annotation;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationSource {

    public enum Empty extends java.lang.Enum<net.bytebuddy.description.annotation.AnnotationSource.Empty> implements net.bytebuddy.description.annotation.AnnotationSource {
        private static final /* synthetic */ net.bytebuddy.description.annotation.AnnotationSource.Empty[] $VALUES = null;
        public static final net.bytebuddy.description.annotation.AnnotationSource.Empty INSTANCE = null;

        static {
                net.bytebuddy.description.annotation.AnnotationSource$Empty r0 = new net.bytebuddy.description.annotation.AnnotationSource$Empty
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.description.annotation.AnnotationSource.Empty.INSTANCE = r0
                net.bytebuddy.description.annotation.AnnotationSource$Empty[] r0 = new net.bytebuddy.description.annotation.AnnotationSource.Empty[]{r0}
                net.bytebuddy.description.annotation.AnnotationSource.Empty.$VALUES = r0
                return
        }

        Empty(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.description.annotation.AnnotationSource.Empty valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.description.annotation.AnnotationSource$Empty> r0 = net.bytebuddy.description.annotation.AnnotationSource.Empty.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.description.annotation.AnnotationSource$Empty r1 = (net.bytebuddy.description.annotation.AnnotationSource.Empty) r1
                return r1
        }

        public static net.bytebuddy.description.annotation.AnnotationSource.Empty[] values() {
                net.bytebuddy.description.annotation.AnnotationSource$Empty[] r0 = net.bytebuddy.description.annotation.AnnotationSource.Empty.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.description.annotation.AnnotationSource$Empty[] r0 = (net.bytebuddy.description.annotation.AnnotationSource.Empty[]) r0
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                r0.<init>()
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements net.bytebuddy.description.annotation.AnnotationSource {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;

        public Explicit(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1) {
                r0 = this;
                r0.<init>()
                r0.annotations = r1
                return
        }

        public Explicit(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
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
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r4.annotations
                net.bytebuddy.description.annotation.AnnotationSource$Explicit r5 = (net.bytebuddy.description.annotation.AnnotationSource.Explicit) r5
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r5.annotations
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                r0.<init>(r1)
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations();
}
