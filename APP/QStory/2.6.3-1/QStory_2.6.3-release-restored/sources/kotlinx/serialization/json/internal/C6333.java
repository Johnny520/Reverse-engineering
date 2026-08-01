package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import p104.AbstractC7988;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6333 extends C6335 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f15559;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f15560;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f15561;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7981 f15562;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6333(AbstractC7988 abstractC7988, C7981 c7981) {
        super(abstractC7988, c7981, (String) null, 12);
        abstractC7988.getClass();
        this.f15562 = c7981;
        List listM9356 = AbstractC5176.m9356(c7981.f19461.keySet());
        this.f15561 = listM9356;
        this.f15560 = listM9356.size() * 2;
        this.f15559 = -1;
    }

    @Override // kotlinx.serialization.json.internal.C6335
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C7981 mo11223() {
        return this.f15562;
    }

    @Override // kotlinx.serialization.json.internal.C6335, kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC8005 mo11223() {
        return this.f15562;
    }

    @Override // kotlinx.serialization.json.internal.C6335, kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC8005 mo11232(String str) {
        str.getClass();
        return this.f15559 % 2 == 0 ? AbstractC7997.m12991(str) : (AbstractC8005) AbstractC5171.m9332(str, this.f15562);
    }

    @Override // kotlinx.serialization.json.internal.C6335, kotlinx.serialization.json.internal.AbstractC6324, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
    }

    @Override // kotlinx.serialization.json.internal.C6335, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        int i = this.f15559;
        if (i >= this.f15560 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f15559 = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.C6335, kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final String mo11242(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return (String) this.f15561.get(i / 2);
    }
}
