package p372;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.util.C3020;
import com.bumptech.glide.AbstractC3888;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.apache.commons.lang3.event.EventListenerSupport;
import p398.AbstractC9831;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9728 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f25429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25430;

    public /* synthetic */ C9728(Object obj, int i) {
        this.f25430 = i;
        this.f25429 = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        int i = this.f25430;
        C3020 c3020 = null;
        Object obj2 = this.f25429;
        switch (i) {
            case 0:
                Iterator it = ((EventListenerSupport) obj2).listeners.iterator();
                while (it.hasNext()) {
                    method.invoke(it.next(), objArr);
                }
                return null;
            default:
                try {
                    if (objArr == null) {
                        return method.invoke(obj2, null);
                    }
                    if (method.getName().equals("startActivity")) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < objArr.length) {
                                if (objArr[i2] instanceof Intent) {
                                    c3020 = new C3020(Integer.valueOf(i2), (Intent) objArr[i2]);
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (c3020 != null) {
                            Object obj3 = c3020.f6804;
                            Intent intent = (Intent) obj3;
                            ComponentName component = intent.getComponent();
                            if (component != null) {
                                String packageName = component.getPackageName();
                                String className = component.getClassName();
                                if (packageName.equals(AbstractC3888.f10105.getPackageName()) && AbstractC9831.m15171(className)) {
                                    Intent intent2 = new Intent();
                                    intent2.setClassName(component.getPackageName(), AbstractC9831.f25623);
                                    String stringExtra = intent.getStringExtra("proxy_target_activity");
                                    if (stringExtra != null) {
                                        intent2.setClassName(component.getPackageName(), stringExtra);
                                    }
                                    intent2.putExtra(AbstractC9831.f25622, (Parcelable) obj3);
                                    objArr[((Integer) c3020.f6805).intValue()] = intent2;
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
}
