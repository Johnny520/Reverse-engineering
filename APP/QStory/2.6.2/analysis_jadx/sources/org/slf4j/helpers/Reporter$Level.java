package org.slf4j.helpers;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
enum Reporter$Level {
    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3);

    int levelInt;

    Reporter$Level(int i) {
        this.levelInt = i;
    }

    private int getLevelInt() {
        return this.levelInt;
    }
}
