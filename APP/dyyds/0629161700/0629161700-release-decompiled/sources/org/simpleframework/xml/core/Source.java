package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private org.simpleframework.xml.core.Scanner getScanner(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            org.simpleframework.xml.core.Scanner r0 = r0.getScanner(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.Object getAttribute(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.core.Session r0 = r0.session
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Caller getCaller(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Scanner r1 = r0.getScanner(r1)
            org.simpleframework.xml.core.Caller r0 = r1.getCaller(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Decorator getDecorator(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.getScanner(r1)
            org.simpleframework.xml.core.Decorator r0 = r0.getDecorator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Instance getInstance(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r1) {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.String getName(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            java.lang.String r0 = r0.getName(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.strategy.Value getOverride(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.InputNode r3) {
            r1 = this;
            org.simpleframework.xml.stream.NodeMap r0 = r3.getAttributes()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Strategy r3 = r1.strategy
            org.simpleframework.xml.core.Session r1 = r1.session
            org.simpleframework.xml.strategy.Value r1 = r3.read(r2, r0, r1)
            return r1
        Lf:
            org.simpleframework.xml.core.PersistenceException r1 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r2 = "No attributes for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r1.<init>(r2, r3)
            throw r1
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.String getProperty(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.TemplateEngine r0 = r0.engine
            java.lang.String r0 = r0.process(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Schema getSchema(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.Scanner r0 = r1.getScanner(r2)
            if (r0 == 0) goto Lc
            org.simpleframework.xml.core.ClassSchema r2 = new org.simpleframework.xml.core.ClassSchema
            r2.<init>(r0, r1)
            return r2
        Lc:
            org.simpleframework.xml.core.PersistenceException r1 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r0 = "Invalid schema class %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r0, r2)
            throw r1
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Session getSession() {
            r0 = this;
            org.simpleframework.xml.core.Session r0 = r0.session
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.stream.Style getStyle() {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            org.simpleframework.xml.stream.Style r0 = r0.getStyle()
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.core.Support getSupport() {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public java.lang.Class getType(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2) {
            r0 = this;
            if (r2 == 0) goto L7
            java.lang.Class r0 = r2.getClass()
            return r0
        L7:
            java.lang.Class r0 = r1.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public org.simpleframework.xml.Version getVersion(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.getScanner(r1)
            org.simpleframework.xml.Version r0 = r0.getRevision()
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isFloat(java.lang.Class r1) {
            r0 = this;
            boolean r0 = org.simpleframework.xml.core.Support.isFloat(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isFloat(org.simpleframework.xml.strategy.Type r1) {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            boolean r0 = r0.isFloat(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isPrimitive(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            boolean r0 = r0.isPrimitive(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isPrimitive(org.simpleframework.xml.strategy.Type r1) {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            boolean r0 = r0.isPrimitive(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean isStrict() {
            r0 = this;
            org.simpleframework.xml.core.Session r0 = r0.session
            boolean r0 = r0.isStrict()
            return r0
    }

    @Override // org.simpleframework.xml.core.Context
    public boolean setOverride(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.OutputNode r4) {
            r1 = this;
            org.simpleframework.xml.stream.NodeMap r0 = r4.getAttributes()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Strategy r4 = r1.strategy
            org.simpleframework.xml.core.Session r1 = r1.session
            boolean r1 = r4.write(r2, r3, r0, r1)
            return r1
        Lf:
            org.simpleframework.xml.core.PersistenceException r1 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r2 = "No attributes for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r4}
            r1.<init>(r2, r3)
            throw r1
    }
}
