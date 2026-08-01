package kotlin.p008io;

import java.io.File;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5205 extends AbstractC5208 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f13291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public File[] f13292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f13293;

    @Override // kotlin.p008io.AbstractC5210
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final File mo9427() {
        boolean z = this.f13293;
        File file = this.f13301;
        if (!z) {
            this.f13293 = true;
            return file;
        }
        File[] fileArr = this.f13292;
        if (fileArr != null && this.f13291 >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f13292 = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f13292;
        fileArr2.getClass();
        int i = this.f13291;
        this.f13291 = i + 1;
        return fileArr2[i];
    }
}
