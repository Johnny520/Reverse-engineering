package p042W0;

import java.util.regex.Matcher;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: W0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0420e extends AbstractC0308h implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0422g f935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CharSequence f936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f937c;

    public C0420e(C0422g r1, String r2, int r3) {
        this.f935a = r1;
        this.f936b = r2;
        this.f937c = r3;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0422g r02 = this.f935a;
        r02.getClass();
        CharSequence r2 = this.f936b;
        AbstractC0307g.m703e(r2, "input");
        Matcher r03 = r02.f939a.matcher(r2);
        AbstractC0307g.m702d(r03, "matcher(...)");
        return AbstractC0358S.m875a(r03, this.f937c, r2);
    }
}
