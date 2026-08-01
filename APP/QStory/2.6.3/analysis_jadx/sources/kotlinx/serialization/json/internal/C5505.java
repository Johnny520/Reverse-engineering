package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import p088.AbstractC7159;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5505 extends C0064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15227;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC7159 f15228;

    public C5505(C0107 c0107, AbstractC7159 abstractC7159) {
        super(c0107);
        this.f15228 = abstractC7159;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo187() {
        this.f138 = true;
        this.f15227++;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo194() {
        m203(' ');
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo195() {
        this.f15227--;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo198() {
        if (this.f138) {
            this.f138 = false;
        } else {
            mo199();
        }
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo199() {
        this.f138 = false;
        C0107 c0107 = (C0107) this.f139;
        c0107.m345("\n");
        int i = this.f15227;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f15228.f19128.f19152;
            str.getClass();
            c0107.m345(str);
        }
    }
}
