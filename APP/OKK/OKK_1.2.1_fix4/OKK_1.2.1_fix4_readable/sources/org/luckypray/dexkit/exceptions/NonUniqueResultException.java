package org.luckypray.dexkit.exceptions;

import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: loaded from: classes.dex */
public final class NonUniqueResultException extends RuntimeException {
    public NonUniqueResultException() {
    }

    public NonUniqueResultException(int i2) {
        super(AbstractC0324d.m720c("query did not return a unique result: ", i2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonUniqueResultException(String str) {
        super(str);
        AbstractC0307g.m703e(str, "message");
    }
}
