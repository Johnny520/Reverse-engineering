package p040U0;

import java.util.List;
import java.util.regex.Matcher;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: U0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0294d {

    /* JADX INFO: renamed from: a */
    public final Matcher f670a;

    /* JADX INFO: renamed from: b */
    public final String f671b;

    /* JADX INFO: renamed from: c */
    public C0293c f672c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0294d(Matcher matcher, String str) {
        AbstractC0223g.m418e(str, "input");
        this.f670a = matcher;
        this.f671b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List m500a() {
        if (this.f672c == null) {
            this.f672c = new C0293c(this);
        }
        C0293c c0293c = this.f672c;
        AbstractC0223g.m415b(c0293c);
        return c0293c;
    }
}
