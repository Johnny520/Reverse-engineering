package p366;

import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9685 implements InterfaceC9683 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ItemUiInfoGroupWrapper f25317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25318;

    public C9685(String str, ItemUiInfoGroupWrapper itemUiInfoGroupWrapper) {
        AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
        this.f25318 = str;
        this.f25317 = itemUiInfoGroupWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9685)) {
            return false;
        }
        C9685 c9685 = (C9685) obj;
        return AbstractC5227.m9466(this.f25318, c9685.f25318) && AbstractC5227.m9466(this.f25317, c9685.f25317);
    }

    @Override // p366.InterfaceC9683
    public final String getKey() {
        return this.f25318;
    }

    public final int hashCode() {
        return this.f25317.hashCode() + (this.f25318.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC9234.m14531(3221) + this.f25318 + AbstractC9234.m14532("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵呜呜~喵呜喵呜呜呜喵喵") + this.f25317 + ')';
    }
}
