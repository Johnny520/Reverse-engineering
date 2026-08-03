package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Yue.InterfaceC5401(Yue.EnumC0409.f948)
@Yue.InterfaceC4308
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f953, Yue.EnumC0410.f960, Yue.EnumC0410.f961, Yue.EnumC0410.f962, Yue.EnumC0410.f959, Yue.EnumC0410.f956, Yue.EnumC0410.f958})
public @interface InterfaceC5344 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۨ$ۥ, reason: contains not printable characters */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f956, Yue.EnumC0410.f960, Yue.EnumC0410.f961, Yue.EnumC0410.f962, Yue.EnumC0410.f958})
    public @interface InterfaceC5345 {
        Yue.InterfaceC5344 value() default @Yue.InterfaceC5344;
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۨ$ۥ۟, reason: contains not printable characters */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f956, Yue.EnumC0410.f960, Yue.EnumC0410.f961, Yue.EnumC0410.f962, Yue.EnumC0410.f958})
    public @interface InterfaceC5346 {
        Yue.InterfaceC5344 value() default @Yue.InterfaceC5344;
    }

    java.lang.String[] allOf() default {};

    java.lang.String[] anyOf() default {};

    boolean conditional() default false;

    java.lang.String value() default "";
}
