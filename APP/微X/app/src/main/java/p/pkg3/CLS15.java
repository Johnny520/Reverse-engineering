// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import java.util.HashMap;
import p.pkg1.CLS1;
import p.pkg7.CLS39;

public final class CLS15 implements Cloneable {
    public static final String[] FLD172;
    public boolean FLD173;
    public static final String[] FLD174;
    public boolean FLD175;
    public boolean FLD176;
    public static final String[] FLD177;
    public static final HashMap FLD178;
    public boolean FLD179;
    public String FLD180;
    public static final String[] FLD181;
    public static final String[] FLD182;
    public boolean FLD183;
    public static final String[] FLD184;
    public boolean FLD185;
    public boolean FLD186;
    public final String FLD187;

    static {
        CLS15.FLD178 = new HashMap();
        CLS15.FLD182 = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};
        CLS15.FLD174 = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        CLS15.FLD172 = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        CLS15.FLD177 = new String[]{"pre", "plaintext", "title", "textarea"};
        CLS15.FLD181 = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        CLS15.FLD184 = new String[]{"input", "keygen", "object", "select", "textarea"};
        for(int v1 = 0; v1 < 69; ++v1) {
            CLS15 ᴵᐧ0 = new CLS15(new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"}[v1]);
            CLS15.FLD178.put(ᴵᐧ0.FLD180, ᴵᐧ0);
        }
        String[] arr_s = CLS15.FLD182;
        for(int v2 = 0; v2 < arr_s.length; ++v2) {
            CLS15 ᴵᐧ1 = new CLS15(arr_s[v2]);
            ᴵᐧ1.FLD185 = false;
            ᴵᐧ1.FLD173 = false;
            CLS15.FLD178.put(ᴵᐧ1.FLD180, ᴵᐧ1);
        }
        String[] arr_s1 = CLS15.FLD174;
        for(int v3 = 0; v3 < arr_s1.length; ++v3) {
            CLS15 ᴵᐧ2 = (CLS15)CLS15.FLD178.get(arr_s1[v3]);
            CLS39.MTH871(ᴵᐧ2);
            ᴵᐧ2.FLD176 = true;
        }
        String[] arr_s2 = CLS15.FLD172;
        for(int v4 = 0; v4 < arr_s2.length; ++v4) {
            CLS15 ᴵᐧ3 = (CLS15)CLS15.FLD178.get(arr_s2[v4]);
            CLS39.MTH871(ᴵᐧ3);
            ᴵᐧ3.FLD173 = false;
        }
        String[] arr_s3 = CLS15.FLD177;
        for(int v5 = 0; v5 < arr_s3.length; ++v5) {
            CLS15 ᴵᐧ4 = (CLS15)CLS15.FLD178.get(arr_s3[v5]);
            CLS39.MTH871(ᴵᐧ4);
            ᴵᐧ4.FLD186 = true;
        }
        String[] arr_s4 = CLS15.FLD181;
        for(int v6 = 0; v6 < arr_s4.length; ++v6) {
            CLS15 ᴵᐧ5 = (CLS15)CLS15.FLD178.get(arr_s4[v6]);
            CLS39.MTH871(ᴵᐧ5);
            ᴵᐧ5.FLD183 = true;
        }
        String[] arr_s5 = CLS15.FLD184;
        for(int v = 0; v < arr_s5.length; ++v) {
            CLS15 ᴵᐧ6 = (CLS15)CLS15.FLD178.get(arr_s5[v]);
            CLS39.MTH871(ᴵᐧ6);
            ᴵᐧ6.FLD179 = true;
        }
    }

    public CLS15(String s) {
        this.FLD185 = true;
        this.FLD173 = true;
        this.FLD176 = false;
        this.FLD175 = false;
        this.FLD186 = false;
        this.FLD183 = false;
        this.FLD179 = false;
        this.FLD180 = s;
        this.FLD187 = CLS1.MTH398(s);
    }

    @Override
    public final Object clone() {
        try {
            return (CLS15)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CLS15)) {
            return false;
        }
        if(!this.FLD180.equals(((CLS15)object0).FLD180)) {
            return false;
        }
        if(this.FLD176 != ((CLS15)object0).FLD176) {
            return false;
        }
        if(this.FLD173 != ((CLS15)object0).FLD173) {
            return false;
        }
        if(this.FLD185 != ((CLS15)object0).FLD185) {
            return false;
        }
        if(this.FLD186 != ((CLS15)object0).FLD186) {
            return false;
        }
        if(this.FLD175 != ((CLS15)object0).FLD175) {
            return false;
        }
        return this.FLD183 == ((CLS15)object0).FLD183 ? this.FLD179 == ((CLS15)object0).FLD179 : false;
    }

    @Override
    public final int hashCode() {
        return ((((((this.FLD180.hashCode() * 0x1F + this.FLD185) * 0x1F + this.FLD173) * 0x1F + this.FLD176) * 0x1F + this.FLD175) * 0x1F + this.FLD186) * 0x1F + this.FLD183) * 0x1F + this.FLD179;
    }

    @Override
    public final String toString() {
        return this.FLD180;
    }

    public static CLS15 MTH690(String s, CLS9 ˋˈ0) {
        CLS39.MTH871(s);
        HashMap hashMap0 = CLS15.FLD178;
        CLS15 ᴵᐧ0 = (CLS15)hashMap0.get(s);
        if(ᴵᐧ0 == null) {
            ˋˈ0.getClass();
            String s1 = s.trim();
            if(!ˋˈ0.FLD43) {
                s1 = CLS1.MTH398(s1);
            }
            CLS39.MTH872(s1);
            String s2 = CLS1.MTH398(s1);
            CLS15 ᴵᐧ1 = (CLS15)hashMap0.get(s2);
            if(ᴵᐧ1 == null) {
                ᴵᐧ0 = new CLS15(s1);
                ᴵᐧ0.FLD185 = false;
                return ᴵᐧ0;
            }
            if(ˋˈ0.FLD43 && !s1.equals(s2)) {
                try {
                    ᴵᐧ0 = (CLS15)ᴵᐧ1.super.clone();
                    ᴵᐧ0.FLD180 = s1;
                    return ᴵᐧ0;
                }
                catch(CloneNotSupportedException cloneNotSupportedException0) {
                    throw new RuntimeException(cloneNotSupportedException0);
                }
            }
            return ᴵᐧ1;
        }
        return ᴵᐧ0;
    }
}

