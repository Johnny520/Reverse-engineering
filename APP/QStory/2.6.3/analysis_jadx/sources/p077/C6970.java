package p077;

import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import p072.C6923;

/* JADX INFO: renamed from: 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6923 f18660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f18661;

    public C6970(Class cls, C6923 c6923) {
        this.f18661 = cls;
        this.f18660 = c6923;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6970) {
            return AbstractC4395.m8907(this.f18661, ((C6970) obj).f18661);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18661.hashCode();
    }

    public final String toString() {
        return C6970.class.getName() + ": " + this.f18661;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m12285() {
        String strReplace = this.f18661.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        strReplace.getClass();
        return strReplace.concat(ClassFileLocator.CLASS_FILE_EXTENSION);
    }
}
