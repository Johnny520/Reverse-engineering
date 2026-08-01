// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p.pkg1.CLS1;
import p.pkg6.CLS36;
import p.pkg7.CLS37;
import p.pkg7.CLS39;
import p.pkg9.CLS190;
import p.pkg9.CLS192;
import p.pkg9.CLS205;
import p.pkg9.CLS206;
import p.pkg9.CLS207;
import p.pkg9.CLS57;
import p.pkg9.CLS58;
import p.pkg9.CLS61;
import p.pkg9.CLS64;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class CLS17 extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS157 extends CLS17 {
        public CLS157() {
            super("AfterFrameset", 20);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("html")) {
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
            }
            if(יٴ0.MTH506() && ((CLS199)יٴ0).FLD81.equals("html")) {
                ﾞᵢ0.FLD258 = CLS17.FLD249;
                return true;
            }
            if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("noframes")) {
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD230));
            }
            if(יٴ0.MTH510()) {
                return true;
            }
            ﾞᵢ0.MTH776(((CLS17)this));
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS158 extends CLS17 {
        public CLS158() {
            super("AfterHead", 5);
        }

        public final boolean MTH694(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            ((CLS8)ﾞᵢ0).MTH444("body");
            ﾞᵢ0.FLD253 = true;
            return ﾞᵢ0.MTH446(יٴ0);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return true;
            }
            CLS175 ﹳˑ$ⁱﹳ0 = CLS17.FLD230;
            if(יٴ0.MTH508()) {
                String s = ((CLS201)יٴ0).FLD81;
                CLS168 ﹳˑ$ـʿ0 = CLS17.FLD248;
                if(s.equals("html")) {
                    return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ـʿ0));
                }
                if(s.equals("body")) {
                    ﾞᵢ0.MTH764(((CLS201)יٴ0));
                    ﾞᵢ0.FLD253 = false;
                    ﾞᵢ0.FLD258 = ﹳˑ$ـʿ0;
                    return true;
                }
                if(s.equals("frameset")) {
                    ﾞᵢ0.MTH764(((CLS201)יٴ0));
                    ﾞᵢ0.FLD258 = CLS17.FLD239;
                    return true;
                }
                if(CLS36.MTH852(s, CLS16.FLD223)) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    CLS192 יٴ1 = ﾞᵢ0.FLD266;
                    ﾞᵢ0.FLD33.add(יٴ1);
                    ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                    ﾞᵢ0.MTH765(יٴ1);
                    return true;
                }
                if(s.equals("head")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
            }
            else if(יٴ0.MTH506()) {
                String s1 = ((CLS199)יٴ0).FLD81;
                if(!CLS36.MTH852(s1, CLS16.FLD198)) {
                    if(s1.equals("template")) {
                        ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                        return true;
                    }
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
            }
            this.MTH694(יٴ0, ﾞᵢ0);
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS159 extends CLS17 {
        public CLS159() {
            super("InTable", 8);
        }

        public final boolean MTH697(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            ﾞᵢ0.MTH776(((CLS17)this));
            ﾞᵢ0.FLD262 = true;
            ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
            ﾞᵢ0.FLD262 = false;
            return true;
        }

        // 此方法包含解密的字符串
        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            CLS180 ﹳˑ$ﾞᵢ0;
            if(יٴ0.FLD87 == 5 && CLS36.MTH852(((CLS8)ﾞᵢ0).MTH445().FLD388.FLD187, CLS16.FLD212)) {
                ﾞᵢ0.FLD269 = new ArrayList();
                ﾞᵢ0.FLD252 = ﾞᵢ0.FLD258;
                ﾞᵢ0.FLD258 = CLS17.FLD236;
                return ﾞᵢ0.MTH446(יٴ0);
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            CLS175 ﹳˑ$ⁱﹳ0 = CLS17.FLD230;
            if(יٴ0.MTH508()) {
                String s = ((CLS201)יٴ0).FLD81;
                if(s.equals("caption")) {
                    ﾞᵢ0.MTH773();
                    ﾞᵢ0.FLD260.add(null);
                    ﾞᵢ0.MTH764(((CLS201)יٴ0));
                    ﹳˑ$ﾞᵢ0 = CLS17.FLD243;
                    ﾞᵢ0.FLD258 = ﹳˑ$ﾞᵢ0;
                    return true;
                }
                if(s.equals("colgroup")) {
                    ﾞᵢ0.MTH773();
                    ﾞᵢ0.MTH764(((CLS201)יٴ0));
                    ﹳˑ$ﾞᵢ0 = CLS17.FLD231;
                    ﾞᵢ0.FLD258 = ﹳˑ$ﾞᵢ0;
                    return true;
                }
                if(s.equals("col")) {
                    ﾞᵢ0.MTH773();
                    ((CLS8)ﾞᵢ0).MTH444("colgroup");
                    return ﾞᵢ0.MTH446(יٴ0);
                }
                if(CLS36.MTH852(s, CLS16.FLD220)) {
                    ﾞᵢ0.MTH773();
                    ﾞᵢ0.MTH764(((CLS201)יٴ0));
                    ﹳˑ$ﾞᵢ0 = CLS17.FLD226;
                    ﾞᵢ0.FLD258 = ﹳˑ$ﾞᵢ0;
                    return true;
                }
                if(CLS36.MTH852(s, CLS16.FLD210)) {
                    ﾞᵢ0.MTH773();
                    ((CLS8)ﾞᵢ0).MTH444("tbody");
                    return ﾞᵢ0.MTH446(יٴ0);
                }
                if(s.equals("table")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    if(!ﾞᵢ0.MTH795(s)) {
                        return false;
                    }
                    ﾞᵢ0.MTH770(s);
                    if(!ﾞᵢ0.MTH759()) {
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        return true;
                    }
                    return ﾞᵢ0.MTH446(יٴ0);
                }
                if(CLS36.MTH852(s, CLS16.FLD190)) {
                    return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                }
                if(s.equals("input")) {
                    if(((CLS87)(((CLS201)יٴ0))).MTH482() && false) {
                        ﾞᵢ0.MTH782(((CLS201)יٴ0));
                        return true;
                    }
                    this.MTH697(יٴ0, ﾞᵢ0);
                    return true;
                }
                if(s.equals("form")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    if(ﾞᵢ0.FLD270 == null && !ﾞᵢ0.MTH772("template")) {
                        ﾞᵢ0.MTH769(((CLS201)יٴ0), false, false);
                        return true;
                    }
                    return false;
                }
                this.MTH697(יٴ0, ﾞᵢ0);
                return true;
            }
            if(יٴ0.MTH506()) {
                String s1 = ((CLS199)יٴ0).FLD81;
                if(s1.equals("table")) {
                    if(!ﾞᵢ0.MTH795(s1)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    ﾞᵢ0.MTH770("table");
                    ﾞᵢ0.MTH759();
                    return true;
                }
                if(CLS36.MTH852(s1, CLS16.FLD217)) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                if(s1.equals("template")) {
                    ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                    return true;
                }
                this.MTH697(יٴ0, ﾞᵢ0);
                return true;
            }
            if(יٴ0.MTH510()) {
                if(((CLS8)ﾞᵢ0).MTH447("html")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                }
                return true;
            }
            this.MTH697(יٴ0, ﾞᵢ0);
            return true;
        }
    }

    public static final class CLS16 {
        public static final String[] FLD188;
        public static final String[] FLD189;
        public static final String[] FLD190;
        public static final String[] FLD191;
        public static final String[] FLD192;
        public static final String[] FLD193;
        public static final String[] FLD194;
        public static final String[] FLD195;
        public static final String[] FLD196;
        public static final String[] FLD197;
        public static final String[] FLD198;
        public static final String[] FLD199;
        public static final String[] FLD200;
        public static final String[] FLD201;
        public static final String[] FLD202;
        public static final String[] FLD203;
        public static final String[] FLD204;
        public static final String[] FLD205;
        public static final String[] FLD206;
        public static final String[] FLD207;
        public static final String[] FLD208;
        public static final String[] FLD209;
        public static final String[] FLD210;
        public static final String[] FLD211;
        public static final String[] FLD212;
        public static final String[] FLD213;
        public static final String[] FLD214;
        public static final String[] FLD215;
        public static final String[] FLD216;
        public static final String[] FLD217;
        public static final String[] FLD218;
        public static final String[] FLD219;
        public static final String[] FLD220;
        public static final String[] FLD221;
        public static final String[] FLD222;
        public static final String[] FLD223;
        public static final String[] FLD224;
        public static final String[] FLD225;

        static {
            CLS16.FLD211 = new String[]{"base", "basefont", "bgsound", "command", "link"};
            CLS16.FLD225 = new String[]{"noframes", "style"};
            CLS16.FLD222 = new String[]{"body", "br", "html"};
            CLS16.FLD198 = new String[]{"body", "br", "html"};
            CLS16.FLD203 = new String[]{"body", "br", "head", "html"};
            CLS16.FLD202 = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
            CLS16.FLD223 = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
            CLS16.FLD218 = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            CLS16.FLD208 = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            CLS16.FLD207 = new String[]{"address", "div", "p"};
            CLS16.FLD216 = new String[]{"dd", "dt"};
            CLS16.FLD201 = new String[]{"applet", "marquee", "object"};
            CLS16.FLD189 = new String[]{"param", "source", "track"};
            CLS16.FLD206 = new String[]{"action", "name", "prompt"};
            CLS16.FLD214 = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            CLS16.FLD221 = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            CLS16.FLD205 = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            CLS16.FLD213 = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            CLS16.FLD220 = new String[]{"tbody", "tfoot", "thead"};
            CLS16.FLD210 = new String[]{"td", "th", "tr"};
            CLS16.FLD190 = new String[]{"script", "style", "template"};
            CLS16.FLD209 = new String[]{"td", "th"};
            CLS16.FLD224 = new String[]{"body", "caption", "col", "colgroup", "html"};
            CLS16.FLD192 = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            CLS16.FLD195 = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
            CLS16.FLD217 = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            CLS16.FLD212 = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            CLS16.FLD196 = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
            CLS16.FLD215 = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
            CLS16.FLD204 = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
            CLS16.FLD200 = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
            CLS16.FLD199 = new String[]{"input", "keygen", "textarea"};
            CLS16.FLD193 = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
            CLS16.FLD197 = new String[]{"tbody", "tfoot", "thead"};
            CLS16.FLD219 = new String[]{"head", "noscript"};
            CLS16.FLD194 = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            CLS16.FLD188 = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
            CLS16.FLD191 = new String[]{"caption", "colgroup", "tbody", "tfoot", "thead"};
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS160 extends CLS17 {
        public CLS160() {
            super("InTableBody", 12);
        }

        public final boolean MTH701(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(!ﾞᵢ0.MTH795("tbody") && !ﾞᵢ0.MTH795("thead") && !ﾞᵢ0.MTH781("tfoot", null)) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            ﾞᵢ0.MTH786();
            ((CLS8)ﾞᵢ0).MTH442(((CLS8)ﾞᵢ0).MTH445().FLD388.FLD187);
            return ﾞᵢ0.MTH446(יٴ0);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            int v = CLS58.MTH1007(יٴ0.FLD87);
            CLS159 ﹳˑ$ʾﾞ0 = CLS17.FLD237;
            switch(v) {
                case 1: {
                    String s = ((CLS201)יٴ0).FLD81;
                    if(s.equals("tr")) {
                        ﾞᵢ0.MTH786();
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        ﾞᵢ0.FLD258 = CLS17.FLD235;
                        return true;
                    }
                    if(CLS36.MTH852(s, CLS16.FLD209)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        ((CLS8)ﾞᵢ0).MTH444("tr");
                        return ﾞᵢ0.MTH446(((CLS12)(((CLS201)יٴ0))));
                    }
                    return CLS36.MTH852(s, CLS16.FLD196) ? this.MTH701(יٴ0, ﾞᵢ0) : ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ʾﾞ0));
                }
                case 2: {
                    String s1 = ((CLS199)יٴ0).FLD81;
                    if(CLS36.MTH852(s1, CLS16.FLD197)) {
                        if(!ﾞᵢ0.MTH795(s1)) {
                            ﾞᵢ0.MTH776(((CLS17)this));
                            return false;
                        }
                        ﾞᵢ0.MTH786();
                        ﾞᵢ0.MTH766();
                        ﾞᵢ0.FLD258 = ﹳˑ$ʾﾞ0;
                        return true;
                    }
                    if(s1.equals("table")) {
                        return this.MTH701(יٴ0, ﾞᵢ0);
                    }
                    if(CLS36.MTH852(s1, CLS16.FLD215)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ʾﾞ0));
                }
                default: {
                    return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ʾﾞ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS161 extends CLS17 {
        public CLS161() {
            super("InFrameset", 19);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            if(יٴ0.MTH508()) {
                String s = ((CLS201)יٴ0).FLD81;
                s.getClass();
                switch(s) {
                    case "frame": {
                        ﾞᵢ0.MTH782(((CLS201)יٴ0));
                        return true;
                    }
                    case "frameset": {
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        return true;
                    }
                    case "html": {
                        return ﾞᵢ0.MTH767(((CLS12)(((CLS201)יٴ0))), ((CLS17)CLS17.FLD248));
                    }
                    case "noframes": {
                        return ﾞᵢ0.MTH767(((CLS12)(((CLS201)יٴ0))), ((CLS17)CLS17.FLD230));
                    }
                    default: {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                }
            }
            if(יٴ0.MTH506() && ((CLS199)יٴ0).FLD81.equals("frameset")) {
                if(((CLS8)ﾞᵢ0).MTH447("html")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                ﾞᵢ0.MTH766();
                if(((CLS8)ﾞᵢ0).MTH447("frameset")) {
                    return true;
                }
                ﾞᵢ0.FLD258 = CLS17.FLD227;
                return true;
            }
            if(יٴ0.MTH510()) {
                if(!((CLS8)ﾞᵢ0).MTH447("html")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                }
                return true;
            }
            ﾞᵢ0.MTH776(((CLS17)this));
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS162 extends CLS17 {
        public CLS162() {
            super("InCell", 14);
        }

        public static void MTH706(CLS181 ﾞᵢ0) {
            ((CLS8)ﾞᵢ0).MTH442((ﾞᵢ0.MTH795("td") ? "td" : "th"));
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            CLS168 ﹳˑ$ـʿ0 = CLS17.FLD248;
            if(יٴ0.MTH506()) {
                String s = ((CLS199)יٴ0).FLD81;
                if(CLS36.MTH852(s, CLS16.FLD209)) {
                    boolean z = ﾞᵢ0.MTH795(s);
                    CLS163 ﹳˑ$ˎᵔ0 = CLS17.FLD235;
                    if(!z) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        ﾞᵢ0.FLD258 = ﹳˑ$ˎᵔ0;
                        return false;
                    }
                    ﾞᵢ0.MTH792(false);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                    }
                    ﾞᵢ0.MTH770(s);
                    ﾞᵢ0.MTH779();
                    ﾞᵢ0.FLD258 = ﹳˑ$ˎᵔ0;
                    return true;
                }
                if(CLS36.MTH852(s, CLS16.FLD224)) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                if(CLS36.MTH852(s, CLS16.FLD192)) {
                    if(ﾞᵢ0.MTH795(s)) {
                        CLS162.MTH706(ﾞᵢ0);
                        return ﾞᵢ0.MTH446(יٴ0);
                    }
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ـʿ0));
            }
            if(יٴ0.MTH508() && CLS36.MTH852(((CLS201)יٴ0).FLD81, CLS16.FLD195)) {
                if(!ﾞᵢ0.MTH795("td") && !ﾞᵢ0.MTH795("th")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                CLS162.MTH706(ﾞᵢ0);
                return ﾞᵢ0.MTH446(יٴ0);
            }
            return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ـʿ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS163 extends CLS17 {
        public CLS163() {
            super("InRow", 13);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            CLS159 ﹳˑ$ʾﾞ0 = CLS17.FLD237;
            if(יٴ0.MTH508()) {
                String s = ((CLS201)יٴ0).FLD81;
                if(CLS36.MTH852(s, CLS16.FLD209)) {
                    ﾞᵢ0.MTH761();
                    ﾞᵢ0.MTH764(((CLS201)יٴ0));
                    ﾞᵢ0.FLD258 = CLS17.FLD242;
                    ﾞᵢ0.FLD260.add(null);
                    return true;
                }
                if(CLS36.MTH852(s, CLS16.FLD204)) {
                    return ((CLS8)ﾞᵢ0).MTH442("tr") ? ﾞᵢ0.MTH446(יٴ0) : false;
                }
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ʾﾞ0));
            }
            if(יٴ0.MTH506()) {
                String s1 = ((CLS199)יٴ0).FLD81;
                CLS160 ﹳˑ$ˉˈ0 = CLS17.FLD226;
                if(s1.equals("tr")) {
                    if(ﾞᵢ0.MTH795(s1)) {
                        ﾞᵢ0.MTH761();
                        ﾞᵢ0.MTH766();
                        ﾞᵢ0.FLD258 = ﹳˑ$ˉˈ0;
                        return true;
                    }
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                if(s1.equals("table")) {
                    return ((CLS8)ﾞᵢ0).MTH442("tr") ? ﾞᵢ0.MTH446(יٴ0) : false;
                }
                if(CLS36.MTH852(s1, CLS16.FLD220)) {
                    if(ﾞᵢ0.MTH795(s1) && ﾞᵢ0.MTH795("tr")) {
                        ﾞᵢ0.MTH761();
                        ﾞᵢ0.MTH766();
                        ﾞᵢ0.FLD258 = ﹳˑ$ˉˈ0;
                        return true;
                    }
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                if(CLS36.MTH852(s1, CLS16.FLD200)) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ʾﾞ0));
            }
            return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ʾﾞ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS164 extends CLS17 {
        public CLS164() {
            super("BeforeHtml", 1);
        }

        public final boolean MTH711(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            ﾞᵢ0.getClass();
            CLS192 יٴ1 = new CLS192(((CLS8)ﾞᵢ0).MTH443("html", ﾞᵢ0.FLD38), null, null);
            ﾞᵢ0.MTH774(((CLS57)יٴ1));
            ﾞᵢ0.FLD33.add(יٴ1);
            ﾞᵢ0.FLD258 = CLS17.FLD247;
            return ﾞᵢ0.MTH446(יٴ0);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("html")) {
                ﾞᵢ0.MTH764(((CLS201)יٴ0));
                ﾞᵢ0.FLD258 = CLS17.FLD247;
                return true;
            }
            if(יٴ0.MTH506() && CLS36.MTH852(((CLS199)יٴ0).FLD81, CLS16.FLD203)) {
                return this.MTH711(יٴ0, ﾞᵢ0);
            }
            if(יٴ0.MTH506()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            return this.MTH711(יٴ0, ﾞᵢ0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS165 extends CLS17 {
        public CLS165() {
            super("AfterAfterBody", 21);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(!יٴ0.MTH512() && (!יٴ0.MTH508() || !((CLS201)יٴ0).FLD81.equals("html"))) {
                if(CLS17.MTH753(יٴ0)) {
                    ﾞᵢ0.MTH768(((CLS89)יٴ0));
                    return true;
                }
                if(יٴ0.MTH510()) {
                    return true;
                }
                ﾞᵢ0.MTH776(((CLS17)this));
                ﾞᵢ0.MTH778();
                return ﾞᵢ0.MTH446(יٴ0);
            }
            return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS166 extends CLS17 {
        public CLS166() {
            super("AfterBody", 18);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("html")) {
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
            }
            if(יٴ0.MTH506() && ((CLS199)יٴ0).FLD81.equals("html")) {
                ﾞᵢ0.getClass();
                if(ﾞᵢ0.MTH772("html")) {
                    ﾞᵢ0.MTH770("html");
                }
                ﾞᵢ0.FLD258 = CLS17.FLD238;
                return true;
            }
            if(יٴ0.MTH510()) {
                return true;
            }
            ﾞᵢ0.MTH776(((CLS17)this));
            ﾞᵢ0.MTH778();
            return ﾞᵢ0.MTH446(יٴ0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS167 extends CLS17 {
        public CLS167() {
            super("InTemplate", 17);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            int v = CLS58.MTH1007(יٴ0.FLD87);
            CLS168 ﹳˑ$ـʿ0 = CLS17.FLD248;
            if(v != 0) {
                CLS175 ﹳˑ$ⁱﹳ0 = CLS17.FLD230;
                switch(v) {
                    case 1: {
                        String s = ((CLS201)יٴ0).FLD81;
                        if(CLS36.MTH852(s, CLS16.FLD188)) {
                            ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                            return true;
                        }
                        if(CLS36.MTH852(s, CLS16.FLD191)) {
                            ﾞᵢ0.MTH790();
                            ﾞᵢ0.MTH760(((CLS17)CLS17.FLD237));
                            ﾞᵢ0.FLD258 = CLS17.FLD237;
                            return ﾞᵢ0.MTH446(יٴ0);
                        }
                        if(s.equals("col")) {
                            ﾞᵢ0.MTH790();
                            ﾞᵢ0.MTH760(((CLS17)CLS17.FLD231));
                            ﾞᵢ0.FLD258 = CLS17.FLD231;
                            return ﾞᵢ0.MTH446(יٴ0);
                        }
                        if(s.equals("tr")) {
                            ﾞᵢ0.MTH790();
                            ﾞᵢ0.MTH760(((CLS17)CLS17.FLD226));
                            ﾞᵢ0.FLD258 = CLS17.FLD226;
                            return ﾞᵢ0.MTH446(יٴ0);
                        }
                        if(!s.equals("td") && !s.equals("th")) {
                            ﾞᵢ0.MTH790();
                            ﾞᵢ0.MTH760(((CLS17)ﹳˑ$ـʿ0));
                            ﾞᵢ0.FLD258 = ﹳˑ$ـʿ0;
                            return ﾞᵢ0.MTH446(יٴ0);
                        }
                        ﾞᵢ0.MTH790();
                        ﾞᵢ0.MTH760(((CLS17)CLS17.FLD235));
                        ﾞᵢ0.FLD258 = CLS17.FLD235;
                        return ﾞᵢ0.MTH446(יٴ0);
                    }
                    case 2: {
                        if(((CLS199)יٴ0).FLD81.equals("template")) {
                            ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                            return true;
                        }
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    case 3: 
                    case 4: {
                        break;
                    }
                    case 5: {
                        if(!ﾞᵢ0.MTH772("template")) {
                            return true;
                        }
                        ﾞᵢ0.MTH776(((CLS17)this));
                        ﾞᵢ0.MTH770("template");
                        ﾞᵢ0.MTH779();
                        ﾞᵢ0.MTH790();
                        ﾞᵢ0.MTH759();
                        return ﾞᵢ0.FLD258 == CLS17.FLD241 || ﾞᵢ0.FLD265.size() >= 12 ? true : ﾞᵢ0.MTH446(יٴ0);
                    }
                    default: {
                        return true;
                    }
                }
            }
            ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ـʿ0));
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS168 extends CLS17 {
        public CLS168() {
            super("InBody", 6);
        }

        public final boolean MTH720(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            List list0;
            String s2;
            CLS192 יٴ3;
            int v3;
            CLS192 יٴ2;
            CLS15 ᴵᐧ0;
            יٴ0.getClass();
            String s = ((CLS199)יٴ0).FLD81;
            s.getClass();
            switch(s) {
                case "body": {
                    if(!ﾞᵢ0.MTH781("body", null)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    this.MTH721(יٴ0, ﾞᵢ0);
                    ﾞᵢ0.FLD258 = CLS17.FLD245;
                    return true;
                }
                case "br": {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    ((CLS8)ﾞᵢ0).MTH444("br");
                    return false;
                }
                case "dd": 
                case "dt": {
                    if(!ﾞᵢ0.MTH781(s, null)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    ﾞᵢ0.MTH784(s);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                        goto label_217;
                    }
                    break;
                }
                case "form": {
                    if(!ﾞᵢ0.MTH772("template")) {
                        CLS205 ᐧᴵ0 = ﾞᵢ0.FLD270;
                        ﾞᵢ0.FLD270 = null;
                        if(ᐧᴵ0 != null && ﾞᵢ0.MTH781(s, null)) {
                            ﾞᵢ0.MTH792(false);
                            if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                                ﾞᵢ0.MTH776(((CLS17)this));
                            }
                            ﾞᵢ0.MTH765(((CLS192)ᐧᴵ0));
                            return true;
                        }
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    if(!ﾞᵢ0.MTH781(s, null)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    ﾞᵢ0.MTH792(false);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                    }
                    break;
                }
                case "h1": 
                case "h2": 
                case "h3": 
                case "h4": 
                case "h5": 
                case "h6": {
                    String[] arr_s = CLS16.FLD208;
                    if(!ﾞᵢ0.MTH780(arr_s, CLS181.FLD254, null)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    ﾞᵢ0.MTH784(s);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                    }
                    for(int v14 = ﾞᵢ0.FLD33.size() - 1; v14 >= 0; --v14) {
                        CLS192 יٴ8 = (CLS192)ﾞᵢ0.FLD33.get(v14);
                        ﾞᵢ0.FLD33.remove(v14);
                        if(CLS36.MTH852(יٴ8.FLD388.FLD187, arr_s)) {
                            break;
                        }
                    }
                    return true;
                }
                case "html": {
                    return ((CLS8)ﾞᵢ0).MTH442("body") ? ﾞᵢ0.MTH446(((CLS12)(((CLS199)יٴ0)))) : true;
                }
                case "li": {
                    if(!ﾞᵢ0.MTH781(s, CLS181.FLD255)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    ﾞᵢ0.MTH784(s);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                    label_217:
                        ﾞᵢ0.MTH776(((CLS17)this));
                    }
                    break;
                }
                case "p": {
                    if(!ﾞᵢ0.MTH791(s)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        ((CLS8)ﾞᵢ0).MTH444(s);
                        return ﾞᵢ0.MTH446(((CLS12)(((CLS199)יٴ0))));
                    }
                    ﾞᵢ0.MTH784(s);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                        goto label_217;
                    }
                    break;
                }
                case "sarcasm": {
                    return this.MTH721(יٴ0, ﾞᵢ0);
                label_19:
                    if(CLS36.MTH852(s, CLS16.FLD205)) {
                        String s1 = ((CLS199)יٴ0).FLD81;
                        ArrayList arrayList0 = ﾞᵢ0.FLD33;
                        int v = 0;
                        while(v < 8) {
                            CLS192 יٴ1 = ﾞᵢ0.MTH775(s1);
                            if(יٴ1 == null) {
                                return this.MTH721(יٴ0, ﾞᵢ0);
                            }
                            if(CLS181.MTH771(ﾞᵢ0.FLD33, יٴ1)) {
                                ᴵᐧ0 = יٴ1.FLD388;
                                if(!ﾞᵢ0.MTH781(ᴵᐧ0.FLD187, null)) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    return false;
                                }
                                if(((CLS8)ﾞᵢ0).MTH445() != יٴ1) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                }
                                int v1 = arrayList0.size();
                                יٴ2 = null;
                                int v2 = 1;
                                boolean z = false;
                                v3 = -1;
                                while(true) {
                                    יٴ3 = null;
                                    if(v2 >= v1 || v2 >= 0x40) {
                                        break;
                                    }
                                    יٴ3 = (CLS192)arrayList0.get(v2);
                                    if(יٴ3 == יٴ1) {
                                        יٴ2 = (CLS192)arrayList0.get(v2 - 1);
                                        int v4 = 0;
                                        while(true) {
                                            v3 = -1;
                                            if(v4 < ﾞᵢ0.FLD260.size()) {
                                                if(יٴ3 == ﾞᵢ0.FLD260.get(v4)) {
                                                    v3 = v4;
                                                }
                                                else {
                                                    ++v4;
                                                    continue;
                                                }
                                            }
                                            break;
                                        }
                                        z = true;
                                    }
                                    else if(z && CLS36.MTH852(יٴ3.FLD388.FLD187, CLS181.FLD257)) {
                                        break;
                                    }
                                    ++v2;
                                }
                                if(יٴ3 == null) {
                                    ﾞᵢ0.MTH770(ᴵᐧ0.FLD187);
                                }
                                else {
                                    goto label_65;
                                }
                            }
                            else {
                                ﾞᵢ0.MTH776(((CLS17)this));
                            }
                            ﾞᵢ0.MTH789(יٴ1);
                            return true;
                        label_65:
                            CLS192 יٴ4 = יٴ3;
                            CLS192 יٴ5 = יٴ4;
                            int v5 = v3;
                            int v6 = 0;
                            while(v6 < 3) {
                                if(CLS181.MTH771(ﾞᵢ0.FLD33, יٴ4)) {
                                    יٴ4 = ﾞᵢ0.MTH794(יٴ4);
                                }
                                if(!CLS181.MTH771(ﾞᵢ0.FLD260, יٴ4)) {
                                    ﾞᵢ0.MTH765(יٴ4);
                                    s2 = s1;
                                }
                                else if(יٴ4 == יٴ1) {
                                    break;
                                }
                                else {
                                    s2 = s1;
                                    CLS192 יٴ6 = new CLS192(((CLS8)ﾞᵢ0).MTH443(יٴ4.MTH979(), CLS9.FLD42), ﾞᵢ0.FLD32, null);
                                    ArrayList arrayList1 = ﾞᵢ0.FLD260;
                                    int v7 = arrayList1.lastIndexOf(יٴ4);
                                    CLS39.MTH870(v7 != -1);
                                    arrayList1.set(v7, יٴ6);
                                    ArrayList arrayList2 = ﾞᵢ0.FLD33;
                                    int v8 = arrayList2.lastIndexOf(יٴ4);
                                    CLS39.MTH870(v8 != -1);
                                    arrayList2.set(v8, יٴ6);
                                    if(יٴ5 == יٴ3) {
                                        int v9 = 0;
                                        while(true) {
                                            if(v9 < ﾞᵢ0.FLD260.size()) {
                                                if(יٴ6 == ﾞᵢ0.FLD260.get(v9)) {
                                                    break;
                                                }
                                                else {
                                                    ++v9;
                                                    continue;
                                                }
                                            }
                                            v9 = -1;
                                            break;
                                        }
                                        v5 = v9 + 1;
                                    }
                                    CLS57 ʼˉ0 = יٴ5.FLD373;
                                    if(((CLS192)ʼˉ0) != null) {
                                        CLS39.MTH871(ʼˉ0);
                                        יٴ5.FLD373.MTH966(((CLS57)יٴ5));
                                    }
                                    יٴ6.MTH1056(((CLS57)יٴ5));
                                    יٴ4 = יٴ6;
                                    יٴ5 = יٴ4;
                                }
                                ++v6;
                                s1 = s2;
                            }
                            if(יٴ2 != null) {
                                if(CLS36.MTH852(יٴ2.FLD388.FLD187, CLS16.FLD213)) {
                                    CLS57 ʼˉ1 = יٴ5.FLD373;
                                    if(((CLS192)ʼˉ1) != null) {
                                        CLS39.MTH871(ʼˉ1);
                                        יٴ5.FLD373.MTH966(((CLS57)יٴ5));
                                    }
                                    ﾞᵢ0.MTH785(((CLS57)יٴ5));
                                }
                                else {
                                    CLS57 ʼˉ2 = יٴ5.FLD373;
                                    if(((CLS192)ʼˉ2) != null) {
                                        CLS39.MTH871(ʼˉ2);
                                        יٴ5.FLD373.MTH966(((CLS57)יٴ5));
                                    }
                                    יٴ2.MTH1056(((CLS57)יٴ5));
                                }
                            }
                            CLS192 יٴ7 = new CLS192(ᴵᐧ0, ﾞᵢ0.FLD32, null);
                            CLS64 ﾞᵢ1 = יٴ7.MTH967();
                            CLS64 ﾞᵢ2 = יٴ1.MTH967();
                            ﾞᵢ1.getClass();
                            int v10 = ﾞᵢ2.FLD416;
                            if(v10 != 0) {
                                ﾞᵢ1.MTH1116(ﾞᵢ1.FLD416 + v10);
                                boolean z1 = ﾞᵢ1.FLD416 != 0;
                                int v11 = 0;
                                while(true) {
                                    if(v11 < ﾞᵢ2.FLD416 && CLS64.MTH1110(ﾞᵢ2.FLD418[v11])) {
                                        ++v11;
                                    }
                                    else {
                                        if(v11 >= ﾞᵢ2.FLD416) {
                                            break;
                                        }
                                        CLS61 ٴʼ0 = new CLS61(ﾞᵢ2.FLD418[v11], ((String)ﾞᵢ2.FLD417[v11]), ﾞᵢ2);
                                        ++v11;
                                        if(z1) {
                                            ﾞᵢ1.MTH1112(ٴʼ0);
                                        }
                                        else {
                                            ﾞᵢ1.MTH1111((ٴʼ0.FLD401 == null ? "" : ٴʼ0.FLD401), ٴʼ0.FLD397);
                                        }
                                    }
                                }
                            }
                            if(יٴ3.MTH969() == 0) {
                                list0 = CLS57.FLD374;
                            }
                            else {
                                List list1 = יٴ3.MTH973();
                                ArrayList arrayList3 = new ArrayList(list1.size());
                                arrayList3.addAll(list1);
                                list0 = Collections.unmodifiableList(arrayList3);
                            }
                            if(list0 == null) {
                                throw new CLS37("Children collection to be inserted must not be null.");
                            }
                            int v12 = יٴ7.MTH969();
                            if(v12 < 0 || v12 > v12) {
                                throw new CLS37("Insert position out of bounds.");
                            }
                            ((CLS57)יٴ7).MTH986(v12, ((CLS57[])new ArrayList(list0).toArray(new CLS57[0])));
                            יٴ3.MTH1056(((CLS57)יٴ7));
                            ﾞᵢ0.MTH789(יٴ1);
                            ﾞᵢ0.MTH788(יٴ7);
                            try {
                                ﾞᵢ0.FLD260.add(v5, יٴ7);
                            }
                            catch(IndexOutOfBoundsException unused_ex) {
                                ﾞᵢ0.FLD260.add(יٴ7);
                            }
                            ﾞᵢ0.MTH765(יٴ1);
                            int v13 = ﾞᵢ0.FLD33.lastIndexOf(יٴ3);
                            CLS39.MTH870(v13 != -1);
                            ﾞᵢ0.FLD33.add(v13 + 1, יٴ7);
                            ++v;
                        }
                        return true;
                    }
                    if(!CLS36.MTH852(s, CLS16.FLD221)) {
                        goto label_172;
                    }
                    if(!ﾞᵢ0.MTH781(s, null)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    ﾞᵢ0.MTH792(false);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                        goto label_217;
                    label_172:
                        if(CLS36.MTH852(s, CLS16.FLD201)) {
                            if(ﾞᵢ0.MTH781("name", null)) {
                                return true;
                            }
                            if(!ﾞᵢ0.MTH781(s, null)) {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                return false;
                            }
                            ﾞᵢ0.MTH792(false);
                            if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                                ﾞᵢ0.MTH776(((CLS17)this));
                            }
                            ﾞᵢ0.MTH770(s);
                            ﾞᵢ0.MTH779();
                            return true;
                        }
                        return this.MTH721(יٴ0, ﾞᵢ0);
                    }
                    break;
                }
                case "span": {
                    return this.MTH721(יٴ0, ﾞᵢ0);
                }
                case "template": {
                    ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD230));
                    return true;
                }
                default: {
                    goto label_19;
                }
            }
            ﾞᵢ0.MTH770(s);
            return true;
        }

        public final boolean MTH721(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            יٴ0.getClass();
            String s = ((CLS199)יٴ0).FLD81;
            ArrayList arrayList0 = ﾞᵢ0.FLD33;
            if(ﾞᵢ0.MTH783(s) == null) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                CLS192 יٴ1 = (CLS192)arrayList0.get(v);
                if(יٴ1.FLD388.FLD187.equals(s)) {
                    ﾞᵢ0.MTH784(s);
                    if(!((CLS8)ﾞᵢ0).MTH447(s)) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                    }
                    ﾞᵢ0.MTH770(s);
                    return true;
                }
                if(CLS36.MTH852(יٴ1.FLD388.FLD187, CLS181.FLD257)) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
            }
            return true;
        }

        // 此方法包含解密的字符串
        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            CLS201 יٴ$ﾞˈ1;
            CLS201 יٴ$ﾞˈ3;
            CLS201 יٴ$ﾞˈ4;
            CLS201 יٴ$ﾞˈ2;
            CLS179 ﹳˑ$ﾞـ1;
            int v1;
            int v = CLS58.MTH1007(יٴ0.FLD87);
            if(v != 0) {
                switch(v) {
                    case 1: {
                        String s = ((CLS201)יٴ0).FLD81;
                        s.getClass();
                        CLS201 יٴ$ﾞˈ0 = (CLS201)יٴ0;
                        switch(s) {
                            case "a": {
                                v1 = 10;
                                break;
                            }
                            case "area": {
                                v1 = 36;
                                break;
                            }
                            case "b": {
                                v1 = 11;
                                break;
                            }
                            case "big": {
                                v1 = 30;
                                break;
                            }
                            case "body": {
                                v1 = 37;
                                break;
                            }
                            case "br": {
                                v1 = 15;
                                break;
                            }
                            case "button": {
                                v1 = 1;
                                break;
                            }
                            case "code": {
                                v1 = 38;
                                break;
                            }
                            case "dd": {
                                v1 = 16;
                                break;
                            }
                            case "dt": {
                                v1 = 17;
                                break;
                            }
                            case "em": {
                                v1 = 18;
                                break;
                            }
                            case "embed": {
                                v1 = 45;
                                break;
                            }
                            case "font": {
                                v1 = 39;
                                break;
                            }
                            case "form": {
                                v1 = 40;
                                break;
                            }
                            case "frameset": {
                                v1 = 0;
                                break;
                            }
                            case "h1": {
                                v1 = 19;
                                break;
                            }
                            case "h2": {
                                v1 = 20;
                                break;
                            }
                            case "h3": {
                                v1 = 21;
                                break;
                            }
                            case "h4": {
                                v1 = 22;
                                break;
                            }
                            case "h5": {
                                v1 = 23;
                                break;
                            }
                            case "h6": {
                                v1 = 24;
                                break;
                            }
                            case "hr": {
                                v1 = 25;
                                break;
                            }
                            case "html": {
                                v1 = 41;
                                break;
                            }
                            case "i": {
                                v1 = 12;
                                break;
                            }
                            case "iframe": {
                                v1 = 2;
                                break;
                            }
                            case "image": {
                                v1 = 46;
                                break;
                            }
                            case "img": {
                                v1 = 0x1F;
                                break;
                            }
                            case "input": {
                                v1 = 0x2F;
                                break;
                            }
                            case "isindex": {
                                v1 = 52;
                                break;
                            }
                            case "keygen": {
                                v1 = 3;
                                break;
                            }
                            case "li": {
                                v1 = 26;
                                break;
                            }
                            case "listing": {
                                v1 = 50;
                                break;
                            }
                            case "math": {
                                v1 = 42;
                                break;
                            }
                            case "nobr": {
                                v1 = 43;
                                break;
                            }
                            case "noembed": {
                                v1 = 53;
                                break;
                            }
                            case "optgroup": {
                                v1 = 9;
                                break;
                            }
                            case "option": {
                                v1 = 4;
                                break;
                            }
                            case "plaintext": {
                                v1 = 51;
                                break;
                            }
                            case "pre": {
                                v1 = 0x20;
                                break;
                            }
                            case "rp": {
                                v1 = 27;
                                break;
                            }
                            case "rt": {
                                v1 = 28;
                                break;
                            }
                            case "s": {
                                v1 = 13;
                                break;
                            }
                            case "select": {
                                v1 = 6;
                                break;
                            }
                            case "small": {
                                v1 = 0x30;
                                break;
                            }
                            case "span": {
                                v1 = 44;
                                break;
                            }
                            case "strike": {
                                v1 = 7;
                                break;
                            }
                            case "strong": {
                                v1 = 8;
                                break;
                            }
                            case "svg": {
                                v1 = 33;
                                break;
                            }
                            case "table": {
                                v1 = 49;
                                break;
                            }
                            case "textarea": {
                                v1 = 5;
                                break;
                            }
                            case "tt": {
                                v1 = 29;
                                break;
                            }
                            case "u": {
                                v1 = 14;
                                break;
                            }
                            case "wbr": {
                                v1 = 34;
                                break;
                            }
                            case "xmp": {
                                v1 = 35;
                                break;
                            }
                            default: {
                                v1 = -1;
                            }
                        }
                        String[] arr_s = CLS16.FLD207;
                        String[] arr_s1 = CLS181.FLD257;
                        CLS179 ﹳˑ$ﾞـ0 = CLS17.FLD244;
                        CLS159 ﹳˑ$ʾﾞ0 = CLS17.FLD237;
                        switch(v1) {
                            case 0: {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                ArrayList arrayList0 = ﾞᵢ0.FLD33;
                                if(arrayList0.size() != 1 && (arrayList0.size() <= 2 || ((CLS192)arrayList0.get(1)).FLD388.FLD187.equals("body")) && ﾞᵢ0.FLD253) {
                                    CLS192 יٴ1 = (CLS192)arrayList0.get(1);
                                    CLS57 ʼˉ0 = יٴ1.FLD373;
                                    if(((CLS192)ʼˉ0) != null) {
                                        CLS39.MTH871(ʼˉ0);
                                        יٴ1.FLD373.MTH966(((CLS57)יٴ1));
                                    }
                                    while(arrayList0.size() > 1) {
                                        arrayList0.remove(arrayList0.size() - 1);
                                    }
                                    ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                    ﹳˑ$ﾞـ1 = CLS17.FLD239;
                                    ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ1;
                                    return true;
                                }
                                return false;
                            }
                            case 1: {
                                if(ﾞᵢ0.MTH791("button")) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    ((CLS8)ﾞᵢ0).MTH442("button");
                                    ﾞᵢ0.MTH446(((CLS12)יٴ$ﾞˈ0));
                                    return true;
                                }
                                ﾞᵢ0.MTH763();
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                ﾞᵢ0.FLD253 = false;
                                return true;
                            }
                            case 2: {
                                יٴ$ﾞˈ2 = יٴ$ﾞˈ0;
                                ﾞᵢ0.FLD253 = false;
                                break;
                            }
                            case 5: {
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                if(יٴ$ﾞˈ0.FLD79) {
                                    return true;
                                }
                                ﾞᵢ0.FLD39.MTH465(((CLS14)CLS14.FLD165));
                                ﾞᵢ0.FLD252 = ﾞᵢ0.FLD258;
                                ﾞᵢ0.FLD253 = false;
                                ﹳˑ$ﾞـ1 = ﹳˑ$ﾞـ0;
                                ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ1;
                                return true;
                            }
                            case 6: {
                                ﾞᵢ0.MTH763();
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                ﾞᵢ0.FLD253 = false;
                                if(יٴ$ﾞˈ0.FLD79) {
                                    return true;
                                }
                                CLS17 ﹳˑ0 = ﾞᵢ0.FLD258;
                                if(!ﹳˑ0.equals(ﹳˑ$ʾﾞ0) && !ﹳˑ0.equals(CLS17.FLD243) && !ﹳˑ0.equals(CLS17.FLD226) && !ﹳˑ0.equals(CLS17.FLD235) && !ﹳˑ0.equals(CLS17.FLD242)) {
                                    ﹳˑ$ﾞـ1 = CLS17.FLD246;
                                    ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ1;
                                    return true;
                                }
                                ﹳˑ$ﾞـ1 = CLS17.FLD234;
                                ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ1;
                                return true;
                            }
                            case 4: 
                            case 9: {
                                יٴ$ﾞˈ1 = יٴ$ﾞˈ0;
                                if(((CLS8)ﾞᵢ0).MTH447("option")) {
                                    ((CLS8)ﾞᵢ0).MTH442("option");
                                }
                                ﾞᵢ0.MTH763();
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                return true;
                            }
                            case 10: {
                                יٴ$ﾞˈ3 = יٴ$ﾞˈ0;
                                if(ﾞᵢ0.MTH775("a") != null) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    ((CLS8)ﾞᵢ0).MTH442("a");
                                    CLS192 יٴ2 = ﾞᵢ0.MTH783("a");
                                    if(יٴ2 != null) {
                                        ﾞᵢ0.MTH789(יٴ2);
                                        ﾞᵢ0.MTH765(יٴ2);
                                    }
                                }
                                ﾞᵢ0.MTH763();
                                goto label_354;
                            }
                            case 16: 
                            case 17: {
                                יٴ$ﾞˈ4 = יٴ$ﾞˈ0;
                                ﾞᵢ0.FLD253 = false;
                                ArrayList arrayList1 = ﾞᵢ0.FLD33;
                                int v2 = arrayList1.size() - 1;
                                int v3 = v2 < 24 ? 0 : v2 - 24;
                                while(v2 >= v3) {
                                    CLS192 יٴ3 = (CLS192)arrayList1.get(v2);
                                    boolean z = CLS36.MTH852(יٴ3.FLD388.FLD187, CLS16.FLD216);
                                    CLS15 ᴵᐧ0 = יٴ3.FLD388;
                                    if(z) {
                                        ((CLS8)ﾞᵢ0).MTH442(ᴵᐧ0.FLD187);
                                        break;
                                    }
                                    if(CLS36.MTH852(ᴵᐧ0.FLD187, arr_s1) && !CLS36.MTH852(ᴵᐧ0.FLD187, arr_s)) {
                                        break;
                                    }
                                    --v2;
                                }
                                if(ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                יٴ$ﾞˈ1 = יٴ$ﾞˈ4;
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                return true;
                            }
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 23: 
                            case 24: {
                                יٴ$ﾞˈ4 = יٴ$ﾞˈ0;
                                if(ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                if(CLS36.MTH852(((CLS8)ﾞᵢ0).MTH445().FLD388.FLD187, CLS16.FLD208)) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    ﾞᵢ0.MTH766();
                                }
                                יٴ$ﾞˈ1 = יٴ$ﾞˈ4;
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                return true;
                            }
                            case 25: {
                                if(ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                ﾞᵢ0.MTH782(יٴ$ﾞˈ0);
                                ﾞᵢ0.FLD253 = false;
                                return true;
                            }
                            case 26: {
                                יٴ$ﾞˈ4 = יٴ$ﾞˈ0;
                                ﾞᵢ0.FLD253 = false;
                                ArrayList arrayList2 = ﾞᵢ0.FLD33;
                                for(int v4 = arrayList2.size() - 1; v4 > 0; --v4) {
                                    CLS192 יٴ4 = (CLS192)arrayList2.get(v4);
                                    if(יٴ4.FLD388.FLD187.equals("li")) {
                                        ((CLS8)ﾞᵢ0).MTH442("li");
                                        break;
                                    }
                                    if(CLS36.MTH852(יٴ4.FLD388.FLD187, arr_s1) && !CLS36.MTH852(יٴ4.FLD388.FLD187, arr_s)) {
                                        break;
                                    }
                                }
                                if(ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                יٴ$ﾞˈ1 = יٴ$ﾞˈ4;
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                return true;
                            }
                            case 27: 
                            case 28: {
                                יٴ$ﾞˈ4 = יٴ$ﾞˈ0;
                                if(!ﾞᵢ0.MTH781("ruby", null)) {
                                    return true;
                                }
                                ﾞᵢ0.MTH792(false);
                                if(!((CLS8)ﾞᵢ0).MTH447("ruby")) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    for(int v5 = ﾞᵢ0.FLD33.size() - 1; v5 >= 0 && !((CLS192)ﾞᵢ0.FLD33.get(v5)).FLD388.FLD187.equals("ruby"); --v5) {
                                        ﾞᵢ0.FLD33.remove(v5);
                                    }
                                }
                                יٴ$ﾞˈ1 = יٴ$ﾞˈ4;
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                return true;
                            }
                            case 35: {
                                if(ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                ﾞᵢ0.MTH763();
                                ﾞᵢ0.FLD253 = false;
                                יٴ$ﾞˈ2 = יٴ$ﾞˈ0;
                                break;
                            }
                            case 37: {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                if(ﾞᵢ0.FLD33.size() != 1 && (ﾞᵢ0.FLD33.size() <= 2 || ((CLS192)ﾞᵢ0.FLD33.get(1)).FLD388.FLD187.equals("body")) && !ﾞᵢ0.MTH772("template")) {
                                    ﾞᵢ0.FLD253 = false;
                                    if(!((CLS87)יٴ$ﾞˈ0).MTH482()) {
                                        return true;
                                    }
                                    CLS192 יٴ5 = ﾞᵢ0.MTH783("body");
                                    if(יٴ5 == null) {
                                        return true;
                                    }
                                    CLS64 ﾞᵢ1 = יٴ$ﾞˈ0.FLD74;
                                    ﾞᵢ1.getClass();
                                    int v6 = 0;
                                    while(true) {
                                        if(v6 < ﾞᵢ1.FLD416 && CLS64.MTH1110(ﾞᵢ1.FLD418[v6])) {
                                            ++v6;
                                        }
                                        else {
                                            if(v6 >= ﾞᵢ1.FLD416) {
                                                return true;
                                            }
                                            CLS61 ٴʼ0 = new CLS61(ﾞᵢ1.FLD418[v6], ((String)ﾞᵢ1.FLD417[v6]), ﾞᵢ1);
                                            ++v6;
                                            if(!((CLS57)יٴ5).MTH980(ٴʼ0.FLD397)) {
                                                יٴ5.MTH967().MTH1112(ٴʼ0);
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                            case 40: {
                                if(ﾞᵢ0.FLD270 != null && !ﾞᵢ0.MTH772("template")) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    return false;
                                }
                                if(ﾞᵢ0.MTH791("p")) {
                                    ﾞᵢ0.MTH784("p");
                                    if(!"p".equals(((CLS8)ﾞᵢ0).MTH445().FLD388.FLD187)) {
                                        ﾞᵢ0.MTH776(ﾞᵢ0.FLD258);
                                    }
                                    ﾞᵢ0.MTH770("p");
                                }
                                ﾞᵢ0.MTH769(יٴ$ﾞˈ0, true, true);
                                return true;
                            }
                            case 41: {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                if(!ﾞᵢ0.MTH772("template")) {
                                    if(ﾞᵢ0.FLD33.size() > 0) {
                                        CLS192 יٴ6 = (CLS192)ﾞᵢ0.FLD33.get(0);
                                        if(((CLS87)יٴ$ﾞˈ0).MTH482()) {
                                            CLS64 ﾞᵢ2 = יٴ$ﾞˈ0.FLD74;
                                            ﾞᵢ2.getClass();
                                            int v7 = 0;
                                            while(true) {
                                                if(v7 < ﾞᵢ2.FLD416 && CLS64.MTH1110(ﾞᵢ2.FLD418[v7])) {
                                                    ++v7;
                                                }
                                                else {
                                                    if(v7 >= ﾞᵢ2.FLD416) {
                                                        break;
                                                    }
                                                    CLS61 ٴʼ1 = new CLS61(ﾞᵢ2.FLD418[v7], ((String)ﾞᵢ2.FLD417[v7]), ﾞᵢ2);
                                                    ++v7;
                                                    if(!((CLS57)יٴ6).MTH980(ٴʼ1.FLD397)) {
                                                        יٴ6.MTH967().MTH1112(ٴʼ1);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                                return false;
                            }
                            case 43: {
                                ﾞᵢ0.MTH763();
                                if(ﾞᵢ0.MTH781("nobr", null)) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    ((CLS8)ﾞᵢ0).MTH442("nobr");
                                    יٴ$ﾞˈ3 = יٴ$ﾞˈ0;
                                    ﾞᵢ0.MTH763();
                                }
                                else {
                                    יٴ$ﾞˈ3 = יٴ$ﾞˈ0;
                                }
                            label_354:
                                CLS192 יٴ7 = ﾞᵢ0.MTH764(יٴ$ﾞˈ3);
                                ﾞᵢ0.MTH788(יٴ7);
                                ﾞᵢ0.FLD260.add(יٴ7);
                                return true;
                            }
                            case 33: 
                            case 42: 
                            case 44: {
                                יٴ$ﾞˈ1 = יٴ$ﾞˈ0;
                                ﾞᵢ0.MTH763();
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                return true;
                            }
                            case 3: 
                            case 15: 
                            case 0x1F: 
                            case 34: 
                            case 36: 
                            case 45: {
                                ﾞᵢ0.MTH763();
                                ﾞᵢ0.MTH782(יٴ$ﾞˈ0);
                                ﾞᵢ0.FLD253 = false;
                                return true;
                            }
                            case 46: {
                                if(ﾞᵢ0.MTH783("svg") == null) {
                                    ((CLS87)יٴ$ﾞˈ0).MTH489("img");
                                    return ﾞᵢ0.MTH446(((CLS12)יٴ$ﾞˈ0));
                                }
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                return true;
                            }
                            case 0x2F: {
                                ﾞᵢ0.MTH763();
                                if(!((CLS57)ﾞᵢ0.MTH782(יٴ$ﾞˈ0)).MTH984("type").equalsIgnoreCase("hidden")) {
                                    ﾞᵢ0.FLD253 = false;
                                    return true;
                                }
                                return true;
                            }
                            case 7: 
                            case 8: 
                            case 11: 
                            case 12: 
                            case 13: 
                            case 14: 
                            case 18: 
                            case 29: 
                            case 30: 
                            case 38: 
                            case 39: 
                            case 0x30: {
                                יٴ$ﾞˈ3 = יٴ$ﾞˈ0;
                                ﾞᵢ0.MTH763();
                                goto label_354;
                            }
                            case 49: {
                                if(ﾞᵢ0.FLD31.FLD411 != 2 && ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                ﾞᵢ0.FLD253 = false;
                                ﹳˑ$ﾞـ1 = ﹳˑ$ʾﾞ0;
                                ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ1;
                                return true;
                            }
                            case 0x20: 
                            case 50: {
                                if(ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                ﾞᵢ0.FLD41.MTH535("\n");
                                ﾞᵢ0.FLD253 = false;
                                return true;
                            }
                            case 51: {
                                if(ﾞᵢ0.MTH791("p")) {
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                }
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ0);
                                ﾞᵢ0.FLD39.MTH465(((CLS14)CLS14.FLD168));
                                return true;
                            label_148:
                                יٴ$ﾞˈ1 = יٴ$ﾞˈ0;
                                if(!CLS15.FLD178.containsKey(s)) {
                                    ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                    return true;
                                }
                                if(CLS36.MTH852(s, CLS16.FLD218)) {
                                    if(!ﾞᵢ0.MTH791("p")) {
                                        ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                        return true;
                                    }
                                    ((CLS8)ﾞᵢ0).MTH442("p");
                                    ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                    return true;
                                }
                                if(CLS36.MTH852(s, CLS16.FLD223)) {
                                    return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD230));
                                }
                                if(CLS36.MTH852(s, CLS16.FLD201)) {
                                    ﾞᵢ0.MTH763();
                                    ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                    ﾞᵢ0.FLD260.add(null);
                                    ﾞᵢ0.FLD253 = false;
                                    return true;
                                }
                                if(CLS36.MTH852(s, CLS16.FLD189)) {
                                    ﾞᵢ0.MTH782(יٴ$ﾞˈ1);
                                    return true;
                                }
                                if(CLS36.MTH852(s, CLS16.FLD214)) {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    return false;
                                }
                                ﾞᵢ0.MTH763();
                                ﾞᵢ0.MTH764(יٴ$ﾞˈ1);
                                return true;
                            }
                            case 52: {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                if(ﾞᵢ0.FLD270 == null) {
                                    ((CLS8)ﾞᵢ0).MTH444("form");
                                    if(יٴ$ﾞˈ0.FLD74 != null && יٴ$ﾞˈ0.FLD74.MTH1115("action") != -1) {
                                        CLS205 ᐧᴵ0 = ﾞᵢ0.FLD270;
                                        if(ᐧᴵ0 != null && (יٴ$ﾞˈ0.FLD74 != null && יٴ$ﾞˈ0.FLD74.MTH1115("action") != -1)) {
                                            ((CLS192)ᐧᴵ0).MTH967().MTH1109("action", "");
                                        }
                                    }
                                    ((CLS8)ﾞᵢ0).MTH444("hr");
                                    ((CLS8)ﾞᵢ0).MTH444("label");
                                    boolean z1 = יٴ$ﾞˈ0.FLD74 != null && יٴ$ﾞˈ0.FLD74.MTH1115("prompt") != -1;
                                    CLS89 יٴ$ﾞᵢ0 = new CLS89();
                                    יٴ$ﾞᵢ0.FLD86 = z1 ? "" : "This is a searchable index. Enter search keywords: ";
                                    ﾞᵢ0.MTH446(((CLS12)יٴ$ﾞᵢ0));
                                    CLS64 ﾞᵢ3 = new CLS64();
                                    if(((CLS87)יٴ$ﾞˈ0).MTH482()) {
                                        CLS64 ﾞᵢ4 = יٴ$ﾞˈ0.FLD74;
                                        ﾞᵢ4.getClass();
                                        int v8 = 0;
                                        while(true) {
                                            if(v8 < ﾞᵢ4.FLD416 && CLS64.MTH1110(ﾞᵢ4.FLD418[v8])) {
                                                ++v8;
                                            }
                                            else {
                                                if(v8 >= ﾞᵢ4.FLD416) {
                                                    break;
                                                }
                                                CLS61 ٴʼ2 = new CLS61(ﾞᵢ4.FLD418[v8], ((String)ﾞᵢ4.FLD417[v8]), ﾞᵢ4);
                                                ++v8;
                                                if(!CLS36.MTH852(ٴʼ2.FLD397, CLS16.FLD206)) {
                                                    ﾞᵢ3.MTH1112(ٴʼ2);
                                                }
                                            }
                                        }
                                    }
                                    ﾞᵢ3.MTH1109("name", "isindex");
                                    CLS201 יٴ$ﾞˈ5 = ﾞᵢ0.FLD34;
                                    if(ﾞᵢ0.FLD40 == יٴ$ﾞˈ5) {
                                        CLS201 יٴ$ﾞˈ6 = new CLS201();
                                        יٴ$ﾞˈ6.FLD83 = "input";
                                        יٴ$ﾞˈ6.FLD74 = ﾞᵢ3;
                                        יٴ$ﾞˈ6.FLD81 = "input";
                                        ﾞᵢ0.MTH446(((CLS12)יٴ$ﾞˈ6));
                                    }
                                    else {
                                        יٴ$ﾞˈ5.MTH485();
                                        יٴ$ﾞˈ5.FLD83 = "input";
                                        יٴ$ﾞˈ5.FLD74 = ﾞᵢ3;
                                        יٴ$ﾞˈ5.FLD81 = "input";
                                        ﾞᵢ0.MTH446(((CLS12)יٴ$ﾞˈ5));
                                    }
                                    ((CLS8)ﾞᵢ0).MTH442("label");
                                    ((CLS8)ﾞᵢ0).MTH444("hr");
                                    ((CLS8)ﾞᵢ0).MTH442("form");
                                    return true;
                                }
                                return false;
                            }
                            case 53: {
                                יٴ$ﾞˈ2 = יٴ$ﾞˈ0;
                                break;
                            }
                            default: {
                                goto label_148;
                            }
                        }
                        ﾞᵢ0.FLD39.MTH465(((CLS14)CLS14.FLD128));
                        ﾞᵢ0.FLD252 = ﾞᵢ0.FLD258;
                        ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ0;
                        ﾞᵢ0.MTH764(יٴ$ﾞˈ2);
                        return true;
                    }
                    case 2: {
                        return this.MTH720(יٴ0, ﾞᵢ0);
                    }
                    case 3: {
                        ﾞᵢ0.MTH787(((CLS88)יٴ0));
                        return true;
                    }
                    case 4: {
                        if(((CLS89)יٴ0).FLD86.equals("\u0000")) {
                            ﾞᵢ0.MTH776(((CLS17)this));
                            return false;
                        }
                        if(ﾞᵢ0.FLD253 && CLS17.MTH753(((CLS12)(((CLS89)יٴ0))))) {
                            ﾞᵢ0.MTH763();
                            ﾞᵢ0.MTH768(((CLS89)יٴ0));
                            return true;
                        }
                        ﾞᵢ0.MTH763();
                        ﾞᵢ0.MTH768(((CLS89)יٴ0));
                        ﾞᵢ0.FLD253 = false;
                        return true;
                    }
                    case 5: {
                        return ﾞᵢ0.FLD265.size() <= 0 ? true : ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD241));
                    }
                    default: {
                        return true;
                    }
                }
            }
            ﾞᵢ0.MTH776(((CLS17)this));
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS169 extends CLS17 {
        public CLS169() {
            super("InHeadNoscript", 4);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return true;
            }
            if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("html")) {
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
            }
            CLS175 ﹳˑ$ⁱﹳ0 = CLS17.FLD230;
            if(יٴ0.MTH506() && ((CLS199)יٴ0).FLD81.equals("noscript")) {
                ﾞᵢ0.MTH766();
                ﾞᵢ0.FLD258 = ﹳˑ$ⁱﹳ0;
                return true;
            }
            if(!CLS17.MTH753(יٴ0) && !יٴ0.MTH509() && (!יٴ0.MTH508() || !CLS36.MTH852(((CLS201)יٴ0).FLD81, CLS16.FLD202))) {
                if(יٴ0.MTH506() && ((CLS199)יٴ0).FLD81.equals("br")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    CLS89 יٴ$ﾞᵢ0 = new CLS89();
                    יٴ$ﾞᵢ0.FLD86 = יٴ0.toString();
                    ﾞᵢ0.MTH768(יٴ$ﾞᵢ0);
                    return true;
                }
                if(יٴ0.MTH508() && CLS36.MTH852(((CLS201)יٴ0).FLD81, CLS16.FLD219) || יٴ0.MTH506()) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                ﾞᵢ0.MTH776(((CLS17)this));
                CLS89 יٴ$ﾞᵢ1 = new CLS89();
                יٴ$ﾞᵢ1.FLD86 = יٴ0.toString();
                ﾞᵢ0.MTH768(יٴ$ﾞᵢ1);
                return true;
            }
            return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS170 extends CLS17 {
        public CLS170() {
            super("InTableText", 9);
        }

        // 此方法包含解密的字符串
        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(יٴ0.FLD87 == 5) {
                if(((CLS89)יٴ0).FLD86.equals("\u0000")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                ﾞᵢ0.FLD269.add(((CLS89)יٴ0).FLD86);
                return true;
            }
            if(ﾞᵢ0.FLD269.size() > 0) {
                for(Object object0: ﾞᵢ0.FLD269) {
                    String s = (String)object0;
                    if(CLS36.MTH851(s)) {
                        CLS89 יٴ$ﾞᵢ2 = new CLS89();
                        יٴ$ﾞᵢ2.FLD86 = s;
                        ﾞᵢ0.MTH768(יٴ$ﾞᵢ2);
                    }
                    else {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        boolean z = CLS36.MTH852(((CLS8)ﾞᵢ0).MTH445().FLD388.FLD187, CLS16.FLD212);
                        CLS168 ﹳˑ$ـʿ0 = CLS17.FLD248;
                        if(z) {
                            ﾞᵢ0.FLD262 = true;
                            CLS89 יٴ$ﾞᵢ0 = new CLS89();
                            יٴ$ﾞᵢ0.FLD86 = s;
                            ﾞᵢ0.MTH767(((CLS12)יٴ$ﾞᵢ0), ((CLS17)ﹳˑ$ـʿ0));
                            ﾞᵢ0.FLD262 = false;
                        }
                        else {
                            CLS89 יٴ$ﾞᵢ1 = new CLS89();
                            יٴ$ﾞᵢ1.FLD86 = s;
                            ﾞᵢ0.MTH767(((CLS12)יٴ$ﾞᵢ1), ((CLS17)ﹳˑ$ـʿ0));
                        }
                    }
                }
                ﾞᵢ0.FLD269 = new ArrayList();
            }
            ﾞᵢ0.FLD258 = ﾞᵢ0.FLD252;
            return ﾞᵢ0.MTH446(יٴ0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS171 extends CLS17 {
        public CLS171() {
            super("BeforeHead", 2);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(יٴ0.MTH512()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("html")) {
                return CLS17.FLD248.MTH754(יٴ0, ﾞᵢ0);
            }
            if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("head")) {
                ﾞᵢ0.FLD266 = ﾞᵢ0.MTH764(((CLS201)יٴ0));
                ﾞᵢ0.FLD258 = CLS17.FLD230;
                return true;
            }
            if(יٴ0.MTH506() && CLS36.MTH852(((CLS199)יٴ0).FLD81, CLS16.FLD203)) {
                ((CLS8)ﾞᵢ0).MTH444("head");
                return ﾞᵢ0.MTH446(יٴ0);
            }
            if(יٴ0.MTH506()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            ((CLS8)ﾞᵢ0).MTH444("head");
            return ﾞᵢ0.MTH446(יٴ0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS172 extends CLS17 {
        public CLS172() {
            super("AfterAfterFrameset", 22);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            if(!יٴ0.MTH512() && !CLS17.MTH753(יٴ0) && (!יٴ0.MTH508() || !((CLS201)יٴ0).FLD81.equals("html"))) {
                if(יٴ0.MTH510()) {
                    return true;
                }
                if(יٴ0.MTH508() && ((CLS201)יٴ0).FLD81.equals("noframes")) {
                    return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD230));
                }
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS173 extends CLS17 {
        public CLS173() {
            super("Initial", 0);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(CLS17.MTH753(יٴ0)) {
                return true;
            }
            if(יٴ0.MTH509()) {
                ﾞᵢ0.MTH787(((CLS88)יٴ0));
                return true;
            }
            CLS164 ﹳˑ$ˏˆ0 = CLS17.FLD250;
            if(יٴ0.MTH512()) {
                CLS9 ˋˈ0 = ﾞᵢ0.FLD38;
                ˋˈ0.getClass();
                String s = ((CLS85)יٴ0).FLD72.toString().trim();
                if(!ˋˈ0.FLD43) {
                    s = CLS1.MTH398(s);
                }
                CLS206 ᴵᐧ0 = new CLS206(s, ((CLS85)יٴ0).FLD68.toString(), ((CLS85)יٴ0).FLD70.toString());
                String s1 = ((CLS85)יٴ0).FLD71;
                if(s1 != null) {
                    ((CLS190)ᴵᐧ0).MTH1005("pubSysKey", s1);
                }
                ((CLS192)ﾞᵢ0.FLD31).MTH1056(((CLS57)ᴵᐧ0));
                if(((CLS85)יٴ0).FLD69) {
                    ﾞᵢ0.FLD31.FLD411 = 2;
                }
                ﾞᵢ0.FLD258 = ﹳˑ$ˏˆ0;
                return true;
            }
            ﾞᵢ0.FLD258 = ﹳˑ$ˏˆ0;
            return ﾞᵢ0.MTH446(יٴ0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS174 extends CLS17 {
        public CLS174() {
            super("InSelectInTable", 16);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            String[] arr_s = CLS16.FLD193;
            if(יٴ0.MTH508() && CLS36.MTH852(((CLS201)יٴ0).FLD81, arr_s)) {
                ﾞᵢ0.MTH776(((CLS17)this));
                ﾞᵢ0.MTH770("select");
                ﾞᵢ0.MTH759();
                return ﾞᵢ0.MTH446(יٴ0);
            }
            if(יٴ0.MTH506() && CLS36.MTH852(((CLS199)יٴ0).FLD81, arr_s)) {
                ﾞᵢ0.MTH776(((CLS17)this));
                if(ﾞᵢ0.MTH795(((CLS199)יٴ0).FLD81)) {
                    ﾞᵢ0.MTH770("select");
                    ﾞᵢ0.MTH759();
                    return ﾞᵢ0.MTH446(יٴ0);
                }
                return false;
            }
            return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD246));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS175 extends CLS17 {
        public CLS175() {
            super("InHead", 3);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            CLS158 ﹳˑ$ʼˎ0;
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            switch(CLS58.MTH1007(יٴ0.FLD87)) {
                case 0: {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                case 1: {
                    String s = ((CLS201)יٴ0).FLD81;
                    if(s.equals("html")) {
                        return CLS17.FLD248.MTH754(יٴ0, ﾞᵢ0);
                    }
                    if(CLS36.MTH852(s, CLS16.FLD211)) {
                        CLS192 יٴ1 = ﾞᵢ0.MTH782(((CLS201)יٴ0));
                        if(!s.equals("base") || !((CLS57)יٴ1).MTH980("href") || ﾞᵢ0.FLD261) {
                            return true;
                        }
                        String s1 = ((CLS57)יٴ1).MTH977("href");
                        if(s1.length() == 0) {
                            return true;
                        }
                        ﾞᵢ0.FLD32 = s1;
                        ﾞᵢ0.FLD261 = true;
                        CLS207 ﾞˈ0 = ﾞᵢ0.FLD31;
                        ﾞˈ0.getClass();
                        ((CLS192)ﾞˈ0).MTH1052(s1);
                        return true;
                    }
                    if(s.equals("meta")) {
                        ﾞᵢ0.MTH782(((CLS201)יٴ0));
                        return true;
                    }
                    CLS179 ﹳˑ$ﾞـ0 = CLS17.FLD244;
                    if(s.equals("title")) {
                        ﾞᵢ0.FLD39.MTH465(((CLS14)CLS14.FLD165));
                        ﾞᵢ0.FLD252 = ﾞᵢ0.FLD258;
                        ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ0;
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        return true;
                    }
                    if(CLS36.MTH852(s, CLS16.FLD225)) {
                        ﾞᵢ0.FLD39.MTH465(((CLS14)CLS14.FLD128));
                        ﾞᵢ0.FLD252 = ﾞᵢ0.FLD258;
                        ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ0;
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        return true;
                    }
                    if(s.equals("noscript")) {
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        ﹳˑ$ʼˎ0 = CLS17.FLD233;
                        ﾞᵢ0.FLD258 = ﹳˑ$ʼˎ0;
                        return true;
                    }
                    if(s.equals("script")) {
                        ﾞᵢ0.FLD39.MTH465(((CLS14)CLS14.FLD127));
                        ﾞᵢ0.FLD252 = ﾞᵢ0.FLD258;
                        ﾞᵢ0.FLD258 = ﹳˑ$ﾞـ0;
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        return true;
                    }
                    if(s.equals("head")) {
                        ﾞᵢ0.MTH776(((CLS17)this));
                        return false;
                    }
                    if(s.equals("template")) {
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        ﾞᵢ0.FLD260.add(null);
                        ﾞᵢ0.FLD253 = false;
                        ﾞᵢ0.FLD258 = CLS17.FLD241;
                        ﾞᵢ0.MTH760(((CLS17)CLS17.FLD241));
                        return true;
                    }
                    ((CLS8)ﾞᵢ0).MTH442("head");
                    return ﾞᵢ0.MTH446(יٴ0);
                }
                case 2: {
                    String s2 = ((CLS199)יٴ0).FLD81;
                    if(s2.equals("head")) {
                        ﾞᵢ0.MTH766();
                        ﹳˑ$ʼˎ0 = CLS17.FLD232;
                        ﾞᵢ0.FLD258 = ﹳˑ$ʼˎ0;
                        return true;
                    }
                    if(CLS36.MTH852(s2, CLS16.FLD222)) {
                        ((CLS8)ﾞᵢ0).MTH442("head");
                        return ﾞᵢ0.MTH446(יٴ0);
                    }
                    if(s2.equals("template")) {
                        if(!ﾞᵢ0.MTH772(s2)) {
                            ﾞᵢ0.MTH776(((CLS17)this));
                            return true;
                        }
                        ﾞᵢ0.MTH792(true);
                        if(!s2.equals(((CLS8)ﾞᵢ0).MTH445().FLD388.FLD187)) {
                            ﾞᵢ0.MTH776(((CLS17)this));
                        }
                        ﾞᵢ0.MTH770(s2);
                        ﾞᵢ0.MTH779();
                        ﾞᵢ0.MTH790();
                        ﾞᵢ0.MTH759();
                        return true;
                    }
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                case 3: {
                    ﾞᵢ0.MTH787(((CLS88)יٴ0));
                    return true;
                }
                default: {
                    ((CLS8)ﾞᵢ0).MTH442("head");
                    return ﾞᵢ0.MTH446(יٴ0);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS176 extends CLS17 {
        public CLS176() {
            super("ForeignContent", 23);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS177 extends CLS17 {
        public CLS177() {
            super("InColumnGroup", 11);
        }

        public final boolean MTH740(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(!((CLS8)ﾞᵢ0).MTH447("colgroup")) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            ﾞᵢ0.MTH766();
            ﾞᵢ0.FLD258 = CLS17.FLD237;
            ﾞᵢ0.MTH446(יٴ0);
            return true;
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(CLS17.MTH753(יٴ0)) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            int v = CLS58.MTH1007(יٴ0.FLD87);
            if(v != 0) {
                CLS175 ﹳˑ$ⁱﹳ0 = CLS17.FLD230;
            alab1:
                switch(v) {
                    case 1: {
                        String s = ((CLS201)יٴ0).FLD81;
                        s.getClass();
                        switch(s) {
                            case "col": {
                                ﾞᵢ0.MTH782(((CLS201)יٴ0));
                                return true;
                            }
                            case "html": {
                                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
                            }
                            case "template": {
                                break alab1;
                            }
                            default: {
                                return this.MTH740(יٴ0, ﾞᵢ0);
                            }
                        }
                    }
                    case 2: {
                        String s1 = ((CLS199)יٴ0).FLD81;
                        s1.getClass();
                        if(!s1.equals("template")) {
                            if(!s1.equals("colgroup")) {
                                return this.MTH740(יٴ0, ﾞᵢ0);
                            }
                            if(!((CLS8)ﾞᵢ0).MTH447(s1)) {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                return false;
                            }
                            ﾞᵢ0.MTH766();
                            ﾞᵢ0.FLD258 = CLS17.FLD237;
                            return true;
                        }
                        break;
                    }
                    case 3: {
                        ﾞᵢ0.MTH787(((CLS88)יٴ0));
                        return true;
                    }
                    case 5: {
                        return ((CLS8)ﾞᵢ0).MTH447("html") ? true : this.MTH740(יٴ0, ﾞᵢ0);
                    }
                    default: {
                        return this.MTH740(יٴ0, ﾞᵢ0);
                    }
                }
                ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                return true;
            }
            ﾞᵢ0.MTH776(((CLS17)this));
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS178 extends CLS17 {
        public CLS178() {
            super("InSelect", 15);
        }

        // 此方法包含解密的字符串
        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            int v = CLS58.MTH1007(יٴ0.FLD87);
            if(v != 0) {
                CLS175 ﹳˑ$ⁱﹳ0 = CLS17.FLD230;
                if(v != 1) {
                    switch(v) {
                        case 2: {
                            String s = ((CLS199)יٴ0).FLD81;
                            s.getClass();
                            switch(s) {
                                case "optgroup": {
                                    if(((CLS8)ﾞᵢ0).MTH447("option") && ﾞᵢ0.MTH794(((CLS8)ﾞᵢ0).MTH445()) != null && ﾞᵢ0.MTH794(((CLS8)ﾞᵢ0).MTH445()).FLD388.FLD187.equals("optgroup")) {
                                        ((CLS8)ﾞᵢ0).MTH442("option");
                                    }
                                    if(((CLS8)ﾞᵢ0).MTH447("optgroup")) {
                                        break;
                                    }
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    return true;
                                }
                                case "option": {
                                    if(!((CLS8)ﾞᵢ0).MTH447("option")) {
                                        ﾞᵢ0.MTH776(((CLS17)this));
                                        return true;
                                    }
                                    break;
                                }
                                case "select": {
                                    if(!ﾞᵢ0.MTH762(s)) {
                                        ﾞᵢ0.MTH776(((CLS17)this));
                                        return false;
                                    }
                                    ﾞᵢ0.MTH770(s);
                                    ﾞᵢ0.MTH759();
                                    return true;
                                }
                                case "template": {
                                    return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
                                }
                                default: {
                                    ﾞᵢ0.MTH776(((CLS17)this));
                                    return false;
                                }
                            }
                            ﾞᵢ0.MTH766();
                            return true;
                        }
                        case 3: {
                            ﾞᵢ0.MTH787(((CLS88)יٴ0));
                            return true;
                        }
                        case 4: {
                            if(((CLS89)יٴ0).FLD86.equals("\u0000")) {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                return false;
                            }
                            ﾞᵢ0.MTH768(((CLS89)יٴ0));
                            return true;
                        }
                        case 5: {
                            if(!((CLS8)ﾞᵢ0).MTH447("html")) {
                                ﾞᵢ0.MTH776(((CLS17)this));
                                return true;
                            }
                            return true;
                        }
                        default: {
                            ﾞᵢ0.MTH776(((CLS17)this));
                            return false;
                        }
                    }
                }
                String s1 = ((CLS201)יٴ0).FLD81;
                if(s1.equals("html")) {
                    return ﾞᵢ0.MTH767(((CLS12)(((CLS201)יٴ0))), ((CLS17)CLS17.FLD248));
                }
                boolean z = false;
                if(s1.equals("option")) {
                    z = true;
                    if(!((CLS8)ﾞᵢ0).MTH447("option")) {
                        ﾞᵢ0.MTH764(((CLS201)יٴ0));
                        return true;
                    }
                    ((CLS8)ﾞᵢ0).MTH442("option");
                }
                else if(s1.equals("optgroup")) {
                    z = true;
                    if(((CLS8)ﾞᵢ0).MTH447("option")) {
                        ((CLS8)ﾞᵢ0).MTH442("option");
                    }
                    if(((CLS8)ﾞᵢ0).MTH447("optgroup")) {
                        ((CLS8)ﾞᵢ0).MTH442("optgroup");
                    }
                }
                if(z) {
                    ﾞᵢ0.MTH764(((CLS201)יٴ0));
                    return true;
                }
                if(s1.equals("select")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return ((CLS8)ﾞᵢ0).MTH442("select");
                }
                if(CLS36.MTH852(s1, CLS16.FLD199)) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    if(!ﾞᵢ0.MTH762("select")) {
                        return false;
                    }
                    ((CLS8)ﾞᵢ0).MTH442("select");
                    return ﾞᵢ0.MTH446(((CLS12)(((CLS201)יٴ0))));
                }
                if(!s1.equals("script") && !s1.equals("template")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                return ﾞᵢ0.MTH767(יٴ0, ((CLS17)ﹳˑ$ⁱﹳ0));
            }
            ﾞᵢ0.MTH776(((CLS17)this));
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS179 extends CLS17 {
        public CLS179() {
            super("Text", 7);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(יٴ0.FLD87 == 5) {
                ﾞᵢ0.MTH768(((CLS89)יٴ0));
                return true;
            }
            if(יٴ0.MTH510()) {
                ﾞᵢ0.MTH776(((CLS17)this));
                ﾞᵢ0.MTH766();
                ﾞᵢ0.FLD258 = ﾞᵢ0.FLD252;
                return ﾞᵢ0.MTH446(יٴ0);
            }
            if(יٴ0.MTH506()) {
                ﾞᵢ0.MTH766();
                ﾞᵢ0.FLD258 = ﾞᵢ0.FLD252;
            }
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS180 extends CLS17 {
        public CLS180() {
            super("InCaption", 10);
        }

        @Override  // p.pkg3.CLS17
        public final boolean MTH754(CLS12 יٴ0, CLS181 ﾞᵢ0) {
            if(יٴ0.MTH506() && ((CLS199)יٴ0).FLD81.equals("caption")) {
                if(!ﾞᵢ0.MTH795(((CLS199)יٴ0).FLD81)) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                    return false;
                }
                ﾞᵢ0.MTH792(false);
                if(!((CLS8)ﾞᵢ0).MTH447("caption")) {
                    ﾞᵢ0.MTH776(((CLS17)this));
                }
                ﾞᵢ0.MTH770("caption");
                ﾞᵢ0.MTH779();
                ﾞᵢ0.FLD258 = CLS17.FLD237;
                return true;
            }
            if(יٴ0.MTH508() && CLS36.MTH852(((CLS201)יٴ0).FLD81, CLS16.FLD195) || יٴ0.MTH506() && ((CLS199)יٴ0).FLD81.equals("table")) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return ((CLS8)ﾞᵢ0).MTH442("caption") ? ﾞᵢ0.MTH446(יٴ0) : true;
            }
            if(יٴ0.MTH506() && CLS36.MTH852(((CLS199)יٴ0).FLD81, CLS16.FLD194)) {
                ﾞᵢ0.MTH776(((CLS17)this));
                return false;
            }
            return ﾞᵢ0.MTH767(יٴ0, ((CLS17)CLS17.FLD248));
        }
    }

    public static CLS160 FLD226;
    public static CLS157 FLD227;
    public static String FLD228;
    public static CLS17[] FLD229;
    public static CLS175 FLD230;
    public static CLS177 FLD231;
    public static CLS158 FLD232;
    public static CLS169 FLD233;
    public static CLS174 FLD234;
    public static CLS163 FLD235;
    public static CLS170 FLD236;
    public static CLS159 FLD237;
    public static CLS165 FLD238;
    public static CLS161 FLD239;
    public static CLS173 FLD240;
    public static CLS167 FLD241;
    public static CLS162 FLD242;
    public static CLS180 FLD243;
    public static CLS179 FLD244;
    public static CLS166 FLD245;
    public static CLS178 FLD246;
    public static CLS171 FLD247;
    public static CLS168 FLD248;
    public static CLS172 FLD249;
    public static CLS164 FLD250;

    static {
        CLS173 ﹳˑ$ᐧᴵ0 = new CLS173();
        CLS17.FLD240 = ﹳˑ$ᐧᴵ0;
        CLS164 ﹳˑ$ˏˆ0 = new CLS164();
        CLS17.FLD250 = ﹳˑ$ˏˆ0;
        CLS171 ﹳˑ$ٴˉ0 = new CLS171();
        CLS17.FLD247 = ﹳˑ$ٴˉ0;
        CLS175 ﹳˑ$ⁱﹳ0 = new CLS175();
        CLS17.FLD230 = ﹳˑ$ⁱﹳ0;
        CLS169 ﹳˑ$ـᐧ0 = new CLS169();
        CLS17.FLD233 = ﹳˑ$ـᐧ0;
        CLS158 ﹳˑ$ʼˎ0 = new CLS158();
        CLS17.FLD232 = ﹳˑ$ʼˎ0;
        CLS168 ﹳˑ$ـʿ0 = new CLS168();
        CLS17.FLD248 = ﹳˑ$ـʿ0;
        CLS179 ﹳˑ$ﾞـ0 = new CLS179();
        CLS17.FLD244 = ﹳˑ$ﾞـ0;
        CLS159 ﹳˑ$ʾﾞ0 = new CLS159();
        CLS17.FLD237 = ﹳˑ$ʾﾞ0;
        CLS170 ﹳˑ$ٴʼ0 = new CLS170();
        CLS17.FLD236 = ﹳˑ$ٴʼ0;
        CLS180 ﹳˑ$ﾞᵢ0 = new CLS180();
        CLS17.FLD243 = ﹳˑ$ﾞᵢ0;
        CLS177 ﹳˑ$ﹳˑ0 = new CLS177();
        CLS17.FLD231 = ﹳˑ$ﹳˑ0;
        CLS160 ﹳˑ$ˉˈ0 = new CLS160();
        CLS17.FLD226 = ﹳˑ$ˉˈ0;
        CLS163 ﹳˑ$ˎᵔ0 = new CLS163();
        CLS17.FLD235 = ﹳˑ$ˎᵔ0;
        CLS162 ﹳˑ$ˋˈ0 = new CLS162();
        CLS17.FLD242 = ﹳˑ$ˋˈ0;
        CLS178 ﹳˑ$ﾞˈ0 = new CLS178();
        CLS17.FLD246 = ﹳˑ$ﾞˈ0;
        CLS174 ﹳˑ$ᴵᐧ0 = new CLS174();
        CLS17.FLD234 = ﹳˑ$ᴵᐧ0;
        CLS167 ﹳˑ$יٴ0 = new CLS167();
        CLS17.FLD241 = ﹳˑ$יٴ0;
        CLS166 ﹳˑ$ˑᵎ0 = new CLS166();
        CLS17.FLD245 = ﹳˑ$ˑᵎ0;
        CLS161 ﹳˑ$ˊᴵ0 = new CLS161();
        CLS17.FLD239 = ﹳˑ$ˊᴵ0;
        CLS157 ﹳˑ$ʼˉ0 = new CLS157();
        CLS17.FLD227 = ﹳˑ$ʼˉ0;
        CLS165 ﹳˑ$ˏﹳ0 = new CLS165();
        CLS17.FLD238 = ﹳˑ$ˏﹳ0;
        CLS172 ﹳˑ$ٴﹶ0 = new CLS172();
        CLS17.FLD249 = ﹳˑ$ٴﹶ0;
        CLS17.FLD229 = new CLS17[]{ﹳˑ$ᐧᴵ0, ﹳˑ$ˏˆ0, ﹳˑ$ٴˉ0, ﹳˑ$ⁱﹳ0, ﹳˑ$ـᐧ0, ﹳˑ$ʼˎ0, ﹳˑ$ـʿ0, ﹳˑ$ﾞـ0, ﹳˑ$ʾﾞ0, ﹳˑ$ٴʼ0, ﹳˑ$ﾞᵢ0, ﹳˑ$ﹳˑ0, ﹳˑ$ˉˈ0, ﹳˑ$ˎᵔ0, ﹳˑ$ˋˈ0, ﹳˑ$ﾞˈ0, ﹳˑ$ᴵᐧ0, ﹳˑ$יٴ0, ﹳˑ$ˑᵎ0, ﹳˑ$ˊᴵ0, ﹳˑ$ʼˉ0, ﹳˑ$ˏﹳ0, ﹳˑ$ٴﹶ0, new CLS176()};
        CLS17.FLD228 = "\u0000";
    }

    public CLS17() {
        throw null;
    }

    public CLS17(String s, int v) {
        super(s, v);
    }

    public static CLS17 valueOf(String s) {
        return (CLS17)Enum.valueOf(CLS17.class, s);
    }

    public static CLS17[] values() {
        return (CLS17[])CLS17.FLD229.clone();
    }

    // 去混淆评级： 低(30)
    public static boolean MTH753(CLS12 יٴ0) {
        return יٴ0.FLD87 == 5 ? false : CLS36.MTH851(((CLS89)יٴ0).FLD86);
    }

    public abstract boolean MTH754(CLS12 arg1, CLS181 arg2);
}

