package p354;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8890 implements InterfaceC8886 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DirectoryUiInfo f25052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25053;

    public C8890(String str, DirectoryUiInfo directoryUiInfo) {
        AbstractC3056.m6668(-3937803416387192231L);
        AbstractC3056.m6668(-3937696381507208615L);
        this.f25053 = str;
        this.f25052 = directoryUiInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8890)) {
            return false;
        }
        C8890 c8890 = (C8890) obj;
        return AbstractC4394.m8917(this.f25053, c8890.f25053) && AbstractC4394.m8917(this.f25052, c8890.f25052);
    }

    @Override // p354.InterfaceC8886
    public final String getKey() {
        return this.f25053;
    }

    public final int hashCode() {
        return this.f25052.hashCode() + (this.f25053.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937344658045404583L));
        AbstractC6136.m11531(sb, this.f25053, -3937711714540455335L);
        sb.append(this.f25052);
        sb.append(')');
        return sb.toString();
    }
}
