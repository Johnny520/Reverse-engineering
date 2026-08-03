package Yue;

import Yue.AbstractC3928;
import Yue.AbstractC4662;
import Yue.AbstractC7643;
import Yue.C7293;
import com.google.flatbuffers.reflection.BaseType;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۥۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6851 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final char[] f17765 = {',', C8039.f23876, SignatureVisitor.EXTENDS, '~', ' '};

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String[] f17766 = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Pattern f17767 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Pattern f17768 = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f17769 = false;

    /* JADX INFO: renamed from: ۥ */
    public final C7863 f2353;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f2354;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<AbstractC4662> f17770 = new ArrayList();

    public C6851(String str) {
        C8159.m26907(str);
        String strTrim = str.trim();
        this.f2354 = strTrim;
        this.f2353 = new C7863(strTrim);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static AbstractC4662 m21597(String str) {
        try {
            return new C6851(str).m21614();
        } catch (IllegalArgumentException e) {
            throw new C7293.C1224(e.getMessage());
        }
    }

    public String toString() {
        return this.f2354;
    }

    /* JADX INFO: renamed from: ۥ */
    public final AbstractC4662 m3299() {
        AbstractC4662 c4668;
        C7863 c7863 = new C7863(this.f2353.m24977(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, ']'));
        String strM24986 = c7863.m24986(f17766);
        C8159.m26907(strM24986);
        c7863.m24988();
        if (c7863.m24990()) {
            return strM24986.startsWith("^") ? new AbstractC4662.C4664(strM24986.substring(1)) : strM24986.equals(InterfaceC5949.f14892) ? new AbstractC4662.C4664("") : new AbstractC4662.C0467(strM24986);
        }
        if (c7863.m24991("=")) {
            c4668 = new AbstractC4662.C4665(strM24986, c7863.m24998());
        } else if (c7863.m24991("!=")) {
            c4668 = new AbstractC4662.C4669(strM24986, c7863.m24998());
        } else if (c7863.m24991("^=")) {
            c4668 = new AbstractC4662.C4670(strM24986, c7863.m24998());
        } else if (c7863.m24991("$=")) {
            c4668 = new AbstractC4662.C4667(strM24986, c7863.m24998());
        } else if (c7863.m24991("*=")) {
            c4668 = new AbstractC4662.C4666(strM24986, c7863.m24998());
        } else {
            if (!c7863.m24991("~=")) {
                throw new C7293.C1224("Could not parse attribute query '%s': unexpected token at '%s'", this.f2354, c7863.m24998());
            }
            c4668 = new AbstractC4662.C4668(strM24986, Pattern.compile(c7863.m24998()));
        }
        return c4668;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC4662 m3300() {
        String strM24982 = this.f2353.m24982();
        C8159.m26907(strM24982);
        return new AbstractC4662.C4671(strM24982.trim());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final AbstractC4662 m21598() {
        String strM24982 = this.f2353.m24982();
        C8159.m26907(strM24982);
        return new AbstractC4662.C4678(strM24982);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final AbstractC4662 m21599() {
        String strM2840 = C6396.m2840(this.f2353.m24983());
        C8159.m26907(strM2840);
        if (strM2840.startsWith("*|")) {
            return new AbstractC3928.C0293(new AbstractC4662.C4700(strM2840.substring(2)), new AbstractC4662.C4701(strM2840.replace("*|", ":")));
        }
        if (strM2840.contains("|")) {
            strM2840 = strM2840.replace("|", ":");
        }
        return new AbstractC4662.C4700(strM2840);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21600(char c) {
        AbstractC4662 c0292;
        AbstractC4662 abstractC4662;
        boolean z;
        AbstractC3928.C0292 c02922;
        AbstractC4662 abstractC46622;
        AbstractC4662 abstractC46623;
        AbstractC3928.C0293 c0293;
        this.f2353.m24988();
        AbstractC4662 abstractC4662M21597 = m21597(m21604());
        if (this.f17770.size() == 1) {
            c0292 = this.f17770.get(0);
            if ((c0292 instanceof AbstractC3928.C0293) && c != ',') {
                z = true;
                abstractC4662 = c0292;
                c0292 = ((AbstractC3928.C0293) c0292).m11188();
            }
            this.f17770.clear();
            if (c == ' ') {
                if (c == '>') {
                    AbstractC7643.C7644 c7644 = c0292 instanceof AbstractC7643.C7644 ? (AbstractC7643.C7644) c0292 : new AbstractC7643.C7644(c0292);
                    c7644.m24387(abstractC4662M21597);
                    abstractC46622 = c7644;
                } else if (c == '~') {
                    c02922 = new AbstractC3928.C0292(new AbstractC7643.C7649(c0292), abstractC4662M21597);
                } else if (c == '+') {
                    c02922 = new AbstractC3928.C0292(new AbstractC7643.C7645(c0292), abstractC4662M21597);
                } else {
                    if (c != ',') {
                        throw new C7293.C1224("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (c0292 instanceof AbstractC3928.C0293) {
                        c0293 = (AbstractC3928.C0293) c0292;
                    } else {
                        AbstractC3928.C0293 c02932 = new AbstractC3928.C0293();
                        c02932.m11191(c0292);
                        c0293 = c02932;
                    }
                    c0293.m11191(abstractC4662M21597);
                    abstractC46622 = c0293;
                }
                if (z) {
                    ((AbstractC3928.C0293) abstractC4662).m11187(abstractC46622);
                    abstractC46623 = abstractC4662;
                } else {
                    abstractC46623 = abstractC46622;
                }
                this.f17770.add(abstractC46623);
            }
            c02922 = new AbstractC3928.C0292(new AbstractC7643.C7648(c0292), abstractC4662M21597);
            abstractC46622 = c02922;
            if (z) {
            }
            this.f17770.add(abstractC46623);
        }
        c0292 = new AbstractC3928.C0292(this.f17770);
        abstractC4662 = c0292;
        z = false;
        this.f17770.clear();
        if (c == ' ') {
        }
        abstractC46622 = c02922;
        if (z) {
        }
        this.f17770.add(abstractC46623);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final AbstractC4662 m21601() {
        if (this.f2353.m24991("#")) {
            return m21598();
        }
        if (this.f2353.m24991(".")) {
            return m3300();
        }
        if (this.f2353.m24997() || this.f2353.m24992("*|")) {
            return m21599();
        }
        if (this.f2353.m24992("[")) {
            return m3299();
        }
        if (this.f2353.m24991(InterfaceC5949.f14892)) {
            return new AbstractC4662.C0466();
        }
        if (this.f2353.m24991(":")) {
            return m21615();
        }
        throw new C7293.C1224("Could not parse query '%s': unexpected token at '%s'", this.f2354, this.f2353.m24998());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m21602() {
        String strTrim = m21603().trim();
        C8159.m26904(C7615.m23817(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String m21603() {
        return this.f2353.m24977('(', ')');
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m21604() {
        StringBuilder sbM3765 = C7615.m3765();
        boolean z = false;
        while (!this.f2353.m24990()) {
            if (!this.f2353.m24993(f17765)) {
                if (this.f2353.m24992("(")) {
                    sbM3765.append("(");
                    sbM3765.append(this.f2353.m24977('(', ')'));
                    sbM3765.append(")");
                } else if (this.f2353.m24992("[")) {
                    sbM3765.append("[");
                    sbM3765.append(this.f2353.m24977(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, ']'));
                    sbM3765.append("]");
                } else {
                    sbM3765.append(this.f2353.m24980());
                }
                z = true;
            } else {
                if (z) {
                    break;
                }
                sbM3765.append(this.f2353.m24980());
            }
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final AbstractC4662 m21605(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String strM24976 = C7863.m24976(m21603());
        C8159.m26908(strM24976, str + "(text) query must not be empty");
        return z ? new AbstractC4662.C4673(strM24976) : new AbstractC4662.C4674(strM24976);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final AbstractC4662 m21606() {
        String strM24976 = C7863.m24976(m21603());
        C8159.m26908(strM24976, ":containsData(text) query must not be empty");
        return new AbstractC4662.C4672(strM24976);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final AbstractC4662 m21607(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String strM24976 = C7863.m24976(m21603());
        C8159.m26908(strM24976, str + "(text) query must not be empty");
        return z ? new AbstractC4662.C4675(strM24976) : new AbstractC4662.C4676(strM24976);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final AbstractC4662 m21608(boolean z, boolean z2) {
        String strM2840 = C6396.m2840(m21603());
        Matcher matcher = f17767.matcher(strM2840);
        Matcher matcher2 = f17768.matcher(strM2840);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(strM2840)) {
            if ("even".equals(strM2840)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i3;
            } else {
                if (!matcher2.matches()) {
                    throw new C7293.C1224("Could not parse nth-index '%s': unexpected format", strM2840);
                }
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            }
        }
        return z2 ? z ? new AbstractC4662.C4690(i, i2) : new AbstractC4662.C4691(i, i2) : z ? new AbstractC4662.C4689(i, i2) : new AbstractC4662.C4688(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final AbstractC4662 m21609() {
        String strM21603 = m21603();
        C8159.m26908(strM21603, ":has(selector) sub-select must not be empty");
        return new AbstractC7643.C1314(m21597(strM21603));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final AbstractC4662 m21610() {
        String strM21603 = m21603();
        C8159.m26908(strM21603, ":is(selector) sub-select must not be empty");
        return new AbstractC7643.C7646(m21597(strM21603));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final AbstractC4662 m21611(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String strM21603 = m21603();
        C8159.m26908(strM21603, str + "(regex) query must not be empty");
        return z ? new AbstractC4662.C4697(Pattern.compile(strM21603)) : new AbstractC4662.C4696(Pattern.compile(strM21603));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final AbstractC4662 m21612(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strM21603 = m21603();
        C8159.m26908(strM21603, str + "(regex) query must not be empty");
        return z ? new AbstractC4662.C4698(Pattern.compile(strM21603)) : new AbstractC4662.C4699(Pattern.compile(strM21603));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final AbstractC4662 m21613() {
        String strM21603 = m21603();
        C8159.m26908(strM21603, ":not(selector) subselect must not be empty");
        return new AbstractC7643.C7647(m21597(strM21603));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public AbstractC4662 m21614() {
        this.f2353.m24988();
        if (this.f2353.m24993(f17765)) {
            this.f17770.add(new AbstractC7643.C7650());
            m21600(this.f2353.m24980());
        } else {
            this.f17770.add(m21601());
        }
        while (!this.f2353.m24990()) {
            boolean zM24988 = this.f2353.m24988();
            if (this.f2353.m24993(f17765)) {
                m21600(this.f2353.m24980());
            } else if (zM24988) {
                m21600(' ');
            } else {
                this.f17770.add(m21601());
            }
        }
        return this.f17770.size() == 1 ? this.f17770.get(0) : new AbstractC3928.C0292(this.f17770);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final AbstractC4662 m21615() {
        String strM24982 = this.f2353.m24982();
        strM24982.hashCode();
        byte b = -1;
        switch (strM24982.hashCode()) {
            case -2141736343:
                if (strM24982.equals("containsData")) {
                    b = 0;
                }
                break;
            case -2136991809:
                if (strM24982.equals("first-child")) {
                    b = 1;
                }
                break;
            case -1939921007:
                if (strM24982.equals("matchesWholeText")) {
                    b = 2;
                }
                break;
            case -1754914063:
                if (strM24982.equals("nth-child")) {
                    b = 3;
                }
                break;
            case -1629748624:
                if (strM24982.equals("nth-last-child")) {
                    b = 4;
                }
                break;
            case -947996741:
                if (strM24982.equals("only-child")) {
                    b = 5;
                }
                break;
            case -897532411:
                if (strM24982.equals("nth-of-type")) {
                    b = 6;
                }
                break;
            case -872629820:
                if (strM24982.equals("nth-last-of-type")) {
                    b = 7;
                }
                break;
            case -567445985:
                if (strM24982.equals("contains")) {
                    b = 8;
                }
                break;
            case -55413797:
                if (strM24982.equals("containsWholeOwnText")) {
                    b = 9;
                }
                break;
            case 3244:
                if (strM24982.equals("eq")) {
                    b = 10;
                }
                break;
            case 3309:
                if (strM24982.equals("gt")) {
                    b = 11;
                }
                break;
            case 3370:
                if (strM24982.equals("is")) {
                    b = 12;
                }
                break;
            case 3464:
                if (strM24982.equals("lt")) {
                    b = 13;
                }
                break;
            case 103066:
                if (strM24982.equals("has")) {
                    b = 14;
                }
                break;
            case 109267:
                if (strM24982.equals("not")) {
                    b = 15;
                }
                break;
            case 3506402:
                if (strM24982.equals("root")) {
                    b = BaseType.Union;
                }
                break;
            case 96634189:
                if (strM24982.equals("empty")) {
                    b = BaseType.Array;
                }
                break;
            case 208017639:
                if (strM24982.equals("containsOwn")) {
                    b = BaseType.Vector64;
                }
                break;
            case 614017170:
                if (strM24982.equals("matchText")) {
                    b = BaseType.MaxBaseType;
                }
                break;
            case 835834661:
                if (strM24982.equals("last-child")) {
                    b = 20;
                }
                break;
            case 840862003:
                if (strM24982.equals("matches")) {
                    b = 21;
                }
                break;
            case 1255901423:
                if (strM24982.equals("matchesWholeOwnText")) {
                    b = 22;
                }
                break;
            case 1292941139:
                if (strM24982.equals("first-of-type")) {
                    b = 23;
                }
                break;
            case 1455900751:
                if (strM24982.equals("only-of-type")) {
                    b = 24;
                }
                break;
            case 1870740819:
                if (strM24982.equals("matchesOwn")) {
                    b = 25;
                }
                break;
            case 2014184485:
                if (strM24982.equals("containsWholeText")) {
                    b = 26;
                }
                break;
            case 2025926969:
                if (strM24982.equals("last-of-type")) {
                    b = 27;
                }
                break;
        }
        switch (b) {
            case 0:
                return m21606();
            case 1:
                return new AbstractC4662.C4684();
            case 2:
                return m21612(false);
            case 3:
                return m21608(false, false);
            case 4:
                return m21608(true, false);
            case 5:
                return new AbstractC4662.C4692();
            case 6:
                return m21608(false, true);
            case 7:
                return m21608(true, true);
            case 8:
                return m21605(false);
            case 9:
                return m21607(true);
            case 10:
                return new AbstractC4662.C4679(m21602());
            case 11:
                return new AbstractC4662.C4681(m21602());
            case 12:
                return m21610();
            case 13:
                return new AbstractC4662.C4682(m21602());
            case 14:
                return m21609();
            case 15:
                return m21613();
            case 16:
                return new AbstractC4662.C4694();
            case 17:
                return new AbstractC4662.C4683();
            case 18:
                return m21605(true);
            case 19:
                return new AbstractC4662.C4695();
            case 20:
                return new AbstractC4662.C4686();
            case 21:
                return m21611(false);
            case 22:
                return m21612(true);
            case 23:
                return new AbstractC4662.C4685();
            case 24:
                return new AbstractC4662.C4693();
            case 25:
                return m21611(true);
            case 26:
                return m21607(false);
            case 27:
                return new AbstractC4662.C4687();
            default:
                throw new C7293.C1224("Could not parse query '%s': unexpected token at '%s'", this.f2354, this.f2353.m24998());
        }
    }
}
