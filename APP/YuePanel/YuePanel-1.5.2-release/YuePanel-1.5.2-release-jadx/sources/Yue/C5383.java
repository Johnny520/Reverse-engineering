package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5383 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5383 f1469 = new C5383();

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m2138(@InterfaceC6399 String str) {
        C5499.m17103(str, "method");
        return (C5499.m17094(str, "GET") || C5499.m17094(str, "HEAD")) ? false : true;
    }

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m16739(@InterfaceC6399 String str) {
        C5499.m17103(str, "method");
        return C5499.m17094(str, "POST") || C5499.m17094(str, "PUT") || C5499.m17094(str, "PATCH") || C5499.m17094(str, "PROPPATCH") || C5499.m17094(str, "REPORT");
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m2139(@InterfaceC6399 String str) {
        C5499.m17103(str, "method");
        return C5499.m17094(str, "POST") || C5499.m17094(str, "PATCH") || C5499.m17094(str, "PUT") || C5499.m17094(str, "DELETE") || C5499.m17094(str, "MOVE");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m16740(@InterfaceC6399 String str) {
        C5499.m17103(str, "method");
        return !C5499.m17094(str, "PROPFIND");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m16741(@InterfaceC6399 String str) {
        C5499.m17103(str, "method");
        return C5499.m17094(str, "PROPFIND");
    }
}
