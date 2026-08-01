package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0954;
import p104.AbstractC7988;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6337 extends C0911 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15572;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC7988 f15573;

    public C6337(C0954 c0954, AbstractC7988 abstractC7988) {
        super(c0954);
        this.f15573 = abstractC7988;
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo747() {
        this.f483 = true;
        this.f15572++;
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo754() {
        m763(' ');
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo755() {
        this.f15572--;
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo758() {
        if (this.f483) {
            this.f483 = false;
        } else {
            mo759();
        }
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo759() {
        this.f483 = false;
        C0954 c0954 = (C0954) this.f484;
        c0954.m905("\n");
        int i = this.f15572;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f15573.f19473.f19497;
            str.getClass();
            c0954.m905(str);
        }
    }
}
