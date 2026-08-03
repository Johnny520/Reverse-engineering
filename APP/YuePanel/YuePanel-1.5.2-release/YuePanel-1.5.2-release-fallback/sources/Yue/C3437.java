package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
@Yue.InterfaceC3421(name = "KClasses")
public final class C3437 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3834
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> T m14225(@Yue.InterfaceC4418 Yue.InterfaceC3435<T> r2, @Yue.InterfaceC4543 java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r2.isInstance(r3)
            if (r0 == 0) goto L11
            java.lang.String r2 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast"
            Yue.C3329.m13904(r3, r2)
            return r3
        L11:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value cannot be cast to "
            r0.append(r1)
            java.lang.String r2 = r2.mo6032()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC4543
    @Yue.InterfaceC3834
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> T m14226(@Yue.InterfaceC4418 Yue.InterfaceC3435<T> r1, @Yue.InterfaceC4543 java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = r1.isInstance(r2)
            if (r1 == 0) goto L11
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast"
            Yue.C3329.m13904(r2, r1)
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }
}
