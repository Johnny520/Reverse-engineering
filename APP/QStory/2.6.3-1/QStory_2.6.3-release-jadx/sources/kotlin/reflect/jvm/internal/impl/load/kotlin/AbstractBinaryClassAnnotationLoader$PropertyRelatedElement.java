package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final class AbstractBinaryClassAnnotationLoader$PropertyRelatedElement {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ AbstractBinaryClassAnnotationLoader$PropertyRelatedElement[] $VALUES;
    public static final AbstractBinaryClassAnnotationLoader$PropertyRelatedElement PROPERTY = new AbstractBinaryClassAnnotationLoader$PropertyRelatedElement("PROPERTY", 0);
    public static final AbstractBinaryClassAnnotationLoader$PropertyRelatedElement BACKING_FIELD = new AbstractBinaryClassAnnotationLoader$PropertyRelatedElement("BACKING_FIELD", 1);
    public static final AbstractBinaryClassAnnotationLoader$PropertyRelatedElement DELEGATE_FIELD = new AbstractBinaryClassAnnotationLoader$PropertyRelatedElement("DELEGATE_FIELD", 2);

    private static final /* synthetic */ AbstractBinaryClassAnnotationLoader$PropertyRelatedElement[] $values() {
        return new AbstractBinaryClassAnnotationLoader$PropertyRelatedElement[]{PROPERTY, BACKING_FIELD, DELEGATE_FIELD};
    }

    static {
        AbstractBinaryClassAnnotationLoader$PropertyRelatedElement[] abstractBinaryClassAnnotationLoader$PropertyRelatedElementArr$values = $values();
        $VALUES = abstractBinaryClassAnnotationLoader$PropertyRelatedElementArr$values;
        $ENTRIES = AbstractC5196.m9425(abstractBinaryClassAnnotationLoader$PropertyRelatedElementArr$values);
    }

    private AbstractBinaryClassAnnotationLoader$PropertyRelatedElement(String str, int i) {
    }

    public static AbstractBinaryClassAnnotationLoader$PropertyRelatedElement valueOf(String str) {
        return (AbstractBinaryClassAnnotationLoader$PropertyRelatedElement) Enum.valueOf(AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.class, str);
    }

    public static AbstractBinaryClassAnnotationLoader$PropertyRelatedElement[] values() {
        return (AbstractBinaryClassAnnotationLoader$PropertyRelatedElement[]) $VALUES.clone();
    }
}
