package p093;

import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import p088.C7752;

/* JADX INFO: renamed from: 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7799 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7752 f19005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f19006;

    public C7799(Class cls, C7752 c7752) {
        this.f19006 = cls;
        this.f19005 = c7752;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7799) {
            return AbstractC5227.m9466(this.f19006, ((C7799) obj).f19006);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19006.hashCode();
    }

    public final String toString() {
        return C7799.class.getName() + ": " + this.f19006;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m12844() {
        String strReplace = this.f19006.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        strReplace.getClass();
        return strReplace.concat(ClassFileLocator.CLASS_FILE_EXTENSION);
    }
}
