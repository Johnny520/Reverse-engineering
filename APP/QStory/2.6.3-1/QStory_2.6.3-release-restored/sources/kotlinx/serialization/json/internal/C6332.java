package kotlinx.serialization.json.internal;

import p104.AbstractC7988;
import p104.AbstractC8005;
import p107.InterfaceC8020;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6332 extends AbstractC6324 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC8005 f15558;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6332(AbstractC7988 abstractC7988, AbstractC8005 abstractC8005, String str) {
        super(abstractC7988, str);
        abstractC7988.getClass();
        abstractC8005.getClass();
        this.f15558 = abstractC8005;
        this.f15526.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC8005 mo11223() {
        return this.f15558;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC8005 mo11232(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f15558;
        }
        C6755.m11869("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return 0;
    }
}
