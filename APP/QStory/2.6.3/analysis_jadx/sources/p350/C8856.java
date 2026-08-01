package p350;

import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8856 implements InterfaceC8854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ItemUiInfoGroupWrapper f24972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24973;

    public C8856(String str, ItemUiInfoGroupWrapper itemUiInfoGroupWrapper) {
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
        this.f24973 = str;
        this.f24972 = itemUiInfoGroupWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8856)) {
            return false;
        }
        C8856 c8856 = (C8856) obj;
        return AbstractC4395.m8907(this.f24973, c8856.f24973) && AbstractC4395.m8907(this.f24972, c8856.f24972);
    }

    @Override // p350.InterfaceC8854
    public final String getKey() {
        return this.f24973;
    }

    public final int hashCode() {
        return this.f24972.hashCode() + (this.f24973.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC8405.m13972(3221) + this.f24973 + AbstractC8405.m13973("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵呜呜~喵呜喵呜呜呜喵喵") + this.f24972 + ')';
    }
}
