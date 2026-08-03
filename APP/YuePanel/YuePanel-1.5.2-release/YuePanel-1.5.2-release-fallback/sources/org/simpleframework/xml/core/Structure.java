package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Structure {
    private final org.simpleframework.xml.core.Instantiator factory;
    private final org.simpleframework.xml.core.Model model;
    private final boolean primitive;
    private final org.simpleframework.xml.core.Label text;
    private final org.simpleframework.xml.core.Label version;

    public Structure(org.simpleframework.xml.core.Instantiator r1, org.simpleframework.xml.core.Model r2, org.simpleframework.xml.core.Label r3, org.simpleframework.xml.core.Label r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.primitive = r5
            r0.factory = r1
            r0.version = r3
            r0.model = r2
            r0.text = r4
            return
    }

    public org.simpleframework.xml.core.Instantiator getInstantiator() {
            r1 = this;
            org.simpleframework.xml.core.Instantiator r0 = r1.factory
            return r0
    }

    public org.simpleframework.xml.Version getRevision() {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.version
            if (r0 == 0) goto L11
            org.simpleframework.xml.core.Contact r0 = r0.getContact()
            java.lang.Class<org.simpleframework.xml.Version> r1 = org.simpleframework.xml.Version.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            org.simpleframework.xml.Version r0 = (org.simpleframework.xml.Version) r0
            return r0
        L11:
            r0 = 0
            return r0
    }

    public org.simpleframework.xml.core.Section getSection() {
            r2 = this;
            org.simpleframework.xml.core.ModelSection r0 = new org.simpleframework.xml.core.ModelSection
            org.simpleframework.xml.core.Model r1 = r2.model
            r0.<init>(r1)
            return r0
    }

    public org.simpleframework.xml.core.Label getText() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.text
            return r0
    }

    public org.simpleframework.xml.core.Label getVersion() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.version
            return r0
    }

    public boolean isPrimitive() {
            r1 = this;
            boolean r0 = r1.primitive
            return r0
    }
}
