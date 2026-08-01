package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2232 extends InterfaceC2230, InterfaceC2168 {
    @Override // androidx.compose.runtime.InterfaceC2168
    default Object getValue() {
        return Float.valueOf(((AbstractC2184) this).m2994());
    }

    @Override // androidx.compose.runtime.InterfaceC2230
    default void setValue(Object obj) {
        ((AbstractC2184) this).m2995(((Number) obj).floatValue());
    }
}
