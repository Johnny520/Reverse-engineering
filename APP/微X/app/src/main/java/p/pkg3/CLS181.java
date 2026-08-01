// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import p.pkg6.CLS36;
import p.pkg7.CLS37;
import p.pkg7.CLS39;
import p.pkg9.CLS192;
import p.pkg9.CLS202;
import p.pkg9.CLS203;
import p.pkg9.CLS204;
import p.pkg9.CLS205;
import p.pkg9.CLS207;
import p.pkg9.CLS208;
import p.pkg9.CLS57;
import p.pkg9.CLS64;

public final class CLS181 extends CLS8 {
    public CLS17 FLD252;
    public boolean FLD253;
    public static final String[] FLD254;
    public static final String[] FLD255;
    public static final String[] FLD256;
    public static final String[] FLD257;
    public CLS17 FLD258;
    public static final String[] FLD259;
    public ArrayList FLD260;
    public boolean FLD261;
    public boolean FLD262;
    public CLS199 FLD263;
    public static final String[] FLD264;
    public ArrayList FLD265;
    @Nullable
    public CLS192 FLD266;
    public static final String[] FLD267;
    public static final String[] FLD268;
    public ArrayList FLD269;
    @Nullable
    public CLS205 FLD270;
    public final String[] FLD271;

    static {
        CLS181.FLD254 = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
        CLS181.FLD255 = new String[]{"ol", "ul"};
        CLS181.FLD268 = new String[]{"button"};
        CLS181.FLD264 = new String[]{"html", "table"};
        CLS181.FLD256 = new String[]{"optgroup", "option"};
        CLS181.FLD267 = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
        CLS181.FLD259 = new String[]{"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        CLS181.FLD257 = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    }

    public CLS181() {
        this.FLD271 = new String[]{null};
    }

    @Override
    public final String toString() {
        return "TreeBuilder{currentToken=" + this.FLD40 + ", state=" + this.FLD258 + ", currentElement=" + ((CLS8)this).MTH445() + '}';
    }

    // This method was un-flattened
    public final boolean MTH759() {
        CLS161 ﹳˑ$ˊᴵ0;
        int v = this.FLD33.size() - 1;
        int v1 = v < 0x100 ? 0 : v - 0x100;
        CLS17 ﹳˑ0 = this.FLD258;
        if(this.FLD33.size() == 0) {
            this.FLD258 = CLS17.FLD248;
        }
        boolean z = false;
        while(v >= v1) {
            CLS192 יٴ0 = (CLS192)this.FLD33.get(v);
            if(v == v1) {
                z = true;
            }
            String s = יٴ0 == null ? "" : יٴ0.FLD388.FLD187;
            s.getClass();
            switch(s) {
                case "body": {
                    ﹳˑ$ˊᴵ0 = CLS17.FLD248;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "caption": {
                    break;
                }
                case "colgroup": {
                    ﹳˑ$ˊᴵ0 = CLS17.FLD231;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "frameset": {
                    ﹳˑ$ˊᴵ0 = CLS17.FLD239;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "head": {
                    if(!z) {
                        ﹳˑ$ˊᴵ0 = CLS17.FLD230;
                        this.FLD258 = ﹳˑ$ˊᴵ0;
                        return this.FLD258 != ﹳˑ0;
                    }
                label_35:
                    if(z) {
                        ﹳˑ$ˊᴵ0 = CLS17.FLD248;
                        this.FLD258 = ﹳˑ$ˊᴵ0;
                        return this.FLD258 != ﹳˑ0;
                    }
                    --v;
                    continue;
                }
                case "html": {
                    ﹳˑ$ˊᴵ0 = this.FLD266 == null ? CLS17.FLD247 : CLS17.FLD232;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "select": {
                    ﹳˑ$ˊᴵ0 = CLS17.FLD246;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "table": {
                    ﹳˑ$ˊᴵ0 = CLS17.FLD237;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "tbody": 
                case "tfoot": 
                case "thead": {
                    ﹳˑ$ˊᴵ0 = CLS17.FLD226;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "td": 
                case "th": {
                    if(!z) {
                        ﹳˑ$ˊᴵ0 = CLS17.FLD242;
                        this.FLD258 = ﹳˑ$ˊᴵ0;
                        return this.FLD258 != ﹳˑ0;
                    }
                    goto label_35;
                }
                case "template": {
                    ﹳˑ$ˊᴵ0 = this.FLD265.size() > 0 ? ((CLS17)this.FLD265.get(this.FLD265.size() - 1)) : null;
                    if(ﹳˑ$ˊᴵ0 == null) {
                        throw new CLS37("Bug: no template insertion mode on stack!");
                    }
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                case "tr": {
                    ﹳˑ$ˊᴵ0 = CLS17.FLD235;
                    this.FLD258 = ﹳˑ$ˊᴵ0;
                    return this.FLD258 != ﹳˑ0;
                }
                default: {
                    goto label_35;
                }
            }
            ﹳˑ$ˊᴵ0 = CLS17.FLD243;
            this.FLD258 = ﹳˑ$ˊᴵ0;
            return this.FLD258 != ﹳˑ0;
        }
        return this.FLD258 != ﹳˑ0;
    }

    public final void MTH760(CLS17 ﹳˑ0) {
        this.FLD265.add(ﹳˑ0);
    }

    public final void MTH761() {
        this.MTH777(new String[]{"tr", "template"});
    }

    public final boolean MTH762(String s) {
        for(int v = this.FLD33.size() - 1; v >= 0; --v) {
            String s1 = ((CLS192)this.FLD33.get(v)).FLD388.FLD187;
            if(s1.equals(s)) {
                return true;
            }
            if(!CLS36.MTH852(s1, CLS181.FLD256)) {
                return false;
            }
        }
        throw new CLS37("Should not be reachable");
    }

    // This method was un-flattened
    public final void MTH763() {
        if(this.FLD33.size() > 0x100) {
            return;
        }
        CLS192 יٴ0 = this.FLD260.size() <= 0 ? null : ((CLS192)this.FLD260.get(this.FLD260.size() - 1));
        if(יٴ0 != null && !CLS181.MTH771(this.FLD33, יٴ0)) {
            int v = this.FLD260.size();
            int v1 = v - 1;
            while(v1 != (v - 12 >= 0 ? v - 12 : 0)) {
                --v1;
                יٴ0 = (CLS192)this.FLD260.get(v1);
                if(יٴ0 != null && !CLS181.MTH771(this.FLD33, יٴ0)) {
                    continue;
                }
                goto label_17;
            }
            while(true) {
                CLS39.MTH871(יٴ0);
                CLS192 יٴ1 = new CLS192(((CLS8)this).MTH443(יٴ0.FLD388.FLD187, this.FLD38), null, יٴ0.MTH967().MTH1114());
                this.MTH774(((CLS57)יٴ1));
                this.FLD33.add(יٴ1);
                this.FLD260.set(v1, יٴ1);
                if(v1 == v - 1) {
                    break;
                }
            label_17:
                ++v1;
                יٴ0 = (CLS192)this.FLD260.get(v1);
            }
        }
    }

    public final CLS192 MTH764(CLS201 יٴ$ﾞˈ0) {
        if(((CLS87)יٴ$ﾞˈ0).MTH482()) {
            CLS64 ﾞᵢ0 = יٴ$ﾞˈ0.FLD74;
            if(ﾞᵢ0.FLD416 != 0) {
                boolean z = this.FLD38.FLD45;
                int v1 = 0;
                for(int v = 0; v < ﾞᵢ0.FLD418.length; ++v) {
                    for(int v2 = v + 1; true; ++v2) {
                        String[] arr_s = ﾞᵢ0.FLD418;
                        if(v2 >= arr_s.length) {
                            break;
                        }
                        String s = arr_s[v2];
                        if(s == null) {
                            break;
                        }
                        if(z && arr_s[v].equals(s) || !z && ﾞᵢ0.FLD418[v].equalsIgnoreCase(ﾞᵢ0.FLD418[v2])) {
                            ++v1;
                            ﾞᵢ0.MTH1106(v2);
                            --v2;
                        }
                    }
                }
                if(v1 > 0) {
                    Object[] arr_object = {יٴ$ﾞˈ0.FLD81};
                    CLS10 ˎᵔ0 = this.FLD36.FLD251;
                    if(ˎᵔ0.MTH453()) {
                        ˎᵔ0.add(new CLS7(this.FLD41, "Dropped duplicate attribute(s) in tag [%s]", arr_object));
                    }
                }
            }
        }
        if(יٴ$ﾞˈ0.FLD79) {
            CLS192 יٴ0 = this.MTH782(יٴ$ﾞˈ0);
            this.FLD33.add(יٴ0);
            this.FLD39.MTH465(((CLS14)CLS14.FLD146));
            CLS11 ˑᵎ0 = this.FLD39;
            CLS199 יٴ$ˋˈ0 = this.FLD263;
            ((CLS87)יٴ$ˋˈ0).MTH485();
            ((CLS87)יٴ$ˋˈ0).MTH489(יٴ0.FLD388.FLD180);
            ˑᵎ0.MTH467(((CLS12)יٴ$ˋˈ0));
            return יٴ0;
        }
        CLS15 ᴵᐧ0 = ((CLS8)this).MTH443(((CLS87)יٴ$ﾞˈ0).MTH486(), this.FLD38);
        CLS64 ﾞᵢ1 = יٴ$ﾞˈ0.FLD74;
        this.FLD38.MTH450(ﾞᵢ1);
        CLS192 יٴ1 = new CLS192(ᴵᐧ0, null, ﾞᵢ1);
        this.MTH774(((CLS57)יٴ1));
        this.FLD33.add(יٴ1);
        return יٴ1;
    }

    public final void MTH765(CLS192 יٴ0) {
        for(int v = this.FLD33.size() - 1; v >= 0; --v) {
            if(((CLS192)this.FLD33.get(v)) == יٴ0) {
                this.FLD33.remove(v);
                return;
            }
        }
    }

    public final void MTH766() {
        CLS192 יٴ0 = (CLS192)this.FLD33.remove(this.FLD33.size() - 1);
    }

    public final boolean MTH767(CLS12 יٴ0, CLS17 ﹳˑ0) {
        this.FLD40 = יٴ0;
        return ﹳˑ0.MTH754(יٴ0, this);
    }

    public final void MTH768(CLS89 יٴ$ﾞᵢ0) {
        CLS208 ﹳˑ0;
        CLS192 יٴ0 = ((CLS8)this).MTH445();
        String s = יٴ0.FLD388.FLD187;
        String s1 = יٴ$ﾞᵢ0.FLD86;
        if(יٴ$ﾞᵢ0 instanceof CLS200) {
            ﹳˑ0 = new CLS208(s1);
        }
        else if(s.equals("script") || s.equals("style")) {
            ﹳˑ0 = new CLS203(s1);
        }
        else {
            ﹳˑ0 = new CLS204(s1);
        }
        יٴ0.MTH1056(((CLS57)ﹳˑ0));
    }

    public final void MTH769(CLS201 יٴ$ﾞˈ0, boolean z, boolean z1) {
        CLS15 ᴵᐧ0 = ((CLS8)this).MTH443(((CLS87)יٴ$ﾞˈ0).MTH486(), this.FLD38);
        CLS64 ﾞᵢ0 = יٴ$ﾞˈ0.FLD74;
        this.FLD38.MTH450(ﾞᵢ0);
        CLS205 ᐧᴵ0 = new CLS205(ᴵᐧ0, ﾞᵢ0);
        if(!z1 || !this.MTH772("template")) {
            this.FLD270 = ᐧᴵ0;
        }
        this.MTH774(((CLS57)ᐧᴵ0));
        if(z) {
            this.FLD33.add(ᐧᴵ0);
        }
    }

    @Nullable
    public final void MTH770(String s) {
        int v = this.FLD33.size();
        do {
            --v;
            if(v < 0) {
                break;
            }
            CLS192 יٴ0 = (CLS192)this.FLD33.get(v);
            this.FLD33.remove(v);
        }
        while(!יٴ0.FLD388.FLD187.equals(s));
    }

    public static boolean MTH771(ArrayList arrayList0, CLS192 יٴ0) {
        int v = arrayList0.size() - 1;
        int v1 = v < 0x100 ? 0 : v - 0x100;
        while(v >= v1) {
            if(((CLS192)arrayList0.get(v)) == יٴ0) {
                return true;
            }
            --v;
        }
        return false;
    }

    public final boolean MTH772(String s) {
        return this.MTH783(s) != null;
    }

    public final void MTH773() {
        this.MTH777(new String[]{"table", "template"});
    }

    public final void MTH774(CLS57 ʼˉ0) {
        if(this.FLD33.isEmpty()) {
            ((CLS192)this.FLD31).MTH1056(ʼˉ0);
        }
        else if(!this.FLD262 || !CLS36.MTH852(((CLS8)this).MTH445().FLD388.FLD187, CLS16.FLD212)) {
            ((CLS8)this).MTH445().MTH1056(ʼˉ0);
        }
        else {
            this.MTH785(ʼˉ0);
        }
        if(ʼˉ0 instanceof CLS192 && ((CLS192)ʼˉ0).FLD388.FLD183) {
            CLS205 ᐧᴵ0 = this.FLD270;
            if(ᐧᴵ0 != null) {
                ᐧᴵ0.FLD402.add(((CLS192)ʼˉ0));
            }
        }
    }

    public final CLS192 MTH775(String s) {
        for(int v = this.FLD260.size() - 1; v >= 0; --v) {
            CLS192 יٴ0 = (CLS192)this.FLD260.get(v);
            if(יٴ0 == null) {
                break;
            }
            if(יٴ0.FLD388.FLD187.equals(s)) {
                return יٴ0;
            }
        }
        return null;
    }

    public final void MTH776(CLS17 ﹳˑ0) {
        if(this.FLD36.FLD251.MTH453()) {
            this.FLD36.FLD251.add(new CLS7(this.FLD41, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.FLD40.getClass().getSimpleName(), this.FLD40, ﹳˑ0}));
        }
    }

    public final void MTH777(String[] arr_s) {
        for(int v = this.FLD33.size() - 1; v >= 0; --v) {
            CLS192 יٴ0 = (CLS192)this.FLD33.get(v);
            String s = יٴ0.FLD388.FLD187;
            boolean z = false;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(arr_s[v1].equals(s)) {
                    z = true;
                    break;
                }
            }
            if(z || יٴ0.FLD388.FLD187.equals("html")) {
                break;
            }
            this.FLD33.remove(v);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH778() {
        CLS192 יٴ3;
        CLS192 יٴ0;
        CLS9 ˋˈ0;
        if(!this.MTH772("body")) {
            ArrayList arrayList0 = this.FLD33;
            CLS207 ﾞˈ0 = this.FLD31;
            Iterator iterator0 = ((CLS192)ﾞˈ0).MTH1036().iterator();
            do {
                boolean z = iterator0.hasNext();
                ˋˈ0 = CLS9.FLD44;
                if(!z) {
                    goto label_12;
                }
                Object object0 = iterator0.next();
                יٴ0 = (CLS192)object0;
            }
            while(!יٴ0.FLD388.FLD187.equals("html"));
            CLS192 יٴ1 = יٴ0;
            goto label_19;
        label_12:
            CLS57 ʼˉ0 = ((CLS192)ﾞˈ0).MTH975();
            CLS207 ﾞˈ1 = ʼˉ0 instanceof CLS207 ? ((CLS207)ʼˉ0) : null;
            if(ﾞˈ1 == null || ﾞˈ1.FLD413 == null) {
                new CLS181();
                new CLS10();
            }
            יٴ1 = new CLS192(CLS15.MTH690("html", ˋˈ0), "", null);
            ((CLS192)ﾞˈ0).MTH1056(((CLS57)יٴ1));
        label_19:
            for(Object object1: יٴ1.MTH1036()) {
                CLS192 יٴ2 = (CLS192)object1;
                if(!"body".equals(יٴ2.FLD388.FLD187) && !"frameset".equals(יٴ2.FLD388.FLD187)) {
                    continue;
                }
                יٴ3 = יٴ2;
                arrayList0.add(יٴ3);
                this.FLD258 = CLS17.FLD248;
                return;
            }
            CLS57 ʼˉ1 = יٴ1.MTH975();
            CLS207 ﾞˈ2 = ʼˉ1 instanceof CLS207 ? ((CLS207)ʼˉ1) : null;
            if(ﾞˈ2 == null || ﾞˈ2.FLD413 == null) {
                new CLS181();
                new CLS10();
            }
            יٴ3 = new CLS192(CLS15.MTH690("body", ˋˈ0), "", null);
            יٴ1.MTH1056(((CLS57)יٴ3));
            arrayList0.add(יٴ3);
        }
        this.FLD258 = CLS17.FLD248;
    }

    public final void MTH779() {
        while(!this.FLD260.isEmpty()) {
            int v = this.FLD260.size();
            if((v <= 0 ? null : ((CLS192)this.FLD260.remove(v - 1))) == null) {
                break;
            }
        }
    }

    public final boolean MTH780(String[] arr_s, String[] arr_s1, String[] arr_s2) {
        int v = this.FLD33.size() - 1;
        int v1 = v <= 100 ? 0 : v - 100;
        while(v >= v1) {
            String s = ((CLS192)this.FLD33.get(v)).FLD388.FLD187;
            if(CLS36.MTH852(s, arr_s)) {
                return true;
            }
            if(CLS36.MTH852(s, arr_s1)) {
                return false;
            }
            if(arr_s2 != null && CLS36.MTH852(s, arr_s2)) {
                return false;
            }
            --v;
        }
        return false;
    }

    public final boolean MTH781(String s, String[] arr_s) {
        this.FLD271[0] = s;
        return this.MTH780(this.FLD271, CLS181.FLD254, arr_s);
    }

    public final CLS192 MTH782(CLS201 יٴ$ﾞˈ0) {
        CLS15 ᴵᐧ0 = ((CLS8)this).MTH443(((CLS87)יٴ$ﾞˈ0).MTH486(), this.FLD38);
        CLS64 ﾞᵢ0 = יٴ$ﾞˈ0.FLD74;
        this.FLD38.MTH450(ﾞᵢ0);
        CLS192 יٴ0 = new CLS192(ᴵᐧ0, null, ﾞᵢ0);
        this.MTH774(((CLS57)יٴ0));
        if(יٴ$ﾞˈ0.FLD79) {
            if(!CLS15.FLD178.containsKey(ᴵᐧ0.FLD180)) {
                ᴵᐧ0.FLD175 = true;
            }
            else if(!ᴵᐧ0.FLD176) {
                CLS11 ˑᵎ0 = this.FLD39;
                Object[] arr_object = {ᴵᐧ0.FLD187};
                CLS10 ˎᵔ0 = ˑᵎ0.FLD67;
                if(ˎᵔ0.MTH453()) {
                    ˎᵔ0.add(new CLS7(ˑᵎ0.FLD58, "Tag [%s] cannot be self closing; not a void tag", arr_object));
                    return יٴ0;
                }
            }
        }
        return יٴ0;
    }

    @Nullable
    public final CLS192 MTH783(String s) {
        int v = this.FLD33.size() - 1;
        int v1 = v < 0x100 ? 0 : v - 0x100;
        while(v >= v1) {
            CLS192 יٴ0 = (CLS192)this.FLD33.get(v);
            if(יٴ0.FLD388.FLD187.equals(s)) {
                return יٴ0;
            }
            --v;
        }
        return null;
    }

    public final void MTH784(String s) {
        while(CLS36.MTH852(((CLS8)this).MTH445().FLD388.FLD187, CLS181.FLD267) && (s == null || !((CLS8)this).MTH447(s))) {
            this.MTH766();
        }
    }

    public final void MTH785(CLS57 ʼˉ0) {
        boolean z;
        CLS192 יٴ1;
        CLS192 יٴ0 = this.MTH783("table");
        if(יٴ0 == null) {
            יٴ1 = (CLS192)this.FLD33.get(0);
            z = false;
        }
        else {
            יٴ1 = (CLS192)יٴ0.FLD373;
            if(יٴ1 == null) {
                יٴ1 = this.MTH794(יٴ0);
                z = false;
            }
            else {
                z = true;
            }
        }
        if(z) {
            CLS39.MTH871(יٴ0);
            CLS39.MTH871(יٴ0.FLD373);
            יٴ0.FLD373.MTH986(יٴ0.FLD375, new CLS57[]{ʼˉ0});
            return;
        }
        יٴ1.MTH1056(ʼˉ0);
    }

    public final void MTH786() {
        this.MTH777(new String[]{"tbody", "tfoot", "thead", "template"});
    }

    public final void MTH787(CLS88 יٴ$ﹳˑ0) {
        this.MTH774(((CLS57)new CLS202((יٴ$ﹳˑ0.FLD84 == null ? יٴ$ﹳˑ0.FLD85.toString() : יٴ$ﹳˑ0.FLD84))));
    }

    public final void MTH788(CLS192 יٴ0) {
        int v = this.FLD260.size() - 1;
        int v1 = v - 12 >= 0 ? v - 12 : 0;
        int v2 = 0;
        while(v >= v1) {
            CLS192 יٴ1 = (CLS192)this.FLD260.get(v);
            if(יٴ1 == null) {
                break;
            }
            if(יٴ0.FLD388.FLD187.equals(יٴ1.FLD388.FLD187) && יٴ0.MTH967().equals(יٴ1.MTH967())) {
                ++v2;
            }
            if(v2 == 3) {
                this.FLD260.remove(v);
                return;
            }
            --v;
        }
    }

    public final void MTH789(CLS192 יٴ0) {
        int v = this.FLD260.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(((CLS192)this.FLD260.get(v)) == יٴ0) {
                this.FLD260.remove(v);
                return;
            }
        }
    }

    @Nullable
    public final void MTH790() {
        if(this.FLD265.size() > 0) {
            CLS17 ﹳˑ0 = (CLS17)this.FLD265.remove(this.FLD265.size() - 1);
        }
    }

    public final boolean MTH791(String s) {
        return this.MTH781(s, CLS181.FLD268);
    }

    public final void MTH792(boolean z) {
        String[] arr_s = z ? CLS181.FLD259 : CLS181.FLD267;
        while(CLS36.MTH852(((CLS8)this).MTH445().FLD388.FLD187, arr_s)) {
            this.MTH766();
        }
    }

    @Override  // p.pkg3.CLS8
    public final boolean MTH446(CLS12 יٴ0) {
        this.FLD40 = יٴ0;
        return this.FLD258.MTH754(יٴ0, this);
    }

    @Nullable
    public final CLS192 MTH794(CLS192 יٴ0) {
        for(int v = this.FLD33.size() - 1; v >= 0; --v) {
            if(((CLS192)this.FLD33.get(v)) == יٴ0) {
                return (CLS192)this.FLD33.get(v - 1);
            }
        }
        return null;
    }

    public final boolean MTH795(String s) {
        this.FLD271[0] = s;
        return this.MTH780(this.FLD271, CLS181.FLD264, null);
    }
}

