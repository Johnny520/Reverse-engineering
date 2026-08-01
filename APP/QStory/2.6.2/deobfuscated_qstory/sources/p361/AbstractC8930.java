package p361;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final OpenOption[] f25129;

    static {
        StandardOpenOption standardOpenOption = StandardOpenOption.CREATE;
        StandardOpenOption standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
        StandardOpenOption standardOpenOption3 = StandardOpenOption.APPEND;
        LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
        f25129 = new OpenOption[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14535(Path path) {
        Path fileName = path != null ? path.getFileName() : null;
        if (fileName != null) {
            return fileName.toString();
        }
        return null;
    }
}
