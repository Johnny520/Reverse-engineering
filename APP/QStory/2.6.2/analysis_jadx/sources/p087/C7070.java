package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7070 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7070 f18979 = new C7070(C7071.f18981);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7074 c7074 = (C7074) obj;
        c7074.getClass();
        long jMo6886 = interfaceC7188.mo6886(this.f19069, i);
        c7074.mo12368(c7074.mo12367() + 1);
        long[] jArr = c7074.f18987;
        int i2 = c7074.f18986;
        c7074.f18986 = i2 + 1;
        jArr[i2] = jMo6886;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo12363(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object mo12364(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        C7074 c7074 = new C7074();
        c7074.f18987 = jArr;
        c7074.f18986 = jArr.length;
        c7074.mo12368(10);
        return c7074;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        long[] jArr = (long[]) obj;
        interfaceC7187.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6796(this.f19069, i2, jArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo12366() {
        return new long[0];
    }
}
