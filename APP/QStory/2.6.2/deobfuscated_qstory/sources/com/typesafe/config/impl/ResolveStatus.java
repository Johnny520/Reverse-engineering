package com.typesafe.config.impl;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
enum ResolveStatus {
    UNRESOLVED,
    RESOLVED;

    public static final ResolveStatus fromBoolean(boolean z) {
        return z ? RESOLVED : UNRESOLVED;
    }

    public static final ResolveStatus fromValues(Collection<? extends AbstractC3842> collection) {
        Iterator<? extends AbstractC3842> it = collection.iterator();
        while (it.hasNext()) {
            ResolveStatus resolveStatus = it.next().resolveStatus();
            ResolveStatus resolveStatus2 = UNRESOLVED;
            if (resolveStatus == resolveStatus2) {
                return resolveStatus2;
            }
        }
        return RESOLVED;
    }
}
