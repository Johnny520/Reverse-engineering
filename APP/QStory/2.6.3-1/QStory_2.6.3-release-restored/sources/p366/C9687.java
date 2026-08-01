package p366;

import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9687 implements InterfaceC9683 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DirectoryUiInfo f25321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25322;

    public C9687(String str, DirectoryUiInfo directoryUiInfo) {
        "key";
        "info";
        this.f25322 = str;
        this.f25321 = directoryUiInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9687)) {
            return false;
        }
        C9687 c9687 = (C9687) obj;
        return AbstractC5227.m9466(this.f25322, c9687.f25322) && AbstractC5227.m9466(this.f25321, c9687.f25321);
    }

    @Override // p366.InterfaceC9683
    public final String getKey() {
        return this.f25322;
    }

    public final int hashCode() {
        return this.f25321.hashCode() + (this.f25322.hashCode() * 31);
    }

    public final String toString() {
        return "Directory(key=" + this.f25322 + ", info=" + this.f25321 + ')';
    }
}
