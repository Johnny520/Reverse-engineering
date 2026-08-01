package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0064;
import com.alibaba.fastjson2.C2941;
import com.typesafe.config.ConfigException;
import com.typesafe.config.impl.ConfigString;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p250.InterfaceC8160;
import p253.AbstractC8189;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3835 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3837 f12038;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f12040;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedList f12041;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0064 f12042;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final StringReader f12043;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3837 f12045;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedList f12044 = new LinkedList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12039 = 1;

    public C3835(InterfaceC8160 interfaceC8160, StringReader stringReader, boolean z) {
        C3837 c3837 = (C3837) interfaceC8160;
        this.f12045 = c3837;
        this.f12043 = stringReader;
        this.f12040 = z;
        this.f12038 = c3837.m8224(1);
        LinkedList linkedList = new LinkedList();
        this.f12041 = linkedList;
        linkedList.add(AbstractC3821.f12014);
        this.f12042 = new C0064(2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Tokenizer$ProblemException m8212(C3837 c3837, String str, String str2, boolean z, Throwable th) {
        C3836 c3836 = AbstractC3821.f12014;
        return new Tokenizer$ProblemException(new C3827(c3837, str, str2, z, th));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f12041.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        LinkedList linkedList = this.f12041;
        C3836 c3836 = (C3836) linkedList.remove();
        if (linkedList.isEmpty() && c3836 != AbstractC3821.f12013) {
            try {
                C0064 c0064 = this.f12042;
                C3836 c3836M8215 = m8215(c0064);
                C3836 c3836M190 = c0064.m190(c3836M8215, this.f12045, this.f12039);
                if (c3836M190 != null) {
                    linkedList.add(c3836M190);
                }
                linkedList.add(c3836M8215);
            } catch (Tokenizer$ProblemException e) {
                linkedList.add(e.problem());
            }
            if (linkedList.isEmpty()) {
                C2941.m6350("bug: tokens queue should not be empty here");
                return null;
            }
        }
        return c3836;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Does not make sense to remove items from token stream");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m8213(int i) {
        if (i != -1 && this.f12040) {
            if (i == 35) {
                return true;
            }
            if (i == 47) {
                int iM8216 = m8216();
                m8214(iM8216);
                if (iM8216 == 47) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8214(int i) {
        LinkedList linkedList = this.f12044;
        if (linkedList.size() <= 2) {
            linkedList.push(Integer.valueOf(i));
        } else {
            C2941.m6350("bug: putBack() three times, undesirable look-ahead");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3836 m8215(C0064 c0064) throws Tokenizer$ProblemException {
        int iM8216;
        C3836 c3823;
        int i;
        boolean z;
        int iM82162;
        while (true) {
            iM8216 = m8216();
            if (iM8216 == -1) {
                iM8216 = -1;
                break;
            }
            if (iM8216 == 10 || !AbstractC3863.m8261(iM8216)) {
                break;
            }
            ((StringBuilder) c0064.f139).appendCodePoint(iM8216);
        }
        if (iM8216 == -1) {
            return AbstractC3821.f12013;
        }
        C3837 c3837 = this.f12045;
        boolean z2 = true;
        if (iM8216 == 10) {
            C3837 c38372 = this.f12038;
            C3836 c3836 = AbstractC3821.f12014;
            C3824 c3824 = new C3824(TokenType.NEWLINE, c38372, null, null);
            int i2 = this.f12039 + 1;
            this.f12039 = i2;
            this.f12038 = c3837.m8224(i2);
            return c3824;
        }
        if (m8213(iM8216)) {
            if (iM8216 != 47) {
                z2 = false;
            } else if (m8216() != 47) {
                C2941.m6350("called pullComment but // not seen");
                return null;
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                iM82162 = m8216();
                if (iM82162 == -1 || iM82162 == 10) {
                    break;
                }
                sb.appendCodePoint(iM82162);
            }
            m8214(iM82162);
            C3837 c38373 = this.f12038;
            if (z2) {
                String string = sb.toString();
                C3836 c38362 = AbstractC3821.f12014;
                return new C3834(c38373, string);
            }
            String string2 = sb.toString();
            C3836 c38363 = AbstractC3821.f12014;
            return new C3834(c38373, string2);
        }
        int i3 = 4;
        if (iM8216 == 34) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.appendCodePoint(34);
            while (true) {
                int iM82163 = m8216();
                if (iM82163 == -1) {
                    throw m8212(this.f12038, "", "End of input but string quote was still open", false, null);
                }
                if (iM82163 == 92) {
                    int iM82164 = m8216();
                    if (iM82164 == -1) {
                        throw m8212(this.f12038, "", "End of input but backslash in string had nothing after it", false, null);
                    }
                    sb3.appendCodePoint(92);
                    sb3.appendCodePoint(iM82164);
                    if (iM82164 == 34) {
                        sb2.append('\"');
                    } else if (iM82164 == 47) {
                        sb2.append('/');
                    } else if (iM82164 == 92) {
                        sb2.append('\\');
                    } else if (iM82164 == 98) {
                        sb2.append('\b');
                    } else if (iM82164 == 102) {
                        sb2.append('\f');
                    } else if (iM82164 == 110) {
                        sb2.append('\n');
                    } else if (iM82164 == 114) {
                        sb2.append('\r');
                    } else if (iM82164 == 116) {
                        sb2.append('\t');
                    } else {
                        if (iM82164 != 117) {
                            throw m8212(this.f12038, AbstractC8189.m13671(iM82164), AbstractC0053.m156("backslash followed by '", AbstractC8189.m13671(iM82164), "', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)"), false, null);
                        }
                        char[] cArr = new char[i3];
                        int i4 = 0;
                        while (i4 < i3) {
                            int iM82165 = m8216();
                            if (iM82165 == -1) {
                                throw m8212(this.f12038, "", "End of input but expecting 4 hex digits for \\uXXXX escape", false, null);
                            }
                            cArr[i4] = (char) iM82165;
                            i4++;
                            i3 = 4;
                        }
                        String str = new String(cArr);
                        sb3.append(cArr);
                        try {
                            sb2.appendCodePoint(Integer.parseInt(str, 16));
                        } catch (NumberFormatException e) {
                            throw m8212(this.f12038, str, AbstractC0053.m156("Malformed hex digits after \\u escape in string: '", str, "'"), false, e);
                        }
                    }
                    i = 4;
                } else if (iM82163 == 34) {
                    sb3.appendCodePoint(iM82163);
                    if (sb2.length() == 0) {
                        int iM82166 = m8216();
                        if (iM82166 == 34) {
                            sb3.appendCodePoint(iM82166);
                            int i5 = 0;
                            while (true) {
                                int iM82167 = m8216();
                                if (iM82167 == 34) {
                                    i5++;
                                } else {
                                    if (i5 >= 3) {
                                        sb2.setLength(sb2.length() - 3);
                                        m8214(iM82167);
                                        break;
                                    }
                                    if (iM82167 == -1) {
                                        throw m8212(this.f12038, "", "End of input but triple-quoted string was still open", false, null);
                                    }
                                    if (iM82167 == 10) {
                                        int i6 = this.f12039 + 1;
                                        this.f12039 = i6;
                                        this.f12038 = c3837.m8224(i6);
                                    }
                                    i5 = 0;
                                }
                                sb2.appendCodePoint(iM82167);
                                sb3.appendCodePoint(iM82167);
                            }
                        } else {
                            m8214(iM82166);
                        }
                    }
                    C3837 c38374 = this.f12038;
                    String string3 = sb2.toString();
                    String string4 = sb3.toString();
                    C3836 c38364 = AbstractC3821.f12014;
                    c3823 = new C3823(new ConfigString.Quoted(c38374, string3), string4);
                } else {
                    i = 4;
                    if (iM82163 >= 0 && iM82163 <= 31) {
                        throw m8212(this.f12038, AbstractC8189.m13671(iM82163), "JSON does not allow unescaped " + AbstractC8189.m13671(iM82163) + " in quoted strings, use a backslash escape", false, null);
                    }
                    sb2.appendCodePoint(iM82163);
                    sb3.appendCodePoint(iM82163);
                }
                i3 = i;
            }
        } else if (iM8216 == 36) {
            C3837 c38375 = this.f12038;
            int iM82168 = m8216();
            if (iM82168 != 123) {
                throw m8212(this.f12038, AbstractC8189.m13671(iM82168), "'$' not followed by {, '" + AbstractC8189.m13671(iM82168) + "' not allowed after '$'", true, null);
            }
            int iM82169 = m8216();
            if (iM82169 == 63) {
                z = true;
            } else {
                m8214(iM82169);
                z = false;
            }
            C0064 c00642 = new C0064(2);
            ArrayList arrayList = new ArrayList();
            while (true) {
                C3836 c3836M8215 = m8215(c00642);
                if (c3836M8215 == AbstractC3821.f12016) {
                    c3823 = new C3826(c38375, z, arrayList);
                    break;
                }
                if (c3836M8215 == AbstractC3821.f12013) {
                    throw m8212(c38375, "", "Substitution ${ was not closed with a }", false, null);
                }
                C3836 c3836M190 = c00642.m190(c3836M8215, c38375, this.f12039);
                if (c3836M190 != null) {
                    arrayList.add(c3836M190);
                }
                arrayList.add(c3836M8215);
            }
        } else if (iM8216 == 58) {
            c3823 = AbstractC3821.f12010;
        } else if (iM8216 == 61) {
            c3823 = AbstractC3821.f12011;
        } else if (iM8216 == 91) {
            c3823 = AbstractC3821.f12015;
        } else if (iM8216 == 93) {
            c3823 = AbstractC3821.f12017;
        } else if (iM8216 == 123) {
            c3823 = AbstractC3821.f12009;
        } else if (iM8216 == 125) {
            c3823 = AbstractC3821.f12016;
        } else if (iM8216 != 43) {
            c3823 = iM8216 != 44 ? null : AbstractC3821.f12012;
        } else {
            int iM821610 = m8216();
            if (iM821610 != 61) {
                throw m8212(this.f12038, AbstractC8189.m13671(iM821610), "'+' not followed by =, '" + AbstractC8189.m13671(iM821610) + "' not allowed after '+'", true, null);
            }
            c3823 = AbstractC3821.f12018;
        }
        if (c3823 != null) {
            return c3823;
        }
        if ("0123456789-".indexOf(iM8216) < 0) {
            if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(iM8216) >= 0) {
                throw m8212(this.f12038, AbstractC8189.m13671(iM8216), "Reserved character '" + AbstractC8189.m13671(iM8216) + "' is not allowed outside quotes", true, null);
            }
            m8214(iM8216);
            C3837 c38376 = this.f12038;
            StringBuilder sb4 = new StringBuilder();
            int iM821611 = m8216();
            while (iM821611 != -1 && "$\"{}[]:=,+#`^?!@*&\\".indexOf(iM821611) < 0 && !AbstractC3863.m8261(iM821611) && !m8213(iM821611)) {
                sb4.appendCodePoint(iM821611);
                if (sb4.length() == 4) {
                    String string5 = sb4.toString();
                    if (string5.equals("true")) {
                        C3836 c38365 = AbstractC3821.f12014;
                        return new C3823(new ConfigBoolean(c38376, true), "true");
                    }
                    if (string5.equals("null")) {
                        C3836 c38366 = AbstractC3821.f12014;
                        return new C3823(new ConfigNull(c38376), "null");
                    }
                } else if (sb4.length() == 5 && sb4.toString().equals("false")) {
                    C3836 c38367 = AbstractC3821.f12014;
                    return new C3823(new ConfigBoolean(c38376, false), "false");
                }
                iM821611 = m8216();
            }
            m8214(iM821611);
            String string6 = sb4.toString();
            C3836 c38368 = AbstractC3821.f12014;
            return new C3822(c38376, string6);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.appendCodePoint(iM8216);
        int iM821612 = m8216();
        boolean z3 = false;
        while (iM821612 != -1 && "0123456789eE+-.".indexOf(iM821612) >= 0) {
            if (iM821612 == 46 || iM821612 == 101 || iM821612 == 69) {
                z3 = true;
            }
            sb5.appendCodePoint(iM821612);
            iM821612 = m8216();
        }
        m8214(iM821612);
        String string7 = sb5.toString();
        C3837 c38377 = this.f12038;
        try {
            if (z3) {
                double d = Double.parseDouble(string7);
                C3836 c38369 = AbstractC3821.f12014;
                return new C3823(ConfigNumber.newNumber(c38377, d, string7), string7);
            }
            long j = Long.parseLong(string7);
            C3836 c383610 = AbstractC3821.f12014;
            return new C3823(ConfigNumber.newNumber((InterfaceC8160) c38377, j, string7), string7);
        } catch (NumberFormatException unused) {
            for (char c : string7.toCharArray()) {
                if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(c) >= 0) {
                    throw m8212(this.f12038, AbstractC8189.m13671(c), "Reserved character '" + AbstractC8189.m13671(c) + "' is not allowed outside quotes", true, null);
                }
            }
            C3837 c38378 = this.f12038;
            C3836 c383611 = AbstractC3821.f12014;
            return new C3822(c38378, string7);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8216() {
        LinkedList linkedList = this.f12044;
        if (!linkedList.isEmpty()) {
            return ((Integer) linkedList.pop()).intValue();
        }
        try {
            return this.f12043.read();
        } catch (IOException e) {
            throw new ConfigException.IO(this.f12045, "read error: " + e.getMessage(), e);
        }
    }
}
