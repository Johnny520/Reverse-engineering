package p138;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7528 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f20410;

    public C7528(ClassLoader classLoader) {
        super(classLoader);
        this.f20410 = new ConcurrentHashMap();
    }

    @Override // java.lang.ClassLoader
    public final Class findClass(String str) throws ClassNotFoundException {
        Class cls = (Class) this.f20410.get(str);
        if (cls != null) {
            return cls;
        }
        throw new ClassNotFoundException(str);
    }
}
