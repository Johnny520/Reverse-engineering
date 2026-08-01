package top.linl.dexparser.bean.ids;

import top.linl.dexparser.DexParser;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexTypeId extends BaseId {
    public int descriptor_idx;

    @Deprecated
    public String string_data;

    public DexTypeId(int i) {
        this.descriptor_idx = i;
    }

    public String getString(DexParser dexParser) {
        return dexParser.dexStringIdsList[this.descriptor_idx].getString(dexParser);
    }

    public String toString() {
        return this.string_data;
    }

    public DexTypeId() {
    }
}
