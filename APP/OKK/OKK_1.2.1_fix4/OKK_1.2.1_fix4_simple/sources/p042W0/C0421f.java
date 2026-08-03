package p042W0;

import java.util.regex.Matcher;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0306f;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: W0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0421f extends AbstractC0306f implements InterfaceC0286l {

    /* JADX INFO: renamed from: i */
    public static final C0421f f938i = null;

    static {
        f938i = new C0421f(C0419d.class, "next", "next()Lkotlin/text/MatchResult;");
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r5) {
        C0419d r52 = (C0419d) r5;
        AbstractC0307g.m703e(r52, "p0");
        Matcher r02 = r52.f932a;
        int r1 = r02.end();
        if (r02.end() != r02.start()) goto L5;
        int r2 = 1;
    L6:
        int r12 = r1 + r2;
        CharSequence r53 = r52.f933b;
        if (r12 > r53.length()) goto L9;
        Matcher r03 = r02.pattern().matcher(r53);
        AbstractC0307g.m702d(r03, "matcher(...)");
        return AbstractC0358S.m875a(r03, r12, r53);
    L9:
        return null;
    L5:
        r2 = 0;
        goto L6
    }
}
