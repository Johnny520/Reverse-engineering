package p023b8;

import java.io.StringWriter;
import okhttp3.HttpUrl;
import p020b5.C0184c;
import p136j8.C2104o;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: b8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0206d extends AbstractC0212j {

    /* JADX INFO: renamed from: h */
    public String f506h;

    /* JADX INFO: renamed from: i */
    public String f507i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: c */
    public final AbstractC0212j mo873c() {
        return (C0208f) this.f518g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0206d) {
            String str = this.f506h;
            String str2 = ((C0206d) obj).f506h;
            if (str == str2) {
                return true;
            }
            if (str != null && str2 != null) {
                return str.equals(str2);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f506h;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: k */
    public final void mo874k(StringWriter stringWriter, boolean z9) {
        stringWriter.append((CharSequence) m875m(true));
        stringWriter.append('=');
        if (z9) {
            stringWriter.append('\"');
        }
        stringWriter.append((CharSequence) m876n());
        if (z9) {
            stringWriter.append('\"');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m875m(boolean z9) {
        String str = this.f506h;
        if (str == null) {
            return str;
        }
        int iIndexOf = str.indexOf(58);
        String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : null;
        return strSubstring != null ? AbstractC4855en.m9264h(strSubstring, ":", str) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m876n() {
        String str = this.f507i;
        if (str != null) {
            return str;
        }
        this.f507i = HttpUrl.FRAGMENT_ENCODE_SET;
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m877o(C0184c c0184c) {
        String str = this.f506h;
        String strM876n = m876n();
        C0208f c0208f = (C0208f) c0184c.f470b;
        C0206d c0206d = new C0206d();
        c0208f.m882p(c0206d);
        c0206d.f506h = str;
        c0206d.f507i = strM876n;
        if (((C0208f) c0206d.f518g) != null) {
            return;
        }
        C2104o.m5294t("Parent element is null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    public final String toString() {
        return m875m(true) + "=\"" + m876n() + "\"";
    }
}
