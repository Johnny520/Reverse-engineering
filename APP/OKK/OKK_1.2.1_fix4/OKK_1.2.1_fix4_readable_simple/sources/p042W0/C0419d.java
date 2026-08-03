package p042W0;

import java.util.List;
import java.util.regex.Matcher;
import p009E0.C0195z;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: W0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0419d {

    /* JADX INFO: renamed from: a */
    public final Matcher f932a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f933b;

    /* JADX INFO: renamed from: c */
    public C0195z f934c;

    public C0419d(Matcher r2, CharSequence r3) {
        AbstractC0307g.m703e(r3, "input");
        this.f932a = r2;
        this.f933b = r3;
    }

    /* JADX INFO: renamed from: a */
    public final List m1002a() {
        if (this.f934c != null) goto L5;
        this.f934c = new C0195z(this);
    L5:
        C0195z r02 = this.f934c;
        AbstractC0307g.m700b(r02);
        return r02;
    }
}
