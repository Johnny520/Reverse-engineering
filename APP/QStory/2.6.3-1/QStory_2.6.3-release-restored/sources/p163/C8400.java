package p163;

import androidx.window.core.VerificationMode;
import com.bumptech.glide.AbstractC3898;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8400 extends AbstractC3898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8397 f20834;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final VerificationMode f20835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f20836;

    public C8400(Object obj, VerificationMode verificationMode, C8397 c8397) {
        obj.getClass();
        verificationMode.getClass();
        this.f20836 = obj;
        this.f20835 = verificationMode;
        this.f20834 = c8397;
    }

    @Override // com.bumptech.glide.AbstractC3898
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC3898 mo7429(String str, InterfaceC7387 interfaceC7387) {
        Object obj = this.f20836;
        return ((Boolean) interfaceC7387.invoke(obj)).booleanValue() ? this : new C8398(obj, str, this.f20834, this.f20835);
    }

    @Override // com.bumptech.glide.AbstractC3898
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo7432() {
        return this.f20836;
    }
}
