package com.android.dx.rop.annotation;

import com.android.dx.util.ToHuman;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum AnnotationVisibility implements ToHuman {
    RUNTIME("runtime"),
    BUILD("build"),
    SYSTEM("system"),
    EMBEDDED("embedded");

    private final String human;

    AnnotationVisibility(String str) {
        this.human = str;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return this.human;
    }
}
