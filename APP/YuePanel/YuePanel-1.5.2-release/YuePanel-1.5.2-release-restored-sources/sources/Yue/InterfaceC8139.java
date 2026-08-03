package Yue;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@InterfaceC4372(message = "This annotation has been replaced by `@OptIn`", replaceWith = @InterfaceC7097(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@InterfaceC7157(EnumC3259.f5012)
@Retention(RetentionPolicy.CLASS)
@InterfaceC7722(allowedTargets = {EnumC3260.f5016, EnumC3260.f5019, EnumC3260.f5021, EnumC3260.f5022, EnumC3260.f5023, EnumC3260.f5024, EnumC3260.f5025, EnumC3260.f5026, EnumC3260.f5029, EnumC3260.f5030})
public @interface InterfaceC8139 {
    Class<? extends Annotation>[] markerClass();
}
