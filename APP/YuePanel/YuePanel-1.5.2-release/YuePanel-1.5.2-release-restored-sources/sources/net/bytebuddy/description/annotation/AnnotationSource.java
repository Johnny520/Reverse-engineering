package net.bytebuddy.description.annotation;

import java.util.Arrays;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationSource {

    public enum Empty implements AnnotationSource {
        INSTANCE;

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Empty();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements AnnotationSource {
        private final List<? extends AnnotationDescription> annotations;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            return (getClass().hashCode() * 31) + this.annotations.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Explicit(List<? extends AnnotationDescription> list) {
            this.annotations = list;
        }
    }

    AnnotationList getDeclaredAnnotations();
}
