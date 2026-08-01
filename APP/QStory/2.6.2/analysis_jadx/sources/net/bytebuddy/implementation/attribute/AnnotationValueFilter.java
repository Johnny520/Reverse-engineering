package net.bytebuddy.implementation.attribute;

import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.RecordComponentDescription;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationValueFilter {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Default implements AnnotationValueFilter, Factory {
        SKIP_DEFAULTS { // from class: net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.1
            @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter
            public boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape) {
                AnnotationValue<?, ?> defaultValue = inDefinedShape.getDefaultValue();
                return defaultValue == null || !defaultValue.equals(annotationDescription.getValue(inDefinedShape));
            }
        },
        APPEND_DEFAULTS { // from class: net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.2
            @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter
            public boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape) {
                return true;
            }
        };

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public AnnotationValueFilter on(MethodDescription methodDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public AnnotationValueFilter on(RecordComponentDescription recordComponentDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public AnnotationValueFilter on(TypeDescription typeDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public AnnotationValueFilter on(FieldDescription fieldDescription) {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface Factory {
        AnnotationValueFilter on(FieldDescription fieldDescription);

        AnnotationValueFilter on(MethodDescription methodDescription);

        AnnotationValueFilter on(RecordComponentDescription recordComponentDescription);

        AnnotationValueFilter on(TypeDescription typeDescription);
    }

    boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape);
}
