package p097g9;

import gg.AbstractC1416l;
import java.io.File;

/* JADX INFO: renamed from: g9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1373b {

    /* JADX INFO: renamed from: a */
    public final File f4559a;

    /* JADX INFO: renamed from: b */
    public final String f4560b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1373b(File file, String str) {
        this.f4559a = file;
        this.f4560b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1373b)) {
            return false;
        }
        C1373b c1373b = (C1373b) obj;
        return AbstractC1416l.m3825a(this.f4559a, c1373b.f4559a) && this.f4560b.equals(c1373b.f4560b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        File file = this.f4559a;
        return this.f4560b.hashCode() + ((file == null ? 0 : file.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SaveResult(file=" + this.f4559a + ", error=" + this.f4560b + ")";
    }
}
