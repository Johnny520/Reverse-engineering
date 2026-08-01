package com.typesafe.config.impl;

import com.alibaba.fastjson2.C3775;
import com.typesafe.config.ConfigSyntax;
import java.io.StringReader;
import java.util.Stack;
import p025.AbstractC7012;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4690 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4690 f12430;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12431;

    public C4690(String str, C4690 c4690) {
        this.f12431 = str;
        this.f12430 = c4690;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C4690 m8793(String str) {
        C4670 c4670 = AbstractC4688.f12429;
        String strM8804 = AbstractC4696.m8804(str);
        int length = strM8804.length();
        C4690 c4690M8791 = null;
        if (!strM8804.isEmpty() && strM8804.charAt(0) != '.' && strM8804.charAt(length - 1) != '.') {
            int i = 0;
            boolean z = true;
            while (true) {
                if (i < length) {
                    char cCharAt = strM8804.charAt(i);
                    if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_')) {
                        z = false;
                    } else if (cCharAt == '.') {
                        if (z) {
                            break;
                        }
                        z = true;
                    } else if (cCharAt != '-' || z) {
                        break;
                    }
                    i++;
                } else if (!z) {
                    c4690M8791 = AbstractC4688.m8791(null, strM8804, strM8804.length());
                }
            }
        }
        if (c4690M8791 != null) {
            return c4690M8791;
        }
        StringReader stringReader = new StringReader(str);
        try {
            C4670 c46702 = AbstractC4688.f12429;
            C4668 c4668 = new C4668(c46702, stringReader, ConfigSyntax.CONF != ConfigSyntax.JSON);
            c4668.next();
            return AbstractC4688.m8790(c4668, c46702, str);
        } finally {
            stringReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4690) {
            C4690 c4690 = (C4690) obj;
            if (this.f12431.equals(c4690.f12431) && AbstractC4696.m8808(this.f12430, c4690.f12430)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM12131 = AbstractC7012.m12131(41, 41, this.f12431);
        C4690 c4690 = this.f12430;
        return iM12131 + (c4690 == null ? 0 : c4690.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Path(");
        m8797(sb);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4690 m8794(int i) {
        C4690 c4690 = null;
        if (i < 0) {
            C3775.m6968("bad call to subPath");
            return null;
        }
        Stack stack = new Stack();
        int i2 = i;
        while (i2 > 0) {
            i2--;
            stack.push(this.f12431);
            this = this.f12430;
            if (this == null) {
                C3775.m6968(AbstractC7012.m12147(i, "subPath lastIndex out of range "));
                return null;
            }
        }
        while (!stack.isEmpty()) {
            c4690 = new C4690((String) stack.pop(), c4690);
        }
        return c4690;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m8795() {
        StringBuilder sb = new StringBuilder();
        m8797(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4690 m8796() {
        C4690 c4690 = null;
        if (this.f12430 == null) {
            return null;
        }
        Stack stack = new Stack();
        while (this.f12430 != null) {
            stack.push(this.f12431);
            this = this.f12430;
        }
        while (!stack.isEmpty()) {
            c4690 = new C4690((String) stack.pop(), c4690);
        }
        return c4690;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[EDGE_INSN: B:23:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:6:0x000a->B:13:0x001e]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8797(StringBuilder sb) {
        String str = this.f12431;
        int length = str.length();
        if (length != 0) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-' && cCharAt != '_') {
                    break;
                }
            }
            if (str.isEmpty()) {
            }
        } else if (str.isEmpty()) {
            sb.append(str);
        } else {
            sb.append(AbstractC4696.m8805(str));
        }
        C4690 c4690 = this.f12430;
        if (c4690 != null) {
            sb.append(".");
            c4690.m8797(sb);
        }
    }
}
