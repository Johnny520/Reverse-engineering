package p019;

import java.io.IOException;
import p010.InterfaceC6190;
import p026.InterfaceC6312;
import p128.AbstractC7483;
import p128.InterfaceC7482;
import p128.InterfaceC7485;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6263 implements InterfaceC6190, InterfaceC6312, InterfaceC7482 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m11775(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m11776(Object obj, String str, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11777(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11778(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    @Override // p128.InterfaceC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo11779(InterfaceC7485 interfaceC7485, AbstractC7483 abstractC7483) {
        switch (this.f17244) {
            case 25:
                interfaceC7485.mo12703(abstractC7483);
                break;
            case 26:
                interfaceC7485.mo12666(abstractC7483);
                break;
            case 27:
                interfaceC7485.mo12667(abstractC7483);
                break;
            case 28:
                interfaceC7485.mo12668();
                break;
            default:
                interfaceC7485.mo12665();
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    @Override // p010.InterfaceC6190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8621(de.robv.android.xposed.XC_MethodHook.MethodHookParam r19) {
        /*
            Method dump skipped, instruction units count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p019.C6263.mo8621(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    public /* synthetic */ C6263(int i) {
        this.f17244 = i;
    }
}
