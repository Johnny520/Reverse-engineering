package p354;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8887 implements InterfaceC8886 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final OtherViewItemInfo f25046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25047;

    public C8887(String str, OtherViewItemInfo otherViewItemInfo) {
        AbstractC3056.m6668(-3937803416387192231L);
        AbstractC3056.m6668(-3937696381507208615L);
        this.f25047 = str;
        this.f25046 = otherViewItemInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8887)) {
            return false;
        }
        C8887 c8887 = (C8887) obj;
        return AbstractC4394.m8917(this.f25047, c8887.f25047) && AbstractC4394.m8917(this.f25046, c8887.f25046);
    }

    @Override // p354.InterfaceC8886
    public final String getKey() {
        return this.f25047;
    }

    public final int hashCode() {
        return this.f25046.hashCode() + (this.f25047.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937344417527236007L));
        AbstractC6136.m11531(sb, this.f25047, -3937711714540455335L);
        sb.append(this.f25046);
        sb.append(')');
        return sb.toString();
    }
}
