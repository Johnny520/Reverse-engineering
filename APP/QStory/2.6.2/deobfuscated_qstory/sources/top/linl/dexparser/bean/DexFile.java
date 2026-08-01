package top.linl.dexparser.bean;

import top.linl.dexparser.DexParser;
import top.linl.dexparser.util.FileUtils;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DexFile {
    public static void writeLocallyAndFreeMemory(String str, DexParser dexParser) {
        FileUtils.writeObjectToFile(str, dexParser);
    }
}
