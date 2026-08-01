package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.jvm.internal.AbstractC5217;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class InconsistentKotlinMetadataException extends IllegalArgumentException {
    public /* synthetic */ InconsistentKotlinMetadataException(String str, Throwable th, int i, AbstractC5217 abstractC5217) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InconsistentKotlinMetadataException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}
