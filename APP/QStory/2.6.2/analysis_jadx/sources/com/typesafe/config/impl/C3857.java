package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2941;
import com.typesafe.config.ConfigSyntax;
import java.io.StringReader;
import java.util.Stack;
import p007.AbstractC6136;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3857 f12080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12081;

    public C3857(String str, C3857 c3857) {
        this.f12081 = str;
        this.f12080 = c3857;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3857 m8247(String str) {
        C3837 c3837 = AbstractC3855.f12079;
        String strM8258 = AbstractC3863.m8258(str);
        int length = strM8258.length();
        C3857 c3857M8245 = null;
        if (!strM8258.isEmpty() && strM8258.charAt(0) != '.' && strM8258.charAt(length - 1) != '.') {
            int i = 0;
            boolean z = true;
            while (true) {
                if (i < length) {
                    char cCharAt = strM8258.charAt(i);
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
                    c3857M8245 = AbstractC3855.m8245(null, strM8258, strM8258.length());
                }
            }
        }
        if (c3857M8245 != null) {
            return c3857M8245;
        }
        StringReader stringReader = new StringReader(str);
        try {
            C3837 c38372 = AbstractC3855.f12079;
            C3835 c3835 = new C3835(c38372, stringReader, ConfigSyntax.CONF != ConfigSyntax.JSON);
            c3835.next();
            return AbstractC3855.m8244(c3835, c38372, str);
        } finally {
            stringReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3857) {
            C3857 c3857 = (C3857) obj;
            if (this.f12081.equals(c3857.f12081) && AbstractC3863.m8262(this.f12080, c3857.f12080)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM11539 = AbstractC6136.m11539(41, 41, this.f12081);
        C3857 c3857 = this.f12080;
        return iM11539 + (c3857 == null ? 0 : c3857.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Path(");
        m8251(sb);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3857 m8248(int i) {
        C3857 c3857 = null;
        if (i < 0) {
            C2941.m6350("bad call to subPath");
            return null;
        }
        Stack stack = new Stack();
        int i2 = i;
        while (i2 > 0) {
            i2--;
            stack.push(this.f12081);
            this = this.f12080;
            if (this == null) {
                C2941.m6350(AbstractC6136.m11556(i, "subPath lastIndex out of range "));
                return null;
            }
        }
        while (!stack.isEmpty()) {
            c3857 = new C3857((String) stack.pop(), c3857);
        }
        return c3857;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m8249() {
        StringBuilder sb = new StringBuilder();
        m8251(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3857 m8250() {
        C3857 c3857 = null;
        if (this.f12080 == null) {
            return null;
        }
        Stack stack = new Stack();
        while (this.f12080 != null) {
            stack.push(this.f12081);
            this = this.f12080;
        }
        while (!stack.isEmpty()) {
            c3857 = new C3857((String) stack.pop(), c3857);
        }
        return c3857;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[EDGE_INSN: B:23:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:6:0x000a->B:13:0x001e]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8251(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f12081
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
            java.lang.String r0 = com.typesafe.config.impl.AbstractC3863.m8259(r0)
            r6.append(r0)
            goto L32
        L2f:
            r6.append(r0)
        L32:
            com.typesafe.config.impl.飘花落叶言子楪哲苏兰世 r5 = r5.f12080
            if (r5 == 0) goto L3e
            java.lang.String r0 = "."
            r6.append(r0)
            r5.m8251(r6)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.typesafe.config.impl.C3857.m8251(java.lang.StringBuilder):void");
    }
}
