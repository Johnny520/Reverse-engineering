package p382;

import p389.AbstractC9090;
import p389.C9091;

/* JADX INFO: renamed from: 飘花落叶言苏楪世哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9000 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ClassLoader f25273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f25274;

    public C9000(ClassLoader classLoader) {
        this.f25274 = classLoader;
        C9091 c9091 = AbstractC9090.f25477;
        c9091.getClass();
        this.f25273 = c9091;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r3.equals("androidx.lifecycle.ReportFragment") != false) goto L28;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class loadClass(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            java.lang.ClassLoader r4 = r2.f25274
            r3.getClass()
            java.lang.String r0 = "androidx.compose"
            r1 = 0
            boolean r0 = kotlin.text.AbstractC5139.m10139(r3, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L32
            if (r0 != 0) goto L2d
            java.lang.String r0 = "androidx.navigation"
            boolean r0 = kotlin.text.AbstractC5139.m10139(r3, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L32
            if (r0 != 0) goto L2d
            java.lang.String r0 = "androidx.activity"
            boolean r0 = kotlin.text.AbstractC5139.m10139(r3, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L32
            if (r0 == 0) goto L1f
            goto L2d
        L1f:
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L32
            r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L32
            java.lang.Class r2 = r0.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L32
            return r2
        L2d:
            java.lang.Class r2 = r4.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L32
            return r2
        L32:
            int r0 = r3.hashCode()     // Catch: java.lang.ClassNotFoundException -> L64
            switch(r0) {
                case -1618810579: goto L55;
                case -629067507: goto L4c;
                case 304606962: goto L43;
                case 1358252749: goto L3a;
                default: goto L39;
            }     // Catch: java.lang.ClassNotFoundException -> L64
        L39:
            goto L64
        L3a:
            java.lang.String r0 = "androidx.savedstate.SavedStateRegistryOwner"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.ClassNotFoundException -> L64
            if (r0 != 0) goto L5d
            goto L64
        L43:
            java.lang.String r0 = "androidx.lifecycle.LifecycleOwner"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.ClassNotFoundException -> L64
            if (r0 != 0) goto L5d
            goto L64
        L4c:
            java.lang.String r0 = "androidx.lifecycle.ViewModelStoreOwner"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.ClassNotFoundException -> L64
            if (r0 != 0) goto L5d
            goto L64
        L55:
            java.lang.String r0 = "androidx.lifecycle.ReportFragment"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.ClassNotFoundException -> L64
            if (r0 == 0) goto L64
        L5d:
            java.lang.ClassLoader r2 = r2.f25273     // Catch: java.lang.ClassNotFoundException -> L64
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L64
            return r2
        L64:
            java.lang.Class r2 = r4.loadClass(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p382.C9000.loadClass(java.lang.String, boolean):java.lang.Class");
    }
}
