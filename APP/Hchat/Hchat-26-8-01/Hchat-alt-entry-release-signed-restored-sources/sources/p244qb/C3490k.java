package p244qb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import be.AbstractC0283h;
import ca.RunnableC0537x;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import me.yun.silk.AacCodec;
import me.yun.silk.SilkCodec;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p009a9.C0031h;
import p014b.C0126e;
import p015b0.C0153s;
import p024b9.RunnableC0217c;
import p036c9.C0415a0;
import p036c9.C0442h;
import p036c9.C0467n0;
import p036c9.C0493v;
import p036c9.C0505z;
import p036c9.RunnableC0462m;
import p036c9.RunnableC0487t;
import p036c9.RunnableC0496w;
import p036c9.ThreadFactoryC0478q;
import p054dg.AbstractC0793l;
import p054dg.C0795n;
import p062e8.C0828b;
import p065eb.C0884o;
import p068eh.AbstractC0921a;
import p078f9.C1091b;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1624a;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p136j8.AbstractC2094e;
import p136j8.C2105p;
import p136j8.C2114y;
import p144k.C2209s1;
import p153k8.C2355s;
import p167l8.C2527b;
import p183m8.C2813a;
import p183m8.C2815c;
import p198nb.C2924a;
import p210o8.C3087k;
import p211o9.C3092e;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p242q8.C3460o;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3963j;
import p276sf.EnumC3957d;
import p288tb.C4143c;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import p332wb.C5491y2;
import tf.AbstractC4151b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.AbstractC4178y;
import tf.C4173t;

/* JADX INFO: renamed from: qb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3490k {

    /* JADX INFO: renamed from: a */
    public final C3742g f11330a;

    /* JADX INFO: renamed from: b */
    public final C2026t f11331b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f11332c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f11333d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f11334e;

    /* JADX INFO: renamed from: f */
    public final Set f11335f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f11336g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f11337h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f11338i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f11339j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f11340k;

    /* JADX INFO: renamed from: l */
    public final Set f11341l;

    /* JADX INFO: renamed from: m */
    public final Map f11342m;

    /* JADX INFO: renamed from: n */
    public final Map f11343n;

    /* JADX INFO: renamed from: o */
    public final Map f11344o;

    /* JADX INFO: renamed from: p */
    public final Map f11345p;

    /* JADX INFO: renamed from: q */
    public final ExecutorService f11346q;

    /* JADX INFO: renamed from: r */
    public volatile C3485f f11347r;

    /* JADX INFO: renamed from: s */
    public volatile Object f11348s;

    /* JADX INFO: renamed from: t */
    public volatile C3488i f11349t;

    /* JADX INFO: renamed from: u */
    public final Object f11350u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3490k(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f11330a = c3742g;
        this.f11331b = c2026t;
        Context context = c3742g.f12143a;
        this.f11332c = AbstractC4302b.m8640c(context, "Hchat_voice_forward_config");
        this.f11333d = AbstractC4302b.m8640c(context, "Hchat_message_forward_config");
        this.f11334e = AbstractC4302b.m8640c(context, "Hchat_voice_forward_method_cache");
        this.f11335f = AbstractC2091b.m5168o();
        this.f11336g = new ConcurrentHashMap();
        this.f11337h = new ConcurrentHashMap();
        this.f11338i = new ConcurrentHashMap();
        this.f11339j = new ConcurrentHashMap();
        this.f11340k = new ConcurrentHashMap();
        this.f11341l = Collections.newSetFromMap(new WeakHashMap());
        this.f11342m = AbstractC3199a.m6843p();
        this.f11343n = AbstractC3199a.m6843p();
        this.f11344o = AbstractC3199a.m6843p();
        this.f11345p = AbstractC3199a.m6843p();
        this.f11346q = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(22));
        this.f11350u = AbstractC0283h.m1127G(EnumC3957d.f12958g, new C2209s1(4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static C3486g m7294M(WeChatContact weChatContact, boolean z9, List list) {
        if (weChatContact == null || AbstractC3149m.m6721t0(weChatContact.wxId)) {
            return null;
        }
        String str = weChatContact.wxId;
        String strM7883Z = AbstractC3754e0.m7883Z(weChatContact, z9);
        String str2 = weChatContact.avatarUrl;
        String str3 = weChatContact.avatarBackupUrl;
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(list));
        List listM101y0 = AbstractC0000a.m101y0(weChatContact.remarkName, weChatContact.nickname, weChatContact.customWxId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM101y0) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new C3486g(str, strM7883Z, z9, str2, str3, listM8407P1, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m7295N(Activity activity, String str) {
        if (activity == null) {
            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
            activity = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
        }
        if (activity == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0487t(activity, str, 9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[PHI: r10
  0x0030: PHI (r10v24 android.content.Context) = (r10v3 android.content.Context), (r10v26 android.content.Context) binds: [B:14:0x002e, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7296a(Object obj, View view, int i9, int i10, String str, String str2) {
        int identifier;
        if (KavaReflector.invokeMethod(obj, "findItem", Integer.valueOf(i10)) != null) {
            return;
        }
        Object obj2 = null;
        if (view == null || (contextM7263a = view.getContext()) == null) {
            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
            Context contextM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
            if (contextM7263a != null) {
                Resources resources = contextM7263a.getResources();
                String packageName = contextM7263a.getPackageName();
                String[] strArr = {"raw", "drawable"};
                for (int i11 = 0; i11 < 2; i11++) {
                    identifier = resources.getIdentifier(str2, strArr[i11], packageName);
                    if (identifier != 0) {
                        break;
                    }
                }
                identifier = 0;
            } else {
                identifier = 0;
            }
        }
        if (identifier != 0) {
            Iterator<T> it = KavaReflector.declaredMethods(obj.getClass()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Method method = (Method) next;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (AbstractC1416l.m3825a(method.getName(), "c") && parameterTypes.length == 5) {
                    Class<?> cls = parameterTypes[0];
                    Class cls2 = Integer.TYPE;
                    if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[1], cls2) && AbstractC1416l.m3825a(parameterTypes[2], cls2) && parameterTypes[3].isAssignableFrom(String.class) && AbstractC1416l.m3825a(parameterTypes[4], cls2)) {
                        obj2 = next;
                        break;
                    }
                }
            }
            if (KavaReflector.invokeSuccessfully((Method) obj2, obj, Integer.valueOf(i9), Integer.valueOf(i10), 0, str, Integer.valueOf(identifier))) {
                return;
            }
        }
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "add", Integer.valueOf(i9), Integer.valueOf(i10), 0, str);
        if (objInvokeMethod == null) {
            objInvokeMethod = KavaReflector.invokeMethod(obj, "add", Integer.valueOf(i9), Integer.valueOf(i10), 0, str);
        }
        if ((objInvokeMethod instanceof MenuItem) && identifier != 0) {
            try {
                ((MenuItem) objInvokeMethod).setIcon(identifier);
            } catch (Throwable unused) {
            }
        } else if (objInvokeMethod == null && KavaReflector.invokeMethod(obj, "f", Integer.valueOf(i10), str) == null) {
            KavaReflector.invokeMethod(obj, "f", Integer.valueOf(i10), str);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m7297b(File file, File file2) {
        Object c3959f;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        if (!file.isFile()) {
            return false;
        }
        try {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                if (parentFile.isDirectory()) {
                    parentFile = null;
                }
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, true);
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i9);
            }
            fileOutputStream.close();
            fileInputStream.close();
            c3959f = Boolean.TRUE;
            Object obj = Boolean.FALSE;
            if (c3959f instanceof C3959f) {
                c3959f = obj;
            }
            return ((Boolean) c3959f).booleanValue();
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m7298e(Collection collection) {
        Iterator it = AbstractC3015m.m6409S(AbstractC3015m.m6413W(new C3011i(AbstractC4166m.m8415m1(collection), true, new C3092e(22)), new C3092e(23))).iterator();
        while (true) {
            AbstractC4151b abstractC4151b = (AbstractC4151b) it;
            if (!abstractC4151b.hasNext()) {
                return;
            } else {
                try {
                    new File((String) abstractC4151b.next()).delete();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m7299g(File file, File file2) {
        Object c3959f;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        if (!file.isFile()) {
            return false;
        }
        try {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                if (parentFile.isDirectory()) {
                    parentFile = null;
                }
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, false);
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i9);
            }
            fileOutputStream.close();
            fileInputStream.close();
            c3959f = Boolean.TRUE;
            Object obj = Boolean.FALSE;
            if (c3959f instanceof C3959f) {
                c3959f = obj;
            }
            return ((Boolean) c3959f).booleanValue();
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m7300i(List list) {
        Iterator it = AbstractC3015m.m6409S(AbstractC3015m.m6413W(new C0795n(list, 6), new C3092e(24))).iterator();
        while (true) {
            AbstractC4151b abstractC4151b = (AbstractC4151b) it;
            if (!abstractC4151b.hasNext()) {
                return;
            } else {
                try {
                    new File((String) abstractC4151b.next()).delete();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m7301j(Object obj) {
        String[] strArr = {"T", "Z"};
        for (int i9 = 0; i9 < 2; i9++) {
            Object field = KavaReflector.readField(obj, strArr[i9]);
            String str = field instanceof String ? (String) field : null;
            if (str != null) {
                String str2 = AbstractC3149m.m6721t0(str) ? null : str;
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Number m7302l(Object obj, String... strArr) {
        for (String str : strArr) {
            Object field = KavaReflector.readField(obj, str);
            if (field instanceof Number) {
                return (Number) field;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m7303q(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), String.class) && parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m7304r(Object obj) {
        Number numberM7302l = m7302l(obj, "field_type", "type");
        if ((numberM7302l != null ? numberM7302l.intValue() : 0) == 3) {
            Object field = KavaReflector.readField(obj, "field_favProto");
            Object objM8424v1 = null;
            if (field != null) {
                Object field2 = KavaReflector.readField(field, "f");
                List list = field2 instanceof List ? (List) field2 : null;
                if (list != null) {
                    objM8424v1 = AbstractC4166m.m8424v1(list);
                }
            }
            if (objM8424v1 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m7305s(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string) || string.length() > 128 || AbstractC3149m.m6710i0(string, '/') || AbstractC3149m.m6710i0(string, '\\') || AbstractC3149m.m6710i0(string, '<') || AbstractC3149m.m6710i0(string, '\n')) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("[A-Za-z0-9_@.\\-]+");
        patternCompile.getClass();
        return patternCompile.matcher(string).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m7306t(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && parameterTypes.length >= 3 && MenuItem.class.isAssignableFrom(parameterTypes[0]) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.viewitems.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m7307u(Object obj) {
        Number numberM7302l;
        String[] strArr = {"getType", "getMsgType", "getMsgTypeValue"};
        int i9 = 0;
        while (true) {
            if (i9 >= 3) {
                numberM7302l = null;
                break;
            }
            Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), strArr[i9], new Class[0]), obj, new Object[0]);
            if (objInvoke instanceof Number) {
                numberM7302l = (Number) objInvoke;
                break;
            }
            i9++;
        }
        if (numberM7302l == null) {
            numberM7302l = m7302l(obj, "field_type", "type");
        }
        return numberM7302l != null && numberM7302l.intValue() == 34;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static List m7308v() {
        Object c3959f;
        int i9;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        List list = C4173t.f13710g;
        if (c1368iM9259c == null || !c1368iM9259c.m3704G()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            c3959f = c1368iM9259c.m3727p();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = list;
        }
        for (ContactLabelBean contactLabelBean : (Iterable) c3959f) {
            String str = contactLabelBean.labelName;
            if (AbstractC3149m.m6721t0(str)) {
                str = contactLabelBean.labelId;
            }
            if (!AbstractC3149m.m6721t0(str)) {
                for (String str2 : contactLabelBean.userNameList) {
                    if (!AbstractC3149m.m6721t0(str2)) {
                        Object arrayList2 = linkedHashMap.get(str2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(str2, arrayList2);
                        }
                        ((List) arrayList2).add(str);
                    }
                }
            }
        }
        ArrayList arrayListM3736y = c1368iM9259c.m3736y();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayListM3736y.iterator();
        while (true) {
            i9 = 0;
            if (!it.hasNext()) {
                break;
            }
            WeChatContact weChatContact = (WeChatContact) it.next();
            List list2 = (List) linkedHashMap.get(weChatContact.wxId);
            if (list2 == null) {
                list2 = list;
            }
            C3486g c3486gM7294M = m7294M(weChatContact, false, list2);
            if (c3486gM7294M != null) {
                arrayList3.add(c3486gM7294M);
            }
        }
        AbstractC4171r.m8432h1(arrayList, arrayList3);
        ArrayList arrayListM3735x = c1368iM9259c.m3735x();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayListM3735x.iterator();
        while (it2.hasNext()) {
            C3486g c3486gM7294M2 = m7294M((WeChatContact) it2.next(), true, list);
            if (c3486gM7294M2 != null) {
                arrayList4.add(c3486gM7294M2);
            }
        }
        AbstractC4171r.m8432h1(arrayList, arrayList4);
        C1624a c1624aConversations = WeChatApis.conversations();
        ArrayList arrayListM4144c = c1624aConversations != null ? c1624aConversations.m4144c() : null;
        if (arrayListM4144c != null) {
            list = arrayListM4144c;
        }
        ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(list));
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            arrayList5.add(new C3958e(((C2527b) obj).f8167a, Integer.valueOf(i9)));
            i9 = i10;
        }
        Map mapM8442e0 = AbstractC4178y.m8442e0(arrayList5);
        HashSet hashSet = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((C3486g) obj2).f11315a)) {
                arrayList6.add(obj2);
            }
        }
        return AbstractC4166m.m8402K1(arrayList6, new C0415a0(new C0415a0(new C0505z(mapM8442e0, 3), 23), 24));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m7309A(String str) {
        if (AbstractC3149m.m6721t0(str)) {
            return false;
        }
        if (AbstractC0921a.m2262y(str)) {
            return true;
        }
        String[] strArr = {"j", "k"};
        String[] strArr2 = {"com.tencent.mm.vfs.w6", "com.tencent.mm.vfs.p6"};
        for (int i9 = 0; i9 < 2; i9++) {
            Class<?> clsLoadClass = KavaReflector.loadClass(strArr2[i9], this.f11330a.f12145c);
            if (clsLoadClass != null) {
                for (Method method : KavaReflector.declaredMethods(clsLoadClass)) {
                    if (AbstractC4165l.m8378m0(strArr, method.getName()) && Modifier.isStatic(method.getModifiers())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
                            Object objInvoke = KavaReflector.invoke(method, null, str);
                            if (AbstractC1416l.m3825a(objInvoke, Boolean.TRUE) || ((objInvoke instanceof Number) && ((Number) objInvoke).longValue() > 0)) {
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
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:152:0x0150 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r14v13, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r14v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: qb.i */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: java.lang.Integer */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: java.lang.Integer */
    /* JADX DEBUG: Multi-variable search result rejected for r2v37, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r2v38, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Type inference failed for: r12v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3488i m7310B(Object obj) {
        Object c3959f;
        Integer numValueOf;
        C3963j c3963j;
        int iM7326k;
        Object c3959f2;
        C3963j c3963j2 = null;
        if (m7304r(obj)) {
            Object field = KavaReflector.readField(obj, "field_favProto");
            if (field != null) {
                Object field2 = KavaReflector.readField(field, "f");
                List list = field2 instanceof List ? (List) field2 : null;
                Object objM8424v1 = list != null ? AbstractC4166m.m8424v1(list) : null;
                if (objM8424v1 != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Class<?> cls = objM8424v1.getClass();
                    String strM7301j = m7301j(objM8424v1);
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    ConcurrentHashMap concurrentHashMap = this.f11337h;
                    Method method = (Method) concurrentHashMap.get(cls);
                    if (method != null) {
                        Object objInvoke = KavaReflector.invoke(method, null, objM8424v1);
                        String str = objInvoke instanceof String ? (String) objInvoke : null;
                        if (str != null) {
                            if (m7326k(str, strM7301j, method) < 0) {
                                str = null;
                            }
                            if (str != null) {
                                linkedHashSet2.add(str);
                            }
                        }
                    }
                    String strConcat = "fav_data_path_v2_".concat(cls.getName());
                    String strM7334z = m7334z();
                    C3742g c3742g = this.f11330a;
                    ClassLoader classLoader = c3742g.f12145c;
                    SharedPreferences sharedPreferences = this.f11334e;
                    Method methodM2087c = C0828b.m2087c(sharedPreferences, strM7334z, classLoader, strConcat);
                    if (methodM2087c != null && m7303q(cls, methodM2087c)) {
                        concurrentHashMap.put(cls, methodM2087c);
                        Object objInvoke2 = KavaReflector.invoke(methodM2087c, null, objM8424v1);
                        String str2 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                        if (str2 != null) {
                            if (m7326k(str2, strM7301j, methodM2087c) < 0) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                linkedHashSet2.add(str2);
                            }
                        }
                    }
                    try {
                        DexKitBridge dexKitBridge = c3742g.f12146d;
                        C0570e c0570e = new C0570e();
                        C1253k c1253k = new C1253k();
                        C1253k.m3366q0(c1253k, "java.lang.String");
                        c1253k.m3372o0(cls.getName());
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
                            Method method2 = (Method) c3959f2;
                            if (method2 != null) {
                                arrayList.add(method2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (m7303q(cls, (Method) obj2)) {
                                arrayList2.add(obj2);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        c3959f = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            if (hashSet.add(((Method) obj3).toGenericString())) {
                                c3959f.add(obj3);
                            }
                        }
                    } catch (Throwable th3) {
                        c3959f = new C3959f(th3);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    Object obj4 = c3959f;
                    if (thM8182b != null) {
                        this.f11331b.invoke("收藏语音定位文件路径方法失败", thM8182b);
                        obj4 = C4173t.f13710g;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Method method3 : (List) obj4) {
                        Object objInvoke3 = KavaReflector.invoke(method3, c3963j2, objM8424v1);
                        String str3 = objInvoke3 instanceof String ? (String) objInvoke3 : c3963j2;
                        if (str3 == 0 || (iM7326k = m7326k(str3, strM7301j, method3)) < 0) {
                            c3963j = c3963j2;
                        } else {
                            c3963j = c3963j2;
                            c3963j2 = new C3963j(method3, str3, Integer.valueOf(iM7326k));
                        }
                        if (c3963j2 != null) {
                            arrayList3.add(c3963j2);
                        }
                        c3963j2 = c3963j;
                    }
                    C3488i c3488i = c3963j2;
                    List listM8402K1 = AbstractC4166m.m8402K1(arrayList3, new C0031h(28));
                    C3963j c3963j3 = (C3963j) AbstractC4166m.m8424v1(listM8402K1);
                    if (c3963j3 != null) {
                        Object obj5 = c3963j3.f12971g;
                        concurrentHashMap.put(cls, obj5);
                        C0828b.m2092h(sharedPreferences, m7334z(), strConcat, (Method) obj5);
                    }
                    Iterator it2 = listM8402K1.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet2.add(((C3963j) it2.next()).f12972h);
                    }
                    Iterator it3 = AbstractC4166m.m8407P1(linkedHashSet2).iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.add((String) it3.next());
                    }
                    String strM7314F = m7314F(objM8424v1);
                    if (strM7314F != null) {
                        linkedHashSet.add(strM7314F);
                    }
                    String strM7314F2 = m7314F(obj);
                    if (strM7314F2 != null) {
                        linkedHashSet.add(strM7314F2);
                    }
                    String str4 = (String) AbstractC3015m.m6411U(AbstractC3015m.m6414X(new C0795n(linkedHashSet, 6), new C2924a(this, 2)));
                    if (str4 == null) {
                        return c3488i;
                    }
                    Number numberM7302l = m7302l(objM8424v1, "y", "duration", "length");
                    Long lValueOf = numberM7302l != null ? Long.valueOf(numberM7302l.longValue()) : c3488i;
                    if (lValueOf != 0) {
                        long jLongValue = lValueOf.longValue();
                        if (jLongValue <= 0) {
                            numValueOf = c3488i;
                        } else {
                            if (1 <= jLongValue && jLongValue < 601) {
                                jLongValue *= 1000;
                            }
                            long j3 = jLongValue >= 1 ? jLongValue : 1L;
                            if (j3 > 2147483647L) {
                                j3 = 2147483647L;
                            }
                            numValueOf = Integer.valueOf((int) j3);
                        }
                    }
                    return new C3488i(str4, numValueOf != 0 ? numValueOf.intValue() : 1000, false);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[RETURN] */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7311C(int i9, Object obj, Set set) {
        Object field;
        Object objM7311C;
        if (obj == null || i9 > 5 || !set.add(obj)) {
            return null;
        }
        if (!AbstractC0921a.m2263z("com.tencent.mm.storage.", obj, false)) {
            List<Method> listDeclaredMethods = KavaReflector.declaredMethods(obj.getClass());
            if (listDeclaredMethods == null || !listDeclaredMethods.isEmpty()) {
                for (Method method : listDeclaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && (AbstractC1416l.m3825a(method.getName(), "getMsgId") || AbstractC1416l.m3825a(method.getName(), "getMsgID"))) {
                        if (AbstractC1416l.m3825a(method.getReturnType(), Long.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Long.class)) {
                            if (m7333y(obj) > 0) {
                            }
                        }
                    }
                }
            }
        } else if (m7333y(obj) > 0) {
            return obj;
        }
        String name = obj.getClass().getName();
        if (AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false)) {
            return null;
        }
        if (obj instanceof View) {
            return m7311C(i9 + 1, ((View) obj).getTag(), set);
        }
        if (obj instanceof Object[]) {
            for (Object obj2 : (Object[]) obj) {
                Object objM7311C2 = m7311C(i9 + 1, obj2, set);
                if (objM7311C2 != null) {
                    return objM7311C2;
                }
            }
            return null;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                Object objM7311C3 = m7311C(i9 + 1, it.next(), set);
                if (objM7311C3 != null) {
                    return objM7311C3;
                }
            }
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field2 : KavaReflector.declaredFields(superclass)) {
                Class<?> type = field2.getType();
                if (!type.isPrimitive() && !type.isArray() && !type.equals(String.class) && (field = KavaReflector.readField(field2, obj)) != null && (objM7311C = m7311C(i9 + 1, field, set)) != null) {
                    return objM7311C;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3488i m7312D(Object obj) {
        String str;
        String str2;
        Object c3959f;
        String str3;
        String strBodyContent;
        C2114y c2114y;
        String[] strArr = {"field_imgPath", "imgPath", "voicePath", "fileName"};
        int i9 = 0;
        while (true) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i9 >= 4) {
                Class<?> cls = obj.getClass();
                ConcurrentHashMap concurrentHashMap = this.f11339j;
                Method method = (Method) concurrentHashMap.get(cls);
                if (method == null) {
                    Class<?> cls2 = obj.getClass();
                    String[] strArr2 = {"z0", "m0", "getFileName", "getVoiceFileName"};
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            method = null;
                            break;
                        }
                        Method methodFindMethod = KavaReflector.findMethod(cls2, strArr2[i10], new Class[0]);
                        if (methodFindMethod != null) {
                            Class<?>[] parameterTypes = methodFindMethod.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && AbstractC1416l.m3825a(methodFindMethod.getReturnType(), String.class)) {
                                method = methodFindMethod;
                                break;
                            }
                        }
                        i10++;
                    }
                    if (method != null) {
                        concurrentHashMap.put(cls, method);
                    } else {
                        method = null;
                    }
                }
                if (method != null) {
                    Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
                    str2 = objInvoke instanceof String ? (String) objInvoke : null;
                    if (str2 == null) {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        if (AbstractC3149m.m6721t0(str2)) {
                            str2 = null;
                        }
                        if (str2 == null) {
                        }
                    }
                }
            } else {
                Object field = KavaReflector.readField(obj, strArr[i9]);
                String str4 = field instanceof String ? (String) field : null;
                if (str4 != null) {
                    if (AbstractC3149m.m6721t0(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        str2 = str4;
                        break;
                    }
                }
                i9++;
                obj = obj;
            }
        }
        String str5 = !AbstractC3149m.m6721t0(str2) ? str2 : null;
        if (str5 != null) {
            C2105p c2105pMedia = WeChatApis.media();
            String strM5321q = (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null) ? null : c2114y.m5321q(str5);
            if (strM5321q != null) {
                str = strM5321q;
            }
            if (!AbstractC3149m.m6721t0(str) && AbstractC0921a.m2262y(str)) {
                long jM7333y = m7333y(obj);
                try {
                    C2355s c2355sMessageStore = WeChatApis.messageStore();
                    c3959f = c2355sMessageStore != null ? c2355sMessageStore.m5661c(jM7333y) : null;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                WeChatMessage weChatMessage = (WeChatMessage) c3959f;
                C4329c c4329cM7E = AbstractC0000a.m7E();
                if (weChatMessage != null && (strBodyContent = weChatMessage.bodyContent()) != null) {
                    if (AbstractC3149m.m6721t0(strBodyContent)) {
                        strBodyContent = null;
                    }
                    if (strBodyContent != null) {
                        c4329cM7E.add(strBodyContent);
                    }
                }
                if (weChatMessage != null && (str3 = weChatMessage.content) != null) {
                    String str6 = AbstractC3149m.m6721t0(str3) ? null : str3;
                    if (str6 != null) {
                        c4329cM7E.add(str6);
                    }
                }
                return new C3488i(str, AbstractC2094e.m5193d(obj, str5, jM7333y, AbstractC0000a.m90t(c4329cM7E), 1000), false);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final boolean m7313E(File file, File file2) {
        Object c3959f;
        Object c3959f2;
        boolean zBooleanValue;
        boolean zM7299g = false;
        if (!file.isFile()) {
            return false;
        }
        try {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                if (parentFile.isDirectory()) {
                    parentFile = null;
                }
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            if (AbstractC0793l.m2023c0(file).equalsIgnoreCase("mp3")) {
                zBooleanValue = true;
            } else {
                try {
                    c3959f2 = Boolean.valueOf(m7327m().getFileType(file.getAbsolutePath()) == 2);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                Object obj = Boolean.FALSE;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = obj;
                }
                zBooleanValue = ((Boolean) c3959f2).booleanValue();
            }
            if (zBooleanValue) {
                zM7299g = m7299g(file, file2);
            } else if (m7327m().silkToMp3(file.getAbsolutePath(), file2.getAbsolutePath(), C4143c.DEFAULT_HZ) == 0 && file2.isFile() && file2.length() > 0) {
                zM7299g = true;
            } else {
                file2.delete();
            }
            c3959f = Boolean.valueOf(zM7299g);
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f11331b.invoke("语音转 MP3 失败", thM8182b);
            file2.delete();
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final String m7314F(Object obj) {
        Object next;
        String strM7301j = m7301j(obj);
        ArrayList arrayList = new ArrayList();
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        m7324f(obj, strM7301j, arrayList, setNewSetFromMap, 0);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(((Number) ((C3958e) next).f12962h).intValue());
                do {
                    Object next2 = it.next();
                    Integer numValueOf2 = Integer.valueOf(((Number) ((C3958e) next2).f12962h).intValue());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        next = next2;
                        numValueOf = numValueOf2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C3958e c3958e = (C3958e) next;
        if (c3958e != null) {
            return (String) c3958e.f12961g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final boolean m7315G(C3488i c3488i, String str) {
        C2114y c2114y;
        Object c3959f;
        C2105p c2105pMedia = WeChatApis.media();
        if (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null || !c2114y.m5308b() || !new File(c3488i.f11325a).isFile()) {
            return false;
        }
        try {
            c3959f = Boolean.valueOf(c2114y.m5323s(c3488i.f11326b, str, c3488i.f11325a));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f11331b.invoke("语音转发发送异常", thM8182b);
            c3959f = Boolean.FALSE;
        }
        if (!((Boolean) c3959f).booleanValue()) {
            C2813a c2813aNetwork = WeChatApis.network();
            if (c2813aNetwork == null) {
                return false;
            }
            C2815c c2815c = c2813aNetwork.f9079a;
            if (c2815c.f9082c == null || ((Method) c2815c.f9083d) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m7316H(Activity activity, List list, List list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list2.isEmpty()) {
            m7298e(list);
        } else {
            this.f11346q.execute(new RunnableC0537x(list2, (Object) list, (Object) new Handler(Looper.getMainLooper()), (Object) this, activity, 12));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m7317I(Activity activity, ArrayList arrayList, C0126e c0126e, C3481b c3481b) {
        if (arrayList.isEmpty()) {
            return;
        }
        Set set = this.f11341l;
        if (set.contains(activity)) {
            return;
        }
        set.add(activity);
        C3485f c3485fM7323d = m7323d();
        if (c3485fM7323d != null) {
            m7319K(activity, arrayList, c3485fM7323d.f11313a, c0126e, c3481b);
        } else {
            new Thread(new RunnableC0496w(this, new Handler(Looper.getMainLooper()), activity, arrayList, c0126e, c3481b), "Hchat-VoiceForwardContacts").start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m7318J(Activity activity, C3488i c3488i) {
        Set set = this.f11341l;
        if (set.contains(activity)) {
            return;
        }
        set.add(activity);
        C3485f c3485fM7323d = m7323d();
        if (c3485fM7323d != null) {
            m7320L(activity, c3488i, c3485fM7323d.f11313a);
        } else {
            new Thread(new RunnableC0217c(this, new Handler(Looper.getMainLooper()), activity, c3488i, 16), "Hchat-VoiceForwardContacts").start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final void m7319K(Activity activity, ArrayList arrayList, List list, C0126e c0126e, InterfaceC1231l interfaceC1231l) {
        if (list.isEmpty()) {
            m7298e(arrayList);
            this.f11341l.remove(activity);
            m7295N(activity, "没有可用联系人");
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3486g c3486g = (C3486g) it.next();
            arrayList2.add(new C5026jv(c3486g.f11315a, c3486g.f11316b, c3486g.f11317c, c3486g.f11318d, c3486g.f11319e, c3486g.f11320f, false, c3486g.f11321g, 64));
        }
        C5491y2.m9807U1(activity, arrayList2, new C0884o(interfaceC1231l, this, activity, arrayList, c0126e, 4), new C0467n0(atomicBoolean, this, arrayList, activity, 7), null, null, false, new C0493v(atomicBoolean, 1), null, false, 3952);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m7320L(Activity activity, C3488i c3488i, List list) {
        if (list.isEmpty()) {
            this.f11341l.remove(activity);
            m7295N(activity, "没有可用联系人");
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3486g c3486g = (C3486g) it.next();
            arrayList.add(new C5026jv(c3486g.f11315a, c3486g.f11316b, c3486g.f11317c, c3486g.f11318d, c3486g.f11319e, c3486g.f11320f, false, c3486g.f11321g, 64));
        }
        C5491y2.m9807U1(activity, arrayList, new C0153s(this, activity, c3488i, 16), new C3482c(this, activity, 0), null, null, false, null, null, false, 4080);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final boolean m7321O(String str) {
        SharedPreferences sharedPreferences = this.f11332c;
        return sharedPreferences.getBoolean(str, sharedPreferences.getBoolean("voice_forward_enable", false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final File m7322c() {
        File file = new File(m7328n(), "Voice");
        if (file.isDirectory() || file.mkdirs()) {
            return new File(file, AbstractC0921a.m2251n("Hchat_voice_", new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date()), ".mp3"));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C3485f m7323d() {
        C3485f c3485f = this.f11347r;
        if (c3485f != null) {
            if (!c3485f.f11313a.isEmpty() && System.currentTimeMillis() - c3485f.f11314b <= 60000) {
                return c3485f;
            }
            this.f11347r = null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m7324f(Object obj, String str, ArrayList arrayList, Set set, int i9) {
        Object field;
        if (obj == null || i9 > 4 || !set.add(obj)) {
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    m7324f(obj2, str, arrayList, set, i9 + 1);
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    m7324f(it.next(), str, arrayList, set, i9 + 1);
                }
                return;
            }
            if (obj.getClass().isArray()) {
                return;
            }
            String name = obj.getClass().getName();
            if (AbstractC3156t.m6740d0(name, "android.", false) || AbstractC3156t.m6740d0(name, "java.lang.", false) || AbstractC3156t.m6740d0(name, "java.io.", false)) {
                return;
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                for (Field field2 : KavaReflector.declaredFields(superclass)) {
                    if (!field2.getType().isPrimitive() && (field = KavaReflector.readField(field2, obj)) != null) {
                        m7324f(field, str, arrayList, set, i9 + 1);
                    }
                }
            }
            return;
        }
        String str2 = (String) obj;
        int i10 = -1;
        if (!AbstractC3149m.m6721t0(str2) && (AbstractC3149m.m6710i0(str2, '/') || AbstractC3149m.m6709h0(str2, "://", false))) {
            File file = new File(str2);
            if (m7309A(str2)) {
                Locale locale = Locale.US;
                String strM5165l = AbstractC2091b.m5165l(locale, str2, locale);
                String name2 = file.getName();
                name2.getClass();
                String lowerCase = name2.toLowerCase(locale);
                lowerCase.getClass();
                int i11 = (AbstractC3149m.m6721t0(str) || !AbstractC1416l.m3825a(file.getName(), str)) ? 0 : 30;
                if (!AbstractC3149m.m6721t0(str)) {
                    String name3 = file.getName();
                    name3.getClass();
                    if (AbstractC3156t.m6740d0(name3, str, false)) {
                        i11 += 24;
                    }
                }
                if (!AbstractC3149m.m6721t0(str) && AbstractC3149m.m6709h0(str2, str, false)) {
                    i11 += 18;
                }
                int i12 = !AbstractC3156t.m6733W(lowerCase, "_t", false) ? i11 + 12 : i11 - 30;
                if (AbstractC3156t.m6733W(lowerCase, ".silk", false) || AbstractC3156t.m6733W(lowerCase, ".slk", false) || AbstractC3156t.m6733W(lowerCase, ".amr", false) || AbstractC3156t.m6733W(lowerCase, ".spx", false) || AbstractC3156t.m6733W(lowerCase, ".speex", false) || AbstractC3156t.m6733W(lowerCase, ".mp3", false)) {
                    i12 += 16;
                }
                if (AbstractC3149m.m6709h0(strM5165l, "/favorite", false) || AbstractC3149m.m6709h0(strM5165l, "/fav/", false)) {
                    i12 += 4;
                }
                if (AbstractC3149m.m6709h0(strM5165l, "voice", false)) {
                    i12 += 4;
                }
                i10 = i12;
                if (file.isFile() && file.length() > 0) {
                    i10 += 2;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (!(i10 >= 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            arrayList.add(new C3958e(obj, Integer.valueOf(numValueOf.intValue())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m7325h(File file, File file2, File file3) {
        Object c3959f;
        int iAutoToSilkCompat;
        if (!file.isFile()) {
            return false;
        }
        try {
            c3959f = Integer.valueOf(m7327m().getFileType(file.getAbsolutePath()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = 0;
        }
        if (((Number) c3959f).intValue() == 1) {
            iAutoToSilkCompat = m7327m().silkToPcm(file.getAbsolutePath(), file2.getAbsolutePath(), C4143c.DEFAULT_HZ);
        } else {
            File file4 = new File(file3, AbstractC0793l.m2025e0(file2).concat(".silk"));
            iAutoToSilkCompat = AacCodec.autoToSilkCompat(file.getAbsolutePath(), file4.getAbsolutePath(), m7327m(), C4143c.DEFAULT_HZ);
            if (iAutoToSilkCompat == 0) {
                iAutoToSilkCompat = m7327m().silkToPcm(file4.getAbsolutePath(), file2.getAbsolutePath(), C4143c.DEFAULT_HZ);
            }
        }
        return iAutoToSilkCompat == 0 && file2.isFile() && file2.length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7326k(String str, String str2, Method method) {
        int i9;
        if (AbstractC3149m.m6721t0(str)) {
            return -1;
        }
        if (!AbstractC3149m.m6710i0(str, '/') && !AbstractC3149m.m6709h0(str, "://", false)) {
            return -1;
        }
        File file = new File(str);
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, str, locale);
        String name = file.getName();
        name.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        String name2 = method != null ? method.getName() : null;
        if (name2 == null) {
            i9 = 0;
        } else {
            int iHashCode = name2.hashCode();
            if (iHashCode != 88) {
                i9 = iHashCode != 119 ? 80 : 80;
            } else if (name2.equals("X")) {
                i9 = -20;
            }
        }
        if (!AbstractC3149m.m6721t0(str2) && AbstractC1416l.m3825a(file.getName(), str2)) {
            i9 += 40;
        }
        if (!AbstractC3149m.m6721t0(str2)) {
            String name3 = file.getName();
            name3.getClass();
            if (AbstractC3156t.m6740d0(name3, str2, false)) {
                i9 += 30;
            }
        }
        if (!AbstractC3149m.m6721t0(str2) && AbstractC3149m.m6709h0(str, str2, false)) {
            i9 += 20;
        }
        int i10 = !AbstractC3156t.m6733W(lowerCase, "_t", false) ? i9 + 10 : i9 - 30;
        if (AbstractC3149m.m6709h0(strM5165l, "/favorite", false) || AbstractC3149m.m6709h0(strM5165l, "/fav/", false)) {
            i10 += 8;
        }
        if (AbstractC3149m.m6709h0(strM5165l, "voice", false)) {
            i10 += 6;
        }
        return m7309A(str) ? i10 + 24 : i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: m */
    public final SilkCodec m7327m() {
        return (SilkCodec) this.f11350u.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final File m7328n() {
        Object c3959f;
        C3742g c3742g = this.f11330a;
        Context applicationContext = c3742g.f12143a.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = c3742g.f12143a;
        }
        try {
            Object[] externalMediaDirs = applicationContext.getExternalMediaDirs();
            if (externalMediaDirs != null) {
                int length = externalMediaDirs.length;
                for (int i9 = 0; i9 < length; i9++) {
                    c3959f = externalMediaDirs[i9];
                    if (c3959f != null) {
                        break;
                    }
                }
                c3959f = null;
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        File file = (File) (c3959f instanceof C3959f ? null : c3959f);
        if (file == null) {
            file = new File(AbstractC4855en.m9263g("/storage/emulated/0/Android/media/", applicationContext.getPackageName()));
        }
        return new File(file, "Hchat");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m7329o(Method method, XC_MethodHook xC_MethodHook) {
        Set set = this.f11335f;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(method, xC_MethodHook);
            return true;
        } catch (Throwable th2) {
            set.remove(method);
            this.f11331b.invoke("转发语音Hook安装失败: " + method.getName(), th2);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m7330p() {
        return m7321O("voice_forward_chat_forward_enable") || m7321O("voice_forward_chat_save_enable") || m7321O("voice_forward_chat_multi_forward_enable") || this.f11332c.getBoolean("voice_forward_chat_multi_merge_enable", false) || m7321O("voice_forward_favorite_forward_enable") || m7321O("voice_forward_favorite_save_enable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m7331w(Activity activity, ArrayList arrayList, boolean z9, C0126e c0126e, List list) {
        if (arrayList.size() < 2) {
            m7295N(activity, "至少选择两条语音");
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        new Thread(new RunnableC0462m(this, arrayList, z9, atomicBoolean, atomicBoolean2, C5491y2.m9813X1(activity, new C0442h(atomicBoolean2, atomicBoolean, 5), "合并语音", AbstractC0921a.m2250m(arrayList.size(), "正在合并 ", " 条语音...")), activity, c0126e, list), "Hchat-VoiceMerge").start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r5 != null) goto L22;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3488i m7332x(ArrayList arrayList, boolean z9) throws Throwable {
        File file;
        Object c3959f;
        if (arrayList.size() >= 2) {
            File file2 = new File(m7328n(), "Cache");
            if (file2.isDirectory() || file2.mkdirs()) {
                if (z9) {
                    File file3 = new File(m7328n(), "Voice");
                    file = (file3.isDirectory() || file3.mkdirs()) ? new File(file3, AbstractC0921a.m2251n("Hchat_merged_voice_", new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date()), ".mp3")) : null;
                } else {
                    file = new File(file2, "Hchat_merged_voice_" + System.currentTimeMillis() + ".silk");
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long id2 = Thread.currentThread().getId();
                StringBuilder sbM6842o = AbstractC3199a.m6842o(jCurrentTimeMillis, "voice_merge_", "_");
                sbM6842o.append(id2);
                File file4 = new File(file2, sbM6842o.toString());
                if (!file4.mkdirs()) {
                    file.delete();
                    return null;
                }
                boolean z10 = false;
                try {
                    File file5 = new File(file4, "merged.pcm");
                    int i9 = 0;
                    for (Object obj : arrayList) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        File file6 = new File(file4, "part_" + i9 + ".pcm");
                        try {
                            if (!m7325h(new File(((C3488i) obj).f11325a), file6, file4)) {
                                throw new IllegalStateException("第 " + i10 + " 条语音解码失败");
                            }
                            if (!m7297b(file6, file5)) {
                                throw new IllegalStateException("第 " + i10 + " 条语音拼接失败");
                            }
                            i9 = i10;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0793l.m2022b0(file4);
                            if (!z10) {
                                file.delete();
                            }
                            throw th;
                        }
                    }
                    File file7 = new File(file4, "merged.silk");
                    int iPcmToSilk = m7327m().pcmToSilk(file5.getAbsolutePath(), file7.getAbsolutePath(), C4143c.DEFAULT_HZ, C4143c.DEFAULT_HZ, 1);
                    if (iPcmToSilk != 0 || !file7.isFile() || file7.length() <= 0) {
                        throw new IllegalStateException("PCM 转 Silk 失败: " + iPcmToSilk);
                    }
                    if (z9) {
                        int iSilkToMp3 = m7327m().silkToMp3(file7.getAbsolutePath(), file.getAbsolutePath(), C4143c.DEFAULT_HZ);
                        if (iSilkToMp3 != 0 || !file.isFile() || file.length() <= 0) {
                            throw new IllegalStateException("Silk 转 MP3 失败: " + iSilkToMp3);
                        }
                    } else if (!m7299g(file7, file) || !file.isFile() || file.length() <= 0) {
                        throw new IllegalStateException("保存合并语音缓存失败");
                    }
                    z10 = true;
                    try {
                        c3959f = Long.valueOf(m7327m().getDuration(file7.getAbsolutePath()));
                    } catch (Throwable th3) {
                        c3959f = new C3959f(th3);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = 0L;
                    }
                    long jLongValue = ((Number) c3959f).longValue();
                    Iterator it = arrayList.iterator();
                    long j3 = 0;
                    while (it.hasNext()) {
                        long j4 = ((C3488i) it.next()).f11326b;
                        if (j4 < 1) {
                            j4 = 1;
                        }
                        j3 += j4;
                    }
                    int iM7911s = (int) AbstractC3754e0.m7911s(jLongValue > 0 ? jLongValue : j3, 1L, 2147483647L);
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    C3488i c3488i = new C3488i(absolutePath, iM7911s, !z9);
                    AbstractC0793l.m2022b0(file4);
                    return c3488i;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final long m7333y(Object obj) {
        Class<?> cls = obj.getClass();
        C1091b c1091b = new C1091b(obj, 2);
        ConcurrentHashMap concurrentHashMap = this.f11338i;
        Method method = (Method) concurrentHashMap.get(cls);
        if (method == null) {
            method = (Method) c1091b.invoke();
            if (method != null) {
                concurrentHashMap.put(cls, method);
            } else {
                method = null;
            }
        }
        if (method != null) {
            Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
            Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
            if (number != null) {
                return number.longValue();
            }
        }
        Number numberM7302l = m7302l(obj, "field_msgId", "msgId", "msgID", "id");
        if (numberM7302l != null) {
            return numberM7302l.longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final String m7334z() {
        C3742g c3742g = this.f11330a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }
}
