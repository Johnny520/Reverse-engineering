package p000a;

/* JADX INFO: renamed from: a.Uc */
/* JADX INFO: loaded from: classes.dex */
public final class C0374Uc {
    /* JADX INFO: renamed from: a */
    public static String m1002a(InterfaceC0298Q7 interfaceC0298Q7) {
        String string = interfaceC0298Q7.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
