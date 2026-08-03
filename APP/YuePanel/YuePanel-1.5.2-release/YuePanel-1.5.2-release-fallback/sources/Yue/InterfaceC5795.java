package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Yue.InterfaceC5401(Yue.EnumC0409.f948)
@Yue.InterfaceC4308
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f958, Yue.EnumC0410.f957, Yue.EnumC0410.f960, Yue.EnumC0410.f961, Yue.EnumC0410.f962, Yue.EnumC0410.f956, Yue.EnumC0410.f953})
public @interface InterfaceC5795 {
    long max() default Long.MAX_VALUE;

    long min() default Long.MIN_VALUE;

    long multiple() default 1;

    long value() default -1;
}
