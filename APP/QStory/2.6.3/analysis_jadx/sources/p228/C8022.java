package p228;

import java.io.File;
import p221.C7976;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8022 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22153;

    public /* synthetic */ C8022(Object obj, int i) {
        this.f22153 = i;
        this.f22152 = obj;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13501(Object obj) {
        switch (this.f22153) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8036 mo13502(Object obj, int i, int i2, C8397 c8397) {
        int i3 = this.f22153;
        Object obj2 = this.f22152;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C8036(new C7976(bArr), new C8032(bArr, 1, (C8018) obj2));
            case 1:
                return new C8036(new C7976(obj), new C8032(obj.toString(), (C8018) obj2));
            default:
                File file = (File) obj;
                return new C8036(new C7976(file), new C8038(file, (C8018) obj2, 0));
        }
    }
}
