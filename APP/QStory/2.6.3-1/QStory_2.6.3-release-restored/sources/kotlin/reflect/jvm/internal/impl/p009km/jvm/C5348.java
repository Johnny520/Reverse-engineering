package kotlin.reflect.jvm.internal.impl.p009km.jvm;

import com.bumptech.glide.AbstractC3897;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5348 extends AbstractC3897 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13506;

    public C5348(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13506 = str;
        this.f13505 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5348)) {
            return false;
        }
        C5348 c5348 = (C5348) obj;
        return AbstractC5227.m9466(this.f13506, c5348.f13506) && AbstractC5227.m9466(this.f13505, c5348.f13505);
    }

    public final int hashCode() {
        return this.f13505.hashCode() + (this.f13506.hashCode() * 31);
    }

    public final String toString() {
        return this.f13506 + this.f13505;
    }
}
