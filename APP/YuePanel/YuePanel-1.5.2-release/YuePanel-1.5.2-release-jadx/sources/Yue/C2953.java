package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4372(message = "changed in Okio 2.x")
public final class C2953 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C2953 f8 = new C2953();

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    /* JADX INFO: renamed from: ۥ */
    public final long m12(@InterfaceC6399 String str) {
        C5499.m17103(str, "string");
        return C8149.m26818(str, 0, 0, 3, null);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    /* JADX INFO: renamed from: ۥ۟ */
    public final long m13(@InterfaceC6399 String str, int i, int i2) {
        C5499.m17103(str, "string");
        return C8149.m26817(str, i, i2);
    }
}
