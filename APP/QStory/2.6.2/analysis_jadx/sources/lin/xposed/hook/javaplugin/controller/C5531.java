package lin.xposed.hook.javaplugin.controller;

import java.io.File;
import java.io.FileFilter;
import top.linl.dexparser.DexFinder;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.controller.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5531 implements FileFilter {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15279;

    public /* synthetic */ C5531(int i) {
        this.f15279 = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f15279) {
            case 0:
                return file.isDirectory();
            default:
                return DexFinder.Builder.lambda$getCacheList$0(file);
        }
    }
}
