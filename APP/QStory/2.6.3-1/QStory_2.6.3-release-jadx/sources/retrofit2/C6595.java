package retrofit2;

import java.util.Objects;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6595 extends AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6611 f16164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f16165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f16166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f16167;

    public C6595(int i, String str, boolean z) {
        this.f16166 = i;
        switch (i) {
            case 1:
                C6611 c6611 = C6611.f16211;
                Objects.requireNonNull(str, "name == null");
                this.f16165 = str;
                this.f16164 = c6611;
                this.f16167 = z;
                break;
            case 2:
                C6611 c66112 = C6611.f16211;
                Objects.requireNonNull(str, "name == null");
                this.f16165 = str;
                this.f16164 = c66112;
                this.f16167 = z;
                break;
            default:
                C6611 c66113 = C6611.f16211;
                Objects.requireNonNull(str, "name == null");
                this.f16165 = str;
                this.f16164 = c66113;
                this.f16167 = z;
                break;
        }
    }

    @Override // retrofit2.AbstractC6615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11710(C6589 c6589, Object obj) {
        int i = this.f16166;
        boolean z = this.f16167;
        String str = this.f16165;
        C6611 c6611 = this.f16164;
        switch (i) {
            case 0:
                if (obj != null) {
                    c6611.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        c6589.m11706(str, string, z);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    c6611.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        c6589.m11705(str, string2, z);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    c6611.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        c6589.m11703(str, string3, z);
                        break;
                    }
                }
                break;
        }
    }
}
