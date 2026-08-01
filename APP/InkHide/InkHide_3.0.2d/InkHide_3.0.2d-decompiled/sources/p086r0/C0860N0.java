package p086r0;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0134v;
import p011F0.C0115c;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860N0 implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public final HashMap f2964a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final LruCache f2965b = new LruCache(16);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1766a(Object obj, Field field) throws IllegalAccessException {
        String str;
        Object obj2 = field.get(obj);
        if (obj2 != null) {
            String name = field.getType().getName();
            if (!field.getType().isAssignableFrom(Number.class) && !field.getType().isAssignableFrom(Byte.TYPE) && !AbstractC0307q.m538h0(name, false, "android")) {
                ArrayList arrayList = new ArrayList();
                Class<?> superclass = obj2.getClass();
                arrayList.add(superclass.getName());
                while (true) {
                    superclass = superclass.getSuperclass();
                    if (superclass == null || superclass == Object.class) {
                        break;
                    }
                    arrayList.add(superclass.getName());
                }
                if (arrayList.isEmpty()) {
                    String strValueOf = String.valueOf(String.valueOf(obj2).hashCode());
                    str = !(obj2 instanceof CharSequence) ? (CharSequence) obj2 : "";
                    if (!AbstractC0307q.m534d0(str)) {
                        this.f2965b.put(strValueOf, str);
                        Iterator it = ((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a.iterator();
                        AbstractC0223g.m417d(it, "iterator(...)");
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (!TextUtils.isEmpty(str2)) {
                                if (TextUtils.isEmpty(str2 != null ? AbstractC0299i.m507C0(str2).toString() : null)) {
                                    continue;
                                } else {
                                    AbstractC0223g.m415b(str2);
                                    if (AbstractC0299i.m511i0(str, str2, false)) {
                                        boolean z2 = AbstractC1126i.f3786a;
                                        if (!C1124g.m2429e(str2)) {
                                            String name2 = obj.getClass().getName();
                                            HashMap map = this.f2964a;
                                            HashSet hashSet = (HashSet) map.get(name2);
                                            if (hashSet == null) {
                                                HashSet hashSet2 = new HashSet(AbstractC0134v.m294Y(1));
                                                AbstractC0120h.m261i0(new Field[]{field}, hashSet2);
                                                map.put(name2, hashSet2);
                                            } else {
                                                hashSet.add(field);
                                            }
                                            AbstractC0731a.m1384a("hit wxid compareText: ", str, field);
                                            return true;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((String) it2.next()).contains("android")) {
                            break;
                        }
                    }
                    String strValueOf2 = String.valueOf(String.valueOf(obj2).hashCode());
                    if (!(obj2 instanceof CharSequence)) {
                    }
                    if (!AbstractC0307q.m534d0(str)) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1767b(XC_MethodHook.MethodHookParam methodHookParam, Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2450z()) {
            return false;
        }
        Class<?> superclass = obj.getClass();
        HashMap map = this.f2964a;
        if (map.get(superclass.getName()) != null) {
            Object obj2 = map.get(superclass.getName());
            AbstractC0223g.m415b(obj2);
            Iterator it = ((HashSet) obj2).iterator();
            AbstractC0223g.m417d(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC0223g.m417d(next, "next(...)");
                Field field = (Field) next;
                if (m1766a(obj, field)) {
                    AbstractC0731a.m1384a("hide field from cache: ", field.getType().getName(), field.getName(), field.get(obj));
                    return true;
                }
            }
            return false;
        }
        while (superclass != null) {
            C0115c c0115cM428d = AbstractC0231o.m428d(superclass.getDeclaredFields());
            while (c0115cM428d.hasNext()) {
                Field field2 = (Field) c0115cM428d.next();
                field2.setAccessible(true);
                try {
                    if (m1766a(obj, field2)) {
                        AbstractC0731a.m1384a("hide field: ", field2.getType().getName(), field2.getName(), field2.get(obj));
                        return true;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
            try {
                superclass = superclass.getSuperclass();
            } catch (Exception unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        if (AbstractC1135r.m2486h() >= 2600) {
            AbstractC0731a.m1384a("support by hook dbase api");
            return;
        }
        boolean zM2496r = AbstractC1135r.m2496r(2502);
        Class cls = Integer.TYPE;
        if (!zM2496r && !AbstractC1135r.m2497s(2589)) {
            int iM2486h = AbstractC1135r.m2486h();
            AbstractC0514f.m1026c("com.tencent.mm.plugin.fts.ui.a0", context.getClassLoader(), iM2486h != 2502 ? iM2486h != 2600 ? "i" : "g" : "h", cls, new C0857M0(this, 2));
            return;
        }
        int iM2486h2 = AbstractC1135r.m2486h();
        String str = "com.tencent.mm.plugin.fts.ui.y";
        AbstractC0514f.m1026c(2400 <= iM2486h2 && iM2486h2 <= 2480 ? "com.tencent.mm.plugin.fts.ui.y" : "com.tencent.mm.plugin.fts.ui.z", context.getClassLoader(), "d", cls, new C0857M0(this, 1));
        int iM2486h3 = AbstractC1135r.m2486h();
        if (2400 <= iM2486h3 && iM2486h3 <= 2441) {
            str = "com.tencent.mm.plugin.fts.ui.x";
        }
        AbstractC0514f.m1026c(str, context.getClassLoader(), "d", cls, new C0857M0(this, 0));
    }
}
