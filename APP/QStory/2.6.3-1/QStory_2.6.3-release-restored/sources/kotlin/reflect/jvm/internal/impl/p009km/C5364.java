package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3898;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5364 extends AbstractC3898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13546;

    public C5364(String str) {
        str.getClass();
        this.f13546 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5364) && AbstractC5227.m9466(this.f13546, ((C5364) obj).f13546);
    }

    public final int hashCode() {
        return this.f13546.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("TypeAlias(name="), this.f13546, ')');
    }
}
