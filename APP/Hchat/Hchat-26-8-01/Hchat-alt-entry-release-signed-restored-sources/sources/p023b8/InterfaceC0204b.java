package p023b8;

/* JADX INFO: renamed from: b8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0204b {
    /* JADX INFO: renamed from: b */
    int mo868b();

    /* JADX INFO: renamed from: e */
    int mo869e();

    /* JADX INFO: renamed from: f */
    int mo870f();

    String getTagName();

    /* JADX INFO: renamed from: j */
    String mo871j();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    default C0208f mo872l() {
        String strSubstring;
        int i9;
        String strSubstring2;
        char cCharAt;
        C0208f c0208f = new C0208f();
        c0208f.m886t(getTagName());
        String strMo871j = mo871j();
        if (strMo871j != null) {
            int length = strMo871j.length();
            c0208f.m883q();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = length - 1;
                int i13 = i11;
                while (true) {
                    if (i13 >= i12) {
                        break;
                    }
                    if (strMo871j.charAt(i13) == '=') {
                        strSubstring = strMo871j.substring(i11, i13);
                        int length2 = strSubstring.length();
                        if (length2 != 0 && (((cCharAt = strSubstring.charAt(i10)) >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                            int i14 = 1;
                            while (true) {
                                if (i14 >= length2) {
                                    int size = c0208f.f511k.size();
                                    C0206d c0206d = size != 0 ? (C0206d) c0208f.f511k.f24642g[size - 1] : null;
                                    if (c0206d == null || strSubstring.compareTo(c0206d.f506h) >= 0) {
                                        i11 = i13 + 1;
                                    }
                                } else {
                                    char cCharAt2 = strSubstring.charAt(i14);
                                    if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                    } else {
                        i13++;
                        i10 = 0;
                    }
                }
                strSubstring = null;
                int i15 = i11;
                while (true) {
                    if (i15 < i12) {
                        if (strMo871j.charAt(i15) == ';') {
                            strSubstring2 = strMo871j.substring(i11, i15);
                            i9 = i15 + 1;
                            break;
                        }
                        i15++;
                    } else if (i11 < length) {
                        strSubstring2 = strMo871j.substring(i11);
                        i9 = length;
                    } else {
                        i9 = i11;
                        strSubstring2 = null;
                    }
                }
                if (strSubstring == null && strSubstring2 == null) {
                    break;
                }
                if (strSubstring == null || strSubstring2 == null) {
                    int size2 = c0208f.f511k.size();
                    C0206d c0206d2 = size2 != 0 ? (C0206d) c0208f.f511k.f24642g[size2 - 1] : null;
                    if (c0206d2 == null) {
                        c0208f.m883q();
                        C0206d c0206d3 = new C0206d();
                        c0206d3.f506h = "raw_style_tag_attribute";
                        c0206d3.f507i = strMo871j;
                        c0208f.m882p(c0206d3);
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c0206d2.m876n());
                    sb2.append(';');
                    if (strSubstring == null) {
                        sb2.append(strSubstring2);
                    } else {
                        sb2.append(strSubstring);
                        sb2.append('=');
                    }
                    c0206d2.f507i = sb2.toString();
                } else {
                    C0206d c0206d4 = new C0206d();
                    c0206d4.f506h = strSubstring;
                    c0206d4.f507i = strSubstring2;
                    c0208f.m882p(c0206d4);
                }
                i11 = i9;
                i10 = 0;
            }
        }
        return c0208f;
    }
}
