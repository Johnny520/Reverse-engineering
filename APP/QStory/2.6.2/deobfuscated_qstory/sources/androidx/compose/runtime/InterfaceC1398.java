package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1398 extends InterfaceC1395, InterfaceC1333 {
    @Override // androidx.compose.runtime.InterfaceC1333
    default Object getValue() {
        return Integer.valueOf(((AbstractC1346) this).m2422());
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    default void setValue(Object obj) {
        ((AbstractC1346) this).m2423(((Number) obj).intValue());
    }
}
