package p257r7;

import p023b8.InterfaceC0204b;

/* JADX INFO: renamed from: r7.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3733w extends AbstractC3712b implements InterfaceC0204b {

    /* JADX INFO: renamed from: m */
    public final C3732v f12114m;

    /* JADX INFO: renamed from: n */
    public final C3715e f12115n;

    /* JADX INFO: renamed from: o */
    public final C3715e f12116o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3733w() {
        super(12);
        C3732v c3732v = new C3732v(this, 0);
        c3732v.mo633k(-1);
        this.f12114m = c3732v;
        this.f12115n = new C3715e(this, 4, 0);
        this.f12116o = new C3715e(this, 8, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: b */
    public final int mo868b() {
        return this.f7657g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: e */
    public final int mo869e() {
        return this.f12116o.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: f */
    public final int mo870f() {
        return this.f12115n.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    public final String getTagName() {
        AbstractC3729s abstractC3729sM7749a = this.f12114m.m7749a();
        String str = abstractC3729sM7749a != null ? abstractC3729sM7749a.f12101m : null;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(32);
        }
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.InterfaceC0204b
    /* JADX INFO: renamed from: j */
    public final String mo871j() {
        AbstractC3729s abstractC3729sM7749a = this.f12114m.m7749a();
        String strTrim = abstractC3729sM7749a != null ? abstractC3729sM7749a.f12101m : null;
        if (strTrim != null && strTrim.length() != 0) {
            if (strTrim.charAt(0) == ' ') {
                strTrim = strTrim.trim();
            }
            int iIndexOf = strTrim.indexOf(59);
            int iIndexOf2 = strTrim.indexOf(32);
            if (iIndexOf < 0 || (iIndexOf2 >= 0 && iIndexOf2 < iIndexOf)) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf >= 0) {
                String strSubstring = strTrim.substring(iIndexOf + 1);
                if (strSubstring.length() != 0) {
                    return strSubstring;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f12114m + " [" + this.f12115n.get() + ", " + this.f12116o.get() + "]";
    }
}
