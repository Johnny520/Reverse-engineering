package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4552 extends AbstractC4548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13304;

    public C4552(String str) {
        str.getClass();
        this.f13304 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4552) && AbstractC4395.m8907(this.f13304, ((C4552) obj).f13304);
    }

    public final int hashCode() {
        return this.f13304.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("KClassValue("), this.f13304, ')');
    }
}
