package bsh.classpath;

import p154.AbstractC8359;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3444 extends C3440 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C3444 f8164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DiscreteFilesClassLoader$ClassSourceMap f8165;

    @Override // bsh.classpath.C3440, java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        AbstractC3441 abstractC3441 = this.f8165.get((Object) str);
        if (abstractC3441 == null) {
            return super.findClass(str);
        }
        byte[] bArrMo5704 = abstractC3441.mo5704(str);
        ClassManagerImpl classManagerImpl = (ClassManagerImpl) this.f8145;
        Class clsM13313 = AbstractC8359.m13313(str, bArrMo5704, classManagerImpl.f8308);
        classManagerImpl.f8308.f20750.put(str, clsM13313);
        return clsM13313;
    }

    public final String toString() {
        return super.toString() + "for files: " + this.f8165;
    }
}
