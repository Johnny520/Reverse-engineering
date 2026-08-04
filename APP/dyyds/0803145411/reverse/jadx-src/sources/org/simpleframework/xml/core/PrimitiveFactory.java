package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.stream.InputNode;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class PrimitiveFactory extends Factory {
    public PrimitiveFactory(Context context, Type type) {
        super(context, type);
    }

    public Instance getInstance(InputNode inputNode) {
        Value override = getOverride(inputNode);
        Class type = getType();
        Context context = this.context;
        return override == null ? context.getInstance(type) : new ObjectInstance(context, override);
    }

    public String getText(Object obj) {
        Class<?> cls = obj.getClass();
        boolean zIsEnum = cls.isEnum();
        Support support = this.support;
        return zIsEnum ? support.write(obj, cls) : support.write(obj, cls);
    }

    public PrimitiveFactory(Context context, Type type, Class cls) {
        super(context, type, cls);
    }

    public Object getInstance(String str, Class cls) {
        return this.support.read(str, cls);
    }
}
