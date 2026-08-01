package net.bytebuddy.implementation.attribute;

import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.RecordComponentDescription;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationValueFilter {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo419on(MethodDescription methodDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo420on(RecordComponentDescription recordComponentDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo421on(TypeDescription typeDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        /* JADX INFO: renamed from: on */
        public AnnotationValueFilter mo418on(FieldDescription fieldDescription) {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Factory {
        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo418on(FieldDescription fieldDescription);

        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo419on(MethodDescription methodDescription);

        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo420on(RecordComponentDescription recordComponentDescription);

        /* JADX INFO: renamed from: on */
        AnnotationValueFilter mo421on(TypeDescription typeDescription);
    }

    boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape);
}
