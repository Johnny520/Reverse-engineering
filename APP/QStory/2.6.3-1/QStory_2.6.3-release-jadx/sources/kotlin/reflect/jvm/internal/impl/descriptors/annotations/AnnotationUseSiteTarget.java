package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.reflect.jvm.internal.AbstractC5894;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationUseSiteTarget {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ AnnotationUseSiteTarget[] $VALUES;
    private final String renderName;
    public static final AnnotationUseSiteTarget ALL = new AnnotationUseSiteTarget("ALL", 0, null, 1, null);
    public static final AnnotationUseSiteTarget FIELD = new AnnotationUseSiteTarget("FIELD", 1, null, 1, null);
    public static final AnnotationUseSiteTarget FILE = new AnnotationUseSiteTarget("FILE", 2, null, 1, null);
    public static final AnnotationUseSiteTarget PROPERTY = new AnnotationUseSiteTarget("PROPERTY", 3, null, 1, null);
    public static final AnnotationUseSiteTarget PROPERTY_GETTER = new AnnotationUseSiteTarget("PROPERTY_GETTER", 4, "get");
    public static final AnnotationUseSiteTarget PROPERTY_SETTER = new AnnotationUseSiteTarget("PROPERTY_SETTER", 5, "set");
    public static final AnnotationUseSiteTarget RECEIVER = new AnnotationUseSiteTarget("RECEIVER", 6, null, 1, null);
    public static final AnnotationUseSiteTarget CONSTRUCTOR_PARAMETER = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 7, "param");
    public static final AnnotationUseSiteTarget SETTER_PARAMETER = new AnnotationUseSiteTarget("SETTER_PARAMETER", 8, "setparam");
    public static final AnnotationUseSiteTarget PROPERTY_DELEGATE_FIELD = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 9, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);

    private static final /* synthetic */ AnnotationUseSiteTarget[] $values() {
        return new AnnotationUseSiteTarget[]{ALL, FIELD, FILE, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, RECEIVER, CONSTRUCTOR_PARAMETER, SETTER_PARAMETER, PROPERTY_DELEGATE_FIELD};
    }

    static {
        AnnotationUseSiteTarget[] annotationUseSiteTargetArr$values = $values();
        $VALUES = annotationUseSiteTargetArr$values;
        $ENTRIES = AbstractC5196.m9425(annotationUseSiteTargetArr$values);
    }

    private AnnotationUseSiteTarget(String str, int i, String str2) {
        this.renderName = str2 == null ? AbstractC5894.m10574(name()) : str2;
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) $VALUES.clone();
    }

    public final String getRenderName() {
        return this.renderName;
    }

    public /* synthetic */ AnnotationUseSiteTarget(String str, int i, String str2, int i2, AbstractC5217 abstractC5217) {
        this(str, i, (i2 & 1) != 0 ? null : str2);
    }
}
