package p007;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.AbstractC5144;
import kotlin.text.Regex;
import p003.AbstractC6089;
import p013.AbstractC6225;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6149 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f16879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f16881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f16882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16883;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16884;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f16885;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f16886;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f16887;

    public C6149(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f16884 = str;
        this.f16883 = str2;
        this.f16882 = str3;
        this.f16881 = str4;
        this.f16880 = i;
        this.f16879 = arrayList;
        this.f16886 = arrayList2;
        this.f16885 = str5;
        this.f16887 = str6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6149) && ((C6149) obj).f16887.equals(this.f16887);
    }

    public final int hashCode() {
        return this.f16887.hashCode();
    }

    public final String toString() {
        return this.f16887;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6148 m11539() {
        C6148 c6148 = new C6148(0);
        ArrayList arrayList = (ArrayList) c6148.f16876;
        String str = this.f16884;
        c6148.f16873 = str;
        c6148.f16872 = m11540();
        c6148.f16871 = m11544();
        c6148.f16870 = this.f16881;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f16880;
        c6148.f16874 = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(m11542());
        String strM11541 = m11541();
        String strSubstring = null;
        c6148.f16878 = strM11541 != null ? C6148.m11531(AbstractC6089.m11448(0, 0, strM11541, " \"'<>#", 83)) : null;
        if (this.f16885 != null) {
            String str2 = this.f16887;
            strSubstring = str2.substring(AbstractC5144.m10171(str2, '#', 0, 6) + 1);
        }
        c6148.f16877 = strSubstring;
        return c6148;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m11540() {
        if (this.f16883.length() == 0) {
            return "";
        }
        int length = this.f16884.length() + 3;
        String str = this.f16887;
        return str.substring(length, AbstractC6225.m11679(length, str.length(), str, ":@"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m11541() {
        if (this.f16886 == null) {
            return null;
        }
        String str = this.f16887;
        int iM10171 = AbstractC5144.m10171(str, '?', 0, 6) + 1;
        return str.substring(iM10171, AbstractC6225.m11678(str, '#', iM10171, str.length()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList m11542() {
        int length = this.f16884.length() + 3;
        String str = this.f16887;
        int iM10171 = AbstractC5144.m10171(str, '/', length, 4);
        int iM11679 = AbstractC6225.m11679(iM10171, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM10171 < iM11679) {
            int i = iM10171 + 1;
            int iM11678 = AbstractC6225.m11678(str, '/', i, iM11679);
            arrayList.add(str.substring(i, iM11678));
            iM10171 = iM11678;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m11543() {
        int length = this.f16884.length() + 3;
        String str = this.f16887;
        int iM10171 = AbstractC5144.m10171(str, '/', length, 4);
        return str.substring(iM10171, AbstractC6225.m11679(iM10171, str.length(), str, "?#"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11544() {
        if (this.f16882.length() == 0) {
            return "";
        }
        int length = this.f16884.length() + 3;
        String str = this.f16887;
        return str.substring(AbstractC5144.m10171(str, ':', length, 4) + 1, AbstractC5144.m10171(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final URI m11545() {
        C6148 c6148M11539 = m11539();
        ArrayList arrayList = (ArrayList) c6148M11539.f16876;
        String str = (String) c6148M11539.f16870;
        c6148M11539.f16870 = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, AbstractC6089.m11448(0, 0, (String) arrayList.get(i), "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) c6148M11539.f16878;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? AbstractC6089.m11448(0, 0, str2, "\\^`{|}", 67) : null);
            }
        }
        String str3 = (String) c6148M11539.f16877;
        c6148M11539.f16877 = str3 != null ? AbstractC6089.m11448(0, 0, str3, " \"#<>\\^`{|}", 35) : null;
        String string = c6148M11539.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                C5925.m11313(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String m11546() {
        C6148 c6148;
        try {
            c6148 = new C6148(0);
            c6148.m11538(this, "/...");
        } catch (IllegalArgumentException unused) {
            c6148 = null;
        }
        c6148.getClass();
        c6148.f16872 = AbstractC6089.m11448(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", 123);
        c6148.f16871 = AbstractC6089.m11448(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", 123);
        return c6148.m11535().f16887;
    }
}
