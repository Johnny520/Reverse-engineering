package p254r5;

import p269s5.C7188c;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: r5.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6509n extends AbstractC6514s {

    /* JADX INFO: renamed from: r */
    public static final C6509n f20416r = m25780u(Float.floatToIntBits(0.0f));

    /* JADX INFO: renamed from: s */
    public static final C6509n f20417s = m25780u(Float.floatToIntBits(1.0f));

    /* JADX INFO: renamed from: t */
    public static final C6509n f20418t = m25780u(Float.floatToIntBits(2.0f));

    public C6509n(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: u */
    public static C6509n m25780u(int i10) {
        return new C6509n(i10);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return Float.toString(Float.intBitsToFloat(mo25796s()));
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23824C;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "float";
    }

    public String toString() {
        int iMo25796s = mo25796s();
        return "float{0x" + AbstractC8826h.m33901j(iMo25796s) + " / " + Float.intBitsToFloat(iMo25796s) + '}';
    }
}
