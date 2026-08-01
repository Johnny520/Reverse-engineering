package p000;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cu0 extends C0299hx implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public static final cu0 f892d = new cu0(1, od0.class, "next", "next()Lkotlin/text/MatchResult;", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        od0 od0Var = (od0) obj;
        od0Var.getClass();
        CharSequence charSequence = od0Var.f4522b;
        Matcher matcher = od0Var.f4521a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return g60.m1204c(matcher2, iEnd, charSequence);
    }
}
