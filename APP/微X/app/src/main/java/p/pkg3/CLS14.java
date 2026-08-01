// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import java.util.Locale;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class CLS14 extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS90 extends CLS14 {
        public CLS90() {
            super("CommentEndDash", 0x2F);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS142 ᐧᴵ$ᵎˑ0;
            int v = ٴʼ0.MTH522();
            CLS126 ᐧᴵ$יˋ0 = CLS14.FLD134;
            CLS88 יٴ$ﹳˑ0 = ˑᵎ0.FLD54;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ﹳˑ0.MTH497('-');
                    v = 0xFFFD;
                    יٴ$ﹳˑ0.MTH497(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$יˋ0));
                    return;
                }
                case 45: {
                    ᐧᴵ$ᵎˑ0 = CLS14.FLD122;
                    break;
                }
                default: {
                    if(v != 0xFFFF) {
                        יٴ$ﹳˑ0.MTH497('-');
                        יٴ$ﹳˑ0.MTH497(((char)v));
                        ˑᵎ0.MTH465(((CLS14)ᐧᴵ$יˋ0));
                        return;
                    }

                    ˑᵎ0.MTH458(((CLS14)this));
                    ˑᵎ0.MTH463();
                    ᐧᴵ$ᵎˑ0 = CLS14.FLD146;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵎˑ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS91 extends CLS14 {
        public CLS91() {
            super("DoctypePublicIdentifier_singleQuoted", 57);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    return;
                }
                case 39: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD142));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            return;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS92 extends CLS14 {
        public CLS92() {
            super("BogusComment", 42);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            String s = ٴʼ0.MTH526('>');
            ˑᵎ0.FLD54.MTH496(s);
            switch(ٴʼ0.MTH520()) {
                case 62: 
                case 0xFFFF: {
                    ٴʼ0.MTH522();
                    ˑᵎ0.MTH463();
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS93 extends CLS14 {
        public CLS93() {
            super("ScriptDataEscapeStartDash", 20);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            if(ٴʼ0.MTH530('-')) {
                ˑᵎ0.MTH460('-');
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD111));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            ˑᵎ0.MTH465(((CLS14)CLS14.FLD127));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS94 extends CLS14 {
        public CLS94() {
            super("ScriptDataDoubleEscaped", 28);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS154 ᐧᴵ$ﾞـ0;
            switch(ٴʼ0.MTH520()) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ٴʼ0.MTH529();
                    ˑᵎ0.MTH460('\uFFFD');
                    return;
                }
                case 45: {
                    ˑᵎ0.MTH460('-');
                    ᐧᴵ$ﾞـ0 = CLS14.FLD130;
                    break;
                }
                case 60: {
                    ˑᵎ0.MTH460('<');
                    ᐧᴵ$ﾞـ0 = CLS14.FLD123;
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
                    return;
                }
                default: {
                    ˑᵎ0.MTH459(ٴʼ0.MTH525(new char[]{'-', '<', '\u0000'}));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ﾞـ0));
            ˑᵎ0.FLD58.MTH529();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS95 extends CLS14 {
        public CLS95() {
            super("DoctypeSystemIdentifier_singleQuoted", 0x3F);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    return;
                }
                case 39: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD140));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            return;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS96 extends CLS14 {
        public CLS96() {
            super("Rawtext", 4);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS14.MTH681(ˑᵎ0, ٴʼ0, ((CLS14)this), ((CLS14)CLS14.FLD133));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS97 extends CLS14 {
        public CLS97() {
            super("EndTagOpen", 8);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS132 ᐧᴵ$ٴʼ0;
            boolean z = ٴʼ0.MTH524();
            CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
            if(z) {
                ˑᵎ0.MTH458(((CLS14)this));
                ˑᵎ0.MTH459("</");
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                return;
            }

            if(ٴʼ0.MTH528()) {
                ˑᵎ0.MTH468(false);
                ᐧᴵ$ٴʼ0 = CLS14.FLD136;
            }
            else {
                boolean z1 = ٴʼ0.MTH530('>');
                ˑᵎ0.MTH456(((CLS14)this));
                if(z1) {
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    ˑᵎ0.FLD58.MTH529();
                    return;
                }

                ˑᵎ0.FLD54.MTH507();
                ˑᵎ0.FLD54.MTH497('/');
                ᐧᴵ$ٴʼ0 = CLS14.FLD157;
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴʼ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS98 extends CLS14 {
        public CLS98() {
            super("MarkupDeclarationOpen", 43);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS145 ᐧᴵ$ᵢᵎ0;
            boolean z = ٴʼ0.MTH535("--");
            CLS88 יٴ$ﹳˑ0 = ˑᵎ0.FLD54;
            if(z) {
                יٴ$ﹳˑ0.MTH507();
                ᐧᴵ$ᵢᵎ0 = CLS14.FLD131;
            }
            else if(ٴʼ0.MTH523("DOCTYPE")) {
                ᐧᴵ$ᵢᵎ0 = CLS14.FLD158;
            }
            else if(ٴʼ0.MTH535("[CDATA[")) {
                ˑᵎ0.MTH457();
                ᐧᴵ$ᵢᵎ0 = CLS14.FLD108;
            }
            else {
                ˑᵎ0.MTH456(((CLS14)this));
                יٴ$ﹳˑ0.MTH507();
                ᐧᴵ$ᵢᵎ0 = CLS14.FLD157;
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵢᵎ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS99 extends CLS14 {
        public CLS99() {
            super("CdataSection", 66);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            String s;
            int v = ٴʼ0.MTH527("]]>");
            if(v == -1) {
                int v1 = ٴʼ0.FLD98;
                int v2 = ٴʼ0.FLD92;
                if(v1 - v2 < 3) {
                    ٴʼ0.MTH539();
                    s = CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, ٴʼ0.FLD92, ٴʼ0.FLD98 - ٴʼ0.FLD92);
                    ٴʼ0.FLD92 = ٴʼ0.FLD98;
                }
                else {
                    s = CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, v2, v1 - 2 - v2);
                    ٴʼ0.FLD92 = v1 - 2;
                }
            }
            else {
                s = CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, ٴʼ0.FLD92, v);
                ٴʼ0.FLD92 += v;
            }

            StringBuilder stringBuilder0 = ˑᵎ0.FLD62;
            stringBuilder0.append(s);
            if(ٴʼ0.MTH535("]]>") || ٴʼ0.MTH524()) {
                ˑᵎ0.MTH467(((CLS12)new CLS200(stringBuilder0.toString())));
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS100 extends CLS14 {
        public CLS100() {
            super("ScriptDataDoubleEscapedDashDash", 30);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS105 ᐧᴵ$ˈʽ0;
            int v = ٴʼ0.MTH522();
            CLS94 ᐧᴵ$ʼˎ0 = CLS14.FLD150;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    v = 0xFFFD;
                    break;
                }
                case 45: {
                    ˑᵎ0.MTH460('-');
                    return;
                }
                case 60: {
                    ˑᵎ0.MTH460('<');
                    ᐧᴵ$ˈʽ0 = CLS14.FLD123;
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈʽ0));
                    return;
                }
                case 62: {
                    ˑᵎ0.MTH460('>');
                    ᐧᴵ$ˈʽ0 = CLS14.FLD127;
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈʽ0));
                    return;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    ᐧᴵ$ˈʽ0 = CLS14.FLD146;
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈʽ0));
                    return;
                }
            }

            ˑᵎ0.MTH460(((char)v));
            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʼˎ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS101 extends CLS14 {
        public CLS101() {
            super("DoctypePublicIdentifier_doubleQuoted", 56);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    return;
                }
                case 34: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD142));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            return;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS102 extends CLS14 {
        public CLS102() {
            super("CommentStartDash", 45);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS126 ᐧᴵ$יˋ0 = CLS14.FLD134;
            CLS88 יٴ$ﹳˑ0 = ˑᵎ0.FLD54;
        alab1:
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    v = 0xFFFD;
                    break;
                }
                case 45: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD122));
                    return;
                label_7:
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            break alab1;
                        }
                    }

                    ˑᵎ0.MTH463();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
                default: {
                    goto label_7;
                }
            }

            יٴ$ﹳˑ0.MTH497(((char)v));
            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$יˋ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS103 extends CLS14 {
        public CLS103() {
            super("Rcdata", 2);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS155 ᐧᴵ$ﾞᴵ0;
            switch(ٴʼ0.MTH520()) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ٴʼ0.MTH529();
                    ˑᵎ0.MTH460('\uFFFD');
                    return;
                }
                case 38: {
                    ᐧᴵ$ﾞᴵ0 = CLS14.FLD121;
                    break;
                }
                case 60: {
                    ᐧᴵ$ﾞᴵ0 = CLS14.FLD152;
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH467(((CLS12)new CLS86()));
                    return;
                }
                default: {
                    ˑᵎ0.MTH459(ٴʼ0.MTH537());
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ﾞᴵ0));
            ˑᵎ0.FLD58.MTH529();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS104 extends CLS14 {
        public CLS104() {
            super("SelfClosingStartTag", 41);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
            switch(v) {
                case 62: {
                    ˑᵎ0.FLD61.FLD79 = true;
                    ˑᵎ0.MTH466();
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    break;
                }
                default: {
                    ٴʼ0.MTH518();
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD119));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS105 extends CLS14 {
        public CLS105() {
            super("ScriptDataDoubleEscapedLessthanSign", 0x1F);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            if(ٴʼ0.MTH530('/')) {
                ˑᵎ0.MTH460('/');
                ˑᵎ0.MTH457();
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD114));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            ˑᵎ0.MTH465(((CLS14)CLS14.FLD150));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS106 extends CLS14 {
        public CLS106() {
            super("AfterDoctypePublicIdentifier", 58);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS141 ᐧᴵ$ᵎˎ0;
            int v = ٴʼ0.MTH522();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ᐧᴵ$ᵎˎ0 = CLS14.FLD106;
                    break;
                }
                case 34: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ᐧᴵ$ᵎˎ0 = CLS14.FLD110;
                    break;
                }
                case 39: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ᐧᴵ$ᵎˎ0 = CLS14.FLD164;
                    break;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v != 62) {
                        CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
                        if(v != 0xFFFF) {
                            ˑᵎ0.MTH456(((CLS14)this));
                            יٴ$ˉˈ0.FLD69 = true;
                            ᐧᴵ$ᵎˎ0 = CLS14.FLD129;
                            break;
                        }

                        ˑᵎ0.MTH458(((CLS14)this));
                        יٴ$ˉˈ0.FLD69 = true;
                    }

                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵎˎ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS107 extends CLS14 {
        public CLS107() {
            super("AttributeName", 34);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS136 ᐧᴵ$ᐧʽ0;
            String s = ٴʼ0.MTH532(CLS14.FLD151);
            CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.FLD61;
            יٴ$ᴵᐧ0.getClass();
            String s1 = s.replace('\u0000', '\uFFFD');
            יٴ$ᴵᐧ0.FLD75 = true;
            String s2 = יٴ$ᴵᐧ0.FLD76;
            StringBuilder stringBuilder0 = יٴ$ᴵᐧ0.FLD73;
            if(s2 != null) {
                stringBuilder0.append(s2);
                יٴ$ᴵᐧ0.FLD76 = null;
            }

            if(stringBuilder0.length() == 0) {
                יٴ$ᴵᐧ0.FLD76 = s1;
            }
            else {
                stringBuilder0.append(s1);
            }

            int v = ٴʼ0.MTH522();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ᐧᴵ$ᐧʽ0 = CLS14.FLD115;
                    break;
                }
                case 34: 
                case 39: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD61.MTH491(((char)v));
                    return;
                }
                case 0x2F: {
                    ᐧᴵ$ᐧʽ0 = CLS14.FLD101;
                    break;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v == 0xFFFF) {
                        ˑᵎ0.MTH458(((CLS14)this));
                        ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                        return;
                    }

                    switch(v) {
                        case 60: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            ˑᵎ0.FLD61.MTH491(((char)v));
                            return;
                        }
                        case 61: {
                            ᐧᴵ$ᐧʽ0 = CLS14.FLD103;
                            break;
                        }
                        case 62: {
                            ˑᵎ0.MTH466();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        default: {
                            ˑᵎ0.FLD61.MTH491(((char)v));
                            return;
                        }
                    }
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧʽ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS108 extends CLS14 {
        public CLS108() {
            super("AttributeValue_unquoted", 39);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS137 ᐧᴵ$ᐧᴵ0;
            CLS87 יٴ$ᴵᐧ1;
            String s = ٴʼ0.MTH532(CLS14.FLD145);
            if(s.length() > 0) {
                ˑᵎ0.FLD61.MTH487(s);
            }

            int v = ٴʼ0.MTH522();
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                    v = 0xFFFD;
                    break;
                }
                case 0x20: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD119));
                    return;
                label_11:
                    int[] arr_v = ˑᵎ0.MTH470(Character.valueOf('>'), true);
                    CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.FLD61;
                    if(arr_v != null) {
                        יٴ$ᴵᐧ0.MTH490(arr_v);
                        return;
                    }

                    יٴ$ᴵᐧ0.MTH488('&');
                    return;
                }
                case 34: 
                case 0x60: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                    break;
                }
                default: {
                    ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v == 0xFFFF) {
                        ˑᵎ0.MTH458(((CLS14)this));
                        ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                        return;
                    }

                    switch(v) {
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: {
                            ˑᵎ0.MTH465(((CLS14)CLS14.FLD119));
                            return;
                        }
                        case 38: {
                            goto label_11;
                        }
                        case 39: 
                        case 60: 
                        case 61: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                            break;
                        }
                        case 62: {
                            ˑᵎ0.MTH466();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        default: {
                            יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                            break;
                        }
                    }
                }
            }

            יٴ$ᴵᐧ1.MTH488(((char)v));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS109 extends CLS14 {
        public CLS109() {
            super("RCDATAEndTagName", 12);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS133 ᐧᴵ$ٴˈ0;
            if(ٴʼ0.MTH528()) {
                String s = ٴʼ0.MTH533();
                ˑᵎ0.FLD61.MTH483(s);
                ˑᵎ0.FLD62.append(s);
                return;
            }

            switch(ٴʼ0.MTH522()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    if(ˑᵎ0.MTH461()) {
                        ᐧᴵ$ٴˈ0 = CLS14.FLD119;
                        ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴˈ0));
                        return;
                    }

                    break;
                }
                case 0x2F: {
                    if(ˑᵎ0.MTH461()) {
                        ᐧᴵ$ٴˈ0 = CLS14.FLD101;
                        ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴˈ0));
                        return;
                    }

                    break;
                }
                case 62: {
                    if(ˑᵎ0.MTH461()) {
                        ˑᵎ0.MTH466();
                        ᐧᴵ$ٴˈ0 = CLS14.FLD146;
                        ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴˈ0));
                        return;
                    }
                }
            }

            CLS109.MTH580(ˑᵎ0, ٴʼ0);
        }

        public static void MTH580(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            ˑᵎ0.MTH459("</");
            ˑᵎ0.MTH469(ˑᵎ0.FLD62);
            ٴʼ0.MTH518();
            ˑᵎ0.MTH465(((CLS14)CLS14.FLD165));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS110 extends CLS14 {
        public CLS110() {
            super("AfterDoctypeName", 53);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS123 ᐧᴵ$ˑᐧ0;
            boolean z = ٴʼ0.MTH524();
            CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
            CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
            if(z) {
                ˑᵎ0.MTH458(((CLS14)this));
                יٴ$ˉˈ0.FLD69 = true;
                ˑᵎ0.MTH462();
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                return;
            }

            if(ٴʼ0.MTH534(new char[]{'\t', '\n', '\r', '\f', ' '})) {
                ٴʼ0.MTH529();
                return;
            }

            if(ٴʼ0.MTH530('>')) {
                ˑᵎ0.MTH462();
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
            }
            else {
                boolean z1 = false;
                if(ٴʼ0.MTH523("PUBLIC")) {
                    z1 = true;
                    יٴ$ˉˈ0.FLD71 = "PUBLIC";
                    ᐧᴵ$ˑᐧ0 = CLS14.FLD107;
                }
                else if(ٴʼ0.MTH523("SYSTEM")) {
                    z1 = true;
                    יٴ$ˉˈ0.FLD71 = "SYSTEM";
                    ᐧᴵ$ˑᐧ0 = CLS14.FLD137;
                }

                if(z1) {
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˑᐧ0));
                    return;
                }

                ˑᵎ0.MTH456(((CLS14)this));
                יٴ$ˉˈ0.FLD69 = true;
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD129));
            }

            ˑᵎ0.FLD58.MTH529();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS111 extends CLS14 {
        public CLS111() {
            super("AttributeValue_singleQuoted", 38);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS137 ᐧᴵ$ᐧᴵ0;
            CLS87 יٴ$ᴵᐧ1;
            String s = ٴʼ0.MTH521(true);
            if(s.length() > 0) {
                ˑᵎ0.FLD61.MTH487(s);
            }
            else {
                ˑᵎ0.FLD61.FLD77 = true;
            }

            int v = ٴʼ0.MTH522();
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                    v = 0xFFFD;
                    יٴ$ᴵᐧ1.MTH488(((char)v));
                    return;
                }
                case 38: {
                    int[] arr_v = ˑᵎ0.MTH470(Character.valueOf('\''), true);
                    CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.FLD61;
                    if(arr_v != null) {
                        יٴ$ᴵᐧ0.MTH490(arr_v);
                        return;
                    }

                    יٴ$ᴵᐧ0.MTH488('&');
                    return;
                }
                case 39: {
                    ᐧᴵ$ᐧᴵ0 = CLS14.FLD138;
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    break;
                }
                default: {
                    יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                    יٴ$ᴵᐧ1.MTH488(((char)v));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS112 extends CLS14 {
        public CLS112() {
            super("AttributeValue_doubleQuoted", 37);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS87 יٴ$ᴵᐧ1;
            CLS146 ᐧᴵ$ⁱٴ0;
            String s = ٴʼ0.MTH521(false);
            if(s.length() > 0) {
                ˑᵎ0.FLD61.MTH487(s);
            }
            else {
                ˑᵎ0.FLD61.FLD77 = true;
            }

            int v = ٴʼ0.MTH522();
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                    v = 0xFFFD;
                    יٴ$ᴵᐧ1.MTH488(((char)v));
                    return;
                }
                case 34: {
                    ᐧᴵ$ⁱٴ0 = CLS14.FLD138;
                    break;
                }
                case 38: {
                    int[] arr_v = ˑᵎ0.MTH470(Character.valueOf('\"'), true);
                    CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.FLD61;
                    if(arr_v != null) {
                        יٴ$ᴵᐧ0.MTH490(arr_v);
                        return;
                    }

                    יٴ$ᴵᐧ0.MTH488('&');
                    return;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    ᐧᴵ$ⁱٴ0 = CLS14.FLD146;
                    break;
                }
                default: {
                    יٴ$ᴵᐧ1 = ˑᵎ0.FLD61;
                    יٴ$ᴵᐧ1.MTH488(((char)v));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ⁱٴ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS113 extends CLS14 {
        public CLS113() {
            super("AfterDoctypeSystemKeyword", 60);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS144 ᐧᴵ$ᵢˊ0;
            int v = ٴʼ0.MTH522();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ᐧᴵ$ᵢˊ0 = CLS14.FLD167;
                    break;
                }
                case 34: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ᐧᴵ$ᵢˊ0 = CLS14.FLD110;
                    break;
                }
                case 39: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ᐧᴵ$ᵢˊ0 = CLS14.FLD164;
                    break;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            יٴ$ˉˈ0.FLD69 = true;
                            ˑᵎ0.MTH462();
                            return;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵢˊ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS114 extends CLS14 {
        public CLS114() {
            super("ScriptDataEscapeStart", 19);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            if(ٴʼ0.MTH530('-')) {
                ˑᵎ0.MTH460('-');
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD105));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            ˑᵎ0.MTH465(((CLS14)CLS14.FLD127));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS115 extends CLS14 {
        public CLS115() {
            super("RawtextEndTagOpen", 14);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS153 ᐧᴵ$ﾞˈ0 = CLS14.FLD163;
            CLS96 ᐧᴵ$ʽᵔ0 = CLS14.FLD128;
            if(ٴʼ0.MTH528()) {
                ˑᵎ0.MTH468(false);
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ﾞˈ0));
                return;
            }

            ˑᵎ0.MTH459("</");
            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʽᵔ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS116 extends CLS14 {
        public CLS116() {
            super("RawtextLessthanSign", 13);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            if(ٴʼ0.MTH530('/')) {
                ˑᵎ0.MTH457();
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD149));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            ˑᵎ0.MTH460('<');
            ˑᵎ0.MTH465(((CLS14)CLS14.FLD128));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS117 extends CLS14 {
        public CLS117() {
            super("TagOpen", 7);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS92 ᐧᴵ$ʻˈ0;
            CLS98 ᐧᴵ$ʾˊ0;
            switch(ٴʼ0.MTH520()) {
                case 33: {
                    ᐧᴵ$ʾˊ0 = CLS14.FLD170;
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʾˊ0));
                    ˑᵎ0.FLD58.MTH529();
                    return;
                }
                case 0x2F: {
                    ᐧᴵ$ʾˊ0 = CLS14.FLD139;
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʾˊ0));
                    ˑᵎ0.FLD58.MTH529();
                    return;
                }
                case 0x3F: {
                    ˑᵎ0.FLD54.MTH507();
                    ᐧᴵ$ʻˈ0 = CLS14.FLD157;
                    break;
                }
                default: {
                    if(ٴʼ0.MTH528()) {
                        ˑᵎ0.MTH468(true);
                        ᐧᴵ$ʻˈ0 = CLS14.FLD136;
                    }
                    else {
                        ˑᵎ0.MTH456(((CLS14)this));
                        ˑᵎ0.MTH460('<');
                        ᐧᴵ$ʻˈ0 = CLS14.FLD146;
                    }
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʻˈ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS118 extends CLS14 {
        public CLS118() {
            super("BeforeAttributeValue", 36);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS112 ᐧᴵ$ˉٴ0;
            int v = ٴʼ0.MTH522();
            CLS108 ᐧᴵ$ˉʻ0 = CLS14.FLD113;
        alab1:
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD61.MTH488('\uFFFD');
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˉʻ0));
                    return;
                label_8:
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v == 0xFFFF) {
                        ˑᵎ0.MTH458(((CLS14)this));
                        ˑᵎ0.MTH466();
                        ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                        return;
                    }

                    switch(v) {
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: {
                            break alab1;
                        }
                        case 39: {
                            ᐧᴵ$ˉٴ0 = CLS14.FLD160;
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˉٴ0));
                            return;
                        }
                        case 60: 
                        case 61: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            ˑᵎ0.FLD61.MTH488(((char)v));
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˉʻ0));
                            return;
                        }
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            ˑᵎ0.MTH466();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        default: {
                            ٴʼ0.MTH518();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˉʻ0));
                            return;
                        }
                    }
                }
                case 0x20: {
                    break;
                }
                case 34: {
                    ᐧᴵ$ˉٴ0 = CLS14.FLD109;
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˉٴ0));
                    return;
                }
                case 0x60: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD61.MTH488('`');
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˉʻ0));
                    break;
                }
                default: {
                    goto label_8;
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS119 extends CLS14 {
        public CLS119() {
            super("CommentEndBang", 49);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS126 ᐧᴵ$יˋ0 = CLS14.FLD134;
            CLS88 יٴ$ﹳˑ0 = ˑᵎ0.FLD54;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ﹳˑ0.MTH496("--!");
                    v = 0xFFFD;
                    break;
                }
                case 45: {
                    יٴ$ﹳˑ0.MTH496("--!");
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD155));
                    return;
                label_8:
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v != 62) {
                        if(v != 0xFFFF) {
                            יٴ$ﹳˑ0.MTH496("--!");
                            break;
                        }

                        ˑᵎ0.MTH458(((CLS14)this));
                    }

                    ˑᵎ0.MTH463();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
                default: {
                    goto label_8;
                }
            }

            יٴ$ﹳˑ0.MTH497(((char)v));
            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$יˋ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS120 extends CLS14 {
        public CLS120() {
            super("ScriptDataEscapedLessthanSign", 24);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS131 ᐧᴵ$ـᐧ0;
            boolean z = false;
            if(ٴʼ0.MTH528()) {
                z = true;
                ˑᵎ0.MTH457();
                int v = ٴʼ0.MTH520();
                ˑᵎ0.FLD62.append(((char)v));
                ˑᵎ0.MTH459("<");
                ˑᵎ0.MTH460(ٴʼ0.MTH520());
                ᐧᴵ$ـᐧ0 = CLS14.FLD118;
            }
            else if(ٴʼ0.MTH530('/')) {
                z = true;
                ˑᵎ0.MTH457();
                ᐧᴵ$ـᐧ0 = CLS14.FLD153;
            }

            if(z) {
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ـᐧ0));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            ˑᵎ0.MTH460('<');
            ˑᵎ0.MTH465(((CLS14)CLS14.FLD143));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS121 extends CLS14 {
        public CLS121() {
            super("ScriptDataEscaped", 21);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            if(ٴʼ0.MTH524()) {
                ˑᵎ0.MTH458(((CLS14)this));
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
                return;
            }

            switch(ٴʼ0.MTH520()) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ٴʼ0.MTH529();
                    ˑᵎ0.MTH460('\uFFFD');
                    return;
                }
                case 45: {
                    ˑᵎ0.MTH460('-');
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD169));
                    break;
                }
                case 60: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD116));
                    break;
                }
                default: {
                    ˑᵎ0.MTH459(ٴʼ0.MTH525(new char[]{'-', '<', '\u0000'}));
                    return;
                }
            }

            ˑᵎ0.FLD58.MTH529();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS122 extends CLS14 {
        public CLS122() {
            super("BeforeDoctypeName", 51);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            boolean z = ٴʼ0.MTH528();
            CLS140 ᐧᴵ$ᵎˈ0 = CLS14.FLD102;
            CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
            if(z) {
                יٴ$ˉˈ0.MTH507();
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵎˈ0));
                return;
            }

            int v = ٴʼ0.MTH522();
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ˉˈ0.MTH507();
                    יٴ$ˉˈ0.FLD72.append('\uFFFD');
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵎˈ0));
                    break;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    יٴ$ˉˈ0.MTH507();
                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
                    return;
                }
                default: {
                    יٴ$ˉˈ0.MTH507();
                    יٴ$ˉˈ0.FLD72.append(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵎˈ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS123 extends CLS14 {
        public CLS123() {
            super("AfterDoctypePublicKeyword", 54);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS143 ᐧᴵ$ᵎᵔ0;
            int v = ٴʼ0.MTH522();
        alab1:
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ᐧᴵ$ᵎᵔ0 = CLS14.FLD156;
                    break;
                }
                case 34: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ᐧᴵ$ᵎᵔ0 = CLS14.FLD125;
                    break;
                }
                case 39: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ᐧᴵ$ᵎᵔ0 = CLS14.FLD159;
                    break;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            יٴ$ˉˈ0.FLD69 = true;
                            ᐧᴵ$ᵎᵔ0 = CLS14.FLD129;
                            break alab1;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᵎᵔ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS124 extends CLS14 {
        public CLS124() {
            super("ScriptDataEndTagName", 18);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS14.MTH683(ˑᵎ0, ٴʼ0, ((CLS14)CLS14.FLD127));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS125 extends CLS14 {
        public CLS125() {
            super("AfterDoctypeSystemIdentifier", 0x40);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            if(v != 9 && v != 10 && v != 12 && v != 13 && v != 0x20) {
                CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                if(v != 62) {
                    if(v != 0xFFFF) {
                        ˑᵎ0.MTH456(((CLS14)this));
                        ˑᵎ0.MTH465(((CLS14)CLS14.FLD129));
                        return;
                    }

                    ˑᵎ0.MTH458(((CLS14)this));
                    ˑᵎ0.FLD47.FLD69 = true;
                }

                ˑᵎ0.MTH462();
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS126 extends CLS14 {
        public CLS126() {
            super("Comment", 46);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH520();
            CLS88 יٴ$ﹳˑ0 = ˑᵎ0.FLD54;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ٴʼ0.MTH529();
                    יٴ$ﹳˑ0.MTH497('\uFFFD');
                    return;
                }
                case 45: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD155));
                    ˑᵎ0.FLD58.MTH529();
                    return;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    ˑᵎ0.MTH463();
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
                    return;
                }
                default: {
                    יٴ$ﹳˑ0.MTH496(ٴʼ0.MTH525(new char[]{'-', '\u0000'}));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS127 extends CLS14 {
        public CLS127() {
            super("ScriptDataEndTagOpen", 17);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS124 ᐧᴵ$ˑᵎ0 = CLS14.FLD162;
            CLS149 ᐧᴵ$ﹳʿ0 = CLS14.FLD127;
            if(ٴʼ0.MTH528()) {
                ˑᵎ0.MTH468(false);
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˑᵎ0));
                return;
            }

            ˑᵎ0.MTH459("</");
            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ﹳʿ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS128 extends CLS14 {
        public CLS128() {
            super("PLAINTEXT", 6);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            switch(ٴʼ0.MTH520()) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ٴʼ0.MTH529();
                    ˑᵎ0.MTH460('\uFFFD');
                    return;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH467(((CLS12)new CLS86()));
                    return;
                }
                default: {
                    ˑᵎ0.MTH459(ٴʼ0.MTH526('\u0000'));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS129 extends CLS14 {
        public CLS129() {
            super("DoctypeSystemIdentifier_doubleQuoted", 62);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    return;
                }
                case 34: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD140));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            return;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS130 extends CLS14 {
        public CLS130() {
            super("CharacterReferenceInData", 1);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
            int[] arr_v = ˑᵎ0.MTH470(null, false);
            if(arr_v == null) {
                ˑᵎ0.MTH460('&');
            }
            else {
                ˑᵎ0.MTH459(new String(arr_v, 0, arr_v.length));
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS131 extends CLS14 {
        public CLS131() {
            super("ScriptDataDoubleEscapeStart", 27);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS14.MTH682(ˑᵎ0, ٴʼ0, ((CLS14)CLS14.FLD150), ((CLS14)CLS14.FLD143));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS132 extends CLS14 {
        public CLS132() {
            super("TagName", 9);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS133 ᐧᴵ$ٴˈ0;
            ٴʼ0.MTH539();
            int v = ٴʼ0.FLD92;
            int v1 = ٴʼ0.FLD98;
            char[] arr_c = ٴʼ0.FLD95;
            int v2 = v;
        alab1:
            while(v2 < v1) {
                switch(arr_c[v2]) {
                    case 9: 
                    case 10: 
                    case 12: 
                    case 13: 
                    case 0x20: 
                    case 0x2F: 
                    case 60: 
                    case 62: {
                        break alab1;
                    }
                    default: {
                        ++v2;
                    }
                }
            }

            ٴʼ0.FLD92 = v2;
            String s = v2 <= v ? "" : CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, v, v2 - v);
            ˑᵎ0.FLD61.MTH483(s);
            int v3 = ٴʼ0.MTH522();
        alab2:
            switch(v3) {
                case 0: {
                    ˑᵎ0.FLD61.MTH483("\uFFFD");
                    return;
                label_17:
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v3) {
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: {
                            ᐧᴵ$ٴˈ0 = CLS14.FLD119;
                            break alab2;
                        }
                        case 60: {
                            ٴʼ0.MTH518();
                            ˑᵎ0.MTH456(((CLS14)this));
                            ˑᵎ0.MTH466();
                            break;
                        }
                        case 62: {
                            ˑᵎ0.MTH466();
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.FLD61;
                            יٴ$ᴵᐧ0.getClass();
                            יٴ$ᴵᐧ0.MTH483(String.valueOf(((char)v3)));
                            return;
                        }
                    }

                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
                case 0x20: {
                    ᐧᴵ$ٴˈ0 = CLS14.FLD119;
                    break;
                }
                case 0x2F: {
                    ᐧᴵ$ٴˈ0 = CLS14.FLD101;
                    break;
                }
                default: {
                    goto label_17;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴˈ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS133 extends CLS14 {
        public CLS133() {
            super("BeforeAttributeName", 33);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS107 ᐧᴵ$ˈﾞ0 = CLS14.FLD161;
        alab1:
            switch(v) {
                case 0: {
                    ٴʼ0.MTH518();
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD61.MTH492();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈﾞ0));
                    break;
                }
                case 0x20: {
                    break;
                }
                case 34: 
                case 39: {
                label_20:
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD61.MTH492();
                    ˑᵎ0.FLD61.MTH491(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈﾞ0));
                    return;
                }
                case 0x2F: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD101));
                    return;
                label_6:
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: {
                            break alab1;
                        }
                        case 60: {
                            ٴʼ0.MTH518();
                            ˑᵎ0.MTH456(((CLS14)this));
                            ˑᵎ0.MTH466();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        case 61: {
                            goto label_20;
                        }
                        case 62: {
                            ˑᵎ0.MTH466();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        default: {
                            ˑᵎ0.FLD61.MTH492();
                            ٴʼ0.MTH518();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈﾞ0));
                            return;
                        }
                    }
                }
                default: {
                    goto label_6;
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS134 extends CLS14 {
        public CLS134() {
            super("ScriptDataEscapedEndTagOpen", 25);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            if(ٴʼ0.MTH528()) {
                ˑᵎ0.MTH468(false);
                CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.FLD61;
                int v = ٴʼ0.MTH520();
                יٴ$ᴵᐧ0.getClass();
                יٴ$ᴵᐧ0.MTH483(String.valueOf(((char)v)));
                int v1 = ٴʼ0.MTH520();
                ˑᵎ0.FLD62.append(((char)v1));
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD147));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            ˑᵎ0.MTH459("</");
            ˑᵎ0.MTH465(((CLS14)CLS14.FLD143));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS135 extends CLS14 {
        public CLS135() {
            super("ScriptDataEscapedDash", 22);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS148 ᐧᴵ$ⁱﾞ0;
            if(ٴʼ0.MTH524()) {
                ˑᵎ0.MTH458(((CLS14)this));
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
                return;
            }

            int v = ٴʼ0.MTH522();
            CLS121 ᐧᴵ$ˏﹳ0 = CLS14.FLD143;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    v = 0xFFFD;
                    ˑᵎ0.MTH460(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˏﹳ0));
                    return;
                }
                case 45: {
                    ˑᵎ0.MTH460('-');
                    ᐧᴵ$ⁱﾞ0 = CLS14.FLD111;
                    break;
                }
                case 60: {
                    ᐧᴵ$ⁱﾞ0 = CLS14.FLD116;
                    break;
                }
                default: {
                    ˑᵎ0.MTH460(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˏﹳ0));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ⁱﾞ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS136 extends CLS14 {
        public CLS136() {
            super("AfterAttributeName", 35);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS104 ᐧᴵ$ˆﹶ0;
            int v = ٴʼ0.MTH522();
            CLS107 ᐧᴵ$ˈﾞ0 = CLS14.FLD161;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD61.MTH491('\uFFFD');
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈﾞ0));
                    break;
                }
                case 0x20: {
                    break;
                }
                case 34: 
                case 39: {
                label_18:
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD61.MTH492();
                    ˑᵎ0.FLD61.MTH491(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈﾞ0));
                    return;
                }
                case 0x2F: {
                    ᐧᴵ$ˆﹶ0 = CLS14.FLD101;
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˆﹶ0));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: {
                            break;
                        }
                        case 60: {
                            goto label_18;
                        }
                        case 61: {
                            ᐧᴵ$ˆﹶ0 = CLS14.FLD103;
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˆﹶ0));
                            return;
                        }
                        case 62: {
                            ˑᵎ0.MTH466();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        default: {
                            ˑᵎ0.FLD61.MTH492();
                            ٴʼ0.MTH518();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˈﾞ0));
                        }
                    }
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS137 extends CLS14 {
        public CLS137() {
            super("Data", 0);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS130 ᐧᴵ$ـʿ0;
            switch(ٴʼ0.MTH520()) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.MTH460(ٴʼ0.MTH522());
                    return;
                }
                case 38: {
                    ᐧᴵ$ـʿ0 = CLS14.FLD171;
                    break;
                }
                case 60: {
                    ᐧᴵ$ـʿ0 = CLS14.FLD154;
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH467(((CLS12)new CLS86()));
                    return;
                }
                default: {
                    ˑᵎ0.MTH459(ٴʼ0.MTH537());
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ـʿ0));
            ˑᵎ0.FLD58.MTH529();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS138 extends CLS14 {
        public CLS138() {
            super("ScriptDataDoubleEscapeEnd", 0x20);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS14.MTH682(ˑᵎ0, ٴʼ0, ((CLS14)CLS14.FLD143), ((CLS14)CLS14.FLD150));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS139 extends CLS14 {
        public CLS139() {
            super("ScriptDataLessthanSign", 16);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS114 ᐧᴵ$ˊᴵ0;
            int v = ٴʼ0.MTH522();
            switch(v) {
                case 33: {
                    ˑᵎ0.MTH459("<!");
                    ᐧᴵ$ˊᴵ0 = CLS14.FLD144;
                    break;
                }
                case 0x2F: {
                    ˑᵎ0.MTH457();
                    ᐧᴵ$ˊᴵ0 = CLS14.FLD148;
                    break;
                }
                default: {
                    ˑᵎ0.MTH459("<");
                    if(v == 0xFFFF) {
                        ˑᵎ0.MTH458(((CLS14)this));
                        ᐧᴵ$ˊᴵ0 = CLS14.FLD146;
                    }
                    else {
                        ٴʼ0.MTH518();
                        ᐧᴵ$ˊᴵ0 = CLS14.FLD127;
                    }
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˊᴵ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS140 extends CLS14 {
        public CLS140() {
            super("DoctypeName", 52);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS137 ᐧᴵ$ᐧᴵ0;
            boolean z = ٴʼ0.MTH516();
            CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
            if(z) {
                String s = ٴʼ0.MTH533();
                יٴ$ˉˈ0.FLD72.append(s);
                return;
            }

            int v = ٴʼ0.MTH522();
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    return;
                label_11:
                    ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v != 62) {
                        switch(v) {
                            case 9: 
                            case 10: 
                            case 12: 
                            case 13: {
                                ˑᵎ0.MTH465(((CLS14)CLS14.FLD117));
                                return;
                            }
                            case 0xFFFF: {
                                goto label_17;
                            }
                            default: {
                                return;
                            }
                        }
                    }

                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
                case 0x20: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD117));
                    return;
                label_17:
                    ˑᵎ0.MTH458(((CLS14)this));
                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
                default: {
                    goto label_11;
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS141 extends CLS14 {
        public CLS141() {
            super("BetweenDoctypePublicAndSystemIdentifiers", 59);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 34: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD110));
                    break;
                }
                case 39: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD164));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v != 62) {
                        CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
                        if(v != 0xFFFF) {
                            ˑᵎ0.MTH456(((CLS14)this));
                            יٴ$ˉˈ0.FLD69 = true;
                            ˑᵎ0.MTH465(((CLS14)CLS14.FLD129));
                            return;
                        }

                        ˑᵎ0.MTH458(((CLS14)this));
                        יٴ$ˉˈ0.FLD69 = true;
                    }

                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS142 extends CLS14 {
        public CLS142() {
            super("CommentEnd", 0x30);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS126 ᐧᴵ$יˋ0 = CLS14.FLD134;
            CLS88 יٴ$ﹳˑ0 = ˑᵎ0.FLD54;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    יٴ$ﹳˑ0.MTH496("--");
                    v = 0xFFFD;
                    break;
                }
                case 33: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD135));
                    return;
                }
                case 45: {
                    יٴ$ﹳˑ0.MTH497('-');
                    return;
                label_9:
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    if(v != 62) {
                        if(v != 0xFFFF) {
                            יٴ$ﹳˑ0.MTH496("--");
                            break;
                        }

                        ˑᵎ0.MTH458(((CLS14)this));
                    }

                    ˑᵎ0.MTH463();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
                default: {
                    goto label_9;
                }
            }

            יٴ$ﹳˑ0.MTH497(((char)v));
            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$יˋ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS143 extends CLS14 {
        public CLS143() {
            super("BeforeDoctypePublicIdentifier", 55);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 34: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD125));
                    break;
                }
                case 39: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD159));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            יٴ$ˉˈ0.FLD69 = true;
                            ˑᵎ0.MTH465(((CLS14)CLS14.FLD129));
                            return;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS144 extends CLS14 {
        public CLS144() {
            super("BeforeDoctypeSystemIdentifier", 61);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 34: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD110));
                    break;
                }
                case 39: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD164));
                    return;
                }
                default: {
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    CLS85 יٴ$ˉˈ0 = ˑᵎ0.FLD47;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            יٴ$ˉˈ0.FLD69 = true;
                            ˑᵎ0.MTH465(((CLS14)CLS14.FLD129));
                            return;
                        }
                    }

                    יٴ$ˉˈ0.FLD69 = true;
                    ˑᵎ0.MTH462();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS145 extends CLS14 {
        public CLS145() {
            super("CommentStart", 44);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS126 ᐧᴵ$יˋ0 = CLS14.FLD134;
        alab1:
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.FLD54.MTH497('\uFFFD');
                    break;
                }
                case 45: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD166));
                    return;
                label_6:
                    CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH456(((CLS14)this));
                            break;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            break;
                        }
                        default: {
                            ٴʼ0.MTH518();
                            break alab1;
                        }
                    }

                    ˑᵎ0.MTH463();
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                    return;
                }
                default: {
                    goto label_6;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$יˋ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS146 extends CLS14 {
        public CLS146() {
            super("AfterAttributeValue_quoted", 40);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS137 ᐧᴵ$ᐧᴵ0;
            int v = ٴʼ0.MTH522();
            CLS133 ᐧᴵ$ٴˈ0 = CLS14.FLD119;
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴˈ0));
                    return;
                }
                case 0x2F: {
                    ˑᵎ0.MTH465(((CLS14)CLS14.FLD101));
                    return;
                label_6:
                    ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
                    switch(v) {
                        case 62: {
                            ˑᵎ0.MTH466();
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        case 0xFFFF: {
                            ˑᵎ0.MTH458(((CLS14)this));
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
                            return;
                        }
                        default: {
                            ٴʼ0.MTH518();
                            ˑᵎ0.MTH456(((CLS14)this));
                            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴˈ0));
                            return;
                        }
                    }
                }
                default: {
                    goto label_6;
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS147 extends CLS14 {
        public CLS147() {
            super("ScriptDataEscapedEndTagName", 26);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS14.MTH683(ˑᵎ0, ٴʼ0, ((CLS14)CLS14.FLD143));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS148 extends CLS14 {
        public CLS148() {
            super("ScriptDataEscapedDashDash", 23);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS120 ᐧᴵ$ˏˆ0;
            if(ٴʼ0.MTH524()) {
                ˑᵎ0.MTH458(((CLS14)this));
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
                return;
            }

            int v = ٴʼ0.MTH522();
            CLS121 ᐧᴵ$ˏﹳ0 = CLS14.FLD143;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.MTH460('\uFFFD');
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˏﹳ0));
                    return;
                }
                case 45: {
                    ˑᵎ0.MTH460('-');
                    return;
                label_10:
                    ˑᵎ0.MTH460(((char)v));
                    if(v == 62) {
                        ᐧᴵ$ˏˆ0 = CLS14.FLD127;
                        break;
                    }

                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˏﹳ0));
                    return;
                }
                case 60: {
                    ᐧᴵ$ˏˆ0 = CLS14.FLD116;
                    break;
                }
                default: {
                    goto label_10;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˏˆ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS149 extends CLS14 {
        public CLS149() {
            super("ScriptData", 5);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS14.MTH681(ˑᵎ0, ٴʼ0, ((CLS14)this), ((CLS14)CLS14.FLD132));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS150 extends CLS14 {
        public CLS150() {
            super("RCDATAEndTagOpen", 11);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            if(ٴʼ0.MTH528()) {
                ˑᵎ0.MTH468(false);
                CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.FLD61;
                int v = ٴʼ0.MTH520();
                יٴ$ᴵᐧ0.getClass();
                יٴ$ᴵᐧ0.MTH483(String.valueOf(((char)v)));
                int v1 = ٴʼ0.MTH520();
                ˑᵎ0.FLD62.append(((char)v1));
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD104));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            ˑᵎ0.MTH459("</");
            ˑᵎ0.MTH465(((CLS14)CLS14.FLD165));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS151 extends CLS14 {
        public CLS151() {
            super("Doctype", 50);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS122 ᐧᴵ$ˑˏ0 = CLS14.FLD112;
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˑˏ0));
                    return;
                }
                case 62: {
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    break;
                }
                default: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ˑˏ0));
                    return;
                }
            }

            ˑᵎ0.MTH456(((CLS14)this));
            ˑᵎ0.FLD47.MTH507();
            ˑᵎ0.FLD47.FLD69 = true;
            ˑᵎ0.MTH462();
            ˑᵎ0.MTH465(((CLS14)CLS14.FLD146));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS152 extends CLS14 {
        public CLS152() {
            super("BogusDoctype", 65);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            int v = ٴʼ0.MTH522();
            CLS137 ᐧᴵ$ᐧᴵ0 = CLS14.FLD146;
            if(v == 62 || v == 0xFFFF) {
                ˑᵎ0.MTH462();
                ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ᐧᴵ0));
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS153 extends CLS14 {
        public CLS153() {
            super("RawtextEndTagName", 15);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS14.MTH683(ˑᵎ0, ٴʼ0, ((CLS14)CLS14.FLD128));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS154 extends CLS14 {
        public CLS154() {
            super("ScriptDataDoubleEscapedDash", 29);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS100 ᐧᴵ$ʾﾞ0;
            int v = ٴʼ0.MTH522();
            CLS94 ᐧᴵ$ʼˎ0 = CLS14.FLD150;
            switch(v) {
                case 0: {
                    ˑᵎ0.MTH456(((CLS14)this));
                    v = 0xFFFD;
                    ˑᵎ0.MTH460(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʼˎ0));
                    return;
                }
                case 45: {
                    ˑᵎ0.MTH460('-');
                    ᐧᴵ$ʾﾞ0 = CLS14.FLD124;
                    break;
                }
                case 60: {
                    ˑᵎ0.MTH460('<');
                    ᐧᴵ$ʾﾞ0 = CLS14.FLD123;
                    break;
                }
                case 0xFFFF: {
                    ˑᵎ0.MTH458(((CLS14)this));
                    ᐧᴵ$ʾﾞ0 = CLS14.FLD146;
                    break;
                }
                default: {
                    ˑᵎ0.MTH460(((char)v));
                    ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʼˎ0));
                    return;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʾﾞ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS155 extends CLS14 {
        public CLS155() {
            super("CharacterReferenceInRcdata", 3);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS103 ᐧᴵ$ʿⁱ0 = CLS14.FLD165;
            int[] arr_v = ˑᵎ0.MTH470(null, false);
            if(arr_v == null) {
                ˑᵎ0.MTH460('&');
            }
            else {
                ˑᵎ0.MTH459(new String(arr_v, 0, arr_v.length));
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʿⁱ0));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS156 extends CLS14 {
        public CLS156() {
            super("RcdataLessthanSign", 10);
        }

        @Override  // p.pkg3.CLS14
        public final void MTH680(CLS11 ˑᵎ0, CLS13 ٴʼ0) {
            CLS103 ᐧᴵ$ʿⁱ0;
            if(ٴʼ0.MTH530('/')) {
                ˑᵎ0.MTH457();
                ˑᵎ0.MTH465(((CLS14)CLS14.FLD126));
                ˑᵎ0.FLD58.MTH529();
                return;
            }

            if(!ٴʼ0.MTH528() || ˑᵎ0.FLD60 == null) {
                ˑᵎ0.MTH459("<");
                ᐧᴵ$ʿⁱ0 = CLS14.FLD165;
            }
            else {
                if(ˑᵎ0.FLD64 == null) {
                    ˑᵎ0.FLD64 = "</" + ˑᵎ0.FLD60;
                }

                String s = ˑᵎ0.FLD64;
                boolean z = true;
                int v = -1;
                if(s.equals(ٴʼ0.FLD90)) {
                    int v1 = ٴʼ0.FLD88;
                    if(v1 == -1) {
                        z = false;
                    }
                    else if(v1 < ٴʼ0.FLD92) {
                        goto label_17;
                    }
                }
                else {
                label_17:
                    ٴʼ0.FLD90 = s;
                    Locale locale0 = Locale.ENGLISH;
                    int v2 = ٴʼ0.MTH527(s.toLowerCase(locale0));
                    if(v2 > -1) {
                        ٴʼ0.FLD88 = ٴʼ0.FLD92 + v2;
                    }
                    else {
                        int v3 = ٴʼ0.MTH527(s.toUpperCase(locale0));
                        if(v3 <= -1) {
                            z = false;
                        }
                        else {
                            v = ٴʼ0.FLD92 + v3;
                        }

                        ٴʼ0.FLD88 = v;
                    }
                }

                if(z) {
                    ˑᵎ0.MTH459("<");
                    ᐧᴵ$ʿⁱ0 = CLS14.FLD165;
                }
                else {
                    CLS87 יٴ$ᴵᐧ0 = ˑᵎ0.MTH468(false);
                    יٴ$ᴵᐧ0.MTH489(ˑᵎ0.FLD60);
                    ˑᵎ0.FLD61 = יٴ$ᴵᐧ0;
                    ˑᵎ0.MTH466();
                    ᐧᴵ$ʿⁱ0 = CLS14.FLD154;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ʿⁱ0));
        }
    }

    public static final enum CLS104 FLD101;
    public static final enum CLS140 FLD102;
    public static final enum CLS118 FLD103;
    public static final enum CLS109 FLD104;
    public static final enum CLS93 FLD105;
    public static final enum CLS141 FLD106;
    public static final enum CLS123 FLD107;
    public static final enum CLS99 FLD108;
    public static final enum CLS112 FLD109;
    public static final enum CLS129 FLD110;
    public static final enum CLS148 FLD111;
    public static final enum CLS122 FLD112;
    public static final enum CLS108 FLD113;
    public static final enum CLS138 FLD114;
    public static final enum CLS136 FLD115;
    public static final enum CLS120 FLD116;
    public static final enum CLS110 FLD117;
    public static final enum CLS131 FLD118;
    public static final enum CLS133 FLD119;
    public static final String FLD120;
    public static final enum CLS155 FLD121;
    public static final enum CLS142 FLD122;
    public static final enum CLS105 FLD123;
    public static final enum CLS100 FLD124;
    public static final enum CLS101 FLD125;
    public static final enum CLS150 FLD126;
    public static final enum CLS149 FLD127;
    public static final enum CLS96 FLD128;
    public static final enum CLS152 FLD129;
    public static final enum CLS154 FLD130;
    public static final enum CLS145 FLD131;
    public static final enum CLS139 FLD132;
    public static final enum CLS116 FLD133;
    public static final enum CLS126 FLD134;
    public static final enum CLS119 FLD135;
    public static final enum CLS132 FLD136;
    public static final enum CLS113 FLD137;
    public static final enum CLS146 FLD138;
    public static final enum CLS97 FLD139;
    public static final enum CLS125 FLD140;
    public static final CLS14[] FLD141;
    public static final enum CLS106 FLD142;
    public static final enum CLS121 FLD143;
    public static final enum CLS114 FLD144;
    public static final char[] FLD145;
    public static final enum CLS137 FLD146;
    public static final enum CLS147 FLD147;
    public static final enum CLS127 FLD148;
    public static final enum CLS115 FLD149;
    public static final enum CLS94 FLD150;
    public static final char[] FLD151;
    public static final enum CLS156 FLD152;
    public static final enum CLS134 FLD153;
    public static final enum CLS117 FLD154;
    public static final enum CLS90 FLD155;
    public static final enum CLS143 FLD156;
    public static final enum CLS92 FLD157;
    public static final enum CLS151 FLD158;
    public static final enum CLS91 FLD159;
    public static final enum CLS111 FLD160;
    public static final enum CLS107 FLD161;
    public static final enum CLS124 FLD162;
    public static final enum CLS153 FLD163;
    public static final enum CLS95 FLD164;
    public static final enum CLS103 FLD165;
    public static final enum CLS102 FLD166;
    public static final enum CLS144 FLD167;
    public static final enum CLS128 FLD168;
    public static final enum CLS135 FLD169;
    public static final enum CLS98 FLD170;
    public static final enum CLS130 FLD171;

    static {
        var ᐧᴵ$ᐧᴵ0 = new CLS137();
        CLS14.FLD146 = ᐧᴵ$ᐧᴵ0;
        var ᐧᴵ$ـʿ0 = new CLS130();
        CLS14.FLD171 = ᐧᴵ$ـʿ0;
        var ᐧᴵ$ʿⁱ0 = new CLS103();
        CLS14.FLD165 = ᐧᴵ$ʿⁱ0;
        var ᐧᴵ$ﾞᴵ0 = new CLS155();
        CLS14.FLD121 = ᐧᴵ$ﾞᴵ0;
        var ᐧᴵ$ʽᵔ0 = new CLS96();
        CLS14.FLD128 = ᐧᴵ$ʽᵔ0;
        var ᐧᴵ$ﹳʿ0 = new CLS149();
        CLS14.FLD127 = ᐧᴵ$ﹳʿ0;
        var ᐧᴵ$יᐧ0 = new CLS128();
        CLS14.FLD168 = ᐧᴵ$יᐧ0;
        var ᐧᴵ$ˎᵢ0 = new CLS117();
        CLS14.FLD154 = ᐧᴵ$ˎᵢ0;
        var ᐧᴵ$ʾˆ0 = new CLS97();
        CLS14.FLD139 = ᐧᴵ$ʾˆ0;
        var ᐧᴵ$ٴʼ0 = new CLS132();
        CLS14.FLD136 = ᐧᴵ$ٴʼ0;
        var ᐧᴵ$ﾞᵢ0 = new CLS156();
        CLS14.FLD152 = ᐧᴵ$ﾞᵢ0;
        var ᐧᴵ$ﹳˑ0 = new CLS150();
        CLS14.FLD126 = ᐧᴵ$ﹳˑ0;
        var ᐧᴵ$ˉˈ0 = new CLS109();
        CLS14.FLD104 = ᐧᴵ$ˉˈ0;
        var ᐧᴵ$ˎᵔ0 = new CLS116();
        CLS14.FLD133 = ᐧᴵ$ˎᵔ0;
        var ᐧᴵ$ˋˈ0 = new CLS115();
        CLS14.FLD149 = ᐧᴵ$ˋˈ0;
        var ᐧᴵ$ﾞˈ0 = new CLS153();
        CLS14.FLD163 = ᐧᴵ$ﾞˈ0;
        var ᐧᴵ$ᴵᐧ0 = new CLS139();
        CLS14.FLD132 = ᐧᴵ$ᴵᐧ0;
        var ᐧᴵ$יٴ0 = new CLS127();
        CLS14.FLD148 = ᐧᴵ$יٴ0;
        var ᐧᴵ$ˑᵎ0 = new CLS124();
        CLS14.FLD162 = ᐧᴵ$ˑᵎ0;
        var ᐧᴵ$ˊᴵ0 = new CLS114();
        CLS14.FLD144 = ᐧᴵ$ˊᴵ0;
        var ᐧᴵ$ʼˉ0 = new CLS93();
        CLS14.FLD105 = ᐧᴵ$ʼˉ0;
        var ᐧᴵ$ˏﹳ0 = new CLS121();
        CLS14.FLD143 = ᐧᴵ$ˏﹳ0;
        var ᐧᴵ$ٴﹶ0 = new CLS135();
        CLS14.FLD169 = ᐧᴵ$ٴﹶ0;
        var ᐧᴵ$ⁱﾞ0 = new CLS148();
        CLS14.FLD111 = ᐧᴵ$ⁱﾞ0;
        var ᐧᴵ$ˏˆ0 = new CLS120();
        CLS14.FLD116 = ᐧᴵ$ˏˆ0;
        var ᐧᴵ$ٴˉ0 = new CLS134();
        CLS14.FLD153 = ᐧᴵ$ٴˉ0;
        var ᐧᴵ$ⁱﹳ0 = new CLS147();
        CLS14.FLD147 = ᐧᴵ$ⁱﹳ0;
        var ᐧᴵ$ـᐧ0 = new CLS131();
        CLS14.FLD118 = ᐧᴵ$ـᐧ0;
        var ᐧᴵ$ʼˎ0 = new CLS94();
        CLS14.FLD150 = ᐧᴵ$ʼˎ0;
        var ᐧᴵ$ﾞـ0 = new CLS154();
        CLS14.FLD130 = ᐧᴵ$ﾞـ0;
        var ᐧᴵ$ʾﾞ0 = new CLS100();
        CLS14.FLD124 = ᐧᴵ$ʾﾞ0;
        var ᐧᴵ$ˈʽ0 = new CLS105();
        CLS14.FLD123 = ᐧᴵ$ˈʽ0;
        var ᐧᴵ$ᴵـ0 = new CLS138();
        CLS14.FLD114 = ᐧᴵ$ᴵـ0;
        var ᐧᴵ$ٴˈ0 = new CLS133();
        CLS14.FLD119 = ᐧᴵ$ٴˈ0;
        var ᐧᴵ$ˈﾞ0 = new CLS107();
        CLS14.FLD161 = ᐧᴵ$ˈﾞ0;
        var ᐧᴵ$ᐧʽ0 = new CLS136();
        CLS14.FLD115 = ᐧᴵ$ᐧʽ0;
        var ᐧᴵ$ˏ0 = new CLS118();
        CLS14.FLD103 = ᐧᴵ$ˏ0;
        var ᐧᴵ$ˉٴ0 = new CLS112();
        CLS14.FLD109 = ᐧᴵ$ˉٴ0;
        var ᐧᴵ$ˉˏ0 = new CLS111();
        CLS14.FLD160 = ᐧᴵ$ˉˏ0;
        var ᐧᴵ$ˉʻ0 = new CLS108();
        CLS14.FLD113 = ᐧᴵ$ˉʻ0;
        var ᐧᴵ$ⁱٴ0 = new CLS146();
        CLS14.FLD138 = ᐧᴵ$ⁱٴ0;
        var ᐧᴵ$ˆﹶ0 = new CLS104();
        CLS14.FLD101 = ᐧᴵ$ˆﹶ0;
        var ᐧᴵ$ʻˈ0 = new CLS92();
        CLS14.FLD157 = ᐧᴵ$ʻˈ0;
        var ᐧᴵ$ʾˊ0 = new CLS98();
        CLS14.FLD170 = ᐧᴵ$ʾˊ0;
        var ᐧᴵ$ᵢᵎ0 = new CLS145();
        CLS14.FLD131 = ᐧᴵ$ᵢᵎ0;
        var ᐧᴵ$ʿᐧ0 = new CLS102();
        CLS14.FLD166 = ᐧᴵ$ʿᐧ0;
        var ᐧᴵ$יˋ0 = new CLS126();
        CLS14.FLD134 = ᐧᴵ$יˋ0;
        var ᐧᴵ$ʻʾ0 = new CLS90();
        CLS14.FLD155 = ᐧᴵ$ʻʾ0;
        var ᐧᴵ$ᵎˑ0 = new CLS142();
        CLS14.FLD122 = ᐧᴵ$ᵎˑ0;
        var ᐧᴵ$ˏʾ0 = new CLS119();
        CLS14.FLD135 = ᐧᴵ$ˏʾ0;
        var ᐧᴵ$ﹳᵔ0 = new CLS151();
        CLS14.FLD158 = ᐧᴵ$ﹳᵔ0;
        var ᐧᴵ$ˑˏ0 = new CLS122();
        CLS14.FLD112 = ᐧᴵ$ˑˏ0;
        var ᐧᴵ$ᵎˈ0 = new CLS140();
        CLS14.FLD102 = ᐧᴵ$ᵎˈ0;
        var ᐧᴵ$ˉˎ0 = new CLS110();
        CLS14.FLD117 = ᐧᴵ$ˉˎ0;
        var ᐧᴵ$ˑᐧ0 = new CLS123();
        CLS14.FLD107 = ᐧᴵ$ˑᐧ0;
        var ᐧᴵ$ᵎᵔ0 = new CLS143();
        CLS14.FLD156 = ᐧᴵ$ᵎᵔ0;
        var ᐧᴵ$ʿˋ0 = new CLS101();
        CLS14.FLD125 = ᐧᴵ$ʿˋ0;
        var ᐧᴵ$ʻˆ0 = new CLS91();
        CLS14.FLD159 = ᐧᴵ$ʻˆ0;
        var ᐧᴵ$ˈᵢ0 = new CLS106();
        CLS14.FLD142 = ᐧᴵ$ˈᵢ0;
        var ᐧᴵ$ᵎˎ0 = new CLS141();
        CLS14.FLD106 = ᐧᴵ$ᵎˎ0;
        var ᐧᴵ$ˊˉ0 = new CLS113();
        CLS14.FLD137 = ᐧᴵ$ˊˉ0;
        var ᐧᴵ$ᵢˊ0 = new CLS144();
        CLS14.FLD167 = ᐧᴵ$ᵢˊ0;
        var ᐧᴵ$יᵔ0 = new CLS129();
        CLS14.FLD110 = ᐧᴵ$יᵔ0;
        var ᐧᴵ$ʼـ0 = new CLS95();
        CLS14.FLD164 = ᐧᴵ$ʼـ0;
        var ᐧᴵ$יʿ0 = new CLS125();
        CLS14.FLD140 = ᐧᴵ$יʿ0;
        var ᐧᴵ$ﾞˆ0 = new CLS152();
        CLS14.FLD129 = ᐧᴵ$ﾞˆ0;
        var ᐧᴵ$ʾᵢ0 = new CLS99();
        CLS14.FLD108 = ᐧᴵ$ʾᵢ0;
        CLS14.FLD141 = new CLS14[]{ᐧᴵ$ᐧᴵ0, ᐧᴵ$ـʿ0, ᐧᴵ$ʿⁱ0, ᐧᴵ$ﾞᴵ0, ᐧᴵ$ʽᵔ0, ᐧᴵ$ﹳʿ0, ᐧᴵ$יᐧ0, ᐧᴵ$ˎᵢ0, ᐧᴵ$ʾˆ0, ᐧᴵ$ٴʼ0, ᐧᴵ$ﾞᵢ0, ᐧᴵ$ﹳˑ0, ᐧᴵ$ˉˈ0, ᐧᴵ$ˎᵔ0, ᐧᴵ$ˋˈ0, ᐧᴵ$ﾞˈ0, ᐧᴵ$ᴵᐧ0, ᐧᴵ$יٴ0, ᐧᴵ$ˑᵎ0, ᐧᴵ$ˊᴵ0, ᐧᴵ$ʼˉ0, ᐧᴵ$ˏﹳ0, ᐧᴵ$ٴﹶ0, ᐧᴵ$ⁱﾞ0, ᐧᴵ$ˏˆ0, ᐧᴵ$ٴˉ0, ᐧᴵ$ⁱﹳ0, ᐧᴵ$ـᐧ0, ᐧᴵ$ʼˎ0, ᐧᴵ$ﾞـ0, ᐧᴵ$ʾﾞ0, ᐧᴵ$ˈʽ0, ᐧᴵ$ᴵـ0, ᐧᴵ$ٴˈ0, ᐧᴵ$ˈﾞ0, ᐧᴵ$ᐧʽ0, ᐧᴵ$ˏ0, ᐧᴵ$ˉٴ0, ᐧᴵ$ˉˏ0, ᐧᴵ$ˉʻ0, ᐧᴵ$ⁱٴ0, ᐧᴵ$ˆﹶ0, ᐧᴵ$ʻˈ0, ᐧᴵ$ʾˊ0, ᐧᴵ$ᵢᵎ0, ᐧᴵ$ʿᐧ0, ᐧᴵ$יˋ0, ᐧᴵ$ʻʾ0, ᐧᴵ$ᵎˑ0, ᐧᴵ$ˏʾ0, ᐧᴵ$ﹳᵔ0, ᐧᴵ$ˑˏ0, ᐧᴵ$ᵎˈ0, ᐧᴵ$ˉˎ0, ᐧᴵ$ˑᐧ0, ᐧᴵ$ᵎᵔ0, ᐧᴵ$ʿˋ0, ᐧᴵ$ʻˆ0, ᐧᴵ$ˈᵢ0, ᐧᴵ$ᵎˎ0, ᐧᴵ$ˊˉ0, ᐧᴵ$ᵢˊ0, ᐧᴵ$יᵔ0, ᐧᴵ$ʼـ0, ᐧᴵ$יʿ0, ᐧᴵ$ﾞˆ0, ᐧᴵ$ʾᵢ0};
        CLS14.FLD151 = new char[]{'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        CLS14.FLD145 = new char[]{'\u0000', '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        CLS14.FLD120 = "\uFFFD";
    }

    public CLS14() {
        throw null;
    }

    public CLS14(String s, int v) {
        super(s, v);
    }

    public static CLS14 valueOf(String s) {
        return (CLS14)Enum.valueOf(CLS14.class, s);
    }

    public static CLS14[] values() {
        return (CLS14[])CLS14.FLD141.clone();
    }

    public abstract void MTH680(CLS11 arg1, CLS13 arg2);

    public static void MTH681(CLS11 ˑᵎ0, CLS13 ٴʼ0, CLS14 ᐧᴵ0, CLS14 ᐧᴵ1) {
        switch(ٴʼ0.MTH520()) {
            case 0: {
                ˑᵎ0.MTH456(ᐧᴵ0);
                ٴʼ0.MTH529();
                ˑᵎ0.MTH460('\uFFFD');
                return;
            }
            case 60: {
                ˑᵎ0.MTH465(ᐧᴵ1);
                ˑᵎ0.FLD58.MTH529();
                return;
            }
            case 0xFFFF: {
                ˑᵎ0.MTH467(((CLS12)new CLS86()));
                return;
            }
            default: {
                int v = ٴʼ0.FLD92;
                int v1 = ٴʼ0.FLD98;
                char[] arr_c = ٴʼ0.FLD95;
                int v2 = v;
            alab1:
                while(v2 < v1) {
                    switch(arr_c[v2]) {
                        case 0: 
                        case 60: {
                            break alab1;
                        }
                        default: {
                            ++v2;
                        }
                    }
                }

                ٴʼ0.FLD92 = v2;
                ˑᵎ0.MTH459((v2 <= v ? "" : CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, v, v2 - v)));
            }
        }
    }

    public static void MTH682(CLS11 ˑᵎ0, CLS13 ٴʼ0, CLS14 ᐧᴵ0, CLS14 ᐧᴵ1) {
        boolean z = ٴʼ0.MTH516();
        StringBuilder stringBuilder0 = ˑᵎ0.FLD62;
        if(z) {
            String s = ٴʼ0.MTH533();
            stringBuilder0.append(s);
            ˑᵎ0.MTH459(s);
            return;
        }

        int v = ٴʼ0.MTH522();
        switch(v) {
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: 
            case 0x2F: 
            case 62: {
                if(stringBuilder0.toString().equals("script")) {
                    ˑᵎ0.MTH465(ᐧᴵ0);
                }
                else {
                    ˑᵎ0.MTH465(ᐧᴵ1);
                }

                ˑᵎ0.MTH460(((char)v));
                return;
            }
            default: {
                ٴʼ0.MTH518();
                ˑᵎ0.MTH465(ᐧᴵ1);
            }
        }
    }

    public static void MTH683(CLS11 ˑᵎ0, CLS13 ٴʼ0, CLS14 ᐧᴵ0) {
        boolean z1;
        CLS133 ᐧᴵ$ٴˈ0;
        boolean z = ٴʼ0.MTH516();
        StringBuilder stringBuilder0 = ˑᵎ0.FLD62;
        if(z) {
            String s = ٴʼ0.MTH533();
            ˑᵎ0.FLD61.MTH483(s);
            stringBuilder0.append(s);
            return;
        }

        if(!ˑᵎ0.MTH461() || ٴʼ0.MTH524()) {
        label_21:
            z1 = true;
        }
        else {
            int v = ٴʼ0.MTH522();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ᐧᴵ$ٴˈ0 = CLS14.FLD119;
                    break;
                }
                case 0x2F: {
                    ᐧᴵ$ٴˈ0 = CLS14.FLD101;
                    break;
                }
                case 62: {
                    ˑᵎ0.MTH466();
                    ᐧᴵ$ٴˈ0 = CLS14.FLD146;
                    break;
                }
                default: {
                    stringBuilder0.append(((char)v));
                    goto label_21;
                }
            }

            ˑᵎ0.MTH465(((CLS14)ᐧᴵ$ٴˈ0));
            z1 = false;
        }

        if(z1) {
            ˑᵎ0.MTH459("</");
            ˑᵎ0.MTH469(stringBuilder0);
            ˑᵎ0.MTH465(ᐧᴵ0);
        }
    }
}

