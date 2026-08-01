package net.bytebuddy.description.annotation;

import java.util.Arrays;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationSource {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Empty implements AnnotationSource {
        INSTANCE;

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Empty();
        }
    }

    AnnotationList getDeclaredAnnotations();

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements AnnotationSource {
        private final List<? extends AnnotationDescription> annotations;

        public Explicit(AnnotationDescription... annotationDescriptionArr) {
            this((List<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.annotations.equals(((Explicit) obj).annotations);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Explicit(this.annotations);
        }

        public int hashCode() {
            return this.annotations.hashCode() + (getClass().hashCode() * 31);
        }

        public Explicit(List<? extends AnnotationDescription> list) {
            this.annotations = list;
        }
    }
}
