package yyds;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛳᲁᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final InterfaceC0732 f3353 = AbstractC1090.m2298(C0711.class);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C0394 f3354;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m1622(char c) {
        return c == '<' || c == '>' || c == '=' || c == '~' || c == '!';
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0696 m1623() {
        boolean z;
        int iM1116;
        C0394 c0394 = this.f3354;
        int i = c0394.f2030;
        CharSequence charSequence = (CharSequence) c0394.f2032;
        int iM11162 = c0394.m1116(i);
        char cCharAt = iM11162 == -1 ? ' ' : charSequence.charAt(iM11162);
        int i2 = c0394.f2030;
        c0394.m1128(1);
        while (c0394.m1117(c0394.f2030)) {
            if (c0394.m1118() == '[') {
                int iM1122 = c0394.m1122(c0394.f2030, '[', ']', false);
                if (iM1122 == -1) {
                    C0188.m805(c0394, "Square brackets does not match in filter ");
                    return null;
                }
                c0394.f2030 = iM1122 + 1;
            }
            if (c0394.m1118() == ')' && c0394.m1118() == ')' && (iM1116 = c0394.m1116(c0394.f2030)) != -1 && charSequence.charAt(iM1116) == '(') {
                do {
                    iM1116--;
                    if (!c0394.m1117(iM1116) || iM1116 <= i2) {
                        z = false;
                        break;
                    }
                } while (charSequence.charAt(iM1116) != '.');
                z = true;
                if (c0394.m1118() == ')') {
                    if (!c0394.m1117(c0394.f2030)) {
                        break;
                    }
                    break;
                }
            } else {
                z = false;
                boolean z2 = (c0394.m1118() == ')' || z) ? false : true;
                if (!c0394.m1117(c0394.f2030) || m1622(c0394.m1118()) || c0394.m1118() == ' ' || z2) {
                    break;
                }
                c0394.m1128(1);
            }
        }
        return new C0696(charSequence.subSequence(i2, c0394.f2030), cCharAt != '!');
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final EnumC1452 m1624() {
        C0394 c0394 = this.f3354;
        c0394.m1127();
        int i = c0394.f2030;
        if (m1622(c0394.m1118())) {
            while (c0394.m1117(c0394.f2030) && m1622(c0394.m1118())) {
                c0394.m1128(1);
            }
        } else {
            while (c0394.m1117(c0394.f2030) && c0394.m1118() != ' ') {
                c0394.m1128(1);
            }
        }
        CharSequence charSequenceSubSequence = ((CharSequence) c0394.f2032).subSequence(i, c0394.f2030);
        f3353.mo1685("Operator from {} to {} -> [{}]", Integer.valueOf(i), Integer.valueOf(c0394.f2030 - 1), charSequenceSubSequence);
        String string = charSequenceSubSequence.toString();
        String upperCase = string.toUpperCase(Locale.ROOT);
        for (EnumC1452 enumC1452 : EnumC1452.values()) {
            if (enumC1452.f6935.equals(upperCase)) {
                return enumC1452;
            }
        }
        throw new C2569(AbstractC2104.m4014("Filter operator ", string, " is not supported!"));
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractC2703 m1625() {
        C0394 c0394 = this.f3354;
        c0394.m1127();
        int i = c0394.f2030;
        c0394.m1127();
        if (c0394.m1120('!')) {
            c0394.m1119('!');
            c0394.m1127();
            char cM1118 = c0394.m1118();
            if (cM1118 != '$' && cM1118 != '@') {
                return new C1515(m1625());
            }
            c0394.f2030 = i;
        }
        c0394.m1127();
        if (c0394.m1120('(')) {
            c0394.m1119('(');
            AbstractC2703 abstractC2703M1631 = m1631();
            c0394.m1119(')');
            return abstractC2703M1631;
        }
        AbstractC2019 abstractC2019M1628 = m1628();
        try {
            return new C2461(abstractC2019M1628, m1624(), m1628());
        } catch (C2569 unused) {
            c0394.f2030 = c0394.f2030;
            C0696 c0696Mo1615 = abstractC2019M1628.mo1615();
            boolean z = c0696Mo1615.f3288;
            return new C2461(new C0696(c0696Mo1615.f3289, true, z), EnumC1452.EXISTS, z ? InterfaceC0540.f2595 : InterfaceC0540.f2596);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1935 m1626() {
        C0394 c0394 = this.f3354;
        int i = c0394.f2030;
        char cM1118 = c0394.m1118();
        int i2 = c0394.f2030;
        int i3 = cM1118 == 't' ? i2 + 3 : i2 + 4;
        if (!c0394.m1117(i3)) {
            throw new C2569("Expected boolean literal");
        }
        CharSequence charSequenceSubSequence = ((CharSequence) c0394.f2032).subSequence(i, i3 + 1);
        if (!charSequenceSubSequence.equals("true") && !charSequenceSubSequence.equals("false")) {
            throw new C2569("Expected boolean literal");
        }
        c0394.m1128(charSequenceSubSequence.length());
        f3353.mo1685("BooleanLiteral from {} to {} -> [{}]", Integer.valueOf(i), Integer.valueOf(i3), charSequenceSubSequence);
        return Boolean.parseBoolean(charSequenceSubSequence.toString()) ? InterfaceC0540.f2595 : InterfaceC0540.f2596;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1704 m1627() {
        C0394 c0394 = this.f3354;
        int i = c0394.f2030;
        CharSequence charSequence = (CharSequence) c0394.f2032;
        while (c0394.m1117(c0394.f2030)) {
            char cCharAt = charSequence.charAt(c0394.f2030);
            if (!Character.isDigit(cCharAt) && cCharAt != '-' && cCharAt != '.' && cCharAt != 'E' && cCharAt != 'e') {
                break;
            }
            c0394.m1128(1);
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, c0394.f2030);
        f3353.mo1685("NumberLiteral from {} to {} -> [{}]", Integer.valueOf(i), Integer.valueOf(c0394.f2030), charSequenceSubSequence);
        return new C1704(charSequenceSubSequence);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final AbstractC2019 m1628() {
        C0394 c0394 = this.f3354;
        c0394.m1127();
        char cM1118 = c0394.m1118();
        if (cM1118 == '!') {
            c0394.m1128(1);
            c0394.m1127();
            char cM11182 = c0394.m1118();
            if (cM11182 == '$') {
                return m1623();
            }
            if (cM11182 == '@') {
                return m1623();
            }
            throw new C2569(String.format("Unexpected character: %c", '!'));
        }
        if (cM1118 == '$') {
            return m1623();
        }
        if (cM1118 == '@') {
            return m1623();
        }
        c0394.m1127();
        CharSequence charSequence = (CharSequence) c0394.f2032;
        char cM11183 = c0394.m1118();
        if (cM11183 == '\"') {
            return m1629('\"');
        }
        if (cM11183 == '\'') {
            return m1629('\'');
        }
        if (cM11183 == '-') {
            return m1627();
        }
        InterfaceC0732 interfaceC0732 = f3353;
        if (cM11183 != '/') {
            if (cM11183 == '[') {
                return m1630();
            }
            if (cM11183 == 'f') {
                return m1626();
            }
            if (cM11183 != 'n') {
                return cM11183 != 't' ? cM11183 != '{' ? m1627() : m1630() : m1626();
            }
            int i = c0394.f2030;
            if (c0394.m1118() == 'n' && c0394.m1117(c0394.f2030 + 3)) {
                int i2 = c0394.f2030;
                CharSequence charSequenceSubSequence = charSequence.subSequence(i2, i2 + 4);
                if ("null".equals(charSequenceSubSequence.toString())) {
                    interfaceC0732.mo1685("NullLiteral from {} to {} -> [{}]", Integer.valueOf(i), Integer.valueOf(c0394.f2030 + 3), charSequenceSubSequence);
                    c0394.m1128(charSequenceSubSequence.length());
                    return InterfaceC0540.f2594;
                }
            }
            throw new C2569("Expected <null> value");
        }
        int i3 = c0394.f2030;
        int iM1124 = c0394.m1124('/', i3);
        if (iM1124 == -1) {
            C0188.m805(c0394, "Pattern not closed. Expected / in ");
            return null;
        }
        int i4 = iM1124 + 1;
        if (c0394.m1117(i4)) {
            int i5 = i4;
            while (c0394.m1117(i5) && AbstractC0897.m2003(new char[]{charSequence.charAt(i5)}) > 0) {
                i5++;
            }
            if (i5 > iM1124) {
                iM1124 += charSequence.subSequence(i4, i5).length();
            }
        }
        int i6 = iM1124 + 1;
        c0394.f2030 = i6;
        CharSequence charSequenceSubSequence2 = charSequence.subSequence(i3, i6);
        interfaceC0732.mo1685("PatternNode from {} to {} -> [{}]", Integer.valueOf(i3), Integer.valueOf(c0394.f2030), charSequenceSubSequence2);
        return new C0917(charSequenceSubSequence2);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2114 m1629(char c) {
        C0394 c0394 = this.f3354;
        int i = c0394.f2030;
        int iM1124 = c0394.m1124(c, i);
        if (iM1124 == -1) {
            throw new C2569("String literal does not have matching quotes. Expected " + c + " in " + c0394);
        }
        int i2 = iM1124 + 1;
        c0394.f2030 = i2;
        CharSequence charSequenceSubSequence = ((CharSequence) c0394.f2032).subSequence(i, i2);
        f3353.mo1685("StringLiteral from {} to {} -> [{}]", Integer.valueOf(i), Integer.valueOf(c0394.f2030), charSequenceSubSequence);
        return new C2114(charSequenceSubSequence, true);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1314 m1630() {
        C0394 c0394 = this.f3354;
        int i = c0394.f2030;
        char cM1118 = c0394.m1118();
        int iM1122 = c0394.m1122(c0394.f2030, cM1118, cM1118 == '[' ? ']' : '}', false);
        if (iM1122 == -1) {
            C0188.m805(c0394, "String not closed. Expected ' in ");
            return null;
        }
        int i2 = iM1122 + 1;
        c0394.f2030 = i2;
        CharSequence charSequenceSubSequence = ((CharSequence) c0394.f2032).subSequence(i, i2);
        f3353.mo1685("JsonLiteral from {} to {} -> [{}]", Integer.valueOf(i), Integer.valueOf(c0394.f2030), charSequenceSubSequence);
        return new C1314(charSequenceSubSequence);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final AbstractC2703 m1631() {
        int i;
        C0394 c0394 = this.f3354;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m1632());
        while (true) {
            i = c0394.f2030;
            if (!c0394.m1129("||")) {
                break;
            }
            arrayList.add(m1632());
        }
        c0394.f2030 = i;
        return 1 == arrayList.size() ? (AbstractC2703) arrayList.get(0) : new C1515(3, arrayList);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final AbstractC2703 m1632() {
        int i;
        C0394 c0394 = this.f3354;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m1625());
        while (true) {
            i = c0394.f2030;
            if (!c0394.m1129("&&")) {
                break;
            }
            arrayList.add(m1625());
        }
        c0394.f2030 = i;
        return 1 == arrayList.size() ? (AbstractC2703) arrayList.get(0) : new C1515(1, arrayList);
    }
}
