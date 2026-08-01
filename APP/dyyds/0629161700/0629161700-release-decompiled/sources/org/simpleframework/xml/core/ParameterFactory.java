package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ParameterFactory {
    private final org.simpleframework.xml.stream.Format format;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class ParameterBuilder {
        private final java.lang.Class entry;
        private final java.lang.Class label;
        private final java.lang.Class type;

        public ParameterBuilder(java.lang.Class r2, java.lang.Class r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public ParameterBuilder(java.lang.Class r1, java.lang.Class r2, java.lang.Class r3) {
                r0 = this;
                r0.<init>()
                r0.label = r2
                r0.entry = r3
                r0.type = r1
                return
        }

        private java.lang.reflect.Constructor getConstructor(java.lang.Class... r1) {
                r0 = this;
                java.lang.Class r0 = r0.type
                java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
                return r0
        }

        public java.lang.reflect.Constructor getConstructor() {
                r2 = this;
                java.lang.Class r0 = r2.entry
                java.lang.Class r1 = r2.label
                if (r0 == 0) goto Lb
                java.lang.reflect.Constructor r2 = r2.getConstructor(r1, r0)
                return r2
            Lb:
                java.lang.reflect.Constructor r2 = r2.getConstructor(r1)
                return r2
        }

        public java.lang.reflect.Constructor getConstructor(java.lang.Class r4) {
                r3 = this;
                java.lang.Class<org.simpleframework.xml.stream.Format> r0 = org.simpleframework.xml.stream.Format.class
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.Class<java.lang.reflect.Constructor> r2 = java.lang.reflect.Constructor.class
                java.lang.Class[] r4 = new java.lang.Class[]{r2, r4, r0, r1}
                java.lang.reflect.Constructor r3 = r3.getConstructor(r4)
                return r3
        }

        public java.lang.reflect.Constructor getConstructor(java.lang.Class r4, java.lang.Class r5) {
                r3 = this;
                java.lang.Class<org.simpleframework.xml.stream.Format> r0 = org.simpleframework.xml.stream.Format.class
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.Class<java.lang.reflect.Constructor> r2 = java.lang.reflect.Constructor.class
                java.lang.Class[] r4 = new java.lang.Class[]{r2, r4, r5, r0, r1}
                java.lang.reflect.Constructor r3 = r3.getConstructor(r4)
                return r3
        }
    }

    public ParameterFactory(org.simpleframework.xml.core.Support r1) {
            r0 = this;
            r0.<init>()
            org.simpleframework.xml.stream.Format r1 = r1.getFormat()
            r0.format = r1
            return
    }

    private org.simpleframework.xml.core.ParameterFactory.ParameterBuilder getBuilder(java.lang.annotation.Annotation r4) {
            r3 = this;
            boolean r3 = r4 instanceof org.simpleframework.xml.Element
            java.lang.Class<org.simpleframework.xml.Element> r0 = org.simpleframework.xml.Element.class
            if (r3 == 0) goto Le
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementParameter> r4 = org.simpleframework.xml.core.ElementParameter.class
            r3.<init>(r4, r0)
            return r3
        Le:
            boolean r3 = r4 instanceof org.simpleframework.xml.ElementList
            java.lang.Class<org.simpleframework.xml.ElementList> r1 = org.simpleframework.xml.ElementList.class
            if (r3 == 0) goto L1c
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementListParameter> r4 = org.simpleframework.xml.core.ElementListParameter.class
            r3.<init>(r4, r1)
            return r3
        L1c:
            boolean r3 = r4 instanceof org.simpleframework.xml.ElementArray
            if (r3 == 0) goto L2a
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementArrayParameter> r4 = org.simpleframework.xml.core.ElementArrayParameter.class
            java.lang.Class<org.simpleframework.xml.ElementArray> r0 = org.simpleframework.xml.ElementArray.class
            r3.<init>(r4, r0)
            return r3
        L2a:
            boolean r3 = r4 instanceof org.simpleframework.xml.ElementMapUnion
            java.lang.Class<org.simpleframework.xml.ElementMap> r2 = org.simpleframework.xml.ElementMap.class
            if (r3 == 0) goto L3a
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementMapUnionParameter> r4 = org.simpleframework.xml.core.ElementMapUnionParameter.class
            java.lang.Class<org.simpleframework.xml.ElementMapUnion> r0 = org.simpleframework.xml.ElementMapUnion.class
            r3.<init>(r4, r0, r2)
            return r3
        L3a:
            boolean r3 = r4 instanceof org.simpleframework.xml.ElementListUnion
            if (r3 == 0) goto L48
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementListUnionParameter> r4 = org.simpleframework.xml.core.ElementListUnionParameter.class
            java.lang.Class<org.simpleframework.xml.ElementListUnion> r0 = org.simpleframework.xml.ElementListUnion.class
            r3.<init>(r4, r0, r1)
            return r3
        L48:
            boolean r3 = r4 instanceof org.simpleframework.xml.ElementUnion
            if (r3 == 0) goto L56
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementUnionParameter> r4 = org.simpleframework.xml.core.ElementUnionParameter.class
            java.lang.Class<org.simpleframework.xml.ElementUnion> r1 = org.simpleframework.xml.ElementUnion.class
            r3.<init>(r4, r1, r0)
            return r3
        L56:
            boolean r3 = r4 instanceof org.simpleframework.xml.ElementMap
            if (r3 == 0) goto L62
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementMapParameter> r4 = org.simpleframework.xml.core.ElementMapParameter.class
            r3.<init>(r4, r2)
            return r3
        L62:
            boolean r3 = r4 instanceof org.simpleframework.xml.Attribute
            if (r3 == 0) goto L70
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.AttributeParameter> r4 = org.simpleframework.xml.core.AttributeParameter.class
            java.lang.Class<org.simpleframework.xml.Attribute> r0 = org.simpleframework.xml.Attribute.class
            r3.<init>(r4, r0)
            return r3
        L70:
            boolean r3 = r4 instanceof org.simpleframework.xml.Text
            if (r3 == 0) goto L7e
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r3 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.TextParameter> r4 = org.simpleframework.xml.core.TextParameter.class
            java.lang.Class<org.simpleframework.xml.Text> r0 = org.simpleframework.xml.Text.class
            r3.<init>(r4, r0)
            return r3
        L7e:
            org.simpleframework.xml.core.PersistenceException r3 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r0 = "Annotation %s not supported"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.<init>(r0, r4)
            throw r3
    }

    private java.lang.reflect.Constructor getConstructor(java.lang.annotation.Annotation r1) {
            r0 = this;
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r0 = r0.getBuilder(r1)
            java.lang.reflect.Constructor r0 = r0.getConstructor()
            boolean r1 = r0.isAccessible()
            if (r1 != 0) goto L12
            r1 = 1
            r0.setAccessible(r1)
        L12:
            return r0
    }

    public org.simpleframework.xml.core.Parameter getInstance(java.lang.reflect.Constructor r2, java.lang.annotation.Annotation r3, int r4) {
            r1 = this;
            r0 = 0
            org.simpleframework.xml.core.Parameter r1 = r1.getInstance(r2, r3, r0, r4)
            return r1
    }

    public org.simpleframework.xml.core.Parameter getInstance(java.lang.reflect.Constructor r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation r4, int r5) {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.getConstructor(r3)
            org.simpleframework.xml.stream.Format r1 = r1.format
            if (r4 == 0) goto L17
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r3, r4, r1, r5}
            java.lang.Object r1 = r0.newInstance(r1)
            org.simpleframework.xml.core.Parameter r1 = (org.simpleframework.xml.core.Parameter) r1
            return r1
        L17:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r3, r1, r4}
            java.lang.Object r1 = r0.newInstance(r1)
            org.simpleframework.xml.core.Parameter r1 = (org.simpleframework.xml.core.Parameter) r1
            return r1
    }
}
