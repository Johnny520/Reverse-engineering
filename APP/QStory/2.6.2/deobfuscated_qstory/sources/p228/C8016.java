package p228;

import java.io.File;
import p221.C7975;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8016 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8016 f22144 = new C8016(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22145;

    public /* synthetic */ C8016(int i) {
        this.f22145 = i;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13473(Object obj) {
        switch (this.f22145) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        switch (this.f22145) {
            case 0:
                return new C8035(new C7975(obj), new C8020(obj, 1));
            case 1:
                File file = (File) obj;
                return new C8035(new C7975(file), new C8020(file, 0));
            default:
                return null;
        }
    }
}
