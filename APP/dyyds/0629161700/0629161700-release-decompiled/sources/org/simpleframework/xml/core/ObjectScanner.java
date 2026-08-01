package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ObjectScanner implements org.simpleframework.xml.core.Scanner {
    private org.simpleframework.xml.core.StructureBuilder builder;
    private org.simpleframework.xml.core.Detail detail;
    private org.simpleframework.xml.core.ClassScanner scanner;
    private org.simpleframework.xml.core.Structure structure;
    private org.simpleframework.xml.core.Support support;

    public ObjectScanner(org.simpleframework.xml.core.Detail r2, org.simpleframework.xml.core.Support r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ClassScanner r0 = new org.simpleframework.xml.core.ClassScanner
            r0.<init>(r2, r3)
            r1.scanner = r0
            org.simpleframework.xml.core.StructureBuilder r0 = new org.simpleframework.xml.core.StructureBuilder
            r0.<init>(r1, r2, r3)
            r1.builder = r0
            r1.support = r3
            r1.detail = r2
            r1.scan(r2)
            return
    }

    private void commit(org.simpleframework.xml.core.Detail r2) {
            r1 = this;
            java.lang.Class r2 = r2.getType()
            org.simpleframework.xml.core.Structure r0 = r1.structure
            if (r0 != 0) goto L10
            org.simpleframework.xml.core.StructureBuilder r0 = r1.builder
            org.simpleframework.xml.core.Structure r2 = r0.build(r2)
            r1.structure = r2
        L10:
            r2 = 0
            r1.builder = r2
            return
    }

    private void field(org.simpleframework.xml.core.Detail r4) {
            r3 = this;
            java.lang.Class r0 = r4.getType()
            org.simpleframework.xml.DefaultType r4 = r4.getOverride()
            org.simpleframework.xml.core.Support r1 = r3.support
            org.simpleframework.xml.core.ContactList r4 = r1.getFields(r0, r4)
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.next()
            org.simpleframework.xml.core.Contact r0 = (org.simpleframework.xml.core.Contact) r0
            java.lang.annotation.Annotation r1 = r0.getAnnotation()
            if (r1 == 0) goto L12
            org.simpleframework.xml.core.StructureBuilder r2 = r3.builder
            r2.process(r0, r1)
            goto L12
        L2a:
            return
    }

    private void method(org.simpleframework.xml.core.Detail r4) {
            r3 = this;
            java.lang.Class r0 = r4.getType()
            org.simpleframework.xml.DefaultType r4 = r4.getOverride()
            org.simpleframework.xml.core.Support r1 = r3.support
            org.simpleframework.xml.core.ContactList r4 = r1.getMethods(r0, r4)
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.next()
            org.simpleframework.xml.core.Contact r0 = (org.simpleframework.xml.core.Contact) r0
            java.lang.annotation.Annotation r1 = r0.getAnnotation()
            if (r1 == 0) goto L12
            org.simpleframework.xml.core.StructureBuilder r2 = r3.builder
            r2.process(r0, r1)
            goto L12
        L2a:
            return
    }

    private void order(org.simpleframework.xml.core.Detail r1) {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            org.simpleframework.xml.core.StructureBuilder r0 = r0.builder
            r0.assemble(r1)
            return
    }

    private void scan(org.simpleframework.xml.core.Detail r1) {
            r0 = this;
            r0.order(r1)
            r0.field(r1)
            r0.method(r1)
            r0.validate(r1)
            r0.commit(r1)
            return
    }

    private void validate(org.simpleframework.xml.core.Detail r2) {
            r1 = this;
            java.lang.Class r2 = r2.getType()
            org.simpleframework.xml.core.StructureBuilder r0 = r1.builder
            r0.commit(r2)
            org.simpleframework.xml.core.StructureBuilder r1 = r1.builder
            r1.validate(r2)
            return
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Caller getCaller(org.simpleframework.xml.core.Context r2) {
            r1 = this;
            org.simpleframework.xml.core.Caller r0 = new org.simpleframework.xml.core.Caller
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getCommit() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getCommit()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getComplete() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getComplete()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Decorator r0 = r0.getDecorator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Instantiator getInstantiator() {
            r0 = this;
            org.simpleframework.xml.core.Structure r0 = r0.structure
            org.simpleframework.xml.core.Instantiator r0 = r0.getInstantiator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.lang.String getName() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.Order getOrder() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.Order r0 = r0.getOrder()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.ParameterMap getParameters() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.ParameterMap r0 = r0.getParameters()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getPersist() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getPersist()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getReplace() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getReplace()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getResolve() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getResolve()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.Version getRevision() {
            r0 = this;
            org.simpleframework.xml.core.Structure r0 = r0.structure
            org.simpleframework.xml.Version r0 = r0.getRevision()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Section getSection() {
            r0 = this;
            org.simpleframework.xml.core.Structure r0 = r0.structure
            org.simpleframework.xml.core.Section r0 = r0.getSection()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Signature getSignature() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Signature r0 = r0.getSignature()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.util.List<org.simpleframework.xml.core.Signature> getSignatures() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            java.util.List r0 = r0.getSignatures()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getText() {
            r0 = this;
            org.simpleframework.xml.core.Structure r0 = r0.structure
            org.simpleframework.xml.core.Label r0 = r0.getText()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.lang.Class getType() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getValidate() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getValidate()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getVersion() {
            r0 = this;
            org.simpleframework.xml.core.Structure r0 = r0.structure
            org.simpleframework.xml.core.Label r0 = r0.getVersion()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isEmpty() {
            r0 = this;
            org.simpleframework.xml.core.ClassScanner r0 = r0.scanner
            org.simpleframework.xml.Root r0 = r0.getRoot()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isPrimitive() {
            r0 = this;
            org.simpleframework.xml.core.Structure r0 = r0.structure
            boolean r0 = r0.isPrimitive()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner, org.simpleframework.xml.core.Policy
    public boolean isStrict() {
            r0 = this;
            org.simpleframework.xml.core.Detail r0 = r0.detail
            boolean r0 = r0.isStrict()
            return r0
    }
}
