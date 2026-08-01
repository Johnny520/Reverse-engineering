package kotlinx.serialization.json.internal;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3064;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import p088.C7160;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5490 extends AbstractC3064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object f15173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ String f15174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f15175 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5498 f15176;

    public C5490(C5498 c5498, String str) {
        this.f15176 = c5498;
        this.f15174 = str;
        this.f15173 = c5498.f15210.f19132;
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public void mo6790(int i) {
        switch (this.f15175) {
            case 1:
                m10642(Integer.toUnsignedString(i));
                break;
            default:
                super.mo6790(i);
                break;
        }
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1245 mo10641() {
        switch (this.f15175) {
            case 0:
                return this.f15176.f15210.f19132;
            default:
                return (C1245) this.f15173;
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo6810(byte b) {
        switch (this.f15175) {
            case 1:
                m10642(String.valueOf(b & DefaultClassResolver.NAME));
                break;
            default:
                super.mo6810(b);
                break;
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo6812(short s) {
        switch (this.f15175) {
            case 1:
                m10642(String.valueOf(s & 65535));
                break;
            default:
                super.mo6812(s);
                break;
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public void mo6813(String str) {
        switch (this.f15175) {
            case 0:
                str.getClass();
                this.f15176.mo10676(this.f15174, new C7160(str, false, (InterfaceC7190) this.f15173));
                break;
            default:
                super.mo6813(str);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public void m10642(String str) {
        str.getClass();
        this.f15176.mo10676(this.f15174, new C7160(str, false, null));
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public void mo6817(long j) {
        switch (this.f15175) {
            case 1:
                m10642(Long.toUnsignedString(j));
                break;
            default:
                super.mo6817(j);
                break;
        }
    }

    public C5490(C5498 c5498, String str, InterfaceC7190 interfaceC7190) {
        this.f15176 = c5498;
        this.f15174 = str;
        this.f15173 = interfaceC7190;
    }
}
