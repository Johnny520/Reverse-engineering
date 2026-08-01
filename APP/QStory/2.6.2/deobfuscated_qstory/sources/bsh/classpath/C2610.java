package bsh.classpath;

import p138.AbstractC7529;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2610 extends C2606 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C2610 f7817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DiscreteFilesClassLoader$ClassSourceMap f7818;

    @Override // bsh.classpath.C2606, java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        AbstractC2607 abstractC2607 = this.f7818.get((Object) str);
        if (abstractC2607 == null) {
            return super.findClass(str);
        }
        byte[] bArrMo5099 = abstractC2607.mo5099(str);
        ClassManagerImpl classManagerImpl = (ClassManagerImpl) this.f7798;
        Class clsM12725 = AbstractC7529.m12725(str, bArrMo5099, classManagerImpl.f7961);
        classManagerImpl.f7961.f20410.put(str, clsM12725);
        return clsM12725;
    }

    public final String toString() {
        return super.toString() + "for files: " + this.f7818;
    }
}
