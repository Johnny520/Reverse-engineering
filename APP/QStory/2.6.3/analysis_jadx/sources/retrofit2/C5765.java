package retrofit2;

import java.util.Objects;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5765 extends AbstractC5785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5781 f15819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f15820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15821;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f15822;

    public C5765(int i, String str, boolean z) {
        this.f15821 = i;
        switch (i) {
            case 1:
                C5781 c5781 = C5781.f15866;
                Objects.requireNonNull(str, "name == null");
                this.f15820 = str;
                this.f15819 = c5781;
                this.f15822 = z;
                break;
            case 2:
                C5781 c57812 = C5781.f15866;
                Objects.requireNonNull(str, "name == null");
                this.f15820 = str;
                this.f15819 = c57812;
                this.f15822 = z;
                break;
            default:
                C5781 c57813 = C5781.f15866;
                Objects.requireNonNull(str, "name == null");
                this.f15820 = str;
                this.f15819 = c57813;
                this.f15822 = z;
                break;
        }
    }

    @Override // retrofit2.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11151(C5759 c5759, Object obj) {
        int i = this.f15821;
        boolean z = this.f15822;
        String str = this.f15820;
        C5781 c5781 = this.f15819;
        switch (i) {
            case 0:
                if (obj != null) {
                    c5781.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        c5759.m11147(str, string, z);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    c5781.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        c5759.m11146(str, string2, z);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    c5781.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        c5759.m11144(str, string3, z);
                        break;
                    }
                }
                break;
        }
    }
}
