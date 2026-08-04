package org.simpleframework.xml.core;

import org.simpleframework.xml.Version;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class Structure {
    private final Instantiator factory;
    private final Model model;
    private final boolean primitive;
    private final Label text;
    private final Label version;

    public Structure(Instantiator instantiator, Model model, Label label, Label label2, boolean z) {
        this.primitive = z;
        this.factory = instantiator;
        this.version = label;
        this.model = model;
        this.text = label2;
    }

    public Instantiator getInstantiator() {
        return this.factory;
    }

    public Version getRevision() {
        Label label = this.version;
        if (label != null) {
            return (Version) label.getContact().getAnnotation(Version.class);
        }
        return null;
    }

    public Section getSection() {
        return new ModelSection(this.model);
    }

    public Label getText() {
        return this.text;
    }

    public Label getVersion() {
        return this.version;
    }

    public boolean isPrimitive() {
        return this.primitive;
    }
}
