package org.luckypray.dexkit.exceptions;

import kotlin.Metadata;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "resultCount", "", "(I)V", "message", "", "(Ljava/lang/String;)V", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NonUniqueResultException extends RuntimeException {
    public NonUniqueResultException(int i) {
        super(AbstractC6136.m11556(i, "query did not return a unique result: "));
    }

    public NonUniqueResultException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonUniqueResultException(String str) {
        super(str);
        str.getClass();
    }
}
