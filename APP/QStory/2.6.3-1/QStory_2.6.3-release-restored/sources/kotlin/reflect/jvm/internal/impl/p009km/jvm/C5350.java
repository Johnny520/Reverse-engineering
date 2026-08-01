package kotlin.reflect.jvm.internal.impl.p009km.jvm;

import com.bumptech.glide.AbstractC3897;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5350 extends AbstractC3897 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13511;

    public C5350(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13511 = str;
        this.f13510 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5350)) {
            return false;
        }
        C5350 c5350 = (C5350) obj;
        return AbstractC5227.m9466(this.f13511, c5350.f13511) && AbstractC5227.m9466(this.f13510, c5350.f13510);
    }

    public final int hashCode() {
        return this.f13510.hashCode() + (this.f13511.hashCode() * 31);
    }

    public final String toString() {
        return this.f13511 + ':' + this.f13510;
    }
}
