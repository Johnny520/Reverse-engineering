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

    public C2813zq(Matcher r1, CharSequence r2) {
        this.f9532a = r1;
        this.f9533b = r2;
    }

    /* JADX INFO: renamed from: a */
    public final List m5446a() {
        if (this.f9534c != null) goto L6;
        this.f9534c = new C2770yq(this);
    L6:
        return this.f9534c;
    }

    /* JADX INFO: renamed from: b */
    public final C2813zq m5447b() {
        Matcher r0 = this.f9532a;
        int r1 = r0.end();
        if (r0.end() != r0.start()) goto L5;
        int r2 = 1;
    L6:
        int r12 = r1 + r2;
        CharSequence r22 = this.f9533b;
        if (r12 <= r22.length()) goto L9;
        return null;
    L9:
        return AbstractC1406fG.m2680E(r0.pattern().matcher(r22), r12, r22);
    L5:
        r2 = 0;
        goto L6
    }
}
