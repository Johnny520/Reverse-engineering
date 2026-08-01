package p023;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import p019.AbstractC6918;
import p029.AbstractC7054;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6978 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f17224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f17225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f17226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17229;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f17230;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f17231;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f17232;

    public C6978(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f17229 = str;
        this.f17228 = str2;
        this.f17227 = str3;
        this.f17226 = str4;
        this.f17225 = i;
        this.f17224 = arrayList;
        this.f17231 = arrayList2;
        this.f17230 = str5;
        this.f17232 = str6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6978) && ((C6978) obj).f17232.equals(this.f17232);
    }

    public final int hashCode() {
        return this.f17232.hashCode();
    }

    public final String toString() {
        return this.f17232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6977 m12098() {
        C6977 c6977 = new C6977(0);
        ArrayList arrayList = (ArrayList) c6977.f17221;
        String str = this.f17229;
        c6977.f17218 = str;
        c6977.f17217 = m12099();
        c6977.f17216 = m12103();
        c6977.f17215 = this.f17226;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f17225;
        c6977.f17219 = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(m12101());
        String strM12100 = m12100();
        String strSubstring = null;
        c6977.f17223 = strM12100 != null ? C6977.m12090(AbstractC6918.m12007(0, 0, strM12100, " \"'<>#", 83)) : null;
        if (this.f17230 != null) {
            String str2 = this.f17232;
            strSubstring = str2.substring(AbstractC5976.m10730(str2, '#', 0, 6) + 1);
        }
        c6977.f17222 = strSubstring;
        return c6977;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m12099() {
        if (this.f17228.length() == 0) {
            return "";
        }
        int length = this.f17229.length() + 3;
        String str = this.f17232;
        return str.substring(length, AbstractC7054.m12238(length, str.length(), str, ":@"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m12100() {
        if (this.f17231 == null) {
            return null;
        }
        String str = this.f17232;
        int iM10730 = AbstractC5976.m10730(str, '?', 0, 6) + 1;
        return str.substring(iM10730, AbstractC7054.m12237(str, '#', iM10730, str.length()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList m12101() {
        int length = this.f17229.length() + 3;
        String str = this.f17232;
        int iM10730 = AbstractC5976.m10730(str, '/', length, 4);
        int iM12238 = AbstractC7054.m12238(iM10730, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM10730 < iM12238) {
            int i = iM10730 + 1;
            int iM12237 = AbstractC7054.m12237(str, '/', i, iM12238);
            arrayList.add(str.substring(i, iM12237));
            iM10730 = iM12237;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m12102() {
        int length = this.f17229.length() + 3;
        String str = this.f17232;
        int iM10730 = AbstractC5976.m10730(str, '/', length, 4);
        return str.substring(iM10730, AbstractC7054.m12238(iM10730, str.length(), str, "?#"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m12103() {
        if (this.f17227.length() == 0) {
            return "";
        }
        int length = this.f17229.length() + 3;
        String str = this.f17232;
        return str.substring(AbstractC5976.m10730(str, ':', length, 4) + 1, AbstractC5976.m10730(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final URI m12104() {
        C6977 c6977M12098 = m12098();
        ArrayList arrayList = (ArrayList) c6977M12098.f17221;
        String str = (String) c6977M12098.f17215;
        c6977M12098.f17215 = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, AbstractC6918.m12007(0, 0, (String) arrayList.get(i), "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) c6977M12098.f17223;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? AbstractC6918.m12007(0, 0, str2, "\\^`{|}", 67) : null);
            }
        }
        String str3 = (String) c6977M12098.f17222;
        c6977M12098.f17222 = str3 != null ? AbstractC6918.m12007(0, 0, str3, " \"#<>\\^`{|}", 35) : null;
        String string = c6977M12098.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                C6755.m11872(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String m12105() {
        C6977 c6977;
        try {
            c6977 = new C6977(0);
            c6977.m12097(this, "/...");
        } catch (IllegalArgumentException unused) {
            c6977 = null;
        }
        c6977.getClass();
        c6977.f17217 = AbstractC6918.m12007(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", 123);
        c6977.f17216 = AbstractC6918.m12007(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", 123);
        return c6977.m12094().f17232;
    }
}
