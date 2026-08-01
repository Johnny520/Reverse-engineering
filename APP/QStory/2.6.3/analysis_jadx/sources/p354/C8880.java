package p354;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8880 extends AbstractC8882 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f25037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final GroupInfo f25038;

    public C8880(GroupInfo groupInfo, boolean z) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜");
        this.f25038 = groupInfo;
        this.f25037 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8880)) {
            return false;
        }
        C8880 c8880 = (C8880) obj;
        return AbstractC4395.m8907(this.f25038, c8880.f25038) && this.f25037 == c8880.f25037;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25037) + (this.f25038.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2937));
        sb.append(this.f25038);
        sb.append(AbstractC8405.m13972(2938));
        return AbstractC0053.m152(sb, this.f25037, ')');
    }
}
