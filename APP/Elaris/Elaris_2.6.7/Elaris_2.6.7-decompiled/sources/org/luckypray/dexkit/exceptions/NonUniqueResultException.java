package org.luckypray.dexkit.exceptions;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class NonUniqueResultException extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NonUniqueResultException(int i) {
        super("query did not return a unique result: " + i);
    }

    public NonUniqueResultException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonUniqueResultException(String str) {
        super(str);
        str.getClass();
    }
}
