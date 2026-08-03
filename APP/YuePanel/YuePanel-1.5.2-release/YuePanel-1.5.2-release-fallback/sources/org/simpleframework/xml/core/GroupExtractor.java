package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class GroupExtractor implements org.simpleframework.xml.core.Group {
    private final org.simpleframework.xml.core.LabelMap elements;
    private final org.simpleframework.xml.core.ExtractorFactory factory;
    private final java.lang.annotation.Annotation label;
    private final org.simpleframework.xml.core.GroupExtractor.Registry registry;

    public static class Registry extends java.util.LinkedHashMap<java.lang.Class, org.simpleframework.xml.core.Label> implements java.lang.Iterable<org.simpleframework.xml.core.Label> {
        private org.simpleframework.xml.core.LabelMap elements;
        private org.simpleframework.xml.core.Label text;

        public Registry(org.simpleframework.xml.core.LabelMap r1) {
                r0 = this;
                r0.<init>()
                r0.elements = r1
                return
        }

        private void registerElement(java.lang.Class r3, org.simpleframework.xml.core.Label r4) throws java.lang.Exception {
                r2 = this;
                java.lang.String r0 = r4.getName()
                org.simpleframework.xml.core.LabelMap r1 = r2.elements
                boolean r1 = r1.containsKey(r0)
                if (r1 != 0) goto L11
                org.simpleframework.xml.core.LabelMap r1 = r2.elements
                r1.put(r0, r4)
            L11:
                boolean r0 = r2.containsKey(r3)
                if (r0 != 0) goto L1a
                r2.put(r3, r4)
            L1a:
                return
        }

        private void registerText(org.simpleframework.xml.core.Label r3) throws java.lang.Exception {
                r2 = this;
                org.simpleframework.xml.core.Contact r0 = r3.getContact()
                java.lang.Class<org.simpleframework.xml.Text> r1 = org.simpleframework.xml.Text.class
                java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                org.simpleframework.xml.Text r0 = (org.simpleframework.xml.Text) r0
                if (r0 == 0) goto L15
                org.simpleframework.xml.core.TextListLabel r1 = new org.simpleframework.xml.core.TextListLabel
                r1.<init>(r3, r0)
                r2.text = r1
            L15:
                return
        }

        private org.simpleframework.xml.core.Label resolveElement(java.lang.Class r2) {
                r1 = this;
            L0:
                if (r2 == 0) goto L10
                java.lang.Object r0 = r1.get(r2)
                org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.lang.Class r2 = r2.getSuperclass()
                goto L0
            L10:
                r2 = 0
                return r2
        }

        private org.simpleframework.xml.core.Label resolveText(java.lang.Class r3) {
                r2 = this;
                org.simpleframework.xml.core.Label r0 = r2.text
                if (r0 == 0) goto L9
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r3 != r1) goto L9
                return r0
            L9:
                r3 = 0
                return r3
        }

        public boolean isText() {
                r1 = this;
                org.simpleframework.xml.core.Label r0 = r1.text
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<org.simpleframework.xml.core.Label> iterator() {
                r1 = this;
                java.util.Collection r0 = r1.values()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        public void register(java.lang.Class r2, org.simpleframework.xml.core.Label r3) throws java.lang.Exception {
                r1 = this;
                org.simpleframework.xml.core.CacheLabel r0 = new org.simpleframework.xml.core.CacheLabel
                r0.<init>(r3)
                r1.registerElement(r2, r0)
                r1.registerText(r0)
                return
        }

        public org.simpleframework.xml.core.Label resolve(java.lang.Class r2) {
                r1 = this;
                org.simpleframework.xml.core.Label r0 = r1.resolveText(r2)
                if (r0 != 0) goto Lb
                org.simpleframework.xml.core.Label r2 = r1.resolveElement(r2)
                return r2
            Lb:
                return r0
        }

        public org.simpleframework.xml.core.Label resolveText() {
                r1 = this;
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                org.simpleframework.xml.core.Label r0 = r1.resolveText(r0)
                return r0
        }
    }

    public GroupExtractor(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3, org.simpleframework.xml.stream.Format r4) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ExtractorFactory r0 = new org.simpleframework.xml.core.ExtractorFactory
            r0.<init>(r2, r3, r4)
            r1.factory = r0
            org.simpleframework.xml.core.LabelMap r2 = new org.simpleframework.xml.core.LabelMap
            r2.<init>()
            r1.elements = r2
            org.simpleframework.xml.core.GroupExtractor$Registry r4 = new org.simpleframework.xml.core.GroupExtractor$Registry
            r4.<init>(r2)
            r1.registry = r4
            r1.label = r3
            r1.extract()
            return
    }

    private void extract() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ExtractorFactory r0 = r1.factory
            org.simpleframework.xml.core.Extractor r0 = r0.getInstance()
            if (r0 == 0) goto Lb
            r1.extract(r0)
        Lb:
            return
    }

    private void extract(org.simpleframework.xml.core.Extractor r5) throws java.lang.Exception {
            r4 = this;
            java.lang.annotation.Annotation[] r0 = r5.getAnnotations()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            r4.extract(r5, r3)
            int r2 = r2 + 1
            goto L6
        L10:
            return
    }

    private void extract(org.simpleframework.xml.core.Extractor r2, java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r2.getLabel(r3)
            java.lang.Class r2 = r2.getType(r3)
            org.simpleframework.xml.core.GroupExtractor$Registry r3 = r1.registry
            if (r3 == 0) goto Lf
            r3.register(r2, r0)
        Lf:
            return
    }

    @Override // org.simpleframework.xml.core.Group
    public org.simpleframework.xml.core.LabelMap getElements() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            org.simpleframework.xml.core.LabelMap r0 = r0.getLabels()
            return r0
    }

    @Override // org.simpleframework.xml.core.Group
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor$Registry r0 = r1.registry
            org.simpleframework.xml.core.Label r2 = r0.resolve(r2)
            return r2
    }

    public java.lang.String[] getNames() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            java.lang.String[] r0 = r0.getKeys()
            return r0
    }

    public java.lang.String[] getPaths() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            java.lang.String[] r0 = r0.getPaths()
            return r0
    }

    @Override // org.simpleframework.xml.core.Group
    public org.simpleframework.xml.core.Label getText() {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor$Registry r0 = r1.registry
            org.simpleframework.xml.core.Label r0 = r0.resolveText()
            return r0
    }

    public boolean isDeclared(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor$Registry r0 = r1.registry
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Group
    public boolean isInline() {
            r2 = this;
            org.simpleframework.xml.core.GroupExtractor$Registry r0 = r2.registry
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.core.Label r1 = (org.simpleframework.xml.core.Label) r1
            boolean r1 = r1.isInline()
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L1a:
            org.simpleframework.xml.core.GroupExtractor$Registry r0 = r2.registry
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Group
    public boolean isTextList() {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor$Registry r0 = r1.registry
            boolean r0 = r0.isText()
            return r0
    }

    public boolean isValid(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.GroupExtractor$Registry r0 = r1.registry
            org.simpleframework.xml.core.Label r2 = r0.resolve(r2)
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // org.simpleframework.xml.core.Group
    public java.lang.String toString() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.label
            java.lang.String r0 = r0.toString()
            return r0
    }
}
