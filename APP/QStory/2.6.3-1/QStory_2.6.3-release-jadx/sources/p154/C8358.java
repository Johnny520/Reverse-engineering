package p154;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8358 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f20750;

    public C8358(ClassLoader classLoader) {
        super(classLoader);
        this.f20750 = new ConcurrentHashMap();
    }

    @Override // java.lang.ClassLoader
    public final Class findClass(String str) throws ClassNotFoundException {
        Class cls = (Class) this.f20750.get(str);
        if (cls != null) {
            return cls;
        }
        throw new ClassNotFoundException(str);
    }
}
