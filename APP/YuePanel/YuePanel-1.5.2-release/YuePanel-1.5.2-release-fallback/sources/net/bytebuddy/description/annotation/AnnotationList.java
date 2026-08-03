package net.bytebuddy.description.annotation;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationList extends net.bytebuddy.matcher.FilterableList<net.bytebuddy.description.annotation.AnnotationDescription, net.bytebuddy.description.annotation.AnnotationList> {

    public static abstract class AbstractBase extends net.bytebuddy.matcher.FilterableList.AbstractBase<net.bytebuddy.description.annotation.AnnotationDescription, net.bytebuddy.description.annotation.AnnotationList> implements net.bytebuddy.description.annotation.AnnotationList {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public net.bytebuddy.description.type.TypeList asTypeList() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.annotation.AnnotationDescription r2 = (net.bytebuddy.description.annotation.AnnotationDescription) r2
                net.bytebuddy.description.type.TypeDescription r2 = r2.getAnnotationType()
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.type.TypeList$Explicit r1 = new net.bytebuddy.description.type.TypeList$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public java.util.List<java.lang.String> asTypeNames() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.annotation.AnnotationDescription r2 = (net.bytebuddy.description.annotation.AnnotationDescription) r2
                net.bytebuddy.description.type.TypeDescription r2 = r2.getAnnotationType()
                java.lang.String r2 = r2.getName()
                r0.add(r2)
                goto Ld
            L25:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public net.bytebuddy.description.annotation.AnnotationList inherited(java.util.Set<? extends net.bytebuddy.description.type.TypeDescription> r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r4.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.annotation.AnnotationDescription r2 = (net.bytebuddy.description.annotation.AnnotationDescription) r2
                net.bytebuddy.description.type.TypeDescription r3 = r2.getAnnotationType()
                boolean r3 = r5.contains(r3)
                if (r3 != 0) goto Ld
                boolean r3 = r2.isInherited()
                if (r3 == 0) goto Ld
                r0.add(r2)
                goto Ld
            L2d:
                net.bytebuddy.description.annotation.AnnotationList r5 = r4.wrap(r0)
                return r5
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r3) {
                r2 = this;
                java.util.Iterator r0 = r2.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                net.bytebuddy.description.type.TypeDescription r1 = r1.getAnnotationType()
                boolean r1 = r1.represents(r3)
                if (r1 == 0) goto L4
                r3 = 1
                return r3
            L1c:
                r3 = 0
                return r3
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public boolean isAnnotationPresent(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                java.util.Iterator r0 = r2.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                net.bytebuddy.description.type.TypeDescription r1 = r1.getAnnotationType()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L4
                r3 = 1
                return r3
            L1c:
                r3 = 0
                return r3
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        @net.bytebuddy.utility.nullability.MaybeNull
        public <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> ofType(java.lang.Class<T> r4) {
                r3 = this;
                java.util.Iterator r0 = r3.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                net.bytebuddy.description.type.TypeDescription r2 = r1.getAnnotationType()
                boolean r2 = r2.represents(r4)
                if (r2 == 0) goto L4
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r4 = r1.prepare(r4)
                return r4
            L1f:
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable<?> r4 = net.bytebuddy.description.annotation.AnnotationDescription.UNDEFINED
                return r4
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.annotation.AnnotationDescription ofType(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                java.util.Iterator r0 = r3.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                net.bytebuddy.description.type.TypeDescription r2 = r1.getAnnotationType()
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L4
                return r1
            L1b:
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable<?> r4 = net.bytebuddy.description.annotation.AnnotationDescription.UNDEFINED
                return r4
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public net.bytebuddy.description.annotation.AnnotationList visibility(net.bytebuddy.matcher.ElementMatcher<? super java.lang.annotation.RetentionPolicy> r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r4.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.annotation.AnnotationDescription r2 = (net.bytebuddy.description.annotation.AnnotationDescription) r2
                java.lang.annotation.RetentionPolicy r3 = r2.getRetention()
                boolean r3 = r5.matches(r3)
                if (r3 == 0) goto Ld
                r0.add(r2)
                goto Ld
            L27:
                net.bytebuddy.description.annotation.AnnotationList r5 = r4.wrap(r0)
                return r5
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public net.bytebuddy.description.annotation.AnnotationList wrap(java.util.List<net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List<net.bytebuddy.description.annotation.AnnotationDescription> r1) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationList r1 = r0.wrap(r1)
                return r1
        }
    }

    public static class Empty extends net.bytebuddy.matcher.FilterableList.Empty<net.bytebuddy.description.annotation.AnnotationDescription, net.bytebuddy.description.annotation.AnnotationList> implements net.bytebuddy.description.annotation.AnnotationList {
        public Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.util.List<net.bytebuddy.description.annotation.AnnotationList> asList(int r3) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                r1 = 0
            L6:
                if (r1 >= r3) goto L13
                net.bytebuddy.description.annotation.AnnotationList$Empty r2 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                r2.<init>()
                r0.add(r2)
                int r1 = r1 + 1
                goto L6
            L13:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public net.bytebuddy.description.type.TypeList asTypeList() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public java.util.List<java.lang.String> asTypeNames() {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public net.bytebuddy.description.annotation.AnnotationList inherited(java.util.Set<? extends net.bytebuddy.description.type.TypeDescription> r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public boolean isAnnotationPresent(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        @net.bytebuddy.utility.nullability.AlwaysNull
        public <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> ofType(java.lang.Class<T> r1) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable<?> r1 = net.bytebuddy.description.annotation.AnnotationDescription.UNDEFINED
                return r1
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        @net.bytebuddy.utility.nullability.AlwaysNull
        public net.bytebuddy.description.annotation.AnnotationDescription ofType(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable<?> r1 = net.bytebuddy.description.annotation.AnnotationDescription.UNDEFINED
                return r1
        }

        @Override // net.bytebuddy.description.annotation.AnnotationList
        public net.bytebuddy.description.annotation.AnnotationList visibility(net.bytebuddy.matcher.ElementMatcher<? super java.lang.annotation.RetentionPolicy> r1) {
                r0 = this;
                return r0
        }
    }

    public static class Explicit extends net.bytebuddy.description.annotation.AnnotationList.AbstractBase {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotationDescriptions;

        public Explicit(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1) {
                r0 = this;
                r0.<init>()
                r0.annotationDescriptions = r1
                return
        }

        public Explicit(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        public static java.util.List<net.bytebuddy.description.annotation.AnnotationList> asList(java.util.List<? extends java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription>> r3) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r3.next()
                java.util.List r1 = (java.util.List) r1
                net.bytebuddy.description.annotation.AnnotationList$Explicit r2 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                r2.<init>(r1)
                r0.add(r2)
                goto Ld
            L22:
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.annotation.AnnotationDescription get(int r2) {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r0 = r1.annotationDescriptions
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.description.annotation.AnnotationDescription r2 = (net.bytebuddy.description.annotation.AnnotationDescription) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r0 = r1.annotationDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    public static class ForLoadedAnnotations extends net.bytebuddy.description.annotation.AnnotationList.AbstractBase {
        private final java.util.List<? extends java.lang.annotation.Annotation> annotations;

        public ForLoadedAnnotations(java.util.List<? extends java.lang.annotation.Annotation> r1) {
                r0 = this;
                r0.<init>()
                r0.annotations = r1
                return
        }

        public ForLoadedAnnotations(java.lang.annotation.Annotation... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        public static java.util.List<net.bytebuddy.description.annotation.AnnotationList> asList(java.lang.annotation.Annotation[][] r5) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r5.length
                r0.<init>(r1)
                int r1 = r5.length
                r2 = 0
            L8:
                if (r2 >= r1) goto L17
                r3 = r5[r2]
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r4 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                r4.<init>(r3)
                r0.add(r4)
                int r2 = r2 + 1
                goto L8
            L17:
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.annotation.AnnotationDescription get(int r2) {
                r1 = this;
                java.util.List<? extends java.lang.annotation.Annotation> r0 = r1.annotations
                java.lang.Object r2 = r0.get(r2)
                java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r2 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.of(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends java.lang.annotation.Annotation> r0 = r1.annotations
                int r0 = r0.size()
                return r0
        }
    }

    net.bytebuddy.description.type.TypeList asTypeList();

    java.util.List<java.lang.String> asTypeNames();

    net.bytebuddy.description.annotation.AnnotationList inherited(java.util.Set<? extends net.bytebuddy.description.type.TypeDescription> r1);

    boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r1);

    boolean isAnnotationPresent(net.bytebuddy.description.type.TypeDescription r1);

    @net.bytebuddy.utility.nullability.MaybeNull
    <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> ofType(java.lang.Class<T> r1);

    net.bytebuddy.description.annotation.AnnotationDescription ofType(net.bytebuddy.description.type.TypeDescription r1);

    net.bytebuddy.description.annotation.AnnotationList visibility(net.bytebuddy.matcher.ElementMatcher<? super java.lang.annotation.RetentionPolicy> r1);
}
