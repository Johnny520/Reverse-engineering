package p228;

import java.io.File;
import p221.C7975;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8021 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22156;

    public /* synthetic */ C8021(Object obj, int i) {
        this.f22156 = i;
        this.f22155 = obj;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13473(Object obj) {
        switch (this.f22156) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        int i3 = this.f22156;
        Object obj2 = this.f22155;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C8035(new C7975(bArr), new C8031(bArr, 1, (C8017) obj2));
            case 1:
                return new C8035(new C7975(obj), new C8031(obj.toString(), (C8017) obj2));
            default:
                File file = (File) obj;
                return new C8035(new C7975(file), new C8037(file, (C8017) obj2, 0));
        }
    }
}
