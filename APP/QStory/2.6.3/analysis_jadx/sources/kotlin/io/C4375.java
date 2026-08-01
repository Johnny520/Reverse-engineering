package kotlin.io;

import java.io.File;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4375 extends AbstractC4376 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f12950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f12951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public File[] f12952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f12953;

    @Override // kotlin.io.AbstractC4378
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final File mo8868() {
        boolean z = this.f12950;
        File file = this.f12956;
        if (!z && this.f12952 == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f12952 = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f12950 = true;
            }
        }
        File[] fileArr = this.f12952;
        if (fileArr == null || this.f12951 >= fileArr.length) {
            if (this.f12953) {
                return null;
            }
            this.f12953 = true;
            return file;
        }
        fileArr.getClass();
        int i = this.f12951;
        this.f12951 = i + 1;
        return fileArr[i];
    }
}
