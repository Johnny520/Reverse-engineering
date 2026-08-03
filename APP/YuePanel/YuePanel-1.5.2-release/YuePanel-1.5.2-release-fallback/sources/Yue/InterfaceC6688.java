package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface InterfaceC6688 {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    java.lang.Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    java.lang.String jetifyAs() default "";
}
