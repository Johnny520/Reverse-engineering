package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5384 extends AbstractC5380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13649;

    public C5384(String str) {
        str.getClass();
        this.f13649 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5384) && AbstractC5227.m9466(this.f13649, ((C5384) obj).f13649);
    }

    public final int hashCode() {
        return this.f13649.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("KClassValue("), this.f13649, ')');
    }
}
