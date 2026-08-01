package p010B3;

import android.content.Intent;
import android.os.Parcelable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p223q1.C2908b;

/* JADX INFO: renamed from: B3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0225d implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object f777a;

    public C0225d(Object obj) {
        this.f777a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.f777a;
        C2908b c2908b = null;
        try {
            if (objArr == null) {
                return method.invoke(obj2, null);
            }
            if (method.getName().equals("startActivity")) {
                boolean zIsAssignableFrom = false;
                int i5 = 0;
                while (true) {
                    if (i5 >= objArr.length) {
                        break;
                    }
                    if (objArr[i5] instanceof Intent) {
                        c2908b = new C2908b(Integer.valueOf(i5), (Intent) objArr[i5]);
                        break;
                    }
                    i5++;
                }
                if (c2908b != null) {
                    Object obj3 = c2908b.f9196b;
                    Intent intent = (Intent) obj3;
                    if (intent.getComponent() != null) {
                        String packageName = intent.getComponent().getPackageName();
                        String className = intent.getComponent().getClassName();
                        if (packageName.equals(AbstractC0222a.f771c.getPackageName())) {
                            try {
                                zIsAssignableFrom = AbstractActivityC0224c.class.isAssignableFrom(AbstractC0222a.f773e.loadClass(className));
                            } catch (Exception unused) {
                            }
                            if (zIsAssignableFrom) {
                                Intent intent2 = new Intent();
                                intent2.setClassName(intent.getComponent().getPackageName(), AbstractC0222a.f772d);
                                intent2.putExtra("miko_activity_proxy_intent", (Parcelable) obj3);
                                objArr[c2908b.f9195a.intValue()] = intent2;
                            }
                        }
                    }
                }
            }
            return method.invoke(obj2, objArr);
        } catch (InvocationTargetException e5) {
            throw e5.getTargetException();
        }
    }
}
