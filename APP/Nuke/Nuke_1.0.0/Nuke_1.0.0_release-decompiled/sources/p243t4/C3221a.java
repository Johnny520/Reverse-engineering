package p243t4;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;
import p206n2.C2690b;
import p249u4.C3348c;

/* JADX INFO: renamed from: t4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3221a extends AbstractC2352g {

    /* JADX INFO: renamed from: b */
    public C3348c f10008b;

    /* JADX INFO: renamed from: K */
    public static void m5493K(C3221a c3221a, String str) {
        AbstractC1665j.m2985e(str, "className");
        AbstractC0231b.m409t("matchType", 5);
        C3348c c3348c = new C3348c();
        c3348c.f10408b = str;
        c3348c.f10409c = 5;
        c3221a.f10008b = c3348c;
    }

    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        C3348c c3348c = this.f10008b;
        int iMo4213w = c3348c != null ? c3348c.mo4213w(c2690b) : 0;
        c2690b.m4682l(12);
        c2690b.m4673c(11, 0);
        c2690b.m4673c(10, 0);
        c2690b.m4673c(9, 0);
        c2690b.m4673c(8, 0);
        c2690b.m4673c(7, 0);
        c2690b.m4673c(6, 0);
        c2690b.m4673c(5, 0);
        c2690b.m4673c(4, 0);
        c2690b.m4673c(3, 0);
        c2690b.m4673c(2, 0);
        c2690b.m4673c(1, iMo4213w);
        c2690b.m4673c(0, 0);
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
