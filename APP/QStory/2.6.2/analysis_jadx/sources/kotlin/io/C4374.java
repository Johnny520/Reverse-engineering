package kotlin.io;

import java.io.File;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4374 extends AbstractC4375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f12946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f12947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public File[] f12948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f12949;

    @Override // kotlin.io.AbstractC4377
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final File mo8878() {
        boolean z = this.f12946;
        File file = this.f12952;
        if (!z && this.f12948 == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f12948 = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f12946 = true;
            }
        }
        File[] fileArr = this.f12948;
        if (fileArr == null || this.f12947 >= fileArr.length) {
            if (this.f12949) {
                return null;
            }
            this.f12949 = true;
            return file;
        }
        fileArr.getClass();
        int i = this.f12947;
        this.f12947 = i + 1;
        return fileArr[i];
    }
}
