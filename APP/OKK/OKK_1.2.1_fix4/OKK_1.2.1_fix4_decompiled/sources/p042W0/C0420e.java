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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0420e(C0422g c0422g, String str, int i2) {
        super(0);
        this.f935a = c0422g;
        this.f936b = str;
        this.f937c = i2;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0422g c0422g = this.f935a;
        c0422g.getClass();
        CharSequence charSequence = this.f936b;
        AbstractC0307g.m703e(charSequence, "input");
        Matcher matcher = c0422g.f939a.matcher(charSequence);
        AbstractC0307g.m702d(matcher, "matcher(...)");
        return AbstractC0358S.m875a(matcher, this.f937c, charSequence);
    }
}
