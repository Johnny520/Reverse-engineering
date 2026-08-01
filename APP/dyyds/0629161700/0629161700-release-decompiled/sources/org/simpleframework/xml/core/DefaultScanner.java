package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class DefaultScanner implements org.simpleframework.xml.core.Scanner {
    private org.simpleframework.xml.core.Detail detail;
    private org.simpleframework.xml.core.Scanner scanner;

    public DefaultScanner(org.simpleframework.xml.core.Detail r3, org.simpleframework.xml.core.Support r4) {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.core.DefaultDetail r0 = new org.simpleframework.xml.core.DefaultDetail
            org.simpleframework.xml.DefaultType r1 = org.simpleframework.xml.DefaultType.FIELD
            r0.<init>(r3, r1)
            r2.detail = r0
            org.simpleframework.xml.core.ObjectScanner r3 = new org.simpleframework.xml.core.ObjectScanner
            r3.<init>(r0, r4)
            r2.scanner = r3
            return
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Caller getCaller(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Caller r0 = r0.getCaller(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getCommit() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getCommit()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getComplete() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getComplete()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Decorator r0 = r0.getDecorator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Instantiator getInstantiator() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
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
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.Order r0 = r0.getOrder()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.ParameterMap getParameters() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.ParameterMap r0 = r0.getParameters()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getPersist() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getPersist()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getReplace() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getReplace()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getResolve() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getResolve()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.Version getRevision() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.Version r0 = r0.getRevision()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Section getSection() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Section r0 = r0.getSection()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Signature getSignature() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Signature r0 = r0.getSignature()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.util.List<org.simpleframework.xml.core.Signature> getSignatures() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            java.util.List r0 = r0.getSignatures()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getText() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Label r0 = r0.getText()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public java.lang.Class getType() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Function getValidate() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Function r0 = r0.getValidate()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public org.simpleframework.xml.core.Label getVersion() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            org.simpleframework.xml.core.Label r0 = r0.getVersion()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isEmpty() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner
    public boolean isPrimitive() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            boolean r0 = r0.isPrimitive()
            return r0
    }

    @Override // org.simpleframework.xml.core.Scanner, org.simpleframework.xml.core.Policy
    public boolean isStrict() {
            r0 = this;
            org.simpleframework.xml.core.Scanner r0 = r0.scanner
            boolean r0 = r0.isStrict()
            return r0
    }
}
