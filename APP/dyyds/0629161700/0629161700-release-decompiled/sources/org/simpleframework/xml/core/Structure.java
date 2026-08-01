package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = this;
            org.simpleframework.xml.core.Instantiator r0 = r0.factory
            return r0
    }

    public org.simpleframework.xml.Version getRevision() {
            r1 = this;
            org.simpleframework.xml.core.Label r1 = r1.version
            if (r1 == 0) goto L11
            org.simpleframework.xml.core.Contact r1 = r1.getContact()
            java.lang.Class<org.simpleframework.xml.Version> r0 = org.simpleframework.xml.Version.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            org.simpleframework.xml.Version r1 = (org.simpleframework.xml.Version) r1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public org.simpleframework.xml.core.Section getSection() {
            r1 = this;
            org.simpleframework.xml.core.ModelSection r0 = new org.simpleframework.xml.core.ModelSection
            org.simpleframework.xml.core.Model r1 = r1.model
            r0.<init>(r1)
            return r0
    }

    public org.simpleframework.xml.core.Label getText() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.text
            return r0
    }

    public org.simpleframework.xml.core.Label getVersion() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.version
            return r0
    }

    public boolean isPrimitive() {
            r0 = this;
            boolean r0 = r0.primitive
            return r0
    }
}
