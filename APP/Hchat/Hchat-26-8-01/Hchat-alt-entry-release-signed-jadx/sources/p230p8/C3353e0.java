package p230p8;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p086fh.C1253k;
import p115hh.C1730o;
import p115hh.C1731p;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: p8.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3353e0 {

    /* JADX INFO: renamed from: a */
    public final Context f10797a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f10798b;

    /* JADX INFO: renamed from: c */
    public final DexKitBridge f10799c;

    /* JADX INFO: renamed from: d */
    public final C3364p f10800d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f10801e;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList f10802f;

    /* JADX INFO: renamed from: g */
    public final ThreadLocal f10803g;

    /* JADX INFO: renamed from: h */
    public volatile Method f10804h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3353e0(Context context, ClassLoader classLoader, DexKitBridge dexKitBridge, C3364p c3364p) {
        classLoader.getClass();
        this.f10797a = context;
        this.f10798b = classLoader;
        this.f10799c = dexKitBridge;
        this.f10800d = c3364p;
        this.f10801e = AbstractC4302b.m8640c(context, "Hchat_sns_post_observer_cache");
        this.f10802f = new CopyOnWriteArrayList();
        this.f10803g = new ThreadLocal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m7093a(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], Long.TYPE) && parameterTypes[1].getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo") && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.sns.storage.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x00a5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public final Method m7094b() {
        ?? c3959f;
        Object c3959f2;
        DexKitBridge dexKitBridge = this.f10799c;
        if (dexKitBridge == null) {
            return null;
        }
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("com.tencent.mm.plugin.sns.storage.SnsInfoStorage", "replaceUserBySnsId"));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(this.f10798b);
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
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m7093a((Method) obj)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Method) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        C3364p c3364p = this.f10800d;
        if (thM8182b != null) {
            c3364p.invoke("定位朋友圈入库方法失败: " + thM8182b.getMessage());
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r32 = c3959f;
        if (z9) {
            r32 = C4173t.f13710g;
        }
        List list = (List) r32;
        if (list.size() == 1) {
            return (Method) AbstractC4166m.m8399H1(list);
        }
        c3364p.invoke("朋友圈入库方法数量异常: " + list.size());
        return null;
    }
}
