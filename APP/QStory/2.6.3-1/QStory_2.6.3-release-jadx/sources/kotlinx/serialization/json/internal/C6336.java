package kotlinx.serialization.json.internal;

import p104.AbstractC7988;
import p104.AbstractC8005;
import p104.C7986;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6336 extends AbstractC6324 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f15569;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7986 f15570;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f15571;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6336(AbstractC7988 abstractC7988, C7986 c7986) {
        super(abstractC7988, null);
        abstractC7988.getClass();
        c7986.getClass();
        this.f15570 = c7986;
        this.f15571 = c7986.f19469.size();
        this.f15569 = -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC8005 mo11223() {
        return this.f15570;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC8005 mo11232(String str) {
        str.getClass();
        return (AbstractC8005) this.f15570.f19469.get(Integer.parseInt(str));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        int i = this.f15569;
        if (i >= this.f15571 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f15569 = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final String mo11242(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return String.valueOf(i);
    }
}
