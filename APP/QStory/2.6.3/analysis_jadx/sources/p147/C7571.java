package p147;

import androidx.window.core.VerificationMode;
import com.bumptech.glide.AbstractC3066;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7571 extends AbstractC3066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7568 f20489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final VerificationMode f20490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f20491;

    public C7571(Object obj, VerificationMode verificationMode, C7568 c7568) {
        obj.getClass();
        verificationMode.getClass();
        this.f20491 = obj;
        this.f20490 = verificationMode;
        this.f20489 = c7568;
    }

    @Override // com.bumptech.glide.AbstractC3066
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC3066 mo6869(String str, InterfaceC6558 interfaceC6558) {
        Object obj = this.f20491;
        return ((Boolean) interfaceC6558.invoke(obj)).booleanValue() ? this : new C7569(obj, str, this.f20489, this.f20490);
    }

    @Override // com.bumptech.glide.AbstractC3066
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo6872() {
        return this.f20491;
    }
}
