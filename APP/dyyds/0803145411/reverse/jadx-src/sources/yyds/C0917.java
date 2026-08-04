package yyds;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛴᛸᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0917 extends AbstractC2019 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f4207;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f4208;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Pattern f4209;

    public C0917(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(47);
        int iLastIndexOf = string.lastIndexOf(47);
        String strSubstring = string.substring(iIndexOf + 1, iLastIndexOf);
        this.f4208 = strSubstring;
        int i = iLastIndexOf + 1;
        String strSubstring2 = string.length() > i ? string.substring(i) : "";
        this.f4207 = strSubstring2;
        this.f4209 = Pattern.compile(strSubstring, AbstractC0897.m2003(strSubstring2.toCharArray()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0917)) {
            return false;
        }
        Pattern pattern = ((C0917) obj).f4209;
        Pattern pattern2 = this.f4209;
        return pattern2 == null ? pattern == null : pattern2.equals(pattern);
    }

    public final String toString() {
        String str = this.f4208;
        if (str.startsWith("/")) {
            return str;
        }
        return "/" + str + "/" + this.f4207;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0917 mo2034() {
        return this;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final Class mo1345(C0864 c0864) {
        return Void.TYPE;
    }

    public C0917(Pattern pattern) {
        this.f4208 = pattern.pattern();
        this.f4209 = pattern;
        int iFlags = pattern.flags();
        StringBuilder sb = new StringBuilder();
        for (int i : AbstractC2104.m4003(7)) {
            int iM2006 = AbstractC0897.m2006(i);
            if ((iM2006 & iFlags) == iM2006) {
                sb.append(AbstractC0897.m1990(i));
            }
        }
        this.f4207 = sb.toString();
    }
}
