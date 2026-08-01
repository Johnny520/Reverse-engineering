package top.linl.dexparser.bean;

import top.linl.dexparser.DexParser;
import top.linl.dexparser.util.FileUtils;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexFile {
    public static void writeLocallyAndFreeMemory(String str, DexParser dexParser) {
        FileUtils.writeObjectToFile(str, dexParser);
    }
}
