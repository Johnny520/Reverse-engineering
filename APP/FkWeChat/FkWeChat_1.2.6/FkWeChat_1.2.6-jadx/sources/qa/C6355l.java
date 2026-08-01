package qa;

import java.io.IOException;

/* JADX INFO: renamed from: qa.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6355l extends IOException {

    /* JADX INFO: renamed from: q */
    public InterfaceC6360q f20023q;

    public C6355l(String str) {
        super(str);
        this.f20023q = null;
    }

    /* JADX INFO: renamed from: b */
    public static C6355l m25251b() {
        return new C6355l("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    public static C6355l m25252c() {
        return new C6355l("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    public static C6355l m25253d() {
        return new C6355l("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    public static C6355l m25254e() {
        return new C6355l("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: f */
    public static C6355l m25255f() {
        return new C6355l("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: g */
    public static C6355l m25256g() {
        return new C6355l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: h */
    public static C6355l m25257h() {
        return new C6355l("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: renamed from: j */
    public static C6355l m25258j() {
        return new C6355l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: k */
    public static C6355l m25259k() {
        return new C6355l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC6360q m25260a() {
        return this.f20023q;
    }

    /* JADX INFO: renamed from: i */
    public C6355l m25261i(InterfaceC6360q interfaceC6360q) {
        this.f20023q = interfaceC6360q;
        return this;
    }
}
