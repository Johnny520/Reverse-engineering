package p347xa;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p230p8.C3364p;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: xa.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5753n {

    /* JADX INFO: renamed from: a */
    public static final C5753n f23422a = new C5753n();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0091 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: a */
    public static List m10450a(C3742g c3742g, C1253k c1253k, InterfaceC1231l interfaceC1231l, C2026t c2026t) {
        ?? c3959f;
        Object c3959f2;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Boolean) interfaceC1231l.invoke(obj)).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Method) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            c2026t.invoke("定位朋友圈头像长按菜单方法失败", thM8182b);
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r5 = c3959f;
        if (z9) {
            r5 = C4173t.f13710g;
        }
        return (List) r5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m10451b(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return m10453d(method) && (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE)) && parameterTypes.length == 2 && MenuItem.class.isAssignableFrom(parameterTypes[0]) && AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m10452c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return m10453d(method) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 3 && ContextMenu.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && parameterTypes[2].getName().equals("android.view.ContextMenu$ContextMenuInfo");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m10453d(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C5754o m10454e(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_sns_avatar_menu_method_cache");
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        List listM2090f = C0828b.m2090f(sharedPreferencesM8640c, strM2091g, classLoader, "avatar_menu_create_v2");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (m10452c((Method) obj)) {
                arrayList.add(obj);
            }
        }
        List listM2090f2 = C0828b.m2090f(sharedPreferencesM8640c, strM2091g, classLoader, "avatar_menu_click_v2");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM2090f2) {
            if (m10451b((Method) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
            return new C5754o(arrayList2, arrayList);
        }
        C1253k c1253k = new C1253k();
        C1253k.m3366q0(c1253k, "void");
        c1253k.m3372o0("android.view.ContextMenu", "android.view.View", "android.view.ContextMenu$ContextMenuInfo");
        c1253k.m3374r0("MMSocialBlackListFlag", "3552365301");
        List listM10450a = m10450a(c3742g, c1253k, new C3364p(1, this, AbstractC0921a.m2246i(C5753n.class), "isCreateMethod", "isCreateMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 15), c2026t);
        C1253k c1253k2 = new C1253k();
        C1253k.m3366q0(c1253k2, "void");
        c1253k2.m3372o0("android.view.MenuItem", "int");
        c1253k2.m3374r0("sns_permission_userName", "clicfg_sns_expose_config_switch_android");
        List listM10450a2 = m10450a(c3742g, c1253k2, new C3364p(1, this, AbstractC0921a.m2246i(C5753n.class), "isClickMethod", "isClickMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 17), c2026t);
        C1253k c1253k3 = new C1253k();
        C1253k.m3366q0(c1253k3, "boolean");
        c1253k3.m3372o0("android.view.MenuItem", "int");
        c1253k3.m3374r0("click AVATER_MENU_ID_PERMISSION", "click AVATER_MENU_ID_EXPOSE");
        List listM10450a3 = m10450a(c3742g, c1253k3, new C3364p(1, this, AbstractC0921a.m2246i(C5753n.class), "isClickMethod", "isClickMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 16), c2026t);
        C1253k c1253k4 = new C1253k();
        C1253k.m3366q0(c1253k4, "void");
        c1253k4.m3372o0("android.view.MenuItem", "int");
        c1253k4.m3374r0("com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$popPermissionMenuWindow$2");
        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(AbstractC4166m.m8397F1(listM10450a2, listM10450a3), m10450a(c3742g, c1253k4, new C3364p(1, this, AbstractC0921a.m2246i(C5753n.class), "isClickMethod", "isClickMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 18), c2026t));
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayListM8397F1) {
            if (hashSet.add(((Method) obj3).toGenericString())) {
                arrayList3.add(obj3);
            }
        }
        boolean zIsEmpty = listM10450a.isEmpty();
        C0828b c0828b = C0828b.f2478a;
        if (zIsEmpty) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
                if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove("avatar_menu_create_v2").apply();
            } catch (Throwable unused) {
            }
        } else {
            c0828b.m2097j(sharedPreferencesM8640c, strM2091g, "avatar_menu_create_v2", listM10450a);
        }
        if (arrayList3.isEmpty()) {
            try {
                SharedPreferences.Editor editorEdit2 = sharedPreferencesM8640c.edit();
                if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit2.clear().putString("cache.key", strM2091g);
                }
                editorEdit2.remove("avatar_menu_click_v2").apply();
            } catch (Throwable unused2) {
            }
        } else {
            c0828b.m2097j(sharedPreferencesM8640c, strM2091g, "avatar_menu_click_v2", arrayList3);
        }
        return new C5754o(arrayList3, listM10450a);
    }
}
