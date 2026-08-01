package kotlinx.coroutines;

import kotlinx.coroutines.internal.C5348;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5436 extends AbstractC5449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5443 f15085;

    public C5436(C5443 c5443) {
        this.f15085 = c5443;
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10464(Throwable th) throws DispatchException {
        C5459 c5459M10549 = m10549();
        C5443 c5443 = this.f15085;
        Throwable thMo10545 = c5443.mo10545(c5459M10549);
        if (!c5443.m10531() ? false : ((C5348) c5443.f15096).m10342(thMo10545)) {
            return;
        }
        c5443.mo10431(thMo10545);
        c5443.m10541();
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10465() {
        return true;
    }
}
