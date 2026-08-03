package p153k8;

import android.text.TextUtils;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;
import p024b9.C0219e;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: k8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2341e {

    /* JADX INFO: renamed from: a */
    public final DexFinder f7669a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal f7670b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public volatile boolean f7671c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2341e(DexFinder dexFinder, C2002f c2002f) {
        this.f7669a = dexFinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m5565a(Object obj, int i9, String... strArr) {
        Class cls = Integer.TYPE;
        cls.getClass();
        return m5566b(obj, cls, Integer.valueOf(i9), (String[]) Arrays.copyOf(strArr, strArr.length)) || m5566b(obj, Integer.class, Integer.valueOf(i9), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m5566b(Object obj, Class cls, Object obj2, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4178y.m8438a0(strArr.length));
        AbstractC4165l.m8373J0(strArr, linkedHashSet);
        Iterator it = AbstractC4166m.m8407P1(linkedHashSet).iterator();
        while (it.hasNext()) {
            Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(obj.getClass(), (String) it.next(), cls);
            if (methodFindMethodRecursive != null && KavaReflector.invokeSuccessfully(methodFindMethodRecursive, obj, obj2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m5567i(Object obj, int i9, String... strArr) {
        for (String str : strArr) {
            Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str);
            if (fieldFindFieldRecursive != null && KavaReflector.writeField(fieldFindFieldRecursive, obj, Integer.valueOf(i9))) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m5568j(Object obj, long j3, String... strArr) {
        for (String str : strArr) {
            Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str);
            if (fieldFindFieldRecursive != null && KavaReflector.writeField(fieldFindFieldRecursive, obj, Long.valueOf(j3))) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m5569k(Object obj, String str, String... strArr) {
        for (String str2 : strArr) {
            Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str2);
            if (fieldFindFieldRecursive != null && KavaReflector.writeField(fieldFindFieldRecursive, obj, str)) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5570c() {
        DexFinder dexFinder = this.f7669a;
        if (!dexFinder.hasLocalMessageApi() || dexFinder.localMessageCreateTimeMethod == null) {
            dexFinder.resolveLocalMessageApi();
        }
        m5574g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5571d(Object obj, String str, String str2, long j3, boolean z9) {
        long jLongValue;
        if (z9) {
            Method method = this.f7669a.localMessageCreateTimeMethod;
            if (method == null) {
                jLongValue = j3;
            } else {
                Object objInvoke = KavaReflector.invoke(method, null, str, Long.valueOf(j3 > RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j3 / 1000 : j3));
                Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                if (number != null) {
                    jLongValue = number.longValue();
                }
            }
        } else if (j3 > 0 && j3 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            jLongValue = 1000 * j3;
        }
        if (!m5565a(obj, 0, "U0", "k1", "j1")) {
            m5567i(obj, 0, "field_isSend", "isSend");
        }
        if (!m5566b(obj, String.class, str, (String[]) Arrays.copyOf(new String[]{"i1", "A1", "H1", "C1", "u1"}, 5))) {
            m5569k(obj, str, "field_talker", "talker");
        }
        if (!m5565a(obj, 3, "h1", "z1", "E1", "y1", "t1", "r1")) {
            m5567i(obj, 3, "field_status", "status");
        }
        if (!m5566b(obj, String.class, str2, (String[]) Arrays.copyOf(new String[]{"J0", "Y0", "d1", "c1"}, 4))) {
            m5569k(obj, str2, "field_content", "content");
        }
        String[] strArr = {"K0", "a1", "f1", "e1", "d1"};
        Class cls = Long.TYPE;
        cls.getClass();
        if (!m5566b(obj, cls, Long.valueOf(jLongValue), (String[]) Arrays.copyOf(strArr, 5)) && !m5566b(obj, Long.class, Long.valueOf(jLongValue), (String[]) Arrays.copyOf(strArr, 5))) {
            m5568j(obj, jLongValue, "field_createTime", "createTime");
        }
        if (!m5565a(obj, 10000, "setType")) {
            m5567i(obj, 10000, "field_type", "type");
        }
        m5568j(obj, 0L, "field_msgSvrId", "msgSvrId");
        m5569k(obj, HttpUrl.FRAGMENT_ENCODE_SET, "field_imgPath", "imgPath");
        m5569k(obj, HttpUrl.FRAGMENT_ENCODE_SET, "field_reserved", "reserved");
        m5569k(obj, HttpUrl.FRAGMENT_ENCODE_SET, "field_transContent", "transContent");
        m5569k(obj, HttpUrl.FRAGMENT_ENCODE_SET, "field_msgSource", "msgSource");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m5572e(String str, String str2, long j3, boolean z9) {
        Object c3959f;
        Long lValueOf;
        Object objNewInstance;
        Object obj;
        String str3;
        String str4;
        long jLongValue;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5575h("插入系统消息失败: talker/content 为空");
            return 0L;
        }
        DexFinder dexFinder = this.f7669a;
        if (!dexFinder.hasLocalMessageApi()) {
            m5575h("插入系统消息失败: 本地消息API未就绪");
            return 0L;
        }
        if (!z9 && !m5574g()) {
            m5575h("插入系统消息失败: createTime hook 未就绪");
            return 0L;
        }
        String str5 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        String str6 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        if (z9) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf((j3 <= 0 || j3 >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) ? j3 : 1000 * j3);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
        }
        Long lM5573f = m5573f(dexFinder, str5, str6, lValueOf);
        if (lM5573f != null) {
            jLongValue = lM5573f.longValue();
        } else {
            String str7 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
            Constructor<?> constructor = dexFinder.localMessageCtor;
            if (constructor != null) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                parameterTypes.getClass();
                objNewInstance = parameterTypes.length == 0 ? KavaReflector.newInstance(constructor, new Object[0]) : KavaReflector.newInstance(constructor, str7);
            } else {
                objNewInstance = null;
            }
            if (objNewInstance == null) {
                throw new IllegalStateException("消息对象创建失败");
            }
            String str8 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
            if (str2 == null) {
                String str9 = str8;
                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                obj = objNewInstance;
                str3 = str9;
            } else {
                obj = objNewInstance;
                str3 = str8;
                str4 = str2;
            }
            m5571d(obj, str3, str4, j3, z9);
            Object objInvoke = KavaReflector.invoke(dexFinder.localMessageInsertMethod, null, obj);
            Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
            jLongValue = number != null ? number.longValue() : 0L;
        }
        c3959f = Long.valueOf(jLongValue);
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            m5575h("插入系统消息失败: " + thM8182b.getMessage());
        }
        if (c3959f instanceof C3959f) {
            c3959f = 0L;
        }
        return ((Number) c3959f).longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[PHI: r0
  0x004b: PHI (r0v30 java.lang.Object) = (r0v5 java.lang.Object), (r0v7 java.lang.Object), (r0v13 java.lang.Object), (r0v29 java.lang.Object) binds: [B:25:0x0049, B:28:0x005a, B:75:0x011b, B:33:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long m5573f(DexFinder dexFinder, String str, String str2, Long l10) {
        Object objNewInstanceByArgs;
        C3959f c3959f;
        Class<?> clsLoadClass;
        Object field;
        Method method = dexFinder.localSystemMessageMethod;
        Object obj = null;
        if (method == null) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (declaringClass != null) {
            Object objM4995A = AbstractC2043a.m4995A(dexFinder, declaringClass);
            if (objM4995A == null && (objM4995A = KavaReflector.staticInstance(declaringClass)) == null) {
                Iterator<Field> it = KavaReflector.declaredFields(declaringClass).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objNewInstanceByArgs = null;
                        break;
                    }
                    Field next = it.next();
                    if (KavaReflector.isStatic(next) && declaringClass.isAssignableFrom(next.getType()) && (objNewInstanceByArgs = KavaReflector.readField(next, (Object) null)) != null) {
                        break;
                    }
                }
                if (objNewInstanceByArgs != null) {
                    obj = objNewInstanceByArgs;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i9 = 0;
                    objNewInstanceByArgs = KavaReflector.newInstanceByArgs(declaringClass, new Object[0]);
                    if (objNewInstanceByArgs == null) {
                        try {
                            Constructor<?> constructorFindConstructor = KavaReflector.findConstructor(declaringClass, new Class[0]);
                            if (constructorFindConstructor != null) {
                                objNewInstanceByArgs = KavaReflector.newInstance(constructorFindConstructor, new Object[0]);
                            }
                            c3959f = null;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            arrayList.add("KavaCtor=" + thM8182b.getClass().getSimpleName() + ":" + thM8182b.getMessage());
                        }
                        String[] strArr = {"sun.misc.Unsafe", "jdk.internal.misc.Unsafe"};
                        while (true) {
                            if (i9 >= 2) {
                                objNewInstanceByArgs = null;
                                break;
                            }
                            try {
                                clsLoadClass = KavaReflector.loadClass(strArr[i9], declaringClass.getClassLoader());
                            } catch (Throwable th3) {
                                objNewInstanceByArgs = new C3959f(th3);
                            }
                            if (clsLoadClass != null) {
                                Iterator<T> it2 = KavaReflector.declaredFields(clsLoadClass).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        field = null;
                                        break;
                                    }
                                    Field field2 = (Field) it2.next();
                                    field = (KavaReflector.isStatic(field2) && clsLoadClass.isAssignableFrom(field2.getType())) ? KavaReflector.readField(field2, (Object) null) : null;
                                    if (field != null) {
                                        break;
                                    }
                                }
                                objNewInstanceByArgs = field != null ? KavaReflector.invoke(KavaReflector.findDeclaredMethod(clsLoadClass, "allocateInstance", Class.class), field, declaringClass) : null;
                                if (objNewInstanceByArgs instanceof C3959f) {
                                    objNewInstanceByArgs = null;
                                }
                                if (objNewInstanceByArgs != null) {
                                    break;
                                }
                                i9++;
                            }
                        }
                        if (objNewInstanceByArgs == null) {
                            arrayList.add("UnsafeAllocate=null");
                        }
                        if (objNewInstanceByArgs == null) {
                            m5575h("系统消息API实例创建失败: owner=" + declaringClass.getName() + " service=false static=false " + AbstractC4166m.m8392A1(arrayList, ";", null, null, null, 62));
                        }
                    }
                }
            } else {
                obj = objM4995A;
            }
        }
        if (obj == null) {
            C2104o.m5276A("系统消息API实例创建失败");
            return null;
        }
        ThreadLocal threadLocal = this.f7670b;
        if (l10 != null) {
            threadLocal.set(new C2340d(str, l10.longValue()));
        }
        try {
            KavaReflector.invoke(method, obj, str, str2, HttpUrl.FRAGMENT_ENCODE_SET);
            if (l10 != null) {
                threadLocal.remove();
            }
            return 1L;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m5574g() {
        if (this.f7671c) {
            return true;
        }
        DexFinder dexFinder = this.f7669a;
        if (dexFinder.localMessageCreateTimeMethod == null) {
            dexFinder.resolveLocalMessageApi();
        }
        Method method = dexFinder.localMessageCreateTimeMethod;
        if (method == null) {
            return false;
        }
        synchronized (this) {
            if (this.f7671c) {
                return true;
            }
            C3744i.f12154b.m7763b(method, new C0219e(this, 15));
            this.f7671c = true;
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m5575h(String str) {
        XposedBridge.log("[Hchat:LocalMessage] ".concat(str));
        C2005i.m4939f("[WeChatLocalMessageApi] ".concat(str));
    }
}
