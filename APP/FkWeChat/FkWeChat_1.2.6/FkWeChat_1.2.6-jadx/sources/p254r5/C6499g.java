package p254r5;

import ae.C0306e;
import p269s5.C7188c;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: r5.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6499g extends AbstractC6514s {

    /* JADX INFO: renamed from: r */
    public static final C6499g f20409r = m25767u((byte) 0);

    public C6499g(byte b10) {
        super(b10);
    }

    /* JADX INFO: renamed from: u */
    public static C6499g m25767u(byte b10) {
        return new C6499g(b10);
    }

    /* JADX INFO: renamed from: v */
    public static C6499g m25768v(int i10) {
        byte b10 = (byte) i10;
        if (b10 == i10) {
            return m25767u(b10);
        }
        C0306e.m922a("bogus byte value: ", i10);
        return null;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return Integer.toString(mo25796s());
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23861z;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "byte";
    }

    public String toString() {
        int iMo25796s = mo25796s();
        return "byte{0x" + AbstractC8826h.m33897f(iMo25796s) + " / " + iMo25796s + '}';
    }
}
