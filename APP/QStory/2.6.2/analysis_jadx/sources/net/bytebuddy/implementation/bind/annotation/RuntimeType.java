package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.implementation.bytecode.assign.Assigner;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeType {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Verifier {
        private Verifier() {
            throw new UnsupportedOperationException();
        }

        public static Assigner.Typing check(AnnotationSource annotationSource) {
            return Assigner.Typing.of(annotationSource.getDeclaredAnnotations().isAnnotationPresent(RuntimeType.class));
        }
    }
}
