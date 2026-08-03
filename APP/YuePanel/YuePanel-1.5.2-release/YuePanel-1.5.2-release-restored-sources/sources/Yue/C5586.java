package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
@InterfaceC5572(name = "KClasses")
public final class C5586 {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    @InterfaceC5890
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    /* JADX INFO: renamed from: ۥ */
    public static final <T> T m2305(@InterfaceC6399 InterfaceC5585<T> interfaceC5585, @InterfaceC6489 Object obj) {
        C5499.m17103(interfaceC5585, "<this>");
        if (interfaceC5585.isInstance(obj)) {
            C5499.m17101(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC5585.mo10594());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    @InterfaceC5890
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> T m2306(@InterfaceC6399 InterfaceC5585<T> interfaceC5585, @InterfaceC6489 Object obj) {
        C5499.m17103(interfaceC5585, "<this>");
        if (!interfaceC5585.isInstance(obj)) {
            return null;
        }
        C5499.m17101(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
