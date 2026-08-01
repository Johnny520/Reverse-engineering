package top.linl.dexparser;

import top.linl.dexparser.bean.DexHeader;
import top.linl.dexparser.bean.DexMap;
import top.linl.dexparser.bean.ids.DexClassDef;
import top.linl.dexparser.bean.ids.DexFieldId;
import top.linl.dexparser.bean.ids.DexMethodId;
import top.linl.dexparser.bean.ids.DexProtoId;
import top.linl.dexparser.bean.ids.DexStringId;
import top.linl.dexparser.bean.ids.DexTypeId;
import top.linl.dexparser.util.ByteReader;
import top.linl.dexparser.util.ConversionUtils;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DexParser {
    public DexClassDef[] dexClassDefList;
    public byte[] dexData;
    public DexProtoId[] dexDexProtoIdsList;
    public DexFieldId[] dexFieldIdsList;
    public DexHeader dexHeader;
    public DexMap dexMap;
    public DexMethodId[] dexMethodIdsList;
    private String dexName;
    public DexStringId[] dexStringIdsList;
    public DexTypeId[] dexTypeIdsList;
    private ByteReader reader;

    public DexParser(byte[] bArr, String str) {
        this.dexData = bArr;
        setDexName(str);
        ByteReader byteReader = new ByteReader(bArr);
        this.reader = byteReader;
        DexHeader dexHeader = new DexHeader(byteReader);
        this.dexHeader = dexHeader;
        this.dexStringIdsList = new DexStringId[dexHeader.string_ids_size];
        this.dexTypeIdsList = new DexTypeId[dexHeader.type_ids_size];
        this.dexDexProtoIdsList = new DexProtoId[dexHeader.proto_ids_size];
        this.dexFieldIdsList = new DexFieldId[dexHeader.field_ids_size];
        this.dexMethodIdsList = new DexMethodId[dexHeader.method_ids_size];
        this.dexClassDefList = new DexClassDef[dexHeader.class_defs_size];
    }

    public static int[] SplitHexInt(int i) {
        int[] iArr = new int[2];
        if (i < 256) {
            iArr[1] = i;
            return iArr;
        }
        iArr[0] = i / 256;
        iArr[1] = i % 256;
        return iArr;
    }

    public static boolean isCommonlyUsedClass(String str) {
        return str.startsWith("Ljava") || str.startsWith("Landroid") || str.startsWith("Lkotlin") || str.startsWith("Lcom/android") || str.startsWith("Lcom/google") || str.startsWith("Lcom/microsoft") || str.startsWith("Ldalvik");
    }

    private void paresMethodInstructionSet(DexMethodId dexMethodId, int i) {
        if (i == 0) {
            return;
        }
        ByteReader byteReader = new ByteReader(this.dexData);
        byteReader.setStartPosition(i);
        ConversionUtils.bytesToUnsignedShort(byteReader.read(2));
        ConversionUtils.bytesToUnsignedShort(byteReader.read(2));
        ConversionUtils.bytesToUnsignedShort(byteReader.read(2));
        ConversionUtils.bytesToUnsignedShort(byteReader.read(2));
        ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        int iByteToUnsignedInt = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        int i2 = 0;
        while (i2 < iByteToUnsignedInt) {
            int i3 = SplitHexInt(ConversionUtils.bytesToUnsignedShort(byteReader.read(2)))[1];
            if (i3 == 26) {
                int iBytesToUnsignedShort = ConversionUtils.bytesToUnsignedShort(byteReader.read(2));
                i2++;
                if (iBytesToUnsignedShort <= this.dexStringIdsList.length) {
                    if (dexMethodId.getUsedStringList() == null) {
                        dexMethodId.initUsedStringList();
                    }
                    dexMethodId.getUsedStringList().add(Integer.valueOf(iBytesToUnsignedShort));
                }
            } else if (i3 == 27) {
                int iByteToUnsignedInt2 = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
                i2 += 2;
                if (iByteToUnsignedInt2 < this.dexStringIdsList.length && iByteToUnsignedInt2 >= 0) {
                    if (dexMethodId.getUsedStringList() == null) {
                        dexMethodId.initUsedStringList();
                    }
                    dexMethodId.getUsedStringList().add(Integer.valueOf(iByteToUnsignedInt2));
                }
            }
            i2++;
        }
    }

    private void parseClassData(int i) {
        if (i == 0) {
            return;
        }
        ByteReader byteReader = new ByteReader(this.dexData);
        byteReader.setStartPosition(i);
        int unsignedLeb128 = byteReader.readUnsignedLeb128();
        int unsignedLeb1282 = byteReader.readUnsignedLeb128();
        int unsignedLeb1283 = byteReader.readUnsignedLeb128();
        int unsignedLeb1284 = byteReader.readUnsignedLeb128();
        int unsignedLeb1285 = -1;
        for (int i2 = 0; i2 < unsignedLeb128; i2++) {
            unsignedLeb1285 = unsignedLeb1285 == -1 ? byteReader.readUnsignedLeb128() : byteReader.readUnsignedLeb128() + unsignedLeb1285;
            byteReader.readUnsignedLeb128();
        }
        int unsignedLeb1286 = -1;
        for (int i3 = 0; i3 < unsignedLeb1282; i3++) {
            unsignedLeb1286 = unsignedLeb1286 == -1 ? byteReader.readUnsignedLeb128() : byteReader.readUnsignedLeb128() + unsignedLeb1286;
            byteReader.readUnsignedLeb128();
        }
        int unsignedLeb1287 = -1;
        for (int i4 = 0; i4 < unsignedLeb1283; i4++) {
            unsignedLeb1287 = unsignedLeb1287 == -1 ? byteReader.readUnsignedLeb128() : byteReader.readUnsignedLeb128() + unsignedLeb1287;
            byteReader.readUnsignedLeb128();
            paresMethodInstructionSet(this.dexMethodIdsList[unsignedLeb1287], byteReader.readUnsignedLeb128());
        }
        int unsignedLeb1288 = -1;
        for (int i5 = 0; i5 < unsignedLeb1284; i5++) {
            unsignedLeb1288 = unsignedLeb1288 == -1 ? byteReader.readUnsignedLeb128() : byteReader.readUnsignedLeb128() + unsignedLeb1288;
            byteReader.readUnsignedLeb128();
            paresMethodInstructionSet(this.dexMethodIdsList[unsignedLeb1288], byteReader.readUnsignedLeb128());
        }
    }

    private void parseClassDef() {
        DexMap.Item itemFindItem = this.dexMap.findItem(6);
        this.reader.setStartPosition(itemFindItem.offset);
        for (int i = 0; i < itemFindItem.size; i++) {
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            int iByteToUnsignedInt = ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            parseClassData(iByteToUnsignedInt);
        }
    }

    private void parseField() {
        DexMap.Item itemFindItem = this.dexMap.findItem(4);
        this.reader.setStartPosition(itemFindItem.offset);
        for (int i = 0; i < itemFindItem.size; i++) {
            this.dexFieldIdsList[i] = new DexFieldId((short) ConversionUtils.bytesToUnsignedShort(this.reader.read(2)), (short) ConversionUtils.bytesToUnsignedShort(this.reader.read(2)), ConversionUtils.byteToUnsignedInt(this.reader.read(4)));
        }
    }

    private void parseMap() {
        this.dexMap = new DexMap();
        ByteReader byteReader = new ByteReader(this.dexData);
        byteReader.setStartPosition(this.dexHeader.map_off);
        int iByteToUnsignedInt = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        for (int i = 0; i < iByteToUnsignedInt; i++) {
            int iBytesToUnsignedShort = ConversionUtils.bytesToUnsignedShort(byteReader.read(2));
            ConversionUtils.bytesToUnsignedShort(byteReader.read(2));
            this.dexMap.addItem(iBytesToUnsignedShort, ConversionUtils.byteToUnsignedInt(byteReader.read(4)), ConversionUtils.byteToUnsignedInt(byteReader.read(4)));
        }
    }

    private void parseMethod() {
        DexMap.Item itemFindItem = this.dexMap.findItem(5);
        this.reader.setStartPosition(itemFindItem.offset);
        for (int i = 0; i < itemFindItem.size; i++) {
            this.dexMethodIdsList[i] = new DexMethodId((short) ConversionUtils.bytesToUnsignedShort(this.reader.read(2)), (short) ConversionUtils.bytesToUnsignedShort(this.reader.read(2)), ConversionUtils.byteToUnsignedInt(this.reader.read(4)));
        }
    }

    private void parseProto() {
        for (int i = 0; i < this.dexHeader.proto_ids_size; i++) {
            this.dexDexProtoIdsList[i] = new DexProtoId(ConversionUtils.byteToUnsignedInt(this.reader.read(4)), ConversionUtils.byteToUnsignedInt(this.reader.read(4)), ConversionUtils.byteToUnsignedInt(this.reader.read(4)));
        }
    }

    private void parseStringConstantPools() {
        DexMap.Item itemFindItem = this.dexMap.findItem(1);
        this.reader.setStartPosition(itemFindItem.offset);
        for (int i = 0; i < itemFindItem.size; i++) {
            int iByteToUnsignedInt = ConversionUtils.byteToUnsignedInt(this.reader.read(4));
            ConversionUtils.readULeb128(this.dexData, iByteToUnsignedInt);
            int i2 = 0;
            do {
                i2++;
            } while (this.dexData[i2 + iByteToUnsignedInt + 1] != 0);
            this.dexStringIdsList[i] = new DexStringId(iByteToUnsignedInt, i2);
        }
    }

    private void parseType() {
        for (int i = 0; i < this.dexHeader.type_ids_size; i++) {
            this.dexTypeIdsList[i] = new DexTypeId(ConversionUtils.byteToUnsignedInt(this.reader.read(4)));
        }
    }

    public void closeDexData() {
        this.dexData = null;
        System.gc();
    }

    public String getDexName() {
        return this.dexName;
    }

    public void parseCallSite() {
        DexMap.Item itemFindItem = this.dexMap.findItem(7);
        this.reader.setStartPosition(itemFindItem.offset);
        for (int i = 0; i < itemFindItem.size; i++) {
            ConversionUtils.byteToUnsignedInt(this.reader.read(4));
        }
    }

    public void parseMethodHandle() {
        DexMap.Item itemFindItem = this.dexMap.findItem(8);
        this.reader.setStartPosition(itemFindItem.offset);
        for (int i = 0; i < itemFindItem.size; i++) {
            ConversionUtils.bytesToUnsignedShort(this.reader.read(2));
            ConversionUtils.bytesToUnsignedShort(this.reader.read(2));
            ConversionUtils.bytesToUnsignedShort(this.reader.read(2));
            ConversionUtils.bytesToUnsignedShort(this.reader.read(2));
        }
    }

    public void setDexData(byte[] bArr) {
        this.dexData = bArr;
    }

    public void setDexName(String str) {
        this.dexName = str;
    }

    public void startParse() {
        parseMap();
        parseStringConstantPools();
        parseType();
        parseProto();
        parseField();
        parseMethod();
        parseClassDef();
        this.dexHeader = null;
        this.dexMap = null;
        this.reader = null;
    }

    public DexParser() {
    }
}
