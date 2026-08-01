package p015;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.AbstractC5143;
import kotlin.text.Regex;
import p004.AbstractC6098;
import p017.AbstractC6233;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f17118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f17119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f17120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17123;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f17124;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f17125;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f17126;

    public C6222(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f17123 = str;
        this.f17122 = str2;
        this.f17121 = str3;
        this.f17120 = str4;
        this.f17119 = i;
        this.f17118 = arrayList;
        this.f17125 = arrayList2;
        this.f17124 = str5;
        this.f17126 = str6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6222) && ((C6222) obj).f17126.equals(this.f17126);
    }

    public final int hashCode() {
        return this.f17126.hashCode();
    }

    public final String toString() {
        return this.f17126;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6221 m11668() {
        C6221 c6221 = new C6221(0);
        ArrayList arrayList = (ArrayList) c6221.f17115;
        String str = this.f17123;
        c6221.f17112 = str;
        c6221.f17111 = m11669();
        c6221.f17110 = m11673();
        c6221.f17109 = this.f17120;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f17119;
        c6221.f17113 = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(m11671());
        String strM11670 = m11670();
        String strSubstring = null;
        c6221.f17117 = strM11670 != null ? C6221.m11660(AbstractC6098.m11455(0, 0, strM11670, " \"'<>#", 83)) : null;
        if (this.f17124 != null) {
            String str2 = this.f17126;
            strSubstring = str2.substring(AbstractC5143.m10151(str2, '#', 0, 6) + 1);
        }
        c6221.f17116 = strSubstring;
        return c6221;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m11669() {
        if (this.f17122.length() == 0) {
            return "";
        }
        int length = this.f17123.length() + 3;
        String str = this.f17126;
        return str.substring(length, AbstractC6233.m11689(length, str.length(), str, ":@"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m11670() {
        if (this.f17125 == null) {
            return null;
        }
        String str = this.f17126;
        int iM10151 = AbstractC5143.m10151(str, '?', 0, 6) + 1;
        return str.substring(iM10151, AbstractC6233.m11688(str, '#', iM10151, str.length()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList m11671() {
        int length = this.f17123.length() + 3;
        String str = this.f17126;
        int iM10151 = AbstractC5143.m10151(str, '/', length, 4);
        int iM11689 = AbstractC6233.m11689(iM10151, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM10151 < iM11689) {
            int i = iM10151 + 1;
            int iM11688 = AbstractC6233.m11688(str, '/', i, iM11689);
            arrayList.add(str.substring(i, iM11688));
            iM10151 = iM11688;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m11672() {
        int length = this.f17123.length() + 3;
        String str = this.f17126;
        int iM10151 = AbstractC5143.m10151(str, '/', length, 4);
        return str.substring(iM10151, AbstractC6233.m11689(iM10151, str.length(), str, "?#"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11673() {
        if (this.f17121.length() == 0) {
            return "";
        }
        int length = this.f17123.length() + 3;
        String str = this.f17126;
        return str.substring(AbstractC5143.m10151(str, ':', length, 4) + 1, AbstractC5143.m10151(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final URI m11674() {
        C6221 c6221M11668 = m11668();
        ArrayList arrayList = (ArrayList) c6221M11668.f17115;
        String str = (String) c6221M11668.f17109;
        c6221M11668.f17109 = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, AbstractC6098.m11455(0, 0, (String) arrayList.get(i), "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) c6221M11668.f17117;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? AbstractC6098.m11455(0, 0, str2, "\\^`{|}", 67) : null);
            }
        }
        String str3 = (String) c6221M11668.f17116;
        c6221M11668.f17116 = str3 != null ? AbstractC6098.m11455(0, 0, str3, " \"#<>\\^`{|}", 35) : null;
        String string = c6221M11668.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                C5919.m11252(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String m11675() {
        C6221 c6221;
        try {
            c6221 = new C6221(0);
            c6221.m11667(this, "/...");
        } catch (IllegalArgumentException unused) {
            c6221 = null;
        }
        c6221.getClass();
        c6221.f17111 = AbstractC6098.m11455(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", 123);
        c6221.f17110 = AbstractC6098.m11455(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", 123);
        return c6221.m11664().f17126;
    }
}
