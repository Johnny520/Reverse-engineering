package p000;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: xD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2708xD {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9283a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static C2509sn m5281a(C2286nn r5) {
        C2380pn r0 = C2509sn.m4992z();
        int r1 = r5.m4617B();
        r0.m5038e();
        C2509sn.m4990w((C2509sn) r0.f8871b, r1);
        Iterator r52 = r5.m4616A().iterator();
    L4:
        if (r52.hasNext() == false) goto L7;
        C2243mn r12 = (C2243mn) r52.next();
        C2423qn r2 = C2466rn.m4954B();
        String r3 = r12.m4556A().m1792B();
        r2.m5038e();
        C2466rn.m4955w((C2466rn) r2.f8871b, r3);
        EnumC1271cn r32 = r12.m4559D();
        r2.m5038e();
        C2466rn.m4957y((C2466rn) r2.f8871b, r32);
        EnumC2773yt r33 = r12.m4558C();
        r2.m5038e();
        C2466rn.m4956x((C2466rn) r2.f8871b, r33);
        int r13 = r12.m4557B();
        r2.m5038e();
        C2466rn.m4958z((C2466rn) r2.f8871b, r13);
        C2466rn r14 = (C2466rn) r2.m5035b();
        r0.m5038e();
        C2509sn.m4991x((C2509sn) r0.f8871b, r14);
        goto L4
    L7:
        return (C2509sn) r0.m5035b();
    }
}
