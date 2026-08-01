package top.linl.dexparser.bean.ids;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexProtoId extends BaseId {
    int parameters_off;
    int return_type_idx;
    int shorty_idx;

    public DexProtoId(int i, int i2, int i3) {
        this.shorty_idx = i;
        this.return_type_idx = i2;
        this.parameters_off = i3;
    }

    public DexProtoId() {
    }
}
