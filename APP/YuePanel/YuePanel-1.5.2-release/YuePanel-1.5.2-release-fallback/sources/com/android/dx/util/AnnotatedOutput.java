package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public interface AnnotatedOutput extends com.android.dx.util.Output {
    void annotate(int r1, java.lang.String r2);

    void annotate(java.lang.String r1);

    boolean annotates();

    void endAnnotation();

    int getAnnotationWidth();

    boolean isVerbose();
}
