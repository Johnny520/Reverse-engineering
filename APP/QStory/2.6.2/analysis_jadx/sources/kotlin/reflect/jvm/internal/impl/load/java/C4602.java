package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4602 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f13445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f13446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4690 f13448;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13449;

    public C4602(String str, C4690 c4690, String str2, String str3) {
        this.f13449 = str;
        this.f13448 = c4690;
        this.f13447 = str2;
        this.f13446 = str3;
        this.f13445 = AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str, c4690 + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4602)) {
            return false;
        }
        C4602 c4602 = (C4602) obj;
        return this.f13449.equals(c4602.f13449) && this.f13448.equals(c4602.f13448) && this.f13447.equals(c4602.f13447) && this.f13446.equals(c4602.f13446);
    }

    public final int hashCode() {
        return this.f13446.hashCode() + AbstractC6136.m11539((this.f13448.hashCode() + (this.f13449.hashCode() * 31)) * 31, 31, this.f13447);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f13449);
        sb.append(", name=");
        sb.append(this.f13448);
        sb.append(", parameters=");
        sb.append(this.f13447);
        sb.append(", returnType=");
        return AbstractC0053.m155(sb, this.f13446, ')');
    }
}
