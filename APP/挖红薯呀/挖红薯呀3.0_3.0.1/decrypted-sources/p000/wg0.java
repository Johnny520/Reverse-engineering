package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface wg0 extends oh0, w31 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    default Object getValue() {
        return Integer.valueOf(((dp0) this).m720g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oh0
    default void setValue(Object obj) {
        ((dp0) this).m721h(((Number) obj).intValue());
    }
}
