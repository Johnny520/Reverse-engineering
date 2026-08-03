package Yue;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7719 implements Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final Map<String, C7719> f23223 = new HashMap();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String[] f23224;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String[] f23225;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String[] f23226;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String[] f23227;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final String[] f23228;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final String[] f23229;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final String[] f23230;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final Map<String, String[]> f23231;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String f23232;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final String f23233;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public String f23234;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f23235 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f23236 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f23237 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f23238 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f23239 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f23240 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f23241 = false;

    static {
        String[] strArr = {"html", "head", C5905.f14739, "frameset", "script", "noscript", "style", "meta", "link", C6468.f16546, "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", C7683.f23124, "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        f23224 = strArr;
        String[] strArr2 = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", C6608.f2171, "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", C6468.f16552, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb", "text", "mi", "mo", "msup", "mn", "mtext"};
        f23225 = strArr2;
        String[] strArr3 = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f23226 = strArr3;
        String[] strArr4 = {C6468.f16546, C6608.f2171, "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        f23227 = strArr4;
        String[] strArr5 = {"pre", "plaintext", C6468.f16546, "textarea"};
        f23228 = strArr5;
        String[] strArr6 = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f23229 = strArr6;
        String[] strArr7 = {"input", "keygen", "object", "select", "textarea"};
        f23230 = strArr7;
        HashMap map = new HashMap();
        f23231 = map;
        map.put(C6617.f16982, new String[]{"math", "mi", "mo", "msup", "mn", "mtext"});
        map.put(C6617.f16983, new String[]{"svg", "text"});
        m24543(strArr, new Consumer() { // from class: Yue.ۥۢ۠ۧۤ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7719.m24535((C7719) obj);
            }
        });
        m24543(strArr2, new Consumer() { // from class: Yue.ۥۢ۠ۧۥ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7719.m24536((C7719) obj);
            }
        });
        m24543(strArr3, new Consumer() { // from class: Yue.ۥۢ۠ۧۦ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C7719) obj).f23237 = true;
            }
        });
        m24543(strArr4, new Consumer() { // from class: Yue.ۥۢ۠ۧۧ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C7719) obj).f23236 = false;
            }
        });
        m24543(strArr5, new Consumer() { // from class: Yue.ۥۢ۠ۧۨ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C7719) obj).f23239 = true;
            }
        });
        m24543(strArr6, new Consumer() { // from class: Yue.ۥۢ۠ۨ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C7719) obj).f23240 = true;
            }
        });
        m24543(strArr7, new Consumer() { // from class: Yue.ۥۢ۠ۨ۟
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C7719) obj).f23241 = true;
            }
        });
        for (final Map.Entry entry : map.entrySet()) {
            m24543((String[]) entry.getValue(), new Consumer() { // from class: Yue.ۥۢ۠ۨ۠
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C7719.m24542(entry, (C7719) obj);
                }
            });
        }
    }

    public C7719(String str, String str2) {
        this.f23232 = str;
        this.f23233 = C6396.m2839(str);
        this.f23234 = str2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static boolean m24534(String str) {
        return f23223.containsKey(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ void m24535(C7719 c7719) {
        c7719.f23235 = true;
        c7719.f23236 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ void m24536(C7719 c7719) {
        c7719.f23235 = false;
        c7719.f23236 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ void m24542(Map.Entry entry, C7719 c7719) {
        c7719.f23234 = (String) entry.getKey();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static void m24543(String[] strArr, Consumer<C7719> consumer) {
        for (String str : strArr) {
            Map<String, C7719> map = f23223;
            C7719 c7719 = map.get(str);
            if (c7719 == null) {
                c7719 = new C7719(str, C6617.f16980);
                map.put(c7719.f23232, c7719);
            }
            consumer.accept(c7719);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static C7719 m24544(String str) {
        return m24546(str, C6617.f16980, C6616.f16979);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static C7719 m24545(String str, C6616 c6616) {
        return m24546(str, C6617.f16980, c6616);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static C7719 m24546(String str, String str2, C6616 c6616) {
        C8159.m26907(str);
        C8159.m26910(str2);
        Map<String, C7719> map = f23223;
        C7719 c7719 = map.get(str);
        if (c7719 != null && c7719.f23234.equals(str2)) {
            return c7719;
        }
        String strM20992 = c6616.m20992(str);
        C8159.m26907(strM20992);
        String strM2839 = C6396.m2839(strM20992);
        C7719 c77192 = map.get(strM2839);
        if (c77192 == null || !c77192.f23234.equals(str2)) {
            C7719 c77193 = new C7719(strM20992, str2);
            c77193.f23235 = false;
            return c77193;
        }
        if (!c6616.m20994() || strM20992.equals(strM2839)) {
            return c77192;
        }
        C7719 c7719Clone = c77192.clone();
        c7719Clone.f23232 = strM20992;
        return c7719Clone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7719)) {
            return false;
        }
        C7719 c7719 = (C7719) obj;
        return this.f23232.equals(c7719.f23232) && this.f23237 == c7719.f23237 && this.f23236 == c7719.f23236 && this.f23235 == c7719.f23235 && this.f23239 == c7719.f23239 && this.f23238 == c7719.f23238 && this.f23240 == c7719.f23240 && this.f23241 == c7719.f23241;
    }

    public int hashCode() {
        return (((((((((((((this.f23232.hashCode() * 31) + (this.f23235 ? 1 : 0)) * 31) + (this.f23236 ? 1 : 0)) * 31) + (this.f23237 ? 1 : 0)) * 31) + (this.f23238 ? 1 : 0)) * 31) + (this.f23239 ? 1 : 0)) * 31) + (this.f23240 ? 1 : 0)) * 31) + (this.f23241 ? 1 : 0);
    }

    public String toString() {
        return this.f23232;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7719 clone() {
        try {
            return (C7719) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m24548() {
        return this.f23236;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public String m24549() {
        return this.f23232;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m24550() {
        return this.f23235;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m24551() {
        return this.f23237;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m24552() {
        return this.f23240;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m24553() {
        return this.f23241;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m24554() {
        return !this.f23235;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m24555() {
        return f23223.containsKey(this.f23232);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m24556() {
        return this.f23237 || this.f23238;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public String m24557() {
        return this.f23234;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public String m24558() {
        return this.f23233;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean m24559() {
        return this.f23239;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public C7719 m24560() {
        this.f23238 = true;
        return this;
    }
}
