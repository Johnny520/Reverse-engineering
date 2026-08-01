package net.bytebuddy.implementation.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.type.RecordComponentDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.attribute.AnnotationAppender;
import net.bytebuddy.jar.asm.RecordComponentVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface RecordComponentAttributeAppender {
    void apply(RecordComponentVisitor recordComponentVisitor, RecordComponentDescription recordComponentDescription, AnnotationValueFilter annotationValueFilter);

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements RecordComponentAttributeAppender, Factory {
        private final List<? extends AnnotationDescription> annotations;

        public Explicit(List<? extends AnnotationDescription> list) {
            this.annotations = list;
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public void apply(RecordComponentVisitor recordComponentVisitor, RecordComponentDescription recordComponentDescription, AnnotationValueFilter annotationValueFilter) {
            AnnotationAppender annotationAppenderAppend = new AnnotationAppender.Default(new AnnotationAppender.Target.OnRecordComponent(recordComponentVisitor));
            Iterator<? extends AnnotationDescription> it = this.annotations.iterator();
            while (it.hasNext()) {
                annotationAppenderAppend = annotationAppenderAppend.append(it.next(), annotationValueFilter);
            }
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.annotations.equals(((Explicit) obj).annotations);
        }

        public int hashCode() {
            return this.annotations.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory
        public RecordComponentAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum ForInstrumentedRecordComponent implements RecordComponentAttributeAppender, Factory {
        INSTANCE;

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public void apply(RecordComponentVisitor recordComponentVisitor, RecordComponentDescription recordComponentDescription, AnnotationValueFilter annotationValueFilter) {
            AnnotationAppender annotationAppenderAppend = (AnnotationAppender) recordComponentDescription.getType().accept(AnnotationAppender.ForTypeAnnotations.ofFieldType(new AnnotationAppender.Default(new AnnotationAppender.Target.OnRecordComponent(recordComponentVisitor)), annotationValueFilter));
            Iterator<AnnotationDescription> it = recordComponentDescription.getDeclaredAnnotations().iterator();
            while (it.hasNext()) {
                annotationAppenderAppend = annotationAppenderAppend.append(it.next(), annotationValueFilter);
            }
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory
        public RecordComponentAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum NoOp implements RecordComponentAttributeAppender, Factory {
        INSTANCE;

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory
        public RecordComponentAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public void apply(RecordComponentVisitor recordComponentVisitor, RecordComponentDescription recordComponentDescription, AnnotationValueFilter annotationValueFilter) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface Factory {
        RecordComponentAttributeAppender make(TypeDescription typeDescription);

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements Factory {
            private final List<Factory> factories;

            public Compound(List<? extends Factory> list) {
                this.factories = new ArrayList();
                for (Factory factory : list) {
                    if (factory instanceof Compound) {
                        this.factories.addAll(((Compound) factory).factories);
                    } else if (!(factory instanceof NoOp)) {
                        this.factories.add(factory);
                    }
                }
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.factories.equals(((Compound) obj).factories);
            }

            public int hashCode() {
                return this.factories.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory
            public RecordComponentAttributeAppender make(TypeDescription typeDescription) {
                ArrayList arrayList = new ArrayList(this.factories.size());
                Iterator<Factory> it = this.factories.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().make(typeDescription));
                }
                return new Compound(arrayList);
            }

            public Compound(Factory... factoryArr) {
                this((List<? extends Factory>) Arrays.asList(factoryArr));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements RecordComponentAttributeAppender {
        private final List<RecordComponentAttributeAppender> recordComponentAttributeAppenders;

        public Compound(List<? extends RecordComponentAttributeAppender> list) {
            this.recordComponentAttributeAppenders = new ArrayList();
            for (RecordComponentAttributeAppender recordComponentAttributeAppender : list) {
                if (recordComponentAttributeAppender instanceof Compound) {
                    this.recordComponentAttributeAppenders.addAll(((Compound) recordComponentAttributeAppender).recordComponentAttributeAppenders);
                } else if (!(recordComponentAttributeAppender instanceof NoOp)) {
                    this.recordComponentAttributeAppenders.add(recordComponentAttributeAppender);
                }
            }
        }

        @Override // net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender
        public void apply(RecordComponentVisitor recordComponentVisitor, RecordComponentDescription recordComponentDescription, AnnotationValueFilter annotationValueFilter) {
            Iterator<RecordComponentAttributeAppender> it = this.recordComponentAttributeAppenders.iterator();
            while (it.hasNext()) {
                it.next().apply(recordComponentVisitor, recordComponentDescription, annotationValueFilter);
            }
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.recordComponentAttributeAppenders.equals(((Compound) obj).recordComponentAttributeAppenders);
        }

        public int hashCode() {
            return this.recordComponentAttributeAppenders.hashCode() + (getClass().hashCode() * 31);
        }

        public Compound(RecordComponentAttributeAppender... recordComponentAttributeAppenderArr) {
            this((List<? extends RecordComponentAttributeAppender>) Arrays.asList(recordComponentAttributeAppenderArr));
        }
    }
}
