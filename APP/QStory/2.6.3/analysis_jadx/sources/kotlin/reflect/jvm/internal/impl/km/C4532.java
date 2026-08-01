package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3066;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4532 extends AbstractC3066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13201;

    public C4532(String str) {
        str.getClass();
        this.f13201 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4532) && AbstractC4395.m8907(this.f13201, ((C4532) obj).f13201);
    }

    public final int hashCode() {
        return this.f13201.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("TypeAlias(name="), this.f13201, ')');
    }
}
