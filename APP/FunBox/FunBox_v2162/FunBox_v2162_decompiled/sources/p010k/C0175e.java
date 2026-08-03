package p010k;

import p011l.C0195c;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0175e extends AbstractC0182l {

    /* JADX INFO: renamed from: b */
    public static final C0175e f687b = new C0175e(false);

    /* JADX INFO: renamed from: c */
    public static final C0175e f688c = new C0175e(true);

    private C0175e(boolean z) {
        super(z ? 1 : 0);
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return mo438h() != 0 ? "true" : "false";
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f762g;
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "boolean";
    }

    public final String toString() {
        return mo438h() != 0 ? "boolean{true}" : "boolean{false}";
    }
}
