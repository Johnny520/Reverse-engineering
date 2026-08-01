package p254r5;

import ae.C0306e;
import p269s5.C7188c;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: r5.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6505j extends AbstractC6514s {

    /* JADX INFO: renamed from: r */
    public static final C6505j f20412r = m25775u(0);

    public C6505j(char c10) {
        super(c10);
    }

    /* JADX INFO: renamed from: u */
    public static C6505j m25775u(char c10) {
        return new C6505j(c10);
    }

    /* JADX INFO: renamed from: v */
    public static C6505j m25776v(int i10) {
        char c10 = (char) i10;
        if (c10 == i10) {
            return m25775u(c10);
        }
        C0306e.m922a("bogus char value: ", i10);
        return null;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return Integer.toString(mo25796s());
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23822A;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "char";
    }

    public String toString() {
        int iMo25796s = mo25796s();
        return "char{0x" + AbstractC8826h.m33898g(iMo25796s) + " / " + iMo25796s + '}';
    }
}
