package org.simpleframework.xml.core;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
class Function {
    private final boolean contextual;
    private final Method method;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Function(Method method) {
        this(method, false);
    }

    public Object call(Context context, Object obj) throws Exception {
        if (obj != null) {
            return this.contextual ? this.method.invoke(obj, context.getSession().getMap()) : this.method.invoke(obj, null);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Function(Method method, boolean z) {
        this.contextual = z;
        this.method = method;
    }
}
