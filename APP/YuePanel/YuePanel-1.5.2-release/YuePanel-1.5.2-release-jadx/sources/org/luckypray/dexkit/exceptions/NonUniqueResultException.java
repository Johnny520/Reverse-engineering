package org.luckypray.dexkit.exceptions;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "resultCount", "", "(I)V", "message", "", "(Ljava/lang/String;)V", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class NonUniqueResultException extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NonUniqueResultException() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NonUniqueResultException(int i) {
        super("query did not return a unique result: " + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonUniqueResultException(@InterfaceC6399 String str) {
        super(str);
        C5499.m17103(str, "message");
    }
}
