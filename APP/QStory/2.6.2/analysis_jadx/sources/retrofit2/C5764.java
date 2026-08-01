package retrofit2;

import java.util.Objects;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5764 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5780 f15819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f15820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15821;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f15822;

    public C5764(int i, String str, boolean z) {
        this.f15821 = i;
        switch (i) {
            case 1:
                C5780 c5780 = C5780.f15866;
                Objects.requireNonNull(str, "name == null");
                this.f15820 = str;
                this.f15819 = c5780;
                this.f15822 = z;
                break;
            case 2:
                C5780 c57802 = C5780.f15866;
                Objects.requireNonNull(str, "name == null");
                this.f15820 = str;
                this.f15819 = c57802;
                this.f15822 = z;
                break;
            default:
                C5780 c57803 = C5780.f15866;
                Objects.requireNonNull(str, "name == null");
                this.f15820 = str;
                this.f15819 = c57803;
                this.f15822 = z;
                break;
        }
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11094(C5758 c5758, Object obj) {
        int i = this.f15821;
        boolean z = this.f15822;
        String str = this.f15820;
        C5780 c5780 = this.f15819;
        switch (i) {
            case 0:
                if (obj != null) {
                    c5780.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        c5758.m11090(str, string, z);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    c5780.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        c5758.m11089(str, string2, z);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    c5780.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        c5758.m11087(str, string3, z);
                        break;
                    }
                }
                break;
        }
    }
}
