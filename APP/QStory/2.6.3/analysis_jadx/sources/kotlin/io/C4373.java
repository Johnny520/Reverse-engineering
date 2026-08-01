package kotlin.io;

import java.io.File;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4373 extends AbstractC4376 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f12946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public File[] f12947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f12948;

    @Override // kotlin.io.AbstractC4378
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final File mo8868() {
        boolean z = this.f12948;
        File file = this.f12956;
        if (!z) {
            this.f12948 = true;
            return file;
        }
        File[] fileArr = this.f12947;
        if (fileArr != null && this.f12946 >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f12947 = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f12947;
        fileArr2.getClass();
        int i = this.f12946;
        this.f12946 = i + 1;
        return fileArr2[i];
    }
}
