package p144c4;

import p117X2.AbstractC1665j;
import p118X3.C1684F;
import p123Y3.AbstractC1776g;
import p191k4.C2475a;
import p208n4.C2709h;

/* JADX INFO: renamed from: c4.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1916f {
    static {
        C2709h c2709h = C2709h.f8630g;
        C2475a.m4416e("\"\\");
        C2475a.m4416e("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m3406a(C1684F c1684f) {
        if (AbstractC1665j.m2981a(c1684f.f5738d.f5713b, "HEAD")) {
            return false;
        }
        int i5 = c1684f.f5741g;
        if (((i5 < 100 || i5 >= 200) && i5 != 204 && i5 != 304) || AbstractC1776g.m3177d(c1684f) != -1) {
            return true;
        }
        String strM3038a = c1684f.f5743i.m3038a("Transfer-Encoding");
        if (strM3038a == null) {
            strM3038a = null;
        }
        return "chunked".equalsIgnoreCase(strM3038a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0214, code lost:
    
        if (((java.util.regex.Pattern) r6.f5710e).matcher(r0).matches() == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3407b(p118X3.C1692b r39, p118X3.C1709s r40, p118X3.C1707q r41) {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p144c4.AbstractC1916f.m3407b(X3.b, X3.s, X3.q):void");
    }
}
