package p350;

import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8857 implements InterfaceC8854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ItemUiInfo f24974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24975;

    public C8857(String str, ItemUiInfo itemUiInfo) {
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
        this.f24975 = str;
        this.f24974 = itemUiInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8857)) {
            return false;
        }
        C8857 c8857 = (C8857) obj;
        return AbstractC4395.m8907(this.f24975, c8857.f24975) && AbstractC4395.m8907(this.f24974, c8857.f24974);
    }

    @Override // p350.InterfaceC8854
    public final String getKey() {
        return this.f24975;
    }

    public final int hashCode() {
        return this.f24974.hashCode() + (this.f24975.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC8405.m13972(3220) + this.f24975 + AbstractC8405.m13973("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵呜呜~喵呜喵呜呜呜喵喵") + this.f24974 + ')';
    }
}
