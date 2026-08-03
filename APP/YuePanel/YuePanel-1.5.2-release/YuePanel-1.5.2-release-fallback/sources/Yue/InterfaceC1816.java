package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Yue.InterfaceC4308
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f952, Yue.EnumC0410.f960, Yue.EnumC0410.f955, Yue.EnumC0410.f953, Yue.EnumC0410.f959, Yue.EnumC0410.f962, Yue.EnumC0410.f961, Yue.EnumC0410.f966})
public @interface InterfaceC1816 {
    Yue.EnumC1819 level() default Yue.EnumC1819.f5580;

    java.lang.String message();

    Yue.InterfaceC5313 replaceWith() default @Yue.InterfaceC5313(expression = "", imports = {});
}
