package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ExtractorFactory {
    private final org.simpleframework.xml.core.Contact contact;
    private final org.simpleframework.xml.stream.Format format;
    private final java.lang.annotation.Annotation label;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class ElementExtractor implements org.simpleframework.xml.core.Extractor<org.simpleframework.xml.Element> {
        private final org.simpleframework.xml.core.Contact contact;
        private final org.simpleframework.xml.stream.Format format;
        private final org.simpleframework.xml.ElementUnion union;

        public ElementExtractor(org.simpleframework.xml.core.Contact r1, org.simpleframework.xml.ElementUnion r2, org.simpleframework.xml.stream.Format r3) {
                r0 = this;
                r0.<init>()
                r0.contact = r1
                r0.format = r3
                r0.union = r2
                return
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.annotation.Annotation[] getAnnotations() {
                r0 = this;
                org.simpleframework.xml.Element[] r0 = r0.getAnnotations()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public org.simpleframework.xml.Element[] getAnnotations() {
                r0 = this;
                org.simpleframework.xml.ElementUnion r0 = r0.union
                org.simpleframework.xml.Element[] r0 = r0.value()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ org.simpleframework.xml.core.Label getLabel(java.lang.annotation.Annotation r1) {
                r0 = this;
                org.simpleframework.xml.Element r1 = (org.simpleframework.xml.Element) r1
                org.simpleframework.xml.core.Label r0 = r0.getLabel(r1)
                return r0
        }

        public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.Element r3) {
                r2 = this;
                org.simpleframework.xml.core.ElementLabel r0 = new org.simpleframework.xml.core.ElementLabel
                org.simpleframework.xml.core.Contact r1 = r2.contact
                org.simpleframework.xml.stream.Format r2 = r2.format
                r0.<init>(r1, r3, r2)
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.Class getType(java.lang.annotation.Annotation r1) {
                r0 = this;
                org.simpleframework.xml.Element r1 = (org.simpleframework.xml.Element) r1
                java.lang.Class r0 = r0.getType(r1)
                return r0
        }

        public java.lang.Class getType(org.simpleframework.xml.Element r2) {
                r1 = this;
                java.lang.Class r2 = r2.type()
                java.lang.Class r0 = java.lang.Void.TYPE
                if (r2 != r0) goto Lf
                org.simpleframework.xml.core.Contact r1 = r1.contact
                java.lang.Class r1 = r1.getType()
                return r1
            Lf:
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class ElementListExtractor implements org.simpleframework.xml.core.Extractor<org.simpleframework.xml.ElementList> {
        private final org.simpleframework.xml.core.Contact contact;
        private final org.simpleframework.xml.stream.Format format;
        private final org.simpleframework.xml.ElementListUnion union;

        public ElementListExtractor(org.simpleframework.xml.core.Contact r1, org.simpleframework.xml.ElementListUnion r2, org.simpleframework.xml.stream.Format r3) {
                r0 = this;
                r0.<init>()
                r0.contact = r1
                r0.format = r3
                r0.union = r2
                return
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.annotation.Annotation[] getAnnotations() {
                r0 = this;
                org.simpleframework.xml.ElementList[] r0 = r0.getAnnotations()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public org.simpleframework.xml.ElementList[] getAnnotations() {
                r0 = this;
                org.simpleframework.xml.ElementListUnion r0 = r0.union
                org.simpleframework.xml.ElementList[] r0 = r0.value()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ org.simpleframework.xml.core.Label getLabel(java.lang.annotation.Annotation r1) {
                r0 = this;
                org.simpleframework.xml.ElementList r1 = (org.simpleframework.xml.ElementList) r1
                org.simpleframework.xml.core.Label r0 = r0.getLabel(r1)
                return r0
        }

        public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.ElementList r3) {
                r2 = this;
                org.simpleframework.xml.core.ElementListLabel r0 = new org.simpleframework.xml.core.ElementListLabel
                org.simpleframework.xml.core.Contact r1 = r2.contact
                org.simpleframework.xml.stream.Format r2 = r2.format
                r0.<init>(r1, r3, r2)
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.Class getType(java.lang.annotation.Annotation r1) {
                r0 = this;
                org.simpleframework.xml.ElementList r1 = (org.simpleframework.xml.ElementList) r1
                java.lang.Class r0 = r0.getType(r1)
                return r0
        }

        public java.lang.Class getType(org.simpleframework.xml.ElementList r1) {
                r0 = this;
                java.lang.Class r0 = r1.type()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class ElementMapExtractor implements org.simpleframework.xml.core.Extractor<org.simpleframework.xml.ElementMap> {
        private final org.simpleframework.xml.core.Contact contact;
        private final org.simpleframework.xml.stream.Format format;
        private final org.simpleframework.xml.ElementMapUnion union;

        public ElementMapExtractor(org.simpleframework.xml.core.Contact r1, org.simpleframework.xml.ElementMapUnion r2, org.simpleframework.xml.stream.Format r3) {
                r0 = this;
                r0.<init>()
                r0.contact = r1
                r0.format = r3
                r0.union = r2
                return
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.annotation.Annotation[] getAnnotations() {
                r0 = this;
                org.simpleframework.xml.ElementMap[] r0 = r0.getAnnotations()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public org.simpleframework.xml.ElementMap[] getAnnotations() {
                r0 = this;
                org.simpleframework.xml.ElementMapUnion r0 = r0.union
                org.simpleframework.xml.ElementMap[] r0 = r0.value()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ org.simpleframework.xml.core.Label getLabel(java.lang.annotation.Annotation r1) {
                r0 = this;
                org.simpleframework.xml.ElementMap r1 = (org.simpleframework.xml.ElementMap) r1
                org.simpleframework.xml.core.Label r0 = r0.getLabel(r1)
                return r0
        }

        public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.ElementMap r3) {
                r2 = this;
                org.simpleframework.xml.core.ElementMapLabel r0 = new org.simpleframework.xml.core.ElementMapLabel
                org.simpleframework.xml.core.Contact r1 = r2.contact
                org.simpleframework.xml.stream.Format r2 = r2.format
                r0.<init>(r1, r3, r2)
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.Class getType(java.lang.annotation.Annotation r1) {
                r0 = this;
                org.simpleframework.xml.ElementMap r1 = (org.simpleframework.xml.ElementMap) r1
                java.lang.Class r0 = r0.getType(r1)
                return r0
        }

        public java.lang.Class getType(org.simpleframework.xml.ElementMap r1) {
                r0 = this;
                java.lang.Class r0 = r1.valueType()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class ExtractorBuilder {
        private final java.lang.Class label;
        private final java.lang.Class type;

        public ExtractorBuilder(java.lang.Class r1, java.lang.Class r2) {
                r0 = this;
                r0.<init>()
                r0.label = r1
                r0.type = r2
                return
        }

        public static /* synthetic */ java.lang.reflect.Constructor access$000(org.simpleframework.xml.core.ExtractorFactory.ExtractorBuilder r0) {
                java.lang.reflect.Constructor r0 = r0.getConstructor()
                return r0
        }

        private java.lang.reflect.Constructor getConstructor() {
                r3 = this;
                java.lang.Class r0 = r3.type
                java.lang.Class r3 = r3.label
                java.lang.Class<org.simpleframework.xml.stream.Format> r1 = org.simpleframework.xml.stream.Format.class
                java.lang.Class<org.simpleframework.xml.core.Contact> r2 = org.simpleframework.xml.core.Contact.class
                java.lang.Class[] r3 = new java.lang.Class[]{r2, r3, r1}
                java.lang.reflect.Constructor r3 = r0.getConstructor(r3)
                return r3
        }
    }

    public ExtractorFactory(org.simpleframework.xml.core.Contact r1, java.lang.annotation.Annotation r2, org.simpleframework.xml.stream.Format r3) {
            r0 = this;
            r0.<init>()
            r0.contact = r1
            r0.format = r3
            r0.label = r2
            return
    }

    private org.simpleframework.xml.core.ExtractorFactory.ExtractorBuilder getBuilder(java.lang.annotation.Annotation r2) {
            r1 = this;
            boolean r1 = r2 instanceof org.simpleframework.xml.ElementUnion
            if (r1 == 0) goto Le
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r1 = new org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder
            java.lang.Class<org.simpleframework.xml.ElementUnion> r2 = org.simpleframework.xml.ElementUnion.class
            java.lang.Class<org.simpleframework.xml.core.ExtractorFactory$ElementExtractor> r0 = org.simpleframework.xml.core.ExtractorFactory.ElementExtractor.class
            r1.<init>(r2, r0)
            return r1
        Le:
            boolean r1 = r2 instanceof org.simpleframework.xml.ElementListUnion
            if (r1 == 0) goto L1c
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r1 = new org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder
            java.lang.Class<org.simpleframework.xml.ElementListUnion> r2 = org.simpleframework.xml.ElementListUnion.class
            java.lang.Class<org.simpleframework.xml.core.ExtractorFactory$ElementListExtractor> r0 = org.simpleframework.xml.core.ExtractorFactory.ElementListExtractor.class
            r1.<init>(r2, r0)
            return r1
        L1c:
            boolean r1 = r2 instanceof org.simpleframework.xml.ElementMapUnion
            if (r1 == 0) goto L2a
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r1 = new org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder
            java.lang.Class<org.simpleframework.xml.ElementMapUnion> r2 = org.simpleframework.xml.ElementMapUnion.class
            java.lang.Class<org.simpleframework.xml.core.ExtractorFactory$ElementMapExtractor> r0 = org.simpleframework.xml.core.ExtractorFactory.ElementMapExtractor.class
            r1.<init>(r2, r0)
            return r1
        L2a:
            org.simpleframework.xml.core.PersistenceException r1 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r0 = "Annotation %s is not a union"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r0, r2)
            throw r1
    }

    private java.lang.Object getInstance(java.lang.annotation.Annotation r3) {
            r2 = this;
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r0 = r2.getBuilder(r3)
            java.lang.reflect.Constructor r0 = org.simpleframework.xml.core.ExtractorFactory.ExtractorBuilder.access$000(r0)
            boolean r1 = r0.isAccessible()
            if (r1 != 0) goto L12
            r1 = 1
            r0.setAccessible(r1)
        L12:
            org.simpleframework.xml.core.Contact r1 = r2.contact
            org.simpleframework.xml.stream.Format r2 = r2.format
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r3, r2}
            java.lang.Object r2 = r0.newInstance(r2)
            return r2
    }

    public org.simpleframework.xml.core.Extractor getInstance() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.label
            java.lang.Object r1 = r1.getInstance(r0)
            org.simpleframework.xml.core.Extractor r1 = (org.simpleframework.xml.core.Extractor) r1
            return r1
    }
}
