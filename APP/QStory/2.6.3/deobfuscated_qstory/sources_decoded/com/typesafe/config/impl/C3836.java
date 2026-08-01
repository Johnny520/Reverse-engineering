package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0064;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import com.typesafe.config.impl.ConfigString;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p053.AbstractC6561;
import p250.InterfaceC8161;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3836 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3838 f12043;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f12045;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedList f12046;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0064 f12047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final StringReader f12048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3838 f12050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedList f12049 = new LinkedList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12044 = 1;

    public C3836(InterfaceC8161 interfaceC8161, StringReader stringReader, boolean z) {
        C3838 c3838 = (C3838) interfaceC8161;
        this.f12050 = c3838;
        this.f12048 = stringReader;
        this.f12045 = z;
        this.f12043 = c3838.m8211(1);
        LinkedList linkedList = new LinkedList();
        this.f12046 = linkedList;
        linkedList.add(AbstractC3822.f12019);
        this.f12047 = new C0064(2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Tokenizer$ProblemException m8199(C3838 c3838, String str, String str2, boolean z, Throwable th) {
        C3837 c3837 = AbstractC3822.f12019;
        return new Tokenizer$ProblemException(new C3828(c3838, str, str2, z, th));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f12046.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        LinkedList linkedList = this.f12046;
        C3837 c3837 = (C3837) linkedList.remove();
        if (linkedList.isEmpty() && c3837 != AbstractC3822.f12018) {
            try {
                C0064 c0064 = this.f12047;
                C3837 c3837M8202 = m8202(c0064);
                C3837 c3837M191 = c0064.m191(c3837M8202, this.f12050, this.f12044);
                if (c3837M191 != null) {
                    linkedList.add(c3837M191);
                }
                linkedList.add(c3837M8202);
            } catch (Tokenizer$ProblemException e) {
                linkedList.add(e.problem());
            }
            if (linkedList.isEmpty()) {
                C2942.m6408("bug: tokens queue should not be empty here");
                return null;
            }
        }
        return c3837;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Does not make sense to remove items from token stream");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m8200(int i) {
        if (i != -1 && this.f12045) {
            if (i == 35) {
                return true;
            }
            if (i == 47) {
                int iM8203 = m8203();
                m8201(iM8203);
                if (iM8203 == 47) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8201(int i) {
        LinkedList linkedList = this.f12049;
        if (linkedList.size() <= 2) {
            linkedList.push(Integer.valueOf(i));
        } else {
            C2942.m6408("bug: putBack() three times, undesirable look-ahead");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3837 m8202(C0064 c0064) throws Tokenizer$ProblemException {
        int iM8203;
        C3837 c3824;
        int i;
        boolean z;
        int iM82032;
        while (true) {
            iM8203 = m8203();
            if (iM8203 == -1) {
                iM8203 = -1;
                break;
            }
            if (iM8203 == 10 || !AbstractC3864.m8248(iM8203)) {
                break;
            }
            ((StringBuilder) c0064.f139).appendCodePoint(iM8203);
        }
        if (iM8203 == -1) {
            return AbstractC3822.f12018;
        }
        C3838 c3838 = this.f12050;
        boolean z2 = true;
        if (iM8203 == 10) {
            C3838 c38382 = this.f12043;
            C3837 c3837 = AbstractC3822.f12019;
            C3825 c3825 = new C3825(TokenType.NEWLINE, c38382, null, null);
            int i2 = this.f12044 + 1;
            this.f12044 = i2;
            this.f12043 = c3838.m8211(i2);
            return c3825;
        }
        if (m8200(iM8203)) {
            if (iM8203 != 47) {
                z2 = false;
            } else if (m8203() != 47) {
                C2942.m6408("called pullComment but // not seen");
                return null;
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                iM82032 = m8203();
                if (iM82032 == -1 || iM82032 == 10) {
                    break;
                }
                sb.appendCodePoint(iM82032);
            }
            m8201(iM82032);
            C3838 c38383 = this.f12043;
            if (z2) {
                String string = sb.toString();
                C3837 c38372 = AbstractC3822.f12019;
                return new C3835(c38383, string);
            }
            String string2 = sb.toString();
            C3837 c38373 = AbstractC3822.f12019;
            return new C3835(c38383, string2);
        }
        int i3 = 4;
        if (iM8203 == 34) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.appendCodePoint(34);
            while (true) {
                int iM82033 = m8203();
                if (iM82033 == -1) {
                    throw m8199(this.f12043, "", "End of input but string quote was still open", false, null);
                }
                if (iM82033 == 92) {
                    int iM82034 = m8203();
                    if (iM82034 == -1) {
                        throw m8199(this.f12043, "", "End of input but backslash in string had nothing after it", false, null);
                    }
                    sb3.appendCodePoint(92);
                    sb3.appendCodePoint(iM82034);
                    if (iM82034 == 34) {
                        sb2.append('\"');
                    } else if (iM82034 == 47) {
                        sb2.append('/');
                    } else if (iM82034 == 92) {
                        sb2.append('\\');
                    } else if (iM82034 == 98) {
                        sb2.append('\b');
                    } else if (iM82034 == 102) {
                        sb2.append('\f');
                    } else if (iM82034 == 110) {
                        sb2.append('\n');
                    } else if (iM82034 == 114) {
                        sb2.append('\r');
                    } else if (iM82034 == 116) {
                        sb2.append('\t');
                    } else {
                        if (iM82034 != 117) {
                            throw m8199(this.f12043, AbstractC6561.m12053(iM82034), AbstractC0053.m158("backslash followed by '", AbstractC6561.m12053(iM82034), "', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)"), false, null);
                        }
                        char[] cArr = new char[i3];
                        int i4 = 0;
                        while (i4 < i3) {
                            int iM82035 = m8203();
                            if (iM82035 == -1) {
                                throw m8199(this.f12043, "", "End of input but expecting 4 hex digits for \\uXXXX escape", false, null);
                            }
                            cArr[i4] = (char) iM82035;
                            i4++;
                            i3 = 4;
                        }
                        String str = new String(cArr);
                        sb3.append(cArr);
                        try {
                            sb2.appendCodePoint(Integer.parseInt(str, 16));
                        } catch (NumberFormatException e) {
                            throw m8199(this.f12043, str, AbstractC0053.m158("Malformed hex digits after \\u escape in string: '", str, "'"), false, e);
                        }
                    }
                    i = 4;
                } else if (iM82033 == 34) {
                    sb3.appendCodePoint(iM82033);
                    if (sb2.length() == 0) {
                        int iM82036 = m8203();
                        if (iM82036 == 34) {
                            sb3.appendCodePoint(iM82036);
                            int i5 = 0;
                            while (true) {
                                int iM82037 = m8203();
                                if (iM82037 == 34) {
                                    i5++;
                                } else {
                                    if (i5 >= 3) {
                                        sb2.setLength(sb2.length() - 3);
                                        m8201(iM82037);
                                        break;
                                    }
                                    if (iM82037 == -1) {
                                        throw m8199(this.f12043, "", "End of input but triple-quoted string was still open", false, null);
                                    }
                                    if (iM82037 == 10) {
                                        int i6 = this.f12044 + 1;
                                        this.f12044 = i6;
                                        this.f12043 = c3838.m8211(i6);
                                    }
                                    i5 = 0;
                                }
                                sb2.appendCodePoint(iM82037);
                                sb3.appendCodePoint(iM82037);
                            }
                        } else {
                            m8201(iM82036);
                        }
                    }
                    C3838 c38384 = this.f12043;
                    String string3 = sb2.toString();
                    String string4 = sb3.toString();
                    C3837 c38374 = AbstractC3822.f12019;
                    c3824 = new C3824(new ConfigString.Quoted(c38384, string3), string4);
                } else {
                    i = 4;
                    if (iM82033 >= 0 && iM82033 <= 31) {
                        throw m8199(this.f12043, AbstractC6561.m12053(iM82033), "JSON does not allow unescaped " + AbstractC6561.m12053(iM82033) + " in quoted strings, use a backslash escape", false, null);
                    }
                    sb2.appendCodePoint(iM82033);
                    sb3.appendCodePoint(iM82033);
                }
                i3 = i;
            }
        } else if (iM8203 == 36) {
            C3838 c38385 = this.f12043;
            int iM82038 = m8203();
            if (iM82038 != 123) {
                throw m8199(this.f12043, AbstractC6561.m12053(iM82038), "'$' not followed by {, '" + AbstractC6561.m12053(iM82038) + "' not allowed after '$'", true, null);
            }
            int iM82039 = m8203();
            if (iM82039 == 63) {
                z = true;
            } else {
                m8201(iM82039);
                z = false;
            }
            C0064 c00642 = new C0064(2);
            ArrayList arrayList = new ArrayList();
            while (true) {
                C3837 c3837M8202 = m8202(c00642);
                if (c3837M8202 == AbstractC3822.f12021) {
                    c3824 = new C3827(c38385, z, arrayList);
                    break;
                }
                if (c3837M8202 == AbstractC3822.f12018) {
                    throw m8199(c38385, "", "Substitution ${ was not closed with a }", false, null);
                }
                C3837 c3837M191 = c00642.m191(c3837M8202, c38385, this.f12044);
                if (c3837M191 != null) {
                    arrayList.add(c3837M191);
                }
                arrayList.add(c3837M8202);
            }
        } else if (iM8203 == 58) {
            c3824 = AbstractC3822.f12015;
        } else if (iM8203 == 61) {
            c3824 = AbstractC3822.f12016;
        } else if (iM8203 == 91) {
            c3824 = AbstractC3822.f12020;
        } else if (iM8203 == 93) {
            c3824 = AbstractC3822.f12022;
        } else if (iM8203 == 123) {
            c3824 = AbstractC3822.f12014;
        } else if (iM8203 == 125) {
            c3824 = AbstractC3822.f12021;
        } else if (iM8203 != 43) {
            c3824 = iM8203 != 44 ? null : AbstractC3822.f12017;
        } else {
            int iM820310 = m8203();
            if (iM820310 != 61) {
                throw m8199(this.f12043, AbstractC6561.m12053(iM820310), "'+' not followed by =, '" + AbstractC6561.m12053(iM820310) + "' not allowed after '+'", true, null);
            }
            c3824 = AbstractC3822.f12023;
        }
        if (c3824 != null) {
            return c3824;
        }
        if ("0123456789-".indexOf(iM8203) < 0) {
            if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(iM8203) >= 0) {
                throw m8199(this.f12043, AbstractC6561.m12053(iM8203), "Reserved character '" + AbstractC6561.m12053(iM8203) + "' is not allowed outside quotes", true, null);
            }
            m8201(iM8203);
            C3838 c38386 = this.f12043;
            StringBuilder sb4 = new StringBuilder();
            int iM820311 = m8203();
            while (iM820311 != -1 && "$\"{}[]:=,+#`^?!@*&\\".indexOf(iM820311) < 0 && !AbstractC3864.m8248(iM820311) && !m8200(iM820311)) {
                sb4.appendCodePoint(iM820311);
                if (sb4.length() == 4) {
                    String string5 = sb4.toString();
                    if (string5.equals("true")) {
                        C3837 c38375 = AbstractC3822.f12019;
                        return new C3824(new ConfigBoolean(c38386, true), "true");
                    }
                    if (string5.equals("null")) {
                        C3837 c38376 = AbstractC3822.f12019;
                        return new C3824(new ConfigNull(c38386), "null");
                    }
                } else if (sb4.length() == 5 && sb4.toString().equals("false")) {
                    C3837 c38377 = AbstractC3822.f12019;
                    return new C3824(new ConfigBoolean(c38386, false), "false");
                }
                iM820311 = m8203();
            }
            m8201(iM820311);
            String string6 = sb4.toString();
            C3837 c38378 = AbstractC3822.f12019;
            return new C3823(c38386, string6);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.appendCodePoint(iM8203);
        int iM820312 = m8203();
        boolean z3 = false;
        while (iM820312 != -1 && "0123456789eE+-.".indexOf(iM820312) >= 0) {
            if (iM820312 == 46 || iM820312 == 101 || iM820312 == 69) {
                z3 = true;
            }
            sb5.appendCodePoint(iM820312);
            iM820312 = m8203();
        }
        m8201(iM820312);
        String string7 = sb5.toString();
        C3838 c38387 = this.f12043;
        try {
            if (z3) {
                double d = Double.parseDouble(string7);
                C3837 c38379 = AbstractC3822.f12019;
                return new C3824(ConfigNumber.newNumber(c38387, d, string7), string7);
            }
            long j = Long.parseLong(string7);
            C3837 c383710 = AbstractC3822.f12019;
            return new C3824(ConfigNumber.newNumber((InterfaceC8161) c38387, j, string7), string7);
        } catch (NumberFormatException unused) {
            for (char c : string7.toCharArray()) {
                if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(c) >= 0) {
                    throw m8199(this.f12043, AbstractC6561.m12053(c), "Reserved character '" + AbstractC6561.m12053(c) + "' is not allowed outside quotes", true, null);
                }
            }
            C3838 c38388 = this.f12043;
            C3837 c383711 = AbstractC3822.f12019;
            return new C3823(c38388, string7);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8203() {
        LinkedList linkedList = this.f12049;
        if (!linkedList.isEmpty()) {
            return ((Integer) linkedList.pop()).intValue();
        }
        try {
            return this.f12048.read();
        } catch (IOException e) {
            throw new ConfigException.IO(this.f12050, "read error: " + e.getMessage(), e);
        }
    }
}
