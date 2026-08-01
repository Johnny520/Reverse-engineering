package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7910 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7910 f19338 = new C7910(C7909.f19337);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7911 c7911 = (C7911) obj;
        c7911.getClass();
        float fMo11229 = interfaceC8018.mo11229(this.f19409, i);
        c7911.mo12954(c7911.mo12953() + 1);
        float[] fArr = c7911.f19340;
        int i2 = c7911.f19339;
        c7911.f19339 = i2 + 1;
        fArr[i2] = fMo11229;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        C7911 c7911 = new C7911();
        c7911.f19340 = fArr;
        c7911.f19339 = fArr.length;
        c7911.mo12954(10);
        return c7911;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        float[] fArr = (float[]) obj;
        interfaceC8017.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11285(this.f19409, i2, fArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new float[0];
    }
}
