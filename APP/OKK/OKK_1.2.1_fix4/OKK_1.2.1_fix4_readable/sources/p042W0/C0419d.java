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

    public C0419d(Matcher matcher, CharSequence charSequence) {
        AbstractC0307g.m703e(charSequence, "input");
        this.f932a = matcher;
        this.f933b = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final List m1002a() {
        if (this.f934c == null) {
            this.f934c = new C0195z(this);
        }
        C0195z c0195z = this.f934c;
        AbstractC0307g.m700b(c0195z);
        return c0195z;
    }
}
