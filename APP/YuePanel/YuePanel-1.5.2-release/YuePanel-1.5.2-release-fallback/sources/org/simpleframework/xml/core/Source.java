package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Source implements org.simpleframework.xml.core.Context {
    private org.simpleframework.xml.core.TemplateEngine engine;
    private org.simpleframework.xml.filter.Filter filter;
    private org.simpleframework.xml.core.Session session;
    private org.simpleframework.xml.strategy.Strategy strategy;
    private org.simpleframework.xml.core.Support support;

    public Source(org.simpleframework.xml.strategy.Strategy r3, org.simpleframework.xml.core.Support r4, org.simpleframework.xml.core.Session r5) {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.core.TemplateFilter r0 = new org.simpleframework.xml.core.TemplateFilter
            r0.<init>(r2, r4)
            r2.filter = r0
            org.simpleframework.xml.core.TemplateEngine r1 = new org.simpleframework.xml.core.TemplateEngine
            r1.<init>(r0)
            r2.engine = r1
            r2.strategy = r3
            r2.support = r4
            r2.session = r5
            return
    }

    private org.simpleframework.xml.core.Scanner getScanner(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            org.simpleframework.xml.core.Scanner r2 = r0.getScanner(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.Object getAttribute(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Session r0 = r1.session
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Caller getCaller(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.core.Scanner r1 = r0.getScanner(r1)
            org.simpleframework.xml.core.Caller r1 = r1.getCaller(r0)
            return r1
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Decorator getDecorator(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.core.Scanner r1 = r0.getScanner(r1)
            org.simpleframework.xml.core.Decorator r1 = r1.getDecorator()
            return r1
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Instance getInstance(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            org.simpleframework.xml.core.Instance r2 = r0.getInstance(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r2) {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            org.simpleframework.xml.core.Instance r2 = r0.getInstance(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.String getName(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            java.lang.String r2 = r0.getName(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.strategy.Value getOverride(org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.stream.InputNode r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.NodeMap r0 = r4.getAttributes()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Strategy r4 = r2.strategy
            org.simpleframework.xml.core.Session r1 = r2.session
            org.simpleframework.xml.strategy.Value r3 = r4.read(r3, r0, r1)
            return r3
        Lf:
            org.simpleframework.xml.core.PersistenceException r3 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r0 = "No attributes for %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.<init>(r0, r4)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.String getProperty(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.TemplateEngine r0 = r1.engine
            java.lang.String r2 = r0.process(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Schema getSchema(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Scanner r0 = r2.getScanner(r3)
            if (r0 == 0) goto Lc
            org.simpleframework.xml.core.ClassSchema r3 = new org.simpleframework.xml.core.ClassSchema
            r3.<init>(r0, r2)
            return r3
        Lc:
            org.simpleframework.xml.core.PersistenceException r0 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r1 = "Invalid schema class %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Session getSession() {
            r1 = this;
            org.simpleframework.xml.core.Session r0 = r1.session
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.stream.Style getStyle() {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            org.simpleframework.xml.stream.Style r0 = r0.getStyle()
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Support getSupport() {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2) {
            r0 = this;
            if (r2 == 0) goto L7
            java.lang.Class r1 = r2.getClass()
            return r1
        L7:
            java.lang.Class r1 = r1.getType()
            return r1
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.Version getVersion(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.core.Scanner r1 = r0.getScanner(r1)
            org.simpleframework.xml.Version r1 = r1.getRevision()
            return r1
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isFloat(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = org.simpleframework.xml.core.Support.isFloat(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isFloat(org.simpleframework.xml.strategy.Type r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            boolean r1 = r0.isFloat(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isPrimitive(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            boolean r2 = r0.isPrimitive(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isPrimitive(org.simpleframework.xml.strategy.Type r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            boolean r1 = r0.isPrimitive(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isStrict() {
            r1 = this;
            org.simpleframework.xml.core.Session r0 = r1.session
            boolean r0 = r0.isStrict()
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean setOverride(org.simpleframework.xml.strategy.Type r3, java.lang.Object r4, org.simpleframework.xml.stream.OutputNode r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.NodeMap r0 = r5.getAttributes()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Strategy r5 = r2.strategy
            org.simpleframework.xml.core.Session r1 = r2.session
            boolean r3 = r5.write(r3, r4, r0, r1)
            return r3
        Lf:
            org.simpleframework.xml.core.PersistenceException r3 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r4 = "No attributes for %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r3.<init>(r4, r5)
            throw r3
    }
}
