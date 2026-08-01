package p356;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.util.C2187;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.apache.commons.lang3.event.EventListenerSupport;
import p382.AbstractC9002;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8899 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f25084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25085;

    public /* synthetic */ C8899(Object obj, int i) {
        this.f25085 = i;
        this.f25084 = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        int i = this.f25085;
        C2187 c2187 = null;
        Object obj2 = this.f25084;
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
                                    c2187 = new C2187(Integer.valueOf(i2), (Intent) objArr[i2]);
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (c2187 != null) {
                            Object obj3 = c2187.f6459;
                            Intent intent = (Intent) obj3;
                            ComponentName component = intent.getComponent();
                            if (component != null) {
                                String packageName = component.getPackageName();
                                String className = component.getClassName();
                                if (packageName.equals(AbstractC3056.f9760.getPackageName()) && AbstractC9002.m14612(className)) {
                                    Intent intent2 = new Intent();
                                    intent2.setClassName(component.getPackageName(), AbstractC9002.f25278);
                                    String stringExtra = intent.getStringExtra("proxy_target_activity");
                                    if (stringExtra != null) {
                                        intent2.setClassName(component.getPackageName(), stringExtra);
                                    }
                                    intent2.putExtra(AbstractC9002.f25277, (Parcelable) obj3);
                                    objArr[((Integer) c2187.f6460).intValue()] = intent2;
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
