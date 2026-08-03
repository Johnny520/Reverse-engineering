package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "RegexExtensionsJDK8Kt")
public final class C7081 {
    @InterfaceC7470(version = "1.2")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final C5955 m3364(@InterfaceC6399 InterfaceC0907 interfaceC0907, @InterfaceC6399 String str) {
        C5499.m17103(interfaceC0907, "<this>");
        C5499.m17103(str, "name");
        InterfaceC5956 interfaceC5956 = interfaceC0907 instanceof InterfaceC5956 ? (InterfaceC5956) interfaceC0907 : null;
        if (interfaceC5956 != null) {
            return interfaceC5956.get(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
