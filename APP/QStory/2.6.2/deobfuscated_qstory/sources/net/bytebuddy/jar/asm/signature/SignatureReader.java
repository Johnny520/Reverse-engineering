package net.bytebuddy.jar.asm.signature;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class SignatureReader {
    private final String signatureValue;

    public SignatureReader(String str) {
        this.signatureValue = str;
    }

    private static int parseType(String str, int i, SignatureVisitor signatureVisitor) {
        int type = i + 1;
        char cCharAt = str.charAt(i);
        if (cCharAt != 'F') {
            if (cCharAt == 'L') {
                int i2 = type;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int i3 = type + 1;
                    char cCharAt2 = str.charAt(type);
                    if (cCharAt2 == '.' || cCharAt2 == ';') {
                        if (!z) {
                            String strSubstring = str.substring(i2, type);
                            if (z2) {
                                signatureVisitor.visitInnerClassType(strSubstring);
                            } else {
                                signatureVisitor.visitClassType(strSubstring);
                            }
                        }
                        if (cCharAt2 == ';') {
                            signatureVisitor.visitEnd();
                            return i3;
                        }
                        z = false;
                        z2 = true;
                        i2 = i3;
                        type = i2;
                    } else if (cCharAt2 == '<') {
                        String strSubstring2 = str.substring(i2, type);
                        if (z2) {
                            signatureVisitor.visitInnerClassType(strSubstring2);
                        } else {
                            signatureVisitor.visitClassType(strSubstring2);
                        }
                        type = i3;
                        while (true) {
                            char cCharAt3 = str.charAt(type);
                            if (cCharAt3 == '>') {
                                break;
                            }
                            if (cCharAt3 != '*') {
                                type = (cCharAt3 == '+' || cCharAt3 == '-') ? parseType(str, type + 1, signatureVisitor.visitTypeArgument(cCharAt3)) : parseType(str, type, signatureVisitor.visitTypeArgument(SignatureVisitor.INSTANCEOF));
                            } else {
                                type++;
                                signatureVisitor.visitTypeArgument();
                            }
                        }
                        z = true;
                    } else {
                        type = i3;
                    }
                }
            } else if (cCharAt != 'V' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'S') {
                if (cCharAt == 'T') {
                    int iIndexOf = str.indexOf(59, type);
                    signatureVisitor.visitTypeVariable(str.substring(type, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        return parseType(str, type, signatureVisitor.visitArrayType());
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            C5919.m11245();
                            return 0;
                    }
                }
            }
        }
        signatureVisitor.visitBaseType(cCharAt);
        return type;
    }

    public void accept(SignatureVisitor signatureVisitor) {
        char cCharAt;
        String str = this.signatureValue;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int iIndexOf = str.indexOf(58, i);
                signatureVisitor.visitFormalTypeParameter(str.substring(i - 1, iIndexOf));
                int type = iIndexOf + 1;
                char cCharAt2 = str.charAt(type);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    type = parseType(str, type, signatureVisitor.visitClassBound());
                }
                while (true) {
                    i = type + 1;
                    cCharAt = str.charAt(type);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        type = parseType(str, i, signatureVisitor.visitInterfaceBound());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i) != '(') {
            int type2 = parseType(str, i, signatureVisitor.visitSuperclass());
            while (type2 < length) {
                type2 = parseType(str, type2, signatureVisitor.visitInterface());
            }
        } else {
            int type3 = i + 1;
            while (str.charAt(type3) != ')') {
                type3 = parseType(str, type3, signatureVisitor.visitParameterType());
            }
            int type4 = parseType(str, type3 + 1, signatureVisitor.visitReturnType());
            while (type4 < length) {
                type4 = parseType(str, type4 + 1, signatureVisitor.visitExceptionType());
            }
        }
    }

    public void acceptType(SignatureVisitor signatureVisitor) {
        parseType(this.signatureValue, 0, signatureVisitor);
    }
}
