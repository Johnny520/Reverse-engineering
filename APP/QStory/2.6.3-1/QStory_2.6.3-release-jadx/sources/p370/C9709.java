package p370;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9709 extends AbstractC9711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f25382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final GroupInfo f25383;

    public C9709(GroupInfo groupInfo, boolean z) {
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜");
        this.f25383 = groupInfo;
        this.f25382 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9709)) {
            return false;
        }
        C9709 c9709 = (C9709) obj;
        return AbstractC5227.m9466(this.f25383, c9709.f25383) && this.f25382 == c9709.f25382;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25382) + (this.f25383.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2937));
        sb.append(this.f25383);
        sb.append(AbstractC9234.m14531(2938));
        return AbstractC0900.m712(sb, this.f25382, ')');
    }
}
