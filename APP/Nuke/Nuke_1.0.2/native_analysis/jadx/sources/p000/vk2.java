package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vk2 {

    /* JADX INFO: renamed from: a */
    public final File f12003a;

    /* JADX INFO: renamed from: b */
    public final File f12004b;

    /* JADX INFO: renamed from: c */
    public final File f12005c;

    public vk2(File file, File file2, File file3) {
        this.f12003a = file;
        this.f12004b = file2;
        this.f12005c = file3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk2)) {
            return false;
        }
        vk2 vk2Var = (vk2) obj;
        return this.f12003a.equals(vk2Var.f12003a) && this.f12004b.equals(vk2Var.f12004b) && t11.m5086l(this.f12005c, vk2Var.f12005c);
    }

    public final int hashCode() {
        int iHashCode = (this.f12004b.hashCode() + (this.f12003a.hashCode() * 31)) * 31;
        File file = this.f12005c;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "ScriptStorageRoots(dataDirectory=" + this.f12003a + ", cacheDirectory=" + this.f12004b + ", externalDirectory=" + this.f12005c + ")";
    }
}
