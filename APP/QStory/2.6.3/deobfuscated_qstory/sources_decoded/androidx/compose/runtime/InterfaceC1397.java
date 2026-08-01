package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1397 extends InterfaceC1395, InterfaceC1333 {
    @Override // androidx.compose.runtime.InterfaceC1333
    default Object getValue() {
        return Float.valueOf(((AbstractC1349) this).m2434());
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    default void setValue(Object obj) {
        ((AbstractC1349) this).m2435(((Number) obj).floatValue());
    }
}
