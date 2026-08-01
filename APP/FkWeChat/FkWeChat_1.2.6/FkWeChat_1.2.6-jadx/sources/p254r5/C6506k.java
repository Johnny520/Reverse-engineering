package p254r5;

import p269s5.C7188c;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: r5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6506k extends AbstractC6515t {

    /* JADX INFO: renamed from: r */
    public static final C6506k f20413r = new C6506k(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: s */
    public static final C6506k f20414s = new C6506k(Double.doubleToLongBits(1.0d));

    public C6506k(long j10) {
        super(j10);
    }

    /* JADX INFO: renamed from: u */
    public static C6506k m25777u(long j10) {
        return new C6506k(j10);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return Double.toString(Double.longBitsToDouble(mo25797t()));
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23823B;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "double";
    }

    public String toString() {
        long jMo25797t = mo25797t();
        return "double{0x" + AbstractC8826h.m33902k(jMo25797t) + " / " + Double.longBitsToDouble(jMo25797t) + '}';
    }
}
