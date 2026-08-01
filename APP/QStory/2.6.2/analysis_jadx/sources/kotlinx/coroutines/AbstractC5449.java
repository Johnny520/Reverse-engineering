package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.internal.C5361;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5449 extends C5361 implements InterfaceC5397, InterfaceC5469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C5459 f15103;

    @Override // kotlinx.coroutines.InterfaceC5397
    public final void dispose() {
        m10549().m10582(this);
    }

    public InterfaceC5451 getParent() {
        return m10549();
    }

    @Override // kotlinx.coroutines.internal.C5361
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC5398.m10497(this) + "[job@" + AbstractC5398.m10497(m10549()) + ']';
    }

    @Override // kotlinx.coroutines.InterfaceC5469
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo10454() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public abstract void mo10464(Throwable th);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract boolean mo10465();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5459 m10549() {
        C5459 c5459 = this.f15103;
        if (c5459 != null) {
            return c5459;
        }
        AbstractC4394.m8918("job");
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC5469
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C5457 mo10455() {
        return null;
    }
}
