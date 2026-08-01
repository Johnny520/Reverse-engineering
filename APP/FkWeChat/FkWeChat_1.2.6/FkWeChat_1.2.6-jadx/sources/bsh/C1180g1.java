package bsh;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: bsh.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1180g1 implements Supplier, Consumer {

    /* JADX INFO: renamed from: b */
    public static final C1180g1 f3555b;

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f3556c;

    /* JADX INFO: renamed from: d */
    public static final Map f3557d;

    /* JADX INFO: renamed from: a */
    public volatile boolean f3558a = true;

    /* JADX INFO: renamed from: bsh.g1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends C1279w4 {
        public a(String str) {
            super(str);
        }
    }

    static {
        C1180g1 c1180g1 = new C1180g1();
        f3555b = c1180g1;
        f3556c = ThreadLocal.withInitial(c1180g1);
        f3557d = new WeakHashMap();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4326b(String str) {
        Map map = f3557d;
        if (!map.containsKey(str)) {
            try {
                map.put(str, Class.forName(str));
            } catch (ClassNotFoundException unused) {
                f3557d.put(str, null);
            }
        }
        return m4327d(str) != null;
    }

    /* JADX INFO: renamed from: d */
    public static Class m4327d(String str) {
        return (Class) f3557d.get(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4328e() {
        return ((Boolean) f3556c.get()).booleanValue();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Boolean bool) {
        this.f3558a = bool.booleanValue();
    }

    @Override // java.util.function.Supplier
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(this.f3558a);
    }
}
