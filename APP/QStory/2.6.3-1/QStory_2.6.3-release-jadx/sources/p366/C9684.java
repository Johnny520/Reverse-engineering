package p366;

import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9684 implements InterfaceC9683 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final OtherViewItemInfo f25315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25316;

    public C9684(String str, OtherViewItemInfo otherViewItemInfo) {
        AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
        this.f25316 = str;
        this.f25315 = otherViewItemInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9684)) {
            return false;
        }
        C9684 c9684 = (C9684) obj;
        return AbstractC5227.m9466(this.f25316, c9684.f25316) && AbstractC5227.m9466(this.f25315, c9684.f25315);
    }

    @Override // p366.InterfaceC9683
    public final String getKey() {
        return this.f25316;
    }

    public final int hashCode() {
        return this.f25315.hashCode() + (this.f25316.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC9234.m14531(3222) + this.f25316 + AbstractC9234.m14532("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵呜呜~喵呜喵呜呜呜喵喵") + this.f25315 + ')';
    }
}
