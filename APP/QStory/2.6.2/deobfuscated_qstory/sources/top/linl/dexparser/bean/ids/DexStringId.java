package top.linl.dexparser.bean.ids;

import top.linl.dexparser.DexParser;
import top.linl.dexparser.util.Utils;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DexStringId extends BaseId {
    public int string_byte_length;

    @Deprecated
    public String string_data;
    public int string_data_off;

    @Deprecated
    public DexStringId(int i, String str) {
        this.string_data = str;
        this.string_data_off = i;
    }

    public String getString(DexParser dexParser) {
        int i = this.string_byte_length;
        return (i == 0 || this.string_data != null) ? this.string_data : new String(Utils.copyArrays(dexParser.dexData, this.string_data_off + 1, i));
    }

    public String toString() {
        return this.string_data;
    }

    public DexStringId(int i, int i2) {
        this.string_data_off = i;
        this.string_byte_length = i2;
    }

    public DexStringId() {
    }
}
