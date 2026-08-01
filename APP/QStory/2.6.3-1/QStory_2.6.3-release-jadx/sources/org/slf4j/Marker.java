package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
