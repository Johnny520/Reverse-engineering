package p377;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪哲兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final OpenOption[] f25463;

    static {
        StandardOpenOption standardOpenOption = StandardOpenOption.CREATE;
        StandardOpenOption standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
        StandardOpenOption standardOpenOption3 = StandardOpenOption.APPEND;
        LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
        f25463 = new OpenOption[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m15107(Path path) {
        Path fileName = path != null ? path.getFileName() : null;
        if (fileName != null) {
            return fileName.toString();
        }
        return null;
    }
}
