package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0911;
import com.alibaba.fastjson2.C3775;
import com.typesafe.config.ConfigException;
import com.typesafe.config.impl.ConfigString;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p069.AbstractC7390;
import p266.InterfaceC8990;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4668 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C4670 f12388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f12390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedList f12391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0911 f12392;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final StringReader f12393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4670 f12395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedList f12394 = new LinkedList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12389 = 1;

    public C4668(InterfaceC8990 interfaceC8990, StringReader stringReader, boolean z) {
        C4670 c4670 = (C4670) interfaceC8990;
        this.f12395 = c4670;
        this.f12393 = stringReader;
        this.f12390 = z;
        this.f12388 = c4670.m8770(1);
        LinkedList linkedList = new LinkedList();
        this.f12391 = linkedList;
        linkedList.add(AbstractC4654.f12364);
        this.f12392 = new C0911(2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Tokenizer$ProblemException m8758(C4670 c4670, String str, String str2, boolean z, Throwable th) {
        C4669 c4669 = AbstractC4654.f12364;
        return new Tokenizer$ProblemException(new C4660(c4670, str, str2, z, th));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f12391.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        LinkedList linkedList = this.f12391;
        C4669 c4669 = (C4669) linkedList.remove();
        if (linkedList.isEmpty() && c4669 != AbstractC4654.f12363) {
            try {
                C0911 c0911 = this.f12392;
                C4669 c4669M8761 = m8761(c0911);
                C4669 c4669M751 = c0911.m751(c4669M8761, this.f12395, this.f12389);
                if (c4669M751 != null) {
                    linkedList.add(c4669M751);
                }
                linkedList.add(c4669M8761);
            } catch (Tokenizer$ProblemException e) {
                linkedList.add(e.problem());
            }
            if (linkedList.isEmpty()) {
                C3775.m6968("bug: tokens queue should not be empty here");
                return null;
            }
        }
        return c4669;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Does not make sense to remove items from token stream");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m8759(int i) {
        if (i != -1 && this.f12390) {
            if (i == 35) {
                return true;
            }
            if (i == 47) {
                int iM8762 = m8762();
                m8760(iM8762);
                if (iM8762 == 47) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8760(int i) {
        LinkedList linkedList = this.f12394;
        if (linkedList.size() <= 2) {
            linkedList.push(Integer.valueOf(i));
        } else {
            C3775.m6968("bug: putBack() three times, undesirable look-ahead");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4669 m8761(C0911 c0911) throws Tokenizer$ProblemException {
        int iM8762;
        C4669 c4656;
        int i;
        boolean z;
        int iM87622;
        while (true) {
            iM8762 = m8762();
            if (iM8762 == -1) {
                iM8762 = -1;
                break;
            }
            if (iM8762 == 10 || !AbstractC4696.m8807(iM8762)) {
                break;
            }
            ((StringBuilder) c0911.f484).appendCodePoint(iM8762);
        }
        if (iM8762 == -1) {
            return AbstractC4654.f12363;
        }
        C4670 c4670 = this.f12395;
        boolean z2 = true;
        if (iM8762 == 10) {
            C4670 c46702 = this.f12388;
            C4669 c4669 = AbstractC4654.f12364;
            C4657 c4657 = new C4657(TokenType.NEWLINE, c46702, null, null);
            int i2 = this.f12389 + 1;
            this.f12389 = i2;
            this.f12388 = c4670.m8770(i2);
            return c4657;
        }
        if (m8759(iM8762)) {
            if (iM8762 != 47) {
                z2 = false;
            } else if (m8762() != 47) {
                C3775.m6968("called pullComment but // not seen");
                return null;
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                iM87622 = m8762();
                if (iM87622 == -1 || iM87622 == 10) {
                    break;
                }
                sb.appendCodePoint(iM87622);
            }
            m8760(iM87622);
            C4670 c46703 = this.f12388;
            if (z2) {
                String string = sb.toString();
                C4669 c46692 = AbstractC4654.f12364;
                return new C4667(c46703, string);
            }
            String string2 = sb.toString();
            C4669 c46693 = AbstractC4654.f12364;
            return new C4667(c46703, string2);
        }
        int i3 = 4;
        if (iM8762 == 34) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.appendCodePoint(34);
            while (true) {
                int iM87623 = m8762();
                if (iM87623 == -1) {
                    throw m8758(this.f12388, "", "End of input but string quote was still open", false, null);
                }
                if (iM87623 == 92) {
                    int iM87624 = m8762();
                    if (iM87624 == -1) {
                        throw m8758(this.f12388, "", "End of input but backslash in string had nothing after it", false, null);
                    }
                    sb3.appendCodePoint(92);
                    sb3.appendCodePoint(iM87624);
                    if (iM87624 == 34) {
                        sb2.append('\"');
                    } else if (iM87624 == 47) {
                        sb2.append('/');
                    } else if (iM87624 == 92) {
                        sb2.append('\\');
                    } else if (iM87624 == 98) {
                        sb2.append('\b');
                    } else if (iM87624 == 102) {
                        sb2.append('\f');
                    } else if (iM87624 == 110) {
                        sb2.append('\n');
                    } else if (iM87624 == 114) {
                        sb2.append('\r');
                    } else if (iM87624 == 116) {
                        sb2.append('\t');
                    } else {
                        if (iM87624 != 117) {
                            throw m8758(this.f12388, AbstractC7390.m12612(iM87624), AbstractC0900.m718("backslash followed by '", AbstractC7390.m12612(iM87624), "', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)"), false, null);
                        }
                        char[] cArr = new char[i3];
                        int i4 = 0;
                        while (i4 < i3) {
                            int iM87625 = m8762();
                            if (iM87625 == -1) {
                                throw m8758(this.f12388, "", "End of input but expecting 4 hex digits for \\uXXXX escape", false, null);
                            }
                            cArr[i4] = (char) iM87625;
                            i4++;
                            i3 = 4;
                        }
                        String str = new String(cArr);
                        sb3.append(cArr);
                        try {
                            sb2.appendCodePoint(Integer.parseInt(str, 16));
                        } catch (NumberFormatException e) {
                            throw m8758(this.f12388, str, AbstractC0900.m718("Malformed hex digits after \\u escape in string: '", str, "'"), false, e);
                        }
                    }
                    i = 4;
                } else if (iM87623 == 34) {
                    sb3.appendCodePoint(iM87623);
                    if (sb2.length() == 0) {
                        int iM87626 = m8762();
                        if (iM87626 == 34) {
                            sb3.appendCodePoint(iM87626);
                            int i5 = 0;
                            while (true) {
                                int iM87627 = m8762();
                                if (iM87627 == 34) {
                                    i5++;
                                } else {
                                    if (i5 >= 3) {
                                        sb2.setLength(sb2.length() - 3);
                                        m8760(iM87627);
                                        break;
                                    }
                                    if (iM87627 == -1) {
                                        throw m8758(this.f12388, "", "End of input but triple-quoted string was still open", false, null);
                                    }
                                    if (iM87627 == 10) {
                                        int i6 = this.f12389 + 1;
                                        this.f12389 = i6;
                                        this.f12388 = c4670.m8770(i6);
                                    }
                                    i5 = 0;
                                }
                                sb2.appendCodePoint(iM87627);
                                sb3.appendCodePoint(iM87627);
                            }
                        } else {
                            m8760(iM87626);
                        }
                    }
                    C4670 c46704 = this.f12388;
                    String string3 = sb2.toString();
                    String string4 = sb3.toString();
                    C4669 c46694 = AbstractC4654.f12364;
                    c4656 = new C4656(new ConfigString.Quoted(c46704, string3), string4);
                } else {
                    i = 4;
                    if (iM87623 >= 0 && iM87623 <= 31) {
                        throw m8758(this.f12388, AbstractC7390.m12612(iM87623), "JSON does not allow unescaped " + AbstractC7390.m12612(iM87623) + " in quoted strings, use a backslash escape", false, null);
                    }
                    sb2.appendCodePoint(iM87623);
                    sb3.appendCodePoint(iM87623);
                }
                i3 = i;
            }
        } else if (iM8762 == 36) {
            C4670 c46705 = this.f12388;
            int iM87628 = m8762();
            if (iM87628 != 123) {
                throw m8758(this.f12388, AbstractC7390.m12612(iM87628), "'$' not followed by {, '" + AbstractC7390.m12612(iM87628) + "' not allowed after '$'", true, null);
            }
            int iM87629 = m8762();
            if (iM87629 == 63) {
                z = true;
            } else {
                m8760(iM87629);
                z = false;
            }
            C0911 c09112 = new C0911(2);
            ArrayList arrayList = new ArrayList();
            while (true) {
                C4669 c4669M8761 = m8761(c09112);
                if (c4669M8761 == AbstractC4654.f12366) {
                    c4656 = new C4659(c46705, z, arrayList);
                    break;
                }
                if (c4669M8761 == AbstractC4654.f12363) {
                    throw m8758(c46705, "", "Substitution ${ was not closed with a }", false, null);
                }
                C4669 c4669M751 = c09112.m751(c4669M8761, c46705, this.f12389);
                if (c4669M751 != null) {
                    arrayList.add(c4669M751);
                }
                arrayList.add(c4669M8761);
            }
        } else if (iM8762 == 58) {
            c4656 = AbstractC4654.f12360;
        } else if (iM8762 == 61) {
            c4656 = AbstractC4654.f12361;
        } else if (iM8762 == 91) {
            c4656 = AbstractC4654.f12365;
        } else if (iM8762 == 93) {
            c4656 = AbstractC4654.f12367;
        } else if (iM8762 == 123) {
            c4656 = AbstractC4654.f12359;
        } else if (iM8762 == 125) {
            c4656 = AbstractC4654.f12366;
        } else if (iM8762 != 43) {
            c4656 = iM8762 != 44 ? null : AbstractC4654.f12362;
        } else {
            int iM876210 = m8762();
            if (iM876210 != 61) {
                throw m8758(this.f12388, AbstractC7390.m12612(iM876210), "'+' not followed by =, '" + AbstractC7390.m12612(iM876210) + "' not allowed after '+'", true, null);
            }
            c4656 = AbstractC4654.f12368;
        }
        if (c4656 != null) {
            return c4656;
        }
        if ("0123456789-".indexOf(iM8762) < 0) {
            if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(iM8762) >= 0) {
                throw m8758(this.f12388, AbstractC7390.m12612(iM8762), "Reserved character '" + AbstractC7390.m12612(iM8762) + "' is not allowed outside quotes", true, null);
            }
            m8760(iM8762);
            C4670 c46706 = this.f12388;
            StringBuilder sb4 = new StringBuilder();
            int iM876211 = m8762();
            while (iM876211 != -1 && "$\"{}[]:=,+#`^?!@*&\\".indexOf(iM876211) < 0 && !AbstractC4696.m8807(iM876211) && !m8759(iM876211)) {
                sb4.appendCodePoint(iM876211);
                if (sb4.length() == 4) {
                    String string5 = sb4.toString();
                    if (string5.equals("true")) {
                        C4669 c46695 = AbstractC4654.f12364;
                        return new C4656(new ConfigBoolean(c46706, true), "true");
                    }
                    if (string5.equals("null")) {
                        C4669 c46696 = AbstractC4654.f12364;
                        return new C4656(new ConfigNull(c46706), "null");
                    }
                } else if (sb4.length() == 5 && sb4.toString().equals("false")) {
                    C4669 c46697 = AbstractC4654.f12364;
                    return new C4656(new ConfigBoolean(c46706, false), "false");
                }
                iM876211 = m8762();
            }
            m8760(iM876211);
            String string6 = sb4.toString();
            C4669 c46698 = AbstractC4654.f12364;
            return new C4655(c46706, string6);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.appendCodePoint(iM8762);
        int iM876212 = m8762();
        boolean z3 = false;
        while (iM876212 != -1 && "0123456789eE+-.".indexOf(iM876212) >= 0) {
            if (iM876212 == 46 || iM876212 == 101 || iM876212 == 69) {
                z3 = true;
            }
            sb5.appendCodePoint(iM876212);
            iM876212 = m8762();
        }
        m8760(iM876212);
        String string7 = sb5.toString();
        C4670 c46707 = this.f12388;
        try {
            if (z3) {
                double d = Double.parseDouble(string7);
                C4669 c46699 = AbstractC4654.f12364;
                return new C4656(ConfigNumber.newNumber(c46707, d, string7), string7);
            }
            long j = Long.parseLong(string7);
            C4669 c466910 = AbstractC4654.f12364;
            return new C4656(ConfigNumber.newNumber((InterfaceC8990) c46707, j, string7), string7);
        } catch (NumberFormatException unused) {
            for (char c : string7.toCharArray()) {
                if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(c) >= 0) {
                    throw m8758(this.f12388, AbstractC7390.m12612(c), "Reserved character '" + AbstractC7390.m12612(c) + "' is not allowed outside quotes", true, null);
                }
            }
            C4670 c46708 = this.f12388;
            C4669 c466911 = AbstractC4654.f12364;
            return new C4655(c46708, string7);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8762() {
        LinkedList linkedList = this.f12394;
        if (!linkedList.isEmpty()) {
            return ((Integer) linkedList.pop()).intValue();
        }
        try {
            return this.f12393.read();
        } catch (IOException e) {
            throw new ConfigException.C0360IO(this.f12395, "read error: " + e.getMessage(), e);
        }
    }
}
