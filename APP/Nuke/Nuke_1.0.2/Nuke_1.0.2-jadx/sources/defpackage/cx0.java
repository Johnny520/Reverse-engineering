package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 implements InvocationHandler {
    public final Object a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cx0(Object obj) {
        this.a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.a;
        pw1 pw1Var = null;
        try {
            if (objArr == null) {
                return method.invoke(obj2, null);
            }
            if (method.getName().equals("startActivity")) {
                boolean zIsAssignableFrom = false;
                int i = 0;
                while (true) {
                    if (i >= objArr.length) {
                        break;
                    }
                    if (objArr[i] instanceof Intent) {
                        pw1Var = new pw1(Integer.valueOf(i), (Intent) objArr[i]);
                        break;
                    }
                    i++;
                }
                if (pw1Var != null) {
                    Object obj3 = pw1Var.b;
                    Intent intent = (Intent) obj3;
                    if (intent.getComponent() != null) {
                        String packageName = intent.getComponent().getPackageName();
                        String className = intent.getComponent().getClassName();
                        if (packageName.equals(c5.b.getPackageName())) {
                            try {
                                zIsAssignableFrom = qj.class.isAssignableFrom(c5.d.loadClass(className));
                            } catch (Exception unused) {
                            }
                            if (zIsAssignableFrom) {
                                Intent intent2 = new Intent();
                                intent2.setClassName(intent.getComponent().getPackageName(), c5.c);
                                intent2.putExtra("miko_activity_proxy_intent", (Parcelable) obj3);
                                objArr[pw1Var.a.intValue()] = intent2;
                            }
                        }
                    }
                }
            }
            return method.invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
