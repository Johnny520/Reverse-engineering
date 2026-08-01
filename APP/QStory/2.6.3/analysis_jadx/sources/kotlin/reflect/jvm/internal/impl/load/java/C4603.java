package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4603 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f13449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f13450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4691 f13452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13453;

    public C4603(String str, C4691 c4691, String str2, String str3) {
        this.f13453 = str;
        this.f13452 = c4691;
        this.f13451 = str2;
        this.f13450 = str3;
        this.f13449 = AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str, c4691 + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4603)) {
            return false;
        }
        C4603 c4603 = (C4603) obj;
        return this.f13453.equals(c4603.f13453) && this.f13452.equals(c4603.f13452) && this.f13451.equals(c4603.f13451) && this.f13450.equals(c4603.f13450);
    }

    public final int hashCode() {
        return this.f13450.hashCode() + AbstractC6183.m11572((this.f13452.hashCode() + (this.f13453.hashCode() * 31)) * 31, 31, this.f13451);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f13453);
        sb.append(", name=");
        sb.append(this.f13452);
        sb.append(", parameters=");
        sb.append(this.f13451);
        sb.append(", returnType=");
        return AbstractC0053.m148(sb, this.f13450, ')');
    }
}
