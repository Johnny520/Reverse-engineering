package p086r0;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p055lu.wxmask.MainHook;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import p001A0.AbstractC0039l;
import p001A0.C0014N;
import p001A0.C0015O;
import p001A0.C0035h;
import p001A0.C0036i;
import p001A0.C0048u;
import p001A0.C0051x;
import p001A0.C0052y;
import p001A0.RunnableC0045r;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0103c;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0135w;
import p011F0.C0131s;
import p011F0.C0133u;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p027N0.C0227k;
import p027N0.C0228l;
import p034R0.C0243b;
import p038T0.C0277b;
import p038T0.C0280e;
import p038T0.C0281f;
import p038T0.C0282g;
import p038T0.C0286k;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0294d;
import p040U0.C0297g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p081o0.C0781b;
import p084q0.C0804d;
import p084q0.C0808h;
import p102z0.AbstractC1116B;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.C1142y;
import p102z0.C1143z;
import p102z0.EnumC1115A;

/* JADX INFO: renamed from: r0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0894d0 implements InterfaceC0551a {

    /* JADX INFO: renamed from: U */
    public static final List f3085U = AbstractC0120h.m252Z(new C0868S[]{new C0868S("fj5.r", "o95.t4", "g"), new C0868S("gg5.r", "u65.t4", "g"), new C0868S("wh5.r", "h85.t4", "g"), new C0868S("rl5.r", "db5.t4", "g")});

    /* JADX INFO: renamed from: V */
    public static final String[] f3086V = {"fj5.r", "gg5.i", "gg5.r", "wh5.i", "wh5.r", "rl5.r"};

    /* JADX INFO: renamed from: W */
    public static final String[] f3087W = {"fj5.q", "gg5.q", "wh5.q", "rl5.q"};

    /* JADX INFO: renamed from: X */
    public static final String[] f3088X = {"f270207o", "h", "i", "m", "n", "o"};

    /* JADX INFO: renamed from: Y */
    public static final String[] f3089Y = {"z", "f270204i"};

    /* JADX INFO: renamed from: Z */
    public static final String[] f3090Z = {"f362612d", "f245584d", "d"};

    /* JADX INFO: renamed from: a0 */
    public static final String[] f3091a0 = {"com.tencent.mm.ui.contact.e", "com.tencent.mm.ui.contact.h0"};

    /* JADX INFO: renamed from: b0 */
    public static final C0297g f3092b0 = new C0297g("(?i)\\bwhere\\b");

    /* JADX INFO: renamed from: c0 */
    public static final C0297g f3093c0 = new C0297g("\\d{5,}");

    /* JADX INFO: renamed from: d0 */
    public static final C0297g f3094d0 = new C0297g("(?is)\\bwhere\\b.{0,160}\\b(?:rcontact\\.)?(username|encryptUsername)\\s*=");

    /* JADX INFO: renamed from: e0 */
    public static final C0297g f3095e0 = new C0297g("(?is)^\\s*select\\s+(.*?)\\s+from\\s+");

    /* JADX INFO: renamed from: f0 */
    public static final C0297g f3096f0 = new C0297g("(?i)\\bcount\\s*\\(");

    /* JADX INFO: renamed from: g0 */
    public static final C0297g f3097g0 = new C0297g("(?i)(^|[\\s,])(?:[a-zA-Z_][\\w]*\\.)?username([\\s,]|$)");

    /* JADX INFO: renamed from: h0 */
    public static final C0297g f3098h0 = new C0297g("(?i)\\bas\\s+username\\b");

    /* JADX INFO: renamed from: i0 */
    public static final C0297g f3099i0 = new C0297g("(?i)\\b(group\\s+by|having|order\\s+by|limit|offset)\\b");

    /* JADX INFO: renamed from: j0 */
    public static final C0297g f3100j0 = new C0297g("(?i)\\bfrom\\s+rcontact\\s+(?:as\\s+)?([a-zA-Z_][\\w]*)");

    /* JADX INFO: renamed from: k0 */
    public static final Set f3101k0 = AbstractC0120h.m263k0(new String[]{"where", "inner", "left", "right", "join", "on", "group", "order", "limit"});

    /* JADX INFO: renamed from: A */
    public C0014N f3102A;

    /* JADX INFO: renamed from: B */
    public Context f3103B;

    /* JADX INFO: renamed from: C */
    public volatile long f3104C;

    /* JADX INFO: renamed from: D */
    public C0870T f3105D;

    /* JADX INFO: renamed from: E */
    public final WeakHashMap f3106E;

    /* JADX INFO: renamed from: F */
    public final WeakHashMap f3107F;

    /* JADX INFO: renamed from: G */
    public final Set f3108G;

    /* JADX INFO: renamed from: H */
    public final WeakHashMap f3109H;

    /* JADX INFO: renamed from: I */
    public final WeakHashMap f3110I;

    /* JADX INFO: renamed from: J */
    public final WeakHashMap f3111J;

    /* JADX INFO: renamed from: K */
    public final WeakHashMap f3112K;

    /* JADX INFO: renamed from: L */
    public volatile String f3113L;

    /* JADX INFO: renamed from: M */
    public volatile String f3114M;

    /* JADX INFO: renamed from: N */
    public volatile long f3115N;

    /* JADX INFO: renamed from: O */
    public volatile boolean f3116O;

    /* JADX INFO: renamed from: P */
    public WeakReference f3117P;

    /* JADX INFO: renamed from: Q */
    public volatile String f3118Q;

    /* JADX INFO: renamed from: R */
    public volatile long f3119R;

    /* JADX INFO: renamed from: S */
    public volatile String f3120S;

    /* JADX INFO: renamed from: T */
    public volatile boolean f3121T;

    /* JADX INFO: renamed from: a */
    public WeakReference f3122a;

    /* JADX INFO: renamed from: b */
    public WeakReference f3123b;

    /* JADX INFO: renamed from: c */
    public WeakReference f3124c;

    /* JADX INFO: renamed from: d */
    public WeakReference f3125d;

    /* JADX INFO: renamed from: e */
    public WeakReference f3126e;

    /* JADX INFO: renamed from: f */
    public WeakReference f3127f;

    /* JADX INFO: renamed from: m */
    public boolean f3134m;

    /* JADX INFO: renamed from: o */
    public boolean f3136o;

    /* JADX INFO: renamed from: p */
    public boolean f3137p;

    /* JADX INFO: renamed from: q */
    public boolean f3138q;

    /* JADX INFO: renamed from: r */
    public boolean f3139r;

    /* JADX INFO: renamed from: s */
    public boolean f3140s;

    /* JADX INFO: renamed from: t */
    public String f3141t;

    /* JADX INFO: renamed from: u */
    public long f3142u;

    /* JADX INFO: renamed from: v */
    public String f3143v;

    /* JADX INFO: renamed from: w */
    public long f3144w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f3145x;

    /* JADX INFO: renamed from: y */
    public boolean f3146y;

    /* JADX INFO: renamed from: z */
    public C0036i f3147z;

    /* JADX INFO: renamed from: g */
    public final WeakHashMap f3128g = new WeakHashMap();

    /* JADX INFO: renamed from: h */
    public final Set f3129h = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: i */
    public final HashMap f3130i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final HashMap f3131j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final HashMap f3132k = new HashMap();

    /* JADX INFO: renamed from: l */
    public final LinkedHashSet f3133l = new LinkedHashSet();

    /* JADX INFO: renamed from: n */
    public final HashSet f3135n = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0894d0() {
        C0133u c0133u = C0133u.f428a;
        this.f3105D = new C0870T(false, c0133u, c0133u);
        this.f3106E = new WeakHashMap();
        this.f3107F = new WeakHashMap();
        this.f3108G = Collections.newSetFromMap(new WeakHashMap());
        this.f3109H = new WeakHashMap();
        this.f3110I = new WeakHashMap();
        this.f3111J = new WeakHashMap();
        this.f3112K = new WeakHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static Method m1809A(HashMap map, Object obj) {
        Object next;
        Method method = (Method) map.get(obj.getClass());
        if (method != null) {
            return method;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Class) ((Map.Entry) next).getKey()).isAssignableFrom(obj.getClass())) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Method) entry.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static boolean m1810A0(String str, String str2) {
        String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        return (AbstractC0307q.m534d0(string) || string.equals(str2) || string.length() > 80 || AbstractC0299i.m512j0(string, '\n') || AbstractC0307q.m538h0(string, false, "微信ID") || AbstractC0307q.m538h0(string, false, "微信号") || string.equals("加入名单") || f3093c0.m504d(string)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static ListView m1811B(View view) {
        while (view != null) {
            if (view instanceof ListView) {
                return (ListView) view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static boolean m1812B0(String str) {
        return AbstractC0307q.m538h0(str, false, "wxid_") || str.endsWith("@chatroom") || AbstractC0299i.m511i0(str, "@", false) || str.length() >= 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static View m1813C(View view) {
        if (view == null) {
            return null;
        }
        if (m1819H0(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewM1813C = m1813C(viewGroup.getChildAt(i2));
            if (viewM1813C != null) {
                return viewM1813C;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static boolean m1814C0(String str) {
        String string = AbstractC0299i.m507C0(str).toString();
        if (string.length() >= 3 && string.length() <= 128 && !AbstractC0299i.m511i0(string, " ", false) && !AbstractC0299i.m511i0(string, "\n", false)) {
            if (AbstractC0307q.m538h0(string, false, "wxid_") || AbstractC0307q.m538h0(string, false, "gh_") || string.endsWith("@chatroom") || AbstractC0299i.m511i0(string, "@", false)) {
                return true;
            }
            Pattern patternCompile = Pattern.compile("[A-Za-z][A-Za-z0-9_.-]{2,}");
            AbstractC0223g.m417d(patternCompile, "compile(...)");
            if (patternCompile.matcher(string).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final void m1815D(C0228l c0228l, C0894d0 c0894d0, View view) {
        String strM1868G;
        if (c0228l.f568a != null) {
            return;
        }
        Object tag = view.getTag();
        if (c0894d0.m1906r0(tag)) {
            strM1868G = c0894d0.m1868G(tag);
        } else {
            Object objM1910v = c0894d0.m1910v(tag);
            strM1868G = objM1910v != null ? c0894d0.m1868G(objM1910v) : null;
        }
        if (strM1868G != null && !AbstractC0307q.m534d0(strM1868G)) {
            c0228l.f568a = strM1868G;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1815D(c0228l, c0894d0, childAt);
                if (c0228l.f568a != null) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static boolean m1816D0(String str) {
        String string = AbstractC0299i.m507C0(str).toString();
        return AbstractC0299i.m511i0(string, "正在加载", false) || AbstractC0299i.m511i0(string, "加载中", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static Object m1817E(Object obj, String str) {
        Object c0104d;
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    try {
                        field.setAccessible(true);
                        c0104d = field.get(obj);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    if (c0104d != null) {
                        if (!c0104d.getClass().getName().equals(str)) {
                            for (Class<? super Object> superclass2 = c0104d.getClass().getSuperclass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                                if (!superclass2.getName().equals(str)) {
                                }
                            }
                        }
                        return c0104d;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static boolean m1818F0(Object obj) {
        return obj != null && AbstractC0299i.m511i0(obj.getClass().getName(), "MvvmAddressUI", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static boolean m1819H0(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static boolean m1820I0() {
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        return AbstractC1135r.f3833e > 3120;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static void m1821J0(String str, long j2, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        if (jCurrentTimeMillis >= 5) {
            String str3 = jCurrentTimeMillis + "ms";
            if (str2 == null) {
                str2 = "";
            }
            AbstractC0731a.m1384a("quick add slow", str, str3, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static String[] m1822K0(List list, String[] strArr) {
        if (list == null) {
            list = C0131s.f426a;
        }
        ArrayList arrayListM273o0 = AbstractC0123k.m273o0(list, AbstractC0120h.m262j0(strArr));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM273o0) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return (String[]) AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList)).toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static List m1823N(Object obj) {
        ArrayList arrayList;
        List list;
        Object c0104d;
        C0131s c0131s = C0131s.f426a;
        if (obj == null) {
            return c0131s;
        }
        String[] strArr = f3090Z;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            arrayList = null;
            if (i2 >= length) {
                list = null;
                break;
            }
            list = (List) m1828S(obj, strArr[i2]);
            if (list != null) {
                break;
            }
            i2++;
        }
        if (list != null) {
            return list;
        }
        Class<?> superclass = obj.getClass();
        loop1: while (true) {
            if (superclass == null) {
                c0104d = null;
                break;
            }
            Field[] declaredFields = superclass.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    c0104d = field.get(obj);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d instanceof List) {
                    break loop1;
                }
            }
            superclass = superclass.getSuperclass();
        }
        List list2 = (List) c0104d;
        if (list2 != null) {
            arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList == null ? c0131s : arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static String m1824O(Object obj) {
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        if (!m1853o0(obj) && m1825P(obj) == null) {
            return null;
        }
        try {
            c0104d = (String) AbstractC0514f.f1622b.mo1015f(obj, "field_username");
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        String str = (String) c0104d;
        if (str != null) {
            if (AbstractC0307q.m534d0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        try {
            c0104d2 = (String) AbstractC0514f.f1622b.mo1015f(obj, "username");
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        if (c0104d2 instanceof C0104d) {
            c0104d2 = null;
        }
        String str2 = (String) c0104d2;
        if (str2 != null) {
            if (AbstractC0307q.m534d0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        try {
            c0104d3 = (String) AbstractC0514f.f1622b.mo1012c(obj, "d1", new Object[0]);
        } catch (Throwable th3) {
            c0104d3 = new C0104d(th3);
        }
        if (c0104d3 instanceof C0104d) {
            c0104d3 = null;
        }
        String str3 = (String) c0104d3;
        if (str3 != null) {
            if (AbstractC0307q.m534d0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                return str3;
            }
        }
        try {
            c0104d4 = (String) AbstractC0514f.f1622b.mo1012c(obj, "getUsername", new Object[0]);
        } catch (Throwable th4) {
            c0104d4 = new C0104d(th4);
        }
        if (c0104d4 instanceof C0104d) {
            c0104d4 = null;
        }
        String str4 = (String) c0104d4;
        if (str4 != null) {
            String str5 = AbstractC0307q.m534d0(str4) ? null : str4;
            if (str5 != null) {
                return str5;
            }
        }
        return m1825P(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static String m1825P(Object obj) {
        Object c0104d;
        String string;
        String string2;
        String string3;
        if (obj != null && !(obj instanceof View) && !(obj instanceof ViewGroup) && !(obj instanceof TextView) && !(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !obj.getClass().isPrimitive()) {
            String[] strArr = {"field_username", "username", "userName", "user", "id", "contactId"};
            for (int i2 = 0; i2 < 6; i2++) {
                String str = (String) m1828S(obj, strArr[i2]);
                if (str != null && (string3 = AbstractC0299i.m507C0(str).toString()) != null) {
                    if (!m1814C0(string3)) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        return string3;
                    }
                }
            }
            String[] strArr2 = {"getUsername", "getUserName", "d1", "h1", "e", "v", "x"};
            for (int i3 = 0; i3 < 7; i3++) {
                String strM1851n = m1851n(obj, strArr2[i3]);
                if (strM1851n != null && (string2 = AbstractC0299i.m507C0(strM1851n).toString()) != null) {
                    String strM505A0 = AbstractC0299i.m505A0(string2, "");
                    if (!m1814C0(strM505A0)) {
                        strM505A0 = null;
                    }
                    if (strM505A0 != null) {
                        return strM505A0;
                    }
                }
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    if (AbstractC0223g.m414a(field.getType(), String.class)) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            c0104d = obj2 instanceof String ? (String) obj2 : null;
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        String str2 = (String) c0104d;
                        if (str2 != null && (string = AbstractC0299i.m507C0(str2).toString()) != null) {
                            if (!m1814C0(string)) {
                                string = null;
                            }
                            if (string != null) {
                                return string;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m1826R(Object obj) {
        if (obj == null) {
            return null;
        }
        if (AbstractC1135r.m2485g() == EnumC1115A.WX_8_0_72) {
            String strM1851n = m1851n(obj, "x");
            return (strM1851n == null && (strM1851n = m1851n(obj, "v")) == null) ? m1831X(obj) : strM1851n;
        }
        String strM1851n2 = m1851n(obj, "v");
        return (strM1851n2 == null && (strM1851n2 = m1851n(obj, "x")) == null) ? m1831X(obj) : strM1851n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX INFO: renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View m1827R0(Object obj, ListView listView, View view) {
        Object c0104d;
        View rootView;
        if (obj != null) {
            try {
                c0104d = (View) AbstractC0514f.f1622b.mo1012c(obj, "getView", new Object[0]);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            rootView = (View) c0104d;
            if (rootView == null) {
                rootView = view != null ? view.getRootView() : null;
                if (rootView == null) {
                    if (listView != null) {
                        return listView.getRootView();
                    }
                    return null;
                }
            }
        }
        return rootView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static Object m1828S(Object obj, String str) {
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 == null) {
                        return null;
                    }
                    return obj2;
                } catch (NoSuchFieldException unused) {
                } catch (Throwable unused2) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static List m1829V() {
        boolean z2 = AbstractC1126i.f3786a;
        Iterable<String> arrayList = !C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a);
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
            if (string != null) {
                arrayList2.add(string);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            boolean z3 = AbstractC1126i.f3786a;
            if (!C1124g.m2429e((String) obj2)) {
                arrayList4.add(obj2);
            }
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static Object m1830W0(Object obj, String str) {
        Method method;
        Object c0104d;
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0223g.m414a(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                try {
                    method.setAccessible(true);
                    c0104d = method.invoke(obj, null);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    return null;
                }
                return c0104d;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf A[SYNTHETIC] */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1831X(Object obj) {
        Object c0104d;
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && AbstractC0223g.m414a(method.getReturnType(), String.class)) {
                        try {
                            method.setAccessible(true);
                            Object objInvoke = method.invoke(obj, null);
                            c0104d = objInvoke instanceof String ? (String) objInvoke : null;
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        String str = (String) c0104d;
                        if (str == null) {
                            continue;
                        } else if (AbstractC0307q.m534d0(str) || str.length() < 3 || str.length() > 128 || AbstractC0299i.m511i0(str, " ", false) || AbstractC0299i.m511i0(str, "\n", false)) {
                            str = null;
                            if (str == null) {
                                return str;
                            }
                        } else {
                            if (!AbstractC0307q.m538h0(str, false, "wxid_") && !AbstractC0307q.m538h0(str, false, "gh_") && !AbstractC0299i.m511i0(str, "@chatroom", false) && !AbstractC0299i.m511i0(str, "-", false)) {
                                Pattern patternCompile = Pattern.compile("[A-Za-z0-9_@.:-]+");
                                AbstractC0223g.m417d(patternCompile, "compile(...)");
                                if (!patternCompile.matcher(str).matches()) {
                                }
                            }
                            if (str == null) {
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static boolean m1832Y(View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof TextView) {
                CharSequence text = ((TextView) view).getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (m1816D0(string)) {
                    return true;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    AbstractC0223g.m417d(childAt, "getChildAt(...)");
                    if (m1832Y(childAt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static boolean m1833Z(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                if (m1837b0(childAt)) {
                    return true;
                }
            }
        }
        return m1841d0(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1834a(final C0894d0 c0894d0, ContextMenu contextMenu, final String str, final String str2) {
        Object c0104d;
        Iterable iterableM176U;
        Object c0104d2;
        List list;
        c0894d0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F()) {
            boolean zBooleanValue = true;
            if (contextMenu.findItem(1835102721) == null) {
                try {
                    iterableM176U = AbstractC0079h.m176U(0, contextMenu.size());
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if ((iterableM176U instanceof Collection) && ((Collection) iterableM176U).isEmpty()) {
                    zBooleanValue = false;
                    c0104d = Boolean.valueOf(zBooleanValue);
                    Object obj = Boolean.FALSE;
                    if (c0104d instanceof C0104d) {
                    }
                    zBooleanValue = ((Boolean) c0104d).booleanValue();
                } else {
                    Iterator it = iterableM176U.iterator();
                    while (((C0243b) it).f588c) {
                        MenuItem item = contextMenu.getItem(((C0243b) it).m458a());
                        AbstractC0223g.m417d(item, "getItem(...)");
                        if (m1858s0(item)) {
                            break;
                        }
                    }
                    zBooleanValue = false;
                    c0104d = Boolean.valueOf(zBooleanValue);
                    Object obj2 = Boolean.FALSE;
                    if (c0104d instanceof C0104d) {
                        c0104d = obj2;
                    }
                    zBooleanValue = ((Boolean) c0104d).booleanValue();
                }
            }
            if (zBooleanValue) {
                c0894d0.m1879O0(str, str2, null);
                return;
            }
            boolean z3 = AbstractC1126i.f3786a;
            MenuItem menuItemAdd = contextMenu.add(0, 1835102721, Integer.MIN_VALUE, C1124g.m2436l());
            c0894d0.f3107F.put(menuItemAdd, new C0103c(str, str2));
            c0894d0.m1879O0(str, str2, null);
            ArrayList arrayListM2433i = C1124g.m2433i();
            if (arrayListM2433i.isEmpty()) {
                AbstractC0223g.m415b(menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: r0.N
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        AbstractC0223g.m418e(menuItem, "it");
                        boolean z4 = AbstractC1126i.f3786a;
                        if (!C1124g.m2415F()) {
                            return true;
                        }
                        this.f2961a.m1900k(str, str2);
                        return true;
                    }
                }));
            } else {
                Iterator it2 = arrayListM2433i.iterator();
                while (it2.hasNext()) {
                    if (AbstractC0223g.m414a(((MaskItemBean) it2.next()).getMaskId(), str)) {
                        menuItemAdd.setTitle("已在隐藏名单中");
                        menuItemAdd.setEnabled(false);
                        break;
                    }
                }
                AbstractC0223g.m415b(menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: r0.N
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        AbstractC0223g.m418e(menuItem, "it");
                        boolean z4 = AbstractC1126i.f3786a;
                        if (!C1124g.m2415F()) {
                            return true;
                        }
                        this.f2961a.m1900k(str, str2);
                        return true;
                    }
                }));
            }
            AbstractC0223g.m415b(menuItemAdd);
            try {
                List listM1823N = m1823N(contextMenu);
                list = AbstractC0231o.m426b(listM1823N) ? listM1823N : null;
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            if (list == null || !list.remove(menuItemAdd)) {
                m1821J0("contact append menu", jCurrentTimeMillis, str);
            } else {
                list.add(0, menuItemAdd);
                c0104d2 = C0109i.f404a;
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d2);
            if (thM246a != null) {
                AbstractC0731a.m1387d("contact quick add menu move fail", thM246a);
            }
            m1821J0("contact append menu", jCurrentTimeMillis, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static boolean m1835a0(ListView listView) {
        if (listView != null && listView.getVisibility() == 0) {
            int childCount = listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = listView.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                if (m1837b0(childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final ArrayList m1836b(C0894d0 c0894d0, List list, Set set) throws JSONException {
        Context context;
        if (c0894d0.f3147z != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                str = null;
                str = null;
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    String name = next.getClass().getName();
                    if (!AbstractC0307q.m534d0(name) && !m1853o0(next)) {
                        str = name;
                    }
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listM281w0) {
                if (!c0894d0.m1905r().contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                c0894d0.f3133l.addAll(arrayList2);
                C0036i c0036i = c0894d0.f3147z;
                C0036i c0036i2 = c0036i != null ? new C0036i(c0036i.f233a, c0036i.f234b, c0036i.f235c, c0036i.f236d, c0036i.f237e, c0036i.f238f, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(c0036i.f239g, arrayList2))), c0036i.f240h) : null;
                c0894d0.f3147z = c0036i2;
                if (c0036i2 != null && (context = c0894d0.f3103B) != null) {
                    AbstractC0039l.m85w(context, c0036i2);
                }
                AbstractC0731a.m1387d("hide contact learned mvvm item", AbstractC0123k.m271m0(arrayList2, ",", null, null, null, 62));
            }
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        for (Object obj2 : list) {
            if (!c0894d0.m1913y0(obj2, set)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static boolean m1837b0(View view) {
        if (view.getVisibility() == 0 && view.getWidth() != 0 && view.getHeight() != 0) {
            if (m1841d0(view) || view.isClickable() || view.isLongClickable()) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getVisibility() == 0 && childAt.getWidth() > 0 && childAt.getHeight() > 0 && (childAt.isClickable() || childAt.isLongClickable())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0146  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1838c(C0894d0 c0894d0, View view, String str) {
        String str2;
        TextView textViewM1862w;
        WeakReference weakReference;
        Object obj;
        Object c0104d;
        Object c0104d2;
        View contentView;
        Object c0104d3;
        String string;
        c0894d0.getClass();
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2415F() || System.currentTimeMillis() - c0894d0.f3115N > 15000 || (str2 = c0894d0.f3113L) == null || AbstractC0307q.m534d0(str2) || c0894d0.m1914z0(view)) {
            return;
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String string2 = text != null ? text.toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            textViewM1862w = (TextView) (m1860u0(string2) ? view : null);
        } else {
            textViewM1862w = view instanceof AdapterView ? null : m1862w(view);
        }
        if (textViewM1862w == null || (weakReference = c0894d0.f3117P) == null || (obj = weakReference.get()) == null) {
            return;
        }
        if (obj instanceof PopupWindow) {
            contentView = ((PopupWindow) obj).getContentView();
        } else {
            WeakHashMap weakHashMap = c0894d0.f3111J;
            View view2 = (View) weakHashMap.get(obj);
            if (view2 != null) {
                contentView = view2;
            } else {
                String[] strArr = f3088X;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        try {
                            PopupWindow popupWindow = (PopupWindow) m1828S(obj, strArr[i2]);
                            c0104d3 = popupWindow == null ? null : popupWindow.getContentView();
                        } catch (Throwable th) {
                            c0104d3 = new C0104d(th);
                        }
                        if (c0104d3 instanceof C0104d) {
                            c0104d3 = null;
                        }
                        View view3 = (View) c0104d3;
                        if (view3 != null) {
                            weakHashMap.put(obj, view3);
                            contentView = view3;
                            break;
                        }
                        i2++;
                    } else {
                        Class<?> superclass = obj.getClass();
                        loop2: while (true) {
                            if (superclass == null) {
                                c0104d = null;
                                break;
                            }
                            Field[] declaredFields = superclass.getDeclaredFields();
                            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                            for (Field field : declaredFields) {
                                try {
                                    field.setAccessible(true);
                                    c0104d = field.get(obj);
                                } catch (Throwable th2) {
                                    c0104d = new C0104d(th2);
                                }
                                if (c0104d instanceof C0104d) {
                                    c0104d = null;
                                }
                                if (c0104d instanceof PopupWindow) {
                                    break loop2;
                                }
                            }
                            superclass = superclass.getSuperclass();
                        }
                        PopupWindow popupWindow2 = (PopupWindow) c0104d;
                        if (popupWindow2 != null) {
                            try {
                                c0104d2 = popupWindow2.getContentView();
                            } catch (Throwable th3) {
                                c0104d2 = new C0104d(th3);
                            }
                            if (c0104d2 instanceof C0104d) {
                                c0104d2 = null;
                            }
                            view2 = (View) c0104d2;
                            if (view2 != null) {
                                weakHashMap.put(obj, view2);
                            }
                        }
                        contentView = null;
                    }
                }
            }
        }
        if (contentView == null) {
            return;
        }
        while (view != null) {
            if (view == contentView) {
                String str3 = c0894d0.f3113L;
                String string3 = str3 != null ? AbstractC0299i.m507C0(str3).toString() : null;
                if (string3 == null || AbstractC0307q.m534d0(string3)) {
                    AbstractC0731a.m1384a("contact quick add click empty user", str);
                    return;
                }
                String str4 = c0894d0.f3114M;
                if (str4 == null || (string = AbstractC0299i.m507C0(str4).toString()) == null) {
                    string = string3;
                } else {
                    if (AbstractC0307q.m534d0(string)) {
                        string = null;
                    }
                    if (string == null) {
                    }
                }
                WeakReference weakReference2 = c0894d0.f3117P;
                Object obj2 = weakReference2 != null ? weakReference2.get() : null;
                c0894d0.f3116O = true;
                c0894d0.m1900k(string3, string);
                if (obj2 != null) {
                    c0894d0.m1907s(obj2);
                }
                AbstractC0731a.m1384a("contact quick add framework click handled", str, string3, string);
                return;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static boolean m1839c0(View view) {
        if (view != null && view.getVisibility() == 0) {
            if (view instanceof ListView) {
                return m1835a0((ListView) view);
            }
            if (m1819H0(view)) {
                return m1833Z(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (m1839c0(viewGroup.getChildAt(i2))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1840d(final C0894d0 c0894d0, final PopupWindow popupWindow, final View view, final String str) {
        String str2;
        String string;
        View contentView;
        View view2;
        String str3;
        String string2;
        if (c0894d0.m1911x0()) {
            boolean z2 = AbstractC1126i.f3786a;
            if (C1124g.m2415F() && System.currentTimeMillis() - c0894d0.f3115N <= 15000 && (str2 = c0894d0.f3113L) != null && (string = AbstractC0299i.m507C0(str2).toString()) != null) {
                String str4 = !AbstractC0307q.m534d0(string) ? string : null;
                if (str4 == null || (contentView = popupWindow.getContentView()) == null) {
                    return;
                }
                if (c0894d0.m1914z0(view == null ? contentView : view)) {
                    return;
                }
                if (m1862w(contentView) != null) {
                    c0894d0.f3111J.put(popupWindow, contentView);
                    String str5 = c0894d0.f3114M;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    c0894d0.m1879O0(str4, str5, popupWindow);
                    return;
                }
                if (view != null && c0894d0.m1908t0(view)) {
                    c0894d0.f3104C = System.currentTimeMillis() + 2500;
                }
                if ((view == null || !c0894d0.m1908t0(view)) && System.currentTimeMillis() > c0894d0.f3104C) {
                    return;
                }
                String str6 = c0894d0.f3114M;
                if (str6 == null || (string2 = AbstractC0299i.m507C0(str6).toString()) == null) {
                    view2 = contentView;
                    str3 = str4;
                } else {
                    String str7 = AbstractC0307q.m534d0(string2) ? null : string2;
                    if (str7 != null) {
                        view2 = contentView;
                        str3 = str4;
                        str4 = str7;
                    }
                }
                boolean zM1894b1 = c0894d0.m1894b1(popupWindow, view2, str3, str4, str, view);
                final String str8 = str4;
                final String str9 = str3;
                final View view3 = view2;
                if (zM1894b1) {
                    return;
                }
                final int i2 = 0;
                view3.post(new Runnable(c0894d0) { // from class: r0.K

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0894d0 f2906b;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f2906b = c0894d0;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post"), view);
                                break;
                            case 1:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post16"), view);
                                break;
                            default:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post80"), view);
                                break;
                        }
                    }
                });
                final int i3 = 1;
                view3.postDelayed(new Runnable(c0894d0) { // from class: r0.K

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0894d0 f2906b;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f2906b = c0894d0;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post"), view);
                                break;
                            case 1:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post16"), view);
                                break;
                            default:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post80"), view);
                                break;
                        }
                    }
                }, 16L);
                final int i4 = 2;
                view3.postDelayed(new Runnable(c0894d0) { // from class: r0.K

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0894d0 f2906b;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f2906b = c0894d0;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post"), view);
                                break;
                            case 1:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post16"), view);
                                break;
                            default:
                                this.f2906b.m1894b1(popupWindow, view3, str9, str8, AbstractC0174d.m356l(new StringBuilder(), str, "-post80"), view);
                                break;
                        }
                    }
                }, 80L);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static boolean m1841d0(View view) {
        if (view.getVisibility() != 0 || view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        m1856q(arrayList, view);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!m1816D0((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m1842e(C0894d0 c0894d0, String str, List list, Set set) {
        c0894d0.getClass();
        if (str.equals("input")) {
            if (c0894d0.f3138q) {
                return;
            } else {
                c0894d0.f3138q = true;
            }
        } else if (c0894d0.f3139r) {
            return;
        } else {
            c0894d0.f3139r = true;
        }
        AbstractC0731a.m1384a(AbstractC0174d.m353i("hide contact live list ", str, " sample"), AbstractC0174d.m351g(list.size(), "size="), AbstractC0123k.m271m0(AbstractC0123k.m277s0(list, 8), " || ", null, null, new C0781b(c0894d0, set, 3), 30));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r9.getChildCount() <= 4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        r11 = r9.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        if ((r11 instanceof android.view.ViewGroup) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
    
        r11 = (android.view.ViewGroup) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007c, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007d, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1843e0(C0894d0 c0894d0, View view, View view2) {
        if (view2.getVisibility() != 0) {
            return;
        }
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            if (textView.getVisibility() == 0) {
                CharSequence text = textView.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                c0894d0.getClass();
                if (m1816D0(string)) {
                    ViewParent parent = textView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    View view3 = textView;
                    loop0: while (viewGroup != null && viewGroup != view && !(viewGroup instanceof ListView) && !m1819H0(viewGroup)) {
                        int childCount = viewGroup.getChildCount();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= childCount) {
                                break;
                            }
                            View childAt = viewGroup.getChildAt(i2);
                            if (childAt instanceof ListView) {
                                break loop0;
                            }
                            AbstractC0223g.m415b(childAt);
                            if (m1819H0(childAt)) {
                                break loop0;
                            } else {
                                i2++;
                            }
                        }
                    }
                    view3.setVisibility(8);
                    CharSequence text2 = textView.getText();
                    String string2 = text2 != null ? text2.toString() : null;
                    AbstractC0731a.m1384a("hide contact loading mask cleared", string2 != null ? string2 : "", view3.getClass().getName());
                    return;
                }
            }
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view2;
            int childCount2 = viewGroup2.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup2.getChildAt(i3);
                AbstractC0223g.m417d(childAt2, "getChildAt(...)");
                m1843e0(c0894d0, view, childAt2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m1844f(C0894d0 c0894d0, View view, Object obj) {
        Object c0104d;
        Object c0104d2;
        c0894d0.getClass();
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F() && view != null) {
            try {
                boolean zM1911x0 = c0894d0.m1911x0();
                boolean z3 = false;
                String str = "";
                if (zM1911x0) {
                    if (obj == null || !AbstractC0307q.m538h0(obj.getClass().getName(), false, "po5.")) {
                        Context context = view.getContext();
                        String name = context != null ? context.getClass().getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        if (m1857q0(name)) {
                        }
                    }
                    z3 = true;
                }
                if (!z3 && !c0894d0.m1908t0(view)) {
                    return;
                }
                ListView listViewM1811B = m1811B(view);
                int iIntValue = -1;
                if (listViewM1811B != null) {
                    try {
                        c0104d2 = Integer.valueOf(listViewM1811B.getPositionForView(view));
                    } catch (Throwable th) {
                        c0104d2 = new C0104d(th);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = -1;
                    }
                    iIntValue = ((Number) c0104d2).intValue();
                }
                C0103c c0103cM1883S0 = c0894d0.m1883S0(view, iIntValue, obj, z3);
                if (c0103cM1883S0 == null) {
                    String str2 = "listener=" + (obj != null ? obj.getClass().getName() : null);
                    String strConcat = "view=".concat(view.getClass().getName());
                    Context context2 = view.getContext();
                    AbstractC0731a.m1384a("contact quick add candidate miss", str2, strConcat, "context=" + (context2 != null ? context2.getClass().getName() : null), "force=" + z3);
                    return;
                }
                Object obj2 = c0103cM1883S0.f395b;
                Object obj3 = c0103cM1883S0.f394a;
                if (obj != null) {
                    c0894d0.f3110I.put(obj, obj3);
                }
                if (zM1911x0) {
                    c0894d0.f3104C = System.currentTimeMillis() + 2500;
                }
                String str3 = (String) obj2;
                if (str3 != null) {
                    str = str3;
                }
                AbstractC0731a.m1384a("contact quick add candidate hit", obj3, str, "listener=" + (obj != null ? obj.getClass().getName() : null));
                c0894d0.m1879O0((String) obj3, (String) obj2, null);
                c0104d = C0109i.f404a;
            } catch (Throwable th2) {
                c0104d = new C0104d(th2);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("contact quick add runtime long click resolve fail", thM246a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final C0103c m1845g(C0894d0 c0894d0, Object obj) {
        c0894d0.getClass();
        Object objM1828S = m1828S(obj, "d");
        if (objM1828S != null || (objM1828S = c0894d0.m1910v(obj)) != null) {
            obj = objM1828S;
        }
        String strM1868G = c0894d0.m1868G(obj);
        if (strM1868G != null) {
            if (!m1812B0(strM1868G)) {
                strM1868G = null;
            }
            if (strM1868G != null) {
                String strM1870H = c0894d0.m1870H(obj, strM1868G);
                if (strM1870H == null) {
                    strM1870H = strM1868G;
                }
                c0894d0.m1879O0(strM1868G, strM1870H, null);
                return new C0103c(strM1868G, strM1870H);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[PHI: r1
  0x002b: PHI (r1v10 java.lang.String) = (r1v7 java.lang.String), (r1v11 java.lang.String) binds: [B:22:0x0043, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1846h(C0894d0 c0894d0, View view) {
        c0894d0.getClass();
        Set setM265B0 = AbstractC0123k.m265B0(m1829V());
        if (setM265B0.isEmpty()) {
            return;
        }
        Object objM1871I = c0894d0.m1871I(view);
        String str = null;
        String strM1868G = objM1871I != null ? c0894d0.m1868G(objM1871I) : null;
        if (strM1868G == null) {
            C0228l c0228l = new C0228l();
            m1815D(c0228l, c0894d0, view);
            strM1868G = (String) c0228l.f568a;
            if (strM1868G != null) {
                if (AbstractC0307q.m534d0(strM1868G)) {
                    strM1868G = null;
                }
                if (strM1868G != null) {
                    str = strM1868G;
                }
            }
        } else {
            if (AbstractC0307q.m534d0(strM1868G)) {
                strM1868G = null;
            }
            if (strM1868G != null) {
            }
        }
        if (str == null || AbstractC0307q.m534d0(str) || !setM265B0.contains(str)) {
            c0894d0.m1888V0(view);
        } else {
            c0894d0.m1895f0(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m1847i(C0894d0 c0894d0, Object obj) {
        Object obj2;
        Object obj3;
        if (c0894d0.m1867F().isEmpty() || obj == null) {
            return false;
        }
        WeakReference weakReference = c0894d0.f3127f;
        if (weakReference == null || (obj3 = weakReference.get()) == null || obj != obj3) {
            WeakReference weakReference2 = c0894d0.f3125d;
            return (weakReference2 == null || (obj2 = weakReference2.get()) == null || obj != obj2) ? false : true;
        }
        boolean z2 = AbstractC1126i.f3786a;
        return C1124g.m2450z();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1848j(C0894d0 c0894d0, Object obj) {
        Object obj2;
        Object objM1909u;
        if (!c0894d0.m1867F().isEmpty()) {
            if (!AbstractC1135r.m2499u() && c0894d0.f3147z == null) {
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2450z()) {
                }
            } else if (obj != null) {
                boolean z3 = AbstractC1135r.m2499u() || c0894d0.f3147z != null;
                Set set = c0894d0.f3129h;
                if (z3) {
                    String name = obj.getClass().getName();
                    C0036i c0036i = c0894d0.f3147z;
                    if (name.equals(c0036i != null ? c0036i.f234b : "com.tencent.mm.ui.contact.address.AddressLiveList")) {
                        set.add(obj);
                        return true;
                    }
                }
                WeakReference weakReference = c0894d0.f3122a;
                if (weakReference != null && (obj2 = weakReference.get()) != null && (objM1909u = c0894d0.m1909u(obj2)) != null) {
                    set.add(objM1909u);
                    if (obj == objM1909u) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m1849l(LinkedHashSet linkedHashSet, String str) {
        if (AbstractC0307q.m534d0(str)) {
            return;
        }
        linkedHashSet.add(str);
        C0282g c0282g = new C0282g(C0297g.m501c(f3093c0, str));
        while (c0282g.hasNext()) {
            String strGroup = ((C0294d) c0282g.next()).f670a.group();
            AbstractC0223g.m417d(strGroup, "group(...)");
            linkedHashSet.add(strGroup);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static ListView m1850m(Object obj) {
        Method method;
        Object c0104d;
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null) {
                return null;
            }
            Method[] declaredMethods = superclass.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0223g.m414a(method.getName(), "getListView")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                try {
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(obj, null);
                    c0104d = objInvoke instanceof ListView ? (ListView) objInvoke : null;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                return (ListView) (c0104d instanceof C0104d ? null : c0104d);
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m1851n(Object obj, String str) {
        Method method;
        Object c0104d;
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0223g.m414a(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && AbstractC0223g.m414a(method.getReturnType(), String.class)) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                try {
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(obj, null);
                    c0104d = objInvoke instanceof String ? (String) objInvoke : null;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                String str2 = (String) c0104d;
                if (str2 == null || AbstractC0307q.m534d0(str2)) {
                    return null;
                }
                return str2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static boolean m1852n0(ListView listView, Object obj) {
        String name = obj.getClass().getName();
        if (!AbstractC0120h.m254b0(f3091a0, name)) {
            if (AbstractC0307q.m538h0(name, false, "com.tencent.mm.ui.contact")) {
                if (AbstractC0514f.f1622b.mo1011b(obj.getClass(), "getItem", Integer.TYPE) != null) {
                    if (AbstractC0514f.f1622b.mo1011b(obj.getClass(), "getCount", new Object[0]) != null) {
                        Context context = listView.getContext();
                        String name2 = context != null ? context.getClass().getName() : null;
                        if (name2 == null) {
                            name2 = "";
                        }
                        if (m1857q0(name2) || AbstractC0299i.m511i0(name, "contact", true)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static boolean m1853o0(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("com.tencent.mm.storage.s3")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final void m1854p(View view, ArrayList arrayList, View view2) {
        if (view2 != view && (view2 instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view2;
            if (viewGroup.isClickable() || viewGroup.isLongClickable()) {
                arrayList.add(view2);
            }
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view2;
            int childCount = viewGroup2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup2.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1854p(view, arrayList, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static boolean m1855p0(Object obj, ListView listView, View view) {
        C0277b c0277b = new C0277b(new C0280e(new C0281f(AbstractC0120h.m253a0(new View[]{view, listView, m1827R0(obj, listView, view)}), false, C0286k.f658c)));
        while (c0277b.hasNext()) {
            View view2 = (View) c0277b.next();
            if (view2.isShown() && view2.getWindowVisibility() == 0 && view2.getAlpha() > 0.0f) {
                Rect rect = new Rect();
                if (view2.getGlobalVisibleRect(rect) && rect.width() > 0 && rect.height() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m1856q(ArrayList arrayList, View view) {
        String string;
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0299i.m507C0(string).toString();
            if (string2 == null) {
                string2 = "";
            }
            if (!AbstractC0307q.m534d0(string2)) {
                arrayList.add(string2);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1856q(arrayList, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static boolean m1857q0(String str) {
        return AbstractC0299i.m511i0(str, "AddressUI", true) || AbstractC0299i.m511i0(str, "MvvmAddressUI", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static boolean m1858s0(MenuItem menuItem) {
        if (menuItem.getItemId() == 1835102721) {
            return true;
        }
        CharSequence title = menuItem.getTitle();
        String string = title != null ? title.toString() : null;
        if (string == null) {
            string = "";
        }
        return m1860u0(string) || AbstractC0299i.m511i0(string, "隐藏名单", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static int m1859t(Context context, int i2) {
        return (int) ((i2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static boolean m1860u0(String str) {
        boolean z2 = AbstractC1126i.f3786a;
        return str.equals(C1124g.m2436l()) || str.equals("加入名单");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static boolean m1861v0(ListView listView) {
        Object c0104d;
        try {
            c0104d = Integer.valueOf(listView.getResources().getIdentifier("mfg", "id", "com.tencent.mm"));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = 0;
        }
        int iIntValue = ((Number) c0104d).intValue();
        if (iIntValue != 0 && listView.getId() == iIntValue) {
            return true;
        }
        Context context = listView.getContext();
        String name = context != null ? context.getClass().getName() : null;
        if (name == null) {
            name = "";
        }
        return AbstractC0299i.m511i0(name, "Search", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static TextView m1862w(View view) {
        if (view != null) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (m1860u0(string)) {
                    return textView;
                }
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    TextView textViewM1862w = m1862w(viewGroup.getChildAt(i2));
                    if (textViewM1862w != null) {
                        return textViewM1862w;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static boolean m1863w0(String str) {
        return AbstractC0299i.m511i0(str, ".ui.conversation.", true) || AbstractC0299i.m511i0(str, ".conversation.", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static ViewGroup m1864x(View view) {
        if (view != null) {
            if ((view instanceof LinearLayout) && ((LinearLayout) view).getOrientation() == 1 && m1862w(view) == null) {
                return (ViewGroup) view;
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ViewGroup viewGroupM1864x = m1864x(viewGroup.getChildAt(i2));
                    if (viewGroupM1864x != null) {
                        return viewGroupM1864x;
                    }
                }
                return viewGroup;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[Catch: all -> 0x00ae, PHI: r4
  0x00b0: PHI (r4v6 android.content.Context) = (r4v5 android.content.Context), (r4v11 android.content.Context) binds: [B:45:0x009c, B:47:0x00ab] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x00ae, blocks: (B:44:0x0090, B:46:0x009e, B:51:0x00b0, B:54:0x00c1), top: B:93:0x0090 }] */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View m1865z(Object obj) {
        View view;
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        try {
            Object objMo1015f = AbstractC0514f.f1622b.mo1015f(obj, "p");
            if (objMo1015f instanceof View) {
                return (View) objMo1015f;
            }
        } catch (Throwable unused) {
        }
        View viewM1813C = null;
        if (obj == null) {
            view = null;
        } else {
            loop0: for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    try {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null && (obj2 instanceof View) && obj2.getClass().getName().equals("androidx.recyclerview.widget.RecyclerView")) {
                            view = (View) obj2;
                            break loop0;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            view = null;
        }
        if (view != null) {
            return view;
        }
        try {
            c0104d = (View) AbstractC0514f.f1622b.mo1012c(obj, "getView", new Object[0]);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        View view2 = (View) c0104d;
        try {
            c0104d2 = AbstractC0514f.f1622b.mo1012c(obj, "getActivity", new Object[0]);
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        if (c0104d2 instanceof C0104d) {
            c0104d2 = null;
        }
        if (c0104d2 == null) {
            c0104d3 = null;
        } else {
            try {
                Context context = (Context) AbstractC0514f.f1622b.mo1012c(c0104d2, "getApplicationContext", new Object[0]);
                if (context == null) {
                    context = (Context) AbstractC0514f.f1622b.mo1012c(c0104d2, "getBaseContext", new Object[0]);
                    if (context != null) {
                        int identifier = context.getResources().getIdentifier("mg", "id", "com.tencent.mm");
                        if (identifier != 0) {
                            c0104d3 = (View) AbstractC0514f.f1622b.mo1012c(c0104d2, "findViewById", Integer.valueOf(identifier));
                        }
                    }
                    c0104d3 = null;
                }
            } catch (Throwable th3) {
                c0104d3 = new C0104d(th3);
            }
        }
        if (c0104d3 instanceof C0104d) {
            c0104d3 = null;
        }
        View viewM1813C2 = (View) c0104d3;
        if (viewM1813C2 == null && (view2 == null || (viewM1813C2 = m1813C(view2)) == null)) {
            if (c0104d2 == null) {
                c0104d4 = null;
            } else {
                try {
                    c0104d4 = (View) AbstractC0514f.f1622b.mo1012c(c0104d2, "findViewById", Integer.valueOf(R.id.content));
                } catch (Throwable th4) {
                    c0104d4 = new C0104d(th4);
                }
            }
            if (c0104d4 instanceof C0104d) {
                c0104d4 = null;
            }
            View view3 = (View) c0104d4;
            if (view3 != null) {
                viewM1813C = m1813C(view3);
            }
        } else {
            viewM1813C = viewM1813C2;
        }
        return viewM1813C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public final boolean m1866E0(String str) {
        C0036i c0036i = this.f3147z;
        List list = c0036i != null ? c0036i.f238f : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        return list.contains(str) || AbstractC0299i.m511i0(str, "ui3.", true) || AbstractC0299i.m511i0(str, "ik3.", true) || AbstractC0299i.m511i0(str, "gl3.", true) || AbstractC0299i.m511i0(str, "xm3.", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final Set m1867F() {
        m1877M0();
        return this.f3105D.f2996b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final String m1868G(Object obj) {
        Object c0104d;
        String strM1881Q;
        if (obj == null) {
            return null;
        }
        if (m1869G0(obj) && (strM1881Q = m1881Q(obj)) != null) {
            return strM1881Q;
        }
        String strM1824O = m1824O(obj);
        if (strM1824O != null) {
            return strM1824O;
        }
        try {
            c0104d = (String) AbstractC0514f.f1622b.mo1012c(obj, "e", new Object[0]);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public final boolean m1869G0(Object obj) {
        if (obj == null) {
            return false;
        }
        return AbstractC1135r.m2477E("contact", "mvvmItem", m1905r()).contains(obj.getClass().getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1870H(Object obj, String str) {
        Object c0104d;
        String string;
        String string2;
        Object c0104d2;
        if (!m1853o0(obj)) {
            if (m1869G0(obj)) {
                try {
                    c0104d2 = AbstractC0514f.f1622b.mo1015f(obj, "d");
                } catch (Throwable th) {
                    c0104d2 = new C0104d(th);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = null;
                }
                if (c0104d2 == null) {
                    try {
                        obj = AbstractC0514f.f1622b.mo1015f(obj, "f344355d");
                    } catch (Throwable th2) {
                        obj = new C0104d(th2);
                    }
                    if (obj instanceof C0104d) {
                        obj = null;
                    }
                } else {
                    obj = c0104d2;
                }
            } else if (m1825P(obj) == null) {
            }
        }
        String[] strArr = {"field_conRemark", "field_nickname", "field_username", "conRemark", "nickname", "username"};
        for (int i2 = 0; i2 < 6; i2++) {
            String str2 = (String) m1828S(obj, strArr[i2]);
            if (str2 != null && (string2 = AbstractC0299i.m507C0(str2).toString()) != null && m1810A0(string2, str)) {
                return string2;
            }
        }
        String[] strArr2 = {"getDisplayName", "getNickname", "d0", "c1"};
        for (int i3 = 0; i3 < 4; i3++) {
            try {
                c0104d = (String) AbstractC0514f.f1622b.mo1012c(obj, strArr2[i3], new Object[0]);
            } catch (Throwable th3) {
                c0104d = new C0104d(th3);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            String str3 = (String) c0104d;
            if (str3 != null && (string = AbstractC0299i.m507C0(str3).toString()) != null && m1810A0(string, str)) {
                return string;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final Object m1871I(View view) {
        while (view != null) {
            Object tag = view.getTag();
            if (tag != null) {
                if (m1906r0(tag)) {
                    return tag;
                }
                Object objM1910v = m1910v(tag);
                if (objM1910v != null) {
                    return objM1910v;
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final String[] m1872J() {
        C0014N c0014n = this.f3102A;
        List list = c0014n != null ? c0014n.f128c : null;
        List list2 = f3085U;
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0868S) it.next()).f2987a);
        }
        return m1822K0(list, (String[]) AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList)).toArray(new String[0]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final Object m1873K(Object obj) {
        Object objM1828S;
        WeakHashMap weakHashMap = this.f3112K;
        Object obj2 = weakHashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        String[] strArr = f3089Y;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                objM1828S = m1828S(obj, strArr[i2]);
                if (objM1828S != null) {
                    break;
                }
                i2++;
            } else {
                objM1828S = null;
                break;
            }
        }
        if (objM1828S == null) {
            return obj;
        }
        weakHashMap.put(obj, objM1828S);
        return objM1828S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final List m1874L() {
        C0014N c0014n = this.f3102A;
        List<C0015O> list = c0014n != null ? c0014n.f129d : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list));
        for (C0015O c0015o : list) {
            arrayList.add(new C0868S(c0015o.f136a, c0015o.f137b, c0015o.f138c));
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(arrayList, f3085U)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX INFO: renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1875L0(Object obj) {
        Object c0104d;
        Throwable thM246a;
        ListView listViewM1850m;
        Object adapter;
        View viewM1865z;
        Object objM1912y;
        if (obj == null) {
            return;
        }
        this.f3122a = new WeakReference(obj);
        try {
            listViewM1850m = m1850m(obj);
            if (listViewM1850m == null) {
                Class<?> superclass = obj.getClass();
                loop0: while (true) {
                    if (superclass == null) {
                        listViewM1850m = null;
                        break;
                    }
                    Field[] declaredFields = superclass.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 instanceof ListView) {
                                listViewM1850m = (ListView) obj2;
                                break loop0;
                            }
                            continue;
                        } catch (Throwable unused) {
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }
            if (listViewM1850m == null || (adapter = listViewM1850m.getAdapter()) == null) {
                loop2: for (Class<?> superclass2 = obj.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    Field[] declaredFields2 = superclass2.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields2, "getDeclaredFields(...)");
                    for (Field field2 : declaredFields2) {
                        try {
                            field2.setAccessible(true);
                            Object obj3 = field2.get(obj);
                            if (obj3 != null && ((obj3 instanceof ListAdapter) || AbstractC0120h.m254b0(f3091a0, obj3.getClass().getName()))) {
                                adapter = obj3;
                                break loop2;
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                adapter = null;
            }
            viewM1865z = m1865z(obj);
            objM1912y = m1912y(obj);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (objM1912y == null) {
            if (viewM1865z != null) {
                try {
                    objM1912y = AbstractC0514f.f1622b.mo1012c(viewM1865z, "getAdapter", new Object[0]);
                } catch (Throwable th2) {
                    objM1912y = new C0104d(th2);
                }
                if (objM1912y instanceof C0104d) {
                    objM1912y = null;
                }
            }
            thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a == null) {
                AbstractC0731a.m1387d("hide contact address ui refresh fail", thM246a);
                return;
            }
            return;
        }
        if (!m1820I0() || m1855p0(obj, listViewM1850m, viewM1865z)) {
            boolean z2 = m1820I0() && this.f3145x;
            this.f3145x = false;
            if (z2 && !this.f3146y && m1818F0(obj)) {
                this.f3146y = true;
                try {
                    m1878N0(obj);
                    this.f3146y = false;
                } catch (Throwable th3) {
                    this.f3146y = false;
                    throw th3;
                }
            }
            if (!m1820I0() || !m1893a1(obj, listViewM1850m, adapter, viewM1865z)) {
                if (viewM1865z != null) {
                    this.f3124c = new WeakReference(viewM1865z);
                }
                if (listViewM1850m != null && adapter != null && m1852n0(listViewM1850m, adapter)) {
                    this.f3125d = new WeakReference(adapter);
                    this.f3123b = new WeakReference(listViewM1850m);
                    m1896g0(adapter.getClass());
                }
                m1890X0(obj, listViewM1850m, viewM1865z);
                if (!m1867F().isEmpty()) {
                    AbstractC0731a.m1384a("hide contact fragment refresh", obj.getClass().getName(), "listView=" + (listViewM1850m != null ? listViewM1850m.getClass().getName() : null), "adapter=" + (adapter != null ? adapter.getClass().getName() : null));
                    if (viewM1865z != null || objM1912y != null) {
                        AbstractC0731a.m1384a("hide contact recycler inspect", "recyclerView=" + (viewM1865z != null ? viewM1865z.getClass().getName() : null), "recyclerAdapter=" + (objM1912y != null ? objM1912y.getClass().getName() : null), "itemCount=" + (objM1912y != null ? m1830W0(objM1912y, "getItemCount") : null));
                        if (objM1912y != null) {
                            this.f3135n.add(objM1912y.getClass().getName());
                        }
                        if (m1820I0() && objM1912y != null) {
                            m1903m0(objM1912y.getClass(), false);
                        }
                        if (viewM1865z != null) {
                            viewM1865z.post(new RunnableC0865Q(viewM1865z, this, obj, listViewM1850m));
                        }
                    }
                    if (listViewM1850m != null && adapter != null && m1852n0(listViewM1850m, adapter)) {
                        listViewM1850m.post(new RunnableC0865Q(this, obj, listViewM1850m, viewM1865z));
                    }
                }
            }
        } else {
            this.f3145x = true;
        }
        c0104d = C0109i.f404a;
        thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final MenuItem m1876M(int i2, Object obj) {
        Object c0104d;
        if (i2 < 0) {
            return null;
        }
        Object objM1873K = m1873K(obj);
        try {
            c0104d = (MenuItem) AbstractC0514f.f1622b.mo1012c(objM1873K, "getItem", Integer.valueOf(i2));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        MenuItem menuItem = (MenuItem) c0104d;
        if (menuItem != null) {
            return menuItem;
        }
        Object objM269k0 = AbstractC0123k.m269k0(m1823N(objM1873K), i2);
        if (objM269k0 instanceof MenuItem) {
            return (MenuItem) objM269k0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final void m1877M0() {
        String string;
        boolean z2 = AbstractC1126i.f3786a;
        boolean zM2449y = C1124g.m2449y();
        C0133u c0133u = C0133u.f428a;
        if (!zM2449y) {
            this.f3105D = new C0870T(false, c0133u, c0133u);
            return;
        }
        Iterable arrayList = !C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String string2 = str != null ? AbstractC0299i.m507C0(str).toString() : null;
            if (string2 != null) {
                arrayList2.add(string2);
            }
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : arrayList3) {
            boolean z3 = AbstractC1126i.f3786a;
            if (!C1124g.m2429e(str2)) {
                linkedHashSet.add(str2);
                C1143z c1143z = C1143z.f3876a;
                C1142y c1142yM2528b = C1143z.m2528b(str2);
                if (c1142yM2528b != null) {
                    List<String> listM252Z = AbstractC0120h.m252Z(new String[]{c1142yM2528b.f3868a, c1142yM2528b.f3869b, c1142yM2528b.f3870c});
                    ArrayList arrayList4 = new ArrayList();
                    for (String str3 : listM252Z) {
                        if (str3 == null || (string = AbstractC0299i.m507C0(str3).toString()) == null || AbstractC0307q.m534d0(string)) {
                            string = null;
                        }
                        if (string != null) {
                            arrayList4.add(string);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        boolean z4 = AbstractC1126i.f3786a;
                        if (!C1124g.m2429e((String) obj2)) {
                            arrayList5.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add((String) it2.next());
                    }
                }
            }
        }
        String strM271m0 = AbstractC0123k.m271m0(linkedHashSet, ",", null, null, null, 62);
        if (linkedHashSet.size() != AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList3)).size() && !strM271m0.equals(this.f3120S)) {
            this.f3120S = strM271m0;
            AbstractC0731a.m1384a("hide contact expanded ids", strM271m0);
        }
        Set setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m281w0(linkedHashSet));
        if (setM265B0.isEmpty()) {
            this.f3105D = new C0870T(true, c0133u, c0133u);
            return;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        boolean z5 = AbstractC1126i.f3786a;
        for (MaskItemBean maskItemBean : C1124g.m2433i()) {
            String maskId = maskItemBean.getMaskId();
            String string3 = maskId != null ? AbstractC0299i.m507C0(maskId).toString() : null;
            if (string3 == null) {
                string3 = "";
            }
            if (!AbstractC0307q.m534d0(string3) && setM265B0.contains(string3)) {
                String tagName = maskItemBean.getTagName();
                String string4 = tagName != null ? AbstractC0299i.m507C0(tagName).toString() : null;
                if (string4 == null) {
                    string4 = "";
                }
                m1849l(linkedHashSet2, string4);
                m1849l(linkedHashSet2, string3);
                C1143z c1143z2 = C1143z.f3876a;
                C1142y c1142yM2528b2 = C1143z.m2528b(string3);
                if (c1142yM2528b2 != null) {
                    String str4 = c1142yM2528b2.f3871d;
                    String string5 = str4 != null ? AbstractC0299i.m507C0(str4).toString() : null;
                    if (string5 == null) {
                        string5 = "";
                    }
                    m1849l(linkedHashSet2, string5);
                    String str5 = c1142yM2528b2.f3872e;
                    String string6 = str5 != null ? AbstractC0299i.m507C0(str5).toString() : null;
                    if (string6 == null) {
                        string6 = "";
                    }
                    m1849l(linkedHashSet2, string6);
                    String str6 = c1142yM2528b2.f3869b;
                    String string7 = str6 != null ? AbstractC0299i.m507C0(str6).toString() : null;
                    if (string7 == null) {
                        string7 = "";
                    }
                    m1849l(linkedHashSet2, string7);
                    String str7 = c1142yM2528b2.f3868a;
                    String string8 = str7 != null ? AbstractC0299i.m507C0(str7).toString() : null;
                    if (string8 == null) {
                        string8 = "";
                    }
                    m1849l(linkedHashSet2, string8);
                    String str8 = c1142yM2528b2.f3870c;
                    String string9 = str8 != null ? AbstractC0299i.m507C0(str8).toString() : null;
                    m1849l(linkedHashSet2, string9 != null ? string9 : "");
                }
            }
        }
        this.f3105D = new C0870T(true, setM265B0, linkedHashSet2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1878N0(Object obj) {
        boolean zBooleanValue;
        Object c0104d;
        Object objM1909u = m1909u(obj);
        if (objM1909u == null) {
            return false;
        }
        this.f3129h.add(objM1909u);
        View viewM1865z = m1865z(obj);
        Set setM1867F = m1867F();
        boolean z2 = AbstractC1126i.f3786a;
        boolean zM2449y = C1124g.m2449y();
        boolean zIsEmpty = setM1867F.isEmpty();
        boolean z3 = !zIsEmpty;
        if (m1818F0(obj) && !this.f3136o) {
            EnumC1115A enumC1115AM2485g = AbstractC1135r.m2485g();
            int i2 = enumC1115AM2485g == null ? -1 : AbstractC1116B.f3758a[enumC1115AM2485g.ordinal()];
            if ((i2 == 1 || i2 == 2 || i2 == 3) && obj.getClass().getName().equals("com.tencent.mm.ui.contact.address.MvvmAddressUIFragment")) {
                zBooleanValue = true;
            } else {
                Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(obj.getClass(), "s0", new Object[0]);
                if (methodMo1011b == null) {
                    zBooleanValue = false;
                } else {
                    try {
                        this.f3136o = true;
                        AbstractC0731a.m1384a("hide contact invoke mvvm refresh", obj.getClass().getName());
                        methodMo1011b.setAccessible(true);
                        methodMo1011b.invoke(obj, null);
                        c0104d = Boolean.TRUE;
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    Throwable thM246a = AbstractC0105e.m246a(c0104d);
                    if (thM246a != null) {
                        AbstractC0731a.m1387d("hide contact invoke mvvm refresh fail", thM246a);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (c0104d instanceof C0104d) {
                        c0104d = bool;
                    }
                    this.f3136o = false;
                    zBooleanValue = ((Boolean) c0104d).booleanValue();
                }
            }
        }
        if (zIsEmpty) {
            m1880P0(objM1909u);
            if (viewM1865z != null) {
                viewM1865z.post(new RunnableC0841H(this, viewM1865z, 0));
            }
            AbstractC0731a.m1384a("hide contact mvvm reload submitted", "liveList=".concat(objM1909u.getClass().getName()), AbstractC0174d.m355k("enabled=", zM2449y), "active=false", AbstractC0174d.m351g(setM1867F.size(), "hiddenSize="), AbstractC0174d.m355k("fragmentRefresh=", zBooleanValue));
            return true;
        }
        m1880P0(objM1909u);
        if (viewM1865z != null) {
            viewM1865z.post(new RunnableC0045r(this, viewM1865z, obj, 5));
        }
        AbstractC0731a.m1384a("hide contact mvvm refresh submitted", "liveList=".concat(objM1909u.getClass().getName()), AbstractC0174d.m355k("enabled=", zM2449y), AbstractC0174d.m355k("active=", z3), AbstractC0174d.m351g(setM1867F.size(), "hiddenSize="), AbstractC0174d.m355k("fragmentRefresh=", zBooleanValue));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public final void m1879O0(String str, String str2, Object obj) {
        this.f3113L = str;
        this.f3114M = str2;
        this.f3115N = System.currentTimeMillis();
        this.f3116O = false;
        if (obj != null) {
            this.f3117P = new WeakReference(obj);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0861O(this, this.f3115N, 0), 15000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0016, B:11:0x0022, B:14:0x0029, B:19:0x0035, B:21:0x0040, B:23:0x004e, B:25:0x0055, B:27:0x005c, B:35:0x0078, B:37:0x007e, B:39:0x008a, B:41:0x0096, B:43:0x009d, B:46:0x00ae, B:50:0x00b5, B:52:0x00c1, B:54:0x00cf, B:56:0x00d6, B:58:0x00dd, B:67:0x00f9, B:75:0x019a, B:61:0x00ee, B:30:0x006d, B:68:0x00ff, B:70:0x016b, B:71:0x0178, B:73:0x017f, B:74:0x018e), top: B:82:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0016, B:11:0x0022, B:14:0x0029, B:19:0x0035, B:21:0x0040, B:23:0x004e, B:25:0x0055, B:27:0x005c, B:35:0x0078, B:37:0x007e, B:39:0x008a, B:41:0x0096, B:43:0x009d, B:46:0x00ae, B:50:0x00b5, B:52:0x00c1, B:54:0x00cf, B:56:0x00d6, B:58:0x00dd, B:67:0x00f9, B:75:0x019a, B:61:0x00ee, B:30:0x006d, B:68:0x00ff, B:70:0x016b, B:71:0x0178, B:73:0x017f, B:74:0x018e), top: B:82:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1880P0(Object obj) {
        Object c0104d;
        Method method;
        int i2;
        Method method2;
        int length;
        int i3;
        Method method3;
        Method method4;
        Method method5;
        try {
            Class<?> superclass = obj.getClass().getSuperclass();
            if (superclass == null) {
                superclass = obj.getClass();
            }
            HashMap map = this.f3132k;
            Object obj2 = map.get(superclass);
            Object obj3 = obj2;
            if (obj2 == null) {
                C0036i c0036i = this.f3147z;
                if (c0036i != null) {
                    String str = c0036i.f240h;
                    if (AbstractC0307q.m534d0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        Method[] declaredMethods = superclass.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                        int length2 = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                i2 = 0;
                                method2 = null;
                                break;
                            }
                            method2 = declaredMethods[i4];
                            i2 = 0;
                            if (AbstractC0223g.m414a(method2.getName(), str) && ((method2.getParameterTypes().length == 4 || method2.getParameterTypes().length == 5) && method2.getParameterTypes()[0].isAssignableFrom(obj.getClass()))) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (method2 == null) {
                        }
                        Method[] declaredMethods2 = superclass.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
                        length = declaredMethods2.length;
                        i3 = i2;
                        while (true) {
                            if (i3 < length) {
                                method3 = null;
                                break;
                            }
                            method3 = declaredMethods2[i3];
                            if (AbstractC0223g.m414a(method3.getName(), "q") && ((method3.getParameterTypes().length == 4 || method3.getParameterTypes().length == 5) && method3.getParameterTypes()[i2].isAssignableFrom(obj.getClass()))) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        method4 = method2 != null ? method3 : method2;
                        if (method4 != null) {
                            method4.setAccessible(true);
                            map.put(superclass, method4);
                            obj3 = method4;
                            method = (Method) obj3;
                            String str2 = "method=" + method.getName();
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            AbstractC0731a.m1384a("hide contact mvvm submit refresh method", str2, "params=" + AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(27), 30), "liveList=" + obj.getClass().getName());
                            if (AbstractC0223g.m414a(method.getName(), "r") && method.getParameterTypes().length == 5) {
                                method.invoke(null, obj, null, Boolean.FALSE, 1, null);
                            } else {
                                method.invoke(null, obj, null, 1, null);
                            }
                        }
                        c0104d = C0109i.f404a;
                    } else {
                        i2 = 0;
                    }
                    if (AbstractC1135r.m2500v()) {
                        Method[] declaredMethods3 = superclass.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods3, "getDeclaredMethods(...)");
                        int length3 = declaredMethods3.length;
                        int i5 = i2;
                        while (true) {
                            if (i5 >= length3) {
                                method5 = null;
                                break;
                            }
                            method5 = declaredMethods3[i5];
                            if (AbstractC0223g.m414a(method5.getName(), "r") && method5.getParameterTypes().length == 4 && method5.getParameterTypes()[i2].isAssignableFrom(obj.getClass())) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        method2 = method5;
                    } else {
                        method2 = null;
                    }
                    Method[] declaredMethods22 = superclass.getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods22, "getDeclaredMethods(...)");
                    length = declaredMethods22.length;
                    i3 = i2;
                    while (true) {
                        if (i3 < length) {
                        }
                        i3++;
                    }
                    if (method2 != null) {
                    }
                    if (method4 != null) {
                    }
                    c0104d = C0109i.f404a;
                }
            } else {
                method = (Method) obj3;
                String str22 = "method=" + method.getName();
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                AbstractC0731a.m1384a("hide contact mvvm submit refresh method", str22, "params=" + AbstractC0120h.m260h0(parameterTypes2, ",", new C0804d(27), 30), "liveList=" + obj.getClass().getName());
                if (AbstractC0223g.m414a(method.getName(), "r")) {
                    method.invoke(null, obj, null, 1, null);
                } else {
                    method.invoke(null, obj, null, Boolean.FALSE, 1, null);
                }
                c0104d = C0109i.f404a;
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("hide contact mvvm submit refresh all fail", thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final String m1881Q(Object obj) {
        Object c0104d;
        Object c0104d2;
        if (!m1869G0(obj)) {
            return null;
        }
        String strM1826R = m1826R(obj);
        if (strM1826R != null) {
            String strM505A0 = AbstractC0299i.m505A0(strM1826R, "");
            if (AbstractC0307q.m534d0(strM505A0)) {
                strM505A0 = null;
            }
            if (strM505A0 != null) {
                return strM505A0;
            }
        }
        try {
            c0104d = AbstractC0514f.f1622b.mo1015f(obj, "d");
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        String strM1824O = c0104d != null ? m1824O(c0104d) : null;
        if (strM1824O != null) {
            return strM1824O;
        }
        try {
            c0104d2 = AbstractC0514f.f1622b.mo1015f(obj, "f344355d");
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        if (c0104d2 instanceof C0104d) {
            c0104d2 = null;
        }
        if (c0104d2 != null) {
            return m1824O(c0104d2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public final void m1882Q0() {
        Object c0104d;
        ListView listView;
        ListView listView2;
        ListView listView3;
        View viewM1865z;
        Object obj;
        Object c0104d2;
        m1877M0();
        WeakReference weakReference = this.f3122a;
        ListView listView4 = null;
        Object obj2 = weakReference != null ? weakReference.get() : null;
        WeakReference weakReference2 = this.f3125d;
        Object obj3 = weakReference2 != null ? weakReference2.get() : null;
        Set set = this.f3105D.f2996b;
        boolean zIsEmpty = set.isEmpty();
        boolean z2 = !zIsEmpty;
        boolean zM1818F0 = m1818F0(obj2);
        if (m1820I0() && zM1818F0 && obj2 != null) {
            WeakReference weakReference3 = this.f3123b;
            ListView listView5 = weakReference3 != null ? (ListView) weakReference3.get() : null;
            WeakReference weakReference4 = this.f3124c;
            if (!m1855p0(obj2, listView5, weakReference4 != null ? (View) weakReference4.get() : null)) {
                this.f3145x = true;
                return;
            }
        }
        this.f3145x = false;
        if (m1820I0()) {
            boolean z3 = AbstractC1126i.f3786a;
            String strValueOf = String.valueOf(C1124g.m2449y());
            String strValueOf2 = String.valueOf(z2);
            String strM271m0 = AbstractC0123k.m271m0(AbstractC0123k.m275q0(set), ",", null, null, null, 62);
            String name = obj2 != null ? obj2.getClass().getName() : null;
            if (name == null) {
                name = "";
            }
            String name2 = obj3 != null ? obj3.getClass().getName() : null;
            String strM271m02 = AbstractC0123k.m271m0(AbstractC0120h.m252Z(new String[]{strValueOf, strValueOf2, strM271m0, name, name2 != null ? name2 : ""}), "|", null, null, null, 62);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (strM271m02.equals(this.f3141t) && jCurrentTimeMillis - this.f3142u < 120) {
                return;
            }
            this.f3141t = strM271m02;
            this.f3142u = jCurrentTimeMillis;
        }
        boolean z4 = AbstractC1126i.f3786a;
        AbstractC0731a.m1384a("hide contact refresh request", AbstractC0174d.m355k("enabled=", C1124g.m2449y()), AbstractC0174d.m355k("active=", z2), AbstractC0174d.m352h("fragment=", obj2 != null ? obj2.getClass().getName() : null), AbstractC0174d.m352h("adapter=", obj3 != null ? obj3.getClass().getName() : null), AbstractC0174d.m351g(set.size(), "hiddenSize="));
        if (zM1818F0 && obj2 != null) {
            boolean zM1878N0 = m1878N0(obj2);
            if (zIsEmpty) {
                View viewM1865z2 = m1865z(obj2);
                if (viewM1865z2 != null) {
                    viewM1865z2.post(new RunnableC0841H(this, viewM1865z2, 1));
                }
            } else {
                m1875L0(obj2);
            }
            AbstractC0731a.m1384a("hide contact refresh mvvm first", "fragment=".concat(obj2.getClass().getName()), AbstractC0174d.m355k("mvvm=", zM1878N0), AbstractC0174d.m355k("active=", z2));
        }
        if (obj3 == null) {
            return;
        }
        this.f3128g.remove(obj3);
        try {
            AbstractC0514f.f1622b.mo1022m(obj3, null, "B");
            AbstractC0514f.f1622b.mo1022m(obj3, null, "C");
        } catch (Throwable unused) {
        }
        try {
            AbstractC0514f.f1622b.mo1012c(obj3, "clearCache", new Object[0]);
        } catch (Throwable unused2) {
        }
        try {
            c0104d = AbstractC0514f.f1622b.mo1012c(obj3, "notifyDataSetChanged", new Object[0]);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("hide contact refresh fail", thM246a);
        }
        WeakReference weakReference5 = this.f3127f;
        if (weakReference5 != null && (obj = weakReference5.get()) != null) {
            try {
                c0104d2 = AbstractC0514f.f1622b.mo1012c(obj, "notifyDataSetChanged", new Object[0]);
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
            if (thM246a2 != null) {
                AbstractC0731a.m1387d("hide contact search refresh fail", thM246a2);
            }
        }
        if (zIsEmpty) {
            if (obj2 != null && (viewM1865z = m1865z(obj2)) != null) {
                viewM1865z.post(new RunnableC0841H(this, viewM1865z, 1));
            }
            if (obj2 != null) {
                m1878N0(obj2);
            }
            WeakReference weakReference6 = this.f3123b;
            if (weakReference6 != null && (listView3 = (ListView) weakReference6.get()) != null) {
                listView3.post(new RunnableC0835F(listView3, this));
            }
            WeakReference weakReference7 = this.f3126e;
            if (weakReference7 != null && (listView2 = (ListView) weakReference7.get()) != null) {
                listView2.post(new RunnableC0835F(listView2, this));
            }
        }
        if (this.f3134m) {
            return;
        }
        this.f3134m = true;
        WeakReference weakReference8 = this.f3123b;
        if (weakReference8 == null || (listView = (ListView) weakReference8.get()) == null) {
            WeakReference weakReference9 = this.f3126e;
            if (weakReference9 != null) {
                listView4 = (ListView) weakReference9.get();
            }
        } else {
            listView4 = listView;
        }
        if (listView4 != null) {
            listView4.post(new RunnableC0835F(this, listView4));
        } else {
            this.f3134m = false;
            AbstractC0731a.m1384a("hide contact refresh skipped, listView missing");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e9 A[PHI: r7
  0x00e9: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v8 java.lang.String), (r7v10 java.lang.String) binds: [B:80:0x00ca, B:85:0x00d8, B:89:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0103c m1883S0(View view, int i2, Object obj, boolean z2) {
        Object objM1910v;
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object obj2 = null;
        if (z2 || m1908t0(view)) {
            Object objM1910v2 = m1910v(obj);
            if (objM1910v2 == null) {
                ListView listViewM1811B = m1811B(view);
                if (listViewM1811B != null) {
                    try {
                        c0104d = Integer.valueOf(listViewM1811B.getPositionForView(view));
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = -1;
                    }
                    if (((Number) c0104d).intValue() == -1) {
                        c0104d = null;
                    }
                    Integer num = (Integer) c0104d;
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    if (i2 >= 0) {
                        try {
                            c0104d2 = listViewM1811B.getItemAtPosition(i2);
                        } catch (Throwable th2) {
                            c0104d2 = new C0104d(th2);
                        }
                        if (c0104d2 instanceof C0104d) {
                            c0104d2 = null;
                        }
                        if (c0104d2 != null) {
                            objM1910v2 = c0104d2;
                        } else {
                            int headerViewsCount = i2 - listViewM1811B.getHeaderViewsCount();
                            if (headerViewsCount >= 0) {
                                try {
                                    ListAdapter adapter = listViewM1811B.getAdapter();
                                    if (adapter == null) {
                                        adapter = null;
                                    }
                                    c0104d3 = adapter != null ? adapter.getItem(headerViewsCount) : null;
                                } catch (Throwable th3) {
                                    c0104d3 = new C0104d(th3);
                                }
                                if (c0104d3 instanceof C0104d) {
                                    c0104d3 = null;
                                }
                                if (c0104d3 == null) {
                                    View view2 = view;
                                    while (true) {
                                        if (view2 == null) {
                                            view2 = null;
                                            break;
                                        }
                                        if (m1819H0(view2)) {
                                            break;
                                        }
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                    if (view2 == null || (c0104d3 = m1886U(view2, view)) == null) {
                                        c0104d3 = m1871I(view);
                                    }
                                }
                                objM1910v2 = c0104d3;
                            }
                        }
                    }
                }
            }
            if (objM1910v2 == null) {
                objM1910v2 = null;
            } else if (!m1853o0(objM1910v2) && !m1869G0(objM1910v2) && (objM1910v = m1910v(objM1910v2)) != null) {
                objM1910v2 = objM1910v;
            }
            String strM1868G = m1868G(objM1910v2);
            if (strM1868G == null) {
                Object objM1871I = m1871I(view);
                strM1868G = objM1871I != null ? m1868G(objM1871I) : null;
                if (strM1868G == null) {
                    strM1868G = obj != null ? (String) this.f3110I.get(obj) : null;
                    if (strM1868G != null) {
                    }
                }
            } else if (!AbstractC0307q.m534d0(strM1868G) && m1812B0(strM1868G)) {
                String strM1870H = m1870H(objM1910v2, strM1868G);
                if (strM1870H == null) {
                    ArrayList arrayList = new ArrayList();
                    m1856q(arrayList, view);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (m1810A0((String) next, strM1868G)) {
                            obj2 = next;
                            break;
                        }
                    }
                    strM1870H = (String) obj2;
                    if (strM1870H == null) {
                        strM1870H = strM1868G;
                    }
                }
                return new C0103c(strM1868G, strM1870H);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[PHI: r3
  0x009f: PHI (r3v13 java.util.List) = (r3v12 java.util.List), (r3v17 java.util.List) binds: [B:23:0x0043, B:50:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1884T(View view, int i2) {
        Object c0104d;
        Object c0104d2;
        Object obj;
        Object c0104d3;
        if (i2 >= 0) {
            try {
                c0104d = AbstractC0514f.f1622b.mo1012c(view, "getAdapter", new Object[0]);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            if (c0104d != null) {
                if (m1911x0()) {
                    Object objM1828S = m1828S(c0104d, "I");
                    if (objM1828S != null || (objM1828S = m1817E(c0104d, "com.tencent.mm.plugin.mvvmlist.MvvmList")) != null) {
                        List list = (List) m1828S(objM1828S, "o");
                        if (list == null) {
                            Class<?> superclass = objM1828S.getClass();
                            loop0: while (true) {
                                if (superclass == null) {
                                    c0104d3 = null;
                                    break;
                                }
                                Field[] declaredFields = superclass.getDeclaredFields();
                                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                                for (Field field : declaredFields) {
                                    try {
                                        field.setAccessible(true);
                                        c0104d3 = field.get(objM1828S);
                                    } catch (Throwable th2) {
                                        c0104d3 = new C0104d(th2);
                                    }
                                    if (c0104d3 instanceof C0104d) {
                                        c0104d3 = null;
                                    }
                                    if (c0104d3 instanceof List) {
                                        break loop0;
                                    }
                                }
                                superclass = superclass.getSuperclass();
                            }
                            List list2 = (List) c0104d3;
                            if (list2 != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(it.next());
                                }
                                list = arrayList;
                            } else {
                                list = null;
                            }
                            if (list == null) {
                                obj = null;
                                if (obj != null) {
                                    if (m1906r0(obj)) {
                                        return obj;
                                    }
                                    Object objM1910v = m1910v(obj);
                                    if (objM1910v != null) {
                                        return objM1910v;
                                    }
                                }
                            } else {
                                if (i2 >= 0 && i2 < list.size()) {
                                    obj = list.get(i2);
                                }
                                if (obj != null) {
                                }
                            }
                        }
                    }
                }
                String[] strArr = {"getItem", "getItemAt", "a", "b"};
                for (int i3 = 0; i3 < 4; i3++) {
                    try {
                        c0104d2 = AbstractC0514f.f1622b.mo1012c(c0104d, strArr[i3], Integer.valueOf(i2));
                    } catch (Throwable th3) {
                        c0104d2 = new C0104d(th3);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = null;
                    }
                    if (c0104d2 != null) {
                        if (m1906r0(c0104d2)) {
                            return c0104d2;
                        }
                        Object objM1910v2 = m1910v(c0104d2);
                        if (objM1910v2 != null) {
                            return objM1910v2;
                        }
                    }
                }
                Object objM1910v3 = m1910v(c0104d);
                if (objM1910v3 != null) {
                    return objM1910v3;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public final void m1885T0(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1887U0(childAt);
            }
        } else {
            m1887U0(view);
        }
        view.requestLayout();
        view.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final Object m1886U(View view, View view2) {
        Object c0104d;
        Object objM1884T;
        Method method;
        Object c0104d2;
        Object c0104d3;
        Method method2;
        View view3 = view2;
        while (view3 != null && view3 != view) {
            try {
                Method[] methods = view.getClass().getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method2 = null;
                        break;
                    }
                    method2 = methods[i2];
                    if (AbstractC0223g.m414a(method2.getName(), "getChildViewHolder") && method2.getParameterTypes().length == 1 && method2.getParameterTypes()[0].isAssignableFrom(view3.getClass())) {
                        break;
                    }
                    i2++;
                }
                c0104d = method2 == null ? null : method2.invoke(view, view3);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            if (c0104d != null) {
                break;
            }
            Object parent = view3.getParent();
            view3 = parent instanceof View ? (View) parent : null;
        }
        c0104d = null;
        int i3 = -1;
        if (c0104d != null) {
            Object objM1910v = m1910v(c0104d);
            if (objM1910v != null) {
                return objM1910v;
            }
            try {
                c0104d2 = AbstractC0514f.f1622b.mo1012c(c0104d, "getBindingAdapterPosition", new Object[0]);
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            if (c0104d2 instanceof C0104d) {
                c0104d2 = null;
            }
            if (c0104d2 != null) {
                Number number = c0104d2 instanceof Number ? (Number) c0104d2 : null;
                Object objM1884T2 = m1884T(view, number != null ? number.intValue() : -1);
                if (objM1884T2 != null) {
                    return objM1884T2;
                }
            }
            try {
                c0104d3 = AbstractC0514f.f1622b.mo1012c(c0104d, "getAdapterPosition", new Object[0]);
            } catch (Throwable th3) {
                c0104d3 = new C0104d(th3);
            }
            if (c0104d3 instanceof C0104d) {
                c0104d3 = null;
            }
            if (c0104d3 != null) {
                Number number2 = c0104d3 instanceof Number ? (Number) c0104d3 : null;
                Object objM1884T3 = m1884T(view, number2 != null ? number2.intValue() : -1);
                if (objM1884T3 != null) {
                    return objM1884T3;
                }
            }
        }
        while (true) {
            if (view2 == null || view2 == view) {
                break;
            }
            try {
                Method[] methods2 = view.getClass().getMethods();
                AbstractC0223g.m417d(methods2, "getMethods(...)");
                int length2 = methods2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        method = null;
                        break;
                    }
                    method = methods2[i4];
                    if (AbstractC0223g.m414a(method.getName(), "getChildAdapterPosition") && method.getParameterTypes().length == 1 && method.getParameterTypes()[0].isAssignableFrom(view2.getClass())) {
                        break;
                    }
                    i4++;
                }
                if (method != null) {
                    Object objInvoke = method.invoke(view, view2);
                    Number number3 = objInvoke instanceof Number ? (Number) objInvoke : null;
                    int iIntValue = number3 != null ? number3.intValue() : -1;
                    if (iIntValue >= 0) {
                        i3 = iIntValue;
                        break;
                    }
                }
            } catch (Throwable unused) {
            }
            Object parent2 = view2.getParent();
            view2 = parent2 instanceof View ? (View) parent2 : null;
        }
        if (i3 < 0 || (objM1884T = m1884T(view, i3)) == null) {
            return null;
        }
        return objM1884T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public final void m1887U0(View view) {
        m1888V0(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1887U0(childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    public final void m1888V0(View view) {
        int iIntValue;
        C0872U c0872u = (C0872U) this.f3106E.remove(view);
        if (c0872u == null) {
            return;
        }
        view.setVisibility(c0872u.f3002a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            boolean z2 = true;
            boolean z3 = false;
            Integer num = c0872u.f3003b;
            if (num != null && layoutParams.width != (iIntValue = num.intValue())) {
                layoutParams.width = iIntValue;
                z3 = true;
            }
            Integer num2 = c0872u.f3004c;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (layoutParams.height != iIntValue2) {
                    layoutParams.height = iIntValue2;
                } else {
                    z2 = z3;
                }
                z3 = z2;
            }
            if (z3) {
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final int[] m1889W(Object obj) {
        String strM1868G;
        WeakHashMap weakHashMap = this.f3128g;
        int[] iArr = (int[]) weakHashMap.get(obj);
        if (iArr != null) {
            return iArr;
        }
        Method methodM1809A = m1809A(this.f3131j, obj);
        int i2 = 0;
        int iIntValue = -1;
        if (methodM1809A != null) {
            Object objInvokeOriginalMethod = XposedBridge.invokeOriginalMethod(methodM1809A, obj, new Object[0]);
            Integer num = objInvokeOriginalMethod instanceof Integer ? (Integer) objInvokeOriginalMethod : null;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        if (iIntValue < 0) {
            return null;
        }
        if (iIntValue == 0) {
            int[] iArr2 = new int[0];
            weakHashMap.put(obj, iArr2);
            return iArr2;
        }
        Set setM1867F = m1867F();
        if (setM1867F.isEmpty()) {
            int[] iArr3 = new int[iIntValue];
            while (i2 < iIntValue) {
                iArr3[i2] = i2;
                i2++;
            }
            weakHashMap.put(obj, iArr3);
            return iArr3;
        }
        ArrayList arrayList = new ArrayList(iIntValue);
        while (i2 < iIntValue) {
            Method methodM1809A2 = m1809A(this.f3130i, obj);
            Object objInvokeOriginalMethod2 = methodM1809A2 == null ? null : XposedBridge.invokeOriginalMethod(methodM1809A2, obj, new Integer[]{Integer.valueOf(i2)});
            if (objInvokeOriginalMethod2 == null || (strM1868G = m1868G(objInvokeOriginalMethod2)) == null || AbstractC0307q.m534d0(strM1868G) || !setM1867F.contains(strM1868G)) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        int[] iArrM280v0 = AbstractC0123k.m280v0(arrayList);
        if (iArrM280v0.length != iIntValue) {
            AbstractC0731a.m1384a("hide contact visible mapping changed", obj.getClass().getName(), AbstractC0174d.m351g(iIntValue, "rawCount="), AbstractC0174d.m351g(iArrM280v0.length, "visibleCount="));
        }
        weakHashMap.put(obj, iArrM280v0);
        return iArrM280v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public final void m1890X0(final Object obj, final ListView listView, final View view) {
        final View view2;
        final C0894d0 c0894d0 = this;
        if (view != null) {
            view2 = view;
        } else if (listView != null) {
            view2 = listView;
        } else {
            View viewM1827R0 = m1827R0(obj, listView, view);
            if (viewM1827R0 == null) {
                return;
            } else {
                view2 = viewM1827R0;
            }
        }
        if (c0894d0.f3140s) {
            return;
        }
        c0894d0.f3140s = true;
        final C0227k c0227k = new C0227k();
        final long[] jArr = {0, 160, 500, 1200};
        final long[] jArr2 = {2500};
        final int i2 = 0;
        int i3 = 0;
        while (i3 < 4) {
            view2.postDelayed(new Runnable(c0227k, jArr2, i2, jArr, obj, listView, view, view2) { // from class: r0.I

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0227k f2886b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long[] f2887c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f2888d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f2889e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ListView f2890f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ View f2891g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ View f2892h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f2889e = obj;
                    this.f2890f = listView;
                    this.f2891g = view;
                    this.f2892h = view2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    Object c0104d;
                    final C0894d0 c0894d02 = this.f2885a;
                    final Object obj2 = this.f2889e;
                    final ListView listView2 = this.f2890f;
                    final View view3 = this.f2891g;
                    final int i4 = 0;
                    try {
                        c0894d02.getClass();
                        View viewM1827R02 = C0894d0.m1827R0(obj2, listView2, view3);
                        boolean z2 = viewM1827R02 != null && C0894d0.m1832Y(viewM1827R02);
                        c0894d02.m1904o(obj2, listView2, view3);
                        c0104d = Boolean.valueOf(z2);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    Object obj3 = Boolean.FALSE;
                    if (c0104d instanceof C0104d) {
                        c0104d = obj3;
                    }
                    boolean zBooleanValue = ((Boolean) c0104d).booleanValue();
                    C0227k c0227k2 = this.f2886b;
                    if (zBooleanValue && !c0227k2.f567a) {
                        c0227k2.f567a = true;
                        final long[] jArr3 = this.f2887c;
                        this.f2892h.postDelayed(new Runnable() { // from class: r0.M
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0894d0 c0894d03 = c0894d02;
                                try {
                                    c0894d03.m1904o(obj2, listView2, view3);
                                } catch (Throwable unused) {
                                }
                                if (i4 == jArr3.length - 1) {
                                    c0894d03.f3140s = false;
                                }
                            }
                        }, jArr3[0]);
                    }
                    if (this.f2888d != 3 || c0227k2.f567a) {
                        return;
                    }
                    c0894d02.f3140s = false;
                }
            }, jArr[i3]);
            i3++;
            c0894d0 = this;
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: Y0 */
    public final void m1891Y0(View view) {
        m1877M0();
        ?? r3 = this.f3105D.f2997c;
        if (r3.isEmpty()) {
            return;
        }
        ArrayList<View> arrayList = new ArrayList();
        if (m1820I0()) {
            ArrayList arrayList2 = new ArrayList();
            m1856q(arrayList2, view);
            if (!arrayList2.isEmpty()) {
                arrayList.add(view);
            }
        }
        ArrayList<View> arrayList3 = new ArrayList();
        m1854p(view, arrayList3, view);
        for (View view2 : arrayList3) {
            if (view2 != view && !arrayList.contains(view2)) {
                arrayList.add(view2);
            }
        }
        for (View view3 : arrayList) {
            ArrayList arrayList4 = new ArrayList();
            m1856q(arrayList4, view3);
            if (!this.f3121T && !arrayList4.isEmpty()) {
                this.f3121T = true;
                AbstractC0731a.m1384a("hide contact visible row sample", "root=".concat(view.getClass().getName()), "row=".concat(view3.getClass().getName()), "texts=".concat(AbstractC0123k.m271m0(arrayList4, "|", null, null, null, 62)), "hidden=".concat(AbstractC0123k.m271m0(r3, "|", null, null, null, 62)));
            } else if (!this.f3137p && !arrayList4.isEmpty()) {
                this.f3137p = true;
            }
            if (!arrayList4.isEmpty()) {
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    if (r3.contains((String) it.next())) {
                        m1895f0(view3);
                        break;
                    }
                }
            }
            m1888V0(view3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public final void m1892Z0(View view) {
        if (!(view instanceof ViewGroup)) {
            m1891Y0(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            m1891Y0(childAt);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a1 */
    public final boolean m1893a1(Object obj, ListView listView, Object obj2, View view) {
        String name = obj.getClass().getName();
        String name2 = listView != null ? listView.getClass().getName() : null;
        if (name2 == null) {
            name2 = "";
        }
        String name3 = obj2 != null ? obj2.getClass().getName() : null;
        if (name3 == null) {
            name3 = "";
        }
        String name4 = view != null ? view.getClass().getName() : null;
        String strM271m0 = AbstractC0123k.m271m0(AbstractC0120h.m252Z(new String[]{name, name2, name3, name4 != null ? name4 : "", AbstractC0123k.m271m0(AbstractC0123k.m275q0(m1867F()), ",", null, null, null, 62)}), "|", null, null, null, 62);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strM271m0.equals(this.f3143v) && jCurrentTimeMillis - this.f3144w < 160) {
            return true;
        }
        this.f3143v = strM271m0;
        this.f3144w = jCurrentTimeMillis;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b1 */
    public final boolean m1894b1(PopupWindow popupWindow, View view, String str, String str2, String str3, View view2) {
        Object c0104d;
        TextView textViewM1862w = m1862w(view);
        WeakHashMap weakHashMap = this.f3111J;
        if (textViewM1862w != null) {
            weakHashMap.put(popupWindow, view);
            m1879O0(str, str2, popupWindow);
            return true;
        }
        ViewGroup viewGroupM1864x = m1864x(view);
        if (viewGroupM1864x == null) {
            return false;
        }
        TextView textView = new TextView(viewGroupM1864x.getContext());
        boolean z2 = AbstractC1126i.f3786a;
        textView.setText(C1124g.m2436l());
        textView.setTextSize(16.0f);
        textView.setTextColor(Color.rgb(30, 30, 30));
        textView.setGravity(16);
        Context context = textView.getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        int iM1859t = m1859t(context, 32);
        Context context2 = textView.getContext();
        AbstractC0223g.m417d(context2, "getContext(...)");
        textView.setPadding(iM1859t, 0, m1859t(context2, 32), 0);
        Context context3 = textView.getContext();
        AbstractC0223g.m417d(context3, "getContext(...)");
        textView.setMinHeight(m1859t(context3, 48));
        Context context4 = textView.getContext();
        AbstractC0223g.m417d(context4, "getContext(...)");
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, m1859t(context4, 48)));
        textView.setOnClickListener(new ViewOnClickListenerC0853L(this, str, str2, popupWindow, 0));
        viewGroupM1864x.addView(textView, 0);
        try {
            viewGroupM1864x.requestLayout();
            viewGroupM1864x.invalidate();
            view.requestLayout();
            view.invalidate();
            popupWindow.update();
            c0104d = C0109i.f404a;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("contact quick add runtime popup refresh fail", thM246a);
        }
        weakHashMap.put(popupWindow, view);
        m1879O0(str, str2, popupWindow);
        AbstractC0731a.m1384a("contact quick add runtime popup injected", str, str2, "source=" + str3, AbstractC0174d.m352h("anchor=", view2 != null ? view2.getClass().getName() : null));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final void m1895f0(View view) {
        WeakHashMap weakHashMap = this.f3106E;
        if (!weakHashMap.containsKey(view)) {
            int visibility = view.getVisibility();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            weakHashMap.put(view, new C0872U(visibility, numValueOf, layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null));
        }
        view.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            if (layoutParams3.width != 0) {
                layoutParams3.width = 0;
            }
            if (layoutParams3.height != 0) {
                layoutParams3.height = 0;
            }
            view.setLayoutParams(layoutParams3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final void m1896g0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, "getItem", cls2);
        if (methodMo1011b == null) {
            return;
        }
        Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(cls, "getCount", new Object[0]);
        if (methodMo1011b2 == null) {
            return;
        }
        Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(cls, "notifyDataSetChanged", new Object[0]);
        if (methodMo1011b3 == null) {
            return;
        }
        Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(cls, "getItemId", cls2);
        this.f3130i.put(cls, methodMo1011b);
        this.f3131j.put(cls, methodMo1011b2);
        String str = "hide-contact-count-" + methodMo1011b2;
        if (!MainHook.uniqueMetaStore.contains(str)) {
            AbstractC0514f.m1027d(methodMo1011b2, new C0874V(this, 1));
            MainHook.uniqueMetaStore.add(str);
        }
        String strM354j = AbstractC0174d.m354j("hide-contact-item-", methodMo1011b);
        if (!MainHook.uniqueMetaStore.contains(strM354j)) {
            AbstractC0514f.m1027d(methodMo1011b, new C0874V(this, 2));
            MainHook.uniqueMetaStore.add(strM354j);
        }
        if (methodMo1011b4 != null) {
            String strM354j2 = AbstractC0174d.m354j("hide-contact-item-id-", methodMo1011b4);
            if (!MainHook.uniqueMetaStore.contains(strM354j2)) {
                AbstractC0514f.m1027d(methodMo1011b4, new C0874V(this, 3));
                MainHook.uniqueMetaStore.add(strM354j2);
            }
        }
        String strM354j3 = AbstractC0174d.m354j("hide-contact-notify-", methodMo1011b3);
        if (MainHook.uniqueMetaStore.contains(strM354j3)) {
            return;
        }
        AbstractC0514f.m1027d(methodMo1011b3, new C0874V(this, 4));
        MainHook.uniqueMetaStore.add(strM354j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final void m1897h0(Class cls, String str, Class... clsArr) {
        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, str, Arrays.copyOf(clsArr, clsArr.length));
        if (methodMo1011b == null) {
            return;
        }
        String strM354j = AbstractC0174d.m354j("hide-contact-address-fragment-", methodMo1011b);
        if (MainHook.uniqueMetaStore.contains(strM354j)) {
            return;
        }
        AbstractC0514f.m1027d(methodMo1011b, new C0874V(this, 5));
        MainHook.uniqueMetaStore.add(strM354j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Object c0104d;
        Class clsMo1021l;
        int i2 = 26;
        int i3 = 6;
        int i4 = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3103B = applicationContext;
        if (!MainHook.uniqueMetaStore.contains("contact-quick-add-launcher-activity-cache")) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
                clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.mm.ui.LauncherUI");
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (clsMo1021l != null) {
                Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "onResume", new Object[0]);
                if (methodMo1011b != null) {
                    AbstractC0514f.m1027d(methodMo1011b, new C0874V(this, 23));
                    c0104d = Boolean.valueOf(MainHook.uniqueMetaStore.add("contact-quick-add-launcher-activity-cache"));
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("contact quick add launcher activity cache hook missing", thM246a);
                }
            }
        }
        this.f3147z = AbstractC0039l.m67e(context);
        this.f3102A = AbstractC0039l.m71i(context);
        boolean z2 = AbstractC1126i.f3786a;
        String strM355k = AbstractC0174d.m355k("enabled=", C1124g.m2415F());
        int i5 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i5 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i5;
        }
        String strM351g = AbstractC0174d.m351g(AbstractC1135r.f3833e, "version=");
        String strM355k2 = AbstractC0174d.m355k("quickAddCached=", this.f3102A != null);
        C0014N c0014n = this.f3102A;
        String strM271m0 = c0014n != null ? AbstractC0123k.m271m0(c0014n.f129d, ";", null, null, new C0804d(28), 30) : null;
        if (strM271m0 == null) {
            strM271m0 = "";
        }
        AbstractC0731a.m1384a("quickadd contact handleHook", strM355k, strM351g, strM355k2, "popup=".concat(strM271m0));
        if (this.f3147z == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
            C0052y.m98c(context, new C0048u("contact", "通讯录隐藏", new C0804d(29), new C0035h(context, 12), new C0838G(this), new C0863P(i4)));
        }
        String[] strArr = f3091a0;
        for (String str : strArr) {
            ClassLoader classLoader2 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
            AbstractC0223g.m418e(str, "clazz");
            Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, str);
            if (clsMo1021l2 != null) {
                String str2 = "hide-contact-ctor-" + clsMo1021l2;
                if (!MainHook.uniqueMetaStore.contains(str2)) {
                    XposedBridge.hookAllConstructors(clsMo1021l2, new C0051x(i3));
                    MainHook.uniqueMetaStore.add(str2);
                }
            }
        }
        if (!MainHook.uniqueMetaStore.contains("hide-contact-bind-list-adapter")) {
            Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(ListView.class, "setAdapter", ListAdapter.class);
            if (methodMo1011b2 != null) {
                AbstractC0514f.m1027d(methodMo1011b2, new C0874V(this, i4));
                MainHook.uniqueMetaStore.add("hide-contact-bind-list-adapter");
            }
        }
        if (!MainHook.uniqueMetaStore.contains("hide-contact-search-layout-children")) {
            Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(ListView.class, "layoutChildren", new Object[0]);
            if (methodMo1011b3 != null) {
                AbstractC0514f.m1027d(methodMo1011b3, new C0874V(this, 25));
                MainHook.uniqueMetaStore.add("hide-contact-search-layout-children");
            }
        }
        ClassLoader classLoader3 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
        Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader3, "com.tencent.mm.view.recyclerview.WxRecyclerView");
        if (clsMo1021l3 != null) {
            ClassLoader classLoader4 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader4, "getClassLoader(...)");
            Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(classLoader4, "androidx.recyclerview.widget.RecyclerView$Adapter");
            if (clsMo1021l4 != null) {
                Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "setAdapter", clsMo1021l4);
                if (methodMo1011b4 != null) {
                    String strM354j = AbstractC0174d.m354j("hide-contact-bind-wx-recycler-", methodMo1011b4);
                    if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                        AbstractC0514f.m1027d(methodMo1011b4, new C0874V(this, 27));
                        MainHook.uniqueMetaStore.add(strM354j);
                    }
                }
            }
        }
        C0036i c0036i = this.f3147z;
        String str3 = c0036i != null ? c0036i.f234b : "com.tencent.mm.ui.contact.address.AddressLiveList";
        ClassLoader classLoader5 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader5, "getClassLoader(...)");
        Class clsMo1021l5 = AbstractC0514f.f1622b.mo1021l(classLoader5, str3);
        if (clsMo1021l5 != null) {
            C0036i c0036i2 = this.f3147z;
            Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(clsMo1021l5, c0036i2 != null ? c0036i2.f235c : "e", List.class);
            if (methodMo1011b5 != null) {
                String strM354j2 = AbstractC0174d.m354j("hide-contact-address-live-list-", methodMo1011b5);
                if (!MainHook.uniqueMetaStore.contains(strM354j2)) {
                    AbstractC0514f.m1027d(methodMo1011b5, new C0874V(this, i3));
                    MainHook.uniqueMetaStore.add(strM354j2);
                }
            }
        }
        C0036i c0036i3 = this.f3147z;
        List list = c0036i3 != null ? c0036i3.f238f : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        for (String str4 : AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list, AbstractC0120h.m252Z(new String[]{"gl3.t0", "ik3.t0", "ui3.t0", "xm3.t0"}))))) {
            ClassLoader classLoader6 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader6, "getClassLoader(...)");
            AbstractC0223g.m418e(str4, "clazz");
            Class clsMo1021l6 = AbstractC0514f.f1622b.mo1021l(classLoader6, str4);
            if (clsMo1021l6 != null) {
                m1903m0(clsMo1021l6, true);
            }
        }
        for (String str5 : strArr) {
            ClassLoader classLoader7 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader7, "getClassLoader(...)");
            AbstractC0223g.m418e(str5, "clazz");
            Class clsMo1021l7 = AbstractC0514f.f1622b.mo1021l(classLoader7, str5);
            if (clsMo1021l7 != null) {
                m1896g0(clsMo1021l7);
            }
        }
        ClassLoader classLoader8 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader8, "getClassLoader(...)");
        Class clsMo1021l8 = AbstractC0514f.f1622b.mo1021l(classLoader8, "com.tencent.mm.ui.contact.AddressUI$AddressUIFragment");
        if (clsMo1021l8 == null) {
            AbstractC0731a.m1387d("hide contact address fragment class not found", "com.tencent.mm.ui.contact.AddressUI$AddressUIFragment");
        } else {
            m1897h0(clsMo1021l8, "onActivityCreated", Bundle.class);
            m1897h0(clsMo1021l8, "onResume", new Class[0]);
            m1897h0(clsMo1021l8, "onViewCreated", View.class, Bundle.class);
            m1897h0(clsMo1021l8, "q0", new Class[0]);
            m1897h0(clsMo1021l8, "p0", Bundle.class);
            m1897h0(clsMo1021l8, "s0", new Class[0]);
            m1899j0(clsMo1021l8);
        }
        ClassLoader classLoader9 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader9, "getClassLoader(...)");
        Class clsMo1021l9 = AbstractC0514f.f1622b.mo1021l(classLoader9, "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment");
        if (clsMo1021l9 == null) {
            AbstractC0731a.m1387d("hide contact mvvm address fragment class not found", "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment");
        } else {
            m1897h0(clsMo1021l9, "q0", Bundle.class);
            m1897h0(clsMo1021l9, "l0", Bundle.class);
            m1897h0(clsMo1021l9, "t0", new Class[0]);
            m1897h0(clsMo1021l9, "w0", new Class[0]);
            m1897h0(clsMo1021l9, "e0", new Class[0]);
            m1897h0(clsMo1021l9, "r0", new Class[0]);
            m1897h0(clsMo1021l9, "u0", new Class[0]);
            m1897h0(clsMo1021l9, "onViewCreated", View.class, Bundle.class);
            m1899j0(clsMo1021l9);
        }
        for (String str6 : AbstractC0120h.m252Z(new String[]{"androidx.fragment.app.l", "com.tencent.mm.ui.MMFragment"})) {
            ClassLoader classLoader10 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader10, "getClassLoader(...)");
            AbstractC0223g.m418e(str6, "clazz");
            Class clsMo1021l10 = AbstractC0514f.f1622b.mo1021l(classLoader10, str6);
            if (clsMo1021l10 != null) {
                Iterator it = AbstractC0120h.m252Z(new String[]{"onStart", "onResume"}).iterator();
                while (it.hasNext()) {
                    Method methodMo1011b6 = AbstractC0514f.f1622b.mo1011b(clsMo1021l10, (String) it.next(), new Object[0]);
                    if (methodMo1011b6 != null) {
                        String strM354j3 = AbstractC0174d.m354j("hide-contact-fragment-lifecycle-", methodMo1011b6);
                        if (!MainHook.uniqueMetaStore.contains(strM354j3)) {
                            AbstractC0514f.m1027d(methodMo1011b6, new C0874V(this, i2));
                            MainHook.uniqueMetaStore.add(strM354j3);
                        }
                    }
                }
            }
        }
        if (!MainHook.uniqueMetaStore.contains("hide-contact-database-queries")) {
            ClassLoader classLoader11 = AbstractC0503h.m991x().getClassLoader();
            AbstractC0223g.m418e(classLoader11, "classLoader");
            Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(AbstractC0514f.f1622b.mo1021l(classLoader11, "com.tencent.wcdb.database.SQLiteDatabase"), new C0804d(i2));
            AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
            int length = methodArrMo1013d.length;
            while (i4 < length) {
                AbstractC0514f.m1027d(methodArrMo1013d[i4], new C0874V(this, 7));
                i4++;
            }
            MainHook.uniqueMetaStore.add("hide-contact-database-queries");
        }
        m1902l0(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final void m1898i0(Class cls, String str, boolean z2) {
        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, str, Boolean.TYPE);
        if (methodMo1011b == null) {
            return;
        }
        String strM354j = AbstractC0174d.m354j("hide-contact-address-visible-", methodMo1011b);
        if (MainHook.uniqueMetaStore.contains(strM354j)) {
            return;
        }
        AbstractC0514f.m1027d(methodMo1011b, new C0876W(z2, this, 0));
        MainHook.uniqueMetaStore.add(strM354j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public final void m1899j0(Class cls) {
        m1898i0(cls, "setUserVisibleHint", true);
        m1898i0(cls, "setMenuVisibility", true);
        m1898i0(cls, "onHiddenChanged", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1900k(String str, String str2) {
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F()) {
            this.f3116O = true;
            String str3 = null;
            this.f3113L = null;
            this.f3114M = null;
            this.f3115N = 0L;
            this.f3116O = false;
            this.f3117P = null;
            this.f3110I.clear();
            String string = AbstractC0299i.m507C0(str).toString();
            if (AbstractC0307q.m534d0(string)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListM2433i = C1124g.m2433i();
            if (!arrayListM2433i.isEmpty()) {
                Iterator it = arrayListM2433i.iterator();
                while (it.hasNext()) {
                    if (AbstractC0223g.m414a(((MaskItemBean) it.next()).getMaskId(), string)) {
                        if (!AbstractC0223g.m414a(this.f3118Q, string) || jCurrentTimeMillis - this.f3119R >= 2000) {
                            AbstractC0503h.m978P("已在隐藏名单中");
                            return;
                        }
                        return;
                    }
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            String string2 = AbstractC0299i.m507C0(str2).toString();
            if (!AbstractC0307q.m534d0(string2) && !string2.equals(string)) {
                str3 = string2;
            }
            String str4 = str3 == null ? "" : str3;
            boolean z3 = AbstractC1126i.f3786a;
            C1124g.m2426b(new MaskItemBean(string, str4, 0, null, null, null, 60, null));
            C1124g.m2420K(string);
            ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
            m1882Q0();
            this.f3118Q = string;
            this.f3119R = jCurrentTimeMillis;
            AbstractC0503h.m978P(AbstractC0307q.m534d0(str4) ? "已加入隐藏名单" : "已加入隐藏名单：".concat(str4));
            AbstractC0731a.m1384a("quick add contact mask", string, str4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m1901k0(Class cls) {
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            return;
        }
        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, "onMMMenuItemSelected", MenuItem.class, Integer.TYPE);
        if (methodMo1011b == null || Modifier.isAbstract(methodMo1011b.getModifiers())) {
            return;
        }
        String strM354j = AbstractC0174d.m354j("contact-quick-add-menu-item-selected-callback-", methodMo1011b);
        if (MainHook.uniqueMetaStore.contains(strM354j)) {
            return;
        }
        AbstractC0514f.m1027d(methodMo1011b, new C0874V(this, 8));
        MainHook.uniqueMetaStore.add(strM354j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m1902l0(Context context) {
        Class cls;
        Class cls2;
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        XC_MethodHook.Unhook c0104d4;
        Object c0104d5;
        Class clsMo1021l;
        Object c0104d6;
        Class clsMo1021l2;
        AbstractC0731a.m1384a("quickadd contact install start", "popup=".concat(AbstractC0123k.m271m0(m1874L(), ";", null, null, new C0804d(25), 30)));
        for (C0868S c0868s : m1874L()) {
            String str = c0868s.f2987a;
            StringBuilder sbM357m = AbstractC0174d.m357m("contact-quick-add-popup-menu-create-", str, "-");
            String str2 = c0868s.f2988b;
            sbM357m.append(str2);
            sbM357m.append("-");
            String str3 = c0868s.f2989c;
            sbM357m.append(str3);
            String string = sbM357m.toString();
            if (!MainHook.uniqueMetaStore.contains(string)) {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
                    AbstractC0223g.m418e(str2, "clazz");
                    Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader, str2);
                    if (clsMo1021l3 != null) {
                        ClassLoader classLoader2 = context.getClassLoader();
                        AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
                        AbstractC0223g.m418e(str, "clazz");
                        Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(classLoader2, str);
                        if (clsMo1021l4 != null) {
                            Class cls3 = Integer.TYPE;
                            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l4, str3, View.class, cls3, Long.TYPE, View.OnCreateContextMenuListener.class, clsMo1021l3, cls3, cls3);
                            if (methodMo1011b != null) {
                                AbstractC0514f.m1027d(methodMo1011b, new C0874V(this, 13));
                                MainHook.uniqueMetaStore.add(string);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        C0014N c0014n = this.f3102A;
        String[] strArrM1822K0 = m1822K0(c0014n != null ? c0014n.f131f : null, f3086V);
        int length = strArrM1822K0.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            cls = Long.TYPE;
            cls2 = Integer.TYPE;
            if (i3 >= length) {
                break;
            }
            String str4 = strArrM1822K0[i3];
            String strM352h = AbstractC0174d.m352h("contact-quick-add-popup-item-click-", str4);
            if (!MainHook.uniqueMetaStore.contains(strM352h)) {
                try {
                    ClassLoader classLoader3 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
                    AbstractC0223g.m418e(str4, "clazz");
                    Class clsMo1021l5 = AbstractC0514f.f1622b.mo1021l(classLoader3, str4);
                    if (clsMo1021l5 != null) {
                        Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsMo1021l5, "onItemClick", AdapterView.class, View.class, cls2, cls);
                        if (methodMo1011b2 != null) {
                            AbstractC0514f.m1027d(methodMo1011b2, new C0874V(this, 12));
                            MainHook.uniqueMetaStore.add(strM352h);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            i3++;
        }
        C0014N c0014n2 = this.f3102A;
        for (String str5 : m1822K0(c0014n2 != null ? c0014n2.f133h : null, new String[]{"db5.t4"})) {
            try {
                ClassLoader classLoader4 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader4, "getClassLoader(...)");
                AbstractC0223g.m418e(str5, "clazz");
                Class clsMo1021l6 = AbstractC0514f.f1622b.mo1021l(classLoader4, str5);
                if (clsMo1021l6 != null) {
                    m1901k0(clsMo1021l6);
                }
            } catch (Throwable unused3) {
            }
        }
        C0014N c0014n3 = this.f3102A;
        for (String str6 : m1822K0(c0014n3 != null ? c0014n3.f132g : null, f3087W)) {
            String strM352h2 = AbstractC0174d.m352h("contact-quick-add-popup-adapter-get-view-", str6);
            if (!MainHook.uniqueMetaStore.contains(strM352h2)) {
                try {
                    ClassLoader classLoader5 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader5, "getClassLoader(...)");
                    AbstractC0223g.m418e(str6, "clazz");
                    Class clsMo1021l7 = AbstractC0514f.f1622b.mo1021l(classLoader5, str6);
                    if (clsMo1021l7 != null) {
                        Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(clsMo1021l7, "getView", cls2, View.class, ViewGroup.class);
                        if (methodMo1011b3 != null) {
                            AbstractC0514f.m1027d(methodMo1011b3, new C0874V(this, 10));
                            MainHook.uniqueMetaStore.add(strM352h2);
                        }
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        String[] strArrM1872J = m1872J();
        int length2 = strArrM1872J.length;
        int i4 = 0;
        while (i4 < length2) {
            String str7 = strArrM1872J[i4];
            String strM352h3 = AbstractC0174d.m352h("contact-quick-add-popup-dismiss-", str7);
            if (!MainHook.uniqueMetaStore.contains(strM352h3)) {
                try {
                    ClassLoader classLoader6 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader6, "getClassLoader(...)");
                    AbstractC0223g.m418e(str7, "clazz");
                    Class clsMo1021l8 = AbstractC0514f.f1622b.mo1021l(classLoader6, str7);
                    if (clsMo1021l8 != null) {
                        Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(clsMo1021l8, "a", new Object[i2]);
                        if (methodMo1011b4 != null) {
                            AbstractC0514f.m1027d(methodMo1011b4, new C0874V(this, 11));
                            MainHook.uniqueMetaStore.add(strM352h3);
                        }
                    }
                } catch (Throwable unused5) {
                }
            }
            i4++;
            i2 = 0;
        }
        if (!MainHook.uniqueMetaStore.contains("contact-quick-add-native-context-menu")) {
            try {
                Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(View.class, "setOnCreateContextMenuListener", View.OnCreateContextMenuListener.class);
                if (methodMo1011b5 != null) {
                    AbstractC0514f.m1027d(methodMo1011b5, new C0874V(this, 9));
                }
                c0104d = Boolean.valueOf(MainHook.uniqueMetaStore.add("contact-quick-add-native-context-menu"));
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("contact quick add native context hook missing", thM246a);
            }
        }
        if (m1911x0()) {
            C0014N c0014n4 = this.f3102A;
            List list = c0014n4 != null ? c0014n4.f134i : null;
            List list2 = C0131s.f426a;
            if (list == null) {
                list = list2;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!m1863w0((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            for (String str8 : AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList2))) {
                if (!m1863w0(str8)) {
                    String strConcat = "contact-quick-add-dynamic-address-menu-create-".concat(str8);
                    if (!MainHook.uniqueMetaStore.contains(strConcat)) {
                        try {
                            ClassLoader classLoader7 = context.getClassLoader();
                            AbstractC0223g.m417d(classLoader7, "getClassLoader(...)");
                            clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader7, str8);
                        } catch (Throwable th2) {
                            c0104d6 = new C0104d(th2);
                        }
                        if (clsMo1021l2 != null) {
                            Method methodMo1011b6 = AbstractC0514f.f1622b.mo1011b(clsMo1021l2, "onCreateContextMenu", ContextMenu.class, View.class, ContextMenu.ContextMenuInfo.class);
                            if (methodMo1011b6 != null) {
                                AbstractC0514f.m1027d(methodMo1011b6, new C0891c0(this, str8, 1));
                                c0104d6 = Boolean.valueOf(MainHook.uniqueMetaStore.add(strConcat));
                                Throwable thM246a2 = AbstractC0105e.m246a(c0104d6);
                                if (thM246a2 != null) {
                                    AbstractC0731a.m1387d("contact quick add dynamic address menu create hook fail", thM246a2);
                                }
                            }
                        }
                    }
                }
            }
            C0014N c0014n5 = this.f3102A;
            List list3 = c0014n5 != null ? c0014n5.f135j : null;
            if (list3 != null) {
                list2 = list3;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (!AbstractC0307q.m534d0((String) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (!m1863w0((String) obj4)) {
                    arrayList4.add(obj4);
                }
            }
            for (String str9 : AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList4))) {
                if (!m1863w0(str9)) {
                    String strConcat2 = "contact-quick-add-dynamic-address-menu-click-".concat(str9);
                    if (!MainHook.uniqueMetaStore.contains(strConcat2)) {
                        try {
                            ClassLoader classLoader8 = context.getClassLoader();
                            AbstractC0223g.m417d(classLoader8, "getClassLoader(...)");
                            clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader8, str9);
                        } catch (Throwable th3) {
                            c0104d5 = new C0104d(th3);
                        }
                        if (clsMo1021l != null) {
                            Method methodMo1011b7 = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "onMMMenuItemSelected", MenuItem.class, cls2);
                            if (methodMo1011b7 != null) {
                                AbstractC0514f.m1027d(methodMo1011b7, new C0891c0(this, str9, 0));
                                c0104d5 = Boolean.valueOf(MainHook.uniqueMetaStore.add(strConcat2));
                                Throwable thM246a3 = AbstractC0105e.m246a(c0104d5);
                                if (thM246a3 != null) {
                                    AbstractC0731a.m1387d("contact quick add dynamic address menu click hook fail", thM246a3);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (m1911x0()) {
            return;
        }
        if (!MainHook.uniqueMetaStore.contains("contact-quick-add-perform-click")) {
            try {
                Class[] clsArr = {View.class, TextView.class};
                for (int i5 = 0; i5 < 2; i5++) {
                    Class cls4 = clsArr[i5];
                    Method methodMo1011b8 = AbstractC0514f.f1622b.mo1011b(cls4, "performClick", new Object[0]);
                    if (methodMo1011b8 != null) {
                        AbstractC0514f.m1027d(methodMo1011b8, new C0885a0(this, cls4, 0));
                    }
                }
                Class[] clsArr2 = {AdapterView.class, ListView.class};
                for (int i6 = 0; i6 < 2; i6++) {
                    Class cls5 = clsArr2[i6];
                    Method methodMo1011b9 = AbstractC0514f.f1622b.mo1011b(cls5, "performItemClick", View.class, cls2, cls);
                    if (methodMo1011b9 != null) {
                        AbstractC0514f.m1027d(methodMo1011b9, new C0885a0(this, cls5, 1));
                    }
                }
                c0104d2 = C0109i.f404a;
            } catch (Throwable th4) {
                c0104d2 = new C0104d(th4);
            }
            Throwable thM246a4 = AbstractC0105e.m246a(c0104d2);
            if (thM246a4 != null) {
                AbstractC0731a.m1387d("contact quick add perform click hook missing", thM246a4);
            }
            MainHook.uniqueMetaStore.add("contact-quick-add-perform-click");
        }
        if (!MainHook.uniqueMetaStore.contains("contact-quick-add-runtime-long-click")) {
            try {
                Class[] clsArr3 = {View.class, ViewGroup.class, TextView.class};
                for (int i7 = 0; i7 < 3; i7++) {
                    Class cls6 = clsArr3[i7];
                    Method methodMo1011b10 = AbstractC0514f.f1622b.mo1011b(cls6, "performLongClick", new Object[0]);
                    if (methodMo1011b10 != null) {
                        AbstractC0514f.m1027d(methodMo1011b10, new C0874V(this, 14));
                    }
                    Class cls7 = Float.TYPE;
                    Method methodMo1011b11 = AbstractC0514f.f1622b.mo1011b(cls6, "performLongClick", cls7, cls7);
                    if (methodMo1011b11 != null) {
                        AbstractC0514f.m1027d(methodMo1011b11, new C0874V(this, 15));
                    }
                }
                Method methodMo1011b12 = AbstractC0514f.f1622b.mo1011b(View.class, "setOnLongClickListener", View.OnLongClickListener.class);
                if (methodMo1011b12 != null) {
                    AbstractC0514f.m1027d(methodMo1011b12, new C0874V(this, 16));
                }
                c0104d3 = Boolean.valueOf(MainHook.uniqueMetaStore.add("contact-quick-add-runtime-long-click"));
            } catch (Throwable th5) {
                c0104d3 = new C0104d(th5);
            }
            Throwable thM246a5 = AbstractC0105e.m246a(c0104d3);
            if (thM246a5 != null) {
                AbstractC0731a.m1387d("contact quick add runtime long click hook fail", thM246a5);
            }
        }
        if (m1911x0() && !MainHook.uniqueMetaStore.contains("contact-quick-add-runtime-popup-probe")) {
            try {
                Method methodMo1011b13 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "setContentView", View.class);
                if (methodMo1011b13 != null) {
                    AbstractC0514f.m1027d(methodMo1011b13, new C0874V(this, 17));
                }
                Method methodMo1011b14 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAsDropDown", View.class);
                if (methodMo1011b14 != null) {
                    AbstractC0514f.m1027d(methodMo1011b14, new C0874V(this, 18));
                }
                Method methodMo1011b15 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAsDropDown", View.class, cls2, cls2);
                if (methodMo1011b15 != null) {
                    AbstractC0514f.m1027d(methodMo1011b15, new C0874V(this, 19));
                }
                Method methodMo1011b16 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAsDropDown", View.class, cls2, cls2, cls2);
                if (methodMo1011b16 != null) {
                    AbstractC0514f.m1027d(methodMo1011b16, new C0874V(this, 20));
                }
                Method methodMo1011b17 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAtLocation", View.class, cls2, cls2, cls2);
                if (methodMo1011b17 != null) {
                    AbstractC0514f.m1027d(methodMo1011b17, new C0874V(this, 21));
                }
                Method methodMo1011b18 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAtLocation", IBinder.class, cls2, cls2, cls2);
                c0104d4 = methodMo1011b18 != null ? AbstractC0514f.f1622b.mo1014e(methodMo1011b18, new C0874V(this, 22)) : null;
            } catch (Throwable th6) {
                c0104d4 = new C0104d(th6);
            }
            Throwable thM246a6 = AbstractC0105e.m246a(c0104d4);
            if (thM246a6 != null) {
                AbstractC0731a.m1387d("contact quick add runtime popup probe fail", thM246a6);
            }
            MainHook.uniqueMetaStore.add("contact-quick-add-runtime-popup-probe");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m1903m0(Class cls, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            arrayList2.add(superclass);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d((Class) it.next(), new C0838G(this));
            AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
            arrayList.addAll(AbstractC0120h.m262j0(methodArrMo1013d));
        }
        HashSet hashSet = new HashSet();
        ArrayList<Method> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            Method method = (Method) obj;
            String name = method.getDeclaringClass().getName();
            String name2 = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            if (hashSet.add(name + "#" + name2 + "#" + AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(24), 30))) {
                arrayList3.add(obj);
            }
        }
        for (Method method2 : arrayList3) {
            String strM354j = AbstractC0174d.m354j("hide-contact-mvvm-bind-", method2);
            if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                AbstractC0514f.m1027d(method2, new C0876W(z2, this, 1));
                MainHook.uniqueMetaStore.add(strM354j);
                AbstractC0731a.m1384a("hide contact runtime adapter bind hooked", cls.getName(), method2.toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m1904o(Object obj, ListView listView, View view) {
        View viewM1827R0 = m1827R0(obj, listView, view);
        if (viewM1827R0 == null) {
            return;
        }
        if (m1835a0(listView) || m1833Z(view) || m1839c0(viewM1827R0)) {
            m1843e0(this, viewM1827R0, viewM1827R0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final List m1905r() {
        LinkedHashSet linkedHashSet = this.f3133l;
        C0036i c0036i = this.f3147z;
        List list = c0036i != null ? c0036i.f239g : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0135w.m301Z(AbstractC0135w.m301Z(linkedHashSet, list), AbstractC0079h.m167E(AbstractC1135r.m2475C("qa5.g", "fc5.g", "nd5.g", "tf5.g", "qa5.g")))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public final boolean m1906r0(Object obj) {
        if (obj == null) {
            return false;
        }
        return m1853o0(obj) || m1869G0(obj) || m1825P(obj) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m1907s(Object obj) {
        Object obj2;
        Object c0104d;
        try {
            AbstractC0514f.f1622b.mo1012c(obj, "a", new Object[0]);
        } catch (Throwable unused) {
        }
        for (String str : f3088X) {
            try {
                PopupWindow popupWindow = (PopupWindow) m1828S(obj, str);
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            } catch (Throwable unused2) {
            }
        }
        Class<?> superclass = obj.getClass();
        loop1: while (true) {
            obj2 = null;
            if (superclass == null) {
                break;
            }
            Field[] declaredFields = superclass.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    c0104d = field.get(obj);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d instanceof PopupWindow) {
                    obj2 = c0104d;
                    break loop1;
                }
            }
            superclass = superclass.getSuperclass();
        }
        PopupWindow popupWindow2 = (PopupWindow) obj2;
        if (popupWindow2 != null) {
            try {
                popupWindow2.dismiss();
            } catch (Throwable unused3) {
            }
        }
        this.f3108G.remove(obj);
        this.f3109H.remove(obj);
        this.f3111J.remove(obj);
        this.f3112K.remove(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public final boolean m1908t0(View view) {
        View view2;
        Object c0104d;
        Object obj;
        Object c0104d2;
        ListView listViewM1811B = m1811B(view);
        if (listViewM1811B != null) {
            WeakReference weakReference = this.f3123b;
            if ((weakReference != null ? (ListView) weakReference.get() : null) != listViewM1811B) {
                try {
                    c0104d2 = listViewM1811B.getAdapter();
                } catch (Throwable th) {
                    c0104d2 = new C0104d(th);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = null;
                }
                ListAdapter listAdapter = (ListAdapter) c0104d2;
                if (listAdapter == null || !m1852n0(listViewM1811B, listAdapter)) {
                    if (!m1861v0(listViewM1811B)) {
                    }
                    return false;
                }
            }
            return true;
        }
        View view3 = view;
        while (true) {
            if (view3 == null) {
                view3 = null;
                break;
            }
            if (m1819H0(view3)) {
                break;
            }
            Object parent = view3.getParent();
            view3 = parent instanceof View ? (View) parent : null;
        }
        if (view3 != null) {
            WeakReference weakReference2 = this.f3124c;
            if ((weakReference2 != null ? (View) weakReference2.get() : null) != view3) {
                WeakReference weakReference3 = this.f3122a;
                if (weakReference3 != null && (obj = weakReference3.get()) != null && m1865z(obj) == view3) {
                    this.f3124c = new WeakReference(view3);
                    return true;
                }
                try {
                    c0104d = AbstractC0514f.f1622b.mo1012c(view3, "getAdapter", new Object[0]);
                } catch (Throwable th2) {
                    c0104d = new C0104d(th2);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                String name = c0104d != null ? c0104d.getClass().getName() : null;
                if (name == null) {
                    name = "";
                }
                if (m1866E0(name)) {
                    this.f3124c = new WeakReference(view3);
                    return true;
                }
                Object objM1886U = m1886U(view3, view);
                if (objM1886U != null && m1906r0(objM1886U)) {
                    this.f3124c = new WeakReference(view3);
                    return true;
                }
                Context context = view3.getContext();
                String name2 = context != null ? context.getClass().getName() : null;
                if (name2 == null) {
                    name2 = "";
                }
                if (m1857q0(name2)) {
                    this.f3124c = new WeakReference(view3);
                    return true;
                }
            }
            return true;
        }
        Context context2 = view.getContext();
        String name3 = context2 != null ? context2.getClass().getName() : null;
        if (!m1857q0(name3 != null ? name3 : "")) {
            WeakReference weakReference4 = this.f3124c;
            if (weakReference4 != null && (view2 = (View) weakReference4.get()) != null) {
                while (view != null) {
                    if (view != view2) {
                        Object parent2 = view.getParent();
                        view = parent2 instanceof View ? (View) parent2 : null;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final Object m1909u(Object obj) {
        Object objM1830W0;
        Object objM1830W02;
        Object objM1830W03;
        Object objM1830W04;
        C0036i c0036i = this.f3147z;
        return (c0036i == null || (objM1830W04 = m1830W0(obj, c0036i.f236d)) == null) ? (!AbstractC1135r.m2500v() || (objM1830W03 = m1830W0(obj, "z0")) == null) ? (AbstractC1135r.m2485g() != EnumC1115A.WX_8_0_72 || (objM1830W02 = m1830W0(obj, "G0")) == null) ? (AbstractC1135r.m2485g() != EnumC1115A.WX_8_0_71 || (objM1830W0 = m1830W0(obj, "F0")) == null) ? m1830W0(obj, "I0") : objM1830W0 : objM1830W02 : objM1830W03 : objM1830W04;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final Object m1910v(Object obj) {
        if (obj != null) {
            if (m1906r0(obj)) {
                return obj;
            }
            if (!(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !obj.getClass().isPrimitive()) {
                for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.getName().equals("java.lang.Object"); superclass = superclass.getSuperclass()) {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null && m1906r0(obj2)) {
                                return obj2;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final boolean m1911x0() {
        C0014N c0014n = this.f3102A;
        List list = c0014n != null ? c0014n.f134i : null;
        List list2 = C0131s.f426a;
        if (list == null) {
            list = list2;
        }
        if (!list.isEmpty()) {
            return true;
        }
        C0014N c0014n2 = this.f3102A;
        List list3 = c0014n2 != null ? c0014n2.f135j : null;
        if (list3 != null) {
            list2 = list3;
        }
        return !list2.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final Object m1912y(Object obj) {
        Object objM1830W0;
        Object objM1830W02;
        Object objM1830W03;
        Object objM1830W04;
        C0036i c0036i = this.f3147z;
        return (c0036i == null || (objM1830W04 = m1830W0(obj, c0036i.f237e)) == null) ? (!AbstractC1135r.m2500v() || (objM1830W03 = m1830W0(obj, "y0")) == null) ? (AbstractC1135r.m2485g() != EnumC1115A.WX_8_0_72 || (objM1830W02 = m1830W0(obj, "F0")) == null) ? (AbstractC1135r.m2485g() != EnumC1115A.WX_8_0_71 || (objM1830W0 = m1830W0(obj, "E0")) == null) ? m1830W0(obj, "H0") : objM1830W0 : objM1830W02 : objM1830W03 : objM1830W04;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public final boolean m1913y0(Object obj, Set set) {
        String strM1824O;
        if (m1869G0(obj)) {
            String strM1826R = m1826R(obj);
            Object obj2 = null;
            if (strM1826R != null) {
                String strM527y0 = AbstractC0299i.m527y0(strM1826R, "-");
                if (!AbstractC0307q.m534d0(strM527y0)) {
                    obj2 = strM527y0;
                }
            }
            if (obj2 != null && set.contains(obj2)) {
                return true;
            }
            String strM1881Q = m1881Q(obj);
            if (strM1881Q != null && !AbstractC0307q.m534d0(strM1881Q) && set.contains(strM1881Q)) {
                return true;
            }
        }
        return m1853o0(obj) && (strM1824O = m1824O(obj)) != null && !AbstractC0307q.m534d0(strM1824O) && set.contains(strM1824O);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final boolean m1914z0(View view) {
        WeakReference weakReference = this.f3123b;
        ListView listView = weakReference != null ? (ListView) weakReference.get() : null;
        WeakReference weakReference2 = this.f3124c;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        View view3 = view;
        while (true) {
            if (view3 != null) {
                if (view3 == listView || view3 == view2) {
                    break;
                }
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            } else {
                if (System.currentTimeMillis() <= this.f3104C) {
                    return false;
                }
                Context context = view.getContext();
                while (context != null) {
                    if (context.getClass().getName().equals("com.tencent.mm.ui.LauncherUI")) {
                        return true;
                    }
                    ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                    context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                }
            }
        }
        return false;
    }
}
