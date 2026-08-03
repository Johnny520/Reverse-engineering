package Yue;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7095
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@InterfaceC7157(EnumC3259.f5012)
@InterfaceC6297
@Documented
@Repeatable(InterfaceC1172.class)
@InterfaceC7722(allowedTargets = {EnumC3260.f5017, EnumC3260.f5016, EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5023, EnumC3260.f5020, EnumC3260.f5029})
public @interface InterfaceC7114 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۤ$ۥ */
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @InterfaceC7096
    @InterfaceC7157(EnumC3259.f5012)
    @Retention(RetentionPolicy.CLASS)
    @InterfaceC7722(allowedTargets = {EnumC3260.f5017, EnumC3260.f5016, EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5023, EnumC3260.f5020, EnumC3260.f5029})
    public @interface InterfaceC1172 {
        InterfaceC7114[] value();
    }

    int extension();

    int version();
}
