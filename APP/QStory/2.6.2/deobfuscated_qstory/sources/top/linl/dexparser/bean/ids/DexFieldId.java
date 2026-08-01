package top.linl.dexparser.bean.ids;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
