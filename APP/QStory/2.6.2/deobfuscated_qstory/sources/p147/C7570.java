package p147;

import androidx.window.core.VerificationMode;
import com.alibaba.fastjson2.AbstractC2904;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7570 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7567 f20494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final VerificationMode f20495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f20496;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7570(Object obj, VerificationMode verificationMode, C7567 c7567) {
        super(16);
        obj.getClass();
        verificationMode.getClass();
        this.f20496 = obj;
        this.f20495 = verificationMode;
        this.f20494 = c7567;
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final AbstractC2904 mo6273(String str, InterfaceC6557 interfaceC6557) {
        Object obj = this.f20496;
        return ((Boolean) interfaceC6557.invoke(obj)).booleanValue() ? this : new C7568(obj, str, this.f20494, this.f20495);
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo6283() {
        return this.f20496;
    }
}
