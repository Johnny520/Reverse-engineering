package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.internal.C5362;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5450 extends C5362 implements InterfaceC5398, InterfaceC5470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C5460 f15103;

    @Override // kotlinx.coroutines.InterfaceC5398
    public final void dispose() {
        m10553().m10585(this);
    }

    public InterfaceC5452 getParent() {
        return m10553();
    }

    @Override // kotlinx.coroutines.internal.C5362
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC5399.m10501(this) + "[job@" + AbstractC5399.m10501(m10553()) + ']';
    }

    @Override // kotlinx.coroutines.InterfaceC5470
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo10458() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public abstract void mo10468(Throwable th);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5460 m10553() {
        C5460 c5460 = this.f15103;
        if (c5460 != null) {
            return c5460;
        }
        AbstractC4395.m8908("job");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract boolean mo10469();

    @Override // kotlinx.coroutines.InterfaceC5470
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C5458 mo10459() {
        return null;
    }
}
