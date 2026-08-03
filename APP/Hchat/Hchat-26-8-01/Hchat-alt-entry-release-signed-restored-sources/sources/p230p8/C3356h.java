package p230p8;

import ac.RunnableC0059l;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p036c9.C0456k1;
import p062e8.C0828b;
import p085fg.InterfaceC1231l;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3740e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: p8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3356h {

    /* JADX INFO: renamed from: k */
    public static final List f10809k = AbstractC0000a.m101y0("getSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");

    /* JADX INFO: renamed from: l */
    public static final List f10810l = AbstractC0000a.m101y0("select *,rowid from SnsInfo  where SnsInfo.snsId=", " limit 1");

    /* JADX INFO: renamed from: m */
    public static final List f10811m = AbstractC0000a.m101y0("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");

    /* JADX INFO: renamed from: n */
    public static final List f10812n = AbstractC0000a.m101y0("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage", " from AdSnsInfo where createTime >", " limit ");

    /* JADX INFO: renamed from: o */
    public static final List f10813o = AbstractC0000a.m101y0("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage", "snsId=?", "rowid");

    /* JADX INFO: renamed from: a */
    public final Context f10814a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f10815b;

    /* JADX INFO: renamed from: c */
    public final DexKitBridge f10816c;

    /* JADX INFO: renamed from: d */
    public final C3364p f10817d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f10818e;

    /* JADX INFO: renamed from: f */
    public volatile Method f10819f;

    /* JADX INFO: renamed from: g */
    public volatile Method f10820g;

    /* JADX INFO: renamed from: h */
    public volatile Method f10821h;

    /* JADX INFO: renamed from: i */
    public volatile Method f10822i;

    /* JADX INFO: renamed from: j */
    public volatile Method f10823j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3356h(Context context, ClassLoader classLoader, DexKitBridge dexKitBridge, C3364p c3364p) {
        classLoader.getClass();
        dexKitBridge.getClass();
        this.f10814a = context;
        this.f10815b = classLoader;
        this.f10816c = dexKitBridge;
        this.f10817d = c3364p;
        this.f10818e = AbstractC4302b.m8640c(context, "Hchat_sns_cached_post_storage_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m7095a(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && method.getDeclaringClass().isAssignableFrom(cls) && method.getReturnType().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo") && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], Long.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m7096b(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers()) || !method.getDeclaringClass().isAssignableFrom(cls) || !Cursor.class.isAssignableFrom(method.getReturnType())) {
            return false;
        }
        Class cls2 = Integer.TYPE;
        Class cls3 = Boolean.TYPE;
        return Arrays.equals(parameterTypes, new Class[]{cls3, String.class, cls2, cls3, String.class, cls2, cls2});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m7097c(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers()) || !method.getDeclaringClass().isAssignableFrom(cls) || !Cursor.class.isAssignableFrom(method.getReturnType())) {
            return false;
        }
        Class cls2 = Integer.TYPE;
        return Arrays.equals(parameterTypes, new Class[]{String.class, cls2, cls2});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m7098d(Method method) {
        if (Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0 && !method.getReturnType().isPrimitive() && AbstractC3156t.m6740d0(method.getReturnType().getName(), "com.tencent.mm.plugin.sns.storage.", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m7099e(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && method.getDeclaringClass().isAssignableFrom(cls) && (AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Boolean.class)) && parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], Long.TYPE) && parameterTypes[1].getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C3355g m7100j(Object obj, Long l10) {
        if (obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            Object objInvokeMethod = KavaReflector.invokeMethod(obj, "convertTo", new Object[0]);
            ContentValues contentValues = objInvokeMethod instanceof ContentValues ? (ContentValues) objInvokeMethod : null;
            if (contentValues != null) {
                ContentValues contentValues2 = new ContentValues(contentValues);
                if (l10 == null) {
                    Object objInvokeMethod2 = KavaReflector.invokeMethod(obj, "getLocalid", new Object[0]);
                    Number number = objInvokeMethod2 instanceof Number ? (Number) objInvokeMethod2 : null;
                    l10 = number != null ? Long.valueOf(number.longValue()) : null;
                    if (l10 == null) {
                        Object field = KavaReflector.readField(obj, "localid");
                        Number number2 = field instanceof Number ? (Number) field : null;
                        l10 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                    }
                }
                if (l10 != null) {
                    contentValues2.put("hchatLocalId", l10);
                }
                return new C3355g(obj, contentValues2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Method m7101f(List list, InterfaceC1231l interfaceC1231l, String str) {
        Context context = this.f10814a;
        ClassLoader classLoader = this.f10815b;
        String strM2091g = C0828b.m2091g(context, classLoader);
        SharedPreferences sharedPreferences = this.f10818e;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM2091g, classLoader, str);
        if (methodM2087c != null) {
            if (!((Boolean) interfaceC1231l.invoke(methodM2087c)).booleanValue()) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1425u c1425u = new C1425u();
        C3740e.m7756c(new RunnableC0059l(c1425u, this, list, 24));
        Object obj = c1425u.f4738g;
        if (obj == null) {
            AbstractC1416l.m3831g("methods");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (((Boolean) interfaceC1231l.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == 1) {
            Method method = (Method) AbstractC4166m.m8399H1(arrayList);
            C0828b.m2092h(sharedPreferences, strM2091g, str, method);
            return method;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                editorEdit.clear().putString("cache.key", strM2091g);
            }
            editorEdit.remove(str).apply();
        } catch (Throwable unused) {
        }
        this.f10817d.invoke("朋友圈缓存查询入口数量异常: cache=" + str + " count=" + arrayList.size());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3354f m7102g(String str) {
        Long lValueOf;
        Object c3959f;
        Object c3959f2;
        String strM6704S0 = AbstractC3149m.m6704S0(AbstractC3199a.m6839l(str, str), '\'', '\"');
        if (strM6704S0.length() <= 0) {
            strM6704S0 = null;
        }
        if (strM6704S0 != null) {
            Long lM6743g0 = AbstractC3156t.m6743g0(strM6704S0);
            if (lM6743g0 != null) {
                lValueOf = Long.valueOf(lM6743g0.longValue());
            } else {
                try {
                    c3959f2 = Long.valueOf(Long.parseUnsignedLong(strM6704S0));
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                lValueOf = (Long) c3959f2;
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return new C3354f(null, false);
        }
        Object objM7105k = m7105k();
        if (objM7105k == null) {
            return new C3354f(null, false);
        }
        Method methodM7101f = this.f10820g;
        if (methodM7101f == null) {
            methodM7101f = m7101f(f10810l, new C0456k1(this, objM7105k, 17), "sns_info_get_by_id_v1");
            if (methodM7101f == null) {
                return new C3354f(null, false);
            }
            this.f10820g = methodM7101f;
        } else {
            if (!m7095a(objM7105k.getClass(), methodM7101f)) {
                methodM7101f = null;
            }
            if (methodM7101f == null) {
            }
        }
        try {
            c3959f = KavaReflector.invokeOrThrow(methodM7101f, objM7105k, lValueOf);
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f10817d.invoke("按 ID 读取朋友圈缓存失败: " + thM8182b.getMessage());
        }
        return C3960g.m8182b(c3959f) == null ? new C3354f(c3959f, true) : new C3354f(null, false);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #1 {all -> 0x0071, blocks: (B:23:0x0049, B:26:0x0056, B:28:0x006e), top: B:93:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ed A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:65:0x00dd, B:67:0x00ed), top: B:91:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m7103h(String str, int i9, boolean z9) throws IOException {
        Object objM7105k;
        Object c3959f;
        Throwable thM8182b;
        Cursor cursor;
        Object c3959f2;
        Throwable thM8182b2;
        List listM7104i = C4173t.f13710g;
        if (i9 > 0 && (objM7105k = m7105k()) != null) {
            if (str == null || AbstractC3149m.m6721t0(str)) {
                Method methodM7101f = this.f10822i;
                if (methodM7101f == null) {
                    methodM7101f = m7101f(f10812n, new C0456k1(this, objM7105k, 18), "sns_info_get_timeline_v1");
                    if (methodM7101f != null) {
                        this.f10822i = methodM7101f;
                        if (i9 > 200) {
                            i9 = 200;
                        }
                        try {
                            Object objInvokeOrThrow = KavaReflector.invokeOrThrow(methodM7101f, objM7105k, HttpUrl.FRAGMENT_ENCODE_SET, 0, Integer.valueOf(i9));
                            c3959f = !(objInvokeOrThrow instanceof Cursor) ? (Cursor) objInvokeOrThrow : null;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            this.f10817d.invoke("读取朋友圈时间线缓存失败: " + thM8182b.getMessage());
                        }
                        cursor = (Cursor) (c3959f instanceof C3959f ? null : c3959f);
                        if (cursor != null) {
                            try {
                                listM7104i = m7104i(cursor);
                                cursor.close();
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                    }
                } else {
                    if (!m7097c(objM7105k.getClass(), methodM7101f)) {
                        methodM7101f = null;
                    }
                    if (methodM7101f != null) {
                        if (i9 > 200) {
                        }
                        Object objInvokeOrThrow2 = KavaReflector.invokeOrThrow(methodM7101f, objM7105k, HttpUrl.FRAGMENT_ENCODE_SET, 0, Integer.valueOf(i9));
                        if (!(objInvokeOrThrow2 instanceof Cursor)) {
                        }
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                        }
                        cursor = (Cursor) (c3959f instanceof C3959f ? null : c3959f);
                        if (cursor != null) {
                        }
                    }
                }
            } else {
                Method methodM7101f2 = this.f10821h;
                if (methodM7101f2 == null) {
                    methodM7101f2 = m7101f(f10811m, new C0456k1(this, objM7105k, 14), "sns_info_get_by_user_v1");
                    if (methodM7101f2 != null) {
                        this.f10821h = methodM7101f2;
                        try {
                            Boolean bool = Boolean.FALSE;
                            String string = AbstractC3149m.m6703R0(str).toString();
                            if (i9 > 200) {
                                i9 = 200;
                            }
                            Object objInvokeOrThrow3 = KavaReflector.invokeOrThrow(methodM7101f2, objM7105k, bool, string, Integer.valueOf(i9), Boolean.valueOf(z9), HttpUrl.FRAGMENT_ENCODE_SET, 0, 0);
                            c3959f2 = !(objInvokeOrThrow3 instanceof Cursor) ? (Cursor) objInvokeOrThrow3 : null;
                        } catch (Throwable th3) {
                            c3959f2 = new C3959f(th3);
                        }
                        thM8182b2 = C3960g.m8182b(c3959f2);
                        if (thM8182b2 != null) {
                            this.f10817d.invoke("读取朋友圈缓存列表失败: " + thM8182b2.getMessage());
                        }
                        cursor = (Cursor) (c3959f2 instanceof C3959f ? null : c3959f2);
                        if (cursor != null) {
                            try {
                                List listM7104i2 = m7104i(cursor);
                                cursor.close();
                                return listM7104i2;
                            } finally {
                            }
                        }
                    }
                } else {
                    if (!m7096b(objM7105k.getClass(), methodM7101f2)) {
                        methodM7101f2 = null;
                    }
                    if (methodM7101f2 != null) {
                        Boolean bool2 = Boolean.FALSE;
                        String string2 = AbstractC3149m.m6703R0(str).toString();
                        if (i9 > 200) {
                        }
                        Object objInvokeOrThrow32 = KavaReflector.invokeOrThrow(methodM7101f2, objM7105k, bool2, string2, Integer.valueOf(i9), Boolean.valueOf(z9), HttpUrl.FRAGMENT_ENCODE_SET, 0, 0);
                        if (!(objInvokeOrThrow32 instanceof Cursor)) {
                        }
                        thM8182b2 = C3960g.m8182b(c3959f2);
                        if (thM8182b2 != null) {
                        }
                        cursor = (Cursor) (c3959f2 instanceof C3959f ? null : c3959f2);
                        if (cursor != null) {
                        }
                    }
                }
            }
        }
        return listM7104i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final List m7104i(Cursor cursor) {
        Constructor<?> constructorFindConstructor;
        Method methodFindMethodRecursive;
        Object c3959f;
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.sns.storage.SnsInfo", this.f10815b);
        if (clsLoadClass == null || (constructorFindConstructor = KavaReflector.findConstructor(clsLoadClass, new Class[0])) == null || (methodFindMethodRecursive = KavaReflector.findMethodRecursive(clsLoadClass, "convertFrom", Cursor.class)) == null) {
            return C4173t.f13710g;
        }
        int columnIndex = cursor.getColumnIndex("rowid");
        int count = cursor.getCount();
        if (count < 0) {
            count = 0;
        }
        ArrayList arrayList = new ArrayList(count);
        while (cursor.moveToNext()) {
            Object objNewInstance = KavaReflector.newInstance(constructorFindConstructor, new Object[0]);
            if (objNewInstance != null) {
                try {
                    KavaReflector.invokeOrThrow(methodFindMethodRecursive, objNewInstance, cursor);
                    Integer numValueOf = Integer.valueOf(columnIndex);
                    if (!(columnIndex >= 0)) {
                        numValueOf = null;
                    }
                    c3959f = m7100j(objNewInstance, numValueOf != null ? Long.valueOf(cursor.getLong(numValueOf.intValue())) : null);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                C3355g c3355g = (C3355g) (c3959f instanceof C3959f ? null : c3959f);
                if (c3355g != null) {
                    arrayList.add(c3355g);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7105k() {
        Object c3959f;
        Method method = this.f10819f;
        if (method == null) {
            Context context = this.f10814a;
            ClassLoader classLoader = this.f10815b;
            String strM2091g = C0828b.m2091g(context, classLoader);
            SharedPreferences sharedPreferences = this.f10818e;
            Method methodM2087c = C0828b.m2087c(sharedPreferences, strM2091g, classLoader, "sns_info_storage_getter_v1");
            if (methodM2087c == null) {
                List list = f10809k;
                C1425u c1425u = new C1425u();
                C3740e.m7756c(new RunnableC0059l(c1425u, this, list, 24));
                Object obj = c1425u.f4738g;
                if (obj == null) {
                    AbstractC1416l.m3831g("methods");
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (m7098d((Method) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() != 1) {
                    try {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                            editorEdit.clear().putString("cache.key", strM2091g);
                        }
                        editorEdit.remove("sns_info_storage_getter_v1").apply();
                    } catch (Throwable unused) {
                    }
                    this.f10817d.invoke("朋友圈缓存存储入口数量异常: " + arrayList.size());
                    method = null;
                    if (method == null) {
                        return null;
                    }
                    this.f10819f = method;
                } else {
                    methodM2087c = (Method) AbstractC4166m.m8399H1(arrayList);
                    C0828b.m2092h(sharedPreferences, strM2091g, "sns_info_storage_getter_v1", methodM2087c);
                    method = methodM2087c;
                    if (method == null) {
                    }
                }
            } else {
                if (!m7098d(methodM2087c)) {
                    methodM2087c = null;
                }
                if (methodM2087c != null) {
                    method = methodM2087c;
                    if (method == null) {
                    }
                }
            }
        } else {
            if (!m7098d(method)) {
                method = null;
            }
            if (method == null) {
            }
        }
        try {
            c3959f = KavaReflector.invokeOrThrow(method, null, new Object[0]);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f10817d.invoke("获取朋友圈缓存存储失败: " + thM8182b.getMessage());
        }
        if (c3959f instanceof C3959f) {
            return null;
        }
        return c3959f;
    }
}
