package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.stream.InputNode;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class ObjectFactory extends PrimitiveFactory {
    public ObjectFactory(Context context, Type type, Class cls) {
        super(context, type, cls);
    }

    @Override // org.simpleframework.xml.core.PrimitiveFactory
    public Instance getInstance(InputNode inputNode) {
        Value override = getOverride(inputNode);
        Class type = getType();
        if (override != null) {
            return new ObjectInstance(this.context, override);
        }
        if (Factory.isInstantiable(type)) {
            return this.context.getInstance(type);
        }
        throw new InstantiationException("Cannot instantiate %s for %s", type, this.type);
    }
}
