package p139jb;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.Toast;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p025bc.AbstractC0255e;
import p062e8.C0828b;
import p086fh.C1253k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: jb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2121e {

    /* JADX INFO: renamed from: a */
    public final C3742g f7078a;

    /* JADX INFO: renamed from: b */
    public final C2026t f7079b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f7080c;

    /* JADX INFO: renamed from: d */
    public final Set f7081d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2121e(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f7078a = c3742g;
        this.f7079b = c2026t;
        this.f7080c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_finder_media_download_method_cache");
        this.f7081d = AbstractC2091b.m5168o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Object m5329b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (m5331e(obj)) {
            return obj;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                String name = field.getType().getName();
                if (name.equals("com.tencent.mm.plugin.finder.model.BaseFinderFeed") || AbstractC3149m.m6709h0(name, "BaseFinderFeed", false)) {
                    Object field2 = KavaReflector.readField(field, obj);
                    if (field2 != null) {
                        return field2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m5330d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strM5335i = m5335i(jSONObject);
        if (!AbstractC3149m.m6721t0(strM5335i)) {
            return strM5335i;
        }
        String strM1020i = AbstractC0255e.m1020i(jSONObject.optString("url"), jSONObject.optString("url_token"));
        if (AbstractC3149m.m6721t0(strM1020i)) {
            return null;
        }
        return strM1020i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m5331e(Object obj) {
        if (obj != null) {
            String name = obj.getClass().getName();
            if (name.equals("com.tencent.mm.plugin.finder.model.BaseFinderFeed") || AbstractC3149m.m6709h0(name, "BaseFinderFeed", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m5332f(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            if (MenuItem.class.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m5333g(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            if (ContextMenu.class.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m5334h(JSONObject jSONObject, String... strArr) {
        String str;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            String strOptString = jSONObject.optString(strArr[i9]);
            strOptString.getClass();
            str = AbstractC3149m.m6721t0(strOptString) ? null : strOptString;
            if (str != null) {
                break;
            }
            i9++;
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m5335i(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("media_cdn_info");
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("pcdn_url") : null;
            if (strOptString == null) {
                strOptString = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6721t0(strOptString)) {
                return strOptString;
            }
            String strOptString2 = jSONObject.optString("pcdn_url");
            if (strOptString2 != null) {
                return strOptString2;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[LOOP:2: B:30:0x0075->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5336a(ContextMenu contextMenu, int i9, String str, int i10) {
        Object obj;
        MenuItem item;
        Object c3959f;
        boolean z9;
        Drawable drawableMutate;
        int size = contextMenu.size();
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= size) {
                item = null;
                break;
            }
            item = contextMenu.getItem(i11);
            if (item.getItemId() == i9) {
                break;
            } else {
                i11++;
            }
        }
        if (item != null) {
            return;
        }
        C3742g c3742g = this.f7078a;
        try {
            Drawable drawable = c3742g.f12144b.getDrawable(i10);
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                c3959f = null;
            } else {
                int i12 = (int) ((c3742g.f12143a.getResources().getDisplayMetrics().density * 32.0f) + 0.5f);
                drawableMutate.setBounds(0, 0, i12, i12);
                c3959f = drawableMutate;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        boolean z10 = c3959f instanceof C3959f;
        Object obj2 = c3959f;
        if (z10) {
            obj2 = null;
        }
        Drawable drawable2 = (Drawable) obj2;
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = contextMenu.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            AbstractC4171r.m8432h1(arrayList, KavaReflector.declaredMethods(superclass));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Method method = (Method) next;
            if (method.getParameterTypes().length != 3 || !AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.TYPE)) {
                z9 = false;
                if (!z9) {
                    obj = next;
                    break;
                }
            } else {
                z9 = true;
                if (!CharSequence.class.isAssignableFrom(method.getParameterTypes()[1]) || !Drawable.class.isAssignableFrom(method.getParameterTypes()[2])) {
                }
                if (!z9) {
                }
            }
        }
        if (KavaReflector.invokeSuccessfully((Method) obj, contextMenu, Integer.valueOf(i9), str, drawable2)) {
            return;
        }
        MenuItem menuItemAdd = contextMenu.add(0, i9, 0, str);
        if (drawable2 != null) {
            menuItemAdd.setIcon(drawable2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x007c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public final List m5337c(String... strArr) {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f7078a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
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
        Object obj2 = c3959f;
        if (thM8182b != null) {
            this.f7079b.invoke("视频号菜单DexKit定位失败", thM8182b);
            obj2 = C4173t.f13710g;
        }
        return (List) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m5338j(String str, String str2, List list) {
        boolean zIsEmpty = list.isEmpty();
        SharedPreferences sharedPreferences = this.f7080c;
        if (!zIsEmpty) {
            C0828b.f2478a.m2097j(sharedPreferences, str, str2, list);
            return;
        }
        sharedPreferences.getClass();
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear().putString("cache.key", str);
            }
            editorEdit.remove(str2).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m5339k(final String str) {
        WeChatApis.runtime().getClass();
        C3086j c3086j = WeChatApis.taskApi;
        if (c3086j != null) {
            final int i9 = 0;
            c3086j.m6554e(new Runnable(this) { // from class: jb.b

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C2121e f7072h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f7072h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            Toast.makeText(this.f7072h.f7078a.f12143a, str, 0).show();
                            break;
                        default:
                            Toast.makeText(this.f7072h.f7078a.f12143a, str, 0).show();
                            break;
                    }
                }
            });
        } else {
            final int i10 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: jb.b

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C2121e f7072h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f7072h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            Toast.makeText(this.f7072h.f7078a.f12143a, str, 0).show();
                            break;
                        default:
                            Toast.makeText(this.f7072h.f7078a.f12143a, str, 0).show();
                            break;
                    }
                }
            });
        }
    }
}
