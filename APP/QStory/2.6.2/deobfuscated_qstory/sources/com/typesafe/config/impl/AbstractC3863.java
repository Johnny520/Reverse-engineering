package com.typesafe.config.impl;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import p250.InterfaceC8160;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3863 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m8257(ObjectOutputStream objectOutputStream, InterfaceC8160 interfaceC8160) throws IOException {
        SerializedConfigValue.writeOrigin(new DataOutputStream(objectOutputStream), (C3837) interfaceC8160, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m8258(String str) {
        int iCodePointAt;
        int i;
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int iCharCount = 0;
        while (iCharCount < length) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt != ' ' && cCharAt != '\n') {
                int iCodePointAt2 = str.codePointAt(iCharCount);
                if (!m8261(iCodePointAt2)) {
                    break;
                }
                iCharCount = Character.charCount(iCodePointAt2) + iCharCount;
            } else {
                iCharCount++;
            }
        }
        while (length > iCharCount) {
            int i2 = length - 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 != ' ' && cCharAt2 != '\n') {
                if (Character.isLowSurrogate(cCharAt2)) {
                    iCodePointAt = str.codePointAt(length - 2);
                    i = 2;
                } else {
                    iCodePointAt = str.codePointAt(i2);
                    i = 1;
                }
                if (!m8261(iCodePointAt)) {
                    break;
                }
                length -= i;
            } else {
                length--;
            }
        }
        return str.substring(iCharCount, length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m8259(String str) {
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                sb.append("\\f");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        if (cCharAt < 0 || cCharAt > 31) {
                            sb.append(cCharAt);
                        } else {
                            sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        sb.append('\"');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3837 m8260(ObjectInputStream objectInputStream) {
        return SerializedConfigValue.readOrigin(objectInputStream, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m8261(int i) {
        if (i == 10 || i == 32 || i == 160 || i == 8199 || i == 8239 || i == 65279) {
            return true;
        }
        return Character.isWhitespace(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m8262(Object obj, Object obj2) {
        if (obj == null && obj2 != null) {
            return false;
        }
        if (obj != null && obj2 == null) {
            return false;
        }
        if (obj == obj2) {
            return true;
        }
        return obj.equals(obj2);
    }
}
