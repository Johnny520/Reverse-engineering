package org.luckypray.dexkit.exceptions;

import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class NoResultException extends RuntimeException {
    public NoResultException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoResultException(String str) {
        super(str);
        AbstractC0307g.m703e(str, "message");
    }
}
