package Yue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC4372(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @InterfaceC7097(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@InterfaceC7157(EnumC3259.f5012)
@Retention(RetentionPolicy.CLASS)
@InterfaceC7722(allowedTargets = {EnumC3260.f5017})
public @interface InterfaceC4761 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۤ۟$ۥ */
    public enum EnumC0486 {
        WARNING,
        ERROR
    }

    EnumC0486 level() default EnumC0486.ERROR;
}
