package kotlin.p008io;

import java.io.File;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5207 extends AbstractC5208 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f13295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f13296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public File[] f13297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f13298;

    @Override // kotlin.p008io.AbstractC5210
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final File mo9427() {
        boolean z = this.f13295;
        File file = this.f13301;
        if (!z && this.f13297 == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f13297 = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f13295 = true;
            }
        }
        File[] fileArr = this.f13297;
        if (fileArr == null || this.f13296 >= fileArr.length) {
            if (this.f13298) {
                return null;
            }
            this.f13298 = true;
            return file;
        }
        fileArr.getClass();
        int i = this.f13296;
        this.f13296 = i + 1;
        return fileArr[i];
    }
}
