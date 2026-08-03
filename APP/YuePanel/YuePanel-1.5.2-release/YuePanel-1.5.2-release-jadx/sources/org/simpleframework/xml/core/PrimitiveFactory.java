package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.stream.InputNode;

/* JADX INFO: loaded from: classes2.dex */
class PrimitiveFactory extends Factory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PrimitiveFactory(Context context, Type type) {
        super(context, type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Instance getInstance(InputNode inputNode) throws Exception {
        Value override = getOverride(inputNode);
        return override == null ? this.context.getInstance(getType()) : new ObjectInstance(this.context, override);
    }

    public String getText(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        return cls.isEnum() ? this.support.write(obj, cls) : this.support.write(obj, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PrimitiveFactory(Context context, Type type, Class cls) {
        super(context, type, cls);
    }

    public Object getInstance(String str, Class cls) throws Exception {
        return this.support.read(str, cls);
    }
}
