package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.AbstractC4384;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class InconsistentKotlinMetadataException extends IllegalArgumentException {
    public /* synthetic */ InconsistentKotlinMetadataException(String str, Throwable th, int i, AbstractC4384 abstractC4384) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InconsistentKotlinMetadataException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}
