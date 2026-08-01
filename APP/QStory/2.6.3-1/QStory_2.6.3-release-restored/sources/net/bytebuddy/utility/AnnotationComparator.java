package net.bytebuddy.utility;

import java.lang.annotation.Annotation;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum AnnotationComparator implements Comparator<Annotation> {
    INSTANCE;

    @Override // java.util.Comparator
    public int compare(Annotation annotation, Annotation annotation2) {
        if (annotation == annotation2) {
            return 0;
        }
        return annotation.annotationType().getName().compareTo(annotation2.annotationType().getName());
    }
}
