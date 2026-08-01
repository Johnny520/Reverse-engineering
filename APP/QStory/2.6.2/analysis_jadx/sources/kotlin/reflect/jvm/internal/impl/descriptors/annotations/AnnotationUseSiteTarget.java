package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.bumptech.glide.AbstractC3056;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.AbstractC4384;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationUseSiteTarget {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
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
        $ENTRIES = AbstractC4363.m8876(annotationUseSiteTargetArr$values);
    }

    private AnnotationUseSiteTarget(String str, int i, String str2) {
        this.renderName = str2 == null ? AbstractC3056.m6707(name()) : str2;
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

    public /* synthetic */ AnnotationUseSiteTarget(String str, int i, String str2, int i2, AbstractC4384 abstractC4384) {
        this(str, i, (i2 & 1) != 0 ? null : str2);
    }
}
