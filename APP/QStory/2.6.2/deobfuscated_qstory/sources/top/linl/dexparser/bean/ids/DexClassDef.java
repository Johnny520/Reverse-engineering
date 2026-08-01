package top.linl.dexparser.bean.ids;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DexClassDef extends BaseId {
    public int access_flags;
    public int annotations_off;
    public int class_data_off;
    public int class_idx;
    public int interfaces_off;
    public int source_file_idx;
    public int static_values_off;
    public int superclass_idx;

    public DexClassDef(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.class_idx = i;
        this.access_flags = i2;
        this.superclass_idx = i3;
        this.interfaces_off = i4;
        this.source_file_idx = i5;
        this.annotations_off = i6;
        this.class_data_off = i7;
        this.static_values_off = i8;
    }
}
