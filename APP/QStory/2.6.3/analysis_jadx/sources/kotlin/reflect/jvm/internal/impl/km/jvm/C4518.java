package kotlin.reflect.jvm.internal.impl.km.jvm;

import com.bumptech.glide.AbstractC3065;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4518 extends AbstractC3065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13166;

    public C4518(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13166 = str;
        this.f13165 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4518)) {
            return false;
        }
        C4518 c4518 = (C4518) obj;
        return AbstractC4395.m8907(this.f13166, c4518.f13166) && AbstractC4395.m8907(this.f13165, c4518.f13165);
    }

    public final int hashCode() {
        return this.f13165.hashCode() + (this.f13166.hashCode() * 31);
    }

    public final String toString() {
        return this.f13166 + ':' + this.f13165;
    }
}
