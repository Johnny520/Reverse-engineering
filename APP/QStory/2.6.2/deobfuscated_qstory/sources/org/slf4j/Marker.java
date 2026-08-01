package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface Marker extends Serializable {
    public static final String ANY_MARKER = "*";
    public static final String ANY_NON_NULL_MARKER = "+";

    void add(Marker marker);

    boolean contains(String str);

    boolean contains(Marker marker);

    boolean equals(Object obj);

    String getName();

    @Deprecated
    boolean hasChildren();

    boolean hasReferences();

    int hashCode();

    Iterator<Marker> iterator();

    boolean remove(Marker marker);
}
