package p077;

import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import p072.C6922;

/* JADX INFO: renamed from: 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6922 f18665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f18666;

    public C6969(Class cls, C6922 c6922) {
        this.f18666 = cls;
        this.f18665 = c6922;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6969) {
            return AbstractC4394.m8917(this.f18666, ((C6969) obj).f18666);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18666.hashCode();
    }

    public final String toString() {
        return C6969.class.getName() + ": " + this.f18666;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m12258() {
        String strReplace = this.f18666.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        strReplace.getClass();
        return strReplace.concat(ClassFileLocator.CLASS_FILE_EXTENSION);
    }
}
