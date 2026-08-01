package p383;

import java.io.File;
import java.util.ArrayList;
import top.linl.dexparser.DexFinder;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9003 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ String f25280;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f25281;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DexFinder f25282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ File f25283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25284;

    public /* synthetic */ RunnableC9003(DexFinder dexFinder, File file, ArrayList arrayList, String str, int i) {
        this.f25284 = i;
        this.f25282 = dexFinder;
        this.f25283 = file;
        this.f25281 = arrayList;
        this.f25280 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25284;
        String str = this.f25280;
        ArrayList arrayList = this.f25281;
        File file = this.f25283;
        DexFinder dexFinder = this.f25282;
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
