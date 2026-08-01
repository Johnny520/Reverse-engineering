package p040U0;

import java.util.regex.Matcher;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0222f;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: U0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0296f extends AbstractC0222f implements InterfaceC0204l {

    /* JADX INFO: renamed from: i */
    public static final C0296f f675i = new C0296f(C0294d.class, "next", "next()Lkotlin/text/MatchResult;", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public final Object mo8c(Object obj) {
        C0294d c0294d = (C0294d) obj;
        AbstractC0223g.m418e(c0294d, "p0");
        Matcher matcher = c0294d.f670a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = c0294d.f671b;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        AbstractC0223g.m417d(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new C0294d(matcher2, str);
        }
        return null;
    }
}
