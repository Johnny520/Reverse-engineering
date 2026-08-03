package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: xD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2708xD {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9283a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static C2509sn m5281a(C2286nn c2286nn) {
        C2380pn c2380pnM4992z = C2509sn.m4992z();
        int iM4617B = c2286nn.m4617B();
        c2380pnM4992z.m5038e();
        C2509sn.m4990w((C2509sn) c2380pnM4992z.f8871b, iM4617B);
        for (C2243mn c2243mn : c2286nn.m4616A()) {
            C2423qn c2423qnM4954B = C2466rn.m4954B();
            String strM1792B = c2243mn.m4556A().m1792B();
            c2423qnM4954B.m5038e();
            C2466rn.m4955w((C2466rn) c2423qnM4954B.f8871b, strM1792B);
            EnumC1271cn enumC1271cnM4559D = c2243mn.m4559D();
            c2423qnM4954B.m5038e();
            C2466rn.m4957y((C2466rn) c2423qnM4954B.f8871b, enumC1271cnM4559D);
            EnumC2773yt enumC2773ytM4558C = c2243mn.m4558C();
            c2423qnM4954B.m5038e();
            C2466rn.m4956x((C2466rn) c2423qnM4954B.f8871b, enumC2773ytM4558C);
            int iM4557B = c2243mn.m4557B();
            c2423qnM4954B.m5038e();
            C2466rn.m4958z((C2466rn) c2423qnM4954B.f8871b, iM4557B);
            C2466rn c2466rn = (C2466rn) c2423qnM4954B.m5035b();
            c2380pnM4992z.m5038e();
            C2509sn.m4991x((C2509sn) c2380pnM4992z.f8871b, c2466rn);
        }
        return (C2509sn) c2380pnM4992z.m5035b();
    }
}
