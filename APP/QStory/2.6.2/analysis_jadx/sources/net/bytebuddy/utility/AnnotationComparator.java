package net.bytebuddy.utility;

import java.lang.annotation.Annotation;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
