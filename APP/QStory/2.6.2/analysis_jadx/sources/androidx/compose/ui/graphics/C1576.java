package androidx.compose.ui.graphics;

import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p112.C7326;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1576 extends AbstractC1581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7326 f4655;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1614 f4656;

    public C1576(C7326 c7326) {
        C1614 c1614M2947;
        this.f4655 = c7326;
        if (AbstractC4921.m9877(c7326)) {
            c1614M2947 = null;
        } else {
            c1614M2947 = AbstractC1603.m2947();
            C1614.m2967(c1614M2947, c7326);
        }
        this.f4656 = c1614M2947;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1576) {
            return this.f4655.equals(((C1576) obj).f4655);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4655.hashCode();
    }

    @Override // androidx.compose.ui.graphics.AbstractC1581
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7327 mo2859() {
        C7326 c7326 = this.f4655;
        return new C7327(c7326.f19538, c7326.f19537, c7326.f19536, c7326.f19535);
    }
}
