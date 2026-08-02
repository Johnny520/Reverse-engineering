package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vk2 {
    public final File a;
    public final File b;
    public final File c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vk2(File file, File file2, File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk2)) {
            return false;
        }
        vk2 vk2Var = (vk2) obj;
        return this.a.equals(vk2Var.a) && this.b.equals(vk2Var.b) && t11.l(this.c, vk2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        File file = this.c;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptStorageRoots(dataDirectory=" + this.a + ", cacheDirectory=" + this.b + ", externalDirectory=" + this.c + ")";
    }
}
