package p086r0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import p001A0.AbstractC0039l;
import p001A0.C0022W;
import p001A0.C0023X;
import p004C.C0060d;
import p007D0.RunnableC0093a;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0135w;
import p011F0.C0131s;
import p021K0.C0169h;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p038T0.C0280e;
import p038T0.C0281f;
import p038T0.C0286k;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0297g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p084q0.DialogInterfaceOnClickListenerC0802b;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.AbstractC1140w;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0881Y0 implements InterfaceC0551a {

    /* JADX INFO: renamed from: o */
    public static final String[] f3027o = {"com.tencent.mm.plugin.sns.ui.jo"};

    /* JADX INFO: renamed from: p */
    public static final String[] f3028p;

    /* JADX INFO: renamed from: q */
    public static final Set f3029q;

    /* JADX INFO: renamed from: r */
    public static final String[] f3030r;

    /* JADX INFO: renamed from: s */
    public static final String[] f3031s;

    /* JADX INFO: renamed from: t */
    public static final Set f3032t;

    /* JADX INFO: renamed from: u */
    public static final String[] f3033u;

    /* JADX INFO: renamed from: v */
    public static final Set f3034v;

    /* JADX INFO: renamed from: w */
    public static final C0297g[] f3035w;

    /* JADX INFO: renamed from: x */
    public static final C0297g[] f3036x;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f3037a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f3038b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f3039c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f3040d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f3041e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f3042f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f3043g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public final Map f3044h;

    /* JADX INFO: renamed from: i */
    public final Map f3045i;

    /* JADX INFO: renamed from: j */
    public final ViewOnLongClickListenerC0862O0 f3046j;

    /* JADX INFO: renamed from: k */
    public volatile Object f3047k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f3048l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f3049m;

    /* JADX INFO: renamed from: n */
    public volatile C0022W f3050n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0135w.m302a0("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        f3028p = new String[]{"login_weixin_username", "last_login_alias"};
        f3029q = AbstractC0120h.m263k0(new String[]{"notifyDataSetChanged", "notifyItemInserted", "notifyItemRangeInserted"});
        f3030r = new String[]{"Username", "UserName", "userName", "username", "field_userName", "field_username"};
        f3031s = new String[]{"field_userName", "field_snsId", "field_createTime", "field_content", "LikeUserList", "CommentUserList"};
        f3032t = AbstractC0120h.m263k0(new String[]{"赞", "评论", "删除", "详情", "全文", "收起", "设为私密", "设为公开", "取消", "确定"});
        f3033u = new String[]{"content", "desc", "text", "title", "summary"};
        f3034v = AbstractC0120h.m263k0(new String[]{"刚刚", "今天", "昨天", "前天"});
        f3035w = new C0297g[]{new C0297g("\\d+\\s*秒前"), new C0297g("\\d+\\s*分钟前"), new C0297g("\\d+\\s*小时前"), new C0297g("\\d+\\s*天前"), new C0297g("\\d{1,2}:\\d{2}"), new C0297g("\\d{1,2}月\\d{1,2}日"), new C0297g("\\d{4}年\\d{1,2}月\\d{1,2}日"), new C0297g("\\d{4}-\\d{1,2}-\\d{1,2}")};
        f3036x = new C0297g[]{new C0297g("\\d+"), new C0297g("[0-9a-fA-F]{8,}"), new C0297g("sns:\\d+"), new C0297g("local:\\d+"), new C0297g("localStr:.+")};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0881Y0() {
        Collections.synchronizedMap(new WeakHashMap());
        Collections.synchronizedMap(new WeakHashMap());
        this.f3044h = Collections.synchronizedMap(new WeakHashMap());
        this.f3045i = Collections.synchronizedMap(new WeakHashMap());
        this.f3046j = new ViewOnLongClickListenerC0862O0(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m1768D(String str) {
        boolean z2 = false;
        if (str.length() >= 2 && str.length() <= 300 && !f3032t.contains(str)) {
            C0297g[] c0297gArr = f3036x;
            int length = c0297gArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            char cCharAt = str.charAt(i3);
                            if (19968 <= cCharAt && cCharAt < 40960) {
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= str.length()) {
                                    for (int i5 = 0; i5 < str.length(); i5++) {
                                        if (!AbstractC0299i.m512j0("，。！？、,.!?", str.charAt(i5))) {
                                        }
                                    }
                                } else {
                                    if (Character.isLetter(str.charAt(i4))) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                    }
                    String string = AbstractC0299i.m507C0(str).toString();
                    if (f3034v.contains(string)) {
                        z2 = true;
                        break;
                    }
                    for (C0297g c0297g : f3035w) {
                        if (c0297g.m504d(string)) {
                            z2 = true;
                            break;
                        }
                    }
                    return !z2;
                }
                if (c0297gArr[i2].m504d(str)) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m1769E(Class cls, Class cls2) {
        if (cls.getName().equals("com.tencent.mm.plugin.sns.ui.improve.component.g2") || cls2.isAssignableFrom(cls)) {
            return true;
        }
        while (cls != null) {
            if (cls.getName().equals("com.tencent.mm.view.recyclerview.WxRecyclerAdapter")) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static String m1770F(String str) {
        Pattern patternCompile = Pattern.compile("\\s+");
        AbstractC0223g.m417d(patternCompile, "compile(...)");
        AbstractC0223g.m418e(str, "input");
        String strReplaceAll = patternCompile.matcher(str).replaceAll(" ");
        AbstractC0223g.m417d(strReplaceAll, "replaceAll(...)");
        return AbstractC0299i.m506B0(160, AbstractC0299i.m507C0(strReplaceAll).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static String m1771H(LinkedHashSet linkedHashSet) {
        Object obj;
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(linkedHashSet));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(m1770F((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (m1768D((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int iM1773L = m1773L((String) next);
                do {
                    Object next2 = it2.next();
                    int iM1773L2 = m1773L((String) next2);
                    if (iM1773L < iM1773L2) {
                        next = next2;
                        iM1773L = iM1773L2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static Field m1772K(Object obj, Class cls, Class cls2) {
        Field fieldM1784n;
        if (cls2 != null && cls2.isInstance(obj) && (fieldM1784n = m1784n(obj.getClass(), "UserName")) != null) {
            fieldM1784n.setAccessible(true);
            return fieldM1784n;
        }
        String[] strArr = f3030r;
        if (cls != null && cls.isInstance(obj)) {
            for (String str : strArr) {
                Field fieldM1784n2 = m1784n(obj.getClass(), str);
                if (fieldM1784n2 != null) {
                    fieldM1784n2.setAccessible(true);
                    return fieldM1784n2;
                }
            }
        }
        if (!m1788w(obj, f3031s) && !AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
            return null;
        }
        for (String str2 : strArr) {
            Field fieldM1784n3 = m1784n(obj.getClass(), str2);
            if (fieldM1784n3 != null) {
                fieldM1784n3.setAccessible(true);
                return fieldM1784n3;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static int m1773L(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) > 127) {
                i2++;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            if (AbstractC0299i.m512j0("，。！？、,.!?", str.charAt(i5))) {
                i4++;
            }
        }
        return (i4 * 3) + (i2 * 2) + str.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static String m1774N(Class cls) {
        return cls.isArray() ? AbstractC0307q.m536f0(cls.getName(), '.', '/') : cls.equals(Void.TYPE) ? "V" : cls.equals(Boolean.TYPE) ? "Z" : cls.equals(Byte.TYPE) ? "B" : cls.equals(Character.TYPE) ? "C" : cls.equals(Short.TYPE) ? "S" : cls.equals(Integer.TYPE) ? "I" : cls.equals(Long.TYPE) ? "J" : cls.equals(Float.TYPE) ? "F" : cls.equals(Double.TYPE) ? "D" : AbstractC0174d.m353i("L", AbstractC0307q.m536f0(cls.getName(), '.', '/'), ";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[PHI: r0
  0x0064: PHI (r0v8 android.app.Activity) = (r0v7 android.app.Activity), (r0v26 android.app.Activity) binds: [B:7:0x004f, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0864P0 m1775a(C0881Y0 c0881y0, XC_MethodHook.MethodHookParam methodHookParam, Class cls, Class cls2) throws IllegalAccessException, InvocationTargetException {
        Object c0104d;
        c0881y0.getClass();
        Object obj = methodHookParam.thisObject;
        Object[] objArr = methodHookParam.args;
        AbstractC0223g.m417d(objArr, "args");
        C0169h c0169h = new C0169h(AbstractC0120h.m253a0(objArr), new C0863P(23));
        C0286k c0286k = C0286k.f658c;
        C0280e c0280e = new C0280e(new C0281f(new C0169h(new C0281f(c0169h, false, c0286k), new C0879X0(c0881y0, C0881Y0.class, "findActivity", "findActivity(Landroid/content/Context;)Landroid/app/Activity;", 0)), false, c0286k));
        Activity activityM1800m = (Activity) (!c0280e.hasNext() ? null : c0280e.next());
        if (activityM1800m == null) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            AbstractC0223g.m415b(setNewSetFromMap);
            activityM1800m = c0881y0.m1800m(obj, 0, setNewSetFromMap);
            if (activityM1800m != null) {
                Activity activity = activityM1800m;
                if (c0881y0.m1792C(activity)) {
                    Window window = activity.getWindow();
                    ListView listViewM1785p = m1785p(window != null ? window.getDecorView() : null);
                    View childAt = listViewM1785p != null ? listViewM1785p.getChildAt(0) : null;
                    ListAdapter adapter = listViewM1785p != null ? listViewM1785p.getAdapter() : null;
                    ArrayList arrayList = new ArrayList();
                    Object objM1794I = c0881y0.m1794I(activity, cls);
                    if (objM1794I != null) {
                        arrayList.add(objM1794I);
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr2, "args");
                    for (Object obj2 : objArr2) {
                        if (obj2 != null && !(obj2 instanceof ContextMenu) && !(obj2 instanceof MenuItem) && !(obj2 instanceof View)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (adapter != null) {
                        try {
                            c0104d = adapter.getItem(listViewM1785p.getFirstVisiblePosition());
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Object obj3 = c0104d instanceof C0104d ? null : c0104d;
                        if (obj3 != null) {
                            arrayList.add(obj3);
                        }
                    }
                    C0864P0 c0864p0M1795J = c0881y0.m1795J(activity, adapter, childAt, arrayList, cls, cls2);
                    return c0864p0M1795J == null ? (C0864P0) c0881y0.f3045i.get(activity) : c0864p0M1795J;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m1776b(C0881Y0 c0881y0, Activity activity, Class cls, Class cls2) {
        Window window;
        View decorView;
        if (!c0881y0.m1792C(activity) || activity.isFinishing() || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC0093a(c0881y0, activity, cls, cls2, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1777d(Object obj, int i2, LinkedHashSet linkedHashSet) {
        if (obj != null && i2 <= 3 && linkedHashSet.size() < 20) {
            if (obj instanceof CharSequence) {
                String string = AbstractC0299i.m507C0(obj.toString()).toString();
                if (m1768D(string)) {
                    linkedHashSet.add(string);
                    return;
                }
                return;
            }
            String name = obj.getClass().getName();
            if (AbstractC0307q.m538h0(name, false, "java.") || AbstractC0307q.m538h0(name, false, "android.")) {
                return;
            }
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 instanceof CharSequence) {
                        String string2 = AbstractC0299i.m507C0(obj2.toString()).toString();
                        String name2 = field.getName();
                        AbstractC0223g.m417d(name2, "getName(...)");
                        if (m1768D(string2)) {
                            String lowerCase = name2.toLowerCase(Locale.ROOT);
                            AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                            String[] strArr = f3033u;
                            int length = strArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= string2.length()) {
                                            break;
                                        }
                                        if (string2.charAt(i4) > 127) {
                                            if (!AbstractC0307q.m538h0(string2, false, "com.tencent.")) {
                                                break;
                                            }
                                        } else {
                                            i4++;
                                        }
                                    }
                                } else if (AbstractC0299i.m511i0(lowerCase, strArr[i3], false)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            linkedHashSet.add(string2);
                        }
                    } else if (obj2 != null) {
                        m1777d(obj2, 1 + i2, linkedHashSet);
                    }
                } catch (Throwable unused) {
                }
                if (linkedHashSet.size() >= 20) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m1778e(int i2, View view, ArrayList arrayList) {
        String name = view.getClass().getName();
        if (view.getVisibility() == 0 && view.isEnabled() && (i2 == 0 || view.isLongClickable() || (view instanceof TextView) || AbstractC0299i.m511i0(name, "VideoSightView", false) || name.endsWith("ImageView"))) {
            arrayList.add(view);
        }
        if (!(view instanceof ViewGroup) || i2 >= 7 || arrayList.size() >= 16) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            m1778e(i2 + 1, childAt, arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m1779f(int i2, View view, ArrayList arrayList) {
        if ((view instanceof ListView) && ((ListView) view).getVisibility() == 0) {
            arrayList.add(view);
        }
        if (!(view instanceof ViewGroup) || i2 >= 12) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            m1779f(i2 + 1, childAt, arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m1780g(View view, LinkedHashSet linkedHashSet) {
        String string;
        String string2;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            String string3 = null;
            String string4 = (text == null || (string2 = text.toString()) == null) ? null : AbstractC0299i.m507C0(string2).toString();
            if (string4 == null) {
                string4 = "";
            }
            if (m1768D(string4)) {
                linkedHashSet.add(string4);
            }
            CharSequence contentDescription = textView.getContentDescription();
            if (contentDescription != null && (string = contentDescription.toString()) != null) {
                string3 = AbstractC0299i.m507C0(string).toString();
            }
            String str = string3 != null ? string3 : "";
            if (m1768D(str)) {
                linkedHashSet.add(str);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1780g(childAt, linkedHashSet);
                if (linkedHashSet.size() >= 20) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1781h(View view, Object obj) {
        String strM1771H;
        String strM1771H2;
        if (obj == null) {
            strM1771H = "";
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m1777d(obj, 0, linkedHashSet);
            strM1771H = m1771H(linkedHashSet);
        }
        if (!AbstractC0307q.m534d0(strM1771H)) {
            return m1770F(strM1771H);
        }
        if (view == null) {
            strM1771H2 = "";
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m1780g(view, linkedHashSet2);
            strM1771H2 = m1771H(linkedHashSet2);
        }
        return !AbstractC0307q.m534d0(strM1771H2) ? m1770F(strM1771H2) : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m1782j(Object obj, LinkedHashSet linkedHashSet, Class cls) {
        if (cls == null || cls.isInstance(obj)) {
            String str = (String) m1786r(obj, "UserName");
            String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
            if (string != null && !AbstractC0307q.m534d0(string) && linkedHashSet.contains(string)) {
                return string;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Activity m1783l(Context context) {
        for (int i2 = 0; i2 < 12; i2++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Field m1784n(Class cls, String str) {
        while (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static ListView m1785p(View view) {
        Object next = null;
        if (view == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m1779f(0, view, arrayList);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                ListView listView = (ListView) next;
                int width = listView.getWidth() + (listView.getHeight() * 1000) + (listView.getChildCount() * 1000000);
                do {
                    Object next2 = it.next();
                    ListView listView2 = (ListView) next2;
                    int width2 = listView2.getWidth() + (listView2.getHeight() * 1000) + (listView2.getChildCount() * 1000000);
                    if (width < width2) {
                        next = next2;
                        width = width2;
                    }
                } while (it.hasNext());
            }
        }
        return (ListView) next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Object m1786r(Object obj, String str) {
        Object c0104d;
        try {
            Field fieldM1784n = m1784n(obj.getClass(), str);
            if (fieldM1784n == null) {
                return null;
            }
            fieldM1784n.setAccessible(true);
            c0104d = fieldM1784n.get(obj);
            if (c0104d == null) {
                c0104d = null;
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static LinkedHashSet m1787t(Context context) {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = AbstractC1126i.f3786a;
        String strM2437m = C1124g.m2437m();
        if (!((strM2437m == null || AbstractC0307q.m534d0(strM2437m) || strM2437m.equals("null") || strM2437m.equals("0")) ? false : true)) {
            strM2437m = null;
        }
        if (strM2437m != null) {
            linkedHashSet.add(strM2437m);
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.tencent.mm_preferences", 0);
            for (String str : f3028p) {
                String string2 = sharedPreferences.getString(str, null);
                if (string2 != null && (string = AbstractC0299i.m507C0(string2).toString()) != null) {
                    if (!((AbstractC0307q.m534d0(string) || string.equals("null") || string.equals("0")) ? false : true)) {
                        string = null;
                    }
                    if (string != null) {
                        linkedHashSet.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m1788w(Object obj, String[] strArr) {
        for (String str : strArr) {
            if (m1784n(obj.getClass(), str) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m1789z(Activity activity) {
        String stringExtra;
        if (!activity.getClass().getName().equals("com.tencent.mm.plugin.sns.ui.SnsUserUI")) {
            return false;
        }
        Intent intent = activity.getIntent();
        String string = (intent == null || (stringExtra = intent.getStringExtra("sns_userName")) == null) ? null : AbstractC0299i.m507C0(stringExtra).toString();
        if (string == null) {
            string = "";
        }
        if (AbstractC0307q.m534d0(string)) {
            return false;
        }
        return m1787t(activity).contains(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m1790A(Class cls) {
        C0022W c0022w = this.f3050n;
        List list = c0022w != null ? c0022w.f166d : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        if (AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list, f3027o))).contains(cls.getName())) {
            return true;
        }
        if (BaseAdapter.class.isAssignableFrom(cls) && AbstractC0307q.m538h0(cls.getName(), false, "com.tencent.mm.plugin.sns.")) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Method method = declaredMethods[i2];
                if (AbstractC0223g.m414a(method.getName(), "getCount")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        Method[] declaredMethods2 = cls.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
                        for (Method method2 : declaredMethods2) {
                            if (AbstractC0223g.m414a(method2.getName(), "getView") && method2.getParameterTypes().length == 3 && AbstractC0223g.m414a(method2.getParameterTypes()[0], Integer.TYPE)) {
                                return true;
                            }
                        }
                    }
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m1791B(Object obj) {
        if (m1790A(obj.getClass())) {
            return true;
        }
        if ((obj instanceof BaseAdapter) && AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
            Method[] declaredMethods = obj.getClass().getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (AbstractC0223g.m414a(method.getName(), "getView") && method.getParameterTypes().length == 3 && AbstractC0223g.m414a(method.getParameterTypes()[0], Integer.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final boolean m1792C(Activity activity) {
        List listM1804u = m1804u();
        for (Class<?> superclass = activity.getClass(); superclass != null && !superclass.equals(Activity.class); superclass = superclass.getSuperclass()) {
            if (listM1804u.contains(superclass.getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m1793G(Object obj) {
        Object c0104d;
        if (obj == null) {
            return;
        }
        try {
            this.f3048l = true;
            try {
                c0104d = obj.getClass().getMethod("notifyDataSetChanged", null).invoke(obj, null);
                this.f3048l = false;
            } catch (Throwable th) {
                this.f3048l = false;
                throw th;
            }
        } catch (Throwable th2) {
            c0104d = new C0104d(th2);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            this.f3048l = false;
            AbstractC0731a.m1387d("hide self sns posts notifyDataSetChanged fail", thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final Object m1794I(Activity activity, Class cls) {
        Object c0104d;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f3043g;
            Class<?> cls2 = activity.getClass();
            Object obj = concurrentHashMap.get(cls2);
            Object obj2 = obj;
            if (obj == null) {
                Method[] methods = activity.getClass().getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                ArrayList arrayList = new ArrayList();
                for (Method method : methods) {
                    if (cls.isAssignableFrom(method.getReturnType())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 || Arrays.equals(method.getParameterTypes(), new Class[]{Boolean.TYPE})) {
                            arrayList.add(method);
                        }
                    }
                }
                List listM276r0 = AbstractC0123k.m276r0(arrayList, new C0877W0());
                Iterator it = listM276r0.iterator();
                while (it.hasNext()) {
                    ((Method) it.next()).setAccessible(true);
                }
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls2, listM276r0);
                obj2 = listM276r0;
                if (objPutIfAbsent != null) {
                    obj2 = objPutIfAbsent;
                }
            }
            for (Method method2 : (List) obj2) {
                try {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                    c0104d = parameterTypes2.length == 0 ? method2.invoke(activity, null) : method2.invoke(activity, Boolean.FALSE);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d != null && cls.isInstance(c0104d)) {
                    return c0104d;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final C0864P0 m1795J(Activity activity, ListAdapter listAdapter, View view, ArrayList arrayList, Class cls, Class cls2) throws IllegalAccessException, InvocationTargetException {
        LinkedHashSet linkedHashSetM1787t = m1787t(activity);
        if (!linkedHashSetM1787t.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(Integer.valueOf(System.identityHashCode(obj)))) {
                    arrayList2.add(obj);
                }
            }
            boolean z2 = false;
            for (Object obj2 : arrayList2) {
                String strM1802q = m1802q(obj2, linkedHashSetM1787t, cls, cls2);
                ConcurrentHashMap concurrentHashMap = AbstractC1140w.f3846a;
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                AbstractC1140w.m2508b(obj2, cls, cls2, 0, linkedHashSet3);
                if (strM1802q != null) {
                    if (!linkedHashSet3.isEmpty()) {
                        return new C0864P0(activity, listAdapter, linkedHashSet3, m1781h(view, obj2), view);
                    }
                    z2 = true;
                }
                linkedHashSet2.addAll(linkedHashSet3);
                linkedHashSet = linkedHashSet2;
            }
            LinkedHashSet linkedHashSet4 = linkedHashSet;
            if (z2 && !linkedHashSet4.isEmpty()) {
                return new C0864P0(activity, listAdapter, linkedHashSet4, m1781h(view, arrayList.isEmpty() ? null : arrayList.get(0)), view);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m1796M(C0864P0 c0864p0) {
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2417H() || !C1124g.m2410A()) {
            return;
        }
        Activity activity = c0864p0.f2972a;
        if (m1792C(activity)) {
            AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle("隐藏此条朋友圈");
            String str = c0864p0.f2975d;
            title.setMessage(AbstractC0307q.m534d0(str) ? "确定隐藏这条朋友圈内容？" : "确定隐藏这条朋友圈内容？\n\n".concat(str)).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0802b(this, c0864p0, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final List m1797c(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f3037a;
        Object obj = concurrentHashMap.get(cls);
        Object obj2 = obj;
        if (obj == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    arrayList.add(field);
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj2 = arrayList;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (List) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0462  */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Class cls;
        String str;
        Iterator it;
        String str2;
        int iM2494p;
        C0881Y0 c0881y0 = this;
        int i2 = 0;
        int i3 = 1;
        c0881y0.f3050n = AbstractC0039l.m75m(context);
        ConcurrentHashMap concurrentHashMap = AbstractC1140w.f3846a;
        AbstractC1140w.f3852g = c0881y0.f3050n;
        boolean z2 = AbstractC1126i.f3786a;
        String strM355k = AbstractC0174d.m355k("enabled=", C1124g.m2410A());
        C0022W c0022w = c0881y0.f3050n;
        String strM351g = AbstractC0174d.m351g(c0022w != null ? c0022w.f178p.size() : 0, "create=");
        C0022W c0022w2 = c0881y0.f3050n;
        AbstractC0731a.m1387d("self sns detail hook init", strM355k, strM351g, AbstractC0174d.m351g(c0022w2 != null ? c0022w2.f179q.size() : 0, "select="));
        if ((AbstractC1135r.m2494p() > 3120 || (iM2494p = AbstractC1135r.m2494p()) == 3060 || iM2494p == 3080 || iM2494p == 3100 || iM2494p == 3120 || c0881y0.f3050n != null) && AbstractC0223g.m414a(loadPackageParam.packageName, loadPackageParam.processName)) {
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.plugin.sns.storage.SnsInfo");
            Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.protocal.protobuf.TimeLineObject");
            Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            if (clsMo1021l3 != null && !MainHook.uniqueMetaStore.contains("hide-self-sns-user-activity")) {
                Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "onResume", new Object[0]);
                if (methodMo1011b != null) {
                    AbstractC0514f.m1027d(methodMo1011b, new C0867R0(c0881y0, i3));
                }
                Iterator it2 = AbstractC0120h.m252Z(new String[]{"onPause", "onDestroy"}).iterator();
                while (it2.hasNext()) {
                    Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, (String) it2.next(), new Object[0]);
                    if (methodMo1011b2 != null) {
                        AbstractC0514f.m1027d(methodMo1011b2, new C0867R0(c0881y0, 2));
                    }
                }
                MainHook.uniqueMetaStore.add("hide-self-sns-user-activity");
            }
            C0022W c0022w3 = c0881y0.f3050n;
            List list = c0022w3 != null ? c0022w3.f166d : null;
            List list2 = C0131s.f426a;
            if (list == null) {
                list = list2;
            }
            Iterator it3 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list, f3027o))).iterator();
            while (it3.hasNext()) {
                Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), (String) it3.next());
                if (clsMo1021l4 != null) {
                    c0881y0.m1806x(clsMo1021l4);
                }
            }
            Class clsMo1021l5 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
            if (clsMo1021l5 == null) {
                AbstractC0731a.m1387d("hide self sns posts adapter class missing");
            } else {
                C0022W c0022w4 = c0881y0.f3050n;
                List list3 = c0022w4 != null ? c0022w4.f163a : null;
                if (list3 == null) {
                    list3 = list2;
                }
                List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list3, AbstractC0120h.m252Z(new String[]{"com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"}))));
                ArrayList arrayList = new ArrayList();
                Iterator it4 = listM281w0.iterator();
                while (it4.hasNext()) {
                    Class clsMo1021l6 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), (String) it4.next());
                    if (clsMo1021l6 != null) {
                        arrayList.add(clsMo1021l6);
                    }
                }
                Iterator it5 = arrayList.iterator();
                while (true) {
                    String str3 = "-";
                    if (!it5.hasNext()) {
                        break;
                    }
                    Class cls2 = (Class) it5.next();
                    Method[] declaredMethods = cls2.getDeclaredMethods();
                    String str4 = "getDeclaredMethods(...)";
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    ArrayList arrayList2 = new ArrayList();
                    int length = declaredMethods.length;
                    while (i2 < length) {
                        int i4 = i3;
                        Method method = declaredMethods[i2];
                        Method[] methodArr = declaredMethods;
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            Class<?> returnType = method.getReturnType();
                            AbstractC0223g.m417d(returnType, "getReturnType(...)");
                            if (m1769E(returnType, clsMo1021l5)) {
                                arrayList2.add(method);
                            }
                        }
                        i2++;
                        i3 = i4;
                        declaredMethods = methodArr;
                    }
                    int i5 = i3;
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Method method2 = (Method) it6.next();
                        String str5 = "hide-self-sns-posts-adapter-provider-" + method2.getDeclaringClass().getName() + str3 + method2.getName();
                        if (MainHook.uniqueMetaStore.contains(str5)) {
                            str = str3;
                            it = it6;
                            str2 = str4;
                        } else {
                            method2.setAccessible(i5);
                            str = str3;
                            it = it6;
                            str2 = str4;
                            AbstractC0514f.m1027d(method2, new C0873U0(this, context, clsMo1021l, clsMo1021l2, 0));
                            MainHook.uniqueMetaStore.add(str5);
                        }
                        str4 = str2;
                        str3 = str;
                        it6 = it;
                        i5 = 1;
                    }
                    String str6 = str3;
                    String str7 = str4;
                    int i6 = -1;
                    if (AbstractC1135r.f3833e == -1) {
                        try {
                            i6 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                        } catch (Exception e2) {
                            AbstractC0731a.m1385b(e2);
                        }
                        AbstractC1135r.f3833e = i6;
                    }
                    if (AbstractC1135r.f3833e != 3060) {
                        Method[] declaredMethods2 = cls2.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods2, str7);
                        ArrayList arrayList3 = new ArrayList();
                        int length2 = declaredMethods2.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            Method method3 = declaredMethods2[i7];
                            int i8 = length2;
                            if (method3.getParameterTypes().length == 1 && method3.getParameterTypes()[0].getName().equals("android.os.Bundle") && AbstractC0223g.m414a(method3.getName(), "onCreate")) {
                                arrayList3.add(method3);
                            }
                            i7++;
                            length2 = i8;
                        }
                        Method[] declaredMethods3 = cls2.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods3, str7);
                        ArrayList arrayList4 = new ArrayList();
                        for (Method method4 : declaredMethods3) {
                            Class<?>[] parameterTypes2 = method4.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                            if (parameterTypes2.length == 0 && AbstractC0223g.m414a(method4.getName(), "onResume")) {
                                arrayList4.add(method4);
                            }
                        }
                        for (Method method5 : AbstractC0123k.m273o0(arrayList3, arrayList4)) {
                            String str8 = "hide-self-sns-posts-lifecycle-capture-" + method5.getDeclaringClass().getName() + str6 + method5.getName();
                            if (MainHook.uniqueMetaStore.contains(str8)) {
                                cls = clsMo1021l5;
                            } else {
                                method5.setAccessible(true);
                                Class cls3 = clsMo1021l2;
                                cls = clsMo1021l5;
                                Class cls4 = clsMo1021l;
                                C0875V0 c0875v0 = new C0875V0(this, cls, context, cls4, cls3);
                                clsMo1021l = cls4;
                                clsMo1021l2 = cls3;
                                AbstractC0514f.m1027d(method5, c0875v0);
                                MainHook.uniqueMetaStore.add(str8);
                            }
                            clsMo1021l5 = cls;
                        }
                    }
                    clsMo1021l5 = clsMo1021l5;
                    i2 = 0;
                    i3 = 1;
                }
                Method[] methods = clsMo1021l5.getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                ArrayList<Method> arrayList5 = new ArrayList();
                for (Method method6 : methods) {
                    if (f3029q.contains(method6.getName())) {
                        arrayList5.add(method6);
                    }
                }
                for (Method method7 : arrayList5) {
                    String name = method7.getDeclaringClass().getName();
                    String name2 = method7.getName();
                    Class<?>[] parameterTypes3 = method7.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes3, "getParameterTypes(...)");
                    String str9 = "hide-self-sns-posts-" + name + "-" + name2 + "-" + AbstractC0120h.m260h0(parameterTypes3, "#", new C0863P(22), 30);
                    if (!MainHook.uniqueMetaStore.contains(str9)) {
                        method7.setAccessible(true);
                        AbstractC0514f.m1027d(method7, new C0873U0(this, context, clsMo1021l, clsMo1021l2, 1));
                        MainHook.uniqueMetaStore.add(str9);
                    }
                }
                c0881y0 = this;
            }
            Iterator it7 = c0881y0.m1804u().iterator();
            while (it7.hasNext()) {
                Class clsMo1021l7 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), (String) it7.next());
                if (clsMo1021l7 != null) {
                    Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(clsMo1021l7, "onResume", new Object[0]);
                    if (methodMo1011b3 != null) {
                        if (MainHook.uniqueMetaStore.add("hide-self-sns-detail-resume-".concat(clsMo1021l7.getName()))) {
                            AbstractC0514f.m1027d(methodMo1011b3, new C0871T0(c0881y0, clsMo1021l, clsMo1021l2, 0));
                        }
                    }
                    Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(clsMo1021l7, "onWindowFocusChanged", Boolean.TYPE);
                    if (methodMo1011b4 != null) {
                        if (MainHook.uniqueMetaStore.add("hide-self-sns-detail-focus-".concat(clsMo1021l7.getName()))) {
                            AbstractC0514f.m1027d(methodMo1011b4, new C0871T0(c0881y0, clsMo1021l, clsMo1021l2, 1));
                        }
                        Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(clsMo1021l7, "onDestroy", new Object[0]);
                        if (methodMo1011b5 != null) {
                            if (MainHook.uniqueMetaStore.add("hide-self-sns-detail-destroy-".concat(clsMo1021l7.getName()))) {
                                AbstractC0514f.m1027d(methodMo1011b5, new C0867R0(c0881y0, 3));
                            }
                        }
                    }
                }
            }
            C0022W c0022w5 = c0881y0.f3050n;
            List list4 = c0022w5 != null ? c0022w5.f178p : null;
            if (list4 == null) {
                list4 = list2;
            }
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                Class cls5 = clsMo1021l2;
                Class cls6 = clsMo1021l;
                c0881y0.m1807y(context, (C0023X) it8.next(), true, cls6, cls5);
                clsMo1021l = cls6;
                clsMo1021l2 = cls5;
            }
            C0022W c0022w6 = c0881y0.f3050n;
            List list5 = c0022w6 != null ? c0022w6.f179q : null;
            if (list5 != null) {
                list2 = list5;
            }
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                Class cls7 = clsMo1021l2;
                Class cls8 = clsMo1021l;
                c0881y0.m1807y(context, (C0023X) it9.next(), false, cls8, cls7);
                c0881y0 = this;
                clsMo1021l = cls8;
                clsMo1021l2 = cls7;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m1798i(Object obj, LinkedHashSet linkedHashSet, Class cls, Class cls2) {
        Object c0104d;
        Object c0104d2;
        Iterable<Method> iterable;
        Object c0104d3;
        String strM1782j;
        if (cls == null || cls.isInstance(obj)) {
            if (cls != null || AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
                String strM1801o = m1801o(obj, linkedHashSet);
                if (strM1801o != null) {
                    return strM1801o;
                }
                try {
                    c0104d = obj.getClass().getMethod("getUserName", null);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                Method method = (Method) c0104d;
                if (method != null) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(obj, null);
                        c0104d2 = objInvoke instanceof String ? (String) objInvoke : null;
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = null;
                    }
                    String str = (String) c0104d2;
                    String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                    if (string != null && !AbstractC0307q.m534d0(string) && linkedHashSet.contains(string)) {
                        return string;
                    }
                }
                Class<?> cls3 = obj.getClass();
                if (cls2 == null) {
                    iterable = C0131s.f426a;
                } else {
                    ConcurrentHashMap concurrentHashMap = this.f3042f;
                    Object obj2 = concurrentHashMap.get(cls3);
                    if (obj2 == null) {
                        Method[] declaredMethods = cls3.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                        ArrayList arrayList = new ArrayList();
                        for (Method method2 : declaredMethods) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && AbstractC0223g.m414a(method2.getReturnType(), cls2)) {
                                arrayList.add(method2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Method) it.next()).setAccessible(true);
                        }
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls3, arrayList);
                        obj2 = objPutIfAbsent == null ? arrayList : objPutIfAbsent;
                    }
                    iterable = (List) obj2;
                }
                for (Method method3 : iterable) {
                    try {
                        method3.setAccessible(true);
                        c0104d3 = method3.invoke(obj, null);
                    } catch (Throwable th3) {
                        c0104d3 = new C0104d(th3);
                    }
                    if (c0104d3 instanceof C0104d) {
                        c0104d3 = null;
                    }
                    if (c0104d3 != null && (strM1782j = m1782j(c0104d3, linkedHashSet, cls2)) != null) {
                        return strM1782j;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m1799k(Context context, Object obj, Class cls, Class cls2) {
        List list;
        String strM1802q;
        if (obj != null && (obj == this.f3047k || obj.getClass().getName().equals("com.tencent.mm.plugin.sns.ui.improve.component.g2"))) {
            boolean z2 = AbstractC1126i.f3786a;
            if (C1124g.m2410A()) {
                LinkedHashSet linkedHashSetM1787t = m1787t(context);
                if (!linkedHashSetM1787t.isEmpty() && (list = (List) m1786r(obj, "data")) != null) {
                    int i2 = 0;
                    for (int size = list.size() - 1; -1 < size; size--) {
                        Object objM269k0 = AbstractC0123k.m269k0(list, size);
                        if (objM269k0 != null && (strM1802q = m1802q(objM269k0, linkedHashSetM1787t, cls, cls2)) != null && linkedHashSetM1787t.contains(strM1802q)) {
                            ConcurrentHashMap concurrentHashMap = AbstractC1140w.f3846a;
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            AbstractC1140w.m2508b(objM269k0, cls, cls2, 0, linkedHashSet);
                            if (!linkedHashSet.isEmpty()) {
                                boolean z3 = AbstractC1126i.f3786a;
                                if (C1124g.m2428d(linkedHashSet)) {
                                    list.remove(size);
                                    i2++;
                                }
                            }
                        }
                    }
                    if (i2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Activity m1800m(Object obj, int i2, Set set) {
        Object c0104d;
        Activity activityM1800m;
        if (obj != null && set.add(obj)) {
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            if (obj instanceof View) {
                return m1783l(((View) obj).getContext());
            }
            if (obj instanceof Context) {
                return m1783l((Context) obj);
            }
            if (i2 < 2 && !AbstractC0174d.m360p(obj, "java.", false) && !AbstractC0174d.m360p(obj, "android.", false)) {
                Iterator it = AbstractC0123k.m277s0(m1797c(obj.getClass()), 32).iterator();
                while (it.hasNext()) {
                    try {
                        c0104d = ((Field) it.next()).get(obj);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    if (c0104d != null && (activityM1800m = m1800m(c0104d, i2 + 1, set)) != null) {
                        return activityM1800m;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final String m1801o(Object obj, LinkedHashSet linkedHashSet) {
        Object c0104d;
        String[] strArr = f3030r;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                for (Field field : m1797c(obj.getClass())) {
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
                    String str = (String) c0104d;
                    String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                    if (string != null && !AbstractC0307q.m534d0(string) && linkedHashSet.contains(string)) {
                        return string;
                    }
                }
                return null;
            }
            String str2 = (String) m1786r(obj, strArr[i2]);
            String string2 = str2 != null ? AbstractC0299i.m507C0(str2).toString() : null;
            if (string2 != null && !AbstractC0307q.m534d0(string2) && linkedHashSet.contains(string2)) {
                return string2;
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00b2 A[EXC_TOP_SPLITTER, PHI: r0
  0x00b2: PHI (r0v4 r0.Q0) = (r0v3 r0.Q0), (r0v130 r0.Q0) binds: [B:6:0x001e, B:46:0x00ae] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1802q(Object obj, LinkedHashSet linkedHashSet, Class cls, Class cls2) throws IllegalAccessException, InvocationTargetException {
        Object c0104d;
        String str;
        Object objInvoke;
        String strM1782j;
        Object c0104d2;
        String strM1801o;
        Object c0104d3;
        Object c0104d4;
        Object c0104d5;
        Object c0104d6;
        Object c0104d7;
        C0866Q0 c0866q0;
        Object c0104d8;
        Field fieldM1772K;
        Object c0104d9;
        Field fieldM1772K2;
        String strM2515i = AbstractC1140w.m2515i(obj, linkedHashSet, cls, cls2);
        if (strM2515i != null) {
            return strM2515i;
        }
        ConcurrentHashMap concurrentHashMap = this.f3041e;
        C0866Q0 c0866q02 = (C0866Q0) concurrentHashMap.get(obj.getClass());
        if (c0866q02 != null) {
            try {
                Method method = c0866q02.f2982a;
                if (method != null) {
                    objInvoke = method.invoke(obj, null);
                } else {
                    Field field = c0866q02.f2983b;
                    objInvoke = field != null ? field.get(obj) : obj;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (objInvoke == null) {
                c0104d = null;
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                str = (String) c0104d;
            } else {
                Object obj2 = c0866q02.f2984c.get(objInvoke);
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null) {
                    c0104d = AbstractC0299i.m507C0(str2).toString();
                }
                if (c0104d instanceof C0104d) {
                }
                str = (String) c0104d;
            }
        } else {
            Field fieldM1772K3 = m1772K(obj, cls, cls2);
            if (fieldM1772K3 == null) {
                Iterator it = m1805v(obj.getClass()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Method method2 = (Method) it.next();
                        try {
                            c0104d9 = method2.invoke(obj, null);
                        } catch (Throwable th2) {
                            c0104d9 = new C0104d(th2);
                        }
                        if (c0104d9 instanceof C0104d) {
                            c0104d9 = null;
                        }
                        if (c0104d9 != null && (fieldM1772K2 = m1772K(c0104d9, cls, cls2)) != null) {
                            c0866q0 = new C0866Q0(method2, null, fieldM1772K2);
                            break;
                        }
                    } else {
                        Iterator it2 = m1797c(obj.getClass()).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                c0866q0 = null;
                                break;
                            }
                            Field field2 = (Field) it2.next();
                            try {
                                c0104d8 = field2.get(obj);
                            } catch (Throwable th3) {
                                c0104d8 = new C0104d(th3);
                            }
                            if (c0104d8 instanceof C0104d) {
                                c0104d8 = null;
                            }
                            if (c0104d8 != null && (fieldM1772K = m1772K(c0104d8, cls, cls2)) != null) {
                                c0866q0 = new C0866Q0(null, field2, fieldM1772K);
                                break;
                            }
                        }
                    }
                }
            } else {
                c0866q0 = new C0866Q0(null, null, fieldM1772K3);
            }
            if (c0866q0 != null) {
                concurrentHashMap.put(obj.getClass(), c0866q0);
                c0866q02 = c0866q0;
            } else {
                c0866q02 = null;
            }
            if (c0866q02 == null) {
                str = null;
            }
        }
        if (str != null && !AbstractC0307q.m534d0(str)) {
            if (linkedHashSet.contains(str)) {
                return str;
            }
            return null;
        }
        boolean z2 = false;
        if (AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
            String strM1801o2 = m1801o(obj, linkedHashSet);
            if (strM1801o2 != null) {
                return strM1801o2;
            }
            String strM1782j2 = m1782j(obj, linkedHashSet, cls2);
            if (strM1782j2 != null) {
                return strM1782j2;
            }
            String strM1798i = m1798i(obj, linkedHashSet, cls, cls2);
            if (strM1798i != null) {
                return strM1798i;
            }
        }
        ConcurrentHashMap concurrentHashMap2 = this.f3039c;
        Class<?> cls3 = obj.getClass();
        Object objM277s0 = concurrentHashMap2.get(cls3);
        String[] strArr = f3031s;
        if (objM277s0 == null) {
            List listM1805v = m1805v(obj.getClass());
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listM1805v) {
                try {
                    c0104d6 = ((Method) obj3).invoke(obj, null);
                } catch (Throwable th4) {
                    c0104d6 = new C0104d(th4);
                }
                Object obj4 = c0104d6 instanceof C0104d ? null : c0104d6;
                if (obj4 != null) {
                    if ((cls != null && cls.isInstance(obj4)) || ((cls2 != null && cls2.isInstance(obj4)) || AbstractC0174d.m360p(obj4, "com.tencent.mm.plugin.sns.", z2) || m1788w(obj4, strArr))) {
                        arrayList.add(obj3);
                        break;
                        break;
                    }
                    List listM1797c = m1797c(obj4.getClass());
                    if (!listM1797c.isEmpty()) {
                        Iterator it3 = listM1797c.iterator();
                        while (it3.hasNext()) {
                            try {
                                c0104d7 = ((Field) it3.next()).get(obj4);
                            } catch (Throwable th5) {
                                c0104d7 = new C0104d(th5);
                            }
                            if (c0104d7 instanceof C0104d) {
                                c0104d7 = null;
                            }
                            if (c0104d7 != null && ((cls2 != null && cls2.isInstance(c0104d7)) || ((cls != null && cls.isInstance(c0104d7)) || m1788w(c0104d7, strArr)))) {
                                arrayList.add(obj3);
                                break;
                            }
                        }
                    }
                }
                z2 = false;
            }
            objM277s0 = AbstractC0123k.m277s0(arrayList, 2);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(cls3, objM277s0);
            if (objPutIfAbsent != null) {
                objM277s0 = objPutIfAbsent;
            }
        }
        Iterator it4 = ((List) objM277s0).iterator();
        while (true) {
            if (!it4.hasNext()) {
                strM1782j = null;
                break;
            }
            try {
                c0104d4 = ((Method) it4.next()).invoke(obj, null);
            } catch (Throwable th6) {
                c0104d4 = new C0104d(th6);
            }
            Object obj5 = c0104d4 instanceof C0104d ? null : c0104d4;
            if (obj5 != null) {
                strM1782j = m1782j(obj5, linkedHashSet, cls2);
                if (strM1782j == null && (strM1782j = m1798i(obj5, linkedHashSet, cls, cls2)) == null && (!m1788w(obj5, strArr) || (strM1782j = m1801o(obj5, linkedHashSet)) == null)) {
                    Iterator it5 = m1797c(obj5.getClass()).iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            strM1782j = null;
                            break;
                        }
                        Field field3 = (Field) it5.next();
                        try {
                            field3.setAccessible(true);
                            c0104d5 = field3.get(obj5);
                        } catch (Throwable th7) {
                            c0104d5 = new C0104d(th7);
                        }
                        if (c0104d5 instanceof C0104d) {
                            c0104d5 = null;
                        }
                        if (c0104d5 != null) {
                            String strM1782j3 = m1782j(c0104d5, linkedHashSet, cls2);
                            if (strM1782j3 != null) {
                                strM1782j = strM1782j3;
                                break;
                            }
                            if (m1788w(c0104d5, strArr) && (strM1782j = m1801o(c0104d5, linkedHashSet)) != null) {
                                break;
                            }
                        }
                    }
                }
                if (strM1782j != null) {
                    break;
                }
            }
        }
        if (strM1782j != null) {
            return strM1782j;
        }
        Class<?> cls4 = obj.getClass();
        ConcurrentHashMap concurrentHashMap3 = this.f3040d;
        Object obj6 = concurrentHashMap3.get(cls4);
        if (obj6 == null) {
            Method[] declaredMethods = cls4.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Method method3 : declaredMethods) {
                Class<?>[] parameterTypes = method3.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && !method3.getReturnType().isPrimitive() && !AbstractC0223g.m414a(method3.getReturnType(), Void.TYPE) && ((cls2 != null && AbstractC0223g.m414a(method3.getReturnType(), cls2)) || (cls != null && AbstractC0223g.m414a(method3.getReturnType(), cls)))) {
                    arrayList2.add(method3);
                }
            }
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((Method) it6.next()).setAccessible(true);
            }
            Object objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(cls4, arrayList2);
            obj6 = objPutIfAbsent2 == null ? arrayList2 : objPutIfAbsent2;
        }
        for (Method method4 : (List) obj6) {
            try {
                method4.setAccessible(true);
                c0104d3 = method4.invoke(obj, null);
            } catch (Throwable th8) {
                c0104d3 = new C0104d(th8);
            }
            if (c0104d3 instanceof C0104d) {
                c0104d3 = null;
            }
            if (c0104d3 != null) {
                String strM1782j4 = m1782j(c0104d3, linkedHashSet, cls2);
                if (strM1782j4 != null) {
                    return strM1782j4;
                }
                String strM1798i2 = m1798i(c0104d3, linkedHashSet, cls, cls2);
                if (strM1798i2 != null) {
                    return strM1798i2;
                }
                String strM1801o3 = m1801o(c0104d3, linkedHashSet);
                if (strM1801o3 != null) {
                    return strM1801o3;
                }
            }
        }
        for (Field field4 : m1797c(obj.getClass())) {
            try {
                field4.setAccessible(true);
                c0104d2 = field4.get(obj);
            } catch (Throwable th9) {
                c0104d2 = new C0104d(th9);
            }
            if (c0104d2 instanceof C0104d) {
                c0104d2 = null;
            }
            if (c0104d2 != null) {
                String strM1782j5 = m1782j(c0104d2, linkedHashSet, cls2);
                if (strM1782j5 != null) {
                    return strM1782j5;
                }
                String strM1798i3 = m1798i(c0104d2, linkedHashSet, cls, cls2);
                if (strM1798i3 != null) {
                    return strM1798i3;
                }
                if (AbstractC0174d.m360p(c0104d2, "com.tencent.mm.plugin.sns.", false) && (strM1801o = m1801o(c0104d2, linkedHashSet)) != null) {
                    return strM1801o;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final Object m1803s(Activity activity) {
        Object c0104d;
        Method[] declaredMethods = activity.getClass().getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0) {
                Class<?> returnType = method.getReturnType();
                AbstractC0223g.m417d(returnType, "getReturnType(...)");
                if (m1790A(returnType)) {
                    arrayList.add(method);
                }
            }
        }
        for (Method method2 : arrayList) {
            try {
                method2.setAccessible(true);
                return method2.invoke(activity, null);
            } catch (Throwable unused) {
            }
        }
        for (Field field : m1797c(activity.getClass())) {
            try {
                field.setAccessible(true);
                c0104d = field.get(activity);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            if (c0104d != null && m1791B(c0104d)) {
                return c0104d;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final List m1804u() {
        C0022W c0022w = this.f3050n;
        List list = c0022w != null ? c0022w.f165c : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (AbstractC0299i.m511i0((String) obj, "CommentDetail", true)) {
                arrayList.add(obj);
            }
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m272n0(arrayList, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final List m1805v(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f3038b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && !method.getReturnType().isPrimitive() && !AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && !AbstractC0223g.m414a(method.getReturnType(), String.class) && !method.getReturnType().getName().equals("java.lang.Class")) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Method) it.next()).setAccessible(true);
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj = objPutIfAbsent == null ? arrayList : objPutIfAbsent;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m1806x(Class cls) {
        String strConcat = "hide-self-sns-album-adapter-".concat(cls.getName());
        if (MainHook.uniqueMetaStore.contains(strConcat)) {
            return;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (AbstractC0223g.m414a(method.getName(), "getCount")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0) {
                    arrayList.add(method);
                }
            }
        }
        for (Method method2 : arrayList) {
            method2.setAccessible(true);
            AbstractC0514f.m1027d(method2, new C0867R0(this, 0));
        }
        MainHook.uniqueMetaStore.add(strConcat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m1807y(Context context, C0023X c0023x, boolean z2, Class cls, Class cls2) {
        String str;
        String str2;
        C0881Y0 c0881y0;
        Method method;
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), c0023x.f180a);
        String str3 = c0023x.f180a;
        if (clsMo1021l == null) {
            AbstractC0731a.m1387d("self sns menu class missing", str3);
            return;
        }
        Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            str = c0023x.f182c;
            str2 = c0023x.f181b;
            if (i2 >= length) {
                c0881y0 = this;
                method = null;
                break;
            }
            method = declaredMethods[i2];
            if (AbstractC0223g.m414a(method.getName(), str2)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                c0881y0 = this;
                String strM260h0 = AbstractC0120h.m260h0(parameterTypes, "", new C0060d(5, c0881y0), 24);
                Class<?> returnType = method.getReturnType();
                AbstractC0223g.m417d(returnType, "getReturnType(...)");
                if (AbstractC0223g.m414a(strM260h0 + m1774N(returnType), str)) {
                    break;
                }
            }
            i2++;
        }
        if (method == null) {
            AbstractC0731a.m1387d("self sns menu method missing", str3, str2, str);
            return;
        }
        if (MainHook.uniqueMetaStore.add("hide-self-sns-native-menu-" + (z2 ? "create" : "select") + "-" + str3 + "-" + str2 + "-" + str)) {
            method.setAccessible(true);
            AbstractC0731a.m1387d("self sns menu hook installed", z2 ? "create" : "select", method.toString());
            AbstractC0514f.m1027d(method, new C0869S0(z2, c0881y0, cls, cls2, method));
        }
    }
}
