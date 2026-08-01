package p052;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.reader.C3533;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.api.C4718;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p042.AbstractC7143;
import p049.AbstractC7162;
import p049.AbstractC7166;
import p049.C7164;
import p321.C9452;
import top.suzhelan.qstory.hook.api.C6642;
import top.suzhelan.qstory.hook.item.C6745;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7193 extends AbstractC7143 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m12504(Context context, Class cls) throws IllegalAccessException, InvocationTargetException {
        Object objM6845;
        Integer numValueOf = Integer.valueOf(C0328R.drawable.ic_cloud);
        int i = AbstractC7187.f17853;
        Class cls2 = Integer.TYPE;
        if (i >= 10290) {
            objM6845 = AbstractC3738.m6845(new Object[]{context, 21004, "在线脚本", numValueOf, "在线脚本"}, new Class[]{Context.class, cls2, CharSequence.class, cls2, String.class}, cls);
        } else {
            objM6845 = AbstractC3738.m6845(new Object[]{context, 21004, "在线脚本", numValueOf}, new Class[]{Context.class, cls2, CharSequence.class, cls2}, cls);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC7162.m12410(cls, new C9452(27))));
        arrayList.sort(Comparator.comparing(new C3533(27)));
        ((Method) arrayList.get(0)).invoke(objM6845, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("kotlin.jvm.functions.Function0")}, new C7183(context)));
        return objM6845;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m12505(Context context, Class cls) throws IllegalAccessException, InvocationTargetException {
        Object objM6845;
        Integer numValueOf = Integer.valueOf(C0328R.drawable.plugin_icon);
        int i = AbstractC7187.f17853;
        Class cls2 = Integer.TYPE;
        if (i >= 10290) {
            objM6845 = AbstractC3738.m6845(new Object[]{context, 21003, "Java脚本", numValueOf, "Java脚本"}, new Class[]{Context.class, cls2, CharSequence.class, cls2, String.class}, cls);
        } else {
            objM6845 = AbstractC3738.m6845(new Object[]{context, 21003, "Java脚本", numValueOf}, new Class[]{Context.class, cls2, CharSequence.class, cls2}, cls);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC7162.m12410(cls, new C4718(27))));
        arrayList.sort(Comparator.comparing(new C3533(27)));
        ((Method) arrayList.get(0)).invoke(objM6845, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("kotlin.jvm.functions.Function0")}, new C7191(context)));
        return objM6845;
    }

    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        try {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.activity.QQSettingSettingActivity");
            C6745 c6745 = new C6745(28);
            XposedHelpers.findAndHookMethod(clsM12425, "doOnCreate", new Object[]{Bundle.class, c6745});
            try {
                XposedHelpers.findAndHookMethod(clsM12425, "doOnCreateView", new Object[]{LayoutInflater.class, ViewGroup.class, Bundle.class, c6745});
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            try {
                XposedBridge.hookMethod(AbstractC7162.m12409("com.tencent.mobileqq.setting.main.MainSettingConfigProvider", null, List.class, new Class[]{Context.class}), new C6642(this, 19));
            } catch (Exception unused3) {
            }
            int i = AbstractC7187.f17853;
            if (i >= 12290) {
                C7164 c7164M12413 = C7164.m12413(AbstractC7166.m12425("com.tencent.mobileqq.setting.main.b"));
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3962 = List.class;
                c2080.f3964 = new Class[]{Context.class};
                XposedBridge.hookMethod(c7164M12413.m12414(), new C6642(this, 19));
                return;
            }
            if (i >= 8156) {
                C7164 c7164M124132 = C7164.m12413(AbstractC7166.m12425("com.tencent.mobileqq.setting.main.NewSettingConfigProvider"));
                C2080 c20802 = c7164M124132.f17803;
                c20802.f3962 = List.class;
                c20802.f3964 = new Class[]{Context.class};
                XposedBridge.hookMethod(c7164M124132.m12414(), new C6642(this, 19));
            }
        }
    }
}
