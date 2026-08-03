package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ExtractorFactory {
    private final org.simpleframework.xml.core.Contact contact;
    private final org.simpleframework.xml.stream.Format format;
    private final java.lang.annotation.Annotation label;

    public static class ElementExtractor implements org.simpleframework.xml.core.Extractor<org.simpleframework.xml.Element> {
        private final org.simpleframework.xml.core.Contact contact;
        private final org.simpleframework.xml.stream.Format format;
        private final org.simpleframework.xml.ElementUnion union;

        public ElementExtractor(org.simpleframework.xml.core.Contact r1, org.simpleframework.xml.ElementUnion r2, org.simpleframework.xml.stream.Format r3) throws java.lang.Exception {
                r0 = this;
                r0.<init>()
                r0.contact = r1
                r0.format = r3
                r0.union = r2
                return
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.annotation.Annotation[] getAnnotations() throws java.lang.Exception {
                r1 = this;
                org.simpleframework.xml.Element[] r0 = r1.getAnnotations()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public org.simpleframework.xml.Element[] getAnnotations() {
                r1 = this;
                org.simpleframework.xml.ElementUnion r0 = r1.union
                org.simpleframework.xml.Element[] r0 = r0.value()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ org.simpleframework.xml.core.Label getLabel(java.lang.annotation.Annotation r1) throws java.lang.Exception {
                r0 = this;
                org.simpleframework.xml.Element r1 = (org.simpleframework.xml.Element) r1
                org.simpleframework.xml.core.Label r1 = r0.getLabel(r1)
                return r1
        }

        public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.Element r4) {
                r3 = this;
                org.simpleframework.xml.core.ElementLabel r0 = new org.simpleframework.xml.core.ElementLabel
                org.simpleframework.xml.core.Contact r1 = r3.contact
                org.simpleframework.xml.stream.Format r2 = r3.format
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.Class getType(java.lang.annotation.Annotation r1) throws java.lang.Exception {
                r0 = this;
                org.simpleframework.xml.Element r1 = (org.simpleframework.xml.Element) r1
                java.lang.Class r1 = r0.getType(r1)
                return r1
        }

        public java.lang.Class getType(org.simpleframework.xml.Element r2) {
                r1 = this;
                java.lang.Class r2 = r2.type()
                java.lang.Class r0 = java.lang.Void.TYPE
                if (r2 != r0) goto Le
                org.simpleframework.xml.core.Contact r2 = r1.contact
                java.lang.Class r2 = r2.getType()
            Le:
                return r2
        }
    }

    public static class ElementListExtractor implements org.simpleframework.xml.core.Extractor<org.simpleframework.xml.ElementList> {
        private final org.simpleframework.xml.core.Contact contact;
        private final org.simpleframework.xml.stream.Format format;
        private final org.simpleframework.xml.ElementListUnion union;

        public ElementListExtractor(org.simpleframework.xml.core.Contact r1, org.simpleframework.xml.ElementListUnion r2, org.simpleframework.xml.stream.Format r3) throws java.lang.Exception {
                r0 = this;
                r0.<init>()
                r0.contact = r1
                r0.format = r3
                r0.union = r2
                return
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.annotation.Annotation[] getAnnotations() throws java.lang.Exception {
                r1 = this;
                org.simpleframework.xml.ElementList[] r0 = r1.getAnnotations()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public org.simpleframework.xml.ElementList[] getAnnotations() {
                r1 = this;
                org.simpleframework.xml.ElementListUnion r0 = r1.union
                org.simpleframework.xml.ElementList[] r0 = r0.value()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ org.simpleframework.xml.core.Label getLabel(java.lang.annotation.Annotation r1) throws java.lang.Exception {
                r0 = this;
                org.simpleframework.xml.ElementList r1 = (org.simpleframework.xml.ElementList) r1
                org.simpleframework.xml.core.Label r1 = r0.getLabel(r1)
                return r1
        }

        public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.ElementList r4) {
                r3 = this;
                org.simpleframework.xml.core.ElementListLabel r0 = new org.simpleframework.xml.core.ElementListLabel
                org.simpleframework.xml.core.Contact r1 = r3.contact
                org.simpleframework.xml.stream.Format r2 = r3.format
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.Class getType(java.lang.annotation.Annotation r1) throws java.lang.Exception {
                r0 = this;
                org.simpleframework.xml.ElementList r1 = (org.simpleframework.xml.ElementList) r1
                java.lang.Class r1 = r0.getType(r1)
                return r1
        }

        public java.lang.Class getType(org.simpleframework.xml.ElementList r1) {
                r0 = this;
                java.lang.Class r1 = r1.type()
                return r1
        }
    }

    public static class ElementMapExtractor implements org.simpleframework.xml.core.Extractor<org.simpleframework.xml.ElementMap> {
        private final org.simpleframework.xml.core.Contact contact;
        private final org.simpleframework.xml.stream.Format format;
        private final org.simpleframework.xml.ElementMapUnion union;

        public ElementMapExtractor(org.simpleframework.xml.core.Contact r1, org.simpleframework.xml.ElementMapUnion r2, org.simpleframework.xml.stream.Format r3) throws java.lang.Exception {
                r0 = this;
                r0.<init>()
                r0.contact = r1
                r0.format = r3
                r0.union = r2
                return
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.annotation.Annotation[] getAnnotations() throws java.lang.Exception {
                r1 = this;
                org.simpleframework.xml.ElementMap[] r0 = r1.getAnnotations()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public org.simpleframework.xml.ElementMap[] getAnnotations() {
                r1 = this;
                org.simpleframework.xml.ElementMapUnion r0 = r1.union
                org.simpleframework.xml.ElementMap[] r0 = r0.value()
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ org.simpleframework.xml.core.Label getLabel(java.lang.annotation.Annotation r1) throws java.lang.Exception {
                r0 = this;
                org.simpleframework.xml.ElementMap r1 = (org.simpleframework.xml.ElementMap) r1
                org.simpleframework.xml.core.Label r1 = r0.getLabel(r1)
                return r1
        }

        public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.ElementMap r4) {
                r3 = this;
                org.simpleframework.xml.core.ElementMapLabel r0 = new org.simpleframework.xml.core.ElementMapLabel
                org.simpleframework.xml.core.Contact r1 = r3.contact
                org.simpleframework.xml.stream.Format r2 = r3.format
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // org.simpleframework.xml.core.Extractor
        public /* bridge */ /* synthetic */ java.lang.Class getType(java.lang.annotation.Annotation r1) throws java.lang.Exception {
                r0 = this;
                org.simpleframework.xml.ElementMap r1 = (org.simpleframework.xml.ElementMap) r1
                java.lang.Class r1 = r0.getType(r1)
                return r1
        }

        public java.lang.Class getType(org.simpleframework.xml.ElementMap r1) {
                r0 = this;
                java.lang.Class r1 = r1.valueType()
                return r1
        }
    }

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

        public static /* synthetic */ java.lang.reflect.Constructor access$000(org.simpleframework.xml.core.ExtractorFactory.ExtractorBuilder r0) throws java.lang.Exception {
                java.lang.reflect.Constructor r0 = r0.getConstructor()
                return r0
        }

        private java.lang.reflect.Constructor getConstructor() throws java.lang.Exception {
                r4 = this;
                java.lang.Class r0 = r4.type
                java.lang.Class r1 = r4.label
                java.lang.Class<org.simpleframework.xml.stream.Format> r2 = org.simpleframework.xml.stream.Format.class
                java.lang.Class<org.simpleframework.xml.core.Contact> r3 = org.simpleframework.xml.core.Contact.class
                java.lang.Class[] r1 = new java.lang.Class[]{r3, r1, r2}
                java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
                return r0
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

    private org.simpleframework.xml.core.ExtractorFactory.ExtractorBuilder getBuilder(java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementUnion
            if (r0 == 0) goto Le
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r3 = new org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder
            java.lang.Class<org.simpleframework.xml.ElementUnion> r0 = org.simpleframework.xml.ElementUnion.class
            java.lang.Class<org.simpleframework.xml.core.ExtractorFactory$ElementExtractor> r1 = org.simpleframework.xml.core.ExtractorFactory.ElementExtractor.class
            r3.<init>(r0, r1)
            return r3
        Le:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementListUnion
            if (r0 == 0) goto L1c
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r3 = new org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder
            java.lang.Class<org.simpleframework.xml.ElementListUnion> r0 = org.simpleframework.xml.ElementListUnion.class
            java.lang.Class<org.simpleframework.xml.core.ExtractorFactory$ElementListExtractor> r1 = org.simpleframework.xml.core.ExtractorFactory.ElementListExtractor.class
            r3.<init>(r0, r1)
            return r3
        L1c:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementMapUnion
            if (r0 == 0) goto L2a
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r3 = new org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder
            java.lang.Class<org.simpleframework.xml.ElementMapUnion> r0 = org.simpleframework.xml.ElementMapUnion.class
            java.lang.Class<org.simpleframework.xml.core.ExtractorFactory$ElementMapExtractor> r1 = org.simpleframework.xml.core.ExtractorFactory.ElementMapExtractor.class
            r3.<init>(r0, r1)
            return r3
        L2a:
            org.simpleframework.xml.core.PersistenceException r0 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r1 = "Annotation %s is not a union"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
    }

    private java.lang.Object getInstance(java.lang.annotation.Annotation r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.ExtractorFactory$ExtractorBuilder r0 = r3.getBuilder(r4)
            java.lang.reflect.Constructor r0 = org.simpleframework.xml.core.ExtractorFactory.ExtractorBuilder.access$000(r0)
            boolean r1 = r0.isAccessible()
            if (r1 != 0) goto L12
            r1 = 1
            r0.setAccessible(r1)
        L12:
            org.simpleframework.xml.core.Contact r1 = r3.contact
            org.simpleframework.xml.stream.Format r2 = r3.format
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4, r2}
            java.lang.Object r4 = r0.newInstance(r4)
            return r4
    }

    public org.simpleframework.xml.core.Extractor getInstance() throws java.lang.Exception {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.label
            java.lang.Object r0 = r1.getInstance(r0)
            org.simpleframework.xml.core.Extractor r0 = (org.simpleframework.xml.core.Extractor) r0
            return r0
    }
}
