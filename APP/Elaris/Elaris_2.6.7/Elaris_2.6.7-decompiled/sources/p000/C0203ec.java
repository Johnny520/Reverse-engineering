package p000;

import android.content.Context;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: ec */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203ec {

    /* JADX INFO: renamed from: a */
    public final Constructor f227a;

    /* JADX INFO: renamed from: b */
    public final int f228b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0203ec(Constructor constructor, int i) {
        this.f227a = constructor;
        this.f228b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public Object m344a(Context context, Object obj) {
        Constructor constructor = this.f227a;
        int i = this.f228b;
        if (i == 0) {
            return constructor.newInstance(context, obj);
        }
        if (i == 1) {
            return constructor.newInstance(obj);
        }
        if (i == 2) {
            return constructor.newInstance(context);
        }
        if (i != 4) {
            return constructor.newInstance(null);
        }
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (Context.class.isAssignableFrom(parameterTypes[i2])) {
                objArr[i2] = context;
            } else if (parameterTypes[i2].isInstance(obj)) {
                objArr[i2] = obj;
            } else {
                objArr[i2] = AbstractC0219fc.m392e(parameterTypes[i2]);
            }
        }
        return constructor.newInstance(objArr);
    }
}
