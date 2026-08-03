package p000;

/* JADX INFO: renamed from: Kv */
/* JADX INFO: loaded from: classes.dex */
public final class C0468Kv {
    /* JADX INFO: renamed from: a */
    public static String m917a(InterfaceC2325oj r1) {
        String r12 = r1.getClass().getGenericInterfaces()[0].toString();
        if (r12.startsWith("kotlin.jvm.functions.") == true) goto L5;
        return r12;
    L5:
        return r12.substring(21);
    }
}
