package top.linl.dexparser.bean;

import androidx.activity.AbstractC0900;
import java.nio.charset.StandardCharsets;
import top.linl.dexparser.util.ByteReader;
import top.linl.dexparser.util.ConversionUtils;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexHeader {
    public long checkSum;
    public int class_defs_off;
    public int class_defs_size;
    public int data_off;
    public int data_size;
    public int endian_tag;
    public int field_ids_off;
    public int field_ids_size;
    public int file_size;
    public int header_size;
    public int link_off;
    public int link_size;
    public String magic;
    public int map_off;
    public int method_ids_off;
    public int method_ids_size;
    public int proto_ids_off;
    public int proto_ids_size;
    public String signature;
    public int string_ids_off;
    public int string_ids_size;
    public int type_ids_off;
    public int type_ids_size;

    public DexHeader(ByteReader byteReader) {
        this.magic = new String(byteReader.read(8), StandardCharsets.UTF_8);
        this.checkSum = ConversionUtils.byte2Int(byteReader.read(4));
        this.signature = ConversionUtils.bytesToHex(byteReader.read(20));
        this.file_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.header_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.endian_tag = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.link_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.link_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.map_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.string_ids_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.string_ids_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.type_ids_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.type_ids_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.proto_ids_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.proto_ids_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.field_ids_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.field_ids_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.method_ids_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.method_ids_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.class_defs_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.class_defs_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.data_size = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
        this.data_off = ConversionUtils.byteToUnsignedInt(byteReader.read(4));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DexHeader{magic='");
        sb.append(this.magic);
        sb.append("', checkSum=");
        sb.append(this.checkSum);
        sb.append(", signature='");
        sb.append(this.signature);
        sb.append("', file_size=");
        sb.append(this.file_size);
        sb.append(", header_size=");
        sb.append(this.header_size);
        sb.append(", endian_tag=");
        sb.append(this.endian_tag);
        sb.append(", link_size=");
        sb.append(this.link_size);
        sb.append(", link_off=");
        sb.append(this.link_off);
        sb.append(", map_off=");
        sb.append(this.map_off);
        sb.append(", string_ids_size=");
        sb.append(this.string_ids_size);
        sb.append(", string_ids_off=");
        sb.append(this.string_ids_off);
        sb.append(", type_ids_size=");
        sb.append(this.type_ids_size);
        sb.append(", type_ids_off=");
        sb.append(this.type_ids_off);
        sb.append(", proto_ids_size=");
        sb.append(this.proto_ids_size);
        sb.append(", proto_ids_off=");
        sb.append(this.proto_ids_off);
        sb.append(", field_ids_size=");
        sb.append(this.field_ids_size);
        sb.append(", field_ids_off=");
        sb.append(this.field_ids_off);
        sb.append(", method_ids_size=");
        sb.append(this.method_ids_size);
        sb.append(", method_ids_off=");
        sb.append(this.method_ids_off);
        sb.append(", class_defs_size=");
        sb.append(this.class_defs_size);
        sb.append(", class_defs_off=");
        sb.append(this.class_defs_off);
        sb.append(", data_size=");
        sb.append(this.data_size);
        sb.append(", data_off=");
        return AbstractC0900.m716(sb, this.data_off, '}');
    }
}
