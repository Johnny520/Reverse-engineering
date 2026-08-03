package p010k;

import p000a.AbstractC0001b;
import p011l.C0195c;

/* JADX INFO: renamed from: k.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0176f extends AbstractC0182l {
    private C0176f(byte b2) {
        super(b2);
    }

    /* JADX INFO: renamed from: j */
    public static C0176f m432j(byte b2) {
        return new C0176f(b2);
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Integer.toString(mo438h());
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f763h;
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "byte";
    }

    public final String toString() {
        int iMo438h = mo438h();
        return "byte{0x" + AbstractC0001b.m10p(iMo438h) + " / " + iMo438h + '}';
    }
}
