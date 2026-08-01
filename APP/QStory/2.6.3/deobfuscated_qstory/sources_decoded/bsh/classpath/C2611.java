package bsh.classpath;

import p138.AbstractC7530;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2611 extends C2607 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C2611 f7819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DiscreteFilesClassLoader$ClassSourceMap f7820;

    @Override // bsh.classpath.C2607, java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        AbstractC2608 abstractC2608 = this.f7820.get((Object) str);
        if (abstractC2608 == null) {
            return super.findClass(str);
        }
        byte[] bArrMo5144 = abstractC2608.mo5144(str);
        ClassManagerImpl classManagerImpl = (ClassManagerImpl) this.f7800;
        Class clsM12754 = AbstractC7530.m12754(str, bArrMo5144, classManagerImpl.f7963);
        classManagerImpl.f7963.f20405.put(str, clsM12754);
        return clsM12754;
    }

    public final String toString() {
        return super.toString() + "for files: " + this.f7820;
    }
}
