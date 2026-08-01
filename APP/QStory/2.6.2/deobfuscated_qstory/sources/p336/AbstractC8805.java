package p336;

import com.bumptech.glide.AbstractC3056;
import p026.AbstractC6293;
import p331.C8799;
import p342.C8821;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8805 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void startLoadHook() {
        C8799 c8799 = new C8799();
        c8799.f24761 = "0";
        c8799.f24760 = "\u672a\u540c\u6b65";
        c8799.f24759 = 0;
        c8799.f24758 = "\u672a\u540c\u6b65";
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, "user_info");
        if (c87992 != null) {
            c8799 = c87992;
        }
        if (mo11257(c8799)) {
            super.startLoadHook();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract boolean mo11255(C8799 c8799);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract boolean mo11257(C8799 c8799);
}
