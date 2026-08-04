package yyds;

import java.io.StringWriter;
import java.math.BigDecimal;

/* JADX INFO: renamed from: yyds.ᲀᲇᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2114 extends AbstractC2019 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f10452;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f10453;

    public C2114(CharSequence charSequence, boolean z) {
        this.f10453 = true;
        if (!z || charSequence.length() <= 1) {
            this.f10452 = charSequence.toString();
            return;
        }
        char cCharAt = charSequence.charAt(0);
        char cCharAt2 = charSequence.charAt(charSequence.length() - 1);
        if (cCharAt == '\'' && cCharAt2 == '\'') {
            charSequence = charSequence.subSequence(1, charSequence.length() - 1);
        } else if (cCharAt == '\"' && cCharAt2 == '\"') {
            charSequence = charSequence.subSequence(1, charSequence.length() - 1);
            this.f10453 = false;
        }
        this.f10452 = AbstractC0902.m2009(charSequence.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2114) && !(obj instanceof C1704)) {
            return false;
        }
        C2114 c2114Mo3452 = ((AbstractC2019) obj).mo3452();
        String str = this.f10452;
        return str == null ? c2114Mo3452.f10452 == null : str.equals(c2114Mo3452.f10452);
    }

    public final String toString() {
        String string;
        String str = this.f10453 ? "'" : "\"";
        String str2 = this.f10452;
        if (str2 == null) {
            string = null;
        } else {
            int length = str2.length();
            StringWriter stringWriter = new StringWriter(length * 2);
            for (int i = 0; i < length; i++) {
                char cCharAt = str2.charAt(i);
                if (cCharAt > 4095) {
                    stringWriter.write("\\u" + Integer.toHexString(cCharAt).toUpperCase());
                } else if (cCharAt > 255) {
                    stringWriter.write("\\u0" + Integer.toHexString(cCharAt).toUpperCase());
                } else if (cCharAt > 127) {
                    stringWriter.write("\\u00" + Integer.toHexString(cCharAt).toUpperCase());
                } else if (cCharAt < ' ') {
                    switch (cCharAt) {
                        case '\b':
                            stringWriter.write(92);
                            stringWriter.write(98);
                            break;
                        case '\t':
                            stringWriter.write(92);
                            stringWriter.write(116);
                            break;
                        case '\n':
                            stringWriter.write(92);
                            stringWriter.write(110);
                            break;
                        case 11:
                        default:
                            if (cCharAt > 15) {
                                stringWriter.write("\\u00" + Integer.toHexString(cCharAt).toUpperCase());
                            } else {
                                stringWriter.write("\\u000" + Integer.toHexString(cCharAt).toUpperCase());
                            }
                            break;
                        case '\f':
                            stringWriter.write(92);
                            stringWriter.write(102);
                            break;
                        case '\r':
                            stringWriter.write(92);
                            stringWriter.write(114);
                            break;
                    }
                } else if (cCharAt == '\"') {
                    stringWriter.write(92);
                    stringWriter.write(34);
                } else if (cCharAt == '\'') {
                    stringWriter.write(92);
                    stringWriter.write(39);
                } else if (cCharAt == '/') {
                    stringWriter.write(92);
                    stringWriter.write(47);
                } else if (cCharAt != '\\') {
                    stringWriter.write(cCharAt);
                } else {
                    stringWriter.write(92);
                    stringWriter.write(92);
                }
            }
            string = stringWriter.toString();
        }
        return AbstractC2104.m4014(str, string, str);
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final C2114 mo3452() {
        return this;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final Class mo1345(C0864 c0864) {
        return String.class;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final C1704 mo3453() {
        try {
            return new C1704(new BigDecimal(this.f10452));
        } catch (NumberFormatException unused) {
            return C1704.f8640;
        }
    }
}
