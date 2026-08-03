package Yue;

import Yue.AbstractC7853;
import Yue.EnumC5322;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5321 extends AbstractC7998 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String[] f12882 = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String[] f12883 = {"ol", "ul"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String[] f12884 = {"button"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String[] f12885 = {"html", "table"};

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String[] f12886 = {"optgroup", "option"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String[] f12887 = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String[] f12888 = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String[] f12889 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", C5905.f14739, "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", C7683.f23124, "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", C6468.f16546, "tr", "ul", "wbr", "xmp"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final String[] f12890 = {"mi", "mn", "mo", "ms", "mtext"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final String[] f12891 = {"desc", "foreignObject", C6468.f16546};

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f12892 = 100;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f12893 = 256;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f12894 = 12;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f12895 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public EnumC5322 f12896;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public EnumC5322 f12897;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f12898;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C4605 f12899;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C5063 f12900;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C4605 f12901;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public ArrayList<C4605> f12902;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public ArrayList<EnumC5322> f12903;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public List<AbstractC7853.C7854> f12904;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public AbstractC7853.C7858 f12905;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f12906;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f12907;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f12908;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final String[] f12909 = {null};

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static boolean m16348(C4605 c4605) {
        if (C6617.f16982.equals(c4605.m13813().m24557()) && c4605.m19913("annotation-xml")) {
            String strM2840 = C6396.m2840(c4605.mo17594(C5368.f13122));
            if (strM2840.equals("text/html") || strM2840.equals("application/xhtml+xml")) {
                return true;
            }
        }
        return C6617.f16983.equals(c4605.m13813().m24557()) && C7615.m23811(c4605.m13816(), f12891);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static boolean m16349(C4605 c4605) {
        return C6617.f16982.equals(c4605.m13813().m24557()) && C7615.m23812(c4605.mo13700(), f12890);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static boolean m16350(C4605 c4605, C4605 c46052) {
        return c4605.mo13700().equals(c46052.mo13700()) && c4605.mo13685().equals(c46052.mo13685());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static boolean m16351(C4605 c4605) {
        return C7615.m23812(c4605.mo13700(), f12889);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static boolean m16352(ArrayList<C4605> arrayList, C4605 c4605) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (arrayList.get(i) == c4605) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static void m16353(ArrayList<C4605> arrayList, C4605 c4605, C4605 c46052) {
        int iLastIndexOf = arrayList.lastIndexOf(c4605);
        C8159.m26903(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c46052);
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f23782 + ", state=" + this.f12896 + ", currentElement=" + m4009() + C6193.f1885;
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C6616 mo16354() {
        return C6616.f16978;
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo16355(Reader reader, String str, C6617 c6617) {
        super.mo16355(reader, str, c6617);
        this.f12896 = EnumC5322.f12910;
        this.f12897 = null;
        this.f12898 = false;
        this.f12899 = null;
        this.f12900 = null;
        this.f12901 = null;
        this.f12902 = new ArrayList<>();
        this.f12903 = new ArrayList<>();
        this.f12904 = new ArrayList();
        this.f12905 = new AbstractC7853.C7858(this);
        this.f12906 = true;
        this.f12907 = false;
        this.f12908 = false;
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo16356(String str) {
        return str.equals("script") || str.equals("style");
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public List<AbstractC6381> mo16358(String str, C4605 c4605, String str2, C6617 c6617) {
        C4605 c46052;
        this.f12896 = EnumC5322.f12910;
        mo16355(new StringReader(str), str2, c6617);
        this.f12901 = c4605;
        this.f12908 = true;
        if (c4605 != null) {
            if (c4605.m19918() != null) {
                this.f23779.m13006(c4605.m19918().m13005());
            }
            String strMo13700 = c4605.mo13700();
            strMo13700.hashCode();
            switch (strMo13700) {
                case "template":
                    this.f23778.m25025(EnumC7866.f23541);
                    m16423(EnumC5322.f12927);
                    break;
                case "iframe":
                case "xmp":
                case "style":
                case "noframes":
                case "noembed":
                    this.f23778.m25025(EnumC7866.f23545);
                    break;
                case "textarea":
                case "title":
                    this.f23778.m25025(EnumC7866.f23543);
                    break;
                case "script":
                    this.f23778.m25025(EnumC7866.f23546);
                    break;
                case "plaintext":
                    this.f23778.m25025(EnumC7866.f23547);
                    break;
                default:
                    this.f23778.m25025(EnumC7866.f23541);
                    break;
            }
            c46052 = new C4605(m25215(strMo13700, this.f23783), str2);
            this.f23779.m13710(c46052);
            m25213(c46052);
            m16432();
            C4605 c4605Mo13701 = c4605;
            while (true) {
                if (c4605Mo13701 != null) {
                    if (c4605Mo13701 instanceof C5063) {
                        this.f12900 = (C5063) c4605Mo13701;
                    } else {
                        c4605Mo13701 = c4605Mo13701.mo13701();
                    }
                }
            }
        } else {
            c46052 = null;
        }
        m25214();
        if (c4605 == null) {
            return this.f23779.m19903();
        }
        List<AbstractC6381> listM19932 = c46052.m19932();
        if (!listM19932.isEmpty()) {
            c46052.m13777(-1, listM19932);
        }
        return c46052.m19903();
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean mo16359(AbstractC7853 abstractC7853) {
        return (m16440(abstractC7853) ? this.f12896 : EnumC5322.f12933).mo16448(abstractC7853, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C4605 m16360(C4605 c4605) {
        for (int size = this.f23780.size() - 1; size >= 0; size--) {
            if (this.f23780.get(size) == c4605) {
                return this.f23780.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m16361(AbstractC7853.C7854 c7854) {
        this.f12904.add(c7854.clone());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m16362(C4605 c4605) {
        int size = this.f12902.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            C4605 c46052 = this.f12902.get(i3);
            if (c46052 == null) {
                return;
            }
            if (m16350(c4605, c46052)) {
                i2++;
            }
            if (i2 == 3) {
                this.f12902.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m16363() {
        while (!this.f12902.isEmpty() && m16428() != null) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m16364(String... strArr) {
        for (int size = this.f23780.size() - 1; size >= 0; size--) {
            C4605 c4605 = this.f23780.get(size);
            if (C6617.f16980.equals(c4605.m13813().m24557()) && (C7615.m23811(c4605.mo13700(), strArr) || c4605.m19913("html"))) {
                return;
            }
            m25209();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m16365() {
        m16364("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m16366() {
        m16364("table", "template");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m16367() {
        m16364("tr", "template");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m16368(String str) {
        m16376(str);
        if (!str.equals(m4009().mo13700())) {
            m16372(m16437());
        }
        m16416(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public C4605 m16369(AbstractC7853.C7859 c7859, String str, boolean z) {
        C3456 c3456M20991 = c7859.f23493;
        if (!z) {
            c3456M20991 = this.f23783.m20991(c3456M20991);
        }
        if (c3456M20991 != null && !c3456M20991.isEmpty() && c3456M20991.m9194(this.f23783) > 0) {
            m25205("Dropped duplicate attribute(s) in tag [%s]", c7859.f23491);
        }
        C7719 c7719M25216 = m25216(c7859.f23490, str, z ? C6616.f16979 : this.f23783);
        return c7719M25216.m24558().equals("form") ? new C5063(c7719M25216, null, c3456M20991) : new C4605(c7719M25216, null, c3456M20991);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public EnumC5322 m16370() {
        if (this.f12903.size() <= 0) {
            return null;
        }
        return this.f12903.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m16371(C4605 c4605, AbstractC7853 abstractC7853) {
        C5063 c5063;
        if (c4605.m13813().m24552() && (c5063 = this.f12900) != null) {
            c5063.m15598(c4605);
        }
        if (c4605.mo17595("xmlns") && !c4605.mo17594("xmlns").equals(c4605.m13813().m24557())) {
            m25205("Invalid xmlns attribute [%s] on tag [%s]", c4605.mo17594("xmlns"), c4605.m13816());
        }
        if (m16405() && C7615.m23812(m4009().mo13700(), EnumC5322.C5346.f12962)) {
            m16402(c4605);
        } else {
            m4009().m13710(c4605);
        }
        m25213(c4605);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m16372(EnumC5322 enumC5322) {
        if (this.f3183.m3085().m20989()) {
            this.f3183.m3085().add(new C6613(this.f3184, "Unexpected %s token [%s] when in state [%s]", this.f23782.m24938(), this.f23782, enumC5322));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m16373(boolean z) {
        this.f12906 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean m16374() {
        return this.f12906;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m16375() {
        m16377(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m16376(String str) {
        while (C7615.m23812(m4009().mo13700(), f12887)) {
            if (str != null && m4010(str)) {
                return;
            } else {
                m25209();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m16377(boolean z) {
        String[] strArr = z ? f12888 : f12887;
        while (C6617.f16980.equals(m4009().m13813().m24557()) && C7615.m23812(m4009().mo13700(), strArr)) {
            m25209();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C4605 m16378(String str) {
        for (int size = this.f12902.size() - 1; size >= 0; size--) {
            C4605 c4605 = this.f12902.get(size);
            if (c4605 == null) {
                return null;
            }
            if (c4605.m19913(str)) {
                return c4605;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public String m16379() {
        return this.f23781;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public C4483 m16380() {
        return this.f23779;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public C5063 m16381() {
        return this.f12900;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public C4605 m16382(String str) {
        int size = this.f23780.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            C4605 c4605 = this.f23780.get(i);
            if (c4605.m13737(str, C6617.f16980)) {
                return c4605;
            }
            i--;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public C4605 m16383() {
        return this.f12899;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public List<AbstractC7853.C7854> m16384() {
        return this.f12904;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public ArrayList<C4605> m16385() {
        return this.f23780;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m16386(String str) {
        return m16389(str, f12884);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean m16387(String str) {
        return m16389(str, f12883);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public boolean m16388(String str) {
        return m16389(str, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean m16389(String str, String[] strArr) {
        return m16392(str, f12882, strArr);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public boolean m16390(String[] strArr) {
        return m16393(strArr, f12882, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public boolean m16391(String str) {
        for (int size = this.f23780.size() - 1; size >= 0; size--) {
            String strMo13700 = this.f23780.get(size).mo13700();
            if (strMo13700.equals(str)) {
                return true;
            }
            if (!C7615.m23812(strMo13700, f12886)) {
                return false;
            }
        }
        C8159.m26899("Should not be reachable");
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final boolean m16392(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f12909;
        strArr3[0] = str;
        return m16393(strArr3, strArr, strArr2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final boolean m16393(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f23780.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            C4605 c4605 = this.f23780.get(i);
            if (c4605.m13813().m24557().equals(C6617.f16980)) {
                String strMo13700 = c4605.mo13700();
                if (C7615.m23812(strMo13700, strArr)) {
                    return true;
                }
                if (C7615.m23812(strMo13700, strArr2)) {
                    return false;
                }
                if (strArr3 != null && C7615.m23812(strMo13700, strArr3)) {
                    return false;
                }
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public boolean m16394(String str) {
        return m16392(str, f12885, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m16395(AbstractC7853.C7854 c7854) {
        m16396(c7854, m4009());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void m16396(AbstractC7853.C7854 c7854, C4605 c4605) {
        String strMo13700 = c4605.mo13700();
        String strM24941 = c7854.m24941();
        AbstractC6381 c3632 = c7854.m24928() ? new C3632(strM24941) : mo16356(strMo13700) ? new C4299(strM24941) : new C7755(strM24941);
        c4605.m13710(c3632);
        m25207(c3632);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m16397(AbstractC7853.C7855 c7855) {
        C3929 c3929 = new C3929(c7855.m24945());
        m4009().m13710(c3929);
        m25207(c3929);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public C4605 m16398(AbstractC7853.C7859 c7859) {
        C4605 c4605M16369 = m16369(c7859, C6617.f16980, false);
        m16371(c4605M16369, c7859);
        if (c7859.m24966()) {
            C7719 c7719M13813 = c4605M16369.m13813();
            if (!c7719M13813.m24555()) {
                c7719M13813.m24560();
            } else if (!c7719M13813.m24551()) {
                this.f23778.m25021("Tag [%s] cannot be self closing; not a void tag", c7719M13813.m24558());
            }
            this.f23778.m25025(EnumC7866.f23541);
            this.f23778.m25010(this.f12905.mo24935().m24967(c4605M16369.m13816()));
        }
        return c4605M16369;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public C4605 m16399(AbstractC7853.C7859 c7859) {
        C4605 c4605M16369 = m16369(c7859, C6617.f16980, false);
        m16371(c4605M16369, c7859);
        m25209();
        return c4605M16369;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public C4605 m16400(AbstractC7853.C7859 c7859, String str) {
        C4605 c4605M16369 = m16369(c7859, str, true);
        m16371(c4605M16369, c7859);
        if (c7859.m24966()) {
            c4605M16369.m13813().m24560();
            m25209();
        }
        return c4605M16369;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public C5063 m16401(AbstractC7853.C7859 c7859, boolean z, boolean z2) {
        C5063 c5063 = (C5063) m16369(c7859, C6617.f16980, false);
        if (!z2 || !m16413("template")) {
            m16434(c5063);
        }
        m16371(c5063, c7859);
        if (!z) {
            m25209();
        }
        return c5063;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m16402(AbstractC6381 abstractC6381) {
        C4605 c4605M16360;
        C4605 c4605M16382 = m16382("table");
        boolean z = false;
        if (c4605M16382 == null) {
            c4605M16360 = this.f23780.get(0);
        } else if (c4605M16382.mo13701() != null) {
            c4605M16360 = c4605M16382.mo13701();
            z = true;
        } else {
            c4605M16360 = m16360(c4605M16382);
        }
        if (!z) {
            c4605M16360.m13710(abstractC6381);
        } else {
            C8159.m26910(c4605M16382);
            c4605M16382.mo13687(abstractC6381);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m16403() {
        this.f12902.add(null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public void m16404(C4605 c4605, C4605 c46052) {
        int iLastIndexOf = this.f23780.lastIndexOf(c4605);
        C8159.m26903(iLastIndexOf != -1);
        this.f23780.add(iLastIndexOf + 1, c46052);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean m16405() {
        return this.f12907;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public boolean m16406() {
        return this.f12908;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public boolean m16407(C4605 c4605) {
        return m16352(this.f12902, c4605);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public C4605 m16408() {
        if (this.f12902.size() <= 0) {
            return null;
        }
        return this.f12902.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m16409() {
        this.f12897 = this.f12896;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m16410(C4605 c4605) {
        if (this.f12898) {
            return;
        }
        String strMo17593 = c4605.mo17593("href");
        if (strMo17593.length() != 0) {
            this.f23781 = strMo17593;
            this.f12898 = true;
            this.f23779.m19928(strMo17593);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۤ()LYue/ۥۢۢۡۧ; */
    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C5321 mo16357() {
        return new C5321();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public boolean m16412(C4605 c4605) {
        return m16352(this.f23780, c4605);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean m16413(String str) {
        return m16382(str) != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public boolean m16414(String[] strArr) {
        int size = this.f23780.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            if (!C7615.m23812(this.f23780.get(i).mo13700(), strArr)) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public EnumC5322 m16415() {
        return this.f12897;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public C4605 m16416(String str) {
        for (int size = this.f23780.size() - 1; size >= 0; size--) {
            C4605 c4605M25209 = m25209();
            if (c4605M25209.m13737(str, C6617.f16980)) {
                return c4605M25209;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m16417(String... strArr) {
        for (int size = this.f23780.size() - 1; size >= 0; size--) {
            C4605 c4605M25209 = m25209();
            if (C7615.m23812(c4605M25209.mo13700(), strArr) && C6617.f16980.equals(c4605M25209.m13813().m24557())) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public C4605 m16418(String str) {
        for (int size = this.f23780.size() - 1; size >= 0; size--) {
            C4605 c4605M25209 = m25209();
            if (c4605M25209.m19913(str)) {
                return c4605M25209;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public EnumC5322 m16419() {
        if (this.f12903.size() <= 0) {
            return null;
        }
        return this.f12903.remove(r0.size() - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public int m16420(C4605 c4605) {
        for (int i = 0; i < this.f12902.size(); i++) {
            if (c4605 == this.f12902.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public boolean m16421(AbstractC7853 abstractC7853, EnumC5322 enumC5322) {
        return enumC5322.mo16448(abstractC7853, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public void m16422(C4605 c4605) {
        m16362(c4605);
        this.f12902.add(c4605);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public void m16423(EnumC5322 enumC5322) {
        this.f12903.add(enumC5322);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public void m16424(C4605 c4605, int i) {
        m16362(c4605);
        try {
            this.f12902.add(i, c4605);
        } catch (IndexOutOfBoundsException unused) {
            this.f12902.add(c4605);
        }
    }

    /* JADX DEBUG: Duplicate block (B:20:0x003c) to fix multi-entry loop: BACK_EDGE: B:24:0x006c -> B:20:0x003c */
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public void m16425() {
        C4605 c4605M16408;
        if (this.f23780.size() > 256 || (c4605M16408 = m16408()) == null || m16412(c4605M16408)) {
            return;
        }
        int size = this.f12902.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        boolean z = true;
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            c4605M16408 = this.f12902.get(i3);
            if (c4605M16408 == null || m16412(c4605M16408)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c4605M16408 = this.f12902.get(i3);
            }
            C8159.m26910(c4605M16408);
            C4605 c4605 = new C4605(m25215(c4605M16408.mo13700(), this.f23783), null, c4605M16408.mo13685().clone());
            m16371(c4605, null);
            this.f12902.set(i3, c4605);
            if (i3 == i2) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public void m16426(C4605 c4605) {
        for (int size = this.f12902.size() - 1; size >= 0; size--) {
            if (this.f12902.get(size) == c4605) {
                this.f12902.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m16427(C4605 c4605) {
        for (int size = this.f23780.size() - 1; size >= 0; size--) {
            if (this.f23780.get(size) == c4605) {
                this.f23780.remove(size);
                m25206(c4605);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public C4605 m16428() {
        int size = this.f12902.size();
        if (size > 0) {
            return this.f12902.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public void m16429(C4605 c4605, C4605 c46052) {
        m16353(this.f12902, c4605, c46052);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public void m16430(C4605 c4605, C4605 c46052) {
        m16353(this.f23780, c4605, c46052);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public void m16431() {
        if (!m16413(C5905.f14739)) {
            this.f23780.add(this.f23779.m12987());
        }
        m16439(EnumC5322.f12916);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x0115. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m16432() {
        int size = this.f23780.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        EnumC5322 enumC5322 = this.f12896;
        if (this.f23780.size() == 0) {
            m16439(EnumC5322.f12916);
        }
        boolean z = false;
        while (true) {
            if (i >= i2) {
                C4605 c4605 = this.f23780.get(i);
                if (i == i2) {
                    if (this.f12908) {
                        c4605 = this.f12901;
                    }
                    z = true;
                }
                String strMo13700 = c4605 != null ? c4605.mo13700() : "";
                if (C6617.f16980.equals(c4605.m13813().m24557())) {
                    strMo13700.hashCode();
                    switch (strMo13700) {
                        case "frameset":
                            m16439(EnumC5322.f12929);
                            break;
                        case "template":
                            EnumC5322 enumC5322M16370 = m16370();
                            C8159.m26911(enumC5322M16370, "Bug: no template insertion mode on stack!");
                            m16439(enumC5322M16370);
                            break;
                        case "select":
                            m16439(EnumC5322.f12925);
                            break;
                        case "colgroup":
                            m16439(EnumC5322.f12921);
                            break;
                        case "td":
                        case "th":
                            if (z) {
                                if (z) {
                                    m16439(EnumC5322.f12916);
                                }
                                break;
                            } else {
                                m16439(EnumC5322.f12924);
                                break;
                            }
                            break;
                        case "tr":
                            m16439(EnumC5322.f12923);
                            break;
                        case "body":
                            m16439(EnumC5322.f12916);
                            break;
                        case "head":
                            if (!z) {
                                m16439(EnumC5322.f12913);
                                break;
                            }
                            break;
                        case "html":
                            m16439(this.f12899 == null ? EnumC5322.f12912 : EnumC5322.f12915);
                            break;
                        case "table":
                            m16439(EnumC5322.f12918);
                            break;
                        case "tbody":
                        case "tfoot":
                        case "thead":
                            m16439(EnumC5322.f12922);
                            break;
                        case "caption":
                            m16439(EnumC5322.f12920);
                            break;
                    }
                }
                i--;
            }
        }
        return this.f12896 != enumC5322;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public void m16433() {
        this.f12904.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public void m16434(C5063 c5063) {
        this.f12900 = c5063;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public void m16435(boolean z) {
        this.f12907 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void m16436(C4605 c4605) {
        this.f12899 = c4605;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public EnumC5322 m16437() {
        return this.f12896;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public int m16438() {
        return this.f12903.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public void m16439(EnumC5322 enumC5322) {
        this.f12896 = enumC5322;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public boolean m16440(AbstractC7853 abstractC7853) {
        if (this.f23780.isEmpty()) {
            return true;
        }
        C4605 c4605M4009 = m4009();
        String strM24557 = c4605M4009.m13813().m24557();
        if (C6617.f16980.equals(strM24557)) {
            return true;
        }
        if (m16349(c4605M4009) && ((abstractC7853.m24934() && !"mglyph".equals(abstractC7853.m24925().f23491) && !"malignmark".equals(abstractC7853.m24925().f23491)) || abstractC7853.m24929())) {
            return true;
        }
        if (C6617.f16982.equals(strM24557) && c4605M4009.m19913("annotation-xml") && abstractC7853.m24934() && "svg".equals(abstractC7853.m24925().f23491)) {
            return true;
        }
        if (m16348(c4605M4009) && (abstractC7853.m24934() || abstractC7853.m24929())) {
            return true;
        }
        return abstractC7853.m24932();
    }
}
