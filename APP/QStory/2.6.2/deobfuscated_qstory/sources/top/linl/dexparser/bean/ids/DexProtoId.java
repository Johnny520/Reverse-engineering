package top.linl.dexparser.bean.ids;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
