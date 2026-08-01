package p104;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.C4912;
import kotlin.sequences.C5125;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7292 extends AbstractC7282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4912 f19423;

    public C7292(int i, C4912 c4912) {
        this.f19423 = c4912;
        this.f19422 = i;
    }

    @Override // p104.AbstractC7282
    public final Object get(int i) {
        if (i == this.f19422) {
            return this.f19423;
        }
        return null;
    }

    @Override // p104.AbstractC7282, java.lang.Iterable
    public final Iterator iterator() {
        return new C5125(this, 2);
    }

    @Override // p104.AbstractC7282
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12472(int i, C4912 c4912) {
        throw new IllegalStateException();
    }

    @Override // p104.AbstractC7282
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo12473() {
        return 1;
    }
}
