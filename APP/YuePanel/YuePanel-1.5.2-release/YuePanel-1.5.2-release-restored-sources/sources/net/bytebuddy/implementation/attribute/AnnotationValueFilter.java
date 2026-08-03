package net.bytebuddy.implementation.attribute;

import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.RecordComponentDescription;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationValueFilter {

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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo5356on(FieldDescription fieldDescription) {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo5357on(MethodDescription methodDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo5358on(RecordComponentDescription recordComponentDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo5359on(TypeDescription typeDescription) {
            return this;
        }
    }

    public interface Factory {
        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo5356on(FieldDescription fieldDescription);

        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo5357on(MethodDescription methodDescription);

        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo5358on(RecordComponentDescription recordComponentDescription);

        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo5359on(TypeDescription typeDescription);
    }

    boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape);
}
