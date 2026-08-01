package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7941 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7941 f19391 = new C7941(C7945.f19398);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7942 c7942 = (C7942) obj;
        c7942.getClass();
        char cMo11219 = interfaceC8018.mo11219(this.f19409, i);
        c7942.mo12954(c7942.mo12953() + 1);
        char[] cArr = c7942.f19393;
        int i2 = c7942.f19392;
        c7942.f19392 = i2 + 1;
        cArr[i2] = cMo11219;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        C7942 c7942 = new C7942();
        c7942.f19393 = cArr;
        c7942.f19392 = cArr.length;
        c7942.mo12954(10);
        return c7942;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        char[] cArr = (char[]) obj;
        interfaceC8017.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11279(this.f19409, i2, cArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new char[0];
    }
}
