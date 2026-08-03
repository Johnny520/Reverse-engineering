package p196n8;

import android.os.Handler;
import android.os.Looper;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p009a9.C0031h;
import p050da.C0761g;
import p089g1.C1275d;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2005i;
import p183m8.C2815c;
import p218og.AbstractC3149m;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: n8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2911c {

    /* JADX INFO: renamed from: a */
    public final DexFinder f9404a;

    /* JADX INFO: renamed from: b */
    public final C2815c f9405b;

    /* JADX INFO: renamed from: c */
    public final Handler f9406c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final Map f9407d = Collections.synchronizedMap(new IdentityHashMap());

    /* JADX INFO: renamed from: e */
    public volatile boolean f9408e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2911c(DexFinder dexFinder, C2815c c2815c, C1275d c1275d) {
        this.f9404a = dexFinder;
        this.f9405b = c2815c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m6313a(C2911c c2911c, Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        int i9 = 0;
        for (Class<?> cls : parameterTypes) {
            if (AbstractC1416l.m3825a(cls, Long.TYPE) || AbstractC1416l.m3825a(cls, Long.class)) {
                i9 = 2;
                break;
            }
        }
        return (parameterTypes.length < 10 || !AbstractC1416l.m3825a(parameterTypes[9], String.class)) ? i9 : i9 + 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Object[] m6314b(Class[] clsArr, String str, C2909a c2909a) {
        String str2 = c2909a.f9396h;
        String str3 = c2909a.f9399k;
        String str4 = c2909a.f9398j;
        String str5 = c2909a.f9400l;
        long j3 = c2909a.f9397i;
        String str6 = c2909a.f9389a;
        int i9 = c2909a.f9395g;
        String str7 = c2909a.f9394f;
        int i10 = c2909a.f9393e;
        String str8 = c2909a.f9392d;
        int i11 = c2909a.f9391c;
        String str9 = c2909a.f9390b;
        switch (clsArr.length) {
            case 9:
                return new Object[]{str6, str9, Integer.valueOf(i11), str, str8, Integer.valueOf(i10), str7, Integer.valueOf(i9), null};
            case 10:
                return new Object[]{str6, str9, Integer.valueOf(i11), str, str8, Integer.valueOf(i10), str4, str7, Integer.valueOf(i9), null};
            case 11:
            default:
                return new Object[0];
            case 12:
                return new Object[]{str6, str9, Integer.valueOf(i11), str, str8, Integer.valueOf(i10), str7, Integer.valueOf(i9), null, Long.valueOf(j3), str5, str3};
            case 13:
                return m6315d((Class) AbstractC4165l.m8366C0(7, clsArr)) ? new Object[]{str6, str9, Integer.valueOf(i11), str, str8, Integer.valueOf(i10), str7, Integer.valueOf(i9), str2, null, Long.valueOf(j3), str5} : new Object[]{str6, str9, Integer.valueOf(i11), str, str8, Integer.valueOf(i10), str4, str7, Integer.valueOf(i9), null, Long.valueOf(j3), str5, str3};
            case 14:
                return new Object[]{str6, str9, Integer.valueOf(i11), str, str8, Integer.valueOf(i10), str4, str7, Integer.valueOf(i9), str2, null, Long.valueOf(j3), str5, str3};
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m6315d(Class cls) {
        return AbstractC1416l.m3825a(cls, Integer.TYPE) || AbstractC1416l.m3825a(cls, Integer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m6316c() {
        return this.f9404a.hasTransferOperationApi();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6317e(String str) {
        C2005i.m4939f("[WeChatTransferApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m6318f(String str, C2909a c2909a) {
        if (!str.equals("confirm") && !str.equals("refuse")) {
            m6317e("转账操作失败: op无效");
            return false;
        }
        if (AbstractC3149m.m6721t0(c2909a.f9389a) || AbstractC3149m.m6721t0(c2909a.f9390b) || AbstractC3149m.m6721t0(c2909a.f9392d)) {
            m6317e("转账操作失败: transactionId/transId/username缺失");
            return false;
        }
        Class<?> cls = this.f9404a.transferOperationClass;
        if (cls == null) {
            m6317e("转账操作失败: transferOperationClass为空");
            return false;
        }
        List<Constructor<?>> listDeclaredConstructors = KavaReflector.declaredConstructors(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDeclaredConstructors) {
            Class<?>[] parameterTypes = ((Constructor) obj).getParameterTypes();
            if (AbstractC4156d0.m8355W(9, 10, 12, 13, 14).contains(Integer.valueOf(parameterTypes.length)) && parameterTypes.length >= 6 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class) && m6315d(parameterTypes[2]) && AbstractC1416l.m3825a(parameterTypes[3], String.class) && AbstractC1416l.m3825a(parameterTypes[4], String.class) && m6315d(parameterTypes[5])) {
                arrayList.add(obj);
            }
        }
        Iterator it = AbstractC4166m.m8402K1(arrayList, new C0761g(new C0031h(23), this, 3)).iterator();
        Object objNewInstance = null;
        String str2 = null;
        while (true) {
            if (it.hasNext()) {
                Constructor constructor = (Constructor) it.next();
                try {
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    parameterTypes2.getClass();
                    Object[] objArrM6314b = m6314b(parameterTypes2, str, c2909a);
                    objNewInstance = KavaReflector.newInstance(constructor, Arrays.copyOf(objArrM6314b, objArrM6314b.length));
                    break;
                } catch (Throwable th2) {
                    str2 = constructor.getParameterTypes().length + ": " + th2.getMessage();
                }
            } else {
                m6317e("转账操作失败: 无合适构造".concat(str2 != null ? ", last=".concat(str2) : HttpUrl.FRAGMENT_ENCODE_SET));
            }
        }
        if (objNewInstance != null) {
            try {
                KavaReflector.invoke(KavaReflector.findMethod(objNewInstance.getClass(), "setProcessName", String.class), objNewInstance, "RemittanceProcess");
            } catch (Throwable unused) {
            }
            z = this.f9405b.m6216j(objNewInstance);
            if (!z) {
                m6317e("转账操作失败: 发包失败 op=" + str + " request=" + objNewInstance.getClass().getName());
            }
        }
        return z;
    }
}
