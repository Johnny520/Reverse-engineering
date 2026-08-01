package p382;

import java.io.File;
import java.util.ArrayList;
import top.linl.dexparser.DexFinder;

/* JADX INFO: renamed from: 飘花落叶言苏楪世哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8997 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ String f25286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f25287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DexFinder f25288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ File f25289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25290;

    public /* synthetic */ RunnableC8997(DexFinder dexFinder, File file, ArrayList arrayList, String str, int i) {
        this.f25290 = i;
        this.f25288 = dexFinder;
        this.f25289 = file;
        this.f25287 = arrayList;
        this.f25286 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25290;
        String str = this.f25286;
        ArrayList arrayList = this.f25287;
        File file = this.f25289;
        DexFinder dexFinder = this.f25288;
        switch (i) {
            case 0:
                dexFinder.lambda$useLocalLookupMethodString$2(file, arrayList, str);
                break;
            default:
                dexFinder.lambda$testFindMethodString$0(file, arrayList, str);
                break;
        }
    }
}
