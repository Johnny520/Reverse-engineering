package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
interface Criteria extends Iterable<Object> {
    void commit(Object obj);

    Variable get(Object obj);

    Variable get(Label label);

    Variable remove(Object obj);

    Variable resolve(String str);

    void set(Label label, Object obj);
}
