package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface InterfaceC0643 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠۠$ۥ, reason: contains not printable characters */
    @java.lang.annotation.Target({})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC0644 {
        int mask() default 0;

        @Yue.InterfaceC4410
        java.lang.String name();

        int value();
    }

    @Yue.InterfaceC4410
    Yue.InterfaceC0643.InterfaceC0644[] intMapping() default {};

    @Yue.InterfaceC4410
    java.lang.String value();
}
