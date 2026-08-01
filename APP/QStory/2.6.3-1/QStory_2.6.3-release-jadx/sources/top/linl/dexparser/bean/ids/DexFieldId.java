package top.linl.dexparser.bean.ids;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexFieldId extends BaseId {
    public short class_idx;
    public int name_idx;
    public short type_idx;

    public DexFieldId(short s, short s2, int i) {
        this.class_idx = s;
        this.type_idx = s2;
        this.name_idx = i;
    }

    public DexFieldId() {
    }
}
