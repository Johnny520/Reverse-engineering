package yyds;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᛸᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1396 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f6505;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f6506;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f6507;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f6508;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f6509;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String f6510;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final List f6511;

    public C1396(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f6506 = str;
        str2.getClass();
        this.f6507 = str2;
        this.f6509 = str3;
        list.getClass();
        this.f6511 = list;
        this.f6505 = str4;
        this.f6510 = str5;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    break;
                }
                int iCodePointAt = str5.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    sb.append("-VF");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        this.f6508 = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.f6506);
        sb.append(", mProviderPackage: ");
        sb.append(this.f6507);
        sb.append(", mQuery: ");
        sb.append(this.f6509);
        sb.append(", mSystemFont: ");
        sb.append(this.f6505);
        sb.append(", mVariationSettings: ");
        StringBuilder sb2 = new StringBuilder(AbstractC2104.m4015(sb, this.f6510, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.f6511;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
