package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲楪子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3443 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f11122;

    static {
        char[] cArr = new char[80];
        f11122 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7609(com.google.protobuf.GeneratedMessageLite r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3443.m7609(com.google.protobuf.GeneratedMessageLite, java.lang.StringBuilder, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7610(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m7610(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m7610(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m7611(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append(JavaConstant.Dynamic.DEFAULT_NAME);
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC3413.m7525((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(AbstractC3413.m7514(((ByteString) obj).toByteArray()));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            m7609((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            m7611(sb, i);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m7610(sb, i3, "key", entry.getKey());
        m7610(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m7611(sb, i);
        sb.append("}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7611(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f11122, 0, i2);
            i -= i2;
        }
    }
}
