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
    public static final C0421f f938i = new C0421f(C0419d.class, "next", "next()Lkotlin/text/MatchResult;");

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        C0419d c0419d = (C0419d) obj;
        AbstractC0307g.m703e(c0419d, "p0");
        Matcher matcher = c0419d.f932a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = c0419d.f933b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC0307g.m702d(matcher2, "matcher(...)");
        return AbstractC0358S.m875a(matcher2, iEnd, charSequence);
    }
}
