package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ig0 {
    public static final Set a = mg.u0(new String[]{"*", "{"});
    public static final Set b = mg.u0(new String[]{"(", "[", "{", "=", ":", ",", ";", "!", "?", "+", "-", "*", "%", "&", "|", "^", "~"});
    public static final Set c = mg.u0(new String[]{"return", "throw", "case", "delete", "void", "typeof", "instanceof", "in", "of", "yield", "await"});

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v55, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v56, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(String str) {
        int i;
        ow1 ow1Var;
        int iIntValue;
        boolean zContains;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (!xe1.Q(cCharAt)) {
                if (cCharAt == '/') {
                    int i3 = i2 + 1;
                    Character chValueOf = (i3 < 0 || i3 >= str.length()) ? null : Character.valueOf(str.charAt(i3));
                    if (chValueOf != null && chValueOf.charValue() == '/') {
                        i2 += 2;
                        while (i2 < str.length() && str.charAt(i2) != '\n') {
                            i2++;
                        }
                    }
                }
                if (cCharAt == '/') {
                    int i4 = i2 + 1;
                    Character chValueOf2 = (i4 < 0 || i4 >= str.length()) ? null : Character.valueOf(str.charAt(i4));
                    if (chValueOf2 != null && chValueOf2.charValue() == '*') {
                        int i5 = i2 + 2;
                        while (true) {
                            int i6 = i5 + 1;
                            if (i6 < str.length() && (str.charAt(i5) != '*' || str.charAt(i6) != '/')) {
                                i5 = i6;
                            }
                        }
                        i2 = i5 + 2;
                        iIntValue = str.length();
                        if (i2 > iIntValue) {
                            i2 = iIntValue;
                        }
                    }
                }
                if (cCharAt == '/') {
                    hg0 hg0Var = (hg0) du.w0(arrayList);
                    if (hg0Var == null) {
                        zContains = true;
                    } else if (hg0Var instanceof gg0) {
                        zContains = b.contains(((gg0) hg0Var).a);
                    } else if (hg0Var instanceof eg0) {
                        zContains = c.contains(((eg0) hg0Var).a);
                    } else {
                        if (!(hg0Var instanceof fg0)) {
                            c80.s();
                            return null;
                        }
                        zContains = false;
                    }
                    if (zContains) {
                        i2++;
                        boolean z = false;
                        while (true) {
                            if (i2 < str.length()) {
                                int length = i2 + 1;
                                char cCharAt2 = str.charAt(i2);
                                if (cCharAt2 != '/') {
                                    switch (cCharAt2) {
                                        case '[':
                                            z = true;
                                            break;
                                        case '\\':
                                            i2 += 2;
                                            length = str.length();
                                            if (i2 <= length) {
                                            }
                                            break;
                                        case ']':
                                            z = false;
                                            break;
                                    }
                                } else if (!z) {
                                    while (length < str.length() && Character.isLetter(str.charAt(length))) {
                                        length++;
                                    }
                                    i2 = length;
                                }
                                i2 = length;
                            }
                        }
                    }
                }
                if (cCharAt == '\'' || cCharAt == '\"') {
                    StringBuilder sb = new StringBuilder();
                    int i7 = i2 + 1;
                    while (true) {
                        if (i7 < str.length()) {
                            int i8 = i7 + 1;
                            char cCharAt3 = str.charAt(i7);
                            if (cCharAt3 == cCharAt) {
                                ow1Var = new ow1(sb.toString(), Integer.valueOf(i8));
                            } else if (cCharAt3 != '\\') {
                                sb.append(cCharAt3);
                                i7 = i8;
                            } else if (i8 < str.length()) {
                                i7 += 2;
                                char cCharAt4 = str.charAt(i8);
                                if (cCharAt4 != '\n' && cCharAt4 != '\r') {
                                    if (cCharAt4 == 'b') {
                                        sb.append('\b');
                                    } else if (cCharAt4 == 'f') {
                                        sb.append('\f');
                                    } else if (cCharAt4 == 'n') {
                                        sb.append('\n');
                                    } else if (cCharAt4 == 'r') {
                                        sb.append('\r');
                                    } else if (cCharAt4 == 't') {
                                        sb.append('\t');
                                    } else if (cCharAt4 != 'v') {
                                        sb.append(cCharAt4);
                                    } else {
                                        sb.append((char) 11);
                                    }
                                }
                            } else {
                                i7 = i8;
                            }
                        }
                    }
                    ow1Var = new ow1(sb.toString(), Integer.valueOf(i7));
                    String str2 = (String) ow1Var.h;
                    iIntValue = ((Number) ow1Var.i).intValue();
                    arrayList.add(new fg0(str2));
                    i2 = iIntValue;
                } else {
                    if (cCharAt == '`') {
                        i2++;
                        while (i2 < str.length()) {
                            iIntValue = i2 + 1;
                            char cCharAt5 = str.charAt(i2);
                            if (cCharAt5 == '\\') {
                                i2 += 2;
                                iIntValue = str.length();
                                if (i2 > iIntValue) {
                                }
                            } else if (cCharAt5 == '`') {
                            }
                            i2 = iIntValue;
                        }
                    } else if (cCharAt == '_' || cCharAt == '$' || Character.isLetter(cCharAt)) {
                        iIntValue = i2 + 1;
                        while (iIntValue < str.length()) {
                            char cCharAt6 = str.charAt(iIntValue);
                            if ((cCharAt6 == '_' || cCharAt6 == '$' || Character.isLetter(cCharAt6)) || Character.isDigit(cCharAt6)) {
                                iIntValue++;
                            } else {
                                arrayList.add(new eg0(str.substring(i2, iIntValue)));
                            }
                        }
                        arrayList.add(new eg0(str.substring(i2, iIntValue)));
                    } else {
                        arrayList.add(new gg0(String.valueOf(cCharAt)));
                    }
                    i2 = iIntValue;
                }
            }
            i2++;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i9 = 0;
        while (i9 < arrayList.size()) {
            hg0 hg0Var2 = (hg0) arrayList.get(i9);
            if (hg0Var2 instanceof eg0) {
                String str3 = ((eg0) hg0Var2).a;
                if (str3.equals("import")) {
                    hg0 hg0Var3 = (hg0) du.r0(i9 - 1, arrayList);
                    if (!((hg0Var3 instanceof gg0) && t11.l(((gg0) hg0Var3).a, "."))) {
                        i = i9 + 1;
                        hg0 hg0Var4 = (hg0) du.r0(i, arrayList);
                        if (hg0Var4 != null) {
                            if (hg0Var4 instanceof fg0) {
                                linkedHashSet.add(((fg0) hg0Var4).a);
                            } else if (hg0Var4 instanceof gg0) {
                                String str4 = ((gg0) hg0Var4).a;
                                if (!t11.l(str4, ".")) {
                                    if (t11.l(str4, "(")) {
                                        i = i9 + 2;
                                        hg0 hg0Var5 = (hg0) du.r0(i, arrayList);
                                        if (hg0Var5 instanceof fg0) {
                                            linkedHashSet.add(((fg0) hg0Var5).a);
                                        }
                                    } else {
                                        while (true) {
                                            if (i < arrayList.size()) {
                                                hg0 hg0Var6 = (hg0) arrayList.get(i);
                                                if ((hg0Var6 instanceof gg0) && t11.l(((gg0) hg0Var6).a, ";")) {
                                                    i++;
                                                } else {
                                                    if ((hg0Var6 instanceof eg0) && ((eg0) hg0Var6).a.equals("from")) {
                                                        hg0 hg0Var7 = (hg0) du.r0(i + 1, arrayList);
                                                        if (hg0Var7 instanceof fg0) {
                                                            linkedHashSet.add(((fg0) hg0Var7).a);
                                                            i += 2;
                                                        }
                                                    }
                                                    i++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i = i9 + 2;
                        }
                        i9 = i;
                    }
                } else if (str3.equals("export")) {
                    hg0 hg0Var8 = (hg0) du.r0(i9 - 1, arrayList);
                    if (!((hg0Var8 instanceof gg0) && t11.l(((gg0) hg0Var8).a, "."))) {
                        i = i9 + 1;
                        hg0 hg0Var9 = (hg0) du.r0(i, arrayList);
                        if (hg0Var9 != null && (hg0Var9 instanceof gg0)) {
                            String str5 = ((gg0) hg0Var9).a;
                            if (a.contains(str5)) {
                                i9 += 2;
                                int iL = t11.l(str5, "{");
                                while (true) {
                                    if (i9 < arrayList.size()) {
                                        hg0 hg0Var10 = (hg0) arrayList.get(i9);
                                        int i10 = iL;
                                        if (hg0Var10 instanceof gg0) {
                                            String str6 = ((gg0) hg0Var10).a;
                                            int iHashCode = str6.hashCode();
                                            if (iHashCode == 59) {
                                                i10 = iL;
                                                if (str6.equals(";")) {
                                                    i = i9 + 1;
                                                }
                                            } else if (iHashCode != 123) {
                                                i10 = iL;
                                                if (iHashCode == 125) {
                                                    i10 = iL;
                                                    if (str6.equals("}")) {
                                                        i10 = iL - 1;
                                                    }
                                                }
                                            } else {
                                                i10 = iL;
                                                if (str6.equals("{")) {
                                                    i10 = iL + 1;
                                                }
                                            }
                                        }
                                        if (i10 <= 0 && (hg0Var10 instanceof eg0) && ((eg0) hg0Var10).a.equals("from")) {
                                            hg0 hg0Var11 = (hg0) du.r0(i9 + 1, arrayList);
                                            if (hg0Var11 instanceof fg0) {
                                                linkedHashSet.add(((fg0) hg0Var11).a);
                                            }
                                        }
                                        i9++;
                                        iL = i10;
                                    } else {
                                        i = i9;
                                    }
                                }
                            }
                        }
                        i9 = i;
                    }
                }
            }
            i9++;
        }
        return du.F0(linkedHashSet);
    }
}
