package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ParameterFactory {
    private final org.simpleframework.xml.stream.Format format;

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

        private java.lang.reflect.Constructor getConstructor(java.lang.Class... r2) throws java.lang.Exception {
                r1 = this;
                java.lang.Class r0 = r1.type
                java.lang.reflect.Constructor r2 = r0.getConstructor(r2)
                return r2
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

        public java.lang.reflect.Constructor getConstructor(java.lang.Class r4) throws java.lang.Exception {
                r3 = this;
                java.lang.Class<org.simpleframework.xml.stream.Format> r0 = org.simpleframework.xml.stream.Format.class
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.Class<java.lang.reflect.Constructor> r2 = java.lang.reflect.Constructor.class
                java.lang.Class[] r4 = new java.lang.Class[]{r2, r4, r0, r1}
                java.lang.reflect.Constructor r4 = r3.getConstructor(r4)
                return r4
        }

        public java.lang.reflect.Constructor getConstructor(java.lang.Class r4, java.lang.Class r5) throws java.lang.Exception {
                r3 = this;
                java.lang.Class<org.simpleframework.xml.stream.Format> r0 = org.simpleframework.xml.stream.Format.class
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.Class<java.lang.reflect.Constructor> r2 = java.lang.reflect.Constructor.class
                java.lang.Class[] r4 = new java.lang.Class[]{r2, r4, r5, r0, r1}
                java.lang.reflect.Constructor r4 = r3.getConstructor(r4)
                return r4
        }
    }

    public ParameterFactory(org.simpleframework.xml.core.Support r1) {
            r0 = this;
            r0.<init>()
            org.simpleframework.xml.stream.Format r1 = r1.getFormat()
            r0.format = r1
            return
    }

    private org.simpleframework.xml.core.ParameterFactory.ParameterBuilder getBuilder(java.lang.annotation.Annotation r5) throws java.lang.Exception {
            r4 = this;
            boolean r0 = r5 instanceof org.simpleframework.xml.Element
            java.lang.Class<org.simpleframework.xml.Element> r1 = org.simpleframework.xml.Element.class
            if (r0 == 0) goto Le
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementParameter> r0 = org.simpleframework.xml.core.ElementParameter.class
            r5.<init>(r0, r1)
            return r5
        Le:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementList
            java.lang.Class<org.simpleframework.xml.ElementList> r2 = org.simpleframework.xml.ElementList.class
            if (r0 == 0) goto L1c
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementListParameter> r0 = org.simpleframework.xml.core.ElementListParameter.class
            r5.<init>(r0, r2)
            return r5
        L1c:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementArray
            if (r0 == 0) goto L2a
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementArrayParameter> r0 = org.simpleframework.xml.core.ElementArrayParameter.class
            java.lang.Class<org.simpleframework.xml.ElementArray> r1 = org.simpleframework.xml.ElementArray.class
            r5.<init>(r0, r1)
            return r5
        L2a:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementMapUnion
            java.lang.Class<org.simpleframework.xml.ElementMap> r3 = org.simpleframework.xml.ElementMap.class
            if (r0 == 0) goto L3a
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementMapUnionParameter> r0 = org.simpleframework.xml.core.ElementMapUnionParameter.class
            java.lang.Class<org.simpleframework.xml.ElementMapUnion> r1 = org.simpleframework.xml.ElementMapUnion.class
            r5.<init>(r0, r1, r3)
            return r5
        L3a:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementListUnion
            if (r0 == 0) goto L48
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementListUnionParameter> r0 = org.simpleframework.xml.core.ElementListUnionParameter.class
            java.lang.Class<org.simpleframework.xml.ElementListUnion> r1 = org.simpleframework.xml.ElementListUnion.class
            r5.<init>(r0, r1, r2)
            return r5
        L48:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementUnion
            if (r0 == 0) goto L56
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementUnionParameter> r0 = org.simpleframework.xml.core.ElementUnionParameter.class
            java.lang.Class<org.simpleframework.xml.ElementUnion> r2 = org.simpleframework.xml.ElementUnion.class
            r5.<init>(r0, r2, r1)
            return r5
        L56:
            boolean r0 = r5 instanceof org.simpleframework.xml.ElementMap
            if (r0 == 0) goto L62
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.ElementMapParameter> r0 = org.simpleframework.xml.core.ElementMapParameter.class
            r5.<init>(r0, r3)
            return r5
        L62:
            boolean r0 = r5 instanceof org.simpleframework.xml.Attribute
            if (r0 == 0) goto L70
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.AttributeParameter> r0 = org.simpleframework.xml.core.AttributeParameter.class
            java.lang.Class<org.simpleframework.xml.Attribute> r1 = org.simpleframework.xml.Attribute.class
            r5.<init>(r0, r1)
            return r5
        L70:
            boolean r0 = r5 instanceof org.simpleframework.xml.Text
            if (r0 == 0) goto L7e
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r5 = new org.simpleframework.xml.core.ParameterFactory$ParameterBuilder
            java.lang.Class<org.simpleframework.xml.core.TextParameter> r0 = org.simpleframework.xml.core.TextParameter.class
            java.lang.Class<org.simpleframework.xml.Text> r1 = org.simpleframework.xml.Text.class
            r5.<init>(r0, r1)
            return r5
        L7e:
            org.simpleframework.xml.core.PersistenceException r0 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r1 = "Annotation %s not supported"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r0.<init>(r1, r5)
            throw r0
    }

    private java.lang.reflect.Constructor getConstructor(java.lang.annotation.Annotation r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ParameterFactory$ParameterBuilder r2 = r1.getBuilder(r2)
            java.lang.reflect.Constructor r2 = r2.getConstructor()
            boolean r0 = r2.isAccessible()
            if (r0 != 0) goto L12
            r0 = 1
            r2.setAccessible(r0)
        L12:
            return r2
    }

    public org.simpleframework.xml.core.Parameter getInstance(java.lang.reflect.Constructor r2, java.lang.annotation.Annotation r3, int r4) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            org.simpleframework.xml.core.Parameter r2 = r1.getInstance(r2, r3, r0, r4)
            return r2
    }

    public org.simpleframework.xml.core.Parameter getInstance(java.lang.reflect.Constructor r3, java.lang.annotation.Annotation r4, java.lang.annotation.Annotation r5, int r6) throws java.lang.Exception {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.getConstructor(r4)
            if (r5 == 0) goto L17
            org.simpleframework.xml.stream.Format r1 = r2.format
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r1, r6}
            java.lang.Object r3 = r0.newInstance(r3)
            org.simpleframework.xml.core.Parameter r3 = (org.simpleframework.xml.core.Parameter) r3
            return r3
        L17:
            org.simpleframework.xml.stream.Format r5 = r2.format
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6}
            java.lang.Object r3 = r0.newInstance(r3)
            org.simpleframework.xml.core.Parameter r3 = (org.simpleframework.xml.core.Parameter) r3
            return r3
    }
}
