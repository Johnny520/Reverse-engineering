package top.linl.dexparser.process;

import top.linl.dexparser.DexParser;
import top.linl.dexparser.util.ByteReader;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexClassParser {
    private final DexParser dexParser;
    private final ByteReader reader;

    public DexClassParser(DexParser dexParser, ByteReader byteReader) {
        this.dexParser = dexParser;
        this.reader = byteReader;
    }
}
