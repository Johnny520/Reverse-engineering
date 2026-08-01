package p340;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9561 extends AbstractC9560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24960;

    public C9561(String str) {
        "name";
        str.getClass();
        this.f24960 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9561) && AbstractC5227.m9466(this.f24960, ((C9561) obj).f24960);
    }

    public final int hashCode() {
        return this.f24960.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Directory(name=");
        return AbstractC0900.m708(sb, this.f24960, ')');
    }
}
