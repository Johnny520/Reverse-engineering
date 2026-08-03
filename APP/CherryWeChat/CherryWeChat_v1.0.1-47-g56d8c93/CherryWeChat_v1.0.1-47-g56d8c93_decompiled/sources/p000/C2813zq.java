package p000;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: zq */
/* JADX INFO: loaded from: classes.dex */
public final class C2813zq {

    /* JADX INFO: renamed from: a */
    public final Matcher f9532a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f9533b;

    /* JADX INFO: renamed from: c */
    public C2770yq f9534c;

    public C2813zq(Matcher matcher, CharSequence charSequence) {
        this.f9532a = matcher;
        this.f9533b = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final List m5446a() {
        if (this.f9534c == null) {
            this.f9534c = new C2770yq(this);
        }
        return this.f9534c;
    }

    /* JADX INFO: renamed from: b */
    public final C2813zq m5447b() {
        Matcher matcher = this.f9532a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f9533b;
        if (iEnd <= charSequence.length()) {
            return AbstractC1406fG.m2680E(matcher.pattern().matcher(charSequence), iEnd, charSequence);
        }
        return null;
    }
}
