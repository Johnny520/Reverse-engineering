package com.typesafe.config.impl;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
enum ResolveStatus {
    UNRESOLVED,
    RESOLVED;

    public static final ResolveStatus fromBoolean(boolean z) {
        return z ? RESOLVED : UNRESOLVED;
    }

    public static final ResolveStatus fromValues(Collection<? extends AbstractC4675> collection) {
        Iterator<? extends AbstractC4675> it = collection.iterator();
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
