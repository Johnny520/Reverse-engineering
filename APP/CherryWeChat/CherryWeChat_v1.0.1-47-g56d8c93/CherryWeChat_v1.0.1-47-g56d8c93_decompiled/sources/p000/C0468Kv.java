package p000;

/* JADX INFO: renamed from: Kv */
/* JADX INFO: loaded from: classes.dex */
public final class C0468Kv {
    /* JADX INFO: renamed from: a */
    public static String m917a(InterfaceC2325oj interfaceC2325oj) {
        String string = interfaceC2325oj.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
