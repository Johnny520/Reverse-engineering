package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
    public java.lang.String getAttribute(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.Model r0 = r0.model
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.String r0 = r0.getAttribute(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.LabelMap getAttributes() {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.LabelMap r0 = r0.getAttributes()
            r1.attributes = r0
        Lc:
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.Label getElement(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.LabelMap r0 = r0.getElements()
            org.simpleframework.xml.core.Label r0 = r0.getLabel(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.LabelMap getElements() {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.LabelMap r0 = r0.getElements()
            r1.elements = r0
        Lc:
            return r0
    }

    public org.simpleframework.xml.core.ModelMap getModels() {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            if (r0 != 0) goto Lc
            org.simpleframework.xml.core.Model r0 = r1.model
            org.simpleframework.xml.core.ModelMap r0 = r0.getModels()
            r1.models = r0
        Lc:
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public java.lang.String getName() {
            r0 = this;
            org.simpleframework.xml.core.Model r0 = r0.model
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public java.lang.String getPath(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.Model r0 = r0.model
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.String r0 = r0.getElement(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public java.lang.String getPrefix() {
            r0 = this;
            org.simpleframework.xml.core.Model r0 = r0.model
            java.lang.String r0 = r0.getPrefix()
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.Section getSection(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.ModelMap r0 = r0.getModels()
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.ModelList r0 = (org.simpleframework.xml.core.ModelList) r0
            if (r0 == 0) goto L18
            org.simpleframework.xml.core.Model r0 = r0.take()
            if (r0 == 0) goto L18
            org.simpleframework.xml.core.ModelSection r1 = new org.simpleframework.xml.core.ModelSection
            r1.<init>(r0)
            return r1
        L18:
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public org.simpleframework.xml.core.Label getText() {
            r0 = this;
            org.simpleframework.xml.core.Model r0 = r0.model
            org.simpleframework.xml.core.Label r0 = r0.getText()
            return r0
    }

    @Override // org.simpleframework.xml.core.Section
    public boolean isSection(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.ModelMap r0 = r0.getModels()
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.simpleframework.xml.core.Model r2 = r2.model
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Lb
        L1b:
            java.util.Iterator r2 = r0.iterator()
            return r2
    }
}
