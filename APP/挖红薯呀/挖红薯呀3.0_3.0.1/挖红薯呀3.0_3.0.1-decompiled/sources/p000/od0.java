package p000;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class od0 {

    /* JADX INFO: renamed from: a */
    public final Matcher f4521a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f4522b;

    /* JADX INFO: renamed from: c */
    public nd0 f4523c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public od0(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.f4521a = matcher;
        this.f4522b = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List m2878a() {
        if (this.f4523c == null) {
            this.f4523c = new nd0(this);
        }
        nd0 nd0Var = this.f4523c;
        nd0Var.getClass();
        return nd0Var;
    }
}
