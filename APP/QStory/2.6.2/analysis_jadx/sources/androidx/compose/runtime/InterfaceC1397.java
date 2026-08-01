package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1397 extends InterfaceC1395, InterfaceC1333 {
    @Override // androidx.compose.runtime.InterfaceC1333
    default Object getValue() {
        return Float.valueOf(((AbstractC1349) this).m2424());
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    default void setValue(Object obj) {
        ((AbstractC1349) this).m2425(((Number) obj).floatValue());
    }
}
