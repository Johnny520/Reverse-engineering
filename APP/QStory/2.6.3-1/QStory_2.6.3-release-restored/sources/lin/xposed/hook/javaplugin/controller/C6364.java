package lin.xposed.hook.javaplugin.controller;

import java.io.File;
import java.io.FileFilter;
import top.linl.dexparser.DexFinder;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.controller.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6364 implements FileFilter {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15624;

    public /* synthetic */ C6364(int i) {
        this.f15624 = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f15624) {
            case 0:
                return file.isDirectory();
            default:
                return DexFinder.Builder.lambda$getCacheList$0(file);
        }
    }
}
