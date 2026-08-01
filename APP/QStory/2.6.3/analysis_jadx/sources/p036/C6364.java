package p036;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.reader.C2700;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.api.C3886;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p026.AbstractC6314;
import p033.AbstractC6333;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;
import p305.C8623;
import top.suzhelan.qstory.hook.api.C5812;
import top.suzhelan.qstory.hook.item.C5915;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6364 extends AbstractC6314 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m11945(Context context, Class cls) throws IllegalAccessException, InvocationTargetException {
        Object objM6285;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_cloud);
        int i = AbstractC6358.f17508;
        Class cls2 = Integer.TYPE;
        if (i >= 10290) {
            objM6285 = AbstractC2905.m6285(new Object[]{context, 21004, AbstractC8405.m13972(96), numValueOf, AbstractC8405.m13972(96)}, new Class[]{Context.class, cls2, CharSequence.class, cls2, String.class}, cls);
        } else {
            objM6285 = AbstractC2905.m6285(new Object[]{context, 21004, AbstractC8405.m13972(96), numValueOf}, new Class[]{Context.class, cls2, CharSequence.class, cls2}, cls);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC6333.m11851(cls, new C8623(27))));
        arrayList.sort(Comparator.comparing(new C2700(27)));
        ((Method) arrayList.get(0)).invoke(objM6285, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(80))}, new C6354(context)));
        return objM6285;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m11946(Context context, Class cls) throws IllegalAccessException, InvocationTargetException {
        Object objM6285;
        Integer numValueOf = Integer.valueOf(R.drawable.plugin_icon);
        int i = AbstractC6358.f17508;
        Class cls2 = Integer.TYPE;
        if (i >= 10290) {
            objM6285 = AbstractC2905.m6285(new Object[]{context, 21003, AbstractC8405.m13972(95), numValueOf, AbstractC8405.m13972(95)}, new Class[]{Context.class, cls2, CharSequence.class, cls2, String.class}, cls);
        } else {
            objM6285 = AbstractC2905.m6285(new Object[]{context, 21003, AbstractC8405.m13972(95), numValueOf}, new Class[]{Context.class, cls2, CharSequence.class, cls2}, cls);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC6333.m11851(cls, new C3886(27))));
        arrayList.sort(Comparator.comparing(new C2700(27)));
        ((Method) arrayList.get(0)).invoke(objM6285, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(80))}, new C6362(context)));
        return objM6285;
    }

    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(92));
            C5915 c5915 = new C5915(28);
            XposedHelpers.findAndHookMethod(clsM11866, AbstractC8405.m13972(93), new Object[]{Bundle.class, c5915});
            try {
                XposedHelpers.findAndHookMethod(clsM11866, AbstractC8405.m13972(94), new Object[]{LayoutInflater.class, ViewGroup.class, Bundle.class, c5915});
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            try {
                XposedBridge.hookMethod(AbstractC6333.m11850(AbstractC8405.m13972(91), null, List.class, new Class[]{Context.class}), new C5812(this, 19));
            } catch (Exception unused3) {
            }
            int i = AbstractC6358.f17508;
            if (i >= 12290) {
                C6335 c6335M11854 = C6335.m11854(AbstractC6337.m11866(AbstractC8405.m13972(90)));
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3617 = List.class;
                c1245.f3619 = new Class[]{Context.class};
                XposedBridge.hookMethod(c6335M11854.m11855(), new C5812(this, 19));
                return;
            }
            if (i >= 8156) {
                C6335 c6335M118542 = C6335.m11854(AbstractC6337.m11866(AbstractC8405.m13972(89)));
                C1245 c12452 = c6335M118542.f17458;
                c12452.f3617 = List.class;
                c12452.f3619 = new Class[]{Context.class};
                XposedBridge.hookMethod(c6335M118542.m11855(), new C5812(this, 19));
            }
        }
    }
}
