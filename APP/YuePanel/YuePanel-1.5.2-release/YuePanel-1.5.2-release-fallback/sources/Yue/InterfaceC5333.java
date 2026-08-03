package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5311
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@Yue.InterfaceC5792(version = "1.2")
@Yue.InterfaceC5401(Yue.EnumC0409.f947)
@java.lang.annotation.Repeatable(Yue.InterfaceC5333.InterfaceC5334.class)
@Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f952, Yue.EnumC0410.f960, Yue.EnumC0410.f955, Yue.EnumC0410.f959, Yue.EnumC0410.f966})
public @interface InterfaceC5333 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥۡ$ۥ, reason: contains not printable characters */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @Yue.InterfaceC5312
    @Yue.InterfaceC5401(Yue.EnumC0409.f947)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f952, Yue.EnumC0410.f960, Yue.EnumC0410.f955, Yue.EnumC0410.f959, Yue.EnumC0410.f966})
    public @interface InterfaceC5334 {
        Yue.InterfaceC5333[] value();
    }

    int errorCode() default -1;

    Yue.EnumC1819 level() default Yue.EnumC1819.f5581;

    java.lang.String message() default "";

    java.lang.String version();

    Yue.EnumC5335 versionKind() default Yue.EnumC5335.f19920;
}
