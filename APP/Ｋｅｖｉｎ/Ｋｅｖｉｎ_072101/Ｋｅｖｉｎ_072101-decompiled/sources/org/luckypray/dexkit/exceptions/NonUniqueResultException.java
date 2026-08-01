package org.luckypray.dexkit.exceptions;

/* JADX INFO: compiled from: NonUniqueResultException.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m115d2 = {"Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "resultCount", "", "(I)V", "message", "", "(Ljava/lang/String;)V", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class NonUniqueResultException extends java.lang.RuntimeException {
    public NonUniqueResultException() {
            r0 = this;
            r0.<init>()
            return
    }

    public NonUniqueResultException(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "query did not return a unique result: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            return
    }

    public NonUniqueResultException(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }
}
