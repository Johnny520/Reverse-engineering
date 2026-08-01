package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0900;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5435 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f13794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f13795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5523 f13797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13798;

    public C5435(String str, C5523 c5523, String str2, String str3) {
        this.f13798 = str;
        this.f13797 = c5523;
        this.f13796 = str2;
        this.f13795 = str3;
        this.f13794 = AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str, c5523 + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5435)) {
            return false;
        }
        C5435 c5435 = (C5435) obj;
        return this.f13798.equals(c5435.f13798) && this.f13797.equals(c5435.f13797) && this.f13796.equals(c5435.f13796) && this.f13795.equals(c5435.f13795);
    }

    public final int hashCode() {
        return this.f13795.hashCode() + AbstractC7012.m12131((this.f13797.hashCode() + (this.f13798.hashCode() * 31)) * 31, 31, this.f13796);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f13798);
        sb.append(", name=");
        sb.append(this.f13797);
        sb.append(", parameters=");
        sb.append(this.f13796);
        sb.append(", returnType=");
        return AbstractC0900.m708(sb, this.f13795, ')');
    }
}
