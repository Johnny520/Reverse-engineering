package p153k8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p024b9.C0219e;
import p036c9.C0425c2;
import p077f8.C1083c;
import p096g8.C1360a;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p258r8.C3744i;

/* JADX INFO: renamed from: k8.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2347k {

    /* JADX INFO: renamed from: a */
    public final DexFinder f7701a;

    /* JADX INFO: renamed from: b */
    public final C1360a f7702b;

    /* JADX INFO: renamed from: c */
    public final C2353q f7703c;

    /* JADX INFO: renamed from: d */
    public final C1083c f7704d;

    /* JADX INFO: renamed from: e */
    public final C2002f f7705e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f7706f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f7707g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f7708h = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2347k(DexFinder dexFinder, C1360a c1360a, C2353q c2353q, C1083c c1083c, C2002f c2002f) {
        this.f7701a = dexFinder;
        this.f7702b = c1360a;
        this.f7703c = c2353q;
        this.f7704d = c1083c;
        this.f7705e = c2002f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static long m5609e(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        if (field instanceof Number) {
            return ((Number) field).longValue();
        }
        if (field == null) {
            return 0L;
        }
        try {
            return Long.parseLong(String.valueOf(field));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5610a() {
        if (m5612c()) {
            if (this.f7706f) {
                m5611b();
                return;
            }
            Iterator<Class<?>> it = this.f7701a.addMsgClasses.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                for (Method method : KavaReflector.declaredMethods(it.next())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes != null && parameterTypes.length != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                            C2353q c2353q = this.f7703c;
                            Class<?> cls = parameterTypes[i10];
                            c2353q.getClass();
                            if (C2353q.m5648h(cls)) {
                                arrayList.add(Integer.valueOf(i10));
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C3744i.f12154b.m7763b(method, new C0425c2(7, this, arrayList, false));
                            i9++;
                        }
                    }
                }
            }
            this.f7706f = i9 > 0;
            m5613d("AddMsg事件Hook: " + i9);
            m5611b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5611b() {
        DexFinder dexFinder;
        Method method;
        if (this.f7707g || (dexFinder = this.f7701a) == null || (method = dexFinder.patDisplayTemplateMethod) == null || this.f7704d == null) {
            return;
        }
        C3744i.f12154b.m7763b(method, new C0219e(this, 16));
        this.f7707g = true;
        m5613d("拍一拍事件Hook: " + this.f7701a.patDisplayTemplateMethod.getDeclaringClass().getName() + "#" + this.f7701a.patDisplayTemplateMethod.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m5612c() {
        List<Class<?>> list;
        DexFinder dexFinder = this.f7701a;
        return (dexFinder == null || (list = dexFinder.addMsgClasses) == null || list.isEmpty() || this.f7703c == null || this.f7704d == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5613d(String str) {
        if (this.f7705e != null) {
            C2005i.m4939f("[WeChatMessageEventApi] ".concat(str));
        }
    }
}
