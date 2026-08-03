package p171lf;

import ac.C0058k;
import okhttp3.HttpUrl;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: lf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2560b {

    /* JADX INFO: renamed from: a */
    public final int f8303a;

    /* JADX INFO: renamed from: b */
    public final String f8304b;

    /* JADX INFO: renamed from: c */
    public final String f8305c;

    /* JADX INFO: renamed from: d */
    public final String f8306d;

    /* JADX INFO: renamed from: e */
    public boolean f8307e;

    /* JADX INFO: renamed from: f */
    public int f8308f;

    /* JADX INFO: renamed from: g */
    public int f8309g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2560b(C0058k c0058k, int i9, int i10, int i11, int i12) {
        this(i9, c0058k.m371v(i10), c0058k.m373y(i11), c0058k.m371v(i12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f8308f;
        String str = i9 == -1 ? "-1 " : String.format("0x%04x", Integer.valueOf(i9));
        String str2 = this.f8307e ? String.format("0x%04x", Integer.valueOf(this.f8309g)) : "      ";
        String str3 = this.f8306d;
        String strConcat = str3 != null ? ", signature: ".concat(str3) : HttpUrl.FRAGMENT_ENCODE_SET;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append(": r");
        sb2.append(this.f8303a);
        AbstractC2091b.m5173t(sb2, " '", this.f8304b, "' ", this.f8305c);
        sb2.append(strConcat);
        return sb2.toString();
    }

    public C2560b(int i9, String str, String str2, String str3) {
        this.f8303a = i9;
        this.f8304b = str;
        this.f8305c = str2;
        this.f8306d = str3;
    }
}
