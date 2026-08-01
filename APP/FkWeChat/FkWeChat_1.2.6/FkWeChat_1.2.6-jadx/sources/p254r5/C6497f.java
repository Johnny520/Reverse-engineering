package p254r5;

import ae.C0306e;
import p269s5.C7188c;

/* JADX INFO: renamed from: r5.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6497f extends AbstractC6514s {

    /* JADX INFO: renamed from: r */
    public static final C6497f f20406r = new C6497f(false);

    /* JADX INFO: renamed from: s */
    public static final C6497f f20407s = new C6497f(true);

    public C6497f(boolean z10) {
        super(z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: v */
    public static C6497f m25763v(int i10) {
        if (i10 == 0) {
            return f20406r;
        }
        if (i10 == 1) {
            return f20407s;
        }
        C0306e.m922a("bogus value: ", i10);
        return null;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m25764u() ? "true" : "false";
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23860y;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "boolean";
    }

    public String toString() {
        return m25764u() ? "boolean{true}" : "boolean{false}";
    }

    /* JADX INFO: renamed from: u */
    public boolean m25764u() {
        return mo25796s() != 0;
    }
}
