package p086r0;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p055lu.wxmask.MainHook;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p001A0.AbstractC0039l;
import p001A0.C0013M;
import p001A0.C0014N;
import p001A0.C0015O;
import p001A0.C0016P;
import p001A0.C0026a;
import p001A0.C0035h;
import p001A0.C0037j;
import p001A0.C0048u;
import p001A0.C0052y;
import p001A0.RunnableC0045r;
import p003B0.AbstractC0056b;
import p004C.C0060d;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0102b;
import p009E0.C0103c;
import p009E0.C0104d;
import p009E0.C0106f;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0129q;
import p011F0.C0122j;
import p011F0.C0131s;
import p011F0.C0133u;
import p021K0.C0169h;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p027N0.C0227k;
import p027N0.C0228l;
import p034R0.C0243b;
import p038T0.AbstractC0284i;
import p038T0.C0280e;
import p038T0.C0281f;
import p038T0.C0287l;
import p038T0.InterfaceC0278c;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p059d0.InterfaceC0518c;
import p062e0.InterfaceC0551a;
import p069i.C0716t;
import p070i0.AbstractC0731a;
import p077m0.C0768f;
import p081o0.C0781b;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.C1142y;
import p102z0.C1143z;

/* JADX INFO: renamed from: r0.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0842H0 implements InterfaceC0551a {

    /* JADX INFO: renamed from: g0 */
    public static final List f2813g0 = AbstractC0120h.m252Z(new C0954x0[]{new C0954x0("fj5.r", "o95.t4", "g"), new C0954x0("gg5.r", "u65.t4", "g"), new C0954x0("wh5.r", "h85.t4", "g"), new C0954x0("rl5.r", "db5.t4", "g")});

    /* JADX INFO: renamed from: h0 */
    public static final String[] f2814h0 = {"fj5.r", "gg5.r", "wh5.r", "rl5.r"};

    /* JADX INFO: renamed from: i0 */
    public static final String[] f2815i0 = {"fj5.r", "gg5.i", "gg5.r", "wh5.i", "wh5.r", "rl5.r"};

    /* JADX INFO: renamed from: j0 */
    public static final String[] f2816j0 = {"fj5.q", "gg5.q", "wh5.q", "rl5.q"};

    /* JADX INFO: renamed from: k0 */
    public static final String[] f2817k0 = {"f270207o", "h", "i", "m", "n", "o"};

    /* JADX INFO: renamed from: l0 */
    public static final String[] f2818l0 = {"f270201f", "f", "g"};

    /* JADX INFO: renamed from: m0 */
    public static final String[] f2819m0 = {"f270218z", "z", "f270204i"};

    /* JADX INFO: renamed from: n0 */
    public static final String[] f2820n0 = {"f362612d", "f245584d", "d"};

    /* JADX INFO: renamed from: o0 */
    public static final C0106f f2821o0 = new C0106f(new C0863P(12));

    /* JADX INFO: renamed from: p0 */
    public static final Set f2822p0 = AbstractC0120h.m263k0(new String[]{"insert", "insertOrThrow", "insertWithOnConflict", "update", "updateWithOnConflict", "replace", "replaceOrThrow"});

    /* JADX INFO: renamed from: q0 */
    public static final String[] f2823q0 = {"unReadCount", "field_unReadCount", "newUnReadCount", "field_newUnReadCount", "unReadMuteCount", "field_unReadMuteCount", "UnReadInvite", "field_UnReadInvite"};

    /* JADX INFO: renamed from: A */
    public volatile long f2824A;

    /* JADX INFO: renamed from: C */
    public volatile String f2826C;

    /* JADX INFO: renamed from: D */
    public volatile long f2827D;

    /* JADX INFO: renamed from: E */
    public volatile int f2828E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f2829F;

    /* JADX INFO: renamed from: P */
    public volatile String f2839P;

    /* JADX INFO: renamed from: Q */
    public volatile String f2840Q;

    /* JADX INFO: renamed from: R */
    public volatile long f2841R;

    /* JADX INFO: renamed from: S */
    public volatile boolean f2842S;

    /* JADX INFO: renamed from: T */
    public WeakReference f2843T;

    /* JADX INFO: renamed from: U */
    public WeakReference f2844U;

    /* JADX INFO: renamed from: W */
    public volatile C0037j f2846W;

    /* JADX INFO: renamed from: X */
    public volatile C0014N f2847X;

    /* JADX INFO: renamed from: Y */
    public volatile String f2848Y;

    /* JADX INFO: renamed from: Z */
    public volatile long f2849Z;

    /* JADX INFO: renamed from: a */
    public WeakReference f2850a;

    /* JADX INFO: renamed from: a0 */
    public volatile WeakReference f2851a0;

    /* JADX INFO: renamed from: b */
    public WeakReference f2852b;

    /* JADX INFO: renamed from: b0 */
    public volatile WeakReference f2853b0;

    /* JADX INFO: renamed from: c */
    public WeakReference f2854c;

    /* JADX INFO: renamed from: c0 */
    public volatile String f2855c0;

    /* JADX INFO: renamed from: d */
    public WeakReference f2856d;

    /* JADX INFO: renamed from: e */
    public WeakReference f2858e;

    /* JADX INFO: renamed from: e0 */
    public final ThreadLocal f2859e0;

    /* JADX INFO: renamed from: f */
    public WeakReference f2860f;

    /* JADX INFO: renamed from: f0 */
    public final String f2861f0;

    /* JADX INFO: renamed from: g */
    public WeakReference f2862g;

    /* JADX INFO: renamed from: h */
    public WeakReference f2863h;

    /* JADX INFO: renamed from: i */
    public WeakReference f2864i;

    /* JADX INFO: renamed from: j */
    public WeakReference f2865j;

    /* JADX INFO: renamed from: k */
    public Method f2866k;

    /* JADX INFO: renamed from: m */
    public int f2868m;

    /* JADX INFO: renamed from: n */
    public String f2869n;

    /* JADX INFO: renamed from: o */
    public String f2870o;

    /* JADX INFO: renamed from: p */
    public long f2871p;

    /* JADX INFO: renamed from: q */
    public long f2872q;

    /* JADX INFO: renamed from: r */
    public boolean f2873r;

    /* JADX INFO: renamed from: s */
    public long f2874s;

    /* JADX INFO: renamed from: t */
    public String f2875t;

    /* JADX INFO: renamed from: u */
    public boolean f2876u;

    /* JADX INFO: renamed from: v */
    public WeakReference f2877v;

    /* JADX INFO: renamed from: w */
    public String f2878w;

    /* JADX INFO: renamed from: x */
    public long f2879x;

    /* JADX INFO: renamed from: y */
    public volatile Object f2880y;

    /* JADX INFO: renamed from: z */
    public volatile String f2881z;

    /* JADX INFO: renamed from: l */
    public final ArrayList f2867l = new ArrayList();

    /* JADX INFO: renamed from: B */
    public final LinkedHashSet f2825B = new LinkedHashSet();

    /* JADX INFO: renamed from: G */
    public final HashMap f2830G = new HashMap();

    /* JADX INFO: renamed from: H */
    public final WeakHashMap f2831H = new WeakHashMap();

    /* JADX INFO: renamed from: I */
    public final WeakHashMap f2832I = new WeakHashMap();

    /* JADX INFO: renamed from: J */
    public final Set f2833J = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: K */
    public final Set f2834K = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: L */
    public final WeakHashMap f2835L = new WeakHashMap();

    /* JADX INFO: renamed from: M */
    public final WeakHashMap f2836M = new WeakHashMap();

    /* JADX INFO: renamed from: N */
    public final WeakHashMap f2837N = new WeakHashMap();

    /* JADX INFO: renamed from: O */
    public final C0716t f2838O = new C0716t(new C0915k0(this, 6), new C0915k0(this, 7), new C0915k0(this, 1), new C0915k0(this, 2), new C0915k0(this, 0));

    /* JADX INFO: renamed from: V */
    public final ArrayList f2845V = new ArrayList();

    /* JADX INFO: renamed from: d0 */
    public volatile Object f2857d0 = C0133u.f428a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0842H0() {
        new WeakHashMap();
        new WeakHashMap();
        new ThreadLocal();
        this.f2859e0 = new ThreadLocal();
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        int i3 = AbstractC1135r.f3833e;
        this.f2861f0 = i3 == 2140 ? "aCW" : (2140 > i3 || i3 >= 2481) ? (i3 == 2589 || i3 == 2600 || i3 == 2720 || i3 == 2800) ? "l" : i3 == 2701 ? "n" : "m" : "k";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static TextView m1576A(View view) {
        if (view != null) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (m1587G0(string)) {
                    return textView;
                }
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    TextView textViewM1576A = m1576A(viewGroup.getChildAt(i2));
                    if (textViewM1576A != null) {
                        return textViewM1576A;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static boolean m1577A0(Object obj) {
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
    /* JADX INFO: renamed from: B */
    public static String m1578B(View view, String str) {
        CharSequence text;
        if (view.getVisibility() == 0) {
            String[] strArr = {"kbq", "kpm", "kpn", "o4k"};
            ArrayList arrayList = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList.add(Integer.valueOf(AbstractC0056b.m103a(strArr[i2])));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).intValue() > 0) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.contains(Integer.valueOf(view.getId()))) {
                String string = (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null) ? null : text.toString();
                String string2 = string != null ? AbstractC0299i.m507C0(string).toString() : null;
                if (m1602P0(string2, str)) {
                    return string2;
                }
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    AbstractC0223g.m417d(childAt, "getChildAt(...)");
                    String strM1578B = m1578B(childAt, str);
                    if (strM1578B != null) {
                        return strM1578B;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static boolean m1579B0(Object obj) {
        if (obj == null) {
            return false;
        }
        String name = obj.getClass().getName();
        return name.equals("qa5.g") || name.equals("fc5.g") || name.equals("nd5.g");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static String m1580C(View view, String str) {
        CharSequence text;
        if (view.getVisibility() == 0) {
            String string = (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null) ? null : text.toString();
            String string2 = string != null ? AbstractC0299i.m507C0(string).toString() : null;
            if (m1602P0(string2, str)) {
                return string2;
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    AbstractC0223g.m417d(childAt, "getChildAt(...)");
                    String strM1580C = m1580C(childAt, str);
                    if (strM1580C != null) {
                        return strM1580C;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static boolean m1581C0(Object obj) {
        return m1577A0(obj) || m1579B0(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static Class m1582D(Context context, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ClassLoader classLoader = context.getClassLoader();
            AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
            AbstractC0223g.m418e(str, "clazz");
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
            if (clsMo1021l != null) {
                return clsMo1021l;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static boolean m1583D0(Class cls) {
        while (cls != null) {
            String name = cls.getName();
            if (AbstractC0307q.m538h0(name, false, "com.tencent.mm.ui.conversation") || name.equals("com.tencent.mm.ui.k3") || name.equals("com.tencent.mm.ui.i3") || name.equals("kc5.v0") || name.equals("va5.v0") || name.equals("sd5.x0") || name.equals("yf5.w0")) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D1 */
    public static Object m1584D1(Object obj) {
        if (!(obj instanceof HeaderViewListAdapter)) {
            return obj;
        }
        ListAdapter wrappedAdapter = ((HeaderViewListAdapter) obj).getWrappedAdapter();
        return wrappedAdapter == null ? (ListAdapter) obj : wrappedAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T0.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static C0821A0 m1585F(Object obj, int i2, Set set) {
        Object c0104d;
        Object c0104d2;
        if (obj != null && set.add(obj)) {
            if (AbstractC0231o.m426b(obj) && m1594L0((List) obj)) {
                return new C0821A0(obj, AbstractC0231o.m425a(obj));
            }
            if (i2 < 3) {
                String name = obj.getClass().getName();
                if (!(obj instanceof View) && !(obj instanceof Context) && !(obj instanceof Class) && !AbstractC0307q.m538h0(name, false, "java.") && !AbstractC0307q.m538h0(name, false, "android.") && (AbstractC0307q.m538h0(name, false, "com.tencent.mm") || AbstractC0307q.m538h0(name, false, "z15.") || AbstractC0307q.m538h0(name, false, "f45.") || AbstractC0307q.m538h0(name, false, "o75.") || (obj instanceof ListAdapter))) {
                    ArrayList arrayListM1642n = m1642n(obj.getClass());
                    ArrayList<Field> arrayList = new ArrayList();
                    for (Object obj2 : arrayListM1642n) {
                        if (!Modifier.isStatic(((Field) obj2).getModifiers())) {
                            arrayList.add(obj2);
                        }
                    }
                    for (Field field : arrayList) {
                        try {
                            field.setAccessible(true);
                            c0104d2 = field.get(obj);
                        } catch (Throwable th) {
                            c0104d2 = new C0104d(th);
                        }
                        if (c0104d2 instanceof C0104d) {
                            c0104d2 = null;
                        }
                        if (c0104d2 != null) {
                            if (AbstractC0231o.m426b(c0104d2) && m1594L0((List) c0104d2)) {
                                return new C0821A0(obj, AbstractC0231o.m425a(c0104d2));
                            }
                            C0821A0 c0821a0M1585F = m1585F(c0104d2, i2 + 1, set);
                            if (c0821a0M1585F != null) {
                                return c0821a0M1585F;
                            }
                        }
                    }
                    if (i2 <= 1) {
                        Method[] methods = obj.getClass().getMethods();
                        AbstractC0223g.m417d(methods, "getMethods(...)");
                        C0281f c0281f = new C0281f(AbstractC0120h.m253a0(methods), true, new C0863P(14));
                        for (Method method : c0281f instanceof InterfaceC0278c ? ((InterfaceC0278c) c0281f).mo494a() : new C0287l(c0281f)) {
                            try {
                                method.setAccessible(true);
                                c0104d = method.invoke(obj, null);
                            } catch (Throwable th2) {
                                c0104d = new C0104d(th2);
                            }
                            if (c0104d instanceof C0104d) {
                                c0104d = null;
                            }
                            if (c0104d != null && c0104d != obj && !(c0104d instanceof View) && !(c0104d instanceof Context) && !(c0104d instanceof Class)) {
                                if (AbstractC0231o.m426b(c0104d) && m1594L0((List) c0104d)) {
                                    return new C0821A0(obj, AbstractC0231o.m425a(c0104d));
                                }
                                C0821A0 c0821a0M1585F2 = m1585F(c0104d, i2 + 1, set);
                                if (c0821a0M1585F2 != null) {
                                    return c0821a0M1585F2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static boolean m1586F0(MenuItem menuItem) {
        if (menuItem.getItemId() == 1835102465) {
            return true;
        }
        CharSequence title = menuItem.getTitle();
        String string = title != null ? title.toString() : null;
        if (string == null) {
            string = "";
        }
        return m1587G0(string) || AbstractC0299i.m511i0(string, "隐藏名单", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static boolean m1587G0(String str) {
        boolean z2 = AbstractC1126i.f3786a;
        return str.equals(C1124g.m2436l()) || str.equals("加入名单");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static boolean m1588H0(String str) {
        String string = AbstractC0299i.m507C0(str).toString();
        if (AbstractC0120h.m254b0(new String[]{"刚刚", "昨天", "前天", "今天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日", "星期天", "周一", "周二", "周三", "周四", "周五", "周六", "周日", "周天"}, string)) {
            return true;
        }
        Pattern patternCompile = Pattern.compile("^(昨天|前天|今天)?\\s*(凌晨|早上|上午|中午|下午|晚上)?\\s*\\d{1,2}:\\d{2}$");
        AbstractC0223g.m417d(patternCompile, "compile(...)");
        AbstractC0223g.m418e(string, "input");
        if (patternCompile.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile2 = Pattern.compile("^(星期[一二三四五六日天]|周[一二三四五六日天])\\s*(凌晨|早上|上午|中午|下午|晚上)?\\s*\\d{1,2}:\\d{2}$");
        AbstractC0223g.m417d(patternCompile2, "compile(...)");
        if (patternCompile2.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile3 = Pattern.compile("^\\d{1,2}[:：]\\d{2}$");
        AbstractC0223g.m417d(patternCompile3, "compile(...)");
        if (patternCompile3.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile4 = Pattern.compile("^\\d{1,2}[月/-]\\d{1,2}[日]?$");
        AbstractC0223g.m417d(patternCompile4, "compile(...)");
        if (patternCompile4.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile5 = Pattern.compile("^\\d{4}[年/-]\\d{1,2}[月/-]\\d{1,2}[日]?$");
        AbstractC0223g.m417d(patternCompile5, "compile(...)");
        if (patternCompile5.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile6 = Pattern.compile("^[\\d\\s:\\uff1a/\\-.\\u5e74\\u6708\\u65e5\\u65f6\\u5206\\u79d2\\u524d\\u6628\\u4eca\\u5468\\u661f\\u671f\\u4e00\\u4e8c\\u4e09\\u56db\\u4e94\\u516d\\u4e03\\u516b\\u4e5d\\u5341]+$");
        AbstractC0223g.m417d(patternCompile6, "compile(...)");
        return patternCompile6.matcher(string).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (p027N0.AbstractC0223g.m414a(r2 != null ? r2.getClass() : null, r5.getClass()) != false) goto L14;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ListView m1589I(View view, Object obj) {
        if (view != null) {
            if (view instanceof ListView) {
                ListView listView = (ListView) view;
                Object objM1584D1 = m1584D1(listView.getAdapter());
                if (objM1584D1 != obj) {
                }
                return listView;
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ListView listViewM1589I = m1589I(viewGroup.getChildAt(i2), obj);
                    if (listViewM1589I != null) {
                        return listViewM1589I;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static boolean m1590I0(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
        return AbstractC0299i.m511i0(lowerCase, "banner", false) || AbstractC0299i.m511i0(lowerCase, "appbrand", false) || AbstractC0299i.m511i0(lowerCase, "finder", false) || AbstractC0299i.m511i0(lowerCase, "scanner", false) || AbstractC0299i.m511i0(lowerCase, "game", false) || AbstractC0299i.m511i0(lowerCase, "preference", false) || lowerCase.endsWith("activity") || lowerCase.endsWith("fragment") || AbstractC0299i.m511i0(lowerCase, "$", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static Object m1591J(Object obj, int i2, Set set) {
        Object c0104d;
        Object objM1591J;
        Object c0104d2;
        Object objM1591J2;
        if (obj != null && i2 <= 2 && set.add(obj)) {
            Class<?> cls = obj.getClass();
            if (i2 > 0 && m1625c1(cls)) {
                return obj;
            }
            if (m1615X0(cls.getName())) {
                for (Field field : m1642n(cls)) {
                    try {
                        field.setAccessible(true);
                        c0104d2 = field.get(obj);
                    } catch (Throwable th) {
                        c0104d2 = new C0104d(th);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = null;
                    }
                    if (c0104d2 != null && (objM1591J2 = m1591J(c0104d2, i2 + 1, set)) != null) {
                        return objM1591J2;
                    }
                }
                if (i2 == 0) {
                    Method[] methods = cls.getMethods();
                    AbstractC0223g.m417d(methods, "getMethods(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Method method : methods) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && !method.getReturnType().isPrimitive() && !AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && !method.getReturnType().getName().equals("java.lang.String")) {
                            arrayList.add(method);
                        }
                    }
                    for (Method method2 : AbstractC0123k.m277s0(arrayList, 24)) {
                        try {
                            method2.setAccessible(true);
                            c0104d = method2.invoke(obj, null);
                        } catch (Throwable th2) {
                            c0104d = new C0104d(th2);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        if (c0104d != null && (objM1591J = m1591J(c0104d, i2 + 1, set)) != null) {
                            return objM1591J;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static ViewGroup m1592K(View view) {
        if (view != null) {
            if ((view instanceof LinearLayout) && m1576A(view) == null) {
                return (ViewGroup) view;
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null && !(viewGroup instanceof AdapterView)) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ViewGroup viewGroupM1592K = m1592K(viewGroup.getChildAt(i2));
                    if (viewGroupM1592K != null) {
                        return viewGroupM1592K;
                    }
                }
                return viewGroup;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static Object m1593L(Object obj, String str) {
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
    /* JADX INFO: renamed from: L0 */
    public static boolean m1594L0(List list) {
        String strM1599O;
        if (!list.isEmpty()) {
            int iMin = Math.min(list.size(), 12);
            int i2 = 0;
            for (int i3 = 0; i3 < iMin; i3++) {
                Object obj = list.get(i3);
                if (obj != null && (strM1599O = m1599O(obj)) != null) {
                    if (AbstractC0307q.m534d0(strM1599O)) {
                        strM1599O = null;
                    }
                    if (strM1599O != null && (m1611V0(null, null, obj) || AbstractC0174d.m360p(obj, "com.tencent.mm.storage.", false))) {
                        i2++;
                        if (i2 >= 2) {
                            return true;
                        }
                        if (iMin <= 3 && !AbstractC0307q.m534d0(strM1599O)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static Object m1595M(Object obj) {
        if (m1581C0(obj)) {
            return obj;
        }
        String[] strArr = {"d", "f344355d"};
        for (int i2 = 0; i2 < 2; i2++) {
            Object objM1622b0 = m1622b0(obj, strArr[i2]);
            if (objM1622b0 != null && m1581C0(objM1622b0)) {
                return objM1622b0;
            }
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            try {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    if (m1581C0(obj2)) {
                        return obj2;
                    }
                    String[] strArr2 = {"d", "f344355d"};
                    for (int i3 = 0; i3 < 2; i3++) {
                        Object objM1622b02 = m1622b0(obj2, strArr2[i3]);
                        if (objM1622b02 != null && m1581C0(objM1622b02)) {
                            return objM1622b02;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static boolean m1596M0() {
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        return AbstractC1135r.f3833e < 3060;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static String m1597N(Object obj, String str) {
        String string;
        String[] strArr = {"field_conRemark", "field_nickname", "conRemark", "nickname"};
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                if (obj != null) {
                    String[] strArr2 = {"getDisplayName", "getNickname", "d0", "c1"};
                    for (int i3 = 0; i3 < 4; i3++) {
                        String strM1647t = m1647t(obj, strArr2[i3]);
                        if (strM1647t != null && (string = AbstractC0299i.m507C0(strM1647t).toString()) != null && m1602P0(string, str)) {
                            return string;
                        }
                    }
                }
                return null;
            }
            String str2 = (String) m1622b0(obj, strArr[i2]);
            String string2 = str2 != null ? AbstractC0299i.m507C0(str2).toString() : null;
            if (m1602P0(string2, str)) {
                return string2;
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public static boolean m1598N0(View view, Object obj) {
        Object c0104d;
        String name = obj.getClass().getName();
        boolean z2 = true;
        if (!AbstractC0299i.m511i0(name, "contact", true) && !AbstractC0299i.m511i0(name, "Address", true) && !AbstractC0307q.m538h0(name, false, "po5.")) {
            Context context = view.getContext();
            String name2 = context != null ? context.getClass().getName() : null;
            if (name2 == null) {
                name2 = "";
            }
            if (!AbstractC0299i.m511i0(name2, "contact", true) && !AbstractC0299i.m511i0(name2, "Address", true)) {
                try {
                    if (m1644p1(view, obj) == null) {
                        z2 = false;
                    }
                    c0104d = Boolean.valueOf(z2);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Object obj2 = Boolean.FALSE;
                if (c0104d instanceof C0104d) {
                    c0104d = obj2;
                }
                return ((Boolean) c0104d).booleanValue();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static String m1599O(Object obj) {
        if (obj == null) {
            return null;
        }
        String strM1630e0 = m1630e0(obj, "field_username");
        if (strM1630e0 != null && !AbstractC0307q.m534d0(strM1630e0)) {
            return strM1630e0;
        }
        Object objM1622b0 = m1622b0(obj, "f434581d");
        if (objM1622b0 == null) {
            objM1622b0 = m1622b0(obj, "d");
        }
        String strM1616Y = m1616Y(objM1622b0);
        if (strM1616Y != null && !AbstractC0307q.m534d0(strM1616Y)) {
            return strM1616Y;
        }
        String strM1630e02 = m1630e0(obj, "f434583f");
        return strM1630e02 == null ? m1630e0(obj, "f") : strM1630e02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public static boolean m1600O0(String str) {
        String string = AbstractC0299i.m507C0(str).toString();
        if (AbstractC0307q.m538h0(string, false, "[") || AbstractC0307q.m538h0(string, false, "??") || AbstractC0299i.m511i0(string, ": [", false) || AbstractC0299i.m511i0(string, ":  [", false)) {
            return true;
        }
        String[] strArr = {"[??]", "[????]", "[???]", "[???]", "[???]", "[?????]", "????????????"};
        for (int i2 = 0; i2 < 7; i2++) {
            String str2 = strArr[i2];
            if (AbstractC0307q.m538h0(string, false, str2) || AbstractC0299i.m511i0(string, ": ".concat(str2), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static String m1601P(Object obj, String str) {
        Object objM1657y;
        Object objM1603Q = m1603Q(obj);
        if (objM1603Q != null) {
            Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
            AbstractC0223g.m417d(setNewSetFromMap, "newSetFromMap(...)");
            objM1657y = m1657y(objM1603Q, str, 0, setNewSetFromMap);
        } else {
            objM1657y = null;
        }
        Set setNewSetFromMap2 = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0223g.m417d(setNewSetFromMap2, "newSetFromMap(...)");
        Object[] objArr = {objM1657y, m1657y(obj, str, 0, setNewSetFromMap2)};
        for (int i2 = 0; i2 < 2; i2++) {
            String strM1597N = m1597N(objArr[i2], str);
            if (strM1597N != null) {
                return strM1597N;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public static boolean m1602P0(String str, String str2) {
        String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
        return (string == null || AbstractC0307q.m534d0(string) || string.equals(str2) || m1604Q0(string) || string.length() > 80 || AbstractC0299i.m512j0(string, '\n') || m1588H0(string) || m1600O0(string)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static Object m1603Q(Object obj) {
        Object objM1622b0;
        Integer numM1618Z;
        Object c0104d;
        String[] strArr = {"f203859d", "f206457d", "f207238d"};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 3) {
                objM1622b0 = null;
                break;
            }
            objM1622b0 = m1622b0(obj, strArr[i3]);
            if (objM1622b0 != null) {
                break;
            }
            i3++;
        }
        if (objM1622b0 == null) {
            return null;
        }
        String[] strArr2 = {"f203865m", "f206463m", "f207244m"};
        while (true) {
            if (i2 < 3) {
                numM1618Z = m1618Z(obj, strArr2[i2]);
                if (numM1618Z != null) {
                    break;
                }
                i2++;
            } else {
                numM1618Z = null;
                break;
            }
        }
        if (numM1618Z == null) {
            return null;
        }
        try {
            c0104d = AbstractC0514f.f1622b.mo1012c(objM1622b0, "getItem", numM1618Z);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public static boolean m1604Q0(String str) {
        return AbstractC0307q.m538h0(str, false, "wxid_") || str.endsWith("@chatroom") || AbstractC0299i.m511i0(str, "@stranger", false) || AbstractC0299i.m511i0(str, "@openim", false) || AbstractC0299i.m511i0(str, "@", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m1605R(Object obj) {
        String strM1616Y;
        String string;
        String string2;
        String string3;
        String[] strArr = {"f203862g", "f206460g", "f207241g"};
        for (int i2 = 0; i2 < 3; i2++) {
            String strM1630e0 = m1630e0(obj, strArr[i2]);
            if (strM1630e0 != null && (string3 = AbstractC0299i.m507C0(strM1630e0).toString()) != null && !AbstractC0307q.m534d0(string3)) {
                return string3;
            }
        }
        String[] strArr2 = {"f203863h", "f206461h", "f207242h"};
        for (int i3 = 0; i3 < 3; i3++) {
            String strM1616Y2 = m1616Y(m1622b0(obj, strArr2[i3]));
            if (strM1616Y2 != null && (string2 = AbstractC0299i.m507C0(strM1616Y2).toString()) != null && !AbstractC0307q.m534d0(string2)) {
                return string2;
            }
        }
        Object objM1603Q = m1603Q(obj);
        if (objM1603Q == null || (strM1616Y = m1616Y(objM1603Q)) == null || (string = AbstractC0299i.m507C0(strM1616Y).toString()) == null || AbstractC0307q.m534d0(string)) {
            return null;
        }
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public static boolean m1606R0(String str) {
        String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
        if (string != null && !AbstractC0307q.m534d0(string)) {
            C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
            boolean z2 = AbstractC1126i.f3786a;
            if (C1124g.m2443s()) {
                if (!AbstractC0307q.m534d0(string)) {
                    return c0808h.f2685b.contains(string);
                }
                AbstractC0731a.m1387d("chatUser is null or blank");
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public static boolean m1607S0() {
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        return AbstractC1135r.f3833e >= 3060;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public static boolean m1608T0() {
        return AbstractC0307q.m538h0(AbstractC1135r.m2495q(), false, "8.0.72") && (AbstractC1135r.m2494p() == 3083 || AbstractC1135r.m2498t());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public static boolean m1609U0(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView") || superclass.getName().equals("android.support.v7.widget.RecyclerView") || superclass.getName().endsWith(".RecyclerView") || superclass.getName().endsWith(".WxRecyclerView")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0072 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F0.s, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: V */
    public static List m1610V(Object obj) {
        Object obj2;
        List list;
        Object c0104d;
        ?? arrayList = C0131s.f426a;
        if (obj == null) {
            return arrayList;
        }
        String[] strArr = f2820n0;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            obj2 = null;
            if (i2 >= length) {
                list = null;
                break;
            }
            list = (List) m1622b0(obj, strArr[i2]);
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
                    obj2 = c0104d;
                    break loop1;
                }
            }
            superclass = superclass.getSuperclass();
        }
        List list2 = (List) obj2;
        if (list2 != null) {
            arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX INFO: renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1611V0(Class cls, String str, Object obj) {
        String name = obj.getClass().getName();
        if ((str != null && m1590I0(str)) || m1590I0(name)) {
            return false;
        }
        int iM1654w1 = m1654w1(str);
        int iM1654w12 = m1654w1(name);
        String str2 = (String) m1622b0(obj, "field_username");
        int i2 = (str2 == null || !(AbstractC0307q.m534d0(str2) ^ true)) ? 0 : 4;
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                if (AbstractC0299i.m511i0(field.getType().getName(), "com.tencent.mm.storage", false)) {
                    i2 += 3;
                }
                if (!AbstractC0223g.m414a(field.getName(), "field_username")) {
                    String name2 = field.getName();
                    AbstractC0223g.m417d(name2, "getName(...)");
                    if (AbstractC0299i.m511i0(name2, "username", true)) {
                        i2 += 2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return (str == null || iM1654w1 >= 2 || m1641l(cls)) && iM1654w12 + i2 >= 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static View m1612W(Object obj) {
        Object obj2;
        View view;
        Object c0104d;
        String[] strArr = f2818l0;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            obj2 = null;
            if (i2 >= length) {
                view = null;
                break;
            }
            view = (View) m1622b0(obj, strArr[i2]);
            if (view != null) {
                break;
            }
            i2++;
        }
        if (view != null) {
            return view;
        }
        if (obj != null) {
            Class<?> superclass = obj.getClass();
            loop1: while (true) {
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
                    if (c0104d instanceof View) {
                        obj2 = c0104d;
                        break loop1;
                    }
                }
                superclass = superclass.getSuperclass();
            }
        }
        return (View) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static boolean m1613W0(ListView listView, Object obj) {
        Object c0104d;
        Object c0104d2;
        String strM1599O;
        if (!m1590I0(listView.getClass().getName()) && !m1590I0(obj.getClass().getName())) {
            ListAdapter listAdapter = obj instanceof ListAdapter ? (ListAdapter) obj : null;
            if (listAdapter != null) {
                try {
                    c0104d = Integer.valueOf(listAdapter.getCount());
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = 0;
                }
                int iIntValue = ((Number) c0104d).intValue();
                if (iIntValue > 0) {
                    int iMin = Math.min(iIntValue, 8);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        try {
                            c0104d2 = listAdapter.getItem(i2);
                        } catch (Throwable th2) {
                            c0104d2 = new C0104d(th2);
                        }
                        if (c0104d2 instanceof C0104d) {
                            c0104d2 = null;
                        }
                        if (c0104d2 != null && (strM1599O = m1599O(c0104d2)) != null) {
                            if (AbstractC0307q.m534d0(strM1599O)) {
                                strM1599O = null;
                            }
                            if (strM1599O != null && m1611V0(obj.getClass(), obj.getClass().getName(), c0104d2)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static String m1614X(View view) {
        String string;
        while (view != null) {
            Object tag = view.getTag();
            String[] strArr = {"f403836n", "f303111n", "f434510n", "m", "n"};
            for (int i2 = 0; i2 < 5; i2++) {
                String strM1630e0 = m1630e0(tag, strArr[i2]);
                if (strM1630e0 != null && (string = AbstractC0299i.m507C0(strM1630e0).toString()) != null && !AbstractC0307q.m534d0(string)) {
                    return string;
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public static boolean m1615X0(String str) {
        return AbstractC0307q.m538h0(str, false, "com.tencent.mm") || AbstractC0307q.m538h0(str, false, "fh5.") || AbstractC0307q.m538h0(str, false, "f45.") || AbstractC0307q.m538h0(str, false, "z15.") || AbstractC0307q.m538h0(str, false, "kc5.") || AbstractC0307q.m538h0(str, false, "va5.") || AbstractC0307q.m538h0(str, false, "sd5.") || AbstractC0307q.m538h0(str, false, "hf5.") || AbstractC0307q.m538h0(str, false, "yf5.") || AbstractC0307q.m538h0(str, false, "o75.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static String m1616Y(Object obj) {
        if (obj == null) {
            return null;
        }
        String strM1630e0 = m1630e0(obj, "field_username");
        if (strM1630e0 != null && !AbstractC0307q.m534d0(strM1630e0)) {
            return strM1630e0;
        }
        String strM1647t = m1647t(obj, "f1");
        return strM1647t == null ? m1647t(obj, "h1") : strM1647t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[RETURN] */
    /* JADX INFO: renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1617Y0() {
        String string = AbstractC0299i.m507C0(AbstractC1135r.m2495q()).toString();
        if (string == null) {
            string = "";
        }
        if (AbstractC0307q.m534d0(string)) {
            return AbstractC1135r.m2494p() > 3120;
        }
        List listM523u0 = AbstractC0299i.m523u0(AbstractC0299i.m507C0(AbstractC0299i.m526x0(AbstractC0299i.m526x0(string, '-'), '(')).toString(), new char[]{'.'});
        ArrayList arrayList = new ArrayList();
        Iterator it = listM523u0.iterator();
        while (it.hasNext()) {
            Integer numM530Z = AbstractC0306p.m530Z((String) it.next());
            if (numM530Z != null) {
                arrayList.add(numM530Z);
            }
        }
        if (arrayList.size() < 3 || ((Number) arrayList.get(0)).intValue() != 8 || ((Number) arrayList.get(1)).intValue() != 0) {
            int i2 = -1;
            if (AbstractC1135r.f3833e == -1) {
                try {
                    i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                } catch (Exception e2) {
                    AbstractC0731a.m1385b(e2);
                }
                AbstractC1135r.f3833e = i2;
            }
            if (AbstractC1135r.f3833e > 3120) {
            }
        } else if (((Number) arrayList.get(2)).intValue() >= 76) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static Integer m1618Z(Object obj, String str) {
        Object objM1622b0 = m1622b0(obj, str);
        if (objM1622b0 == null) {
            return null;
        }
        if (objM1622b0 instanceof Integer) {
            return (Integer) objM1622b0;
        }
        if (objM1622b0 instanceof Number) {
            return Integer.valueOf(((Number) objM1622b0).intValue());
        }
        if (objM1622b0 instanceof String) {
            return AbstractC0306p.m530Z((String) objM1622b0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m1619a(C0842H0 c0842h0, View view, String str, Object obj) {
        c0842h0.getClass();
        if (AbstractC1135r.m2485g() == null && AbstractC1135r.m2496r(3060)) {
            boolean z2 = AbstractC1126i.f3786a;
            if (C1124g.m2448x() && m1606R0(str) && !C1124g.m2429e(str)) {
                if (m1648u() == EnumC0960z0.f3452d) {
                    m1646s1(view);
                    return false;
                }
                if (m1648u() == EnumC0960z0.f3451c) {
                    m1646s1(view);
                    return false;
                }
                if (!AbstractC0223g.m414a(obj.getClass().getName(), "com.tencent.mm.storage.k3")) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    view.setVisibility(8);
                    if (layoutParams == null || layoutParams.height == 0) {
                        return true;
                    }
                    layoutParams.height = 0;
                    view.setLayoutParams(layoutParams);
                    return true;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    if (view.getTag(1594494977) == null) {
                        view.setTag(1594494977, Integer.valueOf(layoutParams2.height));
                    }
                    if (layoutParams2.height != 0) {
                        layoutParams2.height = 0;
                        view.setLayoutParams(layoutParams2);
                    }
                }
                if (view.getTag(1594494978) == null) {
                    view.setTag(1594494978, Integer.valueOf(view.getMinimumHeight()));
                }
                if (view.getTag(1594494979) == null) {
                    view.setTag(1594494979, new int[]{view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()});
                }
                if (view.getTag(1594494980) == null) {
                    view.setTag(1594494980, Float.valueOf(view.getAlpha()));
                }
                view.setMinimumHeight(0);
                view.setPadding(0, 0, 0, 0);
                view.setAlpha(0.0f);
                view.setVisibility(8);
                view.requestLayout();
                return true;
            }
            m1646s1(view);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static Long m1620a0(Object obj, String str) {
        Object objM1622b0 = m1622b0(obj, str);
        if (objM1622b0 == null) {
            return null;
        }
        if (objM1622b0 instanceof Long) {
            return (Long) objM1622b0;
        }
        if (objM1622b0 instanceof Number) {
            return Long.valueOf(((Number) objM1622b0).longValue());
        }
        if (objM1622b0 instanceof String) {
            return AbstractC0306p.m531a0((String) objM1622b0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1621b(C0842H0 c0842h0, Object obj, String str) {
        MenuItem menuItemM1710z;
        String strM1614X;
        String strM1699q1;
        TextView textViewM1576A;
        String str2;
        c0842h0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2415F() || obj == null || (menuItemM1710z = c0842h0.m1710z(obj)) == null) {
            return;
        }
        C0103c c0103c = (C0103c) c0842h0.f2832I.get(menuItemM1710z);
        View viewM1612W = m1612W(obj);
        if (c0103c == null || (strM1614X = (String) c0103c.f394a) == null) {
            strM1614X = viewM1612W != null ? m1614X(viewM1612W) : null;
            if (strM1614X == null) {
                return;
            }
        }
        String str3 = strM1614X;
        Set set = c0842h0.f2833J;
        boolean zContains = set.contains(obj);
        WeakHashMap weakHashMap = c0842h0.f2837N;
        if (zContains && AbstractC0223g.m414a(weakHashMap.get(obj), str3)) {
            return;
        }
        if (c0103c == null || (str2 = (String) c0103c.f395b) == null || (strM1699q1 = AbstractC0299i.m507C0(str2).toString()) == null) {
            strM1699q1 = c0842h0.m1699q1(viewM1612W, null, str3);
        } else {
            if (!m1602P0(strM1699q1, str3)) {
                strM1699q1 = null;
            }
            if (strM1699q1 == null) {
            }
        }
        String str4 = strM1699q1;
        c0842h0.m1687l1(str3, str4, obj);
        View viewM1672T = c0842h0.m1672T(obj);
        if (viewM1672T == null || (textViewM1576A = m1576A(viewM1672T)) == null) {
            return;
        }
        textViewM1576A.setOnClickListener(new ViewOnClickListenerC0939s0(c0842h0, str3, str4, obj, 0));
        set.add(obj);
        weakHashMap.put(obj, str3);
        m1623b1("conversation bind popup", jCurrentTimeMillis, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static Object m1622b0(Object obj, String str) {
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 == null) {
                        return null;
                    }
                    return obj2;
                } catch (NoSuchFieldException unused) {
                } catch (Throwable th) {
                    AbstractC0731a.m1387d("get conversation field fail", str, th);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b1 */
    public static void m1623b1(String str, long j2, String str2) {
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
    /* JADX INFO: renamed from: c */
    public static final void m1624c(C0842H0 c0842h0, Object obj, String str) {
        if (obj == null) {
            c0842h0.getClass();
            return;
        }
        c0842h0.m1705t1(obj, str);
        m1659z1(obj, "", "f434585h");
        m1659z1(obj, -1, "f434586i");
        m1659z1(obj, "", "f434599y");
        m1659z1(obj, -1, "f434600z");
        m1659z1(obj, "", "h");
        m1659z1(obj, -1, "i");
        m1659z1(obj, "", "y");
        m1659z1(obj, -1, "z");
        Object objM1622b0 = m1622b0(obj, "f434581d");
        if (objM1622b0 == null) {
            objM1622b0 = m1622b0(obj, "d");
        }
        if (objM1622b0 != null) {
            c0842h0.m1705t1(objM1622b0, str);
            m1656x1(objM1622b0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c1 */
    public static boolean m1625c1(Class cls) {
        Object c0104d;
        Object c0104d2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (cls == null) {
            return false;
        }
        String name = cls.getName();
        if (!m1615X0(name) || AbstractC0307q.m538h0(name, false, "com.tencent.mm.storage.") || m1590I0(name)) {
            return false;
        }
        try {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            c0104d = AbstractC0120h.m262j0(methods);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj = C0131s.f426a;
        if (c0104d instanceof C0104d) {
            c0104d = obj;
        }
        List<Method> list = (List) c0104d;
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            c0104d2 = AbstractC0120h.m262j0(declaredFields);
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        if (!(c0104d2 instanceof C0104d)) {
            obj = c0104d2;
        }
        List list2 = (List) obj;
        if (list.isEmpty()) {
            z2 = false;
        } else {
            for (Method method : list) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && List.class.isAssignableFrom(method.getReturnType())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (list2.isEmpty()) {
            z3 = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (Map.class.isAssignableFrom(((Field) it.next()).getType())) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        if (list2.isEmpty()) {
            z4 = false;
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (AbstractC0307q.m538h0(((Field) it2.next()).getType().getName(), false, "com.tencent.mm.storage.")) {
                    z4 = true;
                    break;
                }
            }
            z4 = false;
        }
        if (list.isEmpty()) {
            z5 = false;
        } else {
            for (Method method2 : list) {
                if (method2.getParameterTypes().length == 2 && AbstractC0223g.m414a(method2.getParameterTypes()[0], Integer.TYPE) && AbstractC0223g.m414a(method2.getParameterTypes()[1], String.class)) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
        }
        if (z2 || z3 || z5) {
            return z4 || z3;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m1626d(C0842H0 c0842h0, Object obj) {
        if (obj == null) {
            c0842h0.getClass();
            return;
        }
        c0842h0.getClass();
        m1659z1(obj, 0, "f434587m");
        m1659z1(obj, 0, "f434588n");
        m1659z1(obj, 0, "f434589o");
        Boolean bool = Boolean.FALSE;
        m1659z1(obj, bool, "f434590p");
        m1659z1(obj, bool, "f434591q");
        m1659z1(obj, bool, "f434592r");
        m1659z1(obj, bool, "f434593s");
        m1659z1(obj, 0, "m");
        m1659z1(obj, 0, "n");
        m1659z1(obj, 0, "o");
        m1659z1(obj, bool, "p");
        m1659z1(obj, bool, "q");
        m1659z1(obj, bool, "r");
        m1659z1(obj, bool, "s");
        Object objM1622b0 = m1622b0(obj, "f434581d");
        if (objM1622b0 == null) {
            objM1622b0 = m1622b0(obj, "d");
        }
        if (objM1622b0 != null) {
            m1658y1(objM1622b0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static Object m1627d0(View view) {
        Object c0104d;
        try {
            c0104d = AbstractC0514f.f1622b.mo1012c(view, "getAdapter", new Object[0]);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        if (c0104d == null) {
            return null;
        }
        return m1584D1(c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d1 */
    public static List m1628d1(String str, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list == null) {
            list = C0131s.f426a;
        }
        for (Object obj : list) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        if (str != null && !AbstractC0307q.m534d0(str)) {
            linkedHashSet.add(str);
        }
        return AbstractC0123k.m281w0(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final MenuItem m1629e(C0842H0 c0842h0, Object obj, int i2) {
        MenuItem menuItemM1676c0;
        if (i2 < 0) {
            c0842h0.getClass();
            return null;
        }
        MenuItem menuItemM1676c02 = c0842h0.m1676c0(i2, obj);
        return (menuItemM1676c02 == null || !m1586F0(menuItemM1676c02)) ? (i2 <= 0 || (menuItemM1676c0 = c0842h0.m1676c0(i2 + (-1), obj)) == null || !m1586F0(menuItemM1676c0)) ? c0842h0.m1676c0(i2, obj) : menuItemM1676c0 : menuItemM1676c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static String m1630e0(Object obj, String str) {
        Object objM1622b0 = m1622b0(obj, str);
        if (objM1622b0 instanceof String) {
            return (String) objM1622b0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public static String[] m1631e1(List list, String[] strArr) {
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
    /* JADX INFO: renamed from: f */
    public static final boolean m1632f(C0842H0 c0842h0, View view) {
        String str;
        TextView textViewM1576A;
        String string;
        Object obj;
        View viewM1672T;
        c0842h0.getClass();
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2415F() || System.currentTimeMillis() - c0842h0.f2841R > 15000 || (str = c0842h0.f2839P) == null || AbstractC0307q.m534d0(str)) {
            return false;
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String string2 = text != null ? text.toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            textViewM1576A = (TextView) (m1587G0(string2) ? view : null);
        } else {
            textViewM1576A = view instanceof AdapterView ? null : m1576A(view);
        }
        if (textViewM1576A == null) {
            return false;
        }
        WeakReference weakReference = c0842h0.f2843T;
        Object obj2 = weakReference != null ? weakReference.get() : null;
        if (obj2 != null) {
            WeakReference weakReference2 = c0842h0.f2843T;
            if (weakReference2 == null || (obj = weakReference2.get()) == null || (viewM1672T = c0842h0.m1672T(obj)) == null) {
                return false;
            }
            while (view != null) {
                if (view != viewM1672T) {
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
            }
            return false;
        }
        String str2 = c0842h0.f2839P;
        String string3 = str2 != null ? AbstractC0299i.m507C0(str2).toString() : null;
        if (string3 == null || AbstractC0307q.m534d0(string3)) {
            return false;
        }
        String str3 = c0842h0.f2840Q;
        if (str3 == null || (string = AbstractC0299i.m507C0(str3).toString()) == null || m1602P0(string, string3)) {
        }
        c0842h0.f2842S = true;
        c0842h0.m1688m(string3);
        if (obj2 != null) {
            c0842h0.m1706v(obj2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static Object m1633f0(View view) {
        String name = view.getClass().getName();
        if (m1609U0(view) || AbstractC0299i.m511i0(name, "ConversationListView", true)) {
            return m1627d0(view);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public static String m1634f1(Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        return name + "#" + name2 + "(" + AbstractC0120h.m260h0(parameterTypes, ",", new C0863P(17), 30) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m1635g(C0842H0 c0842h0, String str, PopupWindow popupWindow) {
        try {
            c0842h0.m1709y0(popupWindow, str);
            View contentView = popupWindow.getContentView();
            if ((contentView == null || m1576A(contentView) == null) && !c0842h0.m1664E0()) {
                return;
            }
            c0842h0.m1690m1(popupWindow, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static String m1636g0(Object obj) {
        String str;
        String string;
        Iterator it = AbstractC0120h.m252Z(new String[]{"f434510n", "m", "n"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String strM1630e0 = m1630e0(obj, (String) it.next());
            if (strM1630e0 != null && (string = AbstractC0299i.m507C0(strM1630e0).toString()) != null) {
                str = AbstractC0307q.m534d0(string) ? null : string;
                if (str != null) {
                    break;
                }
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m1637h(C0842H0 c0842h0) {
        c0842h0.getClass();
        boolean z2 = AbstractC1126i.f3786a;
        return C1124g.m2443s() && C1124g.m2435k().getHideConversationUnreadBadge();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m1638i(C0842H0 c0842h0, Object obj) {
        c0842h0.getClass();
        String name = obj.getClass().getName();
        C0037j c0037j = c0842h0.f2846W;
        String str = c0037j != null ? (String) AbstractC0123k.m268j0(c0037j.f243c) : null;
        if (str == null || AbstractC0307q.m534d0(str)) {
            str = (String) AbstractC0123k.m267i0(AbstractC1135r.m2477E("conversation", "item", AbstractC0079h.m167E((String) AbstractC1135r.m2475C("va5.y", "kc5.y", "sd5.y", "yf5.x", "va5.y"))));
        }
        return AbstractC0223g.m414a(name, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m1639j(C0842H0 c0842h0, Object obj, Object obj2) throws JSONException {
        c0842h0.getClass();
        if (!m1596M0()) {
            if (m1607S0()) {
                c0842h0.m1675a1(obj, obj2);
                return;
            }
            return;
        }
        Class<?> cls = obj != null ? obj.getClass() : null;
        if (m1596M0() && cls != null) {
            String name = cls.getName();
            if (AbstractC0307q.m534d0(name)) {
                name = null;
            }
            if (name == null) {
                return;
            }
            String strM1599O = m1599O(obj2);
            if (strM1599O == null || AbstractC0307q.m534d0(strM1599O)) {
                strM1599O = null;
            }
            if (strM1599O == null) {
                return;
            }
            String name2 = obj2.getClass().getName();
            String str = AbstractC0307q.m534d0(name2) ? null : name2;
            if (str != null && m1611V0(cls, name, obj2)) {
                String str2 = name + "|" + str;
                if (AbstractC0223g.m414a(c0842h0.f2875t, str2) && c0842h0.m1670K0(cls)) {
                    return;
                }
                WeakReference weakReference = c0842h0.f2877v;
                if (weakReference != null && ((Context) weakReference.get()) != null) {
                    AbstractC1135r.m2494p();
                    AbstractC1135r.m2495q();
                    JSONObject jSONObjectPut = new JSONObject().put("adapterClassName", name).put("itemClassName", str).put("getItemMethodName", "getItem").put("usernameMethodName", "runtime");
                    AbstractC0223g.m417d(jSONObjectPut, "put(...)");
                    JSONObject jSONObjectM84v = AbstractC0039l.m84v(jSONObjectPut, 2);
                    SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                    AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
                    sharedPreferences.edit().putString("conversation_legacy_list", jSONObjectM84v.toString()).apply();
                    AbstractC0039l.m81s("unified_dexkit_scan_status_v16", true);
                }
                c0842h0.f2875t = str2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m1640k(C0842H0 c0842h0, Object obj, String str) {
        c0842h0.getClass();
        if (m1606R0(str)) {
            Object objM1622b0 = m1622b0(obj, "f434581d");
            if (objM1622b0 != null || (objM1622b0 = m1622b0(obj, "d")) != null) {
                obj = objM1622b0;
            }
            Iterator it = AbstractC0120h.m252Z(new String[]{"field_unReadCount", "field_newUnReadCount", "field_unReadMuteCount", "field_UnReadInvite"}).iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                Integer numM1618Z = m1618Z(obj, (String) it.next());
                iIntValue += numM1618Z != null ? numM1618Z.intValue() : 0;
            }
            if (iIntValue <= 0) {
                return;
            }
            c0842h0.m1665E1(iIntValue, str);
            Long lM1620a0 = m1620a0(obj, "field_conversationTime");
            long jLongValue = lM1620a0 != null ? lM1620a0.longValue() : 0L;
            String str2 = (String) m1622b0(obj, "field_digest");
            if (str2 == null && (str2 = (String) m1622b0(obj, "field_content")) == null) {
                str2 = "";
            }
            c0842h0.m1666F1(str + ":" + iIntValue + ":" + jLongValue + ":" + str2.hashCode(), str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m1641l(Class cls) {
        Object c0104d;
        Object c0104d2;
        boolean z2;
        boolean z3;
        if (cls == null) {
            return false;
        }
        try {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z3 = false;
                    break;
                }
                Method method = methods[i2];
                if (AbstractC0223g.m414a(method.getName(), "getView") && method.getParameterTypes().length == 3 && AbstractC0223g.m414a(method.getParameterTypes()[0], Integer.TYPE) && View.class.isAssignableFrom(method.getReturnType())) {
                    z3 = true;
                    break;
                }
                i2++;
            }
            c0104d = Boolean.valueOf(z3);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = obj;
        }
        boolean zBooleanValue = ((Boolean) c0104d).booleanValue();
        try {
            Method[] methods2 = cls.getMethods();
            AbstractC0223g.m417d(methods2, "getMethods(...)");
            int length2 = methods2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z2 = false;
                    break;
                }
                Method method2 = methods2[i3];
                if (AbstractC0223g.m414a(method2.getName(), "getItem") && method2.getParameterTypes().length == 1) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            c0104d2 = Boolean.valueOf(z2);
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        Object obj2 = Boolean.FALSE;
        if (c0104d2 instanceof C0104d) {
            c0104d2 = obj2;
        }
        return zBooleanValue && ((Boolean) c0104d2).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static ArrayList m1642n(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            Field[] declaredFields = cls.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            AbstractC0129q.m292f0(arrayList, declaredFields);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m1643p() {
        boolean z2 = AbstractC1126i.f3786a;
        return AbstractC0123k.m271m0(AbstractC0120h.m252Z(new String[]{String.valueOf(C1124g.m2448x()), AbstractC0123k.m271m0(C1124g.m2433i(), ",", null, null, new C0863P(15), 30), AbstractC0284i.m497Y(new C0122j(3, new C0122j(1, C1124g.m2439o())))}), "|", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x023b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX INFO: renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0103c m1644p1(View view, Object obj) {
        String string;
        Object c0104d;
        String string2;
        int i2;
        Object c0104d2;
        String string3;
        String string4;
        AdapterView adapterView;
        Object c0104d3;
        Object objM1595M = m1595M(obj);
        String strM1580C = null;
        if (objM1595M == null) {
            View view2 = view;
            while (view2 != null) {
                Object tag = view2.getTag();
                if (tag != null && (m1581C0(tag) || (tag = m1595M(tag)) != null)) {
                    objM1595M = tag;
                    break;
                }
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            objM1595M = null;
            if (objM1595M == null) {
                View view3 = view;
                while (true) {
                    if (view3 == null) {
                        adapterView = null;
                        break;
                    }
                    if (view3 instanceof AdapterView) {
                        adapterView = (AdapterView) view3;
                        break;
                    }
                    Object parent2 = view3.getParent();
                    view3 = parent2 instanceof View ? (View) parent2 : null;
                }
                if (adapterView == null) {
                    objM1595M = null;
                } else {
                    try {
                        c0104d3 = Integer.valueOf(adapterView.getPositionForView(view));
                    } catch (Throwable th) {
                        c0104d3 = new C0104d(th);
                    }
                    if (c0104d3 instanceof C0104d) {
                        c0104d3 = -1;
                    }
                    if (((Number) c0104d3).intValue() == -1) {
                        c0104d3 = null;
                    }
                    Integer num = (Integer) c0104d3;
                    int iIntValue = num != null ? num.intValue() : -1;
                    if (iIntValue >= 0) {
                        try {
                            objM1595M = adapterView.getItemAtPosition(iIntValue);
                        } catch (Throwable th2) {
                            objM1595M = new C0104d(th2);
                        }
                        if (objM1595M instanceof C0104d) {
                            objM1595M = null;
                        }
                        if (objM1595M == null || !m1581C0(objM1595M)) {
                            ListView listView = adapterView instanceof ListView ? (ListView) adapterView : null;
                            int headerViewsCount = iIntValue - (listView != null ? listView.getHeaderViewsCount() : 0);
                            if (headerViewsCount >= 0) {
                                try {
                                    Adapter adapter = adapterView.getAdapter();
                                    ListAdapter listAdapter = adapter instanceof ListAdapter ? (ListAdapter) adapter : null;
                                    objM1595M = listAdapter != null ? listAdapter.getItem(headerViewsCount) : null;
                                } catch (Throwable th3) {
                                    objM1595M = new C0104d(th3);
                                }
                                if (objM1595M instanceof C0104d) {
                                    objM1595M = null;
                                }
                                if (objM1595M == null || !m1581C0(objM1595M)) {
                                }
                            }
                        }
                    }
                }
            }
        }
        Object objM1622b0 = objM1595M;
        if (objM1622b0 == null) {
            String name = obj.getClass().getName();
            if (name.equals("nd5.o") || name.equals("fc5.o") || name.equals("qa5.o") || AbstractC0299i.m511i0(name, "contact.address", true)) {
                if (objM1622b0 == null) {
                    string = null;
                    if (string != null) {
                    }
                } else if (m1577A0(objM1622b0)) {
                    String[] strArr = {"field_username", "username"};
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 2) {
                            String[] strArr2 = {"d1", "getUsername", "h1"};
                            for (int i4 = 0; i4 < 3; i4++) {
                                String strM1647t = m1647t(objM1622b0, strArr2[i4]);
                                if (strM1647t != null && (string = AbstractC0299i.m507C0(strM1647t).toString()) != null) {
                                    if (AbstractC0307q.m534d0(string)) {
                                        string = null;
                                    }
                                    if (string != null) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str = (String) m1622b0(objM1622b0, strArr[i3]);
                            if (str != null && (string = AbstractC0299i.m507C0(str).toString()) != null) {
                                if (AbstractC0307q.m534d0(string)) {
                                    string = null;
                                }
                                if (string != null) {
                                    break;
                                }
                            }
                            i3++;
                        }
                    }
                    if (string != null && !AbstractC0307q.m534d0(string)) {
                        if (!m1577A0(objM1622b0)) {
                            if (m1579B0(objM1622b0)) {
                                Object objM1622b02 = m1622b0(objM1622b0, "d");
                                objM1622b0 = objM1622b02 == null ? m1622b0(objM1622b0, "f344355d") : objM1622b02;
                            } else {
                                objM1622b0 = null;
                            }
                        }
                        String[] strArr3 = {"field_conRemark", "field_nickname", "field_username", "conRemark", "nickname", "username"};
                        i2 = 0;
                        while (true) {
                            if (i2 < 6) {
                                String[] strArr4 = {"getDisplayName", "getNickname", "d0", "c1"};
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= 4) {
                                        break;
                                    }
                                    try {
                                        c0104d2 = (String) AbstractC0514f.f1622b.mo1012c(objM1622b0, strArr4[i5], new Object[0]);
                                    } catch (Throwable th4) {
                                        c0104d2 = new C0104d(th4);
                                    }
                                    if (c0104d2 instanceof C0104d) {
                                        c0104d2 = null;
                                    }
                                    String str2 = (String) c0104d2;
                                    if (str2 != null && (string3 = AbstractC0299i.m507C0(str2).toString()) != null && m1602P0(string3, string)) {
                                        strM1580C = string3;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                String str3 = (String) m1622b0(objM1622b0, strArr3[i2]);
                                if (str3 != null && (string4 = AbstractC0299i.m507C0(str3).toString()) != null && m1602P0(string4, string)) {
                                    strM1580C = string4;
                                    break;
                                }
                                i2++;
                            }
                        }
                        if (strM1580C == null) {
                            String strM1578B = m1578B(view, string);
                            strM1580C = strM1578B != null ? strM1578B : m1580C(view, string);
                            if (strM1580C == null) {
                                strM1580C = string;
                            }
                        }
                        return new C0103c(string, strM1580C);
                    }
                } else {
                    String[] strArr5 = {"x", "v"};
                    int i6 = 0;
                    while (true) {
                        if (i6 < 2) {
                            try {
                                c0104d = (String) AbstractC0514f.f1622b.mo1012c(objM1622b0, strArr5[i6], new Object[0]);
                            } catch (Throwable th5) {
                                c0104d = new C0104d(th5);
                            }
                            if (c0104d instanceof C0104d) {
                                c0104d = null;
                            }
                            String str4 = (String) c0104d;
                            if (str4 != null && (string2 = AbstractC0299i.m507C0(str4).toString()) != null) {
                                if (AbstractC0307q.m534d0(string2)) {
                                    string2 = null;
                                }
                                if (string2 != null) {
                                    string = AbstractC0299i.m505A0(string2, string2);
                                    break;
                                }
                            }
                            i6++;
                        } else {
                            String[] strArr6 = {"d", "f344355d"};
                            for (int i7 = 0; i7 < 2; i7++) {
                                String strM1616Y = m1616Y(m1622b0(objM1622b0, strArr6[i7]));
                                if (strM1616Y != null && (string = AbstractC0299i.m507C0(strM1616Y).toString()) != null) {
                                    if (AbstractC0307q.m534d0(string)) {
                                        string = null;
                                    }
                                    if (string != null) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (string != null) {
                        if (!m1577A0(objM1622b0)) {
                        }
                        String[] strArr32 = {"field_conRemark", "field_nickname", "field_username", "conRemark", "nickname", "username"};
                        i2 = 0;
                        while (true) {
                            if (i2 < 6) {
                            }
                            i2++;
                        }
                        if (strM1580C == null) {
                        }
                        return new C0103c(string, strM1580C);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r1 */
    public static void m1645r1(long j2, Object obj) {
        Long lM1620a0 = m1620a0(obj, "field_conversationTime");
        if (j2 >= (lM1620a0 != null ? lM1620a0.longValue() : 0L)) {
            m1659z1(obj, Long.valueOf(j2), "field_conversationTime");
        }
        Long lM1620a02 = m1620a0(obj, "field_flag");
        if (j2 >= (lM1620a02 != null ? lM1620a02.longValue() : 0L)) {
            m1659z1(obj, Long.valueOf(j2), "field_flag");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX INFO: renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1646s1(View view) {
        int iIntValue;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height == 0) {
            Object tag = view.getTag(1594494977);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num == null) {
                iIntValue = -2;
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
            } else {
                if (num.intValue() == 0) {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                }
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
            }
        }
        Object tag2 = view.getTag(1594494978);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            view.setMinimumHeight(num2.intValue());
        }
        Object tag3 = view.getTag(1594494979);
        int[] iArr = tag3 instanceof int[] ? (int[]) tag3 : null;
        if (iArr != null) {
            if (iArr.length < 4) {
                iArr = null;
            }
            if (iArr != null) {
                view.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        }
        Object tag4 = view.getTag(1594494980);
        Float f = tag4 instanceof Float ? (Float) tag4 : null;
        if (f != null) {
            view.setAlpha(f.floatValue());
        }
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        view.requestLayout();
        view.invalidate();
        view.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m1647t(Object obj, String str) {
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
    /* JADX INFO: renamed from: u */
    public static EnumC0960z0 m1648u() {
        String str;
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        int i3 = AbstractC1135r.f3833e;
        if (m1617Y0()) {
            return EnumC0960z0.f3449a;
        }
        if (i3 >= 3060) {
            return EnumC0960z0.f3450b;
        }
        String str2 = "";
        if (AbstractC0307q.m534d0(AbstractC1135r.f3834f)) {
            try {
                str = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionName;
            } catch (Exception e3) {
                AbstractC0731a.m1385b(e3);
            }
            if (str == null) {
                str = "";
            }
            AbstractC1135r.f3834f = str;
        }
        String str3 = AbstractC1135r.f3834f;
        if (AbstractC0307q.m538h0(str3, false, "8.0.67") || AbstractC0307q.m538h0(str3, false, "8.0.68") || AbstractC0307q.m538h0(str3, false, "8.0.69") || (3000 <= i3 && i3 < 3060)) {
            return EnumC0960z0.f3451c;
        }
        if (AbstractC0307q.m534d0(AbstractC1135r.f3834f)) {
            try {
                String str4 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionName;
                if (str4 != null) {
                    str2 = str4;
                }
            } catch (Exception e4) {
                AbstractC0731a.m1385b(e4);
            }
            AbstractC1135r.f3834f = str2;
        }
        String str5 = AbstractC1135r.f3834f;
        return (AbstractC0307q.m538h0(str5, false, "8.0.65") || AbstractC0307q.m538h0(str5, false, "8.0.66") || (2960 <= i3 && i3 < 3000)) ? EnumC0960z0.f3452d : EnumC0960z0.f3453e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static Object m1649u0(Object obj) {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0223g.m415b(setNewSetFromMap);
        return m1591J(obj, 0, setNewSetFromMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u1 */
    public static C0103c m1650u1(Object obj) {
        Object c0104d;
        Object c0104d2;
        String string;
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Integer num = (Integer) AbstractC0514f.f1622b.mo1012c(obj, "getItemCount", new Object[0]);
            if (num != null) {
                iIntValue = num.intValue();
                c0104d = Integer.valueOf(iIntValue);
            } else {
                num = (Integer) AbstractC0514f.f1622b.mo1012c(obj, "getCount", new Object[0]);
                if (num != null) {
                    iIntValue = num.intValue();
                    c0104d = Integer.valueOf(iIntValue);
                } else {
                    iIntValue = 0;
                    c0104d = Integer.valueOf(iIntValue);
                }
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = 0;
        }
        int iIntValue2 = ((Number) c0104d).intValue();
        int iMin = iIntValue2 > 0 ? Math.min(iIntValue2, 12) : 12;
        for (int i2 = 0; i2 < iMin; i2++) {
            try {
                c0104d2 = AbstractC0514f.f1622b.mo1012c(obj, "getItem", Integer.valueOf(i2));
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            if (c0104d2 instanceof C0104d) {
                c0104d2 = null;
            }
            if (c0104d2 != null) {
                linkedHashSet.add(c0104d2.getClass().getName());
                String strM1599O = m1599O(c0104d2);
                if (strM1599O != null && (string = AbstractC0299i.m507C0(strM1599O).toString()) != null) {
                    String str = AbstractC0307q.m534d0(string) ? null : string;
                    if (str != null && m1611V0(obj.getClass(), obj.getClass().getName(), c0104d2) && !arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return new C0103c(arrayList, AbstractC0123k.m281w0(linkedHashSet));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static String m1651v0(Class cls) {
        Object c0104d;
        Method method;
        try {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && List.class.isAssignableFrom(method.getReturnType())) {
                    break;
                }
                i2++;
            }
            c0104d = method != null ? method.getName() : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final void m1652w(C0227k c0227k, PopupWindow popupWindow, String str) {
        Object c0104d;
        try {
            AbstractC0731a.m1384a("conversation quick add dismiss popup", str, popupWindow.getClass().getName(), String.valueOf(popupWindow.isShowing()));
            popupWindow.dismiss();
            c0227k.f567a = true;
            c0104d = C0109i.f404a;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d(AbstractC0174d.m352h("conversation quick add dismiss popup fail ", str), thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static String m1653w0(Class cls) {
        Object c0104d;
        Method method;
        try {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (method.getParameterTypes().length == 2 && AbstractC0223g.m414a(method.getParameterTypes()[0], Integer.TYPE) && AbstractC0223g.m414a(method.getParameterTypes()[1], String.class)) {
                    break;
                }
                i2++;
            }
            c0104d = method != null ? method.getName() : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX INFO: renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1654w1(String str) {
        int i2;
        if (str == null || AbstractC0307q.m534d0(str)) {
            return 0;
        }
        List listM252Z = AbstractC0120h.m252Z(new String[]{"fh5.", "f45.", "z15.", "o75.", "kc5.", "va5.", "sd5.", "yf5.", "com.tencent.mm.ui.conversation."});
        if (listM252Z.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = listM252Z.iterator();
            while (it.hasNext()) {
                if (AbstractC0307q.m538h0(str, false, (String) it.next())) {
                    i2 = 3;
                    break;
                }
            }
            i2 = 0;
        }
        String strM525w0 = AbstractC0299i.m525w0(str);
        if (strM525w0.length() <= 3) {
            for (int i3 = 0; i3 < strM525w0.length(); i3++) {
                if (Character.isDigit(strM525w0.charAt(i3))) {
                    i2 += 2;
                    break;
                }
            }
            if (strM525w0.length() <= 2) {
                i2++;
            }
        } else if (strM525w0.length() <= 2) {
        }
        return AbstractC0299i.m511i0(str, "conversation", true) ? i2 + 2 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static String m1655x0(Class cls) {
        Object c0104d;
        Method method;
        try {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (method.getParameterTypes().length == 1 && List.class.isAssignableFrom(method.getParameterTypes()[0])) {
                    break;
                }
                i2++;
            }
            c0104d = method != null ? method.getName() : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x1 */
    public static void m1656x1(Object obj) {
        m1659z1(obj, "", "field_content");
        m1659z1(obj, "", "field_digest");
        m1659z1(obj, "", "field_digestUser");
        m1659z1(obj, "", "field_editingMsg");
        m1659z1(obj, "1", "field_msgType");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static Object m1657y(Object obj, String str, int i2, Set set) {
        Object obj2;
        if (obj == null || i2 > 5 || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || obj.getClass().isPrimitive() || (obj instanceof View) || (obj instanceof Context)) {
            return null;
        }
        String name = obj.getClass().getName();
        if (!AbstractC0307q.m538h0(name, false, "android.") && !AbstractC0307q.m538h0(name, false, "androidx.") && set.add(obj)) {
            String string = AbstractC0299i.m507C0(str).toString();
            if (!AbstractC0307q.m534d0(string)) {
                String[] strArr = {m1616Y(obj), m1599O(obj)};
                int i3 = 0;
                while (true) {
                    if (i3 < 2) {
                        String str2 = strArr[i3];
                        if (AbstractC0223g.m414a(str2 != null ? AbstractC0299i.m507C0(str2).toString() : null, string)) {
                            break;
                        }
                        i3++;
                    } else {
                        String[] strArr2 = {"field_username", "username", "userName", "talker", "f", "g", "h", "m", "n"};
                        for (int i4 = 0; i4 < 9; i4++) {
                            String strM1630e0 = m1630e0(obj, strArr2[i4]);
                            if (!AbstractC0223g.m414a(strM1630e0 != null ? AbstractC0299i.m507C0(strM1630e0).toString() : null, string)) {
                            }
                        }
                    }
                }
                if (m1597N(obj, str) != null) {
                    return obj;
                }
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.getName().equals("java.lang.Object"); superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    try {
                        field.setAccessible(true);
                        obj2 = field.get(obj);
                    } catch (Throwable unused) {
                    }
                    if (obj2 != null) {
                        try {
                            Object objM1657y = m1657y(obj2, str, 1 + i2, set);
                            if (objM1657y != null) {
                                return objM1657y;
                            }
                        } catch (Throwable unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y1 */
    public static void m1658y1(Object obj) {
        m1659z1(obj, 0, "field_unReadCount");
        m1659z1(obj, 0, "field_newUnReadCount");
        m1659z1(obj, 0, "field_UnReadInvite");
        m1659z1(obj, 0, "field_unReadMuteCount");
        m1659z1(obj, 0, "field_atCount");
        m1659z1(obj, 0, "field_atAll");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z1 */
    public static void m1659z1(Object obj, Object obj2, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
                return;
            } catch (NoSuchFieldException unused) {
            } catch (Throwable th) {
                AbstractC0731a.m1387d("set conversation field fail", str, th);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A1 */
    public final boolean m1660A1(Activity activity) {
        View decorView;
        if (activity != null) {
            if (activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI") && !activity.isFinishing()) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    View viewFindFocus = decorView.findFocus();
                    String name = viewFindFocus != null ? viewFindFocus.getClass().getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    if (!AbstractC0299i.m511i0(name, "EditText", true)) {
                        if (!m1608T0() && !m1617Y0() && m1648u() != EnumC0960z0.f3452d && m1648u() != EnumC0960z0.f3451c) {
                            WeakReference weakReference = this.f2850a;
                            ListView listView = weakReference != null ? (ListView) weakReference.get() : null;
                            if (listView == null || !listView.isAttachedToWindow()) {
                                WeakReference weakReference2 = this.f2852b;
                                View view = weakReference2 != null ? (View) weakReference2.get() : null;
                                if (view == null || !view.isAttachedToWindow()) {
                                    boolean zM1689m0 = m1689m0(decorView, 0);
                                    if (m1617Y0() && !zM1689m0) {
                                        AbstractC0731a.m1387d("8076 shouldScan false", "reason=no-candidate");
                                    }
                                    return zM1689m0;
                                }
                            }
                        }
                        return true;
                    }
                    if (m1617Y0()) {
                        AbstractC0731a.m1387d("8076 shouldScan false", "reason=focus-edittext", name);
                    }
                    if (m1608T0()) {
                        AbstractC0731a.m1387d("play8072 shouldScan false", "reason=focus-edittext", name);
                        return false;
                    }
                }
            } else if (m1617Y0()) {
                AbstractC0731a.m1387d("8076 shouldScan false", "reason=launcher-or-finishing", activity.getClass().getName(), AbstractC0174d.m355k("finishing=", activity.isFinishing()));
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B1 */
    public final void m1661B1(Object obj) {
        Object objM1622b0;
        WeakReference weakReference;
        View view;
        Object c0104d;
        Constructor<?> constructor;
        if (!m1617Y0() || (objM1622b0 = m1622b0(obj, "f")) == null || (weakReference = this.f2854c) == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        try {
            Constructor<?>[] declaredConstructors = Class.forName("com.tencent.mm.ui.conversation.g7", false, obj.getClass().getClassLoader()).getDeclaredConstructors();
            AbstractC0223g.m417d(declaredConstructors, "getDeclaredConstructors(...)");
            int length = declaredConstructors.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    constructor = null;
                    break;
                }
                constructor = declaredConstructors[i2];
                if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0].isAssignableFrom(objM1622b0.getClass())) {
                    break;
                } else {
                    i2++;
                }
            }
            if (constructor != null) {
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(objM1622b0);
                Runnable runnable = objNewInstance instanceof Runnable ? (Runnable) objNewInstance : null;
                if (runnable != null) {
                    view.post(runnable);
                    try {
                        AbstractC0514f.f1622b.mo1012c(view, "invalidateViews", new Object[0]);
                    } catch (Throwable unused) {
                    }
                }
            }
            c0104d = C0109i.f404a;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("8076 post ui rebind fail", obj.getClass().getName(), thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C1 */
    public final void m1662C1(PopupWindow popupWindow, View view, String str, String str2, long j2, String str3) {
        ViewGroup viewGroupM1592K;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F() && this.f2841R == j2) {
            String str4 = this.f2839P;
            if (AbstractC0223g.m414a(str4 != null ? AbstractC0299i.m507C0(str4).toString() : null, str) && System.currentTimeMillis() - j2 <= 15000 && popupWindow.getContentView() == view && m1576A(view) == null && !this.f2834K.contains(popupWindow) && (viewGroupM1592K = m1592K(view)) != null && m1576A(viewGroupM1592K) == null) {
                TextView textView = new TextView(viewGroupM1592K.getContext());
                textView.setText(C1124g.m2436l());
                textView.setTextSize(16.0f);
                textView.setTextColor(Color.rgb(30, 30, 30));
                textView.setGravity(16);
                textView.setPadding(32, 0, 32, 0);
                Context context = viewGroupM1592K.getContext();
                AbstractC0223g.m417d(context, "getContext(...)");
                float f = 48;
                textView.setMinHeight((int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f));
                Context context2 = viewGroupM1592K.getContext();
                AbstractC0223g.m417d(context2, "getContext(...)");
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) ((f * context2.getResources().getDisplayMetrics().density) + 0.5f)));
                textView.setOnClickListener(new ViewOnClickListenerC0948v0(this, str, str2, popupWindow));
                viewGroupM1592K.addView(textView, 0);
                this.f2834K.add(popupWindow);
                m1687l1(str, str2, popupWindow);
                AbstractC0731a.m1384a("conversation quick add runtime injected", str3, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final Method m1663E(Class cls) {
        if (cls == null) {
            return null;
        }
        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, this.f2861f0, Integer.TYPE);
        if (methodMo1011b != null) {
            return methodMo1011b;
        }
        Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(cls, new C0863P(20));
        return methodArrMo1013d.length > 0 ? methodArrMo1013d[0] : methodMo1011b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public final boolean m1664E0() {
        String str;
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2415F() || (str = this.f2839P) == null || AbstractC0307q.m534d0(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f2841R;
        return 0 <= jCurrentTimeMillis && jCurrentTimeMillis < 15001;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:9:0x000e, B:11:0x0016, B:15:0x0023, B:14:0x001e), top: B:23:0x000e }] */
    /* JADX INFO: renamed from: E1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1665E1(int i2, String str) {
        boolean z2;
        if (str == null || AbstractC0307q.m534d0(str)) {
            return;
        }
        synchronized (this.f2825B) {
            if (i2 > 0) {
                try {
                    boolean z3 = AbstractC1126i.f3786a;
                    if (C1124g.m2429e(str)) {
                        this.f2825B.remove(str);
                    } else {
                        this.f2825B.add(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z2 = !this.f2825B.isEmpty();
        }
        ((C0808h) AbstractC0503h.m988u(C0808h.class)).f2702s.m1764h(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F1 */
    public final void m1666F1(String str, String str2) {
        Object c0104d;
        Context context;
        boolean z2;
        if (str2 != null && !AbstractC0307q.m534d0(str2)) {
            boolean z3 = AbstractC1126i.f3786a;
            if (C1124g.m2448x() && !C1124g.m2429e(str2)) {
                this.f2881z = str2;
                this.f2824A = System.currentTimeMillis();
            }
        }
        if (str2 != null && !AbstractC0307q.m534d0(str2)) {
            synchronized (this.f2825B) {
                try {
                    boolean z4 = AbstractC1126i.f3786a;
                    if (C1124g.m2429e(str2)) {
                        this.f2825B.remove(str2);
                    } else {
                        this.f2825B.add(str2);
                    }
                    z2 = !this.f2825B.isEmpty();
                } finally {
                }
            }
            ((C0808h) AbstractC0503h.m988u(C0808h.class)).f2702s.m1764h(z2);
        }
        boolean z5 = AbstractC1126i.f3786a;
        if (C1124g.m2443s() && C1124g.m2435k().getHiddenMessageVibrate()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ((!AbstractC0223g.m414a(str, this.f2878w) || jCurrentTimeMillis - this.f2879x >= 30000) && jCurrentTimeMillis - this.f2879x >= 1000) {
                this.f2878w = str;
                this.f2879x = jCurrentTimeMillis;
                WeakReference weakReference = this.f2877v;
                Object systemService = (weakReference == null || (context = (Context) weakReference.get()) == null) ? null : context.getSystemService("vibrator");
                Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
                if (vibrator == null) {
                    return;
                }
                try {
                    int iM183g = AbstractC0079h.m183g(C1124g.m2435k().getHiddenMessageVibrateMode(), 0, 3);
                    long[] jArr = iM183g != 0 ? iM183g != 2 ? iM183g != 3 ? new long[]{0, 200} : new long[]{0, 120, 80, 120, 80, 120} : new long[]{0, 250, 120, 250} : new long[]{0, 40};
                    Object objM247a = f2821o0.m247a();
                    AbstractC0223g.m417d(objM247a, "getValue(...)");
                    vibrator.vibrate(jArr, -1, (AudioAttributes) objM247a);
                    c0104d = C0109i.f404a;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("hidden message vibrate fail", thM246a);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final C0824B0 m1667G(Object obj, int i2, Set set) {
        Object c0104d;
        Object next;
        Object c0104d2;
        C0824B0 c0824b0M1667G;
        if (obj == null || !set.add(obj) || i2 > 3 || (obj instanceof View) || (obj instanceof Context) || (obj instanceof Class) || (obj instanceof Collection) || (obj instanceof Map)) {
            return null;
        }
        String name = obj.getClass().getName();
        if (!AbstractC0307q.m538h0(name, false, "java.") && !AbstractC0307q.m538h0(name, false, "android.") && (AbstractC0307q.m538h0(name, false, "com.tencent.mm") || AbstractC0307q.m538h0(name, false, "z15.") || AbstractC0307q.m538h0(name, false, "f45.") || AbstractC0307q.m538h0(name, false, "o75.") || (obj instanceof ListAdapter))) {
            try {
                Method[] methods = obj.getClass().getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                c0104d = AbstractC0120h.m262j0(methods);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj2 = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj2;
            }
            C0280e c0280e = new C0280e(new C0281f(new C0169h(new C0281f(new C0122j(1, (List) c0104d), true, new C0863P(18)), new C0927o0(this, obj, 6)), true, new C0863P(19)));
            if (c0280e.hasNext()) {
                next = c0280e.next();
                if (c0280e.hasNext()) {
                    int iIntValue = ((Number) ((C0103c) next).f395b).intValue();
                    do {
                        Object next2 = c0280e.next();
                        int iIntValue2 = ((Number) ((C0103c) next2).f395b).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (c0280e.hasNext());
                }
            } else {
                next = null;
            }
            C0103c c0103c = (C0103c) next;
            Method method = c0103c != null ? (Method) c0103c.f394a : null;
            if (method != null) {
                return new C0824B0(obj, method);
            }
            ArrayList arrayListM1642n = m1642n(obj.getClass());
            ArrayList<Field> arrayList = new ArrayList();
            for (Object obj3 : arrayListM1642n) {
                if (!Modifier.isStatic(((Field) obj3).getModifiers())) {
                    arrayList.add(obj3);
                }
            }
            for (Field field : arrayList) {
                try {
                    field.setAccessible(true);
                    c0104d2 = field.get(obj);
                } catch (Throwable th2) {
                    c0104d2 = new C0104d(th2);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = null;
                }
                if (c0104d2 != null && (c0824b0M1667G = m1667G(c0104d2, i2 + 1, set)) != null) {
                    return c0824b0M1667G;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0103c m1668H(Object obj, int i2, Set set) {
        Object c0104d;
        C0103c c0103cM1668H;
        WeakReference weakReference;
        Activity activity;
        Window window;
        View decorView;
        ListView listViewM1589I;
        if (obj != null && set.add(obj) && i2 <= 6) {
            if (obj instanceof Map) {
                Iterator it = ((Map) obj).values().iterator();
                while (it.hasNext()) {
                    C0103c c0103cM1668H2 = m1668H(it.next(), i2 + 1, set);
                    if (c0103cM1668H2 != null) {
                        return c0103cM1668H2;
                    }
                }
            } else if (obj instanceof Iterable) {
                Iterator it2 = ((Iterable) obj).iterator();
                while (it2.hasNext()) {
                    C0103c c0103cM1668H3 = m1668H(it2.next(), i2 + 1, set);
                    if (c0103cM1668H3 != null) {
                        return c0103cM1668H3;
                    }
                }
            } else if ((obj instanceof View) || (obj instanceof ListAdapter) || (obj instanceof Activity)) {
                if (obj instanceof ListView) {
                    ListView listView = (ListView) obj;
                    Object objM1584D1 = m1584D1(listView.getAdapter());
                    if (objM1584D1 != null && m1613W0(listView, objM1584D1)) {
                        return new C0103c(obj, objM1584D1);
                    }
                }
                if ((obj instanceof ListAdapter) && (weakReference = this.f2860f) != null && (activity = (Activity) weakReference.get()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (listViewM1589I = m1589I(decorView, obj)) != null) {
                    return new C0103c(listViewM1589I, obj);
                }
                ArrayList arrayListM1642n = m1642n(obj.getClass());
                ArrayList<Field> arrayList = new ArrayList();
                for (Object obj2 : arrayListM1642n) {
                    if (!Modifier.isStatic(((Field) obj2).getModifiers())) {
                        arrayList.add(obj2);
                    }
                }
                for (Field field : arrayList) {
                    try {
                        field.setAccessible(true);
                        c0104d = field.get(obj);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    if (c0104d != null && (c0103cM1668H = m1668H(c0104d, i2 + 1, set)) != null) {
                        return c0103cM1668H;
                    }
                }
            } else {
                if ((obj instanceof Context) || (obj instanceof Class)) {
                    return null;
                }
                String name = obj.getClass().getName();
                if (!AbstractC0307q.m538h0(name, false, "java.") && !AbstractC0307q.m538h0(name, false, "android.") && (AbstractC0307q.m538h0(name, false, "com.tencent.mm") || AbstractC0307q.m538h0(name, false, "z15.") || AbstractC0307q.m538h0(name, false, "f45.") || AbstractC0307q.m538h0(name, false, "o75."))) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final boolean m1669J0(Class cls) {
        List list;
        C0037j c0037j = this.f2846W;
        return (c0037j == null || (list = c0037j.f241a) == null || !list.contains(cls.getName())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final boolean m1670K0(Class cls) {
        Context context;
        C0013M c0013mM70h;
        WeakReference weakReference = this.f2877v;
        return AbstractC0223g.m414a((weakReference == null || (context = (Context) weakReference.get()) == null || (c0013mM70h = AbstractC0039l.m70h(context)) == null) ? null : c0013mM70h.f120a, cls.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final String[] m1671S() {
        C0014N c0014n = this.f2847X;
        return m1631e1(c0014n != null ? c0014n.f128c : null, f2814h0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final View m1672T(Object obj) {
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        if (obj != null) {
            if (obj instanceof PopupWindow) {
                return ((PopupWindow) obj).getContentView();
            }
            WeakHashMap weakHashMap = this.f2835L;
            View view = (View) weakHashMap.get(obj);
            if (view != null) {
                return view;
            }
            for (String str : f2817k0) {
                try {
                    PopupWindow popupWindow = (PopupWindow) m1622b0(obj, str);
                    c0104d3 = popupWindow == null ? null : popupWindow.getContentView();
                } catch (Throwable th) {
                    c0104d3 = new C0104d(th);
                }
                if (c0104d3 instanceof C0104d) {
                    c0104d3 = null;
                }
                View view2 = (View) c0104d3;
                if (view2 != null) {
                    weakHashMap.put(obj, view2);
                    return view2;
                }
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
                    } catch (Throwable th2) {
                        c0104d = new C0104d(th2);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    if (c0104d instanceof PopupWindow) {
                        break loop1;
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
                View view3 = (View) c0104d2;
                if (view3 != null) {
                    weakHashMap.put(obj, view3);
                    return view3;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final Object m1673U(Object obj) {
        Object objM1622b0;
        Object c0104d;
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        WeakHashMap weakHashMap = this.f2836M;
        Object obj3 = weakHashMap.get(obj);
        if (obj3 != null) {
            return obj3;
        }
        String[] strArr = f2819m0;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                objM1622b0 = null;
                break;
            }
            objM1622b0 = m1622b0(obj, strArr[i2]);
            if (objM1622b0 != null) {
                break;
            }
            i2++;
        }
        if (objM1622b0 != null) {
            weakHashMap.put(obj, objM1622b0);
            return objM1622b0;
        }
        Class<?> superclass = obj.getClass();
        loop1: while (true) {
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
                if (c0104d instanceof ContextMenu) {
                    obj2 = c0104d;
                    break loop1;
                }
            }
            superclass = superclass.getSuperclass();
        }
        ContextMenu contextMenu = (ContextMenu) obj2;
        if (contextMenu == null) {
            return obj;
        }
        weakHashMap.put(obj, contextMenu);
        return contextMenu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public final boolean m1674Z0(View view, Object obj) {
        if (!m1617Y0()) {
            return false;
        }
        if (!AbstractC0299i.m511i0(view.getClass().getName(), "ConversationListView", true)) {
            String name = obj.getClass().getName();
            C0037j c0037j = this.f2846W;
            List list = c0037j != null ? c0037j.f241a : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            if (!list.contains(name) && m1649u0(obj) == null) {
                return AbstractC0307q.m538h0(name, false, "fh5.");
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0250 A[LOOP:16: B:134:0x024a->B:136:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ad A[Catch: all -> 0x04c4, TryCatch #1 {all -> 0x04c4, blocks: (B:240:0x04a2, B:242:0x04ad, B:244:0x04b9, B:252:0x04cc, B:249:0x04c6), top: B:360:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04cc A[Catch: all -> 0x04c4, TRY_LEAVE, TryCatch #1 {all -> 0x04c4, blocks: (B:240:0x04a2, B:242:0x04ad, B:244:0x04b9, B:252:0x04cc, B:249:0x04c6), top: B:360:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0551 A[LOOP:2: B:293:0x054b->B:295:0x0551, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05be A[PHI: r0
  0x05be: PHI (r0v107 java.lang.String) = (r0v106 java.lang.String), (r0v112 java.lang.String) binds: [B:319:0x05b1, B:323:0x05b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05ce A[PHI: r9
  0x05ce: PHI (r9v16 java.lang.String) = (r9v15 java.lang.String), (r9v18 java.lang.String) binds: [B:326:0x05c0, B:330:0x05c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05de A[PHI: r2
  0x05de: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v13 java.lang.String) binds: [B:333:0x05d0, B:337:0x05d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX INFO: renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1675a1(Object obj, Object obj2) throws JSONException {
        String str;
        String name;
        Class<?> cls;
        String str2;
        Class<?> cls2;
        Object c0104d;
        Iterator it;
        List listM277s0;
        C0131s c0131s;
        Object c0104d2;
        List list;
        List listM277s02;
        ArrayList arrayList;
        Field[] declaredFields;
        Object c0104d3;
        List list2;
        List listM277s03;
        Iterator it2;
        Object c0104d4;
        String str3;
        int length;
        int i2;
        Method method;
        String strM1651v0;
        String strM1653w0;
        String strM1655x0;
        C0037j c0037j;
        LinkedHashSet linkedHashSet;
        String str4;
        String str5;
        String str6;
        String str7;
        Context context;
        Object next;
        Method[] methods;
        Field[] declaredFields2;
        Object c0104d5;
        if (m1607S0()) {
            Class<?> cls3 = obj != null ? obj.getClass() : null;
            if (cls3 != null) {
                String name2 = cls3.getName();
                str = !AbstractC0307q.m534d0(name2) ? name2 : null;
            }
            String strM1599O = m1599O(obj2);
            if (strM1599O == null || AbstractC0307q.m534d0(strM1599O)) {
                strM1599O = null;
            }
            if (strM1599O != null) {
                name = obj2.getClass().getName();
                if (AbstractC0307q.m534d0(name)) {
                    name = null;
                }
            }
            if (strM1599O == null || name == null || AbstractC0307q.m538h0(name, false, "com.tencent.mm.storage.") || !m1611V0(cls3, str, obj2)) {
                return;
            }
            C0037j c0037j2 = this.f2846W;
            if (obj != null) {
                Class<?> cls4 = obj.getClass();
                C0037j c0037j3 = this.f2846W;
                if (c0037j3 != null) {
                    List list3 = c0037j3.f242b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        try {
                            c0104d5 = Class.forName((String) it3.next(), false, cls4.getClassLoader());
                        } catch (Throwable th) {
                            c0104d5 = new C0104d(th);
                        }
                        if (c0104d5 instanceof C0104d) {
                            c0104d5 = null;
                        }
                        Class cls5 = (Class) c0104d5;
                        if (cls5 != null) {
                            arrayList2.add(cls5);
                        }
                    }
                    cls = (Class) AbstractC0123k.m268j0(arrayList2);
                    if (cls == null) {
                        Object objM1649u0 = m1649u0(obj);
                        if (objM1649u0 != null) {
                            cls = objM1649u0.getClass();
                        } else {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            try {
                                Field[] declaredFields3 = cls4.getDeclaredFields();
                                AbstractC0223g.m417d(declaredFields3, "getDeclaredFields(...)");
                                for (Field field : declaredFields3) {
                                    field.setAccessible(true);
                                    linkedHashSet2.add(field.getType());
                                }
                                Method[] methods2 = cls4.getMethods();
                                AbstractC0223g.m417d(methods2, "getMethods(...)");
                                for (Method method2 : methods2) {
                                    linkedHashSet2.add(method2.getReturnType());
                                    Class<?>[] parameterTypes = method2.getParameterTypes();
                                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                    int length2 = parameterTypes.length;
                                    int i3 = 0;
                                    while (i3 < length2) {
                                        int i4 = i3;
                                        linkedHashSet2.add(parameterTypes[i4]);
                                        i3 = i4 + 1;
                                    }
                                }
                                Class<? super Object> superclass = cls4.getSuperclass();
                                if (superclass != null && (declaredFields2 = superclass.getDeclaredFields()) != null) {
                                    for (Field field2 : declaredFields2) {
                                        field2.setAccessible(true);
                                        linkedHashSet2.add(field2.getType());
                                    }
                                }
                                Class<? super Object> superclass2 = cls4.getSuperclass();
                                if (superclass2 != null && (methods = superclass2.getMethods()) != null) {
                                    int length3 = methods.length;
                                    int i5 = 0;
                                    while (i5 < length3) {
                                        Method method3 = methods[i5];
                                        linkedHashSet2.add(method3.getReturnType());
                                        Class<?>[] parameterTypes2 = method3.getParameterTypes();
                                        AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                                        int length4 = parameterTypes2.length;
                                        Method[] methodArr = methods;
                                        int i6 = 0;
                                        while (i6 < length4) {
                                            int i7 = i6;
                                            linkedHashSet2.add(parameterTypes2[i7]);
                                            i6 = i7 + 1;
                                        }
                                        i5++;
                                        methods = methodArr;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            Iterator it4 = linkedHashSet2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                                Class cls6 = (Class) next;
                                if (!AbstractC0223g.m414a(cls6, cls4) && m1625c1(cls6)) {
                                    break;
                                }
                            }
                            cls = (Class) next;
                        }
                    }
                }
            } else {
                cls = null;
            }
            Class<?> cls7 = (cls == null || cls.getName().equals(str)) ? null : cls;
            if (cls7 != null) {
                String name3 = cls7.getName();
                str2 = !AbstractC0307q.m534d0(name3) ? name3 : null;
            }
            C0131s c0131s2 = C0131s.f426a;
            if (cls7 != null) {
                try {
                    Method[] methods3 = cls7.getMethods();
                    AbstractC0223g.m417d(methods3, "getMethods(...)");
                    ArrayList arrayList3 = new ArrayList();
                    int length5 = methods3.length;
                    int i8 = 0;
                    while (i8 < length5) {
                        Method method4 = methods3[i8];
                        Method[] methodArr2 = methods3;
                        List listM167E = AbstractC0079h.m167E(method4.getReturnType());
                        cls2 = cls3;
                        try {
                            Class<?>[] parameterTypes3 = method4.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes3, "getParameterTypes(...)");
                            AbstractC0129q.m291e0(AbstractC0123k.m273o0(listM167E, AbstractC0120h.m262j0(parameterTypes3)), arrayList3);
                            i8++;
                            methods3 = methodArr2;
                            cls3 = cls2;
                        } catch (Throwable th2) {
                            th = th2;
                            c0104d = new C0104d(th);
                            if (c0104d instanceof C0104d) {
                            }
                            ArrayList arrayList4 = new ArrayList();
                            while (r0.hasNext()) {
                            }
                            ArrayList arrayList5 = new ArrayList(AbstractC0125m.m289c0(arrayList4));
                            it = arrayList4.iterator();
                            while (it.hasNext()) {
                            }
                            listM277s0 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList5)), 8);
                            if (listM277s0 != null) {
                            }
                            if (cls7 == null) {
                            }
                            if (listM277s02 != null) {
                            }
                            if (cls2 == null) {
                            }
                            if (listM277s03 != null) {
                            }
                            if (cls2 == null) {
                                try {
                                    Method[] methods4 = cls2.getMethods();
                                    AbstractC0223g.m417d(methods4, "getMethods(...)");
                                    length = methods4.length;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                        }
                                        i2++;
                                    }
                                    if (method == null) {
                                    }
                                } catch (Throwable th3) {
                                    c0104d4 = new C0104d(th3);
                                }
                                if (c0104d4 instanceof C0104d) {
                                }
                                str3 = (String) c0104d4;
                            }
                            if (cls7 == null) {
                            }
                            if (cls7 == null) {
                            }
                            if (cls2 == null) {
                            }
                            List listM1628d1 = m1628d1(str, c0037j2 == null ? c0037j2.f241a : null);
                            List listM1628d12 = m1628d1(str2, c0037j2 == null ? c0037j2.f242b : null);
                            if (c0037j2 == null) {
                            }
                            if (list != null) {
                            }
                            ArrayList arrayList6 = new ArrayList();
                            while (r11.hasNext()) {
                            }
                            linkedHashSet = new LinkedHashSet();
                            while (r7.hasNext()) {
                            }
                            if (!AbstractC0307q.m534d0(name)) {
                                linkedHashSet.add(name);
                            }
                            List listM281w0 = linkedHashSet.isEmpty() ? AbstractC0123k.m281w0(linkedHashSet) : m1628d1(name, list);
                            List listM1628d13 = m1628d1((String) AbstractC0123k.m268j0(list), c0037j2 == null ? c0037j2.f244d : null);
                            List listM1628d14 = m1628d1((String) AbstractC0123k.m268j0(list), c0037j2 == null ? c0037j2.f245e : null);
                            List listM1628d15 = m1628d1((String) AbstractC0123k.m268j0(list2), c0037j2 == null ? c0037j2.f246f : null);
                            if (str3 != null) {
                            }
                            if (strM1651v0 != null) {
                            }
                            if (strM1653w0 != null) {
                            }
                            if (strM1655x0 != null) {
                            }
                            c0037j = new C0037j(listM1628d1, listM1628d12, listM281w0, listM1628d13, listM1628d14, listM1628d15, str4, str5, str6, str7);
                            if (c0037j.equals(c0037j2)) {
                            }
                        }
                    }
                    cls2 = cls3;
                    Field[] declaredFields4 = cls7.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields4, "getDeclaredFields(...)");
                    ArrayList arrayList7 = new ArrayList(declaredFields4.length);
                    int length6 = declaredFields4.length;
                    int i9 = 0;
                    while (i9 < length6) {
                        arrayList7.add(declaredFields4[i9].getType());
                        i9++;
                        declaredFields4 = declaredFields4;
                    }
                    c0104d = AbstractC0123k.m273o0(arrayList3, arrayList7);
                } catch (Throwable th4) {
                    th = th4;
                    cls2 = cls3;
                }
                if (c0104d instanceof C0104d) {
                    c0104d = c0131s2;
                }
                ArrayList arrayList42 = new ArrayList();
                for (Object obj3 : (Iterable) c0104d) {
                    if (AbstractC0307q.m538h0(((Class) obj3).getName(), false, "com.tencent.mm.storage.")) {
                        arrayList42.add(obj3);
                    }
                }
                ArrayList arrayList52 = new ArrayList(AbstractC0125m.m289c0(arrayList42));
                it = arrayList42.iterator();
                while (it.hasNext()) {
                    arrayList52.add(((Class) it.next()).getName());
                }
                listM277s0 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList52)), 8);
            } else {
                cls2 = cls3;
                listM277s0 = null;
            }
            List list4 = listM277s0 != null ? c0131s2 : listM277s0;
            if (cls7 == null) {
                try {
                    Method[] methods5 = cls7.getMethods();
                    AbstractC0223g.m417d(methods5, "getMethods(...)");
                    arrayList = new ArrayList();
                    int length7 = methods5.length;
                    int i10 = 0;
                    while (i10 < length7) {
                        int i11 = i10;
                        Class<?>[] parameterTypes4 = methods5[i10].getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes4, "getParameterTypes(...)");
                        AbstractC0129q.m291e0(AbstractC0120h.m262j0(parameterTypes4), arrayList);
                        i10 = i11 + 1;
                    }
                    declaredFields = cls7.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    c0131s = c0131s2;
                } catch (Throwable th5) {
                    th = th5;
                    c0131s = c0131s2;
                }
                try {
                    ArrayList arrayList8 = new ArrayList(declaredFields.length);
                    for (Field field3 : declaredFields) {
                        arrayList8.add(field3.getType());
                    }
                    c0104d2 = AbstractC0123k.m273o0(arrayList, arrayList8);
                } catch (Throwable th6) {
                    th = th6;
                    c0104d2 = new C0104d(th);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = c0131s;
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it5 = ((Iterable) c0104d2).iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    Class cls8 = (Class) next2;
                    Iterator it6 = it5;
                    if (AbstractC0307q.m538h0(cls8.getName(), false, "com.tencent.mm") && !list4.contains(cls8.getName()) && !cls8.getName().equals(name) && !AbstractC0307q.m538h0(cls8.getName(), false, "com.tencent.mm.storage.")) {
                        arrayList9.add(next2);
                    }
                    it5 = it6;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj4 : arrayList9) {
                    List list5 = list4;
                    if (hashSet.add(((Class) obj4).getName())) {
                        arrayList10.add(obj4);
                    }
                    list4 = list5;
                }
                list = list4;
                ArrayList arrayList11 = new ArrayList(AbstractC0125m.m289c0(arrayList10));
                Iterator it7 = arrayList10.iterator();
                while (it7.hasNext()) {
                    arrayList11.add(((Class) it7.next()).getName());
                }
                listM277s02 = AbstractC0123k.m277s0(arrayList11, 8);
            } else {
                list = list4;
                c0131s = c0131s2;
                listM277s02 = null;
            }
            List list6 = listM277s02 != null ? c0131s : listM277s02;
            if (cls2 == null) {
                try {
                    Method[] methods6 = cls2.getMethods();
                    AbstractC0223g.m417d(methods6, "getMethods(...)");
                    ArrayList arrayList12 = new ArrayList();
                    int length8 = methods6.length;
                    int i12 = 0;
                    while (i12 < length8) {
                        Method[] methodArr3 = methods6;
                        Class<?>[] parameterTypes5 = methods6[i12].getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes5, "getParameterTypes(...)");
                        AbstractC0129q.m291e0(AbstractC0120h.m262j0(parameterTypes5), arrayList12);
                        i12++;
                        methods6 = methodArr3;
                    }
                    Field[] declaredFields5 = cls2.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields5, "getDeclaredFields(...)");
                    ArrayList arrayList13 = new ArrayList(declaredFields5.length);
                    int length9 = declaredFields5.length;
                    int i13 = 0;
                    while (i13 < length9) {
                        arrayList13.add(declaredFields5[i13].getType());
                        i13++;
                        declaredFields5 = declaredFields5;
                    }
                    c0104d3 = AbstractC0123k.m273o0(arrayList12, arrayList13);
                } catch (Throwable th7) {
                    c0104d3 = new C0104d(th7);
                }
                if (c0104d3 instanceof C0104d) {
                    c0104d3 = c0131s;
                }
                ArrayList arrayList14 = new ArrayList();
                Iterator it8 = ((Iterable) c0104d3).iterator();
                while (it8.hasNext()) {
                    Object next3 = it8.next();
                    Class cls9 = (Class) next3;
                    List list7 = list6;
                    if (AbstractC0307q.m538h0(cls9.getName(), false, "com.tencent.mm")) {
                        it2 = it8;
                        if (AbstractC0299i.m511i0(cls9.getName(), "ViewHolder", false) || cls9.getName().endsWith(".n") || cls9.getName().endsWith("$a")) {
                            arrayList14.add(next3);
                        }
                    } else {
                        it2 = it8;
                    }
                    list6 = list7;
                    it8 = it2;
                }
                list2 = list6;
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList15 = new ArrayList();
                for (Object obj5 : arrayList14) {
                    if (hashSet2.add(((Class) obj5).getName())) {
                        arrayList15.add(obj5);
                    }
                }
                ArrayList arrayList16 = new ArrayList(AbstractC0125m.m289c0(arrayList15));
                Iterator it9 = arrayList15.iterator();
                while (it9.hasNext()) {
                    arrayList16.add(((Class) it9.next()).getName());
                }
                listM277s03 = AbstractC0123k.m277s0(arrayList16, 8);
            } else {
                list2 = list6;
                listM277s03 = null;
            }
            List list8 = listM277s03 != null ? c0131s : listM277s03;
            if (cls2 == null || cls7 == null) {
                str3 = null;
            } else {
                Method[] methods42 = cls2.getMethods();
                AbstractC0223g.m417d(methods42, "getMethods(...)");
                length = methods42.length;
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                        method = null;
                        break;
                    }
                    method = methods42[i2];
                    Class<?>[] parameterTypes6 = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes6, "getParameterTypes(...)");
                    if (parameterTypes6.length == 0 && AbstractC0223g.m414a(method.getReturnType(), cls7)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                c0104d4 = method == null ? method.getName() : null;
                if (c0104d4 instanceof C0104d) {
                    c0104d4 = null;
                }
                str3 = (String) c0104d4;
            }
            strM1651v0 = cls7 == null ? m1651v0(cls7) : null;
            strM1653w0 = cls7 == null ? m1653w0(cls7) : null;
            strM1655x0 = cls2 == null ? m1655x0(cls2) : null;
            List listM1628d16 = m1628d1(str, c0037j2 == null ? c0037j2.f241a : null);
            List listM1628d122 = m1628d1(str2, c0037j2 == null ? c0037j2.f242b : null);
            List list9 = c0037j2 == null ? c0037j2.f243c : null;
            List list10 = list9 != null ? c0131s : list9;
            ArrayList arrayList62 = new ArrayList();
            for (Object obj6 : list10) {
                String str8 = (String) obj6;
                if (!AbstractC0307q.m534d0(str8) && !AbstractC0307q.m538h0(str8, false, "com.tencent.mm.storage.")) {
                    arrayList62.add(obj6);
                }
            }
            linkedHashSet = new LinkedHashSet();
            for (Object obj7 : arrayList62) {
                linkedHashSet.add(obj7);
            }
            if (!AbstractC0307q.m534d0(name) && !AbstractC0307q.m538h0(name, false, "com.tencent.mm.storage.")) {
                linkedHashSet.add(name);
            }
            List listM281w02 = linkedHashSet.isEmpty() ? AbstractC0123k.m281w0(linkedHashSet) : m1628d1(name, list9);
            List listM1628d132 = m1628d1((String) AbstractC0123k.m268j0(list8), c0037j2 == null ? c0037j2.f244d : null);
            List listM1628d142 = m1628d1((String) AbstractC0123k.m268j0(list), c0037j2 == null ? c0037j2.f245e : null);
            List listM1628d152 = m1628d1((String) AbstractC0123k.m268j0(list2), c0037j2 == null ? c0037j2.f246f : null);
            if (str3 != null) {
                str4 = str3;
            } else {
                str3 = c0037j2 != null ? c0037j2.f247g : null;
                if (str3 == null) {
                    str4 = "";
                }
            }
            if (strM1651v0 != null) {
                str5 = strM1651v0;
            } else {
                strM1651v0 = c0037j2 != null ? c0037j2.f248h : null;
                if (strM1651v0 == null) {
                    str5 = "";
                }
            }
            if (strM1653w0 != null) {
                str6 = strM1653w0;
            } else {
                strM1653w0 = c0037j2 != null ? c0037j2.f249i : null;
                if (strM1653w0 == null) {
                    str6 = "";
                }
            }
            if (strM1655x0 != null) {
                String str9 = c0037j2 != null ? c0037j2.f250j : null;
                str7 = str9 == null ? "" : str9;
            } else {
                str7 = strM1655x0;
            }
            c0037j = new C0037j(listM1628d16, listM1628d122, listM281w02, listM1628d132, listM1628d142, listM1628d152, str4, str5, str6, str7);
            if (c0037j.equals(c0037j2)) {
                this.f2846W = c0037j;
                WeakReference weakReference = this.f2877v;
                if (weakReference == null || (context = (Context) weakReference.get()) == null) {
                    return;
                }
                AbstractC0039l.m86x(context, c0037j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final MenuItem m1676c0(int i2, Object obj) {
        Object c0104d;
        if (i2 < 0) {
            return null;
        }
        Object objM1673U = m1673U(obj);
        try {
            c0104d = (MenuItem) AbstractC0514f.f1622b.mo1012c(objM1673U, "getItem", Integer.valueOf(i2));
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
        Object objM269k0 = AbstractC0123k.m269k0(m1610V(objM1673U), i2);
        if (objM269k0 instanceof MenuItem) {
            return (MenuItem) objM269k0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public final void m1677g1(Object obj) {
        try {
            if (obj instanceof BaseAdapter) {
                ((BaseAdapter) obj).notifyDataSetChanged();
            } else if (obj instanceof HeaderViewListAdapter) {
                ListAdapter wrappedAdapter = ((HeaderViewListAdapter) obj).getWrappedAdapter();
                BaseAdapter baseAdapter = wrappedAdapter instanceof BaseAdapter ? (BaseAdapter) wrappedAdapter : null;
                if (baseAdapter != null) {
                    baseAdapter.notifyDataSetChanged();
                }
            } else {
                AbstractC0514f.m1024a(obj, "notifyDataSetChanged", new Object[0]);
            }
            if (m1617Y0()) {
                m1661B1(obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final Class m1678h0(Context context) {
        C0037j c0037j = this.f2846W;
        List list = c0037j != null ? c0037j.f243c : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        List listM167E = AbstractC0079h.m167E((String) AbstractC1135r.m2475C("va5.y", "kc5.y", "sd5.y", "yf5.x", "va5.y"));
        if (!list.isEmpty()) {
            listM167E = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list, listM167E)));
        }
        return m1582D(context, AbstractC1135r.m2477E("conversation", "item", listM167E));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public final void m1679h1(Object obj) {
        WeakReference weakReference = this.f2862g;
        BaseAdapter baseAdapter = weakReference != null ? (BaseAdapter) weakReference.get() : null;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
            return;
        }
        if (obj instanceof BaseAdapter) {
            ((BaseAdapter) obj).notifyDataSetChanged();
            return;
        }
        if (!(obj instanceof HeaderViewListAdapter)) {
            AbstractC0514f.m1024a(obj, "notifyDataSetChanged", new Object[0]);
            return;
        }
        ListAdapter wrappedAdapter = ((HeaderViewListAdapter) obj).getWrappedAdapter();
        BaseAdapter baseAdapter2 = wrappedAdapter instanceof BaseAdapter ? (BaseAdapter) wrappedAdapter : null;
        if (baseAdapter2 != null) {
            baseAdapter2.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0441  */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        int i2;
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        Object c0104d5;
        Object c0104d6;
        String str;
        Class clsMo1021l;
        int i3 = 0;
        int i4 = 15;
        int i5 = 13;
        int i6 = 16;
        int i7 = 4;
        int i8 = 2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f2877v = new WeakReference(applicationContext);
        this.f2846W = AbstractC0039l.m68f(context);
        this.f2847X = AbstractC0039l.m71i(context);
        Context applicationContext2 = context.getApplicationContext();
        Application application = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
        if (application != null && !MainHook.uniqueMetaStore.contains("hide-mainui-launcher-activity-cache")) {
            application.registerActivityLifecycleCallbacks(new C0911j(this, i8));
            MainHook.uniqueMetaStore.add("hide-mainui-launcher-activity-cache");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("conversation_mvvm_list", "会话列表隐藏", new C0863P(9), new C0781b(this, context, i7), new C0915k0(this, 3), new C0026a(i6)));
        C0052y.m98c(context, new C0048u("quick_add_menu", "快捷加入名单", new C0863P(i5), new C0035h(context, i4), new C0915k0(this, i7), new C0026a(i6)));
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        C0037j c0037j = this.f2846W;
        List list = c0037j != null ? c0037j.f241a : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        for (Object obj : list) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        C0013M c0013mM70h = AbstractC0039l.m70h(context);
        if (c0013mM70h != null) {
            String str2 = c0013mM70h.f120a;
            if (AbstractC0307q.m534d0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                linkedHashSet.add(str2);
            }
        }
        for (String str3 : linkedHashSet) {
            ClassLoader classLoader = context.getClassLoader();
            AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
            AbstractC0223g.m418e(str3, "clazz");
            Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader, str3);
            if (clsMo1021l2 != null) {
                m1696p0(clsMo1021l2);
            }
        }
        if (m1608T0()) {
            ClassLoader classLoader2 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
            Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader2, "hf5.a");
            if (clsMo1021l3 != null) {
                Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "a", List.class);
                if (methodMo1011b != null) {
                    String strM354j = AbstractC0174d.m354j("play8072-index-builder-", methodMo1011b);
                    if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                        AbstractC0514f.m1027d(methodMo1011b, new C0827C0(this, 18));
                        MainHook.uniqueMetaStore.add(strM354j);
                    }
                }
            }
        }
        Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(ListView.class, "setAdapter", ListAdapter.class);
        if (methodMo1011b2 != null) {
            String strM354j2 = AbstractC0174d.m354j("hide-mainui-conversation-set-adapter-cache-", methodMo1011b2);
            if (!MainHook.uniqueMetaStore.contains(strM354j2)) {
                AbstractC0514f.m1027d(methodMo1011b2, new C0827C0(this, i8));
                MainHook.uniqueMetaStore.add(strM354j2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Class<NotificationManager> superclass = NotificationManager.class; superclass != null; superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            AbstractC0129q.m292f0(arrayList, declaredMethods);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Method method = (Method) obj2;
            String name = method.getName();
            AbstractC0223g.m417d(name, "getName(...)");
            if (AbstractC0307q.m538h0(name, false, "notify")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                int length = parameterTypes.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    if (Notification.class.isAssignableFrom(parameterTypes[i9])) {
                        arrayList2.add(obj2);
                        break;
                    }
                    i9++;
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<Method> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (hashSet.add(m1634f1((Method) obj3))) {
                arrayList3.add(obj3);
            }
        }
        for (Method method2 : arrayList3) {
            String strM352h = AbstractC0174d.m352h("hidden-message-vibrate-notification-", m1634f1(method2));
            if (!MainHook.uniqueMetaStore.contains(strM352h)) {
                AbstractC0514f.m1027d(method2, new C0827C0(this, i5));
                MainHook.uniqueMetaStore.add(strM352h);
            }
        }
        ClassLoader classLoader3 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
        Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(classLoader3, "com.tencent.wcdb.database.SQLiteDatabase");
        if (clsMo1021l4 != null) {
            Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(clsMo1021l4, new C0863P(11));
            AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
            for (Method method3 : methodArrMo1013d) {
                AbstractC0223g.m415b(method3);
                String strM352h2 = AbstractC0174d.m352h("conversation-quick-add-db-ref-", m1634f1(method3));
                if (!MainHook.uniqueMetaStore.contains(strM352h2)) {
                    AbstractC0514f.m1027d(method3, new C0827C0(this, 29));
                    MainHook.uniqueMetaStore.add(strM352h2);
                }
            }
        }
        ClassLoader classLoader4 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader4, "getClassLoader(...)");
        Class clsMo1021l5 = AbstractC0514f.f1622b.mo1021l(classLoader4, "com.tencent.wcdb.database.SQLiteDatabase");
        if (clsMo1021l5 != null) {
            Method[] methodArrMo1013d2 = AbstractC0514f.f1622b.mo1013d(clsMo1021l5, new C0863P(8));
            AbstractC0223g.m417d(methodArrMo1013d2, "findMethodsByExactPredicate(...)");
            for (Method method4 : methodArrMo1013d2) {
                String strM354j3 = AbstractC0174d.m354j("hidden-message-vibrate-db-", method4);
                if (!MainHook.uniqueMetaStore.contains(strM354j3)) {
                    AbstractC0514f.m1027d(method4, new C0827C0(this, 12));
                    MainHook.uniqueMetaStore.add(strM354j3);
                }
            }
        }
        int i10 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
                i2 = -1;
            }
            AbstractC1135r.f3833e = i2;
        }
        int i11 = AbstractC1135r.f3833e;
        Class cls = Integer.TYPE;
        if (i11 > 3120) {
            ClassLoader classLoader5 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader5, "getClassLoader(...)");
            Class clsMo1021l6 = AbstractC0514f.f1622b.mo1021l(classLoader5, "com.tencent.mm.ui.LauncherUIBottomTabView");
            if (clsMo1021l6 != null) {
                Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(clsMo1021l6, "k", cls);
                if (methodMo1011b3 != null) {
                    String strM354j4 = AbstractC0174d.m354j("hide-main-tab-hidden-unread-setter-", methodMo1011b3);
                    if (!MainHook.uniqueMetaStore.contains(strM354j4)) {
                        AbstractC0514f.m1027d(methodMo1011b3, new C0827C0(this, 14));
                        MainHook.uniqueMetaStore.add(strM354j4);
                    }
                }
            }
        }
        m1694o0(context);
        if (!MainHook.uniqueMetaStore.contains("quick-add-popup-window-probe")) {
            try {
                Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "setContentView", View.class);
                if (methodMo1011b4 != null) {
                    AbstractC0514f.m1027d(methodMo1011b4, new C0827C0(this, 19));
                }
                Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAtLocation", View.class, cls, cls, cls);
                if (methodMo1011b5 != null) {
                    AbstractC0514f.m1027d(methodMo1011b5, new C0827C0(this, 20));
                }
                Method methodMo1011b6 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAsDropDown", View.class, cls, cls);
                if (methodMo1011b6 != null) {
                    AbstractC0514f.m1027d(methodMo1011b6, new C0827C0(this, 21));
                }
                Method methodMo1011b7 = AbstractC0514f.f1622b.mo1011b(PopupWindow.class, "showAsDropDown", View.class, cls, cls, cls);
                if (methodMo1011b7 != null) {
                    AbstractC0514f.m1027d(methodMo1011b7, new C0827C0(this, 22));
                }
                c0104d = Boolean.valueOf(MainHook.uniqueMetaStore.add("quick-add-popup-window-probe"));
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("quick add popup probe install fail", thM246a);
            }
        }
        if (AbstractC1135r.f3833e == -1) {
            try {
                i10 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e3) {
                AbstractC0731a.m1385b(e3);
            }
            AbstractC1135r.f3833e = i10;
        }
        int i12 = AbstractC1135r.f3833e;
        Object c0104d7 = C0109i.f404a;
        if (i12 >= 3060) {
            try {
                m1684k0(context);
                c0104d2 = c0104d7;
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
            if (thM246a2 != null) {
                AbstractC0731a.m1387d("hide mainUI 8.0.70 pipeline fail.", thM246a2);
            }
            if (m1607S0()) {
                try {
                    m1701r0(context);
                    c0104d3 = c0104d7;
                } catch (Throwable th3) {
                    c0104d3 = new C0104d(th3);
                }
                Throwable thM246a3 = AbstractC0105e.m246a(c0104d3);
                if (thM246a3 != null) {
                    AbstractC0731a.m1387d("hide mainUI mvvm recycler learn fail.", thM246a3);
                }
                try {
                    m1703s0(context);
                } catch (Throwable th4) {
                    c0104d7 = new C0104d(th4);
                }
                Throwable thM246a4 = AbstractC0105e.m246a(c0104d7);
                if (thM246a4 != null) {
                    AbstractC0731a.m1387d("hide mainUI mvvm launcher tree learn fail.", thM246a4);
                    return;
                }
                return;
            }
            return;
        }
        try {
            m1682j0();
            c0104d4 = c0104d7;
        } catch (Throwable th5) {
            c0104d4 = new C0104d(th5);
        }
        Throwable thM246a5 = AbstractC0105e.m246a(c0104d4);
        if (thM246a5 != null) {
            AbstractC0731a.m1387d("hide mainUI legacy listview fail.", thM246a5);
            int iM2494p = AbstractC1135r.m2494p();
            if (iM2494p == 2140) {
                str = "com.tencent.mm.ui.conversation.k";
            } else if (2300 > iM2494p || iM2494p >= 2341) {
                str = iM2494p == 2360 ? "com.tencent.mm.ui.conversation.r" : (2360 > iM2494p || iM2494p >= 2442) ? iM2494p == 2560 ? "com.tencent.mm.ui.conversation.p3" : iM2494p == 2701 ? "com.tencent.mm.ui.conversation.q3" : null : "com.tencent.mm.ui.conversation.x";
            } else if (!AbstractC1135r.m2495q().equals("8.0.35")) {
                str = "com.tencent.mm.ui.conversation.p";
            }
            if (str != null) {
                ClassLoader classLoader6 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader6, "getClassLoader(...)");
                clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader6, str);
            } else {
                clsMo1021l = null;
            }
            if (clsMo1021l != null) {
                m1696p0(clsMo1021l);
            } else {
                Method methodMo1010a = AbstractC0514f.f1622b.mo1010a(ListView.class.getName(), context.getClassLoader(), "setAdapter", ListAdapter.class);
                if (methodMo1010a == null) {
                    AbstractC0731a.m1387d("setAdapterMethod is null");
                } else {
                    AbstractC0514f.m1027d(methodMo1010a, new C0827C0(this, i3));
                }
            }
        }
        if (m1648u() == EnumC0960z0.f3451c) {
            try {
                m1704t0(context);
                c0104d5 = c0104d7;
            } catch (Throwable th6) {
                c0104d5 = new C0104d(th6);
            }
            Throwable thM246a6 = AbstractC0105e.m246a(c0104d5);
            if (thM246a6 != null) {
                AbstractC0731a.m1387d("hide mainUI legacy last msg text hook fail.", thM246a6);
            }
        }
        try {
            m1703s0(context);
            c0104d6 = c0104d7;
        } catch (Throwable th7) {
            c0104d6 = new C0104d(th7);
        }
        Throwable thM246a7 = AbstractC0105e.m246a(c0104d6);
        if (thM246a7 != null) {
            AbstractC0731a.m1387d("hide mainUI legacy launcher tree cache fail.", thM246a7);
        }
        if (m1648u() == EnumC0960z0.f3452d) {
            try {
                Method methodMo1011b8 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onWindowFocusChanged", Boolean.TYPE);
                if (methodMo1011b8 != null && !MainHook.uniqueMetaStore.contains("hide-mainui-legacy-6566-window-focus-scan")) {
                    AbstractC0514f.m1027d(methodMo1011b8, new C0827C0(this, 15));
                    MainHook.uniqueMetaStore.add("hide-mainui-legacy-6566-window-focus-scan");
                }
            } catch (Throwable th8) {
                c0104d7 = new C0104d(th8);
            }
            Throwable thM246a8 = AbstractC0105e.m246a(c0104d7);
            if (thM246a8 != null) {
                AbstractC0731a.m1387d("hide mainUI legacy 65-66 focus scan fail.", thM246a8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final Class m1680i0(Context context) {
        C0037j c0037j = this.f2846W;
        String str = c0037j != null ? (String) AbstractC0123k.m268j0(c0037j.f245e) : null;
        if (str != null && !AbstractC0307q.m534d0(str)) {
            ClassLoader classLoader = context.getClassLoader();
            AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
            if (clsMo1021l != null) {
                return clsMo1021l;
            }
        }
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        String str2 = AbstractC1135r.f3833e == 3120 ? "com.tencent.mm.storage.l4" : "com.tencent.mm.storage.e4";
        ClassLoader classLoader2 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
        return AbstractC0514f.f1622b.mo1021l(classLoader2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final void m1681i1(final ListView listView, final String str, long j2, final boolean z2, final InterfaceC0193a interfaceC0193a) {
        Runnable runnable = new Runnable() { // from class: r0.u0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                Object c0104d;
                ListView listView2 = listView;
                if (z2) {
                    this.f2876u = false;
                }
                InterfaceC0193a interfaceC0193a2 = interfaceC0193a;
                if (interfaceC0193a2 != null) {
                    try {
                        interfaceC0193a2.mo7b();
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                }
                listView2.invalidateViews();
                listView2.requestLayout();
                listView2.invalidate();
                c0104d = C0109i.f404a;
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("refresh conversation list fail", str, thM246a);
                }
            }
        };
        if (j2 > 0) {
            listView.postDelayed(runnable, j2);
        } else {
            listView.post(runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public final void m1682j0() {
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        int i3 = AbstractC1135r.f3833e;
        Method methodM1663E = null;
        String str = i3 == 2140 ? "com.tencent.mm.ui.g" : (2300 > i3 || i3 >= 2341) ? (2360 > i3 || i3 >= 2401) ? (2420 > i3 || i3 >= 2481) ? (2480 > i3 || i3 >= 2503) ? ((2480 <= i3 && i3 < 2561) || i3 == 2589 || i3 == 2701 || i3 == 2720 || i3 == 2740 || i3 == 2800) ? "com.tencent.mm.ui.i3" : ((2841 > i3 || i3 >= 2861) && i3 != 3060) ? null : "com.tencent.mm.ui.k3" : "com.tencent.mm.ui.h3" : "com.tencent.mm.ui.b0" : "com.tencent.mm.ui.z" : "com.tencent.mm.ui.y";
        if (str != null) {
            ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
            AbstractC0223g.m418e(classLoader, "classLoader");
            methodM1663E = m1663E(AbstractC0514f.f1622b.mo1021l(classLoader, str));
        }
        if (methodM1663E != null) {
            AbstractC0514f.m1027d(methodM1663E, new C0827C0(this, 17));
        } else {
            AbstractC0731a.m1387d("WeChat MainUI ListView not found adapter, guess start.");
            AbstractC0514f.m1025b(ListView.class, "setAdapter", ListAdapter.class, new C0830D0(this, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public final void m1683j1(View view, Object obj, String str, long j2, boolean z2, InterfaceC0193a interfaceC0193a) {
        RunnableC0936r0 runnableC0936r0 = new RunnableC0936r0(z2, this, interfaceC0193a, obj, view, str, 0);
        if (j2 > 0) {
            view.postDelayed(runnableC0936r0, j2);
        } else {
            view.post(runnableC0936r0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m1684k0(Context context) {
        final Class clsM1680i0;
        final Class clsM1678h0;
        final Class clsM1680i02;
        final Class clsM1678h02;
        ClassLoader classLoader = context.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "cb5.b");
        if (clsMo1021l != null && (clsM1680i02 = m1680i0(context)) != null && (clsM1678h02 = m1678h0(context)) != null) {
            final int i2 = 0;
            Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(clsMo1021l, new InterfaceC0518c() { // from class: r0.m0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p059d0.InterfaceC0518c
                /* JADX INFO: renamed from: a */
                public final boolean mo6a(AccessibleObject accessibleObject) {
                    Method method = (Method) accessibleObject;
                    switch (i2) {
                        case 0:
                            if (AbstractC0223g.m414a(method.getReturnType(), CharSequence.class) && method.getParameterTypes().length >= 3 && AbstractC0223g.m414a(method.getParameterTypes()[0], Context.class) && AbstractC0223g.m414a(method.getParameterTypes()[1], clsM1680i02) && AbstractC0223g.m414a(method.getParameterTypes()[2], clsM1678h02)) {
                                break;
                            }
                            break;
                        case 1:
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (AbstractC0223g.m414a(method.getReturnType(), clsM1680i02)) {
                                AbstractC0223g.m415b(parameterTypes);
                                if (parameterTypes.length != 0 && AbstractC0223g.m414a(parameterTypes[0], clsM1678h02)) {
                                }
                            }
                            break;
                        default:
                            Class<?>[] parameterTypes2 = method.getParameterTypes();
                            if (AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && parameterTypes2.length >= 2 && AbstractC0223g.m414a(parameterTypes2[0], clsM1680i02) && AbstractC0223g.m414a(parameterTypes2[1], clsM1678h02)) {
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            AbstractC0223g.m415b(methodArrMo1013d);
            for (Method method : methodArrMo1013d) {
                String strM354j = AbstractC0174d.m354j("wx8070-item-builder-", method);
                if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                    AbstractC0514f.m1027d(method, new C0827C0(this, 27));
                    MainHook.uniqueMetaStore.add(strM354j);
                }
            }
        }
        C0037j c0037j = this.f2846W;
        List list = c0037j != null ? c0037j.f242b : null;
        List list2 = C0131s.f426a;
        if (list == null) {
            list = list2;
        }
        List listM167E = AbstractC0079h.m167E((String) AbstractC1135r.m2475C("va5.x", "kc5.x", "sd5.x", "yf5.w", "va5.x"));
        if (!list.isEmpty()) {
            listM167E = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list, listM167E)));
        }
        Class clsM1582D = m1582D(context, AbstractC1135r.m2477E("conversation", "dataSource", listM167E));
        if (clsM1582D != null && (clsM1680i0 = m1680i0(context)) != null && (clsM1678h0 = m1678h0(context)) != null) {
            final int i3 = 1;
            Method[] methodArrMo1013d2 = AbstractC0514f.f1622b.mo1013d(clsM1582D, new InterfaceC0518c() { // from class: r0.m0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p059d0.InterfaceC0518c
                /* JADX INFO: renamed from: a */
                public final boolean mo6a(AccessibleObject accessibleObject) {
                    Method method2 = (Method) accessibleObject;
                    switch (i3) {
                        case 0:
                            if (AbstractC0223g.m414a(method2.getReturnType(), CharSequence.class) && method2.getParameterTypes().length >= 3 && AbstractC0223g.m414a(method2.getParameterTypes()[0], Context.class) && AbstractC0223g.m414a(method2.getParameterTypes()[1], clsM1678h0) && AbstractC0223g.m414a(method2.getParameterTypes()[2], clsM1680i0)) {
                                break;
                            }
                            break;
                        case 1:
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (AbstractC0223g.m414a(method2.getReturnType(), clsM1678h0)) {
                                AbstractC0223g.m415b(parameterTypes);
                                if (parameterTypes.length != 0 && AbstractC0223g.m414a(parameterTypes[0], clsM1680i0)) {
                                }
                            }
                            break;
                        default:
                            Class<?>[] parameterTypes2 = method2.getParameterTypes();
                            if (AbstractC0223g.m414a(method2.getReturnType(), Void.TYPE) && parameterTypes2.length >= 2 && AbstractC0223g.m414a(parameterTypes2[0], clsM1678h0) && AbstractC0223g.m414a(parameterTypes2[1], clsM1680i0)) {
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            AbstractC0223g.m415b(methodArrMo1013d2);
            for (Method method2 : methodArrMo1013d2) {
                String strM354j2 = AbstractC0174d.m354j("wx8070-data-source-return-", method2);
                if (!MainHook.uniqueMetaStore.contains(strM354j2)) {
                    AbstractC0514f.m1027d(method2, new C0827C0(this, 25));
                    MainHook.uniqueMetaStore.add(strM354j2);
                }
            }
            final int i4 = 2;
            Method[] methodArrMo1013d3 = AbstractC0514f.f1622b.mo1013d(clsM1582D, new InterfaceC0518c() { // from class: r0.m0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p059d0.InterfaceC0518c
                /* JADX INFO: renamed from: a */
                public final boolean mo6a(AccessibleObject accessibleObject) {
                    Method method22 = (Method) accessibleObject;
                    switch (i4) {
                        case 0:
                            if (AbstractC0223g.m414a(method22.getReturnType(), CharSequence.class) && method22.getParameterTypes().length >= 3 && AbstractC0223g.m414a(method22.getParameterTypes()[0], Context.class) && AbstractC0223g.m414a(method22.getParameterTypes()[1], clsM1680i0) && AbstractC0223g.m414a(method22.getParameterTypes()[2], clsM1678h0)) {
                                break;
                            }
                            break;
                        case 1:
                            Class<?>[] parameterTypes = method22.getParameterTypes();
                            if (AbstractC0223g.m414a(method22.getReturnType(), clsM1680i0)) {
                                AbstractC0223g.m415b(parameterTypes);
                                if (parameterTypes.length != 0 && AbstractC0223g.m414a(parameterTypes[0], clsM1678h0)) {
                                }
                            }
                            break;
                        default:
                            Class<?>[] parameterTypes2 = method22.getParameterTypes();
                            if (AbstractC0223g.m414a(method22.getReturnType(), Void.TYPE) && parameterTypes2.length >= 2 && AbstractC0223g.m414a(parameterTypes2[0], clsM1680i0) && AbstractC0223g.m414a(parameterTypes2[1], clsM1678h0)) {
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            AbstractC0223g.m415b(methodArrMo1013d3);
            for (Method method3 : methodArrMo1013d3) {
                String strM354j3 = AbstractC0174d.m354j("wx8070-data-source-update-", method3);
                if (!MainHook.uniqueMetaStore.contains(strM354j3)) {
                    AbstractC0514f.m1027d(method3, new C0827C0(this, 26));
                    MainHook.uniqueMetaStore.add(strM354j3);
                }
            }
        }
        C0037j c0037j2 = this.f2846W;
        List list3 = c0037j2 != null ? c0037j2.f241a : null;
        if (list3 != null) {
            list2 = list3;
        }
        List listM167E2 = AbstractC0079h.m167E((String) AbstractC1135r.m2475C("va5.v0", "kc5.v0", "sd5.x0", "yf5.w0", "va5.v0"));
        if (!list2.isEmpty()) {
            listM167E2 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list2, listM167E2)));
        }
        Class clsM1582D2 = m1582D(context, AbstractC1135r.m2477E("conversation", "adapter", listM167E2));
        if (clsM1582D2 != null) {
            m1696p0(clsM1582D2);
        }
        m1704t0(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final void m1685k1(Object obj) {
        BaseAdapter baseAdapter;
        if (m1648u() == EnumC0960z0.f3452d) {
            return;
        }
        WeakReference weakReference = this.f2862g;
        if (weakReference != null && (baseAdapter = (BaseAdapter) weakReference.get()) != null) {
            obj = baseAdapter;
        }
        Method[] methods = obj.getClass().getMethods();
        AbstractC0223g.m417d(methods, "getMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0) {
                arrayList.add(method);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((Method) it.next()).getName());
        }
        for (String str : AbstractC0120h.m252Z(new String[]{"clearCache", "i2", "j0", "i0"})) {
            if (hashSet.contains(str)) {
                try {
                    AbstractC0514f.f1622b.mo1012c(obj, str, new Object[0]);
                } catch (Throwable unused) {
                }
            }
        }
        Method[] methods2 = obj.getClass().getMethods();
        AbstractC0223g.m417d(methods2, "getMethods(...)");
        for (Method method2 : methods2) {
            if (AbstractC0223g.m414a(method2.getName(), "a") && method2.getParameterTypes().length == 2 && AbstractC0223g.m414a(method2.getParameterTypes()[0], String.class) && (AbstractC0223g.m414a(method2.getParameterTypes()[1], Boolean.TYPE) || AbstractC0223g.m414a(method2.getParameterTypes()[1], Boolean.class))) {
                try {
                    AbstractC0514f.f1622b.mo1012c(obj, "a", "wxmask", Boolean.TRUE);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final boolean m1686l0() {
        Object obj;
        View view;
        WeakReference weakReference = this.f2856d;
        if (weakReference == null || (obj = weakReference.get()) == null) {
            return false;
        }
        WeakReference weakReference2 = this.f2850a;
        ListView listView = weakReference2 != null ? (ListView) weakReference2.get() : null;
        if (listView != null) {
            return listView.isAttachedToWindow() && m1584D1(listView.getAdapter()) == obj;
        }
        WeakReference weakReference3 = this.f2852b;
        return (weakReference3 == null || (view = (View) weakReference3.get()) == null || !view.isAttachedToWindow()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final void m1687l1(String str, String str2, Object obj) {
        this.f2839P = str;
        this.f2840Q = str2;
        this.f2841R = System.currentTimeMillis();
        this.f2842S = false;
        if (obj != null) {
            this.f2843T = new WeakReference(obj);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0861O(this, this.f2841R, 1), 15000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1688m(String str) {
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F()) {
            this.f2842S = true;
            WeakReference weakReference = this.f2843T;
            m1706v(weakReference != null ? weakReference.get() : null);
            this.f2839P = null;
            this.f2840Q = null;
            this.f2841R = 0L;
            this.f2842S = false;
            this.f2843T = null;
            this.f2844U = null;
            this.f2845V.clear();
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
                        if (!AbstractC0223g.m414a(this.f2848Y, string) || jCurrentTimeMillis - this.f2849Z >= 2000) {
                            AbstractC0503h.m978P("已在隐藏名单中");
                            return;
                        }
                        return;
                    }
                }
            }
            boolean z3 = AbstractC1126i.f3786a;
            C1124g.m2426b(new MaskItemBean(string, null, 0, null, null, null, 62, null));
            C1124g.m2420K(string);
            ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
            m1695o1();
            this.f2848Y = string;
            this.f2849Z = jCurrentTimeMillis;
            AbstractC0503h.m978P("已加入隐藏名单");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final boolean m1689m0(View view, int i2) {
        Object objM1633f0;
        if (view != null && i2 <= 5) {
            if (!m1609U0(view)) {
                if (view instanceof ListView) {
                    ListView listView = (ListView) view;
                    Object objM1584D1 = m1584D1(listView.getAdapter());
                    if (objM1584D1 != null && m1613W0(listView, objM1584D1)) {
                        if (m1617Y0() && i2 <= 3) {
                            AbstractC0731a.m1387d("8076 candidate list", AbstractC0174d.m351g(i2, "depth="), view.getClass().getName(), objM1584D1.getClass().getName());
                            return true;
                        }
                    }
                }
                boolean z2 = view instanceof ViewGroup;
                if (!z2 || (objM1633f0 = m1633f0(view)) == null || !m1674Z0(view, objM1633f0)) {
                    ViewGroup viewGroup = z2 ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        int iMin = Math.min(viewGroup.getChildCount(), 24);
                        for (int i3 = 0; i3 < iMin; i3++) {
                            if (!m1689m0(viewGroup.getChildAt(i3), i2 + 1)) {
                            }
                        }
                    }
                }
            } else if (m1617Y0() && i2 <= 3) {
                AbstractC0731a.m1387d("8076 candidate recycler", AbstractC0174d.m351g(i2, "depth="), view.getClass().getName());
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m1690m1(PopupWindow popupWindow, String str) {
        ArrayList arrayList = this.f2845V;
        AbstractC0129q.m293g0(arrayList, new C0060d(3, popupWindow));
        arrayList.add(new WeakReference(popupWindow));
        while (arrayList.size() > 6) {
            arrayList.remove(0);
        }
        this.f2844U = new WeakReference(popupWindow);
        AbstractC0731a.m1384a("conversation quick add popup remember", str, popupWindow.getClass().getName(), String.valueOf(popupWindow.isShowing()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX INFO: renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1691n0(View view) {
        View view2;
        ViewGroup viewGroup;
        Object objM1584D1;
        Object objM1633f0;
        C0917l c0917lM1360e;
        WeakReference weakReference = this.f2860f;
        if (m1660A1(weakReference != null ? (Activity) weakReference.get() : null)) {
            if (m1648u() == EnumC0960z0.f3452d) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f2872q >= 500) {
                    this.f2872q = jCurrentTimeMillis;
                    if (view != null) {
                        boolean zM1609U0 = m1609U0(view);
                        C0716t c0716t = this.f2838O;
                        if (zM1609U0) {
                            Object objM1627d0 = m1627d0(view);
                            if (objM1627d0 != null) {
                                if (m1609U0(view)) {
                                    c0716t.getClass();
                                    C0917l c0917lM1360e2 = c0716t.m1360e(view, objM1627d0, c0716t.m1362l(view, objM1627d0));
                                    if (c0917lM1360e2 != null) {
                                        m1700r(c0917lM1360e2);
                                        if (m1617Y0()) {
                                            AbstractC0731a.m1387d("8076 tree recycler cache hit", view.getClass().getName(), objM1627d0.getClass().getName());
                                        }
                                        m1698q0(objM1627d0.getClass());
                                        return true;
                                    }
                                }
                                if (m1608T0() && m1702s(view, objM1627d0)) {
                                    m1698q0(objM1627d0.getClass());
                                    return true;
                                }
                                if (m1617Y0()) {
                                    AbstractC0731a.m1387d("8076 tree recycler cache miss", view.getClass().getName(), objM1627d0.getClass().getName());
                                }
                            } else if (m1617Y0()) {
                                AbstractC0731a.m1387d("8076 tree recycler adapter null", view.getClass().getName());
                            }
                        }
                        if (m1617Y0() && (view instanceof ViewGroup) && (objM1633f0 = m1633f0(view)) != null) {
                            AbstractC0731a.m1387d("8076 tree adapter-viewgroup", view.getClass().getName(), objM1633f0.getClass().getName(), AbstractC0174d.m351g(((ViewGroup) view).getChildCount(), "children="));
                            if (m1674Z0(view, objM1633f0)) {
                                if (m1674Z0(view, objM1633f0)) {
                                    view2 = view;
                                    c0917lM1360e = new C0917l(null, view2, objM1633f0, objM1633f0.getClass(), C0131s.f426a, AbstractC0079h.m167E(view.getClass().getName()), 10, EnumC0923n.f3290a);
                                } else {
                                    view2 = view;
                                    c0716t.getClass();
                                    c0917lM1360e = c0716t.m1360e(view2, objM1633f0, c0716t.m1362l(view2, objM1633f0));
                                    if (c0917lM1360e == null) {
                                        AbstractC0731a.m1387d("8076 tree generic cache miss", view2.getClass().getName(), objM1633f0.getClass().getName());
                                    }
                                }
                                m1700r(c0917lM1360e);
                                this.f2854c = new WeakReference(view2);
                                AbstractC0731a.m1387d("8076 tree generic cache hit", view2.getClass().getName(), objM1633f0.getClass().getName());
                                m1696p0(objM1633f0.getClass());
                                return true;
                            }
                            if (!(view2 instanceof ListView)) {
                            }
                            if (view2 instanceof ViewGroup) {
                            }
                            if (viewGroup != null) {
                            }
                        } else {
                            view2 = view;
                            if (!(view2 instanceof ListView) && (objM1584D1 = m1584D1(((ListView) view2).getAdapter())) != null && m1697q(view2, objM1584D1)) {
                                m1696p0(objM1584D1.getClass());
                                return true;
                            }
                            viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                            if (viewGroup != null) {
                                int childCount = viewGroup.getChildCount();
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    if (m1691n0(viewGroup.getChildAt(i2))) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (view != null) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[PHI: r0
  0x0056: PHI (r0v50 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object), (r0v13 java.lang.Object) binds: [B:13:0x0021, B:21:0x003b, B:27:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: n1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1692n1(C0917l c0917l) {
        View view;
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        View view2 = c0917l.f3247b;
        if (view2 != null) {
            view = view2;
        } else {
            WeakReference weakReference = this.f2851a0;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
                view = view2;
            } else {
                view = null;
            }
        }
        Object obj = c0917l.f3248c;
        if (m1608T0()) {
            Object objM1649u0 = m1649u0(obj);
            if (objM1649u0 == null) {
                try {
                    objM1649u0 = AbstractC0514f.f1622b.mo1012c(obj, "c", new Object[0]);
                } catch (Throwable th) {
                    objM1649u0 = new C0104d(th);
                }
                if (objM1649u0 instanceof C0104d) {
                    objM1649u0 = null;
                }
                if (objM1649u0 == null) {
                    try {
                        objM1649u0 = AbstractC0514f.f1622b.mo1012c(obj, "d", new Object[0]);
                    } catch (Throwable th2) {
                        objM1649u0 = new C0104d(th2);
                    }
                    Object obj2 = objM1649u0 instanceof C0104d ? null : objM1649u0;
                    String strM1653w0 = obj2 != null ? m1653w0(obj2.getClass()) : null;
                    String strM1651v0 = obj2 != null ? m1651v0(obj2.getClass()) : null;
                    String strM1655x0 = m1655x0(obj.getClass());
                    if (obj2 != null && strM1653w0 != null && !AbstractC0307q.m534d0(strM1653w0)) {
                        try {
                            c0104d3 = AbstractC0514f.f1622b.mo1012c(obj2, strM1653w0, 5, "");
                        } catch (Throwable th3) {
                            c0104d3 = new C0104d(th3);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d3);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("play8072 data refresh invoke fail", obj2.getClass().getName(), strM1653w0, thM246a);
                        }
                    }
                    if (obj2 != null && strM1651v0 != null && !AbstractC0307q.m534d0(strM1651v0) && strM1655x0 != null && !AbstractC0307q.m534d0(strM1655x0)) {
                        try {
                            c0104d = AbstractC0514f.f1622b.mo1012c(obj2, strM1651v0, new Object[0]);
                        } catch (Throwable th4) {
                            c0104d = new C0104d(th4);
                        }
                        Object obj3 = c0104d instanceof C0104d ? null : c0104d;
                        if (obj3 instanceof List) {
                            try {
                                c0104d2 = AbstractC0514f.f1622b.mo1012c(obj, strM1655x0, new ArrayList((Collection) obj3));
                            } catch (Throwable th5) {
                                c0104d2 = new C0104d(th5);
                            }
                            Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
                            if (thM246a2 != null) {
                                AbstractC0731a.m1387d("play8072 submit list fail", obj.getClass().getName(), strM1655x0, thM246a2);
                            }
                        }
                    }
                }
            }
        }
        if (view != null) {
            view.post(new RunnableC0045r(this, new C0927o0(this, obj, 5), view, 8));
            return;
        }
        ListView listView = c0917l.f3246a;
        if (listView == null) {
            return;
        }
        try {
            AbstractC0514f.f1622b.mo1012c(obj, "notifyDataSetChanged", new Object[0]);
        } catch (Throwable unused) {
        }
        m1681i1(listView, "play-8072-light", 0L, true, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1693o(ContextMenu contextMenu, String str, String str2) {
        Object c0104d;
        Iterable iterableM176U;
        Object c0104d2;
        List list;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F()) {
            boolean zBooleanValue = true;
            if (contextMenu.findItem(1835102465) == null) {
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
                        if (m1586F0(item)) {
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
                m1687l1(str, str2, null);
                return;
            }
            boolean z3 = AbstractC1126i.f3786a;
            MenuItem menuItemAdd = contextMenu.add(0, 1835102465, Integer.MIN_VALUE, C1124g.m2436l());
            this.f2832I.put(menuItemAdd, new C0103c(str, str2));
            m1687l1(str, str2, null);
            ArrayList arrayListM2433i = C1124g.m2433i();
            if (arrayListM2433i.isEmpty()) {
                AbstractC0223g.m415b(menuItemAdd.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0933q0(this, str, str2)));
            } else {
                Iterator it2 = arrayListM2433i.iterator();
                while (it2.hasNext()) {
                    if (AbstractC0223g.m414a(((MaskItemBean) it2.next()).getMaskId(), str)) {
                        menuItemAdd.setTitle("已在隐藏名单中");
                        menuItemAdd.setEnabled(false);
                        break;
                    }
                }
                AbstractC0223g.m415b(menuItemAdd.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0933q0(this, str, str2)));
            }
            AbstractC0223g.m415b(menuItemAdd);
            try {
                List listM1610V = m1610V(contextMenu);
                list = AbstractC0231o.m426b(listM1610V) ? listM1610V : null;
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            if (list != null && list.remove(menuItemAdd)) {
                list.add(0, menuItemAdd);
                c0104d2 = C0109i.f404a;
                Throwable thM246a = AbstractC0105e.m246a(c0104d2);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("conversation quick add menu move fail", thM246a);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public final void m1694o0(Context context) {
        int i2;
        Class cls;
        Class cls2;
        int i3;
        int i4;
        String[] strArr;
        Method methodMo1011b;
        Object c0104d;
        Object c0104d2;
        Class clsMo1021l;
        Object c0104d3;
        Class clsMo1021l2;
        Method methodMo1011b2;
        Object c0104d4;
        Class clsMo1021l3;
        Method methodMo1011b3;
        Method methodMo1011b4;
        Method methodMo1011b5;
        Method methodMo1011b6;
        Method methodMo1011b7;
        Method methodMo1011b8;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
                i2 = -1;
            }
            AbstractC1135r.f3833e = i2;
        }
        int i5 = AbstractC1135r.f3833e;
        int i6 = 1;
        int i7 = 2;
        String[] strArr2 = i5 != 3060 ? i5 != 3080 ? i5 != 3100 ? new String[]{"com.tencent.mm.ui.conversation.m3", "com.tencent.mm.ui.conversation.n3", "com.tencent.mm.ui.conversation.r3"} : new String[]{"com.tencent.mm.ui.conversation.r3"} : new String[]{"com.tencent.mm.ui.conversation.n3"} : new String[]{"com.tencent.mm.ui.conversation.m3"};
        C0014N c0014n = this.f2847X;
        String[] strArrM1631e1 = m1631e1(c0014n != null ? c0014n.f126a : null, strArr2);
        int length = strArrM1631e1.length;
        int i8 = 0;
        while (true) {
            cls = Long.TYPE;
            cls2 = Integer.TYPE;
            i3 = i7;
            i4 = i6;
            if (i8 >= length) {
                break;
            }
            String str = strArrM1631e1[i8];
            String strM352h = AbstractC0174d.m352h("conversation-quick-add-context-menu-", str);
            if (!MainHook.uniqueMetaStore.contains(strM352h)) {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
                    AbstractC0223g.m418e(str, "clazz");
                    Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(classLoader, str);
                    if (clsMo1021l4 != null && (methodMo1011b7 = AbstractC0514f.f1622b.mo1011b(clsMo1021l4, "onCreateContextMenu", ContextMenu.class, View.class, ContextMenu.ContextMenuInfo.class)) != null) {
                        AbstractC0514f.m1027d(methodMo1011b7, new C0827C0(this, 1));
                        MainHook.uniqueMetaStore.add(strM352h);
                    }
                } catch (Throwable unused) {
                }
            }
            String strM352h2 = AbstractC0174d.m352h("conversation-quick-add-long-click-", str);
            if (!MainHook.uniqueMetaStore.contains(strM352h2)) {
                try {
                    ClassLoader classLoader2 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
                    AbstractC0223g.m418e(str, "clazz");
                    Class clsMo1021l5 = AbstractC0514f.f1622b.mo1021l(classLoader2, str);
                    if (clsMo1021l5 != null && (methodMo1011b8 = AbstractC0514f.f1622b.mo1011b(clsMo1021l5, "onItemLongClick", AdapterView.class, View.class, cls2, cls)) != null) {
                        AbstractC0514f.m1027d(methodMo1011b8, new C0827C0(this, 3));
                        MainHook.uniqueMetaStore.add(strM352h2);
                    }
                } catch (Throwable unused2) {
                }
            }
            i8++;
            i7 = i3;
            i6 = i4;
        }
        C0014N c0014n2 = this.f2847X;
        List<C0015O> list = c0014n2 != null ? c0014n2.f129d : null;
        List<C0016P> list2 = C0131s.f426a;
        if (list == null) {
            list = list2;
        }
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list));
        for (C0015O c0015o : list) {
            arrayList.add(new C0954x0(c0015o.f136a, c0015o.f137b, c0015o.f138c));
        }
        for (C0954x0 c0954x0 : AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(arrayList, f2813g0)))) {
            String str2 = c0954x0.f3431a;
            String str3 = c0954x0.f3433c;
            StringBuilder sbM357m = AbstractC0174d.m357m("conversation-quick-add-popup-menu-create-", str2, "-");
            String str4 = c0954x0.f3432b;
            sbM357m.append(str4);
            String string = sbM357m.toString();
            if (!MainHook.uniqueMetaStore.contains(string)) {
                try {
                    ClassLoader classLoader3 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
                    AbstractC0223g.m418e(str4, "clazz");
                    Class clsMo1021l6 = AbstractC0514f.f1622b.mo1021l(classLoader3, str4);
                    if (clsMo1021l6 != null) {
                        ClassLoader classLoader4 = context.getClassLoader();
                        AbstractC0223g.m417d(classLoader4, "getClassLoader(...)");
                        AbstractC0223g.m418e(str2, "clazz");
                        Class clsMo1021l7 = AbstractC0514f.f1622b.mo1021l(classLoader4, str2);
                        if (clsMo1021l7 != null) {
                            Class cls3 = Integer.TYPE;
                            Method methodMo1011b9 = AbstractC0514f.f1622b.mo1011b(clsMo1021l7, str3, View.class, cls3, Long.TYPE, View.OnCreateContextMenuListener.class, clsMo1021l6, cls3, cls3);
                            if (methodMo1011b9 != null) {
                                AbstractC0514f.m1027d(methodMo1011b9, new C0827C0(this, 6));
                                MainHook.uniqueMetaStore.add(string);
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        C0014N c0014n3 = this.f2847X;
        List list3 = c0014n3 != null ? c0014n3.f130e : null;
        if (list3 != null) {
            list2 = list3;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(list2));
        for (C0016P c0016p : list2) {
            arrayList2.add(new C0957y0(c0016p.f139a, c0016p.f140b));
        }
        String[] strArrM1671S = m1671S();
        ArrayList arrayList3 = new ArrayList();
        int length2 = strArrM1671S.length;
        int i9 = 0;
        while (i9 < length2) {
            String str5 = strArrM1671S[i9];
            String[] strArr3 = strArrM1671S;
            ArrayList arrayList4 = new ArrayList(AbstractC0125m.m289c0(AbstractC0120h.m252Z(new String[]{"n", "p", "o"})));
            for (Iterator it = r2.iterator(); it.hasNext(); it = it) {
                arrayList4.add(new C0957y0(str5, (String) it.next()));
            }
            AbstractC0129q.m291e0(arrayList4, arrayList3);
            i9++;
            strArrM1671S = strArr3;
        }
        for (C0957y0 c0957y0 : AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(arrayList2, arrayList3)))) {
            String str6 = c0957y0.f3443a;
            String str7 = c0957y0.f3444b;
            String str8 = "conversation-quick-add-popup-menu-before-show-" + str6 + "-" + str7;
            if (!MainHook.uniqueMetaStore.contains(str8)) {
                try {
                    ClassLoader classLoader5 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader5, "getClassLoader(...)");
                    AbstractC0223g.m418e(str6, "clazz");
                    Class clsMo1021l8 = AbstractC0514f.f1622b.mo1021l(classLoader5, str6);
                    if (clsMo1021l8 != null && (methodMo1011b6 = AbstractC0514f.f1622b.mo1011b(clsMo1021l8, str7, cls2, cls2)) != null) {
                        AbstractC0514f.m1027d(methodMo1011b6, new C0768f(this, str7, 4));
                        MainHook.uniqueMetaStore.add(str8);
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        int i10 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i10 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e3) {
                AbstractC0731a.m1385b(e3);
            }
            AbstractC1135r.f3833e = i10;
        }
        int i11 = AbstractC1135r.f3833e;
        if (i11 == 3060) {
            strArr = new String[i4];
            strArr[0] = "com.tencent.mm.ui.conversation.k3";
        } else if (i11 == 3080) {
            strArr = new String[i4];
            strArr[0] = "com.tencent.mm.ui.conversation.l3";
        } else if (i11 != 3100) {
            strArr = new String[3];
            strArr[0] = "com.tencent.mm.ui.conversation.k3";
            strArr[i4] = "com.tencent.mm.ui.conversation.l3";
            strArr[i3] = "com.tencent.mm.ui.conversation.p3";
        } else {
            strArr = new String[i4];
            strArr[0] = "com.tencent.mm.ui.conversation.p3";
        }
        C0014N c0014n4 = this.f2847X;
        for (String str9 : m1631e1(c0014n4 != null ? c0014n4.f127b : null, strArr)) {
            String strM352h3 = AbstractC0174d.m352h("conversation-quick-add-menu-click-", str9);
            if (!MainHook.uniqueMetaStore.contains(strM352h3)) {
                try {
                    ClassLoader classLoader6 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader6, "getClassLoader(...)");
                    AbstractC0223g.m418e(str9, "clazz");
                    Class clsMo1021l9 = AbstractC0514f.f1622b.mo1021l(classLoader6, str9);
                    if (clsMo1021l9 != null && (methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(clsMo1021l9, "onMMMenuItemSelected", MenuItem.class, cls2)) != null) {
                        AbstractC0514f.m1027d(methodMo1011b5, new C0827C0(this, 8));
                        MainHook.uniqueMetaStore.add(strM352h3);
                    }
                } catch (Throwable unused5) {
                }
            }
        }
        C0014N c0014n5 = this.f2847X;
        for (String str10 : m1631e1(c0014n5 != null ? c0014n5.f131f : null, f2815i0)) {
            String strM352h4 = AbstractC0174d.m352h("conversation-quick-add-popup-item-click-", str10);
            if (!MainHook.uniqueMetaStore.contains(strM352h4)) {
                try {
                    ClassLoader classLoader7 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader7, "getClassLoader(...)");
                    AbstractC0223g.m418e(str10, "clazz");
                    Class clsMo1021l10 = AbstractC0514f.f1622b.mo1021l(classLoader7, str10);
                    if (clsMo1021l10 != null && (methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(clsMo1021l10, "onItemClick", AdapterView.class, View.class, cls2, cls)) != null) {
                        AbstractC0514f.m1027d(methodMo1011b4, new C0827C0(this, 7));
                        MainHook.uniqueMetaStore.add(strM352h4);
                    }
                } catch (Throwable unused6) {
                }
            }
        }
        if (!MainHook.uniqueMetaStore.contains("conversation-quick-add-tick-popup-item-click")) {
            try {
                ClassLoader classLoader8 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader8, "getClassLoader(...)");
                Class clsMo1021l11 = AbstractC0514f.f1622b.mo1021l(classLoader8, "fj5.a");
                if (clsMo1021l11 != null && (methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l11, "onClick", View.class)) != null) {
                    AbstractC0514f.m1027d(methodMo1011b, new C0827C0(this, 11));
                    MainHook.uniqueMetaStore.add("conversation-quick-add-tick-popup-item-click");
                }
            } catch (Throwable unused7) {
            }
        }
        for (String str11 : m1671S()) {
            String strM352h5 = AbstractC0174d.m352h("conversation-quick-add-tick-popup-build-", str11);
            if (!MainHook.uniqueMetaStore.contains(strM352h5)) {
                try {
                    ClassLoader classLoader9 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader9, "getClassLoader(...)");
                    AbstractC0223g.m418e(str11, "clazz");
                    clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader9, str11);
                } catch (Throwable th) {
                    c0104d4 = new C0104d(th);
                }
                if (clsMo1021l3 != null && (methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "o", cls2, cls2)) != null) {
                    AbstractC0514f.m1027d(methodMo1011b3, new C0827C0(this, 10));
                    c0104d4 = Boolean.valueOf(MainHook.uniqueMetaStore.add(strM352h5));
                    AbstractC0105e.m246a(c0104d4);
                }
            }
        }
        C0014N c0014n6 = this.f2847X;
        for (String str12 : m1631e1(c0014n6 != null ? c0014n6.f132g : null, f2816j0)) {
            String strM352h6 = AbstractC0174d.m352h("conversation-quick-add-popup-adapter-get-view-", str12);
            if (!MainHook.uniqueMetaStore.contains(strM352h6)) {
                try {
                    ClassLoader classLoader10 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader10, "getClassLoader(...)");
                    AbstractC0223g.m418e(str12, "clazz");
                    clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader10, str12);
                } catch (Throwable th2) {
                    c0104d3 = new C0104d(th2);
                }
                if (clsMo1021l2 != null && (methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsMo1021l2, "getView", cls2, View.class, ViewGroup.class)) != null) {
                    AbstractC0514f.m1027d(methodMo1011b2, new C0827C0(this, 4));
                    c0104d3 = Boolean.valueOf(MainHook.uniqueMetaStore.add(strM352h6));
                    AbstractC0105e.m246a(c0104d3);
                }
            }
        }
        if (!MainHook.uniqueMetaStore.contains("conversation-quick-add-perform-click")) {
            try {
                Class[] clsArr = {View.class, TextView.class};
                for (int i12 = 0; i12 < i3; i12++) {
                    Class cls4 = clsArr[i12];
                    Method methodMo1011b10 = AbstractC0514f.f1622b.mo1011b(cls4, "performClick", new Object[0]);
                    if (methodMo1011b10 != null) {
                        AbstractC0514f.m1027d(methodMo1011b10, new C0833E0(this, cls4, 0));
                    }
                }
                Class[] clsArr2 = {AdapterView.class, AbsListView.class, ListView.class};
                for (int i13 = 0; i13 < 3; i13++) {
                    Class cls5 = clsArr2[i13];
                    Method methodMo1011b11 = AbstractC0514f.f1622b.mo1011b(cls5, "performItemClick", View.class, cls2, cls);
                    if (methodMo1011b11 != null) {
                        AbstractC0514f.m1027d(methodMo1011b11, new C0833E0(this, cls5, 1));
                    }
                }
                c0104d = Boolean.valueOf(MainHook.uniqueMetaStore.add("conversation-quick-add-perform-click"));
            } catch (Throwable th3) {
                c0104d = new C0104d(th3);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("conversation quick add perform click hook missing", thM246a);
            }
        }
        for (String str13 : m1671S()) {
            String strM352h7 = AbstractC0174d.m352h("conversation-quick-add-popup-dismiss-", str13);
            if (!MainHook.uniqueMetaStore.contains(strM352h7)) {
                try {
                    ClassLoader classLoader11 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader11, "getClassLoader(...)");
                    AbstractC0223g.m418e(str13, "clazz");
                    clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader11, str13);
                } catch (Throwable unused8) {
                }
                if (clsMo1021l != null) {
                    try {
                        Method methodMo1011b12 = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "a", new Object[0]);
                        if (methodMo1011b12 != null) {
                            AbstractC0514f.m1027d(methodMo1011b12, new C0827C0(this, 5));
                            MainHook.uniqueMetaStore.add(strM352h7);
                        }
                    } catch (Throwable unused9) {
                    }
                }
            }
        }
        if (MainHook.uniqueMetaStore.contains("conversation-quick-add-runtime-long-click")) {
            return;
        }
        try {
            Method methodMo1011b13 = AbstractC0514f.f1622b.mo1011b(View.class, "setOnLongClickListener", View.OnLongClickListener.class);
            if (methodMo1011b13 != null) {
                AbstractC0514f.m1027d(methodMo1011b13, new C0827C0(this, 9));
            }
            c0104d2 = Boolean.valueOf(MainHook.uniqueMetaStore.add("conversation-quick-add-runtime-long-click"));
        } catch (Throwable th4) {
            c0104d2 = new C0104d(th4);
        }
        Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
        if (thM246a2 != null) {
            AbstractC0731a.m1387d("conversation quick add runtime long click hook fail", thM246a2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b A[PHI: r7
  0x013b: PHI (r7v53 java.lang.Object) = (r7v41 java.lang.Object), (r7v42 java.lang.Object), (r7v54 java.lang.Object) binds: [B:94:0x0147, B:96:0x014b, B:87:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0151 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1695o1() {
        ListView listView;
        C0917l c0917l;
        View view;
        boolean zBooleanValue;
        Object c0104d;
        Object c0104d2;
        BaseAdapter baseAdapter;
        WeakReference weakReference;
        WeakReference weakReference2;
        Object obj;
        View view2;
        View view3;
        WeakReference weakReference3;
        Object obj2;
        Object obj3;
        ListView listView2;
        Object obj4;
        Activity activity;
        Object obj5;
        Activity activity2;
        if (m1617Y0() || m1608T0()) {
            m1708x("refresh-entry");
        }
        WeakReference weakReference4 = this.f2850a;
        Object c0104d3 = null;
        if ((weakReference4 != null ? (ListView) weakReference4.get() : null) == null) {
            WeakReference weakReference5 = this.f2852b;
            if ((weakReference5 != null ? (View) weakReference5.get() : null) == null) {
                if (m1617Y0()) {
                    WeakReference weakReference6 = this.f2854c;
                    if ((weakReference6 != null ? (View) weakReference6.get() : null) == null) {
                    }
                } else {
                    if (m1617Y0()) {
                        WeakReference weakReference7 = this.f2860f;
                        String strConcat = "launcher=".concat((weakReference7 == null || (activity2 = (Activity) weakReference7.get()) == null) ? "null" : activity2.getClass().getName());
                        WeakReference weakReference8 = this.f2858e;
                        String strConcat2 = "surface=".concat((weakReference8 == null || ((C0917l) weakReference8.get()) == null) ? "null" : C0917l.class.getName());
                        WeakReference weakReference9 = this.f2856d;
                        AbstractC0731a.m1387d("8076 refresh pre-scan", strConcat, strConcat2, "adapter=".concat((weakReference9 == null || (obj5 = weakReference9.get()) == null) ? "null" : obj5.getClass().getName()));
                    }
                    if (m1608T0()) {
                        WeakReference weakReference10 = this.f2860f;
                        String strConcat3 = "launcher=".concat((weakReference10 == null || (activity = (Activity) weakReference10.get()) == null) ? "null" : activity.getClass().getName());
                        WeakReference weakReference11 = this.f2858e;
                        String strConcat4 = "surface=".concat((weakReference11 == null || ((C0917l) weakReference11.get()) == null) ? "null" : C0917l.class.getName());
                        WeakReference weakReference12 = this.f2856d;
                        AbstractC0731a.m1387d("play8072 refresh pre-scan", strConcat3, strConcat4, "adapter=".concat((weakReference12 == null || (obj4 = weakReference12.get()) == null) ? "null" : obj4.getClass().getName()));
                    }
                    m1708x("refresh-missing-cache");
                }
            }
        }
        boolean zM1608T0 = m1608T0();
        EnumC0923n enumC0923n = EnumC0923n.f3294e;
        if (zM1608T0) {
            WeakReference weakReference13 = this.f2858e;
            C0917l c0917l2 = weakReference13 != null ? (C0917l) weakReference13.get() : null;
            WeakReference weakReference14 = this.f2851a0;
            if (weakReference14 == null || (view = (View) weakReference14.get()) == null) {
                WeakReference weakReference15 = this.f2852b;
                if (weakReference15 != null) {
                    View view4 = (View) weakReference15.get();
                    view3 = view4;
                    weakReference3 = this.f2853b0;
                    if (weakReference3 == null || (obj2 = weakReference3.get()) == null) {
                        WeakReference weakReference16 = this.f2856d;
                        obj2 = weakReference16 == null ? weakReference16.get() : null;
                        if (obj2 != null) {
                            obj3 = obj2;
                            if (view3 == null && obj3 != null) {
                                AbstractC0731a.m1387d("play8072 refresh recycler cache", view3.getClass().getName(), obj3.getClass().getName());
                                if (c0917l2 == null) {
                                    Class<?> cls = obj3.getClass();
                                    C0131s c0131s = C0131s.f426a;
                                    c0917l2 = new C0917l(null, view3, obj3, cls, c0131s, c0131s, 0, enumC0923n);
                                }
                                m1692n1(c0917l2);
                                return;
                            }
                            if ((c0917l2 != null ? c0917l2.f3246a : null) == null && obj3 != null) {
                                AbstractC0731a.m1387d("play8072 refresh list surface", c0917l2.f3246a.getClass().getName(), obj3.getClass().getName());
                                m1692n1(c0917l2);
                                return;
                            }
                            AbstractC0731a.m1387d("play8072 refresh missing cache", "rv=".concat(view3 != null ? view3.getClass().getName() : "null"), "adapter=".concat(obj3 != null ? obj3.getClass().getName() : "null"), "surface=".concat(c0917l2 != null ? C0917l.class.getName() : "null"), "list=".concat((c0917l2 == null || (listView2 = c0917l2.f3246a) == null) ? "null" : listView2.getClass().getName()));
                        } else if (c0917l2 != null) {
                            obj2 = c0917l2.f3248c;
                            obj3 = obj2;
                            if (view3 == null) {
                            }
                            if ((c0917l2 != null ? c0917l2.f3246a : null) == null) {
                            }
                            if (c0917l2 == null) {
                                AbstractC0731a.m1387d("play8072 refresh missing cache", "rv=".concat(view3 != null ? view3.getClass().getName() : "null"), "adapter=".concat(obj3 != null ? obj3.getClass().getName() : "null"), "surface=".concat(c0917l2 != null ? C0917l.class.getName() : "null"), "list=".concat((c0917l2 == null || (listView2 = c0917l2.f3246a) == null) ? "null" : listView2.getClass().getName()));
                            }
                        } else {
                            obj3 = null;
                            if (view3 == null) {
                            }
                            if ((c0917l2 != null ? c0917l2.f3246a : null) == null) {
                            }
                        }
                    }
                } else {
                    view3 = null;
                    weakReference3 = this.f2853b0;
                    if (weakReference3 == null) {
                        WeakReference weakReference162 = this.f2856d;
                        if (weakReference162 == null) {
                        }
                        if (obj2 != null) {
                        }
                    }
                }
            } else {
                view3 = view4;
                weakReference3 = this.f2853b0;
                if (weakReference3 == null) {
                }
            }
        }
        if (m1617Y0()) {
            WeakReference weakReference17 = this.f2854c;
            if (weakReference17 == null || (view2 = (View) weakReference17.get()) == null) {
                WeakReference weakReference18 = this.f2852b;
                view2 = weakReference18 != null ? (View) weakReference18.get() : null;
            }
            final C0228l c0228l = new C0228l();
            WeakReference weakReference19 = this.f2856d;
            c0228l.f568a = weakReference19 != null ? weakReference19.get() : null;
            WeakReference weakReference20 = this.f2858e;
            C0917l c0917l3 = weakReference20 != null ? (C0917l) weakReference20.get() : null;
            if (view2 != null && c0228l.f568a == null) {
                Object objM1633f0 = m1633f0(view2);
                c0228l.f568a = objM1633f0;
                if (objM1633f0 != null) {
                    this.f2856d = new WeakReference(c0228l.f568a);
                }
            }
            if (view2 == null) {
                m1708x("8076-container-missing");
                WeakReference weakReference21 = this.f2854c;
                if (weakReference21 == null || (view2 = (View) weakReference21.get()) == null) {
                    WeakReference weakReference22 = this.f2852b;
                    view2 = weakReference22 != null ? (View) weakReference22.get() : null;
                }
                if (view2 != null && c0228l.f568a == null) {
                    Object objM1633f02 = m1633f0(view2);
                    c0228l.f568a = objM1633f02;
                    if (objM1633f02 != null) {
                        this.f2856d = new WeakReference(c0228l.f568a);
                    }
                }
            }
            View view5 = view2;
            if (view5 != null && c0228l.f568a != null) {
                if (c0917l3 == null) {
                    AbstractC0731a.m1387d("8076 refresh without surface", view5.getClass().getName(), c0228l.f568a.getClass().getName());
                }
                try {
                    m1711z0(c0228l.f568a);
                    m1677g1(c0228l.f568a);
                    view5.requestLayout();
                    view5.invalidate();
                    Object parent = view5.getParent();
                    View view6 = parent instanceof View ? (View) parent : null;
                    if (view6 != null) {
                        view6.requestLayout();
                    }
                    Object parent2 = view5.getParent();
                    View view7 = parent2 instanceof View ? (View) parent2 : null;
                    if (view7 != null) {
                        view7.invalidate();
                        c0104d3 = C0109i.f404a;
                    }
                } catch (Throwable th) {
                    c0104d3 = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d3);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("refresh conversation list fail", "8076-dynamic-sync", thM246a);
                }
                final int i2 = 0;
                m1683j1(view5, c0228l.f568a, "8076-dynamic-immediate", 0L, false, new InterfaceC0193a(this) { // from class: r0.n0

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0842H0 f3297b;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f3297b = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p025M0.InterfaceC0193a
                    /* JADX INFO: renamed from: b */
                    public final Object mo7b() {
                        switch (i2) {
                            case 0:
                                this.f3297b.m1677g1(c0228l.f568a);
                                break;
                            default:
                                this.f3297b.m1677g1(c0228l.f568a);
                                break;
                        }
                        return C0109i.f404a;
                    }
                });
                final int i3 = 1;
                m1683j1(view5, c0228l.f568a, "8076-dynamic-rebind", 48L, true, new InterfaceC0193a(this) { // from class: r0.n0

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0842H0 f3297b;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f3297b = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p025M0.InterfaceC0193a
                    /* JADX INFO: renamed from: b */
                    public final Object mo7b() {
                        switch (i3) {
                            case 0:
                                this.f3297b.m1677g1(c0228l.f568a);
                                break;
                            default:
                                this.f3297b.m1677g1(c0228l.f568a);
                                break;
                        }
                        return C0109i.f404a;
                    }
                });
                return;
            }
            String strConcat5 = "container=".concat(view5 != null ? view5.getClass().getName() : "null");
            Object obj6 = c0228l.f568a;
            AbstractC0731a.m1387d("8076 refresh missing cache", strConcat5, "adapter=".concat(obj6 != null ? obj6.getClass().getName() : "null"), "surface=".concat(c0917l3 != null ? C0917l.class.getName() : "null"));
        }
        WeakReference weakReference23 = this.f2850a;
        if (weakReference23 == null || (listView = (ListView) weakReference23.get()) == null) {
            AbstractC0731a.m1387d("refresh conversation list skipped, listView null", m1648u());
            return;
        }
        EnumC0960z0 enumC0960z0M1648u = m1648u();
        Object objM1584D1 = m1584D1(listView.getAdapter());
        EnumC0960z0 enumC0960z0M1648u2 = m1648u();
        EnumC0960z0 enumC0960z0 = EnumC0960z0.f3452d;
        if (enumC0960z0M1648u2 == enumC0960z0 && ((objM1584D1 == null || (!m1583D0(objM1584D1.getClass()) && !m1670K0(objM1584D1.getClass()))) && (((weakReference = this.f2862g) != null && (obj = (BaseAdapter) weakReference.get()) != null) || ((weakReference2 = this.f2856d) != null && (obj = weakReference2.get()) != null)))) {
            objM1584D1 = obj;
        }
        if (objM1584D1 != null) {
            WeakReference weakReference24 = this.f2858e;
            C0917l c0917lM1359d = weakReference24 != null ? (C0917l) weakReference24.get() : null;
            C0716t c0716t = this.f2838O;
            c0716t.getClass();
            if ((c0917lM1359d != null ? c0917lM1359d.f3246a : null) != listView || c0917lM1359d.f3248c != objM1584D1) {
                c0917lM1359d = c0716t.m1359d(listView, objM1584D1);
            }
            if (c0917lM1359d != null) {
                this.f2858e = new WeakReference(c0917lM1359d);
                c0917l = c0917lM1359d;
            } else {
                c0917l = null;
            }
        }
        if (c0917l == null) {
            AbstractC0731a.m1387d("refresh conversation list skipped, adapter null", listView.getClass().getName());
            return;
        }
        Object obj7 = c0917l.f3248c;
        boolean z2 = true;
        boolean z3 = enumC0960z0M1648u == enumC0960z0;
        EnumC0923n enumC0923n2 = EnumC0923n.f3290a;
        EnumC0923n enumC0923n3 = EnumC0923n.f3292c;
        EnumC0923n enumC0923n4 = EnumC0923n.f3291b;
        if (enumC0960z0M1648u == enumC0960z0) {
            EnumC0923n enumC0923n5 = EnumC0923n.f3293d;
            EnumC0923n enumC0923n6 = c0917l.f3253h;
            if (enumC0923n6 != enumC0923n5 && enumC0923n6 != enumC0923n && enumC0923n6 != enumC0923n4 && enumC0923n6 != enumC0923n3 && enumC0923n6 != enumC0923n2) {
                if (!m1583D0(obj7.getClass()) && !m1669J0(obj7.getClass()) && !m1670K0(obj7.getClass())) {
                    return;
                }
            }
        }
        if (!this.f2876u || z3) {
            if (enumC0960z0M1648u == enumC0960z0) {
                String str = m1643p() + "|" + obj7.getClass().getName();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (AbstractC0223g.m414a(str, this.f2870o) && jCurrentTimeMillis - this.f2871p < 180) {
                    return;
                }
                this.f2870o = str;
                this.f2871p = jCurrentTimeMillis;
            }
            this.f2876u = true;
            int iOrdinal = enumC0960z0M1648u.ordinal();
            if (iOrdinal == 0) {
                WeakReference weakReference25 = this.f2854c;
                if (weakReference25 == null || (view = (View) weakReference25.get()) == null) {
                    view = c0917l.f3247b;
                }
                View view8 = view;
                Object obj8 = c0917l.f3248c;
                if (view8 != null) {
                    m1683j1(view8, obj8, "8076-dynamic-immediate", 0L, false, new C0927o0(this, obj8, 1));
                    m1683j1(view8, obj8, "8076-dynamic-rebind", 48L, true, new C0927o0(this, obj8, 2));
                    return;
                }
                ListView listView3 = c0917l.f3246a;
                if (listView3 == null) {
                    return;
                }
                m1681i1(listView3, "8076-dynamic-immediate", 0L, false, new C0927o0(this, obj8, 3));
                m1681i1(listView3, "8076-dynamic-rebind", 48L, true, new C0927o0(this, obj8, 4));
                return;
            }
            if (iOrdinal == 1) {
                if (m1608T0()) {
                    m1692n1(c0917l);
                    return;
                }
                ListView listView4 = c0917l.f3246a;
                if (listView4 == null) {
                    return;
                }
                m1681i1(listView4, "8070-plus", 0L, true, null);
                return;
            }
            if (iOrdinal == 2) {
                ListView listView5 = c0917l.f3246a;
                if (listView5 != null) {
                    Object obj9 = c0917l.f3248c;
                    try {
                        AbstractC0514f.f1622b.mo1012c(obj9, "notifyDataSetChanged", new Object[0]);
                    } catch (Throwable unused) {
                    }
                    m1681i1(listView5, "8067-8069-immediate", 0L, false, null);
                    m1681i1(listView5, "8067-8069-rebind", 48L, false, new C0942t0(this, obj9));
                    EnumC0923n enumC0923n7 = c0917l.f3253h;
                    if (enumC0923n7 != enumC0923n2 && enumC0923n7 != enumC0923n4 && enumC0923n7 != enumC0923n3 && c0917l.f3252g < 4) {
                        z2 = false;
                    }
                    if (!z2) {
                        m1681i1(listView5, "8067-8069-final", 120L, true, null);
                        return;
                    }
                    m1681i1(listView5, "8067-8069-stable-final", 80L, true, null);
                }
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new C0102b();
                    }
                    ListView listView6 = c0917l.f3246a;
                    if (listView6 == null) {
                        return;
                    }
                    m1681i1(listView6, "legacy-other", 0L, true, null);
                    return;
                }
                ListView listView7 = c0917l.f3246a;
                if (listView7 != null) {
                    EnumC0960z0 enumC0960z0M1648u3 = m1648u();
                    Object obj10 = c0917l.f3248c;
                    if (enumC0960z0M1648u3 == enumC0960z0) {
                        WeakReference weakReference26 = this.f2862g;
                        Object obj11 = (weakReference26 == null || (baseAdapter = (BaseAdapter) weakReference26.get()) == null) ? obj10 : baseAdapter;
                        WeakReference weakReference27 = this.f2864i;
                        Object obj12 = weakReference27 != null ? weakReference27.get() : null;
                        WeakReference weakReference28 = this.f2865j;
                        Object obj13 = weakReference28 != null ? weakReference28.get() : null;
                        Method method = this.f2866k;
                        if (obj12 != obj11 || obj13 == null || method == null) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                            AbstractC0223g.m415b(setNewSetFromMap);
                            C0824B0 c0824b0M1667G = m1667G(obj11, 0, setNewSetFromMap);
                            if (c0824b0M1667G != null) {
                                Object obj14 = c0824b0M1667G.f2744a;
                                Method method2 = c0824b0M1667G.f2745b;
                                try {
                                    method2.setAccessible(true);
                                    method2.invoke(obj14, null);
                                    this.f2864i = new WeakReference(obj11);
                                    this.f2865j = new WeakReference(obj14);
                                    this.f2866k = method2;
                                    c0104d = Boolean.TRUE;
                                } catch (Throwable th2) {
                                    c0104d = new C0104d(th2);
                                }
                                Throwable thM246a2 = AbstractC0105e.m246a(c0104d);
                                if (thM246a2 != null) {
                                    AbstractC0731a.m1387d("refresh legacy 65-66 dynamic reset fail", obj14.getClass().getName(), m1634f1(method2), thM246a2);
                                }
                                Boolean bool = Boolean.FALSE;
                                if (c0104d instanceof C0104d) {
                                    c0104d = bool;
                                }
                                zBooleanValue = ((Boolean) c0104d).booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                AbstractC0731a.m1387d("refresh legacy 65-66 dynamic reset miss", obj11.getClass().getName());
                            }
                        } else {
                            try {
                                method.setAccessible(true);
                                method.invoke(obj13, null);
                                c0104d2 = Boolean.TRUE;
                            } catch (Throwable th3) {
                                c0104d2 = new C0104d(th3);
                            }
                            Throwable thM246a3 = AbstractC0105e.m246a(c0104d2);
                            if (thM246a3 != null) {
                                AbstractC0731a.m1387d("refresh legacy 65-66 dynamic reset cached fail", obj13.getClass().getName(), m1634f1(method), thM246a3);
                                this.f2864i = null;
                                this.f2865j = null;
                                this.f2866k = null;
                            }
                            Boolean bool2 = Boolean.FALSE;
                            if (c0104d2 instanceof C0104d) {
                                c0104d2 = bool2;
                            }
                            if (((Boolean) c0104d2).booleanValue()) {
                                zBooleanValue = true;
                            }
                            if (!zBooleanValue) {
                            }
                        }
                    }
                    m1679h1(obj10);
                    listView7.post(new RunnableC0936r0(false, this, null, obj10, listView7, "8065-8066-immediate", 1));
                    listView7.postDelayed(new RunnableC0936r0(false, this, new C0927o0(this, obj10, 0), obj10, listView7, "8065-8066-rebind", 1), 48L);
                    EnumC0923n enumC0923n8 = c0917l.f3253h;
                    if (enumC0923n8 != enumC0923n2 && enumC0923n8 != enumC0923n4 && enumC0923n8 != enumC0923n3 && c0917l.f3252g < 4) {
                        z2 = false;
                    }
                    if (z2) {
                        listView7.postDelayed(new RunnableC0930p0(this, 0), 80L);
                    } else {
                        listView7.postDelayed(new RunnableC0936r0(true, this, null, obj10, listView7, "8065-8066-final", 1), 120L);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public final void m1696p0(Class cls) {
        Method methodMo1011b;
        while (cls != null && !cls.equals(Object.class)) {
            methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, "getView", Integer.TYPE, View.class, ViewGroup.class);
            if (methodMo1011b != null) {
                break;
            } else {
                cls = cls.getSuperclass();
            }
        }
        methodMo1011b = null;
        if (methodMo1011b == null) {
            return;
        }
        String string = methodMo1011b.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        if (MainHook.uniqueMetaStore.contains(string)) {
            return;
        }
        ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
        AbstractC0223g.m418e(classLoader, "classLoader");
        AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.mm.autogen.table.BaseConversation");
        AbstractC0514f.m1027d(methodMo1011b, new C0827C0(this, 16));
        MainHook.uniqueMetaStore.add(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m1697q(Object obj, Object obj2) {
        C0917l c0917lM1359d;
        ListView listView = obj instanceof ListView ? (ListView) obj : null;
        if (listView == null || (c0917lM1359d = this.f2838O.m1359d(listView, obj2)) == null) {
            return false;
        }
        m1700r(c0917lM1359d);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public final void m1698q0(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d((Class) it.next(), new C0915k0(this, 5));
            AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
            for (Method method : methodArrMo1013d) {
                String strM354j = AbstractC0174d.m354j("hide-mainui-unknown-recycler-onbind-", method);
                if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                    AbstractC0514f.m1027d(method, new C0827C0(this, 23));
                    MainHook.uniqueMetaStore.add(strM354j);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final String m1699q1(View view, Object obj, String str) {
        if (obj != null) {
            String string = AbstractC0299i.m507C0(m1601P(obj, str)).toString();
            if (m1602P0(string, str)) {
                return string;
            }
        }
        if (view != null) {
            String strM1578B = m1578B(view, str);
            if (strM1578B == null) {
                strM1578B = m1580C(view, str);
            }
            if (strM1578B != null) {
                return strM1578B;
            }
        }
        C1143z.f3876a.m2534h(this.f2880y);
        C1142y c1142yM2528b = C1143z.m2528b(str);
        String strM2526a = c1142yM2528b != null ? c1142yM2528b.m2526a(new C0781b(this, str, 5)) : null;
        return strM2526a != null ? strM2526a : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:140:0x0121 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v41, types: [java.lang.Object, java.lang.reflect.Method[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1700r(C0917l c0917l) {
        ListView listView;
        ?? c0104d;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        String strM1599O;
        boolean z4;
        boolean z5;
        View view;
        Object obj = c0917l.f3248c;
        Class<?> cls = obj.getClass();
        this.f2858e = new WeakReference(c0917l);
        new WeakReference(cls);
        this.f2856d = new WeakReference(obj);
        ListView listView2 = c0917l.f3246a;
        if (listView2 != null) {
            this.f2850a = new WeakReference(listView2);
        }
        View view2 = c0917l.f3247b;
        if (view2 != null) {
            this.f2852b = new WeakReference(view2);
        }
        if (m1608T0() && c0917l.f3247b != null) {
            this.f2851a0 = new WeakReference(c0917l.f3247b);
            this.f2853b0 = new WeakReference(obj);
        }
        View view3 = c0917l.f3247b;
        if (view3 != null && m1674Z0(view3, obj) && (view = c0917l.f3247b) != null) {
            this.f2854c = new WeakReference(view);
        }
        if (obj instanceof BaseAdapter) {
            this.f2862g = new WeakReference(obj);
        }
        EnumC0960z0 enumC0960z0M1648u = m1648u();
        EnumC0960z0 enumC0960z0 = EnumC0960z0.f3452d;
        if (enumC0960z0M1648u == enumC0960z0) {
            WeakReference weakReference = this.f2863h;
            if ((weakReference != null ? (List) weakReference.get() : null) == null && m1648u() == enumC0960z0) {
                WeakReference weakReference2 = this.f2863h;
                List list = weakReference2 != null ? (List) weakReference2.get() : null;
                if (list == null || !m1594L0(list)) {
                    Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                    AbstractC0223g.m415b(setNewSetFromMap);
                    C0821A0 c0821a0M1585F = m1585F(obj, 0, setNewSetFromMap);
                    if (c0821a0M1585F != null) {
                        List list2 = c0821a0M1585F.f2738a;
                        this.f2863h = new WeakReference(list2);
                        Object obj2 = c0821a0M1585F.f2739b;
                        new WeakReference(obj2);
                        try {
                            ?? methods = obj2.getClass().getMethods();
                            AbstractC0223g.m417d(methods, "getMethods(...)");
                            int length = methods.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    c0104d = 0;
                                    break;
                                }
                                c0104d = methods[i2];
                                Class<?>[] parameterTypes = c0104d.getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                if (parameterTypes.length == 0 && AbstractC0223g.m414a(c0104d.getReturnType(), Void.TYPE) && !Modifier.isStatic(c0104d.getModifiers()) && !AbstractC0120h.m254b0(new String[]{"notifyDataSetChanged", "notifyDataSetInvalidated"}, c0104d.getName()) && !AbstractC0223g.m414a(c0104d.getDeclaringClass(), Object.class)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        boolean z6 = c0104d instanceof C0104d;
                        ?? r6 = c0104d;
                        if (z6) {
                            r6 = 0;
                        }
                        if (!list2.isEmpty()) {
                            if (list2.isEmpty()) {
                                z2 = false;
                                arrayList = this.f2867l;
                                if (!arrayList.isEmpty() || list2.size() > this.f2868m) {
                                    z3 = true;
                                    if (z3) {
                                        arrayList.clear();
                                        arrayList.addAll(list2);
                                        this.f2868m = list2.size();
                                    } else {
                                        for (Object obj3 : list2) {
                                            if (obj3 != null && (strM1599O = m1599O(obj3)) != null) {
                                                if (arrayList.isEmpty()) {
                                                    z4 = true;
                                                    if (!z4) {
                                                        arrayList.add(obj3);
                                                    }
                                                } else {
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        if (AbstractC0223g.m414a(m1599O(it.next()), strM1599O)) {
                                                            z4 = false;
                                                            break;
                                                        }
                                                    }
                                                    z4 = true;
                                                    if (!z4) {
                                                    }
                                                }
                                            }
                                        }
                                        if (arrayList.size() > this.f2868m) {
                                            this.f2868m = arrayList.size();
                                        }
                                    }
                                } else {
                                    if (z2) {
                                        if (arrayList.isEmpty()) {
                                            z5 = true;
                                            if (!z5) {
                                            }
                                            if (z3) {
                                            }
                                        } else {
                                            Iterator it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                String strM1599O2 = m1599O(it2.next());
                                                if (strM1599O2 == null ? false : m1606R0(strM1599O2)) {
                                                    z5 = false;
                                                    break;
                                                }
                                            }
                                            z5 = true;
                                            if (!z5) {
                                            }
                                            if (z3) {
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                    }
                                }
                            } else {
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    String strM1599O3 = m1599O(it3.next());
                                    if (strM1599O3 == null ? false : m1606R0(strM1599O3)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                z2 = false;
                                arrayList = this.f2867l;
                                if (arrayList.isEmpty()) {
                                    z3 = true;
                                    if (z3) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (m1648u() != enumC0960z0) {
            return;
        }
        String strM1643p = m1643p();
        String str = this.f2869n;
        this.f2869n = strM1643p;
        if (str == null || str.equals(strM1643p)) {
            return;
        }
        this.f2863h = null;
        this.f2870o = null;
        WeakReference weakReference3 = this.f2850a;
        if (weakReference3 == null || (listView = (ListView) weakReference3.get()) == null) {
            return;
        }
        listView.post(new RunnableC0930p0(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public final void m1701r0(Context context) {
        ClassLoader classLoader = context.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "androidx.recyclerview.widget.RecyclerView$Adapter");
        if (clsMo1021l == null) {
            return;
        }
        LinkedHashSet<Class> linkedHashSet = new LinkedHashSet();
        ClassLoader classLoader2 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
        Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, "com.tencent.mm.view.recyclerview.WxRecyclerView");
        if (clsMo1021l2 != null) {
            linkedHashSet.add(clsMo1021l2);
        }
        ClassLoader classLoader3 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
        Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader3, "androidx.recyclerview.widget.RecyclerView");
        if (clsMo1021l3 != null) {
            linkedHashSet.add(clsMo1021l3);
        }
        ClassLoader classLoader4 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader4, "getClassLoader(...)");
        Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(classLoader4, "android.support.v7.widget.RecyclerView");
        if (clsMo1021l4 != null) {
            linkedHashSet.add(clsMo1021l4);
        }
        for (Class cls : linkedHashSet) {
            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, "setAdapter", clsMo1021l);
            if (methodMo1011b != null) {
                String strM354j = AbstractC0174d.m354j("hide-mainui-unknown-recycler-bind-", methodMo1011b);
                if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                    AbstractC0514f.m1027d(methodMo1011b, new C0833E0(this, cls, 2));
                    MainHook.uniqueMetaStore.add(strM354j);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m1702s(View view, Object obj) {
        if (m1608T0()) {
            if (view == null) {
                view = null;
            }
            View view2 = view;
            if (view2 != null && m1609U0(view2)) {
                C0103c c0103cM1650u1 = m1650u1(obj);
                List list = (List) c0103cM1650u1.f394a;
                boolean zIsEmpty = list.isEmpty();
                Object obj2 = c0103cM1650u1.f395b;
                if (zIsEmpty) {
                    AbstractC0731a.m1387d("play8072 recycler cache miss", view2.getClass().getName(), obj.getClass().getName(), AbstractC0123k.m271m0((Iterable) obj2, ",", null, null, null, 62));
                    return false;
                }
                List list2 = (List) obj2;
                C0917l c0917l = new C0917l(null, view2, obj, obj.getClass(), list, list2, list2.size() + (list.size() * 3), EnumC0923n.f3294e);
                String name = view2.getClass().getName();
                String name2 = obj.getClass().getName();
                String strM351g = AbstractC0174d.m351g(list.size(), "users=");
                String str = (String) AbstractC0123k.m268j0(list);
                if (str == null) {
                    str = "";
                }
                AbstractC0731a.m1387d("play8072 recycler cache hit", name, name2, strM351g, str, "items=".concat(AbstractC0123k.m271m0((Iterable) obj2, ",", null, null, null, 62)));
                m1700r(c0917l);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public final void m1703s0(Context context) {
        ClassLoader classLoader = context.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.mm.ui.LauncherUI");
        if (clsMo1021l == null) {
            return;
        }
        Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(clsMo1021l, new C0863P(10));
        AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
        for (Method method : methodArrMo1013d) {
            String strM354j = AbstractC0174d.m354j("hide-mainui-unknown-launcher-tree-", method);
            if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                AbstractC0514f.m1027d(method, new C0827C0(this, 24));
                MainHook.uniqueMetaStore.add(strM354j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public final void m1704t0(Context context) {
        ClassLoader classLoader = context.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        for (Class cls : AbstractC0120h.m255c0(new Class[]{AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.mm.ui.base.NoMeasuredTextView"), null})) {
            for (Class[] clsArr : AbstractC0120h.m252Z(new Class[][]{new Class[]{CharSequence.class}, new Class[]{CharSequence.class, TextView.BufferType.class}})) {
                Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, "setText", Arrays.copyOf(clsArr, clsArr.length));
                if (methodMo1011b != null) {
                    String str = "wx8070-last-msg-set-text-" + cls.getName() + "-" + methodMo1011b;
                    if (!MainHook.uniqueMetaStore.contains(str)) {
                        AbstractC0514f.m1027d(methodMo1011b, new C0827C0(this, 28));
                        MainHook.uniqueMetaStore.add(str);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t1 */
    public final void m1705t1(Object obj, String str) {
        long jLongValue;
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        if (AbstractC1135r.f3833e != 3080 || obj == null || str == null || AbstractC0307q.m534d0(str)) {
            return;
        }
        synchronized (this.f2830G) {
            Long l2 = (Long) this.f2830G.get(str);
            jLongValue = l2 != null ? l2.longValue() : 0L;
        }
        if (jLongValue <= 0) {
            return;
        }
        m1645r1(jLongValue, obj);
        Object objM1622b0 = m1622b0(obj, "f434581d");
        if (objM1622b0 == null) {
            objM1622b0 = m1622b0(obj, "d");
        }
        if (objM1622b0 == null || objM1622b0 == obj) {
            return;
        }
        m1645r1(jLongValue, objM1622b0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m1706v(Object obj) {
        Object c0104d;
        Object c0104d2;
        PopupWindow popupWindow;
        C0227k c0227k = new C0227k();
        if (obj instanceof PopupWindow) {
            m1652w(c0227k, (PopupWindow) obj, "direct");
            return;
        }
        int i2 = 0;
        try {
            AbstractC0514f.m1024a(obj, "a", new Object[0]);
            String name = obj != null ? obj.getClass().getName() : null;
            if (name == null) {
                name = "";
            }
            AbstractC0731a.m1384a("conversation quick add dismiss method", name, "a");
            c0104d = C0109i.f404a;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("conversation quick add dismiss method fail", thM246a);
        }
        for (String str : f2817k0) {
            try {
                PopupWindow popupWindow2 = (PopupWindow) m1622b0(obj, str);
                if (popupWindow2 != null) {
                    m1652w(c0227k, popupWindow2, "field:" + str);
                }
            } catch (Throwable unused) {
            }
        }
        if (obj == null) {
            c0104d2 = null;
        } else {
            loop2: for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    try {
                        field.setAccessible(true);
                        c0104d2 = field.get(obj);
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = null;
                    }
                    if (c0104d2 instanceof PopupWindow) {
                        break loop2;
                    }
                }
            }
            c0104d2 = null;
        }
        PopupWindow popupWindow3 = (PopupWindow) c0104d2;
        if (popupWindow3 != null) {
            m1652w(c0227k, popupWindow3, "first-field");
        }
        WeakReference weakReference = this.f2844U;
        if (weakReference != null && (popupWindow = (PopupWindow) weakReference.get()) != null) {
            m1652w(c0227k, popupWindow, "last-ref");
        }
        if (!c0227k.f567a) {
            for (Object obj2 : AbstractC0123k.m281w0(this.f2845V)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0124l.m288b0();
                    throw null;
                }
                PopupWindow popupWindow4 = (PopupWindow) ((WeakReference) obj2).get();
                if (popupWindow4 != null) {
                    m1652w(c0227k, popupWindow4, "recent:" + i2);
                }
                i2 = i3;
            }
        }
        AbstractC0731a.m1384a("conversation quick add dismiss done", String.valueOf(c0227k.f567a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[PHI: r0
  0x004f: PHI (r0v12 java.lang.Object) = (r0v5 java.lang.Object), (r0v8 java.lang.Object) binds: [B:16:0x0034, B:22:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1707v1(View view, int i2, int i3) {
        Object c0104d;
        if (view != null && i2 <= 12) {
            String name = view.getClass().getName();
            try {
                c0104d = AbstractC0514f.f1622b.mo1012c(view, "getAdapter", new Object[0]);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            if (c0104d == null) {
                try {
                    c0104d = AbstractC0514f.f1622b.mo1012c(view, "getRecyclerAdapter", new Object[0]);
                } catch (Throwable th2) {
                    c0104d = new C0104d(th2);
                }
                Object obj = c0104d instanceof C0104d ? null : c0104d;
                if (obj != null) {
                    AbstractC0731a.m1387d("play8072 view adapter", AbstractC0174d.m351g(i2, "depth="), AbstractC0174d.m351g(i3, "index="), name, obj.getClass().getName());
                    if (m1608T0()) {
                        C0103c c0103cM1650u1 = m1650u1(obj);
                        List list = (List) c0103cM1650u1.f394a;
                        boolean zIsEmpty = list.isEmpty();
                        Object obj2 = c0103cM1650u1.f395b;
                        if (!zIsEmpty) {
                            boolean z2 = view instanceof ListView;
                            List list2 = (List) obj2;
                            C0917l c0917l = new C0917l(z2 ? (ListView) view : null, z2 ? null : view, obj, obj.getClass(), list, list2, list2.size() + (list.size() * 3), EnumC0923n.f3294e);
                            String name2 = view.getClass().getName();
                            String name3 = obj.getClass().getName();
                            String strM351g = AbstractC0174d.m351g(list.size(), "users=");
                            String str = (String) AbstractC0123k.m268j0(list);
                            if (str == null) {
                                str = "";
                            }
                            AbstractC0731a.m1387d("play8072 any cache hit", name2, name3, strM351g, str, "items=".concat(AbstractC0123k.m271m0((Iterable) obj2, ",", null, null, null, 62)));
                            m1700r(c0917l);
                            m1698q0(obj.getClass());
                            return true;
                        }
                        AbstractC0731a.m1387d("play8072 any cache miss", view.getClass().getName(), obj.getClass().getName(), AbstractC0123k.m271m0((Iterable) obj2, ",", null, null, null, 62));
                    }
                } else if (AbstractC0299i.m511i0(name, "Recycler", true) || AbstractC0299i.m511i0(name, "List", true) || AbstractC0299i.m511i0(name, "Conversation", true) || AbstractC0299i.m511i0(name, "Wx", true)) {
                    AbstractC0731a.m1387d("play8072 view probe", AbstractC0174d.m351g(i2, "depth="), AbstractC0174d.m351g(i3, "index="), name);
                }
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        if (m1707v1(viewGroup.getChildAt(i4), i2 + 1, i4)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m1708x(String str) {
        WeakReference weakReference;
        Activity activity;
        View decorView;
        if (m1686l0() || (weakReference = this.f2860f) == null || (activity = (Activity) weakReference.get()) == null || !m1660A1(activity)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f2873r || jCurrentTimeMillis - this.f2874s < 1500) {
            return;
        }
        this.f2873r = true;
        this.f2874s = jCurrentTimeMillis;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.postDelayed(new RunnableC0045r(this, activity, str, 7), 650L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX INFO: renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1709y0(final PopupWindow popupWindow, final String str) {
        String string;
        final View contentView;
        final String str2;
        String string2;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str3 = this.f2839P;
            if (str3 == null || (string = AbstractC0299i.m507C0(str3).toString()) == null) {
                return;
            }
            final String str4 = !AbstractC0307q.m534d0(string) ? string : null;
            if (str4 == null || jCurrentTimeMillis - this.f2841R > 15000 || (contentView = popupWindow.getContentView()) == null || m1576A(contentView) != null || this.f2834K.contains(popupWindow)) {
                return;
            }
            String str5 = this.f2840Q;
            if (str5 == null || (string2 = AbstractC0299i.m507C0(str5).toString()) == null) {
                str2 = str4;
            } else {
                str2 = m1602P0(string2, str4) ? string2 : null;
                if (str2 == null) {
                }
            }
            final long j2 = this.f2841R;
            final int i2 = 0;
            contentView.post(new Runnable(this) { // from class: r0.l0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0842H0 f3255b;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f3255b = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            String strConcat = str.concat("-post");
                            this.f3255b.m1662C1(popupWindow, contentView, str4, str2, j2, strConcat);
                            break;
                        default:
                            String strConcat2 = str.concat("-post48");
                            this.f3255b.m1662C1(popupWindow, contentView, str4, str2, j2, strConcat2);
                            break;
                    }
                }
            });
            final int i3 = 1;
            contentView.postDelayed(new Runnable(this) { // from class: r0.l0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0842H0 f3255b;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f3255b = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            String strConcat = str.concat("-post");
                            this.f3255b.m1662C1(popupWindow, contentView, str4, str2, j2, strConcat);
                            break;
                        default:
                            String strConcat2 = str.concat("-post48");
                            this.f3255b.m1662C1(popupWindow, contentView, str4, str2, j2, strConcat2);
                            break;
                    }
                }
            }, 48L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final MenuItem m1710z(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        List listM1610V = m1610V(m1673U(obj));
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : listM1610V) {
            if (obj3 instanceof MenuItem) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m1586F0((MenuItem) next)) {
                obj2 = next;
                break;
            }
        }
        return (MenuItem) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX INFO: renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1711z0(Object obj) {
        String strM1653w0;
        String strM1651v0;
        Object c0104d;
        if (m1617Y0()) {
            C0037j c0037j = this.f2846W;
            Object objM1649u0 = m1649u0(obj);
            if (objM1649u0 == null) {
                try {
                    objM1649u0 = AbstractC0514f.f1622b.mo1012c(obj, "d", new Object[0]);
                } catch (Throwable th) {
                    objM1649u0 = new C0104d(th);
                }
                if (objM1649u0 instanceof C0104d) {
                    objM1649u0 = null;
                }
            }
            if (m1617Y0()) {
                boolean zM414a = AbstractC0223g.m414a(m1622b0(obj, "A"), Boolean.TRUE);
                Object objM1622b0 = m1622b0(obj, "p");
                Object objM1622b02 = m1622b0(objM1649u0, "f");
                if (zM414a) {
                    m1659z1(obj, Boolean.FALSE, "A");
                }
                if (objM1622b0 == null && objM1622b02 != null) {
                    m1659z1(obj, objM1622b02, "p");
                }
                if (objM1649u0 != null && m1622b0(objM1649u0, "i") == null) {
                    m1659z1(objM1649u0, obj, "i");
                }
            }
            if (objM1649u0 == null || (strM1653w0 = m1653w0(objM1649u0.getClass())) == null) {
                if (c0037j != null) {
                    strM1653w0 = c0037j.f249i;
                    if (AbstractC0307q.m534d0(strM1653w0)) {
                        strM1653w0 = null;
                    }
                }
            }
            if (objM1649u0 == null || (strM1651v0 = m1651v0(objM1649u0.getClass())) == null) {
                if (c0037j != null) {
                    strM1651v0 = c0037j.f248h;
                    if (AbstractC0307q.m534d0(strM1651v0)) {
                        strM1651v0 = null;
                    }
                }
            }
            String strM1655x0 = m1655x0(obj.getClass());
            if (strM1655x0 == null) {
                if (c0037j != null) {
                    strM1655x0 = c0037j.f250j;
                    if (AbstractC0307q.m534d0(strM1655x0)) {
                        strM1655x0 = null;
                    }
                }
            }
            if (objM1649u0 != null && strM1653w0 != null && !AbstractC0307q.m534d0(strM1653w0)) {
                try {
                    AbstractC0514f.f1622b.mo1012c(objM1649u0, strM1653w0, 5, "");
                } catch (Throwable unused) {
                }
            }
            if (objM1649u0 == null || strM1651v0 == null || AbstractC0307q.m534d0(strM1651v0) || strM1655x0 == null || AbstractC0307q.m534d0(strM1655x0)) {
                return;
            }
            try {
                c0104d = AbstractC0514f.f1622b.mo1012c(objM1649u0, strM1651v0, new Object[0]);
            } catch (Throwable th2) {
                c0104d = new C0104d(th2);
            }
            Object obj2 = c0104d instanceof C0104d ? null : c0104d;
            if (obj2 instanceof List) {
                try {
                    AbstractC0514f.f1622b.mo1012c(obj, strM1655x0, new ArrayList((Collection) obj2));
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
