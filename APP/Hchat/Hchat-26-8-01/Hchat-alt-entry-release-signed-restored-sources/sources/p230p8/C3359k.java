package p230p8;

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

/* JADX INFO: renamed from: p8.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3359k {

    /* JADX INFO: renamed from: a */
    public static final C3359k f10842a = new C3359k();

    /* JADX INFO: renamed from: b */
    public static final List f10843b = AbstractC0000a.m101y0("com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$2", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$3", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick$register$1$1$1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ArrayList m7112a(C3742g c3742g, String str, InterfaceC1231l interfaceC1231l) {
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_sns_context_menu_method_cache");
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
    public static List m7113b(C3742g c3742g, C1253k c1253k, String str, InterfaceC1235p interfaceC1235p) {
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
    public static boolean m7114c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isAbstract(method.getModifiers()) && !method.getDeclaringClass().isInterface() && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC1416l.m3825a(method.getName(), "onMMMenuItemSelected") && parameterTypes.length == 2 && MenuItem.class.isAssignableFrom(parameterTypes[0]) && AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m7115d(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isAbstract(method.getModifiers()) && !method.getDeclaringClass().isInterface() && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC1416l.m3825a(method.getName(), "onCreateContextMenu") && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.sns.") && parameterTypes.length == 3 && ContextMenu.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && parameterTypes[2].getName().equals("android.view.ContextMenu$ContextMenuInfo");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static ArrayList m7116g(C3742g c3742g, String str, List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((Method) obj).toGenericString())) {
                arrayList.add(obj);
            }
        }
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_sns_context_menu_method_cache");
        String strM2091g = C0828b.m2091g(c3742g.f12143a, c3742g.f12145c);
        if (arrayList.isEmpty()) {
            C0828b.m2085a(sharedPreferencesM8640c, strM2091g, str);
            return arrayList;
        }
        C0828b.f2478a.m2097j(sharedPreferencesM8640c, strM2091g, str, arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final ArrayList m7117e(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        c3742g.getClass();
        ArrayList arrayListM7112a = m7112a(c3742g, "menu_click_v1", new C0361f(1, this, AbstractC0921a.m2246i(C3359k.class), "isMenuClickMethod", "isMenuClickMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 27));
        if (arrayListM7112a.isEmpty()) {
            arrayListM7112a = null;
        }
        if (arrayListM7112a != null) {
            return arrayListM7112a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1253k c1253k = new C1253k();
        C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("delete comment fail!!! snsInfo is null", "send photo fail, mediaObj is null", "mediaObj is null, send failed!"));
        for (Object obj : m7113b(c3742g, c1253k, "定位朋友圈旧版菜单点击方法失败", interfaceC1235p)) {
            if (m7114c((Method) obj)) {
                linkedHashSet.add(obj);
            }
        }
        for (String str : f10843b) {
            C1253k c1253k2 = new C1253k();
            C1253k.m3367u0(c1253k2, AbstractC0000a.m101y0("onMMMenuItemSelected", str));
            for (Object obj2 : m7113b(c3742g, c1253k2, "定位朋友圈新版菜单点击方法失败: " + str, interfaceC1235p)) {
                if (m7114c((Method) obj2)) {
                    linkedHashSet.add(obj2);
                }
            }
        }
        return m7116g(c3742g, "menu_click_v1", AbstractC4166m.m8407P1(linkedHashSet));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final ArrayList m7118f(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        c3742g.getClass();
        ArrayList arrayListM7112a = m7112a(c3742g, "menu_create_v1", new C0361f(1, this, AbstractC0921a.m2246i(C3359k.class), "isMenuCreateMethod", "isMenuCreateMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 28));
        if (arrayListM7112a.isEmpty()) {
            arrayListM7112a = null;
        }
        if (arrayListM7112a != null) {
            return arrayListM7112a;
        }
        C1253k c1253k = new C1253k();
        C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error"));
        List listM7113b = m7113b(c3742g, c1253k, "定位朋友圈菜单创建方法失败", interfaceC1235p);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM7113b) {
            if (m7115d((Method) obj)) {
                arrayList.add(obj);
            }
        }
        return m7116g(c3742g, "menu_create_v1", arrayList);
    }
}
