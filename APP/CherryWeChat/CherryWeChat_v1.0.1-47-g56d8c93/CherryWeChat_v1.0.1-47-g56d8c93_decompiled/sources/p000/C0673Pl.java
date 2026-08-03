package p000;

import java.io.IOException;

/* JADX INFO: renamed from: Pl */
/* JADX INFO: loaded from: classes.dex */
public class C0673Pl extends IOException {

    /* JADX INFO: renamed from: a */
    public boolean f2146a;

    /* JADX INFO: renamed from: a */
    public static C0673Pl m1364a() {
        return new C0673Pl("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: b */
    public static C0673Pl m1365b() {
        return new C0673Pl("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: c */
    public static C0630Ol m1366c() {
        return new C0630Ol("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: d */
    public static C0673Pl m1367d() {
        return new C0673Pl("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: e */
    public static C0673Pl m1368e() {
        return new C0673Pl("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: f */
    public static C0673Pl m1369f() {
        return new C0673Pl("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: g */
    public static C0673Pl m1370g() {
        return new C0673Pl("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
