package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class LabelExtractor {
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.LabelGroup> cache;
    private final org.simpleframework.xml.stream.Format format;

    public static class LabelBuilder {
        private final java.lang.Class entry;
        private final java.lang.Class label;
        private final java.lang.Class type;

        public LabelBuilder(java.lang.Class r2, java.lang.Class r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public LabelBuilder(java.lang.Class r1, java.lang.Class r2, java.lang.Class r3) {
                r0 = this;
                r0.<init>()
                r0.entry = r3
                r0.label = r2
                r0.type = r1
                return
        }

        private java.lang.reflect.Constructor getConstructor(java.lang.Class r4) throws java.lang.Exception {
                r3 = this;
                java.lang.Class r0 = r3.type
                java.lang.Class<org.simpleframework.xml.core.Contact> r1 = org.simpleframework.xml.core.Contact.class
                java.lang.Class<org.simpleframework.xml.stream.Format> r2 = org.simpleframework.xml.stream.Format.class
                java.lang.Class[] r4 = new java.lang.Class[]{r1, r4, r2}
                java.lang.reflect.Constructor r4 = r0.getConstructor(r4)
                return r4
        }

        private java.lang.reflect.Constructor getConstructor(java.lang.Class r4, java.lang.Class r5) throws java.lang.Exception {
                r3 = this;
                java.lang.Class r0 = r3.type
                java.lang.Class<org.simpleframework.xml.core.Contact> r1 = org.simpleframework.xml.core.Contact.class
                java.lang.Class<org.simpleframework.xml.stream.Format> r2 = org.simpleframework.xml.stream.Format.class
                java.lang.Class[] r4 = new java.lang.Class[]{r1, r4, r5, r2}
                java.lang.reflect.Constructor r4 = r0.getConstructor(r4)
                return r4
        }

        public java.lang.reflect.Constructor getConstructor() throws java.lang.Exception {
                r2 = this;
                java.lang.Class r0 = r2.entry
                if (r0 == 0) goto Lb
                java.lang.Class r1 = r2.label
                java.lang.reflect.Constructor r0 = r2.getConstructor(r1, r0)
                return r0
            Lb:
                java.lang.Class r0 = r2.label
                java.lang.reflect.Constructor r0 = r2.getConstructor(r0)
                return r0
        }
    }

    public LabelExtractor(org.simpleframework.xml.stream.Format r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            r1.format = r2
            return
    }

    private java.lang.annotation.Annotation[] getAnnotations(java.lang.annotation.Annotation r4) throws java.lang.Exception {
            r3 = this;
            java.lang.Class r0 = r4.annotationType()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
            if (r1 <= 0) goto L18
            r0 = r0[r2]
            r1 = 0
            java.lang.Object r4 = r0.invoke(r4, r1)
            java.lang.annotation.Annotation[] r4 = (java.lang.annotation.Annotation[]) r4
            java.lang.annotation.Annotation[] r4 = (java.lang.annotation.Annotation[]) r4
            return r4
        L18:
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r2]
            return r4
    }

    private org.simpleframework.xml.core.LabelExtractor.LabelBuilder getBuilder(java.lang.annotation.Annotation r5) throws java.lang.Exception {
            r4 = this;
            boolean r0 = r5 instanceof org.simpleframework.xml.Element
            java.lang.Class<org.simpleframework.xml.Element> r1 = org.simpleframework.xml.Element.class
            if (r0 == 0) goto Le
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementLabel> r0 = org.simpleframework.xml.core.ElementLabel.class
            r5.<init>(r0, r1)
            return r5
        Le:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementList
            java.lang.Class<org.simpleframework.xml.ElementList> r2 = org.simpleframework.xml.ElementList.class
            if (r0 == 0) goto L1c
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementListLabel> r0 = org.simpleframework.xml.core.ElementListLabel.class
            r5.<init>(r0, r2)
            return r5
        L1c:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementArray
            if (r0 == 0) goto L2a
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementArrayLabel> r0 = org.simpleframework.xml.core.ElementArrayLabel.class
            java.lang.Class<org.simpleframework.xml.ElementArray> r1 = org.simpleframework.xml.ElementArray.class
            r5.<init>(r0, r1)
            return r5
        L2a:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementMap
            java.lang.Class<org.simpleframework.xml.ElementMap> r3 = org.simpleframework.xml.ElementMap.class
            if (r0 == 0) goto L38
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementMapLabel> r0 = org.simpleframework.xml.core.ElementMapLabel.class
            r5.<init>(r0, r3)
            return r5
        L38:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementUnion
            if (r0 == 0) goto L46
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementUnionLabel> r0 = org.simpleframework.xml.core.ElementUnionLabel.class
            java.lang.Class<org.simpleframework.xml.ElementUnion> r2 = org.simpleframework.xml.ElementUnion.class
            r5.<init>(r0, r2, r1)
            return r5
        L46:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementListUnion
            if (r0 == 0) goto L54
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementListUnionLabel> r0 = org.simpleframework.xml.core.ElementListUnionLabel.class
            java.lang.Class<org.simpleframework.xml.ElementListUnion> r1 = org.simpleframework.xml.ElementListUnion.class
            r5.<init>(r0, r1, r2)
            return r5
        L54:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementMapUnion
            if (r0 == 0) goto L62
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementMapUnionLabel> r0 = org.simpleframework.xml.core.ElementMapUnionLabel.class
            java.lang.Class<org.simpleframework.xml.ElementMapUnion> r1 = org.simpleframework.xml.ElementMapUnion.class
            r5.<init>(r0, r1, r3)
            return r5
        L62:
            boolean r0 = r5 instanceof org.simpleframework.xml.Attribute
            if (r0 == 0) goto L70
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.AttributeLabel> r0 = org.simpleframework.xml.core.AttributeLabel.class
            java.lang.Class<org.simpleframework.xml.Attribute> r1 = org.simpleframework.xml.Attribute.class
            r5.<init>(r0, r1)
            return r5
        L70:
            boolean r0 = r5 instanceof org.simpleframework.xml.Version
            if (r0 == 0) goto L7e
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.VersionLabel> r0 = org.simpleframework.xml.core.VersionLabel.class
            java.lang.Class<org.simpleframework.xml.Version> r1 = org.simpleframework.xml.Version.class
            r5.<init>(r0, r1)
            return r5
        L7e:
            boolean r0 = r5 instanceof org.simpleframework.xml.Text
            if (r0 == 0) goto L8c
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r5 = new org.simpleframework.xml.core.LabelExtractor$LabelBuilder
            java.lang.Class<org.simpleframework.xml.core.TextLabel> r0 = org.simpleframework.xml.core.TextLabel.class
            java.lang.Class<org.simpleframework.xml.Text> r1 = org.simpleframework.xml.Text.class
            r5.<init>(r0, r1)
            return r5
        L8c:
            org.simpleframework.xml.core.PersistenceException r0 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r1 = "Annotation %s not supported"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r0.<init>(r1, r5)
            throw r0
    }

    private java.lang.reflect.Constructor getConstructor(java.lang.annotation.Annotation r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelExtractor$LabelBuilder r2 = r1.getBuilder(r2)
            java.lang.reflect.Constructor r2 = r2.getConstructor()
            boolean r0 = r2.isAccessible()
            if (r0 != 0) goto L12
            r0 = 1
            r2.setAccessible(r0)
        L12:
            return r2
    }

    private org.simpleframework.xml.core.LabelGroup getGroup(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3, java.lang.Object r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.LabelGroup> r0 = r1.cache
            java.lang.Object r0 = r0.fetch(r4)
            org.simpleframework.xml.core.LabelGroup r0 = (org.simpleframework.xml.core.LabelGroup) r0
            if (r0 != 0) goto L16
            org.simpleframework.xml.core.LabelGroup r2 = r1.getLabels(r2, r3)
            if (r2 == 0) goto L15
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.LabelGroup> r3 = r1.cache
            r3.cache(r4, r2)
        L15:
            return r2
        L16:
            return r0
    }

    private java.lang.Object getKey(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) {
            r1 = this;
            org.simpleframework.xml.core.LabelKey r0 = new org.simpleframework.xml.core.LabelKey
            r0.<init>(r2, r3)
            return r0
    }

    private org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.core.Contact r3, java.lang.annotation.Annotation r4, java.lang.annotation.Annotation r5) throws java.lang.Exception {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.getConstructor(r4)
            if (r5 == 0) goto L13
            org.simpleframework.xml.stream.Format r1 = r2.format
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r1}
            java.lang.Object r3 = r0.newInstance(r3)
            org.simpleframework.xml.core.Label r3 = (org.simpleframework.xml.core.Label) r3
            return r3
        L13:
            org.simpleframework.xml.stream.Format r5 = r2.format
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}
            java.lang.Object r3 = r0.newInstance(r3)
            org.simpleframework.xml.core.Label r3 = (org.simpleframework.xml.core.Label) r3
            return r3
    }

    private org.simpleframework.xml.core.LabelGroup getLabels(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementUnion
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.LabelGroup r2 = r1.getUnion(r2, r3)
            return r2
        L9:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementListUnion
            if (r0 == 0) goto L12
            org.simpleframework.xml.core.LabelGroup r2 = r1.getUnion(r2, r3)
            return r2
        L12:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementMapUnion
            if (r0 == 0) goto L1b
            org.simpleframework.xml.core.LabelGroup r2 = r1.getUnion(r2, r3)
            return r2
        L1b:
            org.simpleframework.xml.core.LabelGroup r2 = r1.getSingle(r2, r3)
            return r2
    }

    private org.simpleframework.xml.core.LabelGroup getSingle(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            org.simpleframework.xml.core.Label r2 = r1.getLabel(r2, r3, r0)
            if (r2 == 0) goto Ld
            org.simpleframework.xml.core.CacheLabel r3 = new org.simpleframework.xml.core.CacheLabel
            r3.<init>(r2)
            r2 = r3
        Ld:
            org.simpleframework.xml.core.LabelGroup r3 = new org.simpleframework.xml.core.LabelGroup
            r3.<init>(r2)
            return r3
    }

    private org.simpleframework.xml.core.LabelGroup getUnion(org.simpleframework.xml.core.Contact r7, java.lang.annotation.Annotation r8) throws java.lang.Exception {
            r6 = this;
            java.lang.annotation.Annotation[] r0 = r6.getAnnotations(r8)
            int r1 = r0.length
            if (r1 <= 0) goto L2a
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L24
            r4 = r0[r3]
            org.simpleframework.xml.core.Label r4 = r6.getLabel(r7, r8, r4)
            if (r4 == 0) goto L1e
            org.simpleframework.xml.core.CacheLabel r5 = new org.simpleframework.xml.core.CacheLabel
            r5.<init>(r4)
            r4 = r5
        L1e:
            r1.add(r4)
            int r3 = r3 + 1
            goto Le
        L24:
            org.simpleframework.xml.core.LabelGroup r7 = new org.simpleframework.xml.core.LabelGroup
            r7.<init>(r1)
            return r7
        L2a:
            r7 = 0
            return r7
    }

    public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r1 = this;
            java.lang.Object r0 = r1.getKey(r2, r3)
            org.simpleframework.xml.core.LabelGroup r2 = r1.getGroup(r2, r3, r0)
            if (r2 == 0) goto Lf
            org.simpleframework.xml.core.Label r2 = r2.getPrimary()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public java.util.List<org.simpleframework.xml.core.Label> getList(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r1 = this;
            java.lang.Object r0 = r1.getKey(r2, r3)
            org.simpleframework.xml.core.LabelGroup r2 = r1.getGroup(r2, r3, r0)
            if (r2 == 0) goto Lf
            java.util.List r2 = r2.getList()
            return r2
        Lf:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
    }
}
