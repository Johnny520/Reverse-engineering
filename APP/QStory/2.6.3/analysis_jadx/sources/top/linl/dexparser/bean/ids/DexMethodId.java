package top.linl.dexparser.bean.ids;

import java.util.ArrayList;
import java.util.List;
import p009.AbstractC6183;
import top.linl.dexparser.DexParser;
import top.linl.dexparser.util.ConversionUtils;
import top.linl.dexparser.util.Utils;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexMethodId extends BaseId {
    public short class_ids;
    public int name_idx;
    public short proto_idx;
    private List<Integer> usedStringList;

    public DexMethodId(short s, short s2, int i) {
        this.class_ids = s;
        this.proto_idx = s2;
        this.name_idx = i;
    }

    public DexTypeId[] getMethodParams(DexParser dexParser) {
        DexProtoId dexProtoId = dexParser.dexDexProtoIdsList[this.proto_idx];
        int i = dexProtoId.parameters_off;
        if (i == 0) {
            return new DexTypeId[0];
        }
        int iByteToUnsignedInt = ConversionUtils.byteToUnsignedInt(Utils.copyArrays(dexParser.dexData, i, 4));
        DexTypeId[] dexTypeIdArr = new DexTypeId[iByteToUnsignedInt];
        for (int i2 = 0; i2 < iByteToUnsignedInt; i2++) {
            dexTypeIdArr[i2] = dexParser.dexTypeIdsList[ConversionUtils.bytesToUnsignedShort(Utils.copyArrays(dexParser.dexData, AbstractC6183.m11574(i2, 2, dexProtoId.parameters_off, 4), 2))];
        }
        return dexTypeIdArr;
    }

    public DexTypeId getReturnType(DexParser dexParser) {
        return dexParser.dexTypeIdsList[dexParser.dexDexProtoIdsList[this.proto_idx].return_type_idx];
    }

    public List<Integer> getUsedStringList() {
        return this.usedStringList;
    }

    public void initUsedStringList() {
        this.usedStringList = new ArrayList();
    }

    public DexMethodId() {
    }
}
