package org.slf4j.spi;

/* JADX INFO: loaded from: classes2.dex */
public interface MDCAdapter {
    void clear();

    java.lang.String get(java.lang.String r1);

    void put(java.lang.String r1, java.lang.String r2);

    void remove(java.lang.String r1);

    /* JADX INFO: renamed from: ۥ */
    void mo4584(java.util.Map<java.lang.String, java.lang.String> r1);

    /* JADX INFO: renamed from: ۥ۟ */
    java.util.Map<java.lang.String, java.lang.String> mo4585();
}
