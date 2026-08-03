package Yue;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۡۦۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@InterfaceC7157(EnumC3259.f5012)
@InterfaceC6297
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC7722(allowedTargets = {EnumC3260.f5017, EnumC3260.f5016, EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5023, EnumC3260.f5020, EnumC3260.f5029})
public @interface InterfaceC7144 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۧ۠$ۥ */
    public enum EnumC1188 {
        LIBRARY,
        LIBRARY_GROUP,
        LIBRARY_GROUP_PREFIX,
        GROUP_ID,
        TESTS,
        SUBCLASSES
    }

    EnumC1188[] value();
}
