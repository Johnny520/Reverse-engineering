package Yue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7095
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
@InterfaceC7470(version = "1.2")
@InterfaceC7157(EnumC3259.f5011)
@Repeatable(InterfaceC1171.class)
@InterfaceC7722(allowedTargets = {EnumC3260.f5016, EnumC3260.f5024, EnumC3260.f5019, EnumC3260.f5023, EnumC3260.f5030})
public @interface InterfaceC7111 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۡ$ۥ */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InterfaceC7096
    @InterfaceC7157(EnumC3259.f5011)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC7722(allowedTargets = {EnumC3260.f5016, EnumC3260.f5024, EnumC3260.f5019, EnumC3260.f5023, EnumC3260.f5030})
    public @interface InterfaceC1171 {
        InterfaceC7111[] value();
    }

    int errorCode() default -1;

    EnumC0393 level() default EnumC0393.f8971;

    String message() default "";

    String version();

    EnumC7112 versionKind() default EnumC7112.f21468;
}
