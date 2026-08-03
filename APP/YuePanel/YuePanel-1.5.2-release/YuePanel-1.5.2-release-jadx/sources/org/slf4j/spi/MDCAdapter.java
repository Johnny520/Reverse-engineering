package org.slf4j.spi;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface MDCAdapter {
    void clear();

    String get(String str);

    void put(String str, String str2);

    void remove(String str);

    /* JADX INFO: renamed from: ۥ */
    void mo586(Map<String, String> map);

    /* JADX INFO: renamed from: ۥ۟ */
    Map<String, String> mo587();
}
