package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import p088.AbstractC7158;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5504 extends C0064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15227;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC7158 f15228;

    public C5504(C0107 c0107, AbstractC7158 abstractC7158) {
        super(c0107);
        this.f15228 = abstractC7158;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo186() {
        this.f138 = true;
        this.f15227++;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo193() {
        m202(' ');
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo194() {
        this.f15227--;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo197() {
        if (this.f138) {
            this.f138 = false;
        } else {
            mo198();
        }
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo198() {
        this.f138 = false;
        C0107 c0107 = (C0107) this.f139;
        c0107.m344("\n");
        int i = this.f15227;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f15228.f19133.f19157;
            str.getClass();
            c0107.m344(str);
        }
    }
}
