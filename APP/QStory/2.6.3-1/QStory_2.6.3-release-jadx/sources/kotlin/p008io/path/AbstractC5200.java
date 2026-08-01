package kotlin.p008io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.io.path.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5200 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Path f13288 = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Path f13287 = Paths.get("..", new String[0]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Path m9426(Path path, Path path2) {
        Path path3;
        path2.getClass();
        Path pathNormalize = path2.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i = 0; i < iMin; i++) {
            Path name = pathNormalize.getName(i);
            Path path4 = f13287;
            if (!AbstractC5227.m9466(name, path4)) {
                break;
            }
            if (!AbstractC5227.m9466(pathNormalize2.getName(i), path4)) {
                C6755.m11869("Unable to compute relative path");
                return null;
            }
        }
        if (!pathNormalize2.equals(pathNormalize)) {
            path3 = pathNormalize2;
            if (!pathNormalize.equals(f13288)) {
                String string = pathRelativize.toString();
                String separator = pathRelativize.getFileSystem().getSeparator();
                separator.getClass();
                path3 = AbstractC5971.m10690(string, separator) ? pathRelativize.getFileSystem().getPath(AbstractC5976.m10720(pathRelativize.getFileSystem().getSeparator().length(), string), new String[0]) : pathRelativize;
            }
        }
        path3.getClass();
        return path3;
    }
}
