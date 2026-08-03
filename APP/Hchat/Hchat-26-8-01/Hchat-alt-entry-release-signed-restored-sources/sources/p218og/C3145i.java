package p218og;

import java.util.List;
import java.util.regex.Matcher;
import p007a7.AbstractC0018a;
import p172lg.C2564d;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: og.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3145i implements InterfaceC3142f {

    /* JADX INFO: renamed from: a */
    public final Matcher f10201a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f10202b;

    /* JADX INFO: renamed from: c */
    public final C3144h f10203c;

    /* JADX INFO: renamed from: d */
    public C3143g f10204d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3145i(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.f10201a = matcher;
        this.f10202b = charSequence;
        this.f10203c = new C3144h(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List m6676a() {
        if (this.f10204d == null) {
            this.f10204d = new C3143g(this);
        }
        C3143g c3143g = this.f10204d;
        c3143g.getClass();
        return c3143g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2564d m6677b() {
        Matcher matcher = this.f10201a;
        return AbstractC3754e0.m7910r0(matcher.start(), matcher.end());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m6678c() {
        String strGroup = this.f10201a.group();
        strGroup.getClass();
        return strGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C3145i m6679d() {
        Matcher matcher = this.f10201a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f10202b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return AbstractC0018a.m238b(matcher2, iEnd, charSequence);
    }
}
