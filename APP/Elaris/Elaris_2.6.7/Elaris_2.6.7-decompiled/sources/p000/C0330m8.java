package p000;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: m8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0330m8 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ File f562a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0330m8(File file) {
        this.f562a = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        File file3 = this.f562a;
        if (file3 != null && file3.equals(file)) {
            return -1;
        }
        if (file3 == null || !file3.equals(file2)) {
            return Long.compare(file2.lastModified(), file.lastModified());
        }
        return 1;
    }
}
