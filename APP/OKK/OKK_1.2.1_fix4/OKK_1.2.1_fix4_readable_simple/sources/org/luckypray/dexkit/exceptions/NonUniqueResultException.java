package org.luckypray.dexkit.exceptions;

import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: loaded from: classes.dex */
public final class NonUniqueResultException extends RuntimeException {
    public NonUniqueResultException() {
    }

    public NonUniqueResultException(int r2) {
        super(AbstractC0324d.m720c("query did not return a unique result: ", r2));
    }

    public NonUniqueResultException(String r2) {
        AbstractC0307g.m703e(r2, "message");
        super(r2);
    }
}
