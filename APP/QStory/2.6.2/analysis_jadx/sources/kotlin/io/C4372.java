package kotlin.io;

import java.io.File;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4372 extends AbstractC4375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f12942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public File[] f12943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f12944;

    @Override // kotlin.io.AbstractC4377
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final File mo8878() {
        boolean z = this.f12944;
        File file = this.f12952;
        if (!z) {
            this.f12944 = true;
            return file;
        }
        File[] fileArr = this.f12943;
        if (fileArr != null && this.f12942 >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f12943 = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f12943;
        fileArr2.getClass();
        int i = this.f12942;
        this.f12942 = i + 1;
        return fileArr2[i];
    }
}
