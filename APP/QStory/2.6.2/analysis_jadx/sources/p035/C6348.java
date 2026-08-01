package p035;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.reader.C2699;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.api.C3885;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p000.AbstractC6087;
import p026.AbstractC6296;
import p032.AbstractC6314;
import p032.AbstractC6318;
import p032.C6316;
import p305.C8631;
import top.suzhelan.qstory.hook.api.C5811;
import top.suzhelan.qstory.hook.item.C5909;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6348 extends AbstractC6296 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m11897(Context context, Class cls) throws IllegalAccessException, InvocationTargetException {
        Object objM11389;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_cloud);
        int i = AbstractC6340.f17461;
        Class cls2 = Integer.TYPE;
        if (i >= 10290) {
            objM11389 = AbstractC6087.m11389(new Object[]{context, 21004, AbstractC3056.m6668(-3937569344964527527L), numValueOf, AbstractC3056.m6668(-3937569344964527527L)}, new Class[]{Context.class, cls2, CharSequence.class, cls2, String.class}, cls);
        } else {
            objM11389 = AbstractC6087.m11389(new Object[]{context, 21004, AbstractC3056.m6668(-3937569344964527527L), numValueOf}, new Class[]{Context.class, cls2, CharSequence.class, cls2}, cls);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC6314.m11823(cls, new C8631(27))));
        arrayList.sort(Comparator.comparing(new C2699(27)));
        ((Method) arrayList.get(0)).invoke(objM11389, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937553702693635495L))}, new C6346(context)));
        return objM11389;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m11898(Context context, Class cls) throws IllegalAccessException, InvocationTargetException {
        Object objM11389;
        Integer numValueOf = Integer.valueOf(R.drawable.plugin_icon);
        int i = AbstractC6340.f17461;
        Class cls2 = Integer.TYPE;
        if (i >= 10290) {
            objM11389 = AbstractC6087.m11389(new Object[]{context, 21003, AbstractC3056.m6668(-3937569452338709927L), numValueOf, AbstractC3056.m6668(-3937569452338709927L)}, new Class[]{Context.class, cls2, CharSequence.class, cls2, String.class}, cls);
        } else {
            objM11389 = AbstractC6087.m11389(new Object[]{context, 21003, AbstractC3056.m6668(-3937569452338709927L), numValueOf}, new Class[]{Context.class, cls2, CharSequence.class, cls2}, cls);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC6314.m11823(cls, new C3885(27))));
        arrayList.sort(Comparator.comparing(new C2699(27)));
        ((Method) arrayList.get(0)).invoke(objM11389, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937553702693635495L))}, new C6349(context)));
        return objM11389;
    }

    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937569791641126311L));
            C5909 c5909 = new C5909(28);
            XposedHelpers.findAndHookMethod(clsM11838, AbstractC3056.m6668(-3937569478108513703L), new Object[]{Bundle.class, c5909});
            try {
                XposedHelpers.findAndHookMethod(clsM11838, AbstractC3056.m6668(-3937569525353153959L), new Object[]{LayoutInflater.class, ViewGroup.class, Bundle.class, c5909});
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            try {
                XposedBridge.hookMethod(AbstractC6314.m11822(AbstractC3056.m6668(-3937570049339164071L), null, List.class, new Class[]{Context.class}), new C5811(this, 19));
            } catch (Exception unused3) {
            }
            int i = AbstractC6340.f17461;
            if (i >= 12290) {
                C6316 c6316M11826 = C6316.m11826(AbstractC6318.m11838(AbstractC3056.m6668(-3937570203957986727L)));
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3616 = List.class;
                c1245.f3618 = new Class[]{Context.class};
                XposedBridge.hookMethod(c6316M11826.m11827(), new C5811(this, 19));
                return;
            }
            if (i >= 8156) {
                C6316 c6316M118262 = C6316.m11826(AbstractC6318.m11838(AbstractC3056.m6668(-3937570465950991783L)));
                C1245 c12452 = c6316M118262.f17409;
                c12452.f3616 = List.class;
                c12452.f3618 = new Class[]{Context.class};
                XposedBridge.hookMethod(c6316M118262.m11827(), new C5811(this, 19));
            }
        }
    }
}
