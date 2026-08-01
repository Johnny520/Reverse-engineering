package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2233 extends InterfaceC2230, InterfaceC2168 {
    @Override // androidx.compose.runtime.InterfaceC2168
    default Object getValue() {
        return Integer.valueOf(((AbstractC2181) this).m2992());
    }

    @Override // androidx.compose.runtime.InterfaceC2230
    default void setValue(Object obj) {
        ((AbstractC2181) this).m2993(((Number) obj).intValue());
    }
}
