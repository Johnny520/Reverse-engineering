package p354;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8889 implements InterfaceC8886 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ItemUiInfo f25050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25051;

    public C8889(String str, ItemUiInfo itemUiInfo) {
        "key";
        "info";
        this.f25051 = str;
        this.f25050 = itemUiInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8889)) {
            return false;
        }
        C8889 c8889 = (C8889) obj;
        return AbstractC4394.m8917(this.f25051, c8889.f25051) && AbstractC4394.m8917(this.f25050, c8889.f25050);
    }

    @Override // p354.InterfaceC8886
    public final String getKey() {
        return this.f25051;
    }

    public final int hashCode() {
        return this.f25050.hashCode() + (this.f25051.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Function(key=");
        AbstractC6136.m11531(sb, this.f25051, -3937711714540455335L);
        sb.append(this.f25050);
        sb.append(')');
        return sb.toString();
    }
}
