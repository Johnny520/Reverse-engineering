package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ModelSection implements org.simpleframework.xml.core.Section {
    private org.simpleframework.xml.core.LabelMap attributes;
    private org.simpleframework.xml.core.LabelMap elements;
    private org.simpleframework.xml.core.Model model;
    private org.simpleframework.xml.core.ModelMap models;

    public ModelSection(org.simpleframework.xml.core.Model r1) {
            r0 = this;
            r0.<init>()
            r0.model = r1
            return
    }

    @Override // org.simpleframework.xml.core.Section
    public java.lang.String getAttribute(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            if (r0 != 0) goto L9
            return r2
        L9:
            java.lang.String r2 = r0.getAttribute(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.LabelMap getAttributes() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.LabelMap r0 = r0.getAttributes()
            r1.attributes = r0
        Lc:
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.Label getElement(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.getElements()
            org.simpleframework.xml.core.Label r2 = r0.getLabel(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.LabelMap getElements() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.LabelMap r0 = r0.getElements()
            r1.elements = r0
        Lc:
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            return r0
    }

    public org.simpleframework.xml.core.ModelMap getModels() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.ModelMap r0 = r0.getModels()
            r1.models = r0
        Lc:
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public java.lang.String getName() {
            r1 = this;
            org.simpleframework.xml.core.Model r0 = r1.model
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public java.lang.String getPath(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            if (r0 != 0) goto L9
            return r2
        L9:
            java.lang.String r2 = r0.getElement(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Section
    public java.lang.String getPrefix() {
            r1 = this;
            org.simpleframework.xml.core.Model r0 = r1.model
            java.lang.String r0 = r0.getPrefix()
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.Section getSection(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.getModels()
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.core.ModelList r2 = (org.simpleframework.xml.core.ModelList) r2
            if (r2 == 0) goto L18
            org.simpleframework.xml.core.Model r2 = r2.take()
            if (r2 == 0) goto L18
            org.simpleframework.xml.core.ModelSection r0 = new org.simpleframework.xml.core.ModelSection
            r0.<init>(r2)
            return r0
        L18:
            r2 = 0
            return r2
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.Label getText() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.Label r0 = r0.getText()
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public boolean isSection(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.getModels()
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.simpleframework.xml.core.Model r1 = r3.model
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto Lb
        L1b:
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
