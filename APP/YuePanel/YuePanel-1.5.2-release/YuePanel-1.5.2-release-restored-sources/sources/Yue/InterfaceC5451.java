package Yue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@InterfaceC4372(message = "Replaced by the {@code androidx.resourceinpsection} package.")
@InterfaceC7157(EnumC3259.f5011)
@Retention(RetentionPolicy.SOURCE)
@InterfaceC7722(allowedTargets = {EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026})
public @interface InterfaceC5451 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۢ$ۥ */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @InterfaceC7157(EnumC3259.f5011)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC7722(allowedTargets = {EnumC3260.f5017, EnumC3260.f5016})
    public @interface InterfaceC0767 {
        String name();

        int value();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۢ$ۥ۟ */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @InterfaceC7157(EnumC3259.f5011)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC7722(allowedTargets = {EnumC3260.f5017, EnumC3260.f5016})
    public @interface InterfaceC0768 {
        int mask() default 0;

        String name();

        int target();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۢ$ۥ۟۟, reason: contains not printable characters */
    public enum EnumC5452 {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    int attributeId() default 0;

    InterfaceC0767[] enumMapping() default {};

    InterfaceC0768[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    EnumC5452 valueType() default EnumC5452.INFERRED;
}
