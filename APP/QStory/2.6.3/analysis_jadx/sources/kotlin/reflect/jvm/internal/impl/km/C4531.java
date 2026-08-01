package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3066;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4531 extends AbstractC3066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13200;

    public C4531(int i) {
        this.f13200 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4531) && this.f13200 == ((C4531) obj).f13200;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13200);
    }

    public final String toString() {
        return AbstractC0053.m156(new StringBuilder("TypeParameter(id="), this.f13200, ')');
    }
}
