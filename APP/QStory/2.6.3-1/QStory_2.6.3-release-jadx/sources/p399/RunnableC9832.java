package p399;

import java.io.File;
import java.util.ArrayList;
import top.linl.dexparser.DexFinder;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9832 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ String f25625;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f25626;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DexFinder f25627;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ File f25628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25629;

    public /* synthetic */ RunnableC9832(DexFinder dexFinder, File file, ArrayList arrayList, String str, int i) {
        this.f25629 = i;
        this.f25627 = dexFinder;
        this.f25628 = file;
        this.f25626 = arrayList;
        this.f25625 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25629;
        String str = this.f25625;
        ArrayList arrayList = this.f25626;
        File file = this.f25628;
        DexFinder dexFinder = this.f25627;
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
