package org.simpleframework.xml.core;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class Function {
    private final boolean contextual;
    private final Method method;

    public Function(Method method, boolean z) {
        this.contextual = z;
        this.method = method;
    }

    public Object call(Context context, Object obj) {
        if (obj == null) {
            return null;
        }
        Map map = context.getSession().getMap();
        boolean z = this.contextual;
        Method method = this.method;
        return z ? method.invoke(obj, map) : method.invoke(obj, null);
    }

    public Function(Method method) {
        this(method, false);
    }
}
