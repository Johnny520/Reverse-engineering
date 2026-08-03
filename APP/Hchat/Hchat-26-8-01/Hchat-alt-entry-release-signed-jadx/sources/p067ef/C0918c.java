package p067ef;

import java.util.ArrayList;
import p020b5.C0192k;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ef.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0918c {

    /* JADX INFO: renamed from: a */
    public final int f2873a;

    /* JADX INFO: renamed from: b */
    public final String f2874b;

    /* JADX INFO: renamed from: c */
    public final String f2875c;

    /* JADX INFO: renamed from: d */
    public final String f2876d;

    /* JADX INFO: renamed from: e */
    public final String f2877e;

    /* JADX INFO: renamed from: f */
    public C0192k f2878f;

    /* JADX INFO: renamed from: g */
    public ArrayList f2879g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0918c(int i9, String str, String str2, String str3, String str4) {
        this.f2873a = i9;
        this.f2874b = str;
        this.f2875c = str2;
        this.f2876d = str3;
        this.f2877e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0918c m2235a(String str) {
        String str2 = String.format("%s_res_0x%08x", str, Integer.valueOf(this.f2873a));
        C0918c c0918c = new C0918c(this.f2873a, this.f2874b, this.f2875c, str2, this.f2877e);
        c0918c.f2878f = this.f2878f;
        c0918c.f2879g = this.f2879g;
        return c0918c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f2873a;
        StringBuilder sbM2258u = AbstractC0921a.m2258u(i9, "  0x", Integer.toHexString(i9), " (", ")");
        AbstractC2091b.m5173t(sbM2258u, this.f2877e, " = ", this.f2875c, ".");
        sbM2258u.append(this.f2876d);
        return sbM2258u.toString();
    }
}
