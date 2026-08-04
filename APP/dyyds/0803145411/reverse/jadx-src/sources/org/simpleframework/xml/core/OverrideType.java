package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.strategy.Type;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class OverrideType implements Type {
    private final Class override;
    private final Type type;

    public OverrideType(Type type, Class cls) {
        this.override = cls;
        this.type = type;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.type.getAnnotation(cls);
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Class getType() {
        return this.override;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public String toString() {
        return this.type.toString();
    }
}
