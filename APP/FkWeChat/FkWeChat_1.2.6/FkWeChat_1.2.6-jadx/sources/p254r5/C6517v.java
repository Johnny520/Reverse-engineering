package p254r5;

import p269s5.C7188c;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: r5.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6517v extends AbstractC6515t {

    /* JADX INFO: renamed from: r */
    public static final C6517v f20437r = m25800v(0);

    /* JADX INFO: renamed from: s */
    public static final C6517v f20438s = m25800v(1);

    public C6517v(long j10) {
        super(j10);
    }

    /* JADX INFO: renamed from: v */
    public static C6517v m25800v(long j10) {
        return new C6517v(j10);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return Long.toString(mo25797t());
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23826E;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "long";
    }

    public String toString() {
        long jMo25797t = mo25797t();
        return "long{0x" + AbstractC8826h.m33902k(jMo25797t) + " / " + jMo25797t + '}';
    }

    /* JADX INFO: renamed from: u */
    public long m25801u() {
        return mo25797t();
    }
}
