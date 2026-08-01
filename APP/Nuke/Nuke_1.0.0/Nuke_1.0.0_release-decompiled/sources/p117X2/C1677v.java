package p117X2;

/* JADX INFO: renamed from: X2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1677v {
    /* JADX INFO: renamed from: a */
    public static String m2996a(InterfaceC1662g interfaceC1662g) {
        String string = interfaceC1662g.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
