package top.linl.dexparser.bean.ids;

import top.linl.dexparser.DexParser;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
