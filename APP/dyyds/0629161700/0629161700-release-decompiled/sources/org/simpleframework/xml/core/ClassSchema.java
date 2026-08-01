package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ClassSchema implements org.simpleframework.xml.core.Schema {
    private final org.simpleframework.xml.core.Caller caller;
    private final org.simpleframework.xml.core.Decorator decorator;
    private final org.simpleframework.xml.core.Instantiator factory;
    private final boolean primitive;
    private final org.simpleframework.xml.Version revision;
    private final org.simpleframework.xml.core.Section section;
    private final org.simpleframework.xml.core.Label text;
    private final java.lang.Class type;
    private final org.simpleframework.xml.core.Label version;

    public ClassSchema(org.simpleframework.xml.core.Scanner r1, org.simpleframework.xml.core.Context r2) {
            r0 = this;
            r0.<init>()
            org.simpleframework.xml.core.Caller r2 = r1.getCaller(r2)
            r0.caller = r2
            org.simpleframework.xml.core.Instantiator r2 = r1.getInstantiator()
            r0.factory = r2
            org.simpleframework.xml.Version r2 = r1.getRevision()
            r0.revision = r2
            org.simpleframework.xml.core.Decorator r2 = r1.getDecorator()
            r0.decorator = r2
            boolean r2 = r1.isPrimitive()
            r0.primitive = r2
            org.simpleframework.xml.core.Label r2 = r1.getVersion()
            r0.version = r2
            org.simpleframework.xml.core.Section r2 = r1.getSection()
            r0.section = r2
            org.simpleframework.xml.core.Label r2 = r1.getText()
            r0.text = r2
            java.lang.Class r1 = r1.getType()
            r0.type = r1
            return
    }

    @Override // org.simpleframework.xml.core.Schema
    public org.simpleframework.xml.core.Caller getCaller() {
            r0 = this;
            org.simpleframework.xml.core.Caller r0 = r0.caller
            return r0
    }

    @Override // org.simpleframework.xml.core.Schema
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Decorator r0 = r0.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.Schema
    public org.simpleframework.xml.core.Instantiator getInstantiator() {
            r0 = this;
            org.simpleframework.xml.core.Instantiator r0 = r0.factory
            return r0
    }

    @Override // org.simpleframework.xml.core.Schema
    public org.simpleframework.xml.Version getRevision() {
            r0 = this;
            org.simpleframework.xml.Version r0 = r0.revision
            return r0
    }

    @Override // org.simpleframework.xml.core.Schema
    public org.simpleframework.xml.core.Section getSection() {
            r0 = this;
            org.simpleframework.xml.core.Section r0 = r0.section
            return r0
    }

    @Override // org.simpleframework.xml.core.Schema
    public org.simpleframework.xml.core.Label getText() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.text
            return r0
    }

    @Override // org.simpleframework.xml.core.Schema
    public org.simpleframework.xml.core.Label getVersion() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.version
            return r0
    }

    @Override // org.simpleframework.xml.core.Schema
    public boolean isPrimitive() {
            r0 = this;
            boolean r0 = r0.primitive
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.Class r2 = r2.type
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "schema for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
