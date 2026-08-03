package p031Q0;

/* JADX INFO: renamed from: Q0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0315o {
    /* JADX INFO: renamed from: a */
    public static String m708a(InterfaceC0305e interfaceC0305e) {
        String string = interfaceC0305e.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
