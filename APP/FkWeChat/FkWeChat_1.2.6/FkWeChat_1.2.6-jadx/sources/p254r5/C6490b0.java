package p254r5;

import ae.C0306e;
import p269s5.C7188c;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: r5.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6490b0 extends AbstractC6514s {

    /* JADX INFO: renamed from: r */
    public static final C6490b0 f20375r = m25735v(0);

    public C6490b0(short s10) {
        super(s10);
    }

    /* JADX INFO: renamed from: u */
    public static C6490b0 m25734u(int i10) {
        short s10 = (short) i10;
        if (s10 == i10) {
            return m25735v(s10);
        }
        C0306e.m922a("bogus short value: ", i10);
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static C6490b0 m25735v(short s10) {
        return new C6490b0(s10);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return Integer.toString(mo25796s());
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23827F;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "short";
    }

    public String toString() {
        int iMo25796s = mo25796s();
        return "short{0x" + AbstractC8826h.m33898g(iMo25796s) + " / " + iMo25796s + '}';
    }
}
