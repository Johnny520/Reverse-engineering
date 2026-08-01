package p244;

import java.io.File;
import p237.C8805;
import p302.C9226;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8851 implements InterfaceC8862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22498;

    public /* synthetic */ C8851(Object obj, int i) {
        this.f22498 = i;
        this.f22497 = obj;
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14060(Object obj) {
        switch (this.f22498) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8865 mo14061(Object obj, int i, int i2, C9226 c9226) {
        int i3 = this.f22498;
        Object obj2 = this.f22497;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C8865(new C8805(bArr), new C8861(bArr, 1, (C8847) obj2));
            case 1:
                return new C8865(new C8805(obj), new C8861(obj.toString(), (C8847) obj2));
            default:
                File file = (File) obj;
                return new C8865(new C8805(file), new C8867(file, (C8847) obj2, 0));
        }
    }
}
