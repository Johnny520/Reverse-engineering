package p054dg;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: dg.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0784c {

    /* JADX INFO: renamed from: a */
    public final File f2356a;

    /* JADX INFO: renamed from: b */
    public final Object f2357b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0784c(File file, List list) {
        this.f2356a = file;
        this.f2357b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0784c)) {
            return false;
        }
        C0784c c0784c = (C0784c) obj;
        return this.f2356a.equals(c0784c.f2356a) && this.f2357b.equals(c0784c.f2357b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2357b.hashCode() + (this.f2356a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FilePathComponents(root=" + this.f2356a + ", segments=" + this.f2357b + ')';
    }
}
