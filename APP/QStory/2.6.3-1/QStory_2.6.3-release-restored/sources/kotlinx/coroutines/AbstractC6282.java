package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.internal.C6194;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6282 extends C6194 implements InterfaceC6230, InterfaceC6302 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C6292 f15448;

    @Override // kotlinx.coroutines.InterfaceC6230
    public final void dispose() {
        m11112().m11144(this);
    }

    public InterfaceC6284 getParent() {
        return m11112();
    }

    @Override // kotlinx.coroutines.internal.C6194
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC6231.m11060(this) + "[job@" + AbstractC6231.m11060(m11112()) + ']';
    }

    @Override // kotlinx.coroutines.InterfaceC6302
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo11017() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public abstract void mo11027(Throwable th);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6292 m11112() {
        C6292 c6292 = this.f15448;
        if (c6292 != null) {
            return c6292;
        }
        AbstractC5227.m9467("job");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract boolean mo11028();

    @Override // kotlinx.coroutines.InterfaceC6302
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C6290 mo11018() {
        return null;
    }
}
