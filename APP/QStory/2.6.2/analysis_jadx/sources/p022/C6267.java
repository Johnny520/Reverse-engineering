package p022;

import java.io.IOException;
import p010.InterfaceC6159;
import p026.InterfaceC6294;
import p128.AbstractC7482;
import p128.InterfaceC7481;
import p128.InterfaceC7484;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6267 implements InterfaceC6159, InterfaceC6294, InterfaceC7481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m11758(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m11759(Object obj, String str, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11760(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11761(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    @Override // p128.InterfaceC7481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo11762(InterfaceC7484 interfaceC7484, AbstractC7482 abstractC7482) {
        switch (this.f17262) {
            case 25:
                interfaceC7484.mo12674(abstractC7482);
                break;
            case 26:
                interfaceC7484.mo12639(abstractC7482);
                break;
            case 27:
                interfaceC7484.mo12640(abstractC7482);
                break;
            case 28:
                interfaceC7484.mo12641();
                break;
            default:
                interfaceC7484.mo12638();
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9  */
    @Override // p010.InterfaceC6159
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8631(de.robv.android.xposed.XC_MethodHook.MethodHookParam r21) {
        /*
            Method dump skipped, instruction units count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6267.mo8631(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    public /* synthetic */ C6267(int i) {
        this.f17262 = i;
    }
}
