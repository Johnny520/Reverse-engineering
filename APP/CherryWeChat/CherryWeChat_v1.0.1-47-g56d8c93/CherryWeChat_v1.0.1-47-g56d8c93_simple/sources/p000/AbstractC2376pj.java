package p000;

import kotlin.Function;

/* JADX INFO: renamed from: pj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2376pj extends AbstractC0222F6 implements InterfaceC2325oj, InterfaceC0459Km, Function {

    /* JADX INFO: renamed from: g */
    public final int f8360g;

    /* JADX INFO: renamed from: h */
    public final int f8361h;

    public AbstractC2376pj(int r7, Class r8, Object r9, String r10, String r11) {
        super(r9, r8, r10, r11, false);
        this.f8360g = r7;
        this.f8361h = 0;
    }

    @Override // p000.InterfaceC2325oj
    /* JADX INFO: renamed from: b */
    public final int mo122b() {
        return this.f8360g;
    }

    @Override // p000.AbstractC0222F6
    /* JADX INFO: renamed from: c */
    public final InterfaceC0459Km mo436c() {
        AbstractC0425Jv.f1405a.getClass();
        return this;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof AbstractC2376pj) == false) goto L21;
        AbstractC2376pj r32 = (AbstractC2376pj) r3;
        if (this.f654d.equals(r32.f654d) == true) goto L9;
        return false;
    L9:
        if (this.f655e.equals(r32.f655e) == true) goto L11;
        return false;
    L11:
        if (this.f8361h == r32.f8361h) goto L13;
        return false;
    L13:
        if (this.f8360g == r32.f8360g) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f652b, r32.f652b) == true) goto L17;
        return false;
    L17:
        if (m437e().equals(r32.m437e()) == false) goto L34;
        return true;
    L34:
        return false;
    L21:
        if ((r3 instanceof AbstractC2376pj) == false) goto L35;
        InterfaceC0459Km r0 = this.f651a;
        if (r0 != null) goto L26;
        mo436c();
        this.f651a = this;
        r0 = this;
    L26:
        return r3.equals(r0);
    L35:
        return false;
    }

    public final int hashCode() {
        m437e();
        int r0 = m437e().hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f654d, r0, 31);
        return this.f655e.hashCode() + r02;
    }

    public final String toString() {
        InterfaceC0459Km r0 = this.f651a;
        if (r0 != null) goto L5;
        mo436c();
        this.f651a = this;
        r0 = this;
    L5:
        if (r0 != this) goto L7;
        String r1 = this.f654d;
        if ("<init>".equals(r1) == false) goto L13;
        return "constructor (Kotlin reflection is not available)";
    L13:
        return AbstractC2374ph.m4814k("function ", r1, " (Kotlin reflection is not available)");
    L7:
        return r0.toString();
    }
}
