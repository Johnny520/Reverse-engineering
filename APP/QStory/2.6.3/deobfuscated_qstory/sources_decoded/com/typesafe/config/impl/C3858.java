package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigSyntax;
import java.io.StringReader;
import java.util.Stack;
import p009.AbstractC6183;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3858 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3858 f12085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12086;

    public C3858(String str, C3858 c3858) {
        this.f12086 = str;
        this.f12085 = c3858;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3858 m8234(String str) {
        C3838 c3838 = AbstractC3856.f12084;
        String strM8245 = AbstractC3864.m8245(str);
        int length = strM8245.length();
        C3858 c3858M8232 = null;
        if (!strM8245.isEmpty() && strM8245.charAt(0) != '.' && strM8245.charAt(length - 1) != '.') {
            int i = 0;
            boolean z = true;
            while (true) {
                if (i < length) {
                    char cCharAt = strM8245.charAt(i);
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
                    c3858M8232 = AbstractC3856.m8232(null, strM8245, strM8245.length());
                }
            }
        }
        if (c3858M8232 != null) {
            return c3858M8232;
        }
        StringReader stringReader = new StringReader(str);
        try {
            C3838 c38382 = AbstractC3856.f12084;
            C3836 c3836 = new C3836(c38382, stringReader, ConfigSyntax.CONF != ConfigSyntax.JSON);
            c3836.next();
            return AbstractC3856.m8231(c3836, c38382, str);
        } finally {
            stringReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3858) {
            C3858 c3858 = (C3858) obj;
            if (this.f12086.equals(c3858.f12086) && AbstractC3864.m8249(this.f12085, c3858.f12085)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM11572 = AbstractC6183.m11572(41, 41, this.f12086);
        C3858 c3858 = this.f12085;
        return iM11572 + (c3858 == null ? 0 : c3858.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Path(");
        m8238(sb);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3858 m8235(int i) {
        C3858 c3858 = null;
        if (i < 0) {
            C2942.m6408("bad call to subPath");
            return null;
        }
        Stack stack = new Stack();
        int i2 = i;
        while (i2 > 0) {
            i2--;
            stack.push(this.f12086);
            this = this.f12085;
            if (this == null) {
                C2942.m6408(AbstractC6183.m11588(i, "subPath lastIndex out of range "));
                return null;
            }
        }
        while (!stack.isEmpty()) {
            c3858 = new C3858((String) stack.pop(), c3858);
        }
        return c3858;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m8236() {
        StringBuilder sb = new StringBuilder();
        m8238(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3858 m8237() {
        C3858 c3858 = null;
        if (this.f12085 == null) {
            return null;
        }
        Stack stack = new Stack();
        while (this.f12085 != null) {
            stack.push(this.f12086);
            this = this.f12085;
        }
        while (!stack.isEmpty()) {
            c3858 = new C3858((String) stack.pop(), c3858);
        }
        return c3858;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[EDGE_INSN: B:23:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:6:0x000a->B:13:0x001e]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8238(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f12086
            int r1 = r0.length()
            if (r1 != 0) goto L9
            goto L21
        L9:
            r2 = 0
        La:
            if (r2 >= r1) goto L21
            char r3 = r0.charAt(r2)
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 != 0) goto L1e
            r4 = 45
            if (r3 == r4) goto L1e
            r4 = 95
            if (r3 != r4) goto L27
        L1e:
            int r2 = r2 + 1
            goto La
        L21:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
        L27:
            java.lang.String r0 = com.typesafe.config.impl.AbstractC3864.m8246(r0)
            r6.append(r0)
            goto L32
        L2f:
            r6.append(r0)
        L32:
            com.typesafe.config.impl.飘花落叶言子楪哲苏兰世 r5 = r5.f12085
            if (r5 == 0) goto L3e
            java.lang.String r0 = "."
            r6.append(r0)
            r5.m8238(r6)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.typesafe.config.impl.C3858.m8238(java.lang.StringBuilder):void");
    }
}
