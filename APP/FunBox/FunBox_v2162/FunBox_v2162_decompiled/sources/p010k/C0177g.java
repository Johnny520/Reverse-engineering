package p010k;

import p000a.AbstractC0001b;
import p011l.C0195c;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0177g extends AbstractC0182l {
    private C0177g(char c2) {
        super(c2);
    }

    /* JADX INFO: renamed from: j */
    public static C0177g m433j(char c2) {
        return new C0177g(c2);
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Integer.toString(mo438h());
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f764i;
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "char";
    }

    public final String toString() {
        int iMo438h = mo438h();
        return "char{0x" + AbstractC0001b.m11q(iMo438h) + " / " + iMo438h + '}';
    }
}
