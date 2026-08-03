package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.A8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0009A8 implements IPlugin {
    /* JADX INFO: renamed from: a */
    public static Field m37a(Class cls, String str) {
        Object objM2206a;
        while (true) {
            if (cls == null) {
                return null;
            }
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                objM2206a = declaredField;
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            Field field = (Field) (objM2206a instanceof C0901wd.a ? null : objM2206a);
            if (field != null) {
                return field;
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: b */
    public static TextView m38b(View view) {
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            if (string.equals("聊天记录") || C0015Ae.m49H(string, "聊天记录", false)) {
                return textView;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C0631i9.m1481d(childAt, "getChildAt(...)");
            TextView textViewM38b = m38b(childAt);
            if (textViewM38b != null) {
                return textViewM38b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m39c(Activity activity, List list) {
        TextView textViewM38b;
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        boolean z = false;
        if (decorView != null && (textViewM38b = m38b(decorView)) != null) {
            Object parent = textViewM38b.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                view = null;
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    C0726n9.m1670m(C0944z.m2227g("HideStorageChatRecord: chat record row hidden (card=", view.getClass().getSimpleName(), ")"));
                    z = true;
                }
            } else {
                for (int i = 0; view.getParent() != null && i < 3; i++) {
                    if (view.getBackground() != null && view.getHeight() < 600) {
                        break;
                    }
                    Object parent2 = view.getParent();
                    view = parent2 instanceof View ? (View) parent2 : null;
                    if (view == null) {
                        break;
                    }
                }
                Object parent3 = textViewM38b.getParent();
                View view2 = parent3 instanceof View ? (View) parent3 : null;
                Object parent4 = view2 != null ? view2.getParent() : null;
                view = parent4 instanceof View ? (View) parent4 : null;
                if (view == null) {
                    Object parent5 = textViewM38b.getParent();
                    if (parent5 instanceof View) {
                        view = (View) parent5;
                    }
                }
                if (view != null) {
                    view.setVisibility(8);
                    C0726n9.m1670m(C0944z.m2227g("HideStorageChatRecord: chat record row hidden (card=", view.getClass().getSimpleName(), ")"));
                    z = true;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            try {
                Object obj = field.get(activity);
                View view3 = obj instanceof View ? (View) obj : null;
                if (view3 != null && view3.getVisibility() != 8) {
                    view3.setVisibility(8);
                    C0726n9.m1670m("HideStorageChatRecord: chat record card hidden via field " + field.getName());
                    z = true;
                }
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                C0920xd.m2206a(th);
            }
        }
        if (!z) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideStorageChatRecord: nothing to hide this pass"}, 1));
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m40d(Activity activity, int i) {
        View decorView;
        if (i >= 3) {
            return;
        }
        JSONObject jSONObjectM1155d = C0475a5.m1155d("clean_msg_root_view_fields_v2");
        Iterable iterableM1158g = jSONObjectM1155d != null ? C0475a5.m1158g("fields", jSONObjectM1155d) : C0439Y5.f1645a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableM1158g.iterator();
        while (it.hasNext()) {
            Field fieldM37a = m37a(activity.getClass(), (String) it.next());
            if (fieldM37a != null) {
                arrayList.add(fieldM37a);
            }
        }
        if (m39c(activity, arrayList)) {
            return;
        }
        List listM1757d0 = C0739o3.m1757d0(300L, 800L, 1500L);
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.postDelayed(new RunnableC0660k0(this, activity, i, 4), ((Number) ((i < 0 || i >= listM1757d0.size()) ? 1500L : listM1757d0.get(i))).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02e2 A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #5 {all -> 0x02eb, blocks: (B:106:0x02c1, B:108:0x02e2), top: B:171:0x02c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.Map] */
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(C0173J8 c0173j8) {
        String str;
        Class<?> cls;
        Object obj;
        LinkedHashMap linkedHashMapM1233I;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        Field fieldM37a;
        int i;
        Object objM2206a;
        Throwable thM2189a;
        Object objM2206a2;
        Method method;
        Object objM2206a3;
        C0631i9.m1482e(c0173j8, "session");
        C0692ld.f2564a.m1555a();
        int i2 = 0;
        int i3 = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i3 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i3;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, c0173j8.f608a);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F019_clean_new_ui", c0578fd);
        if (!c0597gdM1467a.f2208a || (cls = c0597gdM1467a.f2209b) == null) {
            C0908x1.m2197e("HideStorageChatRecord", "Resolver: CleanNewUI not resolved");
            ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            if (c0647j6 == null || (str = c0647j6.f2390c) == null) {
                str = "unknown";
            }
            C0083E8.m208a("F019", "cleanNewUI", "CleanNewUI", str);
            return;
        }
        C0908x1.m2194b("HideStorageChatRecord", "Resolver: CleanNewUI → ".concat(cls.getName()));
        JSONObject jSONObjectM1155d = C0475a5.m1155d("clean_msg_root_view_fields_v2");
        List<C0799r6> listM2161t = C0439Y5.f1645a;
        List listM1158g = jSONObjectM1155d != null ? C0475a5.m1158g("fields", jSONObjectM1155d) : listM2161t;
        if (!listM1158g.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listM1158g.iterator();
            while (it.hasNext()) {
                Field fieldM37a2 = m37a(cls, (String) it.next());
                if (fieldM37a2 != null) {
                    arrayList.add(fieldM37a2);
                }
            }
            if (!arrayList.isEmpty()) {
                obj = arrayList;
            } else if (C0889w1.m2121H()) {
                try {
                    listM2161t = C0889w1.m2161t(cls.getName(), null, null, null);
                } catch (Exception e2) {
                    C0908x1.m2197e("HideStorageChatRecord", "DexKit fields locate search failed", e2);
                }
                ArrayList arrayList2 = new ArrayList();
                for (C0799r6 c0799r6 : listM2161t) {
                    if (!Modifier.isStatic(c0799r6.f3140c) && (fieldM37a = m37a(cls, c0799r6.m1856b().f1641b)) != null && View.class.isAssignableFrom(fieldM37a.getType())) {
                        arrayList2.add(fieldM37a);
                    }
                }
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(C0758p3.m1800g0(listM2161t, 10));
                    for (C0799r6 c0799r62 : listM2161t) {
                        arrayList3.add(c0799r62.m1856b().f1640a + "." + c0799r62.m1856b().f1641b + " type=" + c0799r62.m1857c());
                    }
                    C0908x1.m2197e("HideStorageChatRecord", "DexKit fields locate FAILED (no View field in " + cls.getName() + "), fields=" + arrayList3);
                } else {
                    ArrayList arrayList4 = new ArrayList(C0758p3.m1800g0(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((Field) it2.next()).getName());
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            jSONArray.put((String) it3.next());
                        }
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                        String string = jSONObject.put("fields", jSONArray).toString();
                        C0631i9.m1481d(string, "toString(...)");
                        Context context2 = C0889w1.f3488p;
                        SharedPreferences sharedPreferences = context2 != null ? context2.getSharedPreferences("dexkit_scan_cache", 0) : null;
                        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("clean_msg_root_view_fields_v2", string)) != null) {
                            editorPutString.apply();
                        }
                        ?? r6 = C0475a5.f1753a;
                        if (r6 != 0) {
                            linkedHashMapM1233I = C0499ba.m1233I(r6);
                            linkedHashMapM1233I.put("clean_msg_root_view_fields_v2", string);
                        } else {
                            linkedHashMapM1233I = null;
                        }
                        C0475a5.f1753a = linkedHashMapM1233I;
                    } catch (Exception unused) {
                        C0908x1.m2197e("DexKitCache: putCleanMsgRootViewFields failed");
                    }
                    C0908x1.m2194b("HideStorageChatRecord", "DexKit fields located: " + C0834t3.m1952p0(arrayList2, null, new C0687l8(16), 31) + " (fields=" + listM2161t.size() + ")");
                }
                obj = arrayList2;
            } else {
                C0908x1.m2197e("HideStorageChatRecord", "DexKit fields locate SKIP: DkBridge not ready");
                obj = listM2161t;
            }
        }
        C0173J8.m466d(c0173j8, "F019", cls.getName(), "onCreate", new Class[]{Bundle.class}, new C0683l4(this, 3, obj));
        ConcurrentHashMap<String, C0101F8> concurrentHashMap2 = C0083E8.f263a;
        C0083E8.m209b("F019", "onCreate", cls.getName());
        Class cls2 = Long.TYPE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList5 = new ArrayList();
            int length = declaredMethods.length;
            int i4 = 0;
            while (i4 < length) {
                Method method2 = declaredMethods[i4];
                i = i2;
                try {
                    if (C0631i9.m1478a(method2.getReturnType(), Void.TYPE) && method2.getParameterTypes().length == 1 && C0631i9.m1478a(method2.getParameterTypes()[i], cls2)) {
                        arrayList5.add(method2);
                    }
                    i4++;
                    i2 = i;
                } catch (Throwable th) {
                    th = th;
                    C0920xd.m2206a(th);
                    Method method3 = C0052Cd.f184a.m139b(new C0785qb("F019_update_msg_root", "void", C0889w1.m2124K("J"), "", "F019_clean_new_ui", false), c0578fd).f2213f;
                    if (method3 == null) {
                    }
                    thM2189a = C0901wd.m2189a(objM2206a);
                    if (thM2189a != null) {
                    }
                    while (r5.hasNext()) {
                    }
                    List<Method> listM1959w0 = C0834t3.m1959w0(linkedHashSet);
                    int i5 = i;
                    while (r4.hasNext()) {
                    }
                    C0908x1.m2194b("HideStorageChatRecord", "hooked refresh methods=" + i5 + ": " + C0834t3.m1952p0(listM1959w0, null, new C0687l8(15), 31));
                }
            }
            i = i2;
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                linkedHashSet.add((Method) it4.next());
            }
            C0413Wf c0413Wf2 = C0413Wf.f1577a;
        } catch (Throwable th2) {
            th = th2;
            i = i2;
        }
        try {
            Method method32 = C0052Cd.f184a.m139b(new C0785qb("F019_update_msg_root", "void", C0889w1.m2124K("J"), "", "F019_clean_new_ui", false), c0578fd).f2213f;
            objM2206a = method32 == null ? Boolean.valueOf(linkedHashSet.add(method32)) : null;
        } catch (Throwable th3) {
            objM2206a = C0920xd.m2206a(th3);
        }
        thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e("HideStorageChatRecord", "rule-based updateMsgRoot locate failed", thM2189a);
        }
        for (String str2 : C0739o3.m1757d0("updateMsgRoot", "W6", "x7", "U6", "Z6", "Y6", "X6", "V6", "updateCacheRoot")) {
            Class<?> superclass = cls;
            while (true) {
                if (superclass == null) {
                    method = null;
                    break;
                }
                try {
                    objM2206a3 = superclass.getDeclaredMethod(str2, cls2);
                } catch (Throwable th4) {
                    objM2206a3 = C0920xd.m2206a(th4);
                }
                if (objM2206a3 instanceof C0901wd.a) {
                    objM2206a3 = null;
                }
                method = (Method) objM2206a3;
                if (method != null) {
                    break;
                } else {
                    superclass = superclass.getSuperclass();
                }
            }
            if (method != null) {
                linkedHashSet.add(method);
            }
        }
        List<Method> listM1959w02 = C0834t3.m1959w0(linkedHashSet);
        int i52 = i;
        for (Method method4 : listM1959w02) {
            try {
                C0173J8.m469h(c0173j8, "F019", method4, new C0830t(this, obj, 5));
                ConcurrentHashMap<String, C0101F8> concurrentHashMap3 = C0083E8.f263a;
                C0083E8.m209b("F019", "refresh_" + method4.getName(), cls.getName());
                int i6 = i52 + 1;
                try {
                    objM2206a2 = Integer.valueOf(i52);
                    i52 = i6;
                } catch (Throwable th5) {
                    th = th5;
                    i52 = i6;
                    objM2206a2 = C0920xd.m2206a(th);
                }
            } catch (Throwable th6) {
                th = th6;
            }
            Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
            if (thM2189a2 != null) {
                C0908x1.m2197e("HideStorageChatRecord", C0944z.m2227g("hook refresh method ", method4.getName(), " failed"), thM2189a2);
            }
        }
        C0908x1.m2194b("HideStorageChatRecord", "hooked refresh methods=" + i52 + ": " + C0834t3.m1952p0(listM1959w02, null, new C0687l8(15), 31));
    }
}
