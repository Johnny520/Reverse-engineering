package com.android.p002dx.util;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface AnnotatedOutput extends Output {
    void annotate(int i, String str);

    void annotate(String str);

    boolean annotates();

    void endAnnotation();

    int getAnnotationWidth();

    boolean isVerbose();
}
