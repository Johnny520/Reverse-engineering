package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3898;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5365 extends AbstractC3898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13547;

    public C5365(String str) {
        str.getClass();
        this.f13547 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5365) && AbstractC5227.m9466(this.f13547, ((C5365) obj).f13547);
    }

    public final int hashCode() {
        return this.f13547.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("Class(name="), this.f13547, ')');
    }
}
