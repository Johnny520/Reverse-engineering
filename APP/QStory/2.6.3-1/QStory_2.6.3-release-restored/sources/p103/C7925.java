package p103;

import kotlin.C6012;
import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7925 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7925 f19362 = new C7925(C7926.f19364);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7928 c7928 = (C7928) obj;
        c7928.getClass();
        long jMo11227 = interfaceC8018.mo11213(this.f19409, i).mo11227();
        c7928.mo12954(c7928.mo12953() + 1);
        long[] jArr = c7928.f19368;
        int i2 = c7928.f19367;
        c7928.f19367 = i2 + 1;
        jArr[i2] = jMo11227;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        return ((C6012) obj).f15088.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        long[] jArr = ((C6012) obj).f15088;
        C7928 c7928 = new C7928();
        c7928.f19368 = jArr;
        c7928.f19367 = jArr.length;
        c7928.mo12954(10);
        return c7928;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        long[] jArr = ((C6012) obj).f15088;
        interfaceC8017.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11293(this.f19409, i2).mo11210(jArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new C6012(new long[0]);
    }
}
