package p021K0;

import java.io.File;
import java.util.Iterator;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p025M0.InterfaceC0208p;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0224h;
import p038T0.C0282g;
import p038T0.C0288m;
import p038T0.InterfaceC0283h;
import p040U0.C0292b;

/* JADX INFO: renamed from: K0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0169h implements InterfaceC0283h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f488a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f489b;

    /* JADX INFO: renamed from: c */
    public final Object f490c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0169h(File file) {
        EnumC0170i enumC0170i = EnumC0170i.f491a;
        this.f489b = file;
        this.f490c = enumC0170i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p038T0.InterfaceC0283h
    public final Iterator iterator() {
        switch (this.f488a) {
            case 0:
                return new C0167f(this);
            case 1:
                return new C0282g(this);
            case 2:
                return new C0288m(this);
            default:
                return new C0292b(this);
        }
    }

    public C0169h(InterfaceC0283h interfaceC0283h, InterfaceC0204l interfaceC0204l) {
        this.f489b = interfaceC0283h;
        this.f490c = interfaceC0204l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: M0.a */
    /* JADX WARN: Multi-variable type inference failed */
    public C0169h(InterfaceC0193a interfaceC0193a, InterfaceC0204l interfaceC0204l) {
        this.f489b = (AbstractC0224h) interfaceC0193a;
        this.f490c = interfaceC0204l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M0.p */
    /* JADX WARN: Multi-variable type inference failed */
    public C0169h(CharSequence charSequence, InterfaceC0208p interfaceC0208p) {
        AbstractC0223g.m418e(charSequence, "input");
        this.f489b = charSequence;
        this.f490c = (AbstractC0224h) interfaceC0208p;
    }
}
