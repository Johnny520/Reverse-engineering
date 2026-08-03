package p168l9;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p062e8.C0828b;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p218og.AbstractC3149m;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: l9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2538d {

    /* JADX INFO: renamed from: h */
    public static final List f8208h = AbstractC0000a.m101y0("com.tencent.mm.ui.mvvm.MvvmSelectContactUI", "com.tencent.mm.ui.mvvm.MvvmContactListUI");

    /* JADX INFO: renamed from: a */
    public final C3742g f8209a;

    /* JADX INFO: renamed from: b */
    public final C2026t f8210b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f8211c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f8212d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap.KeySetView f8213e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8214f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f8215g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2538d(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f8209a = c3742g;
        this.f8210b = c2026t;
        Context context = c3742g.f12143a;
        this.f8211c = AbstractC4302b.m8640c(context, "Hchat_remove_forward_limit_config");
        this.f8212d = AbstractC4302b.m8640c(context, "Hchat_remove_forward_limit_method_cache");
        this.f8213e = ConcurrentHashMap.newKeySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m5952c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (method.getDeclaringClass().getName().equals("com.tencent.mm.ui.transmit.SelectConversationUI")) {
            Class<?> returnType = method.getReturnType();
            Class cls = Boolean.TYPE;
            if (AbstractC1416l.m3825a(returnType, cls) && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], cls) && !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m5953d(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return (parameterTypes.length != 0 || AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) || method.getReturnType().isPrimitive() || Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m5954h(Intent intent) {
        if ((intent.getIntExtra("list_type", -1) == 14 || intent.getBooleanExtra("ForwardParams_ForwardByUIC", false) || intent.hasExtra("Retr_Msg_Id") || intent.hasExtra("Retr_Msg_view_model")) && intent.getIntExtra("max_limit_num", -1) == 9) {
            intent.putExtra("max_limit_num", Integer.MAX_VALUE);
            intent.removeExtra("too_many_member_tip_string");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m5955a(Method method, String str, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        ConcurrentHashMap.KeySetView keySetView = this.f8213e;
        if (!keySetView.add(method)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(method, new C2537c(interfaceC1231l, 0));
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            keySetView.remove(method);
            this.f8210b.invoke(str + " Hook 安装失败: " + method.toGenericString(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5956b(Method method) {
        Method methodFindDeclaredMethod;
        if (m5955a(method, "转发会话数量限制", new C2536b(this, 2))) {
            List list = f8208h;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                Method method2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Class<?> clsLoadClass = KavaReflector.loadClass((String) it.next(), this.f8209a.f12145c);
                if (clsLoadClass != null && (methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(clsLoadClass, "onCreate", Bundle.class)) != null && AbstractC1416l.m3825a(methodFindDeclaredMethod.getReturnType(), Void.TYPE) && !Modifier.isStatic(methodFindDeclaredMethod.getModifiers()) && !Modifier.isAbstract(methodFindDeclaredMethod.getModifiers())) {
                    method2 = methodFindDeclaredMethod;
                }
                if (method2 != null) {
                    arrayList.add(method2);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((Method) obj).toGenericString())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                this.f8210b.invoke("未找到转发完整联系人选择页", null);
                return false;
            }
            ArrayList<Boolean> arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Boolean.valueOf(m5955a((Method) it2.next(), "转发完整联系人选择页", new C2536b(this, 0))));
            }
            if (!arrayList3.isEmpty()) {
                for (Boolean bool : arrayList3) {
                    bool.getClass();
                    if (!bool.booleanValue()) {
                    }
                }
            }
            this.f8214f = true;
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Method m5957e() {
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.transmit.SelectConversationUI", this.f8209a.f12145c);
        if (clsLoadClass == null) {
            return null;
        }
        List<Method> listDeclaredMethods = KavaReflector.declaredMethods(clsLoadClass);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDeclaredMethods) {
            if (m5952c((Method) obj)) {
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
        return (Method) AbstractC4166m.m8400I1(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00d6 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    public final Method m5958f() {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f8209a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        if (AbstractC3149m.m6721t0(strM2091g)) {
            strM2091g = null;
        }
        String strConcat = strM2091g != null ? strM2091g.concat("|remove_forward_limit_v3") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = this.f8212d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "select_conversation_limit");
        if (methodM2087c != null) {
            if (m5952c(methodM2087c)) {
                return methodM2087c;
            }
            C0828b.m2085a(sharedPreferences, strConcat, "select_conversation_limit");
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3369l0(5, "com.tencent.mm.ui.transmit.SelectConversationUI");
            c1253k.m3374r0("max_limit_num");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
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
                if (m5952c((Method) obj)) {
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
        C2026t c2026t = this.f8210b;
        Object obj3 = c3959f;
        if (thM8182b != null) {
            c2026t.invoke("定位转发会话数量限制方法失败", thM8182b);
            obj3 = C4173t.f13710g;
        }
        List list = (List) obj3;
        Method method2 = (Method) AbstractC4166m.m8400I1(list);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "select_conversation_limit", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("select_conversation_limit").apply();
            } catch (Throwable unused) {
            }
            c2026t.invoke("转发会话数量限制方法定位结果异常: count=" + list.size(), null);
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00d4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public final Method m5959g() {
        ?? c3959f;
        Object c3959f2;
        C3742g c3742g = this.f8209a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        if (AbstractC3149m.m6721t0(strM2091g)) {
            strM2091g = null;
        }
        String strConcat = strM2091g != null ? strM2091g.concat("|remove_forward_limit_v3") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = this.f8212d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "uic_contact_config");
        if (methodM2087c != null) {
            if (m5953d(methodM2087c)) {
                return methodM2087c;
            }
            C0828b.m2085a(sharedPreferences, strConcat, "uic_contact_config");
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("min_limit_num", "max_limit_num", "ForwardParams_ForwardByUIC");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
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
                if (m5953d((Method) obj)) {
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
        C2026t c2026t = this.f8210b;
        if (thM8182b != null) {
            c2026t.invoke("定位新版转发联系人配置失败", thM8182b);
            return null;
        }
        List list = (List) c3959f;
        Method method2 = (Method) AbstractC4166m.m8400I1(list);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "uic_contact_config", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("uic_contact_config").apply();
            } catch (Throwable unused) {
            }
            c2026t.invoke("新版转发联系人配置定位结果异常: count=" + list.size(), null);
        }
        return method2;
    }
}
