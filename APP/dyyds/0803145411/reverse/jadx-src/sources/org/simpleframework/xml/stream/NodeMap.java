package org.simpleframework.xml.stream;

import java.util.Iterator;
import org.simpleframework.xml.stream.Node;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public interface NodeMap<T extends Node> extends Iterable<String> {
    T get(String str);

    String getName();

    T getNode();

    @Override // java.lang.Iterable
    Iterator<String> iterator();

    T put(String str, String str2);

    T remove(String str);
}
