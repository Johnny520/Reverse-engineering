package p031Q0;

/* JADX INFO: renamed from: Q0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0315o {
    /* JADX INFO: renamed from: a */
    public static String m708a(InterfaceC0305e r1) {
        String r12 = r1.getClass().getGenericInterfaces()[0].toString();
        if (r12.startsWith("kotlin.jvm.functions.") == true) goto L5;
        return r12;
    L5:
        return r12.substring(21);
    }
}
