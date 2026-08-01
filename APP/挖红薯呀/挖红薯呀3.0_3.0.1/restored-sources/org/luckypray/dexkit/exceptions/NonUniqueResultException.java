package org.luckypray.dexkit.exceptions;

import p000.AbstractC0748t1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class NonUniqueResultException extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NonUniqueResultException(int i) {
        super(AbstractC0748t1.m4154l("query did not return a unique result: ", i));
    }

    public NonUniqueResultException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonUniqueResultException(String str) {
        super(str);
        str.getClass();
    }
}
