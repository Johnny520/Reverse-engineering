package p136j8;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import ch.C0570e;
import gg.AbstractC1416l;
import gh.C1431c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p027c0.C0361f;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p115hh.C1730o;
import p115hh.C1731p;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: j8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2090a {

    /* JADX INFO: renamed from: a */
    public static final C2090a f6994a = new C2090a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ArrayList m5146a(C3742g c3742g, String str, InterfaceC1231l interfaceC1231l) {
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_favorite_menu_method_cache");
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        List listM2090f = C0828b.m2090f(sharedPreferencesM8640c, C0828b.m2091g(context, classLoader), classLoader, str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (((Boolean) interfaceC1231l.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Method) obj2).toGenericString())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x006e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: b */
    public static List m5147b(C3742g c3742g, C1253k c1253k, String str, InterfaceC1235p interfaceC1235p) {
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
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((Method) obj).toGenericString())) {
                    c3959f.add(obj);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            interfaceC1235p.invoke(str, thM8182b);
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r42 = c3959f;
        if (z9) {
            r42 = C4173t.f13710g;
        }
        return (List) r42;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m5148c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 2 && MenuItem.class.isAssignableFrom(parameterTypes[0]) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.fav.ui.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m5149d(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.fav.ui.") && parameterTypes.length == 3 && View.class.isAssignableFrom(parameterTypes[1]) && (ContextMenu.class.isAssignableFrom(parameterTypes[0]) || AbstractC1416l.m3825a(method.getName(), "a"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m5150e(Method method) {
        return m5149d(method) || (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC1416l.m3825a(method.getName(), "onCreateMMMenu") && method.getParameterTypes().length == 1 && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.fav.ui.detail."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final ArrayList m5151f(C3742g c3742g, boolean z9, InterfaceC1235p interfaceC1235p) {
        c3742g.getClass();
        String str = z9 ? "menu_click_all_v1" : "menu_click_list_v1";
        ArrayList arrayListM5146a = m5146a(c3742g, str, new C0361f(1, f6994a, AbstractC0921a.m2246i(C2090a.class), "isFavoriteClickMethod", "isFavoriteClickMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 24));
        if (arrayListM5146a.isEmpty()) {
            arrayListM5146a = null;
        }
        if (arrayListM5146a != null) {
            return arrayListM5146a;
        }
        C1253k c1253k = new C1253k();
        c1253k.f4103g = new C1431c("onMMMenuItemSelected", 5);
        C1253k.m3366q0(c1253k, "void");
        c1253k.m3372o0("android.view.MenuItem", "int");
        if (!z9) {
            C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("do transmit, long click info is %s", "do edit, long click info is %s", "do tag, long click info is %s"));
        }
        List listM5147b = m5147b(c3742g, c1253k, "定位收藏菜单点击方法失败", interfaceC1235p);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM5147b) {
            if (m5148c((Method) obj)) {
                arrayList.add(obj);
            }
        }
        return m5153h(c3742g, str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final ArrayList m5152g(C3742g c3742g, boolean z9, InterfaceC1235p interfaceC1235p) {
        c3742g.getClass();
        String str = z9 ? "menu_create_all_v1" : "menu_create_list_v1";
        ArrayList arrayListM5146a = m5146a(c3742g, str, new C0361f(1, f6994a, AbstractC0921a.m2246i(C2090a.class), "isFavoriteMenuCreateMethod", "isFavoriteMenuCreateMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 25));
        if (arrayListM5146a.isEmpty()) {
            arrayListM5146a = null;
        }
        if (arrayListM5146a != null) {
            return arrayListM5146a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1253k c1253k = new C1253k();
        C1253k.m3367u0(c1253k, AbstractC0000a.m99x0("OnCreateContextMMMenu"));
        for (Object obj : m5147b(c3742g, c1253k, "定位收藏列表菜单创建方法失败", interfaceC1235p)) {
            if (m5149d((Method) obj)) {
                linkedHashSet.add(obj);
            }
        }
        if (z9) {
            C1253k c1253k2 = new C1253k();
            c1253k2.f4103g = new C1431c("onCreateContextMenu", 5);
            C1253k.m3366q0(c1253k2, "void");
            c1253k2.m3372o0("android.view.ContextMenu", "android.view.View", "android.view.ContextMenu$ContextMenuInfo");
            for (Object obj2 : m5147b(c3742g, c1253k2, "定位收藏搜索菜单创建方法失败", interfaceC1235p)) {
                if (m5150e((Method) obj2)) {
                    linkedHashSet.add(obj2);
                }
            }
            C1253k c1253k3 = new C1253k();
            c1253k3.f4103g = new C1431c("onCreateMMMenu", 5);
            C1253k.m3366q0(c1253k3, "void");
            for (Object obj3 : m5147b(c3742g, c1253k3, "定位收藏详情菜单创建方法失败", interfaceC1235p)) {
                if (m5150e((Method) obj3)) {
                    linkedHashSet.add(obj3);
                }
            }
        }
        return m5153h(c3742g, str, AbstractC4166m.m8407P1(linkedHashSet));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static ArrayList m5153h(C3742g c3742g, String str, List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((Method) obj).toGenericString())) {
                arrayList.add(obj);
            }
        }
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_favorite_menu_method_cache");
        String strM2091g = C0828b.m2091g(c3742g.f12143a, c3742g.f12145c);
        if (arrayList.isEmpty()) {
            C0828b.m2085a(sharedPreferencesM8640c, strM2091g, str);
            return arrayList;
        }
        C0828b.f2478a.m2097j(sharedPreferencesM8640c, strM2091g, str, arrayList);
        return arrayList;
    }
}
