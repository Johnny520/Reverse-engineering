package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface InterfaceC2465 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4409
    public static final java.lang.String f8267 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4409
    public static final java.lang.String f8268 = "this";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4409
    public static final java.lang.String f8269 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4409
    public static final java.lang.String f8270 = "The return value of this method";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4409
    public static final java.lang.String f8271 = "this";

    java.lang.String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    java.lang.String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
